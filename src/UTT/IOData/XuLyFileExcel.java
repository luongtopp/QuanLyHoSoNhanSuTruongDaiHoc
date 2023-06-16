package UTT.IOData;

import UTT.DAO.CanBoDAO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XuLyFileExcel {

    public void xuatExcel(JTable tbl) {
        Main.changLNF("Windows");
        try {
            String urlAnh = "";
            TableModel dtm = tbl.getModel();

            JFileChooser chooser = new MyFileChooser("//Users//luongtopp//Desktop");
            chooser.setDialogTitle("Lưu vào");
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("Excel Files", "xls", "xlsx", "xlsm");
            chooser.setFileFilter(fnef);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                // Lấy đường dẫn vừa chọn + tên tệp
                String path = chooser.getSelectedFile().getPath();
                if (!path.contains(".xlsx")) {
                    path += ".xlsx";
                }

                XSSFWorkbook workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet("Sheet 1");

                Font headerFont = workbook.createFont();
                headerFont.setBold(true);
                headerFont.setFontHeightInPoints((short) 14);
                headerFont.setColor(IndexedColors.WHITE.getIndex());
                CellStyle headerCellStyle = workbook.createCellStyle();
                headerCellStyle.setFont(headerFont);
                headerCellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
                headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                headerCellStyle.setBorderTop(BorderStyle.THIN);
                headerCellStyle.setBorderBottom(BorderStyle.THIN);
                headerCellStyle.setBorderLeft(BorderStyle.THIN);
                headerCellStyle.setBorderRight(BorderStyle.THIN);
                headerCellStyle.setAlignment(HorizontalAlignment.CENTER);

                Row headerRow = sheet.createRow(0);

                // Tạo header
                for (int i = 0; i < dtm.getColumnCount(); i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue(dtm.getColumnName(i));
                    cell.setCellStyle(headerCellStyle);
                }

                Font contentFont = workbook.createFont();
                contentFont.setBold(false);
                contentFont.setFontHeightInPoints((short) 13);
                contentFont.setColor(IndexedColors.BLACK.getIndex());
                CellStyle contentCellStyle = workbook.createCellStyle();
                contentCellStyle.setFont(contentFont);
                contentCellStyle.setBorderTop(BorderStyle.THIN);
                contentCellStyle.setBorderBottom(BorderStyle.THIN);
                contentCellStyle.setBorderLeft(BorderStyle.THIN);
                contentCellStyle.setBorderRight(BorderStyle.THIN);

                for (int i = 0; i < dtm.getRowCount(); i++) {
                    Row row = sheet.createRow(i + 1);
                    for (int j = 0; j < dtm.getColumnCount(); j++) {
                        Cell cell = row.createCell(j);
                        if (j == tbl.getColumnCount() - 1) {
                            JLabel excelJL = (JLabel) tbl.getValueAt(i, j);
                            ImageIcon excelIMageIcon = (ImageIcon) excelJL.getIcon();
                            //Before retrieving the description of the image first set it...
                            urlAnh = excelIMageIcon.getDescription();
                        }
                        cell.setCellValue(dtm.getValueAt(i, j).toString());
                        cell.setCellStyle(contentCellStyle);
                        sheet.autoSizeColumn(j);
                        if (cell.getColumnIndex() == tbl.getColumnCount() - 1) {
                            cell.setCellValue(urlAnh);
                        }
                    }
                }

                // Ghi file
                FileOutputStream fileOut = new FileOutputStream(path);
                workbook.write(fileOut);
                fileOut.close();
                workbook.close();
                JOptionPane.showMessageDialog(null, "Xuất file thành công!");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xuất file thất bại!");

        }
    }

    public void nhapExcel(JTable tbl) {
        Main.changLNF("Windows");
        try {
            TableModel dtm = tbl.getModel();

            JFileChooser chooser = new MyFileChooser("//Users//luongtopp//Desktop");
            chooser.setDialogTitle("Chọn file");
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("Excel Files", "xls", "xlsx", "xlsm");
            chooser.setFileFilter(fnef);
            ArrayList<ArrayList> hang = new ArrayList();
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File fileSelected = chooser.getSelectedFile();
                FileInputStream fis = new FileInputStream(fileSelected);
                BufferedInputStream bis = new BufferedInputStream(fis);

                XSSFWorkbook wb = new XSSFWorkbook(bis);
                Sheet sheet = wb.getSheetAt(0);

                DefaultTableModel dtmtbl = (DefaultTableModel) dtm;
                dtmtbl.setRowCount(0);
                for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                    Row row = sheet.getRow(i);
                    Vector vec = new Vector();
                    ArrayList<String> cot = new ArrayList();

                    for (int j = 0; j < row.getLastCellNum(); j++) {
                        if (dtmtbl.getColumnCount() != row.getLastCellNum()) {
                            JOptionPane.showMessageDialog(null, "Nhập file thất bại 120!");

                            return;
                        }
                        Cell cell = row.getCell(j);
                        vec.add(cell.getStringCellValue());

                        cot.add(cell.getStringCellValue());
//                        duLieu[i][j] = cell.getStringCellValue();
                    }
                    dtmtbl.addRow(vec);
                    hang.add(cot);
                }
                for (int i = 0; i < hang.size(); i++) {
                    new CanBoDAO().themCanBo(
                            hang.get(i).get(0).toString(),
                            hang.get(i).get(1).toString(),
                            hang.get(i).get(2).toString(),
                            hang.get(i).get(3).toString(),
                            hang.get(i).get(4).toString(),
                            hang.get(i).get(5).toString(),
                            hang.get(i).get(6).toString(),
                            hang.get(i).get(7).toString(),
                            hang.get(i).get(8).toString(),
                            hang.get(i).get(9).toString(),
                            hang.get(i).get(10).toString(),
                            hang.get(i).get(11).toString(),
                            hang.get(i).get(12).toString(),
                            hang.get(i).get(13).toString(),
                            hang.get(i).get(14).toString(),
                            hang.get(i).get(15).toString(),
                            hang.get(i).get(16).toString(),
                            hang.get(i).get(17).toString(),
                            hang.get(i).get(18).toString(),
                            hang.get(i).get(19).toString(),
                            null);
                }

                JOptionPane.showMessageDialog(null, "Nhập file thành công!");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private Date chuyenDoiChuoiSangNgay(String ngay) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = null;
        try {
            date = dateFormat.parse(ngay);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;

    }

}

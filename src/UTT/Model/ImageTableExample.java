
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ImageTableExample extends JFrame {
    

    private static final long serialVersionUID = 1L;

    public ImageTableExample() {

        // create table model and set columns
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID", "Name", "Image"});

        // create table and set model
        JTable table = new JTable(model);

        // add scroll pane to table
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane);
        URL url = getClass().getResource("/UTT/Model/0.png");
        // add data to table
        Object[] rowData = new Object[3];
        rowData[0] = 1;
        rowData[1] = "Image 1";
        rowData[2] = createImageIcon("UTT/Model/1.png"); // set image icon
        model.addRow(rowData);

        rowData = new Object[3];
        rowData[0] = 2;
        rowData[1] = "Image 2";
        rowData[2] = createImageIcon("UTT/Model/2.png"); // set image icon
        model.addRow(rowData);

        // set table properties
        table.setRowHeight(100); // set row height to fit image size

        // set frame properties
        setTitle("Image Table Example");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private ImageIcon createImageIcon(String path) {
        try {
            Image image = ImageIO.read(new File(path));
            Image scaledImage = image.getScaledInstance(80, 80, Image.SCALE_SMOOTH); // scale image size
            return new ImageIcon(scaledImage);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        new ImageTableExample();
    }
}

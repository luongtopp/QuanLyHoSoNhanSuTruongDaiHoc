/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UTT.UI.Main;

import UTT.Connection.JdbcHelper;
import java.io.ByteArrayOutputStream;
import java.io.File;
import static UTT.Connection.JdbcHelper.executeUpdate;
import static UTT.Connection.JdbcHelper.preparedStatement;
import static UTT.Connection.JdbcHelper.executeQuery;
import UTT.Model.CanBo;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author luongtopp
 */
public class Test extends javax.swing.JFrame {

    private JFileChooser fileChooser;

    public Test() {
        initComponents();
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
        fileChooser.setMultiSelectionEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Thêm ảnh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jButton1)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jButton1)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int result = fileChooser.showOpenDialog(Test.this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                saveImageToDatabase(selectedFile);
                JOptionPane.showMessageDialog(Test.this, "Image saved to database.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Test.this, "Failed to save image to database.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveImageToDatabase(File imageFile) throws Exception {

        try (FileInputStream fis = new FileInputStream(imageFile); ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            byte[] imageData = baos.toByteArray();
            
            // TODO: Insert code to save image to database
            try (PreparedStatement pstmt = preparedStatement("INSERT INTO themanh VALUES (?,?)",imageFile.getName(), imageData)) {
                pstmt.executeUpdate();
            }
        }
    }

//    private List<Byte> timAnh(String sql, Object... args) {
//        List<Byte> list = new ArrayList<>();
//        try {
//            ResultSet rs = null;
//            try {
//                rs = JdbcHelper.executeQuery(sql, args);
//
//                while (rs.next()) {
//                    CanBo canBo = layDuLieuTuBangCanBo(rs);
//                    list.add(canBo);
//                }
//            } finally {
//                rs.getStatement().getConnection().close();
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return list;
//    }

//    private void loadImageFromDatabase() throws Exception {
//
//    try (PreparedStatement statement = connection.prepareStatement("SELECT anh FROM themanh WHERE tenanh = ?")) {
//        statement.setString(1, "My Image");
//        ResultSet resultSet = statement.executeQuery();
//        if (resultSet.next()) {
//            byte[] imageData = resultSet.getBytes("image");
//            Image image = new ImageIcon(imageData).getImage();
//            imageLabel.setIcon(new ImageIcon(image));
//        }
//    }
//}

      

    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

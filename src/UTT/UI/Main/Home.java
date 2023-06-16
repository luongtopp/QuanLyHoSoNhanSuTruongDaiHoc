package UTT.UI.Main;

import UTT.UI.component.QuanLyPhongBan;
import UTT.UI.component.QuanLyChucVu;
import UTT.UI.component.QuanLyThongTinCanBo;
import UTT.UI.component.QuanLyThongTinGiaDinh;
import UTT.UI.component.QuanLyTaiKhoan;
import UTT.UI.component.HomeForm;
import java.awt.Component;
import UTT.UI.Menu.MenuEvent;
import UTT.UI.component.CapNhapQuaTrinhCanBo;
import UTT.UI.component.QuanLyCanBoNghiHuu;
import UTT.UI.component.QuanLyKhenThuong;
import UTT.UI.component.QuanLyKyLuat;
import UTT.UI.component.QuanLyLuong;

/**
 *
 * @author RAVEN
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Home() {
        initComponents();
        menu1.setEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex) {
                if (index == 0) {
                    showForm(new HomeForm());
                } else {
                    switch (index) {
                        case 1 -> {
                            switch (subIndex) {
                                case 1 -> {
                                    showForm(new QuanLyThongTinCanBo());
                                }
                                case 2 -> {
                                    showForm(new QuanLyThongTinGiaDinh());
                                }
                                case 3 -> {
                                    showForm(new QuanLyCanBoNghiHuu());
                                }

                            }

                        }
                        case 2 -> {
                            showForm(new QuanLyPhongBan());
                        }
                        case 3 -> {
                            showForm(new QuanLyChucVu());
                        }
                        case 4 -> {
                            showForm(new CapNhapQuaTrinhCanBo());
                        }
                        case 5 -> {
                            showForm(new QuanLyTaiKhoan());

                        }
                        case 6 -> {
                            switch (subIndex) {
                                case 1 -> {
                                    showForm(new QuanLyKhenThuong());
                                }
                                case 2 -> {
                                    showForm(new QuanLyKyLuat());

                                }
                            }

                        }
                        case 7 -> {

                            showForm(new QuanLyLuong());

                        }

                    }

                }
            }
        });
    }

    private void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header1 = new UTT.UI.Component.Header();
        body = new javax.swing.JPanel();
        menu1 = new UTT.UI.Menu.Menu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(163, 163, 163)));

        body.setBackground(new java.awt.Color(245, 245, 245));
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                    .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private UTT.UI.Component.Header header1;
    private javax.swing.JPanel jPanel1;
    private UTT.UI.Menu.Menu menu1;
    // End of variables declaration//GEN-END:variables
}

package Pantallas;

import src.ClientePref;


// @author Jhony_Angulo

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_Reservar = new javax.swing.JButton();
        btn_Facturar = new javax.swing.JButton();
        btn_Ingresar = new javax.swing.JButton();
        btn_Clientes = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        Fondo.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 204, 0));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btn_Reservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Reservar.png"))); // NOI18N
        btn_Reservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Reservar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_ReservarMouseMoved(evt);
            }
        });
        btn_Reservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ReservarMouseExited(evt);
            }
        });

        btn_Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Facturar.png"))); // NOI18N
        btn_Facturar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Facturar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_FacturarMouseMoved(evt);
            }
        });
        btn_Facturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_FacturarMouseExited(evt);
            }
        });

        btn_Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Ingresar.png"))); // NOI18N
        btn_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Ingresar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_IngresarMouseMoved(evt);
            }
        });
        btn_Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_IngresarMouseExited(evt);
            }
        });

        btn_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Clientes.png"))); // NOI18N
        btn_Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Clientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_ClientesMouseMoved(evt);
            }
        });
        btn_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ClientesMouseExited(evt);
            }
        });
        btn_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClientesActionPerformed(evt);
            }
        });

        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Salir.png"))); // NOI18N
        btn_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Salir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_SalirMouseMoved(evt);
            }
        });
        btn_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SalirMouseExited(evt);
            }
        });
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_Reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Clientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Ingresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn_Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_Reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btn_Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("SISTEMA DE GESTIÓN HOTEL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/amerian-hotel-casino.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 614, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ReservarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReservarMouseMoved
        btn_Reservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Reservar2.png")));
    }//GEN-LAST:event_btn_ReservarMouseMoved

    private void btn_ReservarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReservarMouseExited
        btn_Reservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Reservar.png")));
    }//GEN-LAST:event_btn_ReservarMouseExited

    private void btn_IngresarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_IngresarMouseMoved
        btn_Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Ingresar2.png")));
    }//GEN-LAST:event_btn_IngresarMouseMoved

    private void btn_IngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_IngresarMouseExited
        btn_Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Ingresar.png")));
    }//GEN-LAST:event_btn_IngresarMouseExited

    private void btn_FacturarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FacturarMouseMoved
        btn_Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Facturar2.png")));
    }//GEN-LAST:event_btn_FacturarMouseMoved

    private void btn_FacturarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FacturarMouseExited
        btn_Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Facturar.png")));
    }//GEN-LAST:event_btn_FacturarMouseExited

    private void btn_ClientesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClientesMouseMoved
        btn_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Clientes2.png")));
    }//GEN-LAST:event_btn_ClientesMouseMoved

    private void btn_ClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClientesMouseExited
        btn_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Clientes.png")));
    }//GEN-LAST:event_btn_ClientesMouseExited

    private void btn_SalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirMouseMoved
        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Salir2.png")));
    }//GEN-LAST:event_btn_SalirMouseMoved

    private void btn_SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirMouseExited
        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Salir.png")));
    }//GEN-LAST:event_btn_SalirMouseExited

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClientesActionPerformed
        P_Clientes c = new P_Clientes ();
        this.dispose();
        c.setVisible(true);
    }//GEN-LAST:event_btn_ClientesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClientePref cp = new ClientePref();
        cp.pintarClientes();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton btn_Clientes;
    private javax.swing.JButton btn_Facturar;
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JButton btn_Reservar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

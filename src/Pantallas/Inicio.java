
package Pantallas;

// @author Jhony_Angulo

public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        jPanel1 = new javax.swing.JPanel();
        btn_entrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIENVENIDO");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btn_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Entrar.png"))); // NOI18N
        btn_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_entrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_entrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_entrarMouseMoved(evt);
            }
        });
        btn_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_entrarMouseExited(evt);
            }
        });
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Hotel-recepcion-200x100.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        Menu m = new Menu ();
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_btn_entrarActionPerformed

    private void btn_entrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseMoved
         btn_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Entrar2.png")));
    }//GEN-LAST:event_btn_entrarMouseMoved

    private void btn_entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseExited
        btn_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Entrar.png")));
    }//GEN-LAST:event_btn_entrarMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
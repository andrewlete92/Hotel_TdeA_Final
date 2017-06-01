/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import src.Fechas;
import src.Reserva;

/**
 *
 * @author Jhony_Angulo
 */
public class P_Reservas extends javax.swing.JFrame {

    /**
     * Creates new form P_Reservas
     */
    public P_Reservas() {
        initComponents();
        setLocationRelativeTo(null);
        setFechas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cc = new javax.swing.JLabel();
        txt_Doc = new javax.swing.JTextField();
        txt_Tipo = new javax.swing.JComboBox<>();
        cc1 = new javax.swing.JLabel();
        cc2 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        cc3 = new javax.swing.JLabel();
        txt_acomp = new javax.swing.JComboBox<>();
        cc4 = new javax.swing.JLabel();
        txt_Tel = new javax.swing.JTextField();
        cc5 = new javax.swing.JLabel();
        fIngreso = new com.toedter.calendar.JDateChooser();
        cc6 = new javax.swing.JLabel();
        fSalida = new com.toedter.calendar.JDateChooser();
        cc7 = new javax.swing.JLabel();
        txt_TipoHab = new javax.swing.JComboBox<>();
        cc8 = new javax.swing.JLabel();
        txt_Precio = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        txt_precios = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("SISTEMA DE RESERVAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        cc.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cc.setForeground(new java.awt.Color(255, 204, 0));
        cc.setText("Tipo: *");

        txt_Doc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_Tipo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Cédula de Ciudadanía", "Cédula Extranjería", "Pasaporte" }));

        cc1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cc1.setForeground(new java.awt.Color(255, 204, 0));
        cc1.setText("Documento: *");

        cc2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cc2.setForeground(new java.awt.Color(255, 204, 0));
        cc2.setText("Nombre: *");

        txt_Nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        cc3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cc3.setForeground(new java.awt.Color(255, 204, 0));
        cc3.setText("# Acompañantes: *");

        txt_acomp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_acomp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));

        cc4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cc4.setForeground(new java.awt.Color(255, 204, 0));
        cc4.setText("Teléfono: *");

        txt_Tel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        cc5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cc5.setForeground(new java.awt.Color(255, 204, 0));
        cc5.setText("Fecha Ingeso:*");

        fIngreso.setBackground(new java.awt.Color(255, 255, 255));
        fIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fIngreso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        cc6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cc6.setForeground(new java.awt.Color(255, 204, 0));
        cc6.setText("Fecha Salida:*");

        fSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fSalida.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        cc7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cc7.setForeground(new java.awt.Color(255, 204, 0));
        cc7.setText("Tipo Habitación: *");

        txt_TipoHab.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_TipoHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Estándar", "Suite" }));

        cc8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cc8.setForeground(new java.awt.Color(255, 204, 0));
        cc8.setText("Precio por Noche:");

        txt_Precio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Guardar.png"))); // NOI18N
        btn_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Guardar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_GuardarMouseMoved(evt);
            }
        });
        btn_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_GuardarMouseExited(evt);
            }
        });
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Cancelar.png"))); // NOI18N
        btn_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_CancelarMouseMoved(evt);
            }
        });
        btn_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CancelarMouseExited(evt);
            }
        });
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        txt_precios.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Nombre)
                            .addComponent(cc2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cc))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cc1)
                                    .addComponent(txt_Doc, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cc4)
                                .addComponent(txt_Tel)
                                .addComponent(cc6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(fSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_TipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cc3)
                            .addComponent(txt_acomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cc7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cc8)
                            .addComponent(cc5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(txt_precios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cc)
                    .addComponent(cc1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cc2)
                            .addComponent(cc4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cc3)
                            .addComponent(cc5)
                            .addComponent(cc6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_acomp, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cc7)
                            .addComponent(cc8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_TipoHab)
                            .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_precios)
                            .addComponent(jButton1))
                        .addGap(195, 195, 195)
                        .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GuardarMouseMoved
        btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Guardar2.png")));
    }//GEN-LAST:event_btn_GuardarMouseMoved

    private void btn_GuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GuardarMouseExited
        btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Guardar.png")));
    }//GEN-LAST:event_btn_GuardarMouseExited

    private void btn_CancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelarMouseMoved
        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Cancelar2.png")));
    }//GEN-LAST:event_btn_CancelarMouseMoved

    private void btn_CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelarMouseExited
        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Images/Btn_Cancelar.png")));
    }//GEN-LAST:event_btn_CancelarMouseExited

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        Fechas f = new Fechas();
        //int re = esReserva()
        int dif = f.diferenciaEnDias(fSalida.getCalendar(), fIngreso.getCalendar());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String f_Ingreso = sdf.format(fIngreso.getDate());
        String f_Salida = sdf.format(fSalida.getDate());
        if(dif <0){
            JOptionPane.showMessageDialog(null, "La fecha de salida no puede ser inferior a la fecha de ingreso, por favor valide","ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Reserva r = new Reserva ();
            int reserva = r.generarReserva(1, txt_Tipo.getSelectedIndex(), txt_Doc.getText(), txt_Nombre.getText(), Integer.parseInt(txt_Tel.getText()), txt_acomp.getSelectedIndex(), f_Ingreso, f_Salida, (String)txt_TipoHab.getSelectedItem(),dif);
                        
            if(reserva != 0){
                JOptionPane.showMessageDialog(null,"Su número de reserva es:" + reserva, "ALERTA", JOptionPane.OK_OPTION);
            }
        }
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
    }//GEN-LAST:event_jButton1ActionPerformed

    public void setFechas(){
        Calendar fecha = Calendar.getInstance();
        fIngreso.setCalendar(fecha);
        fecha.add(Calendar.DAY_OF_MONTH, 1);
        fSalida.setCalendar(fecha);
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JLabel cc;
    private javax.swing.JLabel cc1;
    private javax.swing.JLabel cc2;
    private javax.swing.JLabel cc3;
    private javax.swing.JLabel cc4;
    private javax.swing.JLabel cc5;
    private javax.swing.JLabel cc6;
    private javax.swing.JLabel cc7;
    private javax.swing.JLabel cc8;
    private com.toedter.calendar.JDateChooser fIngreso;
    private com.toedter.calendar.JDateChooser fSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_Doc;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Precio;
    private javax.swing.JTextField txt_Tel;
    private javax.swing.JComboBox<String> txt_Tipo;
    private javax.swing.JComboBox<String> txt_TipoHab;
    private javax.swing.JComboBox<String> txt_acomp;
    private javax.swing.JComboBox<String> txt_precios;
    // End of variables declaration//GEN-END:variables
}

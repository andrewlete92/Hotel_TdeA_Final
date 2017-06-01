/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.Fechas;
import src.Hotel;
import src.Reserva;

// @author Jhony_Angulo
public class P_Reservas extends javax.swing.JFrame {

    /**
     * Creates new form P_Reservas
     */
    public P_Reservas() {
        initComponents();
        setLocationRelativeTo(null);
        setFechas();
        cargarTabla();
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
        btn_Guardar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        gridRooms = new javax.swing.JTable();

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
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
        cc3.setText("Acompañantes: *");

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
        fIngreso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fIngresoFocusLost(evt);
            }
        });

        cc6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cc6.setForeground(new java.awt.Color(255, 204, 0));
        cc6.setText("Fecha Salida:*");

        fSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fSalida.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fSalida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fSalidaFocusLost(evt);
            }
        });

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

        gridRooms.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(gridRooms);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cc4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cc3)
                                    .addComponent(txt_acomp, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cc5)
                                    .addComponent(fIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cc6)
                                    .addComponent(fSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(215, 215, 215))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
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
        int fl = gridRooms.getSelectedRow();
        if (fl != -1) {
            if (txt_Doc.getText().length() == 0 || txt_Nombre.getText().length() == 0 || txt_Tel.getText().length() == 0 || txt_Tipo.getSelectedIndex() == 0 || txt_acomp.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Hay campos obligatorios vacíos, por favor valide", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                Fechas f = new Fechas();
                int numHab = (int) gridRooms.getValueAt(fl, 0);
                String tipoHab = (String) gridRooms.getValueAt(fl, 2);
                String estado = (String) gridRooms.getValueAt(fl, 3);
                int acomp = (int) gridRooms.getValueAt(fl, 1);
                System.out.println(acomp);
                System.out.println(txt_acomp.getSelectedIndex());
                if (txt_acomp.getSelectedIndex()<=acomp) {
                    if (estado.equals("Ocupada")) {
                        JOptionPane.showMessageDialog(null, "No se puede guardar la reserva, la habitación seleccionada está ocupada para esa fecha\n por favor seleccione otra", "ALERTA", 2);
                    } else {
                        //Falta validar que los campos si estén debidamente diligenciados.
                        int dif = f.diferenciaEnDias(fSalida.getCalendar(), fIngreso.getCalendar());
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        String f_Ingreso = sdf.format(fIngreso.getDate());
                        String f_Salida = sdf.format(fSalida.getDate());

                        if (dif < 0) {
                            JOptionPane.showMessageDialog(null, "La fecha de salida no puede ser inferior a la fecha de ingreso, por favor valide", "ERROR", JOptionPane.ERROR_MESSAGE);
                        } else {
                            Reserva r = new Reserva();
                            int reserva = r.generarReserva(1, txt_Tipo.getSelectedIndex(), txt_Doc.getText(), txt_Nombre.getText(), Integer.parseInt(txt_Tel.getText()), txt_acomp.getSelectedIndex(), f_Ingreso, f_Salida, tipoHab, dif, numHab);
                            cargarTabla();

                            if (reserva != 0) {
                                JOptionPane.showMessageDialog(null, "Su número de reserva es:" + reserva, "ALERTA", JOptionPane.OK_OPTION);
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad de acompañantes no es permitida para esta habitación, debe seleccionar otra", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una habitación para guardar la reserva", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void fSalidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fSalidaFocusLost
        cargarTabla();
    }//GEN-LAST:event_fSalidaFocusLost

    private void fIngresoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fIngresoFocusLost
        cargarTabla();
    }//GEN-LAST:event_fIngresoFocusLost

    public void setFechas() {
        Calendar fecha = Calendar.getInstance();
        fIngreso.setCalendar(fecha);
        fecha.add(Calendar.DAY_OF_MONTH, 1);
        fSalida.setCalendar(fecha);
    }

    public void cargarTabla() {
        Hotel h = new Hotel();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String f_Ingreso = sdf.format(fIngreso.getDate());
        DefaultTableModel modelo = h.mostrarHabitaciones(f_Ingreso);
        gridRooms.setModel(modelo);
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
    private com.toedter.calendar.JDateChooser fIngreso;
    private com.toedter.calendar.JDateChooser fSalida;
    private javax.swing.JTable gridRooms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_Doc;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Tel;
    private javax.swing.JComboBox<String> txt_Tipo;
    private javax.swing.JComboBox<String> txt_acomp;
    // End of variables declaration//GEN-END:variables
}

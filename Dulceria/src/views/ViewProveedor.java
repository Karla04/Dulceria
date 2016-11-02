/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author FamTerrazas
 */
public class ViewProveedor extends javax.swing.JPanel {

    /**
     * Creates new form ViewProveedor
     */
    public ViewProveedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jL_proveedores = new javax.swing.JLabel();
        jL_id = new javax.swing.JLabel();
        jL_nombre = new javax.swing.JLabel();
        jL_rfc = new javax.swing.JLabel();
        jL_calle = new javax.swing.JLabel();
        jL_no = new javax.swing.JLabel();
        jL_colonia = new javax.swing.JLabel();
        jL_ciudad = new javax.swing.JLabel();
        jL_estado = new javax.swing.JLabel();
        jL_nombre_contacto = new javax.swing.JLabel();
        jL_telefono = new javax.swing.JLabel();
        jL_email = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        jtf_rfc = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        jtf_calle = new javax.swing.JTextField();
        jtf_colonia = new javax.swing.JTextField();
        jtf_no = new javax.swing.JTextField();
        jtf_ciudad = new javax.swing.JTextField();
        jtf_estado = new javax.swing.JTextField();
        jtf_nombre_contacto = new javax.swing.JTextField();
        jtf_telefono = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jB_primero = new javax.swing.JButton();
        jB_anterior = new javax.swing.JButton();
        jB_siguiente = new javax.swing.JButton();
        jB_ultimo = new javax.swing.JButton();
        jB_agregar = new javax.swing.JButton();
        jB_quitar = new javax.swing.JButton();
        jB_editar = new javax.swing.JButton();
        jB_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jB_guardar = new javax.swing.JButton();

        setForeground(new java.awt.Color(255, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jL_proveedores.setBackground(new java.awt.Color(255, 153, 0));
        jL_proveedores.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jL_proveedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_proveedores.setText("PROVEEDORES");
        jL_proveedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jL_id.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jL_id.setText("id_proveedor");
        jL_id.setAutoscrolls(true);

        jL_nombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jL_nombre.setText("Nombre");
        jL_nombre.setAutoscrolls(true);

        jL_rfc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jL_rfc.setText("RFC");
        jL_rfc.setAutoscrolls(true);

        jL_calle.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jL_calle.setText("Calle");
        jL_calle.setAutoscrolls(true);

        jL_no.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jL_no.setText("No");
        jL_no.setAutoscrolls(true);

        jL_colonia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jL_colonia.setText("Colonia");
        jL_colonia.setAutoscrolls(true);

        jL_ciudad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jL_ciudad.setText("Ciudad");
        jL_ciudad.setAutoscrolls(true);

        jL_estado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jL_estado.setText("Estado");
        jL_estado.setAutoscrolls(true);

        jL_nombre_contacto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jL_nombre_contacto.setText("Nombre contacto");
        jL_nombre_contacto.setAutoscrolls(true);

        jL_telefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jL_telefono.setText("Telefono");
        jL_telefono.setAutoscrolls(true);

        jL_email.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jL_email.setText("Email");
        jL_email.setAutoscrolls(true);

        jtf_id.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_idActionPerformed(evt);
            }
        });

        jtf_rfc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtf_rfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_rfcActionPerformed(evt);
            }
        });

        jtf_nombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombreActionPerformed(evt);
            }
        });

        jtf_calle.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtf_calle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_calleActionPerformed(evt);
            }
        });

        jtf_colonia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtf_colonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_coloniaActionPerformed(evt);
            }
        });

        jtf_no.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtf_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_noActionPerformed(evt);
            }
        });

        jtf_ciudad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtf_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_ciudadActionPerformed(evt);
            }
        });

        jtf_estado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtf_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_estadoActionPerformed(evt);
            }
        });

        jtf_nombre_contacto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtf_nombre_contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombre_contactoActionPerformed(evt);
            }
        });

        jtf_telefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtf_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_telefonoActionPerformed(evt);
            }
        });

        jtf_email.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_emailActionPerformed(evt);
            }
        });

        jB_primero.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jB_primero.setText("|<");
        jB_primero.setAutoscrolls(true);
        jB_primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_primeroActionPerformed(evt);
            }
        });

        jB_anterior.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jB_anterior.setText("<");
        jB_anterior.setAutoscrolls(true);

        jB_siguiente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jB_siguiente.setText(">");
        jB_siguiente.setAutoscrolls(true);

        jB_ultimo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jB_ultimo.setText("|>");
        jB_ultimo.setAutoscrolls(true);

        jB_agregar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jB_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477464120_1_1.png"))); // NOI18N
        jB_agregar.setAutoscrolls(true);
        jB_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_agregarActionPerformed(evt);
            }
        });

        jB_quitar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jB_quitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477464108_1_2.png"))); // NOI18N
        jB_quitar.setAutoscrolls(true);
        jB_quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_quitarActionPerformed(evt);
            }
        });

        jB_editar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jB_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        jB_editar.setAutoscrolls(true);

        jB_buscar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jB_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477463679_Search.png"))); // NOI18N
        jB_buscar.setAutoscrolls(true);

        jT_tabla.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jT_tabla.setForeground(new java.awt.Color(255, 153, 0));
        jT_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id_proveedor", "Nombre", "RFC", "Calle", "No", "Colonia", "Cuidad", "Estado", "Nombre Contacto", "Telefono", "Email"
            }
        ));
        jScrollPane1.setViewportView(jT_tabla);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveed.png"))); // NOI18N

        jB_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477462880_Save.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jL_proveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 163, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jL_rfc)
                                    .addComponent(jL_calle)
                                    .addComponent(jL_nombre)
                                    .addComponent(jL_colonia)
                                    .addComponent(jL_estado)
                                    .addComponent(jL_nombre_contacto)
                                    .addComponent(jL_telefono)
                                    .addComponent(jL_email)
                                    .addComponent(jL_id)
                                    .addComponent(jL_no)
                                    .addComponent(jL_ciudad))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_nombre_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_no, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jB_agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jB_editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jB_quitar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jB_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jB_guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(144, 144, 144))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jB_primero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_anterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jB_siguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jB_ultimo)
                                .addGap(176, 176, 176))))))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_id)
                    .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_nombre)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_rfc))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_calle))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_no))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_colonia))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_ciudad))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_estado))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_nombre_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_nombre_contacto)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jB_agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_quitar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_guardar)
                                .addGap(44, 44, 44)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jL_telefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_email)
                            .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB_primero)
                            .addComponent(jB_anterior)
                            .addComponent(jB_siguiente)
                            .addComponent(jB_ultimo))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_idActionPerformed

    private void jtf_rfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_rfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_rfcActionPerformed

    private void jtf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombreActionPerformed

    private void jtf_calleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_calleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_calleActionPerformed

    private void jtf_coloniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_coloniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_coloniaActionPerformed

    private void jtf_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_noActionPerformed

    private void jtf_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_ciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_ciudadActionPerformed

    private void jtf_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_estadoActionPerformed

    private void jtf_nombre_contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombre_contactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombre_contactoActionPerformed

    private void jtf_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_telefonoActionPerformed

    private void jtf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_emailActionPerformed

    private void jB_primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_primeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_primeroActionPerformed

    private void jB_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_agregarActionPerformed

    private void jB_quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_quitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_quitarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jB_agregar;
    public javax.swing.JButton jB_anterior;
    public javax.swing.JButton jB_buscar;
    public javax.swing.JButton jB_editar;
    private javax.swing.JButton jB_guardar;
    public javax.swing.JButton jB_primero;
    public javax.swing.JButton jB_quitar;
    public javax.swing.JButton jB_siguiente;
    public javax.swing.JButton jB_ultimo;
    public javax.swing.JLabel jL_calle;
    public javax.swing.JLabel jL_ciudad;
    public javax.swing.JLabel jL_colonia;
    public javax.swing.JLabel jL_email;
    public javax.swing.JLabel jL_estado;
    public javax.swing.JLabel jL_id;
    public javax.swing.JLabel jL_no;
    public javax.swing.JLabel jL_nombre;
    public javax.swing.JLabel jL_nombre_contacto;
    public javax.swing.JLabel jL_proveedores;
    public javax.swing.JLabel jL_rfc;
    public javax.swing.JLabel jL_telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable jT_tabla;
    public javax.swing.JTextField jtf_calle;
    public javax.swing.JTextField jtf_ciudad;
    public javax.swing.JTextField jtf_colonia;
    public javax.swing.JTextField jtf_email;
    public javax.swing.JTextField jtf_estado;
    public javax.swing.JTextField jtf_id;
    public javax.swing.JTextField jtf_no;
    public javax.swing.JTextField jtf_nombre;
    public javax.swing.JTextField jtf_nombre_contacto;
    public javax.swing.JTextField jtf_rfc;
    public javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}

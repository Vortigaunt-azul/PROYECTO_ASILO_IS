/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TRANSICION;

import DATABASE.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class H_Habitacion extends javax.swing.JPanel {

    /**
     * Creates new form H_Habitacion
     */
    public H_Habitacion() {
        initComponents();
        
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

        bg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHabitacion = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        bg.setBackground(new java.awt.Color(255, 255, 255));

        tblHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        tblHabitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Numero", "Capacidad", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHabitacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHabitacion);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Numero ");

        jLabel2.setText("Capacidad");

        jLabel3.setText("Descripcion");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnGuardar)
                        .addGap(34, 34, 34)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(36, 36, 36)
                        .addComponent(btnLimpiar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
             
       // int id = Integer.parseInt(txtId.getText());
       
        int numero = Integer.parseInt(txtNumero.getText());
        int capacidad = Integer.parseInt(txtCapacidad.getText());
        String descripcion = txtDescripcion.getText();

       
        
        
       
       try{
           
            Connection con = Conexion.getConexion();
           PreparedStatement ps = con.prepareStatement("INSERT INTO habitaciones (numero,capacidad,descripcion) VALUES (?,?,?)");
           
          
           ps.setInt(1, numero);
            ps.setInt(2,capacidad);
             ps.setString(3,descripcion);
              
           
              ps.executeUpdate();
              
              JOptionPane.showMessageDialog(null,"Registro Guardado");
              limpiar();
              cargarTabla();
              
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,e.toString());
       }
        
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
           limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       
                
         // int id = Integer.parseInt(txtId.getText());
         // int id = Integer.parseInt(txtId.getText());
         
        int numero = Integer.parseInt(txtNumero.getText());
        int capacidad = Integer.parseInt(txtCapacidad.getText());
        String descripcion = txtDescripcion.getText();
         
      
       int id = getIdDelRegistroQueDeseasActualizar(); // Aquí debes obtener el valor correcto de id
        
       
       try{
           
            Connection con = Conexion.getConexion();
           PreparedStatement ps = con.prepareStatement("UPDATE habitaciones SET numero=?,capacidad=?,descripcion=? WHERE id=? ");
           
          
           ps.setInt(1, numero);
            ps.setInt(2,capacidad);
             ps.setString(3,descripcion);
               ps.setInt(4,id);
           
              ps.executeUpdate();
              
              JOptionPane.showMessageDialog(null,"Registro Modeficado");
              limpiar();
              cargarTabla();
              
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,e.toString());
       }
        
        
        
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tblHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHabitacionMouseClicked

        try{

            int fila = tblHabitacion.getSelectedRow();
            int id = Integer.parseInt(tblHabitacion.getValueAt(fila,0).toString());
            PreparedStatement ps;
            ResultSet rs;

            Connection con = Conexion.getConexion();

            ps = con.prepareStatement("SELECT numero,capacidad,descripcion FROM habitaciones WHERE id = ?");

            ps.setInt(1, id);
            rs = ps.executeQuery();

            while(rs.next()){

                txtNumero.setText(rs.getString("numero"));
                txtCapacidad.setText(rs.getString("capacidad"));
                txtDescripcion.setText(rs.getString("descripcion"));

            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }

    }//GEN-LAST:event_tblHabitacionMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int id = getIdDelRegistroQueDeseasActualizar(); // Aquí debes obtener el valor correcto de id

        try{

            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM habitaciones WHERE id=? ");

            ps.setInt(1,id);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null,"Registro Eliminado");
            limpiar();
            cargarTabla();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

        private int getIdDelRegistroQueDeseasActualizar() {
    int filaSeleccionada = tblHabitacion.getSelectedRow();
    int id = Integer.parseInt(tblHabitacion.getValueAt(filaSeleccionada, 0).toString());
    return id;
    
}
        
        
     private void limpiar(){
        txtNumero.setText("");
        txtCapacidad.setText("");
        txtDescripcion.setText("");
        
    }
    
    
    
        private void cargarTabla(){
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tblHabitacion.getModel();
        modeloTabla.setRowCount(0);
        
       PreparedStatement ps;
       ResultSet rs;
       ResultSetMetaData rsmd;
       int columnas;
       
       int[] anchos = {30,50,50,150};
       
       for(int i= 0; i < tblHabitacion.getColumnCount(); i++){
           
           tblHabitacion.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
       }
       
       
       
       try{
           
            Connection con = Conexion.getConexion();
            
             ps = con.prepareStatement("SELECT id,numero,capacidad,descripcion FROM habitaciones");
           
          
           rs = ps.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while(rs.next()){
            
               Object[] fila = new Object[columnas];
               for(int indice=0; indice<columnas; indice++){
                   
                   fila[indice] = rs.getObject(indice + 1);
               }
               modeloTabla.addRow(fila);
           }
           
       } catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
           
       }
       
    }
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHabitacion;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}

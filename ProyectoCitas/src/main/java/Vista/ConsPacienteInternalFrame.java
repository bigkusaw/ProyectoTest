/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ConsPacienteInternalFrame extends javax.swing.JInternalFrame {

    public Controlador.GestorPacienteControl gestorpacienteControl;
    private DefaultTableModel tabla;
    /**
     * Creates new form ConsPacienteInternalFrame
     */
    
    public ConsPacienteInternalFrame() {
        initComponents();
        gestorpacienteControl=new Controlador.GestorPacienteControl(this);
        String titulosTabla[]={"Identificación","Nombres","Apellidos", "Fecha Nacimiento","Género"};
        tabla=new DefaultTableModel(null,titulosTabla);
        Tbl_datos.setModel(tabla);
        btn_aceptar.addActionListener(gestorpacienteControl);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdb_identificacion = new javax.swing.JRadioButton();
        rdb_nombres = new javax.swing.JRadioButton();
        rdb_apellidos = new javax.swing.JRadioButton();
        rdb_genero = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_datos = new javax.swing.JTable();

        setTitle("Formulario");

        rdb_identificacion.setSelected(true);
        rdb_identificacion.setText("Identificación");

        rdb_nombres.setSelected(true);
        rdb_nombres.setText("Nombres");

        rdb_apellidos.setText("Apellido");

        rdb_genero.setText("Sexo");

        jLabel1.setText("Valor a buscar");

        txt_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorActionPerformed(evt);
            }
        });

        btn_aceptar.setText("Aceptar");

        Tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
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
        Tbl_datos.setShowGrid(true);
        jScrollPane1.setViewportView(Tbl_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rdb_identificacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdb_nombres)
                        .addGap(18, 18, 18)
                        .addComponent(rdb_apellidos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_aceptar)
                    .addComponent(rdb_genero))
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_identificacion)
                    .addComponent(rdb_nombres)
                    .addComponent(rdb_apellidos)
                    .addComponent(rdb_genero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tbl_datos;
    public javax.swing.JButton btn_aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rdb_apellidos;
    public javax.swing.JRadioButton rdb_genero;
    public javax.swing.JRadioButton rdb_identificacion;
    public javax.swing.JRadioButton rdb_nombres;
    public javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
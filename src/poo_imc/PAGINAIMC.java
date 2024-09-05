/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo_imc;

import Clases.IMC;
import Clases.USUARIO;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nadir
 */
public class PAGINAIMC extends javax.swing.JFrame {

DefaultTableModel modelo;
ArrayList<IMC>historial;

    public PAGINAIMC(USUARIO usuario) {
        initComponents();
         JOptionPane.showMessageDialog(this, "Bienvenido"+usuario.getNombre()+""+usuario.getApellido());
        txtusuario.setText(usuario.getNombre()+""+usuario.getApellido());
        modelo=new DefaultTableModel();
        historial=new ArrayList<>();
    
    }
public void limpiartabla(){
 for(int i=0; i < modelo.getRowCount();i++){
    modelo.removeRow(i);
    i=i-1;
}
}
public void listar(){
 
   modelo=(DefaultTableModel) tlbimc.getModel();
   Object[] ob=new Object[6];
   for(int i=0;i<historial.size();i++){
       ob[0]=historial.get(i).getAltura();
       ob[1]=historial.get(i).getPeso();
       ob[2]=historial.get(i).getImc();
       ob[3]=historial.get(i).getFechaHora();
       ob[4]=historial.get(i).getAltura();
       ob[5]=historial.get(i).getNombreu();
       modelo.addRow(ob);
   }
   tlbimc.setModel(modelo);
   }
   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtpeso = new javax.swing.JTextField();
        txtaltura = new javax.swing.JTextField();
        btncalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlbimc = new javax.swing.JTable();
        txtusuario = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesoActionPerformed(evt);
            }
        });

        btncalcular.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        btncalcular.setText("CALCULAR");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLabel1.setText("CALCULA TU IMC");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel2.setText("DIGITA TU PESO");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel3.setText("DIGITA TU ALTURA");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel4.setText("IMC CALCULADOS POR ");

        tlbimc.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        tlbimc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Altura", "Peso", "Imc", "Fecha", "Usuario"
            }
        ));
        jScrollPane1.setViewportView(tlbimc);

        txtusuario.setText("nombreusu");

        btnlimpiar.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jButton3.setText("CERRAR SECION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btncalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpiar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtusuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncalcular)
                    .addComponent(btnlimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtusuario))
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesoActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
   if(!txtpeso.getText().isEmpty()&&
             !txtaltura.getText().isEmpty()){      
double altura=Double.parseDouble(txtaltura.getText());
      double peso=Double.parseDouble(txtpeso.getText());
      double imc=peso/(altura*altura);
      LocalDateTime fechaHoraActual = LocalDateTime.now();
      String fechao=""+fechaHoraActual;
      
      imc=(int) Math.floor(imc);
         String imc2=""+imc;
        
         IMC h=new IMC();
         h.setAltura(txtaltura.getText());
         h.setPeso(txtpeso.getText());
         h.setImc(imc2);
         h.setFechaHora(fechao);
         h.setNombreu(txtusuario.getText());
           historial.add(h);
           limpiartabla();
           listar();
      
   
         
       if (imc < 18.5) {
           
         JOptionPane.showMessageDialog(this,"IMC es de "+imc+" Bajo peso");
           
        } else if (imc < 25) {
             JOptionPane.showMessageDialog(this,"IMC es de "+imc+"Peso normal");
        } else if (imc < 30) {
             JOptionPane.showMessageDialog(this,"IMC es de "+imc+"Sobrepeso");
        } else {
              JOptionPane.showMessageDialog(this,"IMC es de "+imc+"Obesidad");
        }
     }else{
          JOptionPane.showMessageDialog(this,"Tienes campos vacios");
     }
    
          if(!txtaltura.getText().isEmpty()&&
             !txtpeso.getText().isEmpty()){
       
         JOptionPane.showMessageDialog(this,"Datos guardados correctamente"); 

          }else{
             JOptionPane.showMessageDialog(this,"Pilas Tienes campos vacios"); 
          }
          
    }//GEN-LAST:event_btncalcularActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.dispose();
        InicioS pagina=new InicioS();
            pagina.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
         txtaltura.setText("");
           txtpeso.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tlbimc;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JLabel txtusuario;
    // End of variables declaration//GEN-END:variables
}

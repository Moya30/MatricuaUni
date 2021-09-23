package Vista;

import Controlador.EstructReg;
import Modelo.Nodo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vist2 extends javax.swing.JFrame implements KeyListener{

    EstructReg lista;
    DefaultTableModel Model;

    public Vist2() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);

        lista = new EstructReg();

        Model = new DefaultTableModel();
        Object registros[][] = {};
        String cabecera[] = {
            "ID", "NOMBRE", "APELLIDO", "N° CREDITOS"};
        Model = new DefaultTableModel(registros, cabecera);
        tabla.setModel(Model);
        
         txtIdAlum.addKeyListener(this);
        txtNom.addKeyListener(this);
        txtApellido.addKeyListener(this);
        txtBuscar.addKeyListener(this);
        txtNumCred.addKeyListener(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        REgistro = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtIdAlum = new javax.swing.JTextField();
        txtNumCred = new javax.swing.JTextField();
        btnInsertarInicio = new javax.swing.JButton();
        btnInsertarFinal = new javax.swing.JButton();
        btnOrd = new javax.swing.JPanel();
        btnOrdenar = new javax.swing.JLabel();
        btnBus = new javax.swing.JPanel();
        btnBusqueda = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        BotonesEliminar = new javax.swing.JPanel();
        CualquierPos = new javax.swing.JPanel();
        btnEliminarCualquiera = new javax.swing.JLabel();
        Final = new javax.swing.JPanel();
        btnEliminarFinal = new javax.swing.JLabel();
        Inicio = new javax.swing.JPanel();
        btnEliminarInicio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        REgistro.setBackground(new java.awt.Color(38, 70, 83));
        REgistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(42, 157, 143));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(38, 70, 83));
        jLabel1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APELLIDOS:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 100, 30));

        jLabel2.setBackground(new java.awt.Color(38, 70, 83));
        jLabel2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID DE ALUMNO:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 30));

        jLabel3.setBackground(new java.awt.Color(38, 70, 83));
        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRES: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 30));

        jLabel5.setBackground(new java.awt.Color(38, 70, 83));
        jLabel5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("N° DE CRÉDITOS:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 110, 30));
        jPanel2.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 140, 30));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 140, 30));
        jPanel2.add(txtIdAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, 30));
        jPanel2.add(txtNumCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 140, 30));

        btnInsertarInicio.setBackground(new java.awt.Color(233, 190, 86));
        btnInsertarInicio.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnInsertarInicio.setForeground(new java.awt.Color(38, 70, 83));
        btnInsertarInicio.setText("Insertar - Inicio");
        btnInsertarInicio.setAutoscrolls(true);
        btnInsertarInicio.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnInsertarInicio.setBorderPainted(false);
        btnInsertarInicio.setDefaultCapable(false);
        btnInsertarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarInicioActionPerformed(evt);
            }
        });
        jPanel2.add(btnInsertarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 130, 30));

        btnInsertarFinal.setBackground(new java.awt.Color(233, 190, 86));
        btnInsertarFinal.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnInsertarFinal.setForeground(new java.awt.Color(38, 70, 83));
        btnInsertarFinal.setText("Insertar - Final");
        btnInsertarFinal.setAutoscrolls(true);
        btnInsertarFinal.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnInsertarFinal.setBorderPainted(false);
        btnInsertarFinal.setDefaultCapable(false);
        btnInsertarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarFinalActionPerformed(evt);
            }
        });
        jPanel2.add(btnInsertarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 120, 30));

        REgistro.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 590, 140));

        btnOrd.setBackground(new java.awt.Color(233, 196, 106));
        btnOrd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOrdenar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(38, 70, 83));
        btnOrdenar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrdenarMouseClicked(evt);
            }
        });
        btnOrd.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        REgistro.add(btnOrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 130, 30));

        btnBus.setBackground(new java.awt.Color(42, 157, 143));
        btnBus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-search-27.png"))); // NOI18N
        btnBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseClicked(evt);
            }
        });
        btnBus.add(btnBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        REgistro.add(btnBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 40, 30));
        REgistro.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 300, 30));

        jLabel7.setBackground(new java.awt.Color(38, 70, 83));
        jLabel7.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar ID:");
        REgistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 110, 30));

        tabla.setForeground(new java.awt.Color(0, 0, 102));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID del Alumno", "Nombres", "Apellidos", "N° de Créditos "
            }
        ));
        tabla.setAutoscrolls(false);
        jScrollPane1.setViewportView(tabla);

        REgistro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 570, 150));

        BotonesEliminar.setBackground(new java.awt.Color(38, 70, 83));
        BotonesEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CualquierPos.setBackground(new java.awt.Color(244, 162, 97));
        CualquierPos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarCualquiera.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnEliminarCualquiera.setForeground(new java.awt.Color(38, 70, 83));
        btnEliminarCualquiera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminarCualquiera.setText("Eliminar Cualquier Posición");
        btnEliminarCualquiera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarCualquieraMouseClicked(evt);
            }
        });
        CualquierPos.add(btnEliminarCualquiera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        BotonesEliminar.add(CualquierPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 180, 30));

        Final.setBackground(new java.awt.Color(244, 162, 97));
        Final.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarFinal.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnEliminarFinal.setForeground(new java.awt.Color(38, 70, 83));
        btnEliminarFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminarFinal.setText("Eliminar - Final");
        btnEliminarFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarFinalMouseClicked(evt);
            }
        });
        Final.add(btnEliminarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        BotonesEliminar.add(Final, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 120, 30));

        Inicio.setBackground(new java.awt.Color(244, 162, 97));
        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarInicio.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnEliminarInicio.setForeground(new java.awt.Color(38, 70, 83));
        btnEliminarInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminarInicio.setText("Eliminar - Inicio");
        btnEliminarInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarInicioMouseClicked(evt);
            }
        });
        Inicio.add(btnEliminarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        BotonesEliminar.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 30));

        REgistro.add(BotonesEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 570, 50));

        getContentPane().add(REgistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 650, 490));

        jPanel1.setBackground(new java.awt.Color(231, 111, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 60, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnOrdenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenarMouseClicked
      lista.ordenar();
      
        lista.listar(tabla, Model);
    }//GEN-LAST:event_btnOrdenarMouseClicked

    private void btnEliminarInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarInicioMouseClicked
        // TODO add your handling code here:
       lista.eliminarInicial();
        lista.listar(tabla, Model);
        
    }//GEN-LAST:event_btnEliminarInicioMouseClicked

    private void btnEliminarFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarFinalMouseClicked
        // TODO add your handling code here:
        
        lista.eliminarFinal();
        lista.listar(tabla, Model);
       
    }//GEN-LAST:event_btnEliminarFinalMouseClicked

    private void btnEliminarCualquieraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCualquieraMouseClicked
        // TODO add your handling code here:
        
        int ide = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo a eliminar"));
        
         lista.eliminar( ide);
         lista.listar(tabla, Model);
         
       
    }//GEN-LAST:event_btnEliminarCualquieraMouseClicked

    private void btnBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseClicked
        // TODO add your handling code here:
        limpiar();
 
        Object datosBuscados[] = lista.consultar(Integer.parseInt(txtBuscar.getText()));

        if (txtBuscar.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un codigo a buscar");
        } else {
            if (datosBuscados == null) {
                JOptionPane.showMessageDialog(this, "El código: " + txtBuscar.getText() + " no esta en la lista");
               
            } else {
                JOptionPane.showMessageDialog(null,"Mostrando datos del codigo: "+txtBuscar.getText());
                txtIdAlum.setText(datosBuscados[0].toString());
                txtNumCred.setText(datosBuscados[1].toString());
                txtNom.setText(datosBuscados[2].toString());
                txtApellido.setText(datosBuscados[3].toString());
                 tabla.setModel(Model);
               
            }
        }
    
    }//GEN-LAST:event_btnBusquedaMouseClicked

    public void limpiar() {
        txtIdAlum.setText("");
        txtNumCred.setText("");
        txtNom.setText("");
        txtApellido.setText("");
    }
    private void btnInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFinalActionPerformed
        lista.agregarFinal(Integer.parseInt(txtIdAlum.getText()),
                Integer.parseInt(txtNumCred.getText()), txtNom.getText(),
                txtApellido.getText());
        lista.listar(tabla, Model);
        limpiar();
    }//GEN-LAST:event_btnInsertarFinalActionPerformed

    private void btnInsertarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarInicioActionPerformed
        lista.agregarInicio(Integer.parseInt(txtIdAlum.getText()),
                Integer.parseInt(txtNumCred.getText()), txtNom.getText(),
                txtApellido.getText());
        lista.listar(tabla, Model);
        limpiar();
    }//GEN-LAST:event_btnInsertarInicioActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vist2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vist2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vist2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vist2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vist2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonesEliminar;
    private javax.swing.JPanel CualquierPos;
    private javax.swing.JPanel Final;
    private javax.swing.JPanel Inicio;
    private javax.swing.JPanel REgistro;
    private javax.swing.JPanel btnBus;
    private javax.swing.JLabel btnBusqueda;
    private javax.swing.JLabel btnEliminarCualquiera;
    private javax.swing.JLabel btnEliminarFinal;
    private javax.swing.JLabel btnEliminarInicio;
    private javax.swing.JButton btnInsertarFinal;
    private javax.swing.JButton btnInsertarInicio;
    private javax.swing.JPanel btnOrd;
    private javax.swing.JLabel btnOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtIdAlum;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNumCred;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent xd) {
      
         if (xd.getSource() == txtNom) {
            char c = xd.getKeyChar();
            if (Character.isDigit(c)) {
                xd.consume();
            }

        } else if (xd.getSource() == txtIdAlum) {
            char t = xd.getKeyChar();
            if (!Character.isDigit(t)) {
                xd.consume();
            }
        } else if (xd.getSource() == txtNumCred) {
            char t = xd.getKeyChar();
            if (!Character.isDigit(t)) {
                xd.consume();
            }

        } else if (xd.getSource() == txtApellido) {
            char c = xd.getKeyChar();

            if (Character.isDigit(c)) {
                xd.consume();
            }
        }else if (xd.getSource() == txtBuscar) {
            char t = xd.getKeyChar();
            if (!Character.isDigit(t)) {
                xd.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
      
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import EDD.HashTable;
import EDD.Resumenes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Tomas
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_1
     */
    public Ventana() {
        initComponents();        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pannel = new javax.swing.JPanel();
        LeerTXT = new javax.swing.JButton();
        Parent = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pannel.setBackground(new java.awt.Color(0, 0, 0));
        Pannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeerTXT.setText("LEER TXT");
        LeerTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerTXTActionPerformed(evt);
            }
        });
        Pannel.add(LeerTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, -1));

        getContentPane().add(Pannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 540));

        Parent.setBackground(new java.awt.Color(255, 255, 255));
        Parent.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Parent.add(jPanel1, "card2");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Parent.add(jPanel2, "card3");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Parent.add(jPanel3, "card4");

        getContentPane().add(Parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 620, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LeerTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerTXTActionPerformed
       Resumenes resumen=null;
        JFileChooser file = new JFileChooser();
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".TXT","txt");
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        file.setFileFilter(filter);
        int selection=file.showOpenDialog(this);
        
        if(selection==JFileChooser.APPROVE_OPTION){
        
            File archive=file.getSelectedFile();
            String path=archive.getAbsolutePath();
        if(!path.contains("txt")) {
            JOptionPane.showMessageDialog(null, "Por favor elija un archivo del tipo txt");
            }
            else{
            try{
                File archivo = new File (path); 
                FileReader fr = new FileReader(archivo); 
                BufferedReader br = new BufferedReader(fr); 
                
                String Resumen;
                String ResumenInfo=""; 
      
        while ((Resumen=br.readLine())!=null) { 

            if(!Resumen.isEmpty()&& !Resumen.isBlank()) {
                ResumenInfo+=Resumen+"\n";
                

            }
        }
         fr.close();
        br.close();
        ResumenInfo=ResumenInfo.trim();

        if(!"".equals(ResumenInfo)) {
            HashTable hashtable=Global.getHashtable();
            String[] Info1=ResumenInfo.split("Autores");
            
            Info1[0]=Info1[0].trim();
            String titulo=Info1[0];
            Info1[1]=Info1[1].trim();
            
            String[] Info2=Info1[1].split("Resumen");
            Info2[0]=Info2[0].trim();
            String autores=Info2[0];
            String[] Info3=Info2[1].trim().split("\n");
            String contenido=Info3[0];
            
            String[] Info4=Info3[1].split(":");
            String keywords=Info4[1].trim();
            
            resumen=new Resumenes(titulo,autores,contenido,keywords);
            
            hashtable.Insert(hashtable.Hash(resumen.getTitle()), resumen);
            
            JOptionPane.showMessageDialog(null, "Resumen cargado con exito");

            
            } 
            } catch(Exception e) {JOptionPane.showMessageDialog(null, "Error!!!"); }
            
            }
        }
    }//GEN-LAST:event_LeerTXTActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LeerTXT;
    private javax.swing.JPanel Pannel;
    private javax.swing.JPanel Parent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

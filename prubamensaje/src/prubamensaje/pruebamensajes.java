/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prubamensaje;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Burgos
 */
public class pruebamensajes extends javax.swing.JFrame {

    /**
     * Creates new form pruebamensajes
     */
    public pruebamensajes() {
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

        btn_mensajes = new javax.swing.JButton();
        lbl_texto = new javax.swing.JLabel();
        btn_capturarnombre = new javax.swing.JButton();
        btn_despedirce = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_mensajes.setText("mensajes");
        btn_mensajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mensajesActionPerformed(evt);
            }
        });

        btn_capturarnombre.setText("capturar");
        btn_capturarnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capturarnombreActionPerformed(evt);
            }
        });

        btn_despedirce.setText("despedirce");
        btn_despedirce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_despedirceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btn_mensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btn_capturarnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addComponent(btn_despedirce)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_mensajes, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(btn_capturarnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_despedirce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(lbl_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_mensajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mensajesActionPerformed
        // TODO add your handling code here:
        String num=JOptionPane.showInputDialog(this,"digite un numero de 4 cifras");
        int numero= Integer.parseInt(num);
        
        int millares=numero/1000;
	int centenas=(numero-(millares*1000))/100;
	int decenas=(numero- (millares*1000 + centenas*100))/10;
	int unidades=numero-(millares*1000 + centenas*100 + decenas*10 );
        
         JOptionPane.showMessageDialog(null, "unidades= "+ unidades + "\ndecenas= "+decenas+"\ncentenas= "+centenas+"\nmillares= "+millares );
        
        
                
        
    }//GEN-LAST:event_btn_mensajesActionPerformed

    private void btn_capturarnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capturarnombreActionPerformed
        // TODO add your handling code here:
        int n=Integer.parseInt(JOptionPane.showInputDialog("cuantos numeros se almacenan?"));
        double[]numeros = new double[n];
        
        for (int i = 0; i < 10; i++) {
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("numeo"+i));   
        }
        double sum=0;
        for (int i = 0; i < 10; i++) {
            sum+=numeros[i];   
        }
        double avg=sum/n;
        double suma=0;
        
        for (int i = 0; i < 10; i++) {
            suma+=Math.pow(numeros[i]-avg,2);
            
        }
        double std=Math.sqrt(suma/(n-1));
        
        JOptionPane.showMessageDialog(null, "promedio "+avg+"\nDesviacion estandar"+std );
        
        
        
    }//GEN-LAST:event_btn_capturarnombreActionPerformed

    private void btn_despedirceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_despedirceActionPerformed
        // TODO add your handling code here:
        
        String nb=JOptionPane.showInputDialog("escriba numeros binarios");
        int nd=0;
        for (int i = 0; i < nb.length(); i++) {
            int db=Integer.parseInt(nb.charAt(i)+"");
            nd+=Math.pow(2,nb.length()-i-i)*db;
            
        }
        
        
        
        
        
        int op=JOptionPane.showConfirmDialog(this, "desea despedirce?");
        if (op==JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "vuelva pronto");
            System.exit(0);
            
        }

    }//GEN-LAST:event_btn_despedirceActionPerformed

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
            java.util.logging.Logger.getLogger(pruebamensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pruebamensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pruebamensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pruebamensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pruebamensajes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_capturarnombre;
    private javax.swing.JButton btn_despedirce;
    private javax.swing.JButton btn_mensajes;
    private javax.swing.JLabel lbl_texto;
    // End of variables declaration//GEN-END:variables
}

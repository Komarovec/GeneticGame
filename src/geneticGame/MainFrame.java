/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticGame;

import java.awt.Dimension;

/**
 *
 * @author Denis Kurka
 */
public class MainFrame extends javax.swing.JFrame {
    private final Playground pg;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        pg = new Playground(this);
        this.add(pg);
        Dimension screenS = new Dimension(
            pg.getScaledValue(1200),
            pg.getScaledValue(1000)
        );
        this.setPreferredSize(screenS);
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

        jToolBar1 = new javax.swing.JToolBar();
        createBarrierButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        createBarrierButton.setText("Barrier");
        createBarrierButton.setFocusable(false);
        createBarrierButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createBarrierButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        createBarrierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBarrierButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(createBarrierButton);

        deleteButton.setText("Delete");
        deleteButton.setFocusable(false);
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(deleteButton);

        fileMenu.setText("File");
        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");
        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 889, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBarrierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBarrierButtonActionPerformed
        pg.createBarrier();
    }//GEN-LAST:event_createBarrierButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        pg.deleteBarrier();
    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createBarrierButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}

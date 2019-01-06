/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticGame;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.awt.Dimension;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JFileChooser;

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
        changeButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        spawnPlayer = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveItem = new javax.swing.JMenuItem();
        loadItem = new javax.swing.JMenuItem();
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

        changeButton.setText("Change");
        changeButton.setFocusable(false);
        changeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        changeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(changeButton);

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

        startButton.setText("Start Evolution");
        startButton.setFocusable(false);
        startButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        startButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(startButton);

        spawnPlayer.setText("Spawn car");
        spawnPlayer.setFocusable(false);
        spawnPlayer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        spawnPlayer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        spawnPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spawnPlayerActionPerformed(evt);
            }
        });
        jToolBar1.add(spawnPlayer);

        fileMenu.setText("File");

        saveItem.setText("Save Level");
        saveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveItem);

        loadItem.setText("Load Level");
        loadItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadItemActionPerformed(evt);
            }
        });
        fileMenu.add(loadItem);

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

    private void saveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveItemActionPerformed
        saveLevel();
    }//GEN-LAST:event_saveItemActionPerformed

    private void loadItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadItemActionPerformed
        loadLevel();
    }//GEN-LAST:event_loadItemActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        pg.startEvolution();
    }//GEN-LAST:event_startButtonActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        pg.changeBarrier();
    }//GEN-LAST:event_changeButtonActionPerformed

    private void spawnPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spawnPlayerActionPerformed
        pg.spawnPlayer();
    }//GEN-LAST:event_spawnPlayerActionPerformed

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
    
    static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
    
    public boolean saveLevel() {
        JFileChooser fc = new JFileChooser();
        fc.setDialogType(1);
        fc.setCurrentDirectory(new File("."));
        
        String path;
        
        int returnVal = fc.showSaveDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            path = fc.getSelectedFile().getPath();
        }
        else {
            return false;
        }
        
        XStream xstream = new XStream(new DomDriver()); 
        ArrayList<BarrierSkeleton> skelBars = new ArrayList();
        for(Barrier b : pg.getBarriers()) {
            skelBars.add(b.getSkeleton());
        }
        String xml = xstream.toXML(skelBars);
        xml += '\n';
        xml += xstream.toXML(pg.getSpawn().getPos());
        
        try (PrintWriter out = new PrintWriter(path)) {
            out.println(xml);
            return true;
        }
        catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean loadLevel() {
        JFileChooser fc = new JFileChooser();
        fc.setDialogType(1);
        fc.setCurrentDirectory(new File("."));
        
        String path;
        
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            path = fc.getSelectedFile().getPath();
        }
        else {
            return false;
        }
        
        XStream xstream = new XStream(new DomDriver()); 
        try {
            String xml = readFile(path, Charset.defaultCharset());
            
            String x1 = xml.substring(0, xml.indexOf("<java.awt.Point"));
            String x2 = xml.substring(xml.indexOf("<java.awt.Point"));
            
            ArrayList<BarrierSkeleton> skelBars = (ArrayList<BarrierSkeleton>)xstream.fromXML(x1);
            Point spawnPoint = (Point)xstream.fromXML(x2);
            
            pg.getSpawn().setPos(spawnPoint);
            
            ArrayList<Barrier> bars = new ArrayList();
            for(BarrierSkeleton bs : skelBars) {
                bars.add(new Barrier(bs.getLenght(), bs.getWidth(), pg, bs.getS(), bs.getAngle()));
            }
            
            pg.setBarriers(bars);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeButton;
    private javax.swing.JButton createBarrierButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem loadItem;
    private javax.swing.JMenuItem saveItem;
    private javax.swing.JButton spawnPlayer;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}

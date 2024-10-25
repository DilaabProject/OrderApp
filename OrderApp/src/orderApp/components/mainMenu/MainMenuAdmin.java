package orderApp.components.mainMenu;


import orderApp.Main;

public class MainMenuAdmin extends javax.swing.JFrame {

    
    public MainMenuAdmin() {
        initComponents();
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        inventoryButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        salebutton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateButton.setText("Update Product");
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        inventoryButton.setText("Inventory");
        inventoryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryButtonMouseClicked(evt);
            }
        });
        jPanel1.add(inventoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, -1));

        addButton.setText("Add Product");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, -1));

        deleteButton.setText("Delete Product");
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, -1));

        salebutton.setText("Sales");
        jPanel1.add(salebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 130, -1));

        settingsButton.setText("Settings");
        jPanel1.add(settingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 220));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inventoryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryButtonMouseClicked
        Main.inventoryForm();
    }//GEN-LAST:event_inventoryButtonMouseClicked

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        Main.addProductForm();
    }//GEN-LAST:event_addButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton inventoryButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salebutton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}


package orderApp.components.mainMenu.mainMenuComponents.inventory;

import javax.swing.table.DefaultTableModel;
import orderApp.Main;
public class Inventory extends javax.swing.JFrame {

    public Inventory() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        loadButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Code", "Name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(productsTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 740, 350));

        loadButton.setText("Load");
        loadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadButtonMouseClicked(evt);
            }
        });
        jPanel1.add(loadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadButtonMouseClicked
       displayProducts();
    }//GEN-LAST:event_loadButtonMouseClicked

    public void displayProducts(){
        
        int count;
        
        count = 0;
        while(count < Main.MAX_PRODUCTS){
            if(Main.END_LINE.equals(Main.product[count].getProductCode())){
                break;
            }
            count++;
        }
        
        // [FORMAT]: product code / product name / product quantity

        
        String productFormat[] = { "Product Code", "Product Name", "Quantity"};
        
        Object[][] products = new Object[count][Main.PRODUCTS_FORMAT_COUNT];
 
        for(int i = 0; i <  Main.MAX_PRODUCTS; i++){
            
            if(Main.END_LINE.equals(Main.product[i].getProductCode())){
                break;
            }
            
            products[i][0] = Main.product[i].getProductCode();
            products[i][1] = Main.product[i].getProductName();
            products[i][2] = Main.product[i].getProductQuantity();
          
        }
   
        DefaultTableModel model = new DefaultTableModel(products, productFormat);
       
        productsTable.setModel(model);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadButton;
    private javax.swing.JTable productsTable;
    // End of variables declaration//GEN-END:variables
}

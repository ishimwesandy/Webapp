package rw.ac.store.gui;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import rw.ac.store.Domain.Category;
import rw.ac.store.Domain.Product;
import rw.ac.store.GenericDao.GenericDao;
import rw.ac.store.GenericDao.GenericDaoImpl;
import rw.ac.store.service.CategoryService;
import rw.ac.store.service.CategoryServiceImpl;
import rw.ac.store.service.ProductService;
import rw.ac.store.service.ProductServiceImpl;

/**
 *
 * @author steven
 */
public class AddProductForm extends javax.swing.JFrame {

     String path;
         Product pro=new Product();
    GenericDao dao=new GenericDaoImpl();
    CategoryService catser=new CategoryServiceImpl();
    ProductService proservice=new ProductServiceImpl();
    List<Category> cate;

    public AddProductForm() {
         try {
             
             initComponents();
             loadCategory();
             
            // gu.Addproduct();
         } catch (Exception ex) {
             Logger.getLogger(AddProductForm.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    } 
    
private void loadCategory(){
  
        try {
            cate = catser.getAllCategory();
            ComboBoxModel cbm = new DefaultComboBoxModel(cate.toArray());
           jcmbPro.setModel(cbm);
        } catch (Exception ex) {
            Logger.getLogger(AddProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    


}


//public ImageIcon ResizeImage( String imagePath,byte []pict){
//
//
//ImageIcon myImage=null;
//if(imagePath !=null){
//myImage=new ImageIcon(imagePath);
//}else{
//myImage=new ImageIcon(pict);
//}
//Image img=myImage.getImage();
//Image img2=img.getScaledInstance(LoaopicPro.getWidth() , LoaopicPro.getHeight(), Image.SCALE_SMOOTH);
//ImageIcon image=new ImageIcon(img2);
//return image;
//}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcmbPro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtAddPro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        qtyAddpro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PriceproAdd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descAddPro = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        LoaopicPro = new javax.swing.JLabel();
        attachPicPro = new javax.swing.JButton();
        cancelProAdd = new javax.swing.JButton();
        SaveProAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD PRODUCT");
        setMaximumSize(new java.awt.Dimension(2147487, 2147483));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setMaximumSize(new java.awt.Dimension(327, 327));

        jLabel1.setText("Category");

        jcmbPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcmbPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbProActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Quantity");

        qtyAddpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyAddproActionPerformed(evt);
            }
        });

        jLabel4.setText("Price");

        jLabel5.setText("Description");

        descAddPro.setColumns(20);
        descAddPro.setRows(5);
        jScrollPane1.setViewportView(descAddPro);

        jLabel6.setText("Picture");

        LoaopicPro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        attachPicPro.setText("Choose file");
        attachPicPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachPicProActionPerformed(evt);
            }
        });

        cancelProAdd.setText("Cancel");

        SaveProAdd.setText("Insert");
        SaveProAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveProAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcmbPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddPro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PriceproAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(qtyAddpro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cancelProAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SaveProAdd))
                            .addComponent(attachPicPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LoaopicPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbPro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddPro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qtyAddpro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PriceproAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoaopicPro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(attachPicPro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelProAdd)
                    .addComponent(SaveProAdd))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbProActionPerformed



    }//GEN-LAST:event_jcmbProActionPerformed

    private void attachPicProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachPicProActionPerformed
      JFileChooser choose=new JFileChooser();
      choose.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter ext=new FileNameExtensionFilter("*.image","jpg","png");
      
       choose.addChoosableFileFilter(ext);
       int res=choose.showOpenDialog(null);
       File selectFile=choose.getSelectedFile();
       String filename=selectFile.getName();

      if(res==JFileChooser.APPROVE_OPTION){
          FileInputStream picc=null;
          try {
              path = selectFile.getAbsolutePath();
              ImageIcon myImageIcon=new ImageIcon(path);
              Image img=myImageIcon.getImage();
              Image img2=img.getScaledInstance(LoaopicPro.getWidth() , LoaopicPro.getHeight(), Image.SCALE_SMOOTH);
              ImageIcon image=new ImageIcon(img2);
              LoaopicPro.setIcon(image);
              picc = new FileInputStream(path);
               StoreGui gu=new StoreGui();
              gu.Addproduct();
          } catch (FileNotFoundException ex) {
              Logger.getLogger(AddProductForm.class.getName()).log(Level.SEVERE, null, ex);
          } catch (Exception ex) {
              Logger.getLogger(AddProductForm.class.getName()).log(Level.SEVERE, null, ex);
          } finally {
              try {
                  picc.close();
              } catch (IOException ex) {
                  Logger.getLogger(AddProductForm.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
      }else{
          System.out.println("No file Selected");
      }  
        
    }//GEN-LAST:event_attachPicProActionPerformed

    private void SaveProAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveProAddActionPerformed
//        File file = new File("ImgPath");
//        byte[] pic = new byte[(int) file.length()];
try{
       
//            FileInputStream fileInputStream = new FileInputStream(file);
//            fileInputStream.read(bFile);
//            fileInputStream.close();
//        try {
//            try (InputStream img = new FileInputStream(file)) {
//                img.read(pic);
//            }

pro.setPic(path);
         pro.setCategory((Category) jcmbPro.getSelectedItem());
         pro.setPname(txtAddPro.getText());
         pro.setQty(Integer.parseInt(qtyAddpro.getText()));
         pro.setPrice(Integer.parseInt(PriceproAdd.getText()));
         pro.setDesc(descAddPro.getText());
            
          dao.create(pro);
            JOptionPane.showMessageDialog(null, "Product Saved");
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Product not Saved"+ex);
        }
        
        
        
    }//GEN-LAST:event_SaveProAddActionPerformed

    private void qtyAddproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyAddproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyAddproActionPerformed

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
            java.util.logging.Logger.getLogger(AddProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoaopicPro;
    private javax.swing.JTextField PriceproAdd;
    private javax.swing.JButton SaveProAdd;
    private javax.swing.JButton attachPicPro;
    private javax.swing.JButton cancelProAdd;
    private javax.swing.JTextArea descAddPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcmbPro;
    private javax.swing.JTextField qtyAddpro;
    private javax.swing.JTextField txtAddPro;
    // End of variables declaration//GEN-END:variables
}


package rw.ac.store.Domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Category category;
    @Column(name = "ProductNme" ,length = 70,unique = true)
    private String pname;
    @Column(length = 30,nullable = false)
    private int price;
    @Column( name = "Quantity",length = 20)
    private int qty;
    @Column(name = "Description")
    private String desc;
    @Lob
    @Column(name = "Product_Image")
 private String pic;
//     private javax.swing.JTable ProductTable;
//    GenericDaoImpl dao=new GenericDaoImpl();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Product() {
    }

    public Product(int id, Category category, String pname, int price, int qty, String desc, String pic) {
        this.id = id;
        this.category = category;
        this.pname = pname;
        this.price = price;
        this.qty = qty;
        this.desc = desc;
        this.pic = pic;
    }
  @Override
    public String toString() {
        return getPname();
    }
//public void Addproduct()throws Exception{
//      List<Product> dis=dao.getAll("Product");
//      String[] Header={"ID","Category","Name","Qty","Price","Description","Picture"};
//        Object[][] emd=new Object[dis.size()][7];
//        
//        int i=0;
//        double k=0;
//        for(Product proo : dis){
//             emd[i][0]=proo.getId();
//              emd[i][1]=proo.getCategory();
//            emd[i][2]=proo.getPname();
//               emd[i][3]=proo.getQty();
//                  emd[i][4]=proo.getPrice();
//                     emd[i][5]=proo.getDesc();
//                        emd[i][6]=proo.getPic();
//            
//           
//            i++;
//        }
//
//        ProductTable.setModel(new DefaultTableModel(emd, Header));
//}
}

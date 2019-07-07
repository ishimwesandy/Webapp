
package rw.ac.store.Domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderedDetails implements Serializable {
    
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@ManyToOne
    private OrderedMaterial ordermaterial;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderedMaterial getOrdermaterial() {
        return ordermaterial;
    }

    public void setOrdermaterial(OrderedMaterial ordermaterial) {
        this.ordermaterial = ordermaterial;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }
@ManyToOne

    private Product product;
   @Column(name = "Quantity",length = 30,nullable = false)
    private int Qty;
    
    
    
}


package rw.ac.store.Domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;



//@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)

@DiscriminatorColumn(name="TYPE",discriminatorType = DiscriminatorType.STRING)
@Entity
public class Person implements Serializable  {
    
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id; 
    @Column(unique = true,length = 70)
private String Email;
  @Column(unique = true,length = 13)   
private String phone;

    public Person() {
    }

    public Person(int id, String Email, String phone) {
        this.id = id;
        this.Email = Email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

  

 
    
    
}

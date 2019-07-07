
package rw.ac.store.Domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@PrimaryKeyJoinColumn(name = "UID")
@DiscriminatorValue(value = "User")
public class Euser extends Person implements Serializable{
      @Column(name = "Username",length = 100,nullable = false)
    private String uname;
        @Column(name = "Password",length = 100,nullable = false)
    private String pass;
          @Column(name = "FullName",length = 100,nullable = false)
    private String name;
                  @Column(name = "User_type",length = 100,nullable = false)
    private String uType ;

    public Euser() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getuType() {
        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType;
    }

    public Euser(String uname, String pass, String name) {
        this.uname = uname;
        this.pass = pass;
        this.name = name;
    }

    public Euser(String uname, String pass, String name, int id, String Email, String phone,String uType) {
        super(id, Email, phone);
        this.uname = uname;
        this.pass = pass;
        this.name = name;
         this.uType = uType;
    }

   
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.ac.store.Domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="TYPE")
//@discriminator-value="con_emp"
@PrimaryKeyJoinColumn(name = "CID")
@DiscriminatorValue(value = "Customer")
public class Customer extends Person implements Serializable  {
      @Column(name = "First_Name",length = 100,nullable = false)
    private String fname;
   @Column(name = "Last_Name",length = 100,nullable = false)
    private String lname;
      @Column(name = "Customer_Address",length = 100)
    private String Address;

    public Customer() {
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Customer(String fname, String lname, String Address) {
        this.fname = fname;
        this.lname = lname;
        this.Address = Address;
    }

    public Customer(String fname, String lname, String Address, int id, String Email, String phone) {
        super(id, Email, phone);
        this.fname = fname;
        this.lname = lname;
        this.Address = Address;
    }

   
}

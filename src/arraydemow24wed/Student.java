
package arraydemow24wed;

/**
 * Hello Thsi has been edited from remote
 * @author Ronak
 */
public class Student {
    private int sId;
    private String sname;
    private String Address;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    
    
    
    public Student(int sId, String sname) {
        this.sId = sId;
        this.sname = sname;
    }

    
        
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

   
    
}

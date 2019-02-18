package model;

public class Customer {

    private String name;
    private String address;
    private String email;
    private String phone;
    private boolean valid;
 
 
    /*
	 * @return name Customer name
	 * */
    public String getName() {
        return name;
    }
 
    /*
	 * @param name Customer name
	 * */
    public void setName(String name) {
        this.name = name;
    }
 
    /*
	 * @return email  Customer email
	 * */
    public String getEmail() {
        return email;
    }
 
    /*
	 * @param email  Customer email
	 * */
    public void setEmail(String email) {
        this.email = email;
    }
 

    /*
   	 * @return address  Customer address
   	 * */
    public String getAddress() {
        return address;
    }
 
    
    /*
   	 * @param address  Customer address
   	 * */
    public void setAddress(String address) {
        this.address = address;
    }
 
    /*
   	 * @return phone  Customer phone number
   	 * */
    public String getPhone() {
        return phone;
    }
 
    /*
   	 * @param phone  Customer phone number
   	 * */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    /*
   	 * @return "true" if Customer is valid else "false"
   	 * */
    public boolean isValid() {
        return valid;
    }
 
    /*
   	 * @param "true" if Customer is valid else "false"
   	 * */
    public void setValid(boolean valid) {
        this.valid = valid;
    }
 
}
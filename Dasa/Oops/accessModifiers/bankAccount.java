package Oops.accessModifiers;

class Account{
    public String name;
    protected String email;
    private String password;

    // getters & setters
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password=pass;
    }
}
public class bankAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name="HDFC";
        a1.email="sital@gmail.com";
        a1.setPassword("abcd");
        System.out.println(a1.getPassword());
    }

    
}

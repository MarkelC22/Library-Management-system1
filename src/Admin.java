public class Admin extends User {
    public Admin(String name) {
        super(name);
    }

    public Admin(String name, String email, String phonenumber) {
        super(name, email, phonenumber);
    }
    @Override
    public void menu(){
        System.out.println("Here, Admin options will be printed");
    }
}

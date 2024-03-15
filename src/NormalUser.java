public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
    }
    public NormalUser(String name, String email, String phonenumber) {
        super(name, email, phonenumber);
}
@Override
public void menu(){
    System.out.println("Here, Normal User options will be printed")
    }
}


import java.util.Scanner;

public class CalculateFine implements IOOperation{
    @Override
    public void oper(Database database, User user){

        System.out.println("Enter book name:");
        Scanner s = new Scanner(System.in);
        String bookname = s.next();

        for (Borrowing b : database.getbrw()){
            if(b.getBook().getName().matches(bookname) && b.getUser().getName().matches(user.getName())){
                if (b.getDaysleft()<0){
                    System.out.println("You are late"
                    + "You have to pay"+Math.abs(b.getDaysleft()*50)+"as fine");
                }else{
                    System.out.println("You don't have to pay a fine\n");
                }
            }
        }
        user.menu(database, user);

    }
}

import java.util.ArrayList;

public class ViewBooks implements IOOperation{
    @Override
    public void oper(Database database, User user){
       ArrayList<Book> books = database.getAllBooks();
       System.out.println("Name\t\tAuthor\tPublisher\tCLA\tQty\tPrice" + "\tBrw cps");
       for (Book b : books){
           System.out.println(b.getName()+"\t\t" +b.getAuthor()+"\t\t" +b.getPublisher()+"\t" +b.getAddress()+"\t"
           +"\t" +b.getQty()+ "\t" +b.getPrice()+ "\t" +b.getBrwcopies());
       }
       System.out.println();
       user.menu(database, user);


    }
}


public class Client
{
   public static void main(String[] args)
   {
      TaxVisitor calculateTax = new TaxVisitor();
      
      SmartPhone smart = new SmartPhone(10);
      Printer peter = new Printer(60);
      NoteBook book = new NoteBook(75.95);
      
      System.out.println(peter.accept(calculateTax));
      System.out.println(smart.accept(calculateTax));
      System.out.println(book.accept(calculateTax));
   }

}

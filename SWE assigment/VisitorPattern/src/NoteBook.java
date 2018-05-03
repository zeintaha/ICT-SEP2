
public class NoteBook implements Visitable
{
   private String color;
   private double price;
   
   public NoteBook(double price) {
      this.price = price;
   }
   
   public double getPrice() {
      return price;
   }

   public String getColor() {
      return color;
      
   }

   @Override
   public double accept(Visitor visitor)
   {
      return visitor.visit(this);   
      
   }

}

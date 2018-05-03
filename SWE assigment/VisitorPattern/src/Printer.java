
public class Printer implements Visitable
{
   private String color;
   private double price;
   
   public Printer(double price) {
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

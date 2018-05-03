
public class SmartPhone  implements Visitable
{
   private String color;
   private double price;
   
   
   public SmartPhone(double price) {
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

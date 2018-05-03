public class TaxVisitor implements Visitor
{

  
   public double visit(Printer obj)
   {
System.out.println(" Printer Item price after tax " );
   return obj.getPrice() * 0.35 +  obj.getPrice() ;
   }

  
   public double visit(SmartPhone obj)
   {
      System.out.println(" SmartPhone Item price after tax " );
      return obj.getPrice() * 0.60 + obj.getPrice()  ;
   }

   @Override
   public double visit(NoteBook obj)
   {
      System.out.println(" NoteBook Item price after tax " );
      return obj.getPrice() * 0 + obj.getPrice() ;
   }

}
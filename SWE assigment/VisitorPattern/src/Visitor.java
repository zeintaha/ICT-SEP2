
public interface Visitor
{
   public double visit(Printer obj);

   // visit other concrete items
   public double visit(SmartPhone obj);

   public double visit(NoteBook obj);

}

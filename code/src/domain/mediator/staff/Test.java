package domain.mediator.staff;

import java.io.IOException;

public class Test
{
public static void main(String[] args) throws ClassNotFoundException, IOException
{
   StaffDatabase test = new StaffDatabase();
   
   test.load();
}
}

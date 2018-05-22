package domain.mediator.staff;

import java.io.IOException;

import domain.model.staff.*;

public class Test
{
public static void main(String[] args) throws ClassNotFoundException, IOException
{
   StaffDatabase test = new StaffDatabase();
   
   test.load();
}
}

package domain.model.staff;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class testDoctor
{
   private Type type;
   @Before
   public void setUp() throws Exception
   {
      Calendar calendar = new GregorianCalendar(1987, 9, 5);
      Date dob = new GregorianCalendar(2017, Calendar.SEPTEMBER, 5).getTime();
      Date startdate = calendar.getTime();
      Doctor doctor = new Doctor("AlexV", "12345", "Alexandru", "Vieru", 4567,
            dob, startdate, "23456709", "alex@gmail.com", 'M');
   }

   @Test
   public void testGetType()
   {
      Calendar calendar = new GregorianCalendar(1987, 9, 5);
      Date dob = new GregorianCalendar(2017, Calendar.SEPTEMBER, 5).getTime();
      Date startdate = calendar.getTime();
      Doctor doctor = new Doctor("AlexV", "12345", "Alexandru", "Vieru", 4567,
            dob,  startdate, "23456709", "alex@gmail.com", 'M');
      assertEquals(type.Doctor,doctor.getType() );
   

   }

}

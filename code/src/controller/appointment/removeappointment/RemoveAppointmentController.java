package controller.appointment.removeappointment;

import domain.mediator.appointment.AppointmentModel;
import view.secretary.appointment.removeappointment.RemoveAppointment;

public class RemoveAppointmentController
{
   private AppointmentModel model;
   private RemoveAppointment view;

   public RemoveAppointmentController(AppointmentModel model,
         RemoveAppointment view)
   {
      this.model = model;
      this.view = view;

   }

   public void executes()
   {

   }
}

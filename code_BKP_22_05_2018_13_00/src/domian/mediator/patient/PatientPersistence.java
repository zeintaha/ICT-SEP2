package domian.mediator.patient;
import java.io.IOException;

import domain.model.patient.Patient;
import domain.model.patient.PatientList;

public interface PatientPersistence
{
   public PatientList load() throws IOException;
   public void save(Patient patient) throws IOException;
//   public void remove(Patient patient) throws IOException;
}

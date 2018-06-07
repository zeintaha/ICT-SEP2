package domain.mediator.patient;
import java.io.IOException;

import domain.model.patient.Patient;
import domain.model.patient.PatientList;

public interface PatientPersistence
{
   public PatientList load(String name) throws IOException;
   public void save(Patient patient) throws IOException;
   public void remove(Patient patient) throws IOException;
   public void updatePatient(Patient patien) throws IOException;
}

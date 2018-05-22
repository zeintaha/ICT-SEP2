package domain;

import java.io.IOException;

import domain.mediator.staff.StaffClinicModel;
import domain.mediator.staff.StaffClinicModelManeger;

public class Facad
{
private StaffClinicModel staffClinicModel;

public Facad() throws ClassNotFoundException, IOException {
   staffClinicModel = new StaffClinicModelManeger();
}
}

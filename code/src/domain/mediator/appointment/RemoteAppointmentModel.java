package domain.mediator.appointment;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

import domain.model.patient.Appointment;
import domain.model.patient.AppointmentList;

public interface RemoteAppointmentModel extends Remote {
    public ArrayList<Appointment> getAll() throws RemoteException;

    public AppointmentList getAllFreeAppointment() throws RemoteException;

    public void AddAppointment(Date date, String brief, int patientId, int dateId) throws RemoteException;

    public void removeAppointmentById(int id) throws RemoteException;

    public ArrayList<Appointment> getAppotmenttByDate(Date date) throws RemoteException;

    public int getDateId(Date date) throws RemoteException;

}
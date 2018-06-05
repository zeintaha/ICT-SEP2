package view.secretary.appointment.removeappointment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import controller.appointment.addappointment.SearchPatientController;
import controller.appointment.removeappointment.RemoveAppointmentController;
import domain.model.patient.Appointment;
import view.secretary.appointment.addappointment.AddAppointmentButtonHandler;

import javax.swing.border.BevelBorder;

public class RemoveAppointmentGUI extends JFrame implements RemoveAppointment {

	private JPanel contentPane;
	private JTable table;
	private RemoveAppointmentController removeAppointmentController;
	private RemoveAppointmentButtonHandler listener;
	private JButton btnRemove;
	private JComboBox comboBox;
	private JButton btnSearchAppointments;

	/**
	 * Create the frame.
	 */
	public RemoveAppointmentGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 602, 32);
		contentPane.add(panel);
		panel.setLayout(null);

		this.btnSearchAppointments = new JButton("List All Appointments");
		btnSearchAppointments.setBounds(0, 0, 150, 23);
		panel.add(btnSearchAppointments);

		this.comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(100);
		comboBox.setToolTipText("");
		comboBox.setBounds(549, 3, 43, 20);
		panel.add(comboBox);

		JLabel lblSelectAppointmentId = new JLabel("Select Appointment id : ");
		lblSelectAppointmentId.setBounds(416, 6, 176, 14);
		panel.add(lblSelectAppointmentId);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBounds(5, 48, 592, 214);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setBounds(29, 151, 546, 71);
		scrollPane.setViewportView(table);

		this.btnRemove = new JButton("Remove the Selected Appointment");
		btnRemove.setBounds(418, 273, 189, 23);
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnRemove);
	}

	@Override
	public void start(RemoveAppointmentController removeAppointmentController) {

		this.removeAppointmentController = removeAppointmentController;
		this.listener = new RemoveAppointmentButtonHandler(this.removeAppointmentController);

		if (this.btnSearchAppointments != null) {

			btnSearchAppointments.addActionListener(listener);
		}

		// now the next button

		btnRemove.addActionListener(listener);

		this.setVisible(true);

	}

	@Override
	public void showTable(ArrayList<Appointment> appointments) {

	}

	@Override
	public void setComboboxValue(int[] ides) {
		for (int i = 0; i < ides.length; i++) {
			comboBox.addItem(ides[i]);
		}
	}

	@Override
	public int getSelectedItemFromBox() {
		int id = 0;
		id = (int) comboBox.getSelectedItem();

		return id;
	}
}

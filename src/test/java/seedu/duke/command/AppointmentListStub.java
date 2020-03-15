package seedu.duke.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AppointmentListStub {

    private static List<AppointmentStub> appointmentList = new ArrayList<>();

    public static  List<AppointmentStub> getAppointmentList() {
        return appointmentList;
    }


    public static int getTotalAppointments() {
        return appointmentList.size();
    }

    public static void createList(int choice) {
        if (choice == 1) {
            AppointmentStub newAppointment1 = new AppointmentStub("s;dlskd;l", "Li");
            AppointmentStub newAppointment2 = new AppointmentStub(" ", " ");
            AppointmentStub newAppointment3 = new AppointmentStub("ewuioaiwoe", "Lo");
            AppointmentStub newAppointment4 = new AppointmentStub("aeiwae", "to");
            AppointmentStub newAppointment5 = new AppointmentStub("LSDs", "Lis");
            appointmentList.add(newAppointment1);
            appointmentList.add(newAppointment2);
            appointmentList.add(newAppointment3);
            appointmentList.add(newAppointment4);
            appointmentList.add(newAppointment5);
        }
    }
}
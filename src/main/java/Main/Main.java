package Main;

import Repository.CenterRepository;
import Repository.UserRepository;
import Services.BookingService;
import Services.CenterService;
import Services.UserService;

import static enums.Gender.MALE;

public class Main {
    public static void main(String[] args) {

        CenterService cService = new CenterService(new CenterRepository());
        UserService uService = new UserService(new UserRepository());

        BookingService service = new BookingService(cService, uService);

        service.onboardUser("U1","Harry",MALE,35,"Karnataka", "Bangalore");
        service.onboardUser("U2","Ron",MALE,30,"Karnataka", "Bangalore");
        service.onboardUser("U3","Albus",MALE,30,"Karnataka", "Bangalore");
        service.onboardUser("U4","Dracco",MALE,15,"Karnataka", "Bangalore");
        service.onboardUser("U5","Droby",MALE,30,"Gujarat", "Surat");

        service.addCenter("Karnataka", "Bangalore", "VC1");
        service.addCenter("Karnataka", "Bangalore", "VC2");
        service.addCenter("Karnataka", "Mysore", "VC3");


        service.addCapacity("VC1",1,1);
        service.addCapacity("VC2",1,3);
        service.addCapacity("VC1",5,10);
        service.addCapacity("VC3",3,4);

        service.listCenters("Bangalore");

        service.bookVaccination("BK1", "VC1",1,"U1");

        service.listAllBookingsForCenterAndDay("VC1",1);

        service.bookVaccination("BK2", "VC2",1,"U2");
        service.bookVaccination("BK3", "VC2",1,"U3");

        service.listAllBookingsForCenterAndDay("VC2",1);

        service.bookVaccination("BK4", "VC1",1,"U5");


    }
}
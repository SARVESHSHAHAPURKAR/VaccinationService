package Services;

import Exceptions.CenterDoesNotExistException;
import Models.Booking;
import Models.Center;
import Repository.CenterRepository;

import java.util.Map;

public class CenterService {

    private CenterRepository repository;

    public CenterService(CenterRepository repository) {
        this.repository = repository;
    }

    public CenterRepository getRepository() {
        return repository;
    }

    public void setRepository(CenterRepository repository) {
        this.repository = repository;
    }

    public void addCenter(String state, String district, String name) {

        Center center = new Center(state,district,name);
        repository.add(center);
    }

    public void addCapacity(String centerName, int day, int capacity) {
        repository.addCapacity(centerName,day,capacity);
    }

    public void listCenters(String district) {
        for(Center center: repository.getDistrictWiseCenters().get(district)){
            for(Map.Entry<Integer, Integer> entrySet : center.getDayToCapacity().entrySet()){
                System.out.println(center.getName()+" "+entrySet.getKey()+" "+entrySet.getValue());
            }
        }
    }

    public void listAllBookingsForCenterDay(String name, int day) {

        Center center = repository.getCenters().get(name);

        if(center==null){
            throw new CenterDoesNotExistException();
        }

        for(Map.Entry<String, Booking> entry : center.getBookings().entrySet()){

            Booking booking = entry.getValue();

            if(booking.getDay()==day){
                System.out.println(booking.getId()+" "+booking.getUserName()+" "+booking.getCenterName()+" "+repository.getCenters().get(booking.getCenterName()).getDistrict());
            }
        }
    }
}

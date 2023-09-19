package Repository;

import Exceptions.CenterDoesNotExistException;
import Models.Center;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CenterRepository {

    Map<String, Center> centers;
    Map<String, List<Center>> districtWiseCenters;

    public CenterRepository() {
        this.centers = new HashMap<>();
        this.districtWiseCenters = new HashMap<>();
    }

    public void add(Center center) {

        centers.put(center.getName(), center);
        List<Center> districtCenters = districtWiseCenters.getOrDefault(center.getDistrict(),new ArrayList<>());
        districtCenters.add(center);
        districtWiseCenters.put(center.getDistrict(),districtCenters);

        System.out.println("Center added with name "+center.getName()+" in state "+center.getState()+"" +
                " in district "+center.getDistrict());
    }

    public void addCapacity(String centerName, int day, int capacity) {

        Center center = centers.get(centerName);

        if(center==null){
            throw new CenterDoesNotExistException();
        }

        center.getDayToCapacity().put(day,capacity);
        System.out.println("Capacity added for center "+centerName+" "+day+" "+capacity);
    }

    public Map<String, Center> getCenters() {
        return centers;
    }

    public void setCenters(Map<String, Center> centers) {
        this.centers = centers;
    }

    public Map<String, List<Center>> getDistrictWiseCenters() {
        return districtWiseCenters;
    }

    public void setDistrictWiseCenters(Map<String, List<Center>> districtWiseCenters) {
        this.districtWiseCenters = districtWiseCenters;
    }
}

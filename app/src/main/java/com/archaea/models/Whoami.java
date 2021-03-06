package com.archaea.models;

import java.util.ArrayList;

/**
 * Created by vizsatiz on 18-12-2016.
 */
public class Whoami {

    private User currentUser;
    private ArrayList<Vehicle> vehicles;
    private static Whoami whoami = new Whoami();

    private Whoami(){
        this.vehicles = new ArrayList<>();
    }

    public static Whoami getInstance() {
        if (whoami == null) {
            return new Whoami();
        }
        return whoami;
    }
    public User getCurrentUser() {
        return currentUser;
    }


    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<String> getVehicleNameList() {
        ArrayList<String> vehicleNames = new ArrayList<>();
        for (Vehicle vehicle: vehicles) {
            vehicleNames.add(vehicle.getVehicleRegistrationNo());
        }
        return vehicleNames;
    }
}

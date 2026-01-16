package com.mirkamol.exercise;

public class House {
   private HouseType houseType;
   private int numberOfRoofs;
   private int numberOfRooms;
   private boolean isAvailableGarden;
   private Address address;

    public House(HouseType houseType, int numberOfRoofs, int numberOfRooms, boolean isAvailableGarden, Address address) {
        this.houseType = houseType;
        this.numberOfRoofs = numberOfRoofs;
        this.numberOfRooms = numberOfRooms;
        this.isAvailableGarden = isAvailableGarden;
        this.address = address;
    }

    public House() {
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public int getNumberOfRoofs() {
        return numberOfRoofs;
    }

    public void setNumberOfRoofs(int numberOfRoofs) {
        this.numberOfRoofs = numberOfRoofs;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean isAvailableGarden() {
        return isAvailableGarden;
    }

    public void setAvailableGarden(boolean availableGarden) {
        isAvailableGarden = availableGarden;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseType='" + houseType + '\'' +
                ", numberOfRoofs=" + numberOfRoofs +
                ", numberOfRooms=" + numberOfRooms +
                ", isAvailableGarden=" + isAvailableGarden +
                ", address=" + address +
                '}';
    }
}


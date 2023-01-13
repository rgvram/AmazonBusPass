package information;

public class Bus {
    private int busID;
    private int routId;
    private int busType;
    private int avilibility;
    private int timing;
    private String busNo;

    public Bus(int busID, int avilibility, int busType, String busNo) {
        this.busID = busID;
        this.busType = busType;
        this.avilibility = avilibility;
        this.busNo = busNo;
    }

    public int getBusID() {
        return busID;
    }

    public int getRoutId() {
        return routId;
    }

    public int getBusType() {
        return busType;
    }

    public int getAvilibility() {
        return avilibility;
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing){
        this.timing = timing;
    }

    public String getBusNo() {
        return busNo;
    }
}

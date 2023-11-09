package managerstudent;

public class Stationery {
    private int stationeryId;
    private String stationeryName;
    private String availableMountOf;

    public Stationery(int stationeryId, String stationeryName, String availableMountOf) {
        this.stationeryId = stationeryId;
        this.stationeryName = stationeryName;
        this.availableMountOf = availableMountOf;
    }

    public int getStationeryId() {
        return stationeryId;
    }

    public void setStationeryId(int stationeryId) {
        this.stationeryId = stationeryId;
    }

    public String getStationeryName() {
        return stationeryName;
    }

    public void setStationeryName(String stationeryName) {
        this.stationeryName = stationeryName;
    }

    public String getAvailableMountOf() {
        return availableMountOf;
    }

    public void setAvailableMountOf(String availableMountOf) {
        this.availableMountOf = availableMountOf;
    }

    public void addStationery(){

    }

    public void deleteStationery(){

    }

    public void checkAvailableMountOf(){

    }
}

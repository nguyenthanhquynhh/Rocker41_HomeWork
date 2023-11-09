package managerstudent;

public class TableChair {
    private int tableChairId;
    private String descibe;
    private String lacation;

    public TableChair(int tableChairId, String descibe, String lacation) {
        this.tableChairId = tableChairId;
        this.descibe = descibe;
        this.lacation = lacation;
    }

    public int getTableChairId() {
        return tableChairId;
    }

    public void setTableChairId(int tableChairId) {
        this.tableChairId = tableChairId;
    }

    public String getDescibe() {
        return descibe;
    }

    public void setDescibe(String descibe) {
        this.descibe = descibe;
    }

    public String getLacation() {
        return lacation;
    }

    public void setLacation(String lacation) {
        this.lacation = lacation;
    }

    public void setLocation(){

    }

    public void moveLocation(){

    }

    public void checkTaChairEmpty(){

    }


}

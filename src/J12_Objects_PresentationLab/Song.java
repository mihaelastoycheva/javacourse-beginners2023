package J12_Objects_PresentationLab;

public class Song {
    private String typeList;
    private String name;
    private String time;

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTypeList() {
        return typeList;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    Song (String typeList, String name, String time){
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }
}

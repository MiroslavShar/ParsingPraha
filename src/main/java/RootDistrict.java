import java.util.List;

public class RootDistrict {

    private  String name;
    private List<SpisokEdge> spisokDistrict;

    public String getName(){return getName();
    }

    public List<SpisokEdge> getSpisokDistrict() {
        return spisokDistrict;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpisokDistrict(List<SpisokEdge> spisokDistrict) {
        this.spisokDistrict = spisokDistrict;
    }

    public String toString() {
        return "{" +
                "Spisok= " + name + '\'' +
                ", Okres= " + spisokDistrict +
                '}';
    }
}

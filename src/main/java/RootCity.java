import java.util.List;

public class RootCity {

    private String name;
    private List<SpisokEdge> spisokCity;

    public List<SpisokEdge> getSpisokCity() {
        return spisokCity;
    }

    public String getName() {
        return name;
    }

    public void setSpisokCity(List<SpisokEdge> spisokCity) {
        this.spisokCity = spisokCity;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "Spisok= " + name + '\'' +
                "Gorod, = " + spisokCity +
                '}';
    }
}

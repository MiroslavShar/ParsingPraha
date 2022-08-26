import java.util.List;

public class Root {

    private String name;
    private List<SpisokEdge>spisok;

    public String getName() {
        return getName();
    }

    public List<SpisokEdge> getSpisok() {
        return spisok;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpisok(List<SpisokEdge> spisok) {
        this.spisok = spisok;
    }

    @Override
    public String toString() {
        return "{" +
                "Spisok= " + name + '\'' +
                ", Kraj= " + spisok +
                '}';
    }
}

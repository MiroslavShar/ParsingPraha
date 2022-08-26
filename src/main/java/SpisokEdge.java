public class SpisokEdge {
    private Integer id;
    private Integer ruian_code;
    private Integer country;
    private String edge;
    private Integer lat;
    private Integer lon;
    private Integer point;

    public SpisokEdge(Integer id, Integer ruian_code, String edge,Integer country, Integer lat, Integer lon, Integer point) {
        this.id = id;
        this.ruian_code = ruian_code;
        this.edge = edge;
        this.country = country;
        this.lat = lat;
        this.point = point;
    }



    public Integer getId() {
        return id;
    }

    public Integer getRuian_code() {
        return ruian_code;
    }

    public String getEdge() {
        return edge;
    }

    public Integer getCountry() {
        return country;
    }

    public Integer getLat() {
        return lat;
    }

    public Integer getLon() {
        return lon;
    }

    public Integer getPoint() {
        return point;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRuian_code(Integer ruian_code) {
        this.ruian_code = ruian_code;
    }

    public void setEdge(String edge) {
        this.edge = edge;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    public void setLon(Integer lon) {
        this.lon = lon;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Kraj{" +
                "id='" + id + '\'' +
                ", ruian_code='" + ruian_code  + '\'' +
                ", edge='" + edge  + '\'' +
                ", country='" + country  + '\'' +
                ", lat='" + lat  + '\'' +
                ", lon='" + lon  + '\'' +
                ", point='" + point + '\''  +
                '}';
    }
}

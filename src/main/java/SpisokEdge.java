public class SpisokEdge {
    public Integer id;
    private Integer ruian_code;
    private Integer country;
    private String edge;
    private Integer lat;
    private Integer lon;
    private Integer point;
    private String district;
    private Integer edge_id;
    private String city;
    private Integer district_id;

    public SpisokEdge(Integer id, Integer ruian_code, String edge,Integer country, Integer lat, Integer lon, Integer point, Integer edge_id, String district, String city, Integer district_id) {
        this.id = id;
        this.ruian_code = ruian_code;
        this.edge = edge;
        this.country = country;
        this.lat = lat;
        this.point = point;
        this.edge_id = edge_id;
        this.district = district;
        this.city = city;
        this.district_id = district_id;
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

    public Integer getEdge_id() {
        return edge_id;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    public Integer getDistrict_id() {
        return district_id;
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

    public void setEdge_id(Integer edge_id) {
        this.edge_id = edge_id;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict_id(Integer district_id) {
        this.district_id = district_id;
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
                ", district='" + district + '\''  +
                ", edge_id='" + edge_id + '\''  +
                ", district_id='" + district_id + '\''  +
                ", city='" + city + '\''  +
                '}';
    }
}

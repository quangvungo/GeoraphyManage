package Model;

public class EastAsiaCountries extends  Country implements Comparable<EastAsiaCountries> {
    private String countryTerrain;

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    @Override
    public String toString() {
        return "EastAsiaCountries{" +
                "countryTerrain='" + countryTerrain + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", totalArea=" + totalArea +
                '}';
    }

    public int compareTo(EastAsiaCountries other) {
        return Character.compare(this.countryName.charAt(0), other.countryName.charAt(0));
    }

}

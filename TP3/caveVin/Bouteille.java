public class Bouteille {
    private String region;
    private String appellation;
    private int millesime;

    public Bouteille(String region, String appellation, int millesime) {
        this.region = region;
        this.appellation = appellation;
        this.millesime = millesime;
    }

    public String getRegion() {
        return this.region;
    }

    public String getAppellation() {
        return this.appellation;
    }

    public int getMillesime() {
        return this.millesime;
    }



}

public class Property {
    private String propertyName;
    private String city;
    private double rentalAmount;
    private String owner;
    private Plot plot;

    public Property(String propertyName, String city, double rentalAmount, String owner, int x, int y, int width, int depth) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentalAmount = rentalAmount;
        this.owner = owner;
        this.plot = new Plot(x, y, width, depth);

    }

	public String getOwner(){
		return owner;
	}

	public String getCity(){
		return city;
	}

    public String getPropertyName() {
        return propertyName;
    }

    public double getRentAmount() {
        return rentalAmount;
    }

    public Plot getPlot() {
        return plot;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    public String toString() {
        return propertyName + "," + city + "," + owner + "," + rentalAmount;
    }
}
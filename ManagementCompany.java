public class ManagementCompany {
    private String name;
    private String taxID;
    private double managementFee;
    private Property[] properties;
    private int numberOfProperties;
    private Plot plot;
    public final int MAX_PROPERTY = 5;
	public final int MGMT_WIDTH= 10;
	public final int MGMT_DEPTH= 10;


    public ManagementCompany() {
        this.name = "";
        this.taxID = "";
        this.managementFee = 0;
        this.properties = new Property[MAX_PROPERTY];
        this.numberOfProperties = 0;
        this.plot = new Plot(0, 0, 10, 10);
    }

    public ManagementCompany(String name, String taxID, double managementFee) {
        this.name = name;
        this.taxID = taxID;
        this.managementFee = managementFee;
        this.properties = new Property[MAX_PROPERTY];
        this.numberOfProperties = 0;
        this.plot = new Plot(10, 10, 10, 10);
    }

    public String getName(){
        return this.name;
    }

    public Plot getPlot(){
        return this.plot;
    }

    public int addProperty(Property property) {
        if (numberOfProperties >= properties.length) {
            return -1;
        }
        if (property == null) {
            return -2;
        }
        if (!plot.encompass(property.getPlot())) {
            return -3;
        }
        for (Property prop : properties) {
            if (prop!= null && prop.getPlot().overlaps(property.getPlot())) {
                return -4;
            }
        }
        properties[numberOfProperties] = property;
        numberOfProperties++;
        return numberOfProperties - 1;
    }

    public double getTotalRent() {
        double totalRent = 0;
        for (Property property : properties) {
            if (property!= null) {
                totalRent += property.getRentAmount();
            }
        }
        return totalRent;
    }

    public Property getHighestRentPropperty() {
        Property highestRentProperty = null;
        double highestRent = 0;
        for (Property property : properties) {
            if (property!= null && property.getRentAmount() > highestRent) {
                highestRent = property.getRentAmount();
                highestRentProperty = property;
            }
        }
        return highestRentProperty;
    }

    public void removeLastProperty() {
        if (numberOfProperties > 0) {
            properties[numberOfProperties - 1] = null;
            numberOfProperties--;
        }
    }

    public boolean isPropertiesFull() {
        return numberOfProperties >= properties.length;
    }

    public int getPropertiesCount() {
        return numberOfProperties;
    }

    public boolean isManagementFeeValid() {
        return managementFee >= 0 && managementFee <= 100;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("List of the properties for " + name + ", taxID: " + taxID + "\n");
        sb.append("______________________________________________________\n");
        for (int i = 0; i < numberOfProperties; i++) {
            if (properties[i]!= null) {
                sb.append(properties[i].toString() + "\n");
            }
        }
        sb.append("______________________________________________________\n");
        sb.append("\n total management Fee: " + getTotalManagementFee());
        return sb.toString();
    }

    private double getTotalManagementFee() {
        double totalManagementFee = 0;
        for (Property property : properties) {
            if (property!= null) {
                totalManagementFee += property.getRentAmount() * managementFee / 100;
            }
        }
        return totalManagementFee;
    }
}
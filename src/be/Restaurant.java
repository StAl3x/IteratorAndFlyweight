package be;

public class Restaurant {
    private String name;
    private int xCoordinate;
    private int yCoordinate;
    private double rating;
    private double busyRate;
    private String cuisine;

    public Restaurant(String name, int xCoordinate, int yCoordinate, double rating, double busyRate, String cuisine) {
        this.name = name;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.rating = rating;
        this.busyRate = busyRate;
        this.cuisine = cuisine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getBusyRate() {
        return busyRate;
    }

    public void setBusyRate(double busyRate) {
        this.busyRate = busyRate;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    @Override
    public String toString(){
        return name+ "       " + rating+ "/10       " + busyRate+"/10       " + cuisine;
    }
}

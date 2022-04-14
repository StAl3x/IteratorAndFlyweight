package dal;

import be.Restaurant;

import java.util.List;

public class MockData {
    private List<Restaurant> allRestaurants;
    private Restaurant restaurant1;
    private Restaurant restaurant2;
    private Restaurant restaurant3;
    private Restaurant restaurant4;
    private Restaurant restaurant5;
    private Restaurant restaurant6;
    private Restaurant restaurant7;
    private Restaurant restaurant8;
    private Restaurant restaurant9;
    private Restaurant restaurant10;

    public void initMockData() {
        restaurant1 = new Restaurant("Phos", 40, 20, 7.5, 9, "Korean");
        restaurant2 = new Restaurant("Lorenzo", 150, 100, 9.8, 10, "Italian");
        restaurant3 = new Restaurant("BurgeRista", 20, 180, 6.6, 7, "Burgers");
        restaurant4 = new Restaurant("Schnitzel Boutique", 190, 50, 8.4, 5, "Austrian");
        restaurant5 = new Restaurant("Grand cock", 75, 75, 4, 3.6, "French");
        restaurant6 = new Restaurant("Sitting dane", 170, 145, 5.9, 9.2, "Danish");
        restaurant7 = new Restaurant("Thick Lángos", 135, 88, 9.8, 6.9, "Hungarian");
        restaurant8 = new Restaurant("Alimento", 90, 125, 7.2, 7.2, "Spanish");
        restaurant9 = new Restaurant("Hrana", 188, 146, 3.2, 2.9, "Croatian");
        restaurant10 = new Restaurant("Pivo", 55, 89, 4.7, 9.8, "Czech");
        allRestaurants.add(restaurant1);
        allRestaurants.add(restaurant2);
        allRestaurants.add(restaurant3);
        allRestaurants.add(restaurant4);
        allRestaurants.add(restaurant5);
        allRestaurants.add(restaurant6);
        allRestaurants.add(restaurant7);
        allRestaurants.add(restaurant8);
        allRestaurants.add(restaurant9);
        allRestaurants.add(restaurant10);

    }

    public List<Restaurant> getAllRestaurants(){
        return this.allRestaurants;
    }

}

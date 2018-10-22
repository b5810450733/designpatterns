package Lab9.Section4;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {

    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();
    private int totalSeat;

    public PackageTour(String packageName) {
        this.packageName = packageName;
    }

    public void newTour(Tour tour){
        this.tours.add(tour);
        this.totalSeat = this.tours.get(0).getAvailableSeats();
    }

    public void cancelTour(Tour tour){
        this.tours.remove(tour);
    }

    @Override
    public String getName() {
        return this.packageName;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Tour t : tours)
            total += t.getPrice();
        return total*0.9;
    }

    @Override
    public int getAvailableSeats() {
        for (Tour i:tours) {
            if (i.getAvailableSeats() < this.totalSeat){
                this.totalSeat = i.getAvailableSeats();
            }
        }
        return this.totalSeat;
    }
}

package Lab9.Section4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageTourTest {
    PackageTour USA = new PackageTour("USA");
    SingleTour California;
    SingleTour NewYork;
    SingleTour Vegas;

    @BeforeEach
    void setUp() {
        California = new SingleTour("California",80000,15,6);
        NewYork = new SingleTour("NewYork",120000,10,6);
        Vegas = new SingleTour("Vegas",200000,10,6);
        USA.newTour(California);
        USA.newTour(NewYork);
        USA.newTour(Vegas);
    }

    @Test
    void newTour() {
        SingleTour Florida = new SingleTour("Florida",100000,10,6);
        assertEquals(3,USA.allTour());
        USA.newTour(Florida);
        assertEquals(4,USA.allTour());
    }

    @Test
    void cancelTour() {
        assertEquals(3,USA.allTour());
        USA.cancelTour(Vegas);
        assertEquals(2,USA.allTour());
    }

    @Test
    void getName() {
        assertEquals("USA",USA.getName());
    }

    @Test
    void getPrice() {
        assertEquals(360000,USA.getPrice());
    }

    @Test
    void getAvailableSeats() {
        assertEquals(4,USA.getAvailableSeats());

    }
}
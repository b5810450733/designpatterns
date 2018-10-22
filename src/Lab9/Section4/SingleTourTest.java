package Lab9.Section4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleTourTest {
    protected SingleTour tourPhuket;

    @BeforeEach
    void initialize(){
        tourPhuket = new SingleTour("Phuket",15000,20,8);
    }


    @Test
    void setName() {
        assertEquals("Phuket",tourPhuket.getName());
        tourPhuket.setName("Tour Phuket");
        assertEquals("Tour Phuket",tourPhuket.getName());
    }

    @Test
    void setPrice() {
        assertEquals(15000,tourPhuket.getPrice());
        tourPhuket.setPrice(20000);
        assertEquals(20000,tourPhuket.getPrice());
    }

    @Test
    void setAllSeats() {
        assertEquals(12,tourPhuket.getAvailableSeats());
        tourPhuket.setAllSeats(30);
        assertEquals(22,tourPhuket.getAvailableSeats());

    }

    @Test
    void setReservedSeats() {
        assertEquals(12,tourPhuket.getAvailableSeats());
        tourPhuket.setReservedSeats(15);
        assertEquals(5,tourPhuket.getAvailableSeats());
    }



    @Test
    void getName() {
        assertEquals("Phuket",tourPhuket.getName());
    }

    @Test
    void getPrice() {
        assertEquals(15000,tourPhuket.getPrice());
    }

    @Test
    void getAvailableSeats() {
        assertEquals(12,tourPhuket.getAvailableSeats());
    }
}
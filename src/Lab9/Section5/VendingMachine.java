package Lab9.Section5;

import java.util.ArrayList;

public class VendingMachine {
    final static int READY = 0;
    final static int PROCEED = 1;
    final static int SUCCESS = 2;

    int nowState;
    int cost;
    int nowCost;

    protected ArrayList<Station> Station = new ArrayList<>();
    protected Station stationSelect;
    protected Station stationCurrent;

    public VendingMachine(Station stationCurrent,int costOfcurrent) {
        this.nowState = READY;
        this.stationCurrent = stationCurrent;
        this.cost = costOfcurrent;
        System.out.println("Current Station is : "+stationCurrent);
    }

    public void addStation(Station station){
        Station.add(station);
    }

    public void removeStation(Station station){
        Station.remove(station);
    }

    public void selectStation(String nameStation){
        if (nowState == READY){
            for (Station i :Station) {
                if (i.getName().equals(nameStation)){
                    stationSelect = i;
                }
            }
            nowCost += stationSelect.getCost() - stationCurrent.getCost();
        }else{
            System.out.println("Cannot buy a ticket for now.");
        }

    }

    public void payCoin(int coin){
        

    }







}


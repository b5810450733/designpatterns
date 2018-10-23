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
        this.nowState = PROCEED;
        this.nowCost -= coin;
        int change = coin - nowCost;
        if (nowCost == 0){
            try {
                nowState = SUCCESS;
                // method ออกตั๋ว(selectStation); throw new Exception("Something wrong, please contact staff");
                nowState = READY;
                System.out.println("Get your ticket.");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            if (change > 0){
                // method ทอนเงิน(change);
                System.out.println("Your change is : "+change);
            }
        }else if (nowCost > 0){
            System.out.println("Need more coin.");
            try {
                payCoin(coin); throw new Exception("Insert a coin.");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }







}


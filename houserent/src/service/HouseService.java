package service;

import domain.House;
import utils.Utility;

import java.util.Arrays;
import java.util.Objects;

public class HouseService {
    private House[] houses;
    private int houseNum = 1;
    private int id = 1;
    public  HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1,"Jack","11234","海淀",12345,"未出租");

    }

    public House[] getHouses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


   public House search(int seaId){//考虑到修改房屋信息所以要返回对象
       for (int i = 0; i < houseNum; i++) {
           if(seaId ==houses[i].getId()) {
               return houses[i];
           }
       }
       return null;
   }
    public boolean del(int delId){
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if(delId == houses[i].getId()){
                index = i;
            }
            }
        if(index == -1){
            return false;
        }
        for (int i = index; i < houseNum-1; i++) {
            houses[i] = houses[i+1];//往前移
        }
        houses[houseNum - 1 ] = null;
        houseNum--;//少一个
        return true;

    }

    public boolean add(House newhouse){
        if(houseNum >= houses.length){
            House[] newHouse = new House[houses.length+1];
            for (int i = 0; i < houses.length; i++) {
                newHouse[i] = houses[i];
            }
            houses = newHouse;
            houses [houseNum++] = newhouse;
            newhouse.setId(++id);
            return true;

        }
        houses[houseNum++] = newhouse;
        newhouse.setId(++id);
        return true;
    }
    public House[] list(){
        return houses;
    }
}

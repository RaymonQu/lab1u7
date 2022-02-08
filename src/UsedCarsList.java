//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;

public class UsedCarList {
    private ArrayList<cars> inventory = new ArrayList();

    public UsedCarList() {
    }

    public ArrayList<cars> getInventory() {
        return this.inventory;
    }

    public void addCar(cars newCar) {
        this.inventory.add(newCar);
    }

    public boolean swap(int idx1, int idx2){
        if(idx1 < inventory.size() && idx2 < inventory.size() && idx1 >= 0 && idx2 >= 0){
            cars cars1 = inventory.get(idx1);
            cars cars2 = inventory.get(idx2);
            inventory.set(idx2, cars1);
            inventory.set(idx1, cars2);
            System.out.println(inventory);
            return true;
        }
        System.out.println(inventory);
        return false;
    }
}

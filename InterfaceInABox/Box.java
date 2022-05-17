package InterfaceInABox;

import java.util.ArrayList;

public class Box implements Packable{

    private double maxCap;
    private double totalWeight;
    private int itemNum;
    private ArrayList<Packable> packables = new ArrayList<>();

    public Box(double maxCap){
        this.maxCap = maxCap;
    }

    public void add(Packable packable){
        if(packable.weight()+totalWeight < maxCap){
            this.packables.add(packable);
            itemNum++;
            totalWeight += packable.weight();
        } else {
            System.out.println("Too heavy!");
        }

    }

    public String toString(){
        return "Box: "+ itemNum +" items, total weight "+totalWeight+" kg.";
    }


    @Override
    public double weight() {
        double weight = 0;
        for(Packable packable: packables){
            weight += packable.weight();
        }
        return weight;
    }
}

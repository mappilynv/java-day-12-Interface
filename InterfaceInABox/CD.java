package InterfaceInABox;

public class CD implements Packable{

    private String artist;
    private String name;
    private int year;
    private double weight;

    public CD(String artist, String name, int year){
        this.artist = artist;
        this.name = name;
        this.year = year;
    }

    public String toString(){
        return artist+": "+name+" ("+year+")";
    }

    @Override
    public double weight() {
        return 0.1;
    }
}

import java.util.ArrayList;

public class catrunner {
    public catrunner() {
    }

    public static void main(String[] args) {
        ArrayList<cats> someCats = new ArrayList();
        someCats.add(new cats("Joey"));
        someCats.add(new cats("Max"));
        someCats.add(new cats("Jenny"));
        System.out.println(someCats);
        cats nuCat = new cats("Toby");
        cats deadCat = (cats)someCats.set(2, nuCat);
        System.out.println(deadCat);
        System.out.println(someCats);
        someCats.set(1, new cats(((cats)someCats.get(1)).getName() + " Meow"));
        System.out.println(someCats);

        System.out.println("TEST");
    }
}

import java.util.ArrayList;
import java.util.Collection;

class Test2 {

    public static void main(String[] args) {

        ArrayList<Computer> laptops = new ArrayList<>();

        Computer laptop1 = new Computer("Samsung",2.5,8);
        Computer laptop2 = new Computer("Alien", 4.2,6);
        Computer laptop3 = new Computer("Alien", 4.2,10);
        Computer laptop4 = new Computer("Alien", 3.6,16);



        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);

        System.out.println(laptops + "\n");

    }


}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gym gym1 = new Gym(01, "Abdirahman Ali",
                "2200 rainer ave s","moh warsame");
        Gym gym2 = new Gym(02, "khalid Ali",
                "1200 kirkland way", "moha warsame");
        // adding a group of mmembers
        gym1.setGymMembers(new String []{"Alice", "Bob", "Carol"});
        gym2.setGymMembers(new String []{"Alex", "Tom", "parrel"});

        gym1.setName("New Fitness First");
        gym1.setAddress("789 Elm St");
        gym1.setOwnerName("Alice Johnson");

        gym2.setName("New Golds Gym");
        gym2.setAddress("987 Pine Ave");
        gym2.setOwnerName("Bob Anderson");

        // Print properties of the objects
        System.out.println("Gym 1:");
        System.out.println("ID: " + gym1.getId());
        System.out.println("Name: " + gym1.getName());
        System.out.println("Address: " + gym1.getAddress());
        System.out.println("Owner Name: " + gym1.getOwnerName());
        System.out.println("Owner Name: " + Arrays.toString(gym1.getGymMembers()));

        System.out.println("Gym 2:");
        System.out.println("ID: " + gym2.getId());
        System.out.println("Name: " + gym2.getName());
        System.out.println("Address: " + gym2.getAddress());
        System.out.println("Owner Name: " + gym2.getOwnerName());
        System.out.println("Owner Name: " + Arrays.toString(gym2.getGymMembers()));
    }

    }


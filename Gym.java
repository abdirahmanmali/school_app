public class Gym {
    private int id;
    private  String name;
    private  String address;
    private String ownerName;
    private String [] gymMembers;

    public Gym(int id, String name, String address, String ownerName) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.ownerName = ownerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String[] getGymMembers() {
        return gymMembers;
    }

    public void setGymMembers(String[] gymMembers) {
        this.gymMembers = gymMembers;
    }
}

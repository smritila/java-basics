public class This_ {
    String name;
    int id;

    public This_(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public void display() {
        System.out.println("name: " + name);
        System.out.println("id: " + id);

    }

    public static void main(String[] args) {
        This_ obj = new This_("smriti", 5);

        obj.display();

    }

}

class Encapsulation {
    public Encapsulation(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;

    }

    public void setName(String n) {
        name = n;
    }

}

public static void main(String[] args) {
    Encapsulation s1 = new Encapsulation();
    String getname = s1.getName();
    System.out.println(getname);
    s1.setName("Codemithra");
    System.out.println(s1.getName());

}

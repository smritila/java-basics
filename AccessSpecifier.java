class AccessSpecifier {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
    // public void setName(String name) {
    // this.name = name;
    // }

    public static void main(String[] args) {
        AccessSpecifier s1 = new AccessSpecifier();
        String getname = s1.getName();
        System.out.println(getname);
        s1.setName("Codemithra");
        System.out.println(s1.getName());

    }
}

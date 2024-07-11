class String_Demo {
    String Str1 = "Ethnus";
    String Str2 = "Codemithra";
    String Str3 = "CODEMITHRA";

    public static void main(String[] args) {
        double d = 858.48;// decimal to string conversion
        String s = Double.toString(d);
        int dot = s.indexOf('.');
        System.out.println(d);
        System.out.println(dot);
        // String_Demo StrDemo = new String_Demo();
        String s1 = " hello string ";
        // String s1 = "ETHNUS HELLO guys";
        // String s1 = "this is the index Example";
        // String s1 = "This is the indexOf method";
        // String s = "codemithra is a very good learning platform";
        // System.out.println(StrDemo..contaStr1 == StrDemo.Str2);
        // char ch = StrDemo.Str2.charAt(5);
        // char ch = StrDemo.Str2.charAt(4);

        // System.out.println(ch);
        // System.out.println(StrDemo.Str2.length());
        // System.out.println(StrDemo.Str1.substring(2));

        // System.out.println(StrDemo.Str2.substring(4, 6));
        // String Str3 = StrDemo.Str1.concat(StrDemo.Str2);
        // System.out.println(Str3);
        // System.out.println(StrDemo.Str2.contains("Code"));
        // System.out.println(StrDemo.Str2.contains("mithra"));
        // System.out.println(StrDemo.Str2.endsWith("ethnus"));
        // System.out.println(StrDemo.Str2.endsWith("Ethnus"));
        // System.out.println(StrDemo.Str2.startsWith("C"));
        // System.out.println(StrDemo.Str1.equalsIgnoreCase(StrDemo.Str2));
        // System.out.println(StrDemo.Str2.equalsIgnoreCase(StrDemo.Str3));

        // int index1 = s1.indexOf("is");
        // int index2 = s1.indexOf("index");
        // System.out.println(index1 + " " + index2);
        // int index3 = s1.indexOf("is", 4);
        // System.out.println(index3);
        // int index4 = s1.indexOf('s');
        // System.out.println(index4);
        // int index = s1.indexOf("method");
        // int index1 = s1.lastIndexOf('s');
        // System.out.println(index1);
        // System.out.println("index of substring " + index);
        // System.out.println(s1.isEmpty());

        // String replaString = s.replaceAll("a", "e");
        // System.out.println(replaString);
        // String s1lower = s1.toLowerCase();
        // System.out.println(s1lower);
        System.out.println(s1 + "ethnus");
        System.out.println(s1.trim() + "ethnus");
        System.out.println(dot + "digits " + "before decimal point");
        System.out.println((s.length() - dot - 1) + "digits after decimal point.");

    }

}

class Human {
    void Play() {
        System.out.println("Humans are playing");

    }

}

class Women extends Human {
    void Play() {
        System.out.println("Women are playing game");
    }

}

class Girl extends Women {
    void Play() {
        System.out.println("Girls are playing game");
    }

}

public class MultiLevelInheritamce {
    public static void main(String args[]) {
        Human M = new Women();
        Human W = new Girl();
        M.Play();
        W.Play();

    }

}

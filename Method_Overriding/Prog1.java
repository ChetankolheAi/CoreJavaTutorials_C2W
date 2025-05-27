class Umpire {
    void giveDecision() {
        System.out.println("Umpire says: Out!");
    }
}

class ThirdUmpire extends Umpire {
    //Override
    void giveDecision() {
        System.out.println("Third Umpire reviews and says: Not Out!");
    }
}
class Player {
    public static void main(String[] args) {
        Umpire fieldUmpire = new Umpire();
        fieldUmpire.giveDecision();

        Umpire tvUmpire = new ThirdUmpire();
        tvUmpire.giveDecision();

    }
}


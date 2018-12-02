package spacechallenge;

public class U1 extends Rocket {


    public U1() {
    }

    public U1(int cost, int weight, int maxweight, int chanceofExplosion, int chanceofCrash) {
        super(cost, weight, maxweight, chanceofExplosion, chanceofCrash);
        this.ChanceofCrash=(5/100);
        this.cost= 100000000;
        this.ChanceofExplosion=0;
        this.weight=10000;
        this.maxweight=5;
    }

    @Override
    public boolean land() {
        return super.land();
    }


    @Override
    public boolean launch() {
        return super.launch();
    }
}

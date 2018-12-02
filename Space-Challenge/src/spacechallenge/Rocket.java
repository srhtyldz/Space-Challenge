package spacechallenge;

public class Rocket implements Spaceship {

    int cost;
    int weight;
    int  maxweight;
    int ChanceofExplosion;
    int ChanceofCrash;

    public Rocket() {
    }

    public Rocket(int cost, int weight, int maxweight, int chanceofExplosion, int chanceofCrash) {
        this.cost = cost;
        this.weight = weight;
        this.maxweight = maxweight;
        ChanceofExplosion = chanceofExplosion;
        ChanceofCrash = chanceofCrash;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxweight() {
        return maxweight;
    }

    public void setMaxweight(int maxweight) {
        this.maxweight = maxweight;
    }

    public int getChanceofExplosion() {
        return ChanceofExplosion;
    }

    public void setChanceofExplosion(int chanceofExplosion) {
        ChanceofExplosion = chanceofExplosion;
    }

    public int getChanceofCrash() {
        return ChanceofCrash;
    }

    public void setChanceofCrash(int chanceofCrash) {
        ChanceofCrash = chanceofCrash;
    }

    @Override
    public boolean canCarry(Item item) {
        return false;
    }

    @Override
    public boolean land() {
        return true;
    }


    @Override
    public boolean launch() {
        return true;
    }


    @Override
    public void carry(Item item) {

    }





}

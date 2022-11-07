package flowers;


import skeletons.Item;

/**
 * pack of flowers
 */
public class FlowerPack extends Item {

    /**
     * flower
     */
    private Flower flower;

    /**
     * amount of flowers
     */
    private int amount;

    /**
     * initialize pack of flowers
     */
    public FlowerPack(Flower flower, int amount){
        this.flower = flower;
        this.amount = amount;
    }

    /**
     * get price of flower pack
     */
    public double getPrice(){
        return flower.getPrice() * amount;
    }
}

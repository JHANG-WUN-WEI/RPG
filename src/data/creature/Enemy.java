package data.creature;

import data.item.Prop;

/**
 * @author Lillian
 * @Description
 * @date 2022/2/15 下午 03:30
 */
public class Enemy extends Creature{
    private Prop[] drops;
    private Type type;

    public Enemy(int hp, int agile, int strength, int hit, int defense, int level, int exp,Type type) {
        super(hp, agile, strength, hit, defense, level, exp);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setDrops(Prop[] drops){
        this.drops = drops;
    }

    public Prop[] getDrops(){
        return drops;
    }
}

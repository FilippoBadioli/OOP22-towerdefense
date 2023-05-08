package towerDefense.entities.impl;

import java.awt.Point;

import towerDefense.Constants;
import towerDefense.entities.api.RangedEntity;

public class Turret extends RangedEntity {
    static int cost = 200;

    public Turret() {
        super(new Point(120, 400), 1, 8000, 500, Constants.turret, cost);
        super.resizeRangebox(500, 200);
        super.resizeHitbox(20, 200);
    }

    @Override
    public void updatePosition(){
        
    }

    public static int getCost() {
        return cost;
    }
    
}

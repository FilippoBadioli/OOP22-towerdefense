package towerDefense.entities.impl;

import java.awt.Point;

import towerDefense.Constants;
import towerDefense.entities.api.MovingEntity;

public class Goblin extends MovingEntity{

    public Goblin() {
        super(new Point((int)Constants.width-50 ,430), -2 , 4000, 12,"Goblin", 0);
    }

}
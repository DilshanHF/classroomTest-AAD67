package lk.ijse.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.contract.GoodFood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Mahesh {

private GoodFood goodFood;

    @Autowired
    public void setGoodFood(GoodFood goodFood) {
       this.goodFood = goodFood;
    }

    @PostConstruct
    public void init(){
        goodFood.FoodLover();
    }
}

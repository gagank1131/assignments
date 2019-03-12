package BasicExample.Question9;

import BasicExample.Question3and4.HotDrink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;


public class Restaurant {

    @Autowired
    @Qualifier("tea")
   HotDrink hotdrink;


   @Autowired

   public Restaurant(@Qualifier("tea1") HotDrink hotDrink)
    {
        this.hotdrink=hotDrink;
    }

    @Autowired
    @Qualifier("tea2")
   @Deprecated
   @Required
   public void setHotDrink(HotDrink hotDrink)
   {
       this.hotdrink=hotDrink;
   }

    public void getRestarantDrink()
    {

        hotdrink.prepareHotDrink();
    }


}

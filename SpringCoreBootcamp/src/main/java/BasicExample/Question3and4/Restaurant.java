package BasicExample.Question3and4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class Restaurant {


   HotDrink hotdrink;

   /*
   @Autowired
   public Restaurant(HotDrink hotDrink)
    {
        this.hotdrink=hotDrink;
    }
*/

   public void setHotDrink(HotDrink hotDrink)
   {
       this.hotdrink=hotDrink;
   }

    public void getRestarantDrink()
    {

        hotdrink.prepareHotDrink();
    }


}

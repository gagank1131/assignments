package BasicExample.Question8;

import BasicExample.Question3and4.HotDrink;
import org.springframework.beans.factory.annotation.Required;

import javax.xml.ws.RequestWrapper;


public class Restaurant {


   HotDrink hotdrink;

   /*
   @Autowired
   public Restaurant(HotDrink hotDrink)
    {
        this.hotdrink=hotDrink;
    }
*/

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

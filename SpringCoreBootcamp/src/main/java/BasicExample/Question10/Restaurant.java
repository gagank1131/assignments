package BasicExample.Question10;

import BasicExample.Question3and4.HotDrink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Repository("rest")
public class Restaurant {

    @Autowired
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

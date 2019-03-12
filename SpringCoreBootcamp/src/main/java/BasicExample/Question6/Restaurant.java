package BasicExample.Question6;

import BasicExample.Question3and4.HotDrink;


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

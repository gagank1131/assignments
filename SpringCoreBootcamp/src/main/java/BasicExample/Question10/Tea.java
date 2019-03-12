package BasicExample.Question10;

import BasicExample.Question3and4.HotDrink;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("teaDrink")
@Primary
public class Tea implements HotDrink {
    public void prepareHotDrink()
    {
        System.out.println("Tea");
    }

}

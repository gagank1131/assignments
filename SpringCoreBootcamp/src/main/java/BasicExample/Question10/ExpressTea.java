package BasicExample.Question10;

import BasicExample.Question3and4.HotDrink;
import org.springframework.stereotype.Component;

@Component("expressTeaDrink")
public class ExpressTea implements HotDrink {
    public void prepareHotDrink()
    {
        System.out.println("ExpressTea");
    }
}

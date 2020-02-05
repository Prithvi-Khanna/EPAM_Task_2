package NewYear;
import Sweets.*;
import Gift.Gift;

public class NewYear {

        public static void main(String Args[])
        {
            Sweet chocolate1 = new Chocolate(4, 120, "Chocolate","CadBury","Milk");
            Sweet chocolate2 = new Chocolate(3, 200, "Chocolate","5 Star","Dark");

            Sweet candy1 = new Candy(4, 10 , "Candy", "Pulse", "Pink");
            Sweet candy2 = new Candy(5, 15 , "Candy","Pulse" , "Green");

            Sweet cookie1 = new Cookies(5,30,"Cookie" , "Oreo");
            Sweet cookie2 = new Cookies(6,25,"Cookie","Jim Jam");

            Gift gift = new Gift();
            gift.add(chocolate1);
            gift.add(chocolate2);
            gift.add(candy1);
            gift.add(candy2);
            gift.add(cookie1);
            gift.add(cookie2);

            System.out.println("Total weight of your gift: "+gift.NetWeight());
            System.out.println(gift.toString());

            gift.sort();
            System.out.println("After sorting on price Item will be: "+ gift.toString());

            gift.findCandy();
        }
    }



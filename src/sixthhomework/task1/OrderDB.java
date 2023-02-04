package sixthhomework.task1;

import static fourthhomework.Currency.EUR;
import static fourthhomework.Currency.USD;

public class OrderDB {

    UserDB userDB = new UserDB();

    public Order firstOrder = new Order(1L, 100, USD, "Dildo", "Strawberry", userDB.tenthUser);
    public Order secondOrder = new Order(2L, 200, USD, "Strapon", "Adults", userDB.ninthUser);
    public Order thirdOrder = new Order(3L, 500, EUR, "Pocket Pussy", "Night entertainment", userDB.eigthUser);
    public Order fourthOrder = new Order(4L, 800, EUR, "Double pocket pussy", "Beside of twos", userDB.seventhUser);
    public Order fifthOrder = new Order(5L, 140, USD, "Dildo", "Bonga bonga", userDB.sixthUser);
    public Order sixthOrder = new Order(6L, 1550, USD, "Dildo", "Strawberry", userDB.fifthUser);
    public Order seventhOrder = new Order(8L, 190, EUR, "Strapon", "Adults", userDB.fourthUser);
    public Order eigthOrder = new Order(9L, 290, EUR, "Pocket Pussy", "Night entertainment", userDB.thirdUser);
    public Order ninthOrder = new Order(2L, 200, USD, "Strapon", "Adults", userDB.ninthUser);
    public Order tenthOrder = new Order(5L, 140, USD, "Dildo", "Bonga bonga", userDB.sixthUser);
}

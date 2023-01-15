package sixthhomework;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Order> orderList;

        User firstUser = new User(0000000001L, "Ivan", "Kovalenko", "Kremenchuk", 100);
        User secondUser = new User(0000000002L, "Danylo", "Glushko", "Kremenchuk", 150);
        User thirdUser = new User(0000000003L, "Oleg", "Sydorenko", "Kremenchuk", 200);
        User fourthUser = new User(0000000004L, "Igor", "Valylenko", "Kyiv", 175);
        User fifthUser = new User(0000000005L, "Vasyl", "Vasylenko", "Kyiv", 250);
        User sixthUser = new User(0000000006L, "Petro", "Danylenko", "Lviv", 150);
        User seventhUser = new User(0000000007L, "Ivan", "Givno", "Lviv", 300);
        //User eigthUser = new User(0000000008L, "Igor", "Kusub", "Lviv", 0);
        //User ninthUser = new User(0000000009L, "Vasyl", "Ivanov", "Odessa", 180);
        User tenthUser = new User(0000000010L, "Artem", "Andriiv", "Dnipro", 600);
    }
}

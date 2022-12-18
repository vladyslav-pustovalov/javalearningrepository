package fourthhomework;

public class Main {

    public static void main(String[] args) {

        User ivan = new User(111111, "Ivan", 100500, 12, "Apple", 15000, USBank.usBank);
        User artem = new User(222222, "Artem", 25000, 3, "Google", 8000, USBank.usBank);
        User denys = new User(333333, "Denys", 76000, 7, "Amazon", 16000, EUBank.euBank);
        User taras = new User(444444, "Taras", 870000, 38, "Microsoft", 40000, EUBank.euBank);
        User petro = new User(555555, "Petro", 7000, 40, "Facebook", 20000, ChinaBank.chinaBank);
        User vasyl = new User(666666, "Vasyl", 5400000, 66, "Walmart", 40000, ChinaBank.chinaBank);
    }
}

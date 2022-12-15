package thirdhomework.task3;

public class Solution {

    public static void main(String[] args) {
        Course math = new Course(1, "Olena");
        Course language = new Course(2, "Natalya");
        Course literature = new Course(3, "Ylia");
        Course biology = new Course(4, "Iryna");
        Course sport = new Course(5, "Stitlana");

        Student ivan = new Student("Ivan", "Ivanov", 111);
        Student igor = new Student("Igor", "Igorov", 222);

        CollegeStudent vasyl = new CollegeStudent("Vasyl", "Vaylchenko", 333);
        CollegeStudent volodymyr = new CollegeStudent("Volodymyr", "Volodymyrov", 666666666, "Bursa 7", 123, 7777777);
        CollegeStudent vitalii = new CollegeStudent("Vitalii", "Vitaliiv", 666666666, "Bursa 7", 123, 888888888);

        SpecialStudent danylo = new SpecialStudent("Danylo", "Danylov", 333);
        SpecialStudent dmytro = new SpecialStudent("Dmytro", "Dmytriv", 666666666);
        SpecialStudent davyd = new SpecialStudent("Davyd", "Davydiv", 333, 999999999);
    }
}

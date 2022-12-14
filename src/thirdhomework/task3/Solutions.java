package thirdhomework.task3;

import thirdhomework.task3.CollegeStudent;
import thirdhomework.task3.Course;
import thirdhomework.task3.SpecialStudent;
import thirdhomework.task3.Student;

public class Solutions {

    public static void main(String[] args) {
        Course math, language, literature, biology, sport;
        math = new Course(1, "Olena");
        language = new Course(2, "Natalya");
        literature = new Course(3, "Ylia");
        biology = new Course(4, "Iryna");
        sport = new Course(5, "Stitlana");

        Student ivan, igor;
        ivan = new Student("Ivan", "Ivanov", 111);
        igor = new Student("Igor","Igorov", 222);

        CollegeStudent vasyl, volodymyr, vitalii;
        vasyl = new CollegeStudent("Vasyl", "Vaylchenko", 333);
        volodymyr = new CollegeStudent("Bursa 7", 123, 666666666);
        vitalii = new CollegeStudent("Bursa 7", 123, 555555555);

        SpecialStudent danylo, dmytro, davyd;
        danylo = new SpecialStudent("Danylo", "Danylov", 333);
        dmytro = new SpecialStudent("Bursa 7", 123, 666666666);
        davyd = new SpecialStudent(1234567890);
    }
}

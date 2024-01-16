import com.workintech.company.HRManager;
import com.workintech.company.JuniorDeveloper;
import com.workintech.company.MidDeveloper;
import com.workintech.company.SeniorDeveloper;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Cuboid;

public class Main {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(1, 3);
        System.out.println("Area = " + cylinder.getArea());
        System.out.println("Volume= " + cylinder.getVolume());

        Cuboid cuboid = new Cuboid(2, 3, 2);
        System.out.println("Area = " + cuboid.getArea());
        System.out.println("Volume = " + cuboid.getVolume());

        System.out.println("***************");

        JuniorDeveloper junior1 = new JuniorDeveloper(1, "Ali Veli");
        JuniorDeveloper junior2 = new JuniorDeveloper(2, "Mehmet");
        junior1.work();
        junior2.work();
        System.out.println(junior1);
        System.out.println(junior2);

        MidDeveloper mid1 = new MidDeveloper(3, "Ahmet");
        MidDeveloper mid2 = new MidDeveloper(4, "Eda");
        mid1.work();
        mid2.work();
        System.out.println(mid1);
        System.out.println(mid2);

        SeniorDeveloper senior1 = new SeniorDeveloper(5, "Mustafa");
        senior1.work();
        System.out.println(senior1);

        System.out.println("************************");
        HRManager hrManager = new HRManager(6, "Esra",
                new JuniorDeveloper[5], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();
        hrManager.addEmployee(0, junior1);
        hrManager.addEmployee(1, junior2);
        hrManager.addEmployee(0, mid1);
        hrManager.addEmployee(1, mid2);
        hrManager.addEmployee(0, senior1);
        System.out.println(hrManager);

    }
}
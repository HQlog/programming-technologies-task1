import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestOfGroup {

    public static void main(String[] args) {
        Group star = new Group(2);
        Group river = new Group(2);
        Group briliant = new Group(2);
        Group moonlight = new Group(3);

        //test1
        star.addStudent("a");
        star.newSbjGrade("a", "Physics", "2");
        river.addStudent("a");
        river.newSbjGrade("a", "Physics", "2");
        assertTrue(star.equalsGroup(river));

        //test2
        star.addStudent("c");
        star.newSbjGrade("c", "Physics", "2");
        river.addStudent("d");
        river.newSbjGrade("d", "Physics", "2");
        assertFalse(star.equalsGroup(river));

        //test3
        star.addStudent("d");
        star.newSbjGrade("d", "Physics", "1");
        river.addStudent("d");
        river.newSbjGrade("d", "Physics", "2");
        assertFalse(star.equalsGroup(river));

        //test4
        briliant.addStudent("b");
        briliant.newSbjGrade("b", "Physics", "2");
        moonlight.addStudent("b");
        moonlight.newSbjGrade("b", "Physics", "2");
        assertFalse(briliant.equalsGroup(moonlight));

        //test5
        Group sky = new Group(3);
        Group space = new Group(3);
        space.changeNum(111111111);
        assertFalse(sky.equalsGroup(space));

        //test6
        sky.addStudent("Георгий");
        Group grForTest2 = new Group(3);
        assertFalse(grForTest2.equalsGroup(sky));

        //test7
        sky.removeStudent("Георгий");
        Group grForTest = new Group(3);
        assertTrue(grForTest.equalsGroup(sky));

        //test8
        sky.addStudent("Георгий");
        sky.newSbjGrade("Георгий", "Physics", "4");
        Group grForTest3 = new Group(3);
        grForTest3.addStudent("Георгий");
        grForTest3.newSbjGrade("Георгий", "Physics", "4");
        assertTrue(grForTest3.equalsGroup(sky));

        //test9
        sky.deleteGrate("Георгий", "Physics");
        Group grForTest4 = new Group(3);
        grForTest4.addStudent("Георгий");
        grForTest4.newSbjGrade("Георгий", "Physics", "");
        assertTrue(grForTest4.equalsGroup(sky));

    }

}

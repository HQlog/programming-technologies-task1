

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
        System.out.println(star.equalsGroup(river));// true

        //test2
        star.addStudent("c");
        star.newSbjGrade("c", "Physics", "2");
        river.addStudent("d");
        river.newSbjGrade("d", "Physics", "2");
        System.out.println(star.equalsGroup(river)); //false

        //test3
        star.addStudent("d");
        star.newSbjGrade("d", "Physics", "1");
        river.addStudent("d");
        river.newSbjGrade("d", "Physics", "2");
        System.out.println(star.equalsGroup(river)); //false

        //test4
        briliant.addStudent("b");
        briliant.newSbjGrade("b", "Physics", "2");
        moonlight.addStudent("b");
        moonlight.newSbjGrade("b", "Physics", "2");
        System.out.println(briliant.equalsGroup(moonlight));//false

        //test5
        Group sky = new Group(3);
        Group space = new Group(3);
        space.changeNum(111111111);
        System.out.println(sky.equalsGroup(space)); //false

        //test6
        sky.addStudent("Георгий");
        sky.showGroup();//Георгий
        sky.removeStudent("Георгий");
        sky.showGroup();// ничего

        //test7
        sky.addStudent("Георгий");
        sky.newSbjGrade("Георгий", "Physics", "4");
        sky.newSbjGrade("Георгий", "Physics1", "4");
        sky.newSbjGrade("Георгий", "Physics2", "4");
        sky.showGroup();//есть оценка по Physics
        sky.deleteGrate("Георгий", "Physics");
        sky.showGroup();//нет оценки по Physics


    }

}

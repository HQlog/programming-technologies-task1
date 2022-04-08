import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;

public class Group {

    public int number = 0;

    public LinkedList<Student> studentsList = new LinkedList<>();

    public void changeNum(int Num) {
        this.number = Num;
    }

    public void addStudent(String name) {

        this.studentsList.add(new Student(name));
    }

    public void removeStudent(String st) {
        this.studentsList.removeIf(el -> st.equals(el.name));
    }

    public void showGroup() {
        for (Student el : this.studentsList) {
            System.out.print(el.name + "    ");
            System.out.println(el.grates);
        }
    }

    public Group(int number) {

        this.number = number;

    }

    public void newSbjGrade(String name, String sbj, String gr) {
        for (Student el : this.studentsList) {
            if (el.name.equals(name)) {
                el.grates.put(sbj, gr);

            }
        }
    }

    public void deleteGrate(String name, String sbj) {
        for (Student el : this.studentsList) {
            if (el.name.equals(name)) {
                el.grates.put(sbj, "");

            }
        }
    }

    public boolean equalsGroup(@NotNull Group another) {
        if (this.number == another.number && this.studentsList.size() == another.studentsList.size()) {
            for (int i = 0; i < this.studentsList.size(); i++) {
                if (!this.studentsList.get(i).equalsSt(another.studentsList.get(i))) return false;
            }

        } else return false;
        return true;
    }


}


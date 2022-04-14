import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Student {

    String name;

    Map<String, String> grates = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void newSbjGradeSt(String sbj, String gr) {
        this.grates.put(sbj, gr);
    }

    public void deleteSbjSt(String sbj) {

        this.grates.remove(sbj);

    }

    public void deleteGrateSt(String sbj) {

        this.grates.put(sbj, "");

    }

    public boolean equalsSt(@NotNull Student another) {
        if (Objects.equals(this.name, another.name) && this.grates.size() == another.grates.size()) {
            return this.grates.equals(another.grates);
        } else return false;
    }

}
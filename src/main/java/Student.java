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

    public boolean equalsSt(@NotNull Student another) {
        if (Objects.equals(this.name, another.name) && this.grates.size() == another.grates.size()) {
            return this.grates.equals(another.grates);
        } else return false;
    }

}

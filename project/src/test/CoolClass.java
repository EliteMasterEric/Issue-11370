package test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CoolClass {
    @Entry(name = "Outer") public String outer;
    @Entry(name = "Inner") public String inner;
    @Comment public Comment comment;

    public CoolClass(String outer, String inner) {
        this.outer = outer;
        this.inner = inner;
    }

    public String getOuter() {
        return outer;
    }

    public String getInner() {
        return inner;
    }

    public String toString() {
        return "CoolClass(" + outer + ":" + inner + ")";
    }

    @Retention(RetentionPolicy.RUNTIME) @Target(ElementType.FIELD) public @interface Entry {
        String category() default "default";
        String name() default "Entry";
    }
    @Retention(RetentionPolicy.RUNTIME) @Target(ElementType.FIELD) public @interface Comment {
        String category() default "default";
    }
}

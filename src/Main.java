import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface CustomInfo {
    String author();
    String date();
    int version() default 1;
}

@CustomInfo(author = "h662", date = "2025-06-24", version = 2)
class Demo {

    @CustomInfo(author = "h663", date ="2026-06-26")
    public void display() {
        System.out.println("Display method executed.");
    }
}

public class Main {
    public static void main(String[] args) {
    }
}
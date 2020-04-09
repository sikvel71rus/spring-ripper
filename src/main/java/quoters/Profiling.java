package quoters;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * В лог выводится время за которое метод работает
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Profiling {
}

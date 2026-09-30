package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /tmp/toss_alldex/classes13.dex */
public @interface access14800 {
    String IAuthTabCallback() default "";

    String onExtraCallback() default "";

    int onExtraCallbackWithResult() default 2;

    int[] onNavigationEvent() default {};

    String onWarmupCompleted() default "";
}

package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention
/* loaded from: /tmp/toss_alldex/classes13.dex */
public @interface clearMetadata {
    String onNavigationEvent();

    String onWarmupCompleted();
}

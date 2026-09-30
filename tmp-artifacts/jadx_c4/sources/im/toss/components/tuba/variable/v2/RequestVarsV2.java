package im.toss.components.tuba.variable.v2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention
/* loaded from: /tmp/toss_alldex/classes4.dex */
public @interface RequestVarsV2 {
    String[] IAuthTabCallback();
}

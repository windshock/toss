package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Inherited
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention
/* loaded from: /tmp/toss_alldex/classes4.dex */
public @interface EmbeddingAdapterExternalSyntheticLambda1 {
    boolean IAuthTabCallback() default true;
}

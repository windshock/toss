package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.MustBeDocumented;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@MustBeDocumented
@kotlin.annotation.Target
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /tmp/toss_alldex/classes13.dex */
public @interface Deprecated {
}

package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.MustBeDocumented;
import kotlinx.serialization.KSerializer;

@Target({ElementType.TYPE, ElementType.TYPE_USE})
@MustBeDocumented
@kotlin.annotation.Target
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /tmp/toss_alldex/classes13.dex */
public @interface liq {
    Class<? extends KSerializer<?>> onNavigationEvent() default KSerializer.class;
}

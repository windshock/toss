package o;

import im.toss.define.TossAffiliate;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@java.lang.annotation.Target({ElementType.TYPE})
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public @interface DERString {
    boolean IAuthTabCallback() default false;

    TossAffiliate[] onExtraCallback() default {TossAffiliate.CORE};
}

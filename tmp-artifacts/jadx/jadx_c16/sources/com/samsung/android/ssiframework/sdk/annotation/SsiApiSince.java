package com.samsung.android.ssiframework.sdk.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.MustBeDocumented;

@Target({ElementType.FIELD, ElementType.METHOD})
@MustBeDocumented
@kotlin.annotation.Target
@Documented
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention
/* loaded from: /tmp/toss_alldex/classes16.dex */
public @interface SsiApiSince {
    SsiApiLevel ssiApiLevel() default SsiApiLevel.LEVEL_1;
}

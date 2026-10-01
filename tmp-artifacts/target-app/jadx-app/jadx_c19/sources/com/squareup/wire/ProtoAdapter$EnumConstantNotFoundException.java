package com.squareup.wire;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import o.clearRegisters;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProtoAdapter$EnumConstantNotFoundException extends IllegalArgumentException {
    public final int value;

    public ProtoAdapter$EnumConstantNotFoundException(int i2, @Nullable KClass<?> kClass) {
        Class clsOnNavigationEvent;
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown enum tag ");
        sb.append(i2);
        sb.append(" for ");
        sb.append((kClass == null || (clsOnNavigationEvent = clearRegisters.onNavigationEvent(kClass)) == null) ? null : clsOnNavigationEvent.getName());
        super(sb.toString());
        this.value = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter$EnumConstantNotFoundException(int i2, @NotNull Class<?> cls) {
        this(i2, (KClass<?>) clearRegisters.IAuthTabCallback(cls));
        Intrinsics.checkNotNullParameter(cls, "");
    }
}

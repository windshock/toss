package org.apache.commons.lang3.reflect;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Function;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class MethodUtils$$ExternalSyntheticLambda2 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Arrays.stream((Method[]) obj);
    }
}

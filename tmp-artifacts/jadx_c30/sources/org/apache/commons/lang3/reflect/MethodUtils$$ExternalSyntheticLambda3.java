package org.apache.commons.lang3.reflect;

import java.lang.reflect.Method;
import java.util.function.Predicate;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class MethodUtils$$ExternalSyntheticLambda3 implements Predicate {
    public final /* synthetic */ String f$0;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((Method) obj).getName().equals(this.f$0);
    }
}

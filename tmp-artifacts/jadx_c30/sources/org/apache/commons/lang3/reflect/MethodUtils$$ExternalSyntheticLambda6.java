package org.apache.commons.lang3.reflect;

import java.lang.reflect.Method;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import o.wwx5;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class MethodUtils$$ExternalSyntheticLambda6 implements Consumer {
    public final /* synthetic */ Class[] f$0;
    public final /* synthetic */ TreeMap f$1;

    public /* synthetic */ MethodUtils$$ExternalSyntheticLambda6(Class[] clsArr, TreeMap treeMap) {
        this.f$0 = clsArr;
        this.f$1 = treeMap;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Method method = (Method) obj;
        ((List) this.f$1.computeIfAbsent(Integer.valueOf(wwx5.onExtraCallback(this.f$0, method.getParameterTypes())), new Function() { // from class: org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda9
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return wwx5.onWarmupCompleted((Integer) obj2);
            }
        })).add(method);
    }
}

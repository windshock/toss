package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import o.access5000;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    public MutablePropertyReference2Impl(access5000 access5000Var, String str, String str2) {
        super(((ClassBasedDeclarationContainer) access5000Var).getJClass(), str, str2, !(access5000Var instanceof KClass) ? 1 : 0);
    }

    public MutablePropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }

    public Object get(Object obj, Object obj2) {
        return getGetter().call(new Object[]{obj, obj2});
    }

    public void set(Object obj, Object obj2, Object obj3) {
        getSetter().call(new Object[]{obj, obj2, obj3});
    }
}

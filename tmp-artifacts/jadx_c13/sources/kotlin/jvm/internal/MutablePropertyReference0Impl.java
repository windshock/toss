package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import o.access5000;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class MutablePropertyReference0Impl extends MutablePropertyReference0 {
    public MutablePropertyReference0Impl(access5000 access5000Var, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) access5000Var).getJClass(), str, str2, !(access5000Var instanceof KClass) ? 1 : 0);
    }

    public MutablePropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public MutablePropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // o.addAllMemoryMappings
    public Object get() {
        return getGetter().call(new Object[0]);
    }

    @Override // o.access5700
    public void set(Object obj) {
        m136getSetter().call(obj);
    }
}

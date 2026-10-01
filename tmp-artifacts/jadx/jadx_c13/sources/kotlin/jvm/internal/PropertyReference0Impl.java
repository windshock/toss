package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import o.access5000;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(access5000 access5000Var, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) access5000Var).getJClass(), str, str2, !(access5000Var instanceof KClass) ? 1 : 0);
    }

    public PropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // o.addAllMemoryMappings
    public Object get() {
        return getGetter().call(new Object[0]);
    }
}

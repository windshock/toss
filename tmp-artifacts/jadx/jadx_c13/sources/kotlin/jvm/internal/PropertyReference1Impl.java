package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import o.access5000;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(access5000 access5000Var, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) access5000Var).getJClass(), str, str2, !(access5000Var instanceof KClass) ? 1 : 0);
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // o.addAllCauses
    public Object get(Object obj) {
        return m139getGetter().call(obj);
    }
}

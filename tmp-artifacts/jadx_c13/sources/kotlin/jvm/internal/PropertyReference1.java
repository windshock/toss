package kotlin.jvm.internal;

import o.access4900;
import o.addAllCauses;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class PropertyReference1 extends PropertyReference implements addAllCauses {
    public PropertyReference1() {
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected access4900 computeReflected() {
        return Reflection.property1(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // o.addAllCauses
    /* renamed from: getGetter, reason: merged with bridge method [inline-methods] */
    public addAllCauses.IAuthTabCallback m139getGetter() {
        return ((addAllCauses) getReflected()).m137getGetter();
    }

    @Override // o.addAllCauses
    public Object getDelegate(Object obj) {
        return ((addAllCauses) getReflected()).getDelegate(obj);
    }
}

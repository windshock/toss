package kotlin.jvm.internal;

import o.access4900;
import o.access5500;
import o.addAllCauses;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements access5500 {
    public MutablePropertyReference1() {
    }

    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected access4900 computeReflected() {
        return Reflection.mutableProperty1(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // o.addAllCauses
    /* renamed from: getGetter, reason: merged with bridge method [inline-methods] */
    public addAllCauses.IAuthTabCallback m137getGetter() {
        return ((access5500) getReflected()).m137getGetter();
    }

    @Override // o.access5500
    /* renamed from: getSetter, reason: merged with bridge method [inline-methods] */
    public access5500.onExtraCallbackWithResult m138getSetter() {
        return ((access5500) getReflected()).m138getSetter();
    }

    @Override // o.addAllCauses
    public Object getDelegate(Object obj) {
        return ((access5500) getReflected()).getDelegate(obj);
    }
}

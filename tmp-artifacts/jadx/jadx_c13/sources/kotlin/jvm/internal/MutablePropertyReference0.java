package kotlin.jvm.internal;

import o.access4900;
import o.access5700;
import o.addAllMemoryMappings;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements access5700 {
    public MutablePropertyReference0() {
    }

    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected access4900 computeReflected() {
        return Reflection.mutableProperty0(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @Override // o.addAllMemoryMappings
    public addAllMemoryMappings.IAuthTabCallback getGetter() {
        return ((access5700) getReflected()).getGetter();
    }

    @Override // o.access5700
    /* renamed from: getSetter, reason: merged with bridge method [inline-methods] */
    public access5700.onExtraCallback m136getSetter() {
        return ((access5700) getReflected()).m136getSetter();
    }

    @Override // o.addAllMemoryMappings
    public Object getDelegate() {
        return ((access5700) getReflected()).getDelegate();
    }
}

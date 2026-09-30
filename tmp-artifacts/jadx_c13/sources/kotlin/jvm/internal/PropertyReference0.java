package kotlin.jvm.internal;

import o.access4900;
import o.addAllMemoryMappings;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class PropertyReference0 extends PropertyReference implements addAllMemoryMappings {
    public PropertyReference0() {
    }

    public PropertyReference0(Object obj) {
        super(obj);
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected access4900 computeReflected() {
        return Reflection.property0(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @Override // o.addAllMemoryMappings
    public addAllMemoryMappings.IAuthTabCallback getGetter() {
        return ((addAllMemoryMappings) getReflected()).getGetter();
    }

    @Override // o.addAllMemoryMappings
    public Object getDelegate() {
        return ((addAllMemoryMappings) getReflected()).getDelegate();
    }
}

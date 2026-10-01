package o;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setVideoAdInteractionListener {
    private final boolean IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final IntFunction<Map<Object, Object>> IAuthTabCallbackStub;
    private final lt14 IAuthTabCallbackStubProxy;
    private final int IAuthTabCallback_Parcel;
    private final boolean access000;
    private final boolean access100;
    private final Optional<sya29> asBinder;
    private final IntFunction<Set<Object>> asInterface;
    private final Map<uh25, setAdCreativeClickListener> getInterfaceDescriptor;
    private final Map<Object, Object> onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final Integer onNavigationEvent;
    private final IntFunction<List<Object>> onTransact;
    private final int onWarmupCompleted;
    private final UnaryOperator<onDowngrade> writeTypedObject;

    setVideoAdInteractionListener(String str, Map<uh25, setAdCreativeClickListener> map, IntFunction<List<Object>> intFunction, IntFunction<Set<Object>> intFunction2, IntFunction<Map<Object, Object>> intFunction3, UnaryOperator<onDowngrade> unaryOperator, Integer num, boolean z, boolean z2, int i, boolean z3, Map<Object, Object> map2, Optional<sya29> optional, boolean z4, int i2, lt14 lt14Var) {
        this.IAuthTabCallbackDefault = str;
        this.getInterfaceDescriptor = map;
        this.onTransact = intFunction;
        this.asInterface = intFunction2;
        this.IAuthTabCallbackStub = intFunction3;
        this.writeTypedObject = unaryOperator;
        this.onNavigationEvent = num;
        this.IAuthTabCallback = z;
        this.onExtraCallbackWithResult = z2;
        this.access000 = z4;
        this.IAuthTabCallback_Parcel = i;
        this.access100 = z3;
        this.onExtraCallback = map2;
        this.asBinder = optional;
        this.onWarmupCompleted = i2;
        this.IAuthTabCallbackStubProxy = lt14Var;
    }

    public static setVideoAdLoadListener onWarmupCompleted() {
        return new setVideoAdLoadListener();
    }

    public String asInterface() {
        return this.IAuthTabCallbackDefault;
    }

    public Map<uh25, setAdCreativeClickListener> IAuthTabCallbackStubProxy() {
        return this.getInterfaceDescriptor;
    }

    public IntFunction<List<Object>> asBinder() {
        return this.onTransact;
    }

    public IntFunction<Set<Object>> IAuthTabCallbackStub() {
        return this.asInterface;
    }

    public IntFunction<Map<Object, Object>> onTransact() {
        return this.IAuthTabCallbackStub;
    }

    public Integer IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public boolean onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public boolean onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public boolean access100() {
        return this.access100;
    }

    public Function<onDowngrade, onDowngrade> readTypedObject() {
        return this.writeTypedObject;
    }

    public int getInterfaceDescriptor() {
        return this.IAuthTabCallback_Parcel;
    }

    public Optional<sya29> IAuthTabCallbackDefault() {
        return this.asBinder;
    }

    public boolean IAuthTabCallback_Parcel() {
        return this.access000;
    }

    public int onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public lt14 access000() {
        return this.IAuthTabCallbackStubProxy;
    }
}

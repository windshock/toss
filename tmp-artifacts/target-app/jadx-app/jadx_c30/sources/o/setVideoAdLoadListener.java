package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import o.onDowngrade;
import o.setVideoAdLoadListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setVideoAdLoadListener {
    private final Map<Object, Object> onExtraCallbackWithResult = new HashMap();
    private String onTransact = "reader";
    private Map<uh25, setAdCreativeClickListener> IAuthTabCallbackStubProxy = new HashMap();
    private IntFunction<List<Object>> IAuthTabCallbackStub = new IntFunction() { // from class: org.snakeyaml.engine.v2.api.LoadSettingsBuilder$$ExternalSyntheticLambda0
        @Override // java.util.function.IntFunction
        public final Object apply(int i) {
            return new ArrayList(i);
        }
    };
    private IntFunction<Set<Object>> asInterface = new IntFunction() { // from class: org.snakeyaml.engine.v2.api.LoadSettingsBuilder$$ExternalSyntheticLambda1
        @Override // java.util.function.IntFunction
        public final Object apply(int i) {
            return new LinkedHashSet(i);
        }
    };
    private IntFunction<Map<Object, Object>> asBinder = new IntFunction() { // from class: org.snakeyaml.engine.v2.api.LoadSettingsBuilder$$ExternalSyntheticLambda2
        @Override // java.util.function.IntFunction
        public final Object apply(int i) {
            return new LinkedHashMap(i);
        }
    };
    private UnaryOperator<onDowngrade> readTypedObject = new UnaryOperator() { // from class: org.snakeyaml.engine.v2.api.LoadSettingsBuilder$$ExternalSyntheticLambda3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return setVideoAdLoadListener.onExtraCallbackWithResult((onDowngrade) obj);
        }
    };
    private Integer onWarmupCompleted = 1024;
    private boolean onExtraCallback = false;
    private boolean onNavigationEvent = false;
    private boolean IAuthTabCallback_Parcel = false;
    private int access000 = 50;
    private boolean access100 = true;
    private Optional<sya29> IAuthTabCallbackDefault = Optional.empty();
    private int IAuthTabCallback = 3145728;
    private lt14 getInterfaceDescriptor = new uh9();

    setVideoAdLoadListener() {
    }

    public static /* synthetic */ onDowngrade onExtraCallbackWithResult(onDowngrade ondowngrade) {
        if (ondowngrade.onExtraCallback() == 1) {
            return ondowngrade;
        }
        throw new uh19(ondowngrade);
    }

    public setVideoAdLoadListener onNavigationEvent(lt14 lt14Var) {
        this.getInterfaceDescriptor = lt14Var;
        return this;
    }

    public setVideoAdInteractionListener IAuthTabCallback() {
        return new setVideoAdInteractionListener(this.onTransact, this.IAuthTabCallbackStubProxy, this.IAuthTabCallbackStub, this.asInterface, this.asBinder, this.readTypedObject, this.onWarmupCompleted, this.onExtraCallback, this.onNavigationEvent, this.access000, this.access100, this.onExtraCallbackWithResult, this.IAuthTabCallbackDefault, this.IAuthTabCallback_Parcel, this.IAuthTabCallback, this.getInterfaceDescriptor);
    }
}

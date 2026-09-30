package o;

import com.fasterxml.jackson.databind.util.RawValue;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class onActivityStarted implements Serializable, onActivityDestroyed {
    public static final onActivityStarted onNavigationEvent = new onActivityStarted();
    private static final long serialVersionUID = 1;

    @Deprecated
    private final boolean _cfgBigDecimalExact;

    public onActivityStarted(boolean z) {
        this._cfgBigDecimalExact = z;
    }

    protected onActivityStarted() {
        this(false);
    }

    public boolean onNavigationEvent() {
        return !this._cfgBigDecimalExact;
    }

    public CoroutineLiveDataExternalSyntheticLambda0 onWarmupCompleted(boolean z) {
        return z ? CoroutineLiveDataExternalSyntheticLambda0.asBinder() : CoroutineLiveDataExternalSyntheticLambda0.IAuthTabCallbackDefault();
    }

    public GenericLifecycleObserver onExtraCallback() {
        return GenericLifecycleObserver.asBinder();
    }

    public LegacySavedStateHandleControllertryToAddRecreator1 onExtraCallbackWithResult(int i2) {
        return onActivityResumed.onExtraCallback(i2);
    }

    public LegacySavedStateHandleControllertryToAddRecreator1 onExtraCallback(long j) {
        return onActivityStopped.IAuthTabCallback(j);
    }

    public upTo onExtraCallback(BigInteger bigInteger) {
        if (bigInteger == null) {
            return onExtraCallback();
        }
        return ComputableLiveDataExternalSyntheticLambda0.onExtraCallbackWithResult(bigInteger);
    }

    public LegacySavedStateHandleControllertryToAddRecreator1 onExtraCallbackWithResult(float f) {
        return DefaultLifecycleObserver.onWarmupCompleted(f);
    }

    public LegacySavedStateHandleControllertryToAddRecreator1 onExtraCallbackWithResult(double d) {
        return DispatchQueueExternalSyntheticLambda0.IAuthTabCallback(d);
    }

    public upTo onWarmupCompleted(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return onExtraCallback();
        }
        return CoroutineLiveDataKtaddDisposableSource2ExternalSyntheticLambda0.onNavigationEvent(bigDecimal);
    }

    public downFrom IAuthTabCallback(String str) {
        return downFrom.onNavigationEvent(str);
    }

    public AbstractSavedStateViewModelFactory onExtraCallbackWithResult(byte[] bArr) {
        return AbstractSavedStateViewModelFactory.onExtraCallback(bArr);
    }

    @Override // o.onActivityDestroyed
    public onRequery IAuthTabCallbackDefault() {
        return new onRequery(this);
    }

    public FlowLiveDataConversionsasFlow1ExternalSyntheticLambda0 onWarmupCompleted() {
        return new FlowLiveDataConversionsasFlow1ExternalSyntheticLambda0(this);
    }

    public upTo onNavigationEvent(Object obj) {
        return new getTargetState(obj);
    }

    public upTo onExtraCallback(RawValue rawValue) {
        return new getTargetState(rawValue);
    }
}

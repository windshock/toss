package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RemoteCollectionItems implements Serializable {
    private static final long serialVersionUID = 1;
    protected final LiveDataLifecycleBoundObserver[] _additionalKeySerializers;
    protected final LiveDataLifecycleBoundObserver[] _additionalSerializers;
    protected final LiveData[] _modifiers;
    protected static final LiveDataLifecycleBoundObserver[] onWarmupCompleted = new LiveDataLifecycleBoundObserver[0];
    protected static final LiveData[] onExtraCallbackWithResult = new LiveData[0];

    public RemoteCollectionItems() {
        this(null, null, null);
    }

    protected RemoteCollectionItems(LiveDataLifecycleBoundObserver[] liveDataLifecycleBoundObserverArr, LiveDataLifecycleBoundObserver[] liveDataLifecycleBoundObserverArr2, LiveData[] liveDataArr) {
        this._additionalSerializers = liveDataLifecycleBoundObserverArr == null ? onWarmupCompleted : liveDataLifecycleBoundObserverArr;
        this._additionalKeySerializers = liveDataLifecycleBoundObserverArr2 == null ? onWarmupCompleted : liveDataLifecycleBoundObserverArr2;
        this._modifiers = liveDataArr == null ? onExtraCallbackWithResult : liveDataArr;
    }

    public boolean IAuthTabCallback() {
        return this._additionalKeySerializers.length > 0;
    }

    public boolean onExtraCallback() {
        return this._modifiers.length > 0;
    }

    public Iterable<LiveDataLifecycleBoundObserver> onExtraCallbackWithResult() {
        return new LocalLifecycleOwnerKtExternalSyntheticLambda0(this._additionalSerializers);
    }

    public Iterable<LiveDataLifecycleBoundObserver> onWarmupCompleted() {
        return new LocalLifecycleOwnerKtExternalSyntheticLambda0(this._additionalKeySerializers);
    }

    public Iterable<LiveData> onNavigationEvent() {
        return new LocalLifecycleOwnerKtExternalSyntheticLambda0(this._modifiers);
    }
}

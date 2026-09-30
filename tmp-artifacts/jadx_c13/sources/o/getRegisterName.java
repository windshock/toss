package o;

import io.realm.internal.OsList;
import javax.annotation.Nullable;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getRegisterName<T> {

    @Nullable
    public final Class<T> onExtraCallback;
    public final OsList onExtraCallbackWithResult;
    public final TombstoneProtosLogMessageOrBuilder onNavigationEvent;

    @Nullable
    public abstract T IAuthTabCallback(int i);

    protected abstract void IAuthTabCallback(@Nullable Object obj);

    protected abstract void onExtraCallback(int i, Object obj);

    protected abstract void onNavigationEvent(int i, Object obj);

    protected abstract void onNavigationEvent(Object obj);

    public getRegisterName(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsList osList, @Nullable Class<T> cls) {
        this.onNavigationEvent = tombstoneProtosLogMessageOrBuilder;
        this.onExtraCallback = cls;
        this.onExtraCallbackWithResult = osList;
    }

    public final OsList onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult.onExtraCallbackWithResult();
    }

    public final int onWarmupCompleted() {
        long jOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted();
        return jOnWarmupCompleted < 2147483647L ? (int) jOnWarmupCompleted : IntCompanionObject.MAX_VALUE;
    }

    public void onExtraCallback(int i) {
        int iOnWarmupCompleted = onWarmupCompleted();
        if (i < 0 || iOnWarmupCompleted < i) {
            throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.onExtraCallbackWithResult.onWarmupCompleted());
        }
    }

    public final void onExtraCallbackWithResult(@Nullable Object obj) {
        IAuthTabCallback(obj);
        if (obj == null) {
            onExtraCallbackWithResult();
        } else {
            onNavigationEvent(obj);
        }
    }

    private void onExtraCallbackWithResult() {
        this.onExtraCallbackWithResult.onNavigationEvent();
    }

    public final void onWarmupCompleted(int i, @Nullable T t) {
        IAuthTabCallback(t);
        if (t == null) {
            IAuthTabCallbackDefault(i);
        } else {
            onNavigationEvent(i, t);
        }
    }

    protected void IAuthTabCallbackDefault(int i) {
        this.onExtraCallbackWithResult.asBinder(i);
    }

    @Nullable
    public final T onExtraCallbackWithResult(int i, @Nullable Object obj) {
        IAuthTabCallback(obj);
        T tIAuthTabCallback = IAuthTabCallback(i);
        if (obj == null) {
            IAuthTabCallbackStub(i);
            return tIAuthTabCallback;
        }
        onExtraCallback(i, obj);
        return tIAuthTabCallback;
    }

    protected void IAuthTabCallbackStub(int i) {
        this.onExtraCallbackWithResult.onTransact(i);
    }

    public final void onTransact(int i) {
        this.onExtraCallbackWithResult.IAuthTabCallbackStub(i);
    }

    public final void onExtraCallback() {
        this.onExtraCallbackWithResult.IAuthTabCallback();
    }
}

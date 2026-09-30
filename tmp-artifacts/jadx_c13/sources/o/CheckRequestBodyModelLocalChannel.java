package o;

import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class CheckRequestBodyModelLocalChannel extends GeckoHubImp {
    private access6900<GeckoLogger<?>> IAuthTabCallback;
    private long onExtraCallback;
    private boolean onNavigationEvent;

    private final long onWarmupCompleted(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public void onExtraCallback() {
    }

    public boolean onTransact() {
        return false;
    }

    public long asBinder() {
        if (IAuthTabCallbackDefault()) {
            return 0L;
        }
        return LongCompanionObject.MAX_VALUE;
    }

    protected boolean onNavigationEvent() {
        return asInterface();
    }

    protected long IAuthTabCallback() {
        access6900<GeckoLogger<?>> access6900Var = this.IAuthTabCallback;
        if (access6900Var == null || access6900Var.isEmpty()) {
            return LongCompanionObject.MAX_VALUE;
        }
        return 0L;
    }

    public final boolean IAuthTabCallbackDefault() {
        GeckoLogger<?> geckoLoggerOnWarmupCompleted;
        access6900<GeckoLogger<?>> access6900Var = this.IAuthTabCallback;
        if (access6900Var == null || (geckoLoggerOnWarmupCompleted = access6900Var.onWarmupCompleted()) == null) {
            return false;
        }
        geckoLoggerOnWarmupCompleted.run();
        return true;
    }

    public final void IAuthTabCallback(@NotNull GeckoLogger<?> geckoLogger) {
        access6900<GeckoLogger<?>> access6900Var = this.IAuthTabCallback;
        if (access6900Var == null) {
            access6900Var = new access6900<>();
            this.IAuthTabCallback = access6900Var;
        }
        access6900Var.addLast(geckoLogger);
    }

    public final boolean onWarmupCompleted() {
        return this.onExtraCallback >= onWarmupCompleted(true);
    }

    public final boolean asInterface() {
        access6900<GeckoLogger<?>> access6900Var = this.IAuthTabCallback;
        if (access6900Var != null) {
            return access6900Var.isEmpty();
        }
        return true;
    }

    public static /* synthetic */ void onNavigationEvent(CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannel, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        checkRequestBodyModelLocalChannel.IAuthTabCallback(z);
    }

    public final void IAuthTabCallback(boolean z) {
        this.onExtraCallback += onWarmupCompleted(z);
        if (z) {
            return;
        }
        this.onNavigationEvent = true;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannel, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        checkRequestBodyModelLocalChannel.onExtraCallbackWithResult(z);
    }

    public final void onExtraCallbackWithResult(boolean z) {
        long jOnWarmupCompleted = this.onExtraCallback - onWarmupCompleted(z);
        this.onExtraCallback = jOnWarmupCompleted;
        if (jOnWarmupCompleted > 0 || !this.onNavigationEvent) {
            return;
        }
        onExtraCallback();
    }

    @Override // o.GeckoHubImp
    public final GeckoHubImp onWarmupCompleted(int i, @Nullable String str) {
        setShowDividerHorizontal.onNavigationEvent(i);
        return setShowDividerHorizontal.onExtraCallback(this, str);
    }
}

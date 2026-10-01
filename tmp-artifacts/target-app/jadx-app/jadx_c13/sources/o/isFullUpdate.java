package o;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.sequences.Sequence;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class isFullUpdate {
    public static /* synthetic */ setDeployments onExtraCallback(getPackageType getpackagetype, boolean z, isPatchUpdate ispatchupdate, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return getFullPackage.onExtraCallback(getpackagetype, z, ispatchupdate);
    }

    final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        onNavigationEvent(Object obj) {
            super(1, obj, isPatchUpdate.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            onWarmupCompleted(th);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(Throwable th) {
            ((isPatchUpdate) this.receiver).onWarmupCompleted(th);
        }
    }

    public static final setDeployments IAuthTabCallback(@NotNull getPackageType getpackagetype, boolean z, @NotNull isPatchUpdate ispatchupdate) {
        return getpackagetype instanceof setFullPackage ? ((setFullPackage) getpackagetype).onExtraCallback(z, ispatchupdate) : getpackagetype.onWarmupCompleted(ispatchupdate.onExtraCallback(), z, new onNavigationEvent(ispatchupdate));
    }

    public static /* synthetic */ waitForLayout IAuthTabCallback(getPackageType getpackagetype, int i, Object obj) {
        if ((i & 1) != 0) {
            getpackagetype = null;
        }
        return getFullPackage.onExtraCallbackWithResult(getpackagetype);
    }

    public static final waitForLayout onNavigationEvent(@Nullable getPackageType getpackagetype) {
        return new getLocalVersion(getpackagetype);
    }

    public static final setDeployments onNavigationEvent(@NotNull getPackageType getpackagetype, @NotNull setDeployments setdeployments) {
        return onExtraCallback(getpackagetype, false, new setLocal(setdeployments), 1, null);
    }

    public static final Object onNavigationEvent(@NotNull getPackageType getpackagetype, @NotNull access13800<? super Unit> access13800Var) {
        getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
        Object objOnNavigationEvent = getpackagetype.onNavigationEvent(access13800Var);
        return objOnNavigationEvent == access14100.onExtraCallback() ? objOnNavigationEvent : Unit.INSTANCE;
    }

    public static final boolean onWarmupCompleted(@NotNull CoroutineContext coroutineContext) {
        getPackageType getpackagetype = (getPackageType) coroutineContext.get(getPackageType.onNavigationEvent);
        if (getpackagetype != null) {
            return getpackagetype.onExtraCallback();
        }
        return true;
    }

    public static /* synthetic */ void onExtraCallback(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        getFullPackage.onWarmupCompleted(coroutineContext, cancellationException);
    }

    public static final void onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        getPackageType getpackagetype = (getPackageType) coroutineContext.get(getPackageType.onNavigationEvent);
        if (getpackagetype != null) {
            getpackagetype.onNavigationEvent(cancellationException);
        }
    }

    public static final void onExtraCallback(@NotNull getPackageType getpackagetype) {
        if (!getpackagetype.onExtraCallback()) {
            throw getpackagetype.asBinder();
        }
    }

    public static final void onExtraCallback(@NotNull CoroutineContext coroutineContext) {
        getPackageType getpackagetype = (getPackageType) coroutineContext.get(getPackageType.onNavigationEvent);
        if (getpackagetype != null) {
            getFullPackage.IAuthTabCallback(getpackagetype);
        }
    }

    public static final void onExtraCallback(@NotNull getPackageType getpackagetype, @NotNull String str, @Nullable Throwable th) {
        getpackagetype.onNavigationEvent(getUniversalStrategies.onExtraCallbackWithResult(str, th));
    }

    public static /* synthetic */ void onWarmupCompleted(getPackageType getpackagetype, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        getFullPackage.onWarmupCompleted(getpackagetype, str, th);
    }

    public static /* synthetic */ void IAuthTabCallback(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        getFullPackage.onExtraCallbackWithResult(coroutineContext, cancellationException);
    }

    public static final void onNavigationEvent(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        Sequence<getPackageType> sequenceCm_;
        getPackageType getpackagetype = (getPackageType) coroutineContext.get(getPackageType.onNavigationEvent);
        if (getpackagetype == null || (sequenceCm_ = getpackagetype.cm_()) == null) {
            return;
        }
        Iterator<getPackageType> itIAuthTabCallback = sequenceCm_.IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            itIAuthTabCallback.next().onNavigationEvent(cancellationException);
        }
    }

    public static final getPackageType onNavigationEvent(@NotNull CoroutineContext coroutineContext) {
        getPackageType getpackagetype = (getPackageType) coroutineContext.get(getPackageType.onNavigationEvent);
        if (getpackagetype != null) {
            return getpackagetype;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }
}

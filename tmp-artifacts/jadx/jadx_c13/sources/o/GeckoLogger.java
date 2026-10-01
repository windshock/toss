package o;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class GeckoLogger<T> extends jni_YGNodeIsDirtyJNI {
    public int IAuthTabCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T IAuthTabCallback(@Nullable Object obj) {
        return obj;
    }

    public void IAuthTabCallback(@Nullable Object obj, @NotNull Throwable th) {
    }

    public abstract Object access100();

    public abstract access13800<T> onExtraCallbackWithResult();

    public GeckoLogger(int i) {
        this.IAuthTabCallback = i;
    }

    public Throwable onNavigationEvent(@Nullable Object obj) {
        ILoader iLoader = obj instanceof ILoader ? (ILoader) obj : null;
        if (iLoader != null) {
            return iLoader.IAuthTabCallback;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            access13800<T> access13800VarOnExtraCallbackWithResult = onExtraCallbackWithResult();
            Intrinsics.checkNotNull(access13800VarOnExtraCallbackWithResult, "");
            setFlexWrap setflexwrap = (setFlexWrap) access13800VarOnExtraCallbackWithResult;
            access13800<T> access13800Var = setflexwrap.onWarmupCompleted;
            Object obj = setflexwrap.onNavigationEvent;
            CoroutineContext context = access13800Var.getContext();
            Object objOnNavigationEvent = getViewPager.onNavigationEvent(context, obj);
            getPackageType getpackagetype = null;
            doPost<?> dopostOnWarmupCompleted = objOnNavigationEvent != getViewPager.IAuthTabCallback ? StatisticData.onWarmupCompleted(access13800Var, context, objOnNavigationEvent) : null;
            try {
                CoroutineContext context2 = access13800Var.getContext();
                Object objAccess100 = access100();
                Throwable thOnNavigationEvent = onNavigationEvent(objAccess100);
                if (thOnNavigationEvent == null && redirect.onWarmupCompleted(this.IAuthTabCallback)) {
                    getpackagetype = (getPackageType) context2.get(getPackageType.onNavigationEvent);
                }
                if (getpackagetype != null && !getpackagetype.onExtraCallback()) {
                    CancellationException cancellationExceptionAsBinder = getpackagetype.asBinder();
                    IAuthTabCallback(objAccess100, cancellationExceptionAsBinder);
                    Result.Companion companion = Result.Companion;
                    access13800Var.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(cancellationExceptionAsBinder)));
                } else if (thOnNavigationEvent != null) {
                    Result.Companion companion2 = Result.Companion;
                    access13800Var.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(thOnNavigationEvent)));
                } else {
                    Result.Companion companion3 = Result.Companion;
                    access13800Var.resumeWith(Result.m31constructorimpl(IAuthTabCallback(objAccess100)));
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                if (dopostOnWarmupCompleted == null || dopostOnWarmupCompleted.onActivityLayout()) {
                    getViewPager.onExtraCallbackWithResult(context, objOnNavigationEvent);
                }
            }
        } catch (DefaultLogger e) {
            inst.onNavigationEvent(onExtraCallbackWithResult().getContext(), e.getCause());
        } catch (Throwable th) {
            onWarmupCompleted(th);
        }
    }

    public final void onWarmupCompleted(@NotNull Throwable th) {
        inst.onNavigationEvent(onExtraCallbackWithResult().getContext(), new getGeckoResLoader("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }
}

package o;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setMaxLine {
    private static final djExternalSyntheticApiModelOutline0 IAuthTabCallback = new djExternalSyntheticApiModelOutline0("UNDEFINED");
    public static final djExternalSyntheticApiModelOutline0 onExtraCallback = new djExternalSyntheticApiModelOutline0("REUSABLE_CLAIMED");

    public static final void IAuthTabCallback(@NotNull GeckoHubImp geckoHubImp, @NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        try {
            geckoHubImp.onWarmupCompleted(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new DefaultLogger(th, geckoHubImp, coroutineContext);
        }
    }

    public static final boolean onWarmupCompleted(@NotNull GeckoHubImp geckoHubImp, @NotNull CoroutineContext coroutineContext) throws DefaultLogger {
        try {
            return geckoHubImp.onExtraCallbackWithResult(coroutineContext);
        } catch (Throwable th) {
            throw new DefaultLogger(th, geckoHubImp, coroutineContext);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[Catch: all -> 0x00a1, DONT_GENERATE, TryCatch #0 {all -> 0x00a1, blocks: (B:13:0x003c, B:15:0x004a, B:17:0x0050, B:28:0x008d, B:18:0x0065, B:20:0x0075, B:25:0x0084, B:27:0x008a, B:33:0x0097, B:36:0x00a0, B:35:0x009d, B:23:0x007b), top: B:46:0x003c, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void onNavigationEvent(@NotNull access13800<? super T> access13800Var, @NotNull Object obj) {
        getPackageType getpackagetype;
        if (!(access13800Var instanceof setFlexWrap)) {
            access13800Var.resumeWith(obj);
            return;
        }
        setFlexWrap setflexwrap = (setFlexWrap) access13800Var;
        Object objOnNavigationEvent = InterceptorModel.onNavigationEvent(obj);
        if (onWarmupCompleted(setflexwrap.onExtraCallback, setflexwrap.getContext())) {
            setflexwrap.onExtraCallbackWithResult = objOnNavigationEvent;
            setflexwrap.IAuthTabCallback = 1;
            IAuthTabCallback(setflexwrap.onExtraCallback, setflexwrap.getContext(), setflexwrap);
            return;
        }
        CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannelIAuthTabCallback = isDeleteIfFail.onExtraCallbackWithResult.IAuthTabCallback();
        if (checkRequestBodyModelLocalChannelIAuthTabCallback.onWarmupCompleted()) {
            setflexwrap.onExtraCallbackWithResult = objOnNavigationEvent;
            setflexwrap.IAuthTabCallback = 1;
            checkRequestBodyModelLocalChannelIAuthTabCallback.IAuthTabCallback(setflexwrap);
            return;
        }
        checkRequestBodyModelLocalChannelIAuthTabCallback.IAuthTabCallback(true);
        try {
            getpackagetype = (getPackageType) setflexwrap.getContext().get(getPackageType.onNavigationEvent);
        } finally {
            try {
            } finally {
            }
        }
        if (getpackagetype != null && !getpackagetype.onExtraCallback()) {
            CancellationException cancellationExceptionAsBinder = getpackagetype.asBinder();
            setflexwrap.IAuthTabCallback(objOnNavigationEvent, cancellationExceptionAsBinder);
            Result.Companion companion = Result.Companion;
            setflexwrap.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(cancellationExceptionAsBinder)));
        } else {
            access13800<T> access13800Var2 = setflexwrap.onWarmupCompleted;
            Object obj2 = setflexwrap.onNavigationEvent;
            CoroutineContext context = access13800Var2.getContext();
            Object objOnNavigationEvent2 = getViewPager.onNavigationEvent(context, obj2);
            doPost<?> dopostOnWarmupCompleted = objOnNavigationEvent2 != getViewPager.IAuthTabCallback ? StatisticData.onWarmupCompleted(access13800Var2, context, objOnNavigationEvent2) : null;
            try {
                setflexwrap.onWarmupCompleted.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
            } finally {
                if (dopostOnWarmupCompleted == null || dopostOnWarmupCompleted.onActivityLayout()) {
                    getViewPager.onExtraCallbackWithResult(context, objOnNavigationEvent2);
                }
            }
        }
        while (checkRequestBodyModelLocalChannelIAuthTabCallback.IAuthTabCallbackDefault()) {
        }
    }

    public static final boolean onWarmupCompleted(@NotNull setFlexWrap<? super Unit> setflexwrap) {
        Unit unit = Unit.INSTANCE;
        CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannelIAuthTabCallback = isDeleteIfFail.onExtraCallbackWithResult.IAuthTabCallback();
        if (checkRequestBodyModelLocalChannelIAuthTabCallback.asInterface()) {
            return false;
        }
        if (checkRequestBodyModelLocalChannelIAuthTabCallback.onWarmupCompleted()) {
            setflexwrap.onExtraCallbackWithResult = unit;
            setflexwrap.IAuthTabCallback = 1;
            checkRequestBodyModelLocalChannelIAuthTabCallback.IAuthTabCallback(setflexwrap);
            return true;
        }
        checkRequestBodyModelLocalChannelIAuthTabCallback.IAuthTabCallback(true);
        try {
            setflexwrap.run();
            do {
            } while (checkRequestBodyModelLocalChannelIAuthTabCallback.IAuthTabCallbackDefault());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}

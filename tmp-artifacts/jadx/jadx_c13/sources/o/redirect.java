package o;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class redirect {
    public static final boolean onExtraCallbackWithResult(int i) {
        return i == 2;
    }

    public static final boolean onWarmupCompleted(int i) {
        return i == 1 || i == 2;
    }

    public static final <T> void onExtraCallback(@NotNull GeckoLogger<? super T> geckoLogger, int i) {
        access13800<? super T> access13800VarOnExtraCallbackWithResult = geckoLogger.onExtraCallbackWithResult();
        boolean z = i == 4;
        if (!z && (access13800VarOnExtraCallbackWithResult instanceof setFlexWrap) && onWarmupCompleted(i) == onWarmupCompleted(geckoLogger.IAuthTabCallback)) {
            setFlexWrap setflexwrap = (setFlexWrap) access13800VarOnExtraCallbackWithResult;
            GeckoHubImp geckoHubImp = setflexwrap.onExtraCallback;
            CoroutineContext context = setflexwrap.getContext();
            if (setMaxLine.onWarmupCompleted(geckoHubImp, context)) {
                setMaxLine.IAuthTabCallback(geckoHubImp, context, geckoLogger);
                return;
            } else {
                onNavigationEvent(geckoLogger);
                return;
            }
        }
        onWarmupCompleted(geckoLogger, access13800VarOnExtraCallbackWithResult, z);
    }

    public static final <T> void onWarmupCompleted(@NotNull GeckoLogger<? super T> geckoLogger, @NotNull access13800<? super T> access13800Var, boolean z) {
        Object objIAuthTabCallback;
        Object objAccess100 = geckoLogger.access100();
        Throwable thOnNavigationEvent = geckoLogger.onNavigationEvent(objAccess100);
        if (thOnNavigationEvent != null) {
            Result.Companion companion = Result.Companion;
            objIAuthTabCallback = ResultKt.createFailure(thOnNavigationEvent);
        } else {
            Result.Companion companion2 = Result.Companion;
            objIAuthTabCallback = geckoLogger.IAuthTabCallback(objAccess100);
        }
        Object objM31constructorimpl = Result.m31constructorimpl(objIAuthTabCallback);
        if (z) {
            Intrinsics.checkNotNull(access13800Var, "");
            setFlexWrap setflexwrap = (setFlexWrap) access13800Var;
            access13800<T> access13800Var2 = setflexwrap.onWarmupCompleted;
            Object obj = setflexwrap.onNavigationEvent;
            CoroutineContext context = access13800Var2.getContext();
            Object objOnNavigationEvent = getViewPager.onNavigationEvent(context, obj);
            doPost<?> dopostOnWarmupCompleted = objOnNavigationEvent != getViewPager.IAuthTabCallback ? StatisticData.onWarmupCompleted(access13800Var2, context, objOnNavigationEvent) : null;
            try {
                setflexwrap.onWarmupCompleted.resumeWith(objM31constructorimpl);
                Unit unit = Unit.INSTANCE;
                if (dopostOnWarmupCompleted == null || dopostOnWarmupCompleted.onActivityLayout()) {
                    getViewPager.onExtraCallbackWithResult(context, objOnNavigationEvent);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (dopostOnWarmupCompleted == null || dopostOnWarmupCompleted.onActivityLayout()) {
                    getViewPager.onExtraCallbackWithResult(context, objOnNavigationEvent);
                }
                throw th;
            }
        }
        access13800Var.resumeWith(objM31constructorimpl);
    }

    private static final void onNavigationEvent(GeckoLogger<?> geckoLogger) {
        CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannelIAuthTabCallback = isDeleteIfFail.onExtraCallbackWithResult.IAuthTabCallback();
        if (checkRequestBodyModelLocalChannelIAuthTabCallback.onWarmupCompleted()) {
            checkRequestBodyModelLocalChannelIAuthTabCallback.IAuthTabCallback(geckoLogger);
            return;
        }
        checkRequestBodyModelLocalChannelIAuthTabCallback.IAuthTabCallback(true);
        try {
            onWarmupCompleted(geckoLogger, geckoLogger.onExtraCallbackWithResult(), true);
            do {
            } while (checkRequestBodyModelLocalChannelIAuthTabCallback.IAuthTabCallbackDefault());
        } finally {
            try {
            } finally {
            }
        }
    }
}

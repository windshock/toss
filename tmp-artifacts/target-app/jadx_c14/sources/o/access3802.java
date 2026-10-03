package o;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.state.spec.SessionState;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import viva.republica.toss.core.AppStateManager;
import viva.republica.toss.home.launcher.LauncherVerdictSessionObserver$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class access3802 {
    private static Long IAuthTabCallback;
    public static final access3802 onExtraCallbackWithResult = new access3802();
    private static final findResAndMsg onWarmupCompleted = findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
    private static final AtomicBoolean onNavigationEvent = new AtomicBoolean(false);
    private static final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new LauncherVerdictSessionObserver$.ExternalSyntheticLambda0());
    public static final int onExtraCallback = 8;

    private access3802() {
    }

    private final SessionState onExtraCallback() {
        return (SessionState) asInterface.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionState asInterface() {
        Response response = Response.onNavigationEvent;
        return ((SessionState.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), SessionState.onExtraCallback.class)).performMenuItemShortcut();
    }

    public final void IAuthTabCallback() {
        if (onNavigationEvent.compareAndSet(false, true)) {
            onExtraCallback().onExtraCallbackWithResult(false).onWarmupCompleted(new LauncherVerdictSessionObserver$.ExternalSyntheticLambda2(new LauncherVerdictSessionObserver$.ExternalSyntheticLambda1())).onWarmupCompleted(NetConverter3.onExtraCallback()).onWarmupCompleted(new LauncherVerdictSessionObserver$.ExternalSyntheticLambda4(new LauncherVerdictSessionObserver$.ExternalSyntheticLambda3()), new LauncherVerdictSessionObserver$.ExternalSyntheticLambda6(new LauncherVerdictSessionObserver$.ExternalSyntheticLambda5()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallback(SessionState.State state) {
        Intrinsics.checkNotNullParameter(state, "");
        return state instanceof SessionState.State.SessionFinished;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallbackWithResult(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(SessionState.State state) {
        Object obj;
        access3802 access3802Var = onExtraCallbackWithResult;
        try {
            Result.Companion companion = Result.Companion;
            access3802Var.onNavigationEvent();
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LauncherVerdictSession", "세션 종료 처리 실패: " + th2, null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asBinder(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Throwable th) {
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LauncherVerdictSession", "세션 상태 구독 실패: " + th, null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent() {
        if (AppStateManager.onExtraCallbackWithResult.onActivityResized()) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LauncherVerdictSession", "해제 취소 — 액티비티 생존", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            return;
        }
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LauncherVerdictSession", "세션 종료 — 런처 판정 고정 해제", access8100.onNavigationEvent(getWrite.IAuthTabCallback("releasedVerdict", String.valueOf(access3902.onWarmupCompleted.onNavigationEvent()))), (String) null, false, (String) null, 56, (Object) null);
        if (onWarmupCompleted()) {
            IAuthTabCallbackDefault();
        }
    }

    private final boolean onWarmupCompleted() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = IAuthTabCallback;
        if (l != null && jElapsedRealtime - l.longValue() < 1800000) {
            return false;
        }
        IAuthTabCallback = Long.valueOf(jElapsedRealtime);
        return true;
    }

    private final void IAuthTabCallbackDefault() {
        maybeUpdateAnimatable.onNavigationEvent(onWarmupCompleted, putChannelInfo.onExtraCallback(), (setRandomHost) null, new onNavigationEvent((access13800) null), 2, (Object) null);
    }
}

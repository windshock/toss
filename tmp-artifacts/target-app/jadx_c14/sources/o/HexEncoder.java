package o;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import com.google.android.gms.common.GoogleApiAvailability;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.HexEncoder;
import o.HexTranslator;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class HexEncoder {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final boolean onNavigationEvent(@NotNull final Activity activity, boolean z) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity.isFinishing() || activity.isDestroyed()) {
            return false;
        }
        HexTranslator.onExtraCallbackWithResult onExtraCallbackWithResult = HexTranslator.onExtraCallbackWithResult(HexTranslator.onWarmupCompleted, activity, null, z, 2, null);
        if (Intrinsics.areEqual(onExtraCallbackWithResult, HexTranslator.onExtraCallbackWithResult.onNavigationEvent.onNavigationEvent)) {
            return true;
        }
        if (onExtraCallbackWithResult instanceof HexTranslator.onExtraCallbackWithResult.onExtraCallback) {
            if (!IAuthTabCallback(activity, ((HexTranslator.onExtraCallbackWithResult.onExtraCallback) onExtraCallbackWithResult).onExtraCallback(), new Function0() { // from class: viva.republica.toss.googleplay.GooglePlayServiceNoticesKt$$ExternalSyntheticLambda3
                public final Object invoke() {
                    return HexEncoder.onExtraCallbackWithResult(activity);
                }
            })) {
                onNavigationEvent(activity);
            }
            return false;
        }
        if (!Intrinsics.areEqual(onExtraCallbackWithResult, HexTranslator.onExtraCallbackWithResult.C0002onExtraCallbackWithResult.onWarmupCompleted)) {
            throw new NoWhenBranchMatchedException();
        }
        onNavigationEvent(activity);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Activity activity) {
        activity.finish();
        return Unit.INSTANCE;
    }

    public static final void onNavigationEvent(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity.isFinishing() || activity.isDestroyed() || CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(activity, new Function1() { // from class: viva.republica.toss.googleplay.GooglePlayServiceNoticesKt$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return HexEncoder.onWarmupCompleted(activity, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        }).isShowing()) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(final Activity activity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(R.string.guardian_simple_info_push_token_error_google_play_service));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(new Function1() { // from class: viva.republica.toss.googleplay.GooglePlayServiceNoticesKt$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return HexEncoder.IAuthTabCallback(activity, (DialogInterface) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(Activity activity, DialogInterface dialogInterface) {
        activity.finish();
        return Unit.INSTANCE;
    }

    public static final boolean IAuthTabCallback(@NotNull final Activity activity, int i, @NotNull final Function0<Unit> function0) {
        final PendingIntent errorResolutionPendingIntent;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (activity.isFinishing() || activity.isDestroyed() || (errorResolutionPendingIntent = GoogleApiAvailability.getInstance().getErrorResolutionPendingIntent(activity, i, 9000)) == null) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        return CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(activity, new Function1() { // from class: viva.republica.toss.googleplay.GooglePlayServiceNoticesKt$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return HexEncoder.onNavigationEvent(booleanRef, activity, errorResolutionPendingIntent, function0, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        }).isShowing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(final Ref.BooleanRef booleanRef, final Activity activity, final PendingIntent pendingIntent, final Function0 function0, final CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(R.string.guardian_simple_info_push_token_error_google_play_service));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.googleplay.GooglePlayServiceNoticesKt$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return HexEncoder.onExtraCallbackWithResult(booleanRef, commonModule_setLeftEdgeTouchEnabled, activity, pendingIntent, (DialogInterface) obj);
            }
        })};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(new Function1() { // from class: viva.republica.toss.googleplay.GooglePlayServiceNoticesKt$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return HexEncoder.onNavigationEvent(booleanRef, activity, function0, (DialogInterface) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Ref.BooleanRef booleanRef, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, Activity activity, PendingIntent pendingIntent, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        booleanRef.element = true;
        try {
            Result.Companion companion = Result.Companion;
            activity.startIntentSender(pendingIntent.getIntentSender(), null, 0, 0, 0);
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        dialogInterface.dismiss();
        activity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(Ref.BooleanRef booleanRef, Activity activity, Function0 function0, DialogInterface dialogInterface) {
        if (!booleanRef.element && !activity.isChangingConfigurations()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}

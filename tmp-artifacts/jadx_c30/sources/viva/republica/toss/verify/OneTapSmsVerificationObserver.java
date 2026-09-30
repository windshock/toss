package viva.republica.toss.verify;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.ConvertFloatArrayToByteArray;
import o.IEngagementSignalsCallback_Parcel;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.zzbb;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class OneTapSmsVerificationObserver implements DefaultLifecycleObserver {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onWarmupCompleted = 8;
    private final Lazy IAuthTabCallback;
    private final ComponentActivity onExtraCallback;
    private final IEngagementSignalsCallback_Parcel<Bundle> onExtraCallbackWithResult;
    private final Function1<String, Unit> onNavigationEvent;

    public /* bridge */ void onCreate(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
    }

    public /* bridge */ void onDestroy(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
    }

    public /* bridge */ void onPause(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        super.onPause(textFieldScrollKtExternalSyntheticLambda0);
    }

    public /* bridge */ void onResume(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        super.onResume(textFieldScrollKtExternalSyntheticLambda0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(OneTapSmsVerificationObserver oneTapSmsVerificationObserver, String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        oneTapSmsVerificationObserver.onNavigationEvent.invoke(str);
    }

    public static final class onExtraCallbackWithResult extends BroadcastReceiver {
        onExtraCallbackWithResult() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(intent, BuildConfig.FLAVOR);
            if (Intrinsics.areEqual("com.google.android.gms.auth.api.phone.SMS_RETRIEVED", intent.getAction())) {
                Bundle extras = intent.getExtras();
                Object obj = extras != null ? extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null;
                Intrinsics.checkNotNull(obj, BuildConfig.FLAVOR);
                if (((Status) obj).getStatusCode() == 0) {
                    try {
                        OneTapSmsVerificationObserver.this.onExtraCallbackWithResult.onNavigationEvent(extras);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                OneTapSmsVerificationObserver.this.onNavigationEvent();
            }
        }
    }

    private final BroadcastReceiver IAuthTabCallback() {
        return (BroadcastReceiver) this.IAuthTabCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final onExtraCallbackWithResult onNavigationEvent(OneTapSmsVerificationObserver oneTapSmsVerificationObserver) {
        return oneTapSmsVerificationObserver.new onExtraCallbackWithResult();
    }

    public void onStart(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, BuildConfig.FLAVOR);
        super.onStart(textFieldScrollKtExternalSyntheticLambda0);
        onNavigationEvent();
        zzbb.onWarmupCompleted(IAuthTabCallback(), this.onExtraCallback, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), 2);
    }

    public void onStop(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, BuildConfig.FLAVOR);
        zzbb.onWarmupCompleted(IAuthTabCallback(), this.onExtraCallback);
        super.onStop(textFieldScrollKtExternalSyntheticLambda0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNavigationEvent() {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(SmsRetriever.getClient(this.onExtraCallback).startSmsUserConsent((String) null).addOnFailureListener(new OnFailureListener() { // from class: viva.republica.toss.verify.OneTapSmsVerificationObserver$$ExternalSyntheticLambda0
                public final void onFailure(Exception exc) {
                    OneTapSmsVerificationObserver.onExtraCallback(exc);
                }
            }));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("OneTapSmsVerificationObserver", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, BuildConfig.FLAVOR);
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("OneTapSmsVerificationObserver", exc);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}

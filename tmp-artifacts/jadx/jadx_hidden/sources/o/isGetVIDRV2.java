package o;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: classes.dex */
public final class isGetVIDRV2 {
    public static final isGetVIDRV2 IAuthTabCallback = new isGetVIDRV2();

    private isGetVIDRV2() {
    }

    public final String onExtraCallback(@NotNull String str) {
        String strOnExtraCallbackWithResult;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            strOnExtraCallbackWithResult = addPolicy.ITrustedWebActivityServiceStub().onExtraCallbackWithResult(str, "");
        }
        return strOnExtraCallbackWithResult;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable String str2) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            if (str2 == null) {
                str2 = "";
            }
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.IAuthTabCallback(str, str2, true);
        }
    }

    public final void onExtraCallback(@NotNull String str, @Nullable String str2) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = getParameterMap.onExtraCallback();
            if (str2 == null) {
                str2 = "";
            }
            textRoundCornerProgressBarSavedState1OnExtraCallback.IAuthTabCallback(str, str2, true);
        }
    }

    public final String onWarmupCompleted(@NotNull String str) {
        String strOnExtraCallbackWithResult;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            strOnExtraCallbackWithResult = getParameterMap.onExtraCallback().onExtraCallbackWithResult(str, "");
        }
        return strOnExtraCallbackWithResult;
    }

    public final void onExtraCallbackWithResult() {
        onResponse.onWarmupCompleted.onWarmupCompleted();
        dispatchEvent.onNavigationEvent.onWarmupCompleted(true);
    }

    public final void onExtraCallback() {
        synchronized (this) {
            drawBackgroundProgress.IAuthTabCallback(getParameterMap.onExtraCallback(), true);
        }
    }

    public final String onNavigationEvent() {
        if (Build.VERSION.SDK_INT >= 30) {
            return "android.permission.READ_PHONE_NUMBERS";
        }
        return "android.permission.READ_PHONE_STATE";
    }

    public final String onWarmupCompleted(@NotNull Context context) {
        String line1Number;
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager != null) {
            try {
                if (ContextCompat.checkSelfPermission(context, onNavigationEvent()) == 0 && (line1Number = telephonyManager.getLine1Number()) != null) {
                    char[] charArray = line1Number.toCharArray();
                    Intrinsics.checkNotNullExpressionValue(charArray, "");
                    if (charArray.length > 1) {
                        return TinyBlurMenu3.onExtraCallback(StringsKt.replace$default(StringsKt.replace$default(line1Number, " ", "", false, 4, (Object) null), "-", "", false, 4, (Object) null));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    @JvmStatic
    public static final void onExtraCallbackWithResult(@Nullable Context context, @NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (IAuthTabCallback.onNavigationEvent(context) || context == null) {
            return;
        }
        view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.shake));
    }

    @JvmStatic
    public static final void onWarmupCompleted(@Nullable Context context, @Nullable String str) {
        if (IAuthTabCallback.onNavigationEvent(context) || context == null) {
            return;
        }
        Toast.makeText(context, str, 0).show();
    }

    public final void onNavigationEvent(@Nullable Context context, @Nullable String str) {
        if (onNavigationEvent(context) || context == null) {
            return;
        }
        Toast.makeText(context, str, 1).show();
    }

    public final void onExtraCallbackWithResult(@Nullable Context context) {
        if (onNavigationEvent(context) || context == null) {
            return;
        }
        Toast.makeText(context, R.string.network_error, 0).show();
    }

    private final boolean onNavigationEvent(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).isFinishing();
        }
        return context == null;
    }
}

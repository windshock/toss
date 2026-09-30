package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import im.toss.splittarget.impl.R;
import im.toss.state.spec.SessionState;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.pauseForClick;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.common.SchemeAlertActivity;
import viva.republica.toss.splash.InternalSchemeActivity;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdServiceImplExternalSyntheticLambda4 implements pauseForClick {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final zzad onExtraCallback;
    private final SessionState onNavigationEvent;

    @Inject
    public AppLovinAdServiceImplExternalSyntheticLambda4(@NotNull zzad zzadVar, @NotNull SessionState sessionState) {
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(sessionState, "");
        this.onExtraCallback = zzadVar;
        this.onNavigationEvent = sessionState;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    @Override // o.pauseForClick
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pauseForClick.onExtraCallbackWithResult onExtraCallbackWithResult(@NotNull Context context, @NotNull Uri uri, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        String strOnWarmupCompleted = onWarmupCompleted(uri, "_automation_session_id");
        if (strOnWarmupCompleted != null) {
            this.onNavigationEvent.onExtraCallback(strOnWarmupCompleted);
            int i4 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        String strOnWarmupCompleted2 = onWarmupCompleted(uri, "_minVerAos");
        if (strOnWarmupCompleted2 == null || StringsKt.isBlank(strOnWarmupCompleted2) || new ALCFeatureMatch(this.onExtraCallback.getSmallIconBitmap()).onExtraCallbackWithResult(new ALCFeatureMatch(strOnWarmupCompleted2)) >= 0) {
            return pauseForClick.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted;
        }
        String strOnWarmupCompleted3 = onWarmupCompleted(uri, "_minVerFallbackUrl");
        if (strOnWarmupCompleted3 != null) {
            int i6 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (StringsKt.isBlank(strOnWarmupCompleted3)) {
                onNavigationEvent(context, onWarmupCompleted(uri, "_minVerMessage"));
            } else {
                onWarmupCompleted(context, strOnWarmupCompleted3, z);
            }
        }
        return pauseForClick.onExtraCallbackWithResult.onWarmupCompleted.onWarmupCompleted;
    }

    private final void onWarmupCompleted(Context context, String str, boolean z) {
        Intent intentOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z) {
            intentOnWarmupCompleted = InternalSchemeActivity.IAuthTabCallback.onWarmupCompleted(InternalSchemeActivity.Companion, context, Uri.parse(str), (Bundle) null, 4, (Object) null);
        } else {
            intentOnWarmupCompleted = new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).setPackage(context.getPackageName());
            Intrinsics.checkNotNull(intentOnWarmupCompleted);
            int i3 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        try {
            context.startActivity(intentOnWarmupCompleted);
        } catch (ActivityNotFoundException e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SchemePreprocessor", "redirect failed: " + str, e, (Map) null, 8, (Object) null);
        }
    }

    private final void onNavigationEvent(Context context, String str) {
        int i = 2 % 2;
        SchemeAlertActivity.onNavigationEvent onnavigationevent = SchemeAlertActivity.Companion;
        String string = context.getString(R.string.split_target_impl_min_ver_app_update_dialog_title);
        if (str == null) {
            str = context.getString(R.string.split_target_impl_min_ver_app_update_dialog_message);
            Intrinsics.checkNotNullExpressionValue(str, "");
            int i2 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        context.startActivity(onnavigationevent.onExtraCallback(context, string, str, context.getString(R.string.split_target_impl_min_ver_app_update_dialog_positive_button), "market://details?id=" + context.getPackageName(), context.getString(R.string.split_target_impl_min_ver_app_update_dialog_negative_button), (String) null, true));
        int i4 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private final String onWarmupCompleted(Uri uri, String str) {
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(uri.getQueryParameter(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj2 = null;
        if (Result.onExtraCallback(obj)) {
            int i4 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            obj = null;
        }
        String str2 = (String) obj;
        int i6 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return str2;
        }
        obj2.hashCode();
        throw null;
    }
}

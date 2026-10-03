package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.splash.SplashSchemeActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JSApplicationCausedNativeException {
    public static final JSApplicationCausedNativeException onExtraCallbackWithResult = new JSApplicationCausedNativeException();

    private JSApplicationCausedNativeException() {
    }

    public final void onExtraCallbackWithResult(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(R.string.app_pedometer_permission_notification_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = context.getString(R.string.app_pedometer_permission_notification_subtitle);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Intent intentAddFlags = SplashSchemeActivity.onNavigationEvent.onExtraCallbackWithResult(SplashSchemeActivity.Companion, context, GuardedAsyncTask.IAuthTabCallback.onExtraCallbackWithResult("pedometer_widget"), false, (getJSQueueThread) null, 12, (Object) null).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "");
        Notification notificationOnWarmupCompleted = new NotificationCompat.access100(context, EventServiceImplExternalSyntheticLambda0.IMPORTANT.getId()).onExtraCallbackWithResult(new NotificationCompat.IAuthTabCallbackDefault().onNavigationEvent(string2)).onWarmupCompleted(string).IAuthTabCallback(string2).onExtraCallback(PendingIntent.getActivity(context, 0, intentAddFlags, 67108864)).onTransact(true).onExtraCallback(true).onNavigationEvent("pedometer").onExtraCallbackWithResult(ContextCompat.getColor(context, R.color.app_icon_color)).asInterface(im.toss.core.R.drawable.icon_toss_logo_mono).IAuthTabCallbackDefault(false).onTransact(1).IAuthTabCallbackDefault(5).onNavigationEvent(RingtoneManager.getDefaultUri(2)).IAuthTabCallback(NativeCrashReporter.DEFAULT.getPattern()).asInterface(true).onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(notificationOnWarmupCompleted, "");
        EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(context).onExtraCallback("pedometer_permission", 300, notificationOnWarmupCompleted);
    }

    public final void onExtraCallback(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(context).onNavigationEvent("pedometer_permission", 300);
    }
}

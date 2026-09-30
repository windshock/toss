package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import kotlin.jvm.internal.Intrinsics;
import o.Content;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class r8lambdaeZFGAqULWs2rNMV9lnqViN_DJc {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private Long IAuthTabCallback;
    private final Context onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    public r8lambdaeZFGAqULWs2rNMV9lnqViN_DJc(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = context;
        this.onWarmupCompleted = str;
    }

    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = Long.valueOf(SystemClock.elapsedRealtime());
        int i4 = onNavigationEvent + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNavigationEvent() {
        AFj1oSDKAFa1ySDK aFj1oSDKAFa1ySDK;
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!GetFeatureExtension.onWarmupCompleted.onActivityResized()) {
            return;
        }
        int i4 = onExtraCallback + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        Long l = this.IAuthTabCallback;
        if (l != null) {
            long jLongValue = l.longValue();
            AFj1oSDKAFa1ySDK aFj1oSDKAFa1ySDKIAuthTabCallback = IAuthTabCallback(this.onExtraCallbackWithResult);
            if (!(!(aFj1oSDKAFa1ySDKIAuthTabCallback instanceof AFj1oSDKAFa1ySDK))) {
                int i5 = onExtraCallback + 63;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                aFj1oSDKAFa1ySDK = aFj1oSDKAFa1ySDKIAuthTabCallback;
            } else {
                aFj1oSDKAFa1ySDK = null;
            }
            if (aFj1oSDKAFa1ySDK != null) {
                Content.onExtraCallback onextracallback = Content.Companion;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long screenId = aFj1oSDKAFa1ySDK.getScreenId();
                String screenName = aFj1oSDKAFa1ySDK.getScreenName();
                Intrinsics.checkNotNullExpressionValue(screenName, "");
                Object[] objArr = {onextracallback.IAuthTabCallback("loader_duration", jElapsedRealtime - jLongValue, screenId, screenName, aFj1oSDKAFa1ySDK.getClass().getSimpleName(), this.onWarmupCompleted)};
                ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -870178991, objArr, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
                this.IAuthTabCallback = null;
            }
        }
    }

    private static final Activity onNavigationEvent(Context context) {
        int i = 2 % 2;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                int i2 = onNavigationEvent + 51;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        int i4 = onExtraCallback + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final Activity IAuthTabCallback(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Activity activityOnNavigationEvent = onNavigationEvent(context);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        int i5 = onExtraCallback + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return activityOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

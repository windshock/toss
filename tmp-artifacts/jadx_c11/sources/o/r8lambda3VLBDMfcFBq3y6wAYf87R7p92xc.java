package o;

import android.content.Context;
import android.os.Bundle;
import im.toss.rn.toss.core.util.RnAppVersion;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda3VLBDMfcFBq3y6wAYf87R7p92xc {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    public static final r8lambda3VLBDMfcFBq3y6wAYf87R7p92xc onExtraCallbackWithResult = new r8lambda3VLBDMfcFBq3y6wAYf87R7p92xc();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 123;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private r8lambda3VLBDMfcFBq3y6wAYf87R7p92xc() {
    }

    public final Bundle onNavigationEvent(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        String str3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
            int i2 = onExtraCallback + 11;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str3 = "dark";
        } else {
            str3 = "light";
        }
        Bundle bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("initialColorPreference", str3), getWrite.IAuthTabCallback("initialFontScale", String.valueOf((int) (context.getResources().getConfiguration().fontScale * 100.0f))), getWrite.IAuthTabCallback("appVersion", RnAppVersion.onExtraCallback.onWarmupCompleted(context, zzaj.onNavigationEvent())), getWrite.IAuthTabCallback("networkStatus", onTextViewSizeChanged.onExtraCallbackWithResult.onWarmupCompleted(context)), getWrite.IAuthTabCallback("loadingStartTs", Long.valueOf(System.currentTimeMillis())), getWrite.IAuthTabCallback("isWarmup", Boolean.FALSE)});
        if (!setAdUnitIds.Companion.onNavigationEvent().IAuthTabCallback()) {
            bundleOnNavigationEvent.putLong("guestUserNo", setSegmentCollection.Companion.onWarmupCompleted().onExtraCallback());
        } else {
            int i3 = onNavigationEvent + 121;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            bundleOnNavigationEvent.putLong("gaNo", Long.parseLong(PlayerErrorCode.onActivityLayout()));
            bundleOnNavigationEvent.putLong("userNo", Long.parseLong(PlayerErrorCode.onMinimized()));
        }
        bundleOnNavigationEvent.putString("distributionGroup", str2);
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        bundleOnNavigationEvent.putString("region", upperCase);
        return bundleOnNavigationEvent;
    }
}

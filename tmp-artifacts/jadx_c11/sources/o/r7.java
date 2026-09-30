package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.securities.widget.common.ui.TossSecWidgetBridgeActivity;
import im.toss.securities.widget.common.utils.RoutesKt;
import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.securities.widget.data.model.overview.OverviewNotice;
import im.toss.securities.widget.data.model.overview.OverviewNoticeAlert;
import im.toss.securities.widget.overview.ui.medium.SecuritiesOverviewMediumAppWidgetReceiver;
import im.toss.securities.widget.overview.ui.medium.setting.OverviewMediumWidgetSettingActivity;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.r7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r7 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int asBinder = 1;
    private static int onExtraCallback;
    public static final r7 onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;

    static {
        IAuthTabCallback();
        onExtraCallbackWithResult = new r7();
        int i = onNavigationEvent + 63;
        asBinder = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ String IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            return (String) onNavigationEvent(785406249, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, -785406248, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{str, str2}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
        }
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(str, str2);
            throw null;
        }
        String strOnWarmupCompleted = onWarmupCompleted(str, str2);
        int i3 = IAuthTabCallback + 49;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return strOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i4;
        int i8 = ~(i7 | i);
        int i9 = ~i;
        int i10 = ~(i9 | i4);
        int i11 = ~((~i3) | i);
        int i12 = i10 | i11;
        int i13 = i11 | (~(i7 | i9));
        int i14 = i + i4 + i2 + ((-1232316077) * i5) + ((-263306238) * i6);
        int i15 = i14 * i14;
        int i16 = (((-69115011) * i) - 1785593856) + (933837065 * i4) + (763021048 * i8) + (1765973124 * i12) + ((-1765973124) * i13) + (1696858112 * i2) + (1319895040 * i5) + (1514668032 * i6) + (1334968320 * i15);
        int i17 = ((i * (-2046307327)) - 1888090795) + (i4 * (-2046308995)) + (i8 * 1112) + (i12 * (-556)) + (i13 * 556) + (i2 * (-2046307883)) + (i5 * 1526207759) + (i6 * (-1095616598)) + (i15 * 1719271424);
        if (i16 + (i17 * i17 * 2111700992) != 1) {
            return onExtraCallback(objArr);
        }
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int i18 = 2 % 2;
        int i19 = IAuthTabCallback + 107;
        onExtraCallback = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{37055, 30149, 37079, 55836, 6732, 24977, 61959, 9880}, Color.argb(0, 0, 0, 0) + 1, objArr2);
        String strOnExtraCallback = RoutesKt.onExtraCallback(str, ((String) objArr2[0]).intern(), null, str2, 4, null);
        int i21 = IAuthTabCallback + 35;
        onExtraCallback = i21 % 128;
        int i22 = i21 % 2;
        return strOnExtraCallback;
    }

    private r7() {
    }

    public final PendingIntent onWarmupCompleted(@NotNull Context context, int i, @Nullable String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 65;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullExpressionValue(PendingIntent.getActivity(context, i, onExtraCallback(context, RoutesKt.IAuthTabCallback(str), i, "im.toss.securities.widget.overview.ACTION_OPEN_MEDIUM"), 201326592), "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        PendingIntent activity = PendingIntent.getActivity(context, i, onExtraCallback(context, RoutesKt.IAuthTabCallback(str), i, "im.toss.securities.widget.overview.ACTION_OPEN_MEDIUM"), 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i4 = IAuthTabCallback + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return activity;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 5;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 99;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45811), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 84, 21233 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14184), 19 - TextUtils.indexOf("", "", 0, 0), 8808 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public final PendingIntent onNavigationEvent(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        PendingIntent activity = PendingIntent.getActivity(context, i, onExtraCallback(context, RoutesKt.onExtraCallback(), i, "im.toss.securities.widget.overview.ACTION_OPEN_MEDIUM"), 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i5 = IAuthTabCallback + 77;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return activity;
    }

    public final PendingIntent onExtraCallback(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intent = new Intent(context, (Class<?>) SecuritiesOverviewMediumAppWidgetReceiver.class);
        intent.setAction("im.toss.securities.widget.overview.ACTION_REFRESH_MEDIUM");
        intent.putExtra("appWidgetId", i);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "");
        int i3 = IAuthTabCallback + 7;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return broadcast;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Context context = (Context) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intent = new Intent(context, (Class<?>) OverviewMediumWidgetSettingActivity.class);
        intent.putExtra("appWidgetId", iIntValue);
        intent.putExtra("widgetType", "myAsset");
        intent.putExtra("widgetSize", onExtraCallbackWithResult.onExtraCallbackWithResult(iIntValue));
        intent.setFlags(268468224);
        PendingIntent activity = PendingIntent.getActivity(context, iIntValue + 10000, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return activity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PendingIntent IAuthTabCallback(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intent = new Intent(context, (Class<?>) TossSecWidgetBridgeActivity.class);
        intent.setAction("im.toss.securities.widget.overview.ACTION_STOCK_DETAIL_MEDIUM");
        intent.putExtra("appWidgetId", i);
        intent.putExtra("widget_type", "myAsset");
        intent.putExtra("widget_size", onExtraCallbackWithResult.onExtraCallbackWithResult(i));
        PendingIntent activity = PendingIntent.getActivity(context, i + 20000, intent, 167772160);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i3 = onExtraCallback + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Intent IAuthTabCallback(r7 r7Var, OverviewItemInfo overviewItemInfo, String str, Function2 function2, Function2 function22, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            function2 = new Function2() { // from class: im.toss.securities.widget.overview.ui.medium.OverviewMediumWidgetActions$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj2, Object obj3) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 13;
                    onExtraCallback = i6 % 128;
                    String str2 = (String) obj2;
                    String str3 = (String) obj3;
                    if (i6 % 2 == 0) {
                        return r7.IAuthTabCallback(str2, str3);
                    }
                    r7.IAuthTabCallback(str2, str3);
                    throw null;
                }
            };
        }
        if ((i & 8) != 0) {
            function22 = new Function2() { // from class: im.toss.securities.widget.overview.ui.medium.OverviewMediumWidgetActions$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) throws Throwable {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 95;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    String strOnExtraCallbackWithResult = r7.onExtraCallbackWithResult((String) obj2, (String) obj3);
                    int i8 = IAuthTabCallback + 9;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    return strOnExtraCallbackWithResult;
                }
            };
        }
        Intent intentOnExtraCallback = r7Var.onExtraCallback(overviewItemInfo, str, (Function2<? super String, ? super String, String>) function2, (Function2<? super String, ? super String, String>) function22);
        int i5 = onExtraCallback + 89;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return intentOnExtraCallback;
    }

    private static final String onWarmupCompleted(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        a(new char[]{37055, 30149, 37079, 55836, 6732, 24977, 61959, 9880}, 1 - KeyEvent.normalizeMetaState(0), objArr);
        String strOnNavigationEvent = RoutesKt.onNavigationEvent(str, ((String) objArr[0]).intern(), str2);
        int i4 = onExtraCallback + 101;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public final Intent onExtraCallback(@NotNull OverviewItemInfo overviewItemInfo, @Nullable String str, @NotNull Function2<? super String, ? super String, String> function2, @NotNull Function2<? super String, ? super String, String> function22) throws Throwable {
        OverviewNoticeAlert overviewNoticeAlertOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(overviewItemInfo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        OverviewNotice overviewNoticeAccess000 = overviewItemInfo.access000();
        Object obj = null;
        if (overviewNoticeAccess000 != null) {
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                overviewNoticeAccess000.onWarmupCompleted();
                obj.hashCode();
                throw null;
            }
            overviewNoticeAlertOnWarmupCompleted = overviewNoticeAccess000.onWarmupCompleted();
        } else {
            overviewNoticeAlertOnWarmupCompleted = null;
        }
        if (overviewNoticeAlertOnWarmupCompleted != null) {
            int i3 = onExtraCallback + 23;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return IAuthTabCallback(overviewItemInfo, overviewNoticeAlertOnWarmupCompleted, str, function22);
            }
            IAuthTabCallback(overviewItemInfo, overviewNoticeAlertOnWarmupCompleted, str, function22);
            throw null;
        }
        Intent intent = new Intent();
        String str2 = (String) function2.invoke(overviewItemInfo.access100(), str);
        Object[] objArr = new Object[1];
        a(new char[]{56712, 61247, 56829, 27306, 19866, 64374, 17072}, -TextUtils.lastIndexOf("", '0'), objArr);
        intent.putExtra(((String) objArr[0]).intern(), str2);
        return intent;
    }

    private final Intent IAuthTabCallback(OverviewItemInfo overviewItemInfo, OverviewNoticeAlert overviewNoticeAlert, String str, Function2<? super String, ? super String, String> function2) {
        boolean z;
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.putExtra("dialog_title", overviewNoticeAlert.onExtraCallbackWithResult());
        intent.putExtra("dialog_message", overviewNoticeAlert.onExtraCallback());
        intent.putExtra("dialog_positive_button", overviewNoticeAlert.onWarmupCompleted().onWarmupCompleted());
        intent.putExtra("dialog_product_code", overviewItemInfo.access100());
        String lowerCase = overviewItemInfo.getInterfaceDescriptor().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        intent.putExtra("dialog_product_type", lowerCase);
        if (overviewNoticeAlert.onWarmupCompleted().onExtraCallbackWithResult() != null) {
            int i2 = onExtraCallback + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = onExtraCallback + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        intent.putExtra("dialog_has_notice", z);
        String strOnExtraCallbackWithResult = overviewNoticeAlert.onWarmupCompleted().onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult != null) {
            intent.putExtra("dialog_positive_landing_url", (String) function2.invoke(strOnExtraCallbackWithResult, str));
        }
        String strIAuthTabCallback = overviewNoticeAlert.IAuthTabCallback();
        if (strIAuthTabCallback != null) {
            int i6 = onExtraCallback + 61;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            intent.putExtra("dialog_negative_button", strIAuthTabCallback);
        }
        int i8 = IAuthTabCallback + 101;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return intent;
        }
        throw null;
    }

    private final Intent onExtraCallback(Context context, String str, int i, String str2) throws Throwable {
        int i2 = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) TossSecWidgetBridgeActivity.class);
        intent.setAction(str2);
        Object[] objArr = new Object[1];
        a(new char[]{56712, 61247, 56829, 27306, 19866, 64374, 17072}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        intent.putExtra(((String) objArr[0]).intern(), str);
        intent.putExtra("appWidgetId", i);
        intent.putExtra("widget_type", "myAsset");
        intent.putExtra("widget_size", "medium");
        int i3 = IAuthTabCallback + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return intent;
    }

    private final String onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 59;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            q8a.onNavigationEvent.onWarmupCompleted(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        q8ExternalSyntheticLambda4 q8externalsyntheticlambda4OnWarmupCompleted = q8a.onNavigationEvent.onWarmupCompleted(i);
        if (q8externalsyntheticlambda4OnWarmupCompleted == null) {
            int i4 = IAuthTabCallback + 1;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                q8externalsyntheticlambda4OnWarmupCompleted = q8ExternalSyntheticLambda4.medium;
                int i5 = 56 / 0;
            } else {
                q8externalsyntheticlambda4OnWarmupCompleted = q8ExternalSyntheticLambda4.medium;
            }
        }
        return q8externalsyntheticlambda4OnWarmupCompleted.name();
    }

    private static final String onNavigationEvent(String str, String str2) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (String) onNavigationEvent(785406249, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, -785406248, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{str, str2}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
    }

    public final PendingIntent onExtraCallbackWithResult(@NotNull Context context, int i) {
        Object[] objArr = {this, context, Integer.valueOf(i)};
        return (PendingIntent) onNavigationEvent(-1356263763, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1356263763, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = -4590896373451559113L;
    }
}

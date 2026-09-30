package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.securities.widget.common.ui.TossSecWidgetBridgeActivity;
import im.toss.securities.widget.common.utils.RoutesKt;
import im.toss.securities.widget.overview.SecuritiesOverviewAppWidgetReceiver;
import im.toss.securities.widget.overview.ui.small.setting.OverviewSmallWidgetSettingActivity;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class s2a {
    private static int onExtraCallback;
    private static int onNavigationEvent;
    public static final s2a onWarmupCompleted;
    private static final byte[] $$a = {126, 1, 26, -71};
    private static final int $$b = 37;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallback = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, short s2) {
        int i;
        byte b2;
        byte[] bArr = $$a;
        ?? r7 = (s2 * 3) + 105;
        ?? r5 = 4 - (b * 3);
        int i2 = 1 - (s * 2);
        byte[] bArr2 = new byte[i2];
        if (bArr == null) {
            byte b3 = r7;
            i = 0;
            byte b4 = r5;
            r5++;
            b2 = b4 + b3;
            bArr2[i] = b2 == true ? (byte) 1 : (byte) 0;
            i++;
            if (i == i2) {
                return new String(bArr2, 0);
            }
            b3 = bArr[r5];
            b4 = b2;
            r5++;
            b2 = b4 + b3;
            bArr2[i] = b2 == true ? (byte) 1 : (byte) 0;
            i++;
            if (i == i2) {
            }
        } else {
            i = 0;
            b2 = r7;
            bArr2[i] = b2 == true ? (byte) 1 : (byte) 0;
            i++;
            if (i == i2) {
            }
        }
    }

    static {
        onNavigationEvent = 1;
        onWarmupCompleted();
        onWarmupCompleted = new s2a();
        int i = IAuthTabCallback + 75;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private s2a() {
    }

    public final PendingIntent onExtraCallbackWithResult(@NotNull Context context, int i, @Nullable String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 15;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        PendingIntent activity = PendingIntent.getActivity(context, i, onWarmupCompleted(context, RoutesKt.IAuthTabCallback(str), i, q8ExternalSyntheticLambda4.small, q8ExternalSyntheticLambda5.myAsset), 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i5 = asBinder + 9;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return activity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PendingIntent onNavigationEvent(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        PendingIntent activity = PendingIntent.getActivity(context, i, onWarmupCompleted(context, RoutesKt.onExtraCallback(), i, q8ExternalSyntheticLambda4.small, q8ExternalSyntheticLambda5.myAsset), 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i5 = asBinder + 7;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return activity;
    }

    public final PendingIntent IAuthTabCallback(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intent = new Intent(context, (Class<?>) SecuritiesOverviewAppWidgetReceiver.class);
        intent.setAction("im.toss.securities.widget.overview.ACTION_REFRESH_SMALL");
        intent.putExtra("appWidgetId", i);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "");
        int i3 = asBinder + 5;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 14 / 0;
        }
        return broadcast;
    }

    public final PendingIntent onExtraCallback(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intent = new Intent(context, (Class<?>) OverviewSmallWidgetSettingActivity.class);
        intent.putExtra("appWidgetId", i);
        intent.putExtra("widgetType", "myAsset");
        intent.putExtra("widgetSize", "small");
        intent.setFlags(268468224);
        PendingIntent activity = PendingIntent.getActivity(context, i + 10000, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i3 = asBinder + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return activity;
    }

    private final Intent onWarmupCompleted(Context context, String str, int i, q8ExternalSyntheticLambda4 q8externalsyntheticlambda4, q8ExternalSyntheticLambda5 q8externalsyntheticlambda5) throws Throwable {
        int i2 = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) TossSecWidgetBridgeActivity.class);
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, View.MeasureSpec.getMode(0) + 2, new char[]{1, 65531, 4}, false, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 200, objArr);
        intent.putExtra(((String) objArr[0]).intern(), str);
        intent.putExtra("appWidgetId", i);
        intent.putExtra("widget_type", q8externalsyntheticlambda5.name());
        intent.putExtra("widget_size", q8externalsyntheticlambda4.name());
        int i3 = asBinder + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 119;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - MotionEvent.axisFromString("")), 23 - (KeyEvent.getMaxKeyCode() >> 16), Color.alpha(0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12844);
                    int iResolveSizeAndState = 55 - View.resolveSizeAndState(0, 0, 0);
                    int i9 = 2168 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte b = (byte) ($$a[1] - 1);
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c, iResolveSizeAndState, i9, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i10 = $10 + 79;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i12 = $10 + 91;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    char capsMode = (char) (12843 - TextUtils.getCapsMode("", 0, 0));
                    int iMyPid = 55 - (Process.myPid() >> 22);
                    int iRgb = (-16775049) - Color.rgb(0, 0, 0);
                    byte b3 = (byte) ($$a[1] - 1);
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(capsMode, iMyPid, iRgb, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i14 = $10 + 73;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onExtraCallback = 478308990;
    }
}

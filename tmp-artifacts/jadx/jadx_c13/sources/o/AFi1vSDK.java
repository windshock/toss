package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.securities.widget.common.ui.TossSecWidgetBridgeActivity;
import im.toss.securities.widget.common.utils.RoutesKt;
import im.toss.tosssecurities.widget.watchlist.medium.SecuritiesWatchlistMediumAppWidgetReceiver;
import im.toss.tosssecurities.widget.watchlist.medium.setting.MediumWidgetWatchlistSelectActivity;
import java.lang.reflect.Method;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1vSDK {
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final AFi1vSDK onWarmupCompleted;
    private static final byte[] $$a = {35, -27, ByteCompanionObject.MIN_VALUE, 50};
    private static final int $$b = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onTransact = 1;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 105 - (i2 * 3);
        int i5 = s * 3;
        int i6 = 3 - (i * 3);
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i6;
            int i10 = i6 + i7;
            i3 = i8;
            int i11 = i9;
            i4 = i10;
            i6 = i11;
            int i12 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            int i13 = i4;
            i9 = i12;
            i6 = bArr[i12];
            i8 = i3 + 1;
            i7 = i13;
            int i102 = i6 + i7;
            i3 = i8;
            int i112 = i9;
            i4 = i102;
            i6 = i112;
            int i122 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            int i1222 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    static {
        onExtraCallbackWithResult = 0;
        onNavigationEvent();
        onWarmupCompleted = new AFi1vSDK();
        int i = onExtraCallback + 49;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private AFi1vSDK() {
    }

    public static /* synthetic */ PendingIntent onNavigationEvent(AFi1vSDK aFi1vSDK, Context context, int i, Long l, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 123;
        int i5 = i4 % 128;
        onTransact = i5;
        int i6 = i4 % 2;
        if ((i2 & 4) != 0) {
            int i7 = i5 + 115;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            l = null;
        }
        return aFi1vSDK.onWarmupCompleted(context, i, l);
    }

    public final PendingIntent onWarmupCompleted(@NotNull Context context, int i, @Nullable Long l) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 65;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(PendingIntent.getActivity(context, i, onExtraCallback(context, (String) RoutesKt.onNavigationEvent(iIAuthTabCallback, -199646709, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, 199646709, new Object[]{l}), i, q8ExternalSyntheticLambda4.medium, q8ExternalSyntheticLambda5.stocks), 201326592), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback5 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback6 = AdResponseKtKt.IAuthTabCallback();
        PendingIntent activity = PendingIntent.getActivity(context, i, onExtraCallback(context, (String) RoutesKt.onNavigationEvent(iIAuthTabCallback4, -199646709, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback6, iIAuthTabCallback5, 199646709, new Object[]{l}), i, q8ExternalSyntheticLambda4.medium, q8ExternalSyntheticLambda5.stocks), 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i4 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return activity;
    }

    public final PendingIntent onNavigationEvent(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 99;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
            PendingIntent activity = PendingIntent.getActivity(context, i, onExtraCallback(context, (String) RoutesKt.onNavigationEvent(iIAuthTabCallback, -199646709, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, 199646709, new Object[]{null}), i, q8ExternalSyntheticLambda4.medium, q8ExternalSyntheticLambda5.stocks), 201326592);
            Intrinsics.checkNotNullExpressionValue(activity, "");
            return activity;
        }
        Intrinsics.checkNotNullParameter(context, "");
        int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback5 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback6 = AdResponseKtKt.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(PendingIntent.getActivity(context, i, onExtraCallback(context, (String) RoutesKt.onNavigationEvent(iIAuthTabCallback4, -199646709, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback6, iIAuthTabCallback5, 199646709, new Object[]{null}), i, q8ExternalSyntheticLambda4.medium, q8ExternalSyntheticLambda5.stocks), 201326592), "");
        obj.hashCode();
        throw null;
    }

    public final PendingIntent onExtraCallbackWithResult(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intent = new Intent(context, (Class<?>) SecuritiesWatchlistMediumAppWidgetReceiver.class);
        intent.setAction("im.toss.tosssecurities.widget.watchlist.medium.ACTION_REFRESH");
        intent.putExtra("appWidgetId", i);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "");
        int i3 = onTransact + 59;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 42 / 0;
        }
        return broadcast;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PendingIntent onExtraCallback(@NotNull Context context, int i) {
        q8ExternalSyntheticLambda4 q8externalsyntheticlambda4OnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = onTransact + 103;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            q8externalsyntheticlambda4OnWarmupCompleted = q8a.onNavigationEvent.onWarmupCompleted(i);
            int i4 = 49 / 0;
            if (q8externalsyntheticlambda4OnWarmupCompleted == null) {
                int i5 = onTransact + 55;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                q8externalsyntheticlambda4OnWarmupCompleted = q8ExternalSyntheticLambda4.medium;
            }
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            q8externalsyntheticlambda4OnWarmupCompleted = q8a.onNavigationEvent.onWarmupCompleted(i);
            if (q8externalsyntheticlambda4OnWarmupCompleted == null) {
            }
        }
        Intent intent = new Intent(context, (Class<?>) MediumWidgetWatchlistSelectActivity.class);
        intent.putExtra("appWidgetId", i);
        intent.putExtra("widgetType", "stocks");
        intent.putExtra("widgetSize", q8externalsyntheticlambda4OnWarmupCompleted.name());
        intent.setFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(context, i + 1000, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        return activity;
    }

    public final PendingIntent IAuthTabCallback(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intent = new Intent(context, (Class<?>) TossSecWidgetBridgeActivity.class);
        intent.setAction("im.toss.tosssecurities.widget.watchlist.medium.ACTION_ITEM_CLICK");
        intent.putExtra("appWidgetId", i);
        intent.putExtra("widget_type", "stocks");
        intent.putExtra("widget_size", "medium");
        PendingIntent activity = PendingIntent.getActivity(context, i + 2000, intent, 167772160);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i3 = IAuthTabCallback + 103;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 19 / 0;
        }
        return activity;
    }

    private final Intent onExtraCallback(Context context, String str, int i, q8ExternalSyntheticLambda4 q8externalsyntheticlambda4, q8ExternalSyntheticLambda5 q8externalsyntheticlambda5) throws Throwable {
        int i2 = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) TossSecWidgetBridgeActivity.class);
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 4, ((Process.getThreadPriority(0) + 20) >> 6) + 1, new char[]{4, 65531, 1}, true, (ViewConfiguration.getScrollBarSize() >> 8) + 181, objArr);
        intent.putExtra(((String) objArr[0]).intern(), str);
        intent.putExtra("appWidgetId", i);
        intent.putExtra("widget_type", q8externalsyntheticlambda5.name());
        intent.putExtra("widget_size", q8externalsyntheticlambda4.name());
        int i3 = IAuthTabCallback + 19;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return intent;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016c  */
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
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 35125), 23 - (ViewConfiguration.getWindowTouchSlop() >> 8), 10278 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 12844), ((Process.getThreadPriority(0) + 20) >> 6) + 55, KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i7 = $10 + 105;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $11 + 17;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $11 + 101;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 12843), 55 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onNavigationEvent() {
        onNavigationEvent = 478308973;
    }
}

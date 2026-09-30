package com.google.android.gms.wearable;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class WearableStatusCodes extends CommonStatusCodes {
    public static final int ACCOUNT_KEY_CREATION_FAILED = 4010;
    public static final int ASSET_UNAVAILABLE = 4005;
    public static final int DATA_ITEM_TOO_LARGE = 4003;
    public static final int DUPLICATE_CAPABILITY = 4006;
    public static final int DUPLICATE_LISTENER = 4001;
    public static final int FEATURE_DISABLED = 4014;
    public static final int INVALID_TARGET_NODE = 4004;
    public static final int MIGRATION_NOT_CANCELLABLE = 4012;
    public static final int MODEL_ID_UNAVAILABLE = 4011;
    public static final int NO_MIGRATION_FOUND_TO_CANCEL = 4013;
    public static final int TARGET_NODE_NOT_CONNECTED = 4000;
    public static final int UNKNOWN_CAPABILITY = 4007;
    public static final int UNKNOWN_LISTENER = 4002;
    public static final int UNSUPPORTED_BY_TARGET_NODE = 4009;
    public static final int WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED = 4008;
    private static final byte[] $$a = {60, -123, -116, -1};
    private static final int $$b = 101;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] IAuthTabCallback = {60818, 39336, 1511, 45355, 15717, 43163, 21703, 49156, 19544, 64412, 26557, 5094, 40762, 2941, 46735, 8903};
    private static long onWarmupCompleted = 2609468883560012269L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i2) {
        int i3;
        int i4;
        int i5 = 97 - (s * 3);
        int i6 = (s2 * 3) + 1;
        int i7 = 4 - (i2 * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i5;
            i5 = i6;
            i4 = 0;
            i5 += i8;
            i7++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i7];
            i5 += i8;
            i7++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    private WearableStatusCodes() {
    }

    public static String getStatusCodeString(int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 125;
        int i6 = i5 % 128;
        onNavigationEvent = i6;
        int i7 = i5 % 2;
        switch (i2) {
            case TARGET_NODE_NOT_CONNECTED /* 4000 */:
                return "TARGET_NODE_NOT_CONNECTED";
            case DUPLICATE_LISTENER /* 4001 */:
                return "DUPLICATE_LISTENER";
            case UNKNOWN_LISTENER /* 4002 */:
                return "UNKNOWN_LISTENER";
            case DATA_ITEM_TOO_LARGE /* 4003 */:
                return "DATA_ITEM_TOO_LARGE";
            case INVALID_TARGET_NODE /* 4004 */:
                return "INVALID_TARGET_NODE";
            case ASSET_UNAVAILABLE /* 4005 */:
                return "ASSET_UNAVAILABLE";
            case DUPLICATE_CAPABILITY /* 4006 */:
                return "DUPLICATE_CAPABILITY";
            case UNKNOWN_CAPABILITY /* 4007 */:
                return "UNKNOWN_CAPABILITY";
            case WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED /* 4008 */:
                return "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
            case UNSUPPORTED_BY_TARGET_NODE /* 4009 */:
                return "UNSUPPORTED_BY_TARGET";
            case ACCOUNT_KEY_CREATION_FAILED /* 4010 */:
                int i8 = i4 + 77;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 20 / 0;
                }
                return "ACCOUNT_KEY_CREATION_FAILED";
            case MODEL_ID_UNAVAILABLE /* 4011 */:
            default:
                return CommonStatusCodes.getStatusCodeString(i2);
            case MIGRATION_NOT_CANCELLABLE /* 4012 */:
                return "MIGRATION_NOT_CANCELLABLE";
            case NO_MIGRATION_FOUND_TO_CANCEL /* 4013 */:
                int i10 = i6 + 121;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 79 / 0;
                }
                return "NO_MIGRATION_FOUND_TO_CANCEL";
            case FEATURE_DISABLED /* 4014 */:
                Object[] objArr = new Object[1];
                a((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr);
                return ((String) objArr[0]).intern();
            case 4015:
                return "WIFI_CONNECTION_FAILED";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        float f;
        char c2;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $10 + 93;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 % 2;
        }
        while (true) {
            f = 0.0f;
            c2 = 3;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i3) {
                break;
            }
            int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i2 + i7])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 59697), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46133), (Process.myPid() >> 22) + 31, Color.blue(0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    char packedPositionType = (char) (49123 - ExpandableListView.getPackedPositionType(0L));
                    int windowTouchSlop = 44 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1494;
                    byte b = (byte) ($$a[3] + 1);
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, windowTouchSlop, packedPositionGroup, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i8 = $10 + 113;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    char cGreen = (char) (Color.green(0) + 49123);
                    int iResolveSize = 44 - View.resolveSize(0, 0);
                    int iResolveOpacity = 1494 - Drawable.resolveOpacity(0, 0);
                    byte b3 = (byte) ($$a[c2] + 1);
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, iResolveSize, iResolveOpacity, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback5 == null) {
                char c3 = (char) ((ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 49122);
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 44;
                int iIndexOf = 1493 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte b5 = (byte) ($$a[c2] + 1);
                byte b6 = b5;
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, scrollBarSize, iIndexOf, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            f = 0.0f;
            c2 = 3;
        }
        objArr[0] = new String(cArr);
    }
}

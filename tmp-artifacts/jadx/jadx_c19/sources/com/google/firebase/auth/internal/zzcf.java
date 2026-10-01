package com.google.firebase.auth.internal;

import android.content.Intent;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzcf {
    private static int onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static final Map<String, String> zza;
    private static final byte[] $$a = {126, 1, 26, -71};
    private static final int $$b = 105;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i2) {
        int i3;
        int i4 = 4 - (s * 3);
        int i5 = 97 - (s2 * 2);
        byte[] bArr = $$a;
        int i6 = i2 * 4;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i4++;
            i5 = (-i5) + i8;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i8 = i5;
            i5 = bArr[i4];
            i4++;
            i5 = (-i5) + i8;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    public static Status zza(Intent intent) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 39;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Preconditions.checkNotNull(intent);
            Preconditions.checkArgument(zzb(intent));
            return SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
        }
        Preconditions.checkNotNull(intent);
        Preconditions.checkArgument(zzb(intent));
        SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Status zza(String str) throws Throwable {
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            Object[] objArr = new Object[1];
            a(TextUtils.indexOf("", "", 0, 0), TextUtils.getTrimmedLength("") + 7, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr);
            String string2 = jSONObject.getString(((String) objArr[0]).intern());
            if (!TextUtils.isEmpty(string)) {
                int i3 = onTransact + 9;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    TextUtils.isEmpty(string2);
                    throw null;
                }
                if (!TextUtils.isEmpty(string2)) {
                    Map<String, String> map = zza;
                    if (map.containsKey(string)) {
                        return zzao.zza(map.get(string) + ":" + string2);
                    }
                }
            }
            Status statusZza = zzao.zza("WEB_INTERNAL_ERROR:" + str);
            int i4 = onTransact + 77;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return statusZza;
        } catch (JSONException e) {
            Status statusZza2 = zzao.zza("WEB_INTERNAL_ERROR:" + str + "[ " + e.getLocalizedMessage() + " ]");
            int i6 = onTransact + 15;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return statusZza2;
        }
    }

    static {
        onExtraCallback = 0;
        onNavigationEvent();
        HashMap map = new HashMap();
        zza = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void zza(Intent intent, Status status) {
        int i2 = 2 % 2;
        int i3 = onTransact + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SafeParcelableSerializer.serializeToIntentExtra(status, intent, "com.google.firebase.auth.internal.STATUS");
        if (i4 != 0) {
            int i5 = 70 / 0;
        }
        int i6 = onTransact + 17;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public static boolean zzb(Intent intent) {
        boolean zHasExtra;
        int i2 = 2 % 2;
        int i3 = onTransact + 93;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Preconditions.checkNotNull(intent);
            zHasExtra = intent.hasExtra("com.google.firebase.auth.internal.STATUS");
            int i4 = 58 / 0;
        } else {
            Preconditions.checkNotNull(intent);
            zHasExtra = intent.hasExtra("com.google.firebase.auth.internal.STATUS");
        }
        int i5 = onWarmupCompleted + 99;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return zHasExtra;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i2 + i5])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.MeasureSpec.makeMeasureSpec(0, 0)), Color.green(0) + 17, 10973 - TextUtils.indexOf("", "", 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 46133), 31 - KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionChild(0L) + 20221, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    char cLastIndexOf = (char) (49122 - TextUtils.lastIndexOf("", '0', 0));
                    int scrollBarSize = 44 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1494;
                    byte b = (byte) ($$a[1] - 1);
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, scrollBarSize, keyRepeatTimeout, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i6 = $11 + 19;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i8 = $10 + 77;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                char maximumDrawingCacheSize = (char) (49123 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int defaultSize = View.getDefaultSize(0, 0) + 44;
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1494;
                byte b3 = (byte) ($$a[1] - 1);
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumDrawingCacheSize, defaultSize, edgeSlop, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{60857, 18227, 47267, 4641, 18365, 47417, 4797};
        onNavigationEvent = -8735589871462955178L;
    }
}

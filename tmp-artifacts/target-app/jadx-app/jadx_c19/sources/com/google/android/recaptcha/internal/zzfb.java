package com.google.android.recaptcha.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzfb {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;
    public static final zzfb zza;
    private static final List zzb;

    static {
        onExtraCallbackWithResult();
        zza = new zzfb();
        zzb = zze(CollectionsKt.listOf(new String[]{"www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"}));
        int i2 = onWarmupCompleted + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private zzfb() {
    }

    public static final boolean zza(@NotNull Uri uri) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            zzd(uri);
            throw null;
        }
        if (!zzd(uri)) {
            return false;
        }
        int i4 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        String string = uri.toString();
        if (i5 != 0) {
            zzc(string);
            obj.hashCode();
            throw null;
        }
        if (!zzc(string)) {
            return false;
        }
        int i6 = IAuthTabCallback;
        int i7 = i6 + 67;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 61;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    public static final boolean zzb(@NotNull Uri uri) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean zZzd = zzd(uri);
        int i5 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return zZzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v7 java.util.List) = (r1v4 java.util.List), (r1v9 java.util.List) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean zzc(String str) {
        List list;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            list = zzb;
            int i4 = 22 / 0;
            if (!(!(list instanceof Collection))) {
                if (list.isEmpty()) {
                    int i5 = onExtraCallbackWithResult + 109;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
            }
        } else {
            list = zzb;
            if (list instanceof Collection) {
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (StringsKt.startsWith$default(str, (String) it.next(), false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zzd(Uri uri) {
        int i2 = 2 % 2;
        if (!TextUtils.isEmpty(uri.toString())) {
            int i3 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.areEqual("https", uri.getScheme());
                throw null;
            }
            if (Intrinsics.areEqual("https", uri.getScheme()) && !TextUtils.isEmpty(uri.getHost())) {
                int i4 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i4 % 128;
                return i4 % 2 != 0;
            }
        }
        return false;
    }

    private static final List zze(List list) throws Throwable {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new int[]{-69721273, -773773306, -560179589, -1443542916}, (ViewConfiguration.getPressedStateDuration() >> 16) + 8, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            sb.append("/");
            arrayList.add(sb.toString());
        }
        int i3 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        char c = '0';
        int i6 = -1469660336;
        int i7 = 0;
        if (iArr3 != null) {
            int i8 = $10 + 71;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            int i9 = i3;
            while (i9 < length) {
                int i10 = $10 + 79;
                $11 = i10 % 128;
                if (i10 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), (Process.myPid() >> 22) + 72, TextUtils.indexOf("", c) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i9 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i9])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 72 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i9++;
                }
                i4 = 2;
                c = '0';
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $10 + 21;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    Object[] objArr4 = new Object[1];
                    objArr4[i7] = Integer.valueOf(iArr5[i11]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 72, Color.alpha(i7) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i11])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 72 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 8848 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    i11++;
                }
                i6 = -1469660336;
                i7 = 0;
            }
            iArr5 = iArr6;
        }
        int i13 = i7;
        System.arraycopy(iArr5, i13, iArr4, i13, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i13;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i13] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Color.alpha(0)), Drawable.resolveOpacity(0, 0) + 39, TextUtils.lastIndexOf("", '0', 0) + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 4033), 78 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 7399 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            i13 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = new int[]{515722556, 103851858, 1659463739, 1234946535, 992390498, 1420936000, -917259148, -1020089079, 1487047373, -1114354190, -1537598069, 757843370, -1564111665, -1103855419, -1134815958, 1056375467, -770875263, 1335300375};
    }
}

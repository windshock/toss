package com.google.firebase.auth;

import android.graphics.PointF;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ActionCodeUrl {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallback = null;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static final com.google.android.gms.internal.p000firebaseauthapi.zzau<String, Integer> zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    public int getOperation() {
        int i2 = 2 % 2;
        com.google.android.gms.internal.p000firebaseauthapi.zzau<String, Integer> zzauVar = zza;
        if (!zzauVar.containsKey(this.zzd)) {
            int i3 = onExtraCallback + 41;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 41 / 0;
            }
            return 3;
        }
        int i5 = onWarmupCompleted + 119;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Integer num = zzauVar.get(this.zzd);
        if (i6 == 0) {
            return num.intValue();
        }
        int i7 = 37 / 0;
        return num.intValue();
    }

    public static ActionCodeUrl parseLink(@Nullable String str) {
        int i2 = 2 % 2;
        Preconditions.checkNotEmpty(str);
        try {
            ActionCodeUrl actionCodeUrl = new ActionCodeUrl(str);
            int i3 = onExtraCallback + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return actionCodeUrl;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String getApiKey() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 101;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.zzb;
        int i5 = i4 + 81;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getCode() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 9;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        String str = this.zzc;
        int i6 = i4 + 17;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getContinueUrl() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zze;
        if (i4 != 0) {
            int i5 = 77 / 0;
        }
        return str;
    }

    public String getLanguageCode() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 105;
        onExtraCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.zzf;
        int i5 = i3 + 97;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String zza() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        String str = this.zzg;
        int i6 = i3 + 23;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static String zza(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 125;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Uri.parse(str).getQueryParameterNames().contains(str2);
            throw null;
        }
        Uri uri = Uri.parse(str);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.contains(str2)) {
            return uri.getQueryParameter(str2);
        }
        if (queryParameterNames.contains("link")) {
            int i4 = onWarmupCompleted + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return Uri.parse(Preconditions.checkNotEmpty(uri.getQueryParameter("link"))).getQueryParameter(str2);
        }
        return null;
    }

    static {
        onExtraCallbackWithResult();
        HashMap map = new HashMap();
        map.put("recoverEmail", 2);
        map.put("resetPassword", 0);
        map.put("signIn", 4);
        map.put("verifyEmail", 1);
        map.put("verifyBeforeChangeEmail", 5);
        map.put("revertSecondFactorAddition", 6);
        zza = com.google.android.gms.internal.p000firebaseauthapi.zzau.zza(map);
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if (r7 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r11.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1);
        r11.zzc = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3);
        r11.zzd = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7);
        r11.zze = zza(r12, "continueUrl");
        r11.zzf = zza(r12, "languageCode");
        r11.zzg = zza(r12, "tenantId");
        r12 = com.google.firebase.auth.ActionCodeUrl.onWarmupCompleted + 65;
        com.google.firebase.auth.ActionCodeUrl.onExtraCallback = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        if (r7 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ActionCodeUrl(String str) throws Throwable {
        String strZza = zza(str, "apiKey");
        String strZza2 = zza(str, "oobCode");
        Object[] objArr = new Object[1];
        a(new int[]{-1873553970, 2127337963}, 3 - Process.getGidForName(""), objArr);
        String strZza3 = zza(str, ((String) objArr[0]).intern());
        if (strZza != null && strZza2 != null) {
            int i2 = onExtraCallback + 17;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 82 / 0;
            }
        }
        Object[] objArr2 = new Object[1];
        a(new int[]{-1873553970, 2127337963}, 5 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
        throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", ((String) objArr2[0]).intern()));
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
        int[] iArr3 = IAuthTabCallback;
        int i6 = -1469660336;
        int i7 = 1;
        int i8 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i9 = $11 + 79;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length2) {
                int i12 = $10 + 81;
                $11 = i12 % 128;
                if (i12 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i11])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 72, 8848 - (ViewConfiguration.getTouchSlop() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i11] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i11 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i11])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 72 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i11++;
                }
                i4 = 2;
                i6 = -1469660336;
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = IAuthTabCallback;
        long j = 0;
        if (iArr6 != null) {
            int i13 = $11 + 55;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                Object[] objArr4 = new Object[i7];
                objArr4[i8] = Integer.valueOf(iArr6[i3]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(i8), View.resolveSizeAndState(i8, i8, i8) + 72, ExpandableListView.getPackedPositionType(j) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i3] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i3++;
                i7 = 1;
                i8 = 0;
                j = 0;
            }
            iArr6 = iArr2;
        }
        int i14 = i8;
        System.arraycopy(iArr6, i14, iArr5, i14, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i14;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i15];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.combineMeasuredStates(0, 0)), TextUtils.indexOf((CharSequence) "", '0') + 40, TextUtils.indexOf("", "", 0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i15++;
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getTapTimeout() >> 16)), TextUtils.getOffsetAfter("", 0) + 78, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7399, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = new int[]{-332347929, 1831164568, 1756576085, 284489135, -168429983, 1593997271, -1483873156, -488346041, 1297600636, 574589032, 685167248, 1150384096, -735853393, -1240445702, -2023554539, -1293881751, -1817554167, -1364367663};
    }
}

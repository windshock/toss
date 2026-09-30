package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.internal.LibraryVersion;
import java.lang.reflect.Method;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzact {
    private final int zza;
    private static final byte[] $$a = {4, -66, -36, 8};
    private static final int $$b = 126;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private static int onNavigationEvent = 478308948;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i2;
        int i3 = s * 2;
        int i4 = 4 - (b2 * 4);
        byte[] bArr = $$a;
        int i5 = 105 - (b * 2);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i4;
            i2 = 0;
            i4++;
            i5 = i7 + i6;
            int i8 = i4;
            int i9 = i5;
            bArr2[i2] = (byte) i9;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i8];
            i4 = i8;
            i7 = i9;
            i4++;
            i5 = i7 + i6;
            int i82 = i4;
            int i92 = i5;
            bArr2[i2] = (byte) i92;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            int i822 = i4;
            int i922 = i5;
            bArr2[i2] = (byte) i922;
            if (i2 == i3) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r1.size() == 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zza(String str) throws NumberFormatException {
        String str2;
        List<String> listZza;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        onWarmupCompleted = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                listZza = zzac.zza("[.-]").zza((CharSequence) str);
                if (listZza.size() == 0) {
                    return Integer.parseInt(str);
                }
                if (listZza.size() < 3) {
                    return -1;
                }
                return (Integer.parseInt(listZza.get(0)) * 1000000) + (Integer.parseInt(listZza.get(1)) * 1000) + Integer.parseInt(listZza.get(2));
            }
            listZza = zzac.zza("[.-]").zza((CharSequence) str);
        } catch (IllegalArgumentException e) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            int i4 = IAuthTabCallback + 45;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[5];
                objArr[1] = str;
                objArr[1] = e;
                str2 = String.format("Version code parsing failed for: %s with exception %s.", objArr);
            } else {
                str2 = String.format("Version code parsing failed for: %s with exception %s.", str, e);
            }
            Log.d("LibraryVersionContainer", str2);
            int i5 = IAuthTabCallback + 21;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzact zza() throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 53;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            TextUtils.isEmpty(LibraryVersion.getInstance().getVersion("firebase-auth"));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String version = LibraryVersion.getInstance().getVersion("firebase-auth");
        if (!TextUtils.isEmpty(version)) {
            int i4 = onWarmupCompleted + 85;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr = new Object[1];
                a('b' >>> AndroidCharacter.getMirror('Z'), Color.blue(0) + 115, new char[]{65534, 7, 65535, 65534, 65531, 65534, 5}, false, 19737 << View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
                if (version.equals(((String) objArr[0]).intern())) {
                    version = "-1";
                }
            } else {
                a(AndroidCharacter.getMirror('0') - ')', Color.blue(0) + 7, new char[]{65534, 7, 65535, 65534, 65531, 65534, 5}, true, 205 - View.MeasureSpec.makeMeasureSpec(0, 0), new Object[1]);
                if (!(!version.equals(((String) r2[0]).intern()))) {
                }
            }
        }
        zzact zzactVar = new zzact(version);
        int i5 = IAuthTabCallback + 63;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return zzactVar;
    }

    public final String zzb() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = String.format("X%s", Integer.toString(this.zza));
        int i5 = onWarmupCompleted + 97;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private zzact(String str) {
        this.zza = zza(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i7 = $11 + 61;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35125), (-16777193) - Color.rgb(0, 0, 0), TextUtils.getCapsMode("", 0, 0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 12843), 55 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 2166 - TextUtils.lastIndexOf("", '0', 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getOffsetBefore("", 0)), ExpandableListView.getPackedPositionType(0L) + 55, 2166 - Process.getGidForName(""), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i10 = $11 + 75;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}

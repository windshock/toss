package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzxj implements zzrv {
    private static char[] IAuthTabCallback;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private static final zzic.zza zza;
    private final SecretKey zzb;
    private byte[] zzc;
    private byte[] zzd;
    private static final byte[] $$a = {120, 11, 65, 93};
    private static final int $$b = 31;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i2) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 97 - (b * 3);
        int i5 = b2 * 2;
        int i6 = i2 + 4;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i7;
            i3 = 0;
            i4 += -i8;
            i6++;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i3++;
            i8 = bArr[i6];
            i4 += -i8;
            i6++;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            i6++;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    private static Cipher zza() throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            zza.zza();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        zzwr<zzxc, Cipher> zzwrVar = zzwr.zza;
        Object[] objArr = new Object[1];
        a(3 - View.combineMeasuredStates(0, 0), 18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (40798 - ExpandableListView.getPackedPositionChild(0L)), objArr);
        Cipher cipherZza = zzwrVar.zza(((String) objArr[0]).intern());
        int i4 = onExtraCallback + 73;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return cipherZza;
    }

    static {
        onNavigationEvent = 1;
        IAuthTabCallback();
        zza = zzic.zza.zza;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public zzxj(byte[] bArr) throws Throwable {
        zzxq.zza(bArr.length);
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getLongPressTimeout() >> 16, Color.rgb(0, 0, 0) + 16777219, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, ((String) objArr[0]).intern());
        this.zzb = secretKeySpec;
        Cipher cipherZza = zza();
        cipherZza.init(1, secretKeySpec);
        byte[] bArrZzb = zzrb.zzb(cipherZza.doFinal(new byte[16]));
        this.zzc = bArrZzb;
        this.zzd = zzrb.zzb(bArrZzb);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzrv
    public final byte[] zza(byte[] bArr, int i2) throws Throwable {
        byte[] bArrZza;
        int i3 = 2 % 2;
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherZza = zza();
        cipherZza.init(1, this.zzb);
        int iMax = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if ((iMax << 4) == bArr.length) {
            bArrZza = zzwi.zza(bArr, (iMax - 1) << 4, this.zzc, 0, 16);
            int i4 = onExtraCallback + 109;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 5;
            }
        } else {
            bArrZza = zzwi.zza(zzrb.zza(Arrays.copyOfRange(bArr, (iMax - 1) << 4, bArr.length)), this.zzd);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i6 = 0; i6 < iMax - 1; i6++) {
            int i7 = IAuthTabCallbackStub + 119;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            bArrDoFinal = cipherZza.doFinal(zzwi.zza(bArrDoFinal, 0, bArr, i6 << 4, 16));
        }
        return Arrays.copyOf(cipherZza.doFinal(zzwi.zza(bArrZza, bArrDoFinal)), i2);
    }

    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i5 = $10 + 83;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i2 + i7])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 59697), (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, 10973 - KeyEvent.normalizeMetaState(0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 46134), 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 20219 - ((byte) KeyEvent.getModifierMetaStateMask()), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 49124), (ViewConfiguration.getWindowTouchSlop() >> 8) + 44, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i8 = $10 + 13;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 49123), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44, Color.red(0) + 1494, -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{60821, 58165, 61647, 29386, 31850, 28560, 22856, 18526, 15356, 9489, 5336, 2021, 61728, 57523, 54246, 56671, 52411, 48666, 43385, 39084};
        onWarmupCompleted = -4036736644952169616L;
    }
}

package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzqt implements zzcf {
    private static short[] onNavigationEvent;
    private final zzch<zzcf> zza;
    private final zzrp zzb;
    private final zzrp zzc;
    private static final byte[] $$a = {50, -82, -81, 124};
    private static final int $$b = 149;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 27024620;
    private static int IAuthTabCallback = -1538795430;
    private static int onWarmupCompleted = 252934784;
    private static byte[] onExtraCallbackWithResult = {58, -64, -58, 16, -66, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i2;
        int i3 = 115 - (b2 * 4);
        int i4 = 3 - (b3 * 3);
        int i5 = b * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i3;
            i2 = 0;
            i3 = i6;
            i3 += i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i4++;
            i2++;
            i7 = bArr[i4];
            i3 += i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    private zzqt(zzch<zzcf> zzchVar) throws Throwable {
        this.zza = zzchVar;
        if (!zzchVar.zzf()) {
            zzrp zzrpVar = zzng.zza;
            this.zzb = zzrpVar;
            this.zzc = zzrpVar;
            int i2 = onTransact + 59;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        zzrq zzrqVarZzb = zzno.zza().zzb();
        zzrs zzrsVarZza = zzng.zza(zzchVar);
        this.zzb = zzrqVarZzb.zza(zzrsVarZza, "mac", "compute");
        Object[] objArr = new Object[1];
        a((short) (10 - Gravity.getAbsoluteGravity(0, 0)), (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 47), 1512340252 - Color.alpha(0), 1420516846 + (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') - 75, objArr);
        this.zzc = zzrqVarZzb.zza(zzrsVarZza, "mac", ((String) objArr[0]).intern());
        int i4 = onTransact + 53;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzcf
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 35;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (bArr.length <= 5) {
            this.zzc.zza();
            throw new GeneralSecurityException("tag too short");
        }
        Iterator<zzcm<zzcf>> it = this.zza.zza(Arrays.copyOf(bArr, 5)).iterator();
        while (true) {
            if (it.hasNext()) {
                zzcm<zzcf> next = it.next();
                try {
                    next.zze().zza(bArr, bArr2);
                    this.zzc.zza(next.zza(), bArr2.length);
                    break;
                } catch (GeneralSecurityException unused) {
                }
            } else {
                Iterator<zzcm<zzcf>> it2 = this.zza.zze().iterator();
                while (!(!it2.hasNext())) {
                    zzcm<zzcf> next2 = it2.next();
                    try {
                        next2.zze().zza(bArr, bArr2);
                        this.zzc.zza(next2.zza(), bArr2.length);
                    } catch (GeneralSecurityException unused2) {
                    }
                }
                this.zzc.zza();
                throw new GeneralSecurityException("invalid MAC");
            }
        }
        int i5 = onTransact + 7;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzcf
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 69;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        try {
            byte[] bArrZza = this.zza.zza().zze().zza(bArr);
            this.zzb.zza(this.zza.zza().zza(), bArr.length);
            int i5 = onTransact + 39;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return bArrZza;
            }
            throw null;
        } catch (GeneralSecurityException e) {
            this.zzb.zza();
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        long j;
        char c;
        int length;
        byte[] bArr;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j2 = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - ImageFormat.getBitsPerPixel(0)), 42 - ExpandableListView.getPackedPositionType(0L), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr2 = onExtraCallbackWithResult;
                if (bArr2 != null) {
                    int i6 = $11 + 97;
                    int i7 = i6 % 128;
                    $10 = i7;
                    if (i6 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i8 = i7 + 53;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 0;
                    while (i10 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 12843), 56 - (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i10++;
                        j2 = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSizeAndState(0, 0, 0)), 42 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 22438 - TextUtils.indexOf((CharSequence) "", '0', 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onNavigationEvent[i2 + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i11 = ((i2 + iIntValue) - 2) + ((int) (onExtraCallback ^ j));
                if (z) {
                    int i12 = $10 + 71;
                    $11 = i12 % 128;
                    int i13 = i12 % 2 == 0 ? 0 : 1;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i13;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 86 - Color.argb(0, 0, 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9566, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallbackWithResult;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i14 = 0; i14 < length2; i14++) {
                            int i15 = $10 + 49;
                            $11 = i15 % 128;
                            if (i15 % 2 == 0) {
                                bArr5[i14] = (byte) (bArr4[i14] - 4629411779493505016L);
                            } else {
                                bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                            }
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            int i16 = $11 + 85;
                            $10 = i16 % 128;
                            if (i16 % 2 != 0) {
                                byte[] bArr6 = onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent + 1;
                                c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback >>> (((byte) (((byte) (bArr6[r8] - 4629411779493505016L)) / s)) ^ b));
                            } else {
                                byte[] bArr7 = onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            }
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = c;
                        } else {
                            short[] sArr = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}

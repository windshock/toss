package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzlm extends zzna<zzuo, zzut> {
    private static short[] onExtraCallbackWithResult;
    private final /* synthetic */ zzlk zza;
    private static final byte[] $$a = {68, -127, 122, -15};
    private static final int $$b = 250;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onWarmupCompleted = 1784621797;
    private static int onNavigationEvent = -1538795411;
    private static int IAuthTabCallback = -999428633;
    private static byte[] onExtraCallback = {-83, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i2;
        int i3 = 3 - (s2 * 2);
        int i4 = s3 * 4;
        byte[] bArr = $$a;
        int i5 = (s * 2) + 115;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i5 += i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i3++;
            i2++;
            i7 = bArr[i3];
            i5 += i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzna
    public final /* synthetic */ zzakk zza(zzakk zzakkVar) throws Throwable {
        byte[] bArrZza;
        byte[] bArrZza2;
        int i2 = 2 % 2;
        zzuo zzuoVar = (zzuo) zzakkVar;
        zzum zzumVarZzc = zzuoVar.zzc().zzc();
        int i3 = zzll.zza[zzumVarZzc.ordinal()];
        if (i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                int i4 = asInterface;
                int i5 = i4 + 17;
                asBinder = i5 % 128;
                if (i5 % 2 == 0 ? i3 != 4 : i3 != 2) {
                    throw new GeneralSecurityException("Invalid KEM");
                }
                int i6 = i4 + 115;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
            }
            zzwq zzwqVarZzc = zzlq.zzc(zzuoVar.zzc().zzc());
            ECParameterSpec eCParameterSpecZza = zzwn.zza(zzwqVarZzc);
            zzwr<zzxd, KeyPairGenerator> zzwrVar = zzwr.zzd;
            Object[] objArr = new Object[1];
            a((short) (Process.getGidForName("") - 52), (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) - 114), 837225747 - ExpandableListView.getPackedPositionType(0L), (-1613378985) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 99, objArr);
            KeyPairGenerator keyPairGeneratorZza = zzwrVar.zza(((String) objArr[0]).intern());
            keyPairGeneratorZza.initialize(eCParameterSpecZza);
            KeyPair keyPairGenerateKeyPair = keyPairGeneratorZza.generateKeyPair();
            zzwp zzwpVar = zzwp.UNCOMPRESSED;
            ECPoint w = ((ECPublicKey) keyPairGenerateKeyPair.getPublic()).getW();
            EllipticCurve curve = zzwn.zza(zzwqVarZzc).getCurve();
            zzmd.zza(w, curve);
            int iZza = zzwn.zza(curve);
            int iOrdinal = zzwpVar.ordinal();
            if (iOrdinal == 0) {
                int i8 = (iZza * 2) + 1;
                byte[] bArr = new byte[i8];
                byte[] bArrZza3 = zzmb.zza(w.getAffineX());
                byte[] bArrZza4 = zzmb.zza(w.getAffineY());
                System.arraycopy(bArrZza4, 0, bArr, i8 - bArrZza4.length, bArrZza4.length);
                System.arraycopy(bArrZza3, 0, bArr, (iZza + 1) - bArrZza3.length, bArrZza3.length);
                bArr[0] = 4;
                bArrZza2 = bArr;
            } else if (iOrdinal == 1) {
                int i9 = iZza + 1;
                bArrZza2 = new byte[i9];
                byte[] bArrZza5 = zzmb.zza(w.getAffineX());
                System.arraycopy(bArrZza5, 0, bArrZza2, i9 - bArrZza5.length, bArrZza5.length);
                bArrZza2[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
            } else {
                if (iOrdinal != 2) {
                    throw new GeneralSecurityException("invalid format:" + String.valueOf(zzwpVar));
                }
                int i10 = iZza * 2;
                bArrZza2 = new byte[i10];
                byte[] bArrZza6 = zzmb.zza(w.getAffineX());
                if (bArrZza6.length > iZza) {
                    bArrZza6 = Arrays.copyOfRange(bArrZza6, bArrZza6.length - iZza, bArrZza6.length);
                    int i11 = asInterface + 103;
                    asBinder = i11 % 128;
                    int i12 = i11 % 2;
                }
                byte[] bArrZza7 = zzmb.zza(w.getAffineY());
                if (bArrZza7.length > iZza) {
                    bArrZza7 = Arrays.copyOfRange(bArrZza7, bArrZza7.length - iZza, bArrZza7.length);
                }
                System.arraycopy(bArrZza7, 0, bArrZza2, i10 - bArrZza7.length, bArrZza7.length);
                System.arraycopy(bArrZza6, 0, bArrZza2, iZza - bArrZza6.length, bArrZza6.length);
            }
            bArrZza = zzmb.zza(((ECPrivateKey) keyPairGenerateKeyPair.getPrivate()).getS(), zzlq.zza(zzumVarZzc));
        } else {
            bArrZza = zzov.zza(32);
            bArrZza[0] = (byte) (bArrZza[0] | 7);
            byte b = (byte) (bArrZza[31] & 63);
            bArrZza[31] = b;
            bArrZza[31] = (byte) (b | 128);
            bArrZza2 = zzxp.zza(bArrZza);
        }
        return (zzut) ((zzaja) zzut.zzb().zza(0).zza((zzuw) ((zzaja) zzuw.zzc().zza(0).zza(zzuoVar.zzc()).zza(zzahm.zza(bArrZza2)).zzf())).zza(zzahm.zza(bArrZza)).zzf());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzna
    public final /* synthetic */ zzakk zza(zzahm zzahmVar) throws zzajj {
        int i2 = 2 % 2;
        int i3 = asBinder + 33;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        zzuo zzuoVarZza = zzuo.zza(zzahmVar, zzaip.zza());
        if (i4 == 0) {
            int i5 = 87 / 0;
        }
        return zzuoVarZza;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzlm(zzlk zzlkVar, Class cls) {
        super(cls);
        this.zza = zzlkVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzna
    public final /* synthetic */ void zzb(zzakk zzakkVar) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = asBinder + 115;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            zzlq.zza(((zzuo) zzakkVar).zzc());
            return;
        }
        zzlq.zza(((zzuo) zzakkVar).zzc());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 42, (ViewConfiguration.getScrollBarSize() >> 8) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                int i8 = $11;
                int i9 = i8 + 17;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int i10 = i8 + 9;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i12 = 0; i12 < length; i12++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 12843), 55 - ((Process.getThreadPriority(0) + 20) >> 6), Color.green(0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i13 = $11 + 123;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        byte[] bArr3 = onExtraCallback;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 43424), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] | (-4629411779493505016L))) >>> ((int) (onNavigationEvent & (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = onExtraCallback;
                        try {
                            Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.getCapsMode("", 0, 0)), 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 22440 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iIntValue = (byte) i5;
                } else {
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i2 + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i2 + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))) + i7;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 86, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9566, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallback;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr6[i14] = (byte) (bArr5[i14] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                boolean z = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i15 = $10 + 49;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        byte[] bArr7 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i17 = $11 + 61;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                    } else {
                        short[] sArr = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}

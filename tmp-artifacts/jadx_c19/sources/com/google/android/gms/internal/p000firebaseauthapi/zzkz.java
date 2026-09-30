package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzkz {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private static final byte[] zza;
    private final zzla zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    public static zzkz zza(byte[] bArr, zzli zzliVar, zzlg zzlgVar, zzld zzldVar, zzla zzlaVar, byte[] bArr2) throws Throwable {
        int i2 = 2 % 2;
        byte[] bArrZza = zzlgVar.zza(bArr, zzliVar);
        byte[] bArr3 = zzlq.zza;
        byte[] bArrZza2 = zzlq.zza(zzlgVar.zza(), zzldVar.zzb(), zzlaVar.zzc());
        byte[] bArr4 = zzlq.zzl;
        byte[] bArr5 = zza;
        byte[] bArrZza3 = zzwi.zza(bArr3, zzldVar.zza(bArr4, bArr5, "psk_id_hash", bArrZza2), zzldVar.zza(bArr4, bArr2, "info_hash", bArrZza2));
        byte[] bArrZza4 = zzldVar.zza(bArrZza, bArr5, "secret", bArrZza2);
        Object[] objArr = new Object[1];
        a(new char[]{6525, 6422, 35390, 24903, 57769, 46810, 39222}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, objArr);
        byte[] bArrZza5 = zzldVar.zza(bArrZza4, bArrZza3, ((String) objArr[0]).intern(), bArrZza2, zzlaVar.zza());
        byte[] bArrZza6 = zzldVar.zza(bArrZza4, bArrZza3, "base_nonce", bArrZza2, zzlaVar.zzb());
        zzlaVar.zzb();
        BigInteger bigInteger = BigInteger.ONE;
        zzkz zzkzVar = new zzkz(bArr, bArrZza5, bArrZza6, bigInteger.shiftLeft(96).subtract(bigInteger), zzlaVar);
        int i3 = onExtraCallback + 111;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return zzkzVar;
    }

    static {
        IAuthTabCallback();
        zza = new byte[0];
        int i2 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private zzkz(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzla zzlaVar) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzlaVar;
    }

    private final byte[] zza() throws GeneralSecurityException {
        byte[] bArrZza;
        synchronized (this) {
            bArrZza = zzwi.zza(this.zze, zzmb.zza(this.zzg, this.zzb.zzb()));
            if (this.zzg.compareTo(this.zzc) >= 0) {
                throw new GeneralSecurityException("message limit reached");
            }
            this.zzg = this.zzg.add(BigInteger.ONE);
        }
        return bArrZza;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 5;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            byte[] bArrZza = this.zzb.zza(this.zzd, zza(), bArr, bArr2);
            int i4 = 33 / 0;
            return bArrZza;
        }
        return this.zzb.zza(this.zzd, zza(), bArr, bArr2);
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i4 = $11 + 87;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - KeyEvent.normalizeMetaState(0)), 84 - (ViewConfiguration.getPressedStateDuration() >> 16), 21233 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 14185), 19 - Color.argb(0, 0, 0, 0), 8808 - TextUtils.indexOf("", "", 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i7 = $10 + 107;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = 5527833982982361342L;
    }
}

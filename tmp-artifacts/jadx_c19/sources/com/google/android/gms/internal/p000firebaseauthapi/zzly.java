package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.kernel.RVParams;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzly implements zzbh {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static final String zza = "zzly";
    private final SecretKey zzb;

    static {
        onWarmupCompleted();
        int i2 = IAuthTabCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    zzly(String str, KeyStore keyStore) throws GeneralSecurityException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.zzb = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
        }
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void zza() throws InterruptedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 39;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
        int i5 = onWarmupCompleted + 43;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 11;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i6 = i4 + 99;
        onWarmupCompleted = i6 % 128;
        try {
            if (i6 % 2 == 0) {
                zzc(bArr, bArr2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            byte[] bArrZzc = zzc(bArr, bArr2);
            int i7 = onExtraCallback + 47;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return bArrZzc;
        } catch (AEADBadTagException e) {
            throw e;
        } catch (GeneralSecurityException e2) {
            e = e2;
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e);
            zza();
            return zzc(bArr, bArr2);
        } catch (ProviderException e3) {
            e = e3;
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e);
            zza();
            return zzc(bArr, bArr2);
        }
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws Throwable {
        int i2 = 2 % 2;
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Object[] objArr = new Object[1];
        a(new char[]{9804, 46133, 676, 37205, 28606, 64063, 18606, 10057, 46507, 7, 40639, 27955, 64437, 22064, 9394, 45872, 442}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 37501, objArr);
        Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
        cipher.init(2, this.zzb, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        byte[] bArrDoFinal = cipher.doFinal(bArr, 12, bArr.length - 12);
        int i3 = onWarmupCompleted + 105;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 13 / 0;
        }
        return bArrDoFinal;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbh
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws Throwable {
        int i2 = 2 % 2;
        try {
            byte[] bArrZzd = zzd(bArr, bArr2);
            int i3 = onExtraCallback + 61;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return bArrZzd;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e);
            zza();
            byte[] bArrZzd2 = zzd(bArr, bArr2);
            int i4 = onExtraCallback + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 23 / 0;
            }
            return bArrZzd2;
        }
    }

    private final byte[] zzd(byte[] bArr, byte[] bArr2) throws Throwable {
        int i2 = 2 % 2;
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i3 = onExtraCallback + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr3 = new byte[bArr.length + 28];
        Object[] objArr = new Object[1];
        a(new char[]{9804, 46133, 676, 37205, 28606, 64063, 18606, 10057, 46507, 7, 40639, 27955, 64437, 22064, 9394, 45872, 442}, 37502 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
        cipher.init(1, this.zzb);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        int i5 = onExtraCallback + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return bArr3;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i4 = $10 + 75;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 24 - (ViewConfiguration.getFadingEdgeLength() >> 16), Gravity.getAbsoluteGravity(0, 0) + 19627, 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 58, Process.getGidForName("") + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i7 = $10 + 119;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 58, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), 59 - Gravity.getAbsoluteGravity(0, 0), 6382 - TextUtils.lastIndexOf("", '0', 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr2);
        int i8 = $11 + 117;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = 2787994758522250042L;
    }
}

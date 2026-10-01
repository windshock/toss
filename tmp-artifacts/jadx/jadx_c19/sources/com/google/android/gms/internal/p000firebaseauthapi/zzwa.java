package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzwa implements zzxk {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static int onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static int onWarmupCompleted;
    private static final zzic.zza zza;
    private static final ThreadLocal<Cipher> zzb;
    private final SecretKeySpec zzc;
    private final int zzd;
    private final int zze;

    static {
        onExtraCallbackWithResult();
        zza = zzic.zza.zzb;
        zzb = new zzwc();
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public zzwa(byte[] bArr, int i2) throws Throwable {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzxq.zza(bArr.length);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-125, -126, -127}, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        this.zzc = new SecretKeySpec(bArr, ((String) objArr[0]).intern());
        int blockSize = zzb.get().getBlockSize();
        this.zze = blockSize;
        if (i2 >= 12) {
            int i3 = asBinder;
            int i4 = i3 + 61;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (i2 <= blockSize) {
                int i6 = i3 + 81;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                this.zzd = i2;
                return;
            }
        }
        throw new GeneralSecurityException("invalid IV size");
    }

    private final void zza(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, byte[] bArr3, boolean z) throws GeneralSecurityException {
        int i5 = 2 % 2;
        Cipher cipher = zzb.get();
        byte[] bArr4 = new byte[this.zze];
        System.arraycopy(bArr3, 0, bArr4, 0, this.zzd);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            int i6 = asBinder + 113;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            cipher.init(1, this.zzc, ivParameterSpec);
        } else {
            cipher.init(2, this.zzc, ivParameterSpec);
        }
        int i8 = asBinder + 15;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        if (cipher.doFinal(bArr, i2, i3, bArr2, i4) != i3) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if ((r13 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r2 = 0 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        throw new java.security.GeneralSecurityException("ciphertext too short");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 >= r3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 >= r3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r10 = new byte[r3];
        java.lang.System.arraycopy(r13, 0, r10, 0, r3);
        r1 = r13.length;
        r6 = r12.zzd;
        r1 = new byte[r1 - r6];
        zza(r13, r6, r13.length - r6, r1, 0, r10, false);
        r13 = com.google.android.gms.internal.p000firebaseauthapi.zzwa.asBinder + 59;
        com.google.android.gms.internal.p000firebaseauthapi.zzwa.asInterface = r13 % 128;
     */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzxk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int i2;
        int i3 = 2 % 2;
        int i4 = asBinder + 57;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int length = bArr.length;
            i2 = this.zzd;
            int i5 = 3 / 0;
        } else {
            int length2 = bArr.length;
            i2 = this.zzd;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzxk
    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        int i2 = 2 % 2;
        int i3 = asBinder + 101;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        int length = bArr.length;
        int i6 = this.zzd;
        if (length > Integer.MAX_VALUE - i6) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - i6));
        }
        int i7 = i4 + 81;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            bArr2 = new byte[bArr.length >>> i6];
            byte[] bArrZza = zzov.zza(i6);
            System.arraycopy(bArrZza, 0, bArr2, 1, this.zzd);
            zza(bArr, 0, bArr.length, bArr2, this.zzd, bArrZza, false);
        } else {
            bArr2 = new byte[bArr.length + i6];
            byte[] bArrZza2 = zzov.zza(i6);
            System.arraycopy(bArrZza2, 0, bArr2, 0, this.zzd);
            zza(bArr, 0, bArr.length, bArr2, this.zzd, bArrZza2, true);
        }
        int i8 = asBinder + 105;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        return bArr2;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallbackWithResult;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 78 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 74 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 16037 - (ViewConfiguration.getTapTimeout() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i6 = 1052772399;
            if (IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $11 + 119;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Gravity.getAbsoluteGravity(0, 0) + 63, View.MeasureSpec.getMode(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i9 = $11 + 111;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                i3 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                i3 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
            }
            char[] cArr6 = new char[i3];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i10 = $10 + 59;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 62 - ImageFormat.getBitsPerPixel(0), 12215 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i6 = 1052772399;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = new char[]{32740, 32536, 32522};
        onExtraCallback = -1184333915;
        onNavigationEvent = true;
        IAuthTabCallback = true;
    }
}

package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzma implements zzcd {
    private static char IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static long onWarmupCompleted = 0;
    private static final Object zza;
    private static final String zzb = "zzma";
    private final String zzc;
    private KeyStore zzd;
    private static final byte[] $$a = {70, 83, 77, 1};
    private static final int $$b = 64;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onNavigationEvent = 1;

    public static final class zza {
        KeyStore zza;
        private String zzb = null;

        public zza() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            this.zza = null;
            if (!zzma.zza()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.zza = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, short s, short s2) {
        int i3;
        int i4;
        int i5 = (s * 4) + 4;
        byte[] bArr = $$a;
        int i6 = (s2 * 2) + 1;
        int i7 = 110 - i2;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i5;
            i7 = i6;
            i4 = 0;
            i5++;
            i7 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i5];
            i5++;
            i7 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        }
    }

    static /* synthetic */ boolean zza() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 29;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 83;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzcd
    public final zzbh zza(String str) throws GeneralSecurityException {
        zzly zzlyVar;
        synchronized (this) {
            zzlyVar = new zzly(zzxq.zza("android-keystore://", str), this.zzd);
            byte[] bArrZza = zzov.zza(10);
            byte[] bArr = new byte[0];
            if (!Arrays.equals(bArrZza, zzlyVar.zza(zzlyVar.zzb(bArrZza, bArr), bArr))) {
                throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
            }
        }
        return zzlyVar;
    }

    static {
        onExtraCallback = 0;
        onWarmupCompleted();
        zza = new Object();
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public zzma() throws GeneralSecurityException {
        this(new zza());
    }

    private zzma(zza zzaVar) {
        this.zzc = null;
        this.zzd = zzaVar.zza;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzcd
    public final boolean zzb(String str) {
        boolean zStartsWith;
        synchronized (this) {
            zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return zStartsWith;
    }

    static boolean zzc(String str) throws GeneralSecurityException {
        zzma zzmaVar = new zzma();
        synchronized (zza) {
            if (zzmaVar.zzd(str)) {
                return false;
            }
            String strZza = zzxq.zza("android-keystore://", str);
            Object[] objArr = new Object[1];
            a((char) (45187 - (ViewConfiguration.getScrollBarSize() >> 8)), TextUtils.indexOf("", "", 0) - 1527595329, new char[]{34650, 40703, 11894}, new char[]{0, 0, 0, 0}, new char[]{48920, 62142, 33700, 10160}, objArr);
            KeyGenerator keyGenerator = KeyGenerator.getInstance(((String) objArr[0]).intern(), "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(strZza, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
            return true;
        }
    }

    private final boolean zzd(String str) throws GeneralSecurityException {
        boolean zContainsAlias;
        synchronized (this) {
            String strZza = zzxq.zza("android-keystore://", str);
            try {
                zContainsAlias = this.zzd.containsAlias(strZza);
            } catch (NullPointerException unused) {
                Log.w(zzb, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
                try {
                    try {
                        Thread.sleep((int) (Math.random() * 40.0d));
                    } catch (InterruptedException unused2) {
                    }
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    this.zzd = keyStore;
                    keyStore.load(null);
                    return this.zzd.containsAlias(strZza);
                } catch (IOException e) {
                    throw new GeneralSecurityException(e);
                }
            }
        }
        return zContainsAlias;
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i6 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i7 = $10 + 69;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i9 = $10 + 107;
            $11 = i9 % 128;
            int i10 = i9 % i4;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", i6);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 43;
                    int bitsPerPixel = 1450 - ImageFormat.getBitsPerPixel(i6);
                    byte b = (byte) ($$a[3] - 1);
                    byte b2 = b;
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i6] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetAfter, longPressTimeout, bitsPerPixel, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 49123);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 44;
                        int iRed = 1494 - Color.red(i6);
                        byte b3 = $$a[3];
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(edgeSlop, fadingEdgeLength, iRed, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 23973), View.MeasureSpec.getMode(0) + 50, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                i3 = 2;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 29 - TextUtils.getTrimmedLength(""), TextUtils.lastIndexOf("", '0', 0, 0) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i3 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i4 = i3;
                            i6 = 0;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = 7798559133331975163L;
        onExtraCallbackWithResult = -1776194565;
        IAuthTabCallback = (char) 54948;
    }
}

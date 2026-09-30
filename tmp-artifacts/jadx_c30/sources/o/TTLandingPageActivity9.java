package o;

import android.graphics.ImageFormat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.sf.scuba.smartcards.BuildConfig;
import org.apache.commons.compress.PasswordRequiredException;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TTLandingPageActivity9 extends TTLandingPageActivityzb {
    static byte[] onWarmupCompleted(byte[] bArr, int i, byte[] bArr2) throws NoSuchAlgorithmException {
        int i2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256);
            byte[] bArr3 = new byte[8];
            for (long j = 0; j < (1 << i); j++) {
                messageDigest.update(bArr2);
                messageDigest.update(bArr);
                messageDigest.update(bArr3);
                while (i2 < 8) {
                    byte b = (byte) (bArr3[i2] + 1);
                    bArr3[i2] = b;
                    i2 = b == 0 ? i2 + 1 : 0;
                }
            }
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-256 is unsupported by your Java implementation", e);
        }
    }

    TTLandingPageActivity9() {
        super(TTLandingPageActivitysya.class);
    }

    @Override // o.TTLandingPageActivityzb
    InputStream onNavigationEvent(final String str, final InputStream inputStream, long j, final TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, final byte[] bArr, int i) {
        return new InputStream() { // from class: o.TTLandingPageActivity9.1
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallbackStub = 1;
            private static char[] asBinder = {27261, 27172, 27173, 27176, 27178, 27180, 27158, 27153, 27152, 27248, 27255, 27148, 27148, 27255, 27151, 27138, 27149, 27246, 27149, 27138, 27148, 27261, 27259, 27237, 27142, 27199, 27198, 27169, 27172, 27173, 27197, 27168, 27177, 27170, 27143, 27140, 27199, 27169, 27145, 27143, 27171, 27173, 27198, 27197, 27140, 27146, 27173, 27145};
            private static int onTransact;
            private boolean IAuthTabCallbackDefault;
            private CipherInputStream asInterface;

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                CipherInputStream cipherInputStream;
                int i2 = 2 % 2;
                int i3 = onTransact + 57;
                int i4 = i3 % 128;
                IAuthTabCallbackStub = i4;
                if (i3 % 2 == 0) {
                    cipherInputStream = this.asInterface;
                    int i5 = 45 / 0;
                    if (cipherInputStream == null) {
                        return;
                    }
                } else {
                    cipherInputStream = this.asInterface;
                    if (cipherInputStream == null) {
                        return;
                    }
                }
                int i6 = i4 + 69;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                cipherInputStream.close();
                if (i7 != 0) {
                    throw null;
                }
            }

            private CipherInputStream onNavigationEvent() throws Throwable {
                byte[] bArrOnWarmupCompleted;
                int i2 = 2 % 2;
                Object obj = null;
                if (this.IAuthTabCallbackDefault) {
                    int i3 = onTransact;
                    int i4 = i3 + 39;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    CipherInputStream cipherInputStream = this.asInterface;
                    int i6 = i3 + 33;
                    IAuthTabCallbackStub = i6 % 128;
                    if (i6 % 2 != 0) {
                        return cipherInputStream;
                    }
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr2 = tTPlayableLandingPageActivity4.onWarmupCompleted;
                if (bArr2 == null) {
                    throw new IOException("Missing AES256 properties in " + str);
                }
                int i7 = onTransact + 101;
                int i8 = i7 % 128;
                IAuthTabCallbackStub = i8;
                if (i7 % 2 != 0 ? bArr2.length < 2 : bArr2.length < 2) {
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr = new Object[1];
                    a(new int[]{17, 31, 0, 0}, false, new byte[]{1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr);
                    sb.append(((String) objArr[0]).intern());
                    sb.append(str);
                    throw new IOException(sb.toString());
                }
                int i9 = i8 + 71;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                int i11 = bArr2[0];
                int i12 = i11 & GF2Field.MASK;
                int i13 = i11 & 63;
                int i14 = bArr2[1];
                int i15 = ((i12 >> 6) & 1) + (i14 & 15);
                int i16 = ((i12 >> 7) & 1) + ((i14 & GF2Field.MASK) >> 4);
                int i17 = i16 + 2;
                if (i17 + i15 > bArr2.length) {
                    throw new IOException("Salt size + IV size too long in " + str);
                }
                byte[] bArr3 = new byte[i16];
                System.arraycopy(bArr2, 2, bArr3, 0, i16);
                byte[] bArr4 = new byte[16];
                System.arraycopy(tTPlayableLandingPageActivity4.onWarmupCompleted, i17, bArr4, 0, i15);
                byte[] bArr5 = bArr;
                if (bArr5 == null) {
                    throw new PasswordRequiredException(str);
                }
                if (i13 == 63) {
                    bArrOnWarmupCompleted = new byte[32];
                    System.arraycopy(bArr3, 0, bArrOnWarmupCompleted, 0, i16);
                    byte[] bArr6 = bArr;
                    System.arraycopy(bArr6, 0, bArrOnWarmupCompleted, i16, Math.min(bArr6.length, 32 - i16));
                } else {
                    bArrOnWarmupCompleted = TTLandingPageActivity9.onWarmupCompleted(bArr5, i13, bArr3);
                    int i18 = IAuthTabCallbackStub + 33;
                    onTransact = i18 % 128;
                    int i19 = i18 % 2;
                }
                SecretKeySpec secretKeySpecIAuthTabCallback = TTLandingPageActivitysya.IAuthTabCallback(bArrOnWarmupCompleted);
                try {
                    Object[] objArr2 = new Object[1];
                    a(new int[]{0, 17, 0, 0}, true, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, objArr2);
                    Cipher cipher = Cipher.getInstance(((String) objArr2[0]).intern());
                    cipher.init(2, secretKeySpecIAuthTabCallback, new IvParameterSpec(bArr4));
                    CipherInputStream cipherInputStream2 = new CipherInputStream(inputStream, cipher);
                    this.asInterface = cipherInputStream2;
                    this.IAuthTabCallbackDefault = true;
                    int i20 = onTransact + 61;
                    IAuthTabCallbackStub = i20 % 128;
                    if (i20 % 2 != 0) {
                        return cipherInputStream2;
                    }
                    obj.hashCode();
                    throw null;
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException("Decryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)", e);
                }
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallbackStub + 3;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                int i5 = onNavigationEvent().read();
                int i6 = onTransact + 57;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    return i5;
                }
                throw null;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr2, int i2, int i3) throws Throwable {
                int i4 = 2 % 2;
                int i5 = onTransact + 73;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                CipherInputStream cipherInputStreamOnNavigationEvent = onNavigationEvent();
                if (i6 != 0) {
                    return cipherInputStreamOnNavigationEvent.read(bArr2, i2, i3);
                }
                cipherInputStreamOnNavigationEvent.read(bArr2, i2, i3);
                throw null;
            }

            private static void a(int[] iArr, boolean z, byte[] bArr2, Object[] objArr) throws Throwable {
                int i2 = 2;
                int i3 = 2 % 2;
                TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = iArr[2];
                int i7 = iArr[3];
                char[] cArr = asBinder;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $10 + 1;
                        $11 = i9 % 128;
                        int i10 = i9 % i2;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 35283), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 36, 14239 - (ViewConfiguration.getTapTimeout() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i8++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i5];
                System.arraycopy(cArr, i4, cArr3, 0, i5);
                if (bArr2 != null) {
                    char[] cArr4 = new char[i5];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    char c = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                        if (bArr2[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                            int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10935), 65 - (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } else {
                            int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 29, 17657 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        }
                        c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        try {
                            Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)), 69 - ImageFormat.getBitsPerPixel(0), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    cArr3 = cArr4;
                }
                if (i7 > 0) {
                    char[] cArr5 = new char[i5];
                    System.arraycopy(cArr3, 0, cArr5, 0, i5);
                    int i13 = i5 - i7;
                    System.arraycopy(cArr5, 0, cArr3, i13, i7);
                    System.arraycopy(cArr5, i7, cArr3, 0, i13);
                }
                if (z) {
                    char[] cArr6 = new char[i5];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                    cArr3 = cArr6;
                }
                if (i6 > 0) {
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                        int i14 = $10 + 81;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                }
                objArr[0] = new String(cArr3);
            }
        };
    }

    @Override // o.TTLandingPageActivityzb
    byte[] onWarmupCompleted(Object obj) throws IOException {
        TTLandingPageActivitysya tTLandingPageActivitysya = (TTLandingPageActivitysya) obj;
        byte[] bArr = new byte[tTLandingPageActivitysya.onWarmupCompleted().length + 2 + tTLandingPageActivitysya.onNavigationEvent().length];
        bArr[0] = (byte) (tTLandingPageActivitysya.onExtraCallback() | (tTLandingPageActivitysya.onWarmupCompleted().length == 0 ? 0 : 128) | (tTLandingPageActivitysya.onNavigationEvent().length == 0 ? 0 : 64));
        if (tTLandingPageActivitysya.onWarmupCompleted().length == 0 && tTLandingPageActivitysya.onNavigationEvent().length == 0) {
            return bArr;
        }
        bArr[1] = (byte) (((tTLandingPageActivitysya.onWarmupCompleted().length == 0 ? 0 : tTLandingPageActivitysya.onWarmupCompleted().length - 1) << 4) | (tTLandingPageActivitysya.onNavigationEvent().length == 0 ? 0 : tTLandingPageActivitysya.onNavigationEvent().length - 1));
        System.arraycopy(tTLandingPageActivitysya.onWarmupCompleted(), 0, bArr, 2, tTLandingPageActivitysya.onWarmupCompleted().length);
        System.arraycopy(tTLandingPageActivitysya.onNavigationEvent(), 0, bArr, tTLandingPageActivitysya.onWarmupCompleted().length + 2, tTLandingPageActivitysya.onNavigationEvent().length);
        return bArr;
    }
}

package org.bouncycastle.operator.jcajce;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.SymmetricKeyWrapper;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JceSymmetricKeyWrapper extends SymmetricKeyWrapper {
    private static short[] onNavigationEvent;
    private OperatorHelper helper;
    private SecureRandom random;
    private SecretKey wrappingKey;
    private static final byte[] $$a = {29, -26, 91, ISO7816.INS_REHABILITATE_CHV};
    private static final int $$b = 8;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult = -1010379129;
    private static int onWarmupCompleted = -1538795459;
    private static int onExtraCallback = -55800700;
    private static byte[] IAuthTabCallback = {-58, 118, 124};

    private static String $$c(short s, short s2, byte b) {
        int i = (s * 4) + 115;
        byte[] bArr = $$a;
        int i2 = 4 - (b * 3);
        int i3 = s2 * 3;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i += -i3;
            i2++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                return new String(bArr2, 0);
            }
            i += -bArr[i2];
            i2++;
        }
    }

    public JceSymmetricKeyWrapper(SecretKey secretKey) {
        super(determineKeyEncAlg(secretKey));
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.wrappingKey = secretKey;
    }

    static AlgorithmIdentifier determineKeyEncAlg(String str, int i) throws Throwable {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2;
        int i2 = 2 % 2;
        if (str.startsWith("DES") || str.startsWith("TripleDES")) {
            return new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_CMS3DESwrap, DERNull.INSTANCE);
        }
        if (str.startsWith("RC2")) {
            return new AlgorithmIdentifier(new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.3.7"), new ASN1Integer(58L));
        }
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 112), (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), (-1736511118) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-1491817547) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-53) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        if (str.startsWith(((String) objArr[0]).intern())) {
            if (i == 128) {
                int i3 = IAuthTabCallbackDefault + 101;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes128_wrap;
            } else if (i == 192) {
                aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes192_wrap;
            } else {
                if (i != 256) {
                    throw new IllegalArgumentException("illegal keysize in AES");
                }
                aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes256_wrap;
                int i5 = IAuthTabCallbackDefault + 97;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
            }
            return new AlgorithmIdentifier(aSN1ObjectIdentifier2);
        }
        if (str.startsWith("SEED")) {
            return new AlgorithmIdentifier(KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap);
        }
        if (!str.startsWith("Camellia")) {
            throw new IllegalArgumentException("unknown algorithm");
        }
        if (i == 128) {
            int i7 = IAuthTabCallbackDefault + 123;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            aSN1ObjectIdentifier = NTTObjectIdentifiers.id_camellia128_wrap;
        } else if (i == 192) {
            aSN1ObjectIdentifier = NTTObjectIdentifiers.id_camellia192_wrap;
            int i9 = onTransact + 27;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
        } else {
            if (i != 256) {
                throw new IllegalArgumentException("illegal keysize in Camellia");
            }
            aSN1ObjectIdentifier = NTTObjectIdentifiers.id_camellia256_wrap;
        }
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier);
        int i11 = onTransact + 97;
        IAuthTabCallbackDefault = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 61 / 0;
        }
        return algorithmIdentifier;
    }

    private static AlgorithmIdentifier determineKeyEncAlg(SecretKey secretKey) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        AlgorithmIdentifier algorithmIdentifierDetermineKeyEncAlg = determineKeyEncAlg(secretKey.getAlgorithm(), secretKey.getEncoded().length << 3);
        int i4 = IAuthTabCallbackDefault + 59;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return algorithmIdentifierDetermineKeyEncAlg;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.operator.OperatorException */
    @Override // org.bouncycastle.operator.KeyWrapper
    public byte[] generateWrappedKey(GenericKey genericKey) throws IllegalBlockSizeException, InvalidKeyException, OperatorException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Key jceKey = OperatorUtils.getJceKey(genericKey);
        Cipher cipherCreateSymmetricWrapper = this.helper.createSymmetricWrapper(getAlgorithmIdentifier().getAlgorithm());
        try {
            cipherCreateSymmetricWrapper.init(3, this.wrappingKey, this.random);
            byte[] bArrWrap = cipherCreateSymmetricWrapper.wrap(jceKey);
            int i4 = IAuthTabCallbackDefault + 49;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return bArrWrap;
            }
            throw null;
        } catch (GeneralSecurityException e) {
            throw new OperatorException("cannot wrap key: " + e.getMessage(), e);
        }
    }

    public JceSymmetricKeyWrapper setProvider(String str) {
        int i = 2 % 2;
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        int i2 = IAuthTabCallbackDefault + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return this;
    }

    public JceSymmetricKeyWrapper setProvider(Provider provider) {
        int i = 2 % 2;
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        int i2 = onTransact + 1;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public JceSymmetricKeyWrapper setSecureRandom(SecureRandom secureRandom) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 21;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.random = secureRandom;
        int i5 = i2 + 5;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43424), 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = IAuthTabCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $10 + 121;
                        $11 = i9 % 128;
                        if (i9 % i6 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 12843), View.MeasureSpec.makeMeasureSpec(0, 0) + 55, TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 55 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 2168, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i6 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i10 = $11 + 117;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        byte[] bArr3 = IAuthTabCallback;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] - (-4629411779493505016L))) % ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = IAuthTabCallback;
                        Object[] objArr6 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - Process.getGidForName(BuildConfig.FLAVOR)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, (KeyEvent.getMaxKeyCode() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i5;
                } else {
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                if (z) {
                    int i12 = $10 + 55;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i4;
                Object[] objArr7 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 86, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9566, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback6).invoke(null, objArr7)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = IAuthTabCallback;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    int i14 = 0;
                    while (i14 < length2) {
                        int i15 = $11 + 13;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            bArr6[i14] = (byte) (bArr5[i14] & (-4629411779493505016L));
                            i14--;
                        } else {
                            bArr6[i14] = (byte) (bArr5[i14] ^ (-4629411779493505016L));
                            i14++;
                        }
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr7 = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i16 = $10 + 125;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            String string = sb.toString();
            int i18 = $10 + 53;
            $11 = i18 % 128;
            if (i18 % 2 != 0) {
                objArr[0] = string;
            } else {
                int i19 = 44 / 0;
                objArr[0] = string;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}

package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.RSAKeyPairGenerator;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static final AlgorithmIdentifier PKCS_ALGID;
    private static final AlgorithmIdentifier PSS_ALGID;
    static final BigInteger defaultPublicExponent;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    AlgorithmIdentifier algId;
    RSAKeyPairGenerator engine;
    RSAKeyGenerationParameters param;

    static {
        onExtraCallbackWithResult();
        PKCS_ALGID = new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE);
        PSS_ALGID = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_RSASSA_PSS);
        defaultPublicExponent = BigInteger.valueOf(65537L);
        int i = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KeyPairGeneratorSpi() throws Throwable {
        Object[] objArr = new Object[1];
        a(new int[]{0, 3, 122, 0}, true, new byte[]{1, 0, 1}, objArr);
        this(((String) objArr[0]).intern(), PKCS_ALGID);
    }

    public KeyPairGeneratorSpi(String str, AlgorithmIdentifier algorithmIdentifier) {
        super(str);
        this.algId = algorithmIdentifier;
        this.engine = new RSAKeyPairGenerator();
        RSAKeyGenerationParameters rSAKeyGenerationParameters = new RSAKeyGenerationParameters(defaultPublicExponent, CryptoServicesRegistrar.getSecureRandom(), 2048, PrimeCertaintyCalculator.getDefaultCertainty(2048));
        this.param = rSAKeyGenerationParameters;
        this.engine.init(rSAKeyGenerationParameters);
    }

    static /* synthetic */ AlgorithmIdentifier access$000() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return PSS_ALGID;
        }
        throw null;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        int i = 2 % 2;
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
        KeyPair keyPair = new KeyPair(new BCRSAPublicKey(this.algId, (RSAKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCRSAPrivateCrtKey(this.algId, (RSAPrivateCrtKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
        return keyPair;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        int i2 = 2 % 2;
        RSAKeyGenerationParameters rSAKeyGenerationParameters = new RSAKeyGenerationParameters(defaultPublicExponent, secureRandom, i, PrimeCertaintyCalculator.getDefaultCertainty(i));
        this.param = rSAKeyGenerationParameters;
        this.engine.init(rSAKeyGenerationParameters);
        int i3 = onWarmupCompleted + 101;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!(algorithmParameterSpec instanceof RSAKeyGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
        }
        RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
        RSAKeyGenerationParameters rSAKeyGenerationParameters = new RSAKeyGenerationParameters(rSAKeyGenParameterSpec.getPublicExponent(), secureRandom, rSAKeyGenParameterSpec.getKeysize(), PrimeCertaintyCalculator.getDefaultCertainty(2048));
        this.param = rSAKeyGenerationParameters;
        this.engine.init(rSAKeyGenerationParameters);
        int i4 = onWarmupCompleted + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallback;
        float f = 0.0f;
        Object obj = null;
        if (cArr != null) {
            int i7 = $11 + 35;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 125;
                $11 = i10 % 128;
                if (i10 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 35, (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(obj, objArr2)).charValue();
                        i9 %= 1;
                        i = 2;
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 35283), 35 - Color.alpha(0), 14239 - ExpandableListView.getPackedPositionGroup(0L), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i9++;
                        i = 2;
                        f = 0.0f;
                        obj = null;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i11 = $11 + 9;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)), AndroidCharacter.getMirror('0') + 17, 16718 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29, 17658 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    int i15 = $11 + 27;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 49467), 69 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), 12487 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            int i17 = $11 + 7;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i19 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i19, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i19);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{27155, 27274, 27266};
    }

    public static class PSS extends KeyPairGeneratorSpi {
        private static short[] onExtraCallback;
        private static final byte[] $$a = {121, -58, 81, 67};
        private static final int $$b = 244;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = -1341916424;
        private static int IAuthTabCallback = -1538795416;
        private static int onWarmupCompleted = 1460249185;
        private static byte[] onExtraCallbackWithResult = {-94, 106, 105, 73, -122, -124, 106, 120, -124, 107};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, int i, int i2) {
            int i3;
            int i4 = b + 4;
            byte[] bArr = $$a;
            int i5 = i * 3;
            int i6 = (i2 * 2) + 115;
            byte[] bArr2 = new byte[1 - i5];
            int i7 = 0 - i5;
            if (bArr == null) {
                int i8 = i4;
                int i9 = i7;
                int i10 = 0;
                int i11 = (-i4) + i9;
                i3 = i10;
                int i12 = i8;
                i6 = i11;
                i4 = i12;
                bArr2[i3] = (byte) i6;
                int i13 = i4 + 1;
                i10 = i3 + 1;
                if (i3 == i7) {
                    return new String(bArr2, 0);
                }
                int i14 = i6;
                i8 = i13;
                i4 = bArr[i13];
                i9 = i14;
                int i112 = (-i4) + i9;
                i3 = i10;
                int i122 = i8;
                i6 = i112;
                i4 = i122;
                bArr2[i3] = (byte) i6;
                int i132 = i4 + 1;
                i10 = i3 + 1;
                if (i3 == i7) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i6;
                int i1322 = i4 + 1;
                i10 = i3 + 1;
                if (i3 == i7) {
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PSS() throws Throwable {
            Object[] objArr = new Object[1];
            b((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 97), (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (-340009712) - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), Color.red(0) - 97, 212960745 + Color.argb(0, 0, 0, 0), objArr);
            super(((String) objArr[0]).intern(), KeyPairGeneratorSpi.access$000());
        }

        /* JADX WARN: Removed duplicated region for block: B:62:0x02cc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            int i4;
            int i5;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                long j = 0;
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 43424), 42 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                int i7 = -1;
                if (iIntValue == -1) {
                    int i8 = $11 + 17;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    z = true;
                } else {
                    z = false;
                }
                char c = '0';
                if (z) {
                    int i10 = $11 + 65;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    byte[] bArr = onExtraCallbackWithResult;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i12 = 0;
                        while (i12 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char cIndexOf = (char) (12842 - TextUtils.indexOf(BuildConfig.FLAVOR, c, 0, 0));
                                int pressedStateDuration = 55 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int i13 = 2168 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                                byte b2 = (byte) i7;
                                byte b3 = (byte) (b2 + 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, pressedStateDuration, i13, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i12++;
                            i7 = -1;
                            j = 0;
                            c = '0';
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i14 = $10 + 51;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            byte[] bArr3 = onExtraCallbackWithResult;
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 43424), ExpandableListView.getPackedPositionChild(0L) + 43, 22440 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] - 4629411779493505016L)) * ((int) (IAuthTabCallback % (-4629411779493505016L)));
                        } else {
                            byte[] bArr4 = onExtraCallbackWithResult;
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - KeyEvent.normalizeMetaState(0)), 42 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 22439 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                        }
                        iIntValue = (byte) i5;
                    } else {
                        iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    int i15 = $11;
                    int i16 = i15 + 41;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                    if (z) {
                        i4 = 1;
                    } else {
                        int i19 = i15 + 15;
                        $10 = i19 % 128;
                        int i20 = i19 % 2;
                        i4 = 0;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i18 + i4;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 86 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = onExtraCallbackWithResult;
                    if (bArr5 != null) {
                        int i21 = $10 + 115;
                        $11 = i21 % 128;
                        int i22 = i21 % 2;
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i23 = 0; i23 < length2; i23++) {
                            bArr6[i23] = (byte) (bArr5[i23] ^ (-4629411779493505016L));
                        }
                        bArr5 = bArr6;
                    }
                    if (bArr5 != null) {
                        int i24 = $10 + 107;
                        $11 = i24 % 128;
                        boolean z2 = i24 % 2 != 0;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                        while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                            int i25 = $10 + 111;
                            $11 = i25 % 128;
                            if (i25 % 2 == 0) {
                                throw null;
                            }
                            if (z2) {
                                byte[] bArr7 = onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            } else {
                                short[] sArr = onExtraCallback;
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
}

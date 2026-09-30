package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class BCRSAPrivateCrtKey extends BCRSAPrivateKey implements RSAPrivateCrtKey {
    private static short[] onExtraCallback = null;
    static final long serialVersionUID = 7834723820638524718L;
    private BigInteger crtCoefficient;
    private BigInteger primeExponentP;
    private BigInteger primeExponentQ;
    private BigInteger primeP;
    private BigInteger primeQ;
    private BigInteger publicExponent;
    private static final byte[] $$a = {19, ISO7816.INS_INCREASE, -9, 119};
    private static final int $$b = 244;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onWarmupCompleted = 1355726789;
    private static int onNavigationEvent = -1538795506;
    private static int onExtraCallbackWithResult = 518349018;
    private static byte[] IAuthTabCallback = {51, -81, 28, 18, 35, -60, 10, 7, 43, ISO7816.INS_READ_RECORD2, -7, 27, -29, 5, -1, ISO7816.INS_PSO, 56, -41, -26, 9, 8};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    private static String $$c(byte b, byte b2, byte b3) {
        ?? r7 = (b3 * 4) + 115;
        byte[] bArr = $$a;
        int i = b * 4;
        int i2 = (b2 * 2) + 4;
        byte[] bArr2 = new byte[i + 1];
        int i3 = -1;
        byte b4 = r7;
        if (bArr == null) {
            i3 = -1;
            b4 = i2 + r7;
            i2++;
        }
        while (true) {
            int i4 = i3 + 1;
            bArr2[i4] = b4;
            if (i4 == i) {
                return new String(bArr2, 0);
            }
            byte b5 = b4;
            i3 = i4;
            b4 = bArr[i2] + b5;
            i2++;
        }
    }

    BCRSAPrivateCrtKey(RSAPrivateCrtKey rSAPrivateCrtKey) {
        super(new RSAPrivateCrtKeyParameters(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient()));
        this.modulus = rSAPrivateCrtKey.getModulus();
        this.publicExponent = rSAPrivateCrtKey.getPublicExponent();
        this.privateExponent = rSAPrivateCrtKey.getPrivateExponent();
        this.primeP = rSAPrivateCrtKey.getPrimeP();
        this.primeQ = rSAPrivateCrtKey.getPrimeQ();
        this.primeExponentP = rSAPrivateCrtKey.getPrimeExponentP();
        this.primeExponentQ = rSAPrivateCrtKey.getPrimeExponentQ();
        this.crtCoefficient = rSAPrivateCrtKey.getCrtCoefficient();
    }

    BCRSAPrivateCrtKey(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        super(new RSAPrivateCrtKeyParameters(rSAPrivateCrtKeySpec.getModulus(), rSAPrivateCrtKeySpec.getPublicExponent(), rSAPrivateCrtKeySpec.getPrivateExponent(), rSAPrivateCrtKeySpec.getPrimeP(), rSAPrivateCrtKeySpec.getPrimeQ(), rSAPrivateCrtKeySpec.getPrimeExponentP(), rSAPrivateCrtKeySpec.getPrimeExponentQ(), rSAPrivateCrtKeySpec.getCrtCoefficient()));
        this.modulus = rSAPrivateCrtKeySpec.getModulus();
        this.publicExponent = rSAPrivateCrtKeySpec.getPublicExponent();
        this.privateExponent = rSAPrivateCrtKeySpec.getPrivateExponent();
        this.primeP = rSAPrivateCrtKeySpec.getPrimeP();
        this.primeQ = rSAPrivateCrtKeySpec.getPrimeQ();
        this.primeExponentP = rSAPrivateCrtKeySpec.getPrimeExponentP();
        this.primeExponentQ = rSAPrivateCrtKeySpec.getPrimeExponentQ();
        this.crtCoefficient = rSAPrivateCrtKeySpec.getCrtCoefficient();
    }

    BCRSAPrivateCrtKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this(privateKeyInfo.getPrivateKeyAlgorithm(), RSAPrivateKey.getInstance(privateKeyInfo.parsePrivateKey()));
    }

    BCRSAPrivateCrtKey(RSAPrivateKey rSAPrivateKey) {
        this(BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER, rSAPrivateKey);
    }

    BCRSAPrivateCrtKey(AlgorithmIdentifier algorithmIdentifier, RSAPrivateKey rSAPrivateKey) {
        super(algorithmIdentifier, new RSAPrivateCrtKeyParameters(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent(), rSAPrivateKey.getPrivateExponent(), rSAPrivateKey.getPrime1(), rSAPrivateKey.getPrime2(), rSAPrivateKey.getExponent1(), rSAPrivateKey.getExponent2(), rSAPrivateKey.getCoefficient()));
        this.modulus = rSAPrivateKey.getModulus();
        this.publicExponent = rSAPrivateKey.getPublicExponent();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
        this.primeP = rSAPrivateKey.getPrime1();
        this.primeQ = rSAPrivateKey.getPrime2();
        this.primeExponentP = rSAPrivateKey.getExponent1();
        this.primeExponentQ = rSAPrivateKey.getExponent2();
        this.crtCoefficient = rSAPrivateKey.getCoefficient();
    }

    BCRSAPrivateCrtKey(AlgorithmIdentifier algorithmIdentifier, RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters) {
        super(algorithmIdentifier, rSAPrivateCrtKeyParameters);
        this.publicExponent = rSAPrivateCrtKeyParameters.getPublicExponent();
        this.primeP = rSAPrivateCrtKeyParameters.getP();
        this.primeQ = rSAPrivateCrtKeyParameters.getQ();
        this.primeExponentP = rSAPrivateCrtKeyParameters.getDP();
        this.primeExponentQ = rSAPrivateCrtKeyParameters.getDQ();
        this.crtCoefficient = rSAPrivateCrtKeyParameters.getQInv();
    }

    BCRSAPrivateCrtKey(RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters) {
        super(rSAPrivateCrtKeyParameters);
        this.publicExponent = rSAPrivateCrtKeyParameters.getPublicExponent();
        this.primeP = rSAPrivateCrtKeyParameters.getP();
        this.primeQ = rSAPrivateCrtKeyParameters.getQ();
        this.primeExponentP = rSAPrivateCrtKeyParameters.getDP();
        this.primeExponentQ = rSAPrivateCrtKeyParameters.getDQ();
        this.crtCoefficient = rSAPrivateCrtKeyParameters.getQInv();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i = 2 % 2;
        objectInputStream.defaultReadObject();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.rsaPrivateKey = new RSAPrivateCrtKeyParameters(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient());
        int i2 = asInterface + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        objectOutputStream.defaultWriteObject();
        int i4 = asInterface + 17;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj == this) {
            int i2 = IAuthTabCallbackDefault + 15;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RSAPrivateCrtKey)) {
            int i4 = asInterface + 117;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) obj;
        if (getModulus().equals(rSAPrivateCrtKey.getModulus()) && getPublicExponent().equals(rSAPrivateCrtKey.getPublicExponent())) {
            int i6 = IAuthTabCallbackDefault + 21;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            if (getPrivateExponent().equals(rSAPrivateCrtKey.getPrivateExponent()) && getPrimeP().equals(rSAPrivateCrtKey.getPrimeP()) && getPrimeQ().equals(rSAPrivateCrtKey.getPrimeQ()) && getPrimeExponentP().equals(rSAPrivateCrtKey.getPrimeExponentP()) && getPrimeExponentQ().equals(rSAPrivateCrtKey.getPrimeExponentQ()) && getCrtCoefficient().equals(rSAPrivateCrtKey.getCrtCoefficient())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getCrtCoefficient() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        BigInteger bigInteger = this.crtCoefficient;
        int i4 = i3 + 53;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return bigInteger;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey, java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        byte[] encodedPrivateKeyInfo = KeyUtil.getEncodedPrivateKeyInfo(this.algorithmIdentifier, new RSAPrivateKey(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
        int i2 = IAuthTabCallbackDefault + 63;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return encodedPrivateKeyInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey, java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 95;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 59;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentP() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 117;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        BigInteger bigInteger = this.primeExponentP;
        int i5 = i2 + 41;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return bigInteger;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentQ() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        BigInteger bigInteger = this.primeExponentQ;
        int i5 = i3 + 33;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return bigInteger;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeP() {
        BigInteger bigInteger;
        int i = 2 % 2;
        int i2 = asInterface + 19;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            bigInteger = this.primeP;
            int i4 = 52 / 0;
        } else {
            bigInteger = this.primeP;
        }
        int i5 = i3 + 27;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeQ() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BigInteger bigInteger = this.primeQ;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return bigInteger;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPublicExponent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 31;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        BigInteger bigInteger = this.publicExponent;
        int i5 = i2 + 95;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (getModulus().hashCode() ^ getPublicExponent().hashCode()) ^ getPrivateExponent().hashCode();
        int i4 = IAuthTabCallbackDefault + 103;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public String toString() throws Throwable {
        int i = 2 % 2;
        StringBuffer stringBuffer = new StringBuffer();
        String strLineSeparator = Strings.lineSeparator();
        Object[] objArr = new Object[1];
        a((short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 192321587 + (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1163741055, 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        stringBuffer.append(((String) objArr[0]).intern());
        stringBuffer.append(RSAUtil.generateKeyFingerprint(getModulus()));
        stringBuffer.append("]");
        stringBuffer.append(",[");
        stringBuffer.append(RSAUtil.generateExponentFingerprint(getPublicExponent()));
        stringBuffer.append("]");
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("             modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("     public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(strLineSeparator);
        String string = stringBuffer.toString();
        int i2 = IAuthTabCallbackDefault + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j2 = 0;
            float f = 0.0f;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 43, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 47;
                $11 = i6 % 128;
                i4 = i6 % 2 == 0 ? 0 : 1;
            }
            if (i4 != 0) {
                int i7 = $11 + 75;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                byte[] bArr = IAuthTabCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char c = (char) ((PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 12843);
                            int offsetAfter = TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 55;
                            int packedPositionType = 2167 - ExpandableListView.getPackedPositionType(j2);
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c, offsetAfter, packedPositionType, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i9++;
                        j2 = 0;
                        f = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43424), 42 - KeyEvent.normalizeMetaState(0), View.resolveSizeAndState(0, 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ j)) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 86 - (Process.myPid() >> 22), 9567 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i10 = 0;
                    while (i10 < length2) {
                        int i11 = $10;
                        int i12 = i11 + 77;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            bArr5[i10] = (byte) (bArr4[i10] - 4629411779493505016L);
                            i10 = 0;
                        } else {
                            bArr5[i10] = (byte) (bArr4[i10] ^ (-4629411779493505016L));
                            i10++;
                        }
                        int i13 = i11 + 123;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i15 = $11 + 73;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    if (z) {
                        byte[] bArr6 = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i17 = $11 + 79;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            String string = sb.toString();
            int i19 = $11 + 49;
            $10 = i19 % 128;
            if (i19 % 2 == 0) {
                objArr[0] = string;
            } else {
                int i20 = 2 / 0;
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

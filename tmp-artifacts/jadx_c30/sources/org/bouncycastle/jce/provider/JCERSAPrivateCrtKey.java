package org.bouncycastle.jce.provider;

import android.graphics.ImageFormat;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JCERSAPrivateCrtKey extends JCERSAPrivateKey implements RSAPrivateCrtKey {
    static final long serialVersionUID = 7834723820638524718L;
    private BigInteger crtCoefficient;
    private BigInteger primeExponentP;
    private BigInteger primeExponentQ;
    private BigInteger primeP;
    private BigInteger primeQ;
    private BigInteger publicExponent;
    private static final byte[] $$a = {120, ISO7816.INS_WRITE_RECORD, ISOFileInfo.A1, -23};
    private static final int $$b = 186;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallback = 7798559133331975163L;
    private static int onWarmupCompleted = -1776194565;
    private static char onNavigationEvent = 31671;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    private static String $$c(short s, short s2, int i) {
        byte[] bArr = $$a;
        ?? r7 = 110 - s2;
        int i2 = i * 2;
        int i3 = 4 - (s * 4);
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        byte b = r7;
        if (bArr == null) {
            b = i3 + r7;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = b;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            byte b2 = b;
            b = b2 + bArr[i3];
            i3++;
        }
    }

    JCERSAPrivateCrtKey(RSAPrivateCrtKey rSAPrivateCrtKey) {
        this.modulus = rSAPrivateCrtKey.getModulus();
        this.publicExponent = rSAPrivateCrtKey.getPublicExponent();
        this.privateExponent = rSAPrivateCrtKey.getPrivateExponent();
        this.primeP = rSAPrivateCrtKey.getPrimeP();
        this.primeQ = rSAPrivateCrtKey.getPrimeQ();
        this.primeExponentP = rSAPrivateCrtKey.getPrimeExponentP();
        this.primeExponentQ = rSAPrivateCrtKey.getPrimeExponentQ();
        this.crtCoefficient = rSAPrivateCrtKey.getCrtCoefficient();
    }

    JCERSAPrivateCrtKey(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        this.modulus = rSAPrivateCrtKeySpec.getModulus();
        this.publicExponent = rSAPrivateCrtKeySpec.getPublicExponent();
        this.privateExponent = rSAPrivateCrtKeySpec.getPrivateExponent();
        this.primeP = rSAPrivateCrtKeySpec.getPrimeP();
        this.primeQ = rSAPrivateCrtKeySpec.getPrimeQ();
        this.primeExponentP = rSAPrivateCrtKeySpec.getPrimeExponentP();
        this.primeExponentQ = rSAPrivateCrtKeySpec.getPrimeExponentQ();
        this.crtCoefficient = rSAPrivateCrtKeySpec.getCrtCoefficient();
    }

    JCERSAPrivateCrtKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this(RSAPrivateKey.getInstance(privateKeyInfo.parsePrivateKey()));
    }

    JCERSAPrivateCrtKey(RSAPrivateKey rSAPrivateKey) {
        this.modulus = rSAPrivateKey.getModulus();
        this.publicExponent = rSAPrivateKey.getPublicExponent();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
        this.primeP = rSAPrivateKey.getPrime1();
        this.primeQ = rSAPrivateKey.getPrime2();
        this.primeExponentP = rSAPrivateKey.getExponent1();
        this.primeExponentQ = rSAPrivateKey.getExponent2();
        this.crtCoefficient = rSAPrivateKey.getCoefficient();
    }

    JCERSAPrivateCrtKey(RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters) {
        super(rSAPrivateCrtKeyParameters);
        this.publicExponent = rSAPrivateCrtKeyParameters.getPublicExponent();
        this.primeP = rSAPrivateCrtKeyParameters.getP();
        this.primeQ = rSAPrivateCrtKeyParameters.getQ();
        this.primeExponentP = rSAPrivateCrtKeyParameters.getDP();
        this.primeExponentQ = rSAPrivateCrtKeyParameters.getDQ();
        this.crtCoefficient = rSAPrivateCrtKeyParameters.getQInv();
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey
    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj == this) {
            int i2 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RSAPrivateCrtKey)) {
            return false;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) obj;
        if (getModulus().equals(rSAPrivateCrtKey.getModulus()) && getPublicExponent().equals(rSAPrivateCrtKey.getPublicExponent())) {
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (getPrivateExponent().equals(rSAPrivateCrtKey.getPrivateExponent()) && !(!getPrimeP().equals(rSAPrivateCrtKey.getPrimeP())) && getPrimeQ().equals(rSAPrivateCrtKey.getPrimeQ())) {
                int i6 = onExtraCallbackWithResult + 35;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                if (getPrimeExponentP().equals(rSAPrivateCrtKey.getPrimeExponentP()) && getPrimeExponentQ().equals(rSAPrivateCrtKey.getPrimeExponentQ()) && getCrtCoefficient().equals(rSAPrivateCrtKey.getCrtCoefficient())) {
                    int i8 = onExtraCallbackWithResult + 7;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getCrtCoefficient() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        BigInteger bigInteger = this.crtCoefficient;
        int i5 = i3 + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return bigInteger;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey, java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        byte[] encodedPrivateKeyInfo = KeyUtil.getEncodedPrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE), new RSAPrivateKey(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
        int i2 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return encodedPrivateKeyInfo;
        }
        throw null;
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey, java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 113;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return "PKCS#8";
        }
        throw null;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentP() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BigInteger bigInteger = this.primeExponentP;
        int i4 = i2 + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return bigInteger;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentQ() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BigInteger bigInteger = this.primeExponentQ;
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return bigInteger;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeP() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        BigInteger bigInteger = this.primeP;
        int i4 = i3 + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return bigInteger;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeQ() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        BigInteger bigInteger = this.primeQ;
        int i5 = i2 + 21;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return bigInteger;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPublicExponent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        BigInteger bigInteger = this.publicExponent;
        int i5 = i2 + 43;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return bigInteger;
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey
    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (getModulus().hashCode() ^ getPublicExponent().hashCode()) ^ getPrivateExponent().hashCode();
        int i4 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        StringBuffer stringBuffer = new StringBuffer();
        String strLineSeparator = Strings.lineSeparator();
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 62202), (-1664380672) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{32761, 2771, 33122, 21004, 24250, 35061, 10209, 841, 1512, 20202, 6561, 30295, 41992, 8974, 64193, 42280, 17248, 24724, 7296}, new char[]{0, 0, 0, 0}, new char[]{65379, 52112, 64156, 61170}, objArr);
        stringBuffer.append(((String) objArr[0]).intern());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("    public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("   private exponent: ");
        stringBuffer.append(getPrivateExponent().toString(16));
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("             primeP: ");
        stringBuffer.append(getPrimeP().toString(16));
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("             primeQ: ");
        stringBuffer.append(getPrimeQ().toString(16));
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("     primeExponentP: ");
        stringBuffer.append(getPrimeExponentP().toString(16));
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("     primeExponentQ: ");
        stringBuffer.append(getPrimeExponentQ().toString(16));
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("     crtCoefficient: ");
        stringBuffer.append(getCrtCoefficient().toString(16));
        stringBuffer.append(strLineSeparator);
        String string = stringBuffer.toString();
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 19;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), AndroidCharacter.getMirror('0') - 5, 1450 - ImageFormat.getBitsPerPixel(0), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0)), 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 23972), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 51, KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 45848), 29 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 12577 - View.MeasureSpec.makeMeasureSpec(0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $10 + 79;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}

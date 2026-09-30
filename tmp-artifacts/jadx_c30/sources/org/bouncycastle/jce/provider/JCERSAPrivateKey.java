package org.bouncycastle.jce.provider;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JCERSAPrivateKey implements RSAPrivateKey, PKCS12BagAttributeCarrier {
    private static long IAuthTabCallback = 0;
    private static BigInteger ZERO = null;
    private static int onExtraCallbackWithResult = 0;
    private static char[] onWarmupCompleted = null;
    static final long serialVersionUID = 5110188922551353628L;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    protected BigInteger modulus;
    protected BigInteger privateExponent;
    private static final byte[] $$d = {113, 46, 90, -12};
    private static final int $$e = 163;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$f(byte b, int i, int i2) {
        int i3;
        int i4 = (i2 * 4) + 4;
        byte[] bArr = $$d;
        int i5 = i * 4;
        int i6 = (b * 4) + 97;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i5;
            i6 = (-i6) + i9;
            i4 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            int i10 = bArr[i4];
            int i11 = i4;
            i9 = i6;
            i6 = i10;
            i8 = i3 + 1;
            i7 = i11;
            i6 = (-i6) + i9;
            i4 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    static {
        onExtraCallbackWithResult = 1;
        onExtraCallback();
        ZERO = BigInteger.valueOf(0L);
        int i = onExtraCallback + 45;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    protected JCERSAPrivateKey() {
    }

    JCERSAPrivateKey(RSAPrivateKey rSAPrivateKey) {
        this.modulus = rSAPrivateKey.getModulus();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
    }

    JCERSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        this.modulus = rSAPrivateKeySpec.getModulus();
        this.privateExponent = rSAPrivateKeySpec.getPrivateExponent();
    }

    JCERSAPrivateKey(RSAKeyParameters rSAKeyParameters) {
        this.modulus = rSAKeyParameters.getModulus();
        this.privateExponent = rSAKeyParameters.getExponent();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int i = 2 % 2;
        this.modulus = (BigInteger) objectInputStream.readObject();
        PKCS12BagAttributeCarrierImpl pKCS12BagAttributeCarrierImpl = new PKCS12BagAttributeCarrierImpl();
        this.attrCarrier = pKCS12BagAttributeCarrierImpl;
        pKCS12BagAttributeCarrierImpl.readObject(objectInputStream);
        this.privateExponent = (BigInteger) objectInputStream.readObject();
        int i2 = IAuthTabCallbackDefault + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        objectOutputStream.writeObject(this.modulus);
        this.attrCarrier.writeObject(objectOutputStream);
        objectOutputStream.writeObject(this.privateExponent);
        int i4 = onNavigationEvent + 5;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof RSAPrivateKey)) {
            int i2 = onNavigationEvent + 59;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (obj == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
        if (getModulus().equals(rSAPrivateKey.getModulus())) {
            int i4 = onNavigationEvent + 79;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            boolean zEquals = getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
            if (i5 == 0) {
                int i6 = 71 / 0;
                if (!(!zEquals)) {
                    return true;
                }
            } else if (zEquals) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        b(3 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), (char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 7682), View.getDefaultSize(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i4 = IAuthTabCallbackDefault + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ASN1Encodable bagAttribute = this.attrCarrier.getBagAttribute(aSN1ObjectIdentifier);
        int i4 = IAuthTabCallbackDefault + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return bagAttribute;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Enumeration getBagAttributeKeys() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Enumeration bagAttributeKeys = this.attrCarrier.getBagAttributeKeys();
        int i4 = onNavigationEvent + 115;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return bagAttributeKeys;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE);
        BigInteger modulus = getModulus();
        BigInteger bigInteger = ZERO;
        BigInteger privateExponent = getPrivateExponent();
        BigInteger bigInteger2 = ZERO;
        byte[] encodedPrivateKeyInfo = KeyUtil.getEncodedPrivateKeyInfo(algorithmIdentifier, new org.bouncycastle.asn1.pkcs.RSAPrivateKey(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
        int i2 = onNavigationEvent + 93;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return encodedPrivateKeyInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 33;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return "PKCS#8";
        }
        throw null;
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        BigInteger bigInteger = this.modulus;
        int i5 = i3 + 85;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return bigInteger;
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public BigInteger getPrivateExponent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        BigInteger bigInteger = this.privateExponent;
        int i5 = i3 + 51;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return bigInteger;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = getModulus().hashCode() ^ getPrivateExponent().hashCode();
        int i4 = IAuthTabCallbackDefault + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.attrCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
        int i4 = IAuthTabCallbackDefault + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 59;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i2 + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getLongPressTimeout() >> 16)), 17 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 10973 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 46134), 32 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 49123), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$f(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $11 + 9;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 49123), 44 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), 1494 - (ViewConfiguration.getEdgeSlop() >> 16), -1657859959, false, $$f(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr);
    }

    static void onExtraCallback() {
        onWarmupCompleted = new char[]{62340, 6670, 8321};
        IAuthTabCallback = 588385841891509343L;
    }
}

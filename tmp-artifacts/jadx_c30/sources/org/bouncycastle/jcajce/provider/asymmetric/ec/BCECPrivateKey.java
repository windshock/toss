package org.bouncycastle.jcajce.provider.asymmetric.ec;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class BCECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier, ECPointEncoder {
    private static short[] onExtraCallbackWithResult = null;
    static final long serialVersionUID = 994553197664784084L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient ProviderConfiguration configuration;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient ASN1BitString publicKey;
    private boolean withCompression;
    private static final byte[] $$a = {79, -25, -14, 102};
    private static final int $$b = 87;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onWarmupCompleted = 430189279;
    private static int onNavigationEvent = -1538795413;
    private static int IAuthTabCallback = 104094589;
    private static byte[] onExtraCallback = {-10, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        int i3;
        int i4 = 3 - (b * 3);
        int i5 = (i * 3) + 1;
        byte[] bArr = $$a;
        int i6 = 115 - (b2 * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i4++;
            i7 = bArr[i4];
            i6 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    protected BCECPrivateKey() throws Throwable {
        Object[] objArr = new Object[1];
        a((short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (byte) (ViewConfiguration.getScrollBarSize() >> 8), 1109134633 - (ViewConfiguration.getTouchSlop() >> 8), Color.green(0) + 1569488080, (-96) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, ProviderConfiguration providerConfiguration) throws Throwable {
        Object[] objArr = new Object[1];
        a((short) View.resolveSize(0, 0), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1109134632 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 1569488080 - View.resolveSize(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) - 97, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
        this.configuration = providerConfiguration;
    }

    BCECPrivateKey(String str, PrivateKeyInfo privateKeyInfo, ProviderConfiguration providerConfiguration) throws Throwable {
        Object[] objArr = new Object[1];
        a((short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (byte) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), 1109134633 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), 1569488080 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 97, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.configuration = providerConfiguration;
        populateFromPrivKeyInfo(privateKeyInfo);
    }

    public BCECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) throws Throwable {
        Object[] objArr = new Object[1];
        a((short) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), 1109134633 - (ViewConfiguration.getTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 1569488080, View.MeasureSpec.getSize(0) - 97, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = eCPrivateKeyParameters.getD();
        this.configuration = providerConfiguration;
        if (eCParameterSpec == null) {
            ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
            int i = asInterface + 107;
            asBinder = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        this.ecSpec = eCParameterSpec;
        this.publicKey = getPublicKeyDetails(bCECPublicKey);
        int i4 = asBinder + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public BCECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCECPublicKey bCECPublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) throws Throwable {
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), ImageFormat.getBitsPerPixel(0) + 1109134634, 1569488080 - Color.green(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 98, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = eCPrivateKeyParameters.getD();
        this.configuration = providerConfiguration;
        if (eCParameterSpec == null) {
            ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
            int i = asBinder + 39;
            asInterface = i % 128;
            int i2 = i % 2;
        } else {
            this.ecSpec = EC5Util.convertSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
        }
        int i3 = 2 % 2;
        try {
            this.publicKey = getPublicKeyDetails(bCECPublicKey);
            int i4 = asBinder + 37;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception unused) {
            this.publicKey = null;
        }
    }

    public BCECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, ProviderConfiguration providerConfiguration) throws Throwable {
        Object[] objArr = new Object[1];
        a((short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) ('0' - AndroidCharacter.getMirror('0')), 1109134633 + (ViewConfiguration.getLongPressTimeout() >> 16), 1569488081 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) - 97, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = eCPrivateKeyParameters.getD();
        this.ecSpec = null;
        this.configuration = providerConfiguration;
    }

    public BCECPrivateKey(String str, BCECPrivateKey bCECPrivateKey) throws Throwable {
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1109134633 + TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 1569488080 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) - 97, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = bCECPrivateKey.d;
        this.ecSpec = bCECPrivateKey.ecSpec;
        this.withCompression = bCECPrivateKey.withCompression;
        this.attrCarrier = bCECPrivateKey.attrCarrier;
        this.publicKey = bCECPrivateKey.publicKey;
        this.configuration = bCECPrivateKey.configuration;
    }

    public BCECPrivateKey(String str, org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec, ProviderConfiguration providerConfiguration) throws Throwable {
        ECParameterSpec eCParameterSpecConvertSpec;
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) Color.argb(0, 0, 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 1109134633, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1569488080, View.resolveSizeAndState(0, 0, 0) - 97, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = eCPrivateKeySpec.getD();
        if (eCPrivateKeySpec.getParams() != null) {
            eCParameterSpecConvertSpec = EC5Util.convertSpec(EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams());
            int i = asInterface + 93;
            asBinder = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            int i4 = asInterface + 31;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            eCParameterSpecConvertSpec = null;
        }
        this.ecSpec = eCParameterSpecConvertSpec;
        int i6 = asBinder + 1;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        this.configuration = providerConfiguration;
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, ProviderConfiguration providerConfiguration) throws Throwable {
        Object[] objArr = new Object[1];
        a((short) Color.blue(0), (byte) Color.green(0), 1109134632 + (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1569488079 + (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.resolveSize(0, 0) - 97, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
        this.configuration = providerConfiguration;
    }

    private ASN1BitString getPublicKeyDetails(BCECPublicKey bCECPublicKey) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            ASN1BitString publicKeyData = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bCECPublicKey.getEncoded())).getPublicKeyData();
            int i4 = asBinder + 43;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return publicKeyData;
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivKeyInfo(PrivateKeyInfo privateKeyInfo) throws IOException {
        int i = 2 % 2;
        X962Parameters x962Parameters = X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        this.ecSpec = EC5Util.convertToSpec(x962Parameters, EC5Util.getCurve(this.configuration, x962Parameters));
        ASN1Encodable privateKey = privateKeyInfo.parsePrivateKey();
        if (privateKey instanceof ASN1Integer) {
            int i2 = asInterface + 87;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            this.d = ASN1Integer.getInstance(privateKey).getValue();
            if (i3 != 0) {
                throw null;
            }
            return;
        }
        org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(privateKey);
        this.d = eCPrivateKey.getKey();
        this.publicKey = eCPrivateKey.getPublicKey();
        int i4 = asInterface + 115;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i = 2 % 2;
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        this.configuration = BouncyCastleProvider.CONFIGURATION;
        populateFromPrivKeyInfo(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr)));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        int i2 = asBinder + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
        int i4 = asBinder + 99;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    org.bouncycastle.jce.spec.ECParameterSpec engineGetSpec() {
        int i = 2 % 2;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            org.bouncycastle.jce.spec.ECParameterSpec ecImplicitlyCa = this.configuration.getEcImplicitlyCa();
            int i2 = asInterface + 67;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return ecImplicitlyCa;
        }
        int i4 = asBinder + 11;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return EC5Util.convertSpec(eCParameterSpec);
        }
        EC5Util.convertSpec(eCParameterSpec);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof BCECPrivateKey)) {
            int i2 = asBinder + 69;
            asInterface = i2 % 128;
            return i2 % 2 == 0;
        }
        BCECPrivateKey bCECPrivateKey = (BCECPrivateKey) obj;
        if (getD().equals(bCECPrivateKey.getD()) && engineGetSpec().equals(bCECPrivateKey.engineGetSpec())) {
            int i3 = asBinder + 95;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = asBinder + 7;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.algorithm;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        PKCS12BagAttributeCarrierImpl pKCS12BagAttributeCarrierImpl = this.attrCarrier;
        if (i3 == 0) {
            return pKCS12BagAttributeCarrierImpl.getBagAttribute(aSN1ObjectIdentifier);
        }
        pKCS12BagAttributeCarrierImpl.getBagAttribute(aSN1ObjectIdentifier);
        throw null;
    }

    public Enumeration getBagAttributeKeys() {
        Enumeration bagAttributeKeys;
        int i = 2 % 2;
        int i2 = asBinder + 95;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            bagAttributeKeys = this.attrCarrier.getBagAttributeKeys();
            int i3 = 51 / 0;
        } else {
            bagAttributeKeys = this.attrCarrier.getBagAttributeKeys();
        }
        int i4 = asInterface + 95;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return bagAttributeKeys;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
    public BigInteger getD() {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int orderBitLength;
        int i = 2 % 2;
        X962Parameters domainParametersFromName = ECUtils.getDomainParametersFromName(this.ecSpec, this.withCompression);
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            int i2 = asInterface + 119;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            ProviderConfiguration providerConfiguration = this.configuration;
            if (i3 != 0) {
                orderBitLength = ECUtil.getOrderBitLength(providerConfiguration, null, getS());
                int i4 = 16 / 0;
            } else {
                orderBitLength = ECUtil.getOrderBitLength(providerConfiguration, null, getS());
            }
        } else {
            int orderBitLength2 = ECUtil.getOrderBitLength(this.configuration, eCParameterSpec.getOrder(), getS());
            int i5 = asBinder + 13;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            orderBitLength = orderBitLength2;
        }
        try {
            return new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, domainParametersFromName), this.publicKey != null ? new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.publicKey, domainParametersFromName) : new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), (ASN1Encodable) domainParametersFromName)).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return "PKCS#8";
    }

    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec != null) {
            org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpecConvertSpec = EC5Util.convertSpec(eCParameterSpec);
            int i4 = asInterface + 59;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return eCParameterSpecConvertSpec;
        }
        int i6 = i3 + 117;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i3 + 33;
        asInterface = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ecSpec;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = getD().hashCode() ^ engineGetSpec().hashCode();
        int i4 = asBinder + 21;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.attrCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((short) Color.blue(0), (byte) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 1), 1109134633 + Color.argb(0, 0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1569488080, Color.alpha(0) - 97, objArr);
        String strPrivateKeyToString = ECUtil.privateKeyToString(((String) objArr[0]).intern(), this.d, engineGetSpec());
        int i4 = asBinder + 123;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return strPrivateKeyToString;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            char c = '0';
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 42, (ViewConfiguration.getEdgeSlop() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getTouchSlop() >> 8)), TextUtils.indexOf(BuildConfig.FLAVOR, c, 0, 0) + 56, 2167 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i6++;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 41, 22439 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i7 = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ j));
                if (z) {
                    i4 = 1;
                } else {
                    int i8 = $10 + 33;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i7 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 85 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        int i11 = $10 + 117;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        bArr5[i10] = (byte) (bArr4[i10] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i13 = $10 + 9;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    if (z2) {
                        byte[] bArr6 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
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

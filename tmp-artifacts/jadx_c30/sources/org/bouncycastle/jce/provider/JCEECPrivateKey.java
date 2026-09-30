package org.bouncycastle.jce.provider;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import o.DefaultGainProviderExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.ECPrivateKeyStructure;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JCEECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier, ECPointEncoder {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private String algorithm;
    private PKCS12BagAttributeCarrierImpl attrCarrier;
    private BigInteger d;
    private ECParameterSpec ecSpec;
    private ASN1BitString publicKey;
    private boolean withCompression;
    private static char[] onNavigationEvent = {65014, 64968, 64969, 65008};
    private static char onExtraCallback = 51243;

    protected JCEECPrivateKey() throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{1, 2}, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public JCEECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec) throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{1, 2}, (byte) (8 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (Process.myTid() >> 22) + 2, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public JCEECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters) throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{1, 2}, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 9), Color.green(0) + 2, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = eCPrivateKeyParameters.getD();
        this.ecSpec = null;
    }

    public JCEECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, JCEECPublicKey jCEECPublicKey, ECParameterSpec eCParameterSpec) throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{1, 2}, (byte) (9 - View.getDefaultSize(0, 0)), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 2, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
            int i = IAuthTabCallback + 15;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        this.ecSpec = eCParameterSpec;
        this.publicKey = getPublicKeyDetails(jCEECPublicKey);
        int i3 = IAuthTabCallback + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 35 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JCEECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, JCEECPublicKey jCEECPublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{1, 2}, (byte) (AndroidCharacter.getMirror('0') - '\''), Process.getGidForName(BuildConfig.FLAVOR) + 3, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
            int i = IAuthTabCallback + 51;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } else {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
            int i3 = onWarmupCompleted + 21;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 4;
            }
        }
        this.publicKey = getPublicKeyDetails(jCEECPublicKey);
        int i5 = onWarmupCompleted + 25;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public JCEECPrivateKey(String str, JCEECPrivateKey jCEECPrivateKey) throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{1, 2}, (byte) (8 - ExpandableListView.getPackedPositionChild(0L)), Color.blue(0) + 2, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = jCEECPrivateKey.d;
        this.ecSpec = jCEECPrivateKey.ecSpec;
        this.withCompression = jCEECPrivateKey.withCompression;
        this.attrCarrier = jCEECPrivateKey.attrCarrier;
        this.publicKey = jCEECPrivateKey.publicKey;
    }

    public JCEECPrivateKey(String str, org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec) throws Throwable {
        ECParameterSpec eCParameterSpecConvertSpec;
        Object[] objArr = new Object[1];
        a(new char[]{1, 2}, (byte) (Process.getGidForName(BuildConfig.FLAVOR) + 10), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.d = eCPrivateKeySpec.getD();
        if (eCPrivateKeySpec.getParams() != null) {
            eCParameterSpecConvertSpec = EC5Util.convertSpec(EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams());
            int i = IAuthTabCallback + 83;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            int i4 = IAuthTabCallback + 83;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            eCParameterSpecConvertSpec = null;
        }
        this.ecSpec = eCParameterSpecConvertSpec;
    }

    public JCEECPrivateKey(ECPrivateKey eCPrivateKey) throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{1, 2}, (byte) (9 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    JCEECPrivateKey(PrivateKeyInfo privateKeyInfo) throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{1, 2}, (byte) (9 - Color.blue(0)), 2 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(privateKeyInfo);
    }

    private ASN1BitString getPublicKeyDetails(JCEECPublicKey jCEECPublicKey) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(jCEECPublicKey.getEncoded())).getPublicKeyData();
                obj.hashCode();
                throw null;
            }
            ASN1BitString publicKeyData = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(jCEECPublicKey.getEncoded())).getPublicKeyData();
            int i3 = IAuthTabCallback + 19;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return publicKeyData;
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivKeyInfo(PrivateKeyInfo privateKeyInfo) throws IOException {
        ECNamedCurveSpec eCNamedCurveSpec;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        X962Parameters x962Parameters = X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        if (!(!x962Parameters.isNamedCurve())) {
            int i4 = IAuthTabCallback + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
            X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
            if (namedCurveByOid == null) {
                ECDomainParameters byOID = ECGOST3410NamedCurves.getByOID(aSN1ObjectIdentifier);
                eCNamedCurveSpec = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(aSN1ObjectIdentifier), EC5Util.convertCurve(byOID.getCurve(), byOID.getSeed()), EC5Util.convertPoint(byOID.getG()), byOID.getN(), byOID.getH());
            } else {
                eCNamedCurveSpec = new ECNamedCurveSpec(ECUtil.getCurveName(aSN1ObjectIdentifier), EC5Util.convertCurve(namedCurveByOid.getCurve(), namedCurveByOid.getSeed()), EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
            }
            this.ecSpec = eCNamedCurveSpec;
            int i6 = IAuthTabCallback + 97;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        } else if (x962Parameters.isImplicitlyCA()) {
            this.ecSpec = null;
        } else {
            X9ECParameters x9ECParameters = X9ECParameters.getInstance(x962Parameters.getParameters());
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(x9ECParameters.getCurve(), x9ECParameters.getSeed()), EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
        }
        ASN1Sequence privateKey = privateKeyInfo.parsePrivateKey();
        if (!(privateKey instanceof ASN1Integer)) {
            ECPrivateKeyStructure eCPrivateKeyStructure = new ECPrivateKeyStructure(privateKey);
            this.d = eCPrivateKeyStructure.getKey();
            this.publicKey = eCPrivateKeyStructure.getPublicKey();
            return;
        }
        int i8 = IAuthTabCallback + 85;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        BigInteger value = ASN1Integer.getInstance(privateKey).getValue();
        if (i9 != 0) {
            this.d = value;
        } else {
            this.d = value;
            int i10 = 96 / 0;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int i = 2 % 2;
        populateFromPrivKeyInfo(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
        PKCS12BagAttributeCarrierImpl pKCS12BagAttributeCarrierImpl = new PKCS12BagAttributeCarrierImpl();
        this.attrCarrier = pKCS12BagAttributeCarrierImpl;
        pKCS12BagAttributeCarrierImpl.readObject(objectInputStream);
        int i2 = onWarmupCompleted + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        byte[] encoded = getEncoded();
        if (i3 == 0) {
            objectOutputStream.writeObject(encoded);
            objectOutputStream.writeObject(this.algorithm);
            objectOutputStream.writeBoolean(this.withCompression);
            this.attrCarrier.writeObject(objectOutputStream);
            return;
        }
        objectOutputStream.writeObject(encoded);
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
        this.attrCarrier.writeObject(objectOutputStream);
        throw null;
    }

    org.bouncycastle.jce.spec.ECParameterSpec engineGetSpec() {
        int i = 2 % 2;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            org.bouncycastle.jce.spec.ECParameterSpec ecImplicitlyCa = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            int i2 = onWarmupCompleted + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return ecImplicitlyCa;
        }
        org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpecConvertSpec = EC5Util.convertSpec(eCParameterSpec);
        int i4 = onWarmupCompleted + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return eCParameterSpecConvertSpec;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof JCEECPrivateKey)) {
            int i2 = onWarmupCompleted + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        JCEECPrivateKey jCEECPrivateKey = (JCEECPrivateKey) obj;
        if (getD().equals(jCEECPrivateKey.getD())) {
            int i4 = onWarmupCompleted + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (engineGetSpec().equals(jCEECPrivateKey.engineGetSpec())) {
                return true;
            }
        }
        int i6 = IAuthTabCallback + 119;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 25;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.algorithm;
        int i4 = i2 + 43;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            this.attrCarrier.getBagAttribute(aSN1ObjectIdentifier);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ASN1Encodable bagAttribute = this.attrCarrier.getBagAttribute(aSN1ObjectIdentifier);
        int i3 = IAuthTabCallback + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return bagAttribute;
    }

    public Enumeration getBagAttributeKeys() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Enumeration bagAttributeKeys = this.attrCarrier.getBagAttributeKeys();
        int i4 = onWarmupCompleted + 59;
        IAuthTabCallback = i4 % 128;
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
        int i2 = onWarmupCompleted;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        BigInteger bigInteger = this.d;
        int i4 = i2 + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        X962Parameters x962Parameters;
        ECPrivateKeyStructure eCPrivateKeyStructure;
        int i = 2 % 2;
        ECNamedCurveSpec eCNamedCurveSpec = this.ecSpec;
        Object obj = null;
        if (eCNamedCurveSpec instanceof ECNamedCurveSpec) {
            int i2 = onWarmupCompleted + 115;
            IAuthTabCallback = i2 % 128;
            ECNamedCurveSpec eCNamedCurveSpec2 = eCNamedCurveSpec;
            if (i2 % 2 != 0) {
                ECUtil.getNamedCurveOid(eCNamedCurveSpec2.getName());
                obj.hashCode();
                throw null;
            }
            ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(eCNamedCurveSpec2.getName());
            if (namedCurveOid == null) {
                namedCurveOid = new ASN1ObjectIdentifier(this.ecSpec.getName());
                int i3 = IAuthTabCallback + 43;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
            x962Parameters = new X962Parameters(namedCurveOid);
        } else if (eCNamedCurveSpec == null) {
            x962Parameters = new X962Parameters((ASN1Null) DERNull.INSTANCE);
        } else {
            ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCNamedCurveSpec.getCurve());
            x962Parameters = new X962Parameters(new X9ECParameters(eCCurveConvertCurve, new X9ECPoint(EC5Util.convertPoint(eCCurveConvertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
        }
        if (this.publicKey != null) {
            eCPrivateKeyStructure = new ECPrivateKeyStructure(getS(), this.publicKey, x962Parameters);
        } else {
            ECPrivateKeyStructure eCPrivateKeyStructure2 = new ECPrivateKeyStructure(getS(), x962Parameters);
            int i5 = onWarmupCompleted + 81;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            eCPrivateKeyStructure = eCPrivateKeyStructure2;
        }
        try {
            return (this.algorithm.equals("ECGOST3410") ? new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, x962Parameters.toASN1Primitive()), eCPrivateKeyStructure.toASN1Primitive()) : new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, x962Parameters.toASN1Primitive()), eCPrivateKeyStructure.toASN1Primitive())).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 39;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return "PKCS#8";
        }
        throw null;
    }

    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        int i = 2 % 2;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            int i2 = IAuthTabCallback + 61;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 48 / 0;
            }
            return null;
        }
        org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpecConvertSpec = EC5Util.convertSpec(eCParameterSpec);
        int i4 = onWarmupCompleted + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return eCParameterSpecConvertSpec;
        }
        throw null;
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ecSpec;
        }
        throw null;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = getD().hashCode() ^ engineGetSpec().hashCode();
            int i3 = 90 / 0;
        } else {
            iHashCode = getD().hashCode() ^ engineGetSpec().hashCode();
        }
        int i4 = onWarmupCompleted + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return iHashCode;
    }

    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.attrCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
        int i4 = IAuthTabCallback + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zEqualsIgnoreCase = "UNCOMPRESSED".equalsIgnoreCase(str);
        if (i3 == 0) {
            zEqualsIgnoreCase = !zEqualsIgnoreCase;
        }
        this.withCompression = zEqualsIgnoreCase;
        int i4 = onWarmupCompleted + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public String toString() {
        int i = 2 % 2;
        StringBuffer stringBuffer = new StringBuffer();
        String strLineSeparator = Strings.lineSeparator();
        stringBuffer.append("EC Private Key");
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("             S: ");
        stringBuffer.append(this.d.toString(16));
        stringBuffer.append(strLineSeparator);
        String string = stringBuffer.toString();
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 125;
                $11 = i7 % 128;
                if (i7 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26, KeyEvent.normalizeMetaState(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25, View.getDefaultSize(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i4 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1), ExpandableListView.getPackedPositionType(0L) + 26, 23139 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i8 = $10 + 43;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    i3 = 2;
                } else {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 24824), 75 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 8088 - (ViewConfiguration.getPressedStateDuration() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        int i11 = $10 + 45;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                    } else {
                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        int i17 = $10 + 125;
                        $11 = i17 % 128;
                        i3 = 2;
                        int i18 = i17 % 2;
                    }
                    i3 = 2;
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += i3;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}

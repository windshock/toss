package org.bouncycastle.jce.provider;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jce.ECGOST3410NamedCurveTable;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JCEECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, ECPointEncoder {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 48857;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 45694;
    private static char onNavigationEvent = 687;
    private static char onWarmupCompleted = 51460;
    private String algorithm;
    private ECParameterSpec ecSpec;
    private GOST3410PublicKeyAlgParameters gostParams;
    private ECPoint q;
    private boolean withCompression;

    public JCEECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.q = EC5Util.convertPoint(params, eCPublicKeySpec.getW());
    }

    public JCEECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters) {
        this.algorithm = str;
        this.q = eCPublicKeyParameters.getQ();
        this.ecSpec = null;
    }

    public JCEECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, ECParameterSpec eCParameterSpec) throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{4309, 48856}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.algorithm = str;
        this.q = eCPublicKeyParameters.getQ();
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), parameters);
            int i = onExtraCallback + 115;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
            return;
        }
        this.ecSpec = eCParameterSpec;
        int i3 = onExtraCallback + 55;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public JCEECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) throws Throwable {
        ECParameterSpec eCParameterSpecConvertSpec;
        Object[] objArr = new Object[1];
        a(new char[]{4309, 48856}, 2 - Gravity.getAbsoluteGravity(0, 0), objArr);
        this.algorithm = ((String) objArr[0]).intern();
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.algorithm = str;
        this.q = eCPublicKeyParameters.getQ();
        if (eCParameterSpec != null) {
            eCParameterSpecConvertSpec = EC5Util.convertSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
            int i = IAuthTabCallbackStub + 59;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
            }
            this.ecSpec = eCParameterSpecConvertSpec;
        }
        eCParameterSpecConvertSpec = createSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), parameters);
        int i2 = IAuthTabCallbackStub + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 2 % 2;
        this.ecSpec = eCParameterSpecConvertSpec;
    }

    public JCEECPublicKey(String str, JCEECPublicKey jCEECPublicKey) {
        this.algorithm = str;
        this.q = jCEECPublicKey.q;
        this.ecSpec = jCEECPublicKey.ecSpec;
        this.withCompression = jCEECPublicKey.withCompression;
        this.gostParams = jCEECPublicKey.gostParams;
    }

    public JCEECPublicKey(String str, org.bouncycastle.jce.spec.ECPublicKeySpec eCPublicKeySpec) {
        ECParameterSpec eCParameterSpecConvertSpec;
        this.algorithm = str;
        this.q = eCPublicKeySpec.getQ();
        if (eCPublicKeySpec.getParams() != null) {
            eCParameterSpecConvertSpec = EC5Util.convertSpec(EC5Util.convertCurve(eCPublicKeySpec.getParams().getCurve(), eCPublicKeySpec.getParams().getSeed()), eCPublicKeySpec.getParams());
            int i = onExtraCallback + 65;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } else {
            if (this.q.getCurve() == null) {
                int i3 = IAuthTabCallbackStub + 115;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    this.q = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getCurve().createPoint(this.q.getAffineXCoord().toBigInteger(), this.q.getAffineYCoord().toBigInteger());
                    int i4 = 76 / 0;
                } else {
                    this.q = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getCurve().createPoint(this.q.getAffineXCoord().toBigInteger(), this.q.getAffineYCoord().toBigInteger());
                }
                int i5 = 2 % 2;
            }
            eCParameterSpecConvertSpec = null;
        }
        this.ecSpec = eCParameterSpecConvertSpec;
    }

    public JCEECPublicKey(ECPublicKey eCPublicKey) throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{4309, 48856}, TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 2, objArr);
        this.algorithm = ((String) objArr[0]).intern();
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.q = EC5Util.convertPoint(params, eCPublicKey.getW());
    }

    JCEECPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{4309, 48856}, 2 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        this.algorithm = ((String) objArr[0]).intern();
        populateFromPubKeyInfo(subjectPublicKeyInfo);
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, ECDomainParameters eCDomainParameters) {
        int i = 2 % 2;
        ECParameterSpec eCParameterSpec = new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(eCDomainParameters.getG()), eCDomainParameters.getN(), eCDomainParameters.getH().intValue());
        int i2 = IAuthTabCallbackStub + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return eCParameterSpec;
        }
        throw null;
    }

    private void extractBytes(byte[] bArr, int i, BigInteger bigInteger) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 11;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        byte[] byteArray = bigInteger.toByteArray();
        if (i4 != 0 ? byteArray.length < 32 : byteArray.length < 39) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i5 = 0; i5 != 32; i5++) {
            bArr[i + i5] = byteArray[(byteArray.length - 1) - i5];
        }
        int i6 = onExtraCallback + 83;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    private void populateFromPubKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ECCurve curve;
        int i = 2 % 2;
        AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
        if (algorithm.getAlgorithm().equals(CryptoProObjectIdentifiers.gostR3410_2001)) {
            int i2 = onExtraCallback + 89;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            ASN1BitString publicKeyData = subjectPublicKeyInfo.getPublicKeyData();
            this.algorithm = "ECGOST3410";
            try {
                byte[] octets = ASN1Primitive.fromByteArray(publicKeyData.getBytes()).getOctets();
                byte[] bArr = new byte[65];
                bArr[0] = 4;
                for (int i4 = 1; i4 <= 32; i4++) {
                    bArr[i4] = octets[32 - i4];
                    bArr[i4 + 32] = octets[64 - i4];
                }
                GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(algorithm.getParameters());
                this.gostParams = gOST3410PublicKeyAlgParameters;
                ECNamedCurveParameterSpec parameterSpec = ECGOST3410NamedCurveTable.getParameterSpec(ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()));
                ECCurve curve2 = parameterSpec.getCurve();
                EllipticCurve ellipticCurveConvertCurve = EC5Util.convertCurve(curve2, parameterSpec.getSeed());
                this.q = curve2.decodePoint(bArr);
                this.ecSpec = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(this.gostParams.getPublicKeyParamSet()), ellipticCurveConvertCurve, EC5Util.convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
                int i5 = onExtraCallback + 77;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return;
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        X962Parameters x962Parameters = X962Parameters.getInstance(algorithm.getParameters());
        if (x962Parameters.isNamedCurve()) {
            ASN1ObjectIdentifier parameters = x962Parameters.getParameters();
            X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(parameters);
            curve = namedCurveByOid.getCurve();
            this.ecSpec = new ECNamedCurveSpec(ECUtil.getCurveName(parameters), EC5Util.convertCurve(curve, namedCurveByOid.getSeed()), EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
        } else if (!x962Parameters.isImplicitlyCA()) {
            X9ECParameters x9ECParameters = X9ECParameters.getInstance(x962Parameters.getParameters());
            curve = x9ECParameters.getCurve();
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(curve, x9ECParameters.getSeed()), EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
        } else {
            int i7 = IAuthTabCallbackStub + 67;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            this.ecSpec = null;
            curve = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getCurve();
        }
        byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
        ASN1OctetString dEROctetString = new DEROctetString(bytes);
        if (bytes[0] == 4 && bytes[1] == bytes.length - 2) {
            int i9 = IAuthTabCallbackStub + 117;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            byte b = bytes[2];
            if ((b == 2 || b == 3) && new X9IntegerConverter().getByteLength(curve) >= bytes.length - 3) {
                try {
                    dEROctetString = (ASN1OctetString) ASN1Primitive.fromByteArray(bytes);
                } catch (IOException unused2) {
                    throw new IllegalArgumentException("error recovering public key");
                }
            }
        }
        this.q = new X9ECPoint(curve, dEROctetString).getPoint();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            populateFromPubKeyInfo(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
            this.algorithm = (String) objectInputStream.readObject();
            this.withCompression = objectInputStream.readBoolean();
            int i3 = 45 / 0;
        } else {
            populateFromPubKeyInfo(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
            this.algorithm = (String) objectInputStream.readObject();
            this.withCompression = objectInputStream.readBoolean();
        }
        int i4 = IAuthTabCallbackStub + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
        int i4 = IAuthTabCallbackStub + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public ECPoint engineGetQ() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        ECPoint eCPoint = this.q;
        int i5 = i3 + 71;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return eCPoint;
        }
        throw null;
    }

    org.bouncycastle.jce.spec.ECParameterSpec engineGetSpec() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 49;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
        }
        int i5 = i2 + 25;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return EC5Util.convertSpec(eCParameterSpec);
        }
        EC5Util.convertSpec(eCParameterSpec);
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof JCEECPublicKey)) {
            int i2 = onExtraCallback + 47;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        JCEECPublicKey jCEECPublicKey = (JCEECPublicKey) obj;
        if (engineGetQ().equals(jCEECPublicKey.engineGetQ())) {
            int i4 = onExtraCallback + 123;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (engineGetSpec().equals(jCEECPublicKey.engineGetSpec())) {
                return true;
            }
        }
        int i6 = IAuthTabCallbackStub + 27;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.algorithm;
        int i4 = i3 + 81;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        SubjectPublicKeyInfo subjectPublicKeyInfo;
        X962Parameters x962Parameters;
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            this.algorithm.equals("ECGOST3410");
            throw null;
        }
        if (!this.algorithm.equals("ECGOST3410")) {
            ECNamedCurveSpec eCNamedCurveSpec = this.ecSpec;
            if (eCNamedCurveSpec instanceof ECNamedCurveSpec) {
                ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(eCNamedCurveSpec.getName());
                if (namedCurveOid == null) {
                    namedCurveOid = new ASN1ObjectIdentifier(this.ecSpec.getName());
                }
                x962Parameters = new X962Parameters(namedCurveOid);
            } else if (eCNamedCurveSpec == null) {
                x962Parameters = new X962Parameters((ASN1Null) DERNull.INSTANCE);
            } else {
                ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCNamedCurveSpec.getCurve());
                x962Parameters = new X962Parameters(new X9ECParameters(eCCurveConvertCurve, new X9ECPoint(EC5Util.convertPoint(eCCurveConvertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            subjectPublicKeyInfo = new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, x962Parameters), getQ().getEncoded(this.withCompression));
        } else {
            int i3 = IAuthTabCallbackStub + 117;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            ASN1Encodable x962Parameters2 = this.gostParams;
            if (x962Parameters2 == null) {
                ECNamedCurveSpec eCNamedCurveSpec2 = this.ecSpec;
                if (eCNamedCurveSpec2 instanceof ECNamedCurveSpec) {
                    x962Parameters2 = new GOST3410PublicKeyAlgParameters(ECGOST3410NamedCurves.getOID(eCNamedCurveSpec2.getName()), CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet);
                } else {
                    ECCurve eCCurveConvertCurve2 = EC5Util.convertCurve(eCNamedCurveSpec2.getCurve());
                    x962Parameters2 = new X962Parameters(new X9ECParameters(eCCurveConvertCurve2, new X9ECPoint(EC5Util.convertPoint(eCCurveConvertCurve2, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
                }
            }
            BigInteger bigInteger = this.q.getAffineXCoord().toBigInteger();
            BigInteger bigInteger2 = this.q.getAffineYCoord().toBigInteger();
            byte[] bArr = new byte[64];
            extractBytes(bArr, 0, bigInteger);
            extractBytes(bArr, 32, bigInteger2);
            try {
                subjectPublicKeyInfo = new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, x962Parameters2), new DEROctetString(bArr));
            } catch (IOException unused) {
                return null;
            }
        }
        return KeyUtil.getEncodedSubjectPublicKeyInfo(subjectPublicKeyInfo);
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return "X.509";
        }
        throw null;
    }

    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        int i = 2 % 2;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec != null) {
            org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpecConvertSpec = EC5Util.convertSpec(eCParameterSpec);
            int i2 = onExtraCallback + 91;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return eCParameterSpecConvertSpec;
        }
        int i4 = IAuthTabCallbackStub + 123;
        onExtraCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        int i5 = i3 + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return eCParameterSpec;
    }

    public ECPoint getQ() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.ecSpec != null) {
            return this.q;
        }
        ECPoint detachedPoint = this.q.getDetachedPoint();
        int i3 = onExtraCallback + 111;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return detachedPoint;
    }

    @Override // java.security.interfaces.ECPublicKey
    public java.security.spec.ECPoint getW() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        java.security.spec.ECPoint eCPointConvertPoint = EC5Util.convertPoint(this.q);
        int i4 = onExtraCallback + 9;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return eCPointConvertPoint;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = engineGetQ().hashCode() ^ engineGetSpec().hashCode();
        int i4 = IAuthTabCallbackStub + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
        int i4 = IAuthTabCallbackStub + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public String toString() {
        int i = 2 % 2;
        StringBuffer stringBuffer = new StringBuffer();
        String strLineSeparator = Strings.lineSeparator();
        stringBuffer.append("EC Public Key");
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("            X: ");
        stringBuffer.append(this.q.getAffineXCoord().toBigInteger().toString(16));
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("            Y: ");
        stringBuffer.append(this.q.getAffineYCoord().toBigInteger().toString(16));
        stringBuffer.append(strLineSeparator);
        String string = stringBuffer.toString();
        int i2 = IAuthTabCallbackStub + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 57;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $10 + 95;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $11 + 107;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iIndexOf = 10 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, i3, i3);
                        int iArgb = 12434 - Color.argb(i3, i3, i3, i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, iIndexOf, iArgb, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10, ImageFormat.getBitsPerPixel(0) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - Process.getGidForName(BuildConfig.FLAVOR)), 13 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 19901 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}

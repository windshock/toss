package org.bouncycastle.operator;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bsi.BSIObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.gnu.GNUObjectIdentifiers;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class DefaultAlgorithmNameFinder implements AlgorithmNameFinder {
    private static char IAuthTabCallback;
    private static final Map algorithms;
    private static char[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {120, ISO7816.INS_WRITE_RECORD, ISOFileInfo.A1, -23};
    private static final int $$b = 175;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        int i5 = 3 - (i * 3);
        int i6 = 110 - i2;
        int i7 = i3 * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i7];
        int i8 = 0 - i7;
        if (bArr == null) {
            int i9 = i6;
            int i10 = 0;
            int i11 = i5;
            int i12 = i5 + i9;
            i4 = i10;
            int i13 = i11;
            i6 = i12;
            i5 = i13;
            bArr2[i4] = (byte) i6;
            int i14 = i5 + 1;
            i10 = i4 + 1;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            int i15 = i6;
            i11 = i14;
            i5 = bArr[i14];
            i9 = i15;
            int i122 = i5 + i9;
            i4 = i10;
            int i132 = i11;
            i6 = i122;
            i5 = i132;
            bArr2[i4] = (byte) i6;
            int i142 = i5 + 1;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i6;
            int i1422 = i5 + 1;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        }
    }

    static {
        onTransact = 1;
        onWarmupCompleted();
        HashMap map = new HashMap();
        algorithms = map;
        map.put(BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, "RIPEMD160WITHPLAIN-ECDSA");
        map.put(BSIObjectIdentifiers.ecdsa_plain_SHA1, "SHA1WITHPLAIN-ECDSA");
        map.put(BSIObjectIdentifiers.ecdsa_plain_SHA224, "SHA224WITHPLAIN-ECDSA");
        map.put(BSIObjectIdentifiers.ecdsa_plain_SHA256, "SHA256WITHPLAIN-ECDSA");
        map.put(BSIObjectIdentifiers.ecdsa_plain_SHA384, "SHA384WITHPLAIN-ECDSA");
        map.put(BSIObjectIdentifiers.ecdsa_plain_SHA512, "SHA512WITHPLAIN-ECDSA");
        map.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "GOST3411WITHECGOST3410-2001");
        map.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3411WITHGOST3410-94");
        map.put(CryptoProObjectIdentifiers.gostR3411, "GOST3411");
        map.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, "GOST3411WITHECGOST3410-2012-256");
        map.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, "GOST3411WITHECGOST3410-2012-512");
        map.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, "SHA1WITHCVC-ECDSA");
        map.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, "SHA224WITHCVC-ECDSA");
        map.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, "SHA256WITHCVC-ECDSA");
        map.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, "SHA384WITHCVC-ECDSA");
        map.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, "SHA512WITHCVC-ECDSA");
        map.put(NISTObjectIdentifiers.id_sha224, "SHA224");
        map.put(NISTObjectIdentifiers.id_sha256, "SHA256");
        map.put(NISTObjectIdentifiers.id_sha384, "SHA384");
        map.put(NISTObjectIdentifiers.id_sha512, "SHA512");
        map.put(NISTObjectIdentifiers.id_sha3_224, "SHA3-224");
        map.put(NISTObjectIdentifiers.id_sha3_256, SPHINCS256KeyGenParameterSpec.SHA3_256);
        map.put(NISTObjectIdentifiers.id_sha3_384, "SHA3-384");
        map.put(NISTObjectIdentifiers.id_sha3_512, "SHA3-512");
        map.put(OIWObjectIdentifiers.dsaWithSHA1, "SHA1WITHDSA");
        map.put(OIWObjectIdentifiers.elGamalAlgorithm, "ELGAMAL");
        map.put(OIWObjectIdentifiers.idSHA1, "SHA1");
        map.put(OIWObjectIdentifiers.md5WithRSA, "MD5WITHRSA");
        map.put(OIWObjectIdentifiers.sha1WithRSA, "SHA1WITHRSA");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_RSAES_OAEP;
        Object[] objArr = new Object[1];
        a((char) Gravity.getAbsoluteGravity(0, 0), (-353847899) - ExpandableListView.getPackedPositionType(0L), new char[]{39180, 10554, 33722, 51529, 63715, 51674, 33688}, new char[]{0, 0, 0, 0}, new char[]{42299, 59573, 7914, 58374}, objArr);
        map.put(aSN1ObjectIdentifier, ((String) objArr[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.id_RSASSA_PSS;
        Object[] objArr2 = new Object[1];
        b((byte) (KeyEvent.getDeadChar(0, 0) + 35), 5 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), new char[]{14, '\n', 21, 3, 13804, 13804}, objArr2);
        map.put(aSN1ObjectIdentifier2, ((String) objArr2[0]).intern());
        map.put(PKCSObjectIdentifiers.md2WithRSAEncryption, "MD2WITHRSA");
        map.put(PKCSObjectIdentifiers.md5, "MD5");
        map.put(PKCSObjectIdentifiers.md5WithRSAEncryption, "MD5WITHRSA");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.rsaEncryption;
        Object[] objArr3 = new Object[1];
        a((char) (Gravity.getAbsoluteGravity(0, 0) + 38083), 2076158135 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), new char[]{9174, 48235, 4482}, new char[]{0, 0, 0, 0}, new char[]{47155, 49064, 50043, 61076}, objArr3);
        map.put(aSN1ObjectIdentifier3, ((String) objArr3[0]).intern());
        map.put(PKCSObjectIdentifiers.sha1WithRSAEncryption, "SHA1WITHRSA");
        map.put(PKCSObjectIdentifiers.sha224WithRSAEncryption, "SHA224WITHRSA");
        map.put(PKCSObjectIdentifiers.sha256WithRSAEncryption, "SHA256WITHRSA");
        map.put(PKCSObjectIdentifiers.sha384WithRSAEncryption, "SHA384WITHRSA");
        map.put(PKCSObjectIdentifiers.sha512WithRSAEncryption, "SHA512WITHRSA");
        map.put(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224, "SHA3-224WITHRSA");
        map.put(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256, "SHA3-256WITHRSA");
        map.put(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384, "SHA3-384WITHRSA");
        map.put(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512, "SHA3-512WITHRSA");
        map.put(TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD128");
        map.put(TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD160");
        map.put(TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD256");
        map.put(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128, "RIPEMD128WITHRSA");
        map.put(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160, "RIPEMD160WITHRSA");
        map.put(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256, "RIPEMD256WITHRSA");
        map.put(X9ObjectIdentifiers.ecdsa_with_SHA1, "ECDSAWITHSHA1");
        map.put(X9ObjectIdentifiers.ecdsa_with_SHA224, "SHA224WITHECDSA");
        map.put(X9ObjectIdentifiers.ecdsa_with_SHA256, "SHA256WITHECDSA");
        map.put(X9ObjectIdentifiers.ecdsa_with_SHA384, "SHA384WITHECDSA");
        map.put(X9ObjectIdentifiers.ecdsa_with_SHA512, "SHA512WITHECDSA");
        map.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_224, "SHA3-224WITHECDSA");
        map.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_256, "SHA3-256WITHECDSA");
        map.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_384, "SHA3-384WITHECDSA");
        map.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_512, "SHA3-512WITHECDSA");
        map.put(X9ObjectIdentifiers.id_dsa_with_sha1, "SHA1WITHDSA");
        map.put(NISTObjectIdentifiers.dsa_with_sha224, "SHA224WITHDSA");
        map.put(NISTObjectIdentifiers.dsa_with_sha256, "SHA256WITHDSA");
        map.put(NISTObjectIdentifiers.dsa_with_sha384, "SHA384WITHDSA");
        map.put(NISTObjectIdentifiers.dsa_with_sha512, "SHA512WITHDSA");
        map.put(NISTObjectIdentifiers.id_dsa_with_sha3_224, "SHA3-224WITHDSA");
        map.put(NISTObjectIdentifiers.id_dsa_with_sha3_256, "SHA3-256WITHDSA");
        map.put(NISTObjectIdentifiers.id_dsa_with_sha3_384, "SHA3-384WITHDSA");
        map.put(NISTObjectIdentifiers.id_dsa_with_sha3_512, "SHA3-512WITHDSA");
        map.put(GNUObjectIdentifiers.Tiger_192, "Tiger");
        map.put(PKCSObjectIdentifiers.RC2_CBC, "RC2/CBC");
        map.put(PKCSObjectIdentifiers.des_EDE3_CBC, "DESEDE-3KEY/CBC");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes128_ECB;
        Object[] objArr4 = new Object[1];
        a((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2082683173, new char[]{12219, 52060, 23249, 33678, 3451, 8243, 10803, 40716, 42605, 28992, 63442}, new char[]{0, 0, 0, 0}, new char[]{9624, 9017, 12668, 49431}, objArr4);
        map.put(aSN1ObjectIdentifier4, ((String) objArr4[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_aes192_ECB;
        Object[] objArr5 = new Object[1];
        b((byte) (106 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)), 11 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), new char[]{24, 22, '\f', 4, 16, '\t', '\r', 0, 22, 6, 13890}, objArr5);
        map.put(aSN1ObjectIdentifier5, ((String) objArr5[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_aes256_ECB;
        Object[] objArr6 = new Object[1];
        b((byte) (TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 111), 11 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{24, 22, '\f', 4, '\f', 15, '\r', 2, 22, 6, 13895}, objArr6);
        map.put(aSN1ObjectIdentifier6, ((String) objArr6[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_aes128_CBC;
        Object[] objArr7 = new Object[1];
        a((char) View.combineMeasuredStates(0, 0), Gravity.getAbsoluteGravity(0, 0) - 924470500, new char[]{8131, 60321, 63812, 9243, 39355, 32260, 49666, 7124, 13129, 16620, 64609}, new char[]{0, 0, 0, 0}, new char[]{7193, 58803, 9160, 13557}, objArr7);
        map.put(aSN1ObjectIdentifier7, ((String) objArr7[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_aes192_CBC;
        Object[] objArr8 = new Object[1];
        b((byte) (View.combineMeasuredStates(0, 0) + 53), 11 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{24, 22, '\f', 4, 16, '\t', '\r', 0, '\b', 5, 13838}, objArr8);
        map.put(aSN1ObjectIdentifier8, ((String) objArr8[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.id_aes256_CBC;
        Object[] objArr9 = new Object[1];
        a((char) View.combineMeasuredStates(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1194282820, new char[]{626, 34166, 10210, 10341, 2535, 18276, 19491, 1394, 59581, 55141, 39411}, new char[]{0, 0, 0, 0}, new char[]{17818, 12111, 23367, 2436}, objArr9);
        map.put(aSN1ObjectIdentifier9, ((String) objArr9[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_aes128_CFB;
        Object[] objArr10 = new Object[1];
        b((byte) (58 - Color.green(0)), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 12, new char[]{24, 22, '\f', 4, 15, 14, '\r', 1, '\b', 17, 13842}, objArr10);
        map.put(aSN1ObjectIdentifier10, ((String) objArr10[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.id_aes192_CFB;
        Object[] objArr11 = new Object[1];
        a((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.alpha(0) - 2097397753, new char[]{24953, 34479, 55871, 3500, 25685, 20984, 7012, 43531, 24825, 31036, 25892}, new char[]{0, 0, 0, 0}, new char[]{2012, 64576, 34434, 18321}, objArr11);
        map.put(aSN1ObjectIdentifier11, ((String) objArr11[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_aes256_CFB;
        Object[] objArr12 = new Object[1];
        b((byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 92), 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{24, 22, '\f', 4, '\f', 15, '\r', 2, '\b', 17, 13876}, objArr12);
        map.put(aSN1ObjectIdentifier12, ((String) objArr12[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.id_aes128_OFB;
        Object[] objArr13 = new Object[1];
        b((byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 74), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, new char[]{24, 22, '\f', 4, 15, 14, '\r', 1, 23, 17, 13858}, objArr13);
        map.put(aSN1ObjectIdentifier13, ((String) objArr13[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.id_aes192_OFB;
        Object[] objArr14 = new Object[1];
        a((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) - 1895266322, new char[]{13808, 38675, 6185, 13030, 51249, 50522, 52466, 54418, 21485, 52544, 52203}, new char[]{0, 0, 0, 0}, new char[]{61033, 2183, 50575, 58810}, objArr14);
        map.put(aSN1ObjectIdentifier14, ((String) objArr14[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = NISTObjectIdentifiers.id_aes256_OFB;
        Object[] objArr15 = new Object[1];
        b((byte) (16 - MotionEvent.axisFromString(BuildConfig.FLAVOR)), 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{24, 22, '\f', 4, '\f', 15, '\r', 2, 23, 17, 13801}, objArr15);
        map.put(aSN1ObjectIdentifier15, ((String) objArr15[0]).intern());
        map.put(NTTObjectIdentifiers.id_camellia128_cbc, "CAMELLIA-128/CBC");
        map.put(NTTObjectIdentifiers.id_camellia192_cbc, "CAMELLIA-192/CBC");
        map.put(NTTObjectIdentifiers.id_camellia256_cbc, "CAMELLIA-256/CBC");
        map.put(KISAObjectIdentifiers.id_seedCBC, "SEED/CBC");
        map.put(MiscObjectIdentifiers.as_sys_sec_alg_ideaCBC, "IDEA/CBC");
        map.put(MiscObjectIdentifiers.cast5CBC, "CAST5/CBC");
        map.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_ECB, "Blowfish/ECB");
        map.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CBC, "Blowfish/CBC");
        map.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CFB, "Blowfish/CFB");
        map.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_OFB, "Blowfish/OFB");
        map.put(GNUObjectIdentifiers.Serpent_128_ECB, "Serpent-128/ECB");
        map.put(GNUObjectIdentifiers.Serpent_128_CBC, "Serpent-128/CBC");
        map.put(GNUObjectIdentifiers.Serpent_128_CFB, "Serpent-128/CFB");
        map.put(GNUObjectIdentifiers.Serpent_128_OFB, "Serpent-128/OFB");
        map.put(GNUObjectIdentifiers.Serpent_192_ECB, "Serpent-192/ECB");
        map.put(GNUObjectIdentifiers.Serpent_192_CBC, "Serpent-192/CBC");
        map.put(GNUObjectIdentifiers.Serpent_192_CFB, "Serpent-192/CFB");
        map.put(GNUObjectIdentifiers.Serpent_192_OFB, "Serpent-192/OFB");
        map.put(GNUObjectIdentifiers.Serpent_256_ECB, "Serpent-256/ECB");
        map.put(GNUObjectIdentifiers.Serpent_256_CBC, "Serpent-256/CBC");
        map.put(GNUObjectIdentifiers.Serpent_256_CFB, "Serpent-256/CFB");
        map.put(GNUObjectIdentifiers.Serpent_256_OFB, "Serpent-256/OFB");
        int i = asBinder + 95;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public String getAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = (String) algorithms.get(aSN1ObjectIdentifier);
        if (str == null) {
            String id = aSN1ObjectIdentifier.getId();
            int i3 = asInterface + 117;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return id;
        }
        int i5 = IAuthTabCallbackStub + 43;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public String getAlgorithmName(AlgorithmIdentifier algorithmIdentifier) {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        if (i3 != 0) {
            return getAlgorithmName(algorithm);
        }
        getAlgorithmName(algorithm);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean hasAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Map map = algorithms;
        if (i3 != 0) {
            return map.containsKey(aSN1ObjectIdentifier);
        }
        map.containsKey(aSN1ObjectIdentifier);
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
            int i4 = $10 + 19;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), AndroidCharacter.getMirror('0') - 5, 1452 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49122), 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1494 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 23972), 50 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), 22939 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 45848), ((Process.getThreadPriority(0) + 20) >> 6) + 29, ExpandableListView.getPackedPositionChild(0L) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $10 + 29;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013c A[Catch: all -> 0x0327, TRY_ENTER, TryCatch #1 {all -> 0x0327, blocks: (B:19:0x0071, B:21:0x007f, B:22:0x00a6, B:44:0x013c, B:46:0x0185, B:47:0x01e7, B:51:0x01fc, B:53:0x0231, B:54:0x0287), top: B:73:0x0071 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallback;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 23139 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 27, 23138 - ((byte) KeyEvent.getModifierMetaStateMask()), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                int i5 = $10 + 23;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i7 = $10 + 1;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent % 0];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            int i8 = $11 + 103;
                            $10 = i8 % 128;
                            if (i8 % 2 != 0) {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback << b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent % 0] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback << b);
                            } else {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            }
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (Process.myPid() >> 22)), 74 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.getMode(0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 30 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 19488 - View.getDefaultSize(0, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    int i10 = $11 + 27;
                                    $10 = i10 % 128;
                                    int i11 = i10 % 2;
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                                } else {
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                                }
                            }
                        }
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i16 = $11 + 27;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 0;
            while (i18 < i) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                i18++;
                int i19 = $11 + 13;
                $10 = i19 % 128;
                int i20 = i19 % 2;
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = 7798559133331975163L;
        onExtraCallbackWithResult = -1776194565;
        IAuthTabCallback = (char) 45112;
        onExtraCallback = new char[]{51243, 64995, 64926, 64924, 51233, 51245, 64906, 65008, 51247, 65009, 64897, 64907, 64901, 64993, 64992, 51240, 51246, 64902, 65013, 64898, 51244, 65014, 65020, 65010, 51242};
        onNavigationEvent = (char) 51244;
    }
}

package org.bouncycastle.cert.crmf.jcajce;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.jcajce.util.AlgorithmParametersUtils;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.jmrtd.lds.CVCAFile;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class CRMFHelper {
    protected static final Map BASE_CIPHER_NAMES;
    protected static final Map CIPHER_ALG_NAMES;
    protected static final Map DIGEST_ALG_NAMES;
    private static short[] IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    protected static final Map KEY_ALG_NAMES;
    protected static final Map MAC_ALG_NAMES;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onWarmupCompleted;
    private JcaJceHelper helper;
    private static final byte[] $$a = {84, -122, 19, 43};
    private static final int $$b = 30;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallbackStub = 0;

    interface JCECallback {
        Object doInJCE() throws CRMFException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException;
    }

    private static String $$c(short s, int i, byte b) {
        int i2 = (s * 4) + 115;
        int i3 = i * 3;
        int i4 = b + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 += -i5;
        }
        while (true) {
            i4++;
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 += -bArr[i4];
        }
    }

    static {
        IAuthTabCallbackDefault = 1;
        onExtraCallback();
        HashMap map = new HashMap();
        BASE_CIPHER_NAMES = map;
        HashMap map2 = new HashMap();
        CIPHER_ALG_NAMES = map2;
        HashMap map3 = new HashMap();
        DIGEST_ALG_NAMES = map3;
        HashMap map4 = new HashMap();
        KEY_ALG_NAMES = map4;
        HashMap map5 = new HashMap();
        MAC_ALG_NAMES = map5;
        map.put(PKCSObjectIdentifiers.des_EDE3_CBC, "DESEDE");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_aes128_CBC;
        Object[] objArr = new Object[1];
        a((short) (18 - (KeyEvent.getMaxKeyCode() >> 16)), (byte) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') - 32), (-1022664928) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1749646743 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 50, objArr);
        map.put(aSN1ObjectIdentifier, ((String) objArr[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes192_CBC;
        Object[] objArr2 = new Object[1];
        a((short) (18 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) (View.MeasureSpec.getMode(0) - 33), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1022664930, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1749646743, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') - 48, objArr2);
        map.put(aSN1ObjectIdentifier2, ((String) objArr2[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes256_CBC;
        Object[] objArr3 = new Object[1];
        a((short) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 18), (byte) ((-16777249) - Color.rgb(0, 0, 0)), (-1022664928) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1749646743 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) - 48, objArr3);
        map.put(aSN1ObjectIdentifier3, ((String) objArr3[0]).intern());
        map2.put(CMSAlgorithm.DES_EDE3_CBC, "DESEDE/CBC/PKCS5Padding");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = CMSAlgorithm.AES128_CBC;
        Object[] objArr4 = new Object[1];
        a((short) (ExpandableListView.getPackedPositionGroup(0L) + 20), (byte) (73 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), Process.getGidForName(BuildConfig.FLAVOR) - 1022664925, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 1749646743, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) - 49, objArr4);
        map2.put(aSN1ObjectIdentifier4, ((String) objArr4[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = CMSAlgorithm.AES192_CBC;
        Object[] objArr5 = new Object[1];
        a((short) ('D' - AndroidCharacter.getMirror('0')), (byte) (73 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR)), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) - 1022664926, 1749646742 + (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) - 49, objArr5);
        map2.put(aSN1ObjectIdentifier5, ((String) objArr5[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = CMSAlgorithm.AES256_CBC;
        Object[] objArr6 = new Object[1];
        a((short) (21 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (ImageFormat.getBitsPerPixel(0) + 74), (-1022664926) - View.resolveSizeAndState(0, 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1749646743, Drawable.resolveOpacity(0, 0) - 49, objArr6);
        map2.put(aSN1ObjectIdentifier6, ((String) objArr6[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = PKCSObjectIdentifiers.rsaEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7.getId());
        Object[] objArr7 = new Object[1];
        a((short) (KeyEvent.normalizeMetaState(0) - 25), (byte) ((-34) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1022664907, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1749646760, (-49) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
        map2.put(aSN1ObjectIdentifier8, ((String) objArr7[0]).intern());
        map3.put(OIWObjectIdentifiers.idSHA1, "SHA1");
        map3.put(NISTObjectIdentifiers.id_sha224, "SHA224");
        map3.put(NISTObjectIdentifiers.id_sha256, "SHA256");
        map3.put(NISTObjectIdentifiers.id_sha384, "SHA384");
        map3.put(NISTObjectIdentifiers.id_sha512, "SHA512");
        map5.put(IANAObjectIdentifiers.hmacSHA1, "HMACSHA1");
        map5.put(PKCSObjectIdentifiers.id_hmacWithSHA1, "HMACSHA1");
        map5.put(PKCSObjectIdentifiers.id_hmacWithSHA224, "HMACSHA224");
        map5.put(PKCSObjectIdentifiers.id_hmacWithSHA256, "HMACSHA256");
        map5.put(PKCSObjectIdentifiers.id_hmacWithSHA384, "HMACSHA384");
        map5.put(PKCSObjectIdentifiers.id_hmacWithSHA512, "HMACSHA512");
        Object[] objArr8 = new Object[1];
        a((short) (41 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)), (byte) (114 - Color.blue(0)), (ViewConfiguration.getScrollBarSize() >> 8) - 1022664886, 1749646760 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (-49) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr8);
        map4.put(aSN1ObjectIdentifier7, ((String) objArr8[0]).intern());
        map4.put(X9ObjectIdentifiers.id_dsa, "DSA");
        int i = IAuthTabCallbackStub + 111;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 51 / 0;
        }
    }

    CRMFHelper(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    static Object execute(JCECallback jCECallback) throws CRMFException {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onTransact = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                jCECallback.doInJCE();
                obj.hashCode();
                throw null;
            }
            Object objDoInJCE = jCECallback.doInJCE();
            int i3 = asBinder + 67;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return objDoInJCE;
            }
            throw null;
        } catch (InvalidAlgorithmParameterException e) {
            throw new CRMFException("algorithm parameters invalid.", e);
        } catch (InvalidKeyException e2) {
            throw new CRMFException("key invalid in message.", e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new CRMFException("can't find algorithm.", e3);
        } catch (NoSuchProviderException e4) {
            throw new CRMFException("can't find provider.", e4);
        } catch (InvalidParameterSpecException e5) {
            throw new CRMFException("MAC algorithm parameter spec invalid.", e5);
        } catch (NoSuchPaddingException e6) {
            throw new CRMFException("required padding not supported.", e6);
        }
    }

    AlgorithmParameterGenerator createAlgorithmParameterGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str != null) {
            try {
                AlgorithmParameterGenerator algorithmParameterGeneratorCreateAlgorithmParameterGenerator = this.helper.createAlgorithmParameterGenerator(str);
                int i4 = onTransact + 121;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 91 / 0;
                }
                return algorithmParameterGeneratorCreateAlgorithmParameterGenerator;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        AlgorithmParameterGenerator algorithmParameterGeneratorCreateAlgorithmParameterGenerator2 = this.helper.createAlgorithmParameterGenerator(aSN1ObjectIdentifier.getId());
        int i6 = asBinder + 9;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return algorithmParameterGeneratorCreateAlgorithmParameterGenerator2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    AlgorithmParameters createAlgorithmParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws NoSuchAlgorithmException, NoSuchProviderException {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str != null) {
            try {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters(str);
                int i3 = onTransact + 41;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 24 / 0;
                }
                return algorithmParametersCreateAlgorithmParameters;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return this.helper.createAlgorithmParameters(aSN1ObjectIdentifier.getId());
    }

    Cipher createCipher(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        try {
            String str = (String) CIPHER_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                int i4 = asBinder + 41;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e) {
            throw new CRMFException("cannot create cipher: " + e.getMessage(), e);
        }
    }

    Cipher createContentCipher(final Key key, final AlgorithmIdentifier algorithmIdentifier) throws CRMFException {
        int i = 2 % 2;
        Cipher cipher = (Cipher) execute(new JCECallback() { // from class: org.bouncycastle.cert.crmf.jcajce.CRMFHelper.1
            @Override // org.bouncycastle.cert.crmf.jcajce.CRMFHelper.JCECallback
            public Object doInJCE() throws CRMFException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
                Cipher cipherCreateCipher = CRMFHelper.this.createCipher(algorithmIdentifier.getAlgorithm());
                ASN1Primitive parameters = algorithmIdentifier.getParameters();
                ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
                if (parameters == null || (parameters instanceof ASN1Null)) {
                    if (algorithm.equals(CMSAlgorithm.DES_EDE3_CBC) || algorithm.equals(CMSAlgorithm.IDEA_CBC) || algorithm.equals(CMSAlgorithm.CAST5_CBC)) {
                        cipherCreateCipher.init(2, key, new IvParameterSpec(new byte[8]));
                        return cipherCreateCipher;
                    }
                    cipherCreateCipher.init(2, key);
                    return cipherCreateCipher;
                }
                try {
                    AlgorithmParameters algorithmParametersCreateAlgorithmParameters = CRMFHelper.this.createAlgorithmParameters(algorithmIdentifier.getAlgorithm());
                    try {
                        AlgorithmParametersUtils.loadParameters(algorithmParametersCreateAlgorithmParameters, parameters);
                        cipherCreateCipher.init(2, key, algorithmParametersCreateAlgorithmParameters);
                        return cipherCreateCipher;
                    } catch (IOException e) {
                        throw new CRMFException("error decoding algorithm parameters.", e);
                    }
                } catch (NoSuchAlgorithmException e2) {
                    if (!algorithm.equals(CMSAlgorithm.DES_EDE3_CBC) && !algorithm.equals(CMSAlgorithm.IDEA_CBC) && !algorithm.equals(CMSAlgorithm.AES128_CBC) && !algorithm.equals(CMSAlgorithm.AES192_CBC) && !algorithm.equals(CMSAlgorithm.AES256_CBC)) {
                        throw e2;
                    }
                    cipherCreateCipher.init(2, key, new IvParameterSpec(ASN1OctetString.getInstance(parameters).getOctets()));
                    return cipherCreateCipher;
                }
            }
        });
        int i2 = onTransact + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return cipher;
    }

    MessageDigest createDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
        int i = 2 % 2;
        try {
            String str = (String) DIGEST_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                int i2 = onTransact + 39;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                try {
                    return this.helper.createMessageDigest(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigestCreateMessageDigest = this.helper.createMessageDigest(aSN1ObjectIdentifier.getId());
            int i4 = onTransact + 103;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return messageDigestCreateMessageDigest;
            }
            throw null;
        } catch (GeneralSecurityException e) {
            throw new CRMFException("cannot create cipher: " + e.getMessage(), e);
        }
    }

    KeyFactory createKeyFactory(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        try {
            String str = (String) KEY_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    KeyFactory keyFactoryCreateKeyFactory = this.helper.createKeyFactory(str);
                    int i4 = asBinder + 95;
                    onTransact = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 56 / 0;
                    }
                    return keyFactoryCreateKeyFactory;
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyFactory(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e) {
            throw new CRMFException("cannot create cipher: " + e.getMessage(), e);
        }
    }

    public KeyGenerator createKeyGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        try {
            String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                int i4 = onTransact + 49;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                try {
                    return this.helper.createKeyGenerator(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            KeyGenerator keyGeneratorCreateKeyGenerator = this.helper.createKeyGenerator(aSN1ObjectIdentifier.getId());
            int i6 = asBinder + 31;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                return keyGeneratorCreateKeyGenerator;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (GeneralSecurityException e) {
            throw new CRMFException("cannot create key generator: " + e.getMessage(), e);
        }
    }

    Mac createMac(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
        int i = 2 % 2;
        try {
            String str = (String) MAC_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                int i2 = asBinder + 33;
                onTransact = i2 % 128;
                try {
                    if (i2 % 2 == 0) {
                        return this.helper.createMac(str);
                    }
                    this.helper.createMac(str);
                    throw null;
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            Mac macCreateMac = this.helper.createMac(aSN1ObjectIdentifier.getId());
            int i3 = asBinder + 77;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return macCreateMac;
        } catch (GeneralSecurityException e) {
            throw new CRMFException("cannot create mac: " + e.getMessage(), e);
        }
    }

    AlgorithmParameters generateParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, SecretKey secretKey, SecureRandom secureRandom) throws CRMFException, InvalidAlgorithmParameterException {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        try {
            AlgorithmParameterGenerator algorithmParameterGeneratorCreateAlgorithmParameterGenerator = createAlgorithmParameterGenerator(aSN1ObjectIdentifier);
            if (aSN1ObjectIdentifier.equals(CMSAlgorithm.RC2_CBC)) {
                byte[] bArr = new byte[8];
                secureRandom.nextBytes(bArr);
                try {
                    algorithmParameterGeneratorCreateAlgorithmParameterGenerator.init(new RC2ParameterSpec(secretKey.getEncoded().length << 3, bArr), secureRandom);
                } catch (InvalidAlgorithmParameterException e) {
                    throw new CRMFException("parameters generation error: " + e, e);
                }
            }
            AlgorithmParameters algorithmParametersGenerateParameters = algorithmParameterGeneratorCreateAlgorithmParameterGenerator.generateParameters();
            int i4 = asBinder + 27;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return algorithmParametersGenerateParameters;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (GeneralSecurityException e2) {
            throw new CRMFException("exception creating algorithm parameter generator: " + e2, e2);
        }
    }

    AlgorithmIdentifier getAlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmParameters algorithmParameters) throws CRMFException {
        DERNull dERNullExtractParameters;
        int i = 2 % 2;
        int i2 = onTransact + 103;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (algorithmParameters != null) {
            try {
                dERNullExtractParameters = AlgorithmParametersUtils.extractParameters(algorithmParameters);
            } catch (IOException e) {
                throw new CRMFException("cannot encode parameters: " + e.getMessage(), e);
            }
        } else {
            dERNullExtractParameters = DERNull.INSTANCE;
            int i3 = onTransact + 21;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
        return new AlgorithmIdentifier(aSN1ObjectIdentifier, dERNullExtractParameters);
    }

    PublicKey toPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws CRMFException, InvalidKeySpecException {
        int i = 2 % 2;
        try {
            PublicKey publicKeyGeneratePublic = createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
            int i2 = onTransact + 9;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return publicKeyGeneratePublic;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            throw new CRMFException("invalid key: " + e.getMessage(), e);
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 43424), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, 22439 - View.MeasureSpec.getSize(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr2 = onNavigationEvent;
                float f = 0.0f;
                if (bArr2 != null) {
                    int i7 = $11 + 119;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char gidForName = (char) (Process.getGidForName(BuildConfig.FLAVOR) + 12844);
                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 55;
                                int i10 = (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 2167;
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(gidForName, jumpTapTimeout, i10, -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr3[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i9++;
                            f = 0.0f;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName(BuildConfig.FLAVOR) + 43425), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 41, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = $11;
                int i12 = i11 + 95;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                int i14 = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
                if (z2) {
                    int i15 = i11 + 125;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i14 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 87, 9567 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onNavigationEvent;
                if (bArr5 != null) {
                    int i17 = $11 + 7;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        bArr[i5] = (byte) (bArr5[i5] ^ (-4629411779493505016L));
                        i5++;
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i18 = $10 + 109;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    z = true;
                } else {
                    int i20 = $11 + 51;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    int i22 = $10 + 49;
                    $11 = i22 % 128;
                    int i23 = i22 % 2;
                }
            }
            String string = sb.toString();
            int i24 = $11 + 65;
            $10 = i24 % 128;
            int i25 = i24 % 2;
            objArr[0] = string;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onExtraCallback() {
        onExtraCallback = -1733068567;
        onWarmupCompleted = -1538795464;
        onExtraCallbackWithResult = 871455394;
        onNavigationEvent = new byte[]{-37, -73, -63, -20, -108, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 61, 62, 76, 54, -97, 77, -107, -106, 92, -103, 60, -86, 65, -119, 59, 49, -20, 55, -5, -5, -16, -3, -17, -47, 18, ISO7816.INS_CREATE_FILE, 72, 53, 31, 67, 49, ISO7816.INS_INCREASE, -22, CVCAFile.CAR_TAG, CVCAFile.CAR_TAG, -1, -37, 123, CVCAFile.CAR_TAG};
    }
}

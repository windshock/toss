package org.bouncycastle.oer.its.template;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.verifySignatureValue_NoAlgorithmInfo;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.oer.OERDefinition;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class IEEE1609dot2 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final OERDefinition.Builder AesCcmCiphertext;
    public static final OERDefinition.Builder Certificate;
    public static final OERDefinition.Builder CertificateBase;
    public static final OERDefinition.Builder CertificateId;
    public static final OERDefinition.Builder CertificateType;
    public static final OERDefinition.Builder ContributedExtensionBlock;
    public static final OERDefinition.Builder Countersignature;
    public static final OERDefinition.Builder EncryptedData;
    public static final OERDefinition.Builder EncryptedDataEncryptionKey;
    public static final OERDefinition.Builder EndEntityType;
    public static final OERDefinition.Builder EtsiOriginatingHeaderInfoExtension;
    public static final OERDefinition.Builder HashedData;
    public static final OERDefinition.Builder HeaderInfo;
    public static final OERDefinition.Builder HeaderInfoContributorId;
    private static char[] IAuthTabCallback = null;
    public static final OERDefinition.Builder Ieee1609Dot2Content;
    public static final OERDefinition.Builder Ieee1609Dot2Data;
    public static final OERDefinition.Builder IssuerIdentifier;
    public static final OERDefinition.Builder LinkageData;
    public static final OERDefinition.Builder MissingCrlIdentifier;
    public static final OERDefinition.Builder PKRecipientInfo;
    public static final OERDefinition.Builder PduFunctionalType;
    public static final OERDefinition.Builder PreSharedKeyRecipientInfo;
    public static final OERDefinition.Builder PsidGroupPermissions;
    public static final OERDefinition.Builder RecipientInfo;
    public static final OERDefinition.Builder SequenceOfCertificate;
    public static final OERDefinition.Builder SequenceOfPsidGroupPermissions;
    public static final OERDefinition.Builder SequenceOfRecipientInfo;
    public static final OERDefinition.Builder SignedData;
    public static final OERDefinition.Builder SignedDataPayload;
    public static final OERDefinition.Builder SignerIdentifier;
    public static final OERDefinition.Builder SubjectPermissions;
    public static final OERDefinition.Builder SymmRecipientInfo;
    public static final OERDefinition.Builder SymmetricCiphertext;
    public static final OERDefinition.Builder ToBeSignedCertificate;
    public static final OERDefinition.Builder ToBeSignedData;
    public static final OERDefinition.Builder VerificationKeyIndicator;
    public static final OERDefinition.Element certificate;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final OERDefinition.Element tbsCertificate;

    static {
        onWarmupCompleted();
        OERDefinition.Builder builderInteger = OERDefinition.integer(0L, 255L);
        PduFunctionalType = builderInteger;
        OERDefinition.Builder builderChoice = OERDefinition.choice(OERDefinition.octets(32).label("sha256HashedData"), OERDefinition.extension(), OERDefinition.octets(48).label("sha384HashedData"), OERDefinition.octets(32).label("reserved"));
        HashedData = builderChoice;
        OERDefinition.Builder builder = Ieee1609Dot2BaseTypes.HashedId3;
        OERDefinition.Builder builderLabel = builder.label("cracaId");
        OERDefinition.Builder builder2 = Ieee1609Dot2BaseTypes.CrlSeries;
        OERDefinition.Builder builderSeq = OERDefinition.seq(builderLabel, builder2.label("crlSeries"), OERDefinition.extension());
        MissingCrlIdentifier = builderSeq;
        OERDefinition.Builder builderInteger2 = OERDefinition.integer(0L, 255L);
        HeaderInfoContributorId = builderInteger2;
        OERDefinition.Builder builderSeq2 = OERDefinition.seq(builderInteger2.label(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_ID), OERDefinition.extension());
        EtsiOriginatingHeaderInfoExtension = builderSeq2;
        OERDefinition.Builder builderSeq3 = OERDefinition.seq(builderInteger2, OERDefinition.seqof(builderSeq2));
        ContributedExtensionBlock = builderSeq3;
        OERDefinition.Builder builder3 = Ieee1609Dot2BaseTypes.HashedId8;
        PreSharedKeyRecipientInfo = builder3;
        OERDefinition.Builder builder4 = Ieee1609Dot2BaseTypes.EciesP256EncryptedKey;
        OERDefinition.Builder builderChoice2 = OERDefinition.choice(builder4.label("eciesNistP256"), builder4.label("eciesBrainpoolP256r1"), OERDefinition.extension());
        EncryptedDataEncryptionKey = builderChoice2;
        OERDefinition.Builder builderSeq4 = OERDefinition.seq(builder3.label("recipientId"), builderChoice2.label("encKey"));
        PKRecipientInfo = builderSeq4;
        OERDefinition.Builder builderOctets = OERDefinition.octets(12);
        Object[] objArr = new Object[1];
        a(new char[]{'\r', '\b', '\r', 18, 13873}, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 50), 5 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
        OERDefinition.Builder builderSeq5 = OERDefinition.seq(builderOctets.label(((String) objArr[0]).intern()), OERDefinition.opaque().label("ccmCiphertext"));
        AesCcmCiphertext = builderSeq5;
        Object[] objArr2 = new Object[1];
        a(new char[]{'\r', 17, 6, '\f', 21, '\t', 13900, 13900, 13898}, (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 82), 9 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
        OERDefinition.Builder builderChoice3 = OERDefinition.choice(builderSeq5.label(((String) objArr2[0]).intern()), OERDefinition.extension());
        SymmetricCiphertext = builderChoice3;
        OERDefinition.Builder builderSeq6 = OERDefinition.seq(builder3.label("recipientId"), builderChoice3.label("encKey"));
        SymmRecipientInfo = builderSeq6;
        OERDefinition.Builder builderChoice4 = OERDefinition.choice(builder3.label("pskRecipInfo"), builderSeq6.label("symmRecipInfo"), builderSeq4.label("certRecipInfo"), builderSeq4.label("signedDataRecipInfo"), builderSeq4.label("rekRecipInfo"));
        RecipientInfo = builderChoice4;
        OERDefinition.Builder builderSeqof = OERDefinition.seqof(builderChoice4);
        SequenceOfRecipientInfo = builderSeqof;
        OERDefinition.Builder builderSeq7 = OERDefinition.seq(builderSeqof.label("recipients"), builderChoice3.label("ciphertext"));
        EncryptedData = builderSeq7;
        OERDefinition.Builder builderDefaultValue = OERDefinition.bitString(8L).defaultValue(new DERBitString(new byte[]{0}, 0));
        EndEntityType = builderDefaultValue;
        OERDefinition.Builder builderLabel2 = OERDefinition.choice(Ieee1609Dot2BaseTypes.SequenceOfPsidSspRange, OERDefinition.nullValue(), OERDefinition.extension()).label("SubjectPermissions");
        SubjectPermissions = builderLabel2;
        OERDefinition.Builder builderLabel3 = OERDefinition.choice(Ieee1609Dot2BaseTypes.PublicVerificationKey, Ieee1609Dot2BaseTypes.EccP256CurvePoint, OERDefinition.extension()).label("VerificationKeyIndicator");
        VerificationKeyIndicator = builderLabel3;
        OERDefinition.Builder builderLabel4 = OERDefinition.seq(builderLabel2, OERDefinition.integer(1L), OERDefinition.integer(0L), builderDefaultValue).label("PsidGroupPermissions");
        PsidGroupPermissions = builderLabel4;
        OERDefinition.Builder builderLabel5 = OERDefinition.seqof(builderLabel4).label("SequenceOfPsidGroupPermissions");
        SequenceOfPsidGroupPermissions = builderLabel5;
        OERDefinition.Builder builderLabel6 = OERDefinition.seq(Ieee1609Dot2BaseTypes.IValue, Ieee1609Dot2BaseTypes.LinkageValue, OERDefinition.optional(Ieee1609Dot2BaseTypes.GroupLinkageValue), OERDefinition.extension()).label("LinkageData");
        LinkageData = builderLabel6;
        OERDefinition.Builder builderLabel7 = OERDefinition.choice(builderLabel6, Ieee1609Dot2BaseTypes.Hostname, OERDefinition.octets(1, 64).label("binaryId"), OERDefinition.nullValue(), OERDefinition.extension()).label("CertificateId");
        CertificateId = builderLabel7;
        OERDefinition.Builder builderLabel8 = OERDefinition.seq(builderLabel7.labelPrefix(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_ID), builder.labelPrefix("cracaId"), builder2.labelPrefix("crlSeries"), Ieee1609Dot2BaseTypes.ValidityPeriod.labelPrefix("validityPeriod"), OERDefinition.optional(Ieee1609Dot2BaseTypes.GeographicRegion.labelPrefix("region"), Ieee1609Dot2BaseTypes.SubjectAssurance.labelPrefix("assuranceLevel"), Ieee1609Dot2BaseTypes.SequenceOfPsidSsp.labelPrefix("appPermissions"), builderLabel5.labelPrefix("certIssuePermissions"), builderLabel5.labelPrefix("certRequestPermissions"), OERDefinition.nullValue().labelPrefix("canRequestRollover"), Ieee1609Dot2BaseTypes.PublicEncryptionKey.labelPrefix("encryptionKey")), builderLabel3.labelPrefix("verifyKeyIndicator"), OERDefinition.extension()).label("ToBeSignedCertificate");
        ToBeSignedCertificate = builderLabel8;
        OERDefinition.Builder builder5 = Ieee1609Dot2BaseTypes.HashAlgorithm;
        OERDefinition.Builder builderLabel9 = OERDefinition.choice(builder3, builder5, OERDefinition.extension(), builder3).label("IssuerIdentifier");
        IssuerIdentifier = builderLabel9;
        OERDefinition.Builder builderLabel10 = OERDefinition.enumeration(OERDefinition.enumItem("explicit"), OERDefinition.enumItem("implicit"), OERDefinition.extension()).label("CertificateType");
        CertificateType = builderLabel10;
        OERDefinition.Builder builder6 = Ieee1609Dot2BaseTypes.UINT8;
        OERDefinition.Builder builder7 = Ieee1609Dot2BaseTypes.Signature;
        OERDefinition.Builder builderLabel11 = OERDefinition.seq(builder6, builderLabel10, builderLabel9, builderLabel8, OERDefinition.optional(builder7)).label("CertificateBase");
        CertificateBase = builderLabel11;
        OERDefinition.Builder builderLabel12 = builderLabel11.copy().label("Certificate(CertificateBase)");
        Certificate = builderLabel12;
        OERDefinition.Builder builderSeqof2 = OERDefinition.seqof(builderLabel12);
        SequenceOfCertificate = builderSeqof2;
        OERDefinition.Builder builderLabel13 = Ieee1609Dot2BaseTypes.Psid.label("psid");
        OERDefinition.Builder builder8 = Ieee1609Dot2BaseTypes.Time64;
        OERDefinition.Builder builderSeq8 = OERDefinition.seq(builderLabel13, OERDefinition.optional(builder8.label("generationTime"), builder8.label("expiryTime"), Ieee1609Dot2BaseTypes.ThreeDLocation.label("generationLocation"), builder.label("p2pcdLearningRequest"), builderSeq.label("missingCrlIdentifier"), Ieee1609Dot2BaseTypes.EncryptionKey.label("encryptionKey")), OERDefinition.extension(), OERDefinition.optional(Ieee1609Dot2BaseTypes.SequenceOfHashedId3.label("inlineP2pcdRequest"), builderLabel12.label("requestedCertificate"), builderInteger.label("pduFunctionalType"), builderSeq3.label("contributedExtensions")));
        HeaderInfo = builderSeq8;
        OERDefinition.Builder builderChoice5 = OERDefinition.choice(builder3.label("digest"), builderSeqof2, OERDefinition.nullValue().label("self"), OERDefinition.extension());
        SignerIdentifier = builderChoice5;
        OERDefinition.MutableBuilder mutableBuilder = new OERDefinition.MutableBuilder(OERDefinition.BaseType.SEQ);
        ToBeSignedData = mutableBuilder;
        OERDefinition.Builder builderSeq9 = OERDefinition.seq(builder5.label("hashId"), mutableBuilder.label("tbsData"), builderChoice5.label("signer"), builder7.label("signature"));
        SignedData = builderSeq9;
        OERDefinition.Builder builderLabel14 = OERDefinition.opaque().label("unsecuredData");
        OERDefinition.Builder builderLabel15 = builderSeq9.label("signedData");
        Object[] objArr3 = new Object[1];
        a(new char[]{23, '\r', '\n', 3, 6, 15, 16, 19, 24, 17, '\n', 17, 13829}, (byte) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 11), KeyEvent.normalizeMetaState(0) + 13, objArr3);
        OERDefinition.Builder builderChoice6 = OERDefinition.choice(builderLabel14, builderLabel15, builderSeq7.label(((String) objArr3[0]).intern()), OERDefinition.opaque().label("signedCertificateRequest"), OERDefinition.extension());
        Ieee1609Dot2Content = builderChoice6;
        Countersignature = OERDefinition.seq(builder6.label("protocolVersion"), builderChoice6.label("content"));
        OERDefinition.Builder builderSeq10 = OERDefinition.seq(builder6.label("protocolVersion"), builderChoice6.label("content"));
        Ieee1609Dot2Data = builderSeq10;
        Object[] objArr4 = new Object[1];
        a(new char[]{2, 17, 17, '\n'}, (byte) (View.combineMeasuredStates(0, 0) + 57), 4 - Color.argb(0, 0, 0, 0), objArr4);
        OERDefinition.Builder builderSeq11 = OERDefinition.seq(OERDefinition.optional(builderSeq10.label(((String) objArr4[0]).intern()), builderChoice.label("extDataHash")), OERDefinition.extension());
        SignedDataPayload = builderSeq11;
        certificate = builderLabel12.build();
        tbsCertificate = builderLabel8.build();
        Object[] objArr5 = new Object[1];
        a(new char[]{17, 11, 6, 0, 2, '\r', 13848}, (byte) (26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 7, objArr5);
        mutableBuilder.addItemsAndFreeze(builderSeq11.label(((String) objArr5[0]).intern()), builderSeq8.label("headerInfo"));
        int i = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10;
            int i5 = i4 + 89;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = i4 + 53;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            for (int i9 = 0; i9 < length; i9++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 27, 23139 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 26, 23139 - (ViewConfiguration.getTouchSlop() >> 8), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i10 = $11 + 81;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent >>> 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - Color.argb(0, 0, 0, 0)), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 74, 8088 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i11 = $11 + 9;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 30, View.resolveSize(0, 0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            int i14 = $11 + 89;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                                int i18 = $10 + 59;
                                $11 = i18 % 128;
                                int i19 = i18 % 2;
                            } else {
                                int i20 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i21 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i20];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i21];
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
        for (int i22 = 0; i22 < i; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new char[]{64961, 64991, 64965, 64988, 64987, 64970, 64907, 64960, 64989, 64986, 64966, 64898, 64978, 64976, 64962, 64967, 64963, 64990, 64982, 65015, 64984, 64985, 64983, 64964, 64897};
        onExtraCallback = (char) 51244;
    }
}

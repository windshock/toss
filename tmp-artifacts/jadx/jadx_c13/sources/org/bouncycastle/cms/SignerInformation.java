package org.bouncycastle.cms;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.CMSAlgorithmProtection;
import org.bouncycastle.asn1.cms.CMSAttributes;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.SignerIdentifier;
import org.bouncycastle.asn1.cms.SignerInfo;
import org.bouncycastle.asn1.cms.Time;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.RawContentVerifier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.TeeOutputStream;
import org.opencv.imgproc.Imgproc;
import ua.naiksoftware.stomp.dto.StompHeader;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class SignerInformation {
    private static short[] onExtraCallbackWithResult;
    private final CMSProcessable content;
    private final ASN1ObjectIdentifier contentType;
    protected final AlgorithmIdentifier digestAlgorithm;
    protected final AlgorithmIdentifier encryptionAlgorithm;
    protected final SignerInfo info;
    private final boolean isCounterSignature;
    private byte[] resultDigest;
    private final SignerId sid;
    private final byte[] signature;
    protected final ASN1Set signedAttributeSet;
    private AttributeTable signedAttributeValues;
    protected final ASN1Set unsignedAttributeSet;
    private AttributeTable unsignedAttributeValues;
    private static final byte[] $$a = {69, -38, -90, 81};
    private static final int $$b = 52;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallback = 1388055241;
    private static int onNavigationEvent = -1538795404;
    private static int onExtraCallback = 967946589;
    private static byte[] onWarmupCompleted = {31, 34, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        int i3;
        int i4 = 1 - (b * 3);
        int i5 = (b2 * 3) + 115;
        int i6 = (i * 2) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i4;
            int i9 = 0;
            int i10 = i6 + i8;
            int i11 = i7 + 1;
            i2 = i9;
            i5 = i10;
            i6 = i11;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            int i12 = i5;
            i7 = i6;
            i6 = bArr[i6];
            i9 = i3;
            i8 = i12;
            int i102 = i6 + i8;
            int i112 = i7 + 1;
            i2 = i9;
            i5 = i102;
            i6 = i112;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i4) {
            }
        }
    }

    SignerInformation(SignerInfo signerInfo, ASN1ObjectIdentifier aSN1ObjectIdentifier, CMSProcessable cMSProcessable, byte[] bArr) {
        boolean z;
        SignerId signerId;
        this.info = signerInfo;
        this.contentType = aSN1ObjectIdentifier;
        if (aSN1ObjectIdentifier == null) {
            z = true;
        } else {
            int i = onTransact + 29;
            asBinder = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            z = false;
        }
        this.isCounterSignature = z;
        SignerIdentifier sid = signerInfo.getSID();
        boolean zIsTagged = sid.isTagged();
        ASN1Encodable id = sid.getId();
        if (zIsTagged) {
            signerId = new SignerId(ASN1OctetString.getInstance(id).getOctets());
        } else {
            IssuerAndSerialNumber issuerAndSerialNumber = IssuerAndSerialNumber.getInstance(id);
            SignerId signerId2 = new SignerId(issuerAndSerialNumber.getName(), issuerAndSerialNumber.getSerialNumber().getValue());
            int i4 = asBinder + 61;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            signerId = signerId2;
        }
        this.sid = signerId;
        this.digestAlgorithm = signerInfo.getDigestAlgorithm();
        this.signedAttributeSet = signerInfo.getAuthenticatedAttributes();
        this.unsignedAttributeSet = signerInfo.getUnauthenticatedAttributes();
        this.encryptionAlgorithm = signerInfo.getDigestEncryptionAlgorithm();
        this.signature = signerInfo.getEncryptedDigest().getOctets();
        this.content = cMSProcessable;
        this.resultDigest = bArr;
    }

    protected SignerInformation(SignerInformation signerInformation) {
        this(signerInformation, signerInformation.info);
    }

    protected SignerInformation(SignerInformation signerInformation, SignerInfo signerInfo) {
        this.info = signerInfo;
        this.contentType = signerInformation.contentType;
        this.isCounterSignature = signerInformation.isCounterSignature();
        this.sid = signerInformation.getSID();
        this.digestAlgorithm = signerInfo.getDigestAlgorithm();
        this.signedAttributeSet = signerInfo.getAuthenticatedAttributes();
        this.unsignedAttributeSet = signerInfo.getUnauthenticatedAttributes();
        this.encryptionAlgorithm = signerInfo.getDigestEncryptionAlgorithm();
        this.signature = signerInfo.getEncryptedDigest().getOctets();
        this.content = signerInformation.content;
        this.resultDigest = signerInformation.resultDigest;
        this.signedAttributeValues = getSignedAttributes();
        this.unsignedAttributeValues = getUnsignedAttributes();
    }

    public static SignerInformation addCounterSigners(SignerInformation signerInformation, SignerInformationStore signerInformationStore) {
        ASN1EncodableVector aSN1EncodableVector;
        int i = 2 % 2;
        int i2 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SignerInfo signerInfo = signerInformation.info;
        AttributeTable unsignedAttributes = signerInformation.getUnsignedAttributes();
        if (unsignedAttributes != null) {
            int i4 = asBinder + 13;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                unsignedAttributes.toASN1EncodableVector();
                throw null;
            }
            aSN1EncodableVector = unsignedAttributes.toASN1EncodableVector();
        } else {
            aSN1EncodableVector = new ASN1EncodableVector();
            int i5 = onTransact + 13;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        Iterator<SignerInformation> it = signerInformationStore.getSigners().iterator();
        while (it.hasNext()) {
            int i7 = asBinder + 19;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            aSN1EncodableVector2.add(it.next().toASN1Structure());
        }
        aSN1EncodableVector.add(new Attribute(CMSAttributes.counterSignature, new DERSet(aSN1EncodableVector2)));
        return new SignerInformation(new SignerInfo(signerInfo.getSID(), signerInfo.getDigestAlgorithm(), signerInfo.getAuthenticatedAttributes(), signerInfo.getDigestEncryptionAlgorithm(), signerInfo.getEncryptedDigest(), new DERSet(aSN1EncodableVector)), signerInformation.contentType, signerInformation.content, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[Catch: OperatorCreationException -> 0x0197, IOException -> 0x01b3, PHI: r5
      0x005b: PHI (r5v18 java.io.OutputStream) = (r5v17 java.io.OutputStream), (r5v21 java.io.OutputStream) binds: [B:20:0x0059, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {IOException -> 0x01b3, OperatorCreationException -> 0x0197, blocks: (B:4:0x001b, B:8:0x002e, B:12:0x0045, B:14:0x004d, B:25:0x0073, B:26:0x007f, B:31:0x0097, B:45:0x00ce, B:21:0x005b, B:23:0x005f, B:24:0x0065, B:19:0x0053, B:27:0x0083, B:30:0x0090, B:33:0x00a7, B:34:0x00ae, B:35:0x00af, B:39:0x00be, B:41:0x00c2, B:44:0x00c7), top: B:92:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[Catch: OperatorCreationException -> 0x0197, IOException -> 0x01b3, PHI: r5
      0x0073: PHI (r5v20 java.io.OutputStream) = (r5v17 java.io.OutputStream), (r5v21 java.io.OutputStream) binds: [B:20:0x0059, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {IOException -> 0x01b3, OperatorCreationException -> 0x0197, blocks: (B:4:0x001b, B:8:0x002e, B:12:0x0045, B:14:0x004d, B:25:0x0073, B:26:0x007f, B:31:0x0097, B:45:0x00ce, B:21:0x005b, B:23:0x005f, B:24:0x0065, B:19:0x0053, B:27:0x0083, B:30:0x0090, B:33:0x00a7, B:34:0x00ae, B:35:0x00af, B:39:0x00be, B:41:0x00c2, B:44:0x00c7), top: B:92:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean doVerify(SignerInformationVerifier signerInformationVerifier) throws Throwable {
        OutputStream outputStream;
        int i = 2 % 2;
        String encryptionAlgName = CMSSignedHelper.INSTANCE.getEncryptionAlgName(getEncryptionAlgOID());
        try {
            RawContentVerifier contentVerifier = signerInformationVerifier.getContentVerifier(this.encryptionAlgorithm, this.info.getDigestAlgorithm());
            try {
                OutputStream outputStream2 = contentVerifier.getOutputStream();
                Object obj = null;
                if (this.resultDigest == null) {
                    int i2 = onTransact + 73;
                    asBinder = i2 % 128;
                    int i3 = i2 % 2;
                    DigestCalculator digestCalculator = signerInformationVerifier.getDigestCalculator(getDigestAlgorithmID());
                    if (this.content != null) {
                        int i4 = asBinder + 7;
                        onTransact = i4 % 128;
                        if (i4 % 2 != 0) {
                            outputStream = digestCalculator.getOutputStream();
                            int i5 = 60 / 0;
                            if (this.signedAttributeSet != null) {
                                this.content.write(outputStream);
                                outputStream2.write(getEncodedSignedAttributes());
                            } else if (contentVerifier instanceof RawContentVerifier) {
                                this.content.write(outputStream);
                            } else {
                                TeeOutputStream teeOutputStream = new TeeOutputStream(outputStream, outputStream2);
                                this.content.write(teeOutputStream);
                                teeOutputStream.close();
                            }
                        } else {
                            outputStream = digestCalculator.getOutputStream();
                            if (this.signedAttributeSet == null) {
                            }
                        }
                        outputStream.close();
                    } else {
                        if (this.signedAttributeSet == null) {
                            throw new CMSException("data not encapsulated in signature - use detached constructor.");
                        }
                        int i6 = onTransact + 73;
                        asBinder = i6 % 128;
                        int i7 = i6 % 2;
                        outputStream2.write(getEncodedSignedAttributes());
                    }
                    this.resultDigest = digestCalculator.getDigest();
                    int i8 = onTransact + 113;
                    asBinder = i8 % 128;
                    int i9 = i8 % 2;
                } else if (this.signedAttributeSet == null) {
                    int i10 = asBinder + 83;
                    onTransact = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                    CMSProcessable cMSProcessable = this.content;
                    if (cMSProcessable != null) {
                        cMSProcessable.write(outputStream2);
                    }
                } else {
                    outputStream2.write(getEncodedSignedAttributes());
                }
                outputStream2.close();
                verifyContentTypeAttributeValue();
                AttributeTable signedAttributes = getSignedAttributes();
                verifyAlgorithmIdentifierProtectionAttribute(signedAttributes);
                verifyMessageDigestAttribute();
                verifyCounterSignatureAttribute(signedAttributes);
                try {
                    if (this.signedAttributeSet == null) {
                        int i11 = onTransact + 111;
                        int i12 = i11 % 128;
                        asBinder = i12;
                        if (i11 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (this.resultDigest != null && !(!(contentVerifier instanceof RawContentVerifier))) {
                            int i13 = i12 + 23;
                            onTransact = i13 % 128;
                            int i14 = i13 % 2;
                            RawContentVerifier rawContentVerifier = contentVerifier;
                            Object[] objArr = new Object[1];
                            a((short) ((-41) - View.MeasureSpec.getMode(0)), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 151268672 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1644795645 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (-121) - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
                            if (encryptionAlgName.equals(((String) objArr[0]).intern())) {
                                return rawContentVerifier.verify(new DigestInfo(new AlgorithmIdentifier(this.digestAlgorithm.getAlgorithm(), DERNull.INSTANCE), this.resultDigest).getEncoded("DER"), getSignature());
                            }
                            boolean zVerify = rawContentVerifier.verify(this.resultDigest, getSignature());
                            int i15 = onTransact + 1;
                            asBinder = i15 % 128;
                            if (i15 % 2 != 0) {
                                return zVerify;
                            }
                            obj.hashCode();
                            throw null;
                        }
                    }
                    return contentVerifier.verify(getSignature());
                } catch (IOException e) {
                    throw new CMSException("can't process mime object to create signature.", e);
                }
            } catch (IOException e2) {
                throw new CMSException("can't process mime object to create signature.", e2);
            } catch (OperatorCreationException e3) {
                throw new CMSException("can't create digest calculator: " + e3.getMessage(), e3);
            }
        } catch (OperatorCreationException e4) {
            throw new CMSException("can't create content verifier: " + e4.getMessage(), e4);
        }
    }

    private byte[] encodeObj(ASN1Encodable aSN1Encodable) throws IOException {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 5;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (aSN1Encodable != null) {
            return aSN1Encodable.toASN1Primitive().getEncoded();
        }
        int i4 = i2 + 53;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private Time getSigningTime() throws CMSException {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getSingleValuedSignedAttribute(CMSAttributes.signingTime, "signing-time");
            obj.hashCode();
            throw null;
        }
        ASN1Primitive singleValuedSignedAttribute = getSingleValuedSignedAttribute(CMSAttributes.signingTime, "signing-time");
        if (singleValuedSignedAttribute == null) {
            return null;
        }
        try {
            Time time = Time.getInstance(singleValuedSignedAttribute);
            int i3 = asBinder + 83;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return time;
            }
            obj.hashCode();
            throw null;
        } catch (IllegalArgumentException unused) {
            throw new CMSException("signing-time attribute value not a valid 'Time' structure");
        }
    }

    private ASN1Primitive getSingleValuedSignedAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) throws CMSException {
        int i = 2 % 2;
        AttributeTable unsignedAttributes = getUnsignedAttributes();
        if (unsignedAttributes != null && unsignedAttributes.getAll(aSN1ObjectIdentifier).size() > 0) {
            throw new CMSException("The " + str + " attribute MUST NOT be an unsigned attribute");
        }
        AttributeTable signedAttributes = getSignedAttributes();
        if (signedAttributes == null) {
            int i2 = onTransact + 119;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        ASN1EncodableVector all = signedAttributes.getAll(aSN1ObjectIdentifier);
        int size = all.size();
        if (size == 0) {
            return null;
        }
        if (size != 1) {
            throw new CMSException("The SignedAttributes in a signerInfo MUST NOT include multiple instances of the " + str + " attribute");
        }
        ASN1Set attrValues = ((Attribute) all.get(0)).getAttrValues();
        if (attrValues.size() == 1) {
            int i4 = asBinder + 105;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return attrValues.getObjectAt(0).toASN1Primitive();
        }
        throw new CMSException("A " + str + " attribute MUST have a single attribute value");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[PHI: r2
      0x0030: PHI (r2v5 org.bouncycastle.asn1.cms.SignerInfo) = (r2v2 org.bouncycastle.asn1.cms.SignerInfo), (r2v6 org.bouncycastle.asn1.cms.SignerInfo) binds: [B:8:0x001a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[PHI: r2
      0x001c: PHI (r2v3 org.bouncycastle.asn1.cms.SignerInfo) = (r2v2 org.bouncycastle.asn1.cms.SignerInfo), (r2v6 org.bouncycastle.asn1.cms.SignerInfo) binds: [B:8:0x001a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SignerInformation replaceUnsignedAttributes(SignerInformation signerInformation, AttributeTable attributeTable) {
        SignerInfo signerInfo;
        DERSet dERSet;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 47;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            signerInfo = signerInformation.info;
            int i4 = 26 / 0;
            if (attributeTable != null) {
                DERSet dERSet2 = new DERSet(attributeTable.toASN1EncodableVector());
                int i5 = onTransact + 9;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                dERSet = dERSet2;
            } else {
                int i7 = i2 + 103;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                dERSet = null;
            }
        } else {
            signerInfo = signerInformation.info;
            if (attributeTable != null) {
            }
        }
        return new SignerInformation(new SignerInfo(signerInfo.getSID(), signerInfo.getDigestAlgorithm(), signerInfo.getAuthenticatedAttributes(), signerInfo.getDigestEncryptionAlgorithm(), signerInfo.getEncryptedDigest(), dERSet), signerInformation.contentType, signerInformation.content, null);
    }

    private void verifyAlgorithmIdentifierProtectionAttribute(AttributeTable attributeTable) throws CMSException {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        AttributeTable unsignedAttributes = getUnsignedAttributes();
        if (unsignedAttributes != null && unsignedAttributes.getAll(CMSAttributes.cmsAlgorithmProtect).size() > 0) {
            throw new CMSException("A cmsAlgorithmProtect attribute MUST be a signed attribute");
        }
        if (attributeTable != null) {
            int i4 = asBinder + 85;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            ASN1EncodableVector all = attributeTable.getAll(CMSAttributes.cmsAlgorithmProtect);
            if (all.size() > 1) {
                throw new CMSException("Only one instance of a cmsAlgorithmProtect attribute can be present");
            }
            if (all.size() > 0) {
                Attribute attribute = Attribute.getInstance(all.get(0));
                if (attribute.getAttrValues().size() != 1) {
                    throw new CMSException("A cmsAlgorithmProtect attribute MUST contain exactly one value");
                }
                CMSAlgorithmProtection cMSAlgorithmProtection = CMSAlgorithmProtection.getInstance(attribute.getAttributeValues()[0]);
                if (!CMSUtils.isEquivalent(cMSAlgorithmProtection.getDigestAlgorithm(), this.info.getDigestAlgorithm())) {
                    throw new CMSException("CMS Algorithm Identifier Protection check failed for digestAlgorithm");
                }
                int i6 = asBinder + 43;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                if (!CMSUtils.isEquivalent(cMSAlgorithmProtection.getSignatureAlgorithm(), this.info.getDigestEncryptionAlgorithm())) {
                    throw new CMSException("CMS Algorithm Identifier Protection check failed for signatureAlgorithm");
                }
            }
        }
        int i8 = onTransact + 81;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
    }

    private void verifyContentTypeAttributeValue() throws CMSException {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ASN1Primitive singleValuedSignedAttribute = getSingleValuedSignedAttribute(CMSAttributes.contentType, StompHeader.CONTENT_TYPE);
        if (singleValuedSignedAttribute == null) {
            if (!this.isCounterSignature && this.signedAttributeSet != null) {
                throw new CMSException("The content-type attribute type MUST be present whenever signed attributes are present in signed-data");
            }
        } else {
            if (this.isCounterSignature) {
                throw new CMSException("[For counter signatures,] the signedAttributes field MUST NOT contain a content-type attribute");
            }
            if (!(singleValuedSignedAttribute instanceof ASN1ObjectIdentifier)) {
                throw new CMSException("content-type attribute value not of ASN.1 type 'OBJECT IDENTIFIER'");
            }
            if (!((ASN1ObjectIdentifier) singleValuedSignedAttribute).equals((ASN1Primitive) this.contentType)) {
                throw new CMSException("content-type attribute value does not match eContentType");
            }
        }
        int i4 = asBinder + 35;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void verifyCounterSignatureAttribute(AttributeTable attributeTable) throws CMSException {
        int i = 2 % 2;
        if (attributeTable != null) {
            int i2 = onTransact + 23;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                attributeTable.getAll(CMSAttributes.counterSignature).size();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (attributeTable.getAll(CMSAttributes.counterSignature).size() > 0) {
                throw new CMSException("A countersignature attribute MUST NOT be a signed attribute");
            }
        }
        AttributeTable unsignedAttributes = getUnsignedAttributes();
        if (unsignedAttributes != null) {
            int i3 = onTransact + 99;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            ASN1EncodableVector all = unsignedAttributes.getAll(CMSAttributes.counterSignature);
            while (i5 < all.size()) {
                int i6 = asBinder + 29;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                if (Attribute.getInstance(all.get(i5)).getAttrValues().size() <= 0) {
                    throw new CMSException("A countersignature attribute MUST contain at least one AttributeValue");
                }
                int i8 = onTransact + 73;
                int i9 = i8 % 128;
                asBinder = i9;
                int i10 = i8 % 2;
                i5++;
                int i11 = i9 + 95;
                onTransact = i11 % 128;
                int i12 = i11 % 2;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSSignerDigestMismatchException */
    private void verifyMessageDigestAttribute() throws CMSException, CMSSignerDigestMismatchException {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ASN1Primitive singleValuedSignedAttribute = getSingleValuedSignedAttribute(CMSAttributes.messageDigest, "message-digest");
        if (singleValuedSignedAttribute != null) {
            if (!(singleValuedSignedAttribute instanceof ASN1OctetString)) {
                throw new CMSException("message-digest attribute value not of ASN.1 type 'OCTET STRING'");
            }
            if (!Arrays.constantTimeAreEqual(this.resultDigest, ((ASN1OctetString) singleValuedSignedAttribute).getOctets())) {
                throw new CMSSignerDigestMismatchException("message-digest attribute value does not match calculated value");
            }
            return;
        }
        int i4 = onTransact + 51;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        ASN1Set aSN1Set = this.signedAttributeSet;
        if (i5 == 0) {
            int i6 = 51 / 0;
            if (aSN1Set == null) {
                return;
            }
        } else if (aSN1Set == null) {
            return;
        }
        throw new CMSException("the message-digest signed attribute type MUST be present when there are any signed attributes present");
    }

    public byte[] getContentDigest() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        byte[] bArr = this.resultDigest;
        if (bArr == null) {
            throw new IllegalStateException("method can only be called after verify.");
        }
        int i5 = i3 + 23;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return Arrays.clone(bArr);
    }

    public ASN1ObjectIdentifier getContentType() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 27;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.contentType;
        int i5 = i2 + 31;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return aSN1ObjectIdentifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SignerInformationStore getCounterSignatures() {
        AttributeTable unsignedAttributes;
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asBinder = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            unsignedAttributes = getUnsignedAttributes();
            if (unsignedAttributes != null) {
                i3 = 1;
                ArrayList arrayList = new ArrayList();
                ASN1EncodableVector all = unsignedAttributes.getAll(CMSAttributes.counterSignature);
                while (i3 < all.size()) {
                    int i4 = onTransact + 3;
                    asBinder = i4 % 128;
                    Object obj = null;
                    if (i4 % 2 == 0) {
                        ASN1Set attrValues = ((Attribute) all.get(i3)).getAttrValues();
                        attrValues.size();
                        attrValues.getObjects();
                        obj.hashCode();
                        throw null;
                    }
                    ASN1Set attrValues2 = ((Attribute) all.get(i3)).getAttrValues();
                    attrValues2.size();
                    Enumeration objects = attrValues2.getObjects();
                    while (objects.hasMoreElements()) {
                        arrayList.add(new SignerInformation(SignerInfo.getInstance(objects.nextElement()), null, new CMSProcessableByteArray(getSignature()), null));
                    }
                    i3++;
                }
                return new SignerInformationStore(arrayList);
            }
            return new SignerInformationStore(new ArrayList(0));
        }
        unsignedAttributes = getUnsignedAttributes();
    }

    public String getDigestAlgOID() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String id = this.digestAlgorithm.getAlgorithm().getId();
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return id;
    }

    public byte[] getDigestAlgParams() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        onTransact = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                return encodeObj(this.digestAlgorithm.getParameters());
            }
            encodeObj(this.digestAlgorithm.getParameters());
            throw null;
        } catch (Exception e) {
            throw new RuntimeException("exception getting digest parameters " + e);
        }
    }

    public AlgorithmIdentifier getDigestAlgorithmID() {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        AlgorithmIdentifier algorithmIdentifier = this.digestAlgorithm;
        int i5 = i3 + 49;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
        return algorithmIdentifier;
    }

    public byte[] getEncodedSignedAttributes() throws IOException {
        int i = 2 % 2;
        ASN1Set aSN1Set = this.signedAttributeSet;
        Object obj = null;
        if (aSN1Set == null) {
            int i2 = onTransact + 79;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i3 = onTransact + 21;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return aSN1Set.getEncoded("DER");
        }
        aSN1Set.getEncoded("DER");
        obj.hashCode();
        throw null;
    }

    public String getEncryptionAlgOID() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ASN1ObjectIdentifier algorithm = this.encryptionAlgorithm.getAlgorithm();
        if (i3 == 0) {
            return algorithm.getId();
        }
        algorithm.getId();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public byte[] getEncryptionAlgParams() {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        try {
            byte[] bArrEncodeObj = encodeObj(this.encryptionAlgorithm.getParameters());
            int i4 = asBinder + 49;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return bArrEncodeObj;
        } catch (Exception e) {
            throw new RuntimeException("exception getting encryption parameters " + e);
        }
    }

    public SignerId getSID() {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        SignerId signerId = this.sid;
        int i5 = i3 + 85;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return signerId;
    }

    public byte[] getSignature() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrClone = Arrays.clone(this.signature);
        int i4 = asBinder + 61;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return bArrClone;
    }

    public AttributeTable getSignedAttributes() {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ASN1Set aSN1Set = this.signedAttributeSet;
        if (aSN1Set != null && this.signedAttributeValues == null) {
            this.signedAttributeValues = new AttributeTable(aSN1Set);
        }
        AttributeTable attributeTable = this.signedAttributeValues;
        int i3 = asBinder + 9;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return attributeTable;
        }
        throw null;
    }

    public AttributeTable getUnsignedAttributes() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        ASN1Set aSN1Set = this.unsignedAttributeSet;
        if (aSN1Set != null) {
            int i5 = i3 + 5;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            if (this.unsignedAttributeValues == null) {
                this.unsignedAttributeValues = new AttributeTable(aSN1Set);
            }
        }
        return this.unsignedAttributeValues;
    }

    public int getVersion() {
        int i = 2 % 2;
        int i2 = asBinder + Imgproc.COLOR_YUV2RGB_YVYU;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIntValueExact = this.info.getVersion().intValueExact();
        int i4 = asBinder + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iIntValueExact;
    }

    public boolean isCounterSignature() {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isCounterSignature;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SignerInfo toASN1Structure() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 105;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        SignerInfo signerInfo = this.info;
        int i5 = i2 + 43;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return signerInfo;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSVerifierCertificateNotValidException */
    public boolean verify(SignerInformationVerifier signerInformationVerifier) throws Throwable {
        int i = 2 % 2;
        Time signingTime = getSigningTime();
        if (signerInformationVerifier.hasAssociatedCertificate() && signingTime != null) {
            int i2 = asBinder + 65;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (!signerInformationVerifier.getAssociatedCertificate().isValidOn(signingTime.getDate())) {
                throw new CMSVerifierCertificateNotValidException("verifier not valid at signingTime");
            }
        }
        boolean zDoVerify = doVerify(signerInformationVerifier);
        int i4 = onTransact + 37;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zDoVerify;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x028d A[PHI: r0
      0x028d: PHI (r0v9 int) = (r0v8 int), (r0v34 int) binds: [B:62:0x028b, B:59:0x0279] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x028f A[PHI: r0
      0x028f: PHI (r0v31 int) = (r0v8 int), (r0v34 int) binds: [B:62:0x028b, B:59:0x0279] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int length;
        byte[] bArr;
        int i6;
        int i7 = 2;
        int i8 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16820640), ExpandableListView.getPackedPositionGroup(0L) + 42, 22440 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $10 + 55;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            char c = '0';
            if (z) {
                byte[] bArr2 = onWarmupCompleted;
                float f = 0.0f;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        int i12 = $11 + 43;
                        $10 = i12 % 128;
                        if (i12 % i7 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i11])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char c2 = (char) (12843 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)));
                                int iLastIndexOf = 54 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c);
                                int i13 = 2168 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1));
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iLastIndexOf, i13, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr3[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i11])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 12843), 54 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), Color.red(0) + 2167, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr3[i11] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i11++;
                        }
                        i7 = 2;
                        c = '0';
                        f = 0.0f;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    int i14 = $10 + 29;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        byte[] bArr4 = onWarmupCompleted;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 42 - (ViewConfiguration.getTapTimeout() >> 16), 22439 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] % (-4629411779493505016L))) / ((int) (onNavigationEvent % (-4629411779493505016L)));
                    } else {
                        byte[] bArr5 = onWarmupCompleted;
                        try {
                            Object[] objArr6 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback5 == null) {
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41, 22438 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i6 = ((byte) (bArr5[((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iIntValue = (byte) i6;
                } else {
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i15 = $10 + 99;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    i4 = ((i / iIntValue) >> 5) - ((int) (IAuthTabCallback - 4629411779493505016L));
                    i5 = z ? 1 : 0;
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                    if (z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr7 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 86 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), 9567 - Color.red(0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback6).invoke(null, objArr7)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr6 = onWarmupCompleted;
                if (bArr6 != null) {
                    int i16 = $11 + 71;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        length = bArr6.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr6.length;
                        bArr = new byte[length];
                    }
                    for (int i17 = 0; i17 < length; i17++) {
                        bArr[i17] = (byte) (bArr6[i17] ^ (-4629411779493505016L));
                    }
                    bArr6 = bArr;
                }
                boolean z2 = bArr6 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i18 = $10 + 39;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z2) {
                        byte[] bArr7 = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
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
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}

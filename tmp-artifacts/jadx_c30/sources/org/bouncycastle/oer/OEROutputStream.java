package org.bouncycastle.oer;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Iterator;
import net.sf.scuba.smartcards.BuildConfig;
import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class OEROutputStream {
    private static final int[] bits = {1, 2, 4, 8, 16, 32, 64, 128};
    protected PrintWriter debugOutput = null;
    private final OutputStream out;

    /* renamed from: org.bouncycastle.oer.OEROutputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType;

        static {
            int[] iArr = new int[OERDefinition.BaseType.values().length];
            $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType = iArr;
            try {
                iArr[OERDefinition.BaseType.SEQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.SEQ_OF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.CHOICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.OCTET_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.UTF8_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.BIT_STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.EXTENSION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.ENUM_ITEM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.BOOLEAN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    OEROutputStream(OutputStream outputStream) {
        this.out = outputStream;
    }

    public static int byteLength(long j) {
        int i = 8;
        while (i > 0 && ((-72057594037927936L) & j) == 0) {
            j <<= 8;
            i--;
        }
        return i;
    }

    public static OEROutputStream create(OutputStream outputStream) {
        return new OEROutputStream(outputStream);
    }

    private void encodeLength(long j) throws IOException {
        if (j <= 127) {
            this.out.write((int) j);
            return;
        }
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(BigInteger.valueOf(j));
        this.out.write(bArrAsUnsignedByteArray.length | 128);
        this.out.write(bArrAsUnsignedByteArray);
    }

    private void encodeQuantity(long j) throws IOException {
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(BigInteger.valueOf(j));
        this.out.write(bArrAsUnsignedByteArray.length);
        this.out.write(bArrAsUnsignedByteArray);
    }

    protected void debugPrint(String str) {
        if (this.debugOutput == null) {
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = -1;
        for (int i2 = 0; i2 != stackTrace.length; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            if (stackTraceElement.getMethodName().equals("debugPrint")) {
                i = 0;
            } else if (stackTraceElement.getClassName().contains("OERInput")) {
                i++;
            }
        }
        while (true) {
            PrintWriter printWriter = this.debugOutput;
            if (i <= 0) {
                printWriter.append((CharSequence) str).append((CharSequence) "\n");
                this.debugOutput.flush();
                return;
            } else {
                printWriter.append((CharSequence) "    ");
                i--;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(ASN1Encodable aSN1Encodable, OERDefinition.Element element) throws IOException {
        int i;
        int i2;
        Enumeration objects;
        int size;
        int tagNo;
        ASN1Primitive aSN1Primitive;
        String str;
        byte[] bArrLongToBigEndian;
        if (aSN1Encodable != OEROptional.ABSENT) {
            if (aSN1Encodable instanceof OEROptional) {
                write(((OEROptional) aSN1Encodable).get(), element);
                return;
            }
            ASN1Set aSN1Primitive2 = aSN1Encodable.toASN1Primitive();
            int i3 = 6;
            switch (AnonymousClass1.$SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[element.baseType.ordinal()]) {
                case 1:
                    ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1Primitive2);
                    if (element.extensionsInDefinition) {
                        int i4 = element.hasPopulatedExtension() ? bits[7] : 0;
                        for (i = 0; i < element.children.size(); i++) {
                            OERDefinition.Element element2 = element.children.get(i);
                            if (i3 < 0) {
                                this.out.write(i4);
                                i3 = 7;
                                i4 = 0;
                            }
                            OEROptional objectAt = aSN1Sequence.getObjectAt(i);
                            boolean z = element2.explicit;
                            if (z && (objectAt instanceof OEROptional)) {
                                throw new IllegalStateException("absent sequence element that is required by oer definition");
                            }
                            if (!z) {
                                OEROptional objectAt2 = aSN1Sequence.getObjectAt(i);
                                if (element2.getDefaultValue() == null) {
                                    if (objectAt != OEROptional.ABSENT) {
                                        i2 = bits[i3];
                                        i4 |= i2;
                                    }
                                    i3--;
                                } else if (objectAt2 instanceof OEROptional) {
                                    OEROptional oEROptional = objectAt2;
                                    if (oEROptional.isDefined() && !oEROptional.get().equals(element2.defaultValue)) {
                                        i2 = bits[i3];
                                        i4 |= i2;
                                    }
                                    i3--;
                                } else {
                                    if (!element2.getDefaultValue().equals(objectAt2)) {
                                        i2 = bits[i3];
                                        i4 |= i2;
                                    }
                                    i3--;
                                }
                            }
                        }
                        if (i3 != 7) {
                            this.out.write(i4);
                        }
                        for (int i5 = 0; i5 < element.children.size(); i5++) {
                            ASN1Encodable objectAt3 = aSN1Sequence.getObjectAt(i5);
                            OERDefinition.Element element3 = element.children.get(i5);
                            if (element3.getDefaultValue() == null || !element3.getDefaultValue().equals(objectAt3)) {
                                write(objectAt3, element3);
                            }
                        }
                        this.out.flush();
                        debugPrint(element.appendLabel(BuildConfig.FLAVOR));
                        return;
                    }
                    i3 = 7;
                    while (i < element.children.size()) {
                    }
                    if (i3 != 7) {
                    }
                    while (i5 < element.children.size()) {
                    }
                    this.out.flush();
                    debugPrint(element.appendLabel(BuildConfig.FLAVOR));
                    return;
                case 2:
                    if (aSN1Primitive2 instanceof ASN1Set) {
                        ASN1Set aSN1Set = aSN1Primitive2;
                        objects = aSN1Set.getObjects();
                        size = aSN1Set.size();
                    } else {
                        if (!(aSN1Primitive2 instanceof ASN1Sequence)) {
                            throw new IllegalStateException("encodable at for SEQ_OF is not a container");
                        }
                        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Primitive2;
                        objects = aSN1Sequence2.getObjects();
                        size = aSN1Sequence2.size();
                    }
                    encodeQuantity(size);
                    while (objects.hasMoreElements()) {
                        write((ASN1Encodable) objects.nextElement(), element.getFirstChid());
                    }
                    this.out.flush();
                    debugPrint(element.appendLabel(BuildConfig.FLAVOR));
                    return;
                case 3:
                    ASN1ApplicationSpecific aSN1Primitive3 = aSN1Primitive2.toASN1Primitive();
                    BitBuilder bitBuilder = new BitBuilder();
                    if (aSN1Primitive3 instanceof ASN1ApplicationSpecific) {
                        ASN1ApplicationSpecific aSN1ApplicationSpecific = aSN1Primitive3;
                        tagNo = aSN1ApplicationSpecific.getApplicationTag();
                        bitBuilder.writeBit(0).writeBit(1);
                        aSN1Primitive = aSN1ApplicationSpecific.getEnclosedObject();
                    } else {
                        if (!(aSN1Primitive3 instanceof ASN1TaggedObject)) {
                            throw new IllegalStateException("only support tagged objects");
                        }
                        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive3;
                        int tagClass = aSN1TaggedObject.getTagClass();
                        bitBuilder.writeBit(tagClass & 128).writeBit(tagClass & 64);
                        tagNo = aSN1TaggedObject.getTagNo();
                        aSN1Primitive = aSN1TaggedObject.getBaseObject().toASN1Primitive();
                    }
                    if (tagNo <= 63) {
                        bitBuilder.writeBits(tagNo, 6);
                    } else {
                        bitBuilder.writeBits(255L, 6);
                        bitBuilder.write7BitBytes(tagNo);
                    }
                    if (this.debugOutput != null) {
                        if (!(aSN1Primitive instanceof ASN1ApplicationSpecific)) {
                            str = aSN1Primitive instanceof ASN1TaggedObject ? "CS" : "AS";
                        }
                        debugPrint(element.appendLabel(str));
                    }
                    bitBuilder.writeAndClear(this.out);
                    write(aSN1Primitive, element.children.get(tagNo));
                    this.out.flush();
                    return;
                case 4:
                    BigInteger value = aSN1Primitive2 instanceof ASN1Integer ? ASN1Integer.getInstance(aSN1Primitive2).getValue() : ASN1Enumerated.getInstance(aSN1Primitive2).getValue();
                    Iterator<OERDefinition.Element> it = element.children.iterator();
                    while (it.hasNext()) {
                        if (it.next().enumValue.equals(value)) {
                            if (value.compareTo(BigInteger.valueOf(127L)) > 0) {
                                byte[] byteArray = value.toByteArray();
                                this.out.write((byteArray.length & GF2Field.MASK) | 128);
                                this.out.write(byteArray);
                            } else {
                                this.out.write(value.intValue() & CertificateBody.profileType);
                            }
                            this.out.flush();
                            debugPrint(element.appendLabel(element.rangeExpression()));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("enum value " + value + " " + Hex.toHexString(value.toByteArray()) + " no in defined child list");
                case 5:
                    ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1Primitive2);
                    int iIntBytesForRange = element.intBytesForRange();
                    if (iIntBytesForRange > 0) {
                        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(iIntBytesForRange, aSN1Integer.getValue());
                        if (iIntBytesForRange != 1 && iIntBytesForRange != 2 && iIntBytesForRange != 4 && iIntBytesForRange != 8) {
                            throw new IllegalStateException("unknown uint length " + iIntBytesForRange);
                        }
                        this.out.write(bArrAsUnsignedByteArray);
                    } else if (iIntBytesForRange < 0) {
                        BigInteger value2 = aSN1Integer.getValue();
                        if (iIntBytesForRange == -8) {
                            bArrLongToBigEndian = Pack.longToBigEndian(BigIntegers.longValueExact(value2));
                        } else if (iIntBytesForRange == -4) {
                            bArrLongToBigEndian = Pack.intToBigEndian(BigIntegers.intValueExact(value2));
                        } else if (iIntBytesForRange == -2) {
                            bArrLongToBigEndian = Pack.shortToBigEndian(BigIntegers.shortValueExact(value2));
                        } else {
                            if (iIntBytesForRange != -1) {
                                throw new IllegalStateException("unknown twos compliment length");
                            }
                            bArrLongToBigEndian = new byte[]{BigIntegers.byteValueExact(value2)};
                        }
                        this.out.write(bArrLongToBigEndian);
                    } else {
                        boolean zIsLowerRangeZero = element.isLowerRangeZero();
                        BigInteger value3 = aSN1Integer.getValue();
                        byte[] bArrAsUnsignedByteArray2 = zIsLowerRangeZero ? BigIntegers.asUnsignedByteArray(value3) : value3.toByteArray();
                        encodeLength(bArrAsUnsignedByteArray2.length);
                        this.out.write(bArrAsUnsignedByteArray2);
                    }
                    debugPrint(element.appendLabel(element.rangeExpression()));
                    this.out.flush();
                    return;
                case 6:
                    byte[] octets = ASN1OctetString.getInstance(aSN1Primitive2).getOctets();
                    if (!element.isFixedLength()) {
                        encodeLength(octets.length);
                    }
                    this.out.write(octets);
                    debugPrint(element.appendLabel(element.rangeExpression()));
                    this.out.flush();
                    return;
                case 7:
                    byte[] uTF8ByteArray = Strings.toUTF8ByteArray(ASN1UTF8String.getInstance(aSN1Primitive2).getString());
                    encodeLength(uTF8ByteArray.length);
                    this.out.write(uTF8ByteArray);
                    debugPrint(element.appendLabel(BuildConfig.FLAVOR));
                    this.out.flush();
                    return;
                case 8:
                    DERBitString dERBitString = DERBitString.getInstance(aSN1Primitive2);
                    byte[] bytes = dERBitString.getBytes();
                    if (!element.isFixedLength()) {
                        int padBits = dERBitString.getPadBits();
                        encodeLength(bytes.length + 1);
                        this.out.write(padBits);
                    }
                    this.out.write(bytes);
                    debugPrint(element.appendLabel(element.rangeExpression()));
                    this.out.flush();
                    return;
                case 9:
                case 11:
                default:
                    return;
                case 10:
                    byte[] octets2 = ASN1OctetString.getInstance(aSN1Primitive2).getOctets();
                    if (!element.isFixedLength()) {
                        encodeLength(octets2.length);
                    }
                    this.out.write(octets2);
                    debugPrint(element.appendLabel(element.rangeExpression()));
                    this.out.flush();
                    return;
                case 12:
                    debugPrint(element.label);
                    if (ASN1Boolean.getInstance(aSN1Primitive2).isTrue()) {
                        this.out.write(GF2Field.MASK);
                    } else {
                        this.out.write(0);
                    }
                    this.out.flush();
                    return;
            }
        }
    }
}

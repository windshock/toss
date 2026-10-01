package org.bouncycastle.oer;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Iterator;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.util.io.Streams;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class OERInputStream extends FilterInputStream {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final int[] bits;
    private static char[] onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static boolean onWarmupCompleted;
    protected PrintWriter debugOutput;
    private int maxByteAllocation;

    /* renamed from: org.bouncycastle.oer.OERInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType;

        static {
            int[] iArr = new int[OERDefinition.BaseType.values().length];
            $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType = iArr;
            try {
                iArr[OERDefinition.BaseType.SEQ_OF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.SEQ.ordinal()] = 2;
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
        }
    }

    public static class Choice extends OERInputStream {
        final int preamble;
        final int tag;
        final int tagClass;

        public Choice(InputStream inputStream) throws Exception {
            int i;
            super(inputStream);
            int i2 = read();
            this.preamble = i2;
            if (i2 < 0) {
                throw new EOFException("expecting preamble byte of choice");
            }
            this.tagClass = i2 & CertificateHolderAuthorization.CVCA;
            int i3 = i2 & 63;
            if (i3 >= 63) {
                i3 = 0;
                do {
                    i = inputStream.read();
                    if (i < 0) {
                        throw new EOFException("expecting further tag bytes");
                    }
                    i3 = (i3 << 7) | (i & CertificateBody.profileType);
                } while ((i & 128) != 0);
            }
            this.tag = i3;
        }

        public int getTag() {
            return this.tag;
        }

        public int getTagClass() {
            return this.tagClass;
        }

        public boolean isApplicationTagClass() {
            return this.tagClass == 64;
        }

        public boolean isContextSpecific() {
            return this.tagClass == 128;
        }

        public boolean isPrivateTagClass() {
            return this.tagClass == 192;
        }

        public boolean isUniversalTagClass() {
            return this.tagClass == 0;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("CHOICE(");
            int i = this.tagClass;
            if (i == 0) {
                str = "Universal ";
            } else if (i == 64) {
                str = "Application ";
            } else {
                if (i != 128) {
                    if (i == 192) {
                        str = "Private ";
                    }
                    sb.append("Tag = " + this.tag);
                    sb.append(")");
                    return sb.toString();
                }
                str = "ContextSpecific ";
            }
            sb.append(str);
            sb.append("Tag = " + this.tag);
            sb.append(")");
            return sb.toString();
        }
    }

    final class LengthInfo {
        private final BigInteger length;
        private final boolean shortForm;

        public LengthInfo(BigInteger bigInteger, boolean z) {
            this.length = bigInteger;
            this.shortForm = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int intLength() {
            return this.length.intValue();
        }
    }

    static {
        onExtraCallbackWithResult();
        bits = new int[]{1, 2, 4, 8, 16, 32, 64, 128};
        int i = IAuthTabCallback + 53;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public OERInputStream(InputStream inputStream) {
        super(inputStream);
        this.maxByteAllocation = PKIFailureInfo.badCertTemplate;
        this.debugOutput = null;
    }

    public OERInputStream(InputStream inputStream, int i) {
        super(inputStream);
        this.debugOutput = null;
        this.maxByteAllocation = i;
    }

    private ASN1Encodable absent(OERDefinition.Element element) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        debugPrint(element.appendLabel("Absent"));
        if (i3 == 0) {
            return OEROptional.ABSENT;
        }
        OEROptional oEROptional = OEROptional.ABSENT;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ int[] access$100() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int[] iArr = bits;
        int i5 = i3 + 9;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return iArr;
    }

    private byte[] allocateArray(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 45;
        int i4 = i3 % 128;
        asBinder = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (i <= this.maxByteAllocation) {
            byte[] bArr = new byte[i];
            int i5 = i4 + 107;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return bArr;
        }
        throw new IllegalArgumentException("required byte array size " + i + " was greater than " + this.maxByteAllocation);
    }

    private int countOptionalChildTypes(OERDefinition.Element element) {
        int i = 2 % 2;
        Iterator<OERDefinition.Element> it = element.children.iterator();
        int i2 = asInterface + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (!(!it.hasNext())) {
            int i5 = asBinder + 93;
            asInterface = i5 % 128;
            i4 = i5 % 2 == 0 ? i4 / (!it.next().explicit ? 1 : 0) : i4 + (!it.next().explicit ? 1 : 0);
            int i6 = asInterface + 31;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
        return i4;
    }

    public Choice choice() throws Exception {
        int i = 2 % 2;
        Choice choice = new Choice(this);
        int i2 = asInterface + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return choice;
    }

    protected void debugPrint(String str) {
        int i = 2 % 2;
        if (this.debugOutput == null) {
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i2 = -1;
        for (int i3 = 0; i3 != stackTrace.length; i3++) {
            int i4 = asInterface + 27;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                stackTrace[i3].getMethodName().equals("debugPrint");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            if (stackTraceElement.getMethodName().equals("debugPrint")) {
                int i5 = asBinder + 91;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                i2 = 0;
            } else if (stackTraceElement.getClassName().contains("OERInput")) {
                int i7 = asInterface + 67;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                i2++;
            }
        }
        while (true) {
            PrintWriter printWriter = this.debugOutput;
            if (i2 <= 0) {
                printWriter.append((CharSequence) str).append((CharSequence) "\n");
                this.debugOutput.flush();
                return;
            } else {
                printWriter.append((CharSequence) "    ");
                i2--;
                int i9 = asInterface + 97;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
            }
        }
    }

    public BigInteger enumeration() throws Exception {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = read();
        if (i4 == -1) {
            throw new EOFException("expecting prefix of enumeration");
        }
        int i5 = asBinder + 51;
        int i6 = i5 % 128;
        asInterface = i6;
        if (i5 % 2 != 0 ? (i4 & 128) != 128 : (i4 & 25062) != 9322) {
            return BigInteger.valueOf(i4);
        }
        int i7 = i4 & CertificateBody.profileType;
        if (i7 != 0) {
            byte[] bArr = new byte[i7];
            if (Streams.readFully(this, bArr) == i7) {
                return new BigInteger(1, bArr);
            }
            throw new EOFException("unable to fully read integer component of enumeration");
        }
        int i8 = i6 + 89;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        BigInteger bigInteger = BigInteger.ZERO;
        if (i9 == 0) {
            return bigInteger;
        }
        throw null;
    }

    public BigInteger int16() throws Exception {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BigInteger bigInteger = parseInt(false, 2);
        int i4 = asInterface + 33;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return bigInteger;
    }

    public BigInteger int32() throws Exception {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        asBinder = i2 % 128;
        BigInteger bigInteger = parseInt(false, i2 % 2 != 0 ? 5 : 4);
        int i3 = asInterface + 95;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return bigInteger;
    }

    public BigInteger int64() throws Exception {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BigInteger bigInteger = parseInt(false, 8);
        int i4 = asBinder + 99;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return bigInteger;
    }

    public BigInteger int8() throws Exception {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BigInteger bigInteger = parseInt(false, 1);
        int i4 = asBinder + 33;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0337, code lost:
    
        if ((!r0) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x033a, code lost:
    
        if (r0 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x033c, code lost:
    
        r1.getTag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x037a, code lost:
    
        throw new java.lang.IllegalStateException("Unimplemented tag type");
     */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a3 A[PHI: r1
      0x02a3: PHI (r1v17 byte[]) = (r1v16 byte[]), (r1v21 byte[]) binds: [B:96:0x02a1, B:91:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ASN1Object parse(OERDefinition.Element element) throws Exception {
        ASN1Encodable aSN1EncodableAbsent;
        byte[] bArrAllocateArray;
        BigInteger bigInteger;
        int iBigEndianToShort;
        long jBigEndianToLong;
        byte[] bArrAllocateArray2;
        Object obj;
        int i = 2 % 2;
        Object obj2 = null;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[element.baseType.ordinal()]) {
            case 1:
                byte[] bArrAllocateArray3 = allocateArray(readLength().intLength());
                if (Streams.readFully(this, bArrAllocateArray3) != bArrAllocateArray3.length) {
                    throw new IOException("could not read all of count of seq-of values");
                }
                int iIntValue = BigIntegers.fromUnsignedByteArray(bArrAllocateArray3).intValue();
                debugPrint(element.appendLabel("(len = " + iIntValue + ")"));
                ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                for (int i2 = 0; i2 < iIntValue; i2++) {
                    aSN1EncodableVector.add(parse(element.children.get(0)));
                }
                return new DERSequence(aSN1EncodableVector);
            case 2:
                Sequence sequence = sequence(countOptionalChildTypes(element), element.hasDefaultChildren(), element.extensionsInDefinition);
                debugPrint(element.appendLabel(sequence.toString()));
                ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                for (int i3 = 0; i3 < element.children.size(); i3++) {
                    OERDefinition.Element element2 = element.children.get(i3);
                    if (element2.explicit) {
                        int i4 = asInterface + 85;
                        asBinder = i4 % 128;
                        if (i4 % 2 != 0) {
                            parse(element2);
                            obj2.hashCode();
                            throw null;
                        }
                        aSN1EncodableAbsent = parse(element2);
                    } else if (sequence.hasOptional(element.optionalOrDefaultChildrenInOrder().indexOf(element2))) {
                        int i5 = asBinder + 95;
                        asInterface = i5 % 128;
                        int i6 = i5 % 2;
                        aSN1EncodableAbsent = OEROptional.getInstance(parse(element2));
                    } else if (element2.getDefaultValue() != null) {
                        aSN1EncodableVector2.add(element2.defaultValue);
                        debugPrint("Using default.");
                    } else {
                        aSN1EncodableAbsent = absent(element2);
                    }
                    aSN1EncodableVector2.add(aSN1EncodableAbsent);
                }
                return new DERSequence(aSN1EncodableVector2);
            case 3:
                Choice choice = choice();
                debugPrint(element.appendLabel(choice.toString()));
                if (choice.isContextSpecific()) {
                    element.children.get(choice.getTag());
                    return new DERTaggedObject(choice.tag, parse(element.children.get(choice.getTag())));
                }
                if (choice.isApplicationTagClass()) {
                    throw new IllegalStateException("Unimplemented tag type");
                }
                if (choice.isPrivateTagClass()) {
                    throw new IllegalStateException("Unimplemented tag type");
                }
                int i7 = asBinder + 119;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                boolean zIsUniversalTagClass = choice.isUniversalTagClass();
                if (i8 == 0) {
                    int i9 = 69 / 0;
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                int iIntBytesForRange = element.intBytesForRange();
                if (iIntBytesForRange != 0) {
                    bArrAllocateArray = allocateArray(Math.abs(iIntBytesForRange));
                    Streams.readFully(this, bArrAllocateArray);
                    int length = bArrAllocateArray.length;
                    if (length != 1) {
                        int i10 = asInterface + 111;
                        int i11 = i10 % 128;
                        asBinder = i11;
                        int i12 = i10 % 2;
                        if (length != 2) {
                            int i13 = i11 + 125;
                            asInterface = i13 % 128;
                            if (i13 % 2 != 0 ? length == 4 : length == 4) {
                                iBigEndianToShort = Pack.bigEndianToInt(bArrAllocateArray, 0);
                            } else {
                                if (length != 8) {
                                    throw new IllegalStateException("Unknown size");
                                }
                                int i14 = i11 + 121;
                                asInterface = i14 % 128;
                                jBigEndianToLong = i14 % 2 == 0 ? Pack.bigEndianToLong(bArrAllocateArray, 1) : Pack.bigEndianToLong(bArrAllocateArray, 0);
                                bigInteger = BigInteger.valueOf(jBigEndianToLong);
                            }
                        } else {
                            iBigEndianToShort = Pack.bigEndianToShort(bArrAllocateArray, 0);
                        }
                    } else {
                        iBigEndianToShort = bArrAllocateArray[0];
                    }
                    jBigEndianToLong = iBigEndianToShort;
                    bigInteger = BigInteger.valueOf(jBigEndianToLong);
                } else if (element.isLowerRangeZero()) {
                    int i15 = asBinder + 87;
                    asInterface = i15 % 128;
                    if (i15 % 2 == 0) {
                        byte[] bArrAllocateArray4 = allocateArray(readLength().intLength());
                        Streams.readFully(this, bArrAllocateArray4);
                        int length2 = bArrAllocateArray4.length;
                        obj2.hashCode();
                        throw null;
                    }
                    bArrAllocateArray = allocateArray(readLength().intLength());
                    Streams.readFully(this, bArrAllocateArray);
                    bigInteger = bArrAllocateArray.length != 0 ? BigIntegers.fromUnsignedByteArray(bArrAllocateArray) : BigInteger.ZERO;
                } else {
                    bArrAllocateArray = allocateArray(readLength().intLength());
                    Streams.readFully(this, bArrAllocateArray);
                    if (bArrAllocateArray.length != 0) {
                        bigInteger = new BigInteger(bArrAllocateArray);
                    }
                }
                if (this.debugOutput != null) {
                    debugPrint(element.appendLabel("INTEGER(" + bArrAllocateArray.length + " " + bigInteger.toString(16) + ")"));
                }
                return new ASN1Integer(bigInteger);
            case 6:
                BigInteger bigInteger2 = element.upperBound;
                int iIntLength = (bigInteger2 == null || !bigInteger2.equals(element.lowerBound)) ? readLength().intLength() : element.upperBound.intValue();
                byte[] bArrAllocateArray5 = allocateArray(iIntLength);
                if (Streams.readFully(this, bArrAllocateArray5) != iIntLength) {
                    throw new IOException("did not read all of " + element.label);
                }
                if (this.debugOutput != null) {
                    debugPrint(element.appendLabel("OCTET STRING (" + bArrAllocateArray5.length + ") = " + Hex.toHexString(bArrAllocateArray5, 0, Math.min(bArrAllocateArray5.length, 32))));
                }
                return new DEROctetString(bArrAllocateArray5);
            case 7:
                byte[] bArrAllocateArray6 = allocateArray(readLength().intLength());
                if (Streams.readFully(this, bArrAllocateArray6) != bArrAllocateArray6.length) {
                    throw new IOException("could not read all of utf 8 string");
                }
                String strFromUTF8ByteArray = Strings.fromUTF8ByteArray(bArrAllocateArray6);
                if (this.debugOutput != null) {
                    debugPrint(element.appendLabel("UTF8 String (" + bArrAllocateArray6.length + ") = " + strFromUTF8ByteArray));
                }
                return new DERUTF8String(strFromUTF8ByteArray);
            case 8:
                if (element.isFixedLength()) {
                    int i16 = asBinder + 67;
                    asInterface = i16 % 128;
                    int i17 = i16 % 2;
                    bArrAllocateArray2 = new byte[element.lowerBound.intValue() / 8];
                } else {
                    bArrAllocateArray2 = allocateArray((BigInteger.ZERO.compareTo(element.upperBound) > 0 ? element.upperBound.intValue() : readLength().intLength()) / 8);
                }
                Streams.readFully(this, bArrAllocateArray2);
                if (this.debugOutput != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("BIT STRING(" + (bArrAllocateArray2.length << 3) + ") = ");
                    for (int i18 = 0; i18 != bArrAllocateArray2.length; i18++) {
                        byte b = bArrAllocateArray2[i18];
                        for (int i19 = 0; i19 < 8; i19++) {
                            if ((b & ISOFileInfo.DATA_BYTES1) > 0) {
                                Object[] objArr = new Object[1];
                                a(null, null, new byte[]{ISOFileInfo.DATA_BYTES2}, (ViewConfiguration.getTouchSlop() >> 8) + CertificateBody.profileType, objArr);
                                obj = objArr[0];
                            } else {
                                Object[] objArr2 = new Object[1];
                                a(null, null, new byte[]{-126}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, objArr2);
                                obj = objArr2[0];
                            }
                            stringBuffer.append(((String) obj).intern());
                            b = (byte) (b << 1);
                        }
                    }
                    debugPrint(element.appendLabel(stringBuffer.toString()));
                }
                return new DERBitString(bArrAllocateArray2);
            case 9:
                debugPrint(element.appendLabel("NULL"));
                return DERNull.INSTANCE;
            case 10:
                LengthInfo length3 = readLength();
                byte[] bArr = new byte[length3.intLength()];
                if (Streams.readFully(this, bArr) != length3.intLength()) {
                    throw new IOException("could not read all of count of open value in choice (...) ");
                }
                debugPrint("ext " + length3.intLength() + " " + Hex.toHexString(bArr));
                return new DEROctetString(bArr);
            default:
                throw new IllegalStateException("Unhandled type " + element.baseType);
        }
        BigInteger bigIntegerEnumeration = enumeration();
        debugPrint(element.appendLabel("ENUM(" + bigIntegerEnumeration + ") = " + element.children.get(bigIntegerEnumeration.intValue()).label));
        return new ASN1Enumerated(bigIntegerEnumeration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r5 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r5 = new java.math.BigInteger(1, r1);
        r1 = org.bouncycastle.oer.OERInputStream.asInterface + 103;
        org.bouncycastle.oer.OERInputStream.asBinder = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r5 = new java.math.BigInteger(r1);
        r1 = org.bouncycastle.oer.OERInputStream.asBinder + 11;
        org.bouncycastle.oer.OERInputStream.asInterface = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if ((r1 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        throw new java.lang.IllegalStateException("integer not fully read");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (org.bouncycastle.util.io.Streams.readFully(r4, r1) == r6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (org.bouncycastle.util.io.Streams.readFully(r4, r1) == r6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BigInteger parseInt(boolean z, int i) throws Exception {
        byte[] bArr;
        int i2 = 2 % 2;
        int i3 = asBinder + 69;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            bArr = new byte[i];
            int i4 = 3 / 0;
        } else {
            bArr = new byte[i];
        }
    }

    public LengthInfo readLength() throws Exception {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            read();
            throw null;
        }
        int i3 = read();
        if (i3 == -1) {
            throw new EOFException("expecting length");
        }
        int i4 = asInterface + 47;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if ((i3 & 128) == 0) {
            return new LengthInfo(BigInteger.valueOf(i3 & CertificateBody.profileType), true);
        }
        int i6 = i3 & CertificateBody.profileType;
        byte[] bArr = new byte[i6];
        if (Streams.readFully(this, bArr) != i6) {
            throw new EOFException("did not read all bytes of length definition");
        }
        Hex.toHexString(bArr);
        return new LengthInfo(BigIntegers.fromUnsignedByteArray(bArr), false);
    }

    public Sequence sequence(int i, boolean z, boolean z2) throws Exception {
        int i2 = 2 % 2;
        Sequence sequence = new Sequence(this, i, z, z2);
        int i3 = asInterface + 3;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return sequence;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BigInteger uint16() throws Exception {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BigInteger bigInteger = parseInt(true, 2);
        int i4 = asBinder + 99;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return bigInteger;
    }

    public BigInteger uint32() throws Exception {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return parseInt(true, 4);
    }

    public BigInteger uint64() throws Exception {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        BigInteger bigInteger = parseInt(false, 8);
        int i4 = asInterface + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return bigInteger;
    }

    public BigInteger uint8() throws Exception {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        asInterface = i2 % 128;
        BigInteger bigInteger = i2 % 2 == 0 ? parseInt(false, 1) : parseInt(true, 1);
        int i3 = asInterface + 1;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return bigInteger;
    }

    public static class Sequence extends OERInputStream {
        private final boolean extensionFlagSet;
        private final boolean[] optionalPresent;
        final int preamble;
        private static final byte[] $$a = {119, -58, 7, 71};
        private static final int $$b = 154;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted = 478309054;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, short s, int i) {
            int i2;
            int i3 = (s * 2) + 105;
            byte[] bArr = $$a;
            int i4 = 3 - (b * 2);
            int i5 = i * 4;
            byte[] bArr2 = new byte[1 - i5];
            int i6 = 0 - i5;
            if (bArr == null) {
                int i7 = i4;
                int i8 = i6;
                int i9 = 0;
                int i10 = i4 + (-i8);
                i2 = i9;
                int i11 = i7;
                i3 = i10;
                i4 = i11;
                bArr2[i2] = (byte) i3;
                i9 = i2 + 1;
                if (i2 == i6) {
                    return new String(bArr2, 0);
                }
                int i12 = i4 + 1;
                i8 = bArr[i12];
                int i13 = i3;
                i7 = i12;
                i4 = i13;
                int i102 = i4 + (-i8);
                i2 = i9;
                int i112 = i7;
                i3 = i102;
                i4 = i112;
                bArr2[i2] = (byte) i3;
                i9 = i2 + 1;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                i9 = i2 + 1;
                if (i2 == i6) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Sequence(InputStream inputStream, int i, boolean z, boolean z2) throws IOException {
            boolean z3;
            boolean z4;
            super(inputStream);
            Object obj = null;
            if (i == 0 && !z2) {
                int i2 = onExtraCallback + 23;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (!z) {
                    this.preamble = 0;
                    this.optionalPresent = new boolean[0];
                    this.extensionFlagSet = false;
                    return;
                }
            }
            int i3 = inputStream.read();
            this.preamble = i3;
            if (i3 < 0) {
                throw new EOFException("expecting preamble byte of sequence");
            }
            if (z2) {
                int i4 = onExtraCallback;
                int i5 = i4 + 97;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                if ((i3 & 128) == 128) {
                    int i7 = i4 + 109;
                    onExtraCallbackWithResult = i7 % 128;
                    z3 = i7 % 2 == 0;
                    int i8 = 2 % 2;
                } else {
                    z3 = false;
                }
            }
            this.extensionFlagSet = z3;
            int i9 = z2 ? 6 : 7;
            this.optionalPresent = new boolean[i];
            for (int i10 = 0; i10 < this.optionalPresent.length; i10++) {
                int i11 = onExtraCallback;
                int i12 = i11 + 9;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                if (i9 < 0) {
                    int i14 = i11 + 61;
                    onExtraCallbackWithResult = i14 % 128;
                    if (i14 % 2 != 0) {
                        inputStream.read();
                        obj.hashCode();
                        throw null;
                    }
                    i3 = inputStream.read();
                    if (i3 < 0) {
                        throw new EOFException("expecting mask byte sequence");
                    }
                    int i15 = 2 % 2;
                    i9 = 7;
                }
                boolean[] zArr = this.optionalPresent;
                if ((OERInputStream.access$100()[i9] & i3) > 0) {
                    int i16 = onExtraCallbackWithResult + 93;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = 2 % 2;
                    z4 = true;
                } else {
                    int i19 = onExtraCallback + 47;
                    onExtraCallbackWithResult = i19 % 128;
                    if (i19 % 2 == 0) {
                        int i20 = 2 % 2;
                    }
                    z4 = false;
                }
                zArr[i10] = z4;
                i9--;
            }
        }

        public boolean hasExtension() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            boolean z = this.extensionFlagSet;
            int i5 = i3 + 23;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public boolean hasOptional(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 123;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            boolean z = this.optionalPresent[i];
            int i6 = i4 + 21;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 16 / 0;
            }
            return z;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() throws Throwable {
            String str;
            String strIntern;
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            sb.append("SEQ(");
            if (!hasExtension()) {
                str = BuildConfig.FLAVOR;
            } else {
                int i2 = onExtraCallbackWithResult + 65;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                str = "Ext ";
            }
            sb.append(str);
            int i3 = 0;
            while (true) {
                boolean[] zArr = this.optionalPresent;
                if (i3 >= zArr.length) {
                    sb.append(")");
                    return sb.toString();
                }
                int i4 = onExtraCallback + 117;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 61 / 0;
                    if (zArr[i3]) {
                        Object[] objArr = new Object[1];
                        b((ViewConfiguration.getEdgeSlop() >> 16) + 1, 1 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{0}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 200, true, objArr);
                        strIntern = ((String) objArr[0]).intern();
                        int i6 = onExtraCallback + 67;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        Object[] objArr2 = new Object[1];
                        b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{0}, 199 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), false, objArr2);
                        strIntern = ((String) objArr2[0]).intern();
                    }
                } else if (zArr[i3]) {
                }
                sb.append(strIntern);
                i3++;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0168  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
            int i4;
            Throwable cause;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i4 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                    break;
                }
                int i6 = $10 + 67;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 35125), 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - ((byte) KeyEvent.getModifierMetaStateMask())), 55 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2167 - ExpandableListView.getPackedPositionType(0L), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i > 0) {
                int i9 = $11 + 91;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (Process.myTid() >> 22)), 55 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 2168, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onExtraCallback;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 76 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        long j = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 74, 16037 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onWarmupCompleted) {
            int i4 = $11 + 47;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), Gravity.getAbsoluteGravity(0, 0) + 63, (ViewConfiguration.getScrollBarSize() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(j), 64 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 12214 - ExpandableListView.getPackedPositionGroup(j), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i5 = $11 + 79;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            j = 0;
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{32560, 32561};
        onNavigationEvent = -1184333855;
        onExtraCallbackWithResult = true;
        onWarmupCompleted = true;
    }
}

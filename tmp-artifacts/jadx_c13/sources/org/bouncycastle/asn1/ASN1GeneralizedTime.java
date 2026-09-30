package org.bouncycastle.asn1;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ASN1GeneralizedTime extends ASN1Primitive {
    private static int IAuthTabCallback;
    static final ASN1UniversalType TYPE;
    private static int onExtraCallback;
    private static char onNavigationEvent;
    private static long onWarmupCompleted;
    final byte[] contents;
    private static final byte[] $$a = {89, 120, -98, -110};
    private static final int $$b = 86;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i;
        int i2 = b3 + 4;
        byte[] bArr = $$a;
        int i3 = b2 * 4;
        int i4 = 110 - b;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            i4 = i5;
            int i6 = i2;
            int i7 = 0;
            i4 += -i2;
            i2 = i6;
            i = i7;
            bArr2[i] = (byte) i4;
            int i8 = i2 + 1;
            i7 = i + 1;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i6 = i8;
            i2 = bArr[i8];
            i4 += -i2;
            i2 = i6;
            i = i7;
            bArr2[i] = (byte) i4;
            int i82 = i2 + 1;
            i7 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            int i822 = i2 + 1;
            i7 = i + 1;
            if (i == i5) {
            }
        }
    }

    static {
        IAuthTabCallback = 0;
        onNavigationEvent();
        TYPE = new ASN1UniversalType(ASN1GeneralizedTime.class, 24) { // from class: org.bouncycastle.asn1.ASN1GeneralizedTime.1
            @Override // org.bouncycastle.asn1.ASN1UniversalType
            ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
                return ASN1GeneralizedTime.createPrimitive(dEROctetString.getOctets());
            }
        };
        int i = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public ASN1GeneralizedTime(String str) {
        this.contents = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: " + e.getMessage());
        }
    }

    public ASN1GeneralizedTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", DateUtil.EN_Locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1GeneralizedTime(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    ASN1GeneralizedTime(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.contents = bArr;
        if (isDigit(0)) {
            int i = asInterface + 21;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 != 0 ? isDigit(1) : isDigit(0)) {
                if (isDigit(2)) {
                    int i2 = asInterface + 115;
                    IAuthTabCallbackStub = i2 % 128;
                    if (i2 % 2 == 0) {
                        if (isDigit(5)) {
                            return;
                        }
                    } else if (isDigit(3)) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
    }

    private SimpleDateFormat calculateGMTDateFormat() {
        SimpleDateFormat simpleDateFormat;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            hasFractionalSeconds();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (hasFractionalSeconds()) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSSz");
            int i3 = IAuthTabCallbackStub + 105;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        } else if (hasSeconds()) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        } else {
            simpleDateFormat = hasMinutes() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        }
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    private String calculateGMTOffset(String str) throws Throwable {
        String str2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str2 = "-";
        } else {
            int i4 = IAuthTabCallbackStub + 21;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            str2 = "+";
        }
        int i6 = rawOffset / 3600000;
        int i7 = (rawOffset - (3600000 * i6)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (hasFractionalSeconds()) {
                    int i8 = IAuthTabCallbackStub + 65;
                    asInterface = i8 % 128;
                    int i9 = i8 % 2;
                    str = pruneFractionalSeconds(str);
                }
                if (timeZone.inDaylightTime(calculateGMTDateFormat().parse(str + "GMT" + str2 + convert(i6) + ":" + convert(i7)))) {
                    int i10 = asInterface + 115;
                    IAuthTabCallbackStub = i10 % 128;
                    int i11 = i10 % 2;
                    i6 += str2.equals("+") ? 1 : -1;
                    int i12 = asInterface + 33;
                    IAuthTabCallbackStub = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str2 + convert(i6) + ":" + convert(i7);
    }

    private String convert(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 95;
        asInterface = i3 % 128;
        if (i3 % 2 == 0 ? i >= 10 : i >= 62) {
            return Integer.toString(i);
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) (13680 - Drawable.resolveOpacity(0, 0)), (-4374414) - ImageFormat.getBitsPerPixel(0), new char[]{4155}, new char[]{55495, 46971, 13860, 43191}, new char[]{29646, 48448, 28927, 25909}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i);
        String string = sb.toString();
        int i4 = asInterface + 91;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static ASN1GeneralizedTime createPrimitive(byte[] bArr) {
        int i = 2 % 2;
        ASN1GeneralizedTime aSN1GeneralizedTime = new ASN1GeneralizedTime(bArr);
        int i2 = IAuthTabCallbackStub + 45;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return aSN1GeneralizedTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ASN1GeneralizedTime getInstance(Object obj) {
        int i = 2 % 2;
        if (obj == null || (obj instanceof ASN1GeneralizedTime)) {
            return (ASN1GeneralizedTime) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1GeneralizedTime) {
                ASN1GeneralizedTime aSN1GeneralizedTime = (ASN1GeneralizedTime) aSN1Primitive;
                int i2 = IAuthTabCallbackStub + 95;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    return aSN1GeneralizedTime;
                }
                throw null;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        int i3 = asInterface + 33;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        try {
            return (ASN1GeneralizedTime) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    public static ASN1GeneralizedTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ASN1GeneralizedTime aSN1GeneralizedTime = (ASN1GeneralizedTime) TYPE.getContextInstance(aSN1TaggedObject, z);
        int i4 = IAuthTabCallbackStub + 23;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return aSN1GeneralizedTime;
        }
        throw null;
    }

    private boolean isDigit(int i) {
        byte b;
        int i2 = 2 % 2;
        byte[] bArr = this.contents;
        if (bArr.length <= i) {
            return false;
        }
        int i3 = asInterface;
        int i4 = i3 + 23;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            b = bArr[i];
            if (b < 56) {
                return false;
            }
        } else {
            b = bArr[i];
            if (b < 48) {
                return false;
            }
        }
        if (b > 57) {
            return false;
        }
        int i5 = i3 + 15;
        IAuthTabCallbackStub = i5 % 128;
        return i5 % 2 != 0;
    }

    private String pruneFractionalSeconds(String str) throws Throwable {
        String string;
        StringBuilder sb;
        char cCharAt;
        int i = 2 % 2;
        String strSubstring = str.substring(14);
        int i2 = 1;
        while (i2 < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i2)) && cCharAt <= '9') {
            i2++;
            int i3 = asInterface + 59;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = i2 - 1;
        if (i5 > 3) {
            string = strSubstring.substring(0, 4) + strSubstring.substring(i2);
            sb = new StringBuilder();
        } else if (i5 == 1) {
            string = strSubstring.substring(0, i2) + "00" + strSubstring.substring(i2);
            sb = new StringBuilder();
        } else {
            if (i5 != 2) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strSubstring.substring(0, i2));
            Object[] objArr = new Object[1];
            a((char) (13680 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET)), (-4374412) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{4155}, new char[]{55495, 46971, 13860, 43191}, new char[]{29646, 48448, 28927, 25909}, objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(strSubstring.substring(i2));
            string = sb2.toString();
            sb = new StringBuilder();
        }
        sb.append(str.substring(0, 14));
        sb.append(string);
        String string2 = sb.toString();
        int i6 = IAuthTabCallbackStub + 13;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return string2;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        int i = 2 % 2;
        if (!(!(aSN1Primitive instanceof ASN1GeneralizedTime))) {
            return Arrays.areEqual(this.contents, ((ASN1GeneralizedTime) aSN1Primitive).contents);
        }
        int i2 = asInterface + 17;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 93;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        aSN1OutputStream.writeEncodingDL(z, 24, this.contents);
        int i4 = IAuthTabCallbackStub + 73;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean encodeConstructed() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 65;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = this.contents;
        if (i3 == 0) {
            return ASN1OutputStream.getLengthOfEncodingDL(z, bArr.length);
        }
        ASN1OutputStream.getLengthOfEncodingDL(z, bArr.length);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Date getDate() throws ParseException {
        SimpleDateFormat simpleDateFormatCalculateGMTDateFormat;
        SimpleDateFormat simpleDateFormat;
        int i = 2 % 2;
        String strFromByteArray = Strings.fromByteArray(this.contents);
        if (strFromByteArray.endsWith("Z")) {
            int i2 = asInterface + 19;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                hasFractionalSeconds();
                throw null;
            }
            simpleDateFormatCalculateGMTDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : hasSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'") : hasMinutes() ? new SimpleDateFormat("yyyyMMddHHmm'Z'") : new SimpleDateFormat("yyyyMMddHH'Z'");
            simpleDateFormatCalculateGMTDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (strFromByteArray.indexOf(45) > 0 || strFromByteArray.indexOf(43) > 0) {
            strFromByteArray = getTime();
            simpleDateFormatCalculateGMTDateFormat = calculateGMTDateFormat();
            int i3 = asInterface + 67;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        } else {
            if (hasFractionalSeconds()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            } else if (hasSeconds()) {
                Object[] objArr = new Object[1];
                a((char) (38777 - (ViewConfiguration.getTouchSlop() >> 8)), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 1, new char[]{48787, 28188, 65391, 1116, 13447, 55451, 32236, 14220, 12915, 9853, 39145, 14901, 62425, 20708}, new char[]{55495, 46971, 13860, 43191}, new char[]{42832, 15725, 31031, 11927}, objArr);
                simpleDateFormat = new SimpleDateFormat(((String) objArr[0]).intern());
            } else {
                simpleDateFormat = hasMinutes() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            }
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
            int i5 = IAuthTabCallbackStub + 103;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 4;
            }
            simpleDateFormatCalculateGMTDateFormat = simpleDateFormat;
        }
        if (hasFractionalSeconds()) {
            int i7 = asInterface + 73;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            strFromByteArray = pruneFractionalSeconds(strFromByteArray);
            if (i8 == 0) {
                int i9 = 8 / 0;
            }
        }
        return DateUtil.epochAdjust(simpleDateFormatCalculateGMTDateFormat.parse(strFromByteArray));
    }

    public String getTime() {
        StringBuilder sb;
        String strSubstring;
        int i = 2 % 2;
        String strFromByteArray = Strings.fromByteArray(this.contents);
        if (strFromByteArray.charAt(strFromByteArray.length() - 1) == 'Z') {
            String str = strFromByteArray.substring(0, strFromByteArray.length() - 1) + "GMT+00:00";
            int i2 = asInterface + 65;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
        int length = strFromByteArray.length();
        char cCharAt = strFromByteArray.charAt(length - 6);
        if ((cCharAt == '-' || cCharAt == '+') && strFromByteArray.indexOf("GMT") == length - 9) {
            int i3 = asInterface + 33;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                return strFromByteArray;
            }
            throw null;
        }
        int length2 = strFromByteArray.length();
        int i4 = length2 - 5;
        char cCharAt2 = strFromByteArray.charAt(i4);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            sb = new StringBuilder();
            sb.append(strFromByteArray.substring(0, i4));
            sb.append("GMT");
            int i5 = length2 - 2;
            sb.append(strFromByteArray.substring(i4, i5));
            sb.append(":");
            strSubstring = strFromByteArray.substring(i5);
        } else {
            int i6 = asInterface + 79;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            int length3 = strFromByteArray.length() - 3;
            char cCharAt3 = strFromByteArray.charAt(length3);
            if (cCharAt3 != '-') {
                int i8 = IAuthTabCallbackStub + 107;
                asInterface = i8 % 128;
                if (i8 % 2 == 0 ? cCharAt3 != '+' : cCharAt3 != 29) {
                    String str2 = strFromByteArray + calculateGMTOffset(strFromByteArray);
                    int i9 = asInterface + 75;
                    IAuthTabCallbackStub = i9 % 128;
                    int i10 = i9 % 2;
                    return str2;
                }
            }
            sb = new StringBuilder();
            sb.append(strFromByteArray.substring(0, length3));
            sb.append("GMT");
            sb.append(strFromByteArray.substring(length3));
            strSubstring = ":00";
        }
        sb.append(strSubstring);
        return sb.toString();
    }

    public String getTimeString() {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strFromByteArray = Strings.fromByteArray(this.contents);
        int i4 = asInterface + 33;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return strFromByteArray;
    }

    protected boolean hasFractionalSeconds() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (true) {
            byte[] bArr = this.contents;
            if (i4 == bArr.length) {
                return false;
            }
            if (bArr[i4] == 46) {
                int i5 = asInterface + 63;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                if (i4 == 14) {
                    return true;
                }
            }
            i4++;
        }
    }

    protected boolean hasMinutes() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            if (!isDigit(78)) {
                return false;
            }
        } else if (!isDigit(10)) {
            return false;
        }
        if (!isDigit(11)) {
            return false;
        }
        int i3 = IAuthTabCallbackStub + 53;
        asInterface = i3 % 128;
        return i3 % 2 == 0;
    }

    protected boolean hasSeconds() {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (!isDigit(12)) {
            return false;
        }
        int i4 = IAuthTabCallbackStub + 31;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            if (!isDigit(58)) {
                return false;
            }
        } else if (!isDigit(13)) {
            return false;
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Arrays.hashCode(this.contents);
        int i4 = IAuthTabCallbackStub + 73;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDERObject() {
        int i = 2 % 2;
        DERGeneralizedTime dERGeneralizedTime = new DERGeneralizedTime(this.contents);
        int i2 = asInterface + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return dERGeneralizedTime;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDLObject() {
        int i = 2 % 2;
        DERGeneralizedTime dERGeneralizedTime = new DERGeneralizedTime(this.contents);
        int i2 = asInterface + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return dERGeneralizedTime;
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
            int i4 = $10 + 75;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), 43 - Color.blue(0), 1451 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ImageFormat.getBitsPerPixel(0)), 43 - ImageFormat.getBitsPerPixel(0), 1493 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 50, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0)), TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 29, 12577 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $10 + 75;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static void onNavigationEvent() {
        onWarmupCompleted = -4283703821016059076L;
        onExtraCallback = -1776194565;
        onNavigationEvent = (char) 27643;
    }
}

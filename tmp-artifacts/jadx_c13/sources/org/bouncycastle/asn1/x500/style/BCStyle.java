package org.bouncycastle.asn1.x500.style;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Hashtable;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class BCStyle extends AbstractX500NameStyle {
    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY;
    public static final ASN1ObjectIdentifier C;
    public static final ASN1ObjectIdentifier CN;
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final ASN1ObjectIdentifier DC;
    public static final ASN1ObjectIdentifier DESCRIPTION;
    public static final ASN1ObjectIdentifier DMD_NAME;
    public static final ASN1ObjectIdentifier DN_QUALIFIER;
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final ASN1ObjectIdentifier E;
    public static final ASN1ObjectIdentifier EmailAddress;
    public static final ASN1ObjectIdentifier GENDER;
    public static final ASN1ObjectIdentifier GENERATION;
    public static final ASN1ObjectIdentifier GIVENNAME;
    private static int IAuthTabCallback;
    public static final ASN1ObjectIdentifier INITIALS;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier L;
    public static final ASN1ObjectIdentifier NAME;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH;
    public static final ASN1ObjectIdentifier O;
    public static final ASN1ObjectIdentifier ORGANIZATION_IDENTIFIER;
    public static final ASN1ObjectIdentifier OU;
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final ASN1ObjectIdentifier POSTAL_CODE;
    public static final ASN1ObjectIdentifier PSEUDONYM;
    public static final ASN1ObjectIdentifier ROLE;
    public static final ASN1ObjectIdentifier SERIALNUMBER;
    public static final ASN1ObjectIdentifier SN;
    public static final ASN1ObjectIdentifier ST;
    public static final ASN1ObjectIdentifier STREET;
    public static final ASN1ObjectIdentifier SURNAME;
    public static final ASN1ObjectIdentifier T;
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER;
    public static final ASN1ObjectIdentifier UID;
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final ASN1ObjectIdentifier UnstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName;
    private static int asInterface;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static short[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {94, -43, -105, 125};
    private static final int $$b = 217;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallbackDefault = 1;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        int i3 = 4 - (i * 3);
        int i4 = b * 4;
        int i5 = (b2 * 4) + 115;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i5 = i4;
            i5 += i6;
            i3++;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i3];
            i5 += i6;
            i3++;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    static {
        asInterface = 0;
        IAuthTabCallback();
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern = new ASN1ObjectIdentifier("2.5.4.6").intern();
        C = aSN1ObjectIdentifierIntern;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern2 = new ASN1ObjectIdentifier("2.5.4.10").intern();
        O = aSN1ObjectIdentifierIntern2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern3 = new ASN1ObjectIdentifier("2.5.4.11").intern();
        OU = aSN1ObjectIdentifierIntern3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern4 = new ASN1ObjectIdentifier("2.5.4.12").intern();
        T = aSN1ObjectIdentifierIntern4;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern5 = new ASN1ObjectIdentifier("2.5.4.3").intern();
        CN = aSN1ObjectIdentifierIntern5;
        SN = new ASN1ObjectIdentifier("2.5.4.5").intern();
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern6 = new ASN1ObjectIdentifier("2.5.4.9").intern();
        STREET = aSN1ObjectIdentifierIntern6;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern7 = new ASN1ObjectIdentifier("2.5.4.5").intern();
        SERIALNUMBER = aSN1ObjectIdentifierIntern7;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern8 = new ASN1ObjectIdentifier("2.5.4.7").intern();
        L = aSN1ObjectIdentifierIntern8;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern9 = new ASN1ObjectIdentifier("2.5.4.8").intern();
        ST = aSN1ObjectIdentifierIntern9;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern10 = new ASN1ObjectIdentifier("2.5.4.4").intern();
        SURNAME = aSN1ObjectIdentifierIntern10;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern11 = new ASN1ObjectIdentifier("2.5.4.42").intern();
        GIVENNAME = aSN1ObjectIdentifierIntern11;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern12 = new ASN1ObjectIdentifier("2.5.4.43").intern();
        INITIALS = aSN1ObjectIdentifierIntern12;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern13 = new ASN1ObjectIdentifier("2.5.4.44").intern();
        GENERATION = aSN1ObjectIdentifierIntern13;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern14 = new ASN1ObjectIdentifier("2.5.4.45").intern();
        UNIQUE_IDENTIFIER = aSN1ObjectIdentifierIntern14;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern15 = new ASN1ObjectIdentifier("2.5.4.13").intern();
        DESCRIPTION = aSN1ObjectIdentifierIntern15;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern16 = new ASN1ObjectIdentifier("2.5.4.15").intern();
        BUSINESS_CATEGORY = aSN1ObjectIdentifierIntern16;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern17 = new ASN1ObjectIdentifier("2.5.4.17").intern();
        POSTAL_CODE = aSN1ObjectIdentifierIntern17;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern18 = new ASN1ObjectIdentifier("2.5.4.46").intern();
        DN_QUALIFIER = aSN1ObjectIdentifierIntern18;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern19 = new ASN1ObjectIdentifier("2.5.4.65").intern();
        PSEUDONYM = aSN1ObjectIdentifierIntern19;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern20 = new ASN1ObjectIdentifier("2.5.4.72").intern();
        ROLE = aSN1ObjectIdentifierIntern20;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern21 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.1").intern();
        DATE_OF_BIRTH = aSN1ObjectIdentifierIntern21;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern22 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.2").intern();
        PLACE_OF_BIRTH = aSN1ObjectIdentifierIntern22;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern23 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.3").intern();
        GENDER = aSN1ObjectIdentifierIntern23;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern24 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.4").intern();
        COUNTRY_OF_CITIZENSHIP = aSN1ObjectIdentifierIntern24;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern25 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.5").intern();
        COUNTRY_OF_RESIDENCE = aSN1ObjectIdentifierIntern25;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern26 = new ASN1ObjectIdentifier("1.3.36.8.3.14").intern();
        NAME_AT_BIRTH = aSN1ObjectIdentifierIntern26;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern27 = new ASN1ObjectIdentifier("2.5.4.16").intern();
        POSTAL_ADDRESS = aSN1ObjectIdentifierIntern27;
        DMD_NAME = new ASN1ObjectIdentifier("2.5.4.54").intern();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = X509ObjectIdentifiers.id_at_organizationIdentifier;
        ORGANIZATION_IDENTIFIER = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier6;
        E = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        DC = aSN1ObjectIdentifier7;
        Object[] objArr = new Object[1];
        a((short) View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (122 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0')), Color.alpha(0) + 435987765, (ViewConfiguration.getWindowTouchSlop() >> 8) - 195686850, (-78) - Color.green(0), objArr);
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier(((String) objArr[0]).intern());
        UID = aSN1ObjectIdentifier8;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifierIntern, "C");
        hashtable.put(aSN1ObjectIdentifierIntern2, "O");
        hashtable.put(aSN1ObjectIdentifierIntern4, "T");
        hashtable.put(aSN1ObjectIdentifierIntern3, "OU");
        hashtable.put(aSN1ObjectIdentifierIntern5, "CN");
        hashtable.put(aSN1ObjectIdentifierIntern8, "L");
        hashtable.put(aSN1ObjectIdentifierIntern9, "ST");
        hashtable.put(aSN1ObjectIdentifierIntern7, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier4, "E");
        hashtable.put(aSN1ObjectIdentifier7, "DC");
        hashtable.put(aSN1ObjectIdentifier8, "UID");
        hashtable.put(aSN1ObjectIdentifierIntern6, "STREET");
        hashtable.put(aSN1ObjectIdentifierIntern10, "SURNAME");
        hashtable.put(aSN1ObjectIdentifierIntern11, "GIVENNAME");
        hashtable.put(aSN1ObjectIdentifierIntern12, "INITIALS");
        hashtable.put(aSN1ObjectIdentifierIntern13, "GENERATION");
        hashtable.put(aSN1ObjectIdentifierIntern15, "DESCRIPTION");
        hashtable.put(aSN1ObjectIdentifierIntern20, "ROLE");
        hashtable.put(aSN1ObjectIdentifier6, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier5, "unstructuredName");
        hashtable.put(aSN1ObjectIdentifierIntern14, "UniqueIdentifier");
        hashtable.put(aSN1ObjectIdentifierIntern18, "DN");
        hashtable.put(aSN1ObjectIdentifierIntern19, "Pseudonym");
        hashtable.put(aSN1ObjectIdentifierIntern27, "PostalAddress");
        hashtable.put(aSN1ObjectIdentifierIntern26, "NameAtBirth");
        hashtable.put(aSN1ObjectIdentifierIntern24, "CountryOfCitizenship");
        hashtable.put(aSN1ObjectIdentifierIntern25, "CountryOfResidence");
        hashtable.put(aSN1ObjectIdentifierIntern23, "Gender");
        hashtable.put(aSN1ObjectIdentifierIntern22, "PlaceOfBirth");
        hashtable.put(aSN1ObjectIdentifierIntern21, "DateOfBirth");
        hashtable.put(aSN1ObjectIdentifierIntern17, "PostalCode");
        hashtable.put(aSN1ObjectIdentifierIntern16, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier2, "Name");
        hashtable.put(aSN1ObjectIdentifier3, "organizationIdentifier");
        hashtable2.put("c", aSN1ObjectIdentifierIntern);
        hashtable2.put("o", aSN1ObjectIdentifierIntern2);
        hashtable2.put("t", aSN1ObjectIdentifierIntern4);
        hashtable2.put("ou", aSN1ObjectIdentifierIntern3);
        hashtable2.put("cn", aSN1ObjectIdentifierIntern5);
        hashtable2.put("l", aSN1ObjectIdentifierIntern8);
        hashtable2.put("st", aSN1ObjectIdentifierIntern9);
        hashtable2.put("sn", aSN1ObjectIdentifierIntern10);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierIntern7);
        hashtable2.put("street", aSN1ObjectIdentifierIntern6);
        hashtable2.put("emailaddress", aSN1ObjectIdentifier4);
        hashtable2.put("dc", aSN1ObjectIdentifier7);
        hashtable2.put("e", aSN1ObjectIdentifier4);
        hashtable2.put("uid", aSN1ObjectIdentifier8);
        hashtable2.put("surname", aSN1ObjectIdentifierIntern10);
        hashtable2.put("givenname", aSN1ObjectIdentifierIntern11);
        hashtable2.put("initials", aSN1ObjectIdentifierIntern12);
        hashtable2.put("generation", aSN1ObjectIdentifierIntern13);
        Object[] objArr2 = new Object[1];
        a((short) ((Process.getThreadPriority(0) + 20) >> 6), (byte) ((-104) - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET)), 435987790 - (ViewConfiguration.getScrollBarSize() >> 8), (-195686798) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-77) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
        hashtable2.put(((String) objArr2[0]).intern(), aSN1ObjectIdentifierIntern15);
        hashtable2.put("role", aSN1ObjectIdentifierIntern20);
        hashtable2.put("unstructuredaddress", aSN1ObjectIdentifier6);
        hashtable2.put("unstructuredname", aSN1ObjectIdentifier5);
        hashtable2.put("uniqueidentifier", aSN1ObjectIdentifierIntern14);
        hashtable2.put("dn", aSN1ObjectIdentifierIntern18);
        hashtable2.put("pseudonym", aSN1ObjectIdentifierIntern19);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierIntern27);
        hashtable2.put("nameatbirth", aSN1ObjectIdentifierIntern26);
        hashtable2.put("countryofcitizenship", aSN1ObjectIdentifierIntern24);
        hashtable2.put("countryofresidence", aSN1ObjectIdentifierIntern25);
        hashtable2.put("gender", aSN1ObjectIdentifierIntern23);
        hashtable2.put("placeofbirth", aSN1ObjectIdentifierIntern22);
        hashtable2.put("dateofbirth", aSN1ObjectIdentifierIntern21);
        hashtable2.put("postalcode", aSN1ObjectIdentifierIntern17);
        hashtable2.put("businesscategory", aSN1ObjectIdentifierIntern16);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifier);
        Object[] objArr3 = new Object[1];
        a((short) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (byte) (51 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 435987802 + TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0'), (-195686788) + View.MeasureSpec.getSize(0), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) - 77, objArr3);
        hashtable2.put(((String) objArr3[0]).intern(), aSN1ObjectIdentifier2);
        hashtable2.put("organizationidentifier", aSN1ObjectIdentifier3);
        INSTANCE = new BCStyle();
        int i = IAuthTabCallbackDefault + 79;
        asInterface = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    protected BCStyle() {
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierDecodeAttrName = IETFUtils.decodeAttrName(str, this.defaultLookUp);
        int i4 = asBinder + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return aSN1ObjectIdentifierDecodeAttrName;
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    protected ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        int i = 2 % 2;
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) EmailAddress) || aSN1ObjectIdentifier.equals((ASN1Primitive) DC)) {
            return new DERIA5String(str);
        }
        int i2 = onTransact + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) DATE_OF_BIRTH)) {
            ASN1GeneralizedTime aSN1GeneralizedTime = new ASN1GeneralizedTime(str);
            int i4 = asBinder + 101;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return aSN1GeneralizedTime;
        }
        if (!aSN1ObjectIdentifier.equals((ASN1Primitive) C)) {
            int i6 = onTransact + 3;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            if (!aSN1ObjectIdentifier.equals((ASN1Primitive) SN) && !aSN1ObjectIdentifier.equals((ASN1Primitive) DN_QUALIFIER) && !aSN1ObjectIdentifier.equals((ASN1Primitive) TELEPHONE_NUMBER)) {
                return super.encodeStringValue(aSN1ObjectIdentifier, str);
            }
        }
        return new DERPrintableString(str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        RDN[] rdnArrRDNsFromString = IETFUtils.rDNsFromString(str, this);
        int i4 = asBinder + 97;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return rdnArrRDNsFromString;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String[] strArrFindAttrNamesForOID;
        int i = 2 % 2;
        int i2 = onTransact + 109;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            strArrFindAttrNamesForOID = IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
            int i3 = 63 / 0;
        } else {
            strArrFindAttrNamesForOID = IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
        }
        int i4 = asBinder + 43;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return strArrFindAttrNamesForOID;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) DefaultSymbols.get(aSN1ObjectIdentifier);
        int i4 = onTransact + 43;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        int i = 2 % 2;
        StringBuffer stringBuffer = new StringBuffer();
        RDN[] rDNs = x500Name.getRDNs();
        boolean z = true;
        int i2 = 0;
        while (i2 < rDNs.length) {
            if (z) {
                int i3 = asBinder + Imgproc.COLOR_YUV2RGB_YVYU;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                z = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, rDNs[i2], this.defaultSymbols);
            i2++;
            int i5 = asBinder + 63;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        char c;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 42, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            float f = 0.0f;
            if (z) {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char capsMode = (char) (12843 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0));
                                int iMakeMeasureSpec = 55 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i7 = 2167 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1));
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(capsMode, iMakeMeasureSpec, i7, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i6++;
                            f = 0.0f;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 43, 22439 - ExpandableListView.getPackedPositionType(0L), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i8 = $10;
                int i9 = i8 + 101;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                int i11 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                if (z) {
                    i4 = 1;
                } else {
                    int i12 = i8 + 31;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i4;
                try {
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 87 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallback;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        loop1: while (true) {
                            int i14 = 0;
                            while (i14 < length2) {
                                int i15 = $10 + 61;
                                $11 = i15 % 128;
                                if (i15 % 2 == 0) {
                                    break;
                                }
                                bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                                i14++;
                            }
                            bArr5[i14] = (byte) (bArr4[i14] % (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i16 = $10 + 65;
                        $11 = i16 % 128;
                        boolean z2 = i16 % 2 != 0;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                        while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                            if (z2) {
                                int i17 = $10 + 47;
                                $11 = i17 % 128;
                                if (i17 % 2 == 0) {
                                    byte[] bArr6 = onExtraCallback;
                                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                    c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback >>> (((byte) (((byte) (bArr6[r7] - 4629411779493505016L)) >> s)) ^ b));
                                } else {
                                    byte[] bArr7 = onExtraCallback;
                                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                    c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                                }
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = c;
                            } else {
                                short[] sArr = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                                int i18 = $10 + 111;
                                $11 = i18 % 128;
                                int i19 = i18 % 2;
                            }
                            sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = 1111786179;
        onExtraCallbackWithResult = -1538795451;
        onWarmupCompleted = -1343346182;
        onExtraCallback = new byte[]{-60, 112, -114, 112, -115, 115, -116, 112, -115, 115, -114, 112, 115, -115, -118, 123, 112, -113, -115, 114, 114, 119, -122, 120, -115, -74, 110, -105, 100, -107, -106, 102, -98, 97, -97, -112, -65, -61, 55, -56};
    }
}

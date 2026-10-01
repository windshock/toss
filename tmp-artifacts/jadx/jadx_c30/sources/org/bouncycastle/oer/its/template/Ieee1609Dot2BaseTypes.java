package org.bouncycastle.oer.its.template;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.math.BigInteger;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class Ieee1609Dot2BaseTypes {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final OERDefinition.Builder BasePublicEncryptionKey;
    public static final OERDefinition.Builder BitmapSsp;
    public static final OERDefinition.Builder BitmapSspRange;
    public static OERDefinition.Builder CircularRegion = null;
    public static OERDefinition.Builder CountryAndRegions = null;
    public static OERDefinition.Builder CountryAndSubregions = null;
    public static OERDefinition.Builder CountryOnly = null;
    public static final OERDefinition.Builder CrlSeries;
    public static final OERDefinition.Builder Duration;
    public static final OERDefinition.Builder EccP256CurvePoint;
    public static final OERDefinition.Builder EccP384CurvePoint;
    public static final OERDefinition.Builder EcdsaP256Signature;
    public static final OERDefinition.Builder EcdsaP384Signature;
    public static final OERDefinition.Builder EciesP256EncryptedKey;
    public static OERDefinition.Builder Elevation = null;
    public static final OERDefinition.Builder EncryptionKey;
    public static OERDefinition.Builder GeographicRegion = null;
    public static final OERDefinition.Builder GroupLinkageValue;
    public static final OERDefinition.Builder HashAlgorithm;
    public static final OERDefinition.Builder HashedId10;
    public static final OERDefinition.Builder HashedId3;
    public static final OERDefinition.Builder HashedId32;
    public static final OERDefinition.Builder HashedId48;
    public static final OERDefinition.Builder HashedId8;
    public static final OERDefinition.Builder Hostname;
    private static int IAuthTabCallback = 0;
    public static final OERDefinition.Builder IValue;
    public static OERDefinition.Builder IdentifiedRegion = null;
    public static OERDefinition.Builder KnownLatitude = null;
    public static OERDefinition.Builder KnownLongitude = null;
    public static final OERDefinition.Builder LaId;
    public static OERDefinition.Builder Latitude = null;
    public static final OERDefinition.Builder LinkageSeed;
    public static final OERDefinition.Builder LinkageValue;
    public static OERDefinition.Builder Longitude = null;
    public static OERDefinition.Builder NinetyDegreeInt = null;
    public static OERDefinition.Builder OneEightyDegreeInt = null;
    public static OERDefinition.Builder PolygonalRegion = null;
    public static final OERDefinition.Builder Psid;
    public static final OERDefinition.Builder PsidSsp;
    public static final OERDefinition.Builder PsidSspRange;
    public static final OERDefinition.Builder PublicEncryptionKey;
    public static final OERDefinition.Builder PublicVerificationKey;
    public static OERDefinition.Builder RectangularRegion = null;
    public static OERDefinition.Builder RegionAndSubregions = null;
    public static final OERDefinition.Builder SequenceOfHashedId3;
    public static OERDefinition.Builder SequenceOfIdentifiedRegion = null;
    public static final OERDefinition.Builder SequenceOfOctetString;
    public static final OERDefinition.Builder SequenceOfPsid;
    public static final OERDefinition.Builder SequenceOfPsidSsp;
    public static final OERDefinition.Builder SequenceOfPsidSspRange;
    public static OERDefinition.Builder SequenceOfRectangularRegion = null;
    public static OERDefinition.Builder SequenceOfRegionAndSubregions = null;
    public static final OERDefinition.Builder SequenceOfUint16;
    public static final OERDefinition.Builder ServiceSpecificPermissions;
    public static final OERDefinition.Builder Signature;
    public static final OERDefinition.Builder SspRange;
    public static final OERDefinition.Builder SubjectAssurance;
    public static final OERDefinition.Builder SymmAlgorithm;
    public static final OERDefinition.Builder SymmetricEncryptionKey;
    public static OERDefinition.Builder ThreeDLocation = null;
    public static final OERDefinition.Builder Time32;
    public static final OERDefinition.Builder Time64;
    public static OERDefinition.Builder TwoDLocation = null;
    public static final OERDefinition.Builder UINT16;
    public static final OERDefinition.Builder UINT3;
    public static final OERDefinition.Builder UINT32;
    public static final OERDefinition.Builder UINT64;
    public static final OERDefinition.Builder UINT8;
    public static OERDefinition.Builder UnknownLatitude = null;
    public static OERDefinition.Builder UnknownLongitude = null;
    public static final OERDefinition.Builder ValidityPeriod;
    private static long onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    static {
        onWarmupCompleted();
        UINT3 = OERDefinition.integer(0L, 7L);
        OERDefinition.Builder builderInteger = OERDefinition.integer(0L, 255L);
        UINT8 = builderInteger;
        OERDefinition.Builder builderInteger2 = OERDefinition.integer(0L, 65535L);
        UINT16 = builderInteger2;
        OERDefinition.Builder builderInteger3 = OERDefinition.integer(0L, BodyPartID.bodyIdMax);
        UINT32 = builderInteger3;
        OERDefinition.Builder builderInteger4 = OERDefinition.integer(BigInteger.ZERO, new BigInteger("18446744073709551615"));
        UINT64 = builderInteger4;
        SequenceOfUint16 = OERDefinition.seqof(builderInteger2);
        OERDefinition.Builder builderLabel = OERDefinition.octets(3).label("HashId3");
        HashedId3 = builderLabel;
        SequenceOfHashedId3 = OERDefinition.seqof(builderLabel).label("SequenceOfHashedId3");
        HashedId8 = OERDefinition.octets(8).label("HashId8");
        HashedId10 = OERDefinition.octets(10).label("HashId10");
        HashedId32 = OERDefinition.octets(32).label("HashId32");
        HashedId48 = OERDefinition.octets(48).label("HashId48");
        OERDefinition.Builder builderLabel2 = builderInteger3.label("Time32");
        Time32 = builderLabel2;
        Time64 = builderInteger4.label("Time64");
        OERDefinition.Builder builderLabel3 = OERDefinition.choice(builderInteger2.label("microseconds"), builderInteger2.label("milliseconds"), builderInteger2.label("seconds"), builderInteger2.label("minutes"), builderInteger2.label("hours"), builderInteger2.label("sixtyHours"), builderInteger2.label("years")).label("Duration");
        Duration = builderLabel3;
        ValidityPeriod = OERDefinition.seq(builderLabel2, builderLabel3).label("ValidityPeriod");
        IValue = builderInteger2.copy().label("IValue");
        Hostname = OERDefinition.utf8String(0, GF2Field.MASK).label("Hostname");
        LinkageValue = OERDefinition.octets(9).label("LinkageValue");
        GroupLinkageValue = OERDefinition.seq(OERDefinition.octets(4), OERDefinition.octets(9)).label("GroupLinkageValue");
        LaId = OERDefinition.octets(2).label("LaId");
        LinkageSeed = OERDefinition.octets(16).label("LinkageSeed");
        OERDefinition.Builder builderLabel4 = OERDefinition.choice(OERDefinition.octets(32), OERDefinition.nullValue(), OERDefinition.octets(32), OERDefinition.octets(32), OERDefinition.seq(OERDefinition.octets(32), OERDefinition.octets(32))).label("EccP256CurvePoint");
        EccP256CurvePoint = builderLabel4;
        OERDefinition.Builder builderLabel5 = OERDefinition.seq(builderLabel4, OERDefinition.octets(32)).label("EcdsaP256Signature");
        EcdsaP256Signature = builderLabel5;
        OERDefinition.Builder builderLabel6 = OERDefinition.choice(OERDefinition.octets(48), OERDefinition.nullValue(), OERDefinition.octets(48), OERDefinition.octets(48), OERDefinition.seq(OERDefinition.octets(48), OERDefinition.octets(48))).label("EccP384CurvePoint");
        EccP384CurvePoint = builderLabel6;
        OERDefinition.Builder builderLabel7 = OERDefinition.seq(builderLabel6, OERDefinition.octets(48)).label("EcdsaP384Signature");
        EcdsaP384Signature = builderLabel7;
        Signature = OERDefinition.choice(builderLabel5, builderLabel5, OERDefinition.extension(), builderLabel7).label("Signature");
        Object[] objArr = new Object[1];
        a(new char[]{29121, 29088, 48877, 57694, 10390, 38729, 53099, 3755, 15944, 43022, 20065, 36636, 53464}, ViewConfiguration.getTouchSlop() >> 8, objArr);
        OERDefinition.Builder builderLabel8 = OERDefinition.enumeration(OERDefinition.enumItem(((String) objArr[0]).intern()), OERDefinition.extension()).label("SymmAlgorithm");
        SymmAlgorithm = builderLabel8;
        HashAlgorithm = OERDefinition.enumeration(OERDefinition.enumItem("sha256"), OERDefinition.extension(), OERDefinition.enumItem("sha384")).label("HashAlgorithm");
        EciesP256EncryptedKey = OERDefinition.seq(builderLabel4.copy().label("v(EccP256CurvePoint)"), OERDefinition.octets(16).label("c"), OERDefinition.octets(16).label("t")).label("EciesP256EncryptedKey");
        OERDefinition.Builder builderLabel9 = OERDefinition.choice(builderLabel4, builderLabel4, OERDefinition.extension()).label("BasePublicEncryptionKey");
        BasePublicEncryptionKey = builderLabel9;
        OERDefinition.Builder builderLabel10 = OERDefinition.seq(builderLabel8, builderLabel9).label("PublicEncryptionKey");
        PublicEncryptionKey = builderLabel10;
        OERDefinition.Builder builderOctets = OERDefinition.octets(16);
        Object[] objArr2 = new Object[1];
        a(new char[]{29121, 29088, 48877, 57694, 10390, 38729, 53099, 3755, 15944, 43022, 20065, 36636, 53464}, 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
        OERDefinition.Builder builderLabel11 = OERDefinition.choice(builderOctets.label(((String) objArr2[0]).intern()), OERDefinition.extension()).label("SymmetricEncryptionKey");
        SymmetricEncryptionKey = builderLabel11;
        EncryptionKey = OERDefinition.choice(builderLabel10.label("public"), builderLabel11.label("symmetric")).label("EncryptionKey");
        PublicVerificationKey = OERDefinition.choice(builderLabel4.label("ecdsaNistP256"), builderLabel4.label("ecdsaBrainpoolP256r1"), OERDefinition.extension(), builderLabel6.label("ecdsaBrainpoolP384r1")).label("PublicVerificationKey");
        OERDefinition.Builder builderLabel12 = OERDefinition.integer().rangeToMAXFrom(0L).label("Psid");
        Psid = builderLabel12;
        OERDefinition.Builder builderLabel13 = OERDefinition.octets(0, 31).label("BitmapSsp");
        BitmapSsp = builderLabel13;
        OERDefinition.Builder builderLabel14 = OERDefinition.choice(OERDefinition.octets().unbounded().label("opaque"), OERDefinition.extension(), builderLabel13).label("ServiceSpecificPermissions");
        ServiceSpecificPermissions = builderLabel14;
        OERDefinition.Builder builderLabel15 = OERDefinition.seq(builderLabel12, OERDefinition.optional(builderLabel14)).label("PsidSsp");
        PsidSsp = builderLabel15;
        SequenceOfPsidSsp = OERDefinition.seqof(builderLabel15).label("SequenceOfPsidSsp");
        SequenceOfPsid = OERDefinition.seqof(builderLabel12).label("SequenceOfPsid");
        OERDefinition.Builder builderLabel16 = OERDefinition.seqof(OERDefinition.octets().rangeToMAXFrom(0L)).label("SequenceOfOctetString");
        SequenceOfOctetString = builderLabel16;
        OERDefinition.Builder builderLabel17 = OERDefinition.seq(OERDefinition.octets(1, 32).label("sspValue"), OERDefinition.octets(1, 32).label("sspBitMask")).label("BitmapSspRange");
        BitmapSspRange = builderLabel17;
        OERDefinition.Builder builderLabel18 = OERDefinition.choice(builderLabel16.label("opaque"), OERDefinition.nullValue().label("all"), OERDefinition.extension(), builderLabel17.label("bitmapSspRange")).label("SspRange");
        SspRange = builderLabel18;
        OERDefinition.Builder builderLabel19 = OERDefinition.seq(builderLabel12.label("psid"), OERDefinition.optional(builderLabel18.label("sspRange"))).label("PsidSspRange");
        PsidSspRange = builderLabel19;
        SequenceOfPsidSspRange = OERDefinition.seqof(builderLabel19).label("SequenceOfPsidSspRange");
        SubjectAssurance = OERDefinition.octets(1).label("SubjectAssurance");
        CrlSeries = builderInteger2.label("CrlSeries");
        OERDefinition.Builder builderLabel20 = builderInteger2.label("CountryOnly");
        CountryOnly = builderLabel20;
        CountryAndRegions = OERDefinition.seq(builderLabel20, OERDefinition.seqof(builderInteger)).label("CountryAndRegions");
        OERDefinition.Builder builderLabel21 = OERDefinition.seq(builderInteger, OERDefinition.seqof(builderInteger2)).label("RegionAndSubregions");
        RegionAndSubregions = builderLabel21;
        OERDefinition.Builder builderLabel22 = OERDefinition.seqof(builderLabel21).label("SequenceOfRegionAndSubregions");
        SequenceOfRegionAndSubregions = builderLabel22;
        CountryAndSubregions = OERDefinition.seq(CountryOnly, builderLabel22).label("CountryAndSubregions");
        OERDefinition.Builder builderLabel23 = OERDefinition.integer(-1799999999L, 1800000001L).label("OneEightyDegreeInt");
        OneEightyDegreeInt = builderLabel23;
        KnownLongitude = builderLabel23.copy().label("KnownLongitude(OneEightyDegreeInt)");
        UnknownLongitude = OERDefinition.integer(1800000001L).label("UnknownLongitude");
        OERDefinition.Builder builderLabel24 = OERDefinition.integer(-900000000L, 900000001L).label("NinetyDegreeInt");
        NinetyDegreeInt = builderLabel24;
        KnownLatitude = builderLabel24.copy().label("KnownLatitude(NinetyDegreeInt)");
        UnknownLatitude = OERDefinition.integer(900000001L);
        Elevation = builderInteger2.label("Elevation");
        Longitude = OneEightyDegreeInt.copy().label("Longitude(OneEightyDegreeInt)");
        OERDefinition.Builder builderLabel25 = NinetyDegreeInt.copy().label("Latitude(NinetyDegreeInt)");
        Latitude = builderLabel25;
        ThreeDLocation = OERDefinition.seq(builderLabel25, Longitude, Elevation).label("ThreeDLocation");
        OERDefinition.Builder builderLabel26 = OERDefinition.seq(Latitude, Longitude).label("TwoDLocation");
        TwoDLocation = builderLabel26;
        OERDefinition.Builder builderLabel27 = OERDefinition.seq(builderLabel26, builderLabel26).label("RectangularRegion");
        RectangularRegion = builderLabel27;
        SequenceOfRectangularRegion = OERDefinition.seqof(builderLabel27).label("SequenceOfRectangularRegion");
        CircularRegion = OERDefinition.seq(TwoDLocation, builderInteger2).label("CircularRegion");
        PolygonalRegion = OERDefinition.seqof(TwoDLocation).rangeToMAXFrom(3L).label("PolygonalRegion");
        OERDefinition.Builder builderLabel28 = OERDefinition.choice(CountryOnly, CountryAndRegions, CountryAndSubregions, OERDefinition.extension()).label("IdentifiedRegion");
        IdentifiedRegion = builderLabel28;
        OERDefinition.Builder builderLabel29 = OERDefinition.seqof(builderLabel28).label("SequenceOfIdentifiedRegion");
        SequenceOfIdentifiedRegion = builderLabel29;
        GeographicRegion = OERDefinition.choice(CircularRegion, SequenceOfRectangularRegion, PolygonalRegion, builderLabel29, OERDefinition.extension()).label("GeographicRegion");
        int i = IAuthTabCallback + 73;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 119;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - ((byte) KeyEvent.getModifierMetaStateMask())), 85 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 18 - ImageFormat.getBitsPerPixel(0), 8808 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 103;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = 6918246277337982170L;
    }
}

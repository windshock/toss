package im.toss.features.benefit.dto;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AdsInfo$$serializer implements aeu2<AdsInfo> {
    public static final int $stable;
    private static int IAuthTabCallback;
    public static final AdsInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {20, 103, 109, 52};
    private static final int $$b = 225;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 105 - (i * 4);
        int i4 = b * 4;
        int i5 = (b2 * 2) + 4;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i3 = i4;
            i5++;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i5];
            i5++;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        return serialDescriptor;
    }

    static {
        onWarmupCompleted = 1;
        IAuthTabCallback();
        AdsInfo$$serializer adsInfo$$serializer = new AdsInfo$$serializer();
        INSTANCE = adsInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.dto.AdsInfo", adsInfo$$serializer, 24);
        setanimationsloop.onWarmupCompleted("adContentType", true);
        setanimationsloop.onWarmupCompleted("mainResourceUrl", true);
        setanimationsloop.onWarmupCompleted("thumbnailImageUrl", true);
        setanimationsloop.onWarmupCompleted("autoPlayDelaySec", true);
        setanimationsloop.onWarmupCompleted("candidateId", true);
        setanimationsloop.onWarmupCompleted("unitPrice", true);
        setanimationsloop.onWarmupCompleted("brandName", true);
        setanimationsloop.onWarmupCompleted("campaignId", true);
        setanimationsloop.onWarmupCompleted("adSetId", true);
        setanimationsloop.onWarmupCompleted("trackingClickId", true);
        setanimationsloop.onWarmupCompleted("adId", true);
        setanimationsloop.onWarmupCompleted("contractType", true);
        setanimationsloop.onWarmupCompleted("contractTier", true);
        setanimationsloop.onWarmupCompleted("adType", true);
        setanimationsloop.onWarmupCompleted("iconImageUrl", true);
        setanimationsloop.onWarmupCompleted("landingUrl", true);
        Object[] objArr = new Object[1];
        a(5 - (ViewConfiguration.getTouchSlop() >> 8), 4 - KeyEvent.normalizeMetaState(0), new char[]{65535, 7, 65532, 7, 65528}, true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 225, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("subTitle", true);
        setanimationsloop.onWarmupCompleted("spaceId", true);
        setanimationsloop.onWarmupCompleted("category", true);
        setanimationsloop.onWarmupCompleted("requestId", true);
        setanimationsloop.onWarmupCompleted("reviewNo", true);
        setanimationsloop.onWarmupCompleted("adMobConfig", true);
        setanimationsloop.onWarmupCompleted("isExpired", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private AdsInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = AdsInfo.onNavigationEvent();
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[0].getValue());
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializer2 = oty1.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializer, kSerializerIAuthTabCallback2, setVideoListener.onWarmupCompleted, sp.IAuthTabCallback(kSerializer2), kSerializer2, sp.IAuthTabCallback(kSerializer), kSerializer2, kSerializer2, kSerializer, kSerializer2, sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[11].getValue()), kSerializer, sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[13].getValue()), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), kSerializer2, sp.IAuthTabCallback(kSerializer), kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(AdMobConfig$$serializer.INSTANCE), getBgColor.IAuthTabCallback};
        int i4 = onExtraCallback + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AdsInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        AdMobConfig adMobConfig;
        ContractType contractType;
        String str2;
        String str3;
        String str4;
        AdType adType;
        String str5;
        String str6;
        boolean zOnExtraCallbackWithResult;
        int i;
        long j;
        long j2;
        String str7;
        String str8;
        String str9;
        String str10;
        Long l;
        String str11;
        AdContentType adContentType;
        String str12;
        long j3;
        double d;
        long j4;
        long j5;
        Long l2;
        String str13;
        String str14;
        AdMobConfig adMobConfig2;
        String str15;
        int i2;
        int i3;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        int i7 = onExtraCallback + 5;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = AdsInfo.onNavigationEvent();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            AdContentType adContentType2 = (AdContentType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            double dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
            Long l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, (Object) null);
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 5);
            String str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            long jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 7);
            long jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 8);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
            long jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 10);
            ContractType contractType2 = (ContractType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, (jp) lazyArrOnNavigationEvent[11].getValue(), (Object) null);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 12);
            AdType adType2 = (AdType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, (jp) lazyArrOnNavigationEvent[13].getValue(), (Object) null);
            String str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, getwrigglelayout, (Object) null);
            String str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, getwrigglelayout, (Object) null);
            String str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, getwrigglelayout, (Object) null);
            String str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, getwrigglelayout, (Object) null);
            long jIAuthTabCallbackDefault5 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 18);
            String str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19, getwrigglelayout, (Object) null);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 20);
            str12 = str17;
            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 21, getwrigglelayout, (Object) null);
            str8 = strAsInterface4;
            adType = adType2;
            adContentType = adContentType2;
            str10 = strAsInterface2;
            l = l3;
            str = str22;
            str7 = strAsInterface;
            adMobConfig = (AdMobConfig) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 22, AdMobConfig$$serializer.INSTANCE, (Object) null);
            j = jIAuthTabCallbackDefault4;
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 23);
            i = 16777215;
            str5 = str18;
            str2 = str21;
            str6 = str20;
            str3 = str19;
            contractType = contractType2;
            str9 = strAsInterface3;
            j3 = jIAuthTabCallbackDefault5;
            d = dIAuthTabCallback;
            j4 = jIAuthTabCallbackDefault;
            j5 = jIAuthTabCallbackDefault3;
            str11 = str16;
            j2 = jIAuthTabCallbackDefault2;
        } else {
            long jIAuthTabCallbackDefault6 = 0;
            boolean z = true;
            int i9 = 0;
            String str23 = null;
            AdMobConfig adMobConfig3 = null;
            ContractType contractType3 = null;
            String str24 = null;
            String str25 = null;
            AdType adType3 = null;
            String str26 = null;
            String str27 = null;
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            Long l4 = null;
            String str28 = null;
            AdContentType adContentType3 = null;
            String str29 = null;
            long jIAuthTabCallbackDefault7 = 0;
            long jIAuthTabCallbackDefault8 = 0;
            long jIAuthTabCallbackDefault9 = 0;
            double dIAuthTabCallback2 = 0.0d;
            long jIAuthTabCallbackDefault10 = 0;
            String str30 = null;
            boolean zOnExtraCallbackWithResult2 = false;
            while (!(!z)) {
                int i10 = onExtraCallback + 75;
                boolean z2 = zOnExtraCallbackWithResult2;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % i5;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        l2 = l4;
                        str13 = str28;
                        str14 = str23;
                        adMobConfig2 = adMobConfig3;
                        z = false;
                        str23 = str14;
                        adMobConfig3 = adMobConfig2;
                        zOnExtraCallbackWithResult2 = z2;
                        l4 = l2;
                        str28 = str13;
                    case 0:
                        l2 = l4;
                        String str31 = str29;
                        str14 = str23;
                        String str32 = str28;
                        adMobConfig2 = adMobConfig3;
                        str13 = str32;
                        adContentType3 = (AdContentType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), adContentType3);
                        i9 |= 1;
                        int i12 = onExtraCallback + 3;
                        onNavigationEvent = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i13 = 4 % 4;
                        }
                        str29 = str31;
                        i5 = 2;
                        str23 = str14;
                        adMobConfig3 = adMobConfig2;
                        zOnExtraCallbackWithResult2 = z2;
                        l4 = l2;
                        str28 = str13;
                    case 1:
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i9 |= 2;
                        zOnExtraCallbackWithResult2 = z2;
                        str28 = str28;
                        str23 = str23;
                        l4 = l4;
                        i5 = 2;
                    case 2:
                        Long l5 = l4;
                        i9 |= 4;
                        str23 = str23;
                        adMobConfig3 = adMobConfig3;
                        zOnExtraCallbackWithResult2 = z2;
                        str28 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str28);
                        l4 = l5;
                        i5 = 2;
                    case 3:
                        str15 = str29;
                        dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
                        i9 |= 8;
                        l4 = l4;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 4:
                        str15 = str29;
                        i9 |= 16;
                        str23 = str23;
                        l4 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, l4);
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 5:
                        str15 = str29;
                        jIAuthTabCallbackDefault8 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 5);
                        i9 |= 32;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 6:
                        i9 |= 64;
                        str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str29);
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 7:
                        jIAuthTabCallbackDefault10 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 7);
                        i2 = i9 | 128;
                        int i14 = onExtraCallback + 79;
                        onNavigationEvent = i14 % 128;
                        if (i14 % i5 != 0) {
                            int i15 = 3 % 4;
                        }
                        i9 = i2;
                        str15 = str29;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 8:
                        jIAuthTabCallbackDefault9 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 8);
                        i9 |= 256;
                        int i16 = onNavigationEvent + 73;
                        onExtraCallback = i16 % 128;
                        int i17 = i16 % i5;
                        str15 = str29;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 9:
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
                        i9 |= 512;
                        str15 = str29;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 10:
                        jIAuthTabCallbackDefault6 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 10);
                        i9 |= 1024;
                        str15 = str29;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 11:
                        contractType3 = (ContractType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, (jp) lazyArrOnNavigationEvent[11].getValue(), contractType3);
                        i2 = i9 | 2048;
                        i9 = i2;
                        str15 = str29;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 12:
                        i9 |= 4096;
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 12);
                        str15 = str29;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 13:
                        adType3 = (AdType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, (jp) lazyArrOnNavigationEvent[13].getValue(), adType3);
                        i9 |= 8192;
                        str15 = str29;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 14:
                        i9 |= 16384;
                        str15 = str29;
                        str26 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, getWriggleLayout.onNavigationEvent, str26);
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 15:
                        str25 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, getWriggleLayout.onNavigationEvent, str25);
                        i3 = 32768;
                        i2 = i3 | i9;
                        i9 = i2;
                        str15 = str29;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 16:
                        str27 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, getWriggleLayout.onNavigationEvent, str27);
                        i3 = 65536;
                        i2 = i3 | i9;
                        i9 = i2;
                        str15 = str29;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 17:
                        str24 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, getWriggleLayout.onNavigationEvent, str24);
                        i3 = 131072;
                        i2 = i3 | i9;
                        i9 = i2;
                        str15 = str29;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 18:
                        jIAuthTabCallbackDefault7 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 18);
                        i3 = 262144;
                        i2 = i3 | i9;
                        i9 = i2;
                        str15 = str29;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 19:
                        str23 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19, getWriggleLayout.onNavigationEvent, str23);
                        i3 = 524288;
                        i2 = i3 | i9;
                        i9 = i2;
                        str15 = str29;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 20:
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 20);
                        i4 = 1048576;
                        zOnExtraCallbackWithResult2 = z2;
                        i9 |= i4;
                    case 21:
                        str30 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 21, getWriggleLayout.onNavigationEvent, str30);
                        i3 = 2097152;
                        i2 = i3 | i9;
                        i9 = i2;
                        str15 = str29;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 22:
                        adMobConfig3 = (AdMobConfig) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 22, AdMobConfig$$serializer.INSTANCE, adMobConfig3);
                        i3 = 4194304;
                        i2 = i3 | i9;
                        i9 = i2;
                        str15 = str29;
                        str29 = str15;
                        zOnExtraCallbackWithResult2 = z2;
                        i5 = 2;
                    case 23:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 23);
                        i4 = 8388608;
                        i9 |= i4;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str23;
            adMobConfig = adMobConfig3;
            contractType = contractType3;
            str2 = str24;
            str3 = str25;
            str4 = str30;
            adType = adType3;
            str5 = str26;
            str6 = str27;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            i = i9;
            j = jIAuthTabCallbackDefault6;
            j2 = jIAuthTabCallbackDefault10;
            str7 = strAsInterface5;
            str8 = strAsInterface6;
            str9 = strAsInterface7;
            str10 = strAsInterface8;
            l = l4;
            str11 = str28;
            adContentType = adContentType3;
            str12 = str29;
            j3 = jIAuthTabCallbackDefault7;
            d = dIAuthTabCallback2;
            j4 = jIAuthTabCallbackDefault8;
            j5 = jIAuthTabCallbackDefault9;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AdsInfo(i, adContentType, str7, str11, d, l, j4, str12, j2, j5, str10, j, contractType, str9, adType, str5, str3, str6, str2, j3, str, str8, str4, adMobConfig, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m83deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AdsInfo adsInfoDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return adsInfoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AdsInfo adsInfo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(adsInfo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AdsInfo.onNavigationEvent(adsInfo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 5 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(adsInfo, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            AdsInfo.onNavigationEvent(adsInfo, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onExtraCallback + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AdsInfo) obj);
        int i4 = onNavigationEvent + 29;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 23 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onNavigationEvent + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Object obj;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            obj = null;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $10 + 3;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 23, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 12843), 55 - (ViewConfiguration.getTouchSlop() >> 8), ExpandableListView.getPackedPositionType(0L) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i2 > 0) {
            int i9 = $11 + 21;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 12843), 55 - (ViewConfiguration.getFadingEdgeLength() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i11 = $10 + 1;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i13 = $11 + 27;
        $10 = i13 % 128;
        if (i13 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = 478308957;
    }
}

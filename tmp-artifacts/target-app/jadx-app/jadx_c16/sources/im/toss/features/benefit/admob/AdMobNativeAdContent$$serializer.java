package im.toss.features.benefit.admob;

import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.lguplus.usimlib.TsmResponse;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.dj3;
import o.getDynamicHeight;
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
public final /* synthetic */ class AdMobNativeAdContent$$serializer implements aeu2<AdMobNativeAdContent> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final AdMobNativeAdContent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        AdMobNativeAdContent$$serializer adMobNativeAdContent$$serializer = new AdMobNativeAdContent$$serializer();
        INSTANCE = adMobNativeAdContent$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.admob.AdMobNativeAdContent", adMobNativeAdContent$$serializer, 20);
        setanimationsloop.onWarmupCompleted("headline", false);
        setanimationsloop.onWarmupCompleted("callToAction", false);
        setanimationsloop.onWarmupCompleted("body", false);
        setanimationsloop.onWarmupCompleted("aspectRatio", false);
        setanimationsloop.onWarmupCompleted("starRating", false);
        setanimationsloop.onWarmupCompleted("store", false);
        setanimationsloop.onWarmupCompleted("price", false);
        setanimationsloop.onWarmupCompleted("advertiser", false);
        setanimationsloop.onWarmupCompleted("extras", false);
        setanimationsloop.onWarmupCompleted("responseId", false);
        setanimationsloop.onWarmupCompleted("responseExtras", false);
        setanimationsloop.onWarmupCompleted("adSourceId", false);
        setanimationsloop.onWarmupCompleted("adSourceInstanceId", false);
        setanimationsloop.onWarmupCompleted("adSourceInstanceName", false);
        setanimationsloop.onWarmupCompleted("adSourceName", false);
        setanimationsloop.onWarmupCompleted("adapterClassName", false);
        setanimationsloop.onWarmupCompleted("latencyMillis", false);
        setanimationsloop.onWarmupCompleted(TsmResponse.errorCode, false);
        setanimationsloop.onWarmupCompleted(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, false);
        setanimationsloop.onWarmupCompleted("errorDomain", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private AdMobNativeAdContent$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = AdMobNativeAdContent.onWarmupCompleted();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(dj3.onWarmupCompleted), sp.IAuthTabCallback(setVideoListener.onWarmupCompleted), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[8].getValue()), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[10].getValue()), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(oty1.onExtraCallback), sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onNavigationEvent + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AdMobNativeAdContent deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Map map;
        String str;
        String str2;
        String str3;
        String str4;
        Double d;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Map map2;
        String str10;
        String str11;
        String str12;
        Integer num;
        String str13;
        String str14;
        int i;
        Long l;
        Float f;
        String str15;
        int i2;
        String str16;
        int i3;
        String str17;
        Lazy[] lazyArr;
        Map map3;
        String str18;
        Lazy[] lazyArr2;
        String str19;
        String str20;
        Map map4;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = AdMobNativeAdContent.onWarmupCompleted();
        Long l2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i7 = onExtraCallback + 51;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str23 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            Float f2 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, dj3.onWarmupCompleted, (Object) null);
            Double d2 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setVideoListener.onWarmupCompleted, (Object) null);
            String str24 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            String str25 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            Map map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, (jp) lazyArrOnWarmupCompleted[8].getValue(), (Object) null);
            String str26 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, (Object) null);
            Map map6 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, (jp) lazyArrOnWarmupCompleted[10].getValue(), (Object) null);
            String str27 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, getwrigglelayout, (Object) null);
            String str28 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, (Object) null);
            String str29 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, getwrigglelayout, (Object) null);
            String str30 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, getwrigglelayout, (Object) null);
            String str31 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, getwrigglelayout, (Object) null);
            Long l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, oty1.onExtraCallback, (Object) null);
            Integer num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, getDynamicHeight.onWarmupCompleted, (Object) null);
            String str32 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 18, getwrigglelayout, (Object) null);
            String str33 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19, getwrigglelayout, (Object) null);
            int i9 = onNavigationEvent + 95;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 / 3;
            }
            num = num2;
            str9 = str33;
            str12 = str32;
            map2 = map5;
            l = l3;
            f = f2;
            str6 = str23;
            str5 = str26;
            str4 = str30;
            d = d2;
            str13 = str22;
            str2 = str27;
            str11 = str21;
            str14 = str25;
            i = 1048575;
            str7 = str24;
            str10 = str31;
            map = map6;
            str3 = str29;
            str = str28;
        } else {
            int i11 = 0;
            boolean z = true;
            String str34 = null;
            Map map7 = null;
            String str35 = null;
            String str36 = null;
            Map map8 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            Integer num3 = null;
            String str42 = null;
            String str43 = null;
            Float f3 = null;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            Double d3 = null;
            String str47 = null;
            while (z) {
                Map map9 = map7;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        str36 = str36;
                        str35 = str35;
                        map7 = map9;
                        lazyArrOnWarmupCompleted = lazyArrOnWarmupCompleted;
                    case 0:
                        str17 = str34;
                        lazyArr = lazyArrOnWarmupCompleted;
                        map3 = map9;
                        str46 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str46);
                        i11 |= 1;
                        str36 = str36;
                        str35 = str35;
                        map7 = map3;
                        lazyArrOnWarmupCompleted = lazyArr;
                        str34 = str17;
                    case 1:
                        str18 = str34;
                        lazyArr2 = lazyArrOnWarmupCompleted;
                        str19 = str35;
                        str20 = str36;
                        map4 = map9;
                        str45 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str45);
                        i11 |= 2;
                        str44 = str44;
                        str35 = str19;
                        lazyArrOnWarmupCompleted = lazyArr2;
                        str34 = str18;
                        str36 = str20;
                        map7 = map4;
                    case 2:
                        str18 = str34;
                        lazyArr2 = lazyArrOnWarmupCompleted;
                        str19 = str35;
                        str20 = str36;
                        map4 = map9;
                        str44 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str44);
                        i11 |= 4;
                        f3 = f3;
                        str35 = str19;
                        lazyArrOnWarmupCompleted = lazyArr2;
                        str34 = str18;
                        str36 = str20;
                        map7 = map4;
                    case 3:
                        str18 = str34;
                        lazyArr2 = lazyArrOnWarmupCompleted;
                        str19 = str35;
                        str20 = str36;
                        map4 = map9;
                        f3 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, dj3.onWarmupCompleted, f3);
                        i11 |= 8;
                        d3 = d3;
                        str35 = str19;
                        lazyArrOnWarmupCompleted = lazyArr2;
                        str34 = str18;
                        str36 = str20;
                        map7 = map4;
                    case 4:
                        str18 = str34;
                        lazyArr2 = lazyArrOnWarmupCompleted;
                        str19 = str35;
                        str20 = str36;
                        map4 = map9;
                        d3 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setVideoListener.onWarmupCompleted, d3);
                        i11 |= 16;
                        str42 = str42;
                        str35 = str19;
                        lazyArrOnWarmupCompleted = lazyArr2;
                        str34 = str18;
                        str36 = str20;
                        map7 = map4;
                    case 5:
                        str18 = str34;
                        lazyArr2 = lazyArrOnWarmupCompleted;
                        str19 = str35;
                        str20 = str36;
                        map4 = map9;
                        str42 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str42);
                        i11 |= 32;
                        str47 = str47;
                        str43 = str43;
                        str35 = str19;
                        lazyArrOnWarmupCompleted = lazyArr2;
                        str34 = str18;
                        str36 = str20;
                        map7 = map4;
                    case 6:
                        str18 = str34;
                        lazyArr2 = lazyArrOnWarmupCompleted;
                        str20 = str36;
                        map4 = map9;
                        str19 = str35;
                        str43 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str43);
                        i11 |= 64;
                        str35 = str19;
                        lazyArrOnWarmupCompleted = lazyArr2;
                        str34 = str18;
                        str36 = str20;
                        map7 = map4;
                    case 7:
                        str17 = str34;
                        lazyArr = lazyArrOnWarmupCompleted;
                        map3 = map9;
                        str47 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, str47);
                        i11 |= 128;
                        str36 = str36;
                        map7 = map3;
                        lazyArrOnWarmupCompleted = lazyArr;
                        str34 = str17;
                    case 8:
                        str17 = str34;
                        jp jpVar = (jp) lazyArrOnWarmupCompleted[8].getValue();
                        i11 |= 256;
                        str36 = str36;
                        lazyArrOnWarmupCompleted = lazyArrOnWarmupCompleted;
                        map7 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, jpVar, map9);
                        str34 = str17;
                    case 9:
                        str36 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, str36);
                        i11 |= 512;
                        str34 = str34;
                        map7 = map9;
                    case 10:
                        str15 = str36;
                        map8 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, (jp) lazyArrOnWarmupCompleted[10].getValue(), map8);
                        i11 |= 1024;
                        map7 = map9;
                        str36 = str15;
                    case 11:
                        str15 = str36;
                        str39 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, getWriggleLayout.onNavigationEvent, str39);
                        i11 |= 2048;
                        map7 = map9;
                        str36 = str15;
                    case 12:
                        str15 = str36;
                        str38 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, str38);
                        i11 |= 4096;
                        map7 = map9;
                        str36 = str15;
                    case 13:
                        str15 = str36;
                        str40 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, getWriggleLayout.onNavigationEvent, str40);
                        i11 |= 8192;
                        map7 = map9;
                        str36 = str15;
                    case 14:
                        str15 = str36;
                        str41 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, getWriggleLayout.onNavigationEvent, str41);
                        i11 |= 16384;
                        map7 = map9;
                        str36 = str15;
                    case 15:
                        str15 = str36;
                        str34 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, getWriggleLayout.onNavigationEvent, str34);
                        String str48 = str35;
                        i2 = 32768;
                        str16 = str48;
                        i11 |= i2;
                        str35 = str16;
                        map7 = map9;
                        str36 = str15;
                    case 16:
                        str15 = str36;
                        i3 = 65536;
                        l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, oty1.onExtraCallback, l2);
                        str16 = str35;
                        i2 = i3;
                        i11 |= i2;
                        str35 = str16;
                        map7 = map9;
                        str36 = str15;
                    case 17:
                        str15 = str36;
                        i3 = 131072;
                        num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, getDynamicHeight.onWarmupCompleted, num3);
                        str16 = str35;
                        i2 = i3;
                        i11 |= i2;
                        str35 = str16;
                        map7 = map9;
                        str36 = str15;
                    case 18:
                        str15 = str36;
                        i3 = 262144;
                        str37 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 18, getWriggleLayout.onNavigationEvent, str37);
                        str16 = str35;
                        i2 = i3;
                        i11 |= i2;
                        str35 = str16;
                        map7 = map9;
                        str36 = str15;
                    case 19:
                        str15 = str36;
                        str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19, getWriggleLayout.onNavigationEvent, str35);
                        int i12 = onExtraCallback + 93;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        i2 = 524288;
                        i11 |= i2;
                        str35 = str16;
                        map7 = map9;
                        str36 = str15;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            map = map8;
            str = str38;
            str2 = str39;
            str3 = str40;
            str4 = str41;
            d = d3;
            str5 = str36;
            str6 = str44;
            str7 = str42;
            str8 = str43;
            str9 = str35;
            map2 = map7;
            str10 = str34;
            str11 = str46;
            str12 = str37;
            num = num3;
            str13 = str45;
            str14 = str47;
            i = i11;
            l = l2;
            f = f3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AdMobNativeAdContent(i, str11, str13, str6, f, d, str7, str8, str14, map2, str5, map, str2, str, str3, str4, str10, l, num, str12, str9, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m81deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AdMobNativeAdContent adMobNativeAdContent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(adMobNativeAdContent, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AdMobNativeAdContent.IAuthTabCallback(adMobNativeAdContent, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(adMobNativeAdContent, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AdMobNativeAdContent.IAuthTabCallback(adMobNativeAdContent, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AdMobNativeAdContent) obj);
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

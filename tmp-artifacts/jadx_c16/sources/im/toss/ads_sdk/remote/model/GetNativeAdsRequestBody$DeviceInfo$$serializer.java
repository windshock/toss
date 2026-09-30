package im.toss.ads_sdk.remote.model;

import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
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
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GetNativeAdsRequestBody$DeviceInfo$$serializer implements aeu2<GetNativeAdsRequestBody.DeviceInfo> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final GetNativeAdsRequestBody$DeviceInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        GetNativeAdsRequestBody$DeviceInfo$$serializer getNativeAdsRequestBody$DeviceInfo$$serializer = new GetNativeAdsRequestBody$DeviceInfo$$serializer();
        INSTANCE = getNativeAdsRequestBody$DeviceInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody.DeviceInfo", getNativeAdsRequestBody$DeviceInfo$$serializer, 23);
        setanimationsloop.onWarmupCompleted("os", true);
        setanimationsloop.onWarmupCompleted("osVersion", true);
        setanimationsloop.onWarmupCompleted("ua", true);
        setanimationsloop.onWarmupCompleted("ifa", true);
        setanimationsloop.onWarmupCompleted("ifv", true);
        setanimationsloop.onWarmupCompleted("attStatus", true);
        setanimationsloop.onWarmupCompleted("model", true);
        setanimationsloop.onWarmupCompleted("carrier", true);
        setanimationsloop.onWarmupCompleted("screenReaderEnabled", true);
        setanimationsloop.onWarmupCompleted("batteryLevel", true);
        setanimationsloop.onWarmupCompleted("networkType", true);
        setanimationsloop.onWarmupCompleted("sessionDuration", true);
        setanimationsloop.onWarmupCompleted("audioState", true);
        setanimationsloop.onWarmupCompleted("theme", true);
        setanimationsloop.onWarmupCompleted("fontScale", true);
        setanimationsloop.onWarmupCompleted("isVoiceOver", true);
        setanimationsloop.onWarmupCompleted("width", true);
        setanimationsloop.onWarmupCompleted("height", true);
        setanimationsloop.onWarmupCompleted("isLowPowerMode", true);
        setanimationsloop.onWarmupCompleted("animationScale", true);
        setanimationsloop.onWarmupCompleted("webViewVersion", true);
        setanimationsloop.onWarmupCompleted("pixelRatio", true);
        setanimationsloop.onWarmupCompleted("isCharging", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private GetNativeAdsRequestBody$DeviceInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        dj3 dj3Var = dj3.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {((Lazy[]) GetNativeAdsRequestBody.DeviceInfo.onExtraCallback(iOnExtraCallbackWithResult, 1093344459, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, -1093344456, new Object[0], iOnExtraCallbackWithResult2))[0].getValue(), getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getbgcolor, sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(oty1.onExtraCallback), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(getbgcolor), sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(getbgcolor), sp.IAuthTabCallback(dj3Var), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(dj3Var), sp.IAuthTabCallback(getbgcolor)};
        int i4 = onNavigationEvent + 51;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GetNativeAdsRequestBody.DeviceInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        GetNativeAdsRequestBody.DeviceInfo.Os os;
        int i;
        Boolean bool;
        Integer num;
        Integer num2;
        Integer num3;
        Float f;
        String str2;
        Float f2;
        Boolean bool2;
        String str3;
        Boolean bool3;
        String str4;
        String strAsInterface;
        String str5;
        boolean z;
        String str6;
        String str7;
        Long l;
        String str8;
        String str9;
        Integer num4;
        String str10;
        int i2;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        int i3;
        Boolean bool7;
        Lazy[] lazyArr;
        Boolean bool8;
        int i4;
        char c;
        Boolean bool9;
        String str11;
        Boolean bool10;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        Lazy[] lazyArr2 = (Lazy[]) GetNativeAdsRequestBody.DeviceInfo.onExtraCallback(iOnExtraCallbackWithResult, 1093344459, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1093344456, new Object[0], iOnExtraCallbackWithResult2);
        Long l2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            GetNativeAdsRequestBody.DeviceInfo.Os os2 = (GetNativeAdsRequestBody.DeviceInfo.Os) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArr2[0].getValue(), (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8);
            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
            num4 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getdynamicheight, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getwrigglelayout, (Object) null);
            Long l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, oty1.onExtraCallback, (Object) null);
            String str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, (Object) null);
            String str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, getwrigglelayout, (Object) null);
            num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, getdynamicheight, (Object) null);
            getBgColor getbgcolor = getBgColor.IAuthTabCallback;
            bool3 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, getbgcolor, (Object) null);
            num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, getdynamicheight, (Object) null);
            Integer num5 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, getdynamicheight, (Object) null);
            Boolean bool11 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 18, getbgcolor, (Object) null);
            dj3 dj3Var = dj3.onWarmupCompleted;
            str3 = strAsInterface2;
            Float f3 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19, dj3Var, (Object) null);
            String str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 20, getwrigglelayout, (Object) null);
            Float f4 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 21, dj3Var, (Object) null);
            bool = bool11;
            str6 = str13;
            str2 = str15;
            z = zOnExtraCallbackWithResult;
            os = os2;
            bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 22, getbgcolor, (Object) null);
            str9 = strAsInterface7;
            str10 = strAsInterface4;
            str = strAsInterface3;
            f = f4;
            i = 8388607;
            str8 = str12;
            l = l3;
            f2 = f3;
            str4 = strAsInterface6;
            str5 = strAsInterface5;
            num = num5;
            str7 = str14;
        } else {
            boolean zOnExtraCallbackWithResult2 = false;
            int i6 = 0;
            boolean z2 = true;
            Boolean bool12 = null;
            str = null;
            Boolean bool13 = null;
            Integer num6 = null;
            Integer num7 = null;
            Integer num8 = null;
            String str16 = null;
            Float f5 = null;
            String str17 = null;
            String str18 = null;
            Float f6 = null;
            GetNativeAdsRequestBody.DeviceInfo.Os os3 = null;
            String strAsInterface8 = null;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            String strAsInterface11 = null;
            String strAsInterface12 = null;
            String strAsInterface13 = null;
            Boolean bool14 = null;
            Integer num9 = null;
            String str19 = null;
            while (z2) {
                int i7 = IAuthTabCallback + 49;
                String strAsInterface14 = str;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        bool7 = bool12;
                        lazyArr = lazyArr2;
                        bool8 = bool13;
                        i4 = i6;
                        c = 2;
                        z2 = false;
                        lazyArr2 = lazyArr;
                        bool13 = bool8;
                        str = strAsInterface14;
                        i6 = i4;
                        bool12 = bool7;
                    case 0:
                        bool7 = bool12;
                        bool8 = bool13;
                        c = 2;
                        lazyArr = lazyArr2;
                        os3 = (GetNativeAdsRequestBody.DeviceInfo.Os) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArr2[0].getValue(), os3);
                        i4 = i6 | 1;
                        lazyArr2 = lazyArr;
                        bool13 = bool8;
                        str = strAsInterface14;
                        i6 = i4;
                        bool12 = bool7;
                    case 1:
                        bool7 = bool12;
                        bool9 = bool13;
                        int i8 = i6;
                        str11 = str19;
                        bool10 = bool14;
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i4 = i8 | 2;
                        int i9 = IAuthTabCallback + 113;
                        onNavigationEvent = i9 % 128;
                        c = 2;
                        int i10 = i9 % 2;
                        str19 = str11;
                        bool13 = bool9;
                        bool14 = bool10;
                        str = strAsInterface14;
                        i6 = i4;
                        bool12 = bool7;
                    case 2:
                        bool7 = bool12;
                        bool9 = bool13;
                        int i11 = i6;
                        str11 = str19;
                        bool10 = bool14;
                        i4 = i11 | 4;
                        strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        num9 = num9;
                        int i92 = IAuthTabCallback + 113;
                        onNavigationEvent = i92 % 128;
                        c = 2;
                        int i102 = i92 % 2;
                        str19 = str11;
                        bool13 = bool9;
                        bool14 = bool10;
                        str = strAsInterface14;
                        i6 = i4;
                        bool12 = bool7;
                    case 3:
                        bool7 = bool12;
                        bool9 = bool13;
                        int i12 = i6;
                        str11 = str19;
                        bool10 = bool14;
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i4 = i12 | 8;
                        int i922 = IAuthTabCallback + 113;
                        onNavigationEvent = i922 % 128;
                        c = 2;
                        int i1022 = i922 % 2;
                        str19 = str11;
                        bool13 = bool9;
                        bool14 = bool10;
                        str = strAsInterface14;
                        i6 = i4;
                        bool12 = bool7;
                    case 4:
                        bool7 = bool12;
                        bool9 = bool13;
                        int i13 = i6;
                        str11 = str19;
                        bool10 = bool14;
                        strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i4 = i13 | 16;
                        int i9222 = IAuthTabCallback + 113;
                        onNavigationEvent = i9222 % 128;
                        c = 2;
                        int i10222 = i9222 % 2;
                        str19 = str11;
                        bool13 = bool9;
                        bool14 = bool10;
                        str = strAsInterface14;
                        i6 = i4;
                        bool12 = bool7;
                    case 5:
                        bool7 = bool12;
                        bool9 = bool13;
                        int i14 = i6;
                        str11 = str19;
                        bool10 = bool14;
                        strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i4 = i14 | 32;
                        int i92222 = IAuthTabCallback + 113;
                        onNavigationEvent = i92222 % 128;
                        c = 2;
                        int i102222 = i92222 % 2;
                        str19 = str11;
                        bool13 = bool9;
                        bool14 = bool10;
                        str = strAsInterface14;
                        i6 = i4;
                        bool12 = bool7;
                    case 6:
                        bool7 = bool12;
                        bool9 = bool13;
                        int i15 = i6;
                        str11 = str19;
                        bool10 = bool14;
                        strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i4 = i15 | 64;
                        int i922222 = IAuthTabCallback + 113;
                        onNavigationEvent = i922222 % 128;
                        c = 2;
                        int i1022222 = i922222 % 2;
                        str19 = str11;
                        bool13 = bool9;
                        bool14 = bool10;
                        str = strAsInterface14;
                        i6 = i4;
                        bool12 = bool7;
                    case 7:
                        bool7 = bool12;
                        bool9 = bool13;
                        int i16 = i6;
                        str11 = str19;
                        bool10 = bool14;
                        strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
                        i4 = i16 | 128;
                        int i9222222 = IAuthTabCallback + 113;
                        onNavigationEvent = i9222222 % 128;
                        c = 2;
                        int i10222222 = i9222222 % 2;
                        str19 = str11;
                        bool13 = bool9;
                        bool14 = bool10;
                        str = strAsInterface14;
                        i6 = i4;
                        bool12 = bool7;
                    case 8:
                        bool7 = bool12;
                        bool9 = bool13;
                        int i17 = i6;
                        str11 = str19;
                        bool10 = bool14;
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8);
                        i4 = i17 | 256;
                        int i92222222 = IAuthTabCallback + 113;
                        onNavigationEvent = i92222222 % 128;
                        c = 2;
                        int i102222222 = i92222222 % 2;
                        str19 = str11;
                        bool13 = bool9;
                        bool14 = bool10;
                        str = strAsInterface14;
                        i6 = i4;
                        bool12 = bool7;
                    case 9:
                        bool7 = bool12;
                        bool9 = bool13;
                        int i18 = i6;
                        bool10 = bool14;
                        str11 = str19;
                        num9 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getDynamicHeight.onWarmupCompleted, num9);
                        i4 = i18 | 512;
                        int i922222222 = IAuthTabCallback + 113;
                        onNavigationEvent = i922222222 % 128;
                        c = 2;
                        int i1022222222 = i922222222 % 2;
                        str19 = str11;
                        bool13 = bool9;
                        bool14 = bool10;
                        str = strAsInterface14;
                        i6 = i4;
                        bool12 = bool7;
                    case 10:
                        str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getWriggleLayout.onNavigationEvent, str19);
                        i2 = i6 | 1024;
                        bool12 = bool12;
                        bool13 = bool13;
                        str = strAsInterface14;
                        i6 = i2;
                    case 11:
                        bool4 = bool12;
                        l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, oty1.onExtraCallback, l2);
                        i2 = i6 | 2048;
                        bool12 = bool4;
                        str = strAsInterface14;
                        i6 = i2;
                    case 12:
                        bool4 = bool12;
                        str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, str16);
                        i2 = i6 | 4096;
                        bool12 = bool4;
                        str = strAsInterface14;
                        i6 = i2;
                    case 13:
                        bool4 = bool12;
                        str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, getWriggleLayout.onNavigationEvent, str17);
                        i2 = i6 | 8192;
                        bool12 = bool4;
                        str = strAsInterface14;
                        i6 = i2;
                    case 14:
                        num8 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, getDynamicHeight.onWarmupCompleted, num8);
                        i2 = i6 | 16384;
                        bool12 = bool12;
                        bool14 = bool14;
                        str = strAsInterface14;
                        i6 = i2;
                    case 15:
                        bool5 = bool12;
                        bool6 = bool14;
                        bool13 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, getBgColor.IAuthTabCallback, bool13);
                        i3 = 32768;
                        i6 |= i3;
                        bool14 = bool6;
                        bool12 = bool5;
                        str = strAsInterface14;
                    case 16:
                        bool5 = bool12;
                        bool6 = bool14;
                        num7 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, getDynamicHeight.onWarmupCompleted, num7);
                        i3 = 65536;
                        i6 |= i3;
                        bool14 = bool6;
                        bool12 = bool5;
                        str = strAsInterface14;
                    case 17:
                        bool5 = bool12;
                        bool6 = bool14;
                        num6 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, getDynamicHeight.onWarmupCompleted, num6);
                        i3 = 131072;
                        i6 |= i3;
                        bool14 = bool6;
                        bool12 = bool5;
                        str = strAsInterface14;
                    case 18:
                        bool5 = bool12;
                        bool14 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 18, getBgColor.IAuthTabCallback, bool14);
                        i3 = 262144;
                        bool6 = bool14;
                        i6 |= i3;
                        bool14 = bool6;
                        bool12 = bool5;
                        str = strAsInterface14;
                    case 19:
                        f6 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19, dj3.onWarmupCompleted, f6);
                        i3 = 524288;
                        bool5 = bool12;
                        bool6 = bool14;
                        i6 |= i3;
                        bool14 = bool6;
                        bool12 = bool5;
                        str = strAsInterface14;
                    case 20:
                        str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 20, getWriggleLayout.onNavigationEvent, str18);
                        i3 = 1048576;
                        bool5 = bool12;
                        bool6 = bool14;
                        i6 |= i3;
                        bool14 = bool6;
                        bool12 = bool5;
                        str = strAsInterface14;
                    case 21:
                        f5 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 21, dj3.onWarmupCompleted, f5);
                        i3 = 2097152;
                        bool5 = bool12;
                        bool6 = bool14;
                        i6 |= i3;
                        bool14 = bool6;
                        bool12 = bool5;
                        str = strAsInterface14;
                    case 22:
                        bool12 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 22, getBgColor.IAuthTabCallback, bool12);
                        i3 = 4194304;
                        bool5 = bool12;
                        bool6 = bool14;
                        i6 |= i3;
                        bool14 = bool6;
                        bool12 = bool5;
                        str = strAsInterface14;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            Boolean bool15 = bool12;
            os = os3;
            i = i6;
            bool = bool14;
            num = num6;
            num2 = num7;
            num3 = num8;
            f = f5;
            str2 = str18;
            f2 = f6;
            bool2 = bool15;
            str3 = strAsInterface8;
            bool3 = bool13;
            str4 = strAsInterface11;
            strAsInterface = strAsInterface12;
            str5 = strAsInterface13;
            z = zOnExtraCallbackWithResult2;
            str6 = str16;
            str7 = str17;
            l = l2;
            str8 = str19;
            str9 = strAsInterface10;
            num4 = num9;
            str10 = strAsInterface9;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new GetNativeAdsRequestBody.DeviceInfo(i, os, str3, str, str10, str5, strAsInterface, str4, str9, z, num4, str8, l, str6, str7, num3, bool3, num2, num, bool, f2, str2, f, bool2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        GetNativeAdsRequestBody.DeviceInfo deviceInfoDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallback + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return deviceInfoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetNativeAdsRequestBody.DeviceInfo deviceInfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(deviceInfo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            GetNativeAdsRequestBody.DeviceInfo.onNavigationEvent(deviceInfo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(deviceInfo, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        GetNativeAdsRequestBody.DeviceInfo.onNavigationEvent(deviceInfo, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetNativeAdsRequestBody.DeviceInfo) obj);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        int i5 = IAuthTabCallback + 105;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

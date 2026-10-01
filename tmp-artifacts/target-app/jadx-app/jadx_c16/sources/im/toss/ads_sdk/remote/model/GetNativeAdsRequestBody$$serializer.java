package im.toss.ads_sdk.remote.model;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GetNativeAdsRequestBody$$serializer implements aeu2<GetNativeAdsRequestBody> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final GetNativeAdsRequestBody$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static long onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 41;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        GetNativeAdsRequestBody$$serializer getNativeAdsRequestBody$$serializer = new GetNativeAdsRequestBody$$serializer();
        INSTANCE = getNativeAdsRequestBody$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody", getNativeAdsRequestBody$$serializer, 14);
        Object[] objArr = new Object[1];
        a(new char[]{43936, 43987, 32759, 64179, 53934, 11781, 22998, 9803, 60877, 59432, 5073, 59465, 10180, 41516, 54723}, View.getDefaultSize(0, 0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("placements", true);
        setanimationsloop.onWarmupCompleted("sdkVersion", true);
        setanimationsloop.onWarmupCompleted("specVersion", true);
        Object[] objArr2 = new Object[1];
        a(new char[]{19968, 20083, 34244, 3494, 13488, 54307, 44753, 49221, 2145, 4641, 58564, 3703, 49780}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("platform", true);
        Object[] objArr3 = new Object[1];
        a(new char[]{3908, 3895, 4788, 33061, 39747, 17234, 8778, 28556, 18728}, Drawable.resolveOpacity(0, 0), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        Object[] objArr4 = new Object[1];
        a(new char[]{5718, 5687, 34440, 14859, 515, 55164, 39278, 63212, 20530, 4451, 54117, 14561, 39459, 23369, 5483, 33516, 50210, 42359, 20318, 50425, 3589}, ViewConfiguration.getScrollBarSize() >> 8, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        Object[] objArr5 = new Object[1];
        a(new char[]{9612, 9709, 29724, 43527, 21047, 9710, 2419}, (-1) - TextUtils.lastIndexOf("", '0'), objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("device", true);
        Object[] objArr6 = new Object[1];
        a(new char[]{12455, 12488, 1329, 7979, 24222, 21699, 48219, 43633, 30400, 37589, 63060}, View.MeasureSpec.getMode(0), objArr6);
        setanimationsloop.onWarmupCompleted(((String) objArr6[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("productType", true);
        Object[] objArr7 = new Object[1];
        a(new char[]{1027, 1137, 52614, 58615, 19497, 40033, 18325, 47306, 17017, 23166, 3486, 30421}, TextUtils.lastIndexOf("", '0', 0) + 1, objArr7);
        setanimationsloop.onWarmupCompleted(((String) objArr7[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("supportedSdkTemplateIds", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 69;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 41 / 0;
        }
    }

    private GetNativeAdsRequestBody$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = GetNativeAdsRequestBody.IAuthTabCallback();
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[1].getValue()), kSerializer, sp.IAuthTabCallback(kSerializer), kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[7].getValue()), GetNativeAdsRequestBody$AppInfo$$serializer.INSTANCE, GetNativeAdsRequestBody$DeviceInfo$$serializer.INSTANCE, sp.IAuthTabCallback(GetNativeAdsRequestBody$AdRequestOption$$serializer.INSTANCE), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[13].getValue())};
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GetNativeAdsRequestBody deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        List list;
        String str;
        String str2;
        String str3;
        List list2;
        String str4;
        GetNativeAdsRequestBody.AppInfo appInfo;
        Set set;
        GetNativeAdsRequestBody.DeviceInfo deviceInfo;
        String str5;
        String str6;
        GetNativeAdsRequestBody.AdRequestOption adRequestOption;
        int i;
        String str7;
        Lazy[] lazyArr;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 59;
        onNavigationEvent = i4 % 128;
        GetNativeAdsRequestBody.AdRequestOption adRequestOption2 = null;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            GetNativeAdsRequestBody.IAuthTabCallback();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = GetNativeAdsRequestBody.IAuthTabCallback();
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            int i5 = IAuthTabCallback + 13;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str8 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            List list3 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
            String str9 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String strAsInterface3 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 4);
            String strAsInterface4 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 5);
            String str10 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            Set set2 = (Set) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrIAuthTabCallback[7].getValue(), (Object) null);
            GetNativeAdsRequestBody.AppInfo appInfo2 = (GetNativeAdsRequestBody.AppInfo) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 8, GetNativeAdsRequestBody$AppInfo$$serializer.INSTANCE, (Object) null);
            GetNativeAdsRequestBody.DeviceInfo deviceInfo2 = (GetNativeAdsRequestBody.DeviceInfo) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 9, GetNativeAdsRequestBody$DeviceInfo$$serializer.INSTANCE, (Object) null);
            GetNativeAdsRequestBody.AdRequestOption adRequestOption3 = (GetNativeAdsRequestBody.AdRequestOption) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 10, GetNativeAdsRequestBody$AdRequestOption$$serializer.INSTANCE, (Object) null);
            String str11 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 11, getwrigglelayout, (Object) null);
            String str12 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, (Object) null);
            i = 16383;
            list = list3;
            str7 = strAsInterface4;
            appInfo = appInfo2;
            adRequestOption = adRequestOption3;
            strAsInterface = strAsInterface2;
            list2 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 13, (jp) lazyArrIAuthTabCallback[13].getValue(), (Object) null);
            str2 = str8;
            str5 = strAsInterface3;
            str6 = str11;
            str4 = str12;
            set = set2;
            str = str9;
            deviceInfo = deviceInfo2;
            str3 = str10;
        } else {
            strAsInterface = null;
            String str13 = null;
            GetNativeAdsRequestBody.AppInfo appInfo3 = null;
            String str14 = null;
            Set set3 = null;
            String str15 = null;
            GetNativeAdsRequestBody.DeviceInfo deviceInfo3 = null;
            String str16 = null;
            List list4 = null;
            String strAsInterface5 = null;
            String str17 = null;
            String strAsInterface6 = null;
            boolean z = true;
            int i7 = 0;
            List list5 = null;
            while (z) {
                int i8 = onNavigationEvent + 7;
                IAuthTabCallback = i8 % 128;
                if (i8 % i2 != 0) {
                    ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        lazyArr = lazyArrIAuthTabCallback;
                        z = false;
                        lazyArrIAuthTabCallback = lazyArr;
                        i2 = 2;
                    case 0:
                        lazyArr = lazyArrIAuthTabCallback;
                        str16 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str16);
                        i7 |= 1;
                        list4 = list4;
                        lazyArrIAuthTabCallback = lazyArr;
                        i2 = 2;
                    case 1:
                        lazyArr = lazyArrIAuthTabCallback;
                        list4 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list4);
                        i7 |= 2;
                        lazyArrIAuthTabCallback = lazyArr;
                        i2 = 2;
                    case 2:
                        strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, i2);
                        i7 |= 4;
                    case 3:
                        str17 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str17);
                        i7 |= 8;
                        i2 = 2;
                    case 4:
                        strAsInterface6 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 4);
                        i7 |= 16;
                        i2 = 2;
                    case 5:
                        strAsInterface5 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 5);
                        i7 |= 32;
                        i2 = 2;
                    case 6:
                        str14 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str14);
                        i7 |= 64;
                        i2 = 2;
                    case 7:
                        set3 = (Set) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrIAuthTabCallback[7].getValue(), set3);
                        i7 |= 128;
                    case 8:
                        appInfo3 = (GetNativeAdsRequestBody.AppInfo) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 8, GetNativeAdsRequestBody$AppInfo$$serializer.INSTANCE, appInfo3);
                        i7 |= 256;
                    case 9:
                        deviceInfo3 = (GetNativeAdsRequestBody.DeviceInfo) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 9, GetNativeAdsRequestBody$DeviceInfo$$serializer.INSTANCE, deviceInfo3);
                        i7 |= 512;
                    case 10:
                        adRequestOption2 = (GetNativeAdsRequestBody.AdRequestOption) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 10, GetNativeAdsRequestBody$AdRequestOption$$serializer.INSTANCE, adRequestOption2);
                        i7 |= 1024;
                    case 11:
                        str15 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 11, getWriggleLayout.onNavigationEvent, str15);
                        i7 |= 2048;
                    case 12:
                        str13 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, str13);
                        i7 |= 4096;
                    case 13:
                        list5 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 13, (jp) lazyArrIAuthTabCallback[13].getValue(), list5);
                        i7 |= 8192;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            list = list4;
            str = str17;
            str2 = str16;
            str3 = str14;
            list2 = list5;
            str4 = str13;
            appInfo = appInfo3;
            set = set3;
            deviceInfo = deviceInfo3;
            str5 = strAsInterface6;
            str6 = str15;
            adRequestOption = adRequestOption2;
            i = i7;
            str7 = strAsInterface5;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new GetNativeAdsRequestBody(i, str2, list, strAsInterface, str, str5, str7, str3, set, appInfo, deviceInfo, adRequestOption, str6, str4, list2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m38deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        GetNativeAdsRequestBody getNativeAdsRequestBodyDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return getNativeAdsRequestBodyDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetNativeAdsRequestBody getNativeAdsRequestBody) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(getNativeAdsRequestBody, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            GetNativeAdsRequestBody.onExtraCallback(getNativeAdsRequestBody, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(getNativeAdsRequestBody, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        GetNativeAdsRequestBody.onExtraCallback(getNativeAdsRequestBody, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 32 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetNativeAdsRequestBody) obj);
        int i4 = onNavigationEvent + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 68 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = IAuthTabCallback + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 91;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 17;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - TextUtils.indexOf("", "")), 84 - Color.blue(0), 21233 - (ViewConfiguration.getScrollBarSize() >> 8), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - TextUtils.lastIndexOf("", '0', 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, ExpandableListView.getPackedPositionChild(0L) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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

    static void onNavigationEvent() {
        onWarmupCompleted = -5962284178398500210L;
    }
}

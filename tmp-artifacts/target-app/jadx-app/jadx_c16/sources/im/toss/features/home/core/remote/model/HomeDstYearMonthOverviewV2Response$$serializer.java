package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse$;
import im.toss.features.home.core.remote.model.dst.widget.BottomCtaResponse;
import im.toss.features.home.core.remote.model.dst.widget.BottomCtaResponse$;
import im.toss.features.home.core.remote.model.dst.widget.YearMonthSelectorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.widget.YearMonthSelectorAttributeResponse$;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.TBPermissionHelper;
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
public final /* synthetic */ class HomeDstYearMonthOverviewV2Response$$serializer implements aeu2<HomeDstYearMonthOverviewV2Response> {
    public static final HomeDstYearMonthOverviewV2Response$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 55;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        HomeDstYearMonthOverviewV2Response$$serializer homeDstYearMonthOverviewV2Response$$serializer = new HomeDstYearMonthOverviewV2Response$$serializer();
        INSTANCE = homeDstYearMonthOverviewV2Response$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.HomeDstYearMonthOverviewV2Response", homeDstYearMonthOverviewV2Response$$serializer, 9);
        setanimationsloop.onWarmupCompleted("navigationBarTitle", true);
        setanimationsloop.onWarmupCompleted("navigationBarRightItems", true);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("bottomCTA", true);
        setanimationsloop.onWarmupCompleted("initializeHandler", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        setanimationsloop.onWarmupCompleted("state", true);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        setanimationsloop.onWarmupCompleted("yearMonthSelector", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
    }

    private HomeDstYearMonthOverviewV2Response$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = HomeDstYearMonthOverviewV2Response.onWarmupCompleted();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[2].getValue()), sp.IAuthTabCallback(BottomCtaResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[7].getValue()), sp.IAuthTabCallback(YearMonthSelectorAttributeResponse$.serializer.INSTANCE)};
        int i4 = onNavigationEvent + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeDstYearMonthOverviewV2Response deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        YearMonthSelectorAttributeResponse yearMonthSelectorAttributeResponse;
        Map map;
        List list;
        Map map2;
        HandlerResponse handlerResponse;
        List list2;
        ColorAttributeResponse colorAttributeResponse;
        String str;
        BottomCtaResponse bottomCtaResponse;
        ColorAttributeResponse colorAttributeResponse2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = HomeDstYearMonthOverviewV2Response.onWarmupCompleted();
        int i3 = 8;
        int i4 = 7;
        int i5 = 6;
        Map map3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onNavigationEvent + 109;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            List list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), (Object) null);
            BottomCtaResponse bottomCtaResponse2 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, (Object) null);
            HandlerResponse handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            ColorAttributeResponse colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            Map map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrOnWarmupCompleted[6].getValue(), (Object) null);
            list = list4;
            map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnWarmupCompleted[7].getValue(), (Object) null);
            str = str2;
            colorAttributeResponse = colorAttributeResponse3;
            bottomCtaResponse = bottomCtaResponse2;
            handlerResponse = handlerResponse2;
            yearMonthSelectorAttributeResponse = (YearMonthSelectorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, YearMonthSelectorAttributeResponse$.serializer.INSTANCE, (Object) null);
            i = 511;
            map = map4;
            list2 = list3;
        } else {
            int i8 = 0;
            boolean z = true;
            YearMonthSelectorAttributeResponse yearMonthSelectorAttributeResponse2 = null;
            Map map5 = null;
            List list5 = null;
            HandlerResponse handlerResponse3 = null;
            List list6 = null;
            ColorAttributeResponse colorAttributeResponse4 = null;
            String str3 = null;
            BottomCtaResponse bottomCtaResponse3 = null;
            while (!(!z)) {
                int i9 = onExtraCallback + 69;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i3 = 8;
                        i5 = 6;
                    case 0:
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i8 |= 1;
                        int i11 = onNavigationEvent + 75;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        bottomCtaResponse3 = bottomCtaResponse3;
                        colorAttributeResponse4 = colorAttributeResponse4;
                        i3 = 8;
                        i4 = 7;
                        i5 = 6;
                    case 1:
                        list6 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list6);
                        i8 |= 2;
                        bottomCtaResponse3 = bottomCtaResponse3;
                        i3 = 8;
                        i4 = 7;
                    case 2:
                        colorAttributeResponse2 = colorAttributeResponse4;
                        list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), list5);
                        i8 |= 4;
                        bottomCtaResponse3 = bottomCtaResponse3;
                        colorAttributeResponse4 = colorAttributeResponse2;
                        i3 = 8;
                        i4 = 7;
                    case 3:
                        colorAttributeResponse2 = colorAttributeResponse4;
                        bottomCtaResponse3 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse3);
                        i8 |= 8;
                        colorAttributeResponse4 = colorAttributeResponse2;
                        i3 = 8;
                        i4 = 7;
                    case 4:
                        handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse3);
                        i8 |= 16;
                        i3 = 8;
                    case 5:
                        i8 |= 32;
                        colorAttributeResponse4 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse4);
                        i3 = 8;
                    case 6:
                        map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, (jp) lazyArrOnWarmupCompleted[i5].getValue(), map5);
                        i8 |= 64;
                    case 7:
                        map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, (jp) lazyArrOnWarmupCompleted[i4].getValue(), map3);
                        i8 |= 128;
                    case 8:
                        yearMonthSelectorAttributeResponse2 = (YearMonthSelectorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, YearMonthSelectorAttributeResponse$.serializer.INSTANCE, yearMonthSelectorAttributeResponse2);
                        i8 |= 256;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i8;
            yearMonthSelectorAttributeResponse = yearMonthSelectorAttributeResponse2;
            map = map5;
            list = list5;
            map2 = map3;
            handlerResponse = handlerResponse3;
            list2 = list6;
            colorAttributeResponse = colorAttributeResponse4;
            str = str3;
            bottomCtaResponse = bottomCtaResponse3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeDstYearMonthOverviewV2Response(i, str, list2, list, bottomCtaResponse, handlerResponse, colorAttributeResponse, map, map2, yearMonthSelectorAttributeResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m542deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeDstYearMonthOverviewV2Response homeDstYearMonthOverviewV2ResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return homeDstYearMonthOverviewV2ResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeDstYearMonthOverviewV2Response homeDstYearMonthOverviewV2Response) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeDstYearMonthOverviewV2Response, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeDstYearMonthOverviewV2Response.IAuthTabCallback(homeDstYearMonthOverviewV2Response, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeDstYearMonthOverviewV2Response) obj);
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        int i5 = onNavigationEvent + 43;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

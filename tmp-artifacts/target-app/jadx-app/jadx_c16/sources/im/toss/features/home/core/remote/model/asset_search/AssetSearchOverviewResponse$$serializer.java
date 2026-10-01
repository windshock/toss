package im.toss.features.home.core.remote.model.asset_search;

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
public final /* synthetic */ class AssetSearchOverviewResponse$$serializer implements aeu2<AssetSearchOverviewResponse> {
    public static final AssetSearchOverviewResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        AssetSearchOverviewResponse$$serializer assetSearchOverviewResponse$$serializer = new AssetSearchOverviewResponse$$serializer();
        INSTANCE = assetSearchOverviewResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.asset_search.AssetSearchOverviewResponse", assetSearchOverviewResponse$$serializer, 10);
        setanimationsloop.onWarmupCompleted("navigationBarTitle", true);
        setanimationsloop.onWarmupCompleted("navigationBarRightItems", true);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("bottomCTA", true);
        setanimationsloop.onWarmupCompleted("initializeHandler", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        setanimationsloop.onWarmupCompleted("state", true);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        setanimationsloop.onWarmupCompleted("searchKeywords", false);
        setanimationsloop.onWarmupCompleted("yearMonthSelector", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 47;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private AssetSearchOverviewResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrAsInterface = AssetSearchOverviewResponse.asInterface();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) lazyArrAsInterface[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrAsInterface[2].getValue()), sp.IAuthTabCallback(BottomCtaResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrAsInterface[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrAsInterface[7].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrAsInterface[8].getValue()), sp.IAuthTabCallback(YearMonthSelectorAttributeResponse$.serializer.INSTANCE)};
        int i4 = onExtraCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AssetSearchOverviewResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Map map;
        List list;
        YearMonthSelectorAttributeResponse yearMonthSelectorAttributeResponse;
        Map map2;
        int i;
        ColorAttributeResponse colorAttributeResponse;
        Map map3;
        BottomCtaResponse bottomCtaResponse;
        List list2;
        HandlerResponse handlerResponse;
        String str;
        List list3;
        ColorAttributeResponse colorAttributeResponse2;
        HandlerResponse handlerResponse2;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrAsInterface = AssetSearchOverviewResponse.asInterface();
        int i4 = 9;
        int i5 = 7;
        int i6 = 6;
        int i7 = 8;
        YearMonthSelectorAttributeResponse yearMonthSelectorAttributeResponse2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i8 = onExtraCallbackWithResult + 87;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrAsInterface[1].getValue(), (Object) null);
            List list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrAsInterface[2].getValue(), (Object) null);
            BottomCtaResponse bottomCtaResponse2 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, (Object) null);
            HandlerResponse handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            ColorAttributeResponse colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            Map map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrAsInterface[6].getValue(), (Object) null);
            Map map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrAsInterface[7].getValue(), (Object) null);
            map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, (jp) lazyArrAsInterface[8].getValue(), (Object) null);
            yearMonthSelectorAttributeResponse = (YearMonthSelectorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, YearMonthSelectorAttributeResponse$.serializer.INSTANCE, (Object) null);
            colorAttributeResponse = colorAttributeResponse3;
            handlerResponse = handlerResponse3;
            map = map5;
            map3 = map4;
            list = list4;
            list2 = list5;
            str = str2;
            bottomCtaResponse = bottomCtaResponse2;
            i = 1023;
        } else {
            int i10 = 0;
            boolean z = true;
            Map map6 = null;
            Map map7 = null;
            BottomCtaResponse bottomCtaResponse3 = null;
            List list6 = null;
            Map map8 = null;
            List list7 = null;
            ColorAttributeResponse colorAttributeResponse4 = null;
            HandlerResponse handlerResponse4 = null;
            String str3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        list3 = list7;
                        colorAttributeResponse2 = colorAttributeResponse4;
                        handlerResponse2 = handlerResponse4;
                        z = false;
                        colorAttributeResponse4 = colorAttributeResponse2;
                        handlerResponse4 = handlerResponse2;
                        list7 = list3;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                    case 0:
                        list3 = list7;
                        colorAttributeResponse2 = colorAttributeResponse4;
                        handlerResponse2 = handlerResponse4;
                        String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i10 |= 1;
                        int i11 = onExtraCallbackWithResult + 91;
                        onExtraCallback = i11 % 128;
                        i2 = 2;
                        if (i11 % 2 != 0) {
                            int i12 = 3 % 2;
                        }
                        str3 = str4;
                        colorAttributeResponse4 = colorAttributeResponse2;
                        handlerResponse4 = handlerResponse2;
                        list7 = list3;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                    case 1:
                        list7 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrAsInterface[1].getValue(), list7);
                        i10 |= 2;
                        int i13 = onExtraCallbackWithResult + 51;
                        onExtraCallback = i13 % 128;
                        int i14 = i13 % i2;
                        colorAttributeResponse4 = colorAttributeResponse4;
                        handlerResponse4 = handlerResponse4;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                    case 2:
                        list6 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, (jp) lazyArrAsInterface[i2].getValue(), list6);
                        i10 |= 4;
                        colorAttributeResponse4 = colorAttributeResponse4;
                        handlerResponse4 = handlerResponse4;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 3:
                        bottomCtaResponse3 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse3);
                        i10 |= 8;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 4:
                        handlerResponse4 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse4);
                        i10 |= 16;
                        colorAttributeResponse4 = colorAttributeResponse4;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 5:
                        i10 |= 32;
                        colorAttributeResponse4 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse4);
                        i4 = 9;
                        i5 = 7;
                    case 6:
                        map6 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, (jp) lazyArrAsInterface[i6].getValue(), map6);
                        i10 |= 64;
                        i4 = 9;
                    case 7:
                        map7 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, (jp) lazyArrAsInterface[i5].getValue(), map7);
                        i10 |= 128;
                        i4 = 9;
                    case 8:
                        map8 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i7, (jp) lazyArrAsInterface[i7].getValue(), map8);
                        i10 |= 256;
                        int i15 = onExtraCallback + 125;
                        onExtraCallbackWithResult = i15 % 128;
                        int i16 = i15 % i2;
                        i4 = 9;
                    case 9:
                        yearMonthSelectorAttributeResponse2 = (YearMonthSelectorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, YearMonthSelectorAttributeResponse$.serializer.INSTANCE, yearMonthSelectorAttributeResponse2);
                        i10 |= 512;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            map = map7;
            list = list7;
            yearMonthSelectorAttributeResponse = yearMonthSelectorAttributeResponse2;
            map2 = map8;
            i = i10;
            colorAttributeResponse = colorAttributeResponse4;
            map3 = map6;
            bottomCtaResponse = bottomCtaResponse3;
            list2 = list6;
            handlerResponse = handlerResponse4;
            str = str3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AssetSearchOverviewResponse(i, str, list, list2, bottomCtaResponse, handlerResponse, colorAttributeResponse, map3, map, map2, yearMonthSelectorAttributeResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m558deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetSearchOverviewResponse assetSearchOverviewResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(assetSearchOverviewResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetSearchOverviewResponse.onExtraCallbackWithResult(assetSearchOverviewResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetSearchOverviewResponse) obj);
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

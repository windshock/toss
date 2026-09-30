package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.AssetOverviewResponse;
import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse$;
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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetOverviewResponse$$serializer implements aeu2<AssetOverviewResponse> {
    private static int IAuthTabCallback = 1;
    public static final AssetOverviewResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 53;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        AssetOverviewResponse$$serializer assetOverviewResponse$$serializer = new AssetOverviewResponse$$serializer();
        INSTANCE = assetOverviewResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.AssetOverviewResponse", assetOverviewResponse$$serializer, 8);
        setanimationsloop.onWarmupCompleted("sections", false);
        setanimationsloop.onWarmupCompleted("initializeHandler", false);
        setanimationsloop.onWarmupCompleted("navigationBarRightItems", false);
        setanimationsloop.onWarmupCompleted("backgroundColor", false);
        setanimationsloop.onWarmupCompleted("state", false);
        setanimationsloop.onWarmupCompleted("header", false);
        setanimationsloop.onWarmupCompleted("categorySelector", false);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AssetOverviewResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = AssetOverviewResponse.onExtraCallback();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[0].getValue()), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[2].getValue()), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[4].getValue()), sp.IAuthTabCallback(AssetOverviewResponse$onExtraCallback.onExtraCallback), sp.IAuthTabCallback(AssetOverviewResponse$CategorySelector$$serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[7].getValue())};
        int i4 = onNavigationEvent + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AssetOverviewResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ColorAttributeResponse colorAttributeResponse;
        AssetOverviewResponse.Header header;
        List list;
        Map map;
        AssetOverviewResponse.CategorySelector categorySelector;
        int i;
        Map map2;
        HandlerResponse handlerResponse;
        char c;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = AssetOverviewResponse.onExtraCallback();
        int i6 = 6;
        int i7 = 5;
        List list2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            List list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            HandlerResponse handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), (Object) null);
            ColorAttributeResponse colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            Map map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnExtraCallback[4].getValue(), (Object) null);
            AssetOverviewResponse.Header header2 = (AssetOverviewResponse.Header) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, AssetOverviewResponse$onExtraCallback.onExtraCallback, (Object) null);
            AssetOverviewResponse.CategorySelector categorySelector2 = (AssetOverviewResponse.CategorySelector) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, AssetOverviewResponse$CategorySelector$$serializer.INSTANCE, (Object) null);
            list2 = list4;
            map = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnExtraCallback[7].getValue(), (Object) null);
            categorySelector = categorySelector2;
            header = header2;
            colorAttributeResponse = colorAttributeResponse2;
            handlerResponse = handlerResponse2;
            map2 = map3;
            list = list3;
            i = 255;
        } else {
            boolean z = true;
            int i8 = 0;
            Map map4 = null;
            Map map5 = null;
            colorAttributeResponse = null;
            AssetOverviewResponse.CategorySelector categorySelector3 = null;
            header = null;
            HandlerResponse handlerResponse3 = null;
            List list5 = null;
            while (z) {
                int i9 = onNavigationEvent + 75;
                onExtraCallback = i9 % 128;
                int i10 = i9 % i2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i2 = 2;
                        i6 = 6;
                        i7 = 5;
                    case 0:
                        list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), list5);
                        i8 |= 1;
                        handlerResponse3 = handlerResponse3;
                        i2 = 2;
                        i6 = 6;
                        i7 = 5;
                    case 1:
                        HandlerResponse handlerResponse4 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse3);
                        i8 |= 2;
                        int i11 = onNavigationEvent + 47;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        handlerResponse3 = handlerResponse4;
                        i2 = 2;
                        i6 = 6;
                    case 2:
                        c = 3;
                        list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, (jp) lazyArrOnExtraCallback[i2].getValue(), list2);
                        i8 |= 4;
                        i6 = 6;
                    case 3:
                        c = 3;
                        colorAttributeResponse = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse);
                        i8 |= 8;
                        i6 = 6;
                    case 4:
                        map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnExtraCallback[4].getValue(), map5);
                        i8 |= 16;
                    case 5:
                        header = (AssetOverviewResponse.Header) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i7, AssetOverviewResponse$onExtraCallback.onExtraCallback, header);
                        i8 |= 32;
                    case 6:
                        categorySelector3 = (AssetOverviewResponse.CategorySelector) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, AssetOverviewResponse$CategorySelector$$serializer.INSTANCE, categorySelector3);
                        i8 |= 64;
                    case 7:
                        map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnExtraCallback[7].getValue(), map4);
                        i8 |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            HandlerResponse handlerResponse5 = handlerResponse3;
            list = list5;
            map = map4;
            categorySelector = categorySelector3;
            i = i8;
            map2 = map5;
            handlerResponse = handlerResponse5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AssetOverviewResponse(i, list, handlerResponse, list2, colorAttributeResponse, map2, header, categorySelector, map, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m522deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetOverviewResponse assetOverviewResponseDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return assetOverviewResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetOverviewResponse assetOverviewResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(assetOverviewResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetOverviewResponse.onWarmupCompleted(assetOverviewResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetOverviewResponse) obj);
        int i4 = onNavigationEvent + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

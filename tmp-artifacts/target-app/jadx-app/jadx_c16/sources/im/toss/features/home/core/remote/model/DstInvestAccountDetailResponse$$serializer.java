package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse$;
import im.toss.features.home.core.remote.model.dst.widget.BottomCtaResponse;
import im.toss.features.home.core.remote.model.dst.widget.BottomCtaResponse$;
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
public final /* synthetic */ class DstInvestAccountDetailResponse$$serializer implements aeu2<DstInvestAccountDetailResponse> {
    private static int IAuthTabCallback = 1;
    public static final DstInvestAccountDetailResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        DstInvestAccountDetailResponse$$serializer dstInvestAccountDetailResponse$$serializer = new DstInvestAccountDetailResponse$$serializer();
        INSTANCE = dstInvestAccountDetailResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.DstInvestAccountDetailResponse", dstInvestAccountDetailResponse$$serializer, 10);
        setanimationsloop.onWarmupCompleted("navigationBarTitle", true);
        setanimationsloop.onWarmupCompleted("navigationBarRightItems", true);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("bottomCTA", true);
        setanimationsloop.onWarmupCompleted("initializeHandler", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        setanimationsloop.onWarmupCompleted("state", true);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        setanimationsloop.onWarmupCompleted("overviewSections", false);
        setanimationsloop.onWarmupCompleted("productSections", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 95;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private DstInvestAccountDetailResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallbackDefault = DstInvestAccountDetailResponse.IAuthTabCallbackDefault();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackDefault[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackDefault[2].getValue()), sp.IAuthTabCallback(BottomCtaResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackDefault[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackDefault[7].getValue()), lazyArrIAuthTabCallbackDefault[8].getValue(), lazyArrIAuthTabCallbackDefault[9].getValue()};
        int i4 = onExtraCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DstInvestAccountDetailResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        List list2;
        BottomCtaResponse bottomCtaResponse;
        Map map;
        List list3;
        List list4;
        HandlerResponse handlerResponse;
        String str;
        Map map2;
        ColorAttributeResponse colorAttributeResponse;
        int i;
        int i2;
        List list5;
        BottomCtaResponse bottomCtaResponse2;
        HandlerResponse handlerResponse2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = 7;
        int i6 = onExtraCallbackWithResult + 7;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallbackDefault = DstInvestAccountDetailResponse.IAuthTabCallbackDefault();
        int i8 = 9;
        int i9 = 6;
        int i10 = 8;
        List list6 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            List list7 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallbackDefault[1].getValue(), (Object) null);
            List list8 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallbackDefault[2].getValue(), (Object) null);
            BottomCtaResponse bottomCtaResponse3 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, (Object) null);
            HandlerResponse handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            ColorAttributeResponse colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            Map map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrIAuthTabCallbackDefault[6].getValue(), (Object) null);
            Map map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrIAuthTabCallbackDefault[7].getValue(), (Object) null);
            List list9 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArrIAuthTabCallbackDefault[8].getValue(), (Object) null);
            map = map4;
            list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 9, (jp) lazyArrIAuthTabCallbackDefault[9].getValue(), (Object) null);
            colorAttributeResponse = colorAttributeResponse2;
            handlerResponse = handlerResponse3;
            i = 1023;
            map2 = map3;
            list2 = list7;
            list4 = list9;
            list = list8;
            str = str2;
            bottomCtaResponse = bottomCtaResponse3;
        } else {
            int i11 = 0;
            boolean z = true;
            Map map5 = null;
            ColorAttributeResponse colorAttributeResponse3 = null;
            list = null;
            Map map6 = null;
            List list10 = null;
            List list11 = null;
            String str3 = null;
            BottomCtaResponse bottomCtaResponse4 = null;
            HandlerResponse handlerResponse4 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        list5 = list11;
                        bottomCtaResponse2 = bottomCtaResponse4;
                        handlerResponse2 = handlerResponse4;
                        z = false;
                        handlerResponse4 = handlerResponse2;
                        bottomCtaResponse4 = bottomCtaResponse2;
                        list11 = list5;
                        i3 = 2;
                        i5 = 7;
                        i8 = 9;
                        i9 = 6;
                        i10 = 8;
                    case 0:
                        list5 = list11;
                        bottomCtaResponse2 = bottomCtaResponse4;
                        handlerResponse2 = handlerResponse4;
                        i11 |= 1;
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        handlerResponse4 = handlerResponse2;
                        bottomCtaResponse4 = bottomCtaResponse2;
                        list11 = list5;
                        i3 = 2;
                        i5 = 7;
                        i8 = 9;
                        i9 = 6;
                        i10 = 8;
                    case 1:
                        list11 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallbackDefault[1].getValue(), list11);
                        i11 |= 2;
                        i3 = 2;
                        i5 = 7;
                        i8 = 9;
                        i9 = 6;
                    case 2:
                        list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, (jp) lazyArrIAuthTabCallbackDefault[i3].getValue(), list);
                        i11 |= 4;
                        i5 = 7;
                        i8 = 9;
                        i9 = 6;
                    case 3:
                        bottomCtaResponse4 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse4);
                        i11 |= 8;
                        i5 = 7;
                        i8 = 9;
                        i9 = 6;
                    case 4:
                        handlerResponse4 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse4);
                        i11 |= 16;
                        i5 = 7;
                        i8 = 9;
                    case 5:
                        colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse3);
                        i11 |= 32;
                        i8 = 9;
                    case 6:
                        map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i9, (jp) lazyArrIAuthTabCallbackDefault[i9].getValue(), map5);
                        i11 |= 64;
                        i8 = 9;
                    case 7:
                        map6 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, (jp) lazyArrIAuthTabCallbackDefault[i5].getValue(), map6);
                        i11 |= 128;
                        i8 = 9;
                    case 8:
                        list10 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i10, (jp) lazyArrIAuthTabCallbackDefault[i10].getValue(), list10);
                        i11 |= 256;
                        i2 = onExtraCallback + 77;
                        onExtraCallbackWithResult = i2 % 128;
                        int i12 = i2 % i3;
                        i8 = 9;
                    case 9:
                        list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i8, (jp) lazyArrIAuthTabCallbackDefault[i8].getValue(), list6);
                        i11 |= 512;
                        i2 = onExtraCallbackWithResult + 23;
                        onExtraCallback = i2 % 128;
                        int i122 = i2 % i3;
                        i8 = 9;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            list2 = list11;
            bottomCtaResponse = bottomCtaResponse4;
            map = map6;
            list3 = list6;
            list4 = list10;
            handlerResponse = handlerResponse4;
            str = str3;
            map2 = map5;
            colorAttributeResponse = colorAttributeResponse3;
            i = i11;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DstInvestAccountDetailResponse(i, str, list2, list, bottomCtaResponse, handlerResponse, colorAttributeResponse, map2, map, list4, list3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m533deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DstInvestAccountDetailResponse dstInvestAccountDetailResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return dstInvestAccountDetailResponseDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DstInvestAccountDetailResponse dstInvestAccountDetailResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dstInvestAccountDetailResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DstInvestAccountDetailResponse.onWarmupCompleted(dstInvestAccountDetailResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DstInvestAccountDetailResponse) obj);
        int i4 = onExtraCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

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
public final /* synthetic */ class DstLoanAccountDetailResponse$$serializer implements aeu2<DstLoanAccountDetailResponse> {
    public static final DstLoanAccountDetailResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 19;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        DstLoanAccountDetailResponse$$serializer dstLoanAccountDetailResponse$$serializer = new DstLoanAccountDetailResponse$$serializer();
        INSTANCE = dstLoanAccountDetailResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.DstLoanAccountDetailResponse", dstLoanAccountDetailResponse$$serializer, 8);
        setanimationsloop.onWarmupCompleted("navigationBarTitle", true);
        setanimationsloop.onWarmupCompleted("navigationBarRightItems", true);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("bottomCTA", true);
        setanimationsloop.onWarmupCompleted("initializeHandler", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        setanimationsloop.onWarmupCompleted("state", true);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 1;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private DstLoanAccountDetailResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = DstLoanAccountDetailResponse.IAuthTabCallback();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[2].getValue()), sp.IAuthTabCallback(BottomCtaResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[7].getValue())};
        int i4 = onNavigationEvent + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DstLoanAccountDetailResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        List list2;
        String str;
        HandlerResponse handlerResponse;
        ColorAttributeResponse colorAttributeResponse;
        BottomCtaResponse bottomCtaResponse;
        Map map;
        Map map2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = DstLoanAccountDetailResponse.IAuthTabCallback();
        int i5 = 7;
        List list3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onWarmupCompleted + 93;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            List list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), (Object) null);
            BottomCtaResponse bottomCtaResponse2 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, (Object) null);
            HandlerResponse handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            ColorAttributeResponse colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            Map map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrIAuthTabCallback[6].getValue(), (Object) null);
            map = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrIAuthTabCallback[7].getValue(), (Object) null);
            colorAttributeResponse = colorAttributeResponse2;
            bottomCtaResponse = bottomCtaResponse2;
            handlerResponse = handlerResponse2;
            i = 255;
            map2 = map3;
            list = list4;
            list2 = list5;
            str = str2;
        } else {
            int i8 = 0;
            boolean z = true;
            HandlerResponse handlerResponse3 = null;
            ColorAttributeResponse colorAttributeResponse3 = null;
            BottomCtaResponse bottomCtaResponse3 = null;
            Map map4 = null;
            Map map5 = null;
            List list6 = null;
            String str3 = null;
            while (z) {
                int i9 = onWarmupCompleted + 69;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % i3;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (i10 != 0) {
                    int i11 = 9 / 0;
                    switch (iOnNavigationEvent) {
                        case -1:
                            str3 = str3;
                            list6 = list6;
                            z = false;
                            i3 = 2;
                            i5 = 7;
                            break;
                        case 0:
                            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                            i8 |= 1;
                            list6 = list6;
                            i3 = 2;
                            i5 = 7;
                            break;
                        case 1:
                            i2 = 1;
                            list6 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, (jp) lazyArrIAuthTabCallback[i2].getValue(), list6);
                            i8 |= 2;
                            int i12 = onNavigationEvent + 29;
                            onWarmupCompleted = i12 % 128;
                            int i13 = i12 % i3;
                            i5 = 7;
                            break;
                        case 2:
                            list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, (jp) lazyArrIAuthTabCallback[i3].getValue(), list3);
                            i8 |= 4;
                            break;
                        case 3:
                            bottomCtaResponse3 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse3);
                            i8 |= 8;
                            break;
                        case 4:
                            handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse3);
                            i8 |= 16;
                            break;
                        case 5:
                            colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse3);
                            i8 |= 32;
                            break;
                        case 6:
                            map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrIAuthTabCallback[6].getValue(), map5);
                            i8 |= 64;
                            int i14 = onNavigationEvent + 89;
                            onWarmupCompleted = i14 % 128;
                            int i15 = i14 % i3;
                            break;
                        case 7:
                            map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, (jp) lazyArrIAuthTabCallback[i5].getValue(), map4);
                            i8 |= 128;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                } else {
                    switch (iOnNavigationEvent) {
                        case -1:
                            str3 = str3;
                            list6 = list6;
                            z = false;
                            i3 = 2;
                            i5 = 7;
                            break;
                        case 0:
                            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                            i8 |= 1;
                            list6 = list6;
                            i3 = 2;
                            i5 = 7;
                            break;
                        case 1:
                            i2 = 1;
                            list6 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, (jp) lazyArrIAuthTabCallback[i2].getValue(), list6);
                            i8 |= 2;
                            int i122 = onNavigationEvent + 29;
                            onWarmupCompleted = i122 % 128;
                            int i132 = i122 % i3;
                            i5 = 7;
                            break;
                        case 2:
                            list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, (jp) lazyArrIAuthTabCallback[i3].getValue(), list3);
                            i8 |= 4;
                            break;
                        case 3:
                            bottomCtaResponse3 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse3);
                            i8 |= 8;
                            break;
                        case 4:
                            handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse3);
                            i8 |= 16;
                            break;
                        case 5:
                            colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse3);
                            i8 |= 32;
                            break;
                        case 6:
                            map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrIAuthTabCallback[6].getValue(), map5);
                            i8 |= 64;
                            int i142 = onNavigationEvent + 89;
                            onWarmupCompleted = i142 % 128;
                            int i152 = i142 % i3;
                            break;
                        case 7:
                            map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, (jp) lazyArrIAuthTabCallback[i5].getValue(), map4);
                            i8 |= 128;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
            }
            i = i8;
            list = list6;
            list2 = list3;
            str = str3;
            handlerResponse = handlerResponse3;
            BottomCtaResponse bottomCtaResponse4 = bottomCtaResponse3;
            colorAttributeResponse = colorAttributeResponse3;
            bottomCtaResponse = bottomCtaResponse4;
            Map map6 = map5;
            map = map4;
            map2 = map6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DstLoanAccountDetailResponse(i, str, list, list2, bottomCtaResponse, handlerResponse, colorAttributeResponse, map2, map, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m538deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DstLoanAccountDetailResponse dstLoanAccountDetailResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return dstLoanAccountDetailResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DstLoanAccountDetailResponse dstLoanAccountDetailResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dstLoanAccountDetailResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DstLoanAccountDetailResponse.IAuthTabCallback(dstLoanAccountDetailResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DstLoanAccountDetailResponse) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

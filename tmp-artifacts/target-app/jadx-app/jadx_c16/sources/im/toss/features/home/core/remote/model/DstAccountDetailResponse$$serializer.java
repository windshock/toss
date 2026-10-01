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
public final /* synthetic */ class DstAccountDetailResponse$$serializer implements aeu2<DstAccountDetailResponse> {
    public static final DstAccountDetailResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        DstAccountDetailResponse$$serializer dstAccountDetailResponse$$serializer = new DstAccountDetailResponse$$serializer();
        INSTANCE = dstAccountDetailResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.DstAccountDetailResponse", dstAccountDetailResponse$$serializer, 9);
        setanimationsloop.onWarmupCompleted("navigationBarTitle", true);
        setanimationsloop.onWarmupCompleted("navigationBarRightItems", true);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("bottomCTA", true);
        setanimationsloop.onWarmupCompleted("initializeHandler", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        setanimationsloop.onWarmupCompleted("state", true);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        setanimationsloop.onWarmupCompleted("transactionFilter", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 1;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private DstAccountDetailResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = DstAccountDetailResponse.onWarmupCompleted();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[2].getValue()), sp.IAuthTabCallback(BottomCtaResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[7].getValue()), sp.IAuthTabCallback(TransactionFilterResponse$$serializer.INSTANCE)};
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DstAccountDetailResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        TransactionFilterResponse transactionFilterResponse;
        HandlerResponse handlerResponse;
        List list2;
        Map map;
        BottomCtaResponse bottomCtaResponse;
        Map map2;
        int i;
        ColorAttributeResponse colorAttributeResponse;
        String str;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = DstAccountDetailResponse.onWarmupCompleted();
        int i6 = 8;
        int i7 = 7;
        Map map3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            List list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), (Object) null);
            BottomCtaResponse bottomCtaResponse2 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, (Object) null);
            HandlerResponse handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            ColorAttributeResponse colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            Map map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrOnWarmupCompleted[6].getValue(), (Object) null);
            map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnWarmupCompleted[7].getValue(), (Object) null);
            colorAttributeResponse = colorAttributeResponse2;
            transactionFilterResponse = (TransactionFilterResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, TransactionFilterResponse$$serializer.INSTANCE, (Object) null);
            handlerResponse = handlerResponse2;
            i = 511;
            map = map4;
            list2 = list3;
            list = list4;
            str = str2;
            bottomCtaResponse = bottomCtaResponse2;
        } else {
            int i8 = 0;
            boolean z = true;
            Map map5 = null;
            ColorAttributeResponse colorAttributeResponse3 = null;
            List list5 = null;
            TransactionFilterResponse transactionFilterResponse2 = null;
            HandlerResponse handlerResponse3 = null;
            List list6 = null;
            String str3 = null;
            BottomCtaResponse bottomCtaResponse3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i6 = 8;
                        i7 = 7;
                    case 0:
                        i8 |= 1;
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i2 = 2;
                        i6 = 8;
                        i7 = 7;
                    case 1:
                        list6 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list6);
                        i8 |= 2;
                        i2 = 2;
                        i6 = 8;
                        i7 = 7;
                    case 2:
                        list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, (jp) lazyArrOnWarmupCompleted[i2].getValue(), list5);
                        i8 |= 4;
                        i6 = 8;
                        i7 = 7;
                    case 3:
                        bottomCtaResponse3 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse3);
                        i8 |= 8;
                        i6 = 8;
                        i7 = 7;
                    case 4:
                        handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse3);
                        i8 |= 16;
                        i6 = 8;
                    case 5:
                        colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse3);
                        i8 |= 32;
                        i6 = 8;
                    case 6:
                        map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrOnWarmupCompleted[6].getValue(), map5);
                        i8 |= 64;
                        i6 = 8;
                    case 7:
                        map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i7, (jp) lazyArrOnWarmupCompleted[i7].getValue(), map3);
                        i8 |= 128;
                        i6 = 8;
                    case 8:
                        transactionFilterResponse2 = (TransactionFilterResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, TransactionFilterResponse$$serializer.INSTANCE, transactionFilterResponse2);
                        i8 |= 256;
                        int i9 = onExtraCallback + 123;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % i2;
                        i6 = 8;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            list = list5;
            transactionFilterResponse = transactionFilterResponse2;
            handlerResponse = handlerResponse3;
            list2 = list6;
            map = map5;
            bottomCtaResponse = bottomCtaResponse3;
            map2 = map3;
            i = i8;
            colorAttributeResponse = colorAttributeResponse3;
            str = str3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DstAccountDetailResponse(i, str, list2, list, bottomCtaResponse, handlerResponse, colorAttributeResponse, map, map2, transactionFilterResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m531deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DstAccountDetailResponse dstAccountDetailResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return dstAccountDetailResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DstAccountDetailResponse dstAccountDetailResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dstAccountDetailResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DstAccountDetailResponse.onExtraCallbackWithResult(dstAccountDetailResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DstAccountDetailResponse) obj);
        int i4 = onExtraCallback + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

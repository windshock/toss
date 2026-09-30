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
public final /* synthetic */ class DstPointDetailResponse$$serializer implements aeu2<DstPointDetailResponse> {
    private static int IAuthTabCallback = 0;
    public static final DstPointDetailResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        DstPointDetailResponse$$serializer dstPointDetailResponse$$serializer = new DstPointDetailResponse$$serializer();
        INSTANCE = dstPointDetailResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.DstPointDetailResponse", dstPointDetailResponse$$serializer, 9);
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
        int i = IAuthTabCallback + 59;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private DstPointDetailResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = DstPointDetailResponse.onWarmupCompleted();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[2].getValue()), sp.IAuthTabCallback(BottomCtaResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[7].getValue()), sp.IAuthTabCallback(TransactionFilterResponse$$serializer.INSTANCE)};
        int i4 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DstPointDetailResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Map map;
        int i;
        ColorAttributeResponse colorAttributeResponse;
        TransactionFilterResponse transactionFilterResponse;
        Map map2;
        List list;
        List list2;
        HandlerResponse handlerResponse;
        BottomCtaResponse bottomCtaResponse;
        String str;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = DstPointDetailResponse.onWarmupCompleted();
        int i5 = 5;
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
            list2 = list4;
            map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnWarmupCompleted[7].getValue(), (Object) null);
            colorAttributeResponse = colorAttributeResponse2;
            bottomCtaResponse = bottomCtaResponse2;
            transactionFilterResponse = (TransactionFilterResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, TransactionFilterResponse$$serializer.INSTANCE, (Object) null);
            handlerResponse = handlerResponse2;
            map = map4;
            list = list3;
            str = str2;
            i = 511;
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
                        i5 = 5;
                        i6 = 8;
                        i7 = 7;
                    case 0:
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i8 |= 1;
                        int i9 = onNavigationEvent + 77;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        bottomCtaResponse3 = bottomCtaResponse3;
                        i5 = 5;
                        i6 = 8;
                        i7 = 7;
                    case 1:
                        list6 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list6);
                        i8 |= 2;
                        i5 = 5;
                        i6 = 8;
                    case 2:
                        list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), list5);
                        i8 |= 4;
                        bottomCtaResponse3 = bottomCtaResponse3;
                        i5 = 5;
                        i6 = 8;
                    case 3:
                        bottomCtaResponse3 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse3);
                        i8 |= 8;
                        i5 = 5;
                        i6 = 8;
                    case 4:
                        handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse3);
                        i8 |= 16;
                        i5 = 5;
                    case 5:
                        colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse3);
                        i8 |= 32;
                    case 6:
                        map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrOnWarmupCompleted[6].getValue(), map5);
                        i8 |= 64;
                    case 7:
                        map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i7, (jp) lazyArrOnWarmupCompleted[i7].getValue(), map3);
                        i8 |= 128;
                    case 8:
                        transactionFilterResponse2 = (TransactionFilterResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, TransactionFilterResponse$$serializer.INSTANCE, transactionFilterResponse2);
                        i8 |= 256;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            String str4 = str3;
            map = map5;
            i = i8;
            colorAttributeResponse = colorAttributeResponse3;
            transactionFilterResponse = transactionFilterResponse2;
            map2 = map3;
            list = list6;
            list2 = list5;
            handlerResponse = handlerResponse3;
            bottomCtaResponse = bottomCtaResponse3;
            str = str4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DstPointDetailResponse(i, str, list, list2, bottomCtaResponse, handlerResponse, colorAttributeResponse, map, map2, transactionFilterResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m539deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DstPointDetailResponse dstPointDetailResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dstPointDetailResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DstPointDetailResponse.onExtraCallback(dstPointDetailResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DstPointDetailResponse) obj);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

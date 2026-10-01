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
public final /* synthetic */ class DstInvestmentOverviewResponse$$serializer implements aeu2<DstInvestmentOverviewResponse> {
    private static int IAuthTabCallback = 0;
    public static final DstInvestmentOverviewResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 49;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        DstInvestmentOverviewResponse$$serializer dstInvestmentOverviewResponse$$serializer = new DstInvestmentOverviewResponse$$serializer();
        INSTANCE = dstInvestmentOverviewResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.DstInvestmentOverviewResponse", dstInvestmentOverviewResponse$$serializer, 9);
        setanimationsloop.onWarmupCompleted("navigationBarTitle", true);
        setanimationsloop.onWarmupCompleted("navigationBarRightItems", true);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("bottomCTA", true);
        setanimationsloop.onWarmupCompleted("initializeHandler", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        setanimationsloop.onWarmupCompleted("state", true);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        setanimationsloop.onWarmupCompleted("contents", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 19;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private DstInvestmentOverviewResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallbackStub = DstInvestmentOverviewResponse.IAuthTabCallbackStub();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackStub[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackStub[2].getValue()), sp.IAuthTabCallback(BottomCtaResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackStub[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackStub[7].getValue()), lazyArrIAuthTabCallbackStub[8].getValue()};
        int i4 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DstInvestmentOverviewResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        List list2;
        String str;
        List list3;
        Map map;
        HandlerResponse handlerResponse;
        BottomCtaResponse bottomCtaResponse;
        int i;
        Map map2;
        ColorAttributeResponse colorAttributeResponse;
        char c;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallbackStub = DstInvestmentOverviewResponse.IAuthTabCallbackStub();
        int i3 = 7;
        int i4 = 6;
        Map map3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallbackStub[1].getValue(), (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallbackStub[2].getValue(), (Object) null);
            BottomCtaResponse bottomCtaResponse2 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, (Object) null);
            HandlerResponse handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            ColorAttributeResponse colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            Map map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrIAuthTabCallbackStub[6].getValue(), (Object) null);
            Map map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrIAuthTabCallbackStub[7].getValue(), (Object) null);
            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArrIAuthTabCallbackStub[8].getValue(), (Object) null);
            bottomCtaResponse = bottomCtaResponse2;
            colorAttributeResponse = colorAttributeResponse2;
            handlerResponse = handlerResponse2;
            map = map5;
            map2 = map4;
            i = 511;
            list3 = list4;
            str = str2;
        } else {
            int i7 = 0;
            boolean z = true;
            List list5 = null;
            Map map6 = null;
            ColorAttributeResponse colorAttributeResponse3 = null;
            list = null;
            List list6 = null;
            HandlerResponse handlerResponse3 = null;
            BottomCtaResponse bottomCtaResponse3 = null;
            String str3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        c = 5;
                        z = false;
                        i3 = 7;
                        i4 = 6;
                    case 0:
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i7 |= 1;
                        int i8 = onExtraCallbackWithResult + 59;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            c = 5;
                            int i9 = 2 / 5;
                        } else {
                            c = 5;
                        }
                        i3 = 7;
                        i4 = 6;
                    case 1:
                        list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallbackStub[1].getValue(), list);
                        i7 |= 2;
                        i3 = 7;
                    case 2:
                        list6 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallbackStub[2].getValue(), list6);
                        i7 |= 4;
                        i3 = 7;
                    case 3:
                        bottomCtaResponse3 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse3);
                        i7 |= 8;
                        i3 = 7;
                    case 4:
                        handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse3);
                        i7 |= 16;
                        i3 = 7;
                    case 5:
                        colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse3);
                        i7 |= 32;
                        i3 = 7;
                    case 6:
                        map6 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, (jp) lazyArrIAuthTabCallbackStub[i4].getValue(), map6);
                        i7 |= 64;
                    case 7:
                        map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, (jp) lazyArrIAuthTabCallbackStub[i3].getValue(), map3);
                        i7 |= 128;
                    case 8:
                        list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArrIAuthTabCallbackStub[8].getValue(), list5);
                        i7 |= 256;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            list2 = list5;
            str = str3;
            list3 = list6;
            map = map3;
            handlerResponse = handlerResponse3;
            bottomCtaResponse = bottomCtaResponse3;
            i = i7;
            map2 = map6;
            colorAttributeResponse = colorAttributeResponse3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DstInvestmentOverviewResponse(i, str, list, list3, bottomCtaResponse, handlerResponse, colorAttributeResponse, map2, map, list2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m537deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DstInvestmentOverviewResponse dstInvestmentOverviewResponseDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return dstInvestmentOverviewResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DstInvestmentOverviewResponse dstInvestmentOverviewResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(dstInvestmentOverviewResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DstInvestmentOverviewResponse.IAuthTabCallback(dstInvestmentOverviewResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dstInvestmentOverviewResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DstInvestmentOverviewResponse.IAuthTabCallback(dstInvestmentOverviewResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 27 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DstInvestmentOverviewResponse) obj);
        int i4 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

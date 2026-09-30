package im.toss.features.home.core.remote.model.consumption.analysis;

import im.toss.features.home.core.remote.model.consumption.analysis.report.ConsumptionAnalysisTagResponse;
import im.toss.features.home.core.remote.model.consumption.analysis.report.ConsumptionAnalysisTagResponse$;
import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse$;
import im.toss.features.home.core.remote.model.dst.widget.BottomCtaResponse;
import im.toss.features.home.core.remote.model.dst.widget.BottomCtaResponse$;
import java.util.List;
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
public final /* synthetic */ class LegacyDstConsumptionAnalysisOverviewResponse$$serializer implements aeu2<LegacyDstConsumptionAnalysisOverviewResponse> {
    private static int IAuthTabCallback = 0;
    public static final LegacyDstConsumptionAnalysisOverviewResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        LegacyDstConsumptionAnalysisOverviewResponse$$serializer legacyDstConsumptionAnalysisOverviewResponse$$serializer = new LegacyDstConsumptionAnalysisOverviewResponse$$serializer();
        INSTANCE = legacyDstConsumptionAnalysisOverviewResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.consumption.analysis.LegacyDstConsumptionAnalysisOverviewResponse", legacyDstConsumptionAnalysisOverviewResponse$$serializer, 7);
        setanimationsloop.onWarmupCompleted("navigationBarTitle", true);
        setanimationsloop.onWarmupCompleted("navigationBarRightItems", true);
        setanimationsloop.onWarmupCompleted("consumptionTag", true);
        setanimationsloop.onWarmupCompleted("reports", true);
        setanimationsloop.onWarmupCompleted("bottomCta", true);
        setanimationsloop.onWarmupCompleted("initializeHandler", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private LegacyDstConsumptionAnalysisOverviewResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = LegacyDstConsumptionAnalysisOverviewResponse.onNavigationEvent();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), lazyArrOnNavigationEvent[1].getValue(), sp.IAuthTabCallback(ConsumptionAnalysisTagResponse$.serializer.INSTANCE), lazyArrOnNavigationEvent[3].getValue(), sp.IAuthTabCallback(BottomCtaResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE)};
        int i4 = onNavigationEvent + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final LegacyDstConsumptionAnalysisOverviewResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        List list;
        ConsumptionAnalysisTagResponse consumptionAnalysisTagResponse;
        BottomCtaResponse bottomCtaResponse;
        ColorAttributeResponse colorAttributeResponse;
        HandlerResponse handlerResponse;
        List list2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = LegacyDstConsumptionAnalysisOverviewResponse.onNavigationEvent();
        int i5 = 6;
        int i6 = 5;
        ConsumptionAnalysisTagResponse consumptionAnalysisTagResponse2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            List list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), (Object) null);
            ConsumptionAnalysisTagResponse consumptionAnalysisTagResponse3 = (ConsumptionAnalysisTagResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ConsumptionAnalysisTagResponse$.serializer.INSTANCE, (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnNavigationEvent[3].getValue(), (Object) null);
            BottomCtaResponse bottomCtaResponse2 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, BottomCtaResponse$.serializer.INSTANCE, (Object) null);
            HandlerResponse handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            colorAttributeResponse = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            list2 = list3;
            bottomCtaResponse = bottomCtaResponse2;
            list = list4;
            i = 127;
            handlerResponse = handlerResponse2;
            consumptionAnalysisTagResponse = consumptionAnalysisTagResponse3;
        } else {
            int i7 = 0;
            boolean z = true;
            List list5 = null;
            BottomCtaResponse bottomCtaResponse3 = null;
            ColorAttributeResponse colorAttributeResponse2 = null;
            HandlerResponse handlerResponse3 = null;
            List list6 = null;
            String str2 = null;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i5 = 6;
                        i6 = 5;
                    case 0:
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str2);
                        i7 |= 1;
                        i5 = 6;
                        i6 = 5;
                    case 1:
                        list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), list6);
                        i7 |= 2;
                        i5 = 6;
                    case 2:
                        consumptionAnalysisTagResponse2 = (ConsumptionAnalysisTagResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ConsumptionAnalysisTagResponse$.serializer.INSTANCE, consumptionAnalysisTagResponse2);
                        i7 |= 4;
                        i5 = 6;
                    case 3:
                        list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnNavigationEvent[3].getValue(), list5);
                        i7 |= 8;
                        int i8 = onWarmupCompleted + 3;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 3 % 3;
                        }
                        i5 = 6;
                    case 4:
                        bottomCtaResponse3 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse3);
                        i7 |= 16;
                    case 5:
                        handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse3);
                        i7 |= 32;
                    case 6:
                        colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse2);
                        i7 |= 64;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i7;
            str = str2;
            list = list5;
            consumptionAnalysisTagResponse = consumptionAnalysisTagResponse2;
            bottomCtaResponse = bottomCtaResponse3;
            colorAttributeResponse = colorAttributeResponse2;
            handlerResponse = handlerResponse3;
            list2 = list6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LegacyDstConsumptionAnalysisOverviewResponse(i, str, list2, consumptionAnalysisTagResponse, list, bottomCtaResponse, handlerResponse, colorAttributeResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m580deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LegacyDstConsumptionAnalysisOverviewResponse legacyDstConsumptionAnalysisOverviewResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return legacyDstConsumptionAnalysisOverviewResponseDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LegacyDstConsumptionAnalysisOverviewResponse legacyDstConsumptionAnalysisOverviewResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(legacyDstConsumptionAnalysisOverviewResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        LegacyDstConsumptionAnalysisOverviewResponse.IAuthTabCallback(legacyDstConsumptionAnalysisOverviewResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LegacyDstConsumptionAnalysisOverviewResponse) obj);
        int i4 = onWarmupCompleted + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 117;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 28 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

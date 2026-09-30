package im.toss.features.home.core.remote.model.consumption;

import im.toss.features.home.core.remote.model.consumption.ConsumptionHomeOverviewResponse;
import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.widget.NumericContentResponse;
import im.toss.features.home.core.remote.model.dst.widget.NumericContentResponse$;
import im.toss.features.home.core.remote.model.dst.widget.TextContentResponse;
import im.toss.features.home.core.remote.model.dst.widget.TextContentResponse$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.TBPermissionHelper;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionHomeOverviewResponse$PinHeader$$serializer implements aeu2<ConsumptionHomeOverviewResponse.PinHeader> {
    private static int IAuthTabCallback = 1;
    public static final ConsumptionHomeOverviewResponse$PinHeader$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 41;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ConsumptionHomeOverviewResponse$PinHeader$$serializer consumptionHomeOverviewResponse$PinHeader$$serializer = new ConsumptionHomeOverviewResponse$PinHeader$$serializer();
        INSTANCE = consumptionHomeOverviewResponse$PinHeader$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.consumption.ConsumptionHomeOverviewResponse.PinHeader", consumptionHomeOverviewResponse$PinHeader$$serializer, 3);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 81;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionHomeOverviewResponse$PinHeader$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(NumericContentResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TextContentResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult)};
        int i4 = onExtraCallback + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionHomeOverviewResponse.PinHeader deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        TextContentResponse textContentResponse;
        NumericContentResponse numericContentResponse;
        HandlerResponse handlerResponse;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        TextContentResponse textContentResponse2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            NumericContentResponse numericContentResponse2 = (NumericContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, NumericContentResponse$.serializer.INSTANCE, (Object) null);
            TextContentResponse textContentResponse3 = (TextContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TextContentResponse$.serializer.INSTANCE, (Object) null);
            handlerResponse = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            numericContentResponse = numericContentResponse2;
            textContentResponse = textContentResponse3;
            i = 7;
        } else {
            int i3 = 0;
            boolean z = true;
            NumericContentResponse numericContentResponse3 = null;
            HandlerResponse handlerResponse2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i4 = onWarmupCompleted + 63;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 5 % 4;
                    }
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    numericContentResponse3 = (NumericContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, NumericContentResponse$.serializer.INSTANCE, numericContentResponse3);
                    i3 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i6 = onExtraCallback;
                    int i7 = i6 + 33;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i9 = i6 + 61;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse2);
                    i3 = i10 == 0 ? i3 | 3 : i3 | 4;
                } else {
                    textContentResponse2 = (TextContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TextContentResponse$.serializer.INSTANCE, textContentResponse2);
                    i3 |= 2;
                }
            }
            i = i3;
            textContentResponse = textContentResponse2;
            numericContentResponse = numericContentResponse3;
            handlerResponse = handlerResponse2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionHomeOverviewResponse.PinHeader(i, numericContentResponse, textContentResponse, handlerResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m577deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionHomeOverviewResponse.PinHeader pinHeaderDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return pinHeaderDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionHomeOverviewResponse.PinHeader pinHeader) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(pinHeader, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ConsumptionHomeOverviewResponse.PinHeader.onExtraCallback(pinHeader, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionHomeOverviewResponse.PinHeader) obj);
        int i4 = onExtraCallback + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

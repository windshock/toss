package im.toss.features.home.core.remote.model.dst.widget;

import im.toss.features.home.core.remote.model.dst.eventlog.ImpressionEventLogResponse;
import im.toss.features.home.core.remote.model.dst.eventlog.ImpressionEventLogResponse$;
import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.widget.ConsumptionTransactionActionCellResponse;
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
import o.getSpecificKey;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionTransactionActionCellResponse$$serializer implements aeu2<ConsumptionTransactionActionCellResponse> {
    private static int IAuthTabCallback = 0;
    public static final ConsumptionTransactionActionCellResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 117;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ConsumptionTransactionActionCellResponse$$serializer consumptionTransactionActionCellResponse$$serializer = new ConsumptionTransactionActionCellResponse$$serializer();
        INSTANCE = consumptionTransactionActionCellResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.dst.widget.ConsumptionTransactionActionCellResponse", consumptionTransactionActionCellResponse$$serializer, 7);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        setanimationsloop.onWarmupCompleted("rightButton", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("order", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 113;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionTransactionActionCellResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(ImpressionEventLogResponse$.serializer.INSTANCE);
        TextContentResponse$.serializer serializerVar = TextContentResponse$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {getSpecificKey.IAuthTabCallback, serializerVar, serializerVar, getWriggleLayout.onNavigationEvent, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, ConsumptionTransactionActionCellResponse$IAuthTabCallback.onExtraCallback};
        int i4 = onExtraCallback + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionTransactionActionCellResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ConsumptionTransactionActionCellResponse.OrderResponse orderResponse;
        ImageSourceResponse imageSourceResponse;
        TextContentResponse textContentResponse;
        int i;
        ImpressionEventLogResponse impressionEventLogResponse;
        TextContentResponse textContentResponse2;
        HandlerResponse handlerResponse;
        String str;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 6;
        int i4 = 3;
        TextContentResponse textContentResponse3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onWarmupCompleted + 49;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ImageSourceResponse imageSourceResponse2 = (ImageSourceResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, getSpecificKey.IAuthTabCallback, (Object) null);
            TextContentResponse$.serializer serializerVar = TextContentResponse$.serializer.INSTANCE;
            TextContentResponse textContentResponse4 = (TextContentResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, serializerVar, (Object) null);
            TextContentResponse textContentResponse5 = (TextContentResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, serializerVar, (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            HandlerResponse handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            ImpressionEventLogResponse impressionEventLogResponse2 = (ImpressionEventLogResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ImpressionEventLogResponse$.serializer.INSTANCE, (Object) null);
            orderResponse = (ConsumptionTransactionActionCellResponse.OrderResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, ConsumptionTransactionActionCellResponse$IAuthTabCallback.onExtraCallback, (Object) null);
            str = strAsInterface;
            impressionEventLogResponse = impressionEventLogResponse2;
            handlerResponse = handlerResponse2;
            textContentResponse2 = textContentResponse5;
            textContentResponse = textContentResponse4;
            i = 127;
            imageSourceResponse = imageSourceResponse2;
        } else {
            int i7 = 0;
            boolean z = true;
            ImageSourceResponse imageSourceResponse3 = null;
            ConsumptionTransactionActionCellResponse.OrderResponse orderResponse2 = null;
            String strAsInterface2 = null;
            ImpressionEventLogResponse impressionEventLogResponse3 = null;
            HandlerResponse handlerResponse3 = null;
            TextContentResponse textContentResponse6 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        imageSourceResponse3 = (ImageSourceResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, getSpecificKey.IAuthTabCallback, imageSourceResponse3);
                        i7 |= 1;
                        int i8 = onWarmupCompleted + 57;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 2 / 5;
                        }
                        i3 = 6;
                        i4 = 3;
                        continue;
                    case 1:
                        textContentResponse3 = (TextContentResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextContentResponse$.serializer.INSTANCE, textContentResponse3);
                        i7 |= 2;
                        int i10 = onExtraCallback + 69;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        i3 = 6;
                        break;
                    case 2:
                        textContentResponse6 = (TextContentResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, TextContentResponse$.serializer.INSTANCE, textContentResponse6);
                        i7 |= 4;
                        break;
                    case 3:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i4);
                        i7 |= 8;
                        break;
                    case 4:
                        handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse3);
                        i7 |= 16;
                        break;
                    case 5:
                        impressionEventLogResponse3 = (ImpressionEventLogResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ImpressionEventLogResponse$.serializer.INSTANCE, impressionEventLogResponse3);
                        i7 |= 32;
                        break;
                    case 6:
                        orderResponse2 = (ConsumptionTransactionActionCellResponse.OrderResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i3, ConsumptionTransactionActionCellResponse$IAuthTabCallback.onExtraCallback, orderResponse2);
                        i7 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            orderResponse = orderResponse2;
            imageSourceResponse = imageSourceResponse3;
            String str2 = strAsInterface2;
            textContentResponse = textContentResponse3;
            i = i7;
            impressionEventLogResponse = impressionEventLogResponse3;
            textContentResponse2 = textContentResponse6;
            handlerResponse = handlerResponse3;
            str = str2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        ConsumptionTransactionActionCellResponse consumptionTransactionActionCellResponse = new ConsumptionTransactionActionCellResponse(i, imageSourceResponse, textContentResponse, textContentResponse2, str, handlerResponse, impressionEventLogResponse, orderResponse, (okycx) null);
        int i12 = onWarmupCompleted + 7;
        onExtraCallback = i12 % 128;
        if (i12 % 2 != 0) {
            return consumptionTransactionActionCellResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m598deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionTransactionActionCellResponse consumptionTransactionActionCellResponseDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        int i5 = onExtraCallback + 57;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return consumptionTransactionActionCellResponseDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionTransactionActionCellResponse consumptionTransactionActionCellResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(consumptionTransactionActionCellResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ConsumptionTransactionActionCellResponse.onExtraCallbackWithResult(consumptionTransactionActionCellResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(consumptionTransactionActionCellResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ConsumptionTransactionActionCellResponse.onExtraCallbackWithResult(consumptionTransactionActionCellResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (ConsumptionTransactionActionCellResponse) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 36 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onWarmupCompleted + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}

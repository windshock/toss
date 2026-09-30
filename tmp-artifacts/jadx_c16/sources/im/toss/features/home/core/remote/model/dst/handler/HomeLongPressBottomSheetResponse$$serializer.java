package im.toss.features.home.core.remote.model.dst.handler;

import im.toss.features.home.core.remote.model.dst.widget.BottomSheetResponse;
import im.toss.features.home.core.remote.model.dst.widget.BottomSheetResponse$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeLongPressBottomSheetResponse$$serializer implements aeu2<HomeLongPressBottomSheetResponse> {
    public static final HomeLongPressBottomSheetResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        HomeLongPressBottomSheetResponse$$serializer homeLongPressBottomSheetResponse$$serializer = new HomeLongPressBottomSheetResponse$$serializer();
        INSTANCE = homeLongPressBottomSheetResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.dst.handler.HomeLongPressBottomSheetResponse", homeLongPressBottomSheetResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("bottomSheet", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 53;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 70 / 0;
        }
    }

    private HomeLongPressBottomSheetResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(BottomSheetResponse$.serializer.INSTANCE)};
        int i4 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeLongPressBottomSheetResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        BottomSheetResponse bottomSheetResponse;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            bottomSheetResponse = (BottomSheetResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, BottomSheetResponse$.serializer.INSTANCE, (Object) null);
        } else {
            boolean z = true;
            BottomSheetResponse bottomSheetResponse2 = null;
            int i3 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onExtraCallbackWithResult;
                    int i5 = i4 + 55;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = i4 + 65;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    bottomSheetResponse2 = (BottomSheetResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, BottomSheetResponse$.serializer.INSTANCE, bottomSheetResponse2);
                    i3 = 1;
                } else {
                    z = false;
                }
            }
            bottomSheetResponse = bottomSheetResponse2;
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeLongPressBottomSheetResponse(i2, bottomSheetResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m597deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HomeLongPressBottomSheetResponse homeLongPressBottomSheetResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return homeLongPressBottomSheetResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeLongPressBottomSheetResponse homeLongPressBottomSheetResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(homeLongPressBottomSheetResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeLongPressBottomSheetResponse.onExtraCallbackWithResult(homeLongPressBottomSheetResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeLongPressBottomSheetResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeLongPressBottomSheetResponse.onExtraCallbackWithResult(homeLongPressBottomSheetResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeLongPressBottomSheetResponse) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

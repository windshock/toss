package im.toss.features.home.core.remote.model.dst.handler;

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
public final /* synthetic */ class HomeDstMutateVariableProcessResponse$$serializer implements aeu2<HomeDstMutateVariableProcessResponse> {
    private static int IAuthTabCallback = 1;
    public static final HomeDstMutateVariableProcessResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 27 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 11;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return serialDescriptor;
    }

    static {
        HomeDstMutateVariableProcessResponse$$serializer homeDstMutateVariableProcessResponse$$serializer = new HomeDstMutateVariableProcessResponse$$serializer();
        INSTANCE = homeDstMutateVariableProcessResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.dst.handler.HomeDstMutateVariableProcessResponse", homeDstMutateVariableProcessResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("handler", true);
        setanimationsloop.onWarmupCompleted("mergeState", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 99;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private HomeDstMutateVariableProcessResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback((KSerializer) HomeDstMutateVariableProcessResponse.IAuthTabCallback()[1].getValue())};
        }
        Lazy[] lazyArrIAuthTabCallback = HomeDstMutateVariableProcessResponse.IAuthTabCallback();
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[1].getValue());
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = kSerializerIAuthTabCallback;
        kSerializerArr[1] = kSerializerIAuthTabCallback2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeDstMutateVariableProcessResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HandlerResponse handlerResponse;
        Map map;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = HomeDstMutateVariableProcessResponse.IAuthTabCallback();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            handlerResponse = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            map = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            i = 3;
        } else {
            int i7 = 0;
            HandlerResponse handlerResponse2 = null;
            Map map2 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = onWarmupCompleted + 71;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), map2);
                    i7 |= 2;
                } else {
                    handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse2);
                    i7 |= 1;
                }
            }
            handlerResponse = handlerResponse2;
            map = map2;
            i = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeDstMutateVariableProcessResponse(i, handlerResponse, map, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m595deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeDstMutateVariableProcessResponse homeDstMutateVariableProcessResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(homeDstMutateVariableProcessResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeDstMutateVariableProcessResponse.onExtraCallback(homeDstMutateVariableProcessResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeDstMutateVariableProcessResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeDstMutateVariableProcessResponse.onExtraCallback(homeDstMutateVariableProcessResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 37 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeDstMutateVariableProcessResponse) obj);
        int i4 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

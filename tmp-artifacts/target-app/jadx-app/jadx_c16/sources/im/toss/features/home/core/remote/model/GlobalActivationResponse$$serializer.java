package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.GlobalActivationResponse;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GlobalActivationResponse$$serializer implements aeu2<GlobalActivationResponse> {
    public static final GlobalActivationResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 37;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        GlobalActivationResponse$$serializer globalActivationResponse$$serializer = new GlobalActivationResponse$$serializer();
        INSTANCE = globalActivationResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.GlobalActivationResponse", globalActivationResponse$$serializer, 4);
        setanimationsloop.onWarmupCompleted("totalStep", true);
        setanimationsloop.onWarmupCompleted("currentStep", true);
        setanimationsloop.onWarmupCompleted("stepType", true);
        setanimationsloop.onWarmupCompleted("stepData", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 99;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private GlobalActivationResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(GlobalActivationResponse$StepDataResponse$$serializer.INSTANCE)};
        int i4 = onWarmupCompleted + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GlobalActivationResponse deserialize(@NotNull Decoder decoder) throws Throwable {
        String str;
        Integer num;
        GlobalActivationResponse.StepDataResponse stepDataResponse;
        int i;
        Integer num2;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        onExtraCallback = i3 % 128;
        Throwable th = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
            Integer num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getdynamicheight, (Object) null);
            Integer num4 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getdynamicheight, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            num = num4;
            stepDataResponse = (GlobalActivationResponse.StepDataResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, GlobalActivationResponse$StepDataResponse$$serializer.INSTANCE, (Object) null);
            i = 15;
            num2 = num3;
        } else {
            String str2 = null;
            Integer num5 = null;
            GlobalActivationResponse.StepDataResponse stepDataResponse2 = null;
            Integer num6 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int i5 = onExtraCallback + 77;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = onExtraCallback + 75;
                    int i8 = i7 % 128;
                    onWarmupCompleted = i8;
                    if (i7 % 2 != 0) {
                        Throwable th2 = th;
                        th2.hashCode();
                        throw th2;
                    }
                    if (iOnNavigationEvent != 0) {
                        int i9 = i8 + 73;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        if (iOnNavigationEvent == 1) {
                            num5 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, num5);
                            i4 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                            i4 |= 4;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i11 = i8 + 39;
                            onExtraCallback = i11 % 128;
                            int i12 = i11 % 2;
                            stepDataResponse2 = (GlobalActivationResponse.StepDataResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, GlobalActivationResponse$StepDataResponse$$serializer.INSTANCE, stepDataResponse2);
                            i4 |= 8;
                        }
                    } else {
                        num6 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, num6);
                        i4 |= 1;
                    }
                    th = null;
                } else {
                    z = false;
                }
            }
            int i13 = onWarmupCompleted + 53;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            str = str2;
            num = num5;
            stepDataResponse = stepDataResponse2;
            i = i4;
            num2 = num6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new GlobalActivationResponse(i, num2, num, str, stepDataResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m540deserialize(Decoder decoder) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        GlobalActivationResponse globalActivationResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return globalActivationResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GlobalActivationResponse globalActivationResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(globalActivationResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        GlobalActivationResponse.onExtraCallback(globalActivationResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GlobalActivationResponse) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

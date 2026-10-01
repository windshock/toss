package im.toss.features.credit.data.response;

import im.toss.features.credit.data.response.PackageSubmitResponse;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PackageSubmitResponse$SubmitResultResponse$$serializer implements aeu2<PackageSubmitResponse.SubmitResultResponse> {
    private static int IAuthTabCallback = 1;
    public static final PackageSubmitResponse$SubmitResultResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        PackageSubmitResponse$SubmitResultResponse$$serializer packageSubmitResponse$SubmitResultResponse$$serializer = new PackageSubmitResponse$SubmitResultResponse$$serializer();
        INSTANCE = packageSubmitResponse$SubmitResultResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.PackageSubmitResponse.SubmitResultResponse", packageSubmitResponse$SubmitResultResponse$$serializer, 4);
        setanimationsloop.onWarmupCompleted("raisedScore", true);
        setanimationsloop.onWarmupCompleted("success", true);
        setanimationsloop.onWarmupCompleted("before", true);
        setanimationsloop.onWarmupCompleted("after", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private PackageSubmitResponse$SubmitResultResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(getBgColor.IAuthTabCallback), sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(getdynamicheight)};
        int i4 = IAuthTabCallback + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final PackageSubmitResponse.SubmitResultResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Integer num;
        Boolean bool;
        Integer num2;
        Integer num3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
            Integer num4 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getdynamicheight, (Object) null);
            Boolean bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, (Object) null);
            num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getdynamicheight, (Object) null);
            num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getdynamicheight, (Object) null);
            i = 15;
            num = num4;
            bool = bool2;
        } else {
            i = 0;
            boolean z = true;
            Integer num5 = null;
            Integer num6 = null;
            num = null;
            bool = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i3 = onExtraCallback;
                    int i4 = i3 + 95;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, num);
                        i |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, bool);
                        i |= 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i5 = i3 + 15;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        num6 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getDynamicHeight.onWarmupCompleted, num6);
                        i |= 8;
                        int i7 = IAuthTabCallback + 13;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        num5 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getDynamicHeight.onWarmupCompleted, num5);
                        i |= 4;
                    }
                } else {
                    z = false;
                }
            }
            num2 = num5;
            num3 = num6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PackageSubmitResponse.SubmitResultResponse(i, num, bool, num2, num3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m185deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        PackageSubmitResponse.SubmitResultResponse submitResultResponseDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return submitResultResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PackageSubmitResponse.SubmitResultResponse submitResultResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(submitResultResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            PackageSubmitResponse.SubmitResultResponse.onNavigationEvent(submitResultResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(submitResultResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        PackageSubmitResponse.SubmitResultResponse.onNavigationEvent(submitResultResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PackageSubmitResponse.SubmitResultResponse) obj);
        int i4 = onExtraCallback + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

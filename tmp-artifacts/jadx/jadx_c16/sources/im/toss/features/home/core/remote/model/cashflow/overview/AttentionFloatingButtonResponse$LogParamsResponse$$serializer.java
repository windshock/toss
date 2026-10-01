package im.toss.features.home.core.remote.model.cashflow.overview;

import im.toss.features.home.core.remote.model.cashflow.overview.AttentionFloatingButtonResponse;
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
public final /* synthetic */ class AttentionFloatingButtonResponse$LogParamsResponse$$serializer implements aeu2<AttentionFloatingButtonResponse.LogParamsResponse> {
    private static int IAuthTabCallback = 0;
    public static final AttentionFloatingButtonResponse$LogParamsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return serialDescriptor;
    }

    static {
        AttentionFloatingButtonResponse$LogParamsResponse$$serializer attentionFloatingButtonResponse$LogParamsResponse$$serializer = new AttentionFloatingButtonResponse$LogParamsResponse$$serializer();
        INSTANCE = attentionFloatingButtonResponse$LogParamsResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.cashflow.overview.AttentionFloatingButtonResponse.LogParamsResponse", attentionFloatingButtonResponse$LogParamsResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("expireCountdown", true);
        setanimationsloop.onWarmupCompleted("expiringSoonIndustry", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 37;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private AttentionFloatingButtonResponse$LogParamsResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 == 0 ? new KSerializer[]{sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)} : new KSerializer[]{sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AttentionFloatingButtonResponse.LogParamsResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Integer num;
        String str;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallback + 115;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            i = 3;
        } else {
            int i5 = IAuthTabCallback + 73;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            Integer num2 = null;
            String str2 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = IAuthTabCallback;
                    int i9 = i8 + 77;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i11 = i8 + 83;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i7 |= 2;
                    } else {
                        num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, num2);
                        i7 |= 1;
                    }
                } else {
                    int i13 = onWarmupCompleted + 89;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    z = false;
                }
            }
            num = num2;
            str = str2;
            i = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AttentionFloatingButtonResponse.LogParamsResponse(i, num, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m564deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AttentionFloatingButtonResponse.LogParamsResponse logParamsResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return logParamsResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AttentionFloatingButtonResponse.LogParamsResponse logParamsResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(logParamsResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AttentionFloatingButtonResponse.LogParamsResponse.onNavigationEvent(logParamsResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AttentionFloatingButtonResponse.LogParamsResponse) obj);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        int i5 = IAuthTabCallback + 15;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 125;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

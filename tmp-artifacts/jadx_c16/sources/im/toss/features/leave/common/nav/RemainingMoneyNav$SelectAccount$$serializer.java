package im.toss.features.leave.common.nav;

import im.toss.features.leave.common.nav.RemainingMoneyNav;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RemainingMoneyNav$SelectAccount$$serializer implements aeu2<RemainingMoneyNav.SelectAccount> {
    public static final int $stable;
    public static final RemainingMoneyNav$SelectAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 11;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 41 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        RemainingMoneyNav$SelectAccount$$serializer remainingMoneyNav$SelectAccount$$serializer = new RemainingMoneyNav$SelectAccount$$serializer();
        INSTANCE = remainingMoneyNav$SelectAccount$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.leave.common.nav.RemainingMoneyNav.SelectAccount", remainingMoneyNav$SelectAccount$$serializer, 1);
        setanimationsloop.onWarmupCompleted("bankNumber", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 20 / 0;
        }
    }

    private RemainingMoneyNav$SelectAccount$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        int i4 = onExtraCallback + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final RemainingMoneyNav.SelectAccount deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onNavigationEvent + 75;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
        } else {
            String str2 = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = onNavigationEvent + 125;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str2);
                    i5 = 1;
                }
            }
            str = str2;
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new RemainingMoneyNav.SelectAccount(i2, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m644deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RemainingMoneyNav.SelectAccount selectAccountDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        int i5 = onExtraCallback + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return selectAccountDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RemainingMoneyNav.SelectAccount selectAccount) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(selectAccount, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        RemainingMoneyNav.SelectAccount.onExtraCallbackWithResult(selectAccount, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (RemainingMoneyNav.SelectAccount) obj);
        int i4 = onNavigationEvent + 119;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 121;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}

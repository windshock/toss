package im.toss.features.leave.common.nav;

import im.toss.features.leave.common.nav.LeaveNav;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveNav$RemainingMoneyNavRoot$$serializer implements aeu2<LeaveNav.RemainingMoneyNavRoot> {
    public static final int $stable;
    public static final LeaveNav$RemainingMoneyNavRoot$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        LeaveNav$RemainingMoneyNavRoot$$serializer leaveNav$RemainingMoneyNavRoot$$serializer = new LeaveNav$RemainingMoneyNavRoot$$serializer();
        INSTANCE = leaveNav$RemainingMoneyNavRoot$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.leave.common.nav.LeaveNav.RemainingMoneyNavRoot", leaveNav$RemainingMoneyNavRoot$$serializer, 1);
        setanimationsloop.onWarmupCompleted("isVisitor", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 9;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private LeaveNav$RemainingMoneyNavRoot$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getBgColor.IAuthTabCallback};
        int i4 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LeaveNav.RemainingMoneyNavRoot deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        int iOnNavigationEvent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i3 % 128;
            zOnExtraCallbackWithResult = i3 % 2 != 0 ? ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1) : ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
        } else {
            boolean z = true;
            zOnExtraCallbackWithResult = false;
            int i4 = 0;
            while (z) {
                int i5 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i6 = 32 / 0;
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else {
                        if (iOnNavigationEvent == 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                        i4 = 1;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                    }
                }
            }
            i2 = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LeaveNav.RemainingMoneyNavRoot(i2, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m643deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LeaveNav.RemainingMoneyNavRoot remainingMoneyNavRootDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return remainingMoneyNavRootDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LeaveNav.RemainingMoneyNavRoot remainingMoneyNavRoot) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(remainingMoneyNavRoot, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            LeaveNav.RemainingMoneyNavRoot.onWarmupCompleted(remainingMoneyNavRoot, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(remainingMoneyNavRoot, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        LeaveNav.RemainingMoneyNavRoot.onWarmupCompleted(remainingMoneyNavRoot, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LeaveNav.RemainingMoneyNavRoot) obj);
        int i4 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

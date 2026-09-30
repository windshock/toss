package viva.republica.toss.network.model.transfer;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.ExternalWithdrawInfo;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ExternalWithdrawInfo$BalanceInfo$$serializer implements aeu2<ExternalWithdrawInfo.BalanceInfo> {
    public static final int $stable;
    public static final ExternalWithdrawInfo$BalanceInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        ExternalWithdrawInfo$BalanceInfo$$serializer externalWithdrawInfo$BalanceInfo$$serializer = new ExternalWithdrawInfo$BalanceInfo$$serializer();
        INSTANCE = externalWithdrawInfo$BalanceInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.ExternalWithdrawInfo.BalanceInfo", externalWithdrawInfo$BalanceInfo$$serializer, 2);
        setanimationsloop.onWarmupCompleted("totalBalance", true);
        setanimationsloop.onWarmupCompleted("withdrawableBalance", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 47;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private ExternalWithdrawInfo$BalanceInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var)};
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ExternalWithdrawInfo.BalanceInfo balanceInfoM93deserialize = m93deserialize(decoder);
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return balanceInfoM93deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final ExternalWithdrawInfo.BalanceInfo m93deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Long l;
        Long l2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            oty1 oty1Var = oty1.onExtraCallback;
            l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1Var, (Object) null);
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1Var, (Object) null);
            i = 3;
        } else {
            int i3 = 0;
            Long l3 = null;
            Long l4 = null;
            boolean z = true;
            while (z) {
                int i4 = onWarmupCompleted + 17;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onWarmupCompleted + 89;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent == 0) {
                        l4 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, l4);
                        i3 |= 1;
                        int i8 = onWarmupCompleted + 97;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, l3);
                        i3 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            l = l3;
            l2 = l4;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExternalWithdrawInfo.BalanceInfo(i, l2, l, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExternalWithdrawInfo.BalanceInfo) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExternalWithdrawInfo.BalanceInfo balanceInfo) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(balanceInfo, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ExternalWithdrawInfo.BalanceInfo.IAuthTabCallback(balanceInfo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

package viva.republica.toss.tosspaymoney.model;

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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class MoveToTossPayMoneyInfo$$serializer implements aeu2<MoveToTossPayMoneyInfo> {
    public static final int $stable;
    public static final MoveToTossPayMoneyInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MoveToTossPayMoneyInfo$$serializer moveToTossPayMoneyInfo$$serializer = new MoveToTossPayMoneyInfo$$serializer();
        INSTANCE = moveToTossPayMoneyInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.tosspaymoney.model.MoveToTossPayMoneyInfo", moveToTossPayMoneyInfo$$serializer, 1);
        setanimationsloop.onWarmupCompleted("tosspayMoneyPostBalance", false);
        descriptor = setanimationsloop;
    }

    private MoveToTossPayMoneyInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{oty1.onExtraCallback};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final MoveToTossPayMoneyInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        long jIAuthTabCallbackDefault;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
        } else {
            long jIAuthTabCallbackDefault2 = 0;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                    i2 = 1;
                }
            }
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault2;
            i = i2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MoveToTossPayMoneyInfo(i, jIAuthTabCallbackDefault, (okycx) null);
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MoveToTossPayMoneyInfo moveToTossPayMoneyInfo) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(moveToTossPayMoneyInfo, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        MoveToTossPayMoneyInfo.IAuthTabCallback(moveToTossPayMoneyInfo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}

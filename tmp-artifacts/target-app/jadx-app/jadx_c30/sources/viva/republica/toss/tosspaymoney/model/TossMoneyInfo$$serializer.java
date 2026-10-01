package viva.republica.toss.tosspaymoney.model;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.getBgColor;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossMoneyInfo$$serializer implements aeu2<TossMoneyInfo> {
    public static final int $stable;
    public static final TossMoneyInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TossMoneyInfo$$serializer tossMoneyInfo$$serializer = new TossMoneyInfo$$serializer();
        INSTANCE = tossMoneyInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.tosspaymoney.model.TossMoneyInfo", tossMoneyInfo$$serializer, 4);
        setanimationsloop.onWarmupCompleted("isNewlyAdult", false);
        setanimationsloop.onWarmupCompleted("tossMoneyBalance", false);
        setanimationsloop.onWarmupCompleted("hasBankAccount", false);
        setanimationsloop.onWarmupCompleted("originDocument", false);
        descriptor = setanimationsloop;
    }

    private TossMoneyInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) TossMoneyInfo.onWarmupCompleted()[3].getValue());
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        return new KSerializer[]{getbgcolor, oty1.onExtraCallback, getbgcolor, kSerializerIAuthTabCallback};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TossMoneyInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean z;
        Map map;
        int i;
        boolean z2;
        long j;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = TossMoneyInfo.onWarmupCompleted();
        Map map2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            map = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrOnWarmupCompleted[3].getValue(), (Object) null);
            z = zOnExtraCallbackWithResult;
            i = 15;
            z2 = zOnExtraCallbackWithResult2;
            j = jIAuthTabCallbackDefault;
        } else {
            boolean z3 = true;
            boolean zOnExtraCallbackWithResult3 = false;
            long jIAuthTabCallbackDefault2 = 0;
            int i2 = 0;
            boolean zOnExtraCallbackWithResult4 = false;
            while (z3) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z3 = false;
                } else if (iOnNavigationEvent == 0) {
                    zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iOnNavigationEvent == 2) {
                    zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iOnNavigationEvent != 3) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrOnWarmupCompleted[3].getValue(), map2);
                    i2 |= 8;
                }
            }
            z = zOnExtraCallbackWithResult3;
            map = map2;
            i = i2;
            z2 = zOnExtraCallbackWithResult4;
            j = jIAuthTabCallbackDefault2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossMoneyInfo(i, z, j, z2, map, (okycx) null);
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossMoneyInfo tossMoneyInfo) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(tossMoneyInfo, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TossMoneyInfo.onWarmupCompleted(tossMoneyInfo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}

package viva.republica.toss.ads;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class RedirectionLogRecord$$serializer implements aeu2<RedirectionLogRecord> {
    public static final int $stable;
    public static final RedirectionLogRecord$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RedirectionLogRecord$$serializer redirectionLogRecord$$serializer = new RedirectionLogRecord$$serializer();
        INSTANCE = redirectionLogRecord$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.ads.RedirectionLogRecord", redirectionLogRecord$$serializer, 5);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("userNo", false);
        setanimationsloop.onWarmupCompleted("params", false);
        setanimationsloop.onWarmupCompleted("createdAt", false);
        setanimationsloop.onWarmupCompleted("retryCount", true);
        descriptor = setanimationsloop;
    }

    private RedirectionLogRecord$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr = RedirectionLogRecord.$childSerializers;
        oty1 oty1Var = oty1.onExtraCallback;
        return new KSerializer[]{getWriggleLayout.onNavigationEvent, oty1Var, lazyArr[2].getValue(), oty1Var, getDynamicHeight.onWarmupCompleted};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final RedirectionLogRecord deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        Map map;
        long jIAuthTabCallbackDefault;
        int iOnTransact;
        long j;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArr = RedirectionLogRecord.$childSerializers;
        Map map2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            long jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            map = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArr[2].getValue(), (Object) null);
            str = strAsInterface;
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
            j = jIAuthTabCallbackDefault2;
            i = 31;
        } else {
            long jIAuthTabCallbackDefault3 = 0;
            String strAsInterface2 = null;
            int iOnTransact2 = 0;
            int i2 = 0;
            boolean z = true;
            long jIAuthTabCallbackDefault4 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iOnNavigationEvent == 2) {
                    map2 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArr[2].getValue(), map2);
                    i2 |= 4;
                } else if (iOnNavigationEvent == 3) {
                    jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
                    i2 |= 8;
                } else {
                    if (iOnNavigationEvent != 4) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
                    i2 |= 16;
                }
            }
            str = strAsInterface2;
            map = map2;
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault3;
            iOnTransact = iOnTransact2;
            j = jIAuthTabCallbackDefault4;
            i = i2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new RedirectionLogRecord(i, str, j, map, jIAuthTabCallbackDefault, iOnTransact, (okycx) null);
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RedirectionLogRecord redirectionLogRecord) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(redirectionLogRecord, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        RedirectionLogRecord.onExtraCallback(redirectionLogRecord, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}

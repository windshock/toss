package viva.republica.toss.network.model.electronicdocument.wallet;

import java.util.List;
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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class EDocDocCodesInfoReq$$serializer implements aeu2<EDocDocCodesInfoReq> {
    public static final EDocDocCodesInfoReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 53;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        EDocDocCodesInfoReq$$serializer eDocDocCodesInfoReq$$serializer = new EDocDocCodesInfoReq$$serializer();
        INSTANCE = eDocDocCodesInfoReq$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.electronicdocument.wallet.EDocDocCodesInfoReq", eDocDocCodesInfoReq$$serializer, 1);
        setanimationsloop.onWarmupCompleted("docCodes", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 9;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private EDocDocCodesInfoReq$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {EDocDocCodesInfoReq.onNavigationEvent()[0].getValue()};
        int i4 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        EDocDocCodesInfoReq eDocDocCodesInfoReqM54deserialize = m54deserialize(decoder);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return eDocDocCodesInfoReqM54deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final EDocDocCodesInfoReq m54deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = EDocDocCodesInfoReq.onNavigationEvent();
        Object obj = null;
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
        } else {
            List list2 = null;
            boolean z = true;
            loop0: while (true) {
                int i5 = 0;
                while (!(!z)) {
                    int i6 = onWarmupCompleted + 81;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        obj.hashCode();
                        throw null;
                    }
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i7 = onWarmupCompleted + 45;
                        onExtraCallbackWithResult = i7 % 128;
                        if (i7 % 2 == 0) {
                            break;
                        }
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), list2);
                        i5 = 1;
                    }
                }
                list = list2;
                i2 = i5;
                list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[0].getValue(), list2);
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new EDocDocCodesInfoReq(i2, list, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (EDocDocCodesInfoReq) obj);
        int i4 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull EDocDocCodesInfoReq eDocDocCodesInfoReq) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(eDocDocCodesInfoReq, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        EDocDocCodesInfoReq.onExtraCallbackWithResult(eDocDocCodesInfoReq, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

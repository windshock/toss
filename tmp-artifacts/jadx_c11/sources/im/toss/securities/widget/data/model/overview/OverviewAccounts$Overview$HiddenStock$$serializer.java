package im.toss.securities.widget.data.model.overview;

import im.toss.securities.widget.data.model.overview.OverviewAccounts;
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
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class OverviewAccounts$Overview$HiddenStock$$serializer implements aeu2<OverviewAccounts.Overview.HiddenStock> {
    public static final OverviewAccounts$Overview$HiddenStock$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 101;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        OverviewAccounts$Overview$HiddenStock$$serializer overviewAccounts$Overview$HiddenStock$$serializer = new OverviewAccounts$Overview$HiddenStock$$serializer();
        INSTANCE = overviewAccounts$Overview$HiddenStock$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.overview.OverviewAccounts.Overview.HiddenStock", overviewAccounts$Overview$HiddenStock$$serializer, 3);
        setanimationsloop.onWarmupCompleted("all", true);
        setanimationsloop.onWarmupCompleted("count", true);
        setanimationsloop.onWarmupCompleted("amount", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 97;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 59 / 0;
        }
    }

    private OverviewAccounts$Overview$HiddenStock$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getBgColor.IAuthTabCallback), sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), sp.IAuthTabCallback(setVideoListener.onWarmupCompleted)};
        int i4 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewAccounts.Overview.HiddenStock deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Integer num;
        Boolean bool;
        Double d;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Integer num2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Boolean bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getBgColor.IAuthTabCallback, (Object) null);
            Integer num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, (Object) null);
            d = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setVideoListener.onWarmupCompleted, (Object) null);
            bool = bool2;
            num = num3;
            i = 7;
        } else {
            int i5 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            boolean z = true;
            Boolean bool3 = null;
            Double d2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = onExtraCallbackWithResult;
                    int i9 = i8 + 83;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i11 = i8 + 79;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        if (iOnNavigationEvent == 1) {
                            num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, num2);
                            i7 |= 2;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            d2 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setVideoListener.onWarmupCompleted, d2);
                            i7 |= 4;
                        }
                    } else {
                        bool3 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getBgColor.IAuthTabCallback, bool3);
                        i7 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            i = i7;
            num = num2;
            bool = bool3;
            d = d2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewAccounts.Overview.HiddenStock(i, bool, num, d, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m43deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewAccounts.Overview.HiddenStock hiddenStock) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(hiddenStock, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        OverviewAccounts.Overview.HiddenStock.onExtraCallback(hiddenStock, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewAccounts.Overview.HiddenStock) obj);
        int i4 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

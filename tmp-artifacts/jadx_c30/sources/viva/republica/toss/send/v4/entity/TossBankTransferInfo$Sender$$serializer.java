package viva.republica.toss.send.v4.entity;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.send.v4.entity.TossBankTransferInfo;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossBankTransferInfo$Sender$$serializer implements aeu2<TossBankTransferInfo.Sender> {
    public static final int $stable;
    public static final TossBankTransferInfo$Sender$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TossBankTransferInfo$Sender$$serializer tossBankTransferInfo$Sender$$serializer = new TossBankTransferInfo$Sender$$serializer();
        INSTANCE = tossBankTransferInfo$Sender$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.send.v4.entity.TossBankTransferInfo.Sender", tossBankTransferInfo$Sender$$serializer, 3);
        setanimationsloop.onWarmupCompleted("bankCode", false);
        setanimationsloop.onWarmupCompleted("accountNo", false);
        setanimationsloop.onWarmupCompleted("accountName", false);
        descriptor = setanimationsloop;
    }

    private TossBankTransferInfo$Sender$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        return new KSerializer[]{getDynamicHeight.onWarmupCompleted, getwrigglelayout, getwrigglelayout};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TossBankTransferInfo.Sender deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String strAsInterface;
        String str;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            i = iOnTransact;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            str = strAsInterface2;
            i2 = 7;
        } else {
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            int iOnTransact2 = 0;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                    i3 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i3 |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                    i3 |= 4;
                }
            }
            i = iOnTransact2;
            strAsInterface = strAsInterface3;
            str = strAsInterface4;
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossBankTransferInfo.Sender(i2, i, str, strAsInterface, (okycx) null);
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossBankTransferInfo.Sender sender) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(sender, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TossBankTransferInfo.Sender.onExtraCallback(sender, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}

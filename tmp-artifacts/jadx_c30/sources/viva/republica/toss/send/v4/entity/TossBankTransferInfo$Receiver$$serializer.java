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
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.send.v4.entity.TossBankTransferInfo;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossBankTransferInfo$Receiver$$serializer implements aeu2<TossBankTransferInfo.Receiver> {
    public static final int $stable;
    public static final TossBankTransferInfo$Receiver$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TossBankTransferInfo$Receiver$$serializer tossBankTransferInfo$Receiver$$serializer = new TossBankTransferInfo$Receiver$$serializer();
        INSTANCE = tossBankTransferInfo$Receiver$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.send.v4.entity.TossBankTransferInfo.Receiver", tossBankTransferInfo$Receiver$$serializer, 4);
        setanimationsloop.onWarmupCompleted("bankCode", false);
        setanimationsloop.onWarmupCompleted("accountNo", false);
        setanimationsloop.onWarmupCompleted("accountName", false);
        setanimationsloop.onWarmupCompleted("isMine", false);
        descriptor = setanimationsloop;
    }

    private TossBankTransferInfo$Receiver$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        return new KSerializer[]{getDynamicHeight.onWarmupCompleted, kSerializer, sp.IAuthTabCallback(kSerializer), getBgColor.IAuthTabCallback};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TossBankTransferInfo.Receiver deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        boolean zOnExtraCallbackWithResult;
        String str;
        String str2;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            i = iOnTransact;
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            str = str3;
            i2 = 15;
            str2 = strAsInterface;
        } else {
            String str4 = null;
            String strAsInterface2 = null;
            boolean z = true;
            int iOnTransact2 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            int i3 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                    i3 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i3 |= 2;
                } else if (iOnNavigationEvent == 2) {
                    str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str4);
                    i3 |= 4;
                } else {
                    if (iOnNavigationEvent != 3) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                    i3 |= 8;
                }
            }
            i = iOnTransact2;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            str = str4;
            str2 = strAsInterface2;
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossBankTransferInfo.Receiver(i2, i, str2, str, zOnExtraCallbackWithResult, (okycx) null);
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossBankTransferInfo.Receiver receiver) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(receiver, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TossBankTransferInfo.Receiver.onNavigationEvent(receiver, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}

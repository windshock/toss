package im.toss.features.cardrecommend.test.model;

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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FunnelItem$$serializer implements aeu2<FunnelItem> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final FunnelItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 87;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        FunnelItem$$serializer funnelItem$$serializer = new FunnelItem$$serializer();
        INSTANCE = funnelItem$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.cardrecommend.test.model.FunnelItem", funnelItem$$serializer, 2);
        setanimationsloop.onWarmupCompleted("funnelCode", false);
        setanimationsloop.onWarmupCompleted("cardName", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 3;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 33 / 0;
        }
    }

    private FunnelItem$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[5];
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[1] = getwrigglelayout;
            kSerializerArr[1] = getwrigglelayout;
        } else {
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{getwrigglelayout2, getwrigglelayout2};
        }
        int i3 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final FunnelItem deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 3;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
        } else {
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int i6 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = onWarmupCompleted + 121;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                    }
                } else {
                    strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i5 |= 1;
                }
            }
            strAsInterface = strAsInterface3;
            strAsInterface2 = strAsInterface4;
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new FunnelItem(i2, strAsInterface, strAsInterface2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m112deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull FunnelItem funnelItem) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(funnelItem, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            FunnelItem.onExtraCallback(funnelItem, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(funnelItem, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        FunnelItem.onExtraCallback(funnelItem, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 39 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (FunnelItem) obj);
        int i4 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}

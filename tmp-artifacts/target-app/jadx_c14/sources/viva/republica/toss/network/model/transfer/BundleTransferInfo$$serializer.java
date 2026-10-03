package viva.republica.toss.network.model.transfer;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class BundleTransferInfo$$serializer implements aeu2<BundleTransferInfo> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final BundleTransferInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 41;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return serialDescriptor;
    }

    static {
        BundleTransferInfo$$serializer bundleTransferInfo$$serializer = new BundleTransferInfo$$serializer();
        INSTANCE = bundleTransferInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.BundleTransferInfo", bundleTransferInfo$$serializer, 2);
        setanimationsloop.onWarmupCompleted("bundleKey", false);
        setanimationsloop.onWarmupCompleted("amounts", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private BundleTransferInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{getWriggleLayout.onNavigationEvent, BundleTransferInfo.onExtraCallback()[1].getValue()};
        }
        Lazy[] lazyArrOnExtraCallback = BundleTransferInfo.onExtraCallback();
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        kSerializerArr[0] = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = lazyArrOnExtraCallback[0].getValue();
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        BundleTransferInfo bundleTransferInfoM78deserialize = m78deserialize(decoder);
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return bundleTransferInfoM78deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final BundleTransferInfo m78deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        List list;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = BundleTransferInfo.onExtraCallback();
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i3 = 0;
            String strAsInterface2 = null;
            List list2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onNavigationEvent;
                    int i5 = i4 + 35;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i3 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i6 = i4 + 37;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), list2);
                        i3 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            strAsInterface = strAsInterface2;
            list = list2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BundleTransferInfo(i, strAsInterface, list, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BundleTransferInfo) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BundleTransferInfo bundleTransferInfo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bundleTransferInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BundleTransferInfo.onNavigationEvent(bundleTransferInfo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 117;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 6 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

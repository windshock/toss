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
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.DepositTargetRecommendResponse;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class DepositTargetRecommendResponse$ResourceMeta$$serializer implements aeu2<DepositTargetRecommendResponse.ResourceMeta> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final DepositTargetRecommendResponse$ResourceMeta$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 29;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        DepositTargetRecommendResponse$ResourceMeta$$serializer depositTargetRecommendResponse$ResourceMeta$$serializer = new DepositTargetRecommendResponse$ResourceMeta$$serializer();
        INSTANCE = depositTargetRecommendResponse$ResourceMeta$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.DepositTargetRecommendResponse.ResourceMeta", depositTargetRecommendResponse$ResourceMeta$$serializer, 4);
        setanimationsloop.onWarmupCompleted("bankCode", true);
        setanimationsloop.onWarmupCompleted("accountNo", true);
        setanimationsloop.onWarmupCompleted("accountName", true);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private DepositTargetRecommendResponse$ResourceMeta$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getDynamicHeight.onWarmupCompleted, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        int i4 = onWarmupCompleted + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DepositTargetRecommendResponse.ResourceMeta resourceMetaM90deserialize = m90deserialize(decoder);
        int i4 = onNavigationEvent + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return resourceMetaM90deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DepositTargetRecommendResponse.ResourceMeta m90deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int i;
        String strAsInterface2;
        String str;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            i = iOnTransact;
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            str = strAsInterface3;
            i2 = 15;
        } else {
            int i4 = onNavigationEvent + 115;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 4;
            }
            String strAsInterface4 = null;
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            int iOnTransact2 = 0;
            int i6 = 0;
            boolean z = true;
            while (z) {
                int i7 = onWarmupCompleted + 35;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i9 = onWarmupCompleted + 33;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 == 0) {
                        if (iOnNavigationEvent == 1) {
                            strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i6 |= 2;
                        } else if (iOnNavigationEvent != 2) {
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i6 |= 4;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i6 |= 8;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i6 |= 2;
                    } else if (iOnNavigationEvent != 2) {
                    }
                } else {
                    iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                    i6 |= 1;
                }
            }
            strAsInterface = strAsInterface4;
            i = iOnTransact2;
            strAsInterface2 = strAsInterface5;
            str = strAsInterface6;
            i2 = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DepositTargetRecommendResponse.ResourceMeta(i2, i, str, strAsInterface, strAsInterface2, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DepositTargetRecommendResponse.ResourceMeta) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DepositTargetRecommendResponse.ResourceMeta resourceMeta) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(resourceMeta, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DepositTargetRecommendResponse.ResourceMeta.onExtraCallback(resourceMeta, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(resourceMeta, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DepositTargetRecommendResponse.ResourceMeta.onExtraCallback(resourceMeta, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 123;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

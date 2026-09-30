package im.toss.standardtermsv2.param;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class StandardTermsV2BizReceiver$$serializer implements aeu2<StandardTermsV2BizReceiver> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final StandardTermsV2BizReceiver$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        StandardTermsV2BizReceiver$$serializer standardTermsV2BizReceiver$$serializer = new StandardTermsV2BizReceiver$$serializer();
        INSTANCE = standardTermsV2BizReceiver$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.standardtermsv2.param.StandardTermsV2BizReceiver", standardTermsV2BizReceiver$$serializer, 2);
        setanimationsloop.onWarmupCompleted("bizRegNo", false);
        setanimationsloop.onWarmupCompleted("bizName", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 117;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private StandardTermsV2BizReceiver$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[4];
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[1] = getwrigglelayout;
            kSerializerArr[1] = getwrigglelayout;
        } else {
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{getwrigglelayout2, getwrigglelayout2};
        }
        int i3 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final StandardTermsV2BizReceiver deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String strAsInterface;
        String strAsInterface2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = 3;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
        } else {
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            int i7 = 0;
            boolean z = true;
            while (z) {
                int i8 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i10 = onExtraCallbackWithResult + 65;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 == 0) {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i7 |= 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i7 |= 2;
                    }
                } else {
                    strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i7 |= 1;
                }
            }
            i = i7;
            strAsInterface = strAsInterface3;
            strAsInterface2 = strAsInterface4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new StandardTermsV2BizReceiver(i, strAsInterface, strAsInterface2, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m82deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull StandardTermsV2BizReceiver standardTermsV2BizReceiver) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(standardTermsV2BizReceiver, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            StandardTermsV2BizReceiver.IAuthTabCallback(standardTermsV2BizReceiver, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(standardTermsV2BizReceiver, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        StandardTermsV2BizReceiver.IAuthTabCallback(standardTermsV2BizReceiver, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (StandardTermsV2BizReceiver) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

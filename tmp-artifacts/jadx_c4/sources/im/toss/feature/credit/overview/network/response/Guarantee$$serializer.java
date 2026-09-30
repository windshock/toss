package im.toss.feature.credit.overview.network.response;

import com.tmoney.LiveCheckConstants;
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
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class Guarantee$$serializer implements aeu2<Guarantee> {
    private static int IAuthTabCallback = 1;
    public static final Guarantee$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 85;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return serialDescriptor;
    }

    static {
        Guarantee$$serializer guarantee$$serializer = new Guarantee$$serializer();
        INSTANCE = guarantee$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.feature.credit.overview.network.response.Guarantee", guarantee$$serializer, 6);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("organizationName", true);
        setanimationsloop.onWarmupCompleted("iconUri", true);
        setanimationsloop.onWarmupCompleted("contractDate", true);
        setanimationsloop.onWarmupCompleted(LiveCheckConstants.AMOUNT, true);
        setanimationsloop.onWarmupCompleted("tips", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 103;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private Guarantee$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = Guarantee.IAuthTabCallback();
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(oty1Var);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[5].getValue())};
        int i4 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Guarantee deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        Long l;
        int i;
        Long l2;
        String str2;
        String str3;
        List list;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = Guarantee.IAuthTabCallback();
        int i3 = 3;
        String str4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            oty1 oty1Var = oty1.onExtraCallback;
            Long l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1Var, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            Long l4 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1Var, (Object) null);
            List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrIAuthTabCallback[5].getValue(), (Object) null);
            int i4 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            i = 63;
            list = list2;
            l2 = l4;
            l = l3;
            str3 = str5;
            str2 = str6;
            str = str7;
        } else {
            int i6 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 / 5;
            }
            int i8 = 0;
            boolean z = true;
            List list3 = null;
            Long l5 = null;
            str = null;
            Long l6 = null;
            String str8 = null;
            while (z) {
                int i9 = onExtraCallbackWithResult + 45;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i3 = 3;
                    case 0:
                        l6 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, l6);
                        i8 |= 1;
                        i3 = 3;
                    case 1:
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str8);
                        i8 |= 2;
                    case 2:
                        str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str4);
                        i8 |= 4;
                        int i11 = onExtraCallbackWithResult + 85;
                        onWarmupCompleted = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 5 % 4;
                        }
                    case 3:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str);
                        i8 |= 8;
                    case 4:
                        l5 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, l5);
                        i8 |= 16;
                    case 5:
                        list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrIAuthTabCallback[5].getValue(), list3);
                        i8 |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            l = l6;
            i = i8;
            l2 = l5;
            str2 = str4;
            str3 = str8;
            list = list3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        Guarantee guarantee = new Guarantee(i, l, str3, str2, str, l2, list, (okycx) null);
        int i13 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i13 % 128;
        if (i13 % 2 != 0) {
            return guarantee;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m343deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Guarantee guaranteeDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        int i5 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return guaranteeDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Guarantee guarantee) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(guarantee, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        Guarantee.onWarmupCompleted(guarantee, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Guarantee) obj);
        int i4 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

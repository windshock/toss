package im.toss.feature.credit.overview.network.response;

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
public final /* synthetic */ class SubstitutePayment$$serializer implements aeu2<SubstitutePayment> {
    private static int IAuthTabCallback = 0;
    public static final SubstitutePayment$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 86 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 37;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        SubstitutePayment$$serializer substitutePayment$$serializer = new SubstitutePayment$$serializer();
        INSTANCE = substitutePayment$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.feature.credit.overview.network.response.SubstitutePayment", substitutePayment$$serializer, 8);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("organizationName", true);
        setanimationsloop.onWarmupCompleted("repaidAmount", true);
        setanimationsloop.onWarmupCompleted("remainAmount", true);
        setanimationsloop.onWarmupCompleted("createdAt", true);
        setanimationsloop.onWarmupCompleted("iconUri", true);
        setanimationsloop.onWarmupCompleted("dueDate", true);
        setanimationsloop.onWarmupCompleted("tips", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private SubstitutePayment$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = SubstitutePayment.onWarmupCompleted();
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(oty1Var);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[7].getValue())};
        int i4 = onNavigationEvent + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final SubstitutePayment deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Long l;
        Long l2;
        Long l3;
        String str;
        int i;
        String str2;
        List list;
        String str3;
        String str4;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = SubstitutePayment.onWarmupCompleted();
        boolean z = true;
        int i4 = 6;
        int i5 = 5;
        int i6 = 7;
        Long l4 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z2 = true;
            Long l5 = null;
            String str5 = null;
            List list2 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            Long l6 = null;
            int i7 = 0;
            while (z2 == z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = true;
                        i4 = 6;
                        z2 = false;
                        i6 = 7;
                    case 0:
                        i7 |= 1;
                        l6 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, l6);
                        z = true;
                        i4 = 6;
                        i5 = 5;
                        i6 = 7;
                    case 1:
                        i7 |= 2;
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str8);
                        z = true;
                        i4 = 6;
                        i6 = 7;
                    case 2:
                        l4 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, l4);
                        i7 |= 4;
                        z = true;
                        i6 = 7;
                    case 3:
                        l5 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, l5);
                        i7 |= 8;
                        i2 = onNavigationEvent + 125;
                        IAuthTabCallback = i2 % 128;
                        int i8 = i2 % 2;
                        z = true;
                        i6 = 7;
                    case 4:
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str5);
                        i7 |= 16;
                        z = true;
                        i6 = 7;
                    case 5:
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str7);
                        i7 |= 32;
                        z = true;
                        i6 = 7;
                    case 6:
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getWriggleLayout.onNavigationEvent, str6);
                        i7 |= 64;
                        i2 = IAuthTabCallback + 85;
                        onNavigationEvent = i2 % 128;
                        int i82 = i2 % 2;
                        z = true;
                        i6 = 7;
                    case 7:
                        list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, (jp) lazyArrOnWarmupCompleted[i6].getValue(), list2);
                        i7 |= 128;
                        z = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            int i9 = IAuthTabCallback + 97;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            l2 = l5;
            str2 = str5;
            l = l4;
            list = list2;
            str3 = str6;
            str4 = str7;
            str = str8;
            l3 = l6;
            i = i7;
        } else {
            int i11 = onNavigationEvent + 27;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            oty1 oty1Var = oty1.onExtraCallback;
            Long l7 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1Var, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            Long l8 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, oty1Var, (Object) null);
            Long l9 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, oty1Var, (Object) null);
            String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            l = l8;
            l2 = l9;
            l3 = l7;
            str = str9;
            i = 255;
            str2 = str10;
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnWarmupCompleted[7].getValue(), (Object) null);
            str3 = str12;
            str4 = str11;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SubstitutePayment(i, l3, str, l, l2, str2, str4, str3, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m350deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SubstitutePayment substitutePaymentDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        int i5 = onNavigationEvent + 121;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return substitutePaymentDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SubstitutePayment substitutePayment) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(substitutePayment, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        SubstitutePayment.onExtraCallbackWithResult(substitutePayment, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SubstitutePayment) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 21;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

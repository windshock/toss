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
public final /* synthetic */ class Overdue$$serializer implements aeu2<Overdue> {
    private static int IAuthTabCallback = 1;
    public static final Overdue$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        Overdue$$serializer overdue$$serializer = new Overdue$$serializer();
        INSTANCE = overdue$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.feature.credit.overview.network.response.Overdue", overdue$$serializer, 8);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("organizationName", true);
        setanimationsloop.onWarmupCompleted("iconUri", true);
        setanimationsloop.onWarmupCompleted("openDate", true);
        setanimationsloop.onWarmupCompleted("initialAmount", true);
        setanimationsloop.onWarmupCompleted("remainAmount", true);
        setanimationsloop.onWarmupCompleted("bankType", true);
        setanimationsloop.onWarmupCompleted("tips", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 111;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 2 / 0;
        }
    }

    private Overdue$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = Overdue.onWarmupCompleted();
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(oty1Var);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[7].getValue())};
        int i4 = IAuthTabCallback + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Overdue deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        int i;
        List list;
        String str2;
        Long l;
        Long l2;
        Long l3;
        String str3;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = Overdue.onWarmupCompleted();
        int i4 = 6;
        int i5 = 5;
        String str4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onWarmupCompleted + 1;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            oty1 oty1Var = oty1.onExtraCallback;
            l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1Var, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            Long l4 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1Var, (Object) null);
            Long l5 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, oty1Var, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            str4 = str5;
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnWarmupCompleted[7].getValue(), (Object) null);
            l = l5;
            str2 = str7;
            i = 255;
            str = str6;
            l2 = l4;
        } else {
            int i8 = 0;
            boolean z = true;
            Long l6 = null;
            Long l7 = null;
            str = null;
            List list2 = null;
            String str8 = null;
            String str9 = null;
            Long l8 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i2 = 2;
                        i5 = 5;
                    case 0:
                        i8 |= 1;
                        l8 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, l8);
                        i2 = 2;
                        i4 = 6;
                        i5 = 5;
                    case 1:
                        str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str9);
                        i8 |= 2;
                        i2 = 2;
                        i4 = 6;
                        i5 = 5;
                    case 2:
                        str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, getWriggleLayout.onNavigationEvent, str4);
                        i8 |= 4;
                        int i9 = IAuthTabCallback + 33;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % i2;
                        i4 = 6;
                        i5 = 5;
                    case 3:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str);
                        i8 |= 8;
                        i4 = 6;
                    case 4:
                        l7 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, l7);
                        i8 |= 16;
                        i4 = 6;
                    case 5:
                        l6 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, oty1.onExtraCallback, l6);
                        i8 |= 32;
                        int i11 = IAuthTabCallback + 67;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % i2;
                        i4 = 6;
                    case 6:
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getWriggleLayout.onNavigationEvent, str8);
                        i8 |= 64;
                    case 7:
                        list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnWarmupCompleted[7].getValue(), list2);
                        i8 |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            String str10 = str9;
            i = i8;
            list = list2;
            str2 = str8;
            l = l6;
            l2 = l7;
            l3 = l8;
            str3 = str10;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Overdue(i, l3, str3, str4, str, l2, l, str2, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m348deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Overdue overdueDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 11;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return overdueDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Overdue overdue) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(overdue, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        Overdue.onNavigationEvent(overdue, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Overdue) obj);
        int i4 = onWarmupCompleted + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}

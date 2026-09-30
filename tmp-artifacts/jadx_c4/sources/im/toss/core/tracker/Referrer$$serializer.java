package im.toss.core.tracker;

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
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class Referrer$$serializer implements aeu2<Referrer> {
    private static int IAuthTabCallback = 0;
    public static final Referrer$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 125;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 17;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        Referrer$$serializer referrer$$serializer = new Referrer$$serializer();
        INSTANCE = referrer$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.core.tracker.Referrer", referrer$$serializer, 7);
        setanimationsloop.onWarmupCompleted("toss_referrer", true);
        setanimationsloop.onWarmupCompleted("toss_referrer_template_key", true);
        setanimationsloop.onWarmupCompleted("toss_service_referrer_act_type", true);
        setanimationsloop.onWarmupCompleted("toss_service_referrer_screen_schema_id", true);
        setanimationsloop.onWarmupCompleted("toss_service_referrer_click_schema_id", true);
        setanimationsloop.onWarmupCompleted("toss_service_referrer_click_log_name", true);
        setanimationsloop.onWarmupCompleted("toss_service_referrer_text", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private Referrer$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(getwrigglelayout);
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onExtraCallback + 99;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0079 A[PHI: r0 r2
      0x0079: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0039, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0039, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[PHI: r0 r2
      0x003b: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0039, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0039, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Referrer deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Long l;
        int i;
        Long l2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 15;
        onNavigationEvent = i3 % 128;
        int i4 = 6;
        int i5 = 5;
        String str6 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i6 = 56 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
                String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
                String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
                String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
                oty1 oty1Var = oty1.onExtraCallback;
                Long l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, oty1Var, (Object) null);
                l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1Var, (Object) null);
                String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
                String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
                i = 127;
                l2 = l3;
                str = str9;
                str2 = str11;
                str3 = str7;
                str4 = str10;
                str5 = str8;
            } else {
                boolean z = true;
                i = 0;
                String str12 = null;
                String str13 = null;
                l2 = null;
                String str14 = null;
                Long l4 = null;
                String str15 = null;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            int i7 = onExtraCallback + 9;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            i4 = 6;
                            i5 = 5;
                            z = false;
                        case 0:
                            str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str14);
                            i |= 1;
                            i4 = 6;
                            i5 = 5;
                        case 1:
                            str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str12);
                            i |= 2;
                            i4 = 6;
                        case 2:
                            str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str15);
                            i |= 4;
                            i4 = 6;
                        case 3:
                            l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, l2);
                            i |= 8;
                            i4 = 6;
                        case 4:
                            l4 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, l4);
                            i |= 16;
                            i4 = 6;
                        case 5:
                            str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str13);
                            i |= 32;
                            int i9 = onExtraCallback + 59;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                            i4 = 6;
                        case 6:
                            str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getWriggleLayout.onNavigationEvent, str6);
                            i |= 64;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                str5 = str12;
                str2 = str6;
                str4 = str13;
                str3 = str14;
                l = l4;
                str = str15;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Referrer(i, str3, str5, str, l2, l, str4, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m78deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Referrer referrer) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(referrer, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        Referrer.onWarmupCompleted(referrer, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Referrer) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 1;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

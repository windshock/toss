package im.toss.features.edoc.api;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AptiUserResp$$serializer implements aeu2<AptiUserResp> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final AptiUserResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 95 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 11;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        AptiUserResp$$serializer aptiUserResp$$serializer = new AptiUserResp$$serializer();
        INSTANCE = aptiUserResp$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.edoc.api.AptiUserResp", aptiUserResp$$serializer, 6);
        setanimationsloop.onWarmupCompleted("aptCode", true);
        setanimationsloop.onWarmupCompleted("dong", true);
        setanimationsloop.onWarmupCompleted("ho", true);
        setanimationsloop.onWarmupCompleted("isXperpMember", true);
        setanimationsloop.onWarmupCompleted("isAptMember", true);
        setanimationsloop.onWarmupCompleted("schemeUrl", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 7;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private AptiUserResp$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(getwrigglelayout);
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, getbgcolor, getbgcolor, kSerializerIAuthTabCallback4};
        int i4 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AptiUserResp deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        boolean zOnExtraCallbackWithResult;
        boolean zOnExtraCallbackWithResult2;
        int i;
        String str3;
        String str4;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 5;
        String str5 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            String str6 = null;
            str2 = null;
            str = null;
            zOnExtraCallbackWithResult = false;
            i = 0;
            zOnExtraCallbackWithResult2 = false;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str);
                        i |= 1;
                        break;
                    case 1:
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i |= 2;
                        int i4 = onExtraCallbackWithResult + 125;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        break;
                    case 2:
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str5);
                        i |= 4;
                        continue;
                    case 3:
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                        i |= 8;
                        continue;
                    case 4:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
                        i |= 16;
                        continue;
                    case 5:
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str6);
                        i |= 32;
                        continue;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                i3 = 5;
            }
            str3 = str6;
            str4 = str5;
        } else {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
            i = 63;
            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            str4 = str7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        AptiUserResp aptiUserResp = new AptiUserResp(i, str, str2, str4, zOnExtraCallbackWithResult, zOnExtraCallbackWithResult2, str3, (okycx) null);
        int i6 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return aptiUserResp;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m230deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AptiUserResp aptiUserRespDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return aptiUserRespDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AptiUserResp aptiUserResp) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(aptiUserResp, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AptiUserResp.onWarmupCompleted(aptiUserResp, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 26 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(aptiUserResp, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            AptiUserResp.onWarmupCompleted(aptiUserResp, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AptiUserResp) obj);
        int i4 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

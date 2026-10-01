package im.toss.ads_sdk.remote.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import o.aeu2;
import o.encryptType4;
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
public final /* synthetic */ class SspSdkMediationAdmob$$serializer implements aeu2<SspSdkMediationAdmob> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final SspSdkMediationAdmob$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 121;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return serialDescriptor;
    }

    static {
        SspSdkMediationAdmob$$serializer sspSdkMediationAdmob$$serializer = new SspSdkMediationAdmob$$serializer();
        INSTANCE = sspSdkMediationAdmob$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.SspSdkMediationAdmob", sspSdkMediationAdmob$$serializer, 6);
        setanimationsloop.onWarmupCompleted("adUnitId", true);
        setanimationsloop.onWarmupCompleted("placementId", true);
        setanimationsloop.onWarmupCompleted("adFormat", true);
        setanimationsloop.onWarmupCompleted("format", true);
        setanimationsloop.onWarmupCompleted("reward", true);
        setanimationsloop.onWarmupCompleted("requestOptions", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private SspSdkMediationAdmob$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(oty1.onExtraCallback);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(SspSdkAdReward$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(encryptType4.IAuthTabCallback);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, kSerializerIAuthTabCallback, getwrigglelayout, getwrigglelayout, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3};
        int i4 = onWarmupCompleted + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final SspSdkMediationAdmob deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        Long l;
        String strAsInterface2;
        JsonObject jsonObject;
        int i;
        String str;
        SspSdkAdReward sspSdkAdReward;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String strAsInterface3 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            SspSdkAdReward sspSdkAdReward2 = null;
            strAsInterface2 = null;
            strAsInterface = null;
            l = null;
            jsonObject = null;
            i = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, l);
                        i |= 2;
                        break;
                    case 2:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        sspSdkAdReward2 = (SspSdkAdReward) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, SspSdkAdReward$$serializer.INSTANCE, sspSdkAdReward2);
                        i |= 16;
                        break;
                    case 5:
                        jsonObject = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, encryptType4.IAuthTabCallback, jsonObject);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            int i3 = onExtraCallback + 89;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            sspSdkAdReward = sspSdkAdReward2;
            str = strAsInterface3;
        } else {
            int i5 = onWarmupCompleted + 19;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, (Object) null);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            SspSdkAdReward sspSdkAdReward3 = (SspSdkAdReward) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, SspSdkAdReward$$serializer.INSTANCE, (Object) null);
            jsonObject = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, encryptType4.IAuthTabCallback, (Object) null);
            int i7 = onWarmupCompleted + 97;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            i = 63;
            str = strAsInterface4;
            sspSdkAdReward = sspSdkAdReward3;
        }
        String str2 = strAsInterface2;
        String str3 = strAsInterface;
        Long l2 = l;
        JsonObject jsonObject2 = jsonObject;
        int i9 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SspSdkMediationAdmob(i9, str3, l2, str2, str, sspSdkAdReward, jsonObject2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m66deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SspSdkMediationAdmob sspSdkMediationAdmob) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(sspSdkMediationAdmob, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SspSdkMediationAdmob.onExtraCallbackWithResult(sspSdkMediationAdmob, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sspSdkMediationAdmob, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        SspSdkMediationAdmob.onExtraCallbackWithResult(sspSdkMediationAdmob, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 76 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (SspSdkMediationAdmob) obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

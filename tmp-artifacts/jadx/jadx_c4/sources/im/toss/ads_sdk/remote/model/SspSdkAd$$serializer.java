package im.toss.ads_sdk.remote.model;

import com.tmoney.LiveCheckConstants;
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
import o.setAnimationsLoop;
import o.setUserInputEnabled;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class SspSdkAd$$serializer implements aeu2<SspSdkAd> {
    public static final int $stable;
    public static final SspSdkAd$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return serialDescriptor;
    }

    static {
        SspSdkAd$$serializer sspSdkAd$$serializer = new SspSdkAd$$serializer();
        INSTANCE = sspSdkAd$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.SspSdkAd", sspSdkAd$$serializer, 10);
        setanimationsloop.onWarmupCompleted("slotId", true);
        setanimationsloop.onWarmupCompleted("placementId", true);
        setanimationsloop.onWarmupCompleted("status", true);
        setanimationsloop.onWarmupCompleted("adFormat", true);
        setanimationsloop.onWarmupCompleted("adId", true);
        setanimationsloop.onWarmupCompleted("adOption", true);
        setanimationsloop.onWarmupCompleted("mediation", true);
        setanimationsloop.onWarmupCompleted("sdkTemplate", true);
        setanimationsloop.onWarmupCompleted("reward", true);
        setanimationsloop.onWarmupCompleted("experimentVariables", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 31;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private SspSdkAd$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(SspSdkAdOption$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(SspSdkMediation$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(setUserInputEnabled.onExtraCallbackWithResult);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(SspSdkAdReward$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(encryptType4.IAuthTabCallback);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, kSerializerIAuthTabCallback5};
        int i4 = onNavigationEvent + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final SspSdkAd deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        SspSdkAdOption sspSdkAdOption;
        SdkTemplate sdkTemplate;
        SspSdkMediation sspSdkMediation;
        JsonObject jsonObject;
        SspSdkAdReward sspSdkAdReward;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        SspSdkAdOption sspSdkAdOption2;
        char c;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 9;
        int i4 = 7;
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onWarmupCompleted + 97;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            SspSdkAdOption sspSdkAdOption3 = (SspSdkAdOption) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, SspSdkAdOption$$serializer.INSTANCE, (Object) null);
            SspSdkMediation sspSdkMediation2 = (SspSdkMediation) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, SspSdkMediation$$serializer.INSTANCE, (Object) null);
            SdkTemplate sdkTemplate2 = (SdkTemplate) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, setUserInputEnabled.onExtraCallbackWithResult, (Object) null);
            SspSdkAdReward sspSdkAdReward2 = (SspSdkAdReward) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, SspSdkAdReward$$serializer.INSTANCE, (Object) null);
            str = strAsInterface4;
            str5 = strAsInterface2;
            jsonObject = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, encryptType4.IAuthTabCallback, (Object) null);
            sdkTemplate = sdkTemplate2;
            sspSdkMediation = sspSdkMediation2;
            sspSdkAdOption = sspSdkAdOption3;
            str2 = strAsInterface5;
            sspSdkAdReward = sspSdkAdReward2;
            str3 = strAsInterface6;
            str4 = strAsInterface3;
            i = 1023;
        } else {
            int i7 = 0;
            boolean z = true;
            SdkTemplate sdkTemplate3 = null;
            SspSdkMediation sspSdkMediation3 = null;
            JsonObject jsonObject2 = null;
            SspSdkAdReward sspSdkAdReward3 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            SspSdkAdOption sspSdkAdOption4 = null;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i3 = 9;
                    case 0:
                        sspSdkAdOption2 = sspSdkAdOption4;
                        c = 5;
                        strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i7 |= 1;
                        sspSdkAdOption4 = sspSdkAdOption2;
                        i3 = 9;
                        i4 = 7;
                    case 1:
                        c = 5;
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i7 |= 2;
                        i3 = 9;
                        i4 = 7;
                    case 2:
                        sspSdkAdOption2 = sspSdkAdOption4;
                        c = 5;
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i7 |= 4;
                        sspSdkAdOption4 = sspSdkAdOption2;
                        i3 = 9;
                        i4 = 7;
                    case 3:
                        c = 5;
                        i7 |= 8;
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i3 = 9;
                        i4 = 7;
                    case 4:
                        c = 5;
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i7 |= 16;
                        i3 = 9;
                        i4 = 7;
                    case 5:
                        i7 |= 32;
                        sspSdkAdOption4 = (SspSdkAdOption) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, SspSdkAdOption$$serializer.INSTANCE, sspSdkAdOption4);
                        i3 = 9;
                        i4 = 7;
                    case 6:
                        sspSdkMediation3 = (SspSdkMediation) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, SspSdkMediation$$serializer.INSTANCE, sspSdkMediation3);
                        i7 |= 64;
                        i3 = 9;
                    case 7:
                        sdkTemplate3 = (SdkTemplate) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, setUserInputEnabled.onExtraCallbackWithResult, sdkTemplate3);
                        i7 |= 128;
                        i3 = 9;
                    case 8:
                        sspSdkAdReward3 = (SspSdkAdReward) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, SspSdkAdReward$$serializer.INSTANCE, sspSdkAdReward3);
                        i7 |= 256;
                        int i8 = onWarmupCompleted + 13;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        i3 = 9;
                    case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                        jsonObject2 = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, encryptType4.IAuthTabCallback, jsonObject2);
                        i7 |= 512;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            int i10 = onWarmupCompleted + 53;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            i = i7;
            sspSdkAdOption = sspSdkAdOption4;
            sdkTemplate = sdkTemplate3;
            sspSdkMediation = sspSdkMediation3;
            jsonObject = jsonObject2;
            sspSdkAdReward = sspSdkAdReward3;
            str = strAsInterface;
            str2 = strAsInterface7;
            str3 = strAsInterface8;
            str4 = strAsInterface9;
            str5 = strAsInterface10;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SspSdkAd(i, str5, str4, str, str2, str3, sspSdkAdOption, sspSdkMediation, sdkTemplate, sspSdkAdReward, jsonObject, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m61deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SspSdkAd sspSdkAd) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sspSdkAd, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        SspSdkAd.onNavigationEvent(sspSdkAd, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SspSdkAd) obj);
        int i4 = onWarmupCompleted + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

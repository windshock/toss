package im.toss.ads_sdk.remote.model;

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
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class ExposureContent$$serializer implements aeu2<ExposureContent> {
    public static final int $stable;
    public static final ExposureContent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ExposureContent$$serializer exposureContent$$serializer = new ExposureContent$$serializer();
        INSTANCE = exposureContent$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.ExposureContent", exposureContent$$serializer, 9);
        setanimationsloop.onWarmupCompleted("adSourceName", false);
        setanimationsloop.onWarmupCompleted("responseId", false);
        setanimationsloop.onWarmupCompleted("paidAdValue", true);
        setanimationsloop.onWarmupCompleted("adSourceId", true);
        setanimationsloop.onWarmupCompleted("adSourceInstanceName", true);
        setanimationsloop.onWarmupCompleted("adSourceInstanceId", true);
        setanimationsloop.onWarmupCompleted("mediationGroupName", true);
        setanimationsloop.onWarmupCompleted("mediationABTestName", true);
        setanimationsloop.onWarmupCompleted("mediationABTestVariant", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 3;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private ExposureContent$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(AdMobPaidAdValue$$serializer.INSTANCE), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onExtraCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExposureContent deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 7;
        int i4 = 6;
        int i5 = 5;
        AdMobPaidAdValue adMobPaidAdValue = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onExtraCallbackWithResult + 61;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            AdMobPaidAdValue adMobPaidAdValue2 = (AdMobPaidAdValue) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, AdMobPaidAdValue$$serializer.INSTANCE, (Object) null);
            String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            String str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            String str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, (Object) null);
            int i8 = onExtraCallback + 103;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            str3 = str14;
            str4 = str13;
            str2 = str12;
            str7 = str11;
            str5 = str10;
            adMobPaidAdValue = adMobPaidAdValue2;
            i = 511;
            str = str9;
        } else {
            int i10 = 0;
            boolean z = true;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            str = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i4 = 6;
                        i5 = 5;
                    case 0:
                        str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str21);
                        i10 |= 1;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                    case 1:
                        str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str20);
                        i10 |= 2;
                        int i11 = onExtraCallbackWithResult + 65;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        i3 = 7;
                        i4 = 6;
                    case 2:
                        adMobPaidAdValue = (AdMobPaidAdValue) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, AdMobPaidAdValue$$serializer.INSTANCE, adMobPaidAdValue);
                        i10 |= 4;
                        i3 = 7;
                    case 3:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str);
                        i10 |= 8;
                        i3 = 7;
                    case 4:
                        str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str15);
                        i10 |= 16;
                    case 5:
                        str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str17);
                        i10 |= 32;
                    case 6:
                        str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getWriggleLayout.onNavigationEvent, str16);
                        i10 |= 64;
                    case 7:
                        str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str19);
                        i10 |= 128;
                    case 8:
                        str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, str18);
                        i10 |= 256;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            String str22 = str20;
            i = i10;
            str2 = str16;
            str3 = str18;
            str4 = str19;
            str5 = str15;
            str6 = str21;
            str7 = str17;
            str8 = str22;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExposureContent(i, str6, str8, adMobPaidAdValue, str, str5, str7, str2, str4, str3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m43deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ExposureContent exposureContentDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return exposureContentDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExposureContent exposureContent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(exposureContent, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ExposureContent.onNavigationEvent(exposureContent, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExposureContent) obj);
        int i4 = onExtraCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

package im.toss.ads_sdk.remote.model;

import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AdInAdRequest$$serializer implements aeu2<AdInAdRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final AdInAdRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        AdInAdRequest$$serializer adInAdRequest$$serializer = new AdInAdRequest$$serializer();
        INSTANCE = adInAdRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.AdInAdRequest", adInAdRequest$$serializer, 2);
        setanimationsloop.onWarmupCompleted("advertisementId", false);
        setanimationsloop.onWarmupCompleted("device", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 59;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AdInAdRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[5];
            kSerializerArr[0] = getWriggleLayout.onNavigationEvent;
            kSerializerArr[1] = GetNativeAdsRequestBody$DeviceInfo$$serializer.INSTANCE;
        } else {
            kSerializerArr = new KSerializer[]{getWriggleLayout.onNavigationEvent, GetNativeAdsRequestBody$DeviceInfo$$serializer.INSTANCE};
        }
        int i3 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AdInAdRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String strAsInterface;
        GetNativeAdsRequestBody.DeviceInfo deviceInfo;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            deviceInfo = (GetNativeAdsRequestBody.DeviceInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, GetNativeAdsRequestBody$DeviceInfo$$serializer.INSTANCE, (Object) null);
            int i5 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            i = 3;
        } else {
            String strAsInterface2 = null;
            GetNativeAdsRequestBody.DeviceInfo deviceInfo2 = null;
            int i7 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = IAuthTabCallback + 109;
                    int i9 = i8 % 128;
                    onExtraCallbackWithResult = i9;
                    if (i8 % 2 == 0) {
                        int i10 = 33 / 0;
                        if (iOnNavigationEvent != 0) {
                            int i11 = i9 + 25;
                            IAuthTabCallback = i11 % 128;
                            int i12 = i11 % 2;
                            if (iOnNavigationEvent == 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            deviceInfo2 = (GetNativeAdsRequestBody.DeviceInfo) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, GetNativeAdsRequestBody$DeviceInfo$$serializer.INSTANCE, deviceInfo2);
                            i7 |= 2;
                        } else {
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i7 |= 1;
                        }
                    } else if (iOnNavigationEvent != 0) {
                        int i112 = i9 + 25;
                        IAuthTabCallback = i112 % 128;
                        int i122 = i112 % 2;
                        if (iOnNavigationEvent == 1) {
                        }
                    } else {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i7 |= 1;
                    }
                } else {
                    int i13 = IAuthTabCallback + 37;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    z = false;
                }
            }
            i = i7;
            strAsInterface = strAsInterface2;
            deviceInfo = deviceInfo2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AdInAdRequest(i, strAsInterface, deviceInfo, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m36deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AdInAdRequest adInAdRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(adInAdRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AdInAdRequest.onNavigationEvent(adInAdRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 69;
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
        int i2 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AdInAdRequest) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}

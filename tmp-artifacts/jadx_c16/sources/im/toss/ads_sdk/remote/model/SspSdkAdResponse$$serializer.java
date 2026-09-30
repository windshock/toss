package im.toss.ads_sdk.remote.model;

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
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SspSdkAdResponse$$serializer implements aeu2<SspSdkAdResponse> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final SspSdkAdResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return serialDescriptor;
    }

    static {
        SspSdkAdResponse$$serializer sspSdkAdResponse$$serializer = new SspSdkAdResponse$$serializer();
        INSTANCE = sspSdkAdResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.SspSdkAdResponse", sspSdkAdResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("requestId", true);
        setanimationsloop.onWarmupCompleted("ads", true);
        setanimationsloop.onWarmupCompleted("mraidJsUrl", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 35;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private SspSdkAdResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = SspSdkAdResponse.onNavigationEvent();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, lazyArrOnNavigationEvent[1].getValue(), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onExtraCallback + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final SspSdkAdResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        String str;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = SspSdkAdResponse.onNavigationEvent();
        List list2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            List list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            list = list3;
            str2 = strAsInterface;
            i = 7;
        } else {
            int i3 = 0;
            String str3 = null;
            String strAsInterface2 = null;
            boolean z = true;
            while (!(!z)) {
                int i4 = onExtraCallback + 91;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i3 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i6 = onExtraCallbackWithResult;
                    int i7 = i6 + 87;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i9 = i6 + 113;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str3);
                    i3 |= 4;
                } else {
                    list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), list2);
                    i3 |= 2;
                }
            }
            i = i3;
            list = list2;
            str = str3;
            str2 = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SspSdkAdResponse(i, str2, list, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m43deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SspSdkAdResponse sspSdkAdResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return sspSdkAdResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SspSdkAdResponse sspSdkAdResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(sspSdkAdResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SspSdkAdResponse.onWarmupCompleted(sspSdkAdResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sspSdkAdResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        SspSdkAdResponse.onWarmupCompleted(sspSdkAdResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallbackWithResult + 67;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 31 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SspSdkAdResponse) obj);
        int i4 = onExtraCallback + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}

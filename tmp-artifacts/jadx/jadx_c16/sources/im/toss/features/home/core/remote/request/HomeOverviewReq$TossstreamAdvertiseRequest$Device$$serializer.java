package im.toss.features.home.core.remote.request;

import im.toss.features.home.core.remote.request.HomeOverviewReq;
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
public final /* synthetic */ class HomeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer implements aeu2<HomeOverviewReq.TossstreamAdvertiseRequest.Device> {
    public static final HomeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 79;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        HomeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer homeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer = new HomeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer();
        INSTANCE = homeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.request.HomeOverviewReq.TossstreamAdvertiseRequest.Device", homeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer, 5);
        setanimationsloop.onWarmupCompleted("os", true);
        setanimationsloop.onWarmupCompleted("osVersion", false);
        setanimationsloop.onWarmupCompleted("model", false);
        setanimationsloop.onWarmupCompleted("ifa", true);
        setanimationsloop.onWarmupCompleted("carrier", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 39;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private HomeOverviewReq$TossstreamAdvertiseRequest$Device$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {HomeOverviewReq.TossstreamAdvertiseRequest.Device.IAuthTabCallback()[0].getValue(), getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onWarmupCompleted + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeOverviewReq.TossstreamAdvertiseRequest.Device deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        HomeOverviewReq.TossstreamAdvertiseRequest.Device.Os os;
        String str2;
        String str3;
        String str4;
        int i;
        char c;
        char c2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = HomeOverviewReq.TossstreamAdvertiseRequest.Device.IAuthTabCallback();
        char c3 = 3;
        char c4 = 4;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onWarmupCompleted + 25;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            HomeOverviewReq.TossstreamAdvertiseRequest.Device.Os os2 = (HomeOverviewReq.TossstreamAdvertiseRequest.Device.Os) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = strAsInterface2;
            os = os2;
            str2 = strAsInterface;
            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            i = 31;
        } else {
            boolean z = true;
            int i5 = 0;
            String strAsInterface3 = null;
            HomeOverviewReq.TossstreamAdvertiseRequest.Device.Os os3 = null;
            String strAsInterface4 = null;
            String str5 = null;
            String str6 = null;
            while (z) {
                int i6 = onWarmupCompleted + 7;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = onNavigationEvent;
                    int i9 = i8 + 91;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        int i10 = i8 + 69;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 == 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 0) {
                            c = 4;
                            c2 = 3;
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i5 |= 2;
                        } else if (iOnNavigationEvent != 2) {
                            int i11 = i8 + 119;
                            onWarmupCompleted = i11 % 128;
                            int i12 = i11 % 2;
                            if (iOnNavigationEvent == 3) {
                                c = 4;
                                c2 = 3;
                                str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str5);
                                i5 |= 8;
                            } else {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str6);
                                i5 |= 16;
                                c4 = 4;
                                c3 = 3;
                            }
                        } else {
                            c = 4;
                            c2 = 3;
                            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i5 |= 4;
                        }
                        c4 = c;
                        c3 = c2;
                    } else {
                        os3 = (HomeOverviewReq.TossstreamAdvertiseRequest.Device.Os) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), os3);
                        i5 |= 1;
                        c4 = 4;
                        c3 = 3;
                    }
                } else {
                    z = false;
                    c4 = c4;
                    c3 = c3;
                }
            }
            int i13 = onNavigationEvent + 125;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            str = strAsInterface3;
            os = os3;
            str2 = strAsInterface4;
            str3 = str5;
            str4 = str6;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeOverviewReq.TossstreamAdvertiseRequest.Device(i, os, str2, str, str3, str4, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m610deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        HomeOverviewReq.TossstreamAdvertiseRequest.Device deviceDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return deviceDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeOverviewReq.TossstreamAdvertiseRequest.Device device) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(device, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeOverviewReq.TossstreamAdvertiseRequest.Device.IAuthTabCallback(device, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(device, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeOverviewReq.TossstreamAdvertiseRequest.Device.IAuthTabCallback(device, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeOverviewReq.TossstreamAdvertiseRequest.Device) obj);
        int i4 = onNavigationEvent + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 29;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

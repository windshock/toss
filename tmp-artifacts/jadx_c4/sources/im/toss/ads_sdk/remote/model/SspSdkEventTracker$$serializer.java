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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class SspSdkEventTracker$$serializer implements aeu2<SspSdkEventTracker> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final SspSdkEventTracker$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 119;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        SspSdkEventTracker$$serializer sspSdkEventTracker$$serializer = new SspSdkEventTracker$$serializer();
        INSTANCE = sspSdkEventTracker$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.SspSdkEventTracker", sspSdkEventTracker$$serializer, 3);
        setanimationsloop.onWarmupCompleted("imp_1px", true);
        setanimationsloop.onWarmupCompleted("vimp", true);
        setanimationsloop.onWarmupCompleted("click", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 123;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private SspSdkEventTracker$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy[] lazyArrOnWarmupCompleted = SspSdkEventTracker.onWarmupCompleted();
            return new KSerializer[]{lazyArrOnWarmupCompleted[0].getValue(), lazyArrOnWarmupCompleted[1].getValue(), lazyArrOnWarmupCompleted[2].getValue()};
        }
        Lazy[] lazyArrOnWarmupCompleted2 = SspSdkEventTracker.onWarmupCompleted();
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        kSerializerArr[0] = lazyArrOnWarmupCompleted2[1].getValue();
        kSerializerArr[1] = lazyArrOnWarmupCompleted2[0].getValue();
        kSerializerArr[5] = lazyArrOnWarmupCompleted2[2].getValue();
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SspSdkEventTracker deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i;
        List list2;
        List list3;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = SspSdkEventTracker.onWarmupCompleted();
        List list4 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            i = 0;
            List list5 = null;
            list = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = IAuthTabCallback;
                    int i6 = i5 + 25;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        if (iOnNavigationEvent == 0) {
                            list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list4);
                            i |= 2;
                        }
                        if (iOnNavigationEvent == 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i7 = i5 + 121;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 != 0) {
                            list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnWarmupCompleted[4].getValue(), list5);
                            i |= 2;
                        } else {
                            list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), list5);
                            i |= 4;
                        }
                    } else {
                        if (iOnNavigationEvent == 1) {
                            list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list4);
                            i |= 2;
                        }
                        if (iOnNavigationEvent == 2) {
                        }
                    }
                } else {
                    list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), list);
                    i |= 1;
                }
            }
            list2 = list5;
            list3 = list4;
        } else {
            int i8 = IAuthTabCallback + 91;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            List list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            i = 7;
            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), (Object) null);
            list3 = list6;
        }
        int i10 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SspSdkEventTracker(i10, list, list3, list2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m64deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SspSdkEventTracker sspSdkEventTrackerDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 97;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return sspSdkEventTrackerDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SspSdkEventTracker sspSdkEventTracker) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(sspSdkEventTracker, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SspSdkEventTracker.onExtraCallbackWithResult(sspSdkEventTracker, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sspSdkEventTracker, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        SspSdkEventTracker.onExtraCallbackWithResult(sspSdkEventTracker, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 11 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SspSdkEventTracker) obj);
        int i4 = onWarmupCompleted + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

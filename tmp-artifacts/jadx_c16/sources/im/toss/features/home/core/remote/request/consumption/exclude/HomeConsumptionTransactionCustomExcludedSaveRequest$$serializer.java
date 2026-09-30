package im.toss.features.home.core.remote.request.consumption.exclude;

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
import o.getBgColor;
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
public final /* synthetic */ class HomeConsumptionTransactionCustomExcludedSaveRequest$$serializer implements aeu2<HomeConsumptionTransactionCustomExcludedSaveRequest> {
    private static int IAuthTabCallback = 0;
    public static final HomeConsumptionTransactionCustomExcludedSaveRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 91;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        HomeConsumptionTransactionCustomExcludedSaveRequest$$serializer homeConsumptionTransactionCustomExcludedSaveRequest$$serializer = new HomeConsumptionTransactionCustomExcludedSaveRequest$$serializer();
        INSTANCE = homeConsumptionTransactionCustomExcludedSaveRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.request.consumption.exclude.HomeConsumptionTransactionCustomExcludedSaveRequest", homeConsumptionTransactionCustomExcludedSaveRequest$$serializer, 3);
        setanimationsloop.onWarmupCompleted("sourceIds", false);
        setanimationsloop.onWarmupCompleted("timelineTime", false);
        setanimationsloop.onWarmupCompleted("excluded", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 41;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private HomeConsumptionTransactionCustomExcludedSaveRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) HomeConsumptionTransactionCustomExcludedSaveRequest.onExtraCallbackWithResult()[0].getValue()), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(getBgColor.IAuthTabCallback)};
        int i4 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeConsumptionTransactionCustomExcludedSaveRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        String str;
        Boolean bool;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = HomeConsumptionTransactionCustomExcludedSaveRequest.onExtraCallbackWithResult();
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getBgColor.IAuthTabCallback, (Object) null);
            i = 7;
        } else {
            int i5 = 0;
            boolean z = true;
            List list2 = null;
            String str2 = null;
            Boolean bool2 = null;
            while (z) {
                int i6 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = onWarmupCompleted + 73;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        if (iOnNavigationEvent == 1) {
                            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                            i5 |= 2;
                            int i8 = onExtraCallbackWithResult + 85;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                        } else {
                            if (iOnNavigationEvent == 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getBgColor.IAuthTabCallback, bool2);
                            i5 |= 4;
                            int i10 = onExtraCallbackWithResult + 85;
                            onWarmupCompleted = i10 % 128;
                            int i11 = i10 % 2;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i5 |= 2;
                        int i82 = onExtraCallbackWithResult + 85;
                        onWarmupCompleted = i82 % 128;
                        int i92 = i82 % 2;
                    } else if (iOnNavigationEvent == 2) {
                    }
                } else {
                    list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), list2);
                    i5 |= 1;
                }
            }
            list = list2;
            str = str2;
            bool = bool2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        HomeConsumptionTransactionCustomExcludedSaveRequest homeConsumptionTransactionCustomExcludedSaveRequest = new HomeConsumptionTransactionCustomExcludedSaveRequest(i, list, str, bool, (okycx) null);
        int i12 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 == 0) {
            return homeConsumptionTransactionCustomExcludedSaveRequest;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m616deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        HomeConsumptionTransactionCustomExcludedSaveRequest homeConsumptionTransactionCustomExcludedSaveRequestDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return homeConsumptionTransactionCustomExcludedSaveRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeConsumptionTransactionCustomExcludedSaveRequest homeConsumptionTransactionCustomExcludedSaveRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeConsumptionTransactionCustomExcludedSaveRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeConsumptionTransactionCustomExcludedSaveRequest.onExtraCallbackWithResult(homeConsumptionTransactionCustomExcludedSaveRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeConsumptionTransactionCustomExcludedSaveRequest) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}

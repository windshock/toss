package im.toss.features.home.core.remote.model.consumption.transaction;

import im.toss.features.home.core.remote.model.consumption.transaction.HomeConsumptionTransactionResponse;
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
public final /* synthetic */ class HomeConsumptionTransactionResponse$$serializer implements aeu2<HomeConsumptionTransactionResponse> {
    private static int IAuthTabCallback = 1;
    public static final HomeConsumptionTransactionResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 107;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        HomeConsumptionTransactionResponse$$serializer homeConsumptionTransactionResponse$$serializer = new HomeConsumptionTransactionResponse$$serializer();
        INSTANCE = homeConsumptionTransactionResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.consumption.transaction.HomeConsumptionTransactionResponse", homeConsumptionTransactionResponse$$serializer, 4);
        setanimationsloop.onWarmupCompleted("totalIncome", false);
        setanimationsloop.onWarmupCompleted("totalExpense", false);
        setanimationsloop.onWarmupCompleted("transactions", false);
        setanimationsloop.onWarmupCompleted("emptyState", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 25;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private HomeConsumptionTransactionResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = HomeConsumptionTransactionResponse.onExtraCallbackWithResult();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), lazyArrOnExtraCallbackWithResult[2].getValue(), sp.IAuthTabCallback(HomeConsumptionTransactionResponse$EmptyState$$serializer.INSTANCE)};
        int i4 = IAuthTabCallback + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeConsumptionTransactionResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        HomeConsumptionTransactionResponse.EmptyState emptyState;
        String str;
        int i;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = HomeConsumptionTransactionResponse.onExtraCallbackWithResult();
        boolean z = false;
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), (Object) null);
            emptyState = (HomeConsumptionTransactionResponse.EmptyState) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, HomeConsumptionTransactionResponse$EmptyState$$serializer.INSTANCE, (Object) null);
            str = str4;
            i = 15;
            str2 = str3;
        } else {
            int i3 = 0;
            boolean z2 = true;
            List list2 = null;
            HomeConsumptionTransactionResponse.EmptyState emptyState2 = null;
            String str5 = null;
            String str6 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = IAuthTabCallback;
                    int i5 = i4 + 107;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        int i6 = i4 + 37;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 == 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 0) {
                            str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str5);
                            i3 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), list2);
                            i3 |= 4;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            emptyState2 = (HomeConsumptionTransactionResponse.EmptyState) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, HomeConsumptionTransactionResponse$EmptyState$$serializer.INSTANCE, emptyState2);
                            i3 |= 8;
                        }
                        z = false;
                    } else {
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str6);
                        i3 |= 1;
                        z = false;
                    }
                    obj = null;
                } else {
                    z2 = z;
                    obj = obj;
                    z = z2;
                }
            }
            list = list2;
            emptyState = emptyState2;
            String str7 = str6;
            str = str5;
            i = i3;
            str2 = str7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeConsumptionTransactionResponse(i, str2, str, list, emptyState, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m590deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeConsumptionTransactionResponse homeConsumptionTransactionResponseDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        int i5 = IAuthTabCallback + 79;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return homeConsumptionTransactionResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeConsumptionTransactionResponse homeConsumptionTransactionResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(homeConsumptionTransactionResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeConsumptionTransactionResponse.IAuthTabCallback(homeConsumptionTransactionResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 62 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(homeConsumptionTransactionResponse, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            HomeConsumptionTransactionResponse.IAuthTabCallback(homeConsumptionTransactionResponse, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onWarmupCompleted + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeConsumptionTransactionResponse) obj);
        int i4 = IAuthTabCallback + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 16 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onWarmupCompleted + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

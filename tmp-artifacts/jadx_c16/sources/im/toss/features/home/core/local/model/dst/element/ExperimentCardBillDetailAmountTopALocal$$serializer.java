package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.currency.HomeAmountWithCurrencyLocal;
import im.toss.features.home.core.local.model.currency.HomeAmountWithCurrencyLocal$$serializer;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.BadgeLocal;
import im.toss.features.home.core.local.model.dst.widget.BadgeLocal$;
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
import o.oty1;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentCardBillDetailAmountTopALocal$$serializer implements aeu2<ExperimentCardBillDetailAmountTopALocal> {
    public static final ExperimentCardBillDetailAmountTopALocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return serialDescriptor;
    }

    static {
        ExperimentCardBillDetailAmountTopALocal$$serializer experimentCardBillDetailAmountTopALocal$$serializer = new ExperimentCardBillDetailAmountTopALocal$$serializer();
        INSTANCE = experimentCardBillDetailAmountTopALocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentCardBillDetailAmountTopALocal", experimentCardBillDetailAmountTopALocal$$serializer, 5);
        setanimationsloop.onWarmupCompleted("row2AmountWithCurrency", true);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("badge", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("row2Amount", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 41;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private ExperimentCardBillDetailAmountTopALocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(HomeAmountWithCurrencyLocal$$serializer.INSTANCE), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(BadgeLocal$.serializer.INSTANCE), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback), sp.IAuthTabCallback(oty1.onExtraCallback)};
        int i4 = onExtraCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExperimentCardBillDetailAmountTopALocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Long l;
        HandlerLocal handlerLocal;
        BadgeLocal badgeLocal;
        HomeAmountWithCurrencyLocal homeAmountWithCurrencyLocal;
        String str;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 13;
        onExtraCallback = i3 % 128;
        HandlerLocal handlerLocal2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            HomeAmountWithCurrencyLocal homeAmountWithCurrencyLocal2 = (HomeAmountWithCurrencyLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, HomeAmountWithCurrencyLocal$$serializer.INSTANCE, (Object) null);
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            BadgeLocal badgeLocal2 = (BadgeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, BadgeLocal$.serializer.INSTANCE, (Object) null);
            HandlerLocal handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, (Object) null);
            badgeLocal = badgeLocal2;
            homeAmountWithCurrencyLocal = homeAmountWithCurrencyLocal2;
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, (Object) null);
            handlerLocal = handlerLocal3;
            i = 31;
            str = str2;
        } else {
            Long l2 = null;
            BadgeLocal badgeLocal3 = null;
            HomeAmountWithCurrencyLocal homeAmountWithCurrencyLocal3 = null;
            String str3 = null;
            int i4 = 0;
            boolean z2 = true;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z2 = z;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = onExtraCallback;
                    int i6 = i5 + 19;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 1) {
                        int i8 = i5 + 91;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        if (iOnNavigationEvent == 2) {
                            badgeLocal3 = (BadgeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, BadgeLocal$.serializer.INSTANCE, badgeLocal3);
                            i4 |= 4;
                        } else if (iOnNavigationEvent == 3) {
                            handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                            i4 |= 8;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, l2);
                            i4 |= 16;
                        }
                    } else {
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str3);
                        i4 |= 2;
                    }
                    z = false;
                } else {
                    homeAmountWithCurrencyLocal3 = (HomeAmountWithCurrencyLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, HomeAmountWithCurrencyLocal$$serializer.INSTANCE, homeAmountWithCurrencyLocal3);
                    i4 |= 1;
                    z = false;
                }
            }
            l = l2;
            handlerLocal = handlerLocal2;
            badgeLocal = badgeLocal3;
            homeAmountWithCurrencyLocal = homeAmountWithCurrencyLocal3;
            str = str3;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentCardBillDetailAmountTopALocal(i, homeAmountWithCurrencyLocal, str, badgeLocal, handlerLocal, l, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m341deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        ExperimentCardBillDetailAmountTopALocal experimentCardBillDetailAmountTopALocalDeserialize = deserialize(decoder);
        int i3 = onWarmupCompleted + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return experimentCardBillDetailAmountTopALocalDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentCardBillDetailAmountTopALocal experimentCardBillDetailAmountTopALocal) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(experimentCardBillDetailAmountTopALocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ExperimentCardBillDetailAmountTopALocal.onExtraCallbackWithResult(experimentCardBillDetailAmountTopALocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentCardBillDetailAmountTopALocal) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

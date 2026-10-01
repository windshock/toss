package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.currency.HomeAmountWithCurrencyLocal;
import im.toss.features.home.core.local.model.currency.HomeAmountWithCurrencyLocal$$serializer;
import im.toss.features.home.core.local.model.dst.element.CardBillDetailAmountTopLocal;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardBillDetailAmountTopLocal$$serializer implements aeu2<CardBillDetailAmountTopLocal> {
    public static final CardBillDetailAmountTopLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 11;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
        return serialDescriptor;
    }

    static {
        CardBillDetailAmountTopLocal$$serializer cardBillDetailAmountTopLocal$$serializer = new CardBillDetailAmountTopLocal$$serializer();
        INSTANCE = cardBillDetailAmountTopLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.CardBillDetailAmountTopLocal", cardBillDetailAmountTopLocal$$serializer, 5);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2AmountWithCurrency", true);
        setanimationsloop.onWarmupCompleted("row2Badge", false);
        setanimationsloop.onWarmupCompleted("fullTooltipMessage", false);
        setanimationsloop.onWarmupCompleted("row2Amount", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 91;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 9 / 0;
        }
    }

    private CardBillDetailAmountTopLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {CardBillDetailAmountTopLocal$Row$$serializer.INSTANCE, sp.IAuthTabCallback(HomeAmountWithCurrencyLocal$$serializer.INSTANCE), sp.IAuthTabCallback(BadgeLocal$.serializer.INSTANCE), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(oty1.onExtraCallback)};
        int i4 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CardBillDetailAmountTopLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        Long l;
        BadgeLocal badgeLocal;
        CardBillDetailAmountTopLocal.Row row;
        HomeAmountWithCurrencyLocal homeAmountWithCurrencyLocal;
        int iOnNavigationEvent;
        Long l2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 1;
        boolean z = false;
        String str2 = null;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i6 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            CardBillDetailAmountTopLocal.Row row2 = (CardBillDetailAmountTopLocal.Row) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, CardBillDetailAmountTopLocal$Row$$serializer.INSTANCE, (Object) null);
            HomeAmountWithCurrencyLocal homeAmountWithCurrencyLocal2 = (HomeAmountWithCurrencyLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, HomeAmountWithCurrencyLocal$$serializer.INSTANCE, (Object) null);
            BadgeLocal badgeLocal2 = (BadgeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, BadgeLocal$.serializer.INSTANCE, (Object) null);
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
            badgeLocal = badgeLocal2;
            row = row2;
            homeAmountWithCurrencyLocal = homeAmountWithCurrencyLocal2;
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, (Object) null);
            str = str3;
            i = 31;
        } else {
            boolean z2 = true;
            int i8 = 0;
            Long l3 = null;
            BadgeLocal badgeLocal3 = null;
            CardBillDetailAmountTopLocal.Row row3 = null;
            HomeAmountWithCurrencyLocal homeAmountWithCurrencyLocal3 = null;
            while (z2) {
                int i9 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i10 = 70 / 0;
                    if (iOnNavigationEvent == -1) {
                        i5 = i5;
                        z = z;
                        z2 = z;
                    } else if (iOnNavigationEvent == 0) {
                        if (iOnNavigationEvent != i5) {
                            int i11 = onNavigationEvent;
                            int i12 = i11 + 105;
                            onExtraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                            if (iOnNavigationEvent == 2) {
                                badgeLocal3 = (BadgeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, BadgeLocal$.serializer.INSTANCE, badgeLocal3);
                                i8 |= 4;
                                int i14 = onNavigationEvent + 57;
                                onExtraCallbackWithResult = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i15 = 5 % 3;
                                }
                            } else if (iOnNavigationEvent == 3) {
                                str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str2);
                                i8 |= 8;
                            } else {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                int i16 = i11 + 111;
                                onExtraCallbackWithResult = i16 % 128;
                                int i17 = i16 % 2;
                                oty1 oty1Var = oty1.onExtraCallback;
                                if (i17 != 0) {
                                    l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, oty1Var, l3);
                                    i8 |= 37;
                                } else {
                                    l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1Var, l3);
                                    i8 |= 16;
                                }
                                l3 = l2;
                            }
                            i5 = 1;
                        } else {
                            homeAmountWithCurrencyLocal3 = (HomeAmountWithCurrencyLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, HomeAmountWithCurrencyLocal$$serializer.INSTANCE, homeAmountWithCurrencyLocal3);
                            i8 |= 2;
                            i5 = 1;
                        }
                        z = false;
                    } else {
                        row3 = (CardBillDetailAmountTopLocal.Row) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, CardBillDetailAmountTopLocal$Row$$serializer.INSTANCE, row3);
                        i8 |= 1;
                        i5 = i5;
                        z = false;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        i5 = i5;
                        z = z;
                        z2 = z;
                    } else if (iOnNavigationEvent == 0) {
                    }
                }
            }
            i = i8;
            str = str2;
            l = l3;
            badgeLocal = badgeLocal3;
            row = row3;
            homeAmountWithCurrencyLocal = homeAmountWithCurrencyLocal3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardBillDetailAmountTopLocal(i, row, homeAmountWithCurrencyLocal, badgeLocal, str, l, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m305deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardBillDetailAmountTopLocal cardBillDetailAmountTopLocal) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(cardBillDetailAmountTopLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CardBillDetailAmountTopLocal.onExtraCallback(cardBillDetailAmountTopLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardBillDetailAmountTopLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CardBillDetailAmountTopLocal.onExtraCallback(cardBillDetailAmountTopLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 61 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardBillDetailAmountTopLocal) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }
}

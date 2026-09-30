package im.toss.features.credit.data.response.membership;

import im.toss.features.credit.data.response.DisclaimerV2;
import im.toss.features.credit.data.response.DisclaimerV2$$serializer;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftHistoriesResponse$$serializer implements aeu2<CreditPlusGiftHistoriesResponse> {
    private static int IAuthTabCallback = 0;
    public static final CreditPlusGiftHistoriesResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 75;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CreditPlusGiftHistoriesResponse$$serializer creditPlusGiftHistoriesResponse$$serializer = new CreditPlusGiftHistoriesResponse$$serializer();
        INSTANCE = creditPlusGiftHistoriesResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusGiftHistoriesResponse", creditPlusGiftHistoriesResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("sent", true);
        setanimationsloop.onWarmupCompleted("received", true);
        setanimationsloop.onWarmupCompleted("disclaimer", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 7;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private CreditPlusGiftHistoriesResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = CreditPlusGiftHistoriesResponse.IAuthTabCallback();
        KSerializer<?>[] kSerializerArr = {lazyArrIAuthTabCallback[0].getValue(), lazyArrIAuthTabCallback[1].getValue(), sp.IAuthTabCallback(DisclaimerV2$$serializer.INSTANCE)};
        int i4 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CreditPlusGiftHistoriesResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        DisclaimerV2 disclaimerV2;
        List list;
        int i;
        List list2;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = CreditPlusGiftHistoriesResponse.IAuthTabCallback();
        List list3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            List list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            List list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            disclaimerV2 = (DisclaimerV2) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, DisclaimerV2$$serializer.INSTANCE, (Object) null);
            list = list5;
            list2 = list4;
            i = 7;
        } else {
            DisclaimerV2 disclaimerV22 = null;
            List list6 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onExtraCallbackWithResult;
                    int i6 = i5 + 63;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 16 / 0;
                        if (iOnNavigationEvent != 0) {
                            i2 = i5 + 111;
                            int i8 = i2 % 128;
                            onNavigationEvent = i8;
                            if (i2 % 2 == 0) {
                                if (iOnNavigationEvent != 1) {
                                    int i9 = i8 + 105;
                                    onExtraCallbackWithResult = i9 % 128;
                                    int i10 = i9 % 2;
                                    if (iOnNavigationEvent == 2) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    disclaimerV22 = (DisclaimerV2) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, DisclaimerV2$$serializer.INSTANCE, disclaimerV22);
                                    i4 |= 4;
                                } else {
                                    list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list3);
                                    i4 |= 2;
                                }
                            } else if (iOnNavigationEvent != 1) {
                                int i92 = i8 + 105;
                                onExtraCallbackWithResult = i92 % 128;
                                int i102 = i92 % 2;
                                if (iOnNavigationEvent == 2) {
                                }
                            } else {
                                list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list3);
                                i4 |= 2;
                            }
                        } else {
                            list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list6);
                            i4 |= 1;
                        }
                    } else if (iOnNavigationEvent != 0) {
                        i2 = i5 + 111;
                        int i82 = i2 % 128;
                        onNavigationEvent = i82;
                        if (i2 % 2 == 0) {
                        }
                    } else {
                        list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list6);
                        i4 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            int i11 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            disclaimerV2 = disclaimerV22;
            list = list3;
            i = i4;
            list2 = list6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusGiftHistoriesResponse(i, list2, list, disclaimerV2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m205deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusGiftHistoriesResponse creditPlusGiftHistoriesResponseDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        int i5 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return creditPlusGiftHistoriesResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusGiftHistoriesResponse creditPlusGiftHistoriesResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditPlusGiftHistoriesResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditPlusGiftHistoriesResponse.IAuthTabCallback(creditPlusGiftHistoriesResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditPlusGiftHistoriesResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditPlusGiftHistoriesResponse.IAuthTabCallback(creditPlusGiftHistoriesResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusGiftHistoriesResponse) obj);
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}

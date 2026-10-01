package im.toss.features.leave.domain.response;

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
import o.getDynamicHeight;
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
public final /* synthetic */ class RemainingBalanceResponse$$serializer implements aeu2<RemainingBalanceResponse> {
    private static int IAuthTabCallback = 1;
    public static final RemainingBalanceResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 101;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        RemainingBalanceResponse$$serializer remainingBalanceResponse$$serializer = new RemainingBalanceResponse$$serializer();
        INSTANCE = remainingBalanceResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.leave.domain.response.RemainingBalanceResponse", remainingBalanceResponse$$serializer, 9);
        setanimationsloop.onWarmupCompleted("totalAmount", false);
        setanimationsloop.onWarmupCompleted("refundToOtherAmount", false);
        setanimationsloop.onWarmupCompleted("totalForfeitAmount", false);
        setanimationsloop.onWarmupCompleted("items", true);
        setanimationsloop.onWarmupCompleted("visitor", true);
        setanimationsloop.onWarmupCompleted("disclaimers", false);
        setanimationsloop.onWarmupCompleted("totalForfeitAmountString", true);
        setanimationsloop.onWarmupCompleted("pointExpirationStdConsentModuleCode", true);
        setanimationsloop.onWarmupCompleted("allItemsExcludeMinusPoint", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 43;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private RemainingBalanceResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = RemainingBalanceResponse.onWarmupCompleted();
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getdynamicheight, getdynamicheight, getdynamicheight, lazyArrOnWarmupCompleted[3].getValue(), sp.IAuthTabCallback(VisitorRemainingBalanceInfoResponse$$serializer.INSTANCE), RemainingBalanceDisclaimerResponse$$serializer.INSTANCE, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), lazyArrOnWarmupCompleted[8].getValue()};
        int i4 = onNavigationEvent + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final RemainingBalanceResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        int iOnTransact2;
        int iOnTransact3;
        List list;
        String str;
        int i;
        VisitorRemainingBalanceInfoResponse visitorRemainingBalanceInfoResponse;
        String str2;
        List list2;
        RemainingBalanceDisclaimerResponse remainingBalanceDisclaimerResponse;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = RemainingBalanceResponse.onWarmupCompleted();
        int i4 = 8;
        String str3 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            VisitorRemainingBalanceInfoResponse visitorRemainingBalanceInfoResponse2 = null;
            List list3 = null;
            RemainingBalanceDisclaimerResponse remainingBalanceDisclaimerResponse2 = null;
            str = null;
            list = null;
            int i5 = 0;
            iOnTransact2 = 0;
            iOnTransact3 = 0;
            iOnTransact = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                        i5 |= 1;
                        i2 = onNavigationEvent + 113;
                        onWarmupCompleted = i2 % 128;
                        int i6 = i2 % 2;
                        i4 = 8;
                    case 1:
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 8;
                    case 2:
                        iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 8;
                    case 3:
                        list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnWarmupCompleted[3].getValue(), list);
                        i5 |= 8;
                        i2 = onNavigationEvent + 87;
                        onWarmupCompleted = i2 % 128;
                        int i62 = i2 % 2;
                        i4 = 8;
                    case 4:
                        visitorRemainingBalanceInfoResponse2 = (VisitorRemainingBalanceInfoResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, VisitorRemainingBalanceInfoResponse$$serializer.INSTANCE, visitorRemainingBalanceInfoResponse2);
                        i5 |= 16;
                    case 5:
                        remainingBalanceDisclaimerResponse2 = (RemainingBalanceDisclaimerResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, RemainingBalanceDisclaimerResponse$$serializer.INSTANCE, remainingBalanceDisclaimerResponse2);
                        i5 |= 32;
                    case 6:
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str3);
                        i5 |= 64;
                    case 7:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, str);
                        i5 |= 128;
                    case 8:
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i4, (jp) lazyArrOnWarmupCompleted[i4].getValue(), list3);
                        i5 |= 256;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i5;
            visitorRemainingBalanceInfoResponse = visitorRemainingBalanceInfoResponse2;
            list2 = list3;
            remainingBalanceDisclaimerResponse = remainingBalanceDisclaimerResponse2;
            str2 = str3;
        } else {
            int i7 = onNavigationEvent + 35;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnWarmupCompleted[3].getValue(), (Object) null);
            VisitorRemainingBalanceInfoResponse visitorRemainingBalanceInfoResponse3 = (VisitorRemainingBalanceInfoResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, VisitorRemainingBalanceInfoResponse$$serializer.INSTANCE, (Object) null);
            RemainingBalanceDisclaimerResponse remainingBalanceDisclaimerResponse3 = (RemainingBalanceDisclaimerResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, RemainingBalanceDisclaimerResponse$$serializer.INSTANCE, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            i = 511;
            visitorRemainingBalanceInfoResponse = visitorRemainingBalanceInfoResponse3;
            str2 = str4;
            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArrOnWarmupCompleted[8].getValue(), (Object) null);
            remainingBalanceDisclaimerResponse = remainingBalanceDisclaimerResponse3;
        }
        List list4 = list;
        int i9 = iOnTransact2;
        int i10 = iOnTransact3;
        int i11 = iOnTransact;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new RemainingBalanceResponse(i, i11, i9, i10, list4, visitorRemainingBalanceInfoResponse, remainingBalanceDisclaimerResponse, str2, str, list2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m653deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RemainingBalanceResponse remainingBalanceResponseDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return remainingBalanceResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RemainingBalanceResponse remainingBalanceResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(remainingBalanceResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        RemainingBalanceResponse.onExtraCallback(remainingBalanceResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (RemainingBalanceResponse) obj);
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        int i5 = onWarmupCompleted + 23;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

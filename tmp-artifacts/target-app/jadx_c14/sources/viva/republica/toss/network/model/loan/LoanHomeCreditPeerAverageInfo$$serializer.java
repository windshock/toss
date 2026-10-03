package viva.republica.toss.network.model.loan;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class LoanHomeCreditPeerAverageInfo$$serializer implements aeu2<LoanHomeCreditPeerAverageInfo> {
    private static int IAuthTabCallback = 0;
    public static final LoanHomeCreditPeerAverageInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        LoanHomeCreditPeerAverageInfo$$serializer loanHomeCreditPeerAverageInfo$$serializer = new LoanHomeCreditPeerAverageInfo$$serializer();
        INSTANCE = loanHomeCreditPeerAverageInfo$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanHomeCreditPeerAverageInfo", loanHomeCreditPeerAverageInfo$$serializer, 3);
        setanimationsloop.onWarmupCompleted("creditPeerAverageInterestAmountDiff", true);
        setanimationsloop.onWarmupCompleted("creditScore", true);
        setanimationsloop.onWarmupCompleted("bottomSheetContent", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 97;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private LoanHomeCreditPeerAverageInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, getDynamicHeight.onWarmupCompleted, LoanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer.INSTANCE};
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            m40deserialize(decoder);
            throw null;
        }
        LoanHomeCreditPeerAverageInfo loanHomeCreditPeerAverageInfoM40deserialize = m40deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return loanHomeCreditPeerAverageInfoM40deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final LoanHomeCreditPeerAverageInfo m40deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int iOnTransact;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        LoanHomeCreditPeerAverageInfo.BottomSheetContent bottomSheetContent = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            strAsInterface = null;
            i = 0;
            iOnTransact = 0;
            while (z) {
                int i3 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i5 = IAuthTabCallback + 117;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    if (iOnNavigationEvent == 1) {
                        iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i7 = onExtraCallbackWithResult + 121;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            bottomSheetContent = (LoanHomeCreditPeerAverageInfo.BottomSheetContent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, LoanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer.INSTANCE, bottomSheetContent);
                        } else {
                            bottomSheetContent = (LoanHomeCreditPeerAverageInfo.BottomSheetContent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, LoanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer.INSTANCE, bottomSheetContent);
                            i |= 4;
                        }
                    }
                    i |= 2;
                } else {
                    strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i |= 1;
                }
            }
        } else {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            bottomSheetContent = (LoanHomeCreditPeerAverageInfo.BottomSheetContent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, LoanHomeCreditPeerAverageInfo$BottomSheetContent$$serializer.INSTANCE, (Object) null);
            int i8 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 / 5;
            }
            i = 7;
        }
        String str = strAsInterface;
        LoanHomeCreditPeerAverageInfo.BottomSheetContent bottomSheetContent2 = bottomSheetContent;
        int i10 = i;
        int i11 = iOnTransact;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LoanHomeCreditPeerAverageInfo(i10, str, i11, bottomSheetContent2, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanHomeCreditPeerAverageInfo) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanHomeCreditPeerAverageInfo loanHomeCreditPeerAverageInfo) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(loanHomeCreditPeerAverageInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        LoanHomeCreditPeerAverageInfo.IAuthTabCallback(loanHomeCreditPeerAverageInfo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

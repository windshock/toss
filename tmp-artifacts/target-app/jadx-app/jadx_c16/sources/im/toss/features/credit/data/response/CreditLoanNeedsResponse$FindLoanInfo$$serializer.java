package im.toss.features.credit.data.response;

import im.toss.features.credit.data.response.CreditLoanNeedsResponse;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditLoanNeedsResponse$FindLoanInfo$$serializer implements aeu2<CreditLoanNeedsResponse.FindLoanInfo> {
    private static int IAuthTabCallback = 1;
    public static final CreditLoanNeedsResponse$FindLoanInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 85;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        CreditLoanNeedsResponse$FindLoanInfo$$serializer creditLoanNeedsResponse$FindLoanInfo$$serializer = new CreditLoanNeedsResponse$FindLoanInfo$$serializer();
        INSTANCE = creditLoanNeedsResponse$FindLoanInfo$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditLoanNeedsResponse.FindLoanInfo", creditLoanNeedsResponse$FindLoanInfo$$serializer, 3);
        setanimationsloop.onWarmupCompleted("firstTierBankCount", false);
        setanimationsloop.onWarmupCompleted("allLoanCompanyCount", false);
        setanimationsloop.onWarmupCompleted("firstTierBankProductCount", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 63;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 13 / 0;
        }
    }

    private CreditLoanNeedsResponse$FindLoanInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {getdynamicheight, getdynamicheight, getdynamicheight};
        int i4 = IAuthTabCallback + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditLoanNeedsResponse.FindLoanInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        int iOnTransact2;
        int iOnTransact3;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onNavigationEvent + 101;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                i2 = 109;
                iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 5);
            } else {
                int iOnTransact4 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                int iOnTransact5 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                i2 = 7;
                iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                iOnTransact = iOnTransact4;
                iOnTransact2 = iOnTransact5;
            }
            i = i2;
        } else {
            boolean z = true;
            int iOnTransact6 = 0;
            int iOnTransact7 = 0;
            int iOnTransact8 = 0;
            int i5 = 0;
            while (z) {
                int i6 = onNavigationEvent + 105;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    iOnTransact6 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    iOnTransact7 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                    i5 |= 2;
                    int i8 = onNavigationEvent + 23;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    iOnTransact8 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                    i5 |= 4;
                    int i10 = IAuthTabCallback + 125;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
            iOnTransact = iOnTransact6;
            iOnTransact2 = iOnTransact7;
            iOnTransact3 = iOnTransact8;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditLoanNeedsResponse.FindLoanInfo(i, iOnTransact, iOnTransact2, iOnTransact3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m168deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditLoanNeedsResponse.FindLoanInfo findLoanInfoDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return findLoanInfoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditLoanNeedsResponse.FindLoanInfo findLoanInfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(findLoanInfo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditLoanNeedsResponse.FindLoanInfo.onWarmupCompleted(findLoanInfo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 42 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(findLoanInfo, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            CreditLoanNeedsResponse.FindLoanInfo.onWarmupCompleted(findLoanInfo, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onNavigationEvent + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditLoanNeedsResponse.FindLoanInfo) obj);
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        int i5 = onNavigationEvent + 87;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

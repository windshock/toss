package viva.republica.toss.network.model.loan;

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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.LoanComparisonFunnelType;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class LoanComparisonFunnelType$FunnelType$$serializer implements aeu2<LoanComparisonFunnelType.FunnelType> {
    public static final LoanComparisonFunnelType$FunnelType$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        LoanComparisonFunnelType$FunnelType$$serializer loanComparisonFunnelType$FunnelType$$serializer = new LoanComparisonFunnelType$FunnelType$$serializer();
        INSTANCE = loanComparisonFunnelType$FunnelType$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanComparisonFunnelType.FunnelType", loanComparisonFunnelType$FunnelType$$serializer, 2);
        setanimationsloop.onWarmupCompleted("funnelType", true);
        setanimationsloop.onWarmupCompleted("jobType", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 99;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private LoanComparisonFunnelType$FunnelType$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {LoanComparisonFunnelType.FunnelType.onWarmupCompleted()[0].getValue(), getWriggleLayout.onNavigationEvent};
        int i4 = onExtraCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonFunnelType.FunnelType funnelTypeM38deserialize = m38deserialize(decoder);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        int i5 = onExtraCallback + 11;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return funnelTypeM38deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final LoanComparisonFunnelType.FunnelType m38deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        LoanFunnelType loanFunnelType;
        String strAsInterface;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = LoanComparisonFunnelType.FunnelType.onWarmupCompleted();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            loanFunnelType = (LoanFunnelType) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            int i3 = onExtraCallback + 69;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            i = 3;
        } else {
            LoanFunnelType loanFunnelType2 = null;
            String strAsInterface2 = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onExtraCallbackWithResult + 39;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i5 |= 2;
                } else {
                    loanFunnelType2 = (LoanFunnelType) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), loanFunnelType2);
                    i5 |= 1;
                }
            }
            i = i5;
            loanFunnelType = loanFunnelType2;
            strAsInterface = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LoanComparisonFunnelType.FunnelType(i, loanFunnelType, strAsInterface, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanComparisonFunnelType.FunnelType) obj);
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        int i5 = onExtraCallbackWithResult + 97;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanComparisonFunnelType.FunnelType funnelType) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(funnelType, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        LoanComparisonFunnelType.FunnelType.onExtraCallbackWithResult(funnelType, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 81 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallback + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}

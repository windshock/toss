package viva.republica.toss.network.model.loan;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.dj3;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.LoanPreScreenResultSummary;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class LoanHomeServiceSummaryResult$$serializer implements aeu2<LoanHomeServiceSummaryResult> {
    private static int IAuthTabCallback = 0;
    public static final LoanHomeServiceSummaryResult$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 11;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 12 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 121;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        LoanHomeServiceSummaryResult$$serializer loanHomeServiceSummaryResult$$serializer = new LoanHomeServiceSummaryResult$$serializer();
        INSTANCE = loanHomeServiceSummaryResult$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanHomeServiceSummaryResult", loanHomeServiceSummaryResult$$serializer, 4);
        setanimationsloop.onWarmupCompleted("interestRate", true);
        setanimationsloop.onWarmupCompleted("amount", true);
        setanimationsloop.onWarmupCompleted("minInterestRateResult", true);
        setanimationsloop.onWarmupCompleted("maxLimitAmountResult", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private LoanHomeServiceSummaryResult$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LoanPreScreenResultSummary$Product$$serializer loanPreScreenResultSummary$Product$$serializer = LoanPreScreenResultSummary$Product$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {dj3.onWarmupCompleted, oty1.onExtraCallback, sp.IAuthTabCallback(loanPreScreenResultSummary$Product$$serializer), sp.IAuthTabCallback(loanPreScreenResultSummary$Product$$serializer)};
        int i4 = onWarmupCompleted + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LoanHomeServiceSummaryResult loanHomeServiceSummaryResultM48deserialize = m48deserialize(decoder);
        int i4 = onWarmupCompleted + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return loanHomeServiceSummaryResultM48deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final LoanHomeServiceSummaryResult m48deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        LoanPreScreenResultSummary.Product product;
        LoanPreScreenResultSummary.Product product2;
        float fOnWarmupCompleted;
        long j;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            LoanPreScreenResultSummary$Product$$serializer loanPreScreenResultSummary$Product$$serializer = LoanPreScreenResultSummary$Product$$serializer.INSTANCE;
            LoanPreScreenResultSummary.Product product3 = (LoanPreScreenResultSummary.Product) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, loanPreScreenResultSummary$Product$$serializer, (Object) null);
            i = 15;
            product = (LoanPreScreenResultSummary.Product) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, loanPreScreenResultSummary$Product$$serializer, (Object) null);
            j = jIAuthTabCallbackDefault;
            product2 = product3;
        } else {
            int i5 = 0;
            boolean z = true;
            long jIAuthTabCallbackDefault2 = 0;
            float fOnWarmupCompleted2 = 0.0f;
            LoanPreScreenResultSummary.Product product4 = null;
            product = null;
            while (z) {
                int i6 = onWarmupCompleted + 71;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i7 = onNavigationEvent + 51;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                    i5 |= 2;
                } else if (iOnNavigationEvent != 2) {
                    int i9 = onWarmupCompleted + 39;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    if (iOnNavigationEvent != 3) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    product = (LoanPreScreenResultSummary.Product) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, LoanPreScreenResultSummary$Product$$serializer.INSTANCE, product);
                    i5 |= 8;
                } else {
                    product4 = (LoanPreScreenResultSummary.Product) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, LoanPreScreenResultSummary$Product$$serializer.INSTANCE, product4);
                    i5 |= 4;
                }
            }
            product2 = product4;
            fOnWarmupCompleted = fOnWarmupCompleted2;
            j = jIAuthTabCallbackDefault2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LoanHomeServiceSummaryResult(i, fOnWarmupCompleted, j, product2, product, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanHomeServiceSummaryResult) obj);
        int i4 = onNavigationEvent + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanHomeServiceSummaryResult loanHomeServiceSummaryResult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(loanHomeServiceSummaryResult, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            LoanHomeServiceSummaryResult.onExtraCallbackWithResult(loanHomeServiceSummaryResult, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 42 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(loanHomeServiceSummaryResult, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            LoanHomeServiceSummaryResult.onExtraCallbackWithResult(loanHomeServiceSummaryResult, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onWarmupCompleted + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

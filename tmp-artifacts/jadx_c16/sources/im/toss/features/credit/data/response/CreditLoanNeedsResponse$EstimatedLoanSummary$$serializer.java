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
import o.dj3;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditLoanNeedsResponse$EstimatedLoanSummary$$serializer implements aeu2<CreditLoanNeedsResponse.EstimatedLoanSummary> {
    private static int IAuthTabCallback = 0;
    public static final CreditLoanNeedsResponse$EstimatedLoanSummary$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 25;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        CreditLoanNeedsResponse$EstimatedLoanSummary$$serializer creditLoanNeedsResponse$EstimatedLoanSummary$$serializer = new CreditLoanNeedsResponse$EstimatedLoanSummary$$serializer();
        INSTANCE = creditLoanNeedsResponse$EstimatedLoanSummary$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditLoanNeedsResponse.EstimatedLoanSummary", creditLoanNeedsResponse$EstimatedLoanSummary$$serializer, 2);
        setanimationsloop.onWarmupCompleted("lowestInterestRate", false);
        setanimationsloop.onWarmupCompleted("maxLimit", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 99;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 55 / 0;
        }
    }

    private CreditLoanNeedsResponse$EstimatedLoanSummary$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {dj3.onWarmupCompleted, getWriggleLayout.onNavigationEvent};
        int i4 = onExtraCallback + 95;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditLoanNeedsResponse.EstimatedLoanSummary deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        float fOnWarmupCompleted;
        String strAsInterface;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            i = 3;
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            String strAsInterface2 = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int i4 = onExtraCallback + 115;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = onNavigationEvent + 25;
                    int i6 = i5 % 128;
                    onExtraCallback = i6;
                    int i7 = i5 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i8 = i6 + 69;
                    onNavigationEvent = i8 % 128;
                    strAsInterface2 = i8 % 2 == 0 ? ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0) : ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i3 |= 2;
                } else {
                    fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
                    i3 |= 1;
                }
            }
            fOnWarmupCompleted = fOnWarmupCompleted2;
            strAsInterface = strAsInterface2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditLoanNeedsResponse.EstimatedLoanSummary(i, fOnWarmupCompleted, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m167deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditLoanNeedsResponse.EstimatedLoanSummary estimatedLoanSummaryDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return estimatedLoanSummaryDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditLoanNeedsResponse.EstimatedLoanSummary estimatedLoanSummary) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(estimatedLoanSummary, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditLoanNeedsResponse.EstimatedLoanSummary.onNavigationEvent(estimatedLoanSummary, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(estimatedLoanSummary, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditLoanNeedsResponse.EstimatedLoanSummary.onNavigationEvent(estimatedLoanSummary, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 48 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditLoanNeedsResponse.EstimatedLoanSummary) obj);
        int i4 = onNavigationEvent + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

package viva.republica.toss.network.model.loan;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.EncryptedContentInfoParser;
import o.aeu2;
import o.getBgColor;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class LoanAccountInfoResponse$$serializer implements aeu2<LoanAccountInfoResponse> {
    public static final LoanAccountInfoResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return serialDescriptor;
    }

    static {
        LoanAccountInfoResponse$$serializer loanAccountInfoResponse$$serializer = new LoanAccountInfoResponse$$serializer();
        INSTANCE = loanAccountInfoResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanAccountInfoResponse", loanAccountInfoResponse$$serializer, 11);
        setanimationsloop.onWarmupCompleted("accountId", true);
        setanimationsloop.onWarmupCompleted("accountInfo", true);
        setanimationsloop.onWarmupCompleted("refinancingStatus", true);
        setanimationsloop.onWarmupCompleted("commissionAmount", true);
        setanimationsloop.onWarmupCompleted("refinancable", true);
        setanimationsloop.onWarmupCompleted("refinancingAvailableTimeRange", true);
        setanimationsloop.onWarmupCompleted("preScreenCompleteRequests", true);
        setanimationsloop.onWarmupCompleted("droppedRequests", true);
        setanimationsloop.onWarmupCompleted("inspectRequests", true);
        setanimationsloop.onWarmupCompleted("failedRequests", true);
        setanimationsloop.onWarmupCompleted("canceledRequests", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 99;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private LoanAccountInfoResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnTransact = LoanAccountInfoResponse.onTransact();
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {oty1Var, LoanAccountResponse$$serializer.INSTANCE, LoanRefinancingAccountStatusResponse$$serializer.INSTANCE, oty1Var, getBgColor.IAuthTabCallback, sp.IAuthTabCallback(RefinancingAvailableTimeRange$$serializer.INSTANCE), lazyArrOnTransact[6].getValue(), lazyArrOnTransact[7].getValue(), lazyArrOnTransact[8].getValue(), lazyArrOnTransact[9].getValue(), lazyArrOnTransact[10].getValue()};
        int i4 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return m31deserialize(decoder);
        }
        m31deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final LoanAccountInfoResponse m31deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean z;
        List list;
        RefinancingAvailableTimeRange refinancingAvailableTimeRange;
        List list2;
        LoanRefinancingAccountStatusResponse loanRefinancingAccountStatusResponse;
        long j;
        int i;
        List list3;
        LoanAccountResponse loanAccountResponse;
        List list4;
        List list5;
        long j2;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnTransact = LoanAccountInfoResponse.onTransact();
        int i4 = 9;
        List list6 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            LoanAccountResponse loanAccountResponse2 = (LoanAccountResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, LoanAccountResponse$$serializer.INSTANCE, (Object) null);
            LoanRefinancingAccountStatusResponse loanRefinancingAccountStatusResponse2 = (LoanRefinancingAccountStatusResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, LoanRefinancingAccountStatusResponse$$serializer.INSTANCE, (Object) null);
            long jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
            RefinancingAvailableTimeRange refinancingAvailableTimeRange2 = (RefinancingAvailableTimeRange) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, RefinancingAvailableTimeRange$$serializer.INSTANCE, (Object) null);
            List list7 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArrOnTransact[6].getValue(), (Object) null);
            List list8 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 7, (jp) lazyArrOnTransact[7].getValue(), (Object) null);
            List list9 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArrOnTransact[8].getValue(), (Object) null);
            List list10 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 9, (jp) lazyArrOnTransact[9].getValue(), (Object) null);
            list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 10, (jp) lazyArrOnTransact[10].getValue(), (Object) null);
            loanAccountResponse = loanAccountResponse2;
            refinancingAvailableTimeRange = refinancingAvailableTimeRange2;
            list2 = list7;
            list = list8;
            list5 = list10;
            list4 = list9;
            i = 2047;
            j2 = jIAuthTabCallbackDefault;
            j = jIAuthTabCallbackDefault2;
            loanRefinancingAccountStatusResponse = loanRefinancingAccountStatusResponse2;
            z = zOnExtraCallbackWithResult;
        } else {
            boolean z2 = true;
            boolean zOnExtraCallbackWithResult2 = false;
            int i7 = 0;
            List list11 = null;
            RefinancingAvailableTimeRange refinancingAvailableTimeRange3 = null;
            List list12 = null;
            List list13 = null;
            LoanRefinancingAccountStatusResponse loanRefinancingAccountStatusResponse3 = null;
            List list14 = null;
            LoanAccountResponse loanAccountResponse3 = null;
            long jIAuthTabCallbackDefault3 = 0;
            long jIAuthTabCallbackDefault4 = 0;
            while (z2) {
                int i8 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % i2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        i2 = 2;
                        i4 = 9;
                    case 0:
                        jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i7 |= 1;
                        loanAccountResponse3 = loanAccountResponse3;
                        i2 = 2;
                        i4 = 9;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        loanAccountResponse3 = (LoanAccountResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, LoanAccountResponse$$serializer.INSTANCE, loanAccountResponse3);
                        i7 |= 2;
                        i2 = 2;
                        i4 = 9;
                    case 2:
                        loanRefinancingAccountStatusResponse3 = (LoanRefinancingAccountStatusResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i2, LoanRefinancingAccountStatusResponse$$serializer.INSTANCE, loanRefinancingAccountStatusResponse3);
                        i7 |= 4;
                        i4 = 9;
                    case 3:
                        jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
                        i7 |= 8;
                        i4 = 9;
                    case 4:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
                        i7 |= 16;
                        i4 = 9;
                    case 5:
                        refinancingAvailableTimeRange3 = (RefinancingAvailableTimeRange) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, RefinancingAvailableTimeRange$$serializer.INSTANCE, refinancingAvailableTimeRange3);
                        i7 |= 32;
                        i4 = 9;
                    case 6:
                        list12 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArrOnTransact[6].getValue(), list12);
                        i7 |= 64;
                        i4 = 9;
                    case 7:
                        list11 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 7, (jp) lazyArrOnTransact[7].getValue(), list11);
                        i7 |= 128;
                        i4 = 9;
                    case 8:
                        list13 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArrOnTransact[8].getValue(), list13);
                        i7 |= 256;
                        i4 = 9;
                    case 9:
                        list14 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i4, (jp) lazyArrOnTransact[i4].getValue(), list14);
                        i7 |= 512;
                    case 10:
                        list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 10, (jp) lazyArrOnTransact[10].getValue(), list6);
                        i7 |= 1024;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            LoanAccountResponse loanAccountResponse4 = loanAccountResponse3;
            z = zOnExtraCallbackWithResult2;
            list = list11;
            refinancingAvailableTimeRange = refinancingAvailableTimeRange3;
            list2 = list12;
            loanRefinancingAccountStatusResponse = loanRefinancingAccountStatusResponse3;
            j = jIAuthTabCallbackDefault4;
            i = i7;
            list3 = list6;
            loanAccountResponse = loanAccountResponse4;
            long j3 = jIAuthTabCallbackDefault3;
            list4 = list13;
            list5 = list14;
            j2 = j3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LoanAccountInfoResponse(i, j2, loanAccountResponse, loanRefinancingAccountStatusResponse, j, z, refinancingAvailableTimeRange, list2, list, list4, list5, list3, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanAccountInfoResponse) obj);
        int i4 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanAccountInfoResponse loanAccountInfoResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(loanAccountInfoResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        LoanAccountInfoResponse.onExtraCallbackWithResult(loanAccountInfoResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}

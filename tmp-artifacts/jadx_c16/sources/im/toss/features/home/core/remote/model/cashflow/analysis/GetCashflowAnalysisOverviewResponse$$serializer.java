package im.toss.features.home.core.remote.model.cashflow.analysis;

import im.toss.features.home.core.remote.model.cashflow.common.CashflowYearMonthSelectorResponse;
import im.toss.features.home.core.remote.model.cashflow.common.CashflowYearMonthSelectorResponse$$serializer;
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
public final /* synthetic */ class GetCashflowAnalysisOverviewResponse$$serializer implements aeu2<GetCashflowAnalysisOverviewResponse> {
    private static int IAuthTabCallback = 1;
    public static final GetCashflowAnalysisOverviewResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        GetCashflowAnalysisOverviewResponse$$serializer getCashflowAnalysisOverviewResponse$$serializer = new GetCashflowAnalysisOverviewResponse$$serializer();
        INSTANCE = getCashflowAnalysisOverviewResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.cashflow.analysis.GetCashflowAnalysisOverviewResponse", getCashflowAnalysisOverviewResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("yearMonthSelector", true);
        setanimationsloop.onWarmupCompleted("sections", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 17;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private GetCashflowAnalysisOverviewResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(CashflowYearMonthSelectorResponse$$serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) GetCashflowAnalysisOverviewResponse.onWarmupCompleted()[1].getValue())};
        int i4 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GetCashflowAnalysisOverviewResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        CashflowYearMonthSelectorResponse cashflowYearMonthSelectorResponse;
        List list;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = GetCashflowAnalysisOverviewResponse.onWarmupCompleted();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            cashflowYearMonthSelectorResponse = (CashflowYearMonthSelectorResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CashflowYearMonthSelectorResponse$$serializer.INSTANCE, (Object) null);
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            i = 3;
        } else {
            int i3 = 0;
            CashflowYearMonthSelectorResponse cashflowYearMonthSelectorResponse2 = null;
            List list2 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i4 = onExtraCallbackWithResult + 43;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 / 4;
                    }
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    cashflowYearMonthSelectorResponse2 = (CashflowYearMonthSelectorResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CashflowYearMonthSelectorResponse$$serializer.INSTANCE, cashflowYearMonthSelectorResponse2);
                    i3 |= 1;
                    int i6 = IAuthTabCallback + 87;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i8 = onExtraCallbackWithResult + 73;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list2);
                    i3 |= 2;
                }
            }
            cashflowYearMonthSelectorResponse = cashflowYearMonthSelectorResponse2;
            list = list2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new GetCashflowAnalysisOverviewResponse(i, cashflowYearMonthSelectorResponse, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m561deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        GetCashflowAnalysisOverviewResponse getCashflowAnalysisOverviewResponseDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return getCashflowAnalysisOverviewResponseDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetCashflowAnalysisOverviewResponse getCashflowAnalysisOverviewResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(getCashflowAnalysisOverviewResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        GetCashflowAnalysisOverviewResponse.IAuthTabCallback(getCashflowAnalysisOverviewResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetCashflowAnalysisOverviewResponse) obj);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

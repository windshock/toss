package im.toss.features.home.core.remote.model.cashflow.search;

import im.toss.features.home.core.remote.model.cashflow.common.CashflowColorResponse;
import im.toss.features.home.core.remote.model.cashflow.common.CashflowColorResponse$;
import im.toss.features.home.core.remote.model.cashflow.common.CashflowYearMonthSelectorResponse;
import im.toss.features.home.core.remote.model.cashflow.common.CashflowYearMonthSelectorResponse$$serializer;
import java.util.Map;
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
public final /* synthetic */ class GetCashflowSearchOverviewResponse$$serializer implements aeu2<GetCashflowSearchOverviewResponse> {
    public static final GetCashflowSearchOverviewResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 67;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return serialDescriptor;
    }

    static {
        GetCashflowSearchOverviewResponse$$serializer getCashflowSearchOverviewResponse$$serializer = new GetCashflowSearchOverviewResponse$$serializer();
        INSTANCE = getCashflowSearchOverviewResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.cashflow.search.GetCashflowSearchOverviewResponse", getCashflowSearchOverviewResponse$$serializer, 4);
        setanimationsloop.onWarmupCompleted("yearMonthSelector", true);
        setanimationsloop.onWarmupCompleted("dailyTransactions", true);
        setanimationsloop.onWarmupCompleted("incomeColor", true);
        setanimationsloop.onWarmupCompleted("overspendingColor", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 97;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private GetCashflowSearchOverviewResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = GetCashflowSearchOverviewResponse.onWarmupCompleted();
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(CashflowYearMonthSelectorResponse$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[1].getValue());
        CashflowColorResponse$.serializer serializerVar = CashflowColorResponse$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(serializerVar)};
        int i4 = onExtraCallbackWithResult + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GetCashflowSearchOverviewResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        CashflowColorResponse cashflowColorResponse;
        CashflowColorResponse cashflowColorResponse2;
        CashflowYearMonthSelectorResponse cashflowYearMonthSelectorResponse;
        int i;
        Map map;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = GetCashflowSearchOverviewResponse.onWarmupCompleted();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            CashflowYearMonthSelectorResponse cashflowYearMonthSelectorResponse2 = (CashflowYearMonthSelectorResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CashflowYearMonthSelectorResponse$$serializer.INSTANCE, (Object) null);
            Map map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            CashflowColorResponse$.serializer serializerVar = CashflowColorResponse$.serializer.INSTANCE;
            cashflowColorResponse = (CashflowColorResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, serializerVar, (Object) null);
            map = map2;
            cashflowYearMonthSelectorResponse = cashflowYearMonthSelectorResponse2;
            cashflowColorResponse2 = (CashflowColorResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, serializerVar, (Object) null);
            i = 15;
        } else {
            int i3 = 0;
            boolean z = true;
            CashflowColorResponse cashflowColorResponse3 = null;
            Map map3 = null;
            CashflowYearMonthSelectorResponse cashflowYearMonthSelectorResponse3 = null;
            CashflowColorResponse cashflowColorResponse4 = null;
            while (z) {
                int i4 = onExtraCallbackWithResult + 63;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onExtraCallbackWithResult + 3;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        cashflowYearMonthSelectorResponse3 = (CashflowYearMonthSelectorResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CashflowYearMonthSelectorResponse$$serializer.INSTANCE, cashflowYearMonthSelectorResponse3);
                        i3 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), map3);
                        i3 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        cashflowColorResponse3 = (CashflowColorResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, CashflowColorResponse$.serializer.INSTANCE, cashflowColorResponse3);
                        i3 |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        cashflowColorResponse4 = (CashflowColorResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CashflowColorResponse$.serializer.INSTANCE, cashflowColorResponse4);
                        i3 |= 8;
                    }
                } else {
                    z = false;
                }
            }
            cashflowColorResponse = cashflowColorResponse3;
            cashflowColorResponse2 = cashflowColorResponse4;
            cashflowYearMonthSelectorResponse = cashflowYearMonthSelectorResponse3;
            i = i3;
            map = map3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new GetCashflowSearchOverviewResponse(i, cashflowYearMonthSelectorResponse, map, cashflowColorResponse, cashflowColorResponse2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m570deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        GetCashflowSearchOverviewResponse getCashflowSearchOverviewResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return getCashflowSearchOverviewResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetCashflowSearchOverviewResponse getCashflowSearchOverviewResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(getCashflowSearchOverviewResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            GetCashflowSearchOverviewResponse.onExtraCallback(getCashflowSearchOverviewResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(getCashflowSearchOverviewResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        GetCashflowSearchOverviewResponse.onExtraCallback(getCashflowSearchOverviewResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetCashflowSearchOverviewResponse) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

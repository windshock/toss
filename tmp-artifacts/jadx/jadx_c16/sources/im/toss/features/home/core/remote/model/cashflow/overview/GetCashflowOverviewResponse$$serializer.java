package im.toss.features.home.core.remote.model.cashflow.overview;

import im.toss.features.home.core.remote.model.cashflow.common.CashflowYearMonthSelectorResponse;
import im.toss.features.home.core.remote.model.cashflow.common.CashflowYearMonthSelectorResponse$$serializer;
import java.util.List;
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
import o.getDynamicHeight;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GetCashflowOverviewResponse$$serializer implements aeu2<GetCashflowOverviewResponse> {
    private static int IAuthTabCallback = 1;
    public static final GetCashflowOverviewResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 35;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        GetCashflowOverviewResponse$$serializer getCashflowOverviewResponse$$serializer = new GetCashflowOverviewResponse$$serializer();
        INSTANCE = getCashflowOverviewResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.cashflow.overview.GetCashflowOverviewResponse", getCashflowOverviewResponse$$serializer, 9);
        setanimationsloop.onWarmupCompleted("yearMonthSelector", true);
        setanimationsloop.onWarmupCompleted("navigationBarItems", true);
        setanimationsloop.onWarmupCompleted("navigationBarMenuItems", true);
        setanimationsloop.onWarmupCompleted("itemsById", true);
        setanimationsloop.onWarmupCompleted("tabs", true);
        setanimationsloop.onWarmupCompleted("attentionFloatingButton", true);
        setanimationsloop.onWarmupCompleted("state", true);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        setanimationsloop.onWarmupCompleted("transactionCount", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 45;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private GetCashflowOverviewResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallbackDefault = GetCashflowOverviewResponse.IAuthTabCallbackDefault();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(CashflowYearMonthSelectorResponse$$serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackDefault[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackDefault[2].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackDefault[3].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackDefault[4].getValue()), sp.IAuthTabCallback(AttentionFloatingButtonResponse$$serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackDefault[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackDefault[7].getValue()), sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted)};
        int i4 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GetCashflowOverviewResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Map map;
        CashflowYearMonthSelectorResponse cashflowYearMonthSelectorResponse;
        Integer num;
        int i;
        List list;
        Map map2;
        Map map3;
        List list2;
        List list3;
        AttentionFloatingButtonResponse attentionFloatingButtonResponse;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i3 % 128;
        Map map4 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            GetCashflowOverviewResponse.IAuthTabCallbackDefault();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            map4.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallbackDefault = GetCashflowOverviewResponse.IAuthTabCallbackDefault();
        int i4 = 8;
        int i5 = 7;
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            CashflowYearMonthSelectorResponse cashflowYearMonthSelectorResponse2 = (CashflowYearMonthSelectorResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, CashflowYearMonthSelectorResponse$$serializer.INSTANCE, (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallbackDefault[1].getValue(), (Object) null);
            List list5 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallbackDefault[2].getValue(), (Object) null);
            Map map5 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrIAuthTabCallbackDefault[3].getValue(), (Object) null);
            List list6 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrIAuthTabCallbackDefault[4].getValue(), (Object) null);
            AttentionFloatingButtonResponse attentionFloatingButtonResponse2 = (AttentionFloatingButtonResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, AttentionFloatingButtonResponse$$serializer.INSTANCE, (Object) null);
            Map map6 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrIAuthTabCallbackDefault[6].getValue(), (Object) null);
            map = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrIAuthTabCallbackDefault[7].getValue(), (Object) null);
            num = (Integer) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 8, getDynamicHeight.onWarmupCompleted, (Object) null);
            attentionFloatingButtonResponse = attentionFloatingButtonResponse2;
            i = 511;
            map3 = map6;
            list2 = list6;
            cashflowYearMonthSelectorResponse = cashflowYearMonthSelectorResponse2;
            map2 = map5;
            list3 = list4;
            list = list5;
        } else {
            AttentionFloatingButtonResponse attentionFloatingButtonResponse3 = null;
            Map map7 = null;
            List list7 = null;
            List list8 = null;
            List list9 = null;
            CashflowYearMonthSelectorResponse cashflowYearMonthSelectorResponse3 = null;
            int i6 = 0;
            boolean z = true;
            Integer num2 = null;
            Map map8 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i4 = 8;
                        i5 = 7;
                    case 0:
                        i6 |= 1;
                        cashflowYearMonthSelectorResponse3 = (CashflowYearMonthSelectorResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, CashflowYearMonthSelectorResponse$$serializer.INSTANCE, cashflowYearMonthSelectorResponse3);
                        i4 = 8;
                        i5 = 7;
                    case 1:
                        list8 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallbackDefault[1].getValue(), list8);
                        i6 |= 2;
                        i4 = 8;
                        i5 = 7;
                    case 2:
                        list9 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallbackDefault[2].getValue(), list9);
                        i6 |= 4;
                        int i7 = onExtraCallbackWithResult + 87;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        i4 = 8;
                        i5 = 7;
                    case 3:
                        map7 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrIAuthTabCallbackDefault[3].getValue(), map7);
                        i6 |= 8;
                        i4 = 8;
                    case 4:
                        list7 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrIAuthTabCallbackDefault[4].getValue(), list7);
                        i6 |= 16;
                        i4 = 8;
                    case 5:
                        attentionFloatingButtonResponse3 = (AttentionFloatingButtonResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, AttentionFloatingButtonResponse$$serializer.INSTANCE, attentionFloatingButtonResponse3);
                        i6 |= 32;
                        i4 = 8;
                    case 6:
                        map8 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrIAuthTabCallbackDefault[6].getValue(), map8);
                        i6 |= 64;
                    case 7:
                        map4 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i5, (jp) lazyArrIAuthTabCallbackDefault[i5].getValue(), map4);
                        i6 |= 128;
                    case 8:
                        num2 = (Integer) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i4, getDynamicHeight.onWarmupCompleted, num2);
                        i6 |= 256;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            map = map4;
            cashflowYearMonthSelectorResponse = cashflowYearMonthSelectorResponse3;
            num = num2;
            i = i6;
            list = list9;
            map2 = map7;
            map3 = map8;
            list2 = list7;
            list3 = list8;
            attentionFloatingButtonResponse = attentionFloatingButtonResponse3;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new GetCashflowOverviewResponse(i, cashflowYearMonthSelectorResponse, list3, list, map2, list2, attentionFloatingButtonResponse, map3, map, num, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m568deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        GetCashflowOverviewResponse getCashflowOverviewResponseDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        int i5 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getCashflowOverviewResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetCashflowOverviewResponse getCashflowOverviewResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(getCashflowOverviewResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            GetCashflowOverviewResponse.onExtraCallbackWithResult(getCashflowOverviewResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(getCashflowOverviewResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        GetCashflowOverviewResponse.onExtraCallbackWithResult(getCashflowOverviewResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetCashflowOverviewResponse) obj);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        int i5 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}

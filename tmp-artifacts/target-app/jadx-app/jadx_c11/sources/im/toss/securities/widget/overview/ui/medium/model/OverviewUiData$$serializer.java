package im.toss.securities.widget.overview.ui.medium.model;

import im.toss.securities.widget.data.model.overview.OverviewPrice;
import im.toss.securities.widget.data.model.overview.OverviewPrice$$serializer;
import im.toss.securities.widget.data.model.overview.OverviewRate;
import im.toss.securities.widget.data.model.overview.OverviewRate$$serializer;
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
import o.checkDuration;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class OverviewUiData$$serializer implements aeu2<OverviewUiData> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final OverviewUiData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 121;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return serialDescriptor;
    }

    static {
        OverviewUiData$$serializer overviewUiData$$serializer = new OverviewUiData$$serializer();
        INSTANCE = overviewUiData$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.overview.ui.medium.model.OverviewUiData", overviewUiData$$serializer, 15);
        setanimationsloop.onWarmupCompleted("evaluatedAmount", true);
        setanimationsloop.onWarmupCompleted("profitLossAmount", true);
        setanimationsloop.onWarmupCompleted("profitLossRate", true);
        setanimationsloop.onWarmupCompleted("evaluatedAmountTxt", true);
        setanimationsloop.onWarmupCompleted("profitLossAmountRateTxt", true);
        setanimationsloop.onWarmupCompleted("profitChangeType", true);
        setanimationsloop.onWarmupCompleted("hasKr", true);
        setanimationsloop.onWarmupCompleted("logoImageUrls", true);
        setanimationsloop.onWarmupCompleted("totalCommission", true);
        setanimationsloop.onWarmupCompleted("totalTax", true);
        setanimationsloop.onWarmupCompleted("evaluatedAmountAfterFees", true);
        setanimationsloop.onWarmupCompleted("profitLossAmountAfterFees", true);
        setanimationsloop.onWarmupCompleted("profitLossRateAfterFees", true);
        setanimationsloop.onWarmupCompleted("items", false);
        setanimationsloop.onWarmupCompleted("listItems", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 9;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private OverviewUiData$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = OverviewUiData.onExtraCallback();
        OverviewPrice$$serializer overviewPrice$$serializer = OverviewPrice$$serializer.INSTANCE;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[5].getValue()), sp.IAuthTabCallback(getBgColor.IAuthTabCallback), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[7].getValue()), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(OverviewRate$$serializer.INSTANCE), lazyArrOnExtraCallback[13].getValue(), lazyArrOnExtraCallback[14].getValue()};
        int i4 = onNavigationEvent + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewUiData deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        OverviewPrice overviewPrice;
        OverviewPrice overviewPrice2;
        OverviewPrice overviewPrice3;
        OverviewRate overviewRate;
        String str;
        List list;
        OverviewPrice overviewPrice4;
        Boolean bool;
        List list2;
        String str2;
        OverviewPrice overviewPrice5;
        List list3;
        checkDuration checkduration;
        OverviewPrice overviewPrice6;
        OverviewPrice overviewPrice7;
        int i;
        Lazy[] lazyArr;
        List list4;
        List list5;
        OverviewPrice overviewPrice8;
        Lazy[] lazyArr2;
        List list6;
        OverviewPrice overviewPrice9;
        String str3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = OverviewUiData.onExtraCallback();
        OverviewPrice overviewPrice10 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onNavigationEvent + 17;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            OverviewPrice$$serializer overviewPrice$$serializer = OverviewPrice$$serializer.INSTANCE;
            OverviewPrice overviewPrice11 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice12 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice13 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, overviewPrice$$serializer, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            checkDuration checkduration2 = (checkDuration) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnExtraCallback[5].getValue(), (Object) null);
            Boolean bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getBgColor.IAuthTabCallback, (Object) null);
            List list7 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnExtraCallback[7].getValue(), (Object) null);
            OverviewPrice overviewPrice14 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice15 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice16 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice17 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, overviewPrice$$serializer, (Object) null);
            OverviewRate overviewRate2 = (OverviewRate) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, OverviewRate$$serializer.INSTANCE, (Object) null);
            List list8 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 13, (jp) lazyArrOnExtraCallback[13].getValue(), (Object) null);
            overviewRate = overviewRate2;
            overviewPrice4 = overviewPrice13;
            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 14, (jp) lazyArrOnExtraCallback[14].getValue(), (Object) null);
            i = 32767;
            overviewPrice7 = overviewPrice11;
            overviewPrice3 = overviewPrice12;
            str2 = str4;
            bool = bool2;
            checkduration = checkduration2;
            overviewPrice2 = overviewPrice15;
            str = str5;
            overviewPrice6 = overviewPrice14;
            list3 = list7;
            overviewPrice = overviewPrice16;
            overviewPrice5 = overviewPrice17;
            list = list8;
        } else {
            int i5 = 0;
            String str6 = null;
            Boolean bool3 = null;
            OverviewRate overviewRate3 = null;
            List list9 = null;
            List list10 = null;
            OverviewPrice overviewPrice18 = null;
            checkDuration checkduration3 = null;
            overviewPrice = null;
            List list11 = null;
            OverviewPrice overviewPrice19 = null;
            OverviewPrice overviewPrice20 = null;
            String str7 = null;
            OverviewPrice overviewPrice21 = null;
            boolean z = true;
            overviewPrice2 = null;
            while (z) {
                int i6 = onWarmupCompleted + 13;
                OverviewPrice overviewPrice22 = overviewPrice10;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        lazyArr2 = lazyArrOnExtraCallback;
                        list6 = list10;
                        overviewPrice9 = overviewPrice20;
                        str3 = str6;
                        z = false;
                        overviewPrice10 = overviewPrice22;
                        list10 = list6;
                        str6 = str3;
                        lazyArrOnExtraCallback = lazyArr2;
                        overviewPrice20 = overviewPrice9;
                    case 0:
                        lazyArr2 = lazyArrOnExtraCallback;
                        overviewPrice9 = overviewPrice20;
                        str3 = str6;
                        overviewPrice19 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, OverviewPrice$$serializer.INSTANCE, overviewPrice19);
                        i5 |= 1;
                        overviewPrice10 = overviewPrice22;
                        list10 = list10;
                        overviewPrice21 = overviewPrice21;
                        str6 = str3;
                        lazyArrOnExtraCallback = lazyArr2;
                        overviewPrice20 = overviewPrice9;
                    case 1:
                        lazyArr2 = lazyArrOnExtraCallback;
                        list6 = list10;
                        OverviewPrice overviewPrice23 = overviewPrice20;
                        str3 = str6;
                        overviewPrice9 = overviewPrice23;
                        overviewPrice10 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, OverviewPrice$$serializer.INSTANCE, overviewPrice22);
                        i5 |= 2;
                        overviewPrice21 = overviewPrice21;
                        str7 = str7;
                        list10 = list6;
                        str6 = str3;
                        lazyArrOnExtraCallback = lazyArr2;
                        overviewPrice20 = overviewPrice9;
                    case 2:
                        i5 |= 4;
                        list10 = list10;
                        str6 = str6;
                        overviewPrice10 = overviewPrice22;
                        overviewPrice20 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, OverviewPrice$$serializer.INSTANCE, overviewPrice20);
                        lazyArrOnExtraCallback = lazyArrOnExtraCallback;
                    case 3:
                        lazyArr = lazyArrOnExtraCallback;
                        list4 = list10;
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str6);
                        i5 |= 8;
                        list10 = list4;
                        lazyArrOnExtraCallback = lazyArr;
                        overviewPrice10 = overviewPrice22;
                    case 4:
                        list4 = list10;
                        lazyArr = lazyArrOnExtraCallback;
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str7);
                        i5 |= 16;
                        list10 = list4;
                        lazyArrOnExtraCallback = lazyArr;
                        overviewPrice10 = overviewPrice22;
                    case 5:
                        list5 = list10;
                        checkduration3 = (checkDuration) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnExtraCallback[5].getValue(), checkduration3);
                        i5 |= 32;
                        list10 = list5;
                        overviewPrice10 = overviewPrice22;
                    case 6:
                        list5 = list10;
                        bool3 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getBgColor.IAuthTabCallback, bool3);
                        i5 |= 64;
                        list10 = list5;
                        overviewPrice10 = overviewPrice22;
                    case 7:
                        list5 = list10;
                        overviewPrice8 = overviewPrice21;
                        list9 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnExtraCallback[7].getValue(), list9);
                        i5 |= 128;
                        overviewPrice21 = overviewPrice8;
                        list10 = list5;
                        overviewPrice10 = overviewPrice22;
                    case 8:
                        list5 = list10;
                        overviewPrice8 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, OverviewPrice$$serializer.INSTANCE, overviewPrice21);
                        i5 |= 256;
                        overviewPrice21 = overviewPrice8;
                        list10 = list5;
                        overviewPrice10 = overviewPrice22;
                    case 9:
                        list5 = list10;
                        overviewPrice2 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, OverviewPrice$$serializer.INSTANCE, overviewPrice2);
                        i5 |= 512;
                        list10 = list5;
                        overviewPrice10 = overviewPrice22;
                    case 10:
                        list5 = list10;
                        overviewPrice = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, OverviewPrice$$serializer.INSTANCE, overviewPrice);
                        i5 |= 1024;
                        list10 = list5;
                        overviewPrice10 = overviewPrice22;
                    case 11:
                        list5 = list10;
                        overviewPrice18 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, OverviewPrice$$serializer.INSTANCE, overviewPrice18);
                        i5 |= 2048;
                        list10 = list5;
                        overviewPrice10 = overviewPrice22;
                    case 12:
                        list5 = list10;
                        overviewRate3 = (OverviewRate) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, OverviewRate$$serializer.INSTANCE, overviewRate3);
                        i5 |= 4096;
                        list10 = list5;
                        overviewPrice10 = overviewPrice22;
                    case 13:
                        list10 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 13, (jp) lazyArrOnExtraCallback[13].getValue(), list10);
                        i5 |= 8192;
                        overviewPrice10 = overviewPrice22;
                    case 14:
                        list11 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 14, (jp) lazyArrOnExtraCallback[14].getValue(), list11);
                        i5 |= 16384;
                        overviewPrice10 = overviewPrice22;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            OverviewPrice overviewPrice24 = overviewPrice20;
            String str8 = str6;
            overviewPrice3 = overviewPrice10;
            overviewRate = overviewRate3;
            str = str7;
            list = list10;
            overviewPrice4 = overviewPrice24;
            bool = bool3;
            list2 = list11;
            str2 = str8;
            overviewPrice5 = overviewPrice18;
            list3 = list9;
            checkduration = checkduration3;
            overviewPrice6 = overviewPrice21;
            int i8 = i5;
            overviewPrice7 = overviewPrice19;
            i = i8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewUiData(i, overviewPrice7, overviewPrice3, overviewPrice4, str2, str, checkduration, bool, list3, overviewPrice6, overviewPrice2, overviewPrice, overviewPrice5, overviewRate, list, list2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m73deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        OverviewUiData overviewUiDataDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
        int i5 = onWarmupCompleted + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return overviewUiDataDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewUiData overviewUiData) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(overviewUiData, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        OverviewUiData.onNavigationEvent(overviewUiData, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewUiData) obj);
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

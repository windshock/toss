package im.toss.securities.widget.data.model.overview;

import im.toss.securities.widget.data.model.overview.OverviewAccounts;
import im.toss.tds.view.R;
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
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class OverviewAccounts$Overview$$serializer implements aeu2<OverviewAccounts.Overview> {
    public static final OverviewAccounts$Overview$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 15 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return serialDescriptor;
    }

    static {
        OverviewAccounts$Overview$$serializer overviewAccounts$Overview$$serializer = new OverviewAccounts$Overview$$serializer();
        INSTANCE = overviewAccounts$Overview$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.overview.OverviewAccounts.Overview", overviewAccounts$Overview$$serializer, 17);
        setanimationsloop.onWarmupCompleted("accountSeq", true);
        setanimationsloop.onWarmupCompleted("evaluatedAmount", true);
        setanimationsloop.onWarmupCompleted("profitLossAmount", true);
        setanimationsloop.onWarmupCompleted("profitLossRate", true);
        setanimationsloop.onWarmupCompleted("principalAmount", true);
        setanimationsloop.onWarmupCompleted("logoImageUrls", true);
        setanimationsloop.onWarmupCompleted("itemsCount", true);
        setanimationsloop.onWarmupCompleted("totalCommission", true);
        setanimationsloop.onWarmupCompleted("totalTax", true);
        setanimationsloop.onWarmupCompleted("products", true);
        setanimationsloop.onWarmupCompleted("hiddenStock", true);
        setanimationsloop.onWarmupCompleted("pollIntervalMillis", true);
        setanimationsloop.onWarmupCompleted("sortingRule", true);
        setanimationsloop.onWarmupCompleted("evaluatedAmountAfterFees", true);
        setanimationsloop.onWarmupCompleted("profitLossAmountAfterFees", true);
        setanimationsloop.onWarmupCompleted("profitLossRateAfterFees", true);
        setanimationsloop.onWarmupCompleted("hasKrStock", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 93;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private OverviewAccounts$Overview$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = OverviewAccounts.Overview.onExtraCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout);
        OverviewPrice$$serializer overviewPrice$$serializer = OverviewPrice$$serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(overviewPrice$$serializer);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(overviewPrice$$serializer);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(overviewPrice$$serializer);
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(overviewPrice$$serializer);
        KSerializer<?> kSerializerIAuthTabCallback6 = sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[5].getValue());
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, kSerializerIAuthTabCallback5, kSerializerIAuthTabCallback6, sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[9].getValue()), sp.IAuthTabCallback(OverviewAccounts$Overview$HiddenStock$$serializer.INSTANCE), sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(OverviewRate$$serializer.INSTANCE), getBgColor.IAuthTabCallback};
        int i4 = onExtraCallback + 45;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewAccounts.Overview deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        OverviewPrice overviewPrice;
        OverviewPrice overviewPrice2;
        Integer num;
        boolean zOnExtraCallbackWithResult;
        OverviewAccounts.Overview.HiddenStock hiddenStock;
        String str;
        OverviewPrice overviewPrice3;
        OverviewPrice overviewPrice4;
        String str2;
        int i;
        OverviewRate overviewRate;
        List list;
        OverviewPrice overviewPrice5;
        Integer num2;
        OverviewPrice overviewPrice6;
        OverviewPrice overviewPrice7;
        List list2;
        OverviewPrice overviewPrice8;
        OverviewPrice overviewPrice9;
        boolean zOnExtraCallbackWithResult2;
        OverviewAccounts.Overview.HiddenStock hiddenStock2;
        Integer num3;
        OverviewPrice overviewPrice10;
        OverviewPrice overviewPrice11;
        List list3;
        OverviewPrice overviewPrice12;
        Lazy[] lazyArr;
        OverviewPrice overviewPrice13;
        OverviewPrice overviewPrice14;
        OverviewPrice overviewPrice15;
        OverviewPrice overviewPrice16;
        Integer num4;
        int i2;
        boolean z;
        OverviewAccounts.Overview.HiddenStock hiddenStock3;
        OverviewPrice overviewPrice17;
        Integer num5;
        OverviewPrice overviewPrice18;
        List list4;
        OverviewPrice overviewPrice19;
        OverviewAccounts.Overview.HiddenStock hiddenStock4;
        OverviewPrice overviewPrice20;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = OverviewAccounts.Overview.onExtraCallback();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onExtraCallbackWithResult + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            OverviewPrice$$serializer overviewPrice$$serializer = OverviewPrice$$serializer.INSTANCE;
            OverviewPrice overviewPrice21 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice22 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice23 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice24 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, overviewPrice$$serializer, (Object) null);
            List list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnExtraCallback[5].getValue(), (Object) null);
            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
            Integer num6 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getdynamicheight, (Object) null);
            OverviewPrice overviewPrice25 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice26 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, overviewPrice$$serializer, (Object) null);
            List list6 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, (jp) lazyArrOnExtraCallback[9].getValue(), (Object) null);
            OverviewAccounts.Overview.HiddenStock hiddenStock5 = (OverviewAccounts.Overview.HiddenStock) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, OverviewAccounts$Overview$HiddenStock$$serializer.INSTANCE, (Object) null);
            Integer num7 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, getdynamicheight, (Object) null);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, (Object) null);
            OverviewPrice overviewPrice27 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice28 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, overviewPrice$$serializer, (Object) null);
            overviewRate = (OverviewRate) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, OverviewRate$$serializer.INSTANCE, (Object) null);
            list2 = list6;
            str2 = str4;
            list = list5;
            num2 = num7;
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16);
            overviewPrice5 = overviewPrice21;
            overviewPrice3 = overviewPrice27;
            i = 131071;
            overviewPrice7 = overviewPrice25;
            num = num6;
            overviewPrice2 = overviewPrice23;
            overviewPrice8 = overviewPrice26;
            overviewPrice = overviewPrice24;
            overviewPrice4 = overviewPrice28;
            hiddenStock = hiddenStock5;
            overviewPrice6 = overviewPrice22;
            str = str3;
        } else {
            int i6 = 0;
            OverviewPrice overviewPrice29 = null;
            Integer num8 = null;
            String str5 = null;
            OverviewPrice overviewPrice30 = null;
            OverviewPrice overviewPrice31 = null;
            String str6 = null;
            OverviewRate overviewRate2 = null;
            List list7 = null;
            OverviewPrice overviewPrice32 = null;
            Integer num9 = null;
            OverviewPrice overviewPrice33 = null;
            OverviewPrice overviewPrice34 = null;
            List list8 = null;
            OverviewPrice overviewPrice35 = null;
            boolean z2 = true;
            OverviewPrice overviewPrice36 = null;
            OverviewAccounts.Overview.HiddenStock hiddenStock6 = null;
            boolean z3 = false;
            while (!(!z2)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        overviewPrice9 = overviewPrice36;
                        zOnExtraCallbackWithResult2 = z3;
                        hiddenStock2 = hiddenStock6;
                        num3 = num9;
                        overviewPrice10 = overviewPrice33;
                        overviewPrice11 = overviewPrice34;
                        list3 = list8;
                        overviewPrice12 = overviewPrice35;
                        lazyArr = lazyArrOnExtraCallback;
                        overviewPrice13 = overviewPrice32;
                        z2 = false;
                        overviewPrice35 = overviewPrice12;
                        overviewPrice32 = overviewPrice13;
                        overviewPrice34 = overviewPrice11;
                        num9 = num3;
                        overviewPrice36 = overviewPrice9;
                        list8 = list3;
                        lazyArrOnExtraCallback = lazyArr;
                        z3 = zOnExtraCallbackWithResult2;
                        overviewPrice33 = overviewPrice10;
                        hiddenStock6 = hiddenStock2;
                    case 0:
                        overviewPrice14 = overviewPrice36;
                        zOnExtraCallbackWithResult2 = z3;
                        hiddenStock2 = hiddenStock6;
                        overviewPrice15 = overviewPrice30;
                        overviewPrice10 = overviewPrice33;
                        lazyArr = lazyArrOnExtraCallback;
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str5);
                        i6 |= 1;
                        overviewPrice30 = overviewPrice15;
                        overviewPrice36 = overviewPrice14;
                        lazyArrOnExtraCallback = lazyArr;
                        z3 = zOnExtraCallbackWithResult2;
                        overviewPrice33 = overviewPrice10;
                        hiddenStock6 = hiddenStock2;
                    case 1:
                        zOnExtraCallbackWithResult2 = z3;
                        hiddenStock2 = hiddenStock6;
                        overviewPrice15 = overviewPrice30;
                        overviewPrice10 = overviewPrice33;
                        lazyArr = lazyArrOnExtraCallback;
                        overviewPrice14 = overviewPrice36;
                        overviewPrice32 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, OverviewPrice$$serializer.INSTANCE, overviewPrice32);
                        i6 |= 2;
                        overviewPrice30 = overviewPrice15;
                        overviewPrice36 = overviewPrice14;
                        lazyArrOnExtraCallback = lazyArr;
                        z3 = zOnExtraCallbackWithResult2;
                        overviewPrice33 = overviewPrice10;
                        hiddenStock6 = hiddenStock2;
                    case 2:
                        hiddenStock2 = hiddenStock6;
                        overviewPrice10 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, OverviewPrice$$serializer.INSTANCE, overviewPrice33);
                        i6 |= 4;
                        overviewPrice30 = overviewPrice30;
                        lazyArrOnExtraCallback = lazyArrOnExtraCallback;
                        z3 = z3;
                        overviewPrice33 = overviewPrice10;
                        hiddenStock6 = hiddenStock2;
                    case 3:
                        z = z3;
                        hiddenStock3 = hiddenStock6;
                        overviewPrice17 = overviewPrice30;
                        num5 = num9;
                        overviewPrice18 = overviewPrice34;
                        list4 = list8;
                        overviewPrice19 = overviewPrice35;
                        overviewPrice29 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, OverviewPrice$$serializer.INSTANCE, overviewPrice29);
                        i6 |= 8;
                        overviewPrice35 = overviewPrice19;
                        overviewPrice34 = overviewPrice18;
                        overviewPrice30 = overviewPrice17;
                        num9 = num5;
                        hiddenStock6 = hiddenStock3;
                        list8 = list4;
                        z3 = z;
                    case 4:
                        z = z3;
                        hiddenStock4 = hiddenStock6;
                        overviewPrice20 = overviewPrice30;
                        overviewPrice36 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, OverviewPrice$$serializer.INSTANCE, overviewPrice36);
                        i6 |= 16;
                        overviewPrice30 = overviewPrice20;
                        hiddenStock6 = hiddenStock4;
                        z3 = z;
                    case 5:
                        z = z3;
                        hiddenStock4 = hiddenStock6;
                        overviewPrice20 = overviewPrice30;
                        list7 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnExtraCallback[5].getValue(), list7);
                        i6 |= 32;
                        overviewPrice30 = overviewPrice20;
                        hiddenStock6 = hiddenStock4;
                        z3 = z;
                    case 6:
                        z = z3;
                        hiddenStock3 = hiddenStock6;
                        overviewPrice17 = overviewPrice30;
                        num5 = num9;
                        overviewPrice18 = overviewPrice34;
                        list4 = list8;
                        overviewPrice19 = overviewPrice35;
                        num8 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getDynamicHeight.onWarmupCompleted, num8);
                        i6 |= 64;
                        int i7 = onExtraCallbackWithResult + 1;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        overviewPrice35 = overviewPrice19;
                        overviewPrice34 = overviewPrice18;
                        overviewPrice30 = overviewPrice17;
                        num9 = num5;
                        hiddenStock6 = hiddenStock3;
                        list8 = list4;
                        z3 = z;
                    case 7:
                        z = z3;
                        overviewPrice20 = overviewPrice30;
                        hiddenStock4 = hiddenStock6;
                        overviewPrice34 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, OverviewPrice$$serializer.INSTANCE, overviewPrice34);
                        i6 |= 128;
                        overviewPrice30 = overviewPrice20;
                        hiddenStock6 = hiddenStock4;
                        z3 = z;
                    case 8:
                        z = z3;
                        list4 = list8;
                        overviewPrice35 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, OverviewPrice$$serializer.INSTANCE, overviewPrice35);
                        i6 |= 256;
                        overviewPrice30 = overviewPrice30;
                        list8 = list4;
                        z3 = z;
                    case 9:
                        z = z3;
                        list8 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, (jp) lazyArrOnExtraCallback[9].getValue(), list8);
                        i6 |= 512;
                        overviewPrice30 = overviewPrice30;
                        num9 = num9;
                        z3 = z;
                    case 10:
                        zOnExtraCallbackWithResult2 = z3;
                        overviewPrice16 = overviewPrice30;
                        num4 = num9;
                        hiddenStock6 = (OverviewAccounts.Overview.HiddenStock) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, OverviewAccounts$Overview$HiddenStock$$serializer.INSTANCE, hiddenStock6);
                        i6 |= 1024;
                        overviewPrice9 = overviewPrice36;
                        num3 = num4;
                        hiddenStock2 = hiddenStock6;
                        overviewPrice30 = overviewPrice16;
                        overviewPrice10 = overviewPrice33;
                        overviewPrice11 = overviewPrice34;
                        list3 = list8;
                        overviewPrice12 = overviewPrice35;
                        lazyArr = lazyArrOnExtraCallback;
                        overviewPrice13 = overviewPrice32;
                        overviewPrice35 = overviewPrice12;
                        overviewPrice32 = overviewPrice13;
                        overviewPrice34 = overviewPrice11;
                        num9 = num3;
                        overviewPrice36 = overviewPrice9;
                        list8 = list3;
                        lazyArrOnExtraCallback = lazyArr;
                        z3 = zOnExtraCallbackWithResult2;
                        overviewPrice33 = overviewPrice10;
                        hiddenStock6 = hiddenStock2;
                    case 11:
                        zOnExtraCallbackWithResult2 = z3;
                        overviewPrice16 = overviewPrice30;
                        num9 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, getDynamicHeight.onWarmupCompleted, num9);
                        i6 |= 2048;
                        num4 = num9;
                        overviewPrice9 = overviewPrice36;
                        num3 = num4;
                        hiddenStock2 = hiddenStock6;
                        overviewPrice30 = overviewPrice16;
                        overviewPrice10 = overviewPrice33;
                        overviewPrice11 = overviewPrice34;
                        list3 = list8;
                        overviewPrice12 = overviewPrice35;
                        lazyArr = lazyArrOnExtraCallback;
                        overviewPrice13 = overviewPrice32;
                        overviewPrice35 = overviewPrice12;
                        overviewPrice32 = overviewPrice13;
                        overviewPrice34 = overviewPrice11;
                        num9 = num3;
                        overviewPrice36 = overviewPrice9;
                        list8 = list3;
                        lazyArrOnExtraCallback = lazyArr;
                        z3 = zOnExtraCallbackWithResult2;
                        overviewPrice33 = overviewPrice10;
                        hiddenStock6 = hiddenStock2;
                    case 12:
                        zOnExtraCallbackWithResult2 = z3;
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, str6);
                        i2 = i6 | 4096;
                        i6 = i2;
                        overviewPrice16 = overviewPrice30;
                        num4 = num9;
                        overviewPrice9 = overviewPrice36;
                        num3 = num4;
                        hiddenStock2 = hiddenStock6;
                        overviewPrice30 = overviewPrice16;
                        overviewPrice10 = overviewPrice33;
                        overviewPrice11 = overviewPrice34;
                        list3 = list8;
                        overviewPrice12 = overviewPrice35;
                        lazyArr = lazyArrOnExtraCallback;
                        overviewPrice13 = overviewPrice32;
                        overviewPrice35 = overviewPrice12;
                        overviewPrice32 = overviewPrice13;
                        overviewPrice34 = overviewPrice11;
                        num9 = num3;
                        overviewPrice36 = overviewPrice9;
                        list8 = list3;
                        lazyArrOnExtraCallback = lazyArr;
                        z3 = zOnExtraCallbackWithResult2;
                        overviewPrice33 = overviewPrice10;
                        hiddenStock6 = hiddenStock2;
                    case 13:
                        zOnExtraCallbackWithResult2 = z3;
                        overviewPrice30 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, OverviewPrice$$serializer.INSTANCE, overviewPrice30);
                        i2 = i6 | 8192;
                        i6 = i2;
                        overviewPrice16 = overviewPrice30;
                        num4 = num9;
                        overviewPrice9 = overviewPrice36;
                        num3 = num4;
                        hiddenStock2 = hiddenStock6;
                        overviewPrice30 = overviewPrice16;
                        overviewPrice10 = overviewPrice33;
                        overviewPrice11 = overviewPrice34;
                        list3 = list8;
                        overviewPrice12 = overviewPrice35;
                        lazyArr = lazyArrOnExtraCallback;
                        overviewPrice13 = overviewPrice32;
                        overviewPrice35 = overviewPrice12;
                        overviewPrice32 = overviewPrice13;
                        overviewPrice34 = overviewPrice11;
                        num9 = num3;
                        overviewPrice36 = overviewPrice9;
                        list8 = list3;
                        lazyArrOnExtraCallback = lazyArr;
                        z3 = zOnExtraCallbackWithResult2;
                        overviewPrice33 = overviewPrice10;
                        hiddenStock6 = hiddenStock2;
                    case 14:
                        zOnExtraCallbackWithResult2 = z3;
                        overviewPrice31 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, OverviewPrice$$serializer.INSTANCE, overviewPrice31);
                        i2 = i6 | 16384;
                        i6 = i2;
                        overviewPrice16 = overviewPrice30;
                        num4 = num9;
                        overviewPrice9 = overviewPrice36;
                        num3 = num4;
                        hiddenStock2 = hiddenStock6;
                        overviewPrice30 = overviewPrice16;
                        overviewPrice10 = overviewPrice33;
                        overviewPrice11 = overviewPrice34;
                        list3 = list8;
                        overviewPrice12 = overviewPrice35;
                        lazyArr = lazyArrOnExtraCallback;
                        overviewPrice13 = overviewPrice32;
                        overviewPrice35 = overviewPrice12;
                        overviewPrice32 = overviewPrice13;
                        overviewPrice34 = overviewPrice11;
                        num9 = num3;
                        overviewPrice36 = overviewPrice9;
                        list8 = list3;
                        lazyArrOnExtraCallback = lazyArr;
                        z3 = zOnExtraCallbackWithResult2;
                        overviewPrice33 = overviewPrice10;
                        hiddenStock6 = hiddenStock2;
                    case 15:
                        zOnExtraCallbackWithResult2 = z3;
                        OverviewRate overviewRate3 = (OverviewRate) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, OverviewRate$$serializer.INSTANCE, overviewRate2);
                        i6 |= 32768;
                        int i9 = onExtraCallbackWithResult + 117;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 5 % 3;
                        }
                        overviewRate2 = overviewRate3;
                        overviewPrice16 = overviewPrice30;
                        num4 = num9;
                        overviewPrice9 = overviewPrice36;
                        num3 = num4;
                        hiddenStock2 = hiddenStock6;
                        overviewPrice30 = overviewPrice16;
                        overviewPrice10 = overviewPrice33;
                        overviewPrice11 = overviewPrice34;
                        list3 = list8;
                        overviewPrice12 = overviewPrice35;
                        lazyArr = lazyArrOnExtraCallback;
                        overviewPrice13 = overviewPrice32;
                        overviewPrice35 = overviewPrice12;
                        overviewPrice32 = overviewPrice13;
                        overviewPrice34 = overviewPrice11;
                        num9 = num3;
                        overviewPrice36 = overviewPrice9;
                        list8 = list3;
                        lazyArrOnExtraCallback = lazyArr;
                        z3 = zOnExtraCallbackWithResult2;
                        overviewPrice33 = overviewPrice10;
                        hiddenStock6 = hiddenStock2;
                    case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                        i6 |= 65536;
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16);
                        overviewPrice9 = overviewPrice36;
                        hiddenStock2 = hiddenStock6;
                        num3 = num9;
                        overviewPrice10 = overviewPrice33;
                        overviewPrice11 = overviewPrice34;
                        list3 = list8;
                        overviewPrice12 = overviewPrice35;
                        lazyArr = lazyArrOnExtraCallback;
                        overviewPrice13 = overviewPrice32;
                        overviewPrice35 = overviewPrice12;
                        overviewPrice32 = overviewPrice13;
                        overviewPrice34 = overviewPrice11;
                        num9 = num3;
                        overviewPrice36 = overviewPrice9;
                        list8 = list3;
                        lazyArrOnExtraCallback = lazyArr;
                        z3 = zOnExtraCallbackWithResult2;
                        overviewPrice33 = overviewPrice10;
                        hiddenStock6 = hiddenStock2;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            overviewPrice = overviewPrice36;
            overviewPrice2 = overviewPrice29;
            num = num8;
            zOnExtraCallbackWithResult = z3;
            hiddenStock = hiddenStock6;
            str = str5;
            overviewPrice3 = overviewPrice30;
            overviewPrice4 = overviewPrice31;
            str2 = str6;
            i = i6;
            overviewRate = overviewRate2;
            list = list7;
            overviewPrice5 = overviewPrice32;
            num2 = num9;
            overviewPrice6 = overviewPrice33;
            overviewPrice7 = overviewPrice34;
            list2 = list8;
            overviewPrice8 = overviewPrice35;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewAccounts.Overview(i, str, overviewPrice5, overviewPrice6, overviewPrice2, overviewPrice, list, num, overviewPrice7, overviewPrice8, list2, hiddenStock, num2, str2, overviewPrice3, overviewPrice4, overviewRate, zOnExtraCallbackWithResult, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m42deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        OverviewAccounts.Overview overviewDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return overviewDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewAccounts.Overview overview) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(overview, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            OverviewAccounts.Overview.onExtraCallbackWithResult(overview, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(overview, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        OverviewAccounts.Overview.onExtraCallbackWithResult(overview, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewAccounts.Overview) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 39;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

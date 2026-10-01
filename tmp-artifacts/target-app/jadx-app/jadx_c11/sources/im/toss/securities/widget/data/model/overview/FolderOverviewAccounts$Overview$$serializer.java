package im.toss.securities.widget.data.model.overview;

import im.toss.securities.widget.data.model.overview.FolderOverviewAccounts;
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
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class FolderOverviewAccounts$Overview$$serializer implements aeu2<FolderOverviewAccounts.Overview> {
    public static final FolderOverviewAccounts$Overview$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return serialDescriptor;
    }

    static {
        FolderOverviewAccounts$Overview$$serializer folderOverviewAccounts$Overview$$serializer = new FolderOverviewAccounts$Overview$$serializer();
        INSTANCE = folderOverviewAccounts$Overview$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Overview", folderOverviewAccounts$Overview$$serializer, 17);
        setanimationsloop.onWarmupCompleted("accountSeq", true);
        setanimationsloop.onWarmupCompleted("evaluatedAmount", true);
        setanimationsloop.onWarmupCompleted("evaluatedAmountAfterFees", true);
        setanimationsloop.onWarmupCompleted("profitLossAmount", true);
        setanimationsloop.onWarmupCompleted("profitLossAmountAfterFees", true);
        setanimationsloop.onWarmupCompleted("profitLossRate", true);
        setanimationsloop.onWarmupCompleted("profitLossRateAfterFees", true);
        setanimationsloop.onWarmupCompleted("principalAmount", true);
        setanimationsloop.onWarmupCompleted("logoImageUrls", true);
        setanimationsloop.onWarmupCompleted("itemsCount", true);
        setanimationsloop.onWarmupCompleted("totalCommission", true);
        setanimationsloop.onWarmupCompleted("totalTax", true);
        setanimationsloop.onWarmupCompleted("hasKr", true);
        setanimationsloop.onWarmupCompleted("folders", true);
        setanimationsloop.onWarmupCompleted("hiddenStock", true);
        setanimationsloop.onWarmupCompleted("pollIntervalMillis", true);
        setanimationsloop.onWarmupCompleted("sortingRule", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 43;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 72 / 0;
        }
    }

    private FolderOverviewAccounts$Overview$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = FolderOverviewAccounts.Overview.onExtraCallbackWithResult();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        OverviewPrice$$serializer overviewPrice$$serializer = OverviewPrice$$serializer.INSTANCE;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(OverviewRate$$serializer.INSTANCE), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallbackWithResult[8].getValue()), sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(getBgColor.IAuthTabCallback), lazyArrOnExtraCallbackWithResult[13].getValue(), sp.IAuthTabCallback(OverviewAccounts$Overview$HiddenStock$$serializer.INSTANCE), sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onExtraCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final FolderOverviewAccounts.Overview deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        int i;
        OverviewPrice overviewPrice;
        OverviewPrice overviewPrice2;
        OverviewPrice overviewPrice3;
        OverviewPrice overviewPrice4;
        Boolean bool;
        Integer num;
        List list;
        OverviewAccounts.Overview.HiddenStock hiddenStock;
        String str2;
        OverviewPrice overviewPrice5;
        OverviewPrice overviewPrice6;
        OverviewRate overviewRate;
        List list2;
        OverviewPrice overviewPrice7;
        OverviewPrice overviewPrice8;
        Integer num2;
        String str3;
        int i2;
        OverviewPrice overviewPrice9;
        OverviewPrice overviewPrice10;
        OverviewRate overviewRate2;
        List list3;
        int i3 = 2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = FolderOverviewAccounts.Overview.onExtraCallbackWithResult();
        int i5 = 15;
        int i6 = 14;
        int i7 = 16;
        OverviewPrice overviewPrice11 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            OverviewPrice overviewPrice12 = null;
            String str4 = null;
            Integer num3 = null;
            List list4 = null;
            OverviewAccounts.Overview.HiddenStock hiddenStock2 = null;
            String str5 = null;
            OverviewPrice overviewPrice13 = null;
            OverviewPrice overviewPrice14 = null;
            OverviewRate overviewRate3 = null;
            List list5 = null;
            OverviewPrice overviewPrice15 = null;
            OverviewPrice overviewPrice16 = null;
            Integer num4 = null;
            OverviewPrice overviewPrice17 = null;
            OverviewPrice overviewPrice18 = null;
            Boolean bool2 = null;
            int i8 = 0;
            boolean z = true;
            while (z) {
                int i9 = onExtraCallback + 7;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % i3;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        overviewPrice9 = overviewPrice13;
                        overviewPrice10 = overviewPrice14;
                        overviewRate2 = overviewRate3;
                        list3 = list5;
                        z = false;
                        overviewPrice12 = overviewPrice12;
                        i6 = 14;
                        i7 = 16;
                        overviewPrice13 = overviewPrice9;
                        list5 = list3;
                        overviewRate3 = overviewRate2;
                        overviewPrice14 = overviewPrice10;
                        i5 = 15;
                    case 0:
                        overviewPrice10 = overviewPrice14;
                        overviewRate2 = overviewRate3;
                        list3 = list5;
                        overviewPrice9 = overviewPrice13;
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str5);
                        i8 |= 1;
                        overviewPrice12 = overviewPrice12;
                        i3 = 2;
                        i6 = 14;
                        i7 = 16;
                        overviewPrice13 = overviewPrice9;
                        list5 = list3;
                        overviewRate3 = overviewRate2;
                        overviewPrice14 = overviewPrice10;
                        i5 = 15;
                    case 1:
                        overviewPrice10 = overviewPrice14;
                        overviewRate2 = overviewRate3;
                        i8 |= 2;
                        overviewPrice16 = overviewPrice16;
                        overviewPrice12 = overviewPrice12;
                        i6 = 14;
                        i7 = 16;
                        overviewPrice13 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, OverviewPrice$$serializer.INSTANCE, overviewPrice13);
                        list5 = list5;
                        i3 = 2;
                        overviewRate3 = overviewRate2;
                        overviewPrice14 = overviewPrice10;
                        i5 = 15;
                    case 2:
                        overviewPrice10 = overviewPrice14;
                        overviewRate2 = overviewRate3;
                        list3 = list5;
                        OverviewPrice overviewPrice19 = overviewPrice12;
                        int i11 = i3;
                        overviewPrice16 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i11, OverviewPrice$$serializer.INSTANCE, overviewPrice16);
                        i8 |= 4;
                        int i12 = onExtraCallbackWithResult + 91;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % i11;
                        num4 = num4;
                        bool2 = bool2;
                        overviewPrice18 = overviewPrice18;
                        overviewPrice12 = overviewPrice19;
                        overviewPrice17 = overviewPrice17;
                        i3 = 2;
                        i6 = 14;
                        i7 = 16;
                        list5 = list3;
                        overviewRate3 = overviewRate2;
                        overviewPrice14 = overviewPrice10;
                        i5 = 15;
                    case 3:
                        overviewPrice10 = overviewPrice14;
                        overviewRate2 = overviewRate3;
                        list3 = list5;
                        overviewPrice15 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, OverviewPrice$$serializer.INSTANCE, overviewPrice15);
                        i8 |= 8;
                        int i14 = onExtraCallback + 95;
                        onExtraCallbackWithResult = i14 % 128;
                        int i15 = i14 % 2;
                        i3 = 2;
                        num4 = num4;
                        bool2 = bool2;
                        overviewPrice18 = overviewPrice18;
                        overviewPrice12 = overviewPrice12;
                        overviewPrice17 = overviewPrice17;
                        i6 = 14;
                        i7 = 16;
                        list5 = list3;
                        overviewRate3 = overviewRate2;
                        overviewPrice14 = overviewPrice10;
                        i5 = 15;
                    case 4:
                        overviewPrice10 = overviewPrice14;
                        overviewRate2 = overviewRate3;
                        overviewPrice12 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, OverviewPrice$$serializer.INSTANCE, overviewPrice12);
                        i8 |= 16;
                        i3 = 2;
                        i6 = 14;
                        i7 = 16;
                        overviewRate3 = overviewRate2;
                        overviewPrice14 = overviewPrice10;
                        i5 = 15;
                    case 5:
                        i8 |= 32;
                        i5 = 15;
                        i6 = 14;
                        i7 = 16;
                        overviewRate3 = overviewRate3;
                        overviewPrice14 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, OverviewPrice$$serializer.INSTANCE, overviewPrice14);
                        i3 = 2;
                    case 6:
                        i8 |= 64;
                        list5 = list5;
                        i5 = 15;
                        i6 = 14;
                        i7 = 16;
                        overviewRate3 = (OverviewRate) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, OverviewRate$$serializer.INSTANCE, overviewRate3);
                        i3 = 2;
                    case 7:
                        overviewPrice11 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, OverviewPrice$$serializer.INSTANCE, overviewPrice11);
                        i8 |= 128;
                        i3 = 2;
                        i5 = 15;
                        i6 = 14;
                        i7 = 16;
                    case 8:
                        list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, (jp) lazyArrOnExtraCallbackWithResult[8].getValue(), list5);
                        i8 |= 256;
                        overviewPrice17 = overviewPrice17;
                        i3 = 2;
                        i5 = 15;
                        i6 = 14;
                        i7 = 16;
                    case 9:
                        i8 |= 512;
                        num4 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getDynamicHeight.onWarmupCompleted, num4);
                        i3 = 2;
                        i5 = 15;
                        i6 = 14;
                        i7 = 16;
                    case 10:
                        i8 |= 1024;
                        overviewPrice17 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, OverviewPrice$$serializer.INSTANCE, overviewPrice17);
                        i5 = 15;
                        i6 = 14;
                        i7 = 16;
                    case 11:
                        i8 |= 2048;
                        overviewPrice18 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, OverviewPrice$$serializer.INSTANCE, overviewPrice18);
                        i5 = 15;
                        i7 = 16;
                    case 12:
                        i8 |= 4096;
                        bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getBgColor.IAuthTabCallback, bool2);
                        i7 = 16;
                    case 13:
                        list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 13, (jp) lazyArrOnExtraCallbackWithResult[13].getValue(), list4);
                        i8 |= 8192;
                    case 14:
                        hiddenStock2 = (OverviewAccounts.Overview.HiddenStock) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, OverviewAccounts$Overview$HiddenStock$$serializer.INSTANCE, hiddenStock2);
                        i8 |= 16384;
                    case 15:
                        num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getDynamicHeight.onWarmupCompleted, num3);
                        str3 = str4;
                        i2 = 32768;
                        i8 |= i2;
                        str4 = str3;
                    case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i7, getWriggleLayout.onNavigationEvent, str4);
                        i2 = 65536;
                        i8 |= i2;
                        str4 = str3;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            OverviewPrice overviewPrice20 = overviewPrice14;
            OverviewRate overviewRate4 = overviewRate3;
            OverviewPrice overviewPrice21 = overviewPrice18;
            Boolean bool3 = bool2;
            str2 = str5;
            num2 = num4;
            i = i8;
            str = str4;
            num = num3;
            list = list4;
            overviewPrice3 = overviewPrice11;
            hiddenStock = hiddenStock2;
            bool = bool3;
            overviewPrice = overviewPrice21;
            overviewPrice5 = overviewPrice13;
            overviewPrice8 = overviewPrice16;
            overviewRate = overviewRate4;
            list2 = list5;
            overviewPrice2 = overviewPrice12;
            overviewPrice7 = overviewPrice15;
            overviewPrice4 = overviewPrice17;
            overviewPrice6 = overviewPrice20;
        } else {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            OverviewPrice$$serializer overviewPrice$$serializer = OverviewPrice$$serializer.INSTANCE;
            OverviewPrice overviewPrice22 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice23 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice24 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice25 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice26 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, overviewPrice$$serializer, (Object) null);
            OverviewRate overviewRate5 = (OverviewRate) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, OverviewRate$$serializer.INSTANCE, (Object) null);
            OverviewPrice overviewPrice27 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, overviewPrice$$serializer, (Object) null);
            List list6 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, (jp) lazyArrOnExtraCallbackWithResult[8].getValue(), (Object) null);
            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
            Integer num5 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getdynamicheight, (Object) null);
            OverviewPrice overviewPrice28 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice29 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, overviewPrice$$serializer, (Object) null);
            Boolean bool4 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getBgColor.IAuthTabCallback, (Object) null);
            List list7 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 13, (jp) lazyArrOnExtraCallbackWithResult[13].getValue(), (Object) null);
            OverviewAccounts.Overview.HiddenStock hiddenStock3 = (OverviewAccounts.Overview.HiddenStock) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, OverviewAccounts$Overview$HiddenStock$$serializer.INSTANCE, (Object) null);
            Integer num6 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, getdynamicheight, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, getwrigglelayout, (Object) null);
            i = 131071;
            overviewPrice = overviewPrice29;
            overviewPrice2 = overviewPrice25;
            overviewPrice3 = overviewPrice27;
            overviewPrice4 = overviewPrice28;
            bool = bool4;
            num = num6;
            list = list7;
            hiddenStock = hiddenStock3;
            str2 = str6;
            overviewPrice5 = overviewPrice22;
            overviewPrice6 = overviewPrice26;
            overviewRate = overviewRate5;
            list2 = list6;
            overviewPrice7 = overviewPrice24;
            overviewPrice8 = overviewPrice23;
            num2 = num5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new FolderOverviewAccounts.Overview(i, str2, overviewPrice5, overviewPrice8, overviewPrice7, overviewPrice2, overviewPrice6, overviewRate, overviewPrice3, list2, num2, overviewPrice4, overviewPrice, bool, list, hiddenStock, num, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        FolderOverviewAccounts.Overview overviewDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return overviewDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull FolderOverviewAccounts.Overview overview) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(overview, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        FolderOverviewAccounts.Overview.onNavigationEvent(overview, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (FolderOverviewAccounts.Overview) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

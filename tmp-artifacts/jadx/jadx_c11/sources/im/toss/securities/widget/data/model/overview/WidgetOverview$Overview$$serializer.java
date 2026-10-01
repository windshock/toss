package im.toss.securities.widget.data.model.overview;

import im.toss.securities.widget.data.model.overview.WidgetOverview;
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
public final /* synthetic */ class WidgetOverview$Overview$$serializer implements aeu2<WidgetOverview.Overview> {
    private static int IAuthTabCallback = 0;
    public static final WidgetOverview$Overview$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 105;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        WidgetOverview$Overview$$serializer widgetOverview$Overview$$serializer = new WidgetOverview$Overview$$serializer();
        INSTANCE = widgetOverview$Overview$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.overview.WidgetOverview.Overview", widgetOverview$Overview$$serializer, 10);
        setanimationsloop.onWarmupCompleted("evaluatedAmount", true);
        setanimationsloop.onWarmupCompleted("profitLossAmount", true);
        setanimationsloop.onWarmupCompleted("profitLossRate", true);
        setanimationsloop.onWarmupCompleted("evaluatedAmountTxt", true);
        setanimationsloop.onWarmupCompleted("profitLossAmountRateTxt", true);
        setanimationsloop.onWarmupCompleted("profitChangeType", true);
        setanimationsloop.onWarmupCompleted("itemsCount", true);
        setanimationsloop.onWarmupCompleted("logoImageUrls", true);
        setanimationsloop.onWarmupCompleted("totalCommission", true);
        setanimationsloop.onWarmupCompleted("totalTax", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 15 / 0;
        }
    }

    private WidgetOverview$Overview$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = WidgetOverview.Overview.onWarmupCompleted();
        OverviewPrice$$serializer overviewPrice$$serializer = OverviewPrice$$serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(overviewPrice$$serializer);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(overviewPrice$$serializer);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(overviewPrice$$serializer);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[5].getValue()), sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[7].getValue()), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer)};
        int i4 = onNavigationEvent + 79;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final WidgetOverview.Overview deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        OverviewPrice overviewPrice;
        OverviewPrice overviewPrice2;
        OverviewPrice overviewPrice3;
        List list;
        String str;
        String str2;
        checkDuration checkduration;
        Integer num;
        OverviewPrice overviewPrice4;
        OverviewPrice overviewPrice5;
        int i;
        char c;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = WidgetOverview.Overview.onWarmupCompleted();
        int i4 = 9;
        int i5 = 8;
        int i6 = 7;
        List list2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            OverviewPrice$$serializer overviewPrice$$serializer = OverviewPrice$$serializer.INSTANCE;
            OverviewPrice overviewPrice6 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice7 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice8 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, overviewPrice$$serializer, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            checkDuration checkduration2 = (checkDuration) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnWarmupCompleted[5].getValue(), (Object) null);
            Integer num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getDynamicHeight.onWarmupCompleted, (Object) null);
            List list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnWarmupCompleted[7].getValue(), (Object) null);
            OverviewPrice overviewPrice9 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, overviewPrice$$serializer, (Object) null);
            list = list3;
            overviewPrice3 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, overviewPrice$$serializer, (Object) null);
            num = num2;
            overviewPrice = overviewPrice9;
            checkduration = checkduration2;
            overviewPrice5 = overviewPrice7;
            overviewPrice2 = overviewPrice8;
            i = 1023;
            str2 = str4;
            overviewPrice4 = overviewPrice6;
            str = str3;
        } else {
            int i7 = IAuthTabCallback + 89;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            boolean z = true;
            OverviewPrice overviewPrice10 = null;
            Integer num3 = null;
            OverviewPrice overviewPrice11 = null;
            OverviewPrice overviewPrice12 = null;
            String str5 = null;
            OverviewPrice overviewPrice13 = null;
            checkDuration checkduration3 = null;
            String str6 = null;
            OverviewPrice overviewPrice14 = null;
            while (z) {
                int i10 = onNavigationEvent + 13;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % i2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i2 = 2;
                        i5 = 8;
                        i6 = 7;
                    case 0:
                        i9 |= 1;
                        overviewPrice14 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, OverviewPrice$$serializer.INSTANCE, overviewPrice14);
                        i2 = 2;
                        i4 = 9;
                        i5 = 8;
                        i6 = 7;
                    case 1:
                        i9 |= 2;
                        overviewPrice13 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, OverviewPrice$$serializer.INSTANCE, overviewPrice13);
                        i2 = 2;
                        i4 = 9;
                        i5 = 8;
                        i6 = 7;
                    case 2:
                        c = 6;
                        overviewPrice11 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, OverviewPrice$$serializer.INSTANCE, overviewPrice11);
                        i9 |= 4;
                        i4 = 9;
                        i5 = 8;
                        i6 = 7;
                    case 3:
                        c = 6;
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str5);
                        i9 |= 8;
                        i4 = 9;
                        i5 = 8;
                        i6 = 7;
                    case 4:
                        c = 6;
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str6);
                        i9 |= 16;
                        i4 = 9;
                        i5 = 8;
                        i6 = 7;
                    case 5:
                        checkduration3 = (checkDuration) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnWarmupCompleted[5].getValue(), checkduration3);
                        i9 |= 32;
                        i4 = 9;
                        i5 = 8;
                    case 6:
                        num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getDynamicHeight.onWarmupCompleted, num3);
                        i9 |= 64;
                    case 7:
                        list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, (jp) lazyArrOnWarmupCompleted[i6].getValue(), list2);
                        i9 |= 128;
                    case 8:
                        overviewPrice10 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, OverviewPrice$$serializer.INSTANCE, overviewPrice10);
                        i9 |= 256;
                    case 9:
                        overviewPrice12 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, OverviewPrice$$serializer.INSTANCE, overviewPrice12);
                        i9 |= 512;
                        int i12 = IAuthTabCallback + 73;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % i2;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            OverviewPrice overviewPrice15 = overviewPrice13;
            overviewPrice = overviewPrice10;
            overviewPrice2 = overviewPrice11;
            overviewPrice3 = overviewPrice12;
            list = list2;
            str = str5;
            str2 = str6;
            checkduration = checkduration3;
            num = num3;
            overviewPrice4 = overviewPrice14;
            overviewPrice5 = overviewPrice15;
            i = i9;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WidgetOverview.Overview(i, overviewPrice4, overviewPrice5, overviewPrice2, str, str2, checkduration, num, list, overviewPrice, overviewPrice3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m54deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        WidgetOverview.Overview overviewDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 7;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return overviewDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WidgetOverview.Overview overview) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(overview, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        WidgetOverview.Overview.onWarmupCompleted(overview, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WidgetOverview.Overview) obj);
        int i4 = IAuthTabCallback + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}

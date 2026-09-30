package im.toss.securities.widget.data.model.overview;

import im.toss.securities.widget.data.model.overview.FolderOverviewAccounts;
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
import o.getWriggleLayout;
import o.jp;
import o.r2ExternalSyntheticLambda4;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class FolderOverviewAccounts$Folder$$serializer implements aeu2<FolderOverviewAccounts.Folder> {
    private static int IAuthTabCallback = 1;
    public static final FolderOverviewAccounts$Folder$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        FolderOverviewAccounts$Folder$$serializer folderOverviewAccounts$Folder$$serializer = new FolderOverviewAccounts$Folder$$serializer();
        INSTANCE = folderOverviewAccounts$Folder$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.Folder", folderOverviewAccounts$Folder$$serializer, 15);
        setanimationsloop.onWarmupCompleted("folderKey", false);
        setanimationsloop.onWarmupCompleted("folderName", false);
        setanimationsloop.onWarmupCompleted("folderType", true);
        setanimationsloop.onWarmupCompleted("isDefault", true);
        setanimationsloop.onWarmupCompleted("detailType", true);
        setanimationsloop.onWarmupCompleted("principalAmount", true);
        setanimationsloop.onWarmupCompleted("evaluatedAmount", true);
        setanimationsloop.onWarmupCompleted("evaluatedAmountAfterFees", true);
        setanimationsloop.onWarmupCompleted("profitLossAmount", true);
        setanimationsloop.onWarmupCompleted("profitLossAmountAfterFees", true);
        setanimationsloop.onWarmupCompleted("dailyProfitLossAmount", true);
        setanimationsloop.onWarmupCompleted("profitLossRate", true);
        setanimationsloop.onWarmupCompleted("profitLossRateAfterFees", true);
        setanimationsloop.onWarmupCompleted("dailyProfitLossRate", true);
        setanimationsloop.onWarmupCompleted("items", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 53;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private FolderOverviewAccounts$Folder$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = FolderOverviewAccounts.Folder.onExtraCallbackWithResult();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        OverviewPrice$$serializer overviewPrice$$serializer = OverviewPrice$$serializer.INSTANCE;
        OverviewRate$$serializer overviewRate$$serializer = OverviewRate$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, lazyArrOnExtraCallbackWithResult[2].getValue(), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewPrice$$serializer), sp.IAuthTabCallback(overviewRate$$serializer), sp.IAuthTabCallback(overviewRate$$serializer), sp.IAuthTabCallback(overviewRate$$serializer), r2ExternalSyntheticLambda4.IAuthTabCallback};
        int i4 = onExtraCallbackWithResult + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final FolderOverviewAccounts.Folder deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        OverviewPrice overviewPrice;
        OverviewRate overviewRate;
        OverviewRate overviewRate2;
        OverviewPrice overviewPrice2;
        List list;
        String str;
        FolderOverviewAccounts.Folder.Type type;
        int i;
        OverviewPrice overviewPrice3;
        OverviewRate overviewRate3;
        OverviewPrice overviewPrice4;
        OverviewPrice overviewPrice5;
        OverviewPrice overviewPrice6;
        boolean z;
        String str2;
        String str3;
        boolean z2;
        OverviewPrice overviewPrice7;
        String str4;
        char c;
        Lazy[] lazyArr;
        OverviewPrice overviewPrice8;
        boolean zOnExtraCallbackWithResult;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            FolderOverviewAccounts.Folder.onExtraCallbackWithResult();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = FolderOverviewAccounts.Folder.onExtraCallbackWithResult();
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 1);
            FolderOverviewAccounts.Folder.Type type2 = (FolderOverviewAccounts.Folder.Type) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), (Object) null);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3);
            String str5 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, (Object) null);
            OverviewPrice$$serializer overviewPrice$$serializer = OverviewPrice$$serializer.INSTANCE;
            OverviewPrice overviewPrice9 = (OverviewPrice) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice10 = (OverviewPrice) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, overviewPrice$$serializer, (Object) null);
            overviewPrice2 = (OverviewPrice) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice11 = (OverviewPrice) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 8, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice12 = (OverviewPrice) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 9, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice13 = (OverviewPrice) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 10, overviewPrice$$serializer, (Object) null);
            OverviewRate$$serializer overviewRate$$serializer = OverviewRate$$serializer.INSTANCE;
            overviewRate3 = (OverviewRate) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 11, overviewRate$$serializer, (Object) null);
            OverviewRate overviewRate4 = (OverviewRate) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 12, overviewRate$$serializer, (Object) null);
            OverviewRate overviewRate5 = (OverviewRate) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 13, overviewRate$$serializer, (Object) null);
            overviewPrice3 = overviewPrice13;
            overviewPrice6 = overviewPrice9;
            overviewPrice = overviewPrice12;
            overviewPrice5 = overviewPrice10;
            overviewPrice4 = overviewPrice11;
            type = type2;
            list = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 14, r2ExternalSyntheticLambda4.IAuthTabCallback, (Object) null);
            str3 = strAsInterface;
            str = strAsInterface2;
            z = zOnExtraCallbackWithResult2;
            i = 32767;
            str2 = str5;
            overviewRate2 = overviewRate4;
            overviewRate = overviewRate5;
        } else {
            int i5 = 14;
            OverviewRate overviewRate6 = null;
            OverviewPrice overviewPrice14 = null;
            OverviewRate overviewRate7 = null;
            OverviewRate overviewRate8 = null;
            overviewPrice = null;
            OverviewPrice overviewPrice15 = null;
            List list2 = null;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            FolderOverviewAccounts.Folder.Type type3 = null;
            String str6 = null;
            OverviewPrice overviewPrice16 = null;
            int i6 = 0;
            boolean z3 = true;
            OverviewPrice overviewPrice17 = null;
            boolean z4 = false;
            OverviewPrice overviewPrice18 = null;
            while (z3) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = z4;
                        overviewPrice7 = overviewPrice18;
                        str4 = str6;
                        c = 2;
                        lazyArr = lazyArrOnExtraCallbackWithResult;
                        z3 = false;
                        overviewPrice18 = overviewPrice7;
                        lazyArrOnExtraCallbackWithResult = lazyArr;
                        i5 = 14;
                        str6 = str4;
                        z4 = z2;
                    case 0:
                        z2 = z4;
                        overviewPrice7 = overviewPrice18;
                        str4 = str6;
                        c = 2;
                        lazyArr = lazyArrOnExtraCallbackWithResult;
                        strAsInterface4 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                        overviewPrice18 = overviewPrice7;
                        lazyArrOnExtraCallbackWithResult = lazyArr;
                        i5 = 14;
                        str6 = str4;
                        z4 = z2;
                    case 1:
                        z2 = z4;
                        overviewPrice7 = overviewPrice18;
                        str4 = str6;
                        lazyArr = lazyArrOnExtraCallbackWithResult;
                        strAsInterface3 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 1);
                        i6 |= 2;
                        type3 = type3;
                        overviewPrice16 = overviewPrice16;
                        overviewPrice18 = overviewPrice7;
                        lazyArrOnExtraCallbackWithResult = lazyArr;
                        i5 = 14;
                        str6 = str4;
                        z4 = z2;
                    case 2:
                        z2 = z4;
                        overviewPrice7 = overviewPrice18;
                        str4 = str6;
                        c = 2;
                        lazyArr = lazyArrOnExtraCallbackWithResult;
                        type3 = (FolderOverviewAccounts.Folder.Type) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), type3);
                        i6 |= 4;
                        overviewPrice18 = overviewPrice7;
                        lazyArrOnExtraCallbackWithResult = lazyArr;
                        i5 = 14;
                        str6 = str4;
                        z4 = z2;
                    case 3:
                        overviewPrice8 = overviewPrice18;
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3);
                        i6 |= 8;
                        overviewPrice18 = overviewPrice8;
                        z4 = zOnExtraCallbackWithResult;
                        i5 = 14;
                    case 4:
                        zOnExtraCallbackWithResult = z4;
                        overviewPrice8 = overviewPrice18;
                        str6 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str6);
                        i6 |= 16;
                        int i7 = onExtraCallback + 41;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        overviewPrice16 = overviewPrice16;
                        overviewPrice18 = overviewPrice8;
                        z4 = zOnExtraCallbackWithResult;
                        i5 = 14;
                    case 5:
                        overviewPrice16 = (OverviewPrice) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, OverviewPrice$$serializer.INSTANCE, overviewPrice16);
                        i6 |= 32;
                        z4 = z4;
                        i5 = 14;
                    case 6:
                        overviewPrice17 = (OverviewPrice) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, OverviewPrice$$serializer.INSTANCE, overviewPrice17);
                        i6 |= 64;
                        i5 = 14;
                    case 7:
                        overviewPrice15 = (OverviewPrice) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, OverviewPrice$$serializer.INSTANCE, overviewPrice15);
                        i6 |= 128;
                        i5 = 14;
                    case 8:
                        overviewPrice18 = (OverviewPrice) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 8, OverviewPrice$$serializer.INSTANCE, overviewPrice18);
                        i6 |= 256;
                        i2 = onExtraCallback + 125;
                        onExtraCallbackWithResult = i2 % 128;
                        int i9 = i2 % 2;
                        i5 = 14;
                    case 9:
                        overviewPrice = (OverviewPrice) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 9, OverviewPrice$$serializer.INSTANCE, overviewPrice);
                        i6 |= 512;
                        i5 = 14;
                    case 10:
                        overviewPrice14 = (OverviewPrice) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 10, OverviewPrice$$serializer.INSTANCE, overviewPrice14);
                        i6 |= 1024;
                        i5 = 14;
                    case 11:
                        overviewRate8 = (OverviewRate) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 11, OverviewRate$$serializer.INSTANCE, overviewRate8);
                        i6 |= 2048;
                        i5 = 14;
                    case 12:
                        overviewRate7 = (OverviewRate) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 12, OverviewRate$$serializer.INSTANCE, overviewRate7);
                        i6 |= 4096;
                        i2 = onExtraCallbackWithResult + 13;
                        onExtraCallback = i2 % 128;
                        int i92 = i2 % 2;
                        i5 = 14;
                    case 13:
                        overviewRate6 = (OverviewRate) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 13, OverviewRate$$serializer.INSTANCE, overviewRate6);
                        i6 |= 8192;
                        i5 = 14;
                    case 14:
                        list2 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, i5, r2ExternalSyntheticLambda4.IAuthTabCallback, list2);
                        i6 |= 16384;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            OverviewPrice overviewPrice19 = overviewPrice18;
            overviewRate = overviewRate6;
            overviewRate2 = overviewRate7;
            overviewPrice2 = overviewPrice15;
            list = list2;
            str = strAsInterface3;
            type = type3;
            i = i6;
            overviewPrice3 = overviewPrice14;
            overviewRate3 = overviewRate8;
            overviewPrice4 = overviewPrice19;
            overviewPrice5 = overviewPrice17;
            overviewPrice6 = overviewPrice16;
            z = z4;
            str2 = str6;
            str3 = strAsInterface4;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new FolderOverviewAccounts.Folder(i, str3, str, type, z, str2, overviewPrice6, overviewPrice5, overviewPrice2, overviewPrice4, overviewPrice, overviewPrice3, overviewRate3, overviewRate2, overviewRate, list, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        FolderOverviewAccounts.Folder folderDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return folderDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull FolderOverviewAccounts.Folder folder) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(folder, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            FolderOverviewAccounts.Folder.IAuthTabCallback(folder, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(folder, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        FolderOverviewAccounts.Folder.IAuthTabCallback(folder, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 14 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (FolderOverviewAccounts.Folder) obj);
        int i4 = onExtraCallback + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}

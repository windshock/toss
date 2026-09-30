package im.toss.features.home.core.model.asset.edit.request;

import im.toss.features.home.core.model.asset.edit.request.AssetDepositEditSaveRequest$;
import im.toss.features.home.core.model.asset.edit.request.AssetDepositEditSaveRequest$Account$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AssetDepositEditSaveRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<Account> investments;
    private final List<Account> pensions;
    private final List<Account> savings;
    private final List<Account> transactions;

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = i7 | i6;
        int i9 = ~(i8 | i2);
        int i10 = (~i2) | (~((~i6) | i4));
        int i11 = (~(i2 | i6)) | (~(i7 | i2)) | (~i8);
        int i12 = i4 + i6 + i + ((-953487067) * i5) + ((-1992133889) * i3);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i4) + 1765277696 + (1051104396 * i6) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i) + ((-1703411712) * i5) + (1961361408 * i3) + (907935744 * i13);
        int i15 = ((i4 * 272661978) - 2115615402) + (i6 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i * 272662391) + (i5 * 2077717299) + (i3 * 1957688713) + (i13 * 166854656);
        return i14 + ((i15 * i15) * (-213778432)) != 1 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerAsInterface = asInterface();
        int i3 = onWarmupCompleted + 113;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 34 / 0;
        }
        return kSerializerAsInterface;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AssetDepositEditSaveRequest$Account$.serializer.INSTANCE);
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AssetDepositEditSaveRequest$Account$.serializer.INSTANCE);
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AssetDepositEditSaveRequest$Account$.serializer.INSTANCE);
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        KSerializer kSerializer = (KSerializer) IAuthTabCallback(new Object[0], HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1015126397, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1015126398);
        int i4 = onNavigationEvent + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        KSerializer kSerializer = (KSerializer) IAuthTabCallback(new Object[0], HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 676906754, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -676906754);
        int i4 = onNavigationEvent + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializer;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AssetDepositEditSaveRequest$Account$.serializer.INSTANCE);
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        KSerializer kSerializerOnTransact;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerOnTransact = onTransact();
            int i3 = 73 / 0;
        } else {
            kSerializerOnTransact = onTransact();
        }
        int i4 = onNavigationEvent + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return kSerializerOnTransact;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 117;
            onNavigationEvent = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof AssetDepositEditSaveRequest)) {
            int i3 = onNavigationEvent + 105;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        AssetDepositEditSaveRequest assetDepositEditSaveRequest = (AssetDepositEditSaveRequest) obj;
        if (!Intrinsics.areEqual(this.transactions, assetDepositEditSaveRequest.transactions)) {
            int i5 = onWarmupCompleted + 71;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.savings, assetDepositEditSaveRequest.savings) || !Intrinsics.areEqual(this.investments, assetDepositEditSaveRequest.investments)) {
            return false;
        }
        if (Intrinsics.areEqual(this.pensions, assetDepositEditSaveRequest.pensions)) {
            return true;
        }
        int i6 = onNavigationEvent + 91;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.transactions.hashCode() * 31) + this.savings.hashCode()) * 31) + this.investments.hashCode()) * 31) + this.pensions.hashCode();
        int i4 = onWarmupCompleted + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AssetDepositEditSaveRequest(transactions=" + this.transactions + ", savings=" + this.savings + ", investments=" + this.investments + ", pensions=" + this.pensions + ")";
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new AssetDepositEditSaveRequest$.ExternalSyntheticLambda0()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new AssetDepositEditSaveRequest$.ExternalSyntheticLambda1()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new AssetDepositEditSaveRequest$.ExternalSyntheticLambda2()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new AssetDepositEditSaveRequest$.ExternalSyntheticLambda3())};
        int i = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 10 / 0;
        }
    }

    public /* synthetic */ AssetDepositEditSaveRequest(int i, List list, List list2, List list3, List list4, okycx okycxVar) {
        if (15 != (i & 15)) {
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 15, AssetDepositEditSaveRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 63;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.transactions = list;
        this.savings = list2;
        this.investments = list3;
        this.pensions = list4;
    }

    public AssetDepositEditSaveRequest(@NotNull List<Account> list, @NotNull List<Account> list2, @NotNull List<Account> list3, @NotNull List<Account> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.transactions = list;
        this.savings = list2;
        this.investments = list3;
        this.pensions = list4;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(AssetDepositEditSaveRequest assetDepositEditSaveRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), assetDepositEditSaveRequest.transactions);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), assetDepositEditSaveRequest.savings);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), assetDepositEditSaveRequest.investments);
        vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), assetDepositEditSaveRequest.pensions);
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 63;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return lazyArr;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (KSerializer) IAuthTabCallback(new Object[0], HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 676906754, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -676906754);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (KSerializer) IAuthTabCallback(new Object[0], HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1015126397, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1015126398);
    }
}

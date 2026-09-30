package im.toss.features.credit.data.response;

import im.toss.features.credit.data.response.CreditHistoryResponse$;
import im.toss.features.credit.data.response.CreditHistoryResponse$CreditActivity$;
import im.toss.features.credit.data.response.CreditHistoryResponse$PersonalInfoChange$;
import im.toss.features.credit.data.response.CreditHistoryResponse$ScoreChange$;
import im.toss.features.credit.data.response.CreditHistoryResponse$ScoreReason$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditHistoryResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final List<CreditActivity> creditActivities;
    private final List<PersonalInfoChange> personalInfoChanges;
    private final int score;
    private final List<ScoreChange> scoreChanges;
    private final ScoreReason scoreReason;
    private final float topPercent;

    public CreditHistoryResponse() {
        this(0, 0.0f, (List) null, (List) null, (List) null, (ScoreReason) null, 63, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CreditHistoryResponse$ScoreChange$.serializer.INSTANCE);
        int i2 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CreditHistoryResponse$CreditActivity$.serializer.INSTANCE);
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CreditHistoryResponse$PersonalInfoChange$.serializer.INSTANCE);
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getInterfaceDescriptor();
            obj.hashCode();
            throw null;
        }
        KSerializer interfaceDescriptor = getInterfaceDescriptor();
        int i3 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return interfaceDescriptor;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStubProxy();
        }
        IAuthTabCallbackStubProxy();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = i4 | i;
        int i8 = ~((~i) | i4);
        int i9 = ~i4;
        int i10 = i8 | (~(i9 | i2 | i));
        int i11 = (~(i | i9)) | i2;
        int i12 = i4 + i2 + i3 + (2127773517 * i6) + (1026174006 * i5);
        int i13 = i12 * i12;
        int i14 = (i4 * (-484454144)) + 743702528 + ((-484454144) * i2) + (i7 * (-1605095679)) + (1605095679 * i10) + ((-1605095679) * i11) + ((-2089549824) * i3) + (367263744 * i6) + ((-1434976256) * i5) + (1105526784 * i13);
        int i15 = (i4 * 21308160) + 1622758390 + (i2 * 21308160) + (i7 * 947) + (i10 * (-947)) + (i11 * 947) + (i3 * 21309107) + (i6 * 1708896471) + (i5 * 664464834) + (i13 * 287244288);
        return i14 + ((i15 * i15) * 966983680) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        KSerializer kSerializerIAuthTabCallback_Parcel;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
            int i3 = 77 / 0;
        } else {
            kSerializerIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        }
        int i4 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback_Parcel;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditHistoryResponse)) {
            return false;
        }
        CreditHistoryResponse creditHistoryResponse = (CreditHistoryResponse) obj;
        if (this.score != creditHistoryResponse.score) {
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Float.compare(this.topPercent, creditHistoryResponse.topPercent) != 0) {
            return false;
        }
        if (!Intrinsics.areEqual(this.scoreChanges, creditHistoryResponse.scoreChanges)) {
            int i4 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.creditActivities, creditHistoryResponse.creditActivities)) {
            int i6 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.personalInfoChanges, creditHistoryResponse.personalInfoChanges)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.scoreReason, creditHistoryResponse.scoreReason))) {
            int i8 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i9 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 91 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Integer.hashCode(this.score);
            Float.hashCode(this.topPercent);
            this.scoreChanges.hashCode();
            this.creditActivities.hashCode();
            this.personalInfoChanges.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode2 = Integer.hashCode(this.score);
        int iHashCode3 = Float.hashCode(this.topPercent);
        int iHashCode4 = this.scoreChanges.hashCode();
        int iHashCode5 = this.creditActivities.hashCode();
        int iHashCode6 = this.personalInfoChanges.hashCode();
        ScoreReason scoreReason = this.scoreReason;
        if (scoreReason == null) {
            int i3 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = scoreReason.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditHistoryResponse(score=" + this.score + ", topPercent=" + this.topPercent + ", scoreChanges=" + this.scoreChanges + ", creditActivities=" + this.creditActivities + ", personalInfoChanges=" + this.personalInfoChanges + ", scoreReason=" + this.scoreReason + ")";
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 93 / 0;
        }
        return str;
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new CreditHistoryResponse$.ExternalSyntheticLambda0()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new CreditHistoryResponse$.ExternalSyntheticLambda1()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new CreditHistoryResponse$.ExternalSyntheticLambda2()), null};
        int i = onWarmupCompleted + 17;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public CreditHistoryResponse(int i, float f, @NotNull List<ScoreChange> list, @NotNull List<CreditActivity> list2, @NotNull List<PersonalInfoChange> list3, @Nullable ScoreReason scoreReason) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.score = i;
        this.topPercent = f;
        this.scoreChanges = list;
        this.creditActivities = list2;
        this.personalInfoChanges = list3;
        this.scoreReason = scoreReason;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CreditHistoryResponse(int i, int i2, float f, List list, List list2, List list3, ScoreReason scoreReason, okycx okycxVar) {
        this.score = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.topPercent = 0.0f;
        } else {
            this.topPercent = f;
        }
        Object obj = null;
        if ((i & 4) == 0) {
            int i3 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
            list = CollectionsKt.emptyList();
        }
        this.scoreChanges = list;
        if ((i & 8) == 0) {
            this.creditActivities = CollectionsKt.emptyList();
            int i4 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } else {
            this.creditActivities = list2;
        }
        if ((i & 16) == 0) {
            int i6 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            this.personalInfoChanges = CollectionsKt.emptyList();
            int i8 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
            }
            if ((i & 32) != 0) {
                this.scoreReason = null;
                return;
            } else {
                this.scoreReason = scoreReason;
                return;
            }
        }
        this.personalInfoChanges = list3;
        int i9 = 2 % 2;
        if ((i & 32) != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(CreditHistoryResponse creditHistoryResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (creditHistoryResponse.score != 0) {
                vylVar.onExtraCallback(serialDescriptor, 0, creditHistoryResponse.score);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || Float.compare(creditHistoryResponse.topPercent, 0.0f) != 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, creditHistoryResponse.topPercent);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || (!Intrinsics.areEqual(creditHistoryResponse.scoreChanges, CollectionsKt.emptyList()))) {
            vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), creditHistoryResponse.scoreChanges);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(creditHistoryResponse.creditActivities, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), creditHistoryResponse.creditActivities);
            int i4 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        Object obj = null;
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 4))) {
            vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), creditHistoryResponse.personalInfoChanges);
        } else {
            int i6 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.areEqual(creditHistoryResponse.personalInfoChanges, CollectionsKt.emptyList());
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(creditHistoryResponse.personalInfoChanges, CollectionsKt.emptyList())) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i7 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                ScoreReason scoreReason = creditHistoryResponse.scoreReason;
                obj.hashCode();
                throw null;
            }
            if (creditHistoryResponse.scoreReason == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, CreditHistoryResponse$ScoreReason$.serializer.INSTANCE, creditHistoryResponse.scoreReason);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 123;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditHistoryResponse(int i, float f, List list, List list2, List list3, ScoreReason scoreReason, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = 2 % 2;
            i = 0;
        }
        if ((i2 & 2) != 0) {
            int i4 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            f = 0.0f;
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            list = CollectionsKt.emptyList();
            int i7 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        }
        List list4 = list;
        if ((i2 & 8) != 0) {
            int i10 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            list2 = CollectionsKt.emptyList();
        }
        this(i, f2, list4, list2, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list3, (i2 & 32) == 0 ? scoreReason : null);
    }

    public final int asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.score;
        int i6 = i3 + 41;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        float f = this.topPercent;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return f;
    }

    public final List<ScoreChange> asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<ScoreChange> list = this.scoreChanges;
        int i5 = i3 + 59;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditHistoryResponse creditHistoryResponse = (CreditHistoryResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 77;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<CreditActivity> list = creditHistoryResponse.creditActivities;
        int i5 = i2 + 21;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return list;
    }

    public final List<PersonalInfoChange> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<PersonalInfoChange> list = this.personalInfoChanges;
        int i5 = i3 + 113;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final ScoreReason onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        ScoreReason scoreReason = this.scoreReason;
        int i5 = i3 + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return scoreReason;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        return (Lazy[]) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 350294141, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[0], -350294141, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final List<CreditActivity> onExtraCallbackWithResult() {
        return (List) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1592203040, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this}, 1592203041, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }
}

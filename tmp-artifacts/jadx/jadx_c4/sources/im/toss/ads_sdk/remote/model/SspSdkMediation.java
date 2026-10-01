package im.toss.ads_sdk.remote.model;

import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.ads_sdk.model.MediationPriority;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SspSdkMediation {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    public static final String PRIORITY_ADMOB_ONLY = "ADMOB_ONLY";
    public static final String PRIORITY_ADMOB_THEN_TOSS = "ADMOB_THEN_TOSS";
    public static final String PRIORITY_TOSS_ONLY = "TOSS_ONLY";
    public static final String PRIORITY_TOSS_THEN_ADMOB = "TOSS_THEN_ADMOB";
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final SspSdkMediationAdmob admob;
    private final List<String> bannedKeywords;
    private final SspSdkMediationEndpoint endpoint;
    private final String mediationId;
    private final String priority;
    private final List<String> ruleSet;

    public SspSdkMediation() {
        this((String) null, (String) null, (SspSdkMediationAdmob) null, (SspSdkMediationEndpoint) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStub();
            throw null;
        }
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i3 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 62 / 0;
        }
        return kSerializerIAuthTabCallbackStub;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i4 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i5);
        int i9 = ~i2;
        int i10 = (~(i9 | i4)) | i8;
        int i11 = ~i5;
        int i12 = i11 | i4;
        int i13 = i10 | (~i12);
        int i14 = i7 | i2;
        int i15 = i8 | (~i14);
        int i16 = (~(i5 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i2));
        int i17 = i4 + i2 + i3 + ((-1254723898) * i6) + ((-1667789834) * i);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i4) + 1379663872 + ((-481802647) * i2) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i3) + ((-1033371648) * i6) + ((-106430464) * i) + (1552875520 * i18);
        int i20 = ((i4 * (-402395399)) - 1316031342) + (i2 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i3 * (-402393527)) + (i6 * (-1219896714)) + (i * (-610841306)) + (i18 * (-825819136));
        if (i19 + (i20 * i20 * (-1063190528)) != 1) {
            return onExtraCallback(objArr);
        }
        SspSdkMediation sspSdkMediation = (SspSdkMediation) objArr[0];
        int i21 = 2 % 2;
        int i22 = IAuthTabCallback + 93;
        int i23 = i22 % 128;
        onExtraCallbackWithResult = i23;
        int i24 = i22 % 2;
        List<String> list = sspSdkMediation.ruleSet;
        int i25 = i23 + 97;
        IAuthTabCallback = i25 % 128;
        int i26 = i25 % 2;
        return list;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SspSdkMediation)) {
            int i5 = i3 + 21;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        SspSdkMediation sspSdkMediation = (SspSdkMediation) obj;
        if (!Intrinsics.areEqual(this.mediationId, sspSdkMediation.mediationId) || !Intrinsics.areEqual(this.priority, sspSdkMediation.priority)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.admob, sspSdkMediation.admob)) {
            int i7 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.endpoint, sspSdkMediation.endpoint) || !Intrinsics.areEqual(this.ruleSet, sspSdkMediation.ruleSet) || !Intrinsics.areEqual(this.bannedKeywords, sspSdkMediation.bannedKeywords)) {
            return false;
        }
        int i9 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.mediationId.hashCode();
        int iHashCode3 = this.priority.hashCode();
        SspSdkMediationAdmob sspSdkMediationAdmob = this.admob;
        int iHashCode4 = 0;
        if (sspSdkMediationAdmob == null) {
            int i2 = IAuthTabCallback + 39;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 45;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = sspSdkMediationAdmob.hashCode();
        }
        SspSdkMediationEndpoint sspSdkMediationEndpoint = this.endpoint;
        if (sspSdkMediationEndpoint != null) {
            iHashCode4 = sspSdkMediationEndpoint.hashCode();
            int i7 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4) * 31) + this.ruleSet.hashCode()) * 31) + this.bannedKeywords.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SspSdkMediation(mediationId=" + this.mediationId + ", priority=" + this.priority + ", admob=" + this.admob + ", endpoint=" + this.endpoint + ", ruleSet=" + this.ruleSet + ", bannedKeywords=" + this.bannedKeywords + ")";
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ SspSdkMediation(int i, String str, String str2, SspSdkMediationAdmob sspSdkMediationAdmob, SspSdkMediationEndpoint sspSdkMediationEndpoint, List list, List list2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.mediationId = "";
        } else {
            this.mediationId = str;
        }
        if ((i & 2) == 0) {
            this.priority = "";
        } else {
            this.priority = str2;
            int i2 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i3 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.admob = null;
            if (i4 != 0) {
                int i5 = 35 / 0;
            }
        } else {
            this.admob = sspSdkMediationAdmob;
            int i6 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
        }
        if ((i & 8) == 0) {
            int i8 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            this.endpoint = null;
            if (i9 == 0) {
                int i10 = 33 / 0;
            }
        } else {
            this.endpoint = sspSdkMediationEndpoint;
            int i11 = 2 % 2;
        }
        if ((i & 16) == 0) {
            this.ruleSet = CollectionsKt.emptyList();
        } else {
            this.ruleSet = list;
        }
        if ((i & 32) == 0) {
            this.bannedKeywords = CollectionsKt.emptyList();
        } else {
            this.bannedKeywords = list2;
        }
    }

    public SspSdkMediation(@NotNull String str, @NotNull String str2, @Nullable SspSdkMediationAdmob sspSdkMediationAdmob, @Nullable SspSdkMediationEndpoint sspSdkMediationEndpoint, @NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.mediationId = str;
        this.priority = str2;
        this.admob = sspSdkMediationAdmob;
        this.endpoint = sspSdkMediationEndpoint;
        this.ruleSet = list;
        this.bannedKeywords = list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(SspSdkMediation sspSdkMediation, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(sspSdkMediation.mediationId, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, sspSdkMediation.mediationId);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(sspSdkMediation.priority, "")) {
                vylVar.onExtraCallback(serialDescriptor, 1, sspSdkMediation.priority);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || sspSdkMediation.admob != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, SspSdkMediationAdmob$$serializer.INSTANCE, sspSdkMediation.admob);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i4 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (sspSdkMediation.endpoint != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, SspSdkMediationEndpoint$$serializer.INSTANCE, sspSdkMediation.endpoint);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(sspSdkMediation.ruleSet, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), sspSdkMediation.ruleSet);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i6 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (!Intrinsics.areEqual(sspSdkMediation.bannedKeywords, CollectionsKt.emptyList())) {
                vylVar.onNavigationEvent(serialDescriptor, 5, (py) lazyArr[5].getValue(), sspSdkMediation.bannedKeywords);
            }
        }
        int i8 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SspSdkMediation(String str, String str2, SspSdkMediationAdmob sspSdkMediationAdmob, SspSdkMediationEndpoint sspSdkMediationEndpoint, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        SspSdkMediationAdmob sspSdkMediationAdmob2;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 79;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 125;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str = "";
        }
        String str3 = (i & 2) == 0 ? str2 : "";
        if ((i & 4) != 0) {
            int i7 = 2 % 2;
            sspSdkMediationAdmob2 = null;
        } else {
            sspSdkMediationAdmob2 = sspSdkMediationAdmob;
        }
        SspSdkMediationEndpoint sspSdkMediationEndpoint2 = (i & 8) == 0 ? sspSdkMediationEndpoint : null;
        if ((i & 16) != 0) {
            list = CollectionsKt.emptyList();
            int i8 = 2 % 2;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            int i9 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            list2 = CollectionsKt.emptyList();
        }
        this(str, str3, sspSdkMediationAdmob2, sspSdkMediationEndpoint2, list3, list2);
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.mediationId;
        }
        throw null;
    }

    public final SspSdkMediationAdmob onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.admob;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        SspSdkMediation sspSdkMediation = (SspSdkMediation) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SspSdkMediationEndpoint sspSdkMediationEndpoint = sspSdkMediation.endpoint;
        if (i4 != 0) {
            int i5 = 16 / 0;
        }
        int i6 = i3 + 91;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return sspSdkMediationEndpoint;
    }

    public final List<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.bannedKeywords;
        int i5 = i2 + 117;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final List<MediationPriority> onTransact() {
        int i = 2 % 2;
        String str = this.priority;
        switch (str.hashCode()) {
            case -1587235557:
                if (str.equals(PRIORITY_ADMOB_THEN_TOSS)) {
                    return CollectionsKt.listOf(new MediationPriority[]{MediationPriority.ADMOB, MediationPriority.TOSS});
                }
                break;
            case -496889889:
                if (str.equals(PRIORITY_TOSS_THEN_ADMOB)) {
                    int i2 = onExtraCallbackWithResult + 61;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return CollectionsKt.listOf(new MediationPriority[]{MediationPriority.TOSS, MediationPriority.ADMOB});
                    }
                    MediationPriority mediationPriority = MediationPriority.TOSS;
                    MediationPriority mediationPriority2 = MediationPriority.ADMOB;
                    MediationPriority[] mediationPriorityArr = new MediationPriority[4];
                    mediationPriorityArr[1] = mediationPriority;
                    mediationPriorityArr[0] = mediationPriority2;
                    return CollectionsKt.listOf(mediationPriorityArr);
                }
                break;
            case 1855489872:
                if (str.equals(PRIORITY_TOSS_ONLY)) {
                    return CollectionsKt.listOf(MediationPriority.TOSS);
                }
                break;
            case 1889117902:
                if (str.equals(PRIORITY_ADMOB_ONLY)) {
                    int i3 = IAuthTabCallback + 47;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return CollectionsKt.listOf(MediationPriority.ADMOB);
                }
                break;
        }
        List<MediationPriority> listEmptyList = CollectionsKt.emptyList();
        int i5 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return listEmptyList;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SspSdkMediation> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            SspSdkMediation$$serializer sspSdkMediation$$serializer = SspSdkMediation$$serializer.INSTANCE;
            if (i3 != 0) {
                return sspSdkMediation$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.ads_sdk.remote.model.SspSdkMediation$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 1;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = SspSdkMediation.IAuthTabCallback();
                int i4 = IAuthTabCallback + 115;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerIAuthTabCallback;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.ads_sdk.remote.model.SspSdkMediation$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 7;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = SspSdkMediation.onExtraCallback();
                int i4 = onExtraCallback + 73;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        })};
        int i = onWarmupCompleted + 95;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final SspSdkMediationEndpoint asBinder() {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (SspSdkMediationEndpoint) onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -672219893, iOnExtraCallbackWithResult2, 672219893, new Object[]{this}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3);
    }

    public final List<String> asInterface() {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (List) onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -2128545776, iOnExtraCallbackWithResult2, 2128545777, new Object[]{this}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3);
    }
}

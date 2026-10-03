package viva.republica.toss.network.model.loan;

import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.GroupedAppliedLoan$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GroupedAppliedLoan {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String badgeText;
    private final String groupName;
    private final onWarmupCompleted groupType;
    private final List<AppliedLoan> loans;
    private final String remainDateText;

    public GroupedAppliedLoan() {
        this((onWarmupCompleted) null, (String) null, (String) null, (List) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.GroupedAppliedLoan.GroupType", onWarmupCompleted.values());
        int i4 = onExtraCallbackWithResult + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AppliedLoan$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~((~i6) | i3)) | (~(i3 | i5));
        int i8 = (~i3) | (~i5);
        int i9 = i7 | (~(i8 | i6));
        int i10 = (~i8) | i6;
        int i11 = ~(i5 | i6);
        int i12 = i6 + i3 + i + ((-417414852) * i2) + (1247522396 * i4);
        int i13 = i12 * i12;
        int i14 = (i6 * (-1219797419)) + 1526988800 + ((-1219797419) * i3) + (825712212 * i9) + ((-1651424424) * i10) + ((-825712212) * i11) + ((-2045509632) * i) + ((-2135949312) * i2) + ((-953155584) * i4) + ((-430374912) * i13);
        int i15 = ((i6 * 184508743) - 476012450) + (i3 * 184508743) + (i9 * (-996)) + (i10 * 1992) + (i11 * 996) + (i * 184509739) + (i2 * (-953474796)) + (i4 * (-288057996)) + (i13 * (-839712768));
        return i14 + ((i15 * i15) * 1709113344) != 1 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsInterface = asInterface();
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return kSerializerAsInterface;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackDefault();
        }
        IAuthTabCallbackDefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof GroupedAppliedLoan)) {
            return false;
        }
        GroupedAppliedLoan groupedAppliedLoan = (GroupedAppliedLoan) obj;
        if (this.groupType != groupedAppliedLoan.groupType || !Intrinsics.areEqual(this.groupName, groupedAppliedLoan.groupName) || !Intrinsics.areEqual(this.remainDateText, groupedAppliedLoan.remainDateText)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.loans, groupedAppliedLoan.loans)) {
            int i4 = onExtraCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.badgeText, groupedAppliedLoan.badgeText)) {
            return false;
        }
        int i6 = onExtraCallback + 53;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.groupType.hashCode();
        int iHashCode2 = this.groupName.hashCode();
        String str = this.remainDateText;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.loans.hashCode();
        String str2 = this.badgeText;
        if (str2 != null) {
            iHashCode3 = str2.hashCode();
            int i4 = onExtraCallback + 17;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GroupedAppliedLoan(groupType=" + this.groupType + ", groupName=" + this.groupName + ", remainDateText=" + this.remainDateText + ", loans=" + this.loans + ", badgeText=" + this.badgeText + ")";
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GroupedAppliedLoan> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            GroupedAppliedLoan$.serializer serializerVar = GroupedAppliedLoan$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.GroupedAppliedLoan$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 117;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return GroupedAppliedLoan.onNavigationEvent();
                }
                GroupedAppliedLoan.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.GroupedAppliedLoan$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                KSerializer kSerializer = (KSerializer) GroupedAppliedLoan.onExtraCallbackWithResult(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[0], IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 729911059, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -729911058);
                int i4 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 46 / 0;
                }
                return kSerializer;
            }
        }), null};
        int i = onNavigationEvent + 23;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 77 / 0;
        }
    }

    public /* synthetic */ GroupedAppliedLoan(int i, onWarmupCompleted onwarmupcompleted, String str, String str2, List list, String str3, okycx okycxVar) {
        this.groupType = (i & 1) == 0 ? onWarmupCompleted.CREDIT_LOAN : onwarmupcompleted;
        if ((i & 2) == 0) {
            this.groupName = "";
            int i2 = 2 % 2;
        } else {
            this.groupName = str;
        }
        Object obj = null;
        if ((i & 4) == 0) {
            int i3 = onExtraCallbackWithResult + 7;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.remainDateText = null;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.remainDateText = str2;
            int i5 = onExtraCallbackWithResult + 37;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 2;
            } else {
                int i7 = 2 % 2;
            }
        }
        if ((i & 8) == 0) {
            this.loans = CollectionsKt.emptyList();
        } else {
            this.loans = list;
            int i8 = 2 % 2;
        }
        if ((i & 16) != 0) {
            this.badgeText = str3;
            return;
        }
        int i9 = onExtraCallbackWithResult + 101;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        this.badgeText = null;
    }

    public GroupedAppliedLoan(@NotNull onWarmupCompleted onwarmupcompleted, @NotNull String str, @Nullable String str2, @NotNull List<AppliedLoan> list, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.groupType = onwarmupcompleted;
        this.groupName = str;
        this.remainDateText = str2;
        this.loans = list;
        this.badgeText = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.loan.GroupedAppliedLoan r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.GroupedAppliedLoan.$childSerializers
            r2 = 0
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L12
            viva.republica.toss.network.model.loan.GroupedAppliedLoan$onWarmupCompleted r3 = r5.groupType
            viva.republica.toss.network.model.loan.GroupedAppliedLoan$onWarmupCompleted r4 = viva.republica.toss.network.model.loan.GroupedAppliedLoan.onWarmupCompleted.CREDIT_LOAN
            if (r3 == r4) goto L28
        L12:
            r3 = r1[r2]
            java.lang.Object r3 = r3.getValue()
            o.py r3 = (o.py) r3
            viva.republica.toss.network.model.loan.GroupedAppliedLoan$onWarmupCompleted r4 = r5.groupType
            r6.onNavigationEvent(r7, r2, r3, r4)
            int r2 = viva.republica.toss.network.model.loan.GroupedAppliedLoan.onExtraCallback
            int r2 = r2 + 53
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.GroupedAppliedLoan.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
        L28:
            r2 = 1
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L42
            int r3 = viva.republica.toss.network.model.loan.GroupedAppliedLoan.onExtraCallback
            int r3 = r3 + 95
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.GroupedAppliedLoan.onExtraCallbackWithResult = r4
            int r3 = r3 % r0
            java.lang.String r3 = r5.groupName
            java.lang.String r4 = ""
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L47
        L42:
            java.lang.String r3 = r5.groupName
            r6.onExtraCallback(r7, r2, r3)
        L47:
            boolean r2 = r6.onWarmupCompleted(r7, r0)
            if (r2 == 0) goto L4e
            goto L5b
        L4e:
            int r2 = viva.republica.toss.network.model.loan.GroupedAppliedLoan.onExtraCallbackWithResult
            int r2 = r2 + 99
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.GroupedAppliedLoan.onExtraCallback = r3
            int r2 = r2 % r0
            java.lang.String r2 = r5.remainDateText
            if (r2 == 0) goto L62
        L5b:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r5.remainDateText
            r6.onExtraCallbackWithResult(r7, r0, r2, r3)
        L62:
            r2 = 3
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L75
            java.util.List<viva.republica.toss.network.model.loan.AppliedLoan> r3 = r5.loans
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L82
        L75:
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.loan.AppliedLoan> r3 = r5.loans
            r6.onNavigationEvent(r7, r2, r1, r3)
        L82:
            r1 = 4
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto L96
            int r2 = viva.republica.toss.network.model.loan.GroupedAppliedLoan.onExtraCallbackWithResult
            int r2 = r2 + 7
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.GroupedAppliedLoan.onExtraCallback = r3
            int r2 = r2 % r0
            java.lang.String r0 = r5.badgeText
            if (r0 == 0) goto L9d
        L96:
            o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r5.badgeText
            r6.onExtraCallbackWithResult(r7, r1, r0, r5)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.GroupedAppliedLoan.onWarmupCompleted(viva.republica.toss.network.model.loan.GroupedAppliedLoan, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GroupedAppliedLoan(onWarmupCompleted onwarmupcompleted, String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onwarmupcompleted = onWarmupCompleted.CREDIT_LOAN;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 39;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        }
        String str5 = str;
        String str6 = null;
        if ((i & 4) != 0) {
            int i6 = onExtraCallbackWithResult + 5;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                str6.hashCode();
                throw null;
            }
            int i7 = 2 % 2;
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i & 8) != 0) {
            int i8 = onExtraCallback + 57;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        if ((i & 16) != 0) {
            int i9 = onExtraCallbackWithResult + 79;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str6 = str3;
        }
        this(onwarmupcompleted, str5, str4, list2, str6);
    }

    public final onWarmupCompleted onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        onWarmupCompleted onwarmupcompleted = this.groupType;
        int i5 = i3 + 65;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return onwarmupcompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.groupName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        GroupedAppliedLoan groupedAppliedLoan = (GroupedAppliedLoan) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = groupedAppliedLoan.remainDateText;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 45;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<AppliedLoan> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.loans;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        public static final onWarmupCompleted CREDIT_LOAN = new onWarmupCompleted("CREDIT_LOAN", 0);
        public static final onWarmupCompleted REFINANCING_LOAN = new onWarmupCompleted("REFINANCING_LOAN", 1);
        public static final onWarmupCompleted JEONSE_LOAN = new onWarmupCompleted("JEONSE_LOAN", 2);
        public static final onWarmupCompleted CARD_LOAN = new onWarmupCompleted("CARD_LOAN", 3);
        public static final onWarmupCompleted MORTGAGE_LOAN = new onWarmupCompleted("MORTGAGE_LOAN", 4);
        public static final onWarmupCompleted MORTGAGE_REFINANCING = new onWarmupCompleted("MORTGAGE_REFINANCING", 5);
        public static final onWarmupCompleted JEONSE_REFINANCING = new onWarmupCompleted("JEONSE_REFINANCING", 6);
        public static final onWarmupCompleted LIVING_EXPENSE_LOAN = new onWarmupCompleted("LIVING_EXPENSE_LOAN", 7);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 83;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {CREDIT_LOAN, REFINANCING_LOAN, JEONSE_LOAN, CARD_LOAN, MORTGAGE_LOAN, MORTGAGE_REFINANCING, JEONSE_REFINANCING, LIVING_EXPENSE_LOAN};
            int i5 = i2 + 65;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onwarmupcompletedArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = onExtraCallbackWithResult + 15;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = $VALUES;
            if (i3 != 0) {
                return (onWarmupCompleted[]) onwarmupcompletedArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = IAuthTabCallback + 101;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (KSerializer) onExtraCallbackWithResult(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[0], IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 729911059, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -729911058);
    }

    public final String asBinder() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (String) onExtraCallbackWithResult(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1500581676, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -1500581676);
    }
}

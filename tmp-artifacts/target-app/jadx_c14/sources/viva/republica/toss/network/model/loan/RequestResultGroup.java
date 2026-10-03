package viva.republica.toss.network.model.loan;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.access15300;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestResultGroup implements Parcelable {
    public static final Parcelable.Creator<RequestResultGroup> CREATOR = new Creator();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    @SerializedName("groupDescription")
    private final String groupDescription;

    @SerializedName("groupTitle")
    private final String groupTitle;

    @SerializedName("groupType")
    private final GroupType groupType;

    @SerializedName("notPreScreenedCompaniesCount")
    private final long notPreScreenedCompaniesCount;

    @SerializedName("requestResults")
    private final List<RequestResult> requestResults;

    @SerializedName("screeningRetryable")
    private final boolean screeningRetryable;

    public static final class Creator implements Parcelable.Creator<RequestResultGroup> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final RequestResultGroup[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 17;
            onWarmupCompleted = i3 % 128;
            RequestResultGroup[] requestResultGroupArr = new RequestResultGroup[i];
            if (i3 % 2 == 0) {
                int i4 = 93 / 0;
            }
            return requestResultGroupArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RequestResultGroup createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            RequestResultGroup requestResultGroupOnExtraCallback = onExtraCallback(parcel);
            int i4 = onWarmupCompleted + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return requestResultGroupOnExtraCallback;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RequestResultGroup[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 75;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            RequestResultGroup[] requestResultGroupArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onWarmupCompleted + 57;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return requestResultGroupArrIAuthTabCallback;
            }
            throw null;
        }

        public final RequestResultGroup onExtraCallback(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            GroupType groupTypeCreateFromParcel = GroupType.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i2 = onExtraCallback + 89;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                z = false;
            }
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                int i6 = onExtraCallback + 71;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(RequestResult.CREATOR.createFromParcel(parcel));
            }
            RequestResultGroup requestResultGroup = new RequestResultGroup(groupTypeCreateFromParcel, string, string2, z, arrayList, parcel.readLong());
            int i8 = onWarmupCompleted + 35;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return requestResultGroup;
        }
    }

    static {
        int i = IAuthTabCallback + 39;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public RequestResultGroup() {
        this(null, null, null, false, null, 0L, 63, null);
    }

    public static /* synthetic */ RequestResultGroup IAuthTabCallback(RequestResultGroup requestResultGroup, GroupType groupType, String str, String str2, boolean z, List list, long j, int i, Object obj) {
        long j2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                GroupType groupType2 = requestResultGroup.groupType;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            groupType = requestResultGroup.groupType;
        }
        GroupType groupType3 = groupType;
        if ((i & 2) != 0) {
            str = requestResultGroup.groupTitle;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = requestResultGroup.groupDescription;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            z = requestResultGroup.screeningRetryable;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            list = requestResultGroup.requestResults;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            int i4 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                j2 = requestResultGroup.notPreScreenedCompaniesCount;
                int i5 = 80 / 0;
            } else {
                j2 = requestResultGroup.notPreScreenedCompaniesCount;
            }
            j = j2;
        }
        return requestResultGroup.onNavigationEvent(groupType3, str3, str4, z2, list2, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 57;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RequestResultGroup)) {
            int i4 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        RequestResultGroup requestResultGroup = (RequestResultGroup) obj;
        if (this.groupType != requestResultGroup.groupType) {
            int i6 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.groupTitle, requestResultGroup.groupTitle)) {
            int i8 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.groupDescription, requestResultGroup.groupDescription) || this.screeningRetryable != requestResultGroup.screeningRetryable) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.requestResults, requestResultGroup.requestResults))) {
            return this.notPreScreenedCompaniesCount == requestResultGroup.notPreScreenedCompaniesCount;
        }
        int i10 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.groupType.hashCode() * 31) + this.groupTitle.hashCode()) * 31) + this.groupDescription.hashCode()) * 31) + Boolean.hashCode(this.screeningRetryable)) * 31) + this.requestResults.hashCode()) * 31) + Long.hashCode(this.notPreScreenedCompaniesCount);
        int i4 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final RequestResultGroup onNavigationEvent(@NotNull GroupType groupType, @NotNull String str, @NotNull String str2, boolean z, @NotNull List<RequestResult> list, long j) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(groupType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        RequestResultGroup requestResultGroup = new RequestResultGroup(groupType, str, str2, z, list, j);
        int i2 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return requestResultGroup;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RequestResultGroup(groupType=" + this.groupType + ", groupTitle=" + this.groupTitle + ", groupDescription=" + this.groupDescription + ", screeningRetryable=" + this.screeningRetryable + ", requestResults=" + this.requestResults + ", notPreScreenedCompaniesCount=" + this.notPreScreenedCompaniesCount + ")";
        int i2 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        this.groupType.writeToParcel(parcel, i);
        parcel.writeString(this.groupTitle);
        parcel.writeString(this.groupDescription);
        parcel.writeInt(this.screeningRetryable ? 1 : 0);
        List<RequestResult> list = this.requestResults;
        parcel.writeInt(list.size());
        Iterator<RequestResult> it = list.iterator();
        while (!(!it.hasNext())) {
            int i5 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.notPreScreenedCompaniesCount);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class GroupType implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GroupType[] $VALUES;
        public static final GroupType CANCEL;
        public static final GroupType COMPLETE;
        public static final Parcelable.Creator<GroupType> CREATOR;
        public static final GroupType DROP;
        public static final GroupType FAIL;
        public static final GroupType INSPECT;
        public static final GroupType REQUEST;
        public static final GroupType UNKNOWN;
        private static int onExtraCallbackWithResult;
        private static int onWarmupCompleted;
        private final String sectionName;
        private static final byte[] $$a = {35, -27, Byte.MIN_VALUE, 50};
        private static final int $$b = 244;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public static final class Creator implements Parcelable.Creator<GroupType> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ GroupType createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                GroupType groupTypeOnWarmupCompleted = onWarmupCompleted(parcel);
                int i4 = onExtraCallback + 95;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return groupTypeOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ GroupType[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 35;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                GroupType[] groupTypeArrOnNavigationEvent = onNavigationEvent(i);
                int i5 = onExtraCallback + 1;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return groupTypeArrOnNavigationEvent;
                }
                throw null;
            }

            public final GroupType[] onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 25;
                onWarmupCompleted = i3 % 128;
                GroupType[] groupTypeArr = new GroupType[i];
                if (i3 % 2 == 0) {
                    int i4 = 38 / 0;
                }
                return groupTypeArr;
            }

            public final GroupType onWarmupCompleted(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 1;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                if (i3 == 0) {
                    return GroupType.valueOf(string);
                }
                GroupType.valueOf(string);
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, int r7, int r8) {
            /*
                int r7 = r7 * 3
                int r0 = r7 + 1
                byte[] r1 = viva.republica.toss.network.model.loan.RequestResultGroup.GroupType.$$a
                int r6 = r6 * 2
                int r6 = r6 + 105
                int r8 = r8 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L2b
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L20
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L20:
                int r8 = r8 + 1
                r4 = r1[r8]
                int r3 = r3 + 1
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2b:
                int r6 = r6 + r8
                r8 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.RequestResultGroup.GroupType.$$c(int, int, int):java.lang.String");
        }

        private static final /* synthetic */ GroupType[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            GroupType[] groupTypeArr = {COMPLETE, DROP, FAIL, INSPECT, CANCEL, REQUEST, UNKNOWN};
            int i5 = i3 + 69;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return groupTypeArr;
            }
            throw null;
        }

        public static EnumEntries<GroupType> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<GroupType> enumEntries = $ENTRIES;
            int i5 = i3 + 41;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            throw null;
        }

        public static GroupType valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            GroupType groupType = (GroupType) Enum.valueOf(GroupType.class, str);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return groupType;
        }

        public static GroupType[] values() {
            GroupType[] groupTypeArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                groupTypeArr = (GroupType[]) $VALUES.clone();
                int i3 = 92 / 0;
            } else {
                groupTypeArr = (GroupType[]) $VALUES.clone();
            }
            int i4 = onExtraCallback + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
            }
            return groupTypeArr;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 37;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 51;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 65;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
            int i5 = IAuthTabCallback + 25;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 44 / 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0167  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 369
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.RequestResultGroup.GroupType.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }

        private GroupType(String str, int i, String str2) {
            this.sectionName = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* synthetic */ GroupType(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 1) != 0) {
                int i3 = onExtraCallback;
                int i4 = i3 + 5;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 123;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 / 5;
                } else {
                    int i8 = 2 % 2;
                }
                str2 = null;
            }
            this(str, i, str2);
        }

        public final String getSectionName() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 11;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.sectionName;
            int i4 = i2 + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        static {
            onWarmupCompleted = 0;
            onExtraCallbackWithResult();
            COMPLETE = new GroupType("COMPLETE", 0, "승인");
            DROP = new GroupType("DROP", 1, "대출 불가");
            Object[] objArr = new Object[1];
            a(View.resolveSizeAndState(0, 0, 0) + 4, 3 - Color.red(0), new char[]{2, 65530, 65535, 5}, true, ExpandableListView.getPackedPositionGroup(0L) + 241, objArr);
            FAIL = new GroupType(((String) objArr[0]).intern(), 2, "조회 실패");
            INSPECT = new GroupType("INSPECT", 3, "조회 실패");
            CANCEL = new GroupType("CANCEL", 4, "취소");
            REQUEST = new GroupType("REQUEST", 5, "요청 중");
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getWindowTouchSlop() >> 8) + 7, 6 - (ViewConfiguration.getEdgeSlop() >> 16), new char[]{65534, 65531, 65534, 65535, 7, 65534, 5}, false, (Process.myPid() >> 22) + 250, objArr2);
            UNKNOWN = new GroupType(((String) objArr2[0]).intern(), 6, null, 1, null);
            GroupType[] groupTypeArr$values = $values();
            $VALUES = groupTypeArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(groupTypeArr$values);
            CREATOR = new Creator();
            int i = onNavigationEvent + 73;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void onExtraCallbackWithResult() {
            onExtraCallbackWithResult = 478308995;
        }
    }

    public RequestResultGroup(@NotNull GroupType groupType, @NotNull String str, @NotNull String str2, boolean z, @NotNull List<RequestResult> list, long j) {
        Intrinsics.checkNotNullParameter(groupType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.groupType = groupType;
        this.groupTitle = str;
        this.groupDescription = str2;
        this.screeningRetryable = z;
        this.requestResults = list;
        this.notPreScreenedCompaniesCount = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RequestResultGroup(GroupType groupType, String str, String str2, boolean z, List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            groupType = GroupType.UNKNOWN;
        }
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) == 0 ? str2 : "";
        if ((i & 8) != 0) {
            int i4 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i4 % 128;
            z = i4 % 2 != 0;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            list = CollectionsKt.emptyList();
            int i5 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this(groupType, str3, str4, z2, list, (i & 32) != 0 ? 0L : j);
    }

    public final GroupType onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.groupType;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.groupTitle;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.groupDescription;
        }
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.screeningRetryable;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return z;
    }

    public final List<RequestResult> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<RequestResult> list = this.requestResults;
        int i5 = i2 + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
        return list;
    }
}

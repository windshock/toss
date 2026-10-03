package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class addPreOperation implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    @SerializedName("details")
    private final List<addUnbatchedOperation> details;

    @SerializedName("memberCount")
    private final int memberCount;

    @SerializedName("ownerAmount")
    private final Long ownerAmount;

    @SerializedName("ownerUserNo")
    private final long ownerUserNo;

    @SerializedName("payments")
    private final List<accesssetEnqueuedAnimationOnFramep> payments;

    @SerializedName("targetAmount")
    private final long targetAmount;

    @SerializedName("title")
    private final String title;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<addPreOperation> CREATOR = new onExtraCallback();

    public static final class onExtraCallback implements Parcelable.Creator<addPreOperation> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ addPreOperation createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            addPreOperation addpreoperationOnNavigationEvent = onNavigationEvent(parcel);
            if (i3 != 0) {
                int i4 = 92 / 0;
            }
            int i5 = IAuthTabCallback + 109;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return addpreoperationOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ addPreOperation[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 31;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            addPreOperation[] addpreoperationArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = IAuthTabCallback + 3;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return addpreoperationArrOnExtraCallbackWithResult;
        }

        public final addPreOperation[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 35;
            IAuthTabCallback = i4 % 128;
            addPreOperation[] addpreoperationArr = new addPreOperation[i];
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 125;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 98 / 0;
            }
            return addpreoperationArr;
        }

        public final addPreOperation onNavigationEvent(Parcel parcel) {
            Long lValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            int i4 = 0;
            while (i4 != i2) {
                arrayList.add(parcel.readParcelable(addPreOperation.class.getClassLoader()));
                i4++;
                int i5 = onExtraCallback + 11;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            if (parcel.readInt() == 0) {
                int i7 = IAuthTabCallback + 113;
                onExtraCallback = i7 % 128;
                lValueOf = null;
                if (i7 % 2 != 0) {
                    lValueOf.hashCode();
                    throw null;
                }
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string = parcel.readString();
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i9);
            while (i3 != i9) {
                arrayList2.add(accesssetEnqueuedAnimationOnFramep.CREATOR.createFromParcel(parcel));
                i3++;
                int i10 = onExtraCallback + 45;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 3 / 2;
                }
            }
            return new addPreOperation(arrayList, lValueOf, j, j2, string, i8, arrayList2);
        }
    }

    static {
        int i = onExtraCallback + 111;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public addPreOperation() {
        this(null, null, 0L, 0L, null, 0, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 9;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        List<addUnbatchedOperation> list = this.details;
        parcel.writeInt(list.size());
        Iterator<addUnbatchedOperation> it = list.iterator();
        while (!(!it.hasNext())) {
            parcel.writeParcelable(it.next(), i);
        }
        Long l = this.ownerAmount;
        if (l == null) {
            int i3 = IAuthTabCallback + 63;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
            int i4 = onWarmupCompleted + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        parcel.writeLong(this.ownerUserNo);
        parcel.writeLong(this.targetAmount);
        parcel.writeString(this.title);
        parcel.writeInt(this.memberCount);
        List<accesssetEnqueuedAnimationOnFramep> list2 = this.payments;
        parcel.writeInt(list2.size());
        Iterator<accesssetEnqueuedAnimationOnFramep> it2 = list2.iterator();
        while (it2.hasNext()) {
            int i6 = IAuthTabCallback + 7;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            it2.next().writeToParcel(parcel, i);
        }
    }

    public addPreOperation(@NotNull List<addUnbatchedOperation> list, @Nullable Long l, long j, long j2, @Nullable String str, int i, @NotNull List<accesssetEnqueuedAnimationOnFramep> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.details = list;
        this.ownerAmount = l;
        this.ownerUserNo = j;
        this.targetAmount = j2;
        this.title = str;
        this.memberCount = i;
        this.payments = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ addPreOperation(List list, Long l, long j, long j2, String str, int i, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Long l2;
        long j3;
        int i3;
        List listEmptyList = (i2 & 1) != 0 ? CollectionsKt.emptyList() : list;
        String str2 = null;
        if ((i2 & 2) != 0) {
            int i4 = IAuthTabCallback + 71;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            l2 = null;
        } else {
            l2 = l;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallback + 123;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            j3 = -1;
        } else {
            j3 = j;
        }
        long j4 = (i2 & 8) != 0 ? 0L : j2;
        if ((i2 & 16) != 0) {
            int i9 = 2 % 2;
        } else {
            str2 = str;
        }
        if ((i2 & 32) != 0) {
            int i10 = IAuthTabCallback + 115;
            onWarmupCompleted = i10 % 128;
            i3 = i10 % 2 == 0 ? 1 : 0;
        } else {
            i3 = i;
        }
        this(listEmptyList, l2, j3, j4, str2, i3, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final addPreOperation onNavigationEvent(@NotNull List<addUnbatchedOperation> list, long j, long j2, long j3, int i, @NotNull String str, @NotNull List<accesssetEnqueuedAnimationOnFramep> list2) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list2, "");
            addPreOperation addpreoperation = new addPreOperation(list, Long.valueOf(j), j2, j3, str, i, list2);
            int i3 = onExtraCallback + 125;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return addpreoperation;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}

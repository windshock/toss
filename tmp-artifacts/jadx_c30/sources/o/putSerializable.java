package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class putSerializable implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<putSerializable> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final List<Long> agreedTermIds;

    public static final class IAuthTabCallback implements Parcelable.Creator<putSerializable> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ putSerializable createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            putSerializable putserializableOnWarmupCompleted = onWarmupCompleted(parcel);
            if (i3 != 0) {
                int i4 = 3 / 0;
            }
            int i5 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return putserializableOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ putSerializable[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onNavigationEvent(i);
            }
            onNavigationEvent(i);
            throw null;
        }

        public final putSerializable[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i3 % 128;
            putSerializable[] putserializableArr = new putSerializable[i];
            if (i3 % 2 != 0) {
                int i4 = 80 / 0;
            }
            return putserializableArr;
        }

        public final putSerializable onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = onExtraCallbackWithResult + 39;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                    i3 += 120;
                } else {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                    i3++;
                }
                int i5 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 % 5;
                }
            }
            return new putSerializable(arrayList);
        }
    }

    static {
        int i = IAuthTabCallback + 95;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 44 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public putSerializable() {
        List list = null;
        this(list, 1, list);
    }

    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 103;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 69;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof putSerializable)) {
            int i6 = i3 + 43;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.agreedTermIds, ((putSerializable) obj).agreedTermIds)) {
            return true;
        }
        int i8 = onWarmupCompleted + 63;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.agreedTermIds.hashCode();
        int i4 = onWarmupCompleted + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TermsFormValue(agreedTermIds=" + this.agreedTermIds + ")";
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        List<Long> list = this.agreedTermIds;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        int i3 = onWarmupCompleted + 39;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = onWarmupCompleted + 85;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                parcel.writeLong(it.next().longValue());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            parcel.writeLong(it.next().longValue());
        }
    }

    public putSerializable(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.agreedTermIds = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ putSerializable(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i3 = 72 / 0;
            } else {
                list = CollectionsKt.emptyList();
            }
            int i4 = onExtraCallback + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(list);
    }
}

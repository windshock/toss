package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BenchmarkLimitsMs implements Parcelable {
    public static final Parcelable.Creator<BenchmarkLimitsMs> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<Repairable> rows;
    private final String title;

    public static final class onExtraCallback implements Parcelable.Creator<BenchmarkLimitsMs> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BenchmarkLimitsMs createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            BenchmarkLimitsMs benchmarkLimitsMsOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = IAuthTabCallback + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return benchmarkLimitsMsOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BenchmarkLimitsMs[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 43;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            BenchmarkLimitsMs[] benchmarkLimitsMsArrOnExtraCallback = onExtraCallback(i);
            int i5 = onNavigationEvent + 57;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return benchmarkLimitsMsArrOnExtraCallback;
            }
            throw null;
        }

        public final BenchmarkLimitsMs[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 37;
            onNavigationEvent = i3 % 128;
            BenchmarkLimitsMs[] benchmarkLimitsMsArr = new BenchmarkLimitsMs[i];
            if (i3 % 2 == 0) {
                return benchmarkLimitsMsArr;
            }
            throw null;
        }

        public final BenchmarkLimitsMs onExtraCallbackWithResult(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readString();
                parcel.readInt();
                obj.hashCode();
                throw null;
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList.add(Repairable.CREATOR.createFromParcel(parcel));
                }
            }
            BenchmarkLimitsMs benchmarkLimitsMs = new BenchmarkLimitsMs(string, arrayList);
            int i6 = IAuthTabCallback + 55;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return benchmarkLimitsMs;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 3;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BenchmarkLimitsMs() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 109;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        List<Repairable> list = this.rows;
        if (list == null) {
            parcel.writeInt(0);
            int i5 = onNavigationEvent + 109;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Repairable> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public BenchmarkLimitsMs(@Nullable String str, @Nullable List<Repairable> list) {
        this.title = str;
        this.rows = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BenchmarkLimitsMs(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            list = null;
        }
        this(str, list);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 125;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 119;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Repairable> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.rows;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

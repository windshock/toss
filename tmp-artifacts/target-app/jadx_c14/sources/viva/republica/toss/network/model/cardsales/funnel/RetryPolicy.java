package viva.republica.toss.network.model.cardsales.funnel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RetryPolicy implements Parcelable {
    public static final Parcelable.Creator<RetryPolicy> CREATOR = new Creator();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Long interval;
    private final Integer maxRetry;

    public static final class Creator implements Parcelable.Creator<RetryPolicy> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RetryPolicy createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            RetryPolicy retryPolicyOnWarmupCompleted = onWarmupCompleted(parcel);
            if (i3 != 0) {
                int i4 = 14 / 0;
            }
            return retryPolicyOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RetryPolicy[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            RetryPolicy[] retryPolicyArrOnExtraCallback = onExtraCallback(i);
            int i5 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return retryPolicyArrOnExtraCallback;
        }

        public final RetryPolicy[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            RetryPolicy[] retryPolicyArr = new RetryPolicy[i];
            int i6 = i3 + 43;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return retryPolicyArr;
        }

        public final RetryPolicy onWarmupCompleted(Parcel parcel) {
            Long lValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                int i2 = onExtraCallbackWithResult + 61;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    numValueOf.hashCode();
                    throw null;
                }
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                int i3 = onNavigationEvent + 111;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    numValueOf.hashCode();
                    throw null;
                }
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new RetryPolicy(lValueOf, numValueOf);
        }
    }

    static {
        int i = onWarmupCompleted + 69;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RetryPolicy() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 31;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.interval;
        if (l == null) {
            int i3 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.maxRetry;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
            return;
        }
        int i4 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
    }

    public RetryPolicy(@Nullable Long l, @Nullable Integer num) {
        this.interval = l;
        this.maxRetry = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RetryPolicy(Long l, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        l = (i & 1) != 0 ? null : l;
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 63;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 49;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            num = null;
        }
        this(l, num);
    }

    public final Long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 27;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.interval;
        int i5 = i2 + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public final Integer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.maxRetry;
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return num;
    }
}

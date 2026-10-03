package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class MultithreadedBundleWrapper implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<MultithreadedBundleWrapper> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final List<String> value;

    public static final class onWarmupCompleted implements Parcelable.Creator<MultithreadedBundleWrapper> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final MultithreadedBundleWrapper[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            MultithreadedBundleWrapper[] multithreadedBundleWrapperArr = new MultithreadedBundleWrapper[i];
            int i6 = i3 + 27;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return multithreadedBundleWrapperArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ MultithreadedBundleWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallback(parcel);
            }
            onExtraCallback(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ MultithreadedBundleWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            MultithreadedBundleWrapper[] multithreadedBundleWrapperArrIAuthTabCallback = IAuthTabCallback(i);
            if (i4 != 0) {
                int i5 = 13 / 0;
            }
            int i6 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return multithreadedBundleWrapperArrIAuthTabCallback;
        }

        public final MultithreadedBundleWrapper onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            MultithreadedBundleWrapper multithreadedBundleWrapper = new MultithreadedBundleWrapper(parcel.createStringArrayList());
            int i2 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return multithreadedBundleWrapper;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 123;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = (i2 % 2 != 0 ? 0 : 1) ^ 1;
        int i5 = i3 + 35;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultithreadedBundleWrapper)) {
            int i2 = onWarmupCompleted + 123;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.value, ((MultithreadedBundleWrapper) obj).value)) {
            return true;
        }
        int i3 = onWarmupCompleted;
        int i4 = i3 + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 51;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.value.hashCode();
        int i4 = IAuthTabCallback + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SelectLayoutFormValue(value=" + this.value + ")";
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeStringList(this.value);
            int i5 = 95 / 0;
        } else {
            parcel.writeStringList(this.value);
        }
        int i6 = IAuthTabCallback + 5;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 45 / 0;
        }
    }

    public MultithreadedBundleWrapper(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.value = list;
    }

    public final List<String> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<String> list = this.value;
        int i4 = i3 + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }
}

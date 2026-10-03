package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ANActivityLifecycleCallbacksListener implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<ANActivityLifecycleCallbacksListener> CREATOR = new onExtraCallbackWithResult();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<String> terms;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<ANActivityLifecycleCallbacksListener> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ANActivityLifecycleCallbacksListener createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallback(parcel);
                throw null;
            }
            ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListenerOnExtraCallback = onExtraCallback(parcel);
            int i3 = IAuthTabCallback + 29;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return aNActivityLifecycleCallbacksListenerOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ANActivityLifecycleCallbacksListener[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 19;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallback(i);
                throw null;
            }
            ANActivityLifecycleCallbacksListener[] aNActivityLifecycleCallbacksListenerArrOnExtraCallback = onExtraCallback(i);
            int i4 = onNavigationEvent + 123;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return aNActivityLifecycleCallbacksListenerArrOnExtraCallback;
            }
            throw null;
        }

        public final ANActivityLifecycleCallbacksListener onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = new ANActivityLifecycleCallbacksListener(parcel.createStringArrayList());
            int i2 = IAuthTabCallback + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return aNActivityLifecycleCallbacksListener;
        }

        public final ANActivityLifecycleCallbacksListener[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            ANActivityLifecycleCallbacksListener[] aNActivityLifecycleCallbacksListenerArr = new ANActivityLifecycleCallbacksListener[i];
            int i6 = i3 + 97;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return aNActivityLifecycleCallbacksListenerArr;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 101;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ANActivityLifecycleCallbacksListener) {
            return Intrinsics.areEqual(this.terms, ((ANActivityLifecycleCallbacksListener) obj).terms);
        }
        int i4 = i2 + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 + 53;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.terms.hashCode();
            int i3 = 3 / 0;
        } else {
            iHashCode = this.terms.hashCode();
        }
        int i4 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TermsWebFormValue(terms=" + this.terms + ")";
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.terms);
        int i5 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public ANActivityLifecycleCallbacksListener(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.terms = list;
    }
}

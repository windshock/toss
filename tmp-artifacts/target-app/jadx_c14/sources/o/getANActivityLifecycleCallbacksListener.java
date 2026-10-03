package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getANActivityLifecycleCallbacksListener implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<getANActivityLifecycleCallbacksListener> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final boolean success;

    public static final class IAuthTabCallback implements Parcelable.Creator<getANActivityLifecycleCallbacksListener> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.getANActivityLifecycleCallbacksListener IAuthTabCallback(android.os.Parcel r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.getANActivityLifecycleCallbacksListener.IAuthTabCallback.onExtraCallbackWithResult
                int r1 = r1 + 115
                int r2 = r1 % 128
                o.getANActivityLifecycleCallbacksListener.IAuthTabCallback.IAuthTabCallback = r2
                int r1 = r1 % r0
                java.lang.String r2 = ""
                r3 = 0
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
                int r5 = r5.readInt()
                if (r1 == 0) goto L1e
                r1 = 52
                int r1 = r1 / r3
                if (r5 == 0) goto L2e
                goto L20
            L1e:
                if (r5 == 0) goto L2e
            L20:
                int r5 = o.getANActivityLifecycleCallbacksListener.IAuthTabCallback.onExtraCallbackWithResult
                int r5 = r5 + 29
                int r1 = r5 % 128
                o.getANActivityLifecycleCallbacksListener.IAuthTabCallback.IAuthTabCallback = r1
                int r5 = r5 % r0
                if (r5 == 0) goto L2c
                goto L2e
            L2c:
                r5 = 1
                r3 = r5
            L2e:
                o.getANActivityLifecycleCallbacksListener r5 = new o.getANActivityLifecycleCallbacksListener
                r5.<init>(r3)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getANActivityLifecycleCallbacksListener.IAuthTabCallback.IAuthTabCallback(android.os.Parcel):o.getANActivityLifecycleCallbacksListener");
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getANActivityLifecycleCallbacksListener createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getANActivityLifecycleCallbacksListener getanactivitylifecyclecallbackslistenerIAuthTabCallback = IAuthTabCallback(parcel);
            if (i3 != 0) {
                int i4 = 78 / 0;
            }
            int i5 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return getanactivitylifecyclecallbackslistenerIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getANActivityLifecycleCallbacksListener[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getANActivityLifecycleCallbacksListener[] getanactivitylifecyclecallbackslistenerArrOnExtraCallback = onExtraCallback(i);
            int i5 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return getanactivitylifecyclecallbackslistenerArrOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final getANActivityLifecycleCallbacksListener[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 53;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            getANActivityLifecycleCallbacksListener[] getanactivitylifecyclecallbackslistenerArr = new getANActivityLifecycleCallbacksListener[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 115;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return getanactivitylifecyclecallbackslistenerArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 19;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 1;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getANActivityLifecycleCallbacksListener)) {
            int i6 = i4 + 71;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.success == ((getANActivityLifecycleCallbacksListener) obj).success) {
            return true;
        }
        int i8 = i2 + 47;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.success);
        int i4 = onNavigationEvent + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossPinFormValue(success=" + this.success + ")";
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 107;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.success ? 1 : 0);
        int i5 = IAuthTabCallback + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public getANActivityLifecycleCallbacksListener(boolean z) {
        this.success = z;
    }
}

package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class isExplicitTestMode implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<isExplicitTestMode> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final boolean success;

    public static final class IAuthTabCallback implements Parcelable.Creator<isExplicitTestMode> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final isExplicitTestMode IAuthTabCallback(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            if (i3 != 0) {
                parcel.readInt();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                int i4 = IAuthTabCallback + 113;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
            return new isExplicitTestMode(z);
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isExplicitTestMode createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback(parcel);
                throw null;
            }
            isExplicitTestMode isexplicittestmodeIAuthTabCallback = IAuthTabCallback(parcel);
            int i3 = onNavigationEvent + 77;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return isexplicittestmodeIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isExplicitTestMode[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 31;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                onWarmupCompleted(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            isExplicitTestMode[] isexplicittestmodeArrOnWarmupCompleted = onWarmupCompleted(i);
            int i4 = IAuthTabCallback + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return isexplicittestmodeArrOnWarmupCompleted;
        }

        public final isExplicitTestMode[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            isExplicitTestMode[] isexplicittestmodeArr = new isExplicitTestMode[i];
            int i6 = i3 + 57;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return isexplicittestmodeArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 91;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeInt(this.success ? 1 : 0);
        int i5 = onWarmupCompleted + 89;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
    }

    public isExplicitTestMode(boolean z) {
        this.success = z;
    }
}

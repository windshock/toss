package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isVisibleAnimation implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<isVisibleAnimation> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final String englishFirstName;
    private final String englishLastName;
    private final String rrn;

    public static final class onWarmupCompleted implements Parcelable.Creator<isVisibleAnimation> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final isVisibleAnimation IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            isVisibleAnimation isvisibleanimation = new isVisibleAnimation(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return isvisibleanimation;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isVisibleAnimation createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            isVisibleAnimation isvisibleanimationIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return isvisibleanimationIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isVisibleAnimation[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            isVisibleAnimation[] isvisibleanimationArrOnNavigationEvent = onNavigationEvent(i);
            if (i4 != 0) {
                int i5 = 17 / 0;
            }
            int i6 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return isvisibleanimationArrOnNavigationEvent;
        }

        public final isVisibleAnimation[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i3 % 128;
            isVisibleAnimation[] isvisibleanimationArr = new isVisibleAnimation[i];
            if (i3 % 2 != 0) {
                return isvisibleanimationArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 1;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof isVisibleAnimation)) {
            return false;
        }
        isVisibleAnimation isvisibleanimation = (isVisibleAnimation) obj;
        if (Intrinsics.areEqual(this.rrn, isvisibleanimation.rrn)) {
            return Intrinsics.areEqual(this.englishFirstName, isvisibleanimation.englishFirstName) && Intrinsics.areEqual(this.englishLastName, isvisibleanimation.englishLastName);
        }
        int i4 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.rrn.hashCode() * 31) + this.englishFirstName.hashCode()) * 31) + this.englishLastName.hashCode();
        int i4 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PersonalInfoFormValue(rrn=" + this.rrn + ", englishFirstName=" + this.englishFirstName + ", englishLastName=" + this.englishLastName + ")";
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.rrn);
        parcel.writeString(this.englishFirstName);
        parcel.writeString(this.englishLastName);
        if (i4 != 0) {
            int i5 = 1 / 0;
        }
    }

    public isVisibleAnimation(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.rrn = str;
        this.englishFirstName = str2;
        this.englishLastName = str3;
    }
}

package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableCheckXriverHasInited implements Parcelable {
    public static final Parcelable.Creator<enableCheckXriverHasInited> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 1;
    private static int onTransact;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final long onWarmupCompleted;

    public static final class onExtraCallback implements Parcelable.Creator<enableCheckXriverHasInited> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ enableCheckXriverHasInited createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(parcel);
            }
            onWarmupCompleted(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ enableCheckXriverHasInited[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            enableCheckXriverHasInited[] enablecheckxriverhasinitedArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = IAuthTabCallback + 11;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 41 / 0;
            }
            return enablecheckxriverhasinitedArrOnNavigationEvent;
        }

        public final enableCheckXriverHasInited[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 59;
            IAuthTabCallback = i3 % 128;
            enableCheckXriverHasInited[] enablecheckxriverhasinitedArr = new enableCheckXriverHasInited[i];
            if (i3 % 2 == 0) {
                return enablecheckxriverhasinitedArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final enableCheckXriverHasInited onWarmupCompleted(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readLong();
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                throw null;
            }
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                int i4 = IAuthTabCallback + 37;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
            return new enableCheckXriverHasInited(j, string, string2, z);
        }
    }

    static {
        int i = asBinder + 121;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableCheckXriverHasInited)) {
            return false;
        }
        enableCheckXriverHasInited enablecheckxriverhasinited = (enableCheckXriverHasInited) obj;
        if (this.onWarmupCompleted != enablecheckxriverhasinited.onWarmupCompleted || (!Intrinsics.areEqual(this.onExtraCallback, enablecheckxriverhasinited.onExtraCallback))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, enablecheckxriverhasinited.onExtraCallbackWithResult)) {
            int i4 = onTransact + 91;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.onNavigationEvent != enablecheckxriverhasinited.onNavigationEvent) {
            return false;
        }
        int i6 = onTransact + 39;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        onTransact = i2 % 128;
        return i2 % 2 != 0 ? (((((Long.hashCode(this.onWarmupCompleted) >>> 36) - this.onExtraCallback.hashCode()) * 36) >> this.onExtraCallbackWithResult.hashCode()) * 58) % Boolean.hashCode(this.onNavigationEvent) : (((((Long.hashCode(this.onWarmupCompleted) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + Boolean.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QuizHistory(creditQuizId=" + this.onWarmupCompleted + ", title=" + this.onExtraCallback + ", description=" + this.onExtraCallbackWithResult + ", isCorrect=" + this.onNavigationEvent + ")";
        int i2 = onTransact + 95;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 95;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeLong(this.onWarmupCompleted);
            parcel.writeString(this.onExtraCallback);
            parcel.writeString(this.onExtraCallbackWithResult);
            parcel.writeInt(this.onNavigationEvent ? 1 : 0);
            return;
        }
        parcel.writeLong(this.onWarmupCompleted);
        parcel.writeString(this.onExtraCallback);
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeInt(this.onNavigationEvent ? 1 : 0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public enableCheckXriverHasInited(long j, @NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onWarmupCompleted = j;
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = str2;
        this.onNavigationEvent = z;
    }
}

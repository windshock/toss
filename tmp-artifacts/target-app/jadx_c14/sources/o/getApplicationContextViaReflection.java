package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getApplicationContextViaReflection implements doCallInitialize {
    public static final Parcelable.Creator<getApplicationContextViaReflection> CREATOR = new onNavigationEvent();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<getApplicationContextViaReflection> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final getApplicationContextViaReflection[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getApplicationContextViaReflection[] getapplicationcontextviareflectionArr = new getApplicationContextViaReflection[i];
            int i6 = i3 + 57;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 88 / 0;
            }
            return getapplicationcontextviareflectionArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getApplicationContextViaReflection createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getApplicationContextViaReflection getapplicationcontextviareflectionOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onExtraCallback + 105;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 12 / 0;
            }
            return getapplicationcontextviareflectionOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getApplicationContextViaReflection[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 95;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            getApplicationContextViaReflection[] getapplicationcontextviareflectionArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = IAuthTabCallback + 43;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return getapplicationcontextviareflectionArrIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final getApplicationContextViaReflection onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            getApplicationContextViaReflection getapplicationcontextviareflection = new getApplicationContextViaReflection(parcel.readString());
            int i2 = onExtraCallback + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return getapplicationcontextviareflection;
        }
    }

    static {
        int i = onWarmupCompleted + 41;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getApplicationContextViaReflection() {
        String str = null;
        this(str, 1, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (obj instanceof getApplicationContextViaReflection) {
            return Intrinsics.areEqual(this.type, ((getApplicationContextViaReflection) obj).type);
        }
        int i6 = i2 + 75;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i2 + 25;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.type.hashCode();
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FaqLineContent(type=" + this.type + ")";
        int i2 = onExtraCallbackWithResult + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        int i5 = onExtraCallback + 77;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
    }

    public getApplicationContextViaReflection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getApplicationContextViaReflection(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 19;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = "LINE";
        }
        this(str);
    }
}

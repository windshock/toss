package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Repairable implements Parcelable {
    public static final Parcelable.Creator<Repairable> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String content;
    private final int depth;

    public static final class IAuthTabCallback implements Parcelable.Creator<Repairable> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Repairable IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Repairable repairable = new Repairable(parcel.readString(), parcel.readInt());
            int i2 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 74 / 0;
            }
            return repairable;
        }

        public final Repairable[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Repairable[] repairableArr = new Repairable[i];
            int i6 = i3 + 73;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return repairableArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Repairable createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Repairable repairableIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return repairableIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Repairable[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Repairable[] repairableArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 78 / 0;
            }
            return repairableArrIAuthTabCallback;
        }
    }

    static {
        int i = onExtraCallback + 99;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Repairable() {
        String str = null;
        this(str, 0, 3, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 1;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.content);
        parcel.writeInt(this.depth);
        int i5 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public Repairable(@Nullable String str, int i) {
        this.content = str;
        this.depth = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Repairable(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str = null;
        }
        if ((i2 & 2) != 0) {
            int i6 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(str, i);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.content;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.depth;
        }
        throw null;
    }
}

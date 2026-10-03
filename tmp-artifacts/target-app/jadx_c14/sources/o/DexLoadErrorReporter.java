package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DexLoadErrorReporter implements Parcelable {
    public static final Parcelable.Creator<DexLoadErrorReporter> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String subtitle;
    private final String title;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<DexLoadErrorReporter> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DexLoadErrorReporter createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            DexLoadErrorReporter dexLoadErrorReporterOnExtraCallback = onExtraCallback(parcel);
            int i4 = onNavigationEvent + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return dexLoadErrorReporterOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DexLoadErrorReporter[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 59;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            DexLoadErrorReporter[] dexLoadErrorReporterArrOnWarmupCompleted = onWarmupCompleted(i);
            if (i4 == 0) {
                int i5 = 7 / 0;
            }
            return dexLoadErrorReporterArrOnWarmupCompleted;
        }

        public final DexLoadErrorReporter onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DexLoadErrorReporter dexLoadErrorReporter = new DexLoadErrorReporter(parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return dexLoadErrorReporter;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final DexLoadErrorReporter[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 55;
            onNavigationEvent = i3 % 128;
            DexLoadErrorReporter[] dexLoadErrorReporterArr = new DexLoadErrorReporter[i];
            if (i3 % 2 != 0) {
                return dexLoadErrorReporterArr;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 5;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 34 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DexLoadErrorReporter() {
        String str = null;
        this(str, str, 3, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 117;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            int i5 = 39 / 0;
        } else {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
        }
        int i6 = onWarmupCompleted + 87;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public DexLoadErrorReporter(@Nullable String str, @Nullable String str2) {
        this.title = str;
        this.subtitle = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DexLoadErrorReporter(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 49;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i6 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 121;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.subtitle;
        }
        throw null;
    }
}

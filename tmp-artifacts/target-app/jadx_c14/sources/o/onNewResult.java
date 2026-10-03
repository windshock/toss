package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onNewResult implements Parcelable {
    public static final Parcelable.Creator<onNewResult> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String link;
    private final String title;

    public static final class onNavigationEvent implements Parcelable.Creator<onNewResult> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ onNewResult createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallback(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onNewResult onnewresultOnExtraCallback = onExtraCallback(parcel);
            int i3 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return onnewresultOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ onNewResult[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onNewResult[] onnewresultArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i4 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onnewresultArrOnExtraCallbackWithResult;
        }

        public final onNewResult onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            onNewResult onnewresult = new onNewResult(parcel.readString(), parcel.readString());
            int i2 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onnewresult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onNewResult[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 93;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            onNewResult[] onnewresultArr = new onNewResult[i];
            int i6 = i4 + 109;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return onnewresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 3;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(this.title);
            parcel.writeString(this.link);
            throw null;
        }
        parcel.writeString(this.title);
        parcel.writeString(this.link);
        int i5 = onNavigationEvent + 13;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
    }

    public onNewResult(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.link = str2;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 31;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.link;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

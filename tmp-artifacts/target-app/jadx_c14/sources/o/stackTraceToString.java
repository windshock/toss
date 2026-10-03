package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class stackTraceToString implements makeLoaderUnsafe, Parcelable {
    public static final Parcelable.Creator<stackTraceToString> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String content;
    private final String type;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<stackTraceToString> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ stackTraceToString createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            stackTraceToString stacktracetostringOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return stacktracetostringOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ stackTraceToString[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            stackTraceToString[] stacktracetostringArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return stacktracetostringArrOnExtraCallback;
        }

        public final stackTraceToString[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            stackTraceToString[] stacktracetostringArr = new stackTraceToString[i];
            int i6 = i3 + 7;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return stacktracetostringArr;
        }

        public final stackTraceToString onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            stackTraceToString stacktracetostring = new stackTraceToString(parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return stacktracetostring;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 37;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stackTraceToString)) {
            int i2 = onWarmupCompleted + 103;
            onNavigationEvent = i2 % 128;
            return i2 % 2 == 0;
        }
        stackTraceToString stacktracetostring = (stackTraceToString) obj;
        if (Intrinsics.areEqual(this.type, stacktracetostring.type)) {
            return Intrinsics.areEqual(this.content, stacktracetostring.content);
        }
        int i3 = onNavigationEvent + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.type.hashCode() * 31) + this.content.hashCode();
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ParagraphTypeModel(type=" + this.type + ", content=" + this.content + ")";
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 41 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.type);
            parcel.writeString(this.content);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        parcel.writeString(this.type);
        parcel.writeString(this.content);
        int i5 = onNavigationEvent + 21;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public stackTraceToString(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.content = str2;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.content;
        int i5 = i3 + 41;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}

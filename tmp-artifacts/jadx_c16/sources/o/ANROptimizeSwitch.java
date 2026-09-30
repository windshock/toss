package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ANROptimizeSwitch implements Parcelable {
    public static final Parcelable.Creator<ANROptimizeSwitch> CREATOR = new onExtraCallback();
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String IAuthTabCallback;
    private final String onNavigationEvent;

    static {
        int i = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 19;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof o.ANROptimizeSwitch) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (o.ANROptimizeSwitch) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 15;
        o.ANROptimizeSwitch.IAuthTabCallbackStub = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            int i4 = 30 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.hashCode();
            throw null;
        }
        int iHashCode2 = this.onNavigationEvent.hashCode();
        String str = this.IAuthTabCallback;
        if (str == null) {
            int i3 = IAuthTabCallbackStub + 37;
            onExtraCallback = i3 % 128;
            iHashCode = i3 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditNextTimeQuiz(title=" + this.onNavigationEvent + ", message=" + this.IAuthTabCallback + ")";
        int i2 = IAuthTabCallbackStub + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 117;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.onNavigationEvent);
        parcel.writeString(this.IAuthTabCallback);
        int i5 = IAuthTabCallbackStub + 93;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public ANROptimizeSwitch(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = str;
        this.IAuthTabCallback = str2;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 79;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}

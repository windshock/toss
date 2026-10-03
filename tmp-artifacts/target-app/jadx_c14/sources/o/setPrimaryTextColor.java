package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setPrimaryTextColor {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final String message;
    private final boolean result;
    private final String title;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPrimaryTextColor)) {
            return false;
        }
        setPrimaryTextColor setprimarytextcolor = (setPrimaryTextColor) obj;
        if (this.result != setprimarytextcolor.result) {
            int i5 = i3 + 7;
            onExtraCallback = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.title, setprimarytextcolor.title)) {
            int i6 = onNavigationEvent + 113;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.message, setprimarytextcolor.message)) {
            return true;
        }
        int i8 = onNavigationEvent + 3;
        onExtraCallback = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Boolean.hashCode(this.result);
            obj.hashCode();
            throw null;
        }
        int iHashCode = Boolean.hashCode(this.result);
        String str = this.title;
        int iHashCode2 = (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.message.hashCode();
        int i3 = onExtraCallback + 99;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode2;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssuePasswordVerifyResp(result=" + this.result + ", title=" + this.title + ", message=" + this.message + ")";
        int i2 = onNavigationEvent + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.result;
        int i5 = i3 + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 39;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.message;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

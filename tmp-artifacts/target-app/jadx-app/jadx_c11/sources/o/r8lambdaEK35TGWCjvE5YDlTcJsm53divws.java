package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaEK35TGWCjvE5YDlTcJsm53divws {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final shared IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public r8lambdaEK35TGWCjvE5YDlTcJsm53divws() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 81;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdaEK35TGWCjvE5YDlTcJsm53divws)) {
            int i7 = onWarmupCompleted + 119;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divws = (r8lambdaEK35TGWCjvE5YDlTcJsm53divws) obj;
        if (this.IAuthTabCallback != r8lambdaek35tgwcjve5ydltcjsm53divws.IAuthTabCallback) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, r8lambdaek35tgwcjve5ydltcjsm53divws.onExtraCallbackWithResult)) {
            return Intrinsics.areEqual(this.onNavigationEvent, r8lambdaek35tgwcjve5ydltcjsm53divws.onNavigationEvent);
        }
        int i9 = onWarmupCompleted + 93;
        onExtraCallback = i9 % 128;
        return i9 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int iHashCode = this.IAuthTabCallback.hashCode();
        String str = this.onExtraCallbackWithResult;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.onNavigationEvent;
        if (str2 != null) {
            int i2 = onWarmupCompleted + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode2 = str2.hashCode();
        }
        int i4 = (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
        int i5 = onWarmupCompleted + 85;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppOpenTriggerModel(type=" + this.IAuthTabCallback + ", schemeUrl=" + this.onExtraCallbackWithResult + ", pushId=" + this.onNavigationEvent + ")";
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public r8lambdaEK35TGWCjvE5YDlTcJsm53divws(@NotNull shared sharedVar, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(sharedVar, "");
        this.IAuthTabCallback = sharedVar;
        this.onExtraCallbackWithResult = str;
        this.onNavigationEvent = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambdaEK35TGWCjvE5YDlTcJsm53divws(shared sharedVar, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            sharedVar = shared.UNKNOWN;
            int i2 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 91;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 4) != 0) {
            int i5 = onWarmupCompleted + 113;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str2 = null;
        }
        this(sharedVar, str, str2);
    }

    public final shared IAuthTabCallback() {
        shared sharedVar;
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            sharedVar = this.IAuthTabCallback;
            int i4 = 97 / 0;
        } else {
            sharedVar = this.IAuthTabCallback;
        }
        int i5 = i3 + 123;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return sharedVar;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i3 + 115;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 65;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}

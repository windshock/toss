package im.toss.rn.toss.core.legacy.bundle.v2;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactBundle {
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private final String IAuthTabCallback;
    private final Long IAuthTabCallbackDefault;
    private final Long asBinder;
    private final String asInterface;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 53;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactBundle)) {
            return false;
        }
        ReactBundle reactBundle = (ReactBundle) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, reactBundle.IAuthTabCallback)) {
            int i3 = IAuthTabCallback_Parcel + 79;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, reactBundle.onWarmupCompleted) || !Intrinsics.areEqual(this.asInterface, reactBundle.asInterface)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, reactBundle.onExtraCallbackWithResult)) {
            int i5 = IAuthTabCallback_Parcel + 25;
            IAuthTabCallbackStub = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, reactBundle.onExtraCallback) || !Intrinsics.areEqual(this.onTransact, reactBundle.onTransact) || !Intrinsics.areEqual(this.asBinder, reactBundle.asBinder) || !Intrinsics.areEqual(this.IAuthTabCallbackDefault, reactBundle.IAuthTabCallbackDefault)) {
            return false;
        }
        if (this.onNavigationEvent != reactBundle.onNavigationEvent) {
            int i6 = IAuthTabCallback_Parcel + 43;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = IAuthTabCallback_Parcel + 15;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.IAuthTabCallback.hashCode();
        String str = this.onWarmupCompleted;
        int i2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.asInterface.hashCode();
        int iHashCode5 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode6 = this.onExtraCallback.hashCode();
        String str2 = this.onTransact;
        if (str2 == null) {
            int i3 = IAuthTabCallbackStub + 49;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        Long l = this.asBinder;
        int iHashCode7 = l == null ? 0 : l.hashCode();
        Long l2 = this.IAuthTabCallbackDefault;
        if (l2 != null) {
            int i5 = IAuthTabCallbackStub + 89;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            int iHashCode8 = l2.hashCode();
            if (i6 == 0) {
                int i7 = 83 / 0;
            }
            i2 = iHashCode8;
        }
        return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + i2) * 31) + Boolean.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReactBundle(bundleName=" + this.IAuthTabCallback + ", filePath=" + this.onWarmupCompleted + ", signature=" + this.asInterface + ", deploymentId=" + this.onExtraCallbackWithResult + ", deployedAt=" + this.onExtraCallback + ", sharedMinDeployedAt=" + this.onTransact + ", savedAt=" + this.asBinder + ", updatedAt=" + this.IAuthTabCallbackDefault + ", isFromCache=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallback_Parcel + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ReactBundle(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable Long l, @Nullable Long l2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = str2;
        this.asInterface = str3;
        this.onExtraCallbackWithResult = str4;
        this.onExtraCallback = str5;
        this.onTransact = str6;
        this.asBinder = l;
        this.IAuthTabCallbackDefault = l2;
        this.onNavigationEvent = z;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 51;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 123;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 51;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallback;
        int i5 = i3 + 15;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        String str = this.onTransact;
        int i5 = i3 + 51;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean asBinder() {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 107;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.onNavigationEvent;
            int i4 = 82 / 0;
        } else {
            z = this.onNavigationEvent;
        }
        int i5 = i2 + 43;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }
}

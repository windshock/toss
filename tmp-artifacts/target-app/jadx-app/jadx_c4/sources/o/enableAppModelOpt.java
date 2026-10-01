package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableAppModelOpt {
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    private final Long IAuthTabCallback;
    private final Integer onExtraCallback;
    private final Boolean onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 23;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 9;
            IAuthTabCallbackStub = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!(obj instanceof enableAppModelOpt)) {
            int i7 = i4 + 99;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        enableAppModelOpt enableappmodelopt = (enableAppModelOpt) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, enableappmodelopt.onWarmupCompleted)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, enableappmodelopt.onExtraCallback)) {
            return Intrinsics.areEqual(this.onNavigationEvent, enableappmodelopt.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallback, enableappmodelopt.IAuthTabCallback) && !(Intrinsics.areEqual(this.onExtraCallbackWithResult, enableappmodelopt.onExtraCallbackWithResult) ^ true);
        }
        int i9 = onTransact + 11;
        IAuthTabCallbackStub = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 59 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.onWarmupCompleted.hashCode();
        Integer num = this.onExtraCallback;
        int iHashCode4 = 0;
        if (num == null) {
            int i2 = onTransact;
            int i3 = i2 + 47;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 7;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        String str = this.onNavigationEvent;
        if (str == null) {
            int i7 = onTransact + 123;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        Long l = this.IAuthTabCallback;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        Boolean bool = this.onExtraCallbackWithResult;
        if (bool != null) {
            int i9 = IAuthTabCallbackStub + 21;
            onTransact = i9 % 128;
            if (i9 % 2 != 0) {
                bool.hashCode();
                throw null;
            }
            iHashCode4 = bool.hashCode();
        }
        return (((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanManagementBanner(linkUrl=" + this.onWarmupCompleted + ", remainingMissionCount=" + this.onExtraCallback + ", title=" + this.onNavigationEvent + ", rewardAmount=" + this.IAuthTabCallback + ", isCompleted=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallbackStub + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public enableAppModelOpt(@NotNull String str, @Nullable Integer num, @Nullable String str2, @Nullable Long l, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
        this.onExtraCallback = num;
        this.onNavigationEvent = str2;
        this.IAuthTabCallback = l;
        this.onExtraCallbackWithResult = bool;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 73;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 107;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 21;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.onExtraCallbackWithResult;
        int i5 = i2 + 61;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        throw null;
    }
}

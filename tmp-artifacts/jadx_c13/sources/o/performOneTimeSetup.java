package o;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class performOneTimeSetup implements unload {
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent;
    private final Integer IAuthTabCallback;
    private final String onExtraCallback;
    private final deprecated_followRedirects onExtraCallbackWithResult;
    private final Function0<Unit> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof performOneTimeSetup)) {
            int i5 = i3 + 61;
            IAuthTabCallbackStub = i5 % 128;
            return i5 % 2 == 0;
        }
        performOneTimeSetup performonetimesetup = (performOneTimeSetup) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, performonetimesetup.onExtraCallback) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, performonetimesetup.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.IAuthTabCallback, performonetimesetup.IAuthTabCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, performonetimesetup.onWarmupCompleted)) {
            return false;
        }
        int i6 = IAuthTabCallbackStub + 125;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.onExtraCallback.hashCode();
        deprecated_followRedirects deprecated_followredirects = this.onExtraCallbackWithResult;
        int iHashCode3 = deprecated_followredirects == null ? 0 : deprecated_followredirects.hashCode();
        Integer num = this.IAuthTabCallback;
        if (num == null) {
            int i2 = IAuthTabCallbackStub + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
            int i4 = onNavigationEvent + 61;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        Function0<Unit> function0 = this.onWarmupCompleted;
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + (function0 != null ? function0.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsMenuV1Menu(title=" + this.onExtraCallback + ", resource=" + this.onExtraCallbackWithResult + ", resourceTintColor=" + this.IAuthTabCallback + ", onClicked=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallbackStub + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public performOneTimeSetup(@NotNull String str, @Nullable deprecated_followRedirects deprecated_followredirects, @Nullable Integer num, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = deprecated_followredirects;
        this.IAuthTabCallback = num;
        this.onWarmupCompleted = function0;
    }

    @Override // o.unload
    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final deprecated_followRedirects onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        deprecated_followRedirects deprecated_followredirects = this.onExtraCallbackWithResult;
        int i5 = i2 + 53;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_followredirects;
    }

    public final Integer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 23;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.IAuthTabCallback;
        int i5 = i2 + 65;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Function0<Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Function0<Unit> function0 = this.onWarmupCompleted;
        int i5 = i2 + 19;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return function0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ performOneTimeSetup(String str, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 93;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 57;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            function0 = null;
        }
        this(str, function0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public performOneTimeSetup(@NotNull String str, @Nullable Function0<Unit> function0) {
        this(str, (deprecated_followRedirects) null, (Integer) null, function0);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ performOneTimeSetup(String str, String str2, Integer num, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = onNavigationEvent + 27;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            num = null;
        }
        if ((i & 8) != 0) {
            int i4 = onNavigationEvent + 39;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 71 / 0;
            }
            function0 = null;
        }
        this(str, str2, num, (Function0<Unit>) function0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public performOneTimeSetup(@NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable Function0<Unit> function0) {
        Context contextOnWarmupCompleted;
        int i;
        Intrinsics.checkNotNullParameter(str, "");
        deprecated_followRedirects deprecated_followredirectsOnWarmupCompleted = null;
        if (str2 != null) {
            int i2 = onNavigationEvent + 81;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                contextOnWarmupCompleted = getTcfVendorConsentStatus.Companion.onWarmupCompleted();
                i = 5;
            } else {
                contextOnWarmupCompleted = getTcfVendorConsentStatus.Companion.onWarmupCompleted();
                i = 4;
            }
            deprecated_followredirectsOnWarmupCompleted = deprecated_followSslRedirects.onWarmupCompleted(str2, contextOnWarmupCompleted, (deprecated_callTimeoutMillis) null, i, (Object) null);
            int i3 = 2 % 2;
        }
        this(str, deprecated_followredirectsOnWarmupCompleted, num, function0);
    }
}

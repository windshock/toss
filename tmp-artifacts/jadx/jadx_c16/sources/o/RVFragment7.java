package o;

import kotlin.jvm.internal.Intrinsics;
import o.showError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVFragment7 {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    public static final int onNavigationEvent = 8;
    private final showError IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RVFragment7)) {
            int i2 = IAuthTabCallbackStub + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        RVFragment7 rVFragment7 = (RVFragment7) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, rVFragment7.IAuthTabCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, rVFragment7.onWarmupCompleted)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, rVFragment7.onExtraCallbackWithResult)) {
            return true;
        }
        int i4 = IAuthTabCallbackStub + 111;
        onExtraCallback = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.IAuthTabCallback.hashCode();
        String str = this.onWarmupCompleted;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.onExtraCallbackWithResult;
        if (str2 != null) {
            int i4 = IAuthTabCallbackStub + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = str2.hashCode();
        }
        int i6 = (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
        int i7 = IAuthTabCallbackStub + 109;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AutomationOverlayConfig(type=" + this.IAuthTabCallback + ", bottomCtaText=" + this.onWarmupCompleted + ", bottomCtaOnAction=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 21;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public RVFragment7(@NotNull showError showerror, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(showerror, "");
        this.IAuthTabCallback = showerror;
        this.onWarmupCompleted = str;
        this.onExtraCallbackWithResult = str2;
    }

    public final showError asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        showError showerror = this.IAuthTabCallback;
        int i5 = i3 + 109;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return showerror;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RVFragment2 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        showError.onExtraCallback.onExtraCallback onextracallback = this.IAuthTabCallback;
        if (!(onextracallback instanceof showError.IAuthTabCallback.IAuthTabCallback)) {
            int i5 = i2 + 49;
            int i6 = i5 % 128;
            onExtraCallback = i6;
            int i7 = i5 % 2;
            if (!(onextracallback instanceof showError.IAuthTabCallback.onWarmupCompleted)) {
                int i8 = i6 + 79;
                IAuthTabCallbackStub = i8 % 128;
                Object obj = null;
                if (i8 % 2 == 0) {
                    boolean z = onextracallback instanceof showError.onExtraCallbackWithResult.onWarmupCompleted;
                    obj.hashCode();
                    throw null;
                }
                if (!(onextracallback instanceof showError.onExtraCallbackWithResult.onWarmupCompleted) && !(onextracallback instanceof showError.onExtraCallbackWithResult.onExtraCallbackWithResult) && !(onextracallback instanceof showError.onNavigationEvent.onExtraCallback)) {
                    if (onextracallback instanceof showError.onExtraCallback.onExtraCallback) {
                        if (onextracallback.onNavigationEvent()) {
                            int i9 = onExtraCallback + 23;
                            IAuthTabCallbackStub = i9 % 128;
                            int i10 = i9 % 2;
                            return RVFragment2.None;
                        }
                        RVFragment2 rVFragment2 = RVFragment2.WithGradient;
                        int i11 = IAuthTabCallbackStub + 63;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        return rVFragment2;
                    }
                    if (!(onextracallback instanceof showError.onWarmupCompleted.onExtraCallback)) {
                        return RVFragment2.None;
                    }
                    if (!((showError.onWarmupCompleted.onExtraCallback) onextracallback).onExtraCallbackWithResult()) {
                        return RVFragment2.TouchOnly;
                    }
                    int i13 = IAuthTabCallbackStub + 109;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    RVFragment2 rVFragment22 = RVFragment2.None;
                    int i15 = IAuthTabCallbackStub + 87;
                    onExtraCallback = i15 % 128;
                    if (i15 % 2 == 0) {
                        return rVFragment22;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
        }
        return RVFragment2.WithGradient;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = !(this.IAuthTabCallback instanceof showError.onExtraCallback.onExtraCallback);
        int i5 = i2 + 17;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.IAuthTabCallback instanceof showError.IAuthTabCallback.IAuthTabCallback;
        return i3 == 0 ? z : !z;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 7;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        boolean z = !(this.IAuthTabCallback instanceof showError.IAuthTabCallback.IAuthTabCallback);
        int i5 = i2 + 125;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return z;
    }
}

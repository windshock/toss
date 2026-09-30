package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class getAllProfileNames$onExtraCallback {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult;
    private final int IAuthTabCallback;
    private final int onExtraCallback;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAllProfileNames$onExtraCallback)) {
            int i2 = onExtraCallbackWithResult + 121;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        getAllProfileNames$onExtraCallback getallprofilenames_onextracallback = (getAllProfileNames$onExtraCallback) obj;
        if (this.onExtraCallback != getallprofilenames_onextracallback.onExtraCallback || this.IAuthTabCallback != getallprofilenames_onextracallback.IAuthTabCallback) {
            return false;
        }
        if (this.onWarmupCompleted != getallprofilenames_onextracallback.onWarmupCompleted) {
            int i4 = onExtraCallbackWithResult + 67;
            IAuthTabCallbackStub = i4 % 128;
            return i4 % 2 == 0;
        }
        if (this.onNavigationEvent == getallprofilenames_onextracallback.onNavigationEvent) {
            return true;
        }
        int i5 = IAuthTabCallbackStub + 105;
        int i6 = i5 % 128;
        onExtraCallbackWithResult = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 81;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((Integer.hashCode(this.onExtraCallback) * 31) + Integer.hashCode(this.IAuthTabCallback)) * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Integer.hashCode(this.onNavigationEvent);
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WindowSnapshot(windowFlags=" + this.onExtraCallback + ", systemUiVisibility=" + this.IAuthTabCallback + ", statusBarColor=" + this.onWarmupCompleted + ", navigationBarColor=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallbackStub + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public getAllProfileNames$onExtraCallback(int i, int i2, int i3, int i4) {
        this.onExtraCallback = i;
        this.IAuthTabCallback = i2;
        this.onWarmupCompleted = i3;
        this.onNavigationEvent = i4;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.onExtraCallback;
        int i5 = i3 + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i3 + 15;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 63;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i2 + 103;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.onNavigationEvent;
        int i5 = i3 + 53;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }
}

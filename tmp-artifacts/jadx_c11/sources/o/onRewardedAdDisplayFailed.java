package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onRewardedAdDisplayFailed {
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asInterface;
    private static int onTransact;
    private final boolean IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final boolean asBinder;
    private final boolean onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final boolean onWarmupCompleted;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final onRewardedAdDisplayFailed onExtraCallback = new onRewardedAdDisplayFailed(false, false, false, false, false, false);

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onRewardedAdDisplayFailed)) {
            int i2 = onTransact + 1;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        onRewardedAdDisplayFailed onrewardedaddisplayfailed = (onRewardedAdDisplayFailed) obj;
        if (this.IAuthTabCallback != onrewardedaddisplayfailed.IAuthTabCallback || this.onWarmupCompleted != onrewardedaddisplayfailed.onWarmupCompleted || this.onNavigationEvent != onrewardedaddisplayfailed.onNavigationEvent || this.onExtraCallbackWithResult != onrewardedaddisplayfailed.onExtraCallbackWithResult) {
            return false;
        }
        if (this.asBinder != onrewardedaddisplayfailed.asBinder) {
            int i4 = IAuthTabCallback_Parcel + 9;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.IAuthTabCallbackDefault == onrewardedaddisplayfailed.IAuthTabCallbackDefault) {
            return true;
        }
        int i6 = IAuthTabCallback_Parcel;
        int i7 = i6 + 103;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 19;
        onTransact = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Boolean.hashCode(this.IAuthTabCallback) * 31) + Boolean.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onNavigationEvent)) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult)) * 31) + Boolean.hashCode(this.asBinder)) * 31) + Boolean.hashCode(this.IAuthTabCallbackDefault);
        int i4 = onTransact + 25;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnActivityWindowState(hasActivity=" + this.IAuthTabCallback + ", activityFinishing=" + this.onWarmupCompleted + ", activityDestroyed=" + this.onNavigationEvent + ", hasWindow=" + this.onExtraCallbackWithResult + ", windowDecorAttached=" + this.asBinder + ", windowTokenAvailable=" + this.IAuthTabCallbackDefault + ")";
        int i2 = onTransact + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public onRewardedAdDisplayFailed(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.IAuthTabCallback = z;
        this.onWarmupCompleted = z2;
        this.onNavigationEvent = z3;
        this.onExtraCallbackWithResult = z4;
        this.asBinder = z5;
        this.IAuthTabCallbackDefault = z6;
    }

    public static final /* synthetic */ onRewardedAdDisplayFailed onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 9;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        onRewardedAdDisplayFailed onrewardedaddisplayfailed = onExtraCallback;
        int i5 = i2 + 27;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return onrewardedaddisplayfailed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if ((!r6.IAuthTabCallbackDefault) != true) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (this.IAuthTabCallback) {
            int i2 = onTransact;
            int i3 = i2 + 13;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 78 / 0;
                if (!this.onWarmupCompleted) {
                    if (!this.onNavigationEvent && this.onExtraCallbackWithResult) {
                        int i5 = i2 + 69;
                        int i6 = i5 % 128;
                        IAuthTabCallback_Parcel = i6;
                        if (i5 % 2 != 0) {
                            if (!this.asBinder) {
                            }
                            int i7 = i6 + 11;
                            onTransact = i7 % 128;
                            int i8 = i7 % 2;
                            return true;
                        }
                        int i9 = 44 / 0;
                        if (!this.asBinder) {
                        }
                        int i72 = i6 + 11;
                        onTransact = i72 % 128;
                        int i82 = i72 % 2;
                        return true;
                    }
                }
            } else if (!this.onWarmupCompleted) {
            }
        }
        return false;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final onRewardedAdDisplayFailed onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onRewardedAdDisplayFailed onrewardedaddisplayfailedOnNavigationEvent = onRewardedAdDisplayFailed.onNavigationEvent();
            int i4 = onWarmupCompleted + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onrewardedaddisplayfailedOnNavigationEvent;
            }
            throw null;
        }
    }

    static {
        int i = asInterface + 5;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }
}

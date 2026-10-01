package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onRewardedAdLoadFailed {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onTransact = 1;
    private final boolean IAuthTabCallback;
    private final boolean asBinder;
    private final boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static final onRewardedAdLoadFailed onWarmupCompleted = new onRewardedAdLoadFailed(false, false, false, false, false);

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub + 93;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 19;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof onRewardedAdLoadFailed)) {
            int i6 = IAuthTabCallbackStub + 11;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        onRewardedAdLoadFailed onrewardedadloadfailed = (onRewardedAdLoadFailed) obj;
        if (this.onExtraCallback != onrewardedadloadfailed.onExtraCallback) {
            int i8 = IAuthTabCallbackStub + 3;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.asBinder != onrewardedadloadfailed.asBinder) {
            return false;
        }
        if (this.onNavigationEvent != onrewardedadloadfailed.onNavigationEvent) {
            int i10 = IAuthTabCallbackStub + 99;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.IAuthTabCallback == onrewardedadloadfailed.IAuthTabCallback) {
            return this.onExtraCallbackWithResult == onrewardedadloadfailed.onExtraCallbackWithResult;
        }
        int i12 = asInterface + 25;
        IAuthTabCallbackStub = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Boolean.hashCode(this.onExtraCallback) * 31) + Boolean.hashCode(this.asBinder)) * 31) + Boolean.hashCode(this.onNavigationEvent)) * 31) + Boolean.hashCode(this.IAuthTabCallback)) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
        int i4 = asInterface + 1;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnFragmentPolicy(createFragmentOnTabEnter=" + this.onExtraCallback + ", showExistingFragmentOnSearchEntry=" + this.asBinder + ", createFragmentOnSearchEntry=" + this.onNavigationEvent + ", moveToAnotherFragmentManagerOnSearchEntry=" + this.IAuthTabCallback + ", removeFragmentOnTabLeave=" + this.onExtraCallbackWithResult + ")";
        int i2 = asInterface + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public onRewardedAdLoadFailed(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.onExtraCallback = z;
        this.asBinder = z2;
        this.onNavigationEvent = z3;
        this.IAuthTabCallback = z4;
        this.onExtraCallbackWithResult = z5;
    }

    public static final /* synthetic */ onRewardedAdLoadFailed onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 11;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        onRewardedAdLoadFailed onrewardedadloadfailed = onWarmupCompleted;
        int i5 = i2 + 59;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return onrewardedadloadfailed;
        }
        throw null;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i3 + 93;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = this.asBinder;
        int i5 = i3 + 19;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = this.onNavigationEvent;
        int i5 = i3 + 83;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 3;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.IAuthTabCallback;
        int i5 = i2 + 95;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean onNavigationEvent() {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            z = this.onExtraCallbackWithResult;
            int i4 = 17 / 0;
        } else {
            z = this.onExtraCallbackWithResult;
        }
        int i5 = i3 + 121;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return z;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final onRewardedAdLoadFailed IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onRewardedAdLoadFailed onrewardedadloadfailedOnWarmupCompleted = onRewardedAdLoadFailed.onWarmupCompleted();
            int i4 = IAuthTabCallback + 99;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onrewardedadloadfailedOnWarmupCompleted;
        }
    }

    static {
        int i = onTransact + 95;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}

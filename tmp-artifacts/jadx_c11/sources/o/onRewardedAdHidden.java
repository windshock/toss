package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onRewardedAdHidden {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final boolean IAuthTabCallback;
    private final boolean onExtraCallbackWithResult;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static final onRewardedAdHidden onExtraCallback = new onRewardedAdHidden(false, false);

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackDefault + 101;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 21;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof onRewardedAdHidden) {
            onRewardedAdHidden onrewardedadhidden = (onRewardedAdHidden) obj;
            if (this.onExtraCallbackWithResult == onrewardedadhidden.onExtraCallbackWithResult) {
                return this.IAuthTabCallback == onrewardedadhidden.IAuthTabCallback;
            }
            int i7 = IAuthTabCallbackStub + 75;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = IAuthTabCallbackStub + 51;
        IAuthTabCallbackDefault = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        IAuthTabCallbackStub = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (Boolean.hashCode(this.onExtraCallbackWithResult) >> 28) * Boolean.hashCode(this.IAuthTabCallback) : (Boolean.hashCode(this.onExtraCallbackWithResult) * 31) + Boolean.hashCode(this.IAuthTabCallback);
        int i3 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 73 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnBackPressPolicy(dispatchToReactHistoryFirst=" + this.onExtraCallbackWithResult + ", hideFragmentWhenReactCannotGoBack=" + this.IAuthTabCallback + ")";
        int i2 = IAuthTabCallbackStub + 99;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
        return str;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final onRewardedAdHidden onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onRewardedAdHidden onrewardedadhiddenOnExtraCallback = onRewardedAdHidden.onExtraCallback();
            int i4 = onWarmupCompleted + 71;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onrewardedadhiddenOnExtraCallback;
            }
            throw null;
        }
    }

    public onRewardedAdHidden(boolean z, boolean z2) {
        this.onExtraCallbackWithResult = z;
        this.IAuthTabCallback = z2;
    }

    public static final /* synthetic */ onRewardedAdHidden onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 9;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        onRewardedAdHidden onrewardedadhidden = onExtraCallback;
        int i5 = i2 + 27;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return onrewardedadhidden;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 51;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.onExtraCallbackWithResult;
        int i4 = i2 + 57;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return z;
    }

    static {
        int i = onNavigationEvent + 53;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 20 / 0;
        }
    }
}

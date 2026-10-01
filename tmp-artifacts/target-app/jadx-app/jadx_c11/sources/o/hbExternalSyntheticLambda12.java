package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hbExternalSyntheticLambda12 {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onTransact = 1;
    private final int IAuthTabCallback;
    private final int asBinder;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onWarmupCompleted;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final hbExternalSyntheticLambda12 onNavigationEvent = new hbExternalSyntheticLambda12(0, 0, 0, 0, 0);

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 61;
        int i4 = i3 % 128;
        asInterface = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 77;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof hbExternalSyntheticLambda12)) {
            return false;
        }
        hbExternalSyntheticLambda12 hbexternalsyntheticlambda12 = (hbExternalSyntheticLambda12) obj;
        if (this.asBinder != hbexternalsyntheticlambda12.asBinder) {
            int i6 = i4 + 91;
            IAuthTabCallbackDefault = i6 % 128;
            boolean z = i6 % 2 != 0;
            int i7 = i4 + 69;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                return z;
            }
            throw null;
        }
        if (this.onExtraCallbackWithResult == hbexternalsyntheticlambda12.onExtraCallbackWithResult) {
            if (this.IAuthTabCallback != hbexternalsyntheticlambda12.IAuthTabCallback || this.onWarmupCompleted != hbexternalsyntheticlambda12.onWarmupCompleted) {
                return false;
            }
            if (this.onExtraCallback == hbexternalsyntheticlambda12.onExtraCallback) {
                return true;
            }
            int i8 = i2 + 121;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = i4 + 101;
        int i11 = i10 % 128;
        IAuthTabCallbackDefault = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 45;
        asInterface = i13 % 128;
        if (i13 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Integer.hashCode(this.asBinder) * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + Integer.hashCode(this.IAuthTabCallback)) * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Integer.hashCode(this.onExtraCallback);
        int i4 = asInterface + 79;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnOwnedOverlayDismissCount(trackedCount=" + this.asBinder + ", showingCount=" + this.onExtraCallbackWithResult + ", dismissedCount=" + this.IAuthTabCallback + ", skippedCount=" + this.onWarmupCompleted + ", failedCount=" + this.onExtraCallback + ")";
        int i2 = asInterface + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public hbExternalSyntheticLambda12(int i, int i2, int i3, int i4, int i5) {
        this.asBinder = i;
        this.onExtraCallbackWithResult = i2;
        this.IAuthTabCallback = i3;
        this.onWarmupCompleted = i4;
        this.onExtraCallback = i5;
    }

    public static final /* synthetic */ hbExternalSyntheticLambda12 onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 123;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        hbExternalSyntheticLambda12 hbexternalsyntheticlambda12 = onNavigationEvent;
        int i4 = i2 + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return hbexternalsyntheticlambda12;
    }

    public static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final hbExternalSyntheticLambda12 onExtraCallbackWithResult() {
            hbExternalSyntheticLambda12 hbexternalsyntheticlambda12OnExtraCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                hbexternalsyntheticlambda12OnExtraCallback = hbExternalSyntheticLambda12.onExtraCallback();
                int i3 = 12 / 0;
            } else {
                hbexternalsyntheticlambda12OnExtraCallback = hbExternalSyntheticLambda12.onExtraCallback();
            }
            int i4 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return hbexternalsyntheticlambda12OnExtraCallback;
            }
            throw null;
        }
    }

    static {
        int i = onTransact + 31;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }
}

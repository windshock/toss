package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hbExternalSyntheticLambda10 {
    public static final onExtraCallback Companion;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static final hbExternalSyntheticLambda10 onExtraCallbackWithResult = new hbExternalSyntheticLambda10(0, 0, 0, 0, 0);
    private static int onTransact;
    private final int IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final int onExtraCallback;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 5;
        int i4 = i3 % 128;
        asInterface = i4;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 43;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof hbExternalSyntheticLambda10)) {
            int i7 = i2 + 63;
            asInterface = i7 % 128;
            boolean z = i7 % 2 != 0;
            int i8 = i2 + 87;
            asInterface = i8 % 128;
            if (i8 % 2 == 0) {
                return z;
            }
            throw null;
        }
        hbExternalSyntheticLambda10 hbexternalsyntheticlambda10 = (hbExternalSyntheticLambda10) obj;
        if (this.IAuthTabCallbackDefault != hbexternalsyntheticlambda10.IAuthTabCallbackDefault) {
            return false;
        }
        if (this.onExtraCallback != hbexternalsyntheticlambda10.onExtraCallback) {
            int i9 = i2 + 117;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.IAuthTabCallback != hbexternalsyntheticlambda10.IAuthTabCallback || this.onWarmupCompleted != hbexternalsyntheticlambda10.onWarmupCompleted || this.onNavigationEvent != hbexternalsyntheticlambda10.onNavigationEvent) {
            return false;
        }
        int i11 = i2 + 53;
        asInterface = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Integer.hashCode(this.IAuthTabCallbackDefault) * 31) + Integer.hashCode(this.onExtraCallback)) * 31) + Integer.hashCode(this.IAuthTabCallback)) * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Integer.hashCode(this.onNavigationEvent);
        int i4 = IAuthTabCallbackStub + 61;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnOwnedWindowOverlayDetachCount(trackedCount=" + this.IAuthTabCallbackDefault + ", attachedCount=" + this.onExtraCallback + ", detachedCount=" + this.IAuthTabCallback + ", skippedCount=" + this.onWarmupCompleted + ", failedCount=" + this.onNavigationEvent + ")";
        int i2 = asInterface + 21;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public hbExternalSyntheticLambda10(int i, int i2, int i3, int i4, int i5) {
        this.IAuthTabCallbackDefault = i;
        this.onExtraCallback = i2;
        this.IAuthTabCallback = i3;
        this.onWarmupCompleted = i4;
        this.onNavigationEvent = i5;
    }

    public static final /* synthetic */ hbExternalSyntheticLambda10 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final hbExternalSyntheticLambda10 onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            hbExternalSyntheticLambda10 hbexternalsyntheticlambda10OnWarmupCompleted = hbExternalSyntheticLambda10.onWarmupCompleted();
            int i4 = onWarmupCompleted + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return hbexternalsyntheticlambda10OnWarmupCompleted;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = asBinder + 83;
        onTransact = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}

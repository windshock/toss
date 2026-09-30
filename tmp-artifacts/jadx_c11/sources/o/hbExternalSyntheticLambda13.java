package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hbExternalSyntheticLambda13 {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;
    private static int onNavigationEvent = 1;
    private final boolean onExtraCallback;
    private final boolean onWarmupCompleted;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static final hbExternalSyntheticLambda13 onExtraCallbackWithResult = new hbExternalSyntheticLambda13(false, false);

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbExternalSyntheticLambda13)) {
            int i2 = IAuthTabCallbackDefault + 115;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        hbExternalSyntheticLambda13 hbexternalsyntheticlambda13 = (hbExternalSyntheticLambda13) obj;
        if (this.onWarmupCompleted != hbexternalsyntheticlambda13.onWarmupCompleted) {
            return false;
        }
        if (this.onExtraCallback == hbexternalsyntheticlambda13.onExtraCallback) {
            return true;
        }
        int i4 = IAuthTabCallbackDefault + 71;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        asInterface = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (Boolean.hashCode(this.onWarmupCompleted) % 106) >>> Boolean.hashCode(this.onExtraCallback) : (Boolean.hashCode(this.onWarmupCompleted) * 31) + Boolean.hashCode(this.onExtraCallback);
        int i3 = IAuthTabCallbackDefault + 125;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnOverlayLifecyclePolicy(allowViewAndOverlayDestroyOnHide=" + this.onWarmupCompleted + ", recreateOverlayOnShow=" + this.onExtraCallback + ")";
        int i2 = asInterface + 13;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final hbExternalSyntheticLambda13 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            hbExternalSyntheticLambda13 hbexternalsyntheticlambda13OnNavigationEvent = hbExternalSyntheticLambda13.onNavigationEvent();
            int i4 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return hbexternalsyntheticlambda13OnNavigationEvent;
        }
    }

    public hbExternalSyntheticLambda13(boolean z, boolean z2) {
        this.onWarmupCompleted = z;
        this.onExtraCallback = z2;
    }

    public static final /* synthetic */ hbExternalSyntheticLambda13 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 105;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onWarmupCompleted;
        int i4 = i2 + 43;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return z;
    }

    static {
        int i = IAuthTabCallback + 41;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}

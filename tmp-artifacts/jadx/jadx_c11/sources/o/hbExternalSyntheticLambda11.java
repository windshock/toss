package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.hbExternalSyntheticLambda12;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hbExternalSyntheticLambda11 {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private static final hbExternalSyntheticLambda11 onWarmupCompleted;
    private final hbExternalSyntheticLambda12 IAuthTabCallback;
    private final hbExternalSyntheticLambda12 onExtraCallback;
    private final hbExternalSyntheticLambda10 onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 69;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof hbExternalSyntheticLambda11)) {
            int i5 = i3 + 3;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        hbExternalSyntheticLambda11 hbexternalsyntheticlambda11 = (hbExternalSyntheticLambda11) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, hbexternalsyntheticlambda11.IAuthTabCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, hbexternalsyntheticlambda11.onExtraCallback)) {
            return Intrinsics.areEqual(this.onNavigationEvent, hbexternalsyntheticlambda11.onNavigationEvent);
        }
        int i7 = onTransact + 31;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        onTransact = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.IAuthTabCallback.hashCode() << 26) << this.onExtraCallback.hashCode()) - 13) * this.onNavigationEvent.hashCode() : (((this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode();
        int i3 = onTransact + 45;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnOwnedOverlayDismissState(dialog=" + this.IAuthTabCallback + ", popupWindow=" + this.onExtraCallback + ", windowOverlayView=" + this.onNavigationEvent + ")";
        int i2 = onTransact + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public hbExternalSyntheticLambda11(@NotNull hbExternalSyntheticLambda12 hbexternalsyntheticlambda12, @NotNull hbExternalSyntheticLambda12 hbexternalsyntheticlambda122, @NotNull hbExternalSyntheticLambda10 hbexternalsyntheticlambda10) {
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda12, "");
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda122, "");
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda10, "");
        this.IAuthTabCallback = hbexternalsyntheticlambda12;
        this.onExtraCallback = hbexternalsyntheticlambda122;
        this.onNavigationEvent = hbexternalsyntheticlambda10;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static {
        hbExternalSyntheticLambda12.onExtraCallback onextracallback = hbExternalSyntheticLambda12.Companion;
        onWarmupCompleted = new hbExternalSyntheticLambda11(onextracallback.onExtraCallbackWithResult(), onextracallback.onExtraCallbackWithResult(), hbExternalSyntheticLambda10.Companion.onExtraCallback());
        int i = IAuthTabCallbackDefault + 85;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}

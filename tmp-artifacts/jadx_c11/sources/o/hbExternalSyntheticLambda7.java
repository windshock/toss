package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hbExternalSyntheticLambda7 {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onTransact;
    private final boolean IAuthTabCallback;
    private final String onWarmupCompleted;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final hbExternalSyntheticLambda7 onExtraCallbackWithResult = new hbExternalSyntheticLambda7("", false);

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbExternalSyntheticLambda7)) {
            int i2 = onTransact + 115;
            IAuthTabCallbackStub = i2 % 128;
            return i2 % 2 == 0;
        }
        hbExternalSyntheticLambda7 hbexternalsyntheticlambda7 = (hbExternalSyntheticLambda7) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, hbexternalsyntheticlambda7.onWarmupCompleted)) {
            int i3 = onTransact + 3;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.IAuthTabCallback == hbexternalsyntheticlambda7.IAuthTabCallback) {
            return true;
        }
        int i5 = onTransact + 1;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackStub = i2 % 128;
        int iHashCode = (i2 % 2 == 0 ? this.onWarmupCompleted.hashCode() >> 74 : this.onWarmupCompleted.hashCode() * 31) + Boolean.hashCode(this.IAuthTabCallback);
        int i3 = IAuthTabCallbackStub + 41;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnSearchEntryFallbackEvent(eventName=" + this.onWarmupCompleted + ", deliveryRequired=" + this.IAuthTabCallback + ")";
        int i2 = onTransact + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public hbExternalSyntheticLambda7(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
        this.IAuthTabCallback = z;
        if (z && StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("eventName must not be blank when deliveryRequired is true");
        }
        int i = IAuthTabCallbackStub + 55;
        onTransact = i % 128;
        if (i % 2 != 0) {
            int i2 = 54 / 0;
        }
    }

    public static final /* synthetic */ hbExternalSyntheticLambda7 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        hbExternalSyntheticLambda7 hbexternalsyntheticlambda7 = onExtraCallbackWithResult;
        int i4 = i3 + 51;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return hbexternalsyntheticlambda7;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final hbExternalSyntheticLambda9 onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull n5 n5Var, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(n5Var, "");
        Object obj = null;
        if (!this.IAuthTabCallback) {
            int i4 = onTransact + 97;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        hbExternalSyntheticLambda9 hbexternalsyntheticlambda9 = new hbExternalSyntheticLambda9(this.onWarmupCompleted, hc.WarmupTimeout, str, str2, str3, n5Var, Long.valueOf(j), null);
        int i6 = onTransact + 49;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return hbexternalsyntheticlambda9;
        }
        obj.hashCode();
        throw null;
    }

    public final hbExternalSyntheticLambda9 IAuthTabCallback(@NotNull String str, @NotNull n1 n1Var) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(n1Var, "");
        if (this.IAuthTabCallback) {
            return new hbExternalSyntheticLambda9(this.onWarmupCompleted, hc.WarmupFailed, str, n1Var.onNavigationEvent(), n1Var.onWarmupCompleted(), n1Var.IAuthTabCallback(), null, n1Var);
        }
        int i2 = onTransact + 89;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 71;
        onTransact = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final hbExternalSyntheticLambda7 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            hbExternalSyntheticLambda7 hbexternalsyntheticlambda7OnWarmupCompleted = hbExternalSyntheticLambda7.onWarmupCompleted();
            if (i3 == 0) {
                int i4 = 22 / 0;
            }
            return hbexternalsyntheticlambda7OnWarmupCompleted;
        }
    }

    static {
        int i = onNavigationEvent + 17;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}

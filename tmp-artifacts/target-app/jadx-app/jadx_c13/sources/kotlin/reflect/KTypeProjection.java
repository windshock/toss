package kotlin.reflect;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.access5900;
import o.addAllOpenFds;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class KTypeProjection {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final KTypeProjection onNavigationEvent = new KTypeProjection(null, null);
    private final access5900 IAuthTabCallback;
    private final addAllOpenFds onExtraCallback;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[addAllOpenFds.values().length];
            try {
                iArr[addAllOpenFds.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[addAllOpenFds.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[addAllOpenFds.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.onExtraCallback == kTypeProjection.onExtraCallback && Intrinsics.areEqual(this.IAuthTabCallback, kTypeProjection.IAuthTabCallback);
    }

    public int hashCode() {
        addAllOpenFds addallopenfds = this.onExtraCallback;
        int iHashCode = addallopenfds == null ? 0 : addallopenfds.hashCode();
        access5900 access5900Var = this.IAuthTabCallback;
        return (iHashCode * 31) + (access5900Var != null ? access5900Var.hashCode() : 0);
    }

    public KTypeProjection(@Nullable addAllOpenFds addallopenfds, @Nullable access5900 access5900Var) {
        String str;
        this.onExtraCallback = addallopenfds;
        this.IAuthTabCallback = access5900Var;
        if ((addallopenfds == null) == (access5900Var == null)) {
            return;
        }
        if (addallopenfds == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + addallopenfds + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final addAllOpenFds IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public final access5900 onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public String toString() {
        addAllOpenFds addallopenfds = this.onExtraCallback;
        int i = addallopenfds == null ? -1 : onWarmupCompleted.onWarmupCompleted[addallopenfds.ordinal()];
        if (i == -1) {
            return "*";
        }
        if (i == 1) {
            return String.valueOf(this.IAuthTabCallback);
        }
        if (i == 2) {
            return "in " + this.IAuthTabCallback;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.IAuthTabCallback;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        @JvmStatic
        public final KTypeProjection IAuthTabCallback(@NotNull access5900 access5900Var) {
            Intrinsics.checkNotNullParameter(access5900Var, "");
            return new KTypeProjection(addAllOpenFds.INVARIANT, access5900Var);
        }
    }
}

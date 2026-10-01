package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class v6a {
    private static int IAuthTabCallback = 1;
    public static final v6a onNavigationEvent = new v6a();
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 9;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private v6a() {
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final SessionProcessorBaseExternalSyntheticLambda1 IAuthTabCallback;
        private final boolean onExtraCallbackWithResult;
        private final boolean onNavigationEvent;

        public IAuthTabCallback() {
            this(false, false, null, 7, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 63;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i2 + 71;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (this.onExtraCallbackWithResult != iAuthTabCallback.onExtraCallbackWithResult) {
                int i8 = i2 + 93;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (this.onNavigationEvent != iAuthTabCallback.onNavigationEvent) {
                return false;
            }
            if (this.IAuthTabCallback == iAuthTabCallback.IAuthTabCallback) {
                return true;
            }
            int i10 = i4 + 41;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onExtraCallback = i2 % 128;
            int iHashCode = (i2 % 2 != 0 ? ((Boolean.hashCode(this.onExtraCallbackWithResult) * 114) >>> Boolean.hashCode(this.onNavigationEvent)) % 16 : ((Boolean.hashCode(this.onExtraCallbackWithResult) * 31) + Boolean.hashCode(this.onNavigationEvent)) * 31) + this.IAuthTabCallback.hashCode();
            int i3 = onWarmupCompleted + 77;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "DialogProperties(dismissOnBackPress=" + this.onExtraCallbackWithResult + ", dismissOnClickOutside=" + this.onNavigationEvent + ", securePolicy=" + this.IAuthTabCallback + ")";
            int i2 = onExtraCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(boolean z, boolean z2, @NotNull SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1) {
            Intrinsics.checkNotNullParameter(sessionProcessorBaseExternalSyntheticLambda1, "");
            this.onExtraCallbackWithResult = z;
            this.onNavigationEvent = z2;
            this.IAuthTabCallback = sessionProcessorBaseExternalSyntheticLambda1;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(boolean z, boolean z2, SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 5;
                onExtraCallback = i2 % 128;
                z = i2 % 2 == 0;
            }
            if ((i & 2) != 0) {
                int i3 = 2 % 2;
                z2 = true;
            }
            if ((i & 4) != 0) {
                sessionProcessorBaseExternalSyntheticLambda1 = SessionProcessorBaseExternalSyntheticLambda1.Inherit;
                int i4 = onExtraCallback + 61;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this(z, z2, sessionProcessorBaseExternalSyntheticLambda1);
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            boolean z = this.onExtraCallbackWithResult;
            int i4 = i3 + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 77;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i2 + 43;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final SessionProcessorBaseExternalSyntheticLambda1 onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}

package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class ScreenOrientationBridgeExtension$onNavigationEvent {
    public /* synthetic */ ScreenOrientationBridgeExtension$onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class IAuthTabCallback extends ScreenOrientationBridgeExtension$onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final getHCEState onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 51;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((IAuthTabCallback) obj).onExtraCallbackWithResult)) {
                return true;
            }
            int i3 = onWarmupCompleted + 17;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.onExtraCallbackWithResult.hashCode();
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.onExtraCallbackWithResult.hashCode();
            int i3 = onWarmupCompleted + 57;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(data=" + this.onExtraCallbackWithResult + ")";
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull getHCEState gethcestate) {
            super(null);
            Intrinsics.checkNotNullParameter(gethcestate, "");
            this.onExtraCallbackWithResult = gethcestate;
        }

        public final getHCEState onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            getHCEState gethcestate = this.onExtraCallbackWithResult;
            int i5 = i3 + 91;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 31 / 0;
            }
            return gethcestate;
        }
    }

    private ScreenOrientationBridgeExtension$onNavigationEvent() {
    }

    public static final class onNavigationEvent extends ScreenOrientationBridgeExtension$onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final Throwable onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onWarmupCompleted, ((onNavigationEvent) obj).onWarmupCompleted)) {
                return true;
            }
            int i3 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        
            return 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        
            return r2.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r2 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r2 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r1 = r1 + 21;
            o.ScreenOrientationBridgeExtension$onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            Throwable th;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 59;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                th = this.onWarmupCompleted;
                int i4 = 88 / 0;
            } else {
                th = this.onWarmupCompleted;
            }
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(exception=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onNavigationEvent(@Nullable Throwable th) {
            super(null);
            this.onWarmupCompleted = th;
        }
    }
}

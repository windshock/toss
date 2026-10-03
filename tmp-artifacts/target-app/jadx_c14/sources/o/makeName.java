package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class makeName {
    public /* synthetic */ makeName(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class IAuthTabCallback extends makeName {
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IAuthTabCallback) && Intrinsics.areEqual(this.onWarmupCompleted, ((IAuthTabCallback) obj).onWarmupCompleted);
        }

        public int hashCode() {
            return this.onWarmupCompleted.hashCode();
        }

        public String toString() {
            return "Date(value=" + this.onWarmupCompleted + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
        }

        public final String onExtraCallbackWithResult() {
            return this.onWarmupCompleted;
        }
    }

    private makeName() {
    }

    public static final class onWarmupCompleted extends makeName {
        private final NativeJSCHeapCaptureSpec onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof onWarmupCompleted) && Intrinsics.areEqual(this.onWarmupCompleted, ((onWarmupCompleted) obj).onWarmupCompleted);
        }

        public int hashCode() {
            return this.onWarmupCompleted.hashCode();
        }

        public String toString() {
            return "Transaction(item=" + this.onWarmupCompleted + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec) {
            super(null);
            Intrinsics.checkNotNullParameter(nativeJSCHeapCaptureSpec, "");
            this.onWarmupCompleted = nativeJSCHeapCaptureSpec;
        }

        public final NativeJSCHeapCaptureSpec onNavigationEvent() {
            return this.onWarmupCompleted;
        }
    }
}

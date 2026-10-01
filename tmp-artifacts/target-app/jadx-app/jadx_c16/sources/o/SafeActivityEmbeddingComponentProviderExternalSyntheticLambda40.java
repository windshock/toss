package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40 {

    public static final class onWarmupCompleted implements SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40 {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final int IAuthTabCallback;
        private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (this.IAuthTabCallback != onwarmupcompleted.IAuthTabCallback || !Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult)) {
                return false;
            }
            int i3 = onExtraCallback + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (Integer.hashCode(this.IAuthTabCallback) * 31) + this.onExtraCallbackWithResult.hashCode();
            int i4 = onWarmupCompleted + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Caution(messageRes=" + this.IAuthTabCallback + ", error=" + this.onExtraCallbackWithResult + ")";
            int i2 = onWarmupCompleted + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(int i, @NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27) {
            Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, "");
            this.IAuthTabCallback = i;
            this.onExtraCallbackWithResult = safeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
        }

        public final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27 = this.onExtraCallbackWithResult;
            int i4 = i3 + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
        }

        public final int onNavigationEvent() {
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 107;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                i = this.IAuthTabCallback;
                int i5 = 39 / 0;
            } else {
                i = this.IAuthTabCallback;
            }
            int i6 = i3 + 97;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return i;
        }
    }
}

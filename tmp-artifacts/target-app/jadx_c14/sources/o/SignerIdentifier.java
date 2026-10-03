package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class SignerIdentifier {
    public /* synthetic */ SignerIdentifier(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onExtraCallbackWithResult extends SignerIdentifier {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof onExtraCallbackWithResult);
        }

        public int hashCode() {
            return 1488739588;
        }

        public String toString() {
            return "Idle";
        }

        private onExtraCallbackWithResult() {
            super(null);
        }
    }

    private SignerIdentifier() {
    }

    public static final class onExtraCallback extends SignerIdentifier {
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof onExtraCallback);
        }

        public int hashCode() {
            return -118852084;
        }

        public String toString() {
            return "Loading";
        }

        private onExtraCallback() {
            super(null);
        }
    }

    public static final class IAuthTabCallback extends SignerIdentifier {
        private final getDigestAlgorithms<getModulus> IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IAuthTabCallback) && Intrinsics.areEqual(this.IAuthTabCallback, ((IAuthTabCallback) obj).IAuthTabCallback);
        }

        public int hashCode() {
            return this.IAuthTabCallback.hashCode();
        }

        public String toString() {
            return "Success(navigator=" + this.IAuthTabCallback + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull getDigestAlgorithms<getModulus> getdigestalgorithms) {
            super(null);
            Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
            this.IAuthTabCallback = getdigestalgorithms;
        }

        public final getDigestAlgorithms<getModulus> IAuthTabCallback() {
            return this.IAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted extends SignerIdentifier {
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof onWarmupCompleted);
        }

        public int hashCode() {
            return -1542076838;
        }

        public String toString() {
            return "Failure";
        }

        private onWarmupCompleted() {
            super(null);
        }
    }
}

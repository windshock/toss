package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class pkcs5PBKDF2 {
    public /* synthetic */ pkcs5PBKDF2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private pkcs5PBKDF2() {
    }

    public static final class onExtraCallbackWithResult extends pkcs5PBKDF2 {
        private final String IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, ((onExtraCallbackWithResult) obj).IAuthTabCallback);
        }

        public int hashCode() {
            return this.IAuthTabCallback.hashCode();
        }

        public String toString() {
            return "FileSystemBundle(filePath=" + this.IAuthTabCallback + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
        }

        public final String onExtraCallbackWithResult() {
            return this.IAuthTabCallback;
        }
    }

    public static final class onNavigationEvent extends pkcs5PBKDF2 {
        public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof onNavigationEvent);
        }

        public int hashCode() {
            return -2136852803;
        }

        public String toString() {
            return "EmbeddedBundle";
        }

        private onNavigationEvent() {
            super(null);
        }
    }
}

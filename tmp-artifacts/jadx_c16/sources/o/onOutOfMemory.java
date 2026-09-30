package o;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class onOutOfMemory {
    public /* synthetic */ onOutOfMemory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onNavigationEvent extends onOutOfMemory {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 107;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 79;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            int i7 = i3 + 13;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 119;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 98 / 0;
            }
            int i5 = i2 + 57;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return 927637357;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 109;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return "SkipCheck";
        }

        private onNavigationEvent() {
            super(null);
        }
    }

    private onOutOfMemory() {
    }

    public static final class IAuthTabCallback extends onOutOfMemory {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private final Function2<String, String, Boolean> onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 33;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i4 = onExtraCallback + 125;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, ((IAuthTabCallback) obj).onNavigationEvent)) {
                return true;
            }
            int i6 = onExtraCallback + 109;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            int i4 = onExtraCallbackWithResult + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NeedCheck(checker=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 61 / 0;
            }
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public IAuthTabCallback(@NotNull Function2<? super String, ? super String, Boolean> function2) {
            super(null);
            Intrinsics.checkNotNullParameter(function2, "");
            this.onNavigationEvent = function2;
        }

        public final Function2<String, String, Boolean> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 3;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Function2<String, String, Boolean> function2 = this.onNavigationEvent;
            int i5 = i2 + 11;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return function2;
            }
            throw null;
        }
    }
}

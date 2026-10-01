package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface IpcServerUtilsBizMessage {

    public static final class IAuthTabCallback implements IpcServerUtilsBizMessage {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 49;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 1;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this != obj) {
                return obj instanceof IAuthTabCallback;
            }
            int i5 = i2 + 87;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 49;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 27;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return -1726088555;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 5;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 0;
            }
            return "NotResumed";
        }

        private IAuthTabCallback() {
        }
    }

    public static final class onWarmupCompleted implements IpcServerUtilsBizMessage {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final isAlphaBackground IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 51;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i4 = onExtraCallbackWithResult + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, ((onWarmupCompleted) obj).IAuthTabCallback)) {
                return true;
            }
            int i6 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            isAlphaBackground isalphabackground = this.IAuthTabCallback;
            if (isalphabackground != null) {
                int iHashCode = isalphabackground.hashCode();
                int i2 = onNavigationEvent + 87;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return iHashCode;
            }
            int i4 = onExtraCallbackWithResult + 29;
            int i5 = i4 % 128;
            onNavigationEvent = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 27;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Resumed(exhaustedCuration=" + this.IAuthTabCallback + ")";
            int i2 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(@Nullable isAlphaBackground isalphabackground) {
            this.IAuthTabCallback = isalphabackground;
        }

        public final isAlphaBackground onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            isAlphaBackground isalphabackground = this.IAuthTabCallback;
            int i5 = i3 + 35;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return isalphabackground;
            }
            throw null;
        }
    }
}

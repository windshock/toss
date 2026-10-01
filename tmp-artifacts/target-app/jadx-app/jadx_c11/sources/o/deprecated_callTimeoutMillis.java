package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface deprecated_callTimeoutMillis {
    public static final IAuthTabCallback Companion = IAuthTabCallback.IAuthTabCallback;

    String onWarmupCompleted(@NotNull String str, float f);

    public static final class IAuthTabCallback {
        private static int IAuthTabCallbackDefault = 0;
        private static int asInterface = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onTransact = 1;
        static final /* synthetic */ IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();
        private static final Regex onExtraCallback = new Regex("^https?://.*");
        private static final deprecated_callTimeoutMillis onWarmupCompleted = new onNavigationEvent();
        private static final deprecated_callTimeoutMillis onNavigationEvent = new deprecated_connectTimeoutMillis("icons");

        private IAuthTabCallback() {
        }

        static {
            int i = asInterface + 31;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public final Regex onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 65;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Regex regex = onExtraCallback;
            if (i3 == 0) {
                int i4 = 44 / 0;
            }
            return regex;
        }

        public static final class onNavigationEvent implements deprecated_callTimeoutMillis {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // o.deprecated_callTimeoutMillis
            public String onWarmupCompleted(String str, float f) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 101;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                int i4 = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            onNavigationEvent() {
            }
        }

        public final deprecated_callTimeoutMillis IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 103;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            deprecated_callTimeoutMillis deprecated_calltimeoutmillis = onWarmupCompleted;
            int i5 = i3 + 111;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return deprecated_calltimeoutmillis;
        }

        public final deprecated_callTimeoutMillis onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 1;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            deprecated_callTimeoutMillis deprecated_calltimeoutmillis = onNavigationEvent;
            int i5 = i3 + 49;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return deprecated_calltimeoutmillis;
        }
    }
}

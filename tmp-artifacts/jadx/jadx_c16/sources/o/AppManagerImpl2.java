package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class AppManagerImpl2 {
    public /* synthetic */ AppManagerImpl2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AppManagerImpl2() {
    }

    public static final class onNavigationEvent extends AppManagerImpl2 {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();

        static {
            int i = IAuthTabCallback + 75;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent() {
            super(null);
        }
    }

    public static final class onExtraCallback extends AppManagerImpl2 {
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 109;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private onExtraCallback() {
            super(null);
        }
    }

    public static abstract class onExtraCallbackWithResult extends AppManagerImpl2 {
        public static final onNavigationEvent Companion;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new onNavigationEvent(defaultConstructorMarker);
            int i = onExtraCallback + 77;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String onWarmupCompleted();

        private onExtraCallbackWithResult() {
            super(null);
        }

        public static final class onNavigationEvent {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onNavigationEvent() {
            }

            public final onExtraCallbackWithResult onExtraCallback(@NotNull String str) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                IAuthTabCallback iAuthTabCallback = IAuthTabCallback.onExtraCallbackWithResult;
                if (!(!Intrinsics.areEqual(str, iAuthTabCallback.onWarmupCompleted()))) {
                    int i2 = onWarmupCompleted + 41;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return iAuthTabCallback;
                }
                onExtraCallback onextracallback = onExtraCallback.onExtraCallbackWithResult;
                Object obj = null;
                if (Intrinsics.areEqual(str, onextracallback.onWarmupCompleted())) {
                    int i4 = onWarmupCompleted + 67;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        return onextracallback;
                    }
                    throw null;
                }
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(str);
                int i5 = onWarmupCompleted + 25;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return onwarmupcompleted;
                }
                obj.hashCode();
                throw null;
            }
        }

        public static final class IAuthTabCallback extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int asBinder = 1;
            private static int onExtraCallback = 0;
            public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
            private static final String onNavigationEvent = " ";
            private static int onWarmupCompleted = 1;

            private IAuthTabCallback() {
                super(null);
            }

            static {
                int i = IAuthTabCallback + 51;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            @Override // o.AppManagerImpl2.onExtraCallbackWithResult
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = asBinder;
                int i3 = i2 + 63;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                String str = onNavigationEvent;
                int i5 = i2 + 51;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 56 / 0;
                }
                return str;
            }
        }

        public static final class onExtraCallback extends onExtraCallbackWithResult {
            private static int IAuthTabCallbackDefault = 1;
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
            private static final String IAuthTabCallback = "";

            private onExtraCallback() {
                super(null);
            }

            static {
                int i = onNavigationEvent + 1;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            @Override // o.AppManagerImpl2.onExtraCallbackWithResult
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 45;
                IAuthTabCallbackDefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                String str = IAuthTabCallback;
                int i4 = i2 + 85;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return str;
                }
                obj.hashCode();
                throw null;
            }
        }
    }
}

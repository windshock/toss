package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.findSnapView;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getPluginVersion {
    public static final onWarmupCompleted Companion = onWarmupCompleted.onWarmupCompleted;

    public interface IAuthTabCallback {
        getPluginVersion dispatchKeyEvent();
    }

    findSnapView.IAuthTabCallback<onExtraCallbackWithResult, onNavigationEvent, Object> IAuthTabCallback(@NotNull onNavigationEvent onnavigationevent);

    boolean onExtraCallbackWithResult();

    JsonReaderUnknownNumberParsing<onExtraCallbackWithResult> onNavigationEvent();

    public static abstract class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class onExtraCallback extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

            static {
                int i = onExtraCallback + 81;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            private onExtraCallback() {
                super(null);
            }
        }

        private onExtraCallbackWithResult() {
        }

        /* renamed from: o.getPluginVersion$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0019onExtraCallbackWithResult extends onExtraCallbackWithResult {
            public static final C0019onExtraCallbackWithResult onExtraCallback = new C0019onExtraCallbackWithResult();
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            static {
                int i = onExtraCallbackWithResult + 21;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            private C0019onExtraCallbackWithResult() {
                super(null);
            }
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(getClass().getSimpleName(), "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            int i3 = onExtraCallback + 21;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return simpleName;
        }
    }

    public static abstract class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: o.getPluginVersion$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0020onNavigationEvent extends onNavigationEvent {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            public static final C0020onNavigationEvent onWarmupCompleted = new C0020onNavigationEvent();

            static {
                int i = onNavigationEvent + 5;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private C0020onNavigationEvent() {
                super(null);
            }
        }

        private onNavigationEvent() {
        }

        public static final class onExtraCallback extends onNavigationEvent {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

            static {
                int i = onNavigationEvent + 35;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            private onExtraCallback() {
                super(null);
            }
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                String simpleName = getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
                return simpleName;
            }
            String simpleName2 = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName2, "");
            int i3 = 36 / 0;
            return simpleName2;
        }
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        static final /* synthetic */ onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        static {
            int i = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        private onWarmupCompleted() {
        }

        public final getPluginVersion onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            getPluginVersion getpluginversionDispatchKeyEvent = ((IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), IAuthTabCallback.class)).dispatchKeyEvent();
            int i4 = onExtraCallback + 109;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return getpluginversionDispatchKeyEvent;
            }
            throw null;
        }
    }
}

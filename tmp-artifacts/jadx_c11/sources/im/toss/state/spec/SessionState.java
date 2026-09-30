package im.toss.state.spec;

import android.content.Context;
import im.toss.state.spec.SessionState;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.JsonReaderUnknownNumberParsing;
import o.Response;
import o.UserChoiceBillingListener;
import o.access13800;
import o.findSnapView;
import o.getByteBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface SessionState {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.IAuthTabCallback;

    public interface onExtraCallback {
        SessionState performMenuItemShortcut();
    }

    getByteBuffer<Boolean> IAuthTabCallback();

    boolean IAuthTabCallbackDefault();

    boolean IAuthTabCallbackStub();

    void IAuthTabCallback_Parcel();

    JsonReaderUnknownNumberParsing<Boolean> asBinder();

    State asInterface();

    JsonReaderUnknownNumberParsing<Boolean> getInterfaceDescriptor();

    void onExtraCallback();

    void onExtraCallback(@Nullable String str);

    Long onExtraCallbackWithResult();

    JsonReaderUnknownNumberParsing<State> onExtraCallbackWithResult(boolean z);

    void onExtraCallbackWithResult(@Nullable Object obj);

    Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var);

    String onNavigationEvent();

    boolean onTransact();

    String onWarmupCompleted();

    findSnapView.IAuthTabCallback<State, Event, Object> onWarmupCompleted(@NotNull Event event);

    public static abstract class State {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private State() {
        }

        public static final class LoginSession extends State {
            private static int onExtraCallback = 0;
            public static final LoginSession onExtraCallbackWithResult = new LoginSession();
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallback + 17;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            private LoginSession() {
                super(null);
            }
        }

        public static final class EmptySession extends State {
            public static final EmptySession onExtraCallback = new EmptySession();
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            static {
                int i = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            private EmptySession() {
                super(null);
            }
        }

        public static final class GuestSession extends State {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final GuestSession onWarmupCompleted = new GuestSession();

            static {
                int i = onExtraCallbackWithResult + 93;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            private GuestSession() {
                super(null);
            }
        }

        public static final class SessionFinished extends State {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static final SessionFinished onExtraCallbackWithResult = new SessionFinished();

            static {
                int i = IAuthTabCallback + 103;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            private SessionFinished() {
                super(null);
            }
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            int i4 = onWarmupCompleted + 65;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 87 / 0;
            }
            return simpleName;
        }
    }

    public static abstract class Event {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Event() {
        }

        public static final class OnAppStart extends Event {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static final OnAppStart onWarmupCompleted = new OnAppStart();

            static {
                int i = IAuthTabCallback + 35;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            private OnAppStart() {
                super(null);
            }
        }

        public static final class OnUserLogIn extends Event {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            public static final OnUserLogIn onWarmupCompleted = new OnUserLogIn();

            static {
                int i = IAuthTabCallback + 33;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            private OnUserLogIn() {
                super(null);
            }
        }

        public static final class OnUserLogOut extends Event {
            private static int onExtraCallback = 1;
            public static final OnUserLogOut onNavigationEvent = new OnUserLogOut();
            private static int onWarmupCompleted;

            static {
                int i = onWarmupCompleted + 51;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            private OnUserLogOut() {
                super(null);
            }
        }

        public static final class OnActivityCreate extends Event {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static final OnActivityCreate onWarmupCompleted = new OnActivityCreate();

            static {
                int i = IAuthTabCallback + 101;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            private OnActivityCreate() {
                super(null);
            }
        }

        public static final class OnAppFinish extends Event {
            public static final OnAppFinish onExtraCallback = new OnAppFinish();
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    int i2 = 43 / 0;
                }
            }

            private OnAppFinish() {
                super(null);
            }
        }

        public static final class OnInitialize extends Event {
            private static int IAuthTabCallback = 0;
            public static final OnInitialize onExtraCallback = new OnInitialize();
            private static int onExtraCallbackWithResult = 1;

            static {
                int i = IAuthTabCallback + 97;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            private OnInitialize() {
                super(null);
            }
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                String simpleName = getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
                return simpleName;
            }
            Intrinsics.checkNotNullExpressionValue(getClass().getSimpleName(), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static /* synthetic */ JsonReaderUnknownNumberParsing onExtraCallback(SessionState sessionState, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeState");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return sessionState.onExtraCallbackWithResult(z);
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onTransact = 1;
        private static int onWarmupCompleted;
        static final /* synthetic */ onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
        private static final Lazy<SessionState> onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.state.spec.SessionState$Companion$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    SessionState.onExtraCallbackWithResult.onExtraCallbackWithResult();
                    throw null;
                }
                SessionState sessionStateOnExtraCallbackWithResult = SessionState.onExtraCallbackWithResult.onExtraCallbackWithResult();
                int i3 = onWarmupCompleted + 47;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return sessionStateOnExtraCallbackWithResult;
                }
                obj.hashCode();
                throw null;
            }
        });

        public static /* synthetic */ SessionState onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SessionState sessionStateOnNavigationEvent = onNavigationEvent();
            int i4 = onNavigationEvent + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return sessionStateOnNavigationEvent;
        }

        private onExtraCallbackWithResult() {
        }

        static {
            int i = onWarmupCompleted + 83;
            onTransact = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public final SessionState onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SessionState sessionState = (SessionState) onExtraCallbackWithResult.getValue();
            int i4 = onExtraCallback + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 15 / 0;
            }
            return sessionState;
        }

        private static final SessionState onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
            if (i3 != 0) {
                return ((onExtraCallback) Response.onExtraCallback(contextOnExtraCallback, onExtraCallback.class)).performMenuItemShortcut();
            }
            ((onExtraCallback) Response.onExtraCallback(contextOnExtraCallback, onExtraCallback.class)).performMenuItemShortcut();
            throw null;
        }
    }
}

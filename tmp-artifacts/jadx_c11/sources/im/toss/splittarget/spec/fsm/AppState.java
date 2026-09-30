package im.toss.splittarget.spec.fsm;

import im.toss.splittarget.spec.fsm.AppState;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCOcclusion;
import o.AppLovinBroadcastManagerc;
import o.ConvertFloatArrayToByteArray;
import o.JsonReaderUnknownNumberParsing;
import o.Response;
import o.SetDetectableSize;
import o.UserChoiceBillingListener;
import o.findSnapView;
import o.getAppEnteredBackgroundTimeMillis;
import o.r8lambdaEK35TGWCjvE5YDlTcJsm53divws;
import o.shared;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface AppState {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.IAuthTabCallback;

    public interface onWarmupCompleted {
        AppState ReportDrawnCompositioncheckReporter1();
    }

    JsonReaderUnknownNumberParsing<State> IAuthTabCallback(boolean z);

    boolean IAuthTabCallback();

    ALCOcclusion onExtraCallbackWithResult();

    JsonReaderUnknownNumberParsing<Boolean> onNavigationEvent(boolean z);

    findSnapView.IAuthTabCallback<State, Event, onExtraCallback> onNavigationEvent(@NotNull Event event);

    State onWarmupCompleted();

    public static abstract class State {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Initialize extends State {
            private static int onExtraCallbackWithResult = 0;
            public static final Initialize onNavigationEvent = new Initialize();
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private Initialize() {
                super(null);
            }
        }

        private State() {
        }

        public static final class Foreground extends State {
            private static int IAuthTabCallback = 1;
            public static final Foreground onExtraCallbackWithResult = new Foreground();
            private static int onNavigationEvent;

            static {
                int i = IAuthTabCallback + 73;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    int i2 = 34 / 0;
                }
            }

            private Foreground() {
                super(null);
            }
        }

        public static final class Background extends State {
            private static int onExtraCallback = 1;
            public static final Background onExtraCallbackWithResult = new Background();
            private static int onNavigationEvent;

            static {
                int i = onExtraCallback + 35;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            private Background() {
                super(null);
            }
        }

        public static final class Terminate extends State {
            private static int onExtraCallback = 1;
            public static final Terminate onExtraCallbackWithResult = new Terminate();
            private static int onNavigationEvent;

            static {
                int i = onNavigationEvent + 83;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            private Terminate() {
                super(null);
            }
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            int i4 = onNavigationEvent + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return simpleName;
        }
    }

    public static abstract class Event {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class OnAppForeground extends Event {
            private static int IAuthTabCallback = 1;
            public static final OnAppForeground onExtraCallbackWithResult = new OnAppForeground();
            private static int onNavigationEvent;

            static {
                int i = onNavigationEvent + 73;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            private OnAppForeground() {
                super(null);
            }
        }

        private Event() {
        }

        public static final class OnAppBackground extends Event {
            public static final OnAppBackground onExtraCallback = new OnAppBackground();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            static {
                int i = onNavigationEvent + 67;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            private OnAppBackground() {
                super(null);
            }
        }

        public static final class OnAllActivityDestroyed extends Event {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            public static final OnAllActivityDestroyed onNavigationEvent = new OnAllActivityDestroyed();

            static {
                int i = IAuthTabCallback + 59;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            private OnAllActivityDestroyed() {
                super(null);
            }
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            int i4 = onExtraCallback + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return simpleName;
            }
            throw null;
        }
    }

    public static abstract class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract void onExtraCallback();

        private onExtraCallback() {
        }

        public static final class onExtraCallbackWithResult extends onExtraCallback {
            private static int IAuthTabCallback = 1;
            public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onWarmupCompleted + 109;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            public static /* synthetic */ Unit onWarmupCompleted(r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divws, SetDetectableSize setDetectableSize) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(r8lambdaek35tgwcjve5ydltcjsm53divws, setDetectableSize);
                int i4 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }

            private onExtraCallbackWithResult() {
                super(null);
            }

            private static final Unit IAuthTabCallback(r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divws, SetDetectableSize setDetectableSize) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setDetectableSize, "");
                    setDetectableSize.onExtraCallback("state", "foreground");
                    setDetectableSize.onExtraCallback("start_type", "cold");
                    setDetectableSize.onExtraCallback("trigger", AppLovinBroadcastManagerc.onWarmupCompleted(r8lambdaek35tgwcjve5ydltcjsm53divws.IAuthTabCallback()));
                    setDetectableSize.onExtraCallback("detail_info", AppLovinBroadcastManagerc.onWarmupCompleted(r8lambdaek35tgwcjve5ydltcjsm53divws));
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback("state", "foreground");
                setDetectableSize.onExtraCallback("start_type", "cold");
                setDetectableSize.onExtraCallback("trigger", AppLovinBroadcastManagerc.onWarmupCompleted(r8lambdaek35tgwcjve5ydltcjsm53divws.IAuthTabCallback()));
                setDetectableSize.onExtraCallback("detail_info", AppLovinBroadcastManagerc.onWarmupCompleted(r8lambdaek35tgwcjve5ydltcjsm53divws));
                Unit unit = Unit.INSTANCE;
                throw null;
            }

            @Override // im.toss.splittarget.spec.fsm.AppState.onExtraCallback
            public void onExtraCallback() {
                int i = 2 % 2;
                final r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divwsOnExtraCallback = getAppEnteredBackgroundTimeMillis.Companion.onExtraCallbackWithResult().onExtraCallback();
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1283425L, false, (String) null, (Map) null, new Function1() { // from class: im.toss.splittarget.spec.fsm.AppState$SideEffect$LogColdStart$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallback + 3;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnWarmupCompleted = AppState.onExtraCallback.onExtraCallbackWithResult.onWarmupCompleted(r8lambdaek35tgwcjve5ydltcjsm53divwsOnExtraCallback, (SetDetectableSize) obj);
                        int i5 = onNavigationEvent + 53;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return unitOnWarmupCompleted;
                    }
                }, 14, (Object) null);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "app-launch-cold-start", (String) null, (Map) null, (String) null, false, (String) null, 62, (Object) null);
                int i2 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }
        }

        public static final class onWarmupCompleted extends onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

            static {
                int i = IAuthTabCallback + 61;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Unit onNavigationEvent(r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divws, SetDetectableSize setDetectableSize) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = onExtraCallback(r8lambdaek35tgwcjve5ydltcjsm53divws, setDetectableSize);
                int i4 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallback;
            }

            private onWarmupCompleted() {
                super(null);
            }

            @Override // im.toss.splittarget.spec.fsm.AppState.onExtraCallback
            public void onExtraCallback() {
                int i = 2 % 2;
                final r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divwsOnExtraCallback = getAppEnteredBackgroundTimeMillis.Companion.onExtraCallbackWithResult().onExtraCallback();
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1283425L, false, (String) null, (Map) null, new Function1() { // from class: im.toss.splittarget.spec.fsm.AppState$SideEffect$LogWarmStart$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = IAuthTabCallback + 37;
                        onWarmupCompleted = i3 % 128;
                        if (i3 % 2 != 0) {
                            AppState.onExtraCallback.onWarmupCompleted.onNavigationEvent(r8lambdaek35tgwcjve5ydltcjsm53divwsOnExtraCallback, (SetDetectableSize) obj);
                            throw null;
                        }
                        Unit unitOnNavigationEvent = AppState.onExtraCallback.onWarmupCompleted.onNavigationEvent(r8lambdaek35tgwcjve5ydltcjsm53divwsOnExtraCallback, (SetDetectableSize) obj);
                        int i4 = onWarmupCompleted + 111;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            return unitOnNavigationEvent;
                        }
                        throw null;
                    }
                }, 14, (Object) null);
                int i2 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit onExtraCallback(r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divws, SetDetectableSize setDetectableSize) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setDetectableSize, "");
                    setDetectableSize.onExtraCallback("state", "foreground");
                    setDetectableSize.onExtraCallback("start_type", "warm");
                    setDetectableSize.onExtraCallback("trigger", AppLovinBroadcastManagerc.onWarmupCompleted(r8lambdaek35tgwcjve5ydltcjsm53divws.IAuthTabCallback()));
                    setDetectableSize.onExtraCallback("detail_info", AppLovinBroadcastManagerc.onWarmupCompleted(r8lambdaek35tgwcjve5ydltcjsm53divws));
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback("state", "foreground");
                setDetectableSize.onExtraCallback("start_type", "warm");
                setDetectableSize.onExtraCallback("trigger", AppLovinBroadcastManagerc.onWarmupCompleted(r8lambdaek35tgwcjve5ydltcjsm53divws.IAuthTabCallback()));
                setDetectableSize.onExtraCallback("detail_info", AppLovinBroadcastManagerc.onWarmupCompleted(r8lambdaek35tgwcjve5ydltcjsm53divws));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
        }

        public static final class IAuthTabCallback extends onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallback + 73;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    int i2 = 0 / 0;
                }
            }

            public static /* synthetic */ Unit onNavigationEvent(r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divws, SetDetectableSize setDetectableSize) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 13;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(r8lambdaek35tgwcjve5ydltcjsm53divws, setDetectableSize);
                if (i3 != 0) {
                    int i4 = 58 / 0;
                }
                int i5 = IAuthTabCallback + 29;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }

            private IAuthTabCallback() {
                super(null);
            }

            @Override // im.toss.splittarget.spec.fsm.AppState.onExtraCallback
            public void onExtraCallback() {
                int i = 2 % 2;
                final r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divwsOnExtraCallback = getAppEnteredBackgroundTimeMillis.Companion.onExtraCallbackWithResult().onExtraCallback();
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1283425L, false, (String) null, (Map) null, new Function1() { // from class: im.toss.splittarget.spec.fsm.AppState$SideEffect$LogHotStart$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onNavigationEvent + 95;
                        onWarmupCompleted = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnNavigationEvent = AppState.onExtraCallback.IAuthTabCallback.onNavigationEvent(r8lambdaek35tgwcjve5ydltcjsm53divwsOnExtraCallback, (SetDetectableSize) obj);
                        int i5 = onNavigationEvent + 85;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        return unitOnNavigationEvent;
                    }
                }, 14, (Object) null);
                int i2 = onWarmupCompleted + 59;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit onWarmupCompleted(r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divws, SetDetectableSize setDetectableSize) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setDetectableSize, "");
                    setDetectableSize.onExtraCallback("state", "foreground");
                    setDetectableSize.onExtraCallback("start_type", "hot");
                    setDetectableSize.onExtraCallback("trigger", AppLovinBroadcastManagerc.onWarmupCompleted(r8lambdaek35tgwcjve5ydltcjsm53divws.IAuthTabCallback()));
                    setDetectableSize.onExtraCallback("detail_info", AppLovinBroadcastManagerc.onWarmupCompleted(r8lambdaek35tgwcjve5ydltcjsm53divws));
                    Unit unit = Unit.INSTANCE;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback("state", "foreground");
                setDetectableSize.onExtraCallback("start_type", "hot");
                setDetectableSize.onExtraCallback("trigger", AppLovinBroadcastManagerc.onWarmupCompleted(r8lambdaek35tgwcjve5ydltcjsm53divws.IAuthTabCallback()));
                setDetectableSize.onExtraCallback("detail_info", AppLovinBroadcastManagerc.onWarmupCompleted(r8lambdaek35tgwcjve5ydltcjsm53divws));
                Unit unit2 = Unit.INSTANCE;
                int i3 = onWarmupCompleted + 37;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return unit2;
                }
                throw null;
            }
        }

        /* renamed from: im.toss.splittarget.spec.fsm.AppState$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0000onExtraCallback extends onExtraCallback {
            private static int IAuthTabCallback = 0;
            public static final C0000onExtraCallback onExtraCallback = new C0000onExtraCallback();
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = IAuthTabCallback + 49;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 19;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = onNavigationEvent(setDetectableSize);
                if (i3 != 0) {
                    int i4 = 83 / 0;
                }
                return unitOnNavigationEvent;
            }

            private C0000onExtraCallback() {
                super(null);
            }

            private static final Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
                Unit unit;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setDetectableSize, "");
                    setDetectableSize.onExtraCallback("state", "background");
                    unit = Unit.INSTANCE;
                    int i3 = 32 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(setDetectableSize, "");
                    setDetectableSize.onExtraCallback("state", "background");
                    unit = Unit.INSTANCE;
                }
                int i4 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // im.toss.splittarget.spec.fsm.AppState.onExtraCallback
            public void onExtraCallback() {
                int i = 2 % 2;
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1283425L, false, (String) null, (Map) null, new Function1() { // from class: im.toss.splittarget.spec.fsm.AppState$SideEffect$LogBackground$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallbackWithResult + 51;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnWarmupCompleted = AppState.onExtraCallback.C0000onExtraCallback.onWarmupCompleted((SetDetectableSize) obj);
                        if (i4 != 0) {
                            int i5 = 13 / 0;
                        }
                        int i6 = onExtraCallback + 73;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 63 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                }, 14, (Object) null);
                getAppEnteredBackgroundTimeMillis.Companion.onExtraCallbackWithResult().IAuthTabCallback(new r8lambdaEK35TGWCjvE5YDlTcJsm53divws(shared.DEFAULT, null, null, 6, null));
                int i2 = onWarmupCompleted + 111;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
            }
        }

        public static final class onNavigationEvent extends onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();
            private static int onWarmupCompleted;

            static {
                int i = onWarmupCompleted + 121;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Unit onExtraCallback(SetDetectableSize setDetectableSize) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 37;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return onExtraCallbackWithResult(setDetectableSize);
                }
                onExtraCallbackWithResult(setDetectableSize);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onNavigationEvent() {
                super(null);
            }

            @Override // im.toss.splittarget.spec.fsm.AppState.onExtraCallback
            public void onExtraCallback() {
                int i = 2 % 2;
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1283425L, false, (String) null, (Map) null, new Function1() { // from class: im.toss.splittarget.spec.fsm.AppState$SideEffect$LogTerminate$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallbackWithResult + 63;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnExtraCallback = AppState.onExtraCallback.onNavigationEvent.onExtraCallback((SetDetectableSize) obj);
                        int i5 = IAuthTabCallback + 55;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        return unitOnExtraCallback;
                    }
                }, 14, (Object) null);
                int i2 = onExtraCallbackWithResult + 113;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 15 / 0;
                }
            }

            private static final Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback("state", "terminate");
                Unit unit = Unit.INSTANCE;
                int i4 = onExtraCallbackWithResult + 125;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onTransact = 1;
        static final /* synthetic */ onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
        private static final Lazy<AppState> onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.spec.fsm.AppState$Companion$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 95;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    AppState.onExtraCallbackWithResult.onNavigationEvent();
                    throw null;
                }
                AppState appStateOnNavigationEvent = AppState.onExtraCallbackWithResult.onNavigationEvent();
                int i3 = onWarmupCompleted + 63;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 92 / 0;
                }
                return appStateOnNavigationEvent;
            }
        });

        public static /* synthetic */ AppState onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted();
                throw null;
            }
            AppState appStateOnWarmupCompleted = onWarmupCompleted();
            int i3 = onExtraCallback + 99;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 0 / 0;
            }
            return appStateOnWarmupCompleted;
        }

        private onExtraCallbackWithResult() {
        }

        static {
            int i = onNavigationEvent + 65;
            onTransact = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public final AppState onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AppState appState = (AppState) onWarmupCompleted.getValue();
            int i4 = onExtraCallback + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return appState;
        }

        private static final AppState onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            AppState appStateReportDrawnCompositioncheckReporter1 = ((onWarmupCompleted) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onWarmupCompleted.class)).ReportDrawnCompositioncheckReporter1();
            int i4 = onExtraCallback + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return appStateReportDrawnCompositioncheckReporter1;
        }
    }
}

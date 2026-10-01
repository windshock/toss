package im.toss.di;

import im.toss.splittarget.spec.fsm.AppState;
import javax.inject.Singleton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinAdServiceImplExternalSyntheticLambda1;
import o.JsonReaderUnknownNumberParsing;
import o.deserializeIntNullableCollection;
import o.getCurrentApplicationStateDurationMillis;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SessionStorageModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    public static final SessionStorageModule onNavigationEvent = new SessionStorageModule();
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Boolean onExtraCallback(AppState.State state) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnWarmupCompleted = onWarmupCompleted(state);
        int i4 = onWarmupCompleted + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return boolOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Boolean onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnExtraCallback = onExtraCallback(function1, obj);
        int i4 = onWarmupCompleted + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return boolOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private SessionStorageModule() {
    }

    @Singleton
    public final getCurrentApplicationStateDurationMillis IAuthTabCallback(@NotNull AppState appState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appState, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = appState.IAuthTabCallback(true);
        final Function1 function1 = new Function1() { // from class: im.toss.di.SessionStorageModule$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 13;
                IAuthTabCallback = i3 % 128;
                Object obj2 = null;
                AppState.State state = (AppState.State) obj;
                if (i3 % 2 == 0) {
                    SessionStorageModule.onExtraCallback(state);
                    obj2.hashCode();
                    throw null;
                }
                Boolean boolOnExtraCallback = SessionStorageModule.onExtraCallback(state);
                int i4 = onExtraCallback + 15;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return boolOnExtraCallback;
                }
                throw null;
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent = jsonReaderUnknownNumberParsingIAuthTabCallback.onNavigationEvent(new deserializeIntNullableCollection() { // from class: im.toss.di.SessionStorageModule$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 57;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolOnExtraCallbackWithResult = SessionStorageModule.onExtraCallbackWithResult(function1, obj);
                int i5 = onNavigationEvent + 43;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return boolOnExtraCallbackWithResult;
            }
        });
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnNavigationEvent, "");
        AppLovinAdServiceImplExternalSyntheticLambda1 appLovinAdServiceImplExternalSyntheticLambda1 = new AppLovinAdServiceImplExternalSyntheticLambda1(jsonReaderUnknownNumberParsingOnNavigationEvent);
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return appLovinAdServiceImplExternalSyntheticLambda1;
    }

    private static final Boolean onExtraCallback(Function1 function1, Object obj) {
        Boolean bool;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            bool = (Boolean) function1.invoke(obj);
            int i3 = 20 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            bool = (Boolean) function1.invoke(obj);
        }
        int i4 = onWarmupCompleted + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    private static final Boolean onWarmupCompleted(AppState.State state) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(state, "");
            return Boolean.valueOf(Intrinsics.areEqual(state, AppState.State.Terminate.onExtraCallbackWithResult));
        }
        Intrinsics.checkNotNullParameter(state, "");
        int i3 = 67 / 0;
        return Boolean.valueOf(Intrinsics.areEqual(state, AppState.State.Terminate.onExtraCallbackWithResult));
    }
}

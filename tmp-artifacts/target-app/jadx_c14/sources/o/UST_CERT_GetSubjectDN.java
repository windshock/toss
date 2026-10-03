package o;

import im.toss.splittarget.spec.fsm.AppState;
import im.toss.state.spec.SessionState;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.UST_CERT_GetSubjectDN;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_GetSubjectDN implements TextFieldScrollKtExternalSyntheticLambda0 {
    private final TextFieldSizeKtExternalSyntheticLambda2 onWarmupCompleted = new TextFieldSizeKtExternalSyntheticLambda2(this);

    public UST_CERT_GetSubjectDN() {
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = JsonReaderUnknownNumberParsing.onNavigationEvent(new Callable() { // from class: viva.republica.toss.core.LoggingLifecycleOwner$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UST_CERT_GetSubjectDN.onExtraCallbackWithResult();
            }
        }).onExtraCallback(clearTid.onNavigationEvent());
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.core.LoggingLifecycleOwner$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return UST_CERT_GetSubjectDN.onExtraCallbackWithResult((AppState) obj);
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsingOnExtraCallback.IAuthTabCallback(new deserializeIntNullableCollection() { // from class: viva.republica.toss.core.LoggingLifecycleOwner$$ExternalSyntheticLambda3
            public final Object apply(Object obj) {
                return UST_CERT_GetSubjectDN.onNavigationEvent(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingIAuthTabCallback, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingIAuthTabCallback.onWarmupCompleted(NetConverter3.onExtraCallback());
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.core.LoggingLifecycleOwner$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return UST_CERT_GetSubjectDN.onExtraCallbackWithResult(this.f$0, (Boolean) obj);
            }
        };
        jsonReaderUnknownNumberParsingOnWarmupCompleted.IAuthTabCallback(new deserializeFloat() { // from class: viva.republica.toss.core.LoggingLifecycleOwner$$ExternalSyntheticLambda5
            public final void accept(Object obj) {
                UST_CERT_GetSubjectDN.onTransact(function12, obj);
            }
        });
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback2 = JsonReaderUnknownNumberParsing.onNavigationEvent(new Callable() { // from class: viva.republica.toss.core.LoggingLifecycleOwner$$ExternalSyntheticLambda6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UST_CERT_GetSubjectDN.onWarmupCompleted();
            }
        }).onExtraCallback(clearTid.onNavigationEvent());
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.core.LoggingLifecycleOwner$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return UST_CERT_GetSubjectDN.onWarmupCompleted((SessionState) obj);
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback2 = jsonReaderUnknownNumberParsingOnExtraCallback2.IAuthTabCallback(new deserializeIntNullableCollection() { // from class: viva.republica.toss.core.LoggingLifecycleOwner$$ExternalSyntheticLambda8
            public final Object apply(Object obj) {
                return UST_CERT_GetSubjectDN.asInterface(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingIAuthTabCallback2, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted2 = jsonReaderUnknownNumberParsingIAuthTabCallback2.onWarmupCompleted(NetConverter3.onExtraCallback());
        final Function1 function14 = new Function1() { // from class: viva.republica.toss.core.LoggingLifecycleOwner$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return UST_CERT_GetSubjectDN.IAuthTabCallback(this.f$0, (Boolean) obj);
            }
        };
        jsonReaderUnknownNumberParsingOnWarmupCompleted2.IAuthTabCallback(new deserializeFloat() { // from class: viva.republica.toss.core.LoggingLifecycleOwner$$ExternalSyntheticLambda10
            public final void accept(Object obj) {
                UST_CERT_GetSubjectDN.IAuthTabCallbackDefault(function14, obj);
            }
        });
    }

    public TextFieldKeyInputExternalSyntheticLambda9 getLifecycle() {
        return this.onWarmupCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppState onExtraCallbackWithResult() {
        return AppState.Companion.onExtraCallbackWithResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallbackWithResult(AppState appState) {
        Intrinsics.checkNotNullParameter(appState, "");
        return appState.onNavigationEvent(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onNavigationEvent(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTransact(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(UST_CERT_GetSubjectDN uST_CERT_GetSubjectDN, Boolean bool) {
        if (bool.booleanValue()) {
            uST_CERT_GetSubjectDN.onWarmupCompleted.IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_RESUME);
        } else if (uST_CERT_GetSubjectDN.onWarmupCompleted.IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
            uST_CERT_GetSubjectDN.onWarmupCompleted.IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_PAUSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionState onWarmupCompleted() {
        return SessionState.Companion.onExtraCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk asInterface(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onWarmupCompleted(SessionState sessionState) {
        Intrinsics.checkNotNullParameter(sessionState, "");
        return sessionState.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit IAuthTabCallback(final UST_CERT_GetSubjectDN uST_CERT_GetSubjectDN, Boolean bool) throws NoWhenBranchMatchedException {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            uST_CERT_GetSubjectDN.onWarmupCompleted.IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_RESUME);
        } else {
            if (!Intrinsics.areEqual(bool, Boolean.FALSE)) {
                throw new NoWhenBranchMatchedException();
            }
            NetConverter3.onExtraCallback().onNavigationEvent(new Runnable() { // from class: viva.republica.toss.core.LoggingLifecycleOwner$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UST_CERT_GetSubjectDN.IAuthTabCallback(this.f$0);
                }
            }, 5L, TimeUnit.SECONDS);
        }
        return Unit.INSTANCE;
    }

    public static void IAuthTabCallback(UST_CERT_GetSubjectDN uST_CERT_GetSubjectDN) {
        if (SessionState.Companion.onExtraCallback().IAuthTabCallbackStub()) {
            return;
        }
        uST_CERT_GetSubjectDN.onWarmupCompleted.IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP);
    }
}

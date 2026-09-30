package o;

import com.facebook.internal.readTypedObject;
import kotlin.jvm.JvmStatic;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getCancellationSignalannotations {
    public static final getCancellationSignalannotations onExtraCallbackWithResult = new getCancellationSignalannotations();

    private getCancellationSignalannotations() {
    }

    @JvmStatic
    public static final void onExtraCallbackWithResult() {
        if (performIntercept.asBinder()) {
            readTypedObject.IAuthTabCallback(readTypedObject.onNavigationEvent.CrashReport, onExtraCallback.onExtraCallback);
            readTypedObject.IAuthTabCallback(readTypedObject.onNavigationEvent.ErrorReport, onWarmupCompleted.onExtraCallbackWithResult);
            readTypedObject.IAuthTabCallback(readTypedObject.onNavigationEvent.AnrReport, onExtraCallbackWithResult.onNavigationEvent);
        }
    }

    static final class onExtraCallback implements readTypedObject.onExtraCallbackWithResult {
        public static final onExtraCallback onExtraCallback = new onExtraCallback();

        onExtraCallback() {
        }

        public final void onExtraCallbackWithResult(boolean z) {
            if (z) {
                invokePlayServices.Companion.onExtraCallbackWithResult();
                if (readTypedObject.IAuthTabCallback(readTypedObject.onNavigationEvent.CrashShield)) {
                    constructBeginSignInRequestcredentials_play_services_auth_release.onExtraCallback();
                    convertResponseToCredentialManager.IAuthTabCallback();
                }
                if (readTypedObject.IAuthTabCallback(readTypedObject.onNavigationEvent.ThreadCheck)) {
                    convertRequestToPlayServices.onExtraCallbackWithResult();
                }
            }
        }
    }

    static final class onWarmupCompleted implements readTypedObject.onExtraCallbackWithResult {
        public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();

        onWarmupCompleted() {
        }

        public final void onExtraCallbackWithResult(boolean z) {
            if (z) {
                getCallback.onWarmupCompleted();
            }
        }
    }

    static final class onExtraCallbackWithResult implements readTypedObject.onExtraCallbackWithResult {
        public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
        }

        public final void onExtraCallbackWithResult(boolean z) {
            if (z) {
                getCallbackannotations.onExtraCallback();
            }
        }
    }
}

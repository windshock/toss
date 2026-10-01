package o;

import java.util.UUID;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class requestChildRectangleOnScreen$onExtraCallbackWithResult implements Runnable {
    final /* synthetic */ String IAuthTabCallback;
    final /* synthetic */ long onExtraCallbackWithResult;

    requestChildRectangleOnScreen$onExtraCallbackWithResult(long j, String str) {
        this.onExtraCallbackWithResult = j;
        this.IAuthTabCallback = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            requestChildRectangleOnScreen requestchildrectangleonscreen = requestChildRectangleOnScreen.onNavigationEvent;
            if (requestChildRectangleOnScreen.IAuthTabCallback(requestchildrectangleonscreen) == null) {
                requestChildRectangleOnScreen.onExtraCallback(requestchildrectangleonscreen, new setWindowInsets(Long.valueOf(this.onExtraCallbackWithResult), (Long) null, (UUID) null, 4, (DefaultConstructorMarker) null));
            }
            setWindowInsets setwindowinsetsIAuthTabCallback = requestChildRectangleOnScreen.IAuthTabCallback(requestchildrectangleonscreen);
            if (setwindowinsetsIAuthTabCallback != null) {
                setwindowinsetsIAuthTabCallback.IAuthTabCallback(Long.valueOf(this.onExtraCallbackWithResult));
            }
            if (requestChildRectangleOnScreen.asInterface(requestchildrectangleonscreen).get() <= 0) {
                onExtraCallback onextracallback = new onExtraCallback();
                synchronized (requestChildRectangleOnScreen.onNavigationEvent(requestchildrectangleonscreen)) {
                    requestChildRectangleOnScreen.onWarmupCompleted(requestchildrectangleonscreen, requestChildRectangleOnScreen.IAuthTabCallbackDefault(requestchildrectangleonscreen).schedule(onextracallback, requestChildRectangleOnScreen.IAuthTabCallbackStub(requestchildrectangleonscreen), TimeUnit.SECONDS));
                    Unit unit = Unit.INSTANCE;
                }
            }
            long jOnExtraCallbackWithResult = requestChildRectangleOnScreen.onExtraCallbackWithResult(requestchildrectangleonscreen);
            requestDisallowInterceptTouchEvent.onWarmupCompleted(this.IAuthTabCallback, jOnExtraCallbackWithResult > 0 ? (this.onExtraCallbackWithResult - jOnExtraCallbackWithResult) / 1000 : 0L);
            setWindowInsets setwindowinsetsIAuthTabCallback2 = requestChildRectangleOnScreen.IAuthTabCallback(requestchildrectangleonscreen);
            if (setwindowinsetsIAuthTabCallback2 != null) {
                setwindowinsetsIAuthTabCallback2.asInterface();
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    static final class onExtraCallback implements Runnable {
        onExtraCallback() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (convertResponseToCredentialManager.onExtraCallback(this)) {
                return;
            }
            try {
                requestChildRectangleOnScreen requestchildrectangleonscreen = requestChildRectangleOnScreen.onNavigationEvent;
                if (requestChildRectangleOnScreen.IAuthTabCallback(requestchildrectangleonscreen) == null) {
                    requestChildRectangleOnScreen.onExtraCallback(requestchildrectangleonscreen, new setWindowInsets(Long.valueOf(requestChildRectangleOnScreen$onExtraCallbackWithResult.this.onExtraCallbackWithResult), (Long) null, (UUID) null, 4, (DefaultConstructorMarker) null));
                }
                if (requestChildRectangleOnScreen.asInterface(requestchildrectangleonscreen).get() <= 0) {
                    setStatusBarBackgroundResource.onExtraCallbackWithResult(requestChildRectangleOnScreen$onExtraCallbackWithResult.this.IAuthTabCallback, requestChildRectangleOnScreen.IAuthTabCallback(requestchildrectangleonscreen), requestChildRectangleOnScreen.onWarmupCompleted(requestchildrectangleonscreen));
                    setWindowInsets.Companion.onNavigationEvent();
                    requestChildRectangleOnScreen.onExtraCallback(requestchildrectangleonscreen, (setWindowInsets) null);
                }
                synchronized (requestChildRectangleOnScreen.onNavigationEvent(requestchildrectangleonscreen)) {
                    requestChildRectangleOnScreen.onWarmupCompleted(requestchildrectangleonscreen, (ScheduledFuture) null);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
            }
        }
    }
}

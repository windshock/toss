package o;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCertV2PEM implements getCertV3ExpirationDate {
    private final View onExtraCallbackWithResult;

    public getCertV2PEM(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult = view;
    }

    private final EventDispatcher onWarmupCompleted() {
        ReactContext context = this.onExtraCallbackWithResult.getContext();
        ReactContext reactContext = context instanceof ReactContext ? context : null;
        if (reactContext == null) {
            return null;
        }
        return r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(reactContext, this.onExtraCallbackWithResult.getId());
    }

    @Override // o.getCertV3ExpirationDate
    public void onExtraCallback(@NotNull Event<?> event) {
        Intrinsics.checkNotNullParameter(event, BuildConfig.FLAVOR);
        EventDispatcher eventDispatcherOnWarmupCompleted = onWarmupCompleted();
        if (eventDispatcherOnWarmupCompleted != null) {
            eventDispatcherOnWarmupCompleted.onWarmupCompleted(event);
        }
    }

    @Override // o.getCertV3ExpirationDate
    public int onExtraCallbackWithResult() {
        return r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(this.onExtraCallbackWithResult);
    }
}

package o;

import android.view.View;
import com.teleport.host.PortalHostView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class wasReturnedFromScrap {
    private RecyclerViewAccessibilityDelegate onExtraCallback;
    private CredentialProviderControllermaybeReportErrorFromResultReceiver1 onNavigationEvent;
    private final View onWarmupCompleted;

    public wasReturnedFromScrap(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.onWarmupCompleted = view;
        this.onExtraCallback = RecyclerViewAccessibilityDelegate.Companion.onNavigationEvent();
    }

    public final void onNavigationEvent(@Nullable CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1) {
        this.onNavigationEvent = credentialProviderControllermaybeReportErrorFromResultReceiver1;
    }

    public final void IAuthTabCallback(@Nullable String str, @Nullable PortalHostView portalHostView) {
        CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1 = this.onNavigationEvent;
        PortalHostView portalHostViewOnNavigationEvent = onNavigationEvent(str, portalHostView);
        if (credentialProviderControllermaybeReportErrorFromResultReceiver1 != null) {
            if (portalHostViewOnNavigationEvent == null) {
                onNavigationEvent();
            } else {
                onExtraCallbackWithResult(credentialProviderControllermaybeReportErrorFromResultReceiver1, onExtraCallbackWithResult(portalHostViewOnNavigationEvent));
            }
        }
    }

    public final void onNavigationEvent() {
        CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1 = this.onNavigationEvent;
        if (credentialProviderControllermaybeReportErrorFromResultReceiver1 != null) {
            onExtraCallbackWithResult(credentialProviderControllermaybeReportErrorFromResultReceiver1, RecyclerViewAccessibilityDelegate.Companion.onNavigationEvent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PortalHostView onNavigationEvent(String str, PortalHostView portalHostView) {
        if (str == null || portalHostView == 0 || shouldIgnore.IAuthTabCallback(portalHostView)) {
            return null;
        }
        return portalHostView;
    }

    private final void onExtraCallbackWithResult(CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1, RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        if (Intrinsics.areEqual(this.onExtraCallback, recyclerViewAccessibilityDelegate)) {
            return;
        }
        this.onExtraCallback = recyclerViewAccessibilityDelegate;
        credentialProviderControllermaybeReportErrorFromResultReceiver1.updateState(recyclerViewAccessibilityDelegate.onNavigationEvent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final RecyclerViewAccessibilityDelegate onExtraCallbackWithResult(PortalHostView portalHostView) {
        int[] iArrOnExtraCallbackWithResult = shouldIgnore.IAuthTabCallback(this.onWarmupCompleted) ? shouldIgnore.onExtraCallbackWithResult(portalHostView) : shouldIgnore.onExtraCallbackWithResult(this.onWarmupCompleted);
        return new RecyclerViewAccessibilityDelegate(setIsRecyclable.onExtraCallback(portalHostView.getWidth()), setIsRecyclable.onExtraCallback(portalHostView.getHeight()), setIsRecyclable.onExtraCallback(r0[0] - iArrOnExtraCallbackWithResult[0]), setIsRecyclable.onExtraCallback(r0[1] - iArrOnExtraCallbackWithResult[1]));
    }
}

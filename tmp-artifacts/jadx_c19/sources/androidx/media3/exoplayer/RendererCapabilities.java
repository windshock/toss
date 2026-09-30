package androidx.media3.exoplayer;

import o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface RendererCapabilities {

    public interface Listener {
        void onExtraCallback(Renderer renderer);
    }

    static int IAuthTabCallbackStub(int i2) {
        return i2 & 32;
    }

    static int asBinder(int i2) {
        return i2 & 64;
    }

    static int onExtraCallback(int i2) {
        return i2 & 384;
    }

    static int onExtraCallback(int i2, int i3, int i4, int i5, int i6, int i7) {
        return i2 | i3 | i4 | i5 | i6 | i7;
    }

    static int onExtraCallbackWithResult(int i2) {
        return i2 & 7;
    }

    static int onNavigationEvent(int i2) {
        return i2 & 3584;
    }

    static int onWarmupCompleted(int i2) {
        return i2 & 24;
    }

    int ICustomTabsCallback();

    default void Y_() {
    }

    String extraCommand();

    int isEngagementSignalsApiAvailable() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4;

    int onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4;

    default void onNavigationEvent(Listener listener) {
    }

    static int IAuthTabCallback(int i2) {
        return onNavigationEvent(i2, 0, 0, 0);
    }

    static int onNavigationEvent(int i2, int i3, int i4, int i5) {
        return onExtraCallback(i2, i3, i4, 0, 128, i5);
    }

    static int onWarmupCompleted(int i2, int i3, int i4, int i5, int i6) {
        return onExtraCallback(i2, i3, i4, i5, i6, 0);
    }

    static boolean onExtraCallback(int i2, boolean z) {
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i2);
        if (iOnExtraCallbackWithResult != 4) {
            return z && iOnExtraCallbackWithResult == 3;
        }
        return true;
    }
}

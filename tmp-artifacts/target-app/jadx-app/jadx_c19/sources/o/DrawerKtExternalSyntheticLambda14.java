package o;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface DrawerKtExternalSyntheticLambda14 {

    public interface IAuthTabCallback {
        void IAuthTabCallback();

        void onExtraCallback(long j);
    }

    public interface onExtraCallback {
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback() { // from class: o.DrawerKtExternalSyntheticLambda14.onExtraCallback.5
        };

        default void IAuthTabCallback(CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) {
        }

        default void onExtraCallback() {
        }

        default void onExtraCallbackWithResult(onNavigationEvent onnavigationevent) {
        }

        default void onNavigationEvent() {
        }

        default void onWarmupCompleted() {
        }
    }

    Surface IAuthTabCallback();

    void IAuthTabCallback(int i2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, long j, int i3, List<Object> list);

    void IAuthTabCallback(Surface surface, TextFieldDecoratorModifierNodeExternalSyntheticLambda25 textFieldDecoratorModifierNodeExternalSyntheticLambda25);

    void IAuthTabCallback(List<Object> list);

    void IAuthTabCallback(boolean z);

    boolean IAuthTabCallback(long j, IAuthTabCallback iAuthTabCallback);

    void IAuthTabCallbackDefault();

    void IAuthTabCallbackStub();

    void asBinder();

    void asInterface();

    boolean onExtraCallback();

    boolean onExtraCallback(boolean z);

    void onExtraCallbackWithResult();

    void onExtraCallbackWithResult(int i2);

    void onNavigationEvent();

    void onNavigationEvent(long j);

    void onNavigationEvent(DrawerKtExternalSyntheticLambda0 drawerKtExternalSyntheticLambda0);

    void onNavigationEvent(onExtraCallback onextracallback, Executor executor);

    void onNavigationEvent(boolean z);

    void onTransact();

    void onWarmupCompleted(float f);

    void onWarmupCompleted(long j, long j2) throws onNavigationEvent;

    boolean onWarmupCompleted();

    boolean onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws onNavigationEvent;

    public static final class onNavigationEvent extends Exception {
        public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 format;

        public onNavigationEvent(Throwable th, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            super(th);
            this.format = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        }
    }
}

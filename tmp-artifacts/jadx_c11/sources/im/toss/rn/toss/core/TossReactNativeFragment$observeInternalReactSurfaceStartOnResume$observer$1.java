package im.toss.rn.toss.core;

import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldScrollKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TossReactNativeFragment$observeInternalReactSurfaceStartOnResume$observer$1 implements DefaultLifecycleObserver {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    final /* synthetic */ TossReactNativeFragment onWarmupCompleted;

    public static /* synthetic */ void IAuthTabCallback(TossReactNativeFragment tossReactNativeFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(tossReactNativeFragment);
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = onExtraCallback + 21;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    TossReactNativeFragment$observeInternalReactSurfaceStartOnResume$observer$1(TossReactNativeFragment tossReactNativeFragment) {
        this.onWarmupCompleted = tossReactNativeFragment;
    }

    public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = IAuthTabCallback + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = onExtraCallback + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = onExtraCallback + 53;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStop(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(TossReactNativeFragment tossReactNativeFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TossReactNativeFragment.extraCallback(tossReactNativeFragment);
        int i4 = onExtraCallback + 3;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().onExtraCallbackWithResult(this);
        if (TossReactNativeFragment.IAuthTabCallbackStubProxy(this.onWarmupCompleted) == this) {
            int i4 = onExtraCallback + 115;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                TossReactNativeFragment.IAuthTabCallback(this.onWarmupCompleted, (DefaultLifecycleObserver) null);
                int i5 = 74 / 0;
            } else {
                TossReactNativeFragment.IAuthTabCallback(this.onWarmupCompleted, (DefaultLifecycleObserver) null);
            }
        }
        View viewICustomTabsCallback = TossReactNativeFragment.ICustomTabsCallback(this.onWarmupCompleted);
        if (viewICustomTabsCallback == null) {
            viewICustomTabsCallback = this.onWarmupCompleted.getView();
            int i6 = onExtraCallback + 17;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        if (viewICustomTabsCallback == null) {
            TossReactNativeFragment.extraCallback(this.onWarmupCompleted);
        } else {
            final TossReactNativeFragment tossReactNativeFragment = this.onWarmupCompleted;
            viewICustomTabsCallback.post(new Runnable() { // from class: im.toss.rn.toss.core.TossReactNativeFragment$observeInternalReactSurfaceStartOnResume$observer$1$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 23;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    TossReactNativeFragment$observeInternalReactSurfaceStartOnResume$observer$1.IAuthTabCallback(tossReactNativeFragment);
                    if (i10 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
        }
    }

    public void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().onExtraCallbackWithResult(this);
        if (TossReactNativeFragment.IAuthTabCallbackStubProxy(this.onWarmupCompleted) == this) {
            TossReactNativeFragment.IAuthTabCallback(this.onWarmupCompleted, (DefaultLifecycleObserver) null);
        }
        TossReactNativeFragment.onWarmupCompleted(this.onWarmupCompleted, false);
        int i4 = onExtraCallback + 43;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}

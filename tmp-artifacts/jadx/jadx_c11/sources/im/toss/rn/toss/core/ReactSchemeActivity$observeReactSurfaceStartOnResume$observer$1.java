package im.toss.rn.toss.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.gms.internal.ads.zzaq;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldScrollKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactSchemeActivity$observeReactSurfaceStartOnResume$observer$1 implements DefaultLifecycleObserver {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ ReactSchemeActivity onNavigationEvent;

    public static /* synthetic */ void onNavigationEvent(ReactSchemeActivity reactSchemeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(reactSchemeActivity);
        int i4 = onWarmupCompleted + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    ReactSchemeActivity$observeReactSurfaceStartOnResume$observer$1(ReactSchemeActivity reactSchemeActivity) {
        this.onNavigationEvent = reactSchemeActivity;
    }

    public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = onExtraCallback + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
    }

    public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = onExtraCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStop(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 == 0) {
            throw null;
        }
    }

    public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().onExtraCallbackWithResult(this);
        Object[] objArr = {this.onNavigationEvent};
        if (((DefaultLifecycleObserver) ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 983171110, -983171096, zzaq.onNavigationEvent(), objArr, zzaq.onNavigationEvent())) == this) {
            ReactSchemeActivity.IAuthTabCallback(this.onNavigationEvent, (DefaultLifecycleObserver) null);
            int i4 = onExtraCallback + 81;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        ConstraintLayout constraintLayoutOnExtraCallback = ReactSchemeActivity.IAuthTabCallbackDefault(this.onNavigationEvent).onExtraCallback();
        final ReactSchemeActivity reactSchemeActivity = this.onNavigationEvent;
        constraintLayoutOnExtraCallback.post(new Runnable() { // from class: im.toss.rn.toss.core.ReactSchemeActivity$observeReactSurfaceStartOnResume$observer$1$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 109;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                ReactSchemeActivity$observeReactSurfaceStartOnResume$observer$1.onNavigationEvent(reactSchemeActivity);
                int i9 = onExtraCallback + 89;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    private static final void onWarmupCompleted(ReactSchemeActivity reactSchemeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        ReactSchemeActivity.IAuthTabCallback(iOnNavigationEvent, zzaq.onNavigationEvent(), 2055730810, -2055730805, iOnNavigationEvent2, new Object[]{reactSchemeActivity}, zzaq.onNavigationEvent());
        int i4 = onWarmupCompleted + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            textFieldScrollKtExternalSyntheticLambda0.getLifecycle().onExtraCallbackWithResult(this);
            throw null;
        }
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().onExtraCallbackWithResult(this);
        if (((DefaultLifecycleObserver) ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 983171110, -983171096, zzaq.onNavigationEvent(), new Object[]{this.onNavigationEvent}, zzaq.onNavigationEvent())) == this) {
            ReactSchemeActivity.IAuthTabCallback(this.onNavigationEvent, (DefaultLifecycleObserver) null);
            int i3 = onWarmupCompleted + 89;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -812057808, 812057823, zzaq.onNavigationEvent(), new Object[]{this.onNavigationEvent, false}, zzaq.onNavigationEvent());
    }
}

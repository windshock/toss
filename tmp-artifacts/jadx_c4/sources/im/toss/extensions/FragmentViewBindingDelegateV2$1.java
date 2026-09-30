package im.toss.extensions;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.PageRenderReadyListener;
import o.SearchBarKtExternalSyntheticLambda5;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.preFillDefault;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FragmentViewBindingDelegateV2$1 implements DefaultLifecycleObserver {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    final /* synthetic */ PageRenderReadyListener<T> onExtraCallbackWithResult;
    private final Function1<TextFieldScrollKtExternalSyntheticLambda0, Unit> onNavigationEvent;

    public static /* synthetic */ Unit onExtraCallbackWithResult(PageRenderReadyListener pageRenderReadyListener, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(pageRenderReadyListener, textFieldScrollKtExternalSyntheticLambda0);
        int i4 = IAuthTabCallback + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FragmentViewBindingDelegateV2$1(final PageRenderReadyListener<T> pageRenderReadyListener) {
        this.onExtraCallbackWithResult = pageRenderReadyListener;
        this.onNavigationEvent = new Function1() { // from class: im.toss.extensions.FragmentViewBindingDelegateV2$1$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 11;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = FragmentViewBindingDelegateV2$1.onExtraCallbackWithResult(pageRenderReadyListener, (TextFieldScrollKtExternalSyntheticLambda0) obj);
                int i4 = onExtraCallback + 91;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallbackWithResult;
            }
        };
    }

    public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = onExtraCallback + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStop(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(PageRenderReadyListener pageRenderReadyListener, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            PageRenderReadyListener.onWarmupCompleted(pageRenderReadyListener);
            obj.hashCode();
            throw null;
        }
        WeakReference weakReferenceOnWarmupCompleted = PageRenderReadyListener.onWarmupCompleted(pageRenderReadyListener);
        if (weakReferenceOnWarmupCompleted != null) {
            textFieldScrollKtExternalSyntheticLambda02 = (TextFieldScrollKtExternalSyntheticLambda0) weakReferenceOnWarmupCompleted.get();
        } else {
            int i3 = onExtraCallback + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            textFieldScrollKtExternalSyntheticLambda02 = null;
        }
        if (!Intrinsics.areEqual(textFieldScrollKtExternalSyntheticLambda0, textFieldScrollKtExternalSyntheticLambda02)) {
            int i5 = IAuthTabCallback + 109;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                PageRenderReadyListener.onNavigationEvent(pageRenderReadyListener, (SearchBarKtExternalSyntheticLambda5) null);
                PageRenderReadyListener.IAuthTabCallback(pageRenderReadyListener, null);
                int i6 = 75 / 0;
            } else {
                PageRenderReadyListener.onNavigationEvent(pageRenderReadyListener, (SearchBarKtExternalSyntheticLambda5) null);
                PageRenderReadyListener.IAuthTabCallback(pageRenderReadyListener, null);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 111;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        this.onExtraCallbackWithResult.onExtraCallbackWithResult().getViewLifecycleOwnerLiveData().observeForever(new preFillDefault.IAuthTabCallback(this.onNavigationEvent));
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        this.onExtraCallbackWithResult.onExtraCallbackWithResult().getViewLifecycleOwnerLiveData().removeObserver(new preFillDefault.IAuthTabCallback(this.onNavigationEvent));
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}

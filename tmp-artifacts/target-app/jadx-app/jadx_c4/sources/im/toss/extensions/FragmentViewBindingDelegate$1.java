package im.toss.extensions;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.PageContext;
import o.SearchBarKtExternalSyntheticLambda5;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.preFillDefault;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FragmentViewBindingDelegate$1 implements DefaultLifecycleObserver {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    final /* synthetic */ PageContext<T> IAuthTabCallback;
    private final Function1<TextFieldScrollKtExternalSyntheticLambda0, Unit> onExtraCallback;

    public static /* synthetic */ Unit IAuthTabCallback(PageContext pageContext, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(pageContext, textFieldScrollKtExternalSyntheticLambda0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(pageContext, textFieldScrollKtExternalSyntheticLambda0);
        int i3 = onNavigationEvent + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public FragmentViewBindingDelegate$1(final PageContext<T> pageContext) {
        this.IAuthTabCallback = pageContext;
        this.onExtraCallback = new Function1() { // from class: im.toss.extensions.FragmentViewBindingDelegate$1$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = FragmentViewBindingDelegate$1.IAuthTabCallback(pageContext, (TextFieldScrollKtExternalSyntheticLambda0) obj);
                if (i3 != 0) {
                    int i4 = 86 / 0;
                }
                return unitIAuthTabCallback;
            }
        };
    }

    public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super.onPause(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = onWarmupCompleted + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
    }

    public /* bridge */ void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super.onResume(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
    }

    public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super.onStart(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super.onStop(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = onNavigationEvent + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(PageContext pageContext, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        WeakReference weakReferenceOnExtraCallbackWithResult = PageContext.onExtraCallbackWithResult(pageContext);
        Object obj = null;
        if (weakReferenceOnExtraCallbackWithResult != null) {
            int i4 = onWarmupCompleted + 21;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            textFieldScrollKtExternalSyntheticLambda02 = (TextFieldScrollKtExternalSyntheticLambda0) weakReferenceOnExtraCallbackWithResult.get();
        } else {
            textFieldScrollKtExternalSyntheticLambda02 = null;
        }
        if (!Intrinsics.areEqual(textFieldScrollKtExternalSyntheticLambda0, textFieldScrollKtExternalSyntheticLambda02)) {
            PageContext.onExtraCallbackWithResult(pageContext, (SearchBarKtExternalSyntheticLambda5) null);
            PageContext.onExtraCallback(pageContext, null);
        }
        return Unit.INSTANCE;
    }

    public void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        this.IAuthTabCallback.IAuthTabCallback().getViewLifecycleOwnerLiveData().observeForever(new preFillDefault.IAuthTabCallback(this.onExtraCallback));
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 42 / 0;
        }
    }

    public void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        this.IAuthTabCallback.IAuthTabCallback().getViewLifecycleOwnerLiveData().removeObserver(new preFillDefault.IAuthTabCallback(this.onExtraCallback));
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }
}

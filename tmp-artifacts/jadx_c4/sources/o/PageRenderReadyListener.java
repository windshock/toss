package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import im.toss.extensions.FragmentViewBindingDelegateV2$1;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import o.SearchBarKtExternalSyntheticLambda5;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PageRenderReadyListener<T extends SearchBarKtExternalSyntheticLambda5> implements ReadOnlyProperty<Fragment, T> {
    private static int asInterface = 1;
    private static int onNavigationEvent;
    private final Function1<View, T> IAuthTabCallback;
    private WeakReference<TextFieldScrollKtExternalSyntheticLambda0> onExtraCallback;
    private T onExtraCallbackWithResult;
    private final Fragment onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public PageRenderReadyListener(@NotNull Fragment fragment, @NotNull Function1<? super View, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted = fragment;
        this.IAuthTabCallback = function1;
        fragment.getLifecycle().IAuthTabCallback(new FragmentViewBindingDelegateV2$1(this));
    }

    public static final /* synthetic */ void IAuthTabCallback(PageRenderReadyListener pageRenderReadyListener, WeakReference weakReference) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        pageRenderReadyListener.onExtraCallback = weakReference;
        int i5 = i2 + 77;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void onNavigationEvent(PageRenderReadyListener pageRenderReadyListener, SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        pageRenderReadyListener.onExtraCallbackWithResult = searchBarKtExternalSyntheticLambda5;
        int i5 = i2 + 115;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ WeakReference onWarmupCompleted(PageRenderReadyListener pageRenderReadyListener) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        WeakReference<TextFieldScrollKtExternalSyntheticLambda0> weakReference = pageRenderReadyListener.onExtraCallback;
        int i5 = i2 + 21;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return weakReference;
    }

    public /* synthetic */ Object getValue(Object obj, addAllCommandLine addallcommandline) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        asInterface = i2 % 128;
        Fragment fragment = (Fragment) obj;
        if (i2 % 2 == 0) {
            onNavigationEvent(fragment, (addAllCommandLine<?>) addallcommandline);
            throw null;
        }
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnNavigationEvent = onNavigationEvent(fragment, (addAllCommandLine<?>) addallcommandline);
        int i3 = onNavigationEvent + 35;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 0;
        }
        return searchBarKtExternalSyntheticLambda5OnNavigationEvent;
    }

    public final Fragment onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    public T onNavigationEvent(@NotNull Fragment fragment, @NotNull addAllCommandLine<?> addallcommandline) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(addallcommandline, "");
        T t = this.onExtraCallbackWithResult;
        if (t != null) {
            int i4 = asInterface + 49;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return t;
        }
        try {
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = this.onWarmupCompleted.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            if (!viewLifecycleOwner.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.INITIALIZED)) {
                throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
            }
            Function1<View, T> function1 = this.IAuthTabCallback;
            View viewRequireView = fragment.requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView, "");
            Object objInvoke = function1.invoke(viewRequireView);
            this.onExtraCallbackWithResult = (T) objInvoke;
            this.onExtraCallback = new WeakReference<>(viewLifecycleOwner);
            T t2 = (T) objInvoke;
            int i6 = onNavigationEvent + 45;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return t2;
        } catch (Throwable unused) {
            return null;
        }
    }
}

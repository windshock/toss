package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import im.toss.extensions.FragmentViewBindingDelegate$1;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import o.SearchBarKtExternalSyntheticLambda5;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PageContext<T extends SearchBarKtExternalSyntheticLambda5> implements ReadOnlyProperty<Fragment, T> {
    private static int asBinder = 0;
    private static int asInterface = 1;
    public static final int onNavigationEvent = 8;
    private final Function1<View, T> IAuthTabCallback;
    private WeakReference<TextFieldScrollKtExternalSyntheticLambda0> onExtraCallback;
    private T onExtraCallbackWithResult;
    private final Fragment onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public PageContext(@NotNull Fragment fragment, @NotNull Function1<? super View, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted = fragment;
        this.IAuthTabCallback = function1;
        fragment.getLifecycle().IAuthTabCallback(new FragmentViewBindingDelegate$1(this));
    }

    public static final /* synthetic */ void onExtraCallback(PageContext pageContext, WeakReference weakReference) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 125;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        pageContext.onExtraCallback = weakReference;
        if (i4 == 0) {
            int i5 = 83 / 0;
        }
        int i6 = i2 + 31;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ WeakReference onExtraCallbackWithResult(PageContext pageContext) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        WeakReference<TextFieldScrollKtExternalSyntheticLambda0> weakReference = pageContext.onExtraCallback;
        int i5 = i3 + 89;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return weakReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void onExtraCallbackWithResult(PageContext pageContext, SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 89;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        pageContext.onExtraCallbackWithResult = searchBarKtExternalSyntheticLambda5;
        int i5 = i2 + 77;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ Object getValue(Object obj, addAllCommandLine addallcommandline) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = onExtraCallbackWithResult((Fragment) obj, (addAllCommandLine<?>) addallcommandline);
        int i4 = asInterface + 49;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
    }

    public final Fragment IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Fragment fragment = this.onWarmupCompleted;
        int i4 = i3 + 91;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return fragment;
    }

    public T onExtraCallbackWithResult(@NotNull Fragment fragment, @NotNull addAllCommandLine<?> addallcommandline) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(addallcommandline, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(addallcommandline, "");
        T t = this.onExtraCallbackWithResult;
        if (t != null) {
            int i3 = asBinder + 49;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 68 / 0;
            }
            return t;
        }
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = this.onWarmupCompleted.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        if (!viewLifecycleOwner.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.INITIALIZED)) {
            throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
        }
        Function1<View, T> function1 = this.IAuthTabCallback;
        View viewRequireView = fragment.requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "");
        T t2 = (T) function1.invoke(viewRequireView);
        this.onExtraCallbackWithResult = t2;
        this.onExtraCallback = new WeakReference<>(viewLifecycleOwner);
        return t2;
    }
}

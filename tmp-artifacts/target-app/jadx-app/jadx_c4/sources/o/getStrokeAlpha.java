package o;

import android.app.Activity;
import android.app.Dialog;
import android.view.LayoutInflater;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import o.SearchBarKtExternalSyntheticLambda5;
import o.getStrokeAlpha;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getStrokeAlpha {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static final /* synthetic */ class onExtraCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public onExtraCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 57;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i5 = i2 + 89;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (obj instanceof FunctionAdapter) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i7 = onExtraCallback + 103;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 93 / 0;
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onWarmupCompleted + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = onWarmupCompleted + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ SearchBarKtExternalSyntheticLambda5 IAuthTabCallback(Function1 function1, Dialog dialog) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = onExtraCallbackWithResult(function1, dialog);
        int i4 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
    }

    public static /* synthetic */ SearchBarKtExternalSyntheticLambda5 onNavigationEvent(Function1 function1, Activity activity) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallback = onExtraCallback(function1, activity);
        int i4 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return searchBarKtExternalSyntheticLambda5OnExtraCallback;
    }

    public static final <T extends SearchBarKtExternalSyntheticLambda5> Lazy<T> IAuthTabCallback(@NotNull final Activity activity, @NotNull final Function1<? super LayoutInflater, ? extends T> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Lazy<T> lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new Function0() { // from class: im.toss.ads_sdk.ViewBindingsKt$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 65;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnNavigationEvent = getStrokeAlpha.onNavigationEvent(function1, activity);
                int i5 = onWarmupCompleted + 121;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return searchBarKtExternalSyntheticLambda5OnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
        return lazyOnNavigationEvent;
    }

    private static final SearchBarKtExternalSyntheticLambda5 onExtraCallback(Function1 function1, Activity activity) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5 = (SearchBarKtExternalSyntheticLambda5) function1.invoke(layoutInflater);
        if (i3 != 0) {
            return searchBarKtExternalSyntheticLambda5;
        }
        throw null;
    }

    private static final SearchBarKtExternalSyntheticLambda5 onExtraCallbackWithResult(Function1 function1, Dialog dialog) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        LayoutInflater layoutInflater = dialog.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5 = (SearchBarKtExternalSyntheticLambda5) function1.invoke(layoutInflater);
        int i4 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return searchBarKtExternalSyntheticLambda5;
    }
}

package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class preFillDefault {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final /* synthetic */ class IAuthTabCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public IAuthTabCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                throw null;
            }
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i4 = i3 + 87;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                if (obj instanceof FunctionAdapter) {
                    int i6 = i3 + 57;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i8 = onNavigationEvent + 111;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 91 / 0;
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onExtraCallbackWithResult;
            int i5 = i3 + 93;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 82 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                getFunctionDelegate().hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = onWarmupCompleted + 45;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke(obj);
            int i4 = onWarmupCompleted + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 69 / 0;
            }
        }
    }

    @Deprecated
    public static final <T extends SearchBarKtExternalSyntheticLambda5> PageContext<T> onExtraCallbackWithResult(@NotNull Fragment fragment, @NotNull Function1<? super View, ? extends T> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function1, "");
        PageContext<T> pageContext = new PageContext<>(fragment, function1);
        int i2 = onExtraCallbackWithResult + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return pageContext;
        }
        throw null;
    }

    public static final <T extends SearchBarKtExternalSyntheticLambda5> PageRenderReadyListener<T> IAuthTabCallback(@NotNull Fragment fragment, @NotNull Function1<? super View, ? extends T> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function1, "");
        PageRenderReadyListener<T> pageRenderReadyListener = new PageRenderReadyListener<>(fragment, function1);
        int i2 = onExtraCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
        return pageRenderReadyListener;
    }
}

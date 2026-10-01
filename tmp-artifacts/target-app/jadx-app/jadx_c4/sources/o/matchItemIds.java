package o;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class matchItemIds {
    public static final <VMF> AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallbackWithResult(@NotNull AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2, @NotNull Function1<? super VMF, ? extends ViewModel> function1) {
        Intrinsics.checkNotNullParameter(androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return IAuthTabCallback(new ComposableSingletonsDefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda0(androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2), function1);
    }

    static final class IAuthTabCallback extends Lambda implements Function1<Object, ViewModel> {
        final /* synthetic */ Function1<VMF, ViewModel> $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(Function1<? super VMF, ? extends ViewModel> function1) {
            super(1);
            this.$callback = function1;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final ViewModel invoke(Object obj) {
            return (ViewModel) this.$callback.invoke(obj);
        }
    }

    public static final <VMF> AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 IAuthTabCallback(@NotNull ComposableSingletonsDefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda0 composableSingletonsDefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda0, @NotNull Function1<? super VMF, ? extends ViewModel> function1) {
        Intrinsics.checkNotNullParameter(composableSingletonsDefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.IAuthTabCallback<Function1<Object, ViewModel>> iAuthTabCallback = addUnmatched.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(iAuthTabCallback, "");
        composableSingletonsDefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda0.onWarmupCompleted(iAuthTabCallback, new IAuthTabCallback(function1));
        return composableSingletonsDefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda0;
    }
}

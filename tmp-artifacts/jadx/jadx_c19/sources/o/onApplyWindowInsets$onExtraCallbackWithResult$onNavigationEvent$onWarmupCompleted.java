package o;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.onApplyWindowInsets;
import o.setOnHierarchyChangeListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class onApplyWindowInsets$onExtraCallbackWithResult$onNavigationEvent$onWarmupCompleted implements setOnHierarchyChangeListener.onWarmupCompleted {
    final /* synthetic */ List IAuthTabCallback;

    onApplyWindowInsets$onExtraCallbackWithResult$onNavigationEvent$onWarmupCompleted(List list) {
        this.IAuthTabCallback = list;
    }

    public final void IAuthTabCallback(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "");
        final getScrimColor getscrimcolorIAuthTabCallback = getScrimColor.Companion.IAuthTabCallback(file);
        if (getscrimcolorIAuthTabCallback != null) {
            for (final onApplyWindowInsets.onExtraCallbackWithResult onextracallbackwithresult : this.IAuthTabCallback) {
                onApplyWindowInsets.onExtraCallbackWithResult.onNavigationEvent.onExtraCallbackWithResult(onApplyWindowInsets.onExtraCallbackWithResult.Companion, onextracallbackwithresult.onExtraCallback(), onextracallbackwithresult.onTransact() + "_" + onextracallbackwithresult.asInterface() + "_rule", new setOnHierarchyChangeListener.onWarmupCompleted() { // from class: o.onApplyWindowInsets$onExtraCallbackWithResult$onNavigationEvent$onWarmupCompleted.5
                    public final void IAuthTabCallback(@NotNull File file2) {
                        Intrinsics.checkNotNullParameter(file2, "");
                        onextracallbackwithresult.onWarmupCompleted(getscrimcolorIAuthTabCallback);
                        onextracallbackwithresult.onExtraCallback(file2);
                        Runnable runnableOnExtraCallbackWithResult = onApplyWindowInsets.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult);
                        if (runnableOnExtraCallbackWithResult != null) {
                            runnableOnExtraCallbackWithResult.run();
                        }
                    }
                });
            }
        }
    }
}

package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class AppLovinSdkUtils implements View.OnLayoutChangeListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Function1<View, Unit> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public AppLovinSdkUtils(@NotNull Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted = function1;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            this.onWarmupCompleted.invoke(view);
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            this.onWarmupCompleted.invoke(view);
            throw null;
        }
    }
}

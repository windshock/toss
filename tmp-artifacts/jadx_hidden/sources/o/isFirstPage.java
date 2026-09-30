package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class isFirstPage implements bindPreRenderContext {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(isFirstPage.class);
    public static final isFirstPage onExtraCallbackWithResult = new isFirstPage();

    static {
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2171);
    }

    @Override // o.bindPreRenderContext
    public void onWarmupCompleted(@NotNull writeDataToParcelable writedatatoparcelable) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(221);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        int i5 = (((i4 & i3) | (i3 ^ i4)) >> 26) & 1;
        Object obj = null;
        Intrinsics.checkNotNullParameter(writedatatoparcelable, "");
        if (i5 != 0) {
            throw null;
        }
        int i6 = onWarmupCompleted;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5109);
        if ((((((~i6) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i6)) >> 10) & 1) != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private isFirstPage() {
    }
}

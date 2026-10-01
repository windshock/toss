package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdawm4poh0toUcK03Yte94uAzTj6Xc;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaiWUleEdQikcDNtpoSyB6XdyDG8<S extends r8lambdawm4poh0toUcK03Yte94uAzTj6Xc> implements r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU<S> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final List<r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4<S>> IAuthTabCallback = new ArrayList();

    public final List<r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4<S>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        List<r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4<S>> list = this.IAuthTabCallback;
        int i5 = i3 + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU
    public void IAuthTabCallback(@NotNull getBacktraceNote<? super S, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        this.IAuthTabCallback.add(new r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4<>(this.IAuthTabCallback.size(), getbacktracenote));
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
    }
}

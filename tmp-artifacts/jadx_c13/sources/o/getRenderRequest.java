package o;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getRenderRequest {
    private static final boolean onExtraCallbackWithResult;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        onExtraCallbackWithResult = z;
    }

    public static final <T> getShakeView<T> onWarmupCompleted(@NotNull Function1<? super KClass<?>, ? extends KSerializer<T>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return onExtraCallbackWithResult ? new renderDynamicView(function1) : new setRenderListener(function1);
    }

    public static final <T> ea12<T> IAuthTabCallback(@NotNull Function2<? super KClass<Object>, ? super List<? extends access5900>, ? extends KSerializer<T>> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return onExtraCallbackWithResult ? new getScoreCountWithIcon(function2) : new setBgMaterialCenterCalcColor(function2);
    }
}

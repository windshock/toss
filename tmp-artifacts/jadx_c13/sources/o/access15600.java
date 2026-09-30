package o;

import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class access15600 extends access15900 {

    static final class IAuthTabCallback {
        public static final Integer onExtraCallbackWithResult;
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        private IAuthTabCallback() {
        }

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            onExtraCallbackWithResult = num;
        }
    }

    private final boolean onNavigationEvent(int i) {
        Integer num = IAuthTabCallback.onExtraCallbackWithResult;
        return num == null || num.intValue() >= i;
    }

    @Override // o.access15900
    public void onExtraCallbackWithResult(@NotNull Throwable th, @NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (onNavigationEvent(19)) {
            th.addSuppressed(th2);
        } else {
            super.onExtraCallbackWithResult(th, th2);
        }
    }

    @Override // o.access15900
    public List<Throwable> IAuthTabCallback(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (onNavigationEvent(19)) {
            Throwable[] suppressed = th.getSuppressed();
            Intrinsics.checkNotNullExpressionValue(suppressed, "");
            return ArraysKt___ArraysJvmKt.asList(suppressed);
        }
        return super.IAuthTabCallback(th);
    }
}

package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface ReflectionUtils {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.onExtraCallbackWithResult;

    ReflectionUtilsExternalSyntheticLambda0 access100();

    SidecarAdapterExternalSyntheticLambda2 asBinder();

    SidecarCompatTranslatingCallback onTransact();

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        static final /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 51;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 16 / 0;
            }
        }

        private onExtraCallbackWithResult() {
        }

        public final ReflectionUtils IAuthTabCallback(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Response response = Response.onNavigationEvent;
            ReflectionUtils reflectionUtils = (ReflectionUtils) Response.onExtraCallback(context, ReflectionUtils.class);
            int i4 = onExtraCallback + 121;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 23 / 0;
            }
            return reflectionUtils;
        }
    }
}

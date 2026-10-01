package o;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class YogaNodeJNIBase {
    public static final <T extends jni_YGNodeStyleSetWidthJNI> void onExtraCallback(@NotNull T t, @NotNull Function1<? super T, Unit>[] function1Arr, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(function1Arr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (t instanceof jni_YGNodeStyleSetMaxWidthJNI) {
            ((jni_YGNodeStyleSetMaxWidthJNI) t).onNavigationEvent((Function1[]) Arrays.copyOf(function1Arr, function1Arr.length), (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
            return;
        }
        throw new IllegalStateException("impossible");
    }

    public static /* synthetic */ void onExtraCallbackWithResult(jni_YGNodeStyleSetWidthJNI jni_ygnodestylesetwidthjni, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        IAuthTabCallback(jni_ygnodestylesetwidthjni, str, function1);
    }

    public static final <T extends jni_YGNodeStyleSetWidthJNI> void IAuthTabCallback(@NotNull T t, @NotNull String str, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (t instanceof jni_YGNodeStyleSetMaxWidthJNI) {
            ((jni_YGNodeStyleSetMaxWidthJNI) t).onNavigationEvent(str, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
            return;
        }
        throw new IllegalStateException("impossible");
    }

    public static final void onWarmupCompleted(@NotNull jni_YGNodeStyleSetWidthJNI jni_ygnodestylesetwidthjni, char c) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetwidthjni, "");
        jni_ygnodestylesetwidthjni.onWarmupCompleted(String.valueOf(c));
    }
}

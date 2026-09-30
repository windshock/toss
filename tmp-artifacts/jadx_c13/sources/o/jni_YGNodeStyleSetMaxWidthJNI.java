package o;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.jni_YGNodeStyleSetMaxWidthJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface jni_YGNodeStyleSetMaxWidthJNI<Target, ActualSelf extends jni_YGNodeStyleSetMaxWidthJNI<Target, ActualSelf>> extends jni_YGNodeStyleSetWidthJNI {
    jw3<Target> IAuthTabCallback();

    ActualSelf onExtraCallback();

    default void onNavigationEvent(@NotNull String str, @NotNull Function1<? super ActualSelf, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        jw3<Target> jw3VarIAuthTabCallback = IAuthTabCallback();
        jni_YGNodeStyleSetMaxWidthJNI jni_ygnodestylesetmaxwidthjniOnExtraCallback = onExtraCallback();
        function1.invoke(jni_ygnodestylesetmaxwidthjniOnExtraCallback);
        Unit unit = Unit.INSTANCE;
        jw3VarIAuthTabCallback.onExtraCallbackWithResult(new lt11(str, jni_ygnodestylesetmaxwidthjniOnExtraCallback.IAuthTabCallback().onExtraCallback()));
    }

    @Override // o.jni_YGNodeStyleSetWidthJNI
    default void onWarmupCompleted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallback().onExtraCallbackWithResult(new jw8(str));
    }

    default jw9<Target> onNavigationEvent() {
        return new jw9<>(IAuthTabCallback().onExtraCallback().onWarmupCompleted());
    }

    default void onNavigationEvent(@NotNull Function1<? super ActualSelf, Unit>[] function1Arr, @NotNull Function1<? super ActualSelf, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1Arr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ArrayList arrayList = new ArrayList(function1Arr.length);
        for (Function1<? super ActualSelf, Unit> function12 : function1Arr) {
            jni_YGNodeStyleSetMaxWidthJNI jni_ygnodestylesetmaxwidthjniOnExtraCallback = onExtraCallback();
            function12.invoke(jni_ygnodestylesetmaxwidthjniOnExtraCallback);
            arrayList.add(jni_ygnodestylesetmaxwidthjniOnExtraCallback.IAuthTabCallback().onExtraCallback());
        }
        jni_YGNodeStyleSetMaxWidthJNI jni_ygnodestylesetmaxwidthjniOnExtraCallback2 = onExtraCallback();
        function1.invoke(jni_ygnodestylesetmaxwidthjniOnExtraCallback2);
        IAuthTabCallback().onExtraCallbackWithResult(new jw13(jni_ygnodestylesetmaxwidthjniOnExtraCallback2.IAuthTabCallback().onExtraCallback(), arrayList));
    }
}

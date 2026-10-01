package o;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeResetJNI {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <R> void onExtraCallback(@NotNull jni_YGNodeSetIsReferenceBaselineJNI<? super R> jni_ygnodesetisreferencebaselinejni, long j, @NotNull Function1<? super access13800<? super R>, ? extends Object> function1) {
        jni_ygnodesetisreferencebaselinejni.IAuthTabCallback(new jni_YGNodeSetHasBaselineFuncJNI(j).onWarmupCompleted(), function1);
    }

    public static final <R> void onWarmupCompleted(@NotNull jni_YGNodeSetIsReferenceBaselineJNI<? super R> jni_ygnodesetisreferencebaselinejni, long j, @NotNull Function1<? super access13800<? super R>, ? extends Object> function1) {
        onExtraCallback(jni_ygnodesetisreferencebaselinejni, formatMsgs.IAuthTabCallback(j), function1);
    }
}

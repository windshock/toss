package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class jni_YGNodeStyleSetWidthAutoJNI extends lt9<jni_YGNodeStyleSetMinWidthJNI> {
    private final xz IAuthTabCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jni_YGNodeStyleSetWidthAutoJNI(@NotNull xz xzVar) {
        super(jni_YGNodeStyleSetMinWidthPercentJNI.onNavigationEvent.IAuthTabCallback(), xzVar == xz.ZERO ? 2 : 1, xzVar == xz.SPACE ? 2 : null);
        Intrinsics.checkNotNullParameter(xzVar, "");
        this.IAuthTabCallback = xzVar;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof jni_YGNodeStyleSetWidthAutoJNI) && this.IAuthTabCallback == ((jni_YGNodeStyleSetWidthAutoJNI) obj).IAuthTabCallback;
    }

    public int hashCode() {
        return this.IAuthTabCallback.hashCode();
    }
}

package o;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import o.ycx5;
import org.jetbrains.annotations.Nullable;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class djExternalSyntheticApiModelOutline1<S extends ycx5<S>> {
    private final Object onExtraCallbackWithResult;

    public static String IAuthTabCallback(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public static int onExtraCallback(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static boolean onExtraCallback(Object obj, Object obj2) {
        return (obj2 instanceof djExternalSyntheticApiModelOutline1) && Intrinsics.areEqual(obj, ((djExternalSyntheticApiModelOutline1) obj2).IAuthTabCallback());
    }

    public static <S extends ycx5<S>> Object onExtraCallbackWithResult(@Nullable Object obj) {
        return obj;
    }

    public final /* synthetic */ Object IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public boolean equals(Object obj) {
        return onExtraCallback(this.onExtraCallbackWithResult, obj);
    }

    public int hashCode() {
        return onExtraCallback(this.onExtraCallbackWithResult);
    }

    public String toString() {
        return IAuthTabCallback(this.onExtraCallbackWithResult);
    }

    public static final boolean onWarmupCompleted(Object obj) {
        return obj == getLargestMainSize.onWarmupCompleted;
    }

    public static final S onNavigationEvent(Object obj) {
        if (obj == getLargestMainSize.onWarmupCompleted) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.checkNotNull(obj, "");
        return (S) obj;
    }
}

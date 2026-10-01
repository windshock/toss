package o;

import java.util.ArrayList;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setShowDividerVertical<E> {
    private final Object onExtraCallbackWithResult;

    public static <E> Object IAuthTabCallback(@Nullable Object obj) {
        return obj;
    }

    public static int onExtraCallbackWithResult(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static boolean onExtraCallbackWithResult(Object obj, Object obj2) {
        return (obj2 instanceof setShowDividerVertical) && Intrinsics.areEqual(obj, ((setShowDividerVertical) obj2).IAuthTabCallback());
    }

    public static String onNavigationEvent(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public final /* synthetic */ Object IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public boolean equals(Object obj) {
        return onExtraCallbackWithResult(this.onExtraCallbackWithResult, obj);
    }

    public int hashCode() {
        return onExtraCallbackWithResult(this.onExtraCallbackWithResult);
    }

    public String toString() {
        return onNavigationEvent(this.onExtraCallbackWithResult);
    }

    public static /* synthetic */ Object onNavigationEvent(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return IAuthTabCallback(obj);
    }

    public static final Object onNavigationEvent(Object obj, E e) {
        if (obj == null) {
            return IAuthTabCallback(e);
        }
        if (obj instanceof ArrayList) {
            Intrinsics.checkNotNull(obj, "");
            ((ArrayList) obj).add(e);
            return IAuthTabCallback(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return IAuthTabCallback(arrayList);
    }
}

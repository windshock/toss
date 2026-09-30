package o;

import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class fbyycx {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private final Object onNavigationEvent;

    public static int onExtraCallback(Object obj) {
        return obj.hashCode();
    }

    public static String onExtraCallbackWithResult(Object obj) {
        return "ParseResult(value=" + obj + ')';
    }

    public static boolean onExtraCallbackWithResult(Object obj, Object obj2) {
        return (obj2 instanceof fbyycx) && Intrinsics.areEqual(obj, ((fbyycx) obj2).onWarmupCompleted());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object onWarmupCompleted(Object obj) {
        return obj;
    }

    public boolean equals(Object obj) {
        return onExtraCallbackWithResult(this.onNavigationEvent, obj);
    }

    public int hashCode() {
        return onExtraCallback(this.onNavigationEvent);
    }

    public final /* synthetic */ Object onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public String toString() {
        return onExtraCallbackWithResult(this.onNavigationEvent);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final Object onExtraCallbackWithResult(int i) {
            return fbyycx.onWarmupCompleted(Integer.valueOf(i));
        }

        public final Object IAuthTabCallback(int i, @NotNull Function0<String> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            return fbyycx.onWarmupCompleted(new pmiycx(i, function0));
        }
    }
}

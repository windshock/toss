package o;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lud<T> {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static final onExtraCallback IAuthTabCallback = new onExtraCallback();
    private final Object onNavigationEvent;

    public static int IAuthTabCallback(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static boolean IAuthTabCallback(Object obj, Object obj2) {
        return (obj2 instanceof lud) && Intrinsics.areEqual(obj, ((lud) obj2).onExtraCallback());
    }

    public static final /* synthetic */ lud onExtraCallback(Object obj) {
        return new lud(obj);
    }

    public static <T> Object onNavigationEvent(@Nullable Object obj) {
        return obj;
    }

    public boolean equals(Object obj) {
        return IAuthTabCallback(this.onNavigationEvent, obj);
    }

    public int hashCode() {
        return IAuthTabCallback(this.onNavigationEvent);
    }

    public final /* synthetic */ Object onExtraCallback() {
        return this.onNavigationEvent;
    }

    private /* synthetic */ lud(Object obj) {
        this.onNavigationEvent = obj;
    }

    public static final boolean asInterface(Object obj) {
        return !(obj instanceof onExtraCallback);
    }

    public static final boolean asBinder(Object obj) {
        return obj instanceof onExtraCallback;
    }

    public static final boolean onTransact(Object obj) {
        return obj instanceof onExtraCallbackWithResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T onExtraCallbackWithResult(Object obj) {
        if (obj instanceof onExtraCallback) {
            return null;
        }
        return obj;
    }

    public static final Throwable onWarmupCompleted(Object obj) {
        onExtraCallbackWithResult onextracallbackwithresult = obj instanceof onExtraCallbackWithResult ? (onExtraCallbackWithResult) obj : null;
        if (onextracallbackwithresult != null) {
            return onextracallbackwithresult.IAuthTabCallback;
        }
        return null;
    }

    public static class onExtraCallback {
        public String toString() {
            return "Failed";
        }
    }

    public static final class onExtraCallbackWithResult extends onExtraCallback {
        public final Throwable IAuthTabCallback;

        public onExtraCallbackWithResult(@Nullable Throwable th) {
            this.IAuthTabCallback = th;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, ((onExtraCallbackWithResult) obj).IAuthTabCallback);
        }

        public int hashCode() {
            Throwable th = this.IAuthTabCallback;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // o.lud.onExtraCallback
        public String toString() {
            return "Closed(" + this.IAuthTabCallback + ')';
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final <E> Object onNavigationEvent(E e) {
            return lud.onNavigationEvent(e);
        }

        public final <E> Object onExtraCallbackWithResult() {
            return lud.onNavigationEvent(lud.IAuthTabCallback);
        }

        public final <E> Object onExtraCallback(@Nullable Throwable th) {
            return lud.onNavigationEvent(new onExtraCallbackWithResult(th));
        }
    }

    public String toString() {
        return IAuthTabCallbackDefault(this.onNavigationEvent);
    }

    public static String IAuthTabCallbackDefault(Object obj) {
        if (obj instanceof onExtraCallbackWithResult) {
            return ((onExtraCallbackWithResult) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}

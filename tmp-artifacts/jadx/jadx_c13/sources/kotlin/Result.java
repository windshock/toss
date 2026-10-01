package kotlin;

import java.io.Serializable;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Result<T> implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final Object value;

    public static final /* synthetic */ Result IAuthTabCallback(Object obj) {
        return new Result(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m31constructorimpl(@Nullable Object obj) {
        return obj;
    }

    public static boolean onExtraCallback(Object obj, Object obj2) {
        return (obj2 instanceof Result) && Intrinsics.areEqual(obj, ((Result) obj2).onNavigationEvent());
    }

    public static int onExtraCallbackWithResult(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean onExtraCallbackWithResult(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public boolean equals(Object obj) {
        return onExtraCallback(this.value, obj);
    }

    public int hashCode() {
        return onExtraCallbackWithResult(this.value);
    }

    public final /* synthetic */ Object onNavigationEvent() {
        return this.value;
    }

    private /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    public static final boolean onNavigationEvent(Object obj) {
        return !(obj instanceof Failure);
    }

    public static final boolean onExtraCallback(Object obj) {
        return obj instanceof Failure;
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m32exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    public String toString() {
        return onWarmupCompleted(this.value);
    }

    public static String onWarmupCompleted(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Failure implements Serializable {
        public final Throwable exception;

        public Failure(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.exception = th;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof Failure) && Intrinsics.areEqual(this.exception, ((Failure) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }
}

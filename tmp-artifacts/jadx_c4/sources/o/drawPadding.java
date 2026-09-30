package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class drawPadding<T> {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final Type onNavigationEvent;

    static {
        int i = onWarmupCompleted + 83;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ drawPadding(Class cls, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls);
    }

    public final Type onNavigationEvent() {
        Type type;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 53;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            type = this.onNavigationEvent;
            int i4 = 65 / 0;
        } else {
            type = this.onNavigationEvent;
        }
        int i5 = i2 + 95;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return type;
    }

    public drawPadding() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Intrinsics.checkNotNull(genericSuperclass, "");
        Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        Intrinsics.checkNotNullExpressionValue(type, "");
        this.onNavigationEvent = type;
        int i = onExtraCallback + 59;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private drawPadding(Class<?> cls) {
        if (cls == null) {
            throw new NullPointerException("classOfT == null");
        }
        this.onNavigationEvent = cls;
        int i = onExtraCallbackWithResult + 51;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TypeToken{type=" + this.onNavigationEvent + "}";
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
        }
        return str;
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public static final class onNavigationEvent extends drawPadding<T> {
            onNavigationEvent(Class<T> cls) {
                super(cls, null);
            }
        }

        public final <T> drawPadding<T> onExtraCallbackWithResult(@NotNull Class<T> cls) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(cls, "");
            onNavigationEvent onnavigationevent = new onNavigationEvent(cls);
            int i2 = onNavigationEvent + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public static final class onWarmupCompleted extends drawPadding<T> {
            onWarmupCompleted(Class<? extends T> cls) {
                super(cls, null);
            }
        }

        public final <T> drawPadding<T> onWarmupCompleted(@NotNull T t) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(t, "");
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(t.getClass());
            int i2 = onNavigationEvent + 53;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            throw null;
        }
    }
}

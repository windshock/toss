package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import o.getAdvertisingId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class AFe1fSDK<T> {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult onExtraCallback;
    private final T onWarmupCompleted;

    public /* synthetic */ AFe1fSDK(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(onextracallbackwithresult, obj);
    }

    private AFe1fSDK(getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, T t) {
        this.onExtraCallback = onextracallbackwithresult;
        this.onWarmupCompleted = t;
    }

    public final getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallback;
        int i5 = i2 + 119;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackwithresult;
    }

    public final T onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        T t = this.onWarmupCompleted;
        int i5 = i3 + 93;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return t;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult<T> extends AFe1fSDK<T> implements ReadOnlyProperty<Object, T> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        public static final int onWarmupCompleted = 8;
        private volatile T onExtraCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, @NotNull T t) {
            super(onextracallbackwithresult, t, null);
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(t, "");
            this.onExtraCallback = t;
        }

        public final T onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            throw null;
        }

        public final void onWarmupCompleted(@NotNull T t) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(t, "");
                this.onExtraCallback = t;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(t, "");
            this.onExtraCallback = t;
            int i3 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 58 / 0;
            }
        }

        @Override // kotlin.properties.ReadOnlyProperty
        public T getValue(@Nullable Object obj, @NotNull addAllCommandLine<?> addallcommandline) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(addallcommandline, "");
            T t = this.onExtraCallback;
            int i4 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return t;
            }
            throw null;
        }
    }

    public static final class onNavigationEvent<T> extends AFe1fSDK<T> implements ReadOnlyProperty<Object, T> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final getCornerRadius<T> onNavigationEvent;
        private final setRubIn<T> onWarmupCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, @NotNull T t) {
            super(onextracallbackwithresult, t, null);
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(t, "");
            getCornerRadius<T> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(t);
            this.onNavigationEvent = getcornerradiusOnNavigationEvent;
            this.onWarmupCompleted = ycxycx.onExtraCallback((getCornerRadius) getcornerradiusOnNavigationEvent);
        }

        public final T onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getCornerRadius<T> getcornerradius = this.onNavigationEvent;
            if (i3 != 0) {
                return getcornerradius.IAuthTabCallback();
            }
            getcornerradius.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final setRubIn<T> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 41;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            setRubIn<T> setrubin = this.onWarmupCompleted;
            int i4 = i2 + 87;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 49 / 0;
            }
            return setrubin;
        }

        public final void onExtraCallback(@NotNull T t) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(t, "");
            this.onNavigationEvent.onWarmupCompleted(t);
            int i4 = onExtraCallback + 13;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // kotlin.properties.ReadOnlyProperty
        public T getValue(@Nullable Object obj, @NotNull addAllCommandLine<?> addallcommandline) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(addallcommandline, "");
                return this.onNavigationEvent.IAuthTabCallback();
            }
            Intrinsics.checkNotNullParameter(addallcommandline, "");
            int i3 = 58 / 0;
            return this.onNavigationEvent.IAuthTabCallback();
        }
    }

    public final void onWarmupCompleted(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        T tOnNavigationEvent = onNavigationEvent(str);
        if (this instanceof onExtraCallbackWithResult) {
            ((onExtraCallbackWithResult) this).onWarmupCompleted((onExtraCallbackWithResult) tOnNavigationEvent);
            int i4 = IAuthTabCallback + 123;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (!(this instanceof onNavigationEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = onNavigationEvent + 57;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            ((onNavigationEvent) this).onExtraCallback(tOnNavigationEvent);
        } else {
            ((onNavigationEvent) this).onExtraCallback(tOnNavigationEvent);
            int i7 = 4 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        if (str == 0) {
            return this.onWarmupCompleted;
        }
        try {
            T t = this.onWarmupCompleted;
            if (t instanceof Boolean) {
                return (T) Boolean.valueOf(Boolean.parseBoolean(str));
            }
            if (t instanceof Integer) {
                T t2 = (T) Integer.valueOf(Integer.parseInt(str));
                int i2 = onNavigationEvent + 17;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return t2;
            }
            if (t instanceof Long) {
                int i4 = IAuthTabCallback + 107;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return (T) Long.valueOf(Long.parseLong(str));
            }
            if (!(t instanceof Double)) {
                return !((t instanceof String) ^ true) ? str : t;
            }
            int i6 = onNavigationEvent + 71;
            IAuthTabCallback = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                Double.valueOf(Double.parseDouble(str));
                throw null;
            }
            T t3 = (T) Double.valueOf(Double.parseDouble(str));
            int i7 = IAuthTabCallback + 43;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                return t3;
            }
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            return this.onWarmupCompleted;
        }
    }
}

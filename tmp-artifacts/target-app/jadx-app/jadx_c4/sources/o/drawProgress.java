package o;

import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class drawProgress<T> implements getIconPadding<T> {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private setTid<T> onExtraCallbackWithResult;
    private final T onWarmupCompleted;

    static {
        int i = onNavigationEvent + 21;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public drawProgress() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    public drawProgress(@Nullable T t) {
        this.onWarmupCompleted = t;
        if (t != null) {
            onExtraCallbackWithResult(t);
            int i = IAuthTabCallback + 67;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        int i3 = IAuthTabCallback + 41;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ drawProgress(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallbackStub + 119;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 48 / 0;
            }
            int i4 = 2 % 2;
            obj = null;
        }
        this(obj);
    }

    private final setTid<T> onExtraCallbackWithResult() {
        setTid<T> settidOnNavigationEvent;
        synchronized (this) {
            settidOnNavigationEvent = this.onExtraCallbackWithResult;
            if (settidOnNavigationEvent == null || settidOnNavigationEvent.IAuthTabCallback() || settidOnNavigationEvent.onExtraCallbackWithResult()) {
                T t = this.onWarmupCompleted;
                if (t != null) {
                    settidOnNavigationEvent = setTid.IAuthTabCallbackDefault(t);
                } else {
                    settidOnNavigationEvent = setTid.onNavigationEvent();
                }
            }
            this.onExtraCallbackWithResult = settidOnNavigationEvent;
            Intrinsics.checkNotNull(settidOnNavigationEvent);
        }
        return settidOnNavigationEvent;
    }

    @Override // o.getIconPadding
    public void onExtraCallbackWithResult(T t) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (t == null) {
            throw new IllegalArgumentException("null isn't allowed");
        }
        int i5 = i2 + 123;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallbackWithResult().onExtraCallback(t);
        } else {
            onExtraCallbackWithResult().onExtraCallback(t);
            throw null;
        }
    }

    public getByteBuffer<T> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getByteBuffer<T> getbytebufferOnExtraCallbackWithResult = onExtraCallbackWithResult().onExtraCallbackWithResult(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallbackWithResult, "");
        int i4 = IAuthTabCallbackStub + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return getbytebufferOnExtraCallbackWithResult;
    }

    public T onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        T t = (T) onExtraCallbackWithResult().onWarmupCompleted();
        int i4 = IAuthTabCallbackStub + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return t;
    }

    @Override // o.getIconPadding
    public T onWarmupCompleted(T t) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult().onWarmupCompleted();
            throw null;
        }
        T t2 = (T) onExtraCallbackWithResult().onWarmupCompleted();
        if (t2 == null) {
            return t;
        }
        int i3 = IAuthTabCallback + 125;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return t2;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}

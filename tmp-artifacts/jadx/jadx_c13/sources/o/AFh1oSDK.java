package o;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1oSDK<T> implements ReadOnlyProperty<Object, T> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final Lazy<ReadOnlyProperty<Object, T>> IAuthTabCallback;
    private T onExtraCallbackWithResult;

    public AFh1oSDK(@NotNull Function0<? extends ReadOnlyProperty<Object, ? extends T>> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallback = LazyKt__LazyJVMKt.lazy(function0);
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public T getValue(@NotNull Object obj, @NotNull addAllCommandLine<?> addallcommandline) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(addallcommandline, "");
        if (this.onExtraCallbackWithResult == null) {
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult = this.IAuthTabCallback.getValue().getValue(obj, addallcommandline);
            int i4 = onExtraCallback + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        T t = this.onExtraCallbackWithResult;
        Intrinsics.checkNotNull(t);
        return t;
    }
}

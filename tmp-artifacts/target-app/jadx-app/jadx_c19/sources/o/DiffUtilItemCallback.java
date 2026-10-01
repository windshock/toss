package o;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class DiffUtilItemCallback<T> extends recycleViewsFromStart<T, Function2<? super T, ? super Throwable, ? extends Unit>> {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);

    public /* synthetic */ DiffUtilItemCallback(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private DiffUtilItemCallback(String str) {
        super(str);
    }

    @Override // o.recycleViewsFromStart
    public void onNavigationEvent(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        Function2<? super T, ? super Throwable, ? extends Unit> function2OnExtraCallback = onExtraCallback();
        if (function2OnExtraCallback != null) {
            function2OnExtraCallback.invoke(t, (Object) null);
        }
    }

    @Override // o.recycleViewsFromStart
    public void IAuthTabCallback(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        Function2<? super T, ? super Throwable, ? extends Unit> function2OnExtraCallback = onExtraCallback();
        if (function2OnExtraCallback != null) {
            function2OnExtraCallback.invoke((Object) null, th);
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public static final class onExtraCallbackWithResult extends DiffUtilItemCallback<T> {
            final /* synthetic */ Function1<Uri, Boolean> IAuthTabCallback;
            final /* synthetic */ Function1<Uri, T> onExtraCallback;
            final /* synthetic */ Function1<Uri, Throwable> onWarmupCompleted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onExtraCallbackWithResult(String str, Function1<? super Uri, ? extends T> function1, Function1<? super Uri, ? extends Throwable> function12, Function1<? super Uri, Boolean> function13) {
                super(str, null);
                this.onExtraCallback = function1;
                this.onWarmupCompleted = function12;
                this.IAuthTabCallback = function13;
            }

            @Override // o.recycleViewsFromStart
            public T onWarmupCompleted(@NotNull Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "");
                return (T) this.onExtraCallback.invoke(uri);
            }

            @Override // o.recycleViewsFromStart
            public Throwable onExtraCallbackWithResult(@NotNull Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "");
                return (Throwable) this.onWarmupCompleted.invoke(uri);
            }

            @Override // o.recycleViewsFromStart
            public boolean onNavigationEvent(@NotNull Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "");
                return ((Boolean) this.IAuthTabCallback.invoke(uri)).booleanValue();
            }
        }

        public final <T> DiffUtilItemCallback<T> onExtraCallbackWithResult(@NotNull Function2<? super T, ? super Throwable, Unit> function2, @NotNull String str, @NotNull Function1<? super Uri, ? extends T> function1, @NotNull Function1<? super Uri, ? extends Throwable> function12, @NotNull Function1<? super Uri, Boolean> function13) {
            Intrinsics.checkNotNullParameter(function2, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            Intrinsics.checkNotNullParameter(function13, "");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(str, function1, function12, function13);
            onextracallbackwithresult.IAuthTabCallback((onExtraCallbackWithResult) function2);
            return onextracallbackwithresult;
        }
    }
}

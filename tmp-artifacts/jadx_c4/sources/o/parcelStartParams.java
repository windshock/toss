package o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SearchBarKtExternalSyntheticLambda5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class parcelStartParams<V extends SearchBarKtExternalSyntheticLambda5, I extends T, T> extends ExoPlayerImplExternalSyntheticLambda3<I, T, AppNode<V>> {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private final getBacktraceNote<AppNode<V>, I, List<? extends Object>, Unit> IAuthTabCallback;
    private final getBacktraceNote<LayoutInflater, ViewGroup, Boolean, V> IAuthTabCallbackStub;
    private final Function1<ViewGroup, V> asInterface;
    private final Function1<AppNode<V>, Unit> onExtraCallback;
    private final Function2<AppNode<V>, I, Unit> onExtraCallbackWithResult;
    private final Function1<T, Boolean> onNavigationEvent;
    private final getBacktraceNote<T, List<? extends T>, Integer, Boolean> onWarmupCompleted;

    public parcelStartParams() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public parcelStartParams(@Nullable Function1<? super ViewGroup, ? extends V> function1, @Nullable getBacktraceNote<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends V> getbacktracenote, @Nullable Function1<? super T, Boolean> function12, @Nullable getBacktraceNote<? super T, ? super List<? extends T>, ? super Integer, Boolean> getbacktracenote2, @Nullable Function1<? super AppNode<V>, Unit> function13, @Nullable Function2<? super AppNode<V>, ? super I, Unit> function2, @Nullable getBacktraceNote<? super AppNode<V>, ? super I, ? super List<? extends Object>, Unit> getbacktracenote3) {
        this.asInterface = function1;
        this.IAuthTabCallbackStub = getbacktracenote;
        this.onNavigationEvent = function12;
        this.onWarmupCompleted = getbacktracenote2;
        this.onExtraCallback = function13;
        this.onExtraCallbackWithResult = function2;
        this.IAuthTabCallback = getbacktracenote3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ parcelStartParams(Function1 function1, getBacktraceNote getbacktracenote, Function1 function12, getBacktraceNote getbacktracenote2, Function1 function13, Function2 function2, getBacktraceNote getbacktracenote3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        getBacktraceNote getbacktracenote4;
        Function1 function14;
        getBacktraceNote getbacktracenote5;
        Function1 function15;
        getBacktraceNote getbacktracenote6 = null;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            function1 = null;
        }
        if ((i & 2) != 0) {
            int i3 = asBinder + 55;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            getbacktracenote4 = null;
        } else {
            getbacktracenote4 = getbacktracenote;
        }
        if ((i & 4) != 0) {
            int i6 = 2 % 2;
            function14 = null;
        } else {
            function14 = function12;
        }
        if ((i & 8) != 0) {
            int i7 = IAuthTabCallbackDefault + 49;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            getbacktracenote5 = null;
        } else {
            getbacktracenote5 = getbacktracenote2;
        }
        if ((i & 16) != 0) {
            int i9 = asBinder + 77;
            IAuthTabCallbackDefault = i9 % 128;
            if (i9 % 2 != 0) {
                getbacktracenote6.hashCode();
                throw null;
            }
            function15 = null;
        } else {
            function15 = function13;
        }
        Function2 function22 = (i & 32) != 0 ? null : function2;
        if ((i & 64) != 0) {
            int i10 = IAuthTabCallbackDefault + 57;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
        } else {
            getbacktracenote6 = getbacktracenote3;
        }
        this(function1, getbacktracenote4, function14, getbacktracenote5, function15, function22, getbacktracenote6);
    }

    public /* synthetic */ void onExtraCallbackWithResult(Object obj, RecyclerView.ViewHolder viewHolder, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(obj, (AppNode) viewHolder, list);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 77;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ RecyclerView.ViewHolder onWarmupCompleted(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(viewGroup);
        }
        IAuthTabCallback(viewGroup);
        throw null;
    }

    public boolean onExtraCallbackWithResult(@NotNull T t, @NotNull List<? extends T> list, int i) {
        Object objInvoke;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(list, "");
        Function1<T, Boolean> function1 = this.onNavigationEvent;
        if (function1 != null) {
            int i4 = IAuthTabCallbackDefault + 63;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            objInvoke = function1.invoke(t);
            if (i5 == 0) {
                i2 = 46;
                int i6 = i2 / 0;
            }
        } else {
            getBacktraceNote<T, List<? extends T>, Integer, Boolean> getbacktracenote = this.onWarmupCompleted;
            if (getbacktracenote == null) {
                return false;
            }
            int i7 = IAuthTabCallbackDefault + 19;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            objInvoke = getbacktracenote.invoke(t, list, Integer.valueOf(i));
            if (i8 == 0) {
                i2 = 96;
                int i62 = i2 / 0;
            }
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected AppNode<V> IAuthTabCallback(@NotNull ViewGroup viewGroup) {
        AppNode<V> appNode;
        int i = 2 % 2;
        int i2 = asBinder + 93;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            int i3 = 92 / 0;
            if (this.asInterface != null) {
                appNode = new AppNode<>((SearchBarKtExternalSyntheticLambda5) this.asInterface.invoke(viewGroup));
                int i4 = IAuthTabCallbackDefault + 49;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 5;
                }
            } else {
                getBacktraceNote<LayoutInflater, ViewGroup, Boolean, V> getbacktracenote = this.IAuthTabCallbackStub;
                if (getbacktracenote == null) {
                    throw new IllegalArgumentException("viewBinding or viewBindingFactory must not be null.");
                }
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "");
                appNode = new AppNode<>((SearchBarKtExternalSyntheticLambda5) getbacktracenote.invoke(layoutInflaterFrom, viewGroup, Boolean.FALSE));
            }
        } else {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            if (this.asInterface != null) {
            }
        }
        Function1<AppNode<V>, Unit> function1 = this.onExtraCallback;
        if (function1 != null) {
            int i6 = asBinder + 61;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                function1.invoke(appNode);
                throw null;
            }
            function1.invoke(appNode);
        }
        int i7 = IAuthTabCallbackDefault + 27;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return appNode;
    }

    protected void onWarmupCompleted(@NotNull I i, @NotNull AppNode<V> appNode, @NotNull List<? extends Object> list) {
        int i2 = 2 % 2;
        int i3 = asBinder + 107;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(i, "");
        Intrinsics.checkNotNullParameter(appNode, "");
        Intrinsics.checkNotNullParameter(list, "");
        getBacktraceNote<AppNode<V>, I, List<? extends Object>, Unit> getbacktracenote = this.IAuthTabCallback;
        if (getbacktracenote != null) {
            getbacktracenote.invoke(appNode, i, list);
            return;
        }
        Function2<AppNode<V>, I, Unit> function2 = this.onExtraCallbackWithResult;
        if (function2 != null) {
            int i5 = asBinder + 121;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            function2.invoke(appNode, i);
            if (i6 != 0) {
                throw null;
            }
        }
    }

    public static final class onNavigationEvent<V extends SearchBarKtExternalSyntheticLambda5, I extends T, T> {
        private static int IAuthTabCallbackDefault = 0;
        private static int asBinder = 1;
        private Function1<? super AppNode<V>, Unit> IAuthTabCallback;
        private getBacktraceNote<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends V> asInterface;
        private Function1<? super T, Boolean> onExtraCallback;
        private getBacktraceNote<? super AppNode<V>, ? super I, ? super List<? extends Object>, Unit> onExtraCallbackWithResult;
        private getBacktraceNote<? super T, ? super List<? extends T>, ? super Integer, Boolean> onNavigationEvent;
        private Function1<? super ViewGroup, ? extends V> onTransact;
        private Function2<? super AppNode<V>, ? super I, Unit> onWarmupCompleted;

        public final void onExtraCallback(@Nullable getBacktraceNote<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends V> getbacktracenote) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 87;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            Object obj = null;
            this.asInterface = getbacktracenote;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 43;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public final void onExtraCallbackWithResult(@Nullable Function1<? super T, Boolean> function1) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 121;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            this.onExtraCallback = function1;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 31;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }

        public final Function1<T, Boolean> onNavigationEvent() {
            Function1<? super T, Boolean> function1;
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 31;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                function1 = this.onExtraCallback;
                int i4 = 26 / 0;
            } else {
                function1 = this.onExtraCallback;
            }
            int i5 = i2 + 109;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final getBacktraceNote<T, List<? extends T>, Integer, Boolean> IAuthTabCallback() {
            getBacktraceNote<? super T, ? super List<? extends T>, ? super Integer, Boolean> getbacktracenote;
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 97;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                getbacktracenote = this.onNavigationEvent;
                int i4 = 47 / 0;
            } else {
                getbacktracenote = this.onNavigationEvent;
            }
            int i5 = i2 + 125;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return getbacktracenote;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(@Nullable Function1<? super AppNode<V>, Unit> function1) {
            int i = 2 % 2;
            int i2 = asBinder + 69;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback = function1;
            if (i3 != 0) {
                throw null;
            }
        }

        public final void onExtraCallback(@Nullable Function2<? super AppNode<V>, ? super I, Unit> function2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 25;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            this.onWarmupCompleted = function2;
            if (i4 == 0) {
                int i5 = 69 / 0;
            }
            int i6 = i3 + 51;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        }

        public final parcelStartParams<V, I, T> onExtraCallback() {
            int i = 2 % 2;
            parcelStartParams<V, I, T> parcelstartparams = new parcelStartParams<>(this.onTransact, this.asInterface, this.onExtraCallback, this.onNavigationEvent, this.IAuthTabCallback, this.onWarmupCompleted, this.onExtraCallbackWithResult);
            int i2 = asBinder + 63;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return parcelstartparams;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}

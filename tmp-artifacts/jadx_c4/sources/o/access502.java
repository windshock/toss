package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class access502<I extends T, T> extends ExoPlayerImplExternalSyntheticLambda3<I, T, AppMsgReceiver2<I>> {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private final Function1<RecyclerView.ViewHolder, Unit> IAuthTabCallback;
    private final Function2<AppMsgReceiver2<I>, I, Unit> asBinder;
    private final Function1<Context, View> asInterface;
    private final int onExtraCallback;
    private final Function1<RecyclerView.ViewHolder, Unit> onExtraCallbackWithResult;
    private final Function1<T, Boolean> onNavigationEvent;
    private final getBacktraceNote<AppMsgReceiver2<I>, I, List<? extends Object>, Unit> onTransact;
    private final getBacktraceNote<T, List<? extends T>, Integer, Boolean> onWarmupCompleted;

    public access502() {
        this(null, null, 0, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public access502(@Nullable Function1<? super Context, ? extends View> function1, @Nullable Function1<? super RecyclerView.ViewHolder, Unit> function12, int i, @Nullable Function1<? super T, Boolean> function13, @Nullable getBacktraceNote<? super T, ? super List<? extends T>, ? super Integer, Boolean> getbacktracenote, @Nullable Function1<? super RecyclerView.ViewHolder, Unit> function14, @Nullable Function2<? super AppMsgReceiver2<I>, ? super I, Unit> function2, @Nullable getBacktraceNote<? super AppMsgReceiver2<I>, ? super I, ? super List<? extends Object>, Unit> getbacktracenote2) {
        this.asInterface = function1;
        this.IAuthTabCallback = function12;
        this.onExtraCallback = i;
        this.onNavigationEvent = function13;
        this.onWarmupCompleted = getbacktracenote;
        this.onExtraCallbackWithResult = function14;
        this.asBinder = function2;
        this.onTransact = getbacktracenote2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ access502(Function1 function1, Function1 function12, int i, Function1 function13, getBacktraceNote getbacktracenote, Function1 function14, Function2 function2, getBacktraceNote getbacktracenote2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Function1 function15;
        int i3;
        Function1 function16;
        Function2 function22;
        getBacktraceNote getbacktracenote3 = null;
        if ((i2 & 1) != 0) {
            int i4 = IAuthTabCallbackStub + 37;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                getbacktracenote3.hashCode();
                throw null;
            }
            function15 = null;
        } else {
            function15 = function1;
        }
        Function1 function17 = (i2 & 2) != 0 ? null : function12;
        if ((i2 & 4) != 0) {
            int i5 = 2 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        Function1 function18 = (i2 & 8) != 0 ? null : function13;
        getBacktraceNote getbacktracenote4 = (i2 & 16) != 0 ? null : getbacktracenote;
        if ((i2 & 32) != 0) {
            int i6 = IAuthTabCallbackDefault + 85;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                getbacktracenote3.hashCode();
                throw null;
            }
            int i7 = 2 % 2;
            function16 = null;
        } else {
            function16 = function14;
        }
        if ((i2 & 64) != 0) {
            int i8 = 2 % 2;
            function22 = null;
        } else {
            function22 = function2;
        }
        if ((i2 & 128) != 0) {
            int i9 = IAuthTabCallbackDefault + 57;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                getbacktracenote3.hashCode();
                throw null;
            }
        } else {
            getbacktracenote3 = getbacktracenote2;
        }
        this(function15, function17, i3, function18, getbacktracenote4, function16, function22, getbacktracenote3);
    }

    public /* synthetic */ void onExtraCallbackWithResult(Object obj, RecyclerView.ViewHolder viewHolder, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(obj, (AppMsgReceiver2) viewHolder, list);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        int i5 = IAuthTabCallbackStub + 111;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ RecyclerView.ViewHolder onWarmupCompleted(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        AppMsgReceiver2<I> appMsgReceiver2OnExtraCallbackWithResult = onExtraCallbackWithResult(viewGroup);
        int i4 = IAuthTabCallbackDefault + 15;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return appMsgReceiver2OnExtraCallbackWithResult;
    }

    public boolean onExtraCallbackWithResult(@NotNull T t, @NotNull List<T> list, int i) {
        Object objInvoke;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(list, "");
        Function1<T, Boolean> function1 = this.onNavigationEvent;
        if (function1 != null) {
            int i3 = IAuthTabCallbackDefault + 61;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            objInvoke = function1.invoke(t);
        } else {
            getBacktraceNote<T, List<? extends T>, Integer, Boolean> getbacktracenote = this.onWarmupCompleted;
            if (getbacktracenote == null) {
                return false;
            }
            int i5 = IAuthTabCallbackStub + 31;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            objInvoke = getbacktracenote.invoke(t, list, Integer.valueOf(i));
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    protected AppMsgReceiver2<I> onExtraCallbackWithResult(@NotNull ViewGroup viewGroup) {
        AppMsgReceiver2<I> appMsgReceiver2OnExtraCallbackWithResult;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Function1<Context, View> function1 = this.asInterface;
        if (function1 != null) {
            int i2 = IAuthTabCallbackStub + 15;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                AppMsgReceiver2.IAuthTabCallback iAuthTabCallback = AppMsgReceiver2.Companion;
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                appMsgReceiver2OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallback((View) function1.invoke(context));
                int i3 = 40 / 0;
            } else {
                AppMsgReceiver2.IAuthTabCallback iAuthTabCallback2 = AppMsgReceiver2.Companion;
                Context context2 = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                appMsgReceiver2OnExtraCallbackWithResult = iAuthTabCallback2.onExtraCallback((View) function1.invoke(context2));
            }
        } else {
            appMsgReceiver2OnExtraCallbackWithResult = AppMsgReceiver2.Companion.onExtraCallbackWithResult(viewGroup, this.onExtraCallback);
        }
        Function1<RecyclerView.ViewHolder, Unit> function12 = this.onExtraCallbackWithResult;
        if (function12 != null) {
            int i4 = IAuthTabCallbackDefault + 101;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            function12.invoke(appMsgReceiver2OnExtraCallbackWithResult);
            int i6 = IAuthTabCallbackStub + 37;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        }
        return appMsgReceiver2OnExtraCallbackWithResult;
    }

    protected void onWarmupCompleted(@NotNull I i, @NotNull AppMsgReceiver2<I> appMsgReceiver2, @NotNull List<Object> list) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(i, "");
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(list, "");
        appMsgReceiver2.onExtraCallbackWithResult(i);
        getBacktraceNote<AppMsgReceiver2<I>, I, List<? extends Object>, Unit> getbacktracenote = this.onTransact;
        if (getbacktracenote != null) {
            int i3 = IAuthTabCallbackStub + 27;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            getbacktracenote.invoke(appMsgReceiver2, i, list);
            return;
        }
        Function2<AppMsgReceiver2<I>, I, Unit> function2 = this.asBinder;
        if (function2 != null) {
            int i5 = IAuthTabCallbackDefault + 35;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            function2.invoke(appMsgReceiver2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r1
      0x0029: PHI (r1v5 kotlin.jvm.functions.Function1<androidx.recyclerview.widget.RecyclerView$ViewHolder, kotlin.Unit>) = 
      (r1v4 kotlin.jvm.functions.Function1<androidx.recyclerview.widget.RecyclerView$ViewHolder, kotlin.Unit>)
      (r1v7 kotlin.jvm.functions.Function1<androidx.recyclerview.widget.RecyclerView$ViewHolder, kotlin.Unit>)
     binds: [B:8:0x0027, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallback(@NotNull RecyclerView.ViewHolder viewHolder) {
        Function1<RecyclerView.ViewHolder, Unit> function1;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            super/*o.ExoPlayerImplExternalSyntheticLambda32*/.onExtraCallback(viewHolder);
            function1 = this.IAuthTabCallback;
            int i3 = 41 / 0;
            if (function1 != null) {
                function1.invoke(viewHolder);
            }
        } else {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            super/*o.ExoPlayerImplExternalSyntheticLambda32*/.onExtraCallback(viewHolder);
            function1 = this.IAuthTabCallback;
            if (function1 != null) {
            }
        }
        int i4 = IAuthTabCallbackStub + 89;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onNavigationEvent<I extends T, T> {
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub;
        private Function1<? super Context, ? extends View> IAuthTabCallback;
        private getBacktraceNote<? super AppMsgReceiver2<I>, ? super I, ? super List<? extends Object>, Unit> asBinder;
        private Function2<? super AppMsgReceiver2<I>, ? super I, Unit> asInterface;
        private Function1<? super T, Boolean> onExtraCallback;
        private Function1<? super RecyclerView.ViewHolder, Unit> onExtraCallbackWithResult;
        private int onNavigationEvent;
        private Function1<? super RecyclerView.ViewHolder, Unit> onWarmupCompleted;

        public final onNavigationEvent<I, T> onExtraCallbackWithResult(@NotNull Function1<? super T, Boolean> function1) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 21;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                this.onExtraCallback = function1;
                int i3 = 61 / 0;
            } else {
                Intrinsics.checkNotNullParameter(function1, "");
                this.onExtraCallback = function1;
            }
            return this;
        }

        public final onNavigationEvent<I, T> onWarmupCompleted(@NotNull Function1<? super RecyclerView.ViewHolder, Unit> function1) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 89;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
            int i4 = IAuthTabCallbackStub + 67;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 38 / 0;
            }
            return this;
        }

        public final onNavigationEvent<I, T> onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 69;
            int i4 = i3 % 128;
            IAuthTabCallbackDefault = i4;
            int i5 = i3 % 2;
            this.onNavigationEvent = i;
            if (i5 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = i4 + 19;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final onNavigationEvent<I, T> onExtraCallback(@NotNull Function2<? super AppMsgReceiver2<I>, ? super I, Unit> function2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 37;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(function2, "");
            this.asInterface = function2;
            int i4 = IAuthTabCallbackDefault + 17;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final onNavigationEvent<I, T> onNavigationEvent(@NotNull getBacktraceNote<? super AppMsgReceiver2<I>, ? super I, ? super List<? extends Object>, Unit> getbacktracenote) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 89;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            this.asBinder = getbacktracenote;
            int i4 = IAuthTabCallbackStub + 29;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final onNavigationEvent<I, T> onNavigationEvent(@NotNull Function1<? super RecyclerView.ViewHolder, Unit> function1) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 61;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                this.onWarmupCompleted = function1;
                throw null;
            }
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
            int i3 = IAuthTabCallbackDefault + 57;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final access502<I, T> IAuthTabCallback() {
            int i = 2 % 2;
            getBacktraceNote getbacktracenote = null;
            access502<I, T> access502Var = new access502<>(this.IAuthTabCallback, this.onExtraCallbackWithResult, this.onNavigationEvent, this.onExtraCallback, getbacktracenote, this.onWarmupCompleted, this.asInterface, this.asBinder, 16, null);
            int i2 = IAuthTabCallbackDefault + 49;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return access502Var;
        }
    }

    public static final class onExtraCallbackWithResult<I extends T, T> {
        private static int IAuthTabCallbackStub = 0;
        private static int asInterface = 1;
        private Function2<? super AppMsgReceiver2<I>, ? super I, Unit> IAuthTabCallback;
        private Function1<? super T, Boolean> IAuthTabCallbackDefault;
        private getBacktraceNote<? super T, ? super List<? extends T>, ? super Integer, Boolean> asBinder;
        private Function1<? super RecyclerView.ViewHolder, Unit> onExtraCallback;
        private getBacktraceNote<? super AppMsgReceiver2<I>, ? super I, ? super List<? extends Object>, Unit> onExtraCallbackWithResult;
        private Function1<? super RecyclerView.ViewHolder, Unit> onNavigationEvent;
        private Function1<? super Context, ? extends View> onTransact;
        private int onWarmupCompleted;

        public final void onWarmupCompleted(@Nullable Function1<? super Context, ? extends View> function1) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 93;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            this.onTransact = function1;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 17;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }

        public final void onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 29;
            int i4 = i3 % 128;
            asInterface = i4;
            int i5 = i3 % 2;
            this.onWarmupCompleted = i;
            int i6 = i4 + 115;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        }

        public final void onExtraCallback(@Nullable Function1<? super T, Boolean> function1) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 65;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            this.IAuthTabCallbackDefault = function1;
            int i5 = i3 + 45;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public final Function1<T, Boolean> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 117;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallbackDefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final getBacktraceNote<T, List<? extends T>, Integer, Boolean> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 27;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return this.asBinder;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult(@Nullable Function1<? super RecyclerView.ViewHolder, Unit> function1) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 119;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            this.onNavigationEvent = function1;
            int i5 = i2 + 37;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        }

        public final void IAuthTabCallback(@Nullable Function2<? super AppMsgReceiver2<I>, ? super I, Unit> function2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 55;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            this.IAuthTabCallback = function2;
            if (i4 == 0) {
                int i5 = 96 / 0;
            }
            int i6 = i3 + 81;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        }

        public final void IAuthTabCallback(@Nullable getBacktraceNote<? super AppMsgReceiver2<I>, ? super I, ? super List<? extends Object>, Unit> getbacktracenote) {
            int i = 2 % 2;
            int i2 = asInterface + 107;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            this.onExtraCallbackWithResult = getbacktracenote;
            int i5 = i3 + 117;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public final access502<I, T> onExtraCallbackWithResult() {
            int i = 2 % 2;
            access502<I, T> access502Var = new access502<>(this.onTransact, this.onExtraCallback, this.onWarmupCompleted, this.IAuthTabCallbackDefault, this.asBinder, this.onNavigationEvent, this.IAuthTabCallback, this.onExtraCallbackWithResult);
            int i2 = IAuthTabCallbackStub + 77;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 97 / 0;
            }
            return access502Var;
        }
    }
}

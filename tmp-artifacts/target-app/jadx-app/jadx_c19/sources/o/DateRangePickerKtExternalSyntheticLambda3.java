package o;

import android.util.Log;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DateRangePickerKtExternalSyntheticLambda3<T> {
    private static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int IAuthTabCallback = 8;
    private final CoroutineContext asBinder;
    private final asInterface asInterface;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private final DatePickerKtExternalSyntheticLambda20 onNavigationEvent;
    private final IAnimation<DateRangeInputKtExternalSyntheticLambda1<T>> onWarmupCompleted;

    public DateRangePickerKtExternalSyntheticLambda3(@NotNull IAnimation<DateRangeInputKtExternalSyntheticLambda1<T>> iAnimation) {
        Intrinsics.checkNotNullParameter(iAnimation, "");
        this.onWarmupCompleted = iAnimation;
        CoroutineContext coroutineContextOnExtraCallbackWithResult = findSecondFfd8Position.Companion.onExtraCallbackWithResult();
        this.asBinder = coroutineContextOnExtraCallbackWithResult;
        onNavigationEvent onnavigationevent = new onNavigationEvent(this);
        this.onNavigationEvent = onnavigationevent;
        asInterface asinterface = new asInterface(this, onnavigationevent, coroutineContextOnExtraCallbackWithResult, iAnimation instanceof getTileModeX ? (DateRangeInputKtExternalSyntheticLambda1) CollectionsKt.firstOrNull(((getTileModeX) iAnimation).onExtraCallback()) : null);
        this.asInterface = asinterface;
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(asinterface.onNavigationEvent(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        DatePickerKtExternalSyntheticLambda16 datePickerKtExternalSyntheticLambda16 = (DatePickerKtExternalSyntheticLambda16) asinterface.IAuthTabCallback().IAuthTabCallback();
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(datePickerKtExternalSyntheticLambda16 == null ? new DatePickerKtExternalSyntheticLambda16(DateRangePickerKtVerticalMonthsList1ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(), DateRangePickerKtVerticalMonthsList1ExternalSyntheticLambda0.onExtraCallback.onWarmupCompleted(), DateRangePickerKtVerticalMonthsList1ExternalSyntheticLambda0.onExtraCallback.onExtraCallbackWithResult(), DateRangePickerKtVerticalMonthsList1ExternalSyntheticLambda0.onExtraCallback, null, 16, null) : datePickerKtExternalSyntheticLambda16, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    public static final class onNavigationEvent implements DatePickerKtExternalSyntheticLambda20 {
        final /* synthetic */ DateRangePickerKtExternalSyntheticLambda3<T> IAuthTabCallback;

        onNavigationEvent(DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3) {
            this.IAuthTabCallback = dateRangePickerKtExternalSyntheticLambda3;
        }

        @Override // o.DatePickerKtExternalSyntheticLambda20
        public void onExtraCallback(int i2, int i3) {
            if (i3 > 0) {
                this.IAuthTabCallback.onExtraCallback();
            }
        }

        @Override // o.DatePickerKtExternalSyntheticLambda20
        public void onNavigationEvent(int i2, int i3) {
            if (i3 > 0) {
                this.IAuthTabCallback.onExtraCallback();
            }
        }

        @Override // o.DatePickerKtExternalSyntheticLambda20
        public void onWarmupCompleted(int i2, int i3) {
            if (i3 > 0) {
                this.IAuthTabCallback.onExtraCallback();
            }
        }
    }

    public static final class asInterface extends DateRangeInputKtExternalSyntheticLambda0<T> {
        final /* synthetic */ DateRangePickerKtExternalSyntheticLambda3<T> onNavigationEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3, DatePickerKtExternalSyntheticLambda20 datePickerKtExternalSyntheticLambda20, CoroutineContext coroutineContext, DateRangeInputKtExternalSyntheticLambda1<T> dateRangeInputKtExternalSyntheticLambda1) {
            super(datePickerKtExternalSyntheticLambda20, coroutineContext, dateRangeInputKtExternalSyntheticLambda1);
            this.onNavigationEvent = dateRangePickerKtExternalSyntheticLambda3;
        }

        @Override // o.DateRangeInputKtExternalSyntheticLambda0
        public Object onWarmupCompleted(@NotNull DatePickerKtDatePickerContent242ExternalSyntheticLambda0<T> datePickerKtDatePickerContent242ExternalSyntheticLambda0, @NotNull DatePickerKtDatePickerContent242ExternalSyntheticLambda0<T> datePickerKtDatePickerContent242ExternalSyntheticLambda02, int i2, @NotNull Function0<Unit> function0, @NotNull access13800<? super Integer> access13800Var) {
            function0.invoke();
            this.onNavigationEvent.onExtraCallback();
            return null;
        }
    }

    private final void onNavigationEvent(DatePickerKtExternalSyntheticLambda3<T> datePickerKtExternalSyntheticLambda3) {
        this.onExtraCallbackWithResult.IAuthTabCallback(datePickerKtExternalSyntheticLambda3);
    }

    public final DatePickerKtExternalSyntheticLambda3<T> onWarmupCompleted() {
        return (DatePickerKtExternalSyntheticLambda3) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
    }

    public final int onNavigationEvent() {
        return onWarmupCompleted().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallback() {
        onNavigationEvent(this.asInterface.onNavigationEvent());
    }

    public final T onNavigationEvent(int i2) {
        this.asInterface.onExtraCallbackWithResult(i2);
        return onWarmupCompleted().get(i2);
    }

    public final T onExtraCallback(int i2) {
        return onWarmupCompleted().get(i2);
    }

    public final void IAuthTabCallback() {
        this.asInterface.onExtraCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallback(DatePickerKtExternalSyntheticLambda16 datePickerKtExternalSyntheticLambda16) {
        this.onExtraCallback.IAuthTabCallback(datePickerKtExternalSyntheticLambda16);
    }

    public final DatePickerKtExternalSyntheticLambda16 onExtraCallbackWithResult() {
        return (DatePickerKtExternalSyntheticLambda16) this.onExtraCallback.onExtraCallbackWithResult();
    }

    static final class onExtraCallbackWithResult implements setRipple<DatePickerKtExternalSyntheticLambda16> {
        final /* synthetic */ DateRangePickerKtExternalSyntheticLambda3<T> onWarmupCompleted;

        onExtraCallbackWithResult(DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3) {
            this.onWarmupCompleted = dateRangePickerKtExternalSyntheticLambda3;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object emit(@NotNull DatePickerKtExternalSyntheticLambda16 datePickerKtExternalSyntheticLambda16, @NotNull access13800<? super Unit> access13800Var) {
            this.onWarmupCompleted.onExtraCallback(datePickerKtExternalSyntheticLambda16);
            return Unit.INSTANCE;
        }
    }

    public final Object IAuthTabCallback(@NotNull access13800<? super Unit> access13800Var) {
        Object objCollect = ycxycx.onExtraCallbackWithResult(this.asInterface.IAuthTabCallback()).collect(new onExtraCallbackWithResult(this), access13800Var);
        return objCollect == access14300.onWarmupCompleted() ? objCollect : Unit.INSTANCE;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<DateRangeInputKtExternalSyntheticLambda1<T>, access13800<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DateRangePickerKtExternalSyntheticLambda3<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.this$0 = dateRangePickerKtExternalSyntheticLambda3;
        }

        public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
            onExtraCallback onextracallback = new onExtraCallback(this.this$0, access13800Var);
            onextracallback.L$0 = obj;
            return onextracallback;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull DateRangeInputKtExternalSyntheticLambda1<T> dateRangeInputKtExternalSyntheticLambda1, @Nullable access13800<? super Unit> access13800Var) {
            return create(dateRangeInputKtExternalSyntheticLambda1, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                DateRangeInputKtExternalSyntheticLambda1<T> dateRangeInputKtExternalSyntheticLambda1 = (DateRangeInputKtExternalSyntheticLambda1) this.L$0;
                asInterface asinterface = ((DateRangePickerKtExternalSyntheticLambda3) this.this$0).asInterface;
                this.label = 1;
                if (asinterface.onNavigationEvent(dateRangeInputKtExternalSyntheticLambda1, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var) {
        Object objOnWarmupCompleted = ycxycx.onWarmupCompleted(this.onWarmupCompleted, new onExtraCallback(this, null), access13800Var);
        return objOnWarmupCompleted == access14300.onWarmupCompleted() ? objOnWarmupCompleted : Unit.INSTANCE;
    }

    static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public static final class onWarmupCompleted implements DatePickerKtExternalSyntheticLambda6 {
        onWarmupCompleted() {
        }

        public boolean onExtraCallbackWithResult(int i2) {
            return Log.isLoggable("Paging", i2);
        }

        public void IAuthTabCallback(int i2, @NotNull String str, @Nullable Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            if (th == null || i2 != 3) {
                if ((th != null && i2 == 2) || i2 == 3 || i2 == 2) {
                    return;
                }
                throw new IllegalArgumentException("debug level " + i2 + " is requested but Paging only supports default logging for level 2 (DEBUG) or level 3 (VERBOSE)");
            }
        }
    }

    static {
        DatePickerKtExternalSyntheticLambda6 datePickerKtExternalSyntheticLambda6IAuthTabCallback = DatePickerKtExternalSyntheticLambda7.IAuthTabCallback();
        if (datePickerKtExternalSyntheticLambda6IAuthTabCallback == null) {
            datePickerKtExternalSyntheticLambda6IAuthTabCallback = new onWarmupCompleted();
        }
        DatePickerKtExternalSyntheticLambda7.onNavigationEvent(datePickerKtExternalSyntheticLambda6IAuthTabCallback);
    }
}

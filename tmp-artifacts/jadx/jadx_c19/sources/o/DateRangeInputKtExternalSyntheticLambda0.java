package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import o.DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1;
import o.DatePickerKtMonthsNavigation11ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class DateRangeInputKtExternalSyntheticLambda0<T> {
    private final DateRangePickerKtExternalSyntheticLambda1 IAuthTabCallback;
    private final CoroutineContext IAuthTabCallbackDefault;
    private final setRubIn<DatePickerKtExternalSyntheticLambda16> IAuthTabCallbackStub;
    private DateRangePickerKtExternalSyntheticLambda6 IAuthTabCallbackStubProxy;
    private final onExtraCallbackWithResult access000;
    private DatePickerKtMonthsNavigation11ExternalSyntheticLambda0<T> access100;
    private volatile int asBinder;
    private volatile boolean asInterface;
    private DatePickerKtExternalSyntheticLambda28 onExtraCallback;
    private final DatePickerKtExternalSyntheticLambda20 onExtraCallbackWithResult;
    private final getBorderRadius<Unit> onNavigationEvent;
    private final CopyOnWriteArrayList<Function0<Unit>> onTransact;
    private final DatePickerKtDatePicker5ExternalSyntheticLambda0 onWarmupCompleted;

    static final class onExtraCallback extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DateRangeInputKtExternalSyntheticLambda0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(DateRangeInputKtExternalSyntheticLambda0<T> dateRangeInputKtExternalSyntheticLambda0, access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
            this.this$0 = dateRangeInputKtExternalSyntheticLambda0;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onExtraCallback(null, 0, 0, false, null, null, null, this);
        }
    }

    public boolean onExtraCallbackWithResult() {
        return false;
    }

    public abstract Object onWarmupCompleted(@NotNull DatePickerKtDatePickerContent242ExternalSyntheticLambda0<T> datePickerKtDatePickerContent242ExternalSyntheticLambda0, @NotNull DatePickerKtDatePickerContent242ExternalSyntheticLambda0<T> datePickerKtDatePickerContent242ExternalSyntheticLambda02, int i2, @NotNull Function0<Unit> function0, @NotNull access13800<? super Integer> access13800Var);

    public DateRangeInputKtExternalSyntheticLambda0(@NotNull DatePickerKtExternalSyntheticLambda20 datePickerKtExternalSyntheticLambda20, @NotNull CoroutineContext coroutineContext, @Nullable DateRangeInputKtExternalSyntheticLambda1<T> dateRangeInputKtExternalSyntheticLambda1) {
        DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onWarmupCompleted onwarmupcompletedOnNavigationEvent;
        Intrinsics.checkNotNullParameter(datePickerKtExternalSyntheticLambda20, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.onExtraCallbackWithResult = datePickerKtExternalSyntheticLambda20;
        this.IAuthTabCallbackDefault = coroutineContext;
        this.access100 = DatePickerKtMonthsNavigation11ExternalSyntheticLambda0.Companion.onExtraCallbackWithResult(dateRangeInputKtExternalSyntheticLambda1 != null ? dateRangeInputKtExternalSyntheticLambda1.onNavigationEvent() : null);
        DatePickerKtDatePicker5ExternalSyntheticLambda0 datePickerKtDatePicker5ExternalSyntheticLambda0 = new DatePickerKtDatePicker5ExternalSyntheticLambda0();
        if (dateRangeInputKtExternalSyntheticLambda1 != null && (onwarmupcompletedOnNavigationEvent = dateRangeInputKtExternalSyntheticLambda1.onNavigationEvent()) != null) {
            datePickerKtDatePicker5ExternalSyntheticLambda0.IAuthTabCallback(onwarmupcompletedOnNavigationEvent.IAuthTabCallbackStub(), onwarmupcompletedOnNavigationEvent.onNavigationEvent());
        }
        this.onWarmupCompleted = datePickerKtDatePicker5ExternalSyntheticLambda0;
        this.onTransact = new CopyOnWriteArrayList<>();
        this.IAuthTabCallback = new DateRangePickerKtExternalSyntheticLambda1(false, 1, (DefaultConstructorMarker) null);
        this.access000 = new onExtraCallbackWithResult(this);
        this.IAuthTabCallbackStub = datePickerKtDatePicker5ExternalSyntheticLambda0.onNavigationEvent();
        this.onNavigationEvent = getShine.onExtraCallback(0, 64, CloseableUtils.DROP_OLDEST);
        onWarmupCompleted(new Function0<Unit>(this) { // from class: o.DateRangeInputKtExternalSyntheticLambda0.2
            final /* synthetic */ DateRangeInputKtExternalSyntheticLambda0<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            public /* synthetic */ Object invoke() {
                onWarmupCompleted();
                return Unit.INSTANCE;
            }

            public final void onWarmupCompleted() {
                ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).onNavigationEvent.onNavigationEvent(Unit.INSTANCE);
            }
        });
    }

    public static final class onExtraCallbackWithResult implements DatePickerKtMonthsNavigation11ExternalSyntheticLambda0.onExtraCallback {
        final /* synthetic */ DateRangeInputKtExternalSyntheticLambda0<T> onWarmupCompleted;

        onExtraCallbackWithResult(DateRangeInputKtExternalSyntheticLambda0<T> dateRangeInputKtExternalSyntheticLambda0) {
            this.onWarmupCompleted = dateRangeInputKtExternalSyntheticLambda0;
        }

        @Override // o.DatePickerKtMonthsNavigation11ExternalSyntheticLambda0.onExtraCallback
        public void IAuthTabCallback(int i2, int i3) {
            ((DateRangeInputKtExternalSyntheticLambda0) this.onWarmupCompleted).onExtraCallbackWithResult.onExtraCallback(i2, i3);
        }

        @Override // o.DatePickerKtMonthsNavigation11ExternalSyntheticLambda0.onExtraCallback
        public void onNavigationEvent(int i2, int i3) {
            ((DateRangeInputKtExternalSyntheticLambda0) this.onWarmupCompleted).onExtraCallbackWithResult.onNavigationEvent(i2, i3);
        }

        @Override // o.DatePickerKtMonthsNavigation11ExternalSyntheticLambda0.onExtraCallback
        public void onExtraCallback(int i2, int i3) {
            ((DateRangeInputKtExternalSyntheticLambda0) this.onWarmupCompleted).onExtraCallbackWithResult.onWarmupCompleted(i2, i3);
        }

        @Override // o.DatePickerKtMonthsNavigation11ExternalSyntheticLambda0.onExtraCallback
        public void onWarmupCompleted(@NotNull DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32, @Nullable DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda322) {
            Intrinsics.checkNotNullParameter(datePickerKtExternalSyntheticLambda32, "");
            this.onWarmupCompleted.onExtraCallback(datePickerKtExternalSyntheticLambda32, datePickerKtExternalSyntheticLambda322);
        }

        @Override // o.DatePickerKtMonthsNavigation11ExternalSyntheticLambda0.onExtraCallback
        public void onNavigationEvent(@NotNull DatePickerKtExternalSyntheticLambda8 datePickerKtExternalSyntheticLambda8, boolean z, @NotNull DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda31) {
            Intrinsics.checkNotNullParameter(datePickerKtExternalSyntheticLambda8, "");
            Intrinsics.checkNotNullParameter(datePickerKtExternalSyntheticLambda31, "");
            ((DateRangeInputKtExternalSyntheticLambda0) this.onWarmupCompleted).onWarmupCompleted.onNavigationEvent(datePickerKtExternalSyntheticLambda8, z, datePickerKtExternalSyntheticLambda31);
        }
    }

    public final void onExtraCallback(@NotNull DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32, @Nullable DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda322) {
        Intrinsics.checkNotNullParameter(datePickerKtExternalSyntheticLambda32, "");
        this.onWarmupCompleted.IAuthTabCallback(datePickerKtExternalSyntheticLambda32, datePickerKtExternalSyntheticLambda322);
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        final /* synthetic */ DateRangeInputKtExternalSyntheticLambda1<T> $pagingData;
        int label;
        final /* synthetic */ DateRangeInputKtExternalSyntheticLambda0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(DateRangeInputKtExternalSyntheticLambda0<T> dateRangeInputKtExternalSyntheticLambda0, DateRangeInputKtExternalSyntheticLambda1<T> dateRangeInputKtExternalSyntheticLambda1, access13800<? super IAuthTabCallback> access13800Var) {
            super(1, access13800Var);
            this.this$0 = dateRangeInputKtExternalSyntheticLambda0;
            this.$pagingData = dateRangeInputKtExternalSyntheticLambda1;
        }

        public final access13800<Unit> create(@NotNull access13800<?> access13800Var) {
            return new IAuthTabCallback(this.this$0, this.$pagingData, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable access13800<? super Unit> access13800Var) {
            return create(access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).IAuthTabCallbackStubProxy = this.$pagingData.asBinder();
                IAnimation iAnimationOnExtraCallback = this.$pagingData.onExtraCallback();
                final DateRangeInputKtExternalSyntheticLambda0<T> dateRangeInputKtExternalSyntheticLambda0 = this.this$0;
                final DateRangeInputKtExternalSyntheticLambda1<T> dateRangeInputKtExternalSyntheticLambda1 = this.$pagingData;
                setRipple setripple = new setRipple() { // from class: o.DateRangeInputKtExternalSyntheticLambda0.IAuthTabCallback.1

                    /* renamed from: o.DateRangeInputKtExternalSyntheticLambda0$IAuthTabCallback$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                        final /* synthetic */ DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1<T> $event;
                        final /* synthetic */ DateRangeInputKtExternalSyntheticLambda1<T> $pagingData;
                        int label;
                        final /* synthetic */ DateRangeInputKtExternalSyntheticLambda0<T> this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1<T> datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1, DateRangeInputKtExternalSyntheticLambda0<T> dateRangeInputKtExternalSyntheticLambda0, DateRangeInputKtExternalSyntheticLambda1<T> dateRangeInputKtExternalSyntheticLambda1, access13800<? super AnonymousClass2> access13800Var) {
                            super(2, access13800Var);
                            this.$event = datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1;
                            this.this$0 = dateRangeInputKtExternalSyntheticLambda0;
                            this.$pagingData = dateRangeInputKtExternalSyntheticLambda1;
                        }

                        public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
                            return new AnonymousClass2(this.$event, this.this$0, this.$pagingData, access13800Var);
                        }

                        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(@NotNull findResAndMsg findresandmsg, @Nullable access13800<? super Unit> access13800Var) {
                            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
                        
                            if (r0.onExtraCallback(r1, r2, r4, true, r5, r6, r7, r10) == r9) goto L32;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c4, code lost:
                        
                            if (r1.onExtraCallback(r5, 0, 0, r4, r6, r7, r8, r10) == r9) goto L32;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
                        
                            if (o.b10.IAuthTabCallback(r10) == r9) goto L32;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                            int i2 = this.label;
                            boolean z = true;
                            if (i2 == 0) {
                                ResultKt.onNavigationEvent(obj);
                                DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted = this.$event;
                                if ((onwarmupcompleted instanceof DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onWarmupCompleted) && onwarmupcompleted.onExtraCallback() == DatePickerKtExternalSyntheticLambda8.REFRESH) {
                                    DateRangeInputKtExternalSyntheticLambda0<T> dateRangeInputKtExternalSyntheticLambda0 = this.this$0;
                                    List listIAuthTabCallback = this.$event.IAuthTabCallback();
                                    int iAsBinder = this.$event.asBinder();
                                    int iOnWarmupCompleted = this.$event.onWarmupCompleted();
                                    DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32IAuthTabCallbackStub = this.$event.IAuthTabCallbackStub();
                                    DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32OnNavigationEvent = this.$event.onNavigationEvent();
                                    DatePickerKtExternalSyntheticLambda28 datePickerKtExternalSyntheticLambda28OnExtraCallbackWithResult = this.$pagingData.onExtraCallbackWithResult();
                                    this.label = 1;
                                } else {
                                    DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onNavigationEvent onnavigationevent = this.$event;
                                    if (onnavigationevent instanceof DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onNavigationEvent) {
                                        DateRangeInputKtExternalSyntheticLambda0<T> dateRangeInputKtExternalSyntheticLambda02 = this.this$0;
                                        List listListOf = CollectionsKt.listOf(new DateRangePickerDefaultsExternalSyntheticLambda1(0, onnavigationevent.onExtraCallbackWithResult()));
                                        boolean z2 = (this.$event.IAuthTabCallback() == null && this.$event.onWarmupCompleted() == null) ? false : true;
                                        DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32IAuthTabCallback = this.$event.IAuthTabCallback();
                                        DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32OnWarmupCompleted = this.$event.onWarmupCompleted();
                                        DatePickerKtExternalSyntheticLambda28 datePickerKtExternalSyntheticLambda28OnExtraCallbackWithResult2 = this.$pagingData.onExtraCallbackWithResult();
                                        this.label = 2;
                                    } else {
                                        if (this.this$0.onExtraCallbackWithResult()) {
                                            this.label = 3;
                                        }
                                        ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).access100.onWarmupCompleted(this.$event, ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).access000);
                                        if (this.$event instanceof DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onExtraCallbackWithResult) {
                                        }
                                        if (this.$event instanceof DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onWarmupCompleted) {
                                        }
                                    }
                                    return objOnWarmupCompleted;
                                }
                            } else if (i2 == 1 || i2 == 2) {
                                ResultKt.onNavigationEvent(obj);
                            } else {
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.onNavigationEvent(obj);
                                ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).access100.onWarmupCompleted(this.$event, ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).access000);
                                if (this.$event instanceof DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onExtraCallbackWithResult) {
                                    ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).asInterface = false;
                                }
                                if (this.$event instanceof DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onWarmupCompleted) {
                                    DatePickerKtExternalSyntheticLambda16 datePickerKtExternalSyntheticLambda16 = (DatePickerKtExternalSyntheticLambda16) ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).onWarmupCompleted.onNavigationEvent().IAuthTabCallback();
                                    DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32OnWarmupCompleted2 = datePickerKtExternalSyntheticLambda16 != null ? datePickerKtExternalSyntheticLambda16.onWarmupCompleted() : null;
                                    if (datePickerKtExternalSyntheticLambda32OnWarmupCompleted2 == null) {
                                        throw new IllegalStateException("PagingDataDiffer.combinedLoadStatesCollection.stateFlow shouldnot hold null CombinedLoadStates after Insert event.");
                                    }
                                    boolean z3 = ((this.$event.onExtraCallback() == DatePickerKtExternalSyntheticLambda8.PREPEND && datePickerKtExternalSyntheticLambda32OnWarmupCompleted2.onWarmupCompleted().onExtraCallback()) || (this.$event.onExtraCallback() == DatePickerKtExternalSyntheticLambda8.APPEND && datePickerKtExternalSyntheticLambda32OnWarmupCompleted2.onExtraCallbackWithResult().onExtraCallback())) ? false : true;
                                    List listIAuthTabCallback2 = this.$event.IAuthTabCallback();
                                    if (!(listIAuthTabCallback2 instanceof Collection) || !listIAuthTabCallback2.isEmpty()) {
                                        Iterator<T> it = listIAuthTabCallback2.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            if (!((DateRangePickerDefaultsExternalSyntheticLambda1) it.next()).onExtraCallbackWithResult().isEmpty()) {
                                                z = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z3) {
                                        ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).asInterface = false;
                                    } else if (((DateRangeInputKtExternalSyntheticLambda0) this.this$0).asInterface || z) {
                                        if (z || ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).asBinder < ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).access100.onNavigationEvent() || ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).asBinder > ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).access100.onNavigationEvent() + ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).access100.IAuthTabCallbackDefault()) {
                                            DatePickerKtExternalSyntheticLambda28 datePickerKtExternalSyntheticLambda28 = ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).onExtraCallback;
                                            if (datePickerKtExternalSyntheticLambda28 != null) {
                                                datePickerKtExternalSyntheticLambda28.onExtraCallbackWithResult(((DateRangeInputKtExternalSyntheticLambda0) this.this$0).access100.onExtraCallbackWithResult(((DateRangeInputKtExternalSyntheticLambda0) this.this$0).asBinder));
                                            }
                                        } else {
                                            ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).asInterface = false;
                                        }
                                    }
                                }
                            }
                            DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1<T> datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1 = this.$event;
                            if ((datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1 instanceof DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onWarmupCompleted) || (datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1 instanceof DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onExtraCallbackWithResult) || (datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1 instanceof DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1.onNavigationEvent)) {
                                Iterator<T> it2 = ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).onTransact.iterator();
                                while (it2.hasNext()) {
                                    ((Function0) it2.next()).invoke();
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                    public final Object emit(@NotNull DatePickerKtHorizontalMonthsList1ExternalSyntheticLambda1<T> datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1, @NotNull access13800<? super Unit> access13800Var) {
                        DatePickerKtExternalSyntheticLambda6 datePickerKtExternalSyntheticLambda6IAuthTabCallback = DatePickerKtExternalSyntheticLambda7.IAuthTabCallback();
                        if (datePickerKtExternalSyntheticLambda6IAuthTabCallback != null && datePickerKtExternalSyntheticLambda6IAuthTabCallback.onExtraCallbackWithResult(2)) {
                            datePickerKtExternalSyntheticLambda6IAuthTabCallback.IAuthTabCallback(2, "Collected " + datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1, (Throwable) null);
                        }
                        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(((DateRangeInputKtExternalSyntheticLambda0) dateRangeInputKtExternalSyntheticLambda0).IAuthTabCallbackDefault, new AnonymousClass2(datePickerKtHorizontalMonthsList1ExternalSyntheticLambda1, dateRangeInputKtExternalSyntheticLambda0, dateRangeInputKtExternalSyntheticLambda1, null), access13800Var);
                        return objOnExtraCallback == access14300.onWarmupCompleted() ? objOnExtraCallback : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (iAnimationOnExtraCallback.collect(setripple, this) == objOnWarmupCompleted) {
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

    public final Object onNavigationEvent(@NotNull DateRangeInputKtExternalSyntheticLambda1<T> dateRangeInputKtExternalSyntheticLambda1, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallback = DateRangePickerKtExternalSyntheticLambda1.onExtraCallback(this.IAuthTabCallback, 0, new IAuthTabCallback(this, dateRangeInputKtExternalSyntheticLambda1, null), access13800Var, 1, (Object) null);
        return objOnExtraCallback == access14300.onWarmupCompleted() ? objOnExtraCallback : Unit.INSTANCE;
    }

    public final T onExtraCallbackWithResult(int i2) {
        this.asInterface = true;
        this.asBinder = i2;
        DatePickerKtExternalSyntheticLambda6 datePickerKtExternalSyntheticLambda6IAuthTabCallback = DatePickerKtExternalSyntheticLambda7.IAuthTabCallback();
        if (datePickerKtExternalSyntheticLambda6IAuthTabCallback != null && datePickerKtExternalSyntheticLambda6IAuthTabCallback.onExtraCallbackWithResult(2)) {
            datePickerKtExternalSyntheticLambda6IAuthTabCallback.IAuthTabCallback(2, "Accessing item index[" + i2 + ']', (Throwable) null);
        }
        DatePickerKtExternalSyntheticLambda28 datePickerKtExternalSyntheticLambda28 = this.onExtraCallback;
        if (datePickerKtExternalSyntheticLambda28 != null) {
            datePickerKtExternalSyntheticLambda28.onExtraCallbackWithResult(this.access100.onExtraCallbackWithResult(i2));
        }
        return this.access100.onExtraCallback(i2);
    }

    public final DatePickerKtExternalSyntheticLambda3<T> onNavigationEvent() {
        return this.access100.IAuthTabCallbackStub();
    }

    public final setRubIn<DatePickerKtExternalSyntheticLambda16> IAuthTabCallback() {
        return this.IAuthTabCallbackStub;
    }

    public final void onWarmupCompleted(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onTransact.add(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(List<DateRangePickerDefaultsExternalSyntheticLambda1<T>> list, int i2, int i3, boolean z, DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32, DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda322, DatePickerKtExternalSyntheticLambda28 datePickerKtExternalSyntheticLambda28, access13800<? super Unit> access13800Var) {
        access13800<? super Integer> onextracallback;
        DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda323;
        DateRangeInputKtExternalSyntheticLambda0<T> dateRangeInputKtExternalSyntheticLambda0;
        DatePickerKtMonthsNavigation11ExternalSyntheticLambda0 datePickerKtMonthsNavigation11ExternalSyntheticLambda0;
        Ref.BooleanRef booleanRef;
        boolean z2 = z;
        DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda324 = datePickerKtExternalSyntheticLambda32;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i4 = onextracallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i4 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(this, access13800Var);
            }
        }
        access13800<? super Integer> access13800Var2 = onextracallback;
        Object objOnWarmupCompleted = access13800Var2.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i5 = access13800Var2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            if (z2 && datePickerKtExternalSyntheticLambda324 == null) {
                throw new IllegalArgumentException("Cannot dispatch LoadStates in PagingDataDiffer without source LoadStates set.");
            }
            this.asInterface = false;
            DatePickerKtMonthsNavigation11ExternalSyntheticLambda0 datePickerKtMonthsNavigation11ExternalSyntheticLambda02 = new DatePickerKtMonthsNavigation11ExternalSyntheticLambda0(list, i2, i3);
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            DatePickerKtDatePickerContent242ExternalSyntheticLambda0<T> datePickerKtDatePickerContent242ExternalSyntheticLambda0 = this.access100;
            int i6 = this.asBinder;
            Function0<Unit> onwarmupcompleted = new onWarmupCompleted(this, datePickerKtMonthsNavigation11ExternalSyntheticLambda02, booleanRef2, datePickerKtExternalSyntheticLambda28, datePickerKtExternalSyntheticLambda322, list, i2, i3, datePickerKtExternalSyntheticLambda32);
            access13800Var2.L$0 = this;
            access13800Var2.L$1 = datePickerKtExternalSyntheticLambda324;
            access13800Var2.L$2 = datePickerKtExternalSyntheticLambda322;
            access13800Var2.L$3 = datePickerKtMonthsNavigation11ExternalSyntheticLambda02;
            access13800Var2.L$4 = booleanRef2;
            access13800Var2.Z$0 = z2;
            access13800Var2.label = 1;
            objOnWarmupCompleted = onWarmupCompleted(datePickerKtDatePickerContent242ExternalSyntheticLambda0, datePickerKtMonthsNavigation11ExternalSyntheticLambda02, i6, onwarmupcompleted, access13800Var2);
            if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                return objOnWarmupCompleted2;
            }
            datePickerKtExternalSyntheticLambda323 = datePickerKtExternalSyntheticLambda322;
            dateRangeInputKtExternalSyntheticLambda0 = this;
            datePickerKtMonthsNavigation11ExternalSyntheticLambda0 = datePickerKtMonthsNavigation11ExternalSyntheticLambda02;
            booleanRef = booleanRef2;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = access13800Var2.Z$0;
            booleanRef = (Ref.BooleanRef) access13800Var2.L$4;
            datePickerKtMonthsNavigation11ExternalSyntheticLambda0 = (DatePickerKtMonthsNavigation11ExternalSyntheticLambda0) access13800Var2.L$3;
            datePickerKtExternalSyntheticLambda323 = (DatePickerKtExternalSyntheticLambda32) access13800Var2.L$2;
            DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda325 = (DatePickerKtExternalSyntheticLambda32) access13800Var2.L$1;
            dateRangeInputKtExternalSyntheticLambda0 = (DateRangeInputKtExternalSyntheticLambda0) access13800Var2.L$0;
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            z2 = z3;
            datePickerKtExternalSyntheticLambda324 = datePickerKtExternalSyntheticLambda325;
        }
        Integer num = (Integer) objOnWarmupCompleted;
        if (!booleanRef.element) {
            throw new IllegalStateException("Missing call to onListPresentable after new list was presented. If you are seeing\n this exception, it is generally an indication of an issue with Paging.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
        }
        if (z2) {
            Intrinsics.checkNotNull(datePickerKtExternalSyntheticLambda324);
            dateRangeInputKtExternalSyntheticLambda0.onExtraCallback(datePickerKtExternalSyntheticLambda324, datePickerKtExternalSyntheticLambda323);
        }
        if (num == null) {
            DatePickerKtExternalSyntheticLambda28 datePickerKtExternalSyntheticLambda282 = dateRangeInputKtExternalSyntheticLambda0.onExtraCallback;
            if (datePickerKtExternalSyntheticLambda282 != null) {
                datePickerKtExternalSyntheticLambda282.onExtraCallbackWithResult(datePickerKtMonthsNavigation11ExternalSyntheticLambda0.IAuthTabCallback());
            }
        } else {
            dateRangeInputKtExternalSyntheticLambda0.asBinder = num.intValue();
            DatePickerKtExternalSyntheticLambda28 datePickerKtExternalSyntheticLambda283 = dateRangeInputKtExternalSyntheticLambda0.onExtraCallback;
            if (datePickerKtExternalSyntheticLambda283 != null) {
                datePickerKtExternalSyntheticLambda283.onExtraCallbackWithResult(datePickerKtMonthsNavigation11ExternalSyntheticLambda0.onExtraCallbackWithResult(num.intValue()));
            }
        }
        return Unit.INSTANCE;
    }

    static final class onWarmupCompleted extends Lambda implements Function0<Unit> {
        final /* synthetic */ DatePickerKtExternalSyntheticLambda32 $mediatorLoadStates;
        final /* synthetic */ DatePickerKtExternalSyntheticLambda28 $newHintReceiver;
        final /* synthetic */ DatePickerKtMonthsNavigation11ExternalSyntheticLambda0<T> $newPresenter;
        final /* synthetic */ Ref.BooleanRef $onListPresentableCalled;
        final /* synthetic */ List<DateRangePickerDefaultsExternalSyntheticLambda1<T>> $pages;
        final /* synthetic */ int $placeholdersAfter;
        final /* synthetic */ int $placeholdersBefore;
        final /* synthetic */ DatePickerKtExternalSyntheticLambda32 $sourceLoadStates;
        final /* synthetic */ DateRangeInputKtExternalSyntheticLambda0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(DateRangeInputKtExternalSyntheticLambda0<T> dateRangeInputKtExternalSyntheticLambda0, DatePickerKtMonthsNavigation11ExternalSyntheticLambda0<T> datePickerKtMonthsNavigation11ExternalSyntheticLambda0, Ref.BooleanRef booleanRef, DatePickerKtExternalSyntheticLambda28 datePickerKtExternalSyntheticLambda28, DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32, List<DateRangePickerDefaultsExternalSyntheticLambda1<T>> list, int i2, int i3, DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda322) {
            super(0);
            this.this$0 = dateRangeInputKtExternalSyntheticLambda0;
            this.$newPresenter = datePickerKtMonthsNavigation11ExternalSyntheticLambda0;
            this.$onListPresentableCalled = booleanRef;
            this.$newHintReceiver = datePickerKtExternalSyntheticLambda28;
            this.$mediatorLoadStates = datePickerKtExternalSyntheticLambda32;
            this.$pages = list;
            this.$placeholdersBefore = i2;
            this.$placeholdersAfter = i3;
            this.$sourceLoadStates = datePickerKtExternalSyntheticLambda322;
        }

        public /* synthetic */ Object invoke() {
            onWarmupCompleted();
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted() {
            List listOnExtraCallbackWithResult;
            List listOnExtraCallbackWithResult2;
            ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).access100 = this.$newPresenter;
            this.$onListPresentableCalled.element = true;
            ((DateRangeInputKtExternalSyntheticLambda0) this.this$0).onExtraCallback = this.$newHintReceiver;
            DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32 = this.$mediatorLoadStates;
            List<DateRangePickerDefaultsExternalSyntheticLambda1<T>> list = this.$pages;
            int i2 = this.$placeholdersBefore;
            int i3 = this.$placeholdersAfter;
            DatePickerKtExternalSyntheticLambda28 datePickerKtExternalSyntheticLambda28 = this.$newHintReceiver;
            DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda322 = this.$sourceLoadStates;
            DatePickerKtExternalSyntheticLambda6 datePickerKtExternalSyntheticLambda6IAuthTabCallback = DatePickerKtExternalSyntheticLambda7.IAuthTabCallback();
            if (datePickerKtExternalSyntheticLambda6IAuthTabCallback == null || !datePickerKtExternalSyntheticLambda6IAuthTabCallback.onExtraCallbackWithResult(3)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Presenting data:\n                            |   first item: ");
            DateRangePickerDefaultsExternalSyntheticLambda1 dateRangePickerDefaultsExternalSyntheticLambda1 = (DateRangePickerDefaultsExternalSyntheticLambda1) CollectionsKt.firstOrNull(list);
            sb.append((dateRangePickerDefaultsExternalSyntheticLambda1 == null || (listOnExtraCallbackWithResult2 = dateRangePickerDefaultsExternalSyntheticLambda1.onExtraCallbackWithResult()) == null) ? null : CollectionsKt.firstOrNull(listOnExtraCallbackWithResult2));
            sb.append("\n                            |   last item: ");
            DateRangePickerDefaultsExternalSyntheticLambda1 dateRangePickerDefaultsExternalSyntheticLambda12 = (DateRangePickerDefaultsExternalSyntheticLambda1) CollectionsKt.lastOrNull(list);
            sb.append((dateRangePickerDefaultsExternalSyntheticLambda12 == null || (listOnExtraCallbackWithResult = dateRangePickerDefaultsExternalSyntheticLambda12.onExtraCallbackWithResult()) == null) ? null : CollectionsKt.lastOrNull(listOnExtraCallbackWithResult));
            sb.append("\n                            |   placeholdersBefore: ");
            sb.append(i2);
            sb.append("\n                            |   placeholdersAfter: ");
            sb.append(i3);
            sb.append("\n                            |   hintReceiver: ");
            sb.append(datePickerKtExternalSyntheticLambda28);
            sb.append("\n                            |   sourceLoadStates: ");
            sb.append(datePickerKtExternalSyntheticLambda322);
            sb.append("\n                        ");
            String string = sb.toString();
            if (datePickerKtExternalSyntheticLambda32 != null) {
                string = string + "|   mediatorLoadStates: " + datePickerKtExternalSyntheticLambda32 + '\n';
            }
            datePickerKtExternalSyntheticLambda6IAuthTabCallback.IAuthTabCallback(3, StringsKt.trimMargin$default(string + "|)", (String) null, 1, (Object) null), (Throwable) null);
        }
    }

    public final void onExtraCallback() {
        DatePickerKtExternalSyntheticLambda6 datePickerKtExternalSyntheticLambda6IAuthTabCallback = DatePickerKtExternalSyntheticLambda7.IAuthTabCallback();
        if (datePickerKtExternalSyntheticLambda6IAuthTabCallback != null && datePickerKtExternalSyntheticLambda6IAuthTabCallback.onExtraCallbackWithResult(3)) {
            datePickerKtExternalSyntheticLambda6IAuthTabCallback.IAuthTabCallback(3, "Retry signal received", (Throwable) null);
        }
        DateRangePickerKtExternalSyntheticLambda6 dateRangePickerKtExternalSyntheticLambda6 = this.IAuthTabCallbackStubProxy;
        if (dateRangePickerKtExternalSyntheticLambda6 != null) {
            dateRangePickerKtExternalSyntheticLambda6.onWarmupCompleted();
        }
    }
}

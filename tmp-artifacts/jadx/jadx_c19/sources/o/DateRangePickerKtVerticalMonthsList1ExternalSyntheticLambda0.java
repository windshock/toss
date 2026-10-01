package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerKtExternalSyntheticLambda31;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DateRangePickerKtVerticalMonthsList1ExternalSyntheticLambda0 {
    private static final DatePickerKtExternalSyntheticLambda32 onExtraCallback;
    private static final DatePickerKtExternalSyntheticLambda31.onExtraCallbackWithResult onWarmupCompleted;

    static {
        DatePickerKtExternalSyntheticLambda31.onExtraCallbackWithResult onextracallbackwithresult = new DatePickerKtExternalSyntheticLambda31.onExtraCallbackWithResult(false);
        onWarmupCompleted = onextracallbackwithresult;
        onExtraCallback = new DatePickerKtExternalSyntheticLambda32(DatePickerKtExternalSyntheticLambda31.onExtraCallback.onExtraCallback, onextracallbackwithresult, onextracallbackwithresult);
    }

    public static final <T> DateRangePickerKtExternalSyntheticLambda3<T> onNavigationEvent(@NotNull IAnimation<DateRangeInputKtExternalSyntheticLambda1<T>> iAnimation, @Nullable CoroutineContext coroutineContext, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iAnimation, "");
        cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(388053246);
        if ((i3 & 1) != 0) {
            coroutineContext = access13600.IAuthTabCallback;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(388053246, i2, -1, "androidx.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:264)");
        }
        cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(1157296644);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAnimation);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new DateRangePickerKtExternalSyntheticLambda3(iAnimation);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
        DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3 = (DateRangePickerKtExternalSyntheticLambda3) objOnMinimized;
        isZslDisabledByByUserCaseConfig.onNavigationEvent(dateRangePickerKtExternalSyntheticLambda3, new IAuthTabCallback(coroutineContext, dateRangePickerKtExternalSyntheticLambda3, null), cameraCaptureResultEmptyCameraCaptureResult, 72);
        isZslDisabledByByUserCaseConfig.onNavigationEvent(dateRangePickerKtExternalSyntheticLambda3, new onWarmupCompleted(coroutineContext, dateRangePickerKtExternalSyntheticLambda3, null), cameraCaptureResultEmptyCameraCaptureResult, 72);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
        return dateRangePickerKtExternalSyntheticLambda3;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ CoroutineContext $context;
        final /* synthetic */ DateRangePickerKtExternalSyntheticLambda3<T> $lazyPagingItems;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(CoroutineContext coroutineContext, DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$context = coroutineContext;
            this.$lazyPagingItems = dateRangePickerKtExternalSyntheticLambda3;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull findResAndMsg findresandmsg, @Nullable access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
            return new IAuthTabCallback(this.$context, this.$lazyPagingItems, access13800Var);
        }

        /* renamed from: o.DateRangePickerKtVerticalMonthsList1ExternalSyntheticLambda0$IAuthTabCallback$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            final /* synthetic */ DateRangePickerKtExternalSyntheticLambda3<T> $lazyPagingItems;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$lazyPagingItems = dateRangePickerKtExternalSyntheticLambda3;
            }

            public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
                return new AnonymousClass5(this.$lazyPagingItems, access13800Var);
            }

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull findResAndMsg findresandmsg, @Nullable access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3 = this.$lazyPagingItems;
                    this.label = 1;
                    if (dateRangePickerKtExternalSyntheticLambda3.onExtraCallback((access13800<? super Unit>) this) == objOnWarmupCompleted) {
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

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        
            if (r6.onExtraCallback((o.access13800<? super kotlin.Unit>) r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        
            if (o.maybeUpdateAnimatable.onExtraCallback(r6, r1, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        
            return r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (Intrinsics.areEqual(this.$context, access13600.IAuthTabCallback)) {
                    DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3 = this.$lazyPagingItems;
                    this.label = 1;
                } else {
                    CoroutineContext coroutineContext = this.$context;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$lazyPagingItems, null);
                    this.label = 2;
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ CoroutineContext $context;
        final /* synthetic */ DateRangePickerKtExternalSyntheticLambda3<T> $lazyPagingItems;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(CoroutineContext coroutineContext, DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$context = coroutineContext;
            this.$lazyPagingItems = dateRangePickerKtExternalSyntheticLambda3;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull findResAndMsg findresandmsg, @Nullable access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
            return new onWarmupCompleted(this.$context, this.$lazyPagingItems, access13800Var);
        }

        /* renamed from: o.DateRangePickerKtVerticalMonthsList1ExternalSyntheticLambda0$onWarmupCompleted$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            final /* synthetic */ DateRangePickerKtExternalSyntheticLambda3<T> $lazyPagingItems;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.$lazyPagingItems = dateRangePickerKtExternalSyntheticLambda3;
            }

            public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
                return new AnonymousClass4(this.$lazyPagingItems, access13800Var);
            }

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull findResAndMsg findresandmsg, @Nullable access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3 = this.$lazyPagingItems;
                    this.label = 1;
                    if (dateRangePickerKtExternalSyntheticLambda3.IAuthTabCallback(this) == objOnWarmupCompleted) {
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

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        
            if (r6.IAuthTabCallback(r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        
            if (o.maybeUpdateAnimatable.onExtraCallback(r6, r1, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        
            return r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (Intrinsics.areEqual(this.$context, access13600.IAuthTabCallback)) {
                    DateRangePickerKtExternalSyntheticLambda3<T> dateRangePickerKtExternalSyntheticLambda3 = this.$lazyPagingItems;
                    this.label = 1;
                } else {
                    CoroutineContext coroutineContext = this.$context;
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$lazyPagingItems, null);
                    this.label = 2;
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }
}

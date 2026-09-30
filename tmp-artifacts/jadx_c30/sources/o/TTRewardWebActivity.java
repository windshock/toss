package o;

import android.bluetooth.BluetoothDevice;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import net.sf.scuba.smartcards.BuildConfig;
import no.nordicsemi.android.ble.ReadRequest;
import o.TTRewardWebActivity;
import o.lt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTRewardWebActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void asBinder(Ref.ObjectRef objectRef, BluetoothDevice bluetoothDevice, byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(objectRef, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        Function1 function1 = (Function1) objectRef.element;
        if (function1 != null) {
            function1.invoke(new IABLandingPageActivity(i, bArr));
        }
    }

    public static final class IAuthTabCallback extends SuspendLambda implements Function2<ok<? super IABLandingPageActivity>, access13800<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> $callback;
        final /* synthetic */ ReadRequest $this_mergeWithProgressFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> objectRef, ReadRequest readRequest, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$callback = objectRef;
            this.$this_mergeWithProgressFlow = readRequest;
        }

        public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$callback, this.$this_mergeWithProgressFlow, access13800Var);
            iAuthTabCallback.L$0 = obj;
            return iAuthTabCallback;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull ok<? super IABLandingPageActivity> okVar, @Nullable access13800<? super Unit> access13800Var) {
            return create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                final ok okVar = (ok) this.L$0;
                this.$callback.element = new Function1<IABLandingPageActivity, Unit>() { // from class: o.TTRewardWebActivity.IAuthTabCallback.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public /* synthetic */ Object invoke(Object obj2) {
                        onExtraCallback((IABLandingPageActivity) obj2);
                        return Unit.INSTANCE;
                    }

                    public final void onExtraCallback(@NotNull IABLandingPageActivity iABLandingPageActivity) {
                        Intrinsics.checkNotNullParameter(iABLandingPageActivity, BuildConfig.FLAVOR);
                        okVar.IAuthTabCallback(iABLandingPageActivity);
                    }
                };
                this.$this_mergeWithProgressFlow.onWarmupCompleted(new getPA() { // from class: no.nordicsemi.android.ble.ktx.ProgressIndicatonKt$mergeWithProgressFlow$2$$ExternalSyntheticLambda0
                    public final void onRequestFinished(BluetoothDevice bluetoothDevice) {
                        TTRewardWebActivity.IAuthTabCallback.onWarmupCompleted(okVar, bluetoothDevice);
                    }
                });
                final Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> objectRef = this.$callback;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: o.TTRewardWebActivity.IAuthTabCallback.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final void IAuthTabCallback() {
                        objectRef.element = null;
                    }

                    public /* synthetic */ Object invoke() {
                        IAuthTabCallback();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (jw.onWarmupCompleted(okVar, function0, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onWarmupCompleted(ok okVar, BluetoothDevice bluetoothDevice) {
            lt.onWarmupCompleted.onExtraCallbackWithResult(okVar, (Throwable) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asInterface(Ref.ObjectRef objectRef, BluetoothDevice bluetoothDevice, byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(objectRef, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        Function1 function1 = (Function1) objectRef.element;
        if (function1 != null) {
            function1.invoke(new IABLandingPageActivity(i, bArr));
        }
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<ok<? super IABLandingPageActivity>, access13800<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> $callback;
        final /* synthetic */ hasSecondOptions $this_mergeWithProgressFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> objectRef, hasSecondOptions hassecondoptions, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$callback = objectRef;
            this.$this_mergeWithProgressFlow = hassecondoptions;
        }

        public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$callback, this.$this_mergeWithProgressFlow, access13800Var);
            onwarmupcompleted.L$0 = obj;
            return onwarmupcompleted;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull ok<? super IABLandingPageActivity> okVar, @Nullable access13800<? super Unit> access13800Var) {
            return create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                final ok okVar = (ok) this.L$0;
                this.$callback.element = new Function1<IABLandingPageActivity, Unit>() { // from class: o.TTRewardWebActivity.onWarmupCompleted.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public /* synthetic */ Object invoke(Object obj2) {
                        onExtraCallback((IABLandingPageActivity) obj2);
                        return Unit.INSTANCE;
                    }

                    public final void onExtraCallback(@NotNull IABLandingPageActivity iABLandingPageActivity) {
                        Intrinsics.checkNotNullParameter(iABLandingPageActivity, BuildConfig.FLAVOR);
                        okVar.IAuthTabCallback(iABLandingPageActivity);
                    }
                };
                this.$this_mergeWithProgressFlow.IAuthTabCallback(new getPA() { // from class: no.nordicsemi.android.ble.ktx.ProgressIndicatonKt$mergeWithProgressFlow$4$$ExternalSyntheticLambda0
                    public final void onRequestFinished(BluetoothDevice bluetoothDevice) {
                        TTRewardWebActivity.onWarmupCompleted.onExtraCallbackWithResult(okVar, bluetoothDevice);
                    }
                });
                final Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> objectRef = this.$callback;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: o.TTRewardWebActivity.onWarmupCompleted.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public /* synthetic */ Object invoke() {
                        onWarmupCompleted();
                        return Unit.INSTANCE;
                    }

                    public final void onWarmupCompleted() {
                        objectRef.element = null;
                    }
                };
                this.label = 1;
                if (jw.onWarmupCompleted(okVar, function0, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onExtraCallbackWithResult(ok okVar, BluetoothDevice bluetoothDevice) {
            lt.onWarmupCompleted.onExtraCallbackWithResult(okVar, (Throwable) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTransact(Ref.ObjectRef objectRef, BluetoothDevice bluetoothDevice, byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(objectRef, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        Function1 function1 = (Function1) objectRef.element;
        if (function1 != null) {
            function1.invoke(new IABLandingPageActivity(i, bArr));
        }
    }

    public static final class onNavigationEvent extends SuspendLambda implements Function2<ok<? super IABLandingPageActivity>, access13800<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> $callback;
        final /* synthetic */ getOptions $this_mergeWithProgressFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> objectRef, getOptions getoptions, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$callback = objectRef;
            this.$this_mergeWithProgressFlow = getoptions;
        }

        public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$callback, this.$this_mergeWithProgressFlow, access13800Var);
            onnavigationevent.L$0 = obj;
            return onnavigationevent;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull ok<? super IABLandingPageActivity> okVar, @Nullable access13800<? super Unit> access13800Var) {
            return create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                final ok okVar = (ok) this.L$0;
                this.$callback.element = new Function1<IABLandingPageActivity, Unit>() { // from class: o.TTRewardWebActivity.onNavigationEvent.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void IAuthTabCallback(@NotNull IABLandingPageActivity iABLandingPageActivity) {
                        Intrinsics.checkNotNullParameter(iABLandingPageActivity, BuildConfig.FLAVOR);
                        okVar.IAuthTabCallback(iABLandingPageActivity);
                    }

                    public /* synthetic */ Object invoke(Object obj2) {
                        IAuthTabCallback((IABLandingPageActivity) obj2);
                        return Unit.INSTANCE;
                    }
                };
                this.$this_mergeWithProgressFlow.onNavigationEvent(new getTitleBarTheme() { // from class: no.nordicsemi.android.ble.ktx.ProgressIndicatonKt$mergeWithProgressFlow$6$$ExternalSyntheticLambda0
                    public final void onClosed() {
                        TTRewardWebActivity.onNavigationEvent.IAuthTabCallback(okVar);
                    }
                });
                final Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> objectRef = this.$callback;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: o.TTRewardWebActivity.onNavigationEvent.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public /* synthetic */ Object invoke() {
                        onExtraCallbackWithResult();
                        return Unit.INSTANCE;
                    }

                    public final void onExtraCallbackWithResult() {
                        objectRef.element = null;
                    }
                };
                this.label = 1;
                if (jw.onWarmupCompleted(okVar, function0, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IAuthTabCallback(ok okVar) {
            lt.onWarmupCompleted.onExtraCallbackWithResult(okVar, (Throwable) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(Ref.ObjectRef objectRef, BluetoothDevice bluetoothDevice, byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(objectRef, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        Function1 function1 = (Function1) objectRef.element;
        if (function1 != null) {
            function1.invoke(new IABLandingPageActivity(i, bArr));
        }
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<ok<? super IABLandingPageActivity>, access13800<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> $callback;
        final /* synthetic */ InitConfig $this_splitWithProgressFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> objectRef, InitConfig initConfig, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$callback = objectRef;
            this.$this_splitWithProgressFlow = initConfig;
        }

        public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$callback, this.$this_splitWithProgressFlow, access13800Var);
            onextracallbackwithresult.L$0 = obj;
            return onextracallbackwithresult;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull ok<? super IABLandingPageActivity> okVar, @Nullable access13800<? super Unit> access13800Var) {
            return create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                final ok okVar = (ok) this.L$0;
                this.$callback.element = new Function1<IABLandingPageActivity, Unit>() { // from class: o.TTRewardWebActivity.onExtraCallbackWithResult.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void IAuthTabCallback(@NotNull IABLandingPageActivity iABLandingPageActivity) {
                        Intrinsics.checkNotNullParameter(iABLandingPageActivity, BuildConfig.FLAVOR);
                        okVar.IAuthTabCallback(iABLandingPageActivity);
                    }

                    public /* synthetic */ Object invoke(Object obj2) {
                        IAuthTabCallback((IABLandingPageActivity) obj2);
                        return Unit.INSTANCE;
                    }
                };
                this.$this_splitWithProgressFlow.onNavigationEvent(new getPA() { // from class: no.nordicsemi.android.ble.ktx.ProgressIndicatonKt$splitWithProgressFlow$2$$ExternalSyntheticLambda0
                    public final void onRequestFinished(BluetoothDevice bluetoothDevice) {
                        TTRewardWebActivity.onExtraCallbackWithResult.onNavigationEvent(okVar, bluetoothDevice);
                    }
                });
                final Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> objectRef = this.$callback;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: o.TTRewardWebActivity.onExtraCallbackWithResult.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public /* synthetic */ Object invoke() {
                        onExtraCallback();
                        return Unit.INSTANCE;
                    }

                    public final void onExtraCallback() {
                        objectRef.element = null;
                    }
                };
                this.label = 1;
                if (jw.onWarmupCompleted(okVar, function0, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onNavigationEvent(ok okVar, BluetoothDevice bluetoothDevice) {
            lt.onWarmupCompleted.onExtraCallbackWithResult(okVar, (Throwable) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackDefault(Ref.ObjectRef objectRef, BluetoothDevice bluetoothDevice, byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(objectRef, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        Function1 function1 = (Function1) objectRef.element;
        if (function1 != null) {
            function1.invoke(new IABLandingPageActivity(i, bArr));
        }
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<ok<? super IABLandingPageActivity>, access13800<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> $callback;
        final /* synthetic */ FilterWord $this_splitWithProgressFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> objectRef, FilterWord filterWord, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$callback = objectRef;
            this.$this_splitWithProgressFlow = filterWord;
        }

        public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
            onExtraCallback onextracallback = new onExtraCallback(this.$callback, this.$this_splitWithProgressFlow, access13800Var);
            onextracallback.L$0 = obj;
            return onextracallback;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull ok<? super IABLandingPageActivity> okVar, @Nullable access13800<? super Unit> access13800Var) {
            return create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                final ok okVar = (ok) this.L$0;
                this.$callback.element = new Function1<IABLandingPageActivity, Unit>() { // from class: o.TTRewardWebActivity.onExtraCallback.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public /* synthetic */ Object invoke(Object obj2) {
                        onWarmupCompleted((IABLandingPageActivity) obj2);
                        return Unit.INSTANCE;
                    }

                    public final void onWarmupCompleted(@NotNull IABLandingPageActivity iABLandingPageActivity) {
                        Intrinsics.checkNotNullParameter(iABLandingPageActivity, BuildConfig.FLAVOR);
                        okVar.IAuthTabCallback(iABLandingPageActivity);
                    }
                };
                this.$this_splitWithProgressFlow.onWarmupCompleted(new getPA() { // from class: no.nordicsemi.android.ble.ktx.ProgressIndicatonKt$splitWithProgressFlow$4$$ExternalSyntheticLambda0
                    public final void onRequestFinished(BluetoothDevice bluetoothDevice) {
                        TTRewardWebActivity.onExtraCallback.onExtraCallbackWithResult(okVar, bluetoothDevice);
                    }
                });
                final Ref.ObjectRef<Function1<IABLandingPageActivity, Unit>> objectRef = this.$callback;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: o.TTRewardWebActivity.onExtraCallback.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public /* synthetic */ Object invoke() {
                        onExtraCallbackWithResult();
                        return Unit.INSTANCE;
                    }

                    public final void onExtraCallbackWithResult() {
                        objectRef.element = null;
                    }
                };
                this.label = 1;
                if (jw.onWarmupCompleted(okVar, function0, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onExtraCallbackWithResult(ok okVar, BluetoothDevice bluetoothDevice) {
            lt.onWarmupCompleted.onExtraCallbackWithResult(okVar, (Throwable) null, 1, (Object) null);
        }
    }
}

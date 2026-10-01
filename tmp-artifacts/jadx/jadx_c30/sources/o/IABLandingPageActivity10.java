package o;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.sf.scuba.smartcards.BuildConfig;
import o.IABLandingPageActivity10;
import o.loss;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class IABLandingPageActivity10 {

    public static final class onNavigationEvent extends SuspendLambda implements Function2<ok<? super loss>, access13800<? super Unit>, Object> {
        final /* synthetic */ getOptions $this_asFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(getOptions getoptions, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$this_asFlow = getoptions;
        }

        public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$this_asFlow, access13800Var);
            onnavigationevent.L$0 = obj;
            return onnavigationevent;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull ok<? super loss> okVar, @Nullable access13800<? super Unit> access13800Var) {
            return create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                final ok okVar = (ok) this.L$0;
                this.$this_asFlow.IAuthTabCallback((Handler) null);
                this.$this_asFlow.onExtraCallbackWithResult(new TTAdConstantNETWORK_STATE() { // from class: no.nordicsemi.android.ble.ktx.ValueChangedCallbackExtKt$asFlow$1$$ExternalSyntheticLambda0
                    public final void onDataReceived(BluetoothDevice bluetoothDevice, loss lossVar) {
                        IABLandingPageActivity10.onNavigationEvent.onWarmupCompleted(okVar, bluetoothDevice, lossVar);
                    }
                });
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_asFlow);
                this.label = 1;
                if (jw.onWarmupCompleted(okVar, anonymousClass3, this) == objOnWarmupCompleted) {
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
        public static final void onWarmupCompleted(ok okVar, BluetoothDevice bluetoothDevice, loss lossVar) {
            Intrinsics.checkNotNullExpressionValue(lossVar, BuildConfig.FLAVOR);
            okVar.IAuthTabCallback(lossVar);
        }

        /* renamed from: o.IABLandingPageActivity10$onNavigationEvent$3, reason: invalid class name */
        public static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
            final /* synthetic */ getOptions $this_asFlow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(getOptions getoptions) {
                super(0);
                this.$this_asFlow = getoptions;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void onExtraCallbackWithResult(BluetoothDevice bluetoothDevice, loss lossVar) {
                Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
                Intrinsics.checkNotNullParameter(lossVar, BuildConfig.FLAVOR);
            }

            public /* synthetic */ Object invoke() {
                onExtraCallback();
                return Unit.INSTANCE;
            }

            public final void onExtraCallback() {
                this.$this_asFlow.onExtraCallbackWithResult(new TTAdConstantNETWORK_STATE() { // from class: no.nordicsemi.android.ble.ktx.ValueChangedCallbackExtKt$asFlow$1$2$$ExternalSyntheticLambda0
                    public final void onDataReceived(BluetoothDevice bluetoothDevice, loss lossVar) {
                        IABLandingPageActivity10.onNavigationEvent.AnonymousClass3.onExtraCallbackWithResult(bluetoothDevice, lossVar);
                    }
                });
            }
        }
    }
}

package o;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import im.toss.ble.gatt.client.TossGattClientBleManager$;
import im.toss.ble.gatt.client.TossGattClientBleManager$initialize$1$;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WorkerUpdaterExternalSyntheticLambda1 extends getReflectContext {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 0;
    private static int readTypedObject = 1;
    private static int writeTypedObject = 1;
    private final int IAuthTabCallbackStubProxy;
    private final WorkDatabaseCompanionExternalSyntheticLambda0 IAuthTabCallback_Parcel;
    private BluetoothGattCharacteristic ICustomTabsCallback;
    private final CoroutineExceptionHandler access000;
    private final findResAndMsg access100;
    private final String getInterfaceDescriptor;
    private final ProcessorExternalSyntheticLambda0 onTransact;

    static {
        int i = extraCallback + 97;
        readTypedObject = i % 128;
        if (i % 2 == 0) {
            int i2 = 21 / 0;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = i6 | i7 | i8;
        int i10 = ~(i2 | i7);
        int i11 = (~(i7 | i8)) | (~i6);
        int i12 = i6 + i5 + i4 + ((-1537480081) * i) + ((-1176924877) * i3);
        int i13 = i12 * i12;
        int i14 = (((-324914750) * i6) - 1179058176) + ((-1443770816) * i5) + (1588055615 * i9) + (i10 * (-1588055615)) + ((-1588055615) * i11) + (1263140864 * i4) + (1226178560 * i) + ((-1044512768) * i3) + (1201733632 * i13);
        int i15 = (i6 * 1018573086) + 1206756779 + (i5 * 1018572224) + (i9 * (-431)) + (i10 * 431) + (i11 * 431) + (i4 * 1018572655) + (i * (-758184159)) + (i3 * (-595421667)) + (i13 * (-1647378432));
        return i14 + ((i15 * i15) * 1518272512) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ void IAuthTabCallback(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 25;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onTransact(workerUpdaterExternalSyntheticLambda1);
        int i4 = extraCallbackWithResult + 65;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1 = (WorkerUpdaterExternalSyntheticLambda1) objArr[0];
        BluetoothDevice bluetoothDevice = (BluetoothDevice) objArr[1];
        loss lossVar = (loss) objArr[2];
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(workerUpdaterExternalSyntheticLambda1, bluetoothDevice, lossVar);
        int i4 = writeTypedObject + 117;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1 = (WorkerUpdaterExternalSyntheticLambda1) objArr[0];
        BluetoothDevice bluetoothDevice = (BluetoothDevice) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 69;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(workerUpdaterExternalSyntheticLambda1, bluetoothDevice);
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        int i5 = extraCallbackWithResult + 93;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 103;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 87;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerUpdaterExternalSyntheticLambda1(@NotNull Context context, @NotNull String str, int i, @NotNull ProcessorExternalSyntheticLambda0 processorExternalSyntheticLambda0, @NotNull findResAndMsg findresandmsg, @NotNull WorkDatabaseCompanionExternalSyntheticLambda0 workDatabaseCompanionExternalSyntheticLambda0) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(processorExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(workDatabaseCompanionExternalSyntheticLambda0, "");
        this.getInterfaceDescriptor = str;
        this.IAuthTabCallbackStubProxy = i;
        this.onTransact = processorExternalSyntheticLambda0;
        this.access100 = findresandmsg;
        this.IAuthTabCallback_Parcel = workDatabaseCompanionExternalSyntheticLambda0;
        this.access000 = new onExtraCallbackWithResult(CoroutineExceptionHandler.extraCallbackWithResult, this);
    }

    public static final /* synthetic */ void IAuthTabCallbackDefault(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        workerUpdaterExternalSyntheticLambda1.access100();
        int i4 = extraCallbackWithResult + 69;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ findResAndMsg asInterface(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 89;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        findResAndMsg findresandmsg = workerUpdaterExternalSyntheticLambda1.access100;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 95;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return findresandmsg;
        }
        throw null;
    }

    public static final /* synthetic */ WorkDatabaseCompanionExternalSyntheticLambda0 onExtraCallback(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 109;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        WorkDatabaseCompanionExternalSyntheticLambda0 workDatabaseCompanionExternalSyntheticLambda0 = workerUpdaterExternalSyntheticLambda1.IAuthTabCallback_Parcel;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 111;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return workDatabaseCompanionExternalSyntheticLambda0;
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 47;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        String str = workerUpdaterExternalSyntheticLambda1.getInterfaceDescriptor;
        int i5 = i2 + 51;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ onInterstitialClicked onExtraCallbackWithResult(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 101;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onInterstitialClicked oninterstitialclickedOnExtraCallbackWithResult = workerUpdaterExternalSyntheticLambda1.onExtraCallbackWithResult(i);
        int i5 = writeTypedObject + 87;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return oninterstitialclickedOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ int onNavigationEvent(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 95;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = workerUpdaterExternalSyntheticLambda1.IAuthTabCallbackStubProxy;
        int i6 = i3 + 91;
        extraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public static final /* synthetic */ ProcessorExternalSyntheticLambda0 onWarmupCompleted(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 51;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        ProcessorExternalSyntheticLambda0 processorExternalSyntheticLambda0 = workerUpdaterExternalSyntheticLambda1.onTransact;
        int i5 = i3 + 33;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return processorExternalSyntheticLambda0;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Throwable $exception;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Throwable th, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$exception = th;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = WorkerUpdaterExternalSyntheticLambda1.this.new onExtraCallback(this.$exception, access13800Var);
            int i2 = onNavigationEvent + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 49;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                WorkDatabaseCompanionExternalSyntheticLambda0 workDatabaseCompanionExternalSyntheticLambda0OnExtraCallback = WorkerUpdaterExternalSyntheticLambda1.onExtraCallback(WorkerUpdaterExternalSyntheticLambda1.this);
                String strOnExtraCallbackWithResult = WorkerUpdaterExternalSyntheticLambda1.onExtraCallbackWithResult(WorkerUpdaterExternalSyntheticLambda1.this);
                Throwable th = this.$exception;
                this.label = 1;
                if (workDatabaseCompanionExternalSyntheticLambda0OnExtraCallback.onWarmupCompleted(strOnExtraCallbackWithResult, th, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onWarmupCompleted + 43;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ void onExtraCallbackWithResult(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1, BluetoothDevice bluetoothDevice) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(workerUpdaterExternalSyntheticLambda1, bluetoothDevice);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = WorkerUpdaterExternalSyntheticLambda1.this.new onWarmupCompleted(access13800Var);
            int i2 = onWarmupCompleted + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 53;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 33;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            WorkerUpdaterExternalSyntheticLambda1.onExtraCallbackWithResult(WorkerUpdaterExternalSyntheticLambda1.this, 512).IAuthTabCallback(new TossGattClientBleManager$initialize$1$.ExternalSyntheticLambda0(WorkerUpdaterExternalSyntheticLambda1.this)).extraCallback();
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 37;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 84 / 0;
            }
            return unit;
        }

        private static final void IAuthTabCallback(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1, BluetoothDevice bluetoothDevice) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            WorkerUpdaterExternalSyntheticLambda1.IAuthTabCallbackDefault(workerUpdaterExternalSyntheticLambda1);
            int i4 = onWarmupCompleted + 55;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void onExtraCallback() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(this.access100, this.access000, (setRandomHost) null, new onWarmupCompleted(null), 2, (Object) null);
        int i2 = writeTypedObject + 119;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ WorkerUpdaterExternalSyntheticLambda1 onWarmupCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1) {
            super(onwarmupcompleted);
            this.onWarmupCompleted = workerUpdaterExternalSyntheticLambda1;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            maybeUpdateAnimatable.onNavigationEvent(WorkerUpdaterExternalSyntheticLambda1.asInterface(this.onWarmupCompleted), (CoroutineContext) null, (setRandomHost) null, this.onWarmupCompleted.new onExtraCallback(th, null), 3, (Object) null);
            int i2 = IAuthTabCallback + 103;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    private static final void onExtraCallbackWithResult(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1, BluetoothDevice bluetoothDevice, loss lossVar) {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        int i2 = writeTypedObject + 125;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bluetoothDevice, "");
            Intrinsics.checkNotNullParameter(lossVar, "");
            lossVar.onNavigationEvent();
            throw null;
        }
        Intrinsics.checkNotNullParameter(bluetoothDevice, "");
        Intrinsics.checkNotNullParameter(lossVar, "");
        byte[] bArrOnNavigationEvent = lossVar.onNavigationEvent();
        if (bArrOnNavigationEvent != null) {
            List listSplit$default = StringsKt.split$default(new String(bArrOnNavigationEvent, Charsets.UTF_8), new String[]{"/"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() < 2) {
                pairIAuthTabCallback = getWrite.IAuthTabCallback("", "");
            } else {
                pairIAuthTabCallback = getWrite.IAuthTabCallback(listSplit$default.get(0), listSplit$default.get(1));
                int i3 = extraCallbackWithResult + 11;
                writeTypedObject = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 5 % 3;
                }
            }
            if (pairIAuthTabCallback != null) {
                maybeUpdateAnimatable.onNavigationEvent(workerUpdaterExternalSyntheticLambda1.access100, (CoroutineContext) null, (setRandomHost) null, workerUpdaterExternalSyntheticLambda1.new onNavigationEvent(pairIAuthTabCallback, null), 3, (Object) null);
            }
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Pair<String, String> $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Pair<String, String> pair, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$it = pair;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = WorkerUpdaterExternalSyntheticLambda1.this.new onNavigationEvent(this.$it, access13800Var);
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallback + 97;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                WorkDatabaseCompanionExternalSyntheticLambda0 workDatabaseCompanionExternalSyntheticLambda0OnExtraCallback = WorkerUpdaterExternalSyntheticLambda1.onExtraCallback(WorkerUpdaterExternalSyntheticLambda1.this);
                String strOnExtraCallbackWithResult = WorkerUpdaterExternalSyntheticLambda1.onExtraCallbackWithResult(WorkerUpdaterExternalSyntheticLambda1.this);
                WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2 = new WorkerUpdaterExternalSyntheticLambda2(RescheduleMigration.BACKGROUND, WorkerUpdaterExternalSyntheticLambda1.onNavigationEvent(WorkerUpdaterExternalSyntheticLambda1.this), (String) this.$it.getFirst(), ProcessorExternalSyntheticLambda0.Companion.onExtraCallback(WorkerUpdaterExternalSyntheticLambda1.onWarmupCompleted(WorkerUpdaterExternalSyntheticLambda1.this)), (String) this.$it.getSecond(), false, false, 96, null);
                this.label = 1;
                if (workDatabaseCompanionExternalSyntheticLambda0OnExtraCallback.onExtraCallbackWithResult(strOnExtraCallbackWithResult, workerUpdaterExternalSyntheticLambda2, this) == objOnWarmupCompleted) {
                    int i7 = onExtraCallback + 11;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 15 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i9 = onNavigationEvent + 119;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return unit;
        }
    }

    private static final void onWarmupCompleted(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1, BluetoothDevice bluetoothDevice) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bluetoothDevice, "");
        workerUpdaterExternalSyntheticLambda1.onWarmupCompleted();
        int i4 = extraCallbackWithResult + 25;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onTransact(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 45;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        workerUpdaterExternalSyntheticLambda1.onWarmupCompleted();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void access100() {
        int i = 2 % 2;
        onExtraCallback(this.ICustomTabsCallback).IAuthTabCallback(new TossGattClientBleManager$.ExternalSyntheticLambda0(this)).onWarmupCompleted(new TossGattClientBleManager$.ExternalSyntheticLambda1(this)).onExtraCallback(new TossGattClientBleManager$.ExternalSyntheticLambda2(this)).extraCallback();
        int i2 = extraCallbackWithResult + 113;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    public boolean onExtraCallback(@NotNull BluetoothGatt bluetoothGatt) throws Throwable {
        BluetoothGattCharacteristic characteristic;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bluetoothGatt, "");
        try {
            BluetoothGattService service = bluetoothGatt.getService(UUID.fromString(OverwritingInputMerger.onExtraCallbackWithResult.IAuthTabCallbackDefault()));
            if (service != null) {
                int i2 = extraCallbackWithResult + 35;
                writeTypedObject = i2 % 128;
                int i3 = i2 % 2;
                characteristic = service.getCharacteristic(UUID.fromString("b16459de-8dba-43f7-bc41-5aea087785f0"));
            } else {
                int i4 = writeTypedObject + 59;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                characteristic = null;
            }
            this.ICustomTabsCallback = characteristic;
            if (((characteristic != null ? characteristic.getProperties() : 0) & 2) == 0) {
                return false;
            }
            int i6 = writeTypedObject + 37;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return true;
        } catch (IllegalArgumentException e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "matcher-validation", "Invalid serviceUUID : " + OverwritingInputMerger.onExtraCallbackWithResult.IAuthTabCallbackDefault(), e, (Map) null, 8, (Object) null);
            return false;
        }
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsCallback = null;
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public static /* synthetic */ void onNavigationEvent(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1, BluetoothDevice bluetoothDevice) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{workerUpdaterExternalSyntheticLambda1, bluetoothDevice}, -1014123571, 1014123571);
    }

    public static /* synthetic */ void onWarmupCompleted(WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1, BluetoothDevice bluetoothDevice, loss lossVar) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{workerUpdaterExternalSyntheticLambda1, bluetoothDevice, lossVar}, -669991741, 669991742);
    }
}

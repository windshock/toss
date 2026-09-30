package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.RunnableScheduler;
import o.RxWorkerSingleFutureAdapter;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RunnableScheduler {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 1;
    private static int getInterfaceDescriptor = 1;
    private final Lazy IAuthTabCallback;
    private final CoroutineExceptionHandler IAuthTabCallbackStub;
    private final Lazy asBinder;
    private final ConcurrentHashMap<String, WorkerUpdaterExternalSyntheticLambda0> asInterface;
    private volatile setCompletableProgress onExtraCallback;
    private final ConcurrentHashMap<String, Long> onExtraCallbackWithResult;
    private final BluetoothAdapter onNavigationEvent;
    private final Context onTransact;
    private volatile WorkDatabase_Impl onWarmupCompleted;

    static {
        int i = IAuthTabCallbackStubProxy + 73;
        access100 = i % 128;
        if (i % 2 == 0) {
            int i2 = 81 / 0;
        }
    }

    public static /* synthetic */ RxWorkerSingleFutureAdapter IAuthTabCallback(RunnableScheduler runnableScheduler) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(runnableScheduler);
        }
        asBinder(runnableScheduler);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextFieldPressGestureFilterKtExternalSyntheticLambda0 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface();
        }
        asInterface();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = i7 | i3;
        int i9 = ~(i8 | i6);
        int i10 = (~i6) | (~((~i3) | i4));
        int i11 = (~(i6 | i3)) | (~(i7 | i6)) | (~i8);
        int i12 = i4 + i3 + i + ((-953487067) * i2) + ((-1992133889) * i5);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i4) + 1765277696 + (1051104396 * i3) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i) + ((-1703411712) * i2) + (1961361408 * i5) + (907935744 * i13);
        int i15 = ((i4 * 272661978) - 2115615402) + (i3 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i * 272662391) + (i2 * 2077717299) + (i5 * 1957688713) + (i13 * 166854656);
        int i16 = i14 + (i15 * i15 * (-213778432));
        return i16 != 1 ? i16 != 2 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public RunnableScheduler(@NotNull Context context, @Nullable BluetoothAdapter bluetoothAdapter) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onTransact = context;
        this.onNavigationEvent = bluetoothAdapter;
        this.onExtraCallback = setCompletableProgress.FOREGROUND;
        this.asInterface = new ConcurrentHashMap<>();
        this.onExtraCallbackWithResult = new ConcurrentHashMap<>();
        this.IAuthTabCallbackStub = new IAuthTabCallback(CoroutineExceptionHandler.extraCallbackWithResult);
        this.asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ble.advertiser.TossBackgroundBleAdvertiser$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 7;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    textFieldPressGestureFilterKtExternalSyntheticLambda0OnExtraCallbackWithResult = RunnableScheduler.onExtraCallbackWithResult();
                    int i3 = 95 / 0;
                } else {
                    textFieldPressGestureFilterKtExternalSyntheticLambda0OnExtraCallbackWithResult = RunnableScheduler.onExtraCallbackWithResult();
                }
                int i4 = onExtraCallbackWithResult + 117;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return textFieldPressGestureFilterKtExternalSyntheticLambda0OnExtraCallbackWithResult;
                }
                throw null;
            }
        });
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ble.advertiser.TossBackgroundBleAdvertiser$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 101;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    RunnableScheduler.IAuthTabCallback(this.f$0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                RxWorkerSingleFutureAdapter rxWorkerSingleFutureAdapterIAuthTabCallback = RunnableScheduler.IAuthTabCallback(this.f$0);
                int i3 = onNavigationEvent + 119;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 11 / 0;
                }
                return rxWorkerSingleFutureAdapterIAuthTabCallback;
            }
        });
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RunnableScheduler runnableScheduler = (RunnableScheduler) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        Context context = runnableScheduler.onTransact;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 3;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(RunnableScheduler runnableScheduler) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -195261830, 195261830, new Object[]{runnableScheduler}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback);
        int i4 = getInterfaceDescriptor + 67;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ WorkDatabase_Impl onExtraCallback(RunnableScheduler runnableScheduler) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        WorkDatabase_Impl workDatabase_Impl = runnableScheduler.onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return workDatabase_Impl;
    }

    public static final /* synthetic */ ConcurrentHashMap onExtraCallbackWithResult(RunnableScheduler runnableScheduler) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        ConcurrentHashMap<String, WorkerUpdaterExternalSyntheticLambda0> concurrentHashMap = runnableScheduler.asInterface;
        int i5 = i3 + 85;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return concurrentHashMap;
        }
        throw null;
    }

    public static final /* synthetic */ RxWorkerSingleFutureAdapter onNavigationEvent(RunnableScheduler runnableScheduler) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        RxWorkerSingleFutureAdapter rxWorkerSingleFutureAdapterIAuthTabCallback = runnableScheduler.IAuthTabCallback();
        int i4 = getInterfaceDescriptor + 105;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return rxWorkerSingleFutureAdapterIAuthTabCallback;
    }

    public static final /* synthetic */ ConcurrentHashMap onWarmupCompleted(RunnableScheduler runnableScheduler) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        ConcurrentHashMap<String, Long> concurrentHashMap = runnableScheduler.onExtraCallbackWithResult;
        int i5 = i3 + 65;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return concurrentHashMap;
    }

    public final setCompletableProgress onNavigationEvent() {
        setCompletableProgress setcompletableprogress;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            setcompletableprogress = this.onExtraCallback;
            int i3 = 72 / 0;
        } else {
            setcompletableprogress = this.onExtraCallback;
        }
        int i4 = getInterfaceDescriptor + 81;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return setcompletableprogress;
    }

    public final void onWarmupCompleted(@NotNull setCompletableProgress setcompletableprogress) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setcompletableprogress, "");
        this.onExtraCallback = setcompletableprogress;
        int i4 = getInterfaceDescriptor + 65;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final findResAndMsg onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        findResAndMsg findresandmsg = (findResAndMsg) this.asBinder.getValue();
        int i3 = IAuthTabCallbackDefault + 11;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return findresandmsg;
    }

    private static final TextFieldPressGestureFilterKtExternalSyntheticLambda0 asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult());
        int i4 = IAuthTabCallbackDefault + 29;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        }
        throw null;
    }

    private final RxWorkerSingleFutureAdapter IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        RxWorkerSingleFutureAdapter rxWorkerSingleFutureAdapter = (RxWorkerSingleFutureAdapter) this.IAuthTabCallback.getValue();
        if (i3 == 0) {
            return rxWorkerSingleFutureAdapter;
        }
        throw null;
    }

    private static final RxWorkerSingleFutureAdapter asBinder(RunnableScheduler runnableScheduler) {
        int i = 2 % 2;
        RxWorkerSingleFutureAdapter rxWorkerSingleFutureAdapter = new RxWorkerSingleFutureAdapter(runnableScheduler.onNavigationEvent, Worker.BACKGROUND);
        int i2 = IAuthTabCallbackDefault + 81;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return rxWorkerSingleFutureAdapter;
    }

    public static final class IAuthTabCallback extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }

        public IAuthTabCallback(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ boolean $pushDisabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(boolean z, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$pushDisabled = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = RunnableScheduler.this.new onExtraCallback(this.$pushDisabled, access13800Var);
            int i2 = IAuthTabCallback + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 27;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Unit unit;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i3 != 0) {
                RunnableScheduler.onNavigationEvent(RunnableScheduler.this).onExtraCallbackWithResult(this.$pushDisabled);
                unit = Unit.INSTANCE;
                int i4 = 5 / 0;
            } else {
                RunnableScheduler.onNavigationEvent(RunnableScheduler.this).onExtraCallbackWithResult(this.$pushDisabled);
                unit = Unit.INSTANCE;
            }
            int i5 = onNavigationEvent + 59;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    public static final class onWarmupCompleted implements IABLandingPageActivity2 {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private int IAuthTabCallback;

        onWarmupCompleted() {
        }

        public void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            RunnableScheduler.onWarmupCompleted(RunnableScheduler.this).clear();
            int i4 = onExtraCallback + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x008f A[PHI: r5
          0x008f: PHI (r5v11 int) = (r5v10 int), (r5v15 int) binds: [B:14:0x008d, B:11:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onWarmupCompleted(BluetoothDevice bluetoothDevice) throws Throwable {
            String str;
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 101;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(bluetoothDevice, "");
            String address = bluetoothDevice.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "");
            if (IAuthTabCallback(address) || RunnableScheduler.onExtraCallbackWithResult(RunnableScheduler.this).containsKey(bluetoothDevice.getAddress())) {
                return;
            }
            WorkerUpdaterExternalSyntheticLambda0 workerUpdaterExternalSyntheticLambda0 = new WorkerUpdaterExternalSyntheticLambda0((Context) RunnableScheduler.onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 687973019, -687973017, new Object[]{RunnableScheduler.this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), OverwritingInputMerger.onExtraCallbackWithResult.access000(), RunnableScheduler.this.onNavigationEvent(), bluetoothDevice);
            WorkDatabase_Impl workDatabase_ImplOnExtraCallback = RunnableScheduler.onExtraCallback(RunnableScheduler.this);
            if (workDatabase_ImplOnExtraCallback != null) {
                int i5 = onExtraCallback + 93;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    i = this.IAuthTabCallback;
                    this.IAuthTabCallback = i;
                    if (i % 114 == 110) {
                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                        String string = bluetoothDevice.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "TossBleServer", "connected Count: " + i + ", nowDevice: " + RxWorker.onExtraCallbackWithResult(string), (Map) null, (String) null, false, (String) null, 60, (Object) null);
                    }
                    workerUpdaterExternalSyntheticLambda0.onNavigationEvent(workDatabase_ImplOnExtraCallback);
                    int i6 = onNavigationEvent + 75;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    i = this.IAuthTabCallback + 1;
                    this.IAuthTabCallback = i;
                    if (i % 50 == 49) {
                    }
                    workerUpdaterExternalSyntheticLambda0.onNavigationEvent(workDatabase_ImplOnExtraCallback);
                    int i62 = onNavigationEvent + 75;
                    onExtraCallback = i62 % 128;
                    int i72 = i62 % 2;
                }
            }
            if (RunnableScheduler.onExtraCallbackWithResult(RunnableScheduler.this).size() >= 16) {
                Set setEntrySet = RunnableScheduler.onExtraCallbackWithResult(RunnableScheduler.this).entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
                Map.Entry entry = (Map.Entry) CollectionsKt.firstOrNull(setEntrySet);
                if (entry != null) {
                    int i8 = onExtraCallback + 13;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        str = (String) entry.getKey();
                        int i9 = 95 / 0;
                    } else {
                        str = (String) entry.getKey();
                    }
                } else {
                    str = null;
                }
                WorkerUpdaterExternalSyntheticLambda0 workerUpdaterExternalSyntheticLambda02 = (WorkerUpdaterExternalSyntheticLambda0) TypeIntrinsics.asMutableMap(RunnableScheduler.onExtraCallbackWithResult(RunnableScheduler.this)).remove(str);
                if (workerUpdaterExternalSyntheticLambda02 != null) {
                    workerUpdaterExternalSyntheticLambda02.onTransact();
                    workerUpdaterExternalSyntheticLambda02.onWarmupCompleted();
                }
            }
            RunnableScheduler.onWarmupCompleted(RunnableScheduler.this).put(bluetoothDevice.getAddress(), Long.valueOf(System.currentTimeMillis()));
            RunnableScheduler.onExtraCallbackWithResult(RunnableScheduler.this).put(bluetoothDevice.getAddress(), workerUpdaterExternalSyntheticLambda0);
        }

        public void onNavigationEvent(BluetoothDevice bluetoothDevice) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(bluetoothDevice, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(bluetoothDevice, "");
            WorkerUpdaterExternalSyntheticLambda0 workerUpdaterExternalSyntheticLambda0 = (WorkerUpdaterExternalSyntheticLambda0) RunnableScheduler.onExtraCallbackWithResult(RunnableScheduler.this).remove(bluetoothDevice.getAddress());
            if (workerUpdaterExternalSyntheticLambda0 != null) {
                int i3 = onExtraCallback + 23;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    workerUpdaterExternalSyntheticLambda0.onTransact();
                    workerUpdaterExternalSyntheticLambda0.onWarmupCompleted();
                } else {
                    workerUpdaterExternalSyntheticLambda0.onTransact();
                    workerUpdaterExternalSyntheticLambda0.onWarmupCompleted();
                    int i4 = 94 / 0;
                }
            }
        }

        private final boolean IAuthTabCallback(String str) {
            long jLongValue;
            int i = 2 % 2;
            boolean z = false;
            if (!RunnableScheduler.onWarmupCompleted(RunnableScheduler.this).contains(str)) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = (Long) RunnableScheduler.onWarmupCompleted(RunnableScheduler.this).get(str);
            Object obj = null;
            if (l != null) {
                int i2 = onExtraCallback + 33;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    jLongValue = l.longValue();
                } else {
                    l.longValue();
                    throw null;
                }
            } else {
                jLongValue = 0;
            }
            if (jCurrentTimeMillis - jLongValue <= 1800000) {
                int i3 = onNavigationEvent + 47;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            }
            if (!z) {
                int i5 = onNavigationEvent + 121;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                RunnableScheduler.onWarmupCompleted(RunnableScheduler.this).remove(str);
                if (i6 != 0) {
                    obj.hashCode();
                    throw null;
                }
            }
            return z;
        }
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(onWarmupCompleted(), putChannelInfo.IAuthTabCallback().plus(this.IAuthTabCallbackStub), (setRandomHost) null, new onExtraCallback(z, null), 2, (Object) null);
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -195261830, 195261830, new Object[]{this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback);
        this.onWarmupCompleted = new WorkDatabase_Impl(this.onTransact, OverwritingInputMerger.onExtraCallbackWithResult.access000(), this.onExtraCallback);
        WorkDatabase_Impl workDatabase_Impl = this.onWarmupCompleted;
        if (workDatabase_Impl != null) {
            workDatabase_Impl.onExtraCallbackWithResult(new onWarmupCompleted());
        }
        WorkDatabase_Impl workDatabase_Impl2 = this.onWarmupCompleted;
        if (workDatabase_Impl2 != null) {
            int i2 = IAuthTabCallbackDefault + 61;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            workDatabase_Impl2.onExtraCallback();
            int i4 = IAuthTabCallbackDefault + 71;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = RunnableScheduler.this.new onExtraCallbackWithResult(access13800Var);
            int i2 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            RunnableScheduler.onNavigationEvent(RunnableScheduler.this).IAuthTabCallback();
            RunnableScheduler.IAuthTabCallbackStub(RunnableScheduler.this);
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(onWarmupCompleted(), this.IAuthTabCallbackStub, (setRandomHost) null, new onExtraCallbackWithResult(null), 2, (Object) null);
        int i2 = IAuthTabCallbackDefault + 65;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Object obj;
        RunnableScheduler runnableScheduler = (RunnableScheduler) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        getInterfaceDescriptor = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            WorkDatabase_Impl workDatabase_Impl = runnableScheduler.onWarmupCompleted;
            obj2.hashCode();
            throw null;
        }
        WorkDatabase_Impl workDatabase_Impl2 = runnableScheduler.onWarmupCompleted;
        if (workDatabase_Impl2 == null) {
            return null;
        }
        workDatabase_Impl2.onExtraCallbackWithResult((IABLandingPageActivity2) null);
        Collection<WorkerUpdaterExternalSyntheticLambda0> collectionValues = runnableScheduler.asInterface.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        Iterator<T> it = collectionValues.iterator();
        while (!(!it.hasNext())) {
            int i3 = IAuthTabCallbackDefault + 71;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            WorkerUpdaterExternalSyntheticLambda0 workerUpdaterExternalSyntheticLambda0 = (WorkerUpdaterExternalSyntheticLambda0) it.next();
            try {
                Result.Companion companion = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(workerUpdaterExternalSyntheticLambda0.onTransact());
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            try {
                Result.Companion companion3 = kotlin.Result.Companion;
                workerUpdaterExternalSyntheticLambda0.onWarmupCompleted();
                kotlin.Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion4 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(th2));
            }
        }
        runnableScheduler.asInterface.clear();
        runnableScheduler.onExtraCallbackWithResult.clear();
        try {
            Result.Companion companion5 = kotlin.Result.Companion;
            workDatabase_Impl2.onExtraCallbackWithResult();
            obj = kotlin.Result.constructor-impl(Unit.INSTANCE);
            int i5 = IAuthTabCallbackDefault + 83;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th3) {
            Result.Companion companion6 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th3));
        }
        Throwable th4 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th4 != null) {
            auth.IAuthTabCallback(auth.onNavigationEvent, th4, null, 2, null);
            int i7 = IAuthTabCallbackDefault + 29;
            getInterfaceDescriptor = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 / 3;
            }
        }
        runnableScheduler.onWarmupCompleted = null;
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RunnableScheduler runnableScheduler = (RunnableScheduler) objArr[0];
        setCompletableProgress setcompletableprogress = (setCompletableProgress) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setcompletableprogress, "");
            runnableScheduler.onExtraCallback();
            runnableScheduler.onExtraCallback = setcompletableprogress;
            int i3 = 53 / 0;
            if (!zBooleanValue2) {
                return null;
            }
        } else {
            Intrinsics.checkNotNullParameter(setcompletableprogress, "");
            runnableScheduler.onExtraCallback();
            runnableScheduler.onExtraCallback = setcompletableprogress;
            if (!zBooleanValue2) {
                return null;
            }
        }
        int i4 = IAuthTabCallbackDefault + 33;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        if (setcompletableprogress != setCompletableProgress.BACKGROUND) {
            return null;
        }
        runnableScheduler.onExtraCallback(zBooleanValue);
        int i6 = IAuthTabCallbackDefault + 65;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        int i7 = 2 % 3;
        return null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static final /* synthetic */ Context asInterface(RunnableScheduler runnableScheduler) {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Context) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 687973019, -687973017, new Object[]{runnableScheduler}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback);
    }

    private final void IAuthTabCallbackStub() {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -195261830, 195261830, new Object[]{this}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback);
    }

    public final void IAuthTabCallback(@NotNull setCompletableProgress setcompletableprogress, boolean z, boolean z2) {
        onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1033343586, 1033343587, new Object[]{this, setcompletableprogress, Boolean.valueOf(z), Boolean.valueOf(z2)}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }
}

package o;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.ParcelUuid;
import com.google.android.gms.internal.ads.zzaq;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.usshome.UssHomeItemAdapter$;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DelayMetCommandHandlerExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DelayMetCommandHandlerExternalSyntheticLambda0 extends onScrollChange {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int ICustomTabsCallback = 1;
    private static int access100 = 0;
    private static int extraCallback = 1;
    private static int readTypedObject;
    private final DelayMetCommandHandlerExternalSyntheticLambda1 IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private final getBorderRadius<Unit> IAuthTabCallbackStub;
    private final findResAndMsg IAuthTabCallbackStubProxy;
    private final getBorderRadius<WorkerUpdaterExternalSyntheticLambda2> IAuthTabCallback_Parcel;
    private final getBorderRadius<Throwable> access000;
    private int asBinder;
    private int asInterface;
    private WorkDatabase getInterfaceDescriptor;
    private final Map<String, Long> onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final ConstraintTrackerExternalSyntheticLambda0 onTransact;
    private final ConcurrentHashMap<String, WorkerUpdaterExternalSyntheticLambda1> onWarmupCompleted;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ IAuthTabCallback this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(IAuthTabCallback iAuthTabCallback, access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
            this.this$0 = iAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            IAuthTabCallback iAuthTabCallback = this.this$0;
            if (i3 == 0) {
                return iAuthTabCallback.onWarmupCompleted((String) null, (Throwable) null, this);
            }
            iAuthTabCallback.onWarmupCompleted((String) null, (Throwable) null, this);
            obj2.hashCode();
            throw null;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = DelayMetCommandHandlerExternalSyntheticLambda0.onWarmupCompleted(DelayMetCommandHandlerExternalSyntheticLambda0.this, 0, null, null, this);
            int i4 = onExtraCallback + 17;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = DelayMetCommandHandlerExternalSyntheticLambda0.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{DelayMetCommandHandlerExternalSyntheticLambda0.this, 0, null, null, this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1495373106, -1495373104);
            int i4 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    /* renamed from: o.DelayMetCommandHandlerExternalSyntheticLambda0$onWarmupCompleted, reason: case insensitive filesystem */
    public static final /* synthetic */ class C0058onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[WorkDatabase.values().length];
            try {
                iArr[WorkDatabase.DUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkDatabase.PLACE.ordinal()] = 2;
                int i = IAuthTabCallback + 45;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkDatabase.FOREGROUND_ONLY.ordinal()] = 3;
                int i4 = onWarmupCompleted + 95;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkDatabase.BACKGROUND_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallback = iArr;
        }
    }

    static {
        int i = readTypedObject + 39;
        ICustomTabsCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = (~((~i2) | i5)) | i6;
        int i8 = ~i6;
        int i9 = (~(i8 | i5)) | (~(i8 | i2)) | (~(i5 | i2));
        int i10 = (~(i2 | (~i5))) | i8;
        int i11 = i6 + i5 + i + ((-2137991558) * i3) + (111092868 * i4);
        int i12 = i11 * i11;
        int i13 = (((-431794203) * i6) - 566755328) + (427185167 * i5) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i) + ((-1247805440) * i3) + ((-1807745024) * i4) + ((-591921152) * i12);
        int i14 = (i6 * (-1469267343)) + 1003592187 + (i5 * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + (i * (-1469268067)) + (i3 * 1951436498) + (i4 * (-746069772)) + (i12 * (-1529348096));
        int i15 = i13 + (i14 * i14 * 1762131968);
        if (i15 != 1) {
            if (i15 == 2) {
                return IAuthTabCallback(objArr);
            }
            if (i15 == 3) {
                return onExtraCallbackWithResult(objArr);
            }
            DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0 = (DelayMetCommandHandlerExternalSyntheticLambda0) objArr[0];
            BluetoothDevice bluetoothDevice = (BluetoothDevice) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int i16 = 2 % 2;
            int i17 = access100 + 75;
            extraCallback = i17 % 128;
            int i18 = i17 % 2;
            onExtraCallback(delayMetCommandHandlerExternalSyntheticLambda0, bluetoothDevice, iIntValue);
            int i19 = access100 + 57;
            extraCallback = i19 % 128;
            int i20 = i19 % 2;
            return null;
        }
        DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda02 = (DelayMetCommandHandlerExternalSyntheticLambda0) objArr[0];
        String str = (String) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        TTAppOpenAdActivity3 tTAppOpenAdActivity3 = (TTAppOpenAdActivity3) objArr[3];
        BluetoothDevice bluetoothDevice2 = (BluetoothDevice) objArr[4];
        int i21 = 2 % 2;
        if (!delayMetCommandHandlerExternalSyntheticLambda02.onWarmupCompleted(iIntValue2, bluetoothDevice2)) {
            return null;
        }
        int i22 = access100 + 3;
        extraCallback = i22 % 128;
        int i23 = i22 % 2;
        createWork creatework = createWork.onWarmupCompleted;
        boolean zIAuthTabCallback = creatework.IAuthTabCallback(tTAppOpenAdActivity3);
        ProcessorExternalSyntheticLambda1 processorExternalSyntheticLambda1OnNavigationEvent = creatework.onNavigationEvent(tTAppOpenAdActivity3);
        if (C0058onWarmupCompleted.onExtraCallback[delayMetCommandHandlerExternalSyntheticLambda02.getInterfaceDescriptor.ordinal()] != 2) {
            if (!zIAuthTabCallback) {
                return null;
            }
            delayMetCommandHandlerExternalSyntheticLambda02.onWarmupCompleted(str, iIntValue2, bluetoothDevice2, processorExternalSyntheticLambda1OnNavigationEvent);
            return null;
        }
        if (!zIAuthTabCallback) {
            int i24 = access100 + 7;
            extraCallback = i24 % 128;
            int i25 = i24 % 2;
            if (processorExternalSyntheticLambda1OnNavigationEvent != ProcessorExternalSyntheticLambda1.iOS) {
                return null;
            }
        }
        delayMetCommandHandlerExternalSyntheticLambda02.onWarmupCompleted(str, iIntValue2, bluetoothDevice2, processorExternalSyntheticLambda1OnNavigationEvent);
        return null;
    }

    public DelayMetCommandHandlerExternalSyntheticLambda0(@NotNull Context context, @NotNull findResAndMsg findresandmsg, @NotNull getBorderRadius<WorkerUpdaterExternalSyntheticLambda2> getborderradius, @NotNull getBorderRadius<Throwable> getborderradius2, @NotNull getBorderRadius<Unit> getborderradius3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(getborderradius, "");
        Intrinsics.checkNotNullParameter(getborderradius2, "");
        Intrinsics.checkNotNullParameter(getborderradius3, "");
        this.onExtraCallbackWithResult = context;
        this.IAuthTabCallbackStubProxy = findresandmsg;
        this.IAuthTabCallback_Parcel = getborderradius;
        this.access000 = getborderradius2;
        this.IAuthTabCallbackStub = getborderradius3;
        this.onTransact = new ConstraintTrackerExternalSyntheticLambda0();
        this.onExtraCallback = Collections.synchronizedMap(new LinkedHashMap());
        this.getInterfaceDescriptor = WorkDatabase.DUAL;
        this.IAuthTabCallbackDefault = 240000L;
        this.asBinder = 20;
        this.onWarmupCompleted = new ConcurrentHashMap<>();
        this.IAuthTabCallback = new DelayMetCommandHandlerExternalSyntheticLambda1();
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0 = (DelayMetCommandHandlerExternalSyntheticLambda0) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        String str = (String) objArr[2];
        TTAppOpenAdActivity3 tTAppOpenAdActivity3 = (TTAppOpenAdActivity3) objArr[3];
        access13800<? super Unit> access13800Var = (access13800) objArr[4];
        int i = 2 % 2;
        int i2 = access100 + 51;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = delayMetCommandHandlerExternalSyntheticLambda0.IAuthTabCallback(iIntValue, str, tTAppOpenAdActivity3, access13800Var);
        int i4 = extraCallback + 53;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return objIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ConcurrentHashMap onExtraCallback(DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 113;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        ConcurrentHashMap<String, WorkerUpdaterExternalSyntheticLambda1> concurrentHashMap = delayMetCommandHandlerExternalSyntheticLambda0.onWarmupCompleted;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 117;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return concurrentHashMap;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0 = (DelayMetCommandHandlerExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 7;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        getBorderRadius<WorkerUpdaterExternalSyntheticLambda2> getborderradius = delayMetCommandHandlerExternalSyntheticLambda0.IAuthTabCallback_Parcel;
        int i5 = i2 + 107;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return getborderradius;
    }

    public static final /* synthetic */ getBorderRadius onExtraCallbackWithResult(DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = access100 + 101;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<Unit> getborderradius = delayMetCommandHandlerExternalSyntheticLambda0.IAuthTabCallbackStub;
        if (i3 != 0) {
            return getborderradius;
        }
        throw null;
    }

    public static final /* synthetic */ getBorderRadius onNavigationEvent(DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = access100 + 37;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        getBorderRadius<Throwable> getborderradius = delayMetCommandHandlerExternalSyntheticLambda0.access000;
        int i5 = i3 + 11;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return getborderradius;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0, int i, BluetoothDevice bluetoothDevice, TTAppOpenAdActivity3 tTAppOpenAdActivity3, access13800 access13800Var) throws Throwable {
        int i2 = 2 % 2;
        int i3 = extraCallback + 75;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Object objOnNavigationEvent = delayMetCommandHandlerExternalSyntheticLambda0.onNavigationEvent(i, bluetoothDevice, tTAppOpenAdActivity3, (access13800<? super Unit>) access13800Var);
        if (i4 != 0) {
            int i5 = 22 / 0;
        }
        int i6 = extraCallback + 71;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ DelayMetCommandHandlerExternalSyntheticLambda1 onWarmupCompleted(DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = extraCallback + 25;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        DelayMetCommandHandlerExternalSyntheticLambda1 delayMetCommandHandlerExternalSyntheticLambda1 = delayMetCommandHandlerExternalSyntheticLambda0.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return delayMetCommandHandlerExternalSyntheticLambda1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[PHI: r0
      0x0031: PHI (r0v6 int) = (r0v5 int), (r0v11 int) binds: [B:8:0x002f, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWarmupCompleted(int i, @NotNull TTAppOpenAdActivity2 tTAppOpenAdActivity2) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        int i4 = access100 + 9;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tTAppOpenAdActivity2, "");
            i2 = this.asInterface >> 1;
            this.asInterface = i2;
            if ((i2 >>> 24607) == 31388) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                String string = tTAppOpenAdActivity2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "TossBleScanCallback", "scanCount: " + i2 + " scanResult: " + RxWorker.onExtraCallbackWithResult(string), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            }
        } else {
            Intrinsics.checkNotNullParameter(tTAppOpenAdActivity2, "");
            i2 = this.asInterface + 1;
            this.asInterface = i2;
            if (i2 % 500 == 499) {
            }
        }
        TTAppOpenAdActivity3 tTAppOpenAdActivity3OnExtraCallback = tTAppOpenAdActivity2.onExtraCallback();
        if (tTAppOpenAdActivity3OnExtraCallback == null) {
            int i5 = extraCallback + 41;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 50 / 0;
                return;
            }
            return;
        }
        Object obj = null;
        if (tTAppOpenAdActivity2.onExtraCallbackWithResult() >= ((Integer) OverwritingInputMerger.onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1807848670, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{OverwritingInputMerger.onExtraCallbackWithResult}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1807848668)).intValue()) {
            int i7 = access100 + 67;
            extraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                WorkDatabase workDatabase = this.getInterfaceDescriptor;
                int iOnExtraCallbackWithResult = tTAppOpenAdActivity2.onExtraCallbackWithResult();
                BluetoothDevice bluetoothDeviceIAuthTabCallback = tTAppOpenAdActivity2.IAuthTabCallback();
                Intrinsics.checkNotNullExpressionValue(bluetoothDeviceIAuthTabCallback, "");
                onWarmupCompleted(workDatabase, iOnExtraCallbackWithResult, tTAppOpenAdActivity3OnExtraCallback, bluetoothDeviceIAuthTabCallback);
                obj.hashCode();
                throw null;
            }
            WorkDatabase workDatabase2 = this.getInterfaceDescriptor;
            int iOnExtraCallbackWithResult2 = tTAppOpenAdActivity2.onExtraCallbackWithResult();
            BluetoothDevice bluetoothDeviceIAuthTabCallback2 = tTAppOpenAdActivity2.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(bluetoothDeviceIAuthTabCallback2, "");
            onWarmupCompleted(workDatabase2, iOnExtraCallbackWithResult2, tTAppOpenAdActivity3OnExtraCallback, bluetoothDeviceIAuthTabCallback2);
        }
        maybeUpdateAnimatable.onNavigationEvent(this.IAuthTabCallbackStubProxy, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(null), 3, (Object) null);
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = DelayMetCommandHandlerExternalSyntheticLambda0.this.new IAuthTabCallbackStub(access13800Var);
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackStub;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStubCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return iAuthTabCallbackStubCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 73 / 0;
            return iAuthTabCallbackStubCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onNavigationEvent + 23;
                int i6 = i5 % 128;
                onExtraCallback = i6;
                int i7 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 9;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                getBorderRadius getborderradiusOnExtraCallbackWithResult = DelayMetCommandHandlerExternalSyntheticLambda0.onExtraCallbackWithResult(DelayMetCommandHandlerExternalSyntheticLambda0.this);
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                if (getborderradiusOnExtraCallbackWithResult.emit(unit, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public void onWarmupCompleted(@NotNull List<TTAppOpenAdActivity2> list) throws Throwable {
        TTAppOpenAdActivity2 tTAppOpenAdActivity2;
        TTAppOpenAdActivity3 tTAppOpenAdActivity3OnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        int i2 = this.asInterface + 1;
        this.asInterface = i2;
        if (i2 % 500 == 499) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleScanCallback", "scanCount: " + i2 + " batchScanResultSize: " + list.size(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                Iterator it2 = CollectionsKt.take(CollectionsKt.sortedWith(arrayList, new onTransact()), OverwritingInputMerger.onExtraCallbackWithResult.onTransact()).iterator();
                while (it2.hasNext()) {
                    int i3 = access100 + 65;
                    extraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        tTAppOpenAdActivity2 = (TTAppOpenAdActivity2) it2.next();
                        tTAppOpenAdActivity3OnExtraCallback = tTAppOpenAdActivity2.onExtraCallback();
                        int i4 = 18 / 0;
                        if (tTAppOpenAdActivity3OnExtraCallback != null) {
                            int i5 = extraCallback + 31;
                            access100 = i5 % 128;
                            int i6 = i5 % 2;
                            WorkDatabase workDatabase = this.getInterfaceDescriptor;
                            int iOnExtraCallbackWithResult = tTAppOpenAdActivity2.onExtraCallbackWithResult();
                            BluetoothDevice bluetoothDeviceIAuthTabCallback = tTAppOpenAdActivity2.IAuthTabCallback();
                            Intrinsics.checkNotNullExpressionValue(bluetoothDeviceIAuthTabCallback, "");
                            onWarmupCompleted(workDatabase, iOnExtraCallbackWithResult, tTAppOpenAdActivity3OnExtraCallback, bluetoothDeviceIAuthTabCallback);
                        }
                    } else {
                        tTAppOpenAdActivity2 = (TTAppOpenAdActivity2) it2.next();
                        tTAppOpenAdActivity3OnExtraCallback = tTAppOpenAdActivity2.onExtraCallback();
                        if (tTAppOpenAdActivity3OnExtraCallback != null) {
                            int i52 = extraCallback + 31;
                            access100 = i52 % 128;
                            int i62 = i52 % 2;
                            WorkDatabase workDatabase2 = this.getInterfaceDescriptor;
                            int iOnExtraCallbackWithResult2 = tTAppOpenAdActivity2.onExtraCallbackWithResult();
                            BluetoothDevice bluetoothDeviceIAuthTabCallback2 = tTAppOpenAdActivity2.IAuthTabCallback();
                            Intrinsics.checkNotNullExpressionValue(bluetoothDeviceIAuthTabCallback2, "");
                            onWarmupCompleted(workDatabase2, iOnExtraCallbackWithResult2, tTAppOpenAdActivity3OnExtraCallback, bluetoothDeviceIAuthTabCallback2);
                        }
                    }
                }
                maybeUpdateAnimatable.onNavigationEvent(this.IAuthTabCallbackStubProxy, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(null), 3, (Object) null);
                int i7 = extraCallback + 107;
                access100 = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            int i9 = extraCallback + 109;
            access100 = i9 % 128;
            if (i9 % 2 != 0) {
                ((TTAppOpenAdActivity2) it.next()).onExtraCallbackWithResult();
                ((Integer) OverwritingInputMerger.onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1807848670, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{OverwritingInputMerger.onExtraCallbackWithResult}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1807848668)).intValue();
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            if (((TTAppOpenAdActivity2) next).onExtraCallbackWithResult() >= ((Integer) OverwritingInputMerger.onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1807848670, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{OverwritingInputMerger.onExtraCallbackWithResult}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1807848668)).intValue()) {
                arrayList.add(next);
            }
        }
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = DelayMetCommandHandlerExternalSyntheticLambda0.this.new IAuthTabCallbackDefault(access13800Var);
            int i2 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefaultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return iAuthTabCallbackDefaultCreate.invokeSuspend(unit);
            }
            iAuthTabCallbackDefaultCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                getBorderRadius getborderradiusOnExtraCallbackWithResult = DelayMetCommandHandlerExternalSyntheticLambda0.onExtraCallbackWithResult(DelayMetCommandHandlerExternalSyntheticLambda0.this);
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                if (getborderradiusOnExtraCallbackWithResult.emit(unit, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            int i7 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return unit2;
        }
    }

    public void onExtraCallback(int i) {
        int i2 = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(this.IAuthTabCallbackStubProxy, (CoroutineContext) null, (setRandomHost) null, new asInterface(i, null), 3, (Object) null);
        int i3 = extraCallback + 23;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ int $errorCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(int i, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$errorCode = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = DelayMetCommandHandlerExternalSyntheticLambda0.this.new asInterface(this.$errorCode, access13800Var);
            int i2 = onExtraCallback + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 15;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback + 103;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                getBorderRadius getborderradiusOnNavigationEvent = DelayMetCommandHandlerExternalSyntheticLambda0.onNavigationEvent(DelayMetCommandHandlerExternalSyntheticLambda0.this);
                WorkManagerInitializer workManagerInitializer = new WorkManagerInitializer(this.$errorCode);
                this.label = 1;
                if (getborderradiusOnNavigationEvent.emit(workManagerInitializer, this) == objOnWarmupCompleted) {
                    int i7 = IAuthTabCallback + 95;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 24 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onTransact<T> implements Comparator {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onWarmupCompleted = i2 % 128;
            TTAppOpenAdActivity2 tTAppOpenAdActivity2 = (TTAppOpenAdActivity2) t2;
            if (i2 % 2 == 0) {
                getCodeNameBytes.IAuthTabCallback(Integer.valueOf(tTAppOpenAdActivity2.onExtraCallbackWithResult()), Integer.valueOf(((TTAppOpenAdActivity2) t).onExtraCallbackWithResult()));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Integer.valueOf(tTAppOpenAdActivity2.onExtraCallbackWithResult()), Integer.valueOf(((TTAppOpenAdActivity2) t).onExtraCallbackWithResult()));
            int i3 = onWarmupCompleted + 123;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return iIAuthTabCallback;
        }
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ BluetoothDevice $device;
        final /* synthetic */ int $rssi;
        final /* synthetic */ TTAppOpenAdActivity3 $scanRecord;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(int i, BluetoothDevice bluetoothDevice, TTAppOpenAdActivity3 tTAppOpenAdActivity3, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$rssi = i;
            this.$device = bluetoothDevice;
            this.$scanRecord = tTAppOpenAdActivity3;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return asbinderCreate.invokeSuspend(unit);
            }
            asbinderCreate.invokeSuspend(unit);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = DelayMetCommandHandlerExternalSyntheticLambda0.this.new asBinder(this.$rssi, this.$device, this.$scanRecord, access13800Var);
            asbinder.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = 90 / 0;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass3(DelayMetCommandHandlerExternalSyntheticLambda0.this, this.$rssi, this.$device, this.$scanRecord, null), 3, (Object) null);
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(DelayMetCommandHandlerExternalSyntheticLambda0.this, this.$rssi, this.$device, this.$scanRecord, null), 3, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 101;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        /* renamed from: o.DelayMetCommandHandlerExternalSyntheticLambda0$asBinder$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ BluetoothDevice $device;
            final /* synthetic */ int $rssi;
            final /* synthetic */ TTAppOpenAdActivity3 $scanRecord;
            int label;
            final /* synthetic */ DelayMetCommandHandlerExternalSyntheticLambda0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0, int i, BluetoothDevice bluetoothDevice, TTAppOpenAdActivity3 tTAppOpenAdActivity3, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.this$0 = delayMetCommandHandlerExternalSyntheticLambda0;
                this.$rssi = i;
                this.$device = bluetoothDevice;
                this.$scanRecord = tTAppOpenAdActivity3;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$rssi, this.$device, this.$scanRecord, access13800Var);
                int i2 = onWarmupCompleted + 117;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 93;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onNavigationEvent(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i3 = onWarmupCompleted + 99;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 71;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 105;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 71 / 0;
                }
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                Object obj2 = null;
                if (i2 != 0) {
                    int i3 = onWarmupCompleted;
                    int i4 = i3 + 101;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i3 + 7;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        obj2.hashCode();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0 = this.this$0;
                    int i7 = this.$rssi;
                    String address = this.$device.getAddress();
                    Intrinsics.checkNotNullExpressionValue(address, "");
                    TTAppOpenAdActivity3 tTAppOpenAdActivity3 = this.$scanRecord;
                    this.label = 1;
                    if (DelayMetCommandHandlerExternalSyntheticLambda0.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{delayMetCommandHandlerExternalSyntheticLambda0, Integer.valueOf(i7), address, tTAppOpenAdActivity3, this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1495373106, -1495373104) == objOnWarmupCompleted) {
                        int i8 = onExtraCallback + 33;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: o.DelayMetCommandHandlerExternalSyntheticLambda0$asBinder$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            final /* synthetic */ BluetoothDevice $device;
            final /* synthetic */ int $rssi;
            final /* synthetic */ TTAppOpenAdActivity3 $scanRecord;
            int label;
            final /* synthetic */ DelayMetCommandHandlerExternalSyntheticLambda0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0, int i, BluetoothDevice bluetoothDevice, TTAppOpenAdActivity3 tTAppOpenAdActivity3, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.this$0 = delayMetCommandHandlerExternalSyntheticLambda0;
                this.$rssi = i;
                this.$device = bluetoothDevice;
                this.$scanRecord = tTAppOpenAdActivity3;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$rssi, this.$device, this.$scanRecord, access13800Var);
                int i2 = onNavigationEvent + 35;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 53;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 57;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnExtraCallbackWithResult;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 51;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                if (i3 != 0) {
                    int i4 = 35 / 0;
                }
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 33;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    access14300.onWarmupCompleted();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0 = this.this$0;
                    int i4 = this.$rssi;
                    BluetoothDevice bluetoothDevice = this.$device;
                    TTAppOpenAdActivity3 tTAppOpenAdActivity3 = this.$scanRecord;
                    this.label = 1;
                    if (DelayMetCommandHandlerExternalSyntheticLambda0.onWarmupCompleted(delayMetCommandHandlerExternalSyntheticLambda0, i4, bluetoothDevice, tTAppOpenAdActivity3, this) == objOnWarmupCompleted) {
                        int i5 = onExtraCallback + 49;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onWarmupCompleted(WorkDatabase workDatabase, int i, TTAppOpenAdActivity3 tTAppOpenAdActivity3, BluetoothDevice bluetoothDevice) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = extraCallback + 111;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = C0058onWarmupCompleted.onExtraCallback[workDatabase.ordinal()];
        if (i5 == 1 || i5 == 2) {
            maybeUpdateAnimatable.onNavigationEvent(this.IAuthTabCallbackStubProxy, putChannelInfo.onWarmupCompleted(), (setRandomHost) null, new asBinder(i, bluetoothDevice, tTAppOpenAdActivity3, null), 2, (Object) null);
            int i6 = access100 + 119;
            extraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i7 = access100;
        int i8 = i7 + 63;
        extraCallback = i8 % 128;
        int i9 = i8 % 2;
        if (i5 == 3) {
            maybeUpdateAnimatable.onNavigationEvent(this.IAuthTabCallbackStubProxy, putChannelInfo.onWarmupCompleted(), (setRandomHost) null, new access100(i, bluetoothDevice, tTAppOpenAdActivity3, null), 2, (Object) null);
            return;
        }
        int i10 = i7 + 107;
        extraCallback = i10 % 128;
        if (i10 % 2 != 0 ? i5 != 4 : i5 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        maybeUpdateAnimatable.onNavigationEvent(this.IAuthTabCallbackStubProxy, putChannelInfo.onWarmupCompleted(), (setRandomHost) null, new IAuthTabCallbackStubProxy(i, bluetoothDevice, tTAppOpenAdActivity3, null), 2, (Object) null);
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ BluetoothDevice $device;
        final /* synthetic */ int $rssi;
        final /* synthetic */ TTAppOpenAdActivity3 $scanRecord;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(int i, BluetoothDevice bluetoothDevice, TTAppOpenAdActivity3 tTAppOpenAdActivity3, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$rssi = i;
            this.$device = bluetoothDevice;
            this.$scanRecord = tTAppOpenAdActivity3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = DelayMetCommandHandlerExternalSyntheticLambda0.this.new access100(this.$rssi, this.$device, this.$scanRecord, access13800Var);
            int i2 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return access100Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 1 / 0;
            }
            int i5 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            access100 access100VarCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return access100VarCreate.invokeSuspend(unit);
            }
            access100VarCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0 = DelayMetCommandHandlerExternalSyntheticLambda0.this;
                int i4 = this.$rssi;
                String address = this.$device.getAddress();
                Intrinsics.checkNotNullExpressionValue(address, "");
                TTAppOpenAdActivity3 tTAppOpenAdActivity3 = this.$scanRecord;
                this.label = 1;
                Object[] objArr = {delayMetCommandHandlerExternalSyntheticLambda0, Integer.valueOf(i4), address, tTAppOpenAdActivity3, this};
                if (DelayMetCommandHandlerExternalSyntheticLambda0.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1495373106, -1495373104) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ BluetoothDevice $device;
        final /* synthetic */ int $rssi;
        final /* synthetic */ TTAppOpenAdActivity3 $scanRecord;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(int i, BluetoothDevice bluetoothDevice, TTAppOpenAdActivity3 tTAppOpenAdActivity3, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$rssi = i;
            this.$device = bluetoothDevice;
            this.$scanRecord = tTAppOpenAdActivity3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = DelayMetCommandHandlerExternalSyntheticLambda0.this.new IAuthTabCallbackStubProxy(this.$rssi, this.$device, this.$scanRecord, access13800Var);
            int i2 = onExtraCallback + 39;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 25 / 0;
            }
            return iAuthTabCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 7;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0 = DelayMetCommandHandlerExternalSyntheticLambda0.this;
                int i4 = this.$rssi;
                BluetoothDevice bluetoothDevice = this.$device;
                TTAppOpenAdActivity3 tTAppOpenAdActivity3 = this.$scanRecord;
                this.label = 1;
                if (DelayMetCommandHandlerExternalSyntheticLambda0.onWarmupCompleted(delayMetCommandHandlerExternalSyntheticLambda0, i4, bluetoothDevice, tTAppOpenAdActivity3, this) == objOnWarmupCompleted) {
                    int i5 = onNavigationEvent + 59;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallback + 107;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    private final boolean onWarmupCompleted(int i, BluetoothDevice bluetoothDevice) {
        int i2 = 2 % 2;
        WorkDatabase workDatabase = this.getInterfaceDescriptor;
        WorkDatabase workDatabase2 = WorkDatabase.PLACE;
        if (workDatabase != workDatabase2) {
            int i3 = extraCallback + 47;
            access100 = i3 % 128;
            if (i3 % 2 == 0 ? i < -70 : i < 83) {
                this.IAuthTabCallback.asBinder().incrementAndGet();
                return false;
            }
        }
        if (this.onExtraCallback.keySet().contains(bluetoothDevice.getAddress())) {
            this.IAuthTabCallback.IAuthTabCallbackStub().incrementAndGet();
            return false;
        }
        if (this.getInterfaceDescriptor != workDatabase2) {
            int i4 = extraCallback + 31;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            if (this.onExtraCallback.keySet().size() >= this.asBinder) {
                this.IAuthTabCallback.IAuthTabCallback().incrementAndGet();
                return false;
            }
        }
        int i6 = access100 + 119;
        extraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private static final void onExtraCallback(DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0, BluetoothDevice bluetoothDevice, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 9;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(bluetoothDevice, "");
        delayMetCommandHandlerExternalSyntheticLambda0.IAuthTabCallback.onExtraCallbackWithResult().incrementAndGet();
        int i5 = access100 + 41;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onWarmupCompleted(String str, int i, BluetoothDevice bluetoothDevice, ProcessorExternalSyntheticLambda1 processorExternalSyntheticLambda1) throws Throwable {
        WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1Remove;
        int i2 = 2 % 2;
        try {
            if (this.onWarmupCompleted.containsKey(str)) {
                return;
            }
            String address = bluetoothDevice.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "");
            WorkerUpdaterExternalSyntheticLambda1 workerUpdaterExternalSyntheticLambda1 = new WorkerUpdaterExternalSyntheticLambda1(this.onExtraCallbackWithResult, str, i, new ProcessorExternalSyntheticLambda0(address, processorExternalSyntheticLambda1, 0L, 4, null), this.IAuthTabCallbackStubProxy, new IAuthTabCallback(this));
            workerUpdaterExternalSyntheticLambda1.onExtraCallback(bluetoothDevice).IAuthTabCallback(false).onExtraCallbackWithResult(new TTAdConstant() { // from class: im.toss.ble.scanner.TossBleScanCallback$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final void onRequestFailed(BluetoothDevice bluetoothDevice2, int i3) throws Throwable {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 19;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        Object[] objArr = {this.f$0, bluetoothDevice2, Integer.valueOf(i3)};
                        DelayMetCommandHandlerExternalSyntheticLambda0.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1696830207, -1696830207);
                        int i6 = 68 / 0;
                    } else {
                        Object[] objArr2 = {this.f$0, bluetoothDevice2, Integer.valueOf(i3)};
                        DelayMetCommandHandlerExternalSyntheticLambda0.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr2, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1696830207, -1696830207);
                    }
                    int i7 = IAuthTabCallback + 95;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                }
            }).extraCallback();
            this.IAuthTabCallback.onNavigationEvent().incrementAndGet();
            int i3 = this.onNavigationEvent + 1;
            this.onNavigationEvent = i3;
            if (i3 % 50 == 49) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                String string = bluetoothDevice.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "TossBleScanCallback", "connectCount : " + i3 + " device : " + RxWorker.onExtraCallbackWithResult(string), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            }
            Map<String, Long> map = this.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(map, "");
            map.put(bluetoothDevice.getAddress(), Long.valueOf(System.currentTimeMillis()));
            if (this.onWarmupCompleted.size() >= (this.getInterfaceDescriptor == WorkDatabase.PLACE ? 500 : 10)) {
                Set<Map.Entry<String, WorkerUpdaterExternalSyntheticLambda1>> setEntrySet = this.onWarmupCompleted.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
                Map.Entry entry = (Map.Entry) CollectionsKt.firstOrNull(setEntrySet);
                if (entry != null) {
                    int i4 = extraCallback + 21;
                    access100 = i4 % 128;
                    int i5 = i4 % 2;
                    String str2 = (String) entry.getKey();
                    if (str2 != null && (workerUpdaterExternalSyntheticLambda1Remove = this.onWarmupCompleted.remove(str2)) != null) {
                        int i6 = access100 + 117;
                        extraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        workerUpdaterExternalSyntheticLambda1Remove.onWarmupCompleted();
                        ((AtomicInteger) DelayMetCommandHandlerExternalSyntheticLambda1.onExtraCallbackWithResult(zzaq.onNavigationEvent(), 396851111, -396851110, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), new Object[]{this.IAuthTabCallback})).incrementAndGet();
                    }
                }
            }
            this.onWarmupCompleted.put(str, workerUpdaterExternalSyntheticLambda1);
            int i8 = access100 + 87;
            extraCallback = i8 % 128;
            int i9 = i8 % 2;
        } catch (Exception unused) {
            ((AtomicInteger) DelayMetCommandHandlerExternalSyntheticLambda1.onExtraCallbackWithResult(zzaq.onNavigationEvent(), 1430982107, -1430982107, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), new Object[]{this.IAuthTabCallback})).incrementAndGet();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02da A[Catch: Exception -> 0x0375, TRY_LEAVE, TryCatch #2 {Exception -> 0x0375, blocks: (B:17:0x0071, B:101:0x02d4, B:103:0x02da, B:22:0x00ac, B:55:0x01b1, B:58:0x01c1, B:62:0x0205, B:64:0x020b, B:65:0x020f, B:66:0x0220, B:70:0x0232, B:72:0x0246, B:77:0x024b, B:78:0x025d, B:81:0x0266, B:85:0x0278, B:87:0x027f, B:92:0x0284, B:93:0x0288, B:94:0x0295, B:96:0x029b, B:98:0x02b5, B:99:0x02c1, B:25:0x00b4, B:27:0x00ba, B:29:0x00c7, B:30:0x00d8, B:33:0x00e0, B:34:0x00fe, B:40:0x013e, B:54:0x01a1, B:44:0x0148, B:46:0x014e, B:47:0x0159, B:49:0x015f, B:52:0x019b), top: B:118:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(int i, String str, TTAppOpenAdActivity3 tTAppOpenAdActivity3, access13800<? super Unit> access13800Var) throws Throwable {
        onNavigationEvent onnavigationevent;
        Iterable iterable;
        Iterable iterableEmptyList;
        Iterable iterable2;
        Iterator it;
        int i2;
        TTAppOpenAdActivity3 tTAppOpenAdActivity32;
        boolean z;
        ProcessorExternalSyntheticLambda0 processorExternalSyntheticLambda0;
        int i3;
        String str2;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        boolean z2;
        String str3;
        boolean z3;
        int i4;
        Iterable iterable3;
        TTAppOpenAdActivity3 tTAppOpenAdActivity33;
        int i5;
        ProcessorExternalSyntheticLambda0 processorExternalSyntheticLambda02;
        DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0 = this;
        int i6 = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i7 = onnavigationevent.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = access100 + 79;
                extraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    onnavigationevent.label = i7 >> Integer.MIN_VALUE;
                } else {
                    onnavigationevent.label = i7 - 2147483648;
                }
            } else {
                onnavigationevent = delayMetCommandHandlerExternalSyntheticLambda0.new onNavigationEvent(access13800Var);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i9 = onnavigationevent.label;
        try {
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleScanCallback", "check foregroundData error " + e, (Map) null, (String) null, false, (String) null, 60, (Object) null);
        }
        if (i9 != 0) {
            int i10 = access100 + 121;
            extraCallback = i10 % 128;
            int i11 = i10 % 2;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = onnavigationevent.I$1;
                z2 = onnavigationevent.Z$1;
                z3 = onnavigationevent.Z$0;
                int i12 = onnavigationevent.I$0;
                Iterator it3 = (Iterator) onnavigationevent.L$5;
                ?? r11 = (Map) onnavigationevent.L$4;
                Iterable iterable4 = (List) onnavigationevent.L$3;
                ProcessorExternalSyntheticLambda0 processorExternalSyntheticLambda03 = (ProcessorExternalSyntheticLambda0) onnavigationevent.L$2;
                TTAppOpenAdActivity3 tTAppOpenAdActivity34 = (TTAppOpenAdActivity3) onnavigationevent.L$1;
                String str4 = (String) onnavigationevent.L$0;
                ResultKt.onNavigationEvent(obj);
                i4 = i12;
                it2 = it3;
                linkedHashMap = r11;
                iterable3 = iterable4;
                tTAppOpenAdActivity33 = tTAppOpenAdActivity34;
                str3 = str4;
                processorExternalSyntheticLambda02 = processorExternalSyntheticLambda03;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    byte[] bArr = (byte[]) entry.getValue();
                    getBorderRadius<WorkerUpdaterExternalSyntheticLambda2> getborderradius = this.IAuthTabCallback_Parcel;
                    RescheduleMigration rescheduleMigration = RescheduleMigration.FOREGROUND;
                    ConstraintTrackerExternalSyntheticLambda0 constraintTrackerExternalSyntheticLambda0 = this.onTransact;
                    Intrinsics.checkNotNull(bArr);
                    ProcessorExternalSyntheticLambda0 processorExternalSyntheticLambda04 = processorExternalSyntheticLambda02;
                    WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2 = new WorkerUpdaterExternalSyntheticLambda2(rescheduleMigration, i4, constraintTrackerExternalSyntheticLambda0.IAuthTabCallback(bArr), processorExternalSyntheticLambda02, "FG", false, true, 32, null);
                    onnavigationevent.L$0 = access15400.onNavigationEvent(str3);
                    onnavigationevent.L$1 = access15400.onNavigationEvent(tTAppOpenAdActivity33);
                    onnavigationevent.L$2 = processorExternalSyntheticLambda04;
                    onnavigationevent.L$3 = access15400.onNavigationEvent(iterable3);
                    onnavigationevent.L$4 = access15400.onNavigationEvent(linkedHashMap);
                    onnavigationevent.L$5 = it2;
                    onnavigationevent.L$6 = access15400.onNavigationEvent(entry);
                    onnavigationevent.L$7 = access15400.onNavigationEvent(bArr);
                    onnavigationevent.I$0 = i4;
                    onnavigationevent.Z$0 = z3;
                    onnavigationevent.Z$1 = z2;
                    onnavigationevent.I$1 = i5;
                    onnavigationevent.I$2 = 0;
                    onnavigationevent.label = 2;
                    if (getborderradius.emit(workerUpdaterExternalSyntheticLambda2, onnavigationevent) == objOnWarmupCompleted) {
                        int i13 = extraCallback + 55;
                        access100 = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i14 = 39 / 0;
                        }
                        return objOnWarmupCompleted;
                    }
                    processorExternalSyntheticLambda02 = processorExternalSyntheticLambda04;
                }
                return Unit.INSTANCE;
            }
            i3 = onnavigationevent.I$1;
            z = onnavigationevent.Z$0;
            i2 = onnavigationevent.I$0;
            it = (Iterator) onnavigationevent.L$5;
            iterable2 = (Iterable) onnavigationevent.L$4;
            iterable = (List) onnavigationevent.L$3;
            processorExternalSyntheticLambda0 = (ProcessorExternalSyntheticLambda0) onnavigationevent.L$2;
            tTAppOpenAdActivity32 = (TTAppOpenAdActivity3) onnavigationevent.L$1;
            str2 = (String) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            Map mapOnExtraCallbackWithResult = tTAppOpenAdActivity3.onExtraCallbackWithResult();
            if (mapOnExtraCallbackWithResult == null) {
                mapOnExtraCallbackWithResult = access8100.onNavigationEvent();
                int i15 = access100 + 53;
                extraCallback = i15 % 128;
                int i16 = i15 % 2;
            }
            ArrayList arrayList = new ArrayList(mapOnExtraCallbackWithResult.size());
            Iterator it4 = mapOnExtraCallbackWithResult.entrySet().iterator();
            while (it4.hasNext()) {
                Object value = ((Map.Entry) it4.next()).getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                arrayList.add(new String((byte[]) value, OverwritingInputMerger.onExtraCallbackWithResult.IAuthTabCallback()));
            }
            OverwritingInputMerger overwritingInputMerger = OverwritingInputMerger.onExtraCallbackWithResult;
            boolean zContains = arrayList.contains(overwritingInputMerger.asInterface());
            ProcessorExternalSyntheticLambda0 processorExternalSyntheticLambda05 = new ProcessorExternalSyntheticLambda0(str, createWork.onWarmupCompleted.onNavigationEvent(tTAppOpenAdActivity3), 0L, 4, null);
            Iterable iterable5 = null;
            if (!Intrinsics.areEqual(tTAppOpenAdActivity3.IAuthTabCallback(), overwritingInputMerger.onWarmupCompleted())) {
                int i17 = access100 + 15;
                extraCallback = i17 % 128;
                if (i17 % 2 == 0) {
                    iterable5.hashCode();
                    throw null;
                }
                if (!zContains) {
                    iterableEmptyList = CollectionsKt.emptyList();
                }
                iterable = iterableEmptyList;
                iterable2 = iterable;
                it = iterable2.iterator();
                i2 = i;
                tTAppOpenAdActivity32 = tTAppOpenAdActivity3;
                z = zContains;
                processorExternalSyntheticLambda0 = processorExternalSyntheticLambda05;
                i3 = 0;
                str2 = str;
            }
            List<ParcelUuid> listOnExtraCallback = tTAppOpenAdActivity3.onExtraCallback();
            if (listOnExtraCallback != null) {
                ArrayList arrayList2 = new ArrayList();
                for (ParcelUuid parcelUuid : listOnExtraCallback) {
                    RescheduleMigration rescheduleMigration2 = RescheduleMigration.FOREGROUND;
                    String string = parcelUuid.getUuid().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new WorkerUpdaterExternalSyntheticLambda2(rescheduleMigration2, i, string, processorExternalSyntheticLambda05, "FG", false, false, 96, null));
                    arrayList2 = arrayList3;
                }
                iterable5 = arrayList2;
            }
            if (iterable5 == null) {
                iterableEmptyList = CollectionsKt.emptyList();
                iterable = iterableEmptyList;
                iterable2 = iterable;
                it = iterable2.iterator();
                i2 = i;
                tTAppOpenAdActivity32 = tTAppOpenAdActivity3;
                z = zContains;
                processorExternalSyntheticLambda0 = processorExternalSyntheticLambda05;
                i3 = 0;
                str2 = str;
            } else {
                iterable = iterable5;
                iterable2 = iterable;
                it = iterable2.iterator();
                i2 = i;
                tTAppOpenAdActivity32 = tTAppOpenAdActivity3;
                z = zContains;
                processorExternalSyntheticLambda0 = processorExternalSyntheticLambda05;
                i3 = 0;
                str2 = str;
            }
        }
        while (it.hasNext()) {
            int i18 = access100 + 87;
            extraCallback = i18 % 128;
            int i19 = i18 % 2;
            Object next = it.next();
            WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda22 = (WorkerUpdaterExternalSyntheticLambda2) next;
            getBorderRadius<WorkerUpdaterExternalSyntheticLambda2> getborderradius2 = delayMetCommandHandlerExternalSyntheticLambda0.IAuthTabCallback_Parcel;
            onnavigationevent.L$0 = access15400.onNavigationEvent(str2);
            onnavigationevent.L$1 = tTAppOpenAdActivity32;
            onnavigationevent.L$2 = processorExternalSyntheticLambda0;
            onnavigationevent.L$3 = access15400.onNavigationEvent(iterable);
            onnavigationevent.L$4 = access15400.onNavigationEvent(iterable2);
            onnavigationevent.L$5 = it;
            onnavigationevent.L$6 = access15400.onNavigationEvent(next);
            onnavigationevent.L$7 = access15400.onNavigationEvent(workerUpdaterExternalSyntheticLambda22);
            onnavigationevent.I$0 = i2;
            onnavigationevent.Z$0 = z;
            onnavigationevent.I$1 = i3;
            onnavigationevent.I$2 = 0;
            onnavigationevent.label = 1;
            if (getborderradius2.emit(workerUpdaterExternalSyntheticLambda22, onnavigationevent) == objOnWarmupCompleted) {
                break;
            }
            delayMetCommandHandlerExternalSyntheticLambda0 = this;
        }
        List listOnExtraCallback2 = tTAppOpenAdActivity32.onExtraCallback();
        if (listOnExtraCallback2 == null) {
            listOnExtraCallback2 = CollectionsKt.emptyList();
        }
        List list = listOnExtraCallback2;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            int i20 = access100 + 7;
            extraCallback = i20 % 128;
            if (i20 % 2 == 0) {
                arrayList4.add(((ParcelUuid) it5.next()).getUuid().toString());
                int i21 = 64 / 0;
            } else {
                arrayList4.add(((ParcelUuid) it5.next()).getUuid().toString());
            }
        }
        boolean zContains2 = arrayList4.contains("0000705f-0000-1000-8000-00805f9b34fb");
        if (!zContains2) {
            return Unit.INSTANCE;
        }
        Map mapOnExtraCallbackWithResult2 = tTAppOpenAdActivity32.onExtraCallbackWithResult();
        if (mapOnExtraCallbackWithResult2 == null) {
            int i22 = access100 + 49;
            extraCallback = i22 % 128;
            if (i22 % 2 == 0) {
                mapOnExtraCallbackWithResult2 = access8100.onNavigationEvent();
                int i23 = 29 / 0;
            } else {
                mapOnExtraCallbackWithResult2 = access8100.onNavigationEvent();
            }
        }
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : mapOnExtraCallbackWithResult2.entrySet()) {
            if (Intrinsics.areEqual(((ParcelUuid) entry2.getKey()).getUuid().toString(), "0000705f-0000-1000-8000-00805f9b34fb")) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        it2 = linkedHashMap.entrySet().iterator();
        z2 = zContains2;
        str3 = str2;
        z3 = z;
        i4 = i2;
        iterable3 = iterable;
        tTAppOpenAdActivity33 = tTAppOpenAdActivity32;
        i5 = 0;
        processorExternalSyntheticLambda02 = processorExternalSyntheticLambda0;
        while (it2.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(int i, BluetoothDevice bluetoothDevice, TTAppOpenAdActivity3 tTAppOpenAdActivity3, access13800<? super Unit> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        Map linkedHashMap;
        ProcessorExternalSyntheticLambda0 processorExternalSyntheticLambda0;
        Iterator it;
        int i2;
        BluetoothDevice bluetoothDevice2;
        TTAppOpenAdActivity3 tTAppOpenAdActivity32;
        List list;
        int i3;
        Object obj;
        int i4 = 2;
        int i5 = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i6 = onextracallbackwithresult.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i6 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj2 = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallbackwithresult.label;
        try {
            if (i7 != 0) {
                int i8 = extraCallback + 73;
                access100 = i8 % 128;
                if (i8 % 2 == 0 ? i7 != 1 : i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = onextracallbackwithresult.I$1;
                i2 = onextracallbackwithresult.I$0;
                it = (Iterator) onextracallbackwithresult.L$6;
                Object obj3 = (Iterable) onextracallbackwithresult.L$5;
                list = (List) onextracallbackwithresult.L$4;
                processorExternalSyntheticLambda0 = (ProcessorExternalSyntheticLambda0) onextracallbackwithresult.L$3;
                linkedHashMap = (Map) onextracallbackwithresult.L$2;
                tTAppOpenAdActivity32 = (TTAppOpenAdActivity3) onextracallbackwithresult.L$1;
                bluetoothDevice2 = (BluetoothDevice) onextracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(obj2);
                obj = obj3;
            } else {
                ResultKt.onNavigationEvent(obj2);
                Map mapOnExtraCallbackWithResult = tTAppOpenAdActivity3.onExtraCallbackWithResult();
                if (mapOnExtraCallbackWithResult == null) {
                    mapOnExtraCallbackWithResult = access8100.onNavigationEvent();
                }
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapOnExtraCallbackWithResult.entrySet()) {
                    Object value = entry.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "");
                    OverwritingInputMerger overwritingInputMerger = OverwritingInputMerger.onExtraCallbackWithResult;
                    if (!Intrinsics.areEqual(new String((byte[]) value, overwritingInputMerger.IAuthTabCallback()), (String) OverwritingInputMerger.onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1316568974, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{overwritingInputMerger}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1316568973))) {
                        Object value2 = entry.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "");
                        if (Intrinsics.areEqual(new String((byte[]) value2, overwritingInputMerger.IAuthTabCallback()), overwritingInputMerger.IAuthTabCallbackStub())) {
                        }
                    }
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap.isEmpty()) {
                    int i9 = extraCallback + 35;
                    access100 = i9 % 128;
                    if (i9 % 2 == 0) {
                        String address = bluetoothDevice.getAddress();
                        Intrinsics.checkNotNullExpressionValue(address, "");
                        onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this, address, Integer.valueOf(i), tTAppOpenAdActivity3, bluetoothDevice}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1105653898, 1105653899);
                        return Unit.INSTANCE;
                    }
                    String address2 = bluetoothDevice.getAddress();
                    Intrinsics.checkNotNullExpressionValue(address2, "");
                    onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this, address2, Integer.valueOf(i), tTAppOpenAdActivity3, bluetoothDevice}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1105653898, 1105653899);
                    Unit unit = Unit.INSTANCE;
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                String address3 = bluetoothDevice.getAddress();
                Intrinsics.checkNotNullExpressionValue(address3, "");
                processorExternalSyntheticLambda0 = new ProcessorExternalSyntheticLambda0(address3, createWork.onWarmupCompleted.onNavigationEvent(tTAppOpenAdActivity3), 0L, 4, null);
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    ParcelUuid parcelUuid = (ParcelUuid) entry2.getKey();
                    RescheduleMigration rescheduleMigration = RescheduleMigration.BACKGROUND;
                    String string = parcelUuid.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    Object value3 = entry2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, "");
                    OverwritingInputMerger overwritingInputMerger2 = OverwritingInputMerger.onExtraCallbackWithResult;
                    arrayList.add(new WorkerUpdaterExternalSyntheticLambda2(rescheduleMigration, i, string, processorExternalSyntheticLambda0, "BG", Intrinsics.areEqual(new String((byte[]) value3, overwritingInputMerger2.IAuthTabCallback()), overwritingInputMerger2.IAuthTabCallbackStub()), false, 64, null));
                }
                it = arrayList.iterator();
                i2 = i;
                bluetoothDevice2 = bluetoothDevice;
                tTAppOpenAdActivity32 = tTAppOpenAdActivity3;
                list = arrayList;
                i3 = 0;
                obj = arrayList;
            }
            while (it.hasNext()) {
                int i10 = access100 + 123;
                extraCallback = i10 % 128;
                int i11 = i10 % i4;
                Object next = it.next();
                WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2 = (WorkerUpdaterExternalSyntheticLambda2) next;
                getBorderRadius<WorkerUpdaterExternalSyntheticLambda2> getborderradius = this.IAuthTabCallback_Parcel;
                onextracallbackwithresult.L$0 = access15400.onNavigationEvent(bluetoothDevice2);
                onextracallbackwithresult.L$1 = access15400.onNavigationEvent(tTAppOpenAdActivity32);
                onextracallbackwithresult.L$2 = access15400.onNavigationEvent(linkedHashMap);
                onextracallbackwithresult.L$3 = access15400.onNavigationEvent(processorExternalSyntheticLambda0);
                onextracallbackwithresult.L$4 = access15400.onNavigationEvent(list);
                onextracallbackwithresult.L$5 = access15400.onNavigationEvent(obj);
                onextracallbackwithresult.L$6 = it;
                onextracallbackwithresult.L$7 = access15400.onNavigationEvent(next);
                onextracallbackwithresult.L$8 = access15400.onNavigationEvent(workerUpdaterExternalSyntheticLambda2);
                onextracallbackwithresult.I$0 = i2;
                onextracallbackwithresult.I$1 = i3;
                onextracallbackwithresult.I$2 = 0;
                onextracallbackwithresult.label = 1;
                if (getborderradius.emit(workerUpdaterExternalSyntheticLambda2, onextracallbackwithresult) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                i4 = 2;
            }
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleScanCallback", "check BackgroundData error " + e, (Map) null, (String) null, false, (String) null, 60, (Object) null);
            int i12 = access100 + 83;
            extraCallback = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 4 % 4;
            }
        }
        Unit unit2 = Unit.INSTANCE;
        int i14 = access100 + 11;
        extraCallback = i14 % 128;
        int i15 = i14 % 2;
        return unit2;
    }

    public final void IAuthTabCallback(@NotNull WorkDatabase workDatabase) {
        int i = 2 % 2;
        int i2 = access100 + 49;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(workDatabase, "");
            this.getInterfaceDescriptor = workDatabase;
        } else {
            Intrinsics.checkNotNullParameter(workDatabase, "");
            this.getInterfaceDescriptor = workDatabase;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(long j) {
        float f;
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            this.IAuthTabCallbackDefault = j;
            f = j + 60000.0f + 20.0f;
        } else {
            this.IAuthTabCallbackDefault = j;
            f = (j / 60000.0f) * 20.0f;
        }
        this.asBinder = (int) f;
    }

    public final void IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int size = this.onWarmupCompleted.size();
        Collection<WorkerUpdaterExternalSyntheticLambda1> collectionValues = this.onWarmupCompleted.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        Iterator<T> it = collectionValues.iterator();
        int i2 = access100 + 113;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 3;
        }
        while (!(!it.hasNext())) {
            int i4 = access100 + 99;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            ((WorkerUpdaterExternalSyntheticLambda1) it.next()).onWarmupCompleted();
            int i6 = access100 + 69;
            extraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 5;
            }
        }
        this.onWarmupCompleted.clear();
        onNavigationEvent(size);
        onNavigationEvent();
        int i8 = access100 + 87;
        extraCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    private final void onNavigationEvent(int i) throws Throwable {
        int i2 = 2 % 2;
        if (!(!this.IAuthTabCallback.onTransact())) {
            int i3 = access100 + 69;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleScanCallback", "gatt cycle", (Map) this.IAuthTabCallback.onExtraCallback(this.getInterfaceDescriptor, i, this.onExtraCallback.size()), (String) null, false, (String) null, 56, (Object) null);
            int i5 = extraCallback + 51;
            access100 = i5 % 128;
            int i6 = i5 % 2;
        }
        this.IAuthTabCallback.access100();
    }

    private final void onNavigationEvent() {
        long jLongValue;
        int i = 2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Set<String> setKeySet = this.onExtraCallback.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            Long l = this.onExtraCallback.get((String) obj);
            if (l != null) {
                int i2 = access100 + 65;
                extraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    l.longValue();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                jLongValue = l.longValue();
            } else {
                jLongValue = jCurrentTimeMillis;
            }
            if (jCurrentTimeMillis - jLongValue >= 10800000) {
                int i3 = extraCallback + 3;
                access100 = i3 % 128;
                int i4 = i3 % 2;
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.onExtraCallback.remove((String) it.next());
        }
        int i5 = extraCallback + 73;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public static /* synthetic */ void IAuthTabCallback(DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0, BluetoothDevice bluetoothDevice, int i) throws Throwable {
        Object[] objArr = {delayMetCommandHandlerExternalSyntheticLambda0, bluetoothDevice, Integer.valueOf(i)};
        onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1696830207, -1696830207);
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0, int i, String str, TTAppOpenAdActivity3 tTAppOpenAdActivity3, access13800 access13800Var) {
        Object[] objArr = {delayMetCommandHandlerExternalSyntheticLambda0, Integer.valueOf(i), str, tTAppOpenAdActivity3, access13800Var};
        return onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1495373106, -1495373104);
    }

    public static final /* synthetic */ getBorderRadius IAuthTabCallback(DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (getBorderRadius) onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{delayMetCommandHandlerExternalSyntheticLambda0}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1165915105, -1165915102);
    }

    private final void onNavigationEvent(String str, int i, TTAppOpenAdActivity3 tTAppOpenAdActivity3, BluetoothDevice bluetoothDevice) throws Throwable {
        Object[] objArr = {this, str, Integer.valueOf(i), tTAppOpenAdActivity3, bluetoothDevice};
        onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1105653898, 1105653899);
    }
}

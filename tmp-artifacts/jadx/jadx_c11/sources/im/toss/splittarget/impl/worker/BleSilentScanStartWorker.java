package im.toss.splittarget.impl.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import im.toss.features.ble.service.AdvertisingBLEGattService;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertFloatArrayToByteArray;
import o.PlayerErrorCode;
import o.SystemInfoManager;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.addExtra;
import o.createJSONObject;
import o.getAppSettingFieldGroup;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class BleSilentScanStartWorker extends CoroutineWorker {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;
    private final createJSONObject IAuthTabCallback;
    private final Context onNavigationEvent;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objDoWork = BleSilentScanStartWorker.this.doWork(this);
            int i4 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objDoWork;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleSilentScanStartWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull createJSONObject createjsonobject) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        Intrinsics.checkNotNullParameter(createjsonobject, "");
        this.onNavigationEvent = context;
        this.IAuthTabCallback = createjsonobject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f0, code lost:
    
        if (r5.onExtraCallbackWithResult(r1, r3) == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull access13800<? super ListenableWorker.onExtraCallbackWithResult> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        o.WorkerParameters workerParameters;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onExtraCallback + 47;
                onTransact = i3 % 128;
                if (i3 % 2 == 0) {
                    iAuthTabCallback.label = i2 / Integer.MIN_VALUE;
                } else {
                    iAuthTabCallback.label = i2 - 2147483648;
                }
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = iAuthTabCallback.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            o.WorkerParameters workerParametersOnExtraCallback = onExtraCallback();
            SystemInfoManager systemInfoManager = SystemInfoManager.onWarmupCompleted;
            systemInfoManager.IAuthTabCallbackStub();
            systemInfoManager.asInterface();
            AdvertisingBLEGattService.Companion.onExtraCallback(this.onNavigationEvent, workerParametersOnExtraCallback);
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "launched_by_silent_push", "Ble background advertising", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            this.IAuthTabCallback.IAuthTabCallback();
            if (addExtra.extraCallback(PlayerErrorCode.onWarmupCompleted)) {
                iAuthTabCallback.L$0 = workerParametersOnExtraCallback;
                iAuthTabCallback.label = 1;
                Object objOnWarmupCompleted2 = getAppSettingFieldGroup.onWarmupCompleted(iAuthTabCallback);
                if (objOnWarmupCompleted2 != objOnWarmupCompleted) {
                    workerParameters = workerParametersOnExtraCallback;
                    obj = objOnWarmupCompleted2;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
            } else if (!(!addExtra.writeTypedObject(r5))) {
                createJSONObject createjsonobject = this.IAuthTabCallback;
                iAuthTabCallback.L$0 = access15400.onNavigationEvent(workerParametersOnExtraCallback);
                iAuthTabCallback.label = 2;
            } else {
                this.IAuthTabCallback.onExtraCallbackWithResult(CollectionsKt.listOf(new Integer[]{access14000.onNavigationEvent(0), access14000.onNavigationEvent(3), access14000.onNavigationEvent(3)}), workerParametersOnExtraCallback);
            }
            return objOnWarmupCompleted;
        }
        if (i4 == 1) {
            workerParameters = (o.WorkerParameters) iAuthTabCallback.L$0;
            ResultKt.onNavigationEvent(obj);
            if (((Boolean) obj).booleanValue()) {
                int i5 = onExtraCallback + 61;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                this.IAuthTabCallback.onExtraCallbackWithResult(CollectionsKt.listOf(new Integer[]{access14000.onNavigationEvent(0), access14000.onNavigationEvent(3), access14000.onNavigationEvent(3)}), workerParameters);
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = onTransact + 43;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                ResultKt.onNavigationEvent(obj);
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
        }
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "launched_by_silent_push", "Ble background scan", (Map) null, (String) null, false, (String) null, 60, (Object) null);
        ListenableWorker.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = ListenableWorker.onExtraCallbackWithResult.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(onextracallbackwithresultOnExtraCallback, "");
        return onextracallbackwithresultOnExtraCallback;
    }

    private final o.WorkerParameters onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            o.WorkerParameters.Companion.onWarmupCompleted(getInputData().onExtraCallbackWithResult("key_scan_trigger"));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.WorkerParameters workerParametersOnWarmupCompleted = o.WorkerParameters.Companion.onWarmupCompleted(getInputData().onExtraCallbackWithResult("key_scan_trigger"));
        if (workerParametersOnWarmupCompleted == null) {
            int i3 = onTransact + 73;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            workerParametersOnWarmupCompleted = o.WorkerParameters.UNKNOWN;
            int i5 = onExtraCallback + 33;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            }
        }
        return workerParametersOnWarmupCompleted;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}

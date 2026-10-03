package viva.republica.toss.pedometer;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.features.ble.service.AdvertisingBLEGattService;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ComponentModelb;
import o.ConvertFloatArrayToByteArray;
import o.DynamicNativeCompanion;
import o.GuardedAsyncTask;
import o.WorkerParameters;
import o.access13800;
import o.access14300;
import o.access8100;
import o.findResAndMsg;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.onFirstFrameRendered;
import o.removeTabBarModel;
import o.setAdUnitIds;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.pedometer.PedometerService;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AppUpdateReceiver extends DynamicNativeCompanion {

    @Inject
    public removeTabBarModel airdropTermsManager;

    @Inject
    public setAdUnitIds loginStatus;

    public final setAdUnitIds onExtraCallback() {
        setAdUnitIds setadunitids = this.loginStatus;
        if (setadunitids != null) {
            return setadunitids;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // o.DynamicNativeCompanion, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) throws Exception {
        super.onReceive(context, intent);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "AppUpdateReceiver", String.valueOf(intent), (Map) null, (String) null, false, (String) null, 60, (Object) null);
        if (Intrinsics.areEqual(intent.getAction(), "android.intent.action.MY_PACKAGE_REPLACED")) {
            onNavigationEvent(this, context, false, 2, null);
            ComponentModelb componentModelb = ComponentModelb.onExtraCallback;
            if (onExtraCallback().IAuthTabCallback()) {
                maybeUpdateAnimatable.onNavigationEvent(componentModelb, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(context, this, null), 3, (Object) null);
            }
            GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "pedometer_debug", "AppUpdateReceiver.onReceive", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("stepCount", Integer.valueOf(((Integer) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask, null, 1, null}, -339510300)).intValue())), getWrite.IAuthTabCallback("lastSensorStep", Float.valueOf(((Float) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 1673036759, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask, null, 1, null}, -1673036751)).floatValue())), getWrite.IAuthTabCallback("isPedometerActivationRequested", Boolean.valueOf(guardedAsyncTask.IAuthTabCallbackDefault())), getWrite.IAuthTabCallback("isPedometerServiceReady", Boolean.valueOf(guardedAsyncTask.IAuthTabCallbackDefault(context))), getWrite.IAuthTabCallback("wasMandatoryTermsAgreed", Boolean.valueOf(((Boolean) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), -2096237238, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask}, 2096237241)).booleanValue()))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ AppUpdateReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Context context, AppUpdateReceiver appUpdateReceiver, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.this$0 = appUpdateReceiver;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallback(this.$context, this.this$0, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    onFirstFrameRendered.Companion.onWarmupCompleted().onExtraCallbackWithResult();
                    AdvertisingBLEGattService.onExtraCallbackWithResult onextracallbackwithresult = AdvertisingBLEGattService.Companion;
                    Context applicationContext = this.$context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    AdvertisingBLEGattService.onExtraCallbackWithResult.IAuthTabCallback(onextracallbackwithresult, applicationContext, (WorkerParameters) null, 2, (Object) null);
                    GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
                    this.label = 1;
                    objOnNavigationEvent = guardedAsyncTask.onNavigationEvent((access13800<? super Result<Boolean>>) this);
                    if (objOnNavigationEvent == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnNavigationEvent = ((Result) obj).onNavigationEvent();
                }
                AppUpdateReceiver appUpdateReceiver = this.this$0;
                Context context = this.$context;
                if (Result.onNavigationEvent(objOnNavigationEvent)) {
                    appUpdateReceiver.onExtraCallbackWithResult(context, true);
                }
            } catch (Exception e) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "AppUpdateReceiver", "캐시 클리어 실패", e, (Map) null, 8, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    static /* synthetic */ void onNavigationEvent(AppUpdateReceiver appUpdateReceiver, Context context, boolean z, int i, Object obj) throws Exception {
        if ((i & 2) != 0) {
            z = false;
        }
        appUpdateReceiver.onExtraCallbackWithResult(context, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallbackWithResult(Context context, boolean z) throws Exception {
        if (GuardedAsyncTask.IAuthTabCallback.IAuthTabCallbackDefault(context)) {
            PedometerService.onExtraCallbackWithResult.onWarmupCompleted(PedometerService.Companion, context, "AppUpdateReceiver", null, true, 4, null);
        } else if (z) {
            PedometerService.Companion.IAuthTabCallback(context, "AppUpdateReceiver");
        }
    }
}

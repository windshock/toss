package o;

import android.app.AlarmManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.internal.ads.zzgsa;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.pedometer.PedometerService;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DynamicNative extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) throws Exception {
        if (context == null) {
            return;
        }
        GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
        if (guardedAsyncTask.IAuthTabCallbackDefault(context)) {
            PedometerService.Companion.onWarmupCompleted(context);
        } else if (!guardedAsyncTask.IAuthTabCallbackDefault()) {
            Object systemService = context.getSystemService("alarm");
            Intrinsics.checkNotNull(systemService, "");
            AlarmManager alarmManager = (AlarmManager) systemService;
            alarmManager.cancel(guardedAsyncTask.onExtraCallbackWithResult(context));
            alarmManager.cancel(guardedAsyncTask.onNavigationEvent(context));
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "DateChangedReceiver.onReceive", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("stepCount", Integer.valueOf(((Integer) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask, null, 1, null}, -339510300)).intValue())), getWrite.IAuthTabCallback("isPedometerActivationRequested", Boolean.valueOf(guardedAsyncTask.IAuthTabCallbackDefault())), getWrite.IAuthTabCallback("isPedometerServiceReady", Boolean.valueOf(guardedAsyncTask.IAuthTabCallbackDefault(context)))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
    }
}

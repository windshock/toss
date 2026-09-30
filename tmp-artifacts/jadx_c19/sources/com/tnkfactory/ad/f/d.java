package com.tnkfactory.ad.f;

import android.content.Context;
import com.tnkfactory.ad.Logger;
import com.tnkfactory.ad.rwd.AdidManager;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.Utils;
import com.tnkfactory.ad.rwd.api.ConstantsUtil;
import com.tnkfactory.ad.rwd.api.ServiceTask;
import com.tnkfactory.ad.rwd.data.ResultState;
import com.tnkfactory.ad.rwd.data.constants.RpcConfig;
import com.tnkfactory.framework.vo.ValueObject;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class d extends Thread {
    public final Context a;
    public final String b;
    public final /* synthetic */ ServiceTask c;

    public d(ServiceTask serviceTask, Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        this.c = serviceTask;
        this.a = context;
        this.b = str;
    }

    public final void a() throws InterruptedException {
        HashMap map;
        if (this.b != null) {
            try {
                Thread.sleep(10000L);
            } catch (Exception unused) {
            }
        }
        ServiceTask serviceTask = this.c;
        synchronized (serviceTask) {
            if (Utils.isNull(null)) {
                AdidManager.INSTANCE.getAdvertisingIdThread(serviceTask.getSessionInfo());
            } else {
                serviceTask.getSessionInfo().setAdid(null);
            }
            Settings settings = Settings.INSTANCE;
            Context context = this.a;
            String applicationId = serviceTask.getSessionInfo().getApplicationId();
            Intrinsics.checkNotNull(applicationId);
            if (settings.isPayedApp(context, applicationId, 1)) {
                return;
            }
            try {
                ValueObject sessionRunVO = serviceTask.getSessionRunVO(this.a);
                if (this.b != null) {
                    map = new HashMap();
                    map.put("override_app_id", this.b);
                } else {
                    map = null;
                }
                ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
                RpcConfig rpcConfig = RpcConfig.INSTANCE;
                ResultState resultStateInvoke = serviceTask.invoke(constantsUtil.def(rpcConfig.getSERVICE_ADVERTISER()), constantsUtil.def(rpcConfig.getMETHOD_REQ_PAY_FOR_START()), new Object[]{sessionRunVO}, map != null ? map : null);
                String applicationId2 = serviceTask.getSessionInfo().getApplicationId();
                Intrinsics.checkNotNull(applicationId2);
                new e(applicationId2, 1, Settings.DEFAUL_ACTION_NAME_FOR_START).onReturn(this.a, resultStateInvoke);
            } catch (Exception e) {
                Logger.e("RPFS " + e);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        Settings settings = Settings.INSTANCE;
        settings.addRunCount(this.a);
        Context context = this.a;
        String applicationId = this.c.getSessionInfo().getApplicationId();
        Intrinsics.checkNotNull(applicationId);
        if (!settings.isPayedApp(context, applicationId, 1)) {
            a();
        } else if (this.c.getSessionInfo().getDoTracking() && settings.checkTraceCall(this.a)) {
            this.c.a(this.a);
        }
    }
}

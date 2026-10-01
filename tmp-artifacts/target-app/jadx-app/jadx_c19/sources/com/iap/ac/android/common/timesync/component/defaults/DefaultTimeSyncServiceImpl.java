package com.iap.ac.android.common.timesync.component.defaults;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipayplus.mobile.component.common.rpc.basic.BasicTimeRpcFacade;
import com.alipayplus.mobile.component.common.rpc.basic.request.BasicTimeTickRpcRequest;
import com.alipayplus.mobile.component.common.rpc.basic.result.BasicTimeTickRpcResult;
import com.iap.ac.android.common.a.a;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.common.timesync.component.ITimeSyncCallback;
import com.iap.ac.android.common.timesync.component.ITimeSyncService;
import java.util.Locale;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DefaultTimeSyncServiceImpl implements ITimeSyncService {
    public static final String SHARED_PREFERENCES_NAME = "ac_time_sp";
    public static final String SP_SYNC_TIME = "sp_sync_time";
    public static final String SP_TIME_GAP = "sp_time_gap";
    public static final String TAG = "DefaultTimeSyncServiceImpl";
    public static SharedPreferences sharedPreferences;
    public long mLastSyncTime = 0;
    public long mTimeGap = 0;

    public DefaultTimeSyncServiceImpl(Context context) {
        sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
    }

    @Override // com.iap.ac.android.common.timesync.component.ITimeSyncService
    public long getLastSyncTime() {
        if (sharedPreferences == null) {
            ACLog.e(TAG, "can not get the latest sync time because of none access to storage");
            return -1L;
        }
        synchronized (this) {
            if (this.mLastSyncTime <= 0) {
                this.mLastSyncTime = sharedPreferences.getLong(SP_SYNC_TIME, -1L);
            }
        }
        ACLog.i(TAG, String.format(Locale.getDefault(), "get lastSyncTime = %d", Long.valueOf(this.mLastSyncTime)));
        return this.mLastSyncTime;
    }

    @Override // com.iap.ac.android.common.timesync.component.ITimeSyncService
    public long getServerTime() {
        if (sharedPreferences == null) {
            ACLog.e(TAG, "can not get server time because of none access to storage");
            return System.currentTimeMillis();
        }
        synchronized (this) {
            if (this.mTimeGap <= 0) {
                this.mTimeGap = sharedPreferences.getLong(SP_TIME_GAP, 0L);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.mTimeGap;
        ACLog.i(TAG, String.format(Locale.getDefault(), "get serverTime = %d, localTime = %d", Long.valueOf(j), Long.valueOf(jCurrentTimeMillis)));
        return j;
    }

    @Override // com.iap.ac.android.common.timesync.component.ITimeSyncService
    public void setServerTime(long j, long j2) {
        ACLog.i(TAG, String.format(Locale.getDefault(), "set serverTime = %d, requestCostTime = %d", Long.valueOf(j2), Long.valueOf(j)));
        if (sharedPreferences == null) {
            ACLog.e(TAG, "can not set server time because of none access to storage");
            return;
        }
        synchronized (this) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.mLastSyncTime = jCurrentTimeMillis;
            this.mTimeGap = jCurrentTimeMillis - (j2 + (j / 2));
            sharedPreferences.edit().putLong(SP_TIME_GAP, this.mTimeGap).putLong(SP_SYNC_TIME, this.mLastSyncTime).apply();
        }
    }

    @Override // com.iap.ac.android.common.timesync.component.ITimeSyncService
    public void syncTime(@Nullable final ITimeSyncCallback iTimeSyncCallback) {
        IAPAsyncTask.asyncTask(new Runnable() { // from class: com.iap.ac.android.common.timesync.component.defaults.DefaultTimeSyncServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                BasicTimeRpcFacade basicTimeRpcFacade = (BasicTimeRpcFacade) RPCProxyHost.getInterfaceProxy(BasicTimeRpcFacade.class);
                if (basicTimeRpcFacade == null) {
                    ACLog.e(DefaultTimeSyncServiceImpl.TAG, "getInterfaceProxy for BasicTimeRpcFacade error with null");
                    return;
                }
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    BasicTimeTickRpcResult basicTimeTickRpcResultTick = basicTimeRpcFacade.tick(new BasicTimeTickRpcRequest());
                    ACLog.i(DefaultTimeSyncServiceImpl.TAG, "syncTime in DefaultTimeSyncServiceImpl, callback is:" + iTimeSyncCallback);
                    if (basicTimeTickRpcResultTick == null || basicTimeTickRpcResultTick.serviceTime <= 0) {
                        ITimeSyncCallback iTimeSyncCallback2 = iTimeSyncCallback;
                        if (iTimeSyncCallback2 == null || !ITimeSyncCallback.class.isAssignableFrom(iTimeSyncCallback2.getClass())) {
                            return;
                        }
                        iTimeSyncCallback.onComplete(5001);
                        return;
                    }
                    DefaultTimeSyncServiceImpl.this.setServerTime(System.currentTimeMillis() - jCurrentTimeMillis, basicTimeTickRpcResultTick.serviceTime);
                    ITimeSyncCallback iTimeSyncCallback3 = iTimeSyncCallback;
                    if (iTimeSyncCallback3 == null || !ITimeSyncCallback.class.isAssignableFrom(iTimeSyncCallback3.getClass())) {
                        return;
                    }
                    iTimeSyncCallback.onComplete(0);
                } catch (RpcException e) {
                    StringBuilder sbA = a.a("syncTime error:");
                    sbA.append(e.getMessage());
                    ACLog.e(DefaultTimeSyncServiceImpl.TAG, sbA.toString());
                    ITimeSyncCallback iTimeSyncCallback4 = iTimeSyncCallback;
                    if (iTimeSyncCallback4 == null || !ITimeSyncCallback.class.isAssignableFrom(iTimeSyncCallback4.getClass())) {
                        return;
                    }
                    iTimeSyncCallback.onComplete(5001);
                }
            }
        });
    }
}

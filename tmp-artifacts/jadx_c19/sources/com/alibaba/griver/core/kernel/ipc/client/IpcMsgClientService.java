package com.alibaba.griver.core.kernel.ipc.client;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.alibaba.ariver.app.ipc.ClientMsgReceiver;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import java.lang.ref.WeakReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class IpcMsgClientService extends Service {
    public static Class[] SERVICE_CLASSES = {Lite1.class, Lite2.class, Lite3.class};
    public IIpcChannel a;

    public static class Lite1 extends IpcMsgClientService {
        @Override // com.alibaba.griver.core.kernel.ipc.client.IpcMsgClientService, android.app.Service, android.content.ContextWrapper
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }

        @Override // com.alibaba.griver.core.kernel.ipc.client.IpcMsgClientService, android.app.Service
        public void onCreate() {
            super.onCreate();
        }
    }

    public static class Lite2 extends IpcMsgClientService {
        @Override // com.alibaba.griver.core.kernel.ipc.client.IpcMsgClientService, android.app.Service, android.content.ContextWrapper
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }

        @Override // com.alibaba.griver.core.kernel.ipc.client.IpcMsgClientService, android.app.Service
        public void onCreate() {
            super.onCreate();
        }
    }

    public static class Lite3 extends IpcMsgClientService {
        @Override // com.alibaba.griver.core.kernel.ipc.client.IpcMsgClientService, android.app.Service, android.content.ContextWrapper
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }

        @Override // com.alibaba.griver.core.kernel.ipc.client.IpcMsgClientService, android.app.Service
        public void onCreate() {
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        RVLogger.d("AriverInt:IpcMsgClientService", "onBind");
        return this.a.asBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        RVLogger.d("AriverInt:IpcMsgClientService", "onCreate");
        this.a = new IIpcChannel.Stub() { // from class: com.alibaba.griver.core.kernel.ipc.client.IpcMsgClientService.1
            public boolean isFinishing() throws RemoteException {
                WeakReference topActivity = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getTopActivity();
                return topActivity.get() != null && ((Activity) topActivity.get()).isFinishing();
            }

            public void sendMessage(IpcMessage ipcMessage) throws RemoteException {
                ClientMsgReceiver.getInstance().handleMessage(ipcMessage);
            }
        };
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}

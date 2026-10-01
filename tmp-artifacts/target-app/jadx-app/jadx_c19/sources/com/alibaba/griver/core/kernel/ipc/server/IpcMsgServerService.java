package com.alibaba.griver.core.kernel.ipc.server;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.alibaba.ariver.app.ipc.ServerMsgReceiver;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcMessage;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class IpcMsgServerService extends Service {
    public IIpcChannel a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        RVLogger.d("AriverInt:IpcMsgServerService", "onBind " + intent);
        return this.a.asBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        RVLogger.d("AriverInt:IpcMsgServerService", "onCreate ");
        this.a = new IIpcChannel.Stub() { // from class: com.alibaba.griver.core.kernel.ipc.server.IpcMsgServerService.1
            public boolean isFinishing() throws RemoteException {
                return false;
            }

            public void sendMessage(IpcMessage ipcMessage) throws RemoteException {
                ServerMsgReceiver.getInstance().handleMessage(ipcMessage);
            }
        };
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}

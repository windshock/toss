package com.alibaba.griver.core.ui.activity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcChannelManager;
import com.alibaba.griver.core.kernel.ipc.server.IpcMsgServerService;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GriverBaseActivity$Lite extends GriverBaseActivity {
    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (IpcChannelManager.getInstance().getServerChannel() == null) {
            Intent intent = new Intent();
            intent.setClass(this, IpcMsgServerService.class);
            startService(intent);
            bindService(intent, new ServiceConnection() { // from class: com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite.1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    RVLogger.d("GriverBaseActivity", "onServiceConnected " + componentName);
                    IpcChannelManager.getInstance().registerServerChannel(IIpcChannel.Stub.asInterface(iBinder));
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    IpcChannelManager.getInstance().unRegisterServerChannel();
                }
            }, 0);
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}

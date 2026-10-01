package com.alibaba.ariver.kernel.ipc;

import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcChannelManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class IpcClientKernelUtils {
    public static final String LOG_TAG = "AriverInt:IpcClient";
    private static Method sIpcOptConfigMethod;
    private static boolean sIpcOptConfigResult;
    private static final List<IpcMessage> sPendingMessages = new ArrayList();
    private static final AtomicBoolean sRegistered = new AtomicBoolean(false);

    public static boolean enableBridgeCatchIpcException() {
        return ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean("ariver_catchApiIpcException", true);
    }

    public static void sendMsgToServer(String str, int i2, Bundle bundle) {
        try {
            sendMsgToServerUnSafe(str, i2, bundle);
        } catch (RemoteException e) {
            RVLogger.w(LOG_TAG, "sendMsgToServer exception!", e);
        }
    }

    public static void sendMsgToServerUnSafe(String str, int i2, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i2;
        if (bundle == null) {
            bundle = new Bundle();
        }
        int lpid = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getLpid();
        bundle.putBoolean("fromLiteProcess", !ProcessUtils.isMainProcess());
        bundle.putInt("lpid", lpid);
        messageObtain.setData(bundle);
        IpcMessage ipcMessage = new IpcMessage();
        ipcMessage.biz = str;
        ipcMessage.bizMsg = messageObtain;
        ipcMessage.clientId = ProcessUtils.getProcessName();
        ipcMessage.pid = ProcessUtils.getPid();
        ipcMessage.lpid = lpid;
        IIpcChannel serverChannel = IpcChannelManager.getInstance().getServerChannel();
        synchronized (sPendingMessages) {
            if (serverChannel != null) {
                serverChannel.sendMessage(ipcMessage);
            } else {
                addPendingMessage(ipcMessage);
                RVLogger.w(LOG_TAG, "sendMsgToServer but cannot find serverProxy!");
            }
        }
    }

    private static void addPendingMessage(IpcMessage ipcMessage) {
        if (!sRegistered.getAndSet(true)) {
            RVLogger.d(LOG_TAG, "registerServerReadyListener");
            IpcChannelManager.getInstance().registerServerReadyListener(new IpcChannelManager.ServerReadyListener() { // from class: com.alibaba.ariver.kernel.ipc.IpcClientKernelUtils.1
                public void onServerReady() {
                    IIpcChannel serverChannel = IpcClientKernelUtils.getServerChannel();
                    if (serverChannel == null) {
                        return;
                    }
                    synchronized (IpcClientKernelUtils.sPendingMessages) {
                        Iterator it = IpcClientKernelUtils.sPendingMessages.iterator();
                        while (it.hasNext()) {
                            try {
                                serverChannel.sendMessage((IpcMessage) it.next());
                            } catch (RemoteException e) {
                                RVLogger.w(IpcClientKernelUtils.LOG_TAG, "sendMessage to server exception!", e);
                            }
                        }
                    }
                    IpcChannelManager.getInstance().unRegisterServerReadyListener(this);
                }
            });
        }
        sPendingMessages.add(ipcMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IIpcChannel getServerChannel() {
        IIpcChannel serverChannel = IpcChannelManager.getInstance().getServerChannel();
        if (serverChannel == null) {
            RVLogger.e(LOG_TAG, "onServerReady but server channel == null!!");
        }
        return serverChannel;
    }
}

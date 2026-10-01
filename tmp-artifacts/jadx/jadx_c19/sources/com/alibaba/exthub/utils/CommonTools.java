package com.alibaba.exthub.utils;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.common.bridge.internal.DefaultBridgeCallback;
import com.alibaba.ariver.engine.common.extension.BindBridgeExtensionInvoker;
import com.alibaba.ariver.engine.common.extension.bind.NodeBinder;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.exthub.common.ExtHubLogger;
import com.alibaba.exthub.common.ExtHubProxy;
import com.alibaba.exthub.proxy.LogEventProxy;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.Method;
import java.util.Random;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class CommonTools {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = -3593523303936435602L;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static void putInfo2BridgeResponseHelper(String str, Object obj, ExtensionInvoker extensionInvoker) {
        int i2 = 2 % 2;
        try {
            if ((!TextUtils.isEmpty(str)) && obj != null) {
                int i3 = onExtraCallback + 81;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    boolean z = extensionInvoker instanceof BindBridgeExtensionInvoker;
                    throw null;
                }
                if (!(extensionInvoker instanceof BindBridgeExtensionInvoker)) {
                    return;
                } else {
                    ((BindBridgeExtensionInvoker) extensionInvoker).addExtraInfo(str, obj);
                }
            }
            int i4 = onNavigationEvent + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable unused) {
        }
    }

    public static DefaultBridgeCallback getDefaultBridgeCallback(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 93;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (objArr == null) {
            return null;
        }
        try {
            if (objArr.length == 0) {
                return null;
            }
            int length = objArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = onNavigationEvent + 85;
                int i7 = i6 % 128;
                onExtraCallback = i7;
                int i8 = i6 % 2;
                Object obj = objArr[i5];
                if (obj instanceof DefaultBridgeCallback) {
                    int i9 = i7 + 71;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    return (DefaultBridgeCallback) obj;
                }
                i5++;
                int i11 = i7 + 91;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void pointStartFunction(ExtensionInvoker extensionInvoker) {
        int i2 = 2 % 2;
        if (extensionInvoker instanceof BindBridgeExtensionInvoker) {
            try {
                BindBridgeExtensionInvoker bindBridgeExtensionInvoker = (BindBridgeExtensionInvoker) extensionInvoker;
                bindBridgeExtensionInvoker.addExtraInfo("EXTENSION_STEP", "2_0");
                bindBridgeExtensionInvoker.pointStartTime();
                int i3 = onExtraCallback + 119;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        int i4 = onNavigationEvent + 97;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionType(0L) + 24, KeyEvent.getDeadChar(0, 0) + 19627, 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 59 - ExpandableListView.getPackedPositionType(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i5 = $11 + 115;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 59 - TextUtils.getOffsetBefore("", 0), 6382 - ImageFormat.getBitsPerPixel(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i7 = $11 + 93;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    public static boolean isAppDestroyed(Node node, String str) {
        int i2 = 2 % 2;
        if (node == null) {
            int i3 = onExtraCallback + 101;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!ExthubConfigManager.instance().getConfigCacheValue("ta_bridge_appDestroy_open", false)) {
            return false;
        }
        App appFindDataScopeNode = new NodeBinder(node).findDataScopeNode(App.class, node);
        if (appFindDataScopeNode instanceof App) {
            App app = appFindDataScopeNode;
            boolean zIsDestroyed = app.isDestroyed();
            if (zIsDestroyed) {
                int iNextInt = new Random().nextInt(100);
                if (iNextInt < 10) {
                    int i5 = onNavigationEvent + 93;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    LogEventProxy logEventProxy = (LogEventProxy) ExtHubProxy.get(LogEventProxy.class);
                    if (logEventProxy != null) {
                        JSONObject jSONObject = new JSONObject();
                        Object[] objArr = new Object[1];
                        a(new char[]{24376, 21580, 18915, 32063, 29353}, Drawable.resolveOpacity(0, 0) + 2917, objArr);
                        jSONObject.put(((String) objArr[0]).intern(), app.getAppId());
                        jSONObject.put("jsapi", str);
                        Object[] objArr2 = new Object[1];
                        a(new char[]{24365, 51645, 29203, 40171}, (ViewConfiguration.getScrollBarSize() >> 8) + 38557, objArr2);
                        jSONObject.put(((String) objArr2[0]).intern(), "appDestroy");
                        logEventProxy.logEvent("1010878", jSONObject);
                    }
                }
                ExtHubLogger.d("CommonTools.isAppDestroyed: " + str + " rdm: " + iNextInt);
            }
            int i6 = onExtraCallback + 35;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return zIsDestroyed;
        }
        int i8 = onNavigationEvent + 9;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }
}

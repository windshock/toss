package ua.naiksoftware.stomp;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.MapConverter;
import o.TimelineExternalSyntheticLambda0;
import o.clearTid;
import o.deserializeUriNullableCollection;
import okhttp3.internal.url._UrlKt;
import ua.naiksoftware.stomp.dto.StompHeader;
import ua.naiksoftware.stomp.dto.StompMessage;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class HeartBeatTask {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    private static final String TAG = "HeartBeatTask";
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private transient deserializeUriNullableCollection clientSendHeartBeatTask;
    private final boolean deadlineMode;
    private FailedListener failedListener;
    private MapConverter scheduler;
    private SendCallback sendCallback;
    private transient deserializeUriNullableCollection serverCheckHeartBeatTask;
    private int serverHeartbeat = 0;
    private int clientHeartbeat = 0;
    private int serverHeartbeatNew = 0;
    private int clientHeartbeatNew = 0;
    private volatile transient long lastServerHeartBeat = 0;
    private volatile boolean isShutdown = false;

    public interface FailedListener {
        void onServerHeartBeatFailed();
    }

    public interface SendCallback {
        void sendClientHeartBeat(String str);
    }

    public static /* synthetic */ void $r8$lambda$0O73a1bvqUrWRopnJxGMTpKtPec(HeartBeatTask heartBeatTask) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        heartBeatTask.lambda$scheduleClientHeartBeat$1();
        int i4 = onExtraCallback + 69;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void $r8$lambda$AbOAXJY3s2GmESYMknzxT42I8OU(HeartBeatTask heartBeatTask) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        heartBeatTask.lambda$scheduleServerHeartBeatCheck$0();
        if (i3 != 0) {
            throw null;
        }
    }

    static {
        onWarmupCompleted();
        int i = onExtraCallbackWithResult + 39;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public HeartBeatTask(SendCallback sendCallback, @Nullable FailedListener failedListener, boolean z) {
        this.failedListener = failedListener;
        this.sendCallback = sendCallback;
        this.deadlineMode = z;
    }

    public void setServerHeartbeat(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.serverHeartbeatNew = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setClientHeartbeat(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.clientHeartbeatNew = i;
        if (i4 == 0) {
            throw null;
        }
    }

    public int getServerHeartbeat() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.serverHeartbeatNew;
        int i6 = i2 + 77;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public int getClientHeartbeat() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.clientHeartbeatNew;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 115;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 57;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 45812), 84 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 14186), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, (ViewConfiguration.getTapTimeout() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean consumeHeartBeat(StompMessage stompMessage) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            stompMessage.getStompCommand().hashCode();
            throw null;
        }
        String stompCommand = stompMessage.getStompCommand();
        char c = 65535;
        switch (stompCommand.hashCode()) {
            case -2087582999:
                if (stompCommand.equals("CONNECTED")) {
                    c = 0;
                    break;
                }
                break;
            case 2541448:
                if (stompCommand.equals("SEND")) {
                    int i3 = onWarmupCompleted + 43;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        c = 1;
                        break;
                    }
                }
                break;
            case 433141802:
                Object[] objArr = new Object[1];
                a(new char[]{34712, 14627, 18289, 59607, 34765, 11458, 27748, 43412, 53611, 21791, 50469}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr);
                if (stompCommand.equals(((String) objArr[0]).intern())) {
                    int i4 = onExtraCallback + 3;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    c = 2;
                    break;
                }
                break;
            case 1672907751:
                if (!(!stompCommand.equals("MESSAGE"))) {
                    int i6 = onExtraCallback + 73;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            heartBeatHandshake(stompMessage.findHeader(StompHeader.HEART_BEAT));
        } else if (c == 1) {
            abortClientHeartBeatSend();
        } else if (c != 2) {
            if (c == 3) {
                abortServerHeartBeatCheck();
            }
        } else if ("\n".equals(stompMessage.getPayload())) {
            int i8 = onWarmupCompleted + 45;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                abortServerHeartBeatCheck();
                return false;
            }
            abortServerHeartBeatCheck();
            return false;
        }
        return true;
    }

    public void shutdown() {
        int i = 2 % 2;
        this.isShutdown = true;
        deserializeUriNullableCollection deserializeurinullablecollection = this.clientSendHeartBeatTask;
        if (deserializeurinullablecollection != null) {
            deserializeurinullablecollection.dispose();
            int i2 = onExtraCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        deserializeUriNullableCollection deserializeurinullablecollection2 = this.serverCheckHeartBeatTask;
        if (deserializeurinullablecollection2 != null) {
            deserializeurinullablecollection2.dispose();
        }
        this.lastServerHeartBeat = 0L;
        int i4 = onWarmupCompleted + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void heartBeatHandshake(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
            if (str != null) {
                String[] strArrSplit = str.split(",");
                int i4 = this.clientHeartbeatNew;
                if (i4 > 0) {
                    this.clientHeartbeat = Math.max(i4, Integer.parseInt(strArrSplit[1]));
                }
                int i5 = this.serverHeartbeatNew;
                if (i5 > 0) {
                    this.serverHeartbeat = Math.max(i5, Integer.parseInt(strArrSplit[0]));
                }
            }
        } else if (str != null) {
        }
        if (this.clientHeartbeat > 0 || this.serverHeartbeat > 0) {
            this.scheduler = clearTid.onExtraCallback();
            if (this.clientHeartbeat > 0) {
                int i6 = onExtraCallback + 25;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                scheduleClientHeartBeat();
            }
            if (this.serverHeartbeat > 0) {
                int i8 = onWarmupCompleted + 61;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    scheduleServerHeartBeatCheck();
                    this.lastServerHeartBeat = System.currentTimeMillis();
                } else {
                    scheduleServerHeartBeatCheck();
                    this.lastServerHeartBeat = System.currentTimeMillis();
                    throw null;
                }
            }
        }
    }

    private void scheduleServerHeartBeatCheck() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.isShutdown) {
                return;
            }
            int i3 = onExtraCallback + 75;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 9 / 0;
                if (this.serverHeartbeat <= 0) {
                    return;
                }
            } else if (this.serverHeartbeat <= 0) {
                return;
            }
            MapConverter mapConverter = this.scheduler;
            if (mapConverter != null) {
                this.serverCheckHeartBeatTask = mapConverter.onNavigationEvent(new Runnable() { // from class: ua.naiksoftware.stomp.HeartBeatTask$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        HeartBeatTask.$r8$lambda$AbOAXJY3s2GmESYMknzxT42I8OU(this.f$0);
                    }
                }, this.serverHeartbeat, TimeUnit.MILLISECONDS);
                return;
            }
            return;
        }
        throw null;
    }

    private /* synthetic */ void lambda$scheduleServerHeartBeatCheck$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        checkServerHeartBeat();
        if (i3 == 0) {
            throw null;
        }
    }

    private void checkServerHeartBeat() {
        int i = 2 % 2;
        if (!this.isShutdown) {
            int i2 = onExtraCallback + 49;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this.serverHeartbeat > 0) {
                if (this.lastServerHeartBeat >= System.currentTimeMillis() - (this.serverHeartbeat * 3)) {
                    if (this.deadlineMode) {
                        scheduleServerHeartBeatCheck();
                        return;
                    }
                    this.lastServerHeartBeat = System.currentTimeMillis();
                    int i3 = onWarmupCompleted + 111;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    int i5 = onWarmupCompleted + 85;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        FailedListener failedListener = this.failedListener;
                        if (failedListener != null) {
                            failedListener.onServerHeartBeatFailed();
                            return;
                        }
                    } else {
                        obj.hashCode();
                        throw null;
                    }
                }
            }
        }
        int i6 = onExtraCallback + 9;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    private void abortServerHeartBeatCheck() {
        int i = 2 % 2;
        this.lastServerHeartBeat = System.currentTimeMillis();
        if (this.deadlineMode) {
            int i2 = onExtraCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        deserializeUriNullableCollection deserializeurinullablecollection = this.serverCheckHeartBeatTask;
        if (deserializeurinullablecollection != null) {
            int i4 = onExtraCallback + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            deserializeurinullablecollection.dispose();
        }
        scheduleServerHeartBeatCheck();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[PHI: r1
      0x0023: PHI (r1v10 o.MapConverter) = (r1v9 o.MapConverter), (r1v12 o.MapConverter) binds: [B:12:0x0021, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void scheduleClientHeartBeat() {
        MapConverter mapConverter;
        int i = 2 % 2;
        if (!this.isShutdown && this.clientHeartbeat > 0) {
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                mapConverter = this.scheduler;
                int i3 = 42 / 0;
                if (mapConverter != null) {
                    this.clientSendHeartBeatTask = mapConverter.onNavigationEvent(new Runnable() { // from class: ua.naiksoftware.stomp.HeartBeatTask$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            HeartBeatTask.$r8$lambda$0O73a1bvqUrWRopnJxGMTpKtPec(this.f$0);
                        }
                    }, this.clientHeartbeat, TimeUnit.MILLISECONDS);
                }
            } else {
                mapConverter = this.scheduler;
                if (mapConverter != null) {
                }
            }
        }
        int i4 = onWarmupCompleted + 13;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private /* synthetic */ void lambda$scheduleClientHeartBeat$1() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        sendClientHeartBeat();
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
    }

    private void sendClientHeartBeat() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!this.isShutdown) {
            this.sendCallback.sendClientHeartBeat("\r\n");
            scheduleClientHeartBeat();
        } else {
            int i4 = onWarmupCompleted + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 o.deserializeUriNullableCollection) = (r1v4 o.deserializeUriNullableCollection), (r1v9 o.deserializeUriNullableCollection) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void abortClientHeartBeatSend() {
        deserializeUriNullableCollection deserializeurinullablecollection;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            deserializeurinullablecollection = this.clientSendHeartBeatTask;
            int i3 = 90 / 0;
            if (deserializeurinullablecollection != null) {
                deserializeurinullablecollection.dispose();
                int i4 = onExtraCallback + 103;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            deserializeurinullablecollection = this.clientSendHeartBeatTask;
            if (deserializeurinullablecollection != null) {
            }
        }
        scheduleClientHeartBeat();
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = -4039016368218411357L;
    }
}

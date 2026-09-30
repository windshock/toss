package org.java_websocket;

import java.nio.channels.NotYetConnectedException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import o.dw;
import o.fh;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class AbstractWebSocket extends WebSocketAdapter {
    private boolean IAuthTabCallback;
    private int onExtraCallback = 60;
    private Timer onExtraCallbackWithResult;
    private TimerTask onNavigationEvent;
    private boolean onWarmupCompleted;

    protected abstract Collection<dw> connections();

    public int getConnectionLostTimeout() {
        return this.onExtraCallback;
    }

    public void setConnectionLostTimeout(int i) {
        this.onExtraCallback = i;
        if (i <= 0) {
            stopConnectionLostTimer();
        }
        if (this.onExtraCallbackWithResult == null && this.onNavigationEvent == null) {
            return;
        }
        if (fh.onNavigationEvent) {
            System.out.println("Connection lost timer restarted");
        }
        restartConnectionLostTimer();
    }

    public void stopConnectionLostTimer() {
        if (this.onExtraCallbackWithResult == null && this.onNavigationEvent == null) {
            return;
        }
        if (fh.onNavigationEvent) {
            System.out.println("Connection lost timer stopped");
        }
        cancelConnectionLostTimer();
    }

    public void startConnectionLostTimer() {
        if (this.onExtraCallback <= 0) {
            if (fh.onNavigationEvent) {
                System.out.println("Connection lost timer deactivated");
            }
        } else {
            if (fh.onNavigationEvent) {
                System.out.println("Connection lost timer started");
            }
            restartConnectionLostTimer();
        }
    }

    private void restartConnectionLostTimer() {
        cancelConnectionLostTimer();
        this.onExtraCallbackWithResult = new Timer();
        TimerTask timerTask = new TimerTask() { // from class: org.java_websocket.AbstractWebSocket.4
            private ArrayList<dw> onWarmupCompleted = new ArrayList<>();

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() throws NotYetConnectedException {
                this.onWarmupCompleted.clear();
                this.onWarmupCompleted.addAll(AbstractWebSocket.this.connections());
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = AbstractWebSocket.this.onExtraCallback * 1500;
                Iterator<dw> it = this.onWarmupCompleted.iterator();
                while (it.hasNext()) {
                    dw next = it.next();
                    if (next instanceof fh) {
                        fh fhVar = (fh) next;
                        if (fhVar.onWarmupCompleted() < jCurrentTimeMillis - j) {
                            if (fh.onNavigationEvent) {
                                System.out.println("Closing connection due to no pong received: " + next.toString());
                            }
                            fhVar.onExtraCallbackWithResult(1006, false);
                        } else {
                            fhVar.IAuthTabCallbackStubProxy();
                        }
                    }
                }
                this.onWarmupCompleted.clear();
            }
        };
        this.onNavigationEvent = timerTask;
        Timer timer = this.onExtraCallbackWithResult;
        long j = this.onExtraCallback * 1000;
        timer.scheduleAtFixedRate(timerTask, j, j);
    }

    private void cancelConnectionLostTimer() {
        Timer timer = this.onExtraCallbackWithResult;
        if (timer != null) {
            timer.cancel();
            this.onExtraCallbackWithResult = null;
        }
        TimerTask timerTask = this.onNavigationEvent;
        if (timerTask != null) {
            timerTask.cancel();
            this.onNavigationEvent = null;
        }
    }

    public boolean isTcpNoDelay() {
        return this.IAuthTabCallback;
    }

    public void setTcpNoDelay(boolean z) {
        this.IAuthTabCallback = z;
    }

    public boolean isReuseAddr() {
        return this.onWarmupCompleted;
    }

    public void setReuseAddr(boolean z) {
        this.onWarmupCompleted = z;
    }
}

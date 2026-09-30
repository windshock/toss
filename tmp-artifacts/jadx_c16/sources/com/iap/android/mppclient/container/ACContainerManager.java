package com.iap.android.mppclient.container;

import com.iap.android.mppclient.container.event.ContainerPerformanceListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ACContainerManager {
    public static final ACContainerManager INSTANCE = new ACContainerManager();
    public static final String TAG = "ACContainerManager";
    public CopyOnWriteArrayList<ContainerPerformanceListener> performanceListeners = new CopyOnWriteArrayList<>();

    public static ACContainerManager getInstance() {
        return INSTANCE;
    }

    public void registerContainerEventListener(ContainerPerformanceListener containerPerformanceListener) {
        if (containerPerformanceListener == null) {
            return;
        }
        if (this.performanceListeners == null) {
            this.performanceListeners = new CopyOnWriteArrayList<>();
        }
        this.performanceListeners.add(containerPerformanceListener);
    }

    public void unRegisterContainerEventListener(ContainerPerformanceListener containerPerformanceListener) {
        CopyOnWriteArrayList<ContainerPerformanceListener> copyOnWriteArrayList = this.performanceListeners;
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.remove(containerPerformanceListener);
    }

    public CopyOnWriteArrayList<ContainerPerformanceListener> performanceListeners() {
        CopyOnWriteArrayList<ContainerPerformanceListener> copyOnWriteArrayList = this.performanceListeners;
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }
}

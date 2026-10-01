package com.iap.android.mppclient.container.event;

import com.iap.android.mppclient.container.IContainerPresenter;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ContainerEvent {
    public String action;
    public IContainerPresenter containerPresenter;
    public Map<String, Object> extras;
    public JSONObject params;

    public ContainerEvent(String str, IContainerPresenter iContainerPresenter) {
        this.action = str;
        this.containerPresenter = iContainerPresenter;
    }

    public String toString() {
        return "ContainerEvent{action='" + this.action + "', params=" + this.params + ", extras=" + this.extras + ", containerPresenter=" + this.containerPresenter + '}';
    }
}

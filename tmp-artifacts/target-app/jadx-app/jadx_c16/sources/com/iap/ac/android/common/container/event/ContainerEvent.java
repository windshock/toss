package com.iap.ac.android.common.container.event;

import com.iap.ac.android.common.a.a;
import com.iap.ac.android.common.container.IContainerPresenter;
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
        StringBuilder sbA = a.a("ContainerEvent{action='");
        sbA.append(this.action);
        sbA.append('\'');
        sbA.append(", params=");
        sbA.append(this.params);
        sbA.append(", extras=");
        sbA.append(this.extras);
        sbA.append(", containerPresenter=");
        sbA.append(this.containerPresenter);
        sbA.append('}');
        return sbA.toString();
    }
}

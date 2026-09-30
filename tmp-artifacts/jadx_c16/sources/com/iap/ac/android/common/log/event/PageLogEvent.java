package com.iap.ac.android.common.log.event;

import com.iap.ac.android.common.a.a;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PageLogEvent extends BaseLogEvent {
    public PageEvent event;
    public Object page;
    public String pageId;

    public PageLogEvent(String str, PageEvent pageEvent, Object obj, Map<String, String> map) {
        this.pageId = str;
        this.event = pageEvent;
        this.page = obj;
        ((BaseLogEvent) this).params = map;
    }

    public String toString() {
        StringBuilder sbA = a.a("PageLogEvent{page=");
        sbA.append(this.page);
        sbA.append(", event=");
        sbA.append(this.event);
        sbA.append(", pageId='");
        sbA.append(this.pageId);
        sbA.append('\'');
        sbA.append(", params=");
        sbA.append(((BaseLogEvent) this).params);
        sbA.append(", bizCode='");
        sbA.append(((BaseLogEvent) this).bizCode);
        sbA.append('\'');
        sbA.append('}');
        return sbA.toString();
    }
}

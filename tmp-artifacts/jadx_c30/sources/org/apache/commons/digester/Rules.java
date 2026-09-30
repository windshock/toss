package org.apache.commons.digester;

import java.util.List;
import o.PAGVideoAdListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface Rules {
    List<Rule> onExtraCallback();

    void onExtraCallbackWithResult(PAGVideoAdListener pAGVideoAdListener);

    List<Rule> onWarmupCompleted(String str, String str2);
}

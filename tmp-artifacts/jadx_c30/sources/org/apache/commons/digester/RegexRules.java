package org.apache.commons.digester;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.PAGNativeAdsLoadListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RegexRules extends PAGNativeAdsLoadListener {
    private RegexMatcher onNavigationEvent;
    private ArrayList<RegisteredRule> onWarmupCompleted;

    class RegisteredRule {
        Rule onExtraCallbackWithResult;
        String onWarmupCompleted;
    }

    @Override // org.apache.commons.digester.Rules
    public List<Rule> onWarmupCompleted(String str, String str2) {
        ArrayList arrayList = new ArrayList(this.onWarmupCompleted.size());
        Iterator<RegisteredRule> it = this.onWarmupCompleted.iterator();
        while (it.hasNext()) {
            RegisteredRule next = it.next();
            if (this.onNavigationEvent.onWarmupCompleted(str2, next.onWarmupCompleted)) {
                arrayList.add(next.onExtraCallbackWithResult);
            }
        }
        return arrayList;
    }

    @Override // org.apache.commons.digester.Rules
    public List<Rule> onExtraCallback() {
        ArrayList arrayList = new ArrayList(this.onWarmupCompleted.size());
        Iterator<RegisteredRule> it = this.onWarmupCompleted.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().onExtraCallbackWithResult);
        }
        return arrayList;
    }
}

package org.apache.commons.digester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.sf.scuba.smartcards.BuildConfig;
import o.PAGVideoAdListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RulesBase implements Rules {
    protected HashMap<String, List<Rule>> onNavigationEvent = new HashMap<>();
    protected PAGVideoAdListener onExtraCallbackWithResult = null;
    protected String onExtraCallback = null;
    protected ArrayList<Rule> IAuthTabCallback = new ArrayList<>();

    @Override // org.apache.commons.digester.Rules
    public void onExtraCallbackWithResult(PAGVideoAdListener pAGVideoAdListener) {
        this.onExtraCallbackWithResult = pAGVideoAdListener;
        Iterator<Rule> it = this.IAuthTabCallback.iterator();
        while (it.hasNext()) {
            it.next().IAuthTabCallback(pAGVideoAdListener);
        }
    }

    @Override // org.apache.commons.digester.Rules
    public List<Rule> onWarmupCompleted(String str, String str2) {
        List<Rule> listIAuthTabCallback = IAuthTabCallback(str, str2);
        if (listIAuthTabCallback == null || listIAuthTabCallback.size() <= 0) {
            String str3 = BuildConfig.FLAVOR;
            for (String str4 : this.onNavigationEvent.keySet()) {
                if (str4.startsWith("*/") && (str2.equals(str4.substring(2)) || str2.endsWith(str4.substring(1)))) {
                    if (str4.length() > str3.length()) {
                        listIAuthTabCallback = IAuthTabCallback(str, str4);
                        str3 = str4;
                    }
                }
            }
        }
        return listIAuthTabCallback == null ? new ArrayList() : listIAuthTabCallback;
    }

    @Override // org.apache.commons.digester.Rules
    public List<Rule> onExtraCallback() {
        return this.IAuthTabCallback;
    }

    protected List<Rule> IAuthTabCallback(String str, String str2) {
        List<Rule> list = this.onNavigationEvent.get(str2);
        if (list == null) {
            return null;
        }
        if (str == null || str.length() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Rule rule : list) {
            if (str.equals(rule.IAuthTabCallback()) || rule.IAuthTabCallback() == null) {
                arrayList.add(rule);
            }
        }
        return arrayList;
    }
}

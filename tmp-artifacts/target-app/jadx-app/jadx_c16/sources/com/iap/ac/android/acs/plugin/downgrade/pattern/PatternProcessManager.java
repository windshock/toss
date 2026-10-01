package com.iap.ac.android.acs.plugin.downgrade.pattern;

import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.downgrade.pattern.impl.EncodePatternProcessor;
import com.iap.ac.android.acs.plugin.downgrade.pattern.impl.PlaceholderPatternProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PatternProcessManager {
    public static final PatternProcessManager INSTANCE = new PatternProcessManager();
    private final List<IPatternProcessor> mPatternProcessors;

    private PatternProcessManager() {
        ArrayList arrayList = new ArrayList();
        this.mPatternProcessors = arrayList;
        arrayList.add(new PlaceholderPatternProcessor());
        arrayList.add(new EncodePatternProcessor());
    }

    public String processKeyword(@Nullable String str, @Nullable JSONObject jSONObject) {
        Iterator<IPatternProcessor> it = this.mPatternProcessors.iterator();
        while (it.hasNext()) {
            str = it.next().process(str, jSONObject);
        }
        return str;
    }
}

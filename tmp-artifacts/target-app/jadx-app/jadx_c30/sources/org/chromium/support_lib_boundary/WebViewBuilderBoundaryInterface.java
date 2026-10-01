package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface WebViewBuilderBoundaryInterface {
    WebView build(Context context, Consumer<BiConsumer<Integer, Object>> consumer);

    public static class Config implements Consumer<BiConsumer<Integer, Object>> {
        public String profileName;
        public boolean restrictJavascriptInterface;
        public int baseline = 0;
        List<Object> onExtraCallback = new ArrayList();
        Map<String, Boolean> onNavigationEvent = new LinkedHashMap();
        List<List<String>> IAuthTabCallback = new ArrayList();

        public void addJavascriptInterface(Object obj, String str, List<String> list) {
            if (this.onNavigationEvent.containsKey(str)) {
                throw new IllegalArgumentException("A duplicate JavaScript interface was provided for \"" + str + "\"");
            }
            this.onExtraCallback.add(obj);
            this.onNavigationEvent.put(str, Boolean.TRUE);
            this.IAuthTabCallback.add(list);
        }

        @Override // java.util.function.Consumer
        public void accept(BiConsumer<Integer, Object> biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(2, Boolean.valueOf(this.restrictJavascriptInterface));
            biConsumer.accept(1, new Object[]{this.onExtraCallback, new ArrayList(this.onNavigationEvent.keySet()), this.IAuthTabCallback});
            if (this.profileName != null) {
                biConsumer.accept(3, this.profileName);
            }
        }
    }
}

package o;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class pmi31 {
    public static String onExtraCallbackWithResult(String str, Collection<?> collection) {
        StringBuilder sb = new StringBuilder();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (!it.hasNext()) {
                break;
            }
            sb.append(str);
        }
        return sb.toString();
    }
}

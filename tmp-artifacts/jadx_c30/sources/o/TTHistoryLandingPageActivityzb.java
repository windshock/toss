package o;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTHistoryLandingPageActivityzb implements Comparator, Serializable {
    private static final TTHistoryLandingPageActivityzb onExtraCallbackWithResult = new TTHistoryLandingPageActivityzb();
    private static final long serialVersionUID = -291439688585137865L;

    public int hashCode() {
        return 1769708912;
    }

    public static TTHistoryLandingPageActivityzb onExtraCallback() {
        return onExtraCallbackWithResult;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo(obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && obj.getClass().equals(getClass());
        }
        return true;
    }
}

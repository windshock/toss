package o;

import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
abstract class TTHistoryLandingPageActivitysya {
    public boolean hasNext() {
        return false;
    }

    protected TTHistoryLandingPageActivitysya() {
    }

    public Object next() {
        throw new NoSuchElementException("Iterator contains no elements");
    }

    public void remove() {
        throw new IllegalStateException("Iterator contains no elements");
    }

    public Object onExtraCallbackWithResult() {
        throw new IllegalStateException("Iterator contains no elements");
    }
}

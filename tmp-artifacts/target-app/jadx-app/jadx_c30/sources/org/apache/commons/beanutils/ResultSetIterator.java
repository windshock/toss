package org.apache.commons.beanutils;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.TTHistoryLandingPageActivity7;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ResultSetIterator implements TTHistoryLandingPageActivity7, Iterator<TTHistoryLandingPageActivity7> {
    protected ResultSetDynaClass IAuthTabCallback;
    protected boolean onExtraCallback;
    protected boolean onNavigationEvent;

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            onExtraCallback();
            return !this.onExtraCallback;
        } catch (SQLException e) {
            throw new RuntimeException("hasNext():  SQLException:  " + e);
        }
    }

    @Override // java.util.Iterator
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public TTHistoryLandingPageActivity7 next() {
        try {
            onExtraCallback();
            if (this.onExtraCallback) {
                throw new NoSuchElementException();
            }
            this.onNavigationEvent = false;
            return this;
        } catch (SQLException e) {
            throw new RuntimeException("next():  SQLException:  " + e);
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove()");
    }

    protected void onExtraCallback() throws SQLException {
        if (this.onNavigationEvent || this.onExtraCallback) {
            return;
        }
        if (this.IAuthTabCallback.onNavigationEvent().next()) {
            this.onNavigationEvent = true;
            this.onExtraCallback = false;
        } else {
            this.onNavigationEvent = false;
            this.onExtraCallback = true;
        }
    }
}

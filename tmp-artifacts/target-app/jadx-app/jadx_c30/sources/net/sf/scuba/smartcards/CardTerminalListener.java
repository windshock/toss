package net.sf.scuba.smartcards;

import java.util.EventListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface CardTerminalListener extends EventListener {
    void cardInserted(CardEvent cardEvent);

    void cardRemoved(CardEvent cardEvent);
}

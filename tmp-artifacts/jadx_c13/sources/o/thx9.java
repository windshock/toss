package o;

import java.io.IOException;
import java.io.Reader;
import org.xml.sax.SAXException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface thx9 {
    void onNavigationEvent(Reader reader, thx10 thx10Var) throws SAXException, IOException;

    void onWarmupCompleted();

    void onWarmupCompleted(String str, String str2);
}

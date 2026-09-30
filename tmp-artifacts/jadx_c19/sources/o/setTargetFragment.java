package o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setTargetFragment extends ConcurrentHashMap<String, String> {
    public static final setTargetFragment onExtraCallbackWithResult = new setTargetFragment();
    private static final long serialVersionUID = 1;
    private final ReentrantLock lock;

    public setTargetFragment() {
        this(280, 0.8f, 4);
    }

    public setTargetFragment(int i2, float f, int i3) {
        super(i2, f, i3);
        this.lock = new ReentrantLock();
    }

    public String onNavigationEvent(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 280 && this.lock.tryLock()) {
            try {
                if (size() >= 280) {
                    clear();
                }
            } finally {
                this.lock.unlock();
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}

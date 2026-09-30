package o;

import java.util.Iterator;
import o.sya43;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface uh28 extends Iterator<sya43> {
    @Override // java.util.Iterator
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    sya43 next();

    sya43 onNavigationEvent();

    boolean onNavigationEvent(sya43.IAuthTabCallback iAuthTabCallback);
}

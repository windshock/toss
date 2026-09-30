package o;

import o.Loader;

/* loaded from: /tmp/toss_alldex/classes19.dex */
interface Loader<T extends Loader<T>> {
    T IAuthTabCallback();

    T onExtraCallback();

    void onExtraCallback(T t);

    void onNavigationEvent(T t);
}

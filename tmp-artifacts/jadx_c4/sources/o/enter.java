package o;

import im.toss.di.SearchSingletonModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enter implements captureStartValues<filterCommonResources> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        filterCommonResources filtercommonresourcesIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallback + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return filtercommonresourcesIAuthTabCallback;
    }

    public filterCommonResources IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        filterCommonResources filtercommonresourcesOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return filtercommonresourcesOnExtraCallbackWithResult;
    }

    public static filterCommonResources onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        filterCommonResources filtercommonresources = (filterCommonResources) createAnimator.onNavigationEvent(SearchSingletonModule.Companion.onExtraCallback());
        int i4 = onExtraCallback + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return filtercommonresources;
        }
        throw null;
    }
}

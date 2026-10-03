package viva.republica.toss.network.model.init.v2;

import o.NumberFormat;
import o.nativeFree;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class InitDataProviderModule {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    public static final InitDataProviderModule INSTANCE = new InitDataProviderModule();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    static {
        int i = onNavigationEvent + 117;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private InitDataProviderModule() {
    }

    public final nativeFree IAuthTabCallback() {
        int i = 2 % 2;
        NumberFormat numberFormat = new NumberFormat();
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return numberFormat;
    }
}

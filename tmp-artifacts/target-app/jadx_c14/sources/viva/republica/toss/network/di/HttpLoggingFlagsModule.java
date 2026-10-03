package viva.republica.toss.network.di;

import java.util.List;
import o.AdView;
import o.addPolicy;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class HttpLoggingFlagsModule {
    public static final HttpLoggingFlagsModule onExtraCallbackWithResult = new HttpLoggingFlagsModule();

    private HttpLoggingFlagsModule() {
    }

    public final List<AdView> onNavigationEvent() {
        return AdView.Companion.onWarmupCompleted(addPolicy.ITrustedWebActivityCallback().onWarmupCompleted("HTTP_LOGGING_FLAGS", AdView.FLIPPER.getBitValue()));
    }
}

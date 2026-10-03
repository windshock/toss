package viva.republica.toss.password;

import javax.inject.Singleton;
import o.CatalystInstanceImplInstanceCallback;
import o.isJacksonCreator;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AuthUiConfigModule {
    public static final AuthUiConfigModule onExtraCallback = new AuthUiConfigModule();

    private AuthUiConfigModule() {
    }

    @Singleton
    public final isJacksonCreator onWarmupCompleted() {
        return new CatalystInstanceImplInstanceCallback();
    }
}

package viva.republica.toss.network.model.onboarding;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class OnboardingStdConsentResponse$Companion {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public /* synthetic */ OnboardingStdConsentResponse$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OnboardingStdConsentResponse$Companion() {
    }

    public final KSerializer<OnboardingStdConsentResponse> serializer() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        OnboardingStdConsentResponse$$serializer onboardingStdConsentResponse$$serializer = OnboardingStdConsentResponse$$serializer.INSTANCE;
        int i4 = onNavigationEvent + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onboardingStdConsentResponse$$serializer;
        }
        throw null;
    }
}

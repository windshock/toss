package viva.republica.toss.network.model.onboarding;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class OnboardingTermsV2CodeRequest$Companion {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public /* synthetic */ OnboardingTermsV2CodeRequest$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OnboardingTermsV2CodeRequest$Companion() {
    }

    public final KSerializer<OnboardingTermsV2CodeRequest> serializer() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        OnboardingTermsV2CodeRequest$$serializer onboardingTermsV2CodeRequest$$serializer = OnboardingTermsV2CodeRequest$$serializer.INSTANCE;
        int i4 = IAuthTabCallback + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onboardingTermsV2CodeRequest$$serializer;
    }
}

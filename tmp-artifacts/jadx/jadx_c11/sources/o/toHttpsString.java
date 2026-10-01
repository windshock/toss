package o;

import im.toss.tds.compose.foundation.anim.rally.RallyModifierKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class toHttpsString {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, toFullSHA1Hash tofullsha1hash, setContentInsetsRelative setcontentinsetsrelative, int i, MaxInterstitialAd maxInterstitialAd, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 123;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        if ((i2 & 4) != 0) {
            int i7 = i5 + 79;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        }
        if ((i2 & 8) != 0) {
            maxInterstitialAd = new MaxInterstitialAd();
        }
        return onExtraCallbackWithResult(quirksExternalSyntheticBackport0, tofullsha1hash, setcontentinsetsrelative, i, maxInterstitialAd);
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull toFullSHA1Hash tofullsha1hash, @NotNull setContentInsetsRelative setcontentinsetsrelative, int i, @NotNull MaxInterstitialAd maxInterstitialAd) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(tofullsha1hash, "");
        Intrinsics.checkNotNullParameter(setcontentinsetsrelative, "");
        Intrinsics.checkNotNullParameter(maxInterstitialAd, "");
        Object obj = null;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = RallyModifierKt.onExtraCallback(quirksExternalSyntheticBackport0, maxInterstitialAd, null, 2, null).onExtraCallback(new isValidString(tofullsha1hash, setcontentinsetsrelative, null, i, maxInterstitialAd));
        int i3 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }
}

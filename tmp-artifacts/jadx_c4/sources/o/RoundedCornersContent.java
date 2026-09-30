package o;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class RoundedCornersContent implements RememberLottieCompositionKtawait22 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final setAnimationFromUrl IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted;

    public RoundedCornersContent(@NotNull Locale locale, @NotNull setAnimationFromUrl setanimationfromurl) {
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(setanimationfromurl, "");
        this.IAuthTabCallback = setanimationfromurl;
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(locale, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    @Override // o.RememberLottieCompositionKtawait22
    public setAnimationFromUrl onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 83;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        setAnimationFromUrl setanimationfromurl = this.IAuthTabCallback;
        int i5 = i2 + 1;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return setanimationfromurl;
        }
        throw null;
    }

    @Override // o.RememberLottieCompositionKtawait22
    public Long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback();
            obj.hashCode();
            throw null;
        }
        Long lOnExtraCallback = onExtraCallback();
        int i3 = onNavigationEvent + 65;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return lOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.RememberLottieCompositionKtawait22
    public Locale onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Locale localeIAuthTabCallback = IAuthTabCallback();
        int i3 = onNavigationEvent + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return localeIAuthTabCallback;
    }

    @Override // o.RememberLottieCompositionKtawait22
    public void onExtraCallbackWithResult(@Nullable Long l) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(l);
        int i4 = onNavigationEvent + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onWarmupCompleted(@NotNull Locale locale) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(locale, "");
            onExtraCallback(locale);
        } else {
            Intrinsics.checkNotNullParameter(locale, "");
            onExtraCallback(locale);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // o.RememberLottieCompositionKtawait22
    public void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent().onNavigationEvent(z);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // o.RememberLottieCompositionKtawait22
    public void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent().onExtraCallbackWithResult(z);
        if (i3 != 0) {
            throw null;
        }
    }

    private final Long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Long l = (Long) this.onWarmupCompleted.onExtraCallbackWithResult();
        int i4 = onExtraCallback + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(Long l) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.IAuthTabCallback(l);
            return;
        }
        this.onWarmupCompleted.IAuthTabCallback(l);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Locale IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Locale locale = (Locale) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return locale;
        }
        throw null;
    }

    private final void onExtraCallback(Locale locale) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult.IAuthTabCallback(locale);
        } else {
            this.onExtraCallbackWithResult.IAuthTabCallback(locale);
            throw null;
        }
    }
}

package o;

import im.toss.features.credit.data.response.QuizCta;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppDestroyPoint {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String IAuthTabCallback;
    private final AppExitPoint onExtraCallback;
    private final QuizCta onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 121;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof AppDestroyPoint)) {
            int i7 = i3 + 113;
            onExtraCallbackWithResult = i7 % 128;
            return i7 % 2 != 0;
        }
        AppDestroyPoint appDestroyPoint = (AppDestroyPoint) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, appDestroyPoint.onNavigationEvent)) {
            int i8 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.onExtraCallback == appDestroyPoint.onExtraCallback) {
            return Intrinsics.areEqual(this.IAuthTabCallback, appDestroyPoint.IAuthTabCallback);
        }
        int i10 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        QuizCta quizCta = this.onNavigationEvent;
        if (quizCta == null) {
            int i2 = onExtraCallbackWithResult + 115;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = quizCta.hashCode();
        }
        int iHashCode2 = (((iHashCode * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
        int i7 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CtaEvent(cta=" + this.onNavigationEvent + ", ctaType=" + this.onExtraCallback + ", serviceReferrer=" + this.IAuthTabCallback + ")";
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
        }
        return str;
    }

    public AppDestroyPoint(@Nullable QuizCta quizCta, @NotNull AppExitPoint appExitPoint, @NotNull String str) {
        Intrinsics.checkNotNullParameter(appExitPoint, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = quizCta;
        this.onExtraCallback = appExitPoint;
        this.IAuthTabCallback = str;
    }

    public final QuizCta onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        QuizCta quizCta = this.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return quizCta;
    }

    public final AppExitPoint onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        AppExitPoint appExitPoint = this.onExtraCallback;
        int i5 = i2 + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return appExitPoint;
    }
}

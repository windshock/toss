package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setProgressInternal {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg IAuthTabCallback;
    private final String onNavigationEvent;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final setProgressInternal onExtraCallbackWithResult = new setProgressInternal(null, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.UNKNOWN);

    public setProgressInternal(@Nullable String str, @NotNull r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg) {
        Intrinsics.checkNotNullParameter(r8lambdaimi1kkyy494wcpjbjziyxabnqtg, "");
        this.onNavigationEvent = str;
        this.IAuthTabCallback = r8lambdaimi1kkyy494wcpjbjziyxabnqtg;
    }

    public static final /* synthetic */ setProgressInternal onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 37;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setProgressInternal setprogressinternal = onExtraCallbackWithResult;
        int i5 = i2 + 115;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return setprogressinternal;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 113;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg = this.IAuthTabCallback;
        int i5 = i3 + 49;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdaimi1kkyy494wcpjbjziyxabnqtg;
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final setProgressInternal onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            setProgressInternal setprogressinternalOnExtraCallback = setProgressInternal.onExtraCallback();
            int i4 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return setprogressinternalOnExtraCallback;
        }
    }

    static {
        int i = onWarmupCompleted + 21;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}

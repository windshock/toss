package o;

import kotlin.UByte;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setLandingPage extends setCalculationMethod {
    private final boolean onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setLandingPage(@NotNull setPreProgressHundred setpreprogresshundred, boolean z) {
        super(setpreprogresshundred);
        Intrinsics.checkNotNullParameter(setpreprogresshundred, "");
        this.onWarmupCompleted = z;
    }

    @Override // o.setCalculationMethod
    public void onExtraCallback(int i) {
        boolean z = this.onWarmupCompleted;
        String string = Long.toString(UInt.m35constructorimpl(i) & 4294967295L, 10);
        if (z) {
            onExtraCallback(string);
        } else {
            onExtraCallbackWithResult(string);
        }
    }

    @Override // o.setCalculationMethod
    public void onExtraCallbackWithResult(long j) {
        boolean z = this.onWarmupCompleted;
        long jOnExtraCallback = access13000.onExtraCallback(j);
        if (z) {
            onExtraCallback(getTemplateInfo.onWarmupCompleted(jOnExtraCallback, 10));
        } else {
            onExtraCallbackWithResult(getTemplateInfo.onWarmupCompleted(jOnExtraCallback, 10));
        }
    }

    @Override // o.setCalculationMethod
    public void onExtraCallback(byte b) {
        boolean z = this.onWarmupCompleted;
        String strIAuthTabCallback = UByte.IAuthTabCallback(UByte.m34constructorimpl(b));
        if (z) {
            onExtraCallback(strIAuthTabCallback);
        } else {
            onExtraCallbackWithResult(strIAuthTabCallback);
        }
    }

    @Override // o.setCalculationMethod
    public void onNavigationEvent(short s) {
        boolean z = this.onWarmupCompleted;
        String strIAuthTabCallback = getU64.IAuthTabCallback(getU64.onNavigationEvent(s));
        if (z) {
            onExtraCallback(strIAuthTabCallback);
        } else {
            onExtraCallbackWithResult(strIAuthTabCallback);
        }
    }
}

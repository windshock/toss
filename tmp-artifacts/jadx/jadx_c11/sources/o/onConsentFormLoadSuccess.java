package o;

import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onConsentFormLoadSuccess implements AFd1ySDK {
    private static int IAuthTabCallbackStub = 1;
    public static final int onExtraCallbackWithResult = TermsAndPrivacyPolicyFlowSettingsImpl.onExtraCallbackWithResult;
    private static int onNavigationEvent = 0;
    private static int onTransact = 0;
    private static int onWarmupCompleted = 1;
    private final getPrivacyPolicyUri IAuthTabCallback;
    private final TermsAndPrivacyPolicyFlowSettingsImpl onExtraCallback;

    static {
        int i = onWarmupCompleted + 59;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 56 / 0;
        }
    }

    @Inject
    public onConsentFormLoadSuccess(@NotNull TermsAndPrivacyPolicyFlowSettingsImpl termsAndPrivacyPolicyFlowSettingsImpl, @NotNull getPrivacyPolicyUri getprivacypolicyuri) {
        Intrinsics.checkNotNullParameter(termsAndPrivacyPolicyFlowSettingsImpl, "");
        Intrinsics.checkNotNullParameter(getprivacypolicyuri, "");
        this.onExtraCallback = termsAndPrivacyPolicyFlowSettingsImpl;
        this.IAuthTabCallback = getprivacypolicyuri;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final getDebugUserGeography onExtraCallbackWithResult() {
        getDebugUserGeography getdebugusergeographyOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            getdebugusergeographyOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
            int i3 = 59 / 0;
            if (getdebugusergeographyOnExtraCallbackWithResult == null) {
                getdebugusergeographyOnExtraCallbackWithResult = this.IAuthTabCallback;
            }
        } else {
            getdebugusergeographyOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
            if (getdebugusergeographyOnExtraCallbackWithResult == null) {
            }
        }
        int i4 = onTransact + 113;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return getdebugusergeographyOnExtraCallbackWithResult;
    }

    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getDebugUserGeography getdebugusergeographyOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (i3 != 0) {
            return getdebugusergeographyOnExtraCallbackWithResult.onTransact();
        }
        getdebugusergeographyOnExtraCallbackWithResult.onTransact();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

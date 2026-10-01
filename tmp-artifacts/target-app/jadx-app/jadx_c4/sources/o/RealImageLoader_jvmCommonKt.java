package o;

import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealImageLoader_jvmCommonKt {
    private static int IAuthTabCallback = 1;
    private static final AppSetIdAndScope1 onExtraCallback = ea10.onExtraCallbackWithResult("FileCache");
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 101;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final AppSetIdAndScope1 onNavigationEvent() {
        AppSetIdAndScope1 appSetIdAndScope1;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            appSetIdAndScope1 = onExtraCallback;
            int i4 = 72 / 0;
        } else {
            appSetIdAndScope1 = onExtraCallback;
        }
        int i5 = i3 + 63;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return appSetIdAndScope1;
    }

    public static final String onNavigationEvent(@NotNull String str) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            setTextProgressMargin<MessageDigest> settextprogressmarginOnNavigationEvent = setTextProgressSize.onWarmupCompleted.onWarmupCompleted().onNavigationEvent();
            MessageDigest messageDigestOnWarmupCompleted = settextprogressmarginOnNavigationEvent.onWarmupCompleted();
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            String strOnWarmupCompleted = IsEnabled.onExtraCallback().onWarmupCompleted(messageDigestOnWarmupCompleted.digest(bytes));
            settextprogressmarginOnNavigationEvent.close();
            Intrinsics.checkNotNull(strOnWarmupCompleted);
            int i4 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return strOnWarmupCompleted;
        } catch (NoSuchAlgorithmException e) {
            auth.IAuthTabCallback(-1588674344, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{auth.onNavigationEvent, e, null, 2, null}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1588674346, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
            return "";
        }
    }
}

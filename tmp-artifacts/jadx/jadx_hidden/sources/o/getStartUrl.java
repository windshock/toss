package o;

import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class getStartUrl {
    static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(getStartUrl.class);
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final getExtensionManager onWarmupCompleted;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~i3;
        int i10 = (~(i7 | i8 | i9)) | (~(i6 | i4));
        int i11 = ~(i3 | i4);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i4);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i6 + i4 + i5 + (1349231875 * i2) + (1735201104 * i);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i6) + 1558183936 + (237349861 * i4) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i5) + ((-1337982976) * i2) + (469762048 * i) + (1272971264 * i16);
        int i18 = ((i6 * 236314795) - 374860141) + (i4 * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i5 * 236313959) + (i2 * (-66979019)) + (i * (-1872492752)) + (i16 * (-417333248));
        int i19 = i17 + (i18 * i18 * 639631360);
        return i19 != 1 ? i19 != 2 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public getStartUrl(@NotNull getExtensionManager getextensionmanager, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(getextensionmanager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onWarmupCompleted = getextensionmanager;
        this.IAuthTabCallback = str;
        this.onExtraCallback = str2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getStartUrl getstarturl = (getStartUrl) objArr[0];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5391);
        getExtensionManager getextensionmanager = getstarturl.onWarmupCompleted;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(338);
        return getextensionmanager;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getStartUrl getstarturl = (getStartUrl) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3684);
        int i3 = (((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 14) & 1;
        String str = getstarturl.onExtraCallback;
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z;
        getStartUrl getstarturl = (getStartUrl) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(894);
        if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 2) & 1) != 0) {
            boolean zAreEqual = Intrinsics.areEqual(getstarturl.IAuthTabCallback, getstarturl.onExtraCallback);
            z = ((~(zAreEqual ? 1 : 0)) & 1) ^ ((zAreEqual ? 1 : 0) & (-2));
        } else {
            boolean zAreEqual2 = Intrinsics.areEqual(getstarturl.IAuthTabCallback, getstarturl.onExtraCallback);
            int i3 = (zAreEqual2 ? 1 : 0) & 1;
            z = ((!zAreEqual2 ? 1 : 0) | i3) & (~i3);
        }
        return Boolean.valueOf(z);
    }

    public final String onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (String) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, -462396799, iOnExtraCallbackWithResult2, 462396801, new Object[]{this});
    }

    public final getExtensionManager onNavigationEvent() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (getExtensionManager) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, -1501562886, iOnExtraCallbackWithResult2, 1501562887, new Object[]{this});
    }

    public final boolean onWarmupCompleted() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, -501742428, iOnExtraCallbackWithResult2, 501742428, new Object[]{this})).booleanValue();
    }
}

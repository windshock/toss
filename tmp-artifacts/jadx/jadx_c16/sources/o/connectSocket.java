package o;

import im.toss.features.faceverify.impl.domain.usecase.register.RegisterFaceImageUseCase;
import im.toss.features.faceverify.impl.ui.register.FaceRegisterActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class connectSocket implements setSize<FaceRegisterActivity> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static void onExtraCallbackWithResult(FaceRegisterActivity faceRegisterActivity, RegisterFaceImageUseCase registerFaceImageUseCase) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        faceRegisterActivity.registerFaceImageUseCase = registerFaceImageUseCase;
        int i4 = onExtraCallback + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onWarmupCompleted(FaceRegisterActivity faceRegisterActivity, appIsMiniService appisminiservice) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        faceRegisterActivity.initializeFaceRegisterUseCase = appisminiservice;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onExtraCallbackWithResult(FaceRegisterActivity faceRegisterActivity, hasTinyLocalStorage hastinylocalstorage) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        faceRegisterActivity.imageValidationSdk = hastinylocalstorage;
        int i4 = onExtraCallback + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}

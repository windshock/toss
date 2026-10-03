package o;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.Intrinsics;
import o.UST_CMS_EnvelopedDataWithEncryptKey;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_EnvelopedDataWithEncryptKey extends UST_CRYPT_VerifyHASH implements UST_PKCS12_GetCertWithPFX {
    private final LottieAnimationView extraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMS_EnvelopedDataWithEncryptKey(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.extraCallback = (LottieAnimationView) view;
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CMS_EncryptedDataWithEncryptKey uST_CMS_EncryptedDataWithEncryptKey = (UST_CMS_EncryptedDataWithEncryptKey) uST_CMS_EncryptedData;
        this.extraCallback.setImageAssetsFolder("lottie/images");
        this.extraCallback.setBackgroundColor(uST_CMS_EncryptedDataWithEncryptKey.onNavigationEvent());
        this.extraCallback.setAnimationFromUrl(uST_CMS_EncryptedDataWithEncryptKey.onExtraCallbackWithResult());
        if (uST_CMS_EncryptedDataWithEncryptKey.onWarmupCompleted()) {
            this.extraCallback.setRepeatCount(-1);
        } else {
            this.extraCallback.setRepeatCount(1);
        }
    }

    @Override // o.UST_PKCS12_GetCertWithPFX
    public void onWarmupCompleted() {
        this.extraCallback.setProgress(0.0f);
        this.extraCallback.postDelayed(new Runnable() { // from class: viva.republica.toss.credit.commons.LottieViewHolder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UST_CMS_EnvelopedDataWithEncryptKey.onNavigationEvent(this.f$0);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(UST_CMS_EnvelopedDataWithEncryptKey uST_CMS_EnvelopedDataWithEncryptKey) {
        uST_CMS_EnvelopedDataWithEncryptKey.extraCallback.playAnimation();
    }

    @Override // o.UST_PKCS12_GetCertWithPFX
    public void onNavigationEvent() {
        this.extraCallback.setProgress(1.0f);
        this.extraCallback.cancelAnimation();
    }
}

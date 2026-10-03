package o;

import android.view.View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_Sign extends UST_CRYPT_VerifyHASH {
    private final BaseTextView extraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CRYPT_Sign(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.extraCallback = view.findViewById(R.id.text);
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CRYPT_SetAsymmetricKey uST_CRYPT_SetAsymmetricKey = (UST_CRYPT_SetAsymmetricKey) uST_CMS_EncryptedData;
        this.extraCallback.setText(uST_CRYPT_SetAsymmetricKey.onExtraCallbackWithResult());
        Function1<BaseTextView, Unit> function1OnNavigationEvent = uST_CRYPT_SetAsymmetricKey.onNavigationEvent();
        if (function1OnNavigationEvent != null) {
            BaseTextView baseTextView = this.extraCallback;
            Intrinsics.checkNotNullExpressionValue(baseTextView, "");
            function1OnNavigationEvent.invoke(baseTextView);
        }
    }
}

package o;

import android.view.View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_GenerateKeyPair extends UST_CRYPT_VerifyHASH {
    private final BaseTextView ICustomTabsCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CRYPT_GenerateKeyPair(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.ICustomTabsCallback = view.findViewById(R.id.text);
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CRYPT_GenerateKey uST_CRYPT_GenerateKey = uST_CMS_EncryptedData instanceof UST_CRYPT_GenerateKey ? (UST_CRYPT_GenerateKey) uST_CMS_EncryptedData : null;
        if (uST_CRYPT_GenerateKey == null) {
            return;
        }
        this.ICustomTabsCallback.setText(uST_CRYPT_GenerateKey.onNavigationEvent());
        Function1<BaseTextView, Unit> function1OnWarmupCompleted = uST_CRYPT_GenerateKey.onWarmupCompleted();
        BaseTextView baseTextView = this.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(baseTextView, "");
        function1OnWarmupCompleted.invoke(baseTextView);
    }
}

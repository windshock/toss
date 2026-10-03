package o;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Player;
import im.toss.uikit.widget.Banner;
import im.toss.uikit.widget.SafePlayerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.credit.commons.BannerViewHolder$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Issue_MakePOPOTbsMsg extends UST_CRYPT_VerifyHASH implements UST_PKCS12_GetCertWithPFX {
    private Banner ICustomTabsCallback;
    private boolean extraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMP_Issue_MakePOPOTbsMsg(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        view.setOnClickListener(new BannerViewHolder$.ExternalSyntheticLambda0(this));
        this.ICustomTabsCallback = view instanceof Banner ? (Banner) view : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(UST_CMP_Issue_MakePOPOTbsMsg uST_CMP_Issue_MakePOPOTbsMsg, View view) {
        uST_CMP_Issue_MakePOPOTbsMsg.onExtraCallbackWithResult();
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        Banner banner = ((RecyclerView.ViewHolder) this).onNavigationEvent;
        Banner banner2 = banner instanceof Banner ? banner : null;
        if (banner2 != null) {
            UST_CMP_Issue_GenmGenp uST_CMP_Issue_GenmGenp = (UST_CMP_Issue_GenmGenp) uST_CMS_EncryptedData;
            this.extraCallback = uST_CMP_Issue_GenmGenp.onExtraCallbackWithResult();
            uST_CMP_Issue_GenmGenp.onNavigationEvent().invoke(banner2);
            TextView textViewOnNavigationEvent = banner2.onNavigationEvent();
            if (textViewOnNavigationEvent == null) {
                textViewOnNavigationEvent = null;
            }
            if (textViewOnNavigationEvent != null) {
                textViewOnNavigationEvent.setTextSize(2, 19.0f);
            }
            TextView textViewOnExtraCallback = banner2.onExtraCallback();
            TextView textView = textViewOnExtraCallback != null ? textViewOnExtraCallback : null;
            if (textView != null) {
                textView.setTextSize(2, 13.0f);
            }
        }
    }

    @Override // o.UST_PKCS12_GetCertWithPFX
    public void onWarmupCompleted() {
        Banner banner;
        SafePlayerView safePlayerViewOnExtraCallbackWithResult;
        Player player;
        if (!this.extraCallback || (banner = this.ICustomTabsCallback) == null || (safePlayerViewOnExtraCallbackWithResult = banner.onExtraCallbackWithResult()) == null || (player = safePlayerViewOnExtraCallbackWithResult.getPlayer()) == null) {
            return;
        }
        player.setPlayWhenReady(true);
    }

    @Override // o.UST_PKCS12_GetCertWithPFX
    public void onNavigationEvent() {
        Banner banner;
        SafePlayerView safePlayerViewOnExtraCallbackWithResult;
        Player player;
        if (!this.extraCallback || (banner = this.ICustomTabsCallback) == null || (safePlayerViewOnExtraCallbackWithResult = banner.onExtraCallbackWithResult()) == null || (player = safePlayerViewOnExtraCallbackWithResult.getPlayer()) == null) {
            return;
        }
        player.setPlayWhenReady(false);
    }
}

package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class UST_CRYPT_VerifyHASH extends RecyclerView.ViewHolder implements UST_CRYPT_VerifyMAC<UST_CMS_EncryptedData> {
    public static final int writeTypedObject = 8;
    private long ICustomTabsCallback;
    private UST_CMP_Revoke_MakeRrContent extraCallback;
    private getTimestampBytes<Long> onPostMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CRYPT_VerifyHASH(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.ICustomTabsCallback = -1L;
    }

    @Override // o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        this.ICustomTabsCallback = uST_CMS_EncryptedData.onExtraCallback();
    }

    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData, @NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        Intrinsics.checkNotNullParameter(list, "");
        IAuthTabCallback(uST_CMS_EncryptedData);
    }

    public void onExtraCallbackWithResult() {
        getTimestampBytes<Long> gettimestampbytes = this.onPostMessage;
        if (gettimestampbytes != null) {
            gettimestampbytes.onExtraCallback(Long.valueOf(this.ICustomTabsCallback));
        }
    }

    public final void onNavigationEvent(@NotNull getTimestampBytes<Long> gettimestampbytes) {
        Intrinsics.checkNotNullParameter(gettimestampbytes, "");
        this.onPostMessage = gettimestampbytes;
    }

    public final void onExtraCallbackWithResult(@NotNull UST_CMP_Revoke_MakeRrContent uST_CMP_Revoke_MakeRrContent) {
        Intrinsics.checkNotNullParameter(uST_CMP_Revoke_MakeRrContent, "");
        this.extraCallback = uST_CMP_Revoke_MakeRrContent;
    }
}

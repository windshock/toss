package o;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_RevokeCertificate extends DiffUtil.Callback {
    private final UST_CMP_Revoke_MakeRrContent onExtraCallback;
    private final List<UST_CMS_EncryptedData> onExtraCallbackWithResult;

    /* JADX WARN: Multi-variable type inference failed */
    public UST_CMP_RevokeCertificate(@NotNull UST_CMP_Revoke_MakeRrContent uST_CMP_Revoke_MakeRrContent, @NotNull List<? extends UST_CMS_EncryptedData> list) {
        Intrinsics.checkNotNullParameter(uST_CMP_Revoke_MakeRrContent, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallback = uST_CMP_Revoke_MakeRrContent;
        this.onExtraCallbackWithResult = list;
    }

    public boolean areItemsTheSame(int i, int i2) {
        Long lIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(i);
        return (lIAuthTabCallback != null ? lIAuthTabCallback.longValue() : -1L) == this.onExtraCallbackWithResult.get(i2).onExtraCallback();
    }

    public int getOldListSize() {
        return this.onExtraCallback.getItemCount();
    }

    public int getNewListSize() {
        return this.onExtraCallbackWithResult.size();
    }

    public boolean areContentsTheSame(int i, int i2) {
        UST_CMS_EncryptedData uST_CMS_EncryptedDataOnExtraCallback = this.onExtraCallback.onExtraCallback(i);
        UST_CMS_EncryptedData uST_CMS_EncryptedData = this.onExtraCallbackWithResult.get(i2);
        if ((uST_CMS_EncryptedDataOnExtraCallback instanceof UST_CMP_UpdateCertificate_NoConf) && (uST_CMS_EncryptedData instanceof UST_CMP_UpdateCertificate_NoConf)) {
            return ((UST_CMP_UpdateCertificate_NoConf) uST_CMS_EncryptedDataOnExtraCallback).IAuthTabCallback() == ((UST_CMP_UpdateCertificate_NoConf) uST_CMS_EncryptedData).IAuthTabCallback();
        }
        return (uST_CMS_EncryptedDataOnExtraCallback != null ? uST_CMS_EncryptedDataOnExtraCallback.onExtraCallback() : -1L) == uST_CMS_EncryptedData.onExtraCallback();
    }

    public Object getChangePayload(int i, int i2) {
        return "changed";
    }
}

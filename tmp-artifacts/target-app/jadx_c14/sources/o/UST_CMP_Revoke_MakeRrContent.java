package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import java.util.HashMap;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class UST_CMP_Revoke_MakeRrContent extends UST_CMP_UpdateCertificate<UST_CRYPT_VerifyHASH, UST_CMS_EncryptedData> {
    public static final int onWarmupCompleted = 8;
    private final HashMap<Integer, UST_CRYPT_VerifySignEX> onNavigationEvent = new HashMap<>();
    private final HashMap<String, Object> IAuthTabCallback = new HashMap<>();

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NotImplementedError */
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public UST_CRYPT_VerifyHASH onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) throws NotImplementedError {
        UST_CRYPT_VerifyHASH uST_CRYPT_VerifyHASHOnExtraCallbackWithResult;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        UST_CRYPT_VerifySignEX uST_CRYPT_VerifySignEX = this.onNavigationEvent.get(Integer.valueOf(i));
        if (uST_CRYPT_VerifySignEX != null && (uST_CRYPT_VerifyHASHOnExtraCallbackWithResult = uST_CRYPT_VerifySignEX.onExtraCallbackWithResult(viewGroup, IAuthTabCallback(), this)) != null) {
            return uST_CRYPT_VerifyHASHOnExtraCallbackWithResult;
        }
        throw new NotImplementedError("No blueprint for " + i);
    }

    public final void onNavigationEvent(@NotNull UST_CMP_Issue_MakePOPOSigningInputMsg uST_CMP_Issue_MakePOPOSigningInputMsg) {
        Intrinsics.checkNotNullParameter(uST_CMP_Issue_MakePOPOSigningInputMsg, "");
        for (Pair pair : access8100.onExtraCallback(uST_CMP_Issue_MakePOPOSigningInputMsg.onExtraCallback())) {
            this.onNavigationEvent.put(pair.getFirst(), pair.getSecond());
        }
    }

    @Override // o.UST_CMP_UpdateCertificate
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull UST_CRYPT_VerifyHASH uST_CRYPT_VerifyHASH, int i, @NotNull List<Object> list) {
        Intrinsics.checkNotNullParameter(uST_CRYPT_VerifyHASH, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (i >= 0 && i < onWarmupCompleted().size()) {
            uST_CRYPT_VerifyHASH.IAuthTabCallback(onWarmupCompleted().get(i), list);
        } else if (zzaj.onNavigationEvent().onActivityLayout()) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // o.UST_CMP_UpdateCertificate
    public void onWarmupCompleted(@NotNull List<? extends UST_CMS_EncryptedData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        DiffUtil.IAuthTabCallback IAuthTabCallback = DiffUtil.IAuthTabCallback(new UST_CMP_RevokeCertificate(this, list));
        Intrinsics.checkNotNullExpressionValue(IAuthTabCallback, "");
        onWarmupCompleted().clear();
        onWarmupCompleted().addAll(list);
        IAuthTabCallback.onNavigationEvent(this);
    }
}

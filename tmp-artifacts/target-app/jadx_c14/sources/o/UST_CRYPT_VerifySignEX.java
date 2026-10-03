package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_VerifySignEX {
    private final int onExtraCallbackWithResult;
    private final Class<? extends UST_CRYPT_VerifyHASH> onNavigationEvent;

    public UST_CRYPT_VerifySignEX(int i, @NotNull Class<? extends UST_CRYPT_VerifyHASH> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        this.onExtraCallbackWithResult = i;
        this.onNavigationEvent = cls;
    }

    public final UST_CRYPT_VerifyHASH onExtraCallbackWithResult(@NotNull ViewGroup viewGroup, @NotNull getTimestampBytes<Long> gettimestampbytes, @NotNull UST_CMP_Revoke_MakeRrContent uST_CMP_Revoke_MakeRrContent) throws Exception {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(gettimestampbytes, "");
        Intrinsics.checkNotNullParameter(uST_CMP_Revoke_MakeRrContent, "");
        try {
            UST_CRYPT_VerifyHASH uST_CRYPT_VerifyHASHNewInstance = this.onNavigationEvent.getConstructor(View.class).newInstance(transparentBackground.onNavigationEvent(viewGroup, this.onExtraCallbackWithResult, false));
            Intrinsics.checkNotNull(uST_CRYPT_VerifyHASHNewInstance, "");
            UST_CRYPT_VerifyHASH uST_CRYPT_VerifyHASH = uST_CRYPT_VerifyHASHNewInstance;
            uST_CRYPT_VerifyHASH.onNavigationEvent(gettimestampbytes);
            uST_CRYPT_VerifyHASH.onExtraCallbackWithResult(uST_CMP_Revoke_MakeRrContent);
            return uST_CRYPT_VerifyHASH;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CreditBaseAdapter2", "inflateException caused by :: " + e.getMessage(), e, (Map) null, 8, (Object) null);
            if (zzaj.onNavigationEvent().onActivityLayout()) {
                throw e;
            }
            return new UST_CMP_UpdateCertificate_SendConf(new View(viewGroup.getContext()));
        }
    }
}

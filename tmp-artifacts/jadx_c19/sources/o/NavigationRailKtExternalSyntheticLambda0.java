package o;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class NavigationRailKtExternalSyntheticLambda0 extends ModalBottomSheetKtExternalSyntheticLambda5 {
    public final String onExtraCallback;
    public final String onExtraCallbackWithResult;

    public NavigationRailKtExternalSyntheticLambda0(String str, @Nullable String str2, String str3) {
        super(str);
        this.onExtraCallback = str2;
        this.onExtraCallbackWithResult = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NavigationRailKtExternalSyntheticLambda0.class != obj.getClass()) {
            return false;
        }
        NavigationRailKtExternalSyntheticLambda0 navigationRailKtExternalSyntheticLambda0 = (NavigationRailKtExternalSyntheticLambda0) obj;
        return this.asBinder.equals(navigationRailKtExternalSyntheticLambda0.asBinder) && Objects.equals(this.onExtraCallback, navigationRailKtExternalSyntheticLambda0.onExtraCallback) && Objects.equals(this.onExtraCallbackWithResult, navigationRailKtExternalSyntheticLambda0.onExtraCallbackWithResult);
    }

    public int hashCode() {
        int iHashCode = this.asBinder.hashCode();
        String str = this.onExtraCallback;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.onExtraCallbackWithResult;
        return ((((iHashCode + 527) * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // o.ModalBottomSheetKtExternalSyntheticLambda5
    public String toString() {
        return this.asBinder + ": url=" + this.onExtraCallbackWithResult;
    }
}

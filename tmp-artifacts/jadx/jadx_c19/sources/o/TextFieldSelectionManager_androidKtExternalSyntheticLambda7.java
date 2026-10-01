package o;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionManager_androidKtExternalSyntheticLambda7 implements HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback {
    public final List<IAuthTabCallback> IAuthTabCallback;
    public final String onNavigationEvent;
    public final String onWarmupCompleted;

    public TextFieldSelectionManager_androidKtExternalSyntheticLambda7(@Nullable String str, @Nullable String str2, List<IAuthTabCallback> list) {
        this.onWarmupCompleted = str;
        this.onNavigationEvent = str2;
        this.IAuthTabCallback = Collections.unmodifiableList(new ArrayList(list));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.onWarmupCompleted != null) {
            str = " [" + this.onWarmupCompleted + ", " + this.onNavigationEvent + "]";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldSelectionManager_androidKtExternalSyntheticLambda7.class != obj.getClass()) {
            return false;
        }
        TextFieldSelectionManager_androidKtExternalSyntheticLambda7 textFieldSelectionManager_androidKtExternalSyntheticLambda7 = (TextFieldSelectionManager_androidKtExternalSyntheticLambda7) obj;
        return TextUtils.equals(this.onWarmupCompleted, textFieldSelectionManager_androidKtExternalSyntheticLambda7.onWarmupCompleted) && TextUtils.equals(this.onNavigationEvent, textFieldSelectionManager_androidKtExternalSyntheticLambda7.onNavigationEvent) && this.IAuthTabCallback.equals(textFieldSelectionManager_androidKtExternalSyntheticLambda7.IAuthTabCallback);
    }

    public int hashCode() {
        String str = this.onWarmupCompleted;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.onNavigationEvent;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.IAuthTabCallback.hashCode();
    }
}

package o;

import android.widget.TextView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Revoke_Rp {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(TextView textView, String str, Integer num) {
        textView.setText(str);
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
    }
}

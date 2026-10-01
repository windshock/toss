package o;

import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class AlertDialogKtExternalSyntheticLambda7 implements BackdropScaffoldKtExternalSyntheticLambda2<AlertDialogKtExternalSyntheticLambda7> {
    public final boolean onActivityLayout;
    public final List<String> onMessageChannelReady;
    public final String onPostMessage;

    protected AlertDialogKtExternalSyntheticLambda7(String str, List<String> list, boolean z) {
        this.onPostMessage = str;
        this.onMessageChannelReady = Collections.unmodifiableList(list);
        this.onActivityLayout = z;
    }
}

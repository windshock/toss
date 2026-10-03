package o;

import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.plcc.PlccSimpleIssueOptionResp;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface getHints {
    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @initCertListOnMemory(onExtraCallbackWithResult = "https://storage-fe.toss.im/card-issue/plcc-simple-issue-options.json")
    Object onWarmupCompleted(@NotNull access13800<? super PlccSimpleIssueOptionResp> access13800Var);
}

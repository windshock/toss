package viva.republica.toss.ads;

import java.util.Map;
import kotlin.Unit;
import o.access13800;
import o.getIv8;
import o.getUserCertList;
import o.initCertList;
import o.setCurCert;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface RedirectionEventApi {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/ads-event-receiver/redirection/app-landing")
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "key-user-no") long j, @initCertList(onExtraCallbackWithResult = "X-Toss-RequestTs") @NotNull String str, @getUserCertList @NotNull Map<String, String> map, @NotNull access13800<? super Unit> access13800Var);
}

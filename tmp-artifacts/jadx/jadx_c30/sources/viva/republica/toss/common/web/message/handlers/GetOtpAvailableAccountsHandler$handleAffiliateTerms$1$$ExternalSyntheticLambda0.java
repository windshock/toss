package viva.republica.toss.common.web.message.handlers;

import com.google.gson.JsonObject;
import im.toss.core.webkit.WebViewContentOwner;
import o.getNotBefore;
import o.onSessionEnded;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.setTopGuideBackgroundColor;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class GetOtpAvailableAccountsHandler$handleAffiliateTerms$1$$ExternalSyntheticLambda0 implements onSessionEnded {
    public final /* synthetic */ getNotBefore f$0;
    public final /* synthetic */ WebViewContentOwner f$1;
    public final /* synthetic */ setTopGuideBackgroundColor f$2;
    public final /* synthetic */ JsonObject f$3;

    public /* synthetic */ GetOtpAvailableAccountsHandler$handleAffiliateTerms$1$$ExternalSyntheticLambda0(getNotBefore getnotbefore, WebViewContentOwner webViewContentOwner, setTopGuideBackgroundColor settopguidebackgroundcolor, JsonObject jsonObject) {
        this.f$0 = getnotbefore;
        this.f$1 = webViewContentOwner;
        this.f$2 = settopguidebackgroundcolor;
        this.f$3 = jsonObject;
    }

    public final void onActivityResult(Object obj) {
        getNotBefore.onExtraCallbackWithResult.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
    }
}

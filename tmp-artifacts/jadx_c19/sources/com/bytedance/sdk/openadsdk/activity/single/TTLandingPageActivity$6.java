package com.bytedance.sdk.openadsdk.activity.single;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.jw.fby;
import com.bytedance.sdk.component.utils.zb;
import com.bytedance.sdk.openadsdk.common.thx;
import com.bytedance.sdk.openadsdk.common.thx$ycx;
import com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TTLandingPageActivity$6 implements View.OnClickListener {
    final /* synthetic */ thx ycx;
    final /* synthetic */ TTLandingPageActivity zb;

    TTLandingPageActivity$6(TTLandingPageActivity tTLandingPageActivity, thx thxVar) {
        this.zb = tTLandingPageActivity;
        this.ycx = thxVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.ycx.setOnMenuItemClickListener(new thx$ycx() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity$6.1
            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void ycx() {
                if (TTLandingPageActivity.ea(TTLandingPageActivity$6.this.zb) != null) {
                    sya.ycx().ycx(TTLandingPageActivity.ea(TTLandingPageActivity$6.this.zb));
                }
                zb.ycx(TTLandingPageActivity$6.this.zb, new Intent((Context) TTLandingPageActivity$6.this.zb, (Class<?>) TTHistoryActivity.class), (zb.zb) null);
                TTLandingPageActivity.ycx(TTLandingPageActivity$6.this.zb, "onSelectHistory");
                TTLandingPageActivity$6.this.ycx.ycx();
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void zb() {
                fby fbyVarUh = TTLandingPageActivity.uh(TTLandingPageActivity$6.this.zb);
                if (fbyVarUh == null || fbyVarUh.getUrl() == null) {
                    return;
                }
                if (TTLandingPageActivity.ycx(TTLandingPageActivity$6.this.zb) != null) {
                    TTLandingPageActivity.ycx(TTLandingPageActivity$6.this.zb).setVisibility(0);
                    TTLandingPageActivity.ycx(TTLandingPageActivity$6.this.zb).setProgress(0);
                }
                fbyVarUh.fby();
                String url = fbyVarUh.getUrl();
                if (url != null) {
                    fbyVarUh.a_(url);
                }
                TTLandingPageActivity.ycx(TTLandingPageActivity$6.this.zb, "onSelectRetry");
                TTLandingPageActivity$6.this.ycx.ycx();
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void sya() {
                ClipboardManager clipboardManager;
                if (TTLandingPageActivity.uh(TTLandingPageActivity$6.this.zb) != null) {
                    String url = TTLandingPageActivity.uh(TTLandingPageActivity$6.this.zb).getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTLandingPageActivity$6.this.zb.getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                }
                TTLandingPageActivity.ycx(TTLandingPageActivity$6.this.zb, "onSelectCopyLink");
                TTLandingPageActivity$6.this.ycx.ycx();
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void dj() {
                if (TTLandingPageActivity.uh(TTLandingPageActivity$6.this.zb) != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = TTLandingPageActivity.uh(TTLandingPageActivity$6.this.zb).getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        zb.ycx(TTLandingPageActivity$6.this.zb, intent, (zb.zb) null);
                    }
                    TTLandingPageActivity.ycx(TTLandingPageActivity$6.this.zb, "onSelectOpenInBrowser");
                    TTLandingPageActivity$6.this.ycx.ycx();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void lud() {
                TTLandingPageActivity$6.this.zb.zb();
                TTLandingPageActivity.ycx(TTLandingPageActivity$6.this.zb, "onSelectReport");
                TTLandingPageActivity$6.this.ycx.ycx();
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void lt() {
                TTLandingPageActivity.ycx(TTLandingPageActivity$6.this.zb, "onSelectPrivacy");
                if (com.bytedance.sdk.openadsdk.utils.zb.lud()) {
                    TTLandingPageActivity tTLandingPageActivity = TTLandingPageActivity$6.this.zb;
                    IABLandingPageActivity.ycx(tTLandingPageActivity, TTLandingPageActivity.ea(tTLandingPageActivity), TTLandingPageActivity.pmi(TTLandingPageActivity$6.this.zb));
                } else {
                    TTLandingPageActivity tTLandingPageActivity2 = TTLandingPageActivity$6.this.zb;
                    TTWebsiteActivity.ycx(tTLandingPageActivity2, TTLandingPageActivity.ea(tTLandingPageActivity2), TTLandingPageActivity.pmi(TTLandingPageActivity$6.this.zb));
                }
                TTLandingPageActivity$6.this.ycx.ycx();
            }
        });
        this.ycx.ycx(view);
    }
}

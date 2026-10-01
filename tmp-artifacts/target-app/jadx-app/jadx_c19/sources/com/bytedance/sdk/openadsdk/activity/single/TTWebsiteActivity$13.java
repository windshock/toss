package com.bytedance.sdk.openadsdk.activity.single;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.jw.fby;
import com.bytedance.sdk.component.utils.zb;
import com.bytedance.sdk.openadsdk.common.htf;
import com.bytedance.sdk.openadsdk.common.thx;
import com.bytedance.sdk.openadsdk.common.thx$ycx;
import com.bytedance.sdk.openadsdk.core.lt.lt;
import com.bytedance.sdk.openadsdk.core.model.tn;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TTWebsiteActivity$13 implements View.OnClickListener {
    final /* synthetic */ TTWebsiteActivity sya;
    final /* synthetic */ lt ycx;
    final /* synthetic */ tn zb;

    TTWebsiteActivity$13(TTWebsiteActivity tTWebsiteActivity, lt ltVar, tn tnVar) {
        this.sya = tTWebsiteActivity;
        this.ycx = ltVar;
        this.zb = tnVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        final thx thxVar = new thx(this.sya, true);
        thxVar.setOnMenuItemClickListener(new thx$ycx() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity$13.1
            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void ycx() {
                thxVar.ycx();
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void zb() {
                fby fbyVarYcx = TTWebsiteActivity.ycx(TTWebsiteActivity$13.this.sya);
                if (fbyVarYcx != null && fbyVarYcx.getUrl() != null) {
                    lt ltVar = TTWebsiteActivity$13.this.ycx;
                    if (ltVar != null) {
                        ltVar.setVisibility(0);
                        TTWebsiteActivity$13.this.ycx.setProgress(0);
                    }
                    fbyVarYcx.fby();
                    String url = fbyVarYcx.getUrl();
                    if (url != null) {
                        fbyVarYcx.a_(url);
                    }
                    thxVar.ycx();
                }
                TTWebsiteActivity.ycx(TTWebsiteActivity$13.this.sya, "onSelectRetry");
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void sya() {
                ClipboardManager clipboardManager;
                if (TTWebsiteActivity.ycx(TTWebsiteActivity$13.this.sya) != null) {
                    String url = TTWebsiteActivity.ycx(TTWebsiteActivity$13.this.sya).getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTWebsiteActivity$13.this.sya.getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                }
                TTWebsiteActivity.ycx(TTWebsiteActivity$13.this.sya, "onSelectCopyLink");
                thxVar.ycx();
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void dj() {
                if (TTWebsiteActivity.ycx(TTWebsiteActivity$13.this.sya) != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = TTWebsiteActivity.ycx(TTWebsiteActivity$13.this.sya).getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        zb.ycx(TTWebsiteActivity$13.this.sya, intent, (zb.zb) null);
                    }
                    TTWebsiteActivity.ycx(TTWebsiteActivity$13.this.sya, "onSelectOpenInBrowser");
                    thxVar.ycx();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void lud() {
                if (TTWebsiteActivity.zb(TTWebsiteActivity$13.this.sya) == null) {
                    TTWebsiteActivity.ycx(TTWebsiteActivity$13.this.sya, new htf(TTWebsiteActivity$13.this.sya));
                    TTWebsiteActivity.zb(TTWebsiteActivity$13.this.sya).ycx(TTWebsiteActivity$13.this.zb);
                    TTWebsiteActivity.zb(TTWebsiteActivity$13.this.sya).setCanceledOnTouchOutside(false);
                }
                TTWebsiteActivity.zb(TTWebsiteActivity$13.this.sya).show();
                TTWebsiteActivity.ycx(TTWebsiteActivity$13.this.sya, "onSelectReport");
                thxVar.ycx();
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void lt() {
                TTWebsiteActivity.ycx(TTWebsiteActivity$13.this.sya, "onSelectPrivacy");
                thxVar.ycx();
            }
        });
        thxVar.ycx(view);
    }
}

package com.bytedance.sdk.component.adexpress.lt;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt extends thx {
    private uh ycx;

    public lt(Context context, int i2, int i3, int i4, JSONObject jSONObject) {
        super(context);
        ycx(context, i2, i3, i4, jSONObject);
    }

    private void ycx(Context context, int i2, int i3, int i4, JSONObject jSONObject) {
        uh uhVar = new uh(context, com.bytedance.sdk.component.adexpress.sya.ycx.sya(context), i2, i3, i4, jSONObject);
        this.ycx = uhVar;
        addView(uhVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.ycx.setLayoutParams(layoutParams);
    }

    public uh getShakeView() {
        return this.ycx;
    }

    public void setShakeText(String str) {
        if (this.ycx == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.ycx.setShakeText("");
        } else {
            this.ycx.setShakeText(str);
        }
    }
}

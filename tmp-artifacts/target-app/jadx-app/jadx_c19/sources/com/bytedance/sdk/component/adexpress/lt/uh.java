package com.bytedance.sdk.component.adexpress.lt;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class uh extends pmi {
    private TextView ycx;

    public uh(@NonNull Context context, View view, int i2, int i3, int i4, JSONObject jSONObject) {
        super(context, view, i2, i3, i4, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.lt.pmi
    protected void ycx(Context context, View view) {
        addView(view);
        this.ycx = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.lt.pmi
    public void setShakeText(String str) {
        if (this.ycx == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            try {
                this.ycx.setText(com.bytedance.sdk.component.utils.wwx.zb(this.ycx.getContext(), "tt_splash_default_click_shake"));
                return;
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+zoRN0kk=", "aOYsngafZc6DQeFUiQY=", "SOs5pgu9YsK0T89J", 42);
                e.getMessage();
                return;
            }
        }
        this.ycx.setText(str);
    }
}

package com.bytedance.adsdk.zb.sya.sya;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.zb.htf;
import com.bytedance.adsdk.zb.jc;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya extends dj {
    private final List<TextView> ea;
    private LinearLayout fby;
    private final List<String> jc;
    private final LinearLayout.LayoutParams jw;
    private String ok;

    public sya(com.bytedance.adsdk.zb.jw jwVar, lud ludVar, Context context) {
        List<jc.ycx> listSya;
        super(jwVar, ludVar);
        this.jw = new LinearLayout.LayoutParams(-2, -2);
        this.jc = new ArrayList();
        this.ea = new ArrayList();
        com.bytedance.adsdk.zb.jc jcVar = ((dj) this).ul;
        if (jcVar == null || (listSya = jcVar.sya()) == null || listSya.size() <= 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fby = linearLayout;
        int i2 = 0;
        linearLayout.setOrientation(0);
        zb(listSya.get(0).ul);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(80);
        this.fby.addView(linearLayout2);
        List<String> listOk = ok();
        while (i2 < listSya.size()) {
            jc.ycx ycxVar = listSya.get(i2);
            TextView textView = new TextView(context);
            ycx(textView, ycxVar, (listOk == null || i2 >= listOk.size()) ? "" : listOk.get(i2));
            int i3 = ycxVar.lt;
            if (i3 != 0) {
                this.jw.bottomMargin = (int) (i3 * com.bytedance.adsdk.zb.lt.lt.ycx());
                linearLayout2.addView(textView, this.jw);
            } else {
                linearLayout2.addView(textView);
            }
            i2++;
        }
        float fYcx = com.bytedance.adsdk.zb.lt.lt.ycx();
        ycx(this.fby, (int) (((dj) this).ul.ycx() * fYcx), (int) (((dj) this).ul.zb() * fYcx));
    }

    private void zb(String str) {
        if (TextUtils.isEmpty(str)) {
            this.fby.setGravity(17);
            return;
        }
        if (str.equals(TtmlNode.LEFT)) {
            this.fby.setGravity(3);
        } else if (str.equals(TtmlNode.RIGHT)) {
            this.fby.setGravity(5);
        } else {
            this.fby.setGravity(17);
        }
    }

    private void ycx(TextView textView, jc.ycx ycxVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            textView.setText("");
        }
        if (!TextUtils.isEmpty(ycxVar.sya)) {
            textView.setTextColor(Color.parseColor(ycxVar.sya));
        }
        if (!TextUtils.isEmpty(ycxVar.dj)) {
            textView.setBackgroundColor(Color.parseColor(ycxVar.dj));
        }
        textView.setGravity(17);
        textView.setTextSize(ycxVar.lud);
    }

    @Override // com.bytedance.adsdk.zb.sya.sya.dj, com.bytedance.adsdk.zb.sya.sya.ycx
    public void zb(Canvas canvas, Matrix matrix, int i2) {
        if (this.fby != null) {
            canvas.save();
            canvas.concat(matrix);
            ycx(i2);
            sya(lt());
            this.fby.draw(canvas);
            canvas.restore();
            return;
        }
        super.zb(canvas, matrix, i2);
    }

    private void sya(float f) {
        List<jc.ycx> listSya;
        com.bytedance.adsdk.zb.jc jcVar = ((dj) this).ul;
        if (jcVar == null || (listSya = jcVar.sya()) == null || listSya.size() <= 0) {
            return;
        }
        this.fby.setOrientation(0);
        this.fby.setGravity(17);
        if (this.fby.getChildCount() > 0) {
            LinearLayout linearLayout = (LinearLayout) this.fby.getChildAt(0);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(80);
            this.fby.removeAllViews();
            if (linearLayout.getChildCount() == listSya.size()) {
                List<String> listOk = ok();
                this.ea.clear();
                int i2 = 0;
                while (i2 < listSya.size()) {
                    jc.ycx ycxVar = listSya.get(i2);
                    TextView textView = (TextView) linearLayout.getChildAt(i2);
                    this.ea.add(textView);
                    ycx(textView, ycxVar, (listOk == null || i2 >= listOk.size()) ? "" : listOk.get(i2));
                    i2++;
                }
                linearLayout.removeAllViews();
                for (int i3 = 0; i3 < listSya.size(); i3++) {
                    jc.ycx ycxVar2 = listSya.get(i3);
                    TextView textView2 = this.ea.get(i3);
                    textView2.setAlpha(f);
                    linearLayout.setAlpha(f);
                    int i4 = ycxVar2.lt;
                    if (i4 != 0) {
                        this.jw.bottomMargin = (int) (i4 * com.bytedance.adsdk.zb.lt.lt.ycx());
                        linearLayout.addView(textView2, this.jw);
                    } else {
                        linearLayout.addView(textView2);
                    }
                }
                this.fby.setAlpha(f);
                this.fby.addView(linearLayout);
                float fYcx = com.bytedance.adsdk.zb.lt.lt.ycx();
                ycx(this.fby, (int) (((dj) this).ul.ycx() * fYcx), (int) (((dj) this).ul.zb() * fYcx));
            }
        }
    }

    private List<String> ok() {
        com.bytedance.adsdk.zb.jw jwVar;
        htf htfVarDv;
        List<jc.ycx> listSya;
        if (((dj) this).ul == null || (jwVar = this.zb) == null || (htfVarDv = jwVar.dv()) == null) {
            return null;
        }
        String strDj = ((dj) this).ul.dj();
        if ((!TextUtils.isEmpty(strDj) || !TextUtils.isEmpty(this.ok)) && (listSya = ((dj) this).ul.sya()) != null) {
            String strYcx = this.ok;
            if (TextUtils.isEmpty(strYcx)) {
                strYcx = htfVarDv.ycx(strDj);
            }
            if (!TextUtils.isEmpty(strYcx)) {
                int length = strYcx.length();
                this.jc.clear();
                for (int i2 = 0; i2 < listSya.size(); i2++) {
                    jc.ycx ycxVar = listSya.get(i2);
                    int iMax = ycxVar.ycx;
                    int iMax2 = ycxVar.zb;
                    if (iMax < 0) {
                        iMax = Math.max(iMax + length, 0);
                    }
                    if (iMax2 < 0) {
                        iMax2 = Math.max(iMax2 + length, 0);
                    }
                    if (iMax + iMax2 > length) {
                        this.jc.add("");
                    } else {
                        if (listSya.size() == 1 && iMax == 0 && iMax2 == 0) {
                            iMax2 = length;
                        }
                        this.jc.add(strYcx.substring(iMax, iMax2 + iMax));
                    }
                }
                return this.jc;
            }
        }
        return null;
    }

    private static void ycx(View view, int i2, int i3) {
        view.layout(0, 0, i2, i3);
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void ycx(String str) {
        this.ok = str;
    }
}

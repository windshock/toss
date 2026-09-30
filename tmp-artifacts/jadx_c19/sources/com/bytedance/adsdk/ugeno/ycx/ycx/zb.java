package com.bytedance.adsdk.ugeno.ycx.ycx;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb extends ycx {
    private int dj;
    private Paint lt;
    private int lud;
    private int sya;

    public zb(com.bytedance.adsdk.ugeno.zb.sya syaVar, JSONObject jSONObject) {
        super(syaVar, jSONObject);
        Paint paint = new Paint();
        this.lt = paint;
        paint.setAntiAlias(true);
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public void zb() {
        this.sya = com.bytedance.adsdk.ugeno.fby.ycx.ycx(this.ycx.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), -1);
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public void ycx(Canvas canvas) {
        sya(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public void zb(Canvas canvas) {
        sya(canvas);
    }

    private void sya(Canvas canvas) {
        try {
            if (this.zb.xym() > 0.0f) {
                this.lt.setColor(this.sya);
                this.lt.setAlpha((int) ((1.0f - this.zb.xym()) * 255.0f));
                ((ViewGroup) this.zb.ea().getParent()).setClipChildren(true);
                canvas.drawCircle(this.dj, this.lud, (Math.min(r0, r3) << 1) * this.zb.xym(), this.lt);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public void ycx(int i2, int i3) {
        this.dj = i2 / 2;
        this.lud = i3 / 2;
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public List<PropertyValuesHolder> sya() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(dj(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}

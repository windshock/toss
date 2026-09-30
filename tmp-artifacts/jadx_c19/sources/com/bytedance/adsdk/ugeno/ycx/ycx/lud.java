package com.bytedance.adsdk.ugeno.ycx.ycx;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud extends ycx {
    private float dj;
    private Path ea;
    private boolean fby;
    private Path jc;
    private boolean jw;
    private float lt;
    private Paint lud;
    private Path ok;
    private PorterDuffXfermode ry;
    private float sya;
    private String ul;

    public lud(com.bytedance.adsdk.ugeno.zb.sya syaVar, JSONObject jSONObject) {
        super(syaVar, jSONObject);
        this.fby = true;
        this.jw = true;
        Paint paint = new Paint();
        this.lud = paint;
        paint.setAntiAlias(true);
        this.zb.ea().setLayerType(2, null);
        this.ry = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.jc = new Path();
        this.ea = new Path();
        this.ok = new Path();
        this.lud.setXfermode(this.ry);
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public void zb() {
        this.lt = (float) this.ycx.optDouble("start", 0.0d);
        this.ul = this.ycx.optString("direction", TtmlNode.CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public void ycx(Canvas canvas) {
        sya(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public void zb(Canvas canvas) {
        sya(canvas);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void sya(Canvas canvas) {
        char c;
        if (this.zb.zr() > 0.0f) {
            int iZr = (int) (this.sya * this.zb.zr());
            int iZr2 = (int) (this.dj * this.zb.zr());
            this.lud.setXfermode(this.ry);
            String str = this.ul;
            switch (str.hashCode()) {
                case -1383228885:
                    if (!str.equals("bottom")) {
                        c = 65535;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case -1364013995:
                    if (str.equals(TtmlNode.CENTER)) {
                        c = 1;
                        break;
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3317767:
                    if (str.equals(TtmlNode.LEFT)) {
                        c = 3;
                        break;
                    }
                    break;
                case 108511772:
                    if (str.equals(TtmlNode.RIGHT)) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                canvas.drawRect(0.0f, iZr2, this.sya, this.dj, this.lud);
                return;
            }
            if (c != 1) {
                if (c == 2) {
                    canvas.drawRect(0.0f, 0.0f, this.sya, this.dj - iZr2, this.lud);
                    return;
                } else if (c == 3) {
                    canvas.drawRect(0.0f, 0.0f, this.sya - iZr, this.dj, this.lud);
                    return;
                } else {
                    if (c != 4) {
                        return;
                    }
                    canvas.drawRect(iZr, 0.0f, this.sya, this.dj, this.lud);
                    return;
                }
            }
            this.jc.reset();
            this.ea.reset();
            this.ok.reset();
            Path.Direction direction = Path.Direction.CW;
            this.jc.addCircle(this.sya / 2.0f, this.dj / 2.0f, iZr, direction);
            Path path = this.ea;
            float f = this.sya;
            path.addRect(f / 2.0f, 0.0f, f, this.dj, direction);
            Path path2 = this.ea;
            Path path3 = this.jc;
            Path.Op op = Path.Op.DIFFERENCE;
            path2.op(path3, op);
            this.ok.addRect(0.0f, 0.0f, this.sya / 2.0f, this.dj, direction);
            this.ok.op(this.jc, op);
            canvas.drawPath(this.ea, this.lud);
            canvas.drawPath(this.ok, this.lud);
            return;
        }
        this.lud.setXfermode(this.ry);
        canvas.drawRect(0.0f, 0.0f, this.sya, this.dj, this.lud);
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public void ycx(int i2, int i3) {
        if (i2 > 0 && this.fby) {
            this.sya = i2;
            this.fby = false;
        }
        if (i3 <= 0 || !this.jw) {
            return;
        }
        this.dj = i3;
        this.jw = false;
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public List<PropertyValuesHolder> sya() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(dj(), this.lt, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}

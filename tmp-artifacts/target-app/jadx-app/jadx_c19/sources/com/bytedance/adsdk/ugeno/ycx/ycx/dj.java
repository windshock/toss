package com.bytedance.adsdk.ugeno.ycx.ycx;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fby.fby;
import com.bytedance.adsdk.ugeno.fby.ycx;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj extends ycx {
    private static final float dy;
    private static final float syc;
    private static final float wie;
    private static final float xkz;
    private Paint dj;
    private int ea;
    private int fby;
    private int jc;
    private float jw;
    private ycx.C0005ycx lt;
    private Path lud;
    private boolean ok;
    private float pmi;
    private Path ry;
    private int sya;
    private int ul;

    static {
        float radians = (float) Math.toRadians(30.0d);
        xkz = radians;
        double d = radians;
        syc = (float) Math.tan(d);
        dy = (float) Math.cos(d);
        wie = (float) Math.sin(d);
    }

    public dj(com.bytedance.adsdk.ugeno.zb.sya syaVar, JSONObject jSONObject) {
        super(syaVar, jSONObject);
        this.ok = true;
        Paint paint = new Paint();
        this.dj = paint;
        paint.setAntiAlias(true);
        this.lud = new Path();
        this.jw = this.zb.tn();
        this.ry = new Path();
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public void zb() throws Throwable {
        this.sya = (int) fby.ycx(this.zb.ea().getContext(), this.ycx.optInt("shineWidth", 30));
        String strOptString = this.ycx.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.lt = com.bytedance.adsdk.ugeno.fby.ycx.zb(str);
        } else {
            int iYcx = com.bytedance.adsdk.ugeno.fby.ycx.ycx(str);
            this.ul = iYcx;
            this.fby = com.bytedance.adsdk.ugeno.fby.ycx.ycx(iYcx, 32);
            this.ok = false;
        }
        this.pmi = dy * this.sya;
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
        LinearGradient linearGradient;
        try {
            if (this.zb.rl() > 0.0f) {
                float f = this.jc;
                float f2 = syc;
                float fRl = (f + (f * f2)) * this.zb.rl();
                this.ry.reset();
                this.ry.moveTo(fRl, 0.0f);
                float f3 = this.ea;
                float f4 = fRl - (f2 * f3);
                this.ry.lineTo(f4, f3);
                this.ry.lineTo(f4 + this.sya, this.ea);
                this.ry.lineTo(this.sya + fRl, 0.0f);
                this.ry.close();
                float f5 = this.pmi;
                float f6 = dy * f5;
                float f7 = f5 * wie;
                if (this.ok && this.lt != null) {
                    linearGradient = new LinearGradient(fRl, 0.0f, fRl + f6, f7, this.lt.zb, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    int i2 = this.fby;
                    linearGradient = new LinearGradient(fRl, 0.0f, fRl + f6, f7, new int[]{i2, this.ul, i2}, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.dj.setShader(linearGradient);
                Path path = this.lud;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.ry, this.dj);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public void ycx(int i2, int i3) {
        this.jc = i2;
        this.ea = i3;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i2, i3);
            Path path = this.lud;
            float f = this.jw;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public List<PropertyValuesHolder> sya() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(dj(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}

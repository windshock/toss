package com.bytedance.adsdk.ugeno.ycx.ycx;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya extends ycx {
    private float dj;
    private Matrix ea;
    private Paint fby;
    private LinearGradient jc;
    private PorterDuffXfermode jw;
    private View lt;
    private float lud;
    private String sya;
    private Paint ul;

    public sya(com.bytedance.adsdk.ugeno.zb.sya syaVar, JSONObject jSONObject) {
        super(syaVar, jSONObject);
        this.lt = this.zb.ea();
        Paint paint = new Paint();
        this.ul = paint;
        paint.setAntiAlias(true);
        this.lt.setLayerType(2, null);
        this.jw = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.fby = new Paint();
        this.ea = new Matrix();
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public void zb() {
        this.sya = this.ycx.optString("direction", TtmlNode.LEFT);
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public void ycx(Canvas canvas) {
        sya(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public void zb(Canvas canvas) {
        sya(canvas);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void sya(Canvas canvas) {
        try {
            if (this.zb.bba() <= 0.0f) {
                this.ul.setXfermode(this.jw);
                canvas.drawRect(0.0f, 0.0f, this.dj, this.lud, this.ul);
                return;
            }
            int iBba = (int) (this.dj * this.zb.bba());
            int iBba2 = (int) (this.lud * this.zb.bba());
            this.ul.setXfermode(this.jw);
            String str = this.sya;
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        float f = iBba2;
                        canvas.drawRect(0.0f, f, this.dj, this.lud, this.ul);
                        this.ea.setTranslate(0.0f, f);
                        this.jc.setLocalMatrix(this.ea);
                        this.fby.setShader(this.jc);
                        if (this.zb.bba() <= 1.0f && this.zb.bba() > 0.9f) {
                            this.fby.setAlpha((int) (255.0f - (this.zb.bba() * 255.0f)));
                        }
                        canvas.drawRect(0.0f, 0.0f, this.dj, f, this.fby);
                        break;
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        float f2 = iBba2;
                        canvas.drawRect(0.0f, 0.0f, this.dj, this.lud - f2, this.ul);
                        this.ea.setTranslate(0.0f, this.lud - f2);
                        this.jc.setLocalMatrix(this.ea);
                        this.fby.setShader(this.jc);
                        if (this.zb.bba() <= 1.0f && this.zb.bba() > 0.9f) {
                            this.fby.setAlpha((int) (255.0f - (this.zb.bba() * 255.0f)));
                        }
                        float f3 = this.dj;
                        float f4 = this.lud;
                        canvas.drawRect(f3, f4, 0.0f, f4 - f2, this.fby);
                        break;
                    }
                    break;
                case 3317767:
                    if (str.equals(TtmlNode.LEFT)) {
                        float f5 = iBba;
                        canvas.drawRect(0.0f, 0.0f, this.dj - f5, this.lud, this.ul);
                        this.ea.setTranslate(this.dj - f5, 0.0f);
                        this.jc.setLocalMatrix(this.ea);
                        this.fby.setShader(this.jc);
                        if (this.zb.bba() <= 1.0f && this.zb.bba() > 0.9f) {
                            this.fby.setAlpha((int) (255.0f - (this.zb.bba() * 255.0f)));
                        }
                        float f6 = this.dj;
                        canvas.drawRect(f6, this.lud, f6 - f5, 0.0f, this.fby);
                        break;
                    }
                    break;
                case 108511772:
                    if (str.equals(TtmlNode.RIGHT)) {
                        float f7 = iBba;
                        canvas.drawRect(f7, 0.0f, this.dj, this.lud, this.ul);
                        this.ea.setTranslate(f7, this.lud);
                        this.jc.setLocalMatrix(this.ea);
                        this.fby.setShader(this.jc);
                        if (this.zb.bba() <= 1.0f && this.zb.bba() > 0.9f) {
                            this.fby.setAlpha((int) (255.0f - (this.zb.bba() * 255.0f)));
                        }
                        canvas.drawRect(0.0f, 0.0f, f7, this.lud, this.fby);
                        break;
                    }
                    break;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ycx(int i2, int i3) {
        char c;
        this.dj = i2;
        this.lud = i3;
        String str = this.sya;
        switch (str.hashCode()) {
            case -1383228885:
                if (!str.equals("bottom")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case 115029:
                if (str.equals("top")) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(TtmlNode.LEFT)) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.jc = new LinearGradient(0.0f, -this.lud, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
            return;
        }
        if (c == 1) {
            this.jc = new LinearGradient(0.0f, this.lud, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
        } else if (c == 2) {
            this.jc = new LinearGradient(this.dj, 0.0f, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
        } else {
            if (c != 3) {
                return;
            }
            this.jc = new LinearGradient(-this.dj, 0.0f, 0.0f, this.lud, 0, -1, Shader.TileMode.CLAMP);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ycx.ycx
    public List<PropertyValuesHolder> sya() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", 0.0f, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.ycx.lud.jc.zb(), 0.0f, 1.0f));
        return arrayList;
    }
}

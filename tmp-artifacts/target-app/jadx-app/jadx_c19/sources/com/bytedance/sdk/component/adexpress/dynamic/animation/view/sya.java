package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dj.ul;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ea;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya {
    private int dj;
    private int lt;
    private int lud;
    Paint ycx;
    Path zb = new Path();
    Path sya = new Path();

    public sya() {
        Paint paint = new Paint();
        this.ycx = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ycx(Canvas canvas, IAnimation iAnimation, View view) {
        int i2;
        int iIntValue;
        int iIntValue2;
        String str;
        float[] fArrZb;
        if (iAnimation.getRippleValue() != 0.0f) {
            if (com.bytedance.sdk.component.adexpress.ycx.ycx.ycx.ycx().sya() != null) {
                try {
                    str = (String) view.getTag(2097610712);
                } catch (Exception e) {
                    e = e;
                    str = "";
                }
                try {
                    fArrZb = ul.zb(str);
                } catch (Exception e2) {
                    e = e2;
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6EmUuMsgQqzZ4mWQ9JK", "euAkmAKoYMiOfcVcnAGlOg==", "VOAJhwKr", 42);
                    fArrZb = null;
                    if (!str.startsWith("#")) {
                    }
                    ((ViewGroup) view.getParent()).setClipChildren(true);
                    canvas.drawCircle(this.dj, this.lud, (Math.min(r0, r4) << 1) * iAnimation.getRippleValue(), this.ycx);
                    if (iAnimation.getShineValue() == 0.0f) {
                    }
                    if (iAnimation.getMarqueeValue() == 0.0f) {
                    }
                }
                if (!str.startsWith("#")) {
                    this.ycx.setColor(Color.parseColor(str));
                    this.ycx.setAlpha(90);
                } else if (fArrZb != null) {
                    this.ycx.setColor(com.bytedance.sdk.component.adexpress.dj.ul.ycx(fArrZb[3] * (1.0f - iAnimation.getRippleValue()), fArrZb[0] / 256.0f, fArrZb[1] / 256.0f, fArrZb[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            canvas.drawCircle(this.dj, this.lud, (Math.min(r0, r4) << 1) * iAnimation.getRippleValue(), this.ycx);
        }
        if (iAnimation.getShineValue() == 0.0f) {
            i2 = 1;
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.zb.reset();
            try {
                iIntValue2 = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception e3) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e3, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6EmUuMsgQqzZ4mWQ9JK", "euAkmAKoYMiOfcVcnAGlOg==", "VOAJhwKr", 67);
                iIntValue2 = 0;
            }
            if (iIntValue2 >= 0) {
                float shineValue = ((int) ((((this.dj << 2) + (iIntValue2 << 1)) + (this.lud << 1)) * iAnimation.getShineValue())) - ((this.lud << 1) + iIntValue2);
                this.ycx.setShader(new LinearGradient(shineValue, 0.0f, ((iIntValue2 + r4) / 2) + r3, r4 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.ycx.setStrokeWidth(this.dj << 1);
                Path path = this.sya;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                i2 = 1;
                canvas.drawLine(shineValue, 0.0f, r3 + iIntValue2 + r2, this.lud, this.ycx);
            }
        }
        if (iAnimation.getMarqueeValue() == 0.0f) {
            try {
                iIntValue = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception e4) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e4, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6EmUuMsgQqzZ4mWQ9JK", "euAkmAKoYMiOfcVcnAGlOg==", "VOAJhwKr", 89);
                iIntValue = 0;
            }
            if (iIntValue >= 0) {
                this.zb.reset();
                this.zb.moveTo(0.0f, 0.0f);
                this.zb.lineTo(this.dj << i2, 0.0f);
                this.zb.lineTo(this.dj << i2, this.lud << i2);
                this.zb.lineTo(0.0f, this.lud << i2);
                this.zb.lineTo(0.0f, 0.0f);
                this.ycx.setShader(new LinearGradient(0.0f, 0.0f, this.dj << i2, this.lud << i2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.ycx.setColor(-65536);
                this.ycx.setStyle(Paint.Style.STROKE);
                this.ycx.setStrokeWidth(iIntValue);
                canvas.drawPath(this.zb, this.ycx);
            }
        }
    }

    public void ycx(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.lt * f);
        view.setTranslationX((r1 - r6) / 2);
        if (view instanceof ea) {
            int i2 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i2 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i2).setTranslationX((-(this.lt - layoutParams.width)) / 2);
                i2++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ycx(View view, int i2, int i3) {
        String str;
        this.dj = i2 / 2;
        this.lud = i3 / 2;
        if (this.lt == 0 && view.getLayoutParams().width > 0) {
            this.lt = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
        } catch (Exception e) {
            e = e;
            str = "";
        }
        try {
            this.sya.addRoundRect(new RectF(0.0f, 0.0f, i2, i3), i3 / 2, i3 / 2, Path.Direction.CW);
        } catch (Exception e2) {
            e = e2;
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6EmUuMsgQqzZ4mWQ9JK", "euAkmAKoYMiOfcVcnAGlOg==", "VOAenBm5Ss+BRNBYiA==", 136);
            if (!TtmlNode.RIGHT.equals(str)) {
            }
        }
        if (!TtmlNode.RIGHT.equals(str)) {
            view.setPivotX(this.dj << 1);
            view.setPivotY(this.lud);
        } else if (TtmlNode.LEFT.equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.lud);
        } else {
            view.setPivotX(this.dj);
            view.setPivotY(this.lud);
        }
    }
}

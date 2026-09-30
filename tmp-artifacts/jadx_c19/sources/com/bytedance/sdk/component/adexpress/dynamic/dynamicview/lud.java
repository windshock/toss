package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class lud extends FrameLayout implements IAnimation, kgy, rmy {
    protected float dj;
    protected boolean dy;
    protected Context ea;
    protected int fby;
    private float htf;
    protected int jc;
    protected int jw;
    protected float lt;
    protected float lud;
    protected com.bytedance.sdk.component.adexpress.dynamic.dj.ul ok;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.sya pmi;
    protected com.bytedance.sdk.component.adexpress.dynamic.dj.fby ry;
    protected float sya;
    protected View syc;
    private com.bytedance.sdk.component.utils.dv thx;
    private float uh;
    protected int ul;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.zb wie;
    protected DynamicRootView xkz;
    private float ycx;
    private float zb;
    private static final View.OnTouchListener wwx = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener tn = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.zb;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.zb = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.ycx;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.ycx = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.uh;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.uh = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.htf;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.htf = f;
        this.pmi.ycx(this, f);
    }

    public lud(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context);
        this.ea = context;
        this.xkz = dynamicRootView;
        this.ry = fbyVar;
        this.sya = fbyVar.lt();
        this.dj = fbyVar.ul();
        this.lud = fbyVar.fby();
        this.lt = fbyVar.jw();
        this.jw = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.sya);
        this.jc = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.dj);
        this.ul = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.lud);
        this.fby = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.lt);
        com.bytedance.sdk.component.adexpress.dynamic.dj.ul ulVar = new com.bytedance.sdk.component.adexpress.dynamic.dj.ul(fbyVar.jc());
        this.ok = ulVar;
        if (ulVar.pmi() > 0) {
            this.ul += this.ok.pmi() << 1;
            this.fby += this.ok.pmi() << 1;
            this.jw -= this.ok.pmi();
            this.jc -= this.ok.pmi();
            List<com.bytedance.sdk.component.adexpress.dynamic.dj.fby> listEa = fbyVar.ea();
            if (listEa != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar2 : listEa) {
                    fbyVar2.sya(fbyVar2.lt() + com.bytedance.sdk.component.adexpress.dj.ul.zb(this.ea, this.ok.pmi()));
                    fbyVar2.dj(fbyVar2.ul() + com.bytedance.sdk.component.adexpress.dj.ul.zb(this.ea, this.ok.pmi()));
                    fbyVar2.ycx(com.bytedance.sdk.component.adexpress.dj.ul.zb(this.ea, this.ok.pmi()));
                    fbyVar2.zb(com.bytedance.sdk.component.adexpress.dj.ul.zb(this.ea, this.ok.pmi()));
                }
            }
        }
        this.dy = this.ok.xkz() > 0.0d;
        this.pmi = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.sya();
    }

    public void setShouldInvisible(boolean z) {
        this.dy = z;
    }

    public boolean getBeginInvisibleAndShow() {
        return this.dy;
    }

    public boolean sya() throws JSONException {
        jw();
        lt();
        dj();
        return true;
    }

    protected boolean dj() throws JSONException {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.syc;
        if (view == null) {
            view = this;
        }
        if (lud()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = wwx;
            onClickListener = tn;
        }
        if (onTouchListener != null && onClickListener != null) {
            view.setOnTouchListener(onTouchListener);
            view.setOnClickListener(onClickListener);
            int iYcx = com.bytedance.sdk.component.adexpress.dynamic.zb.ycx.ycx(this.ok);
            if (iYcx == 2 || iYcx == 3) {
                view.setOnClickListener(tn);
            } else {
                view.setOnClickListener(onClickListener);
            }
        }
        ycx(view);
        zb(view);
        return true;
    }

    protected void ycx(View view) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.ry.fby());
            jSONObject.put("height", this.ry.jw());
            if (com.bytedance.sdk.component.adexpress.dj.zb()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ycx.htf, this.ok.yzp());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ycx.thx, this.ry.jc().zb());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ycx.wwx, this.ry.sya());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ycx.tn, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.ok.yzp());
            view.setTag(2097610715, this.ry.jc().zb());
            view.setTag(2097610714, this.ry.sya());
            view.setTag(2097610713, jSONObject.toString());
            int iYcx = com.bytedance.sdk.component.adexpress.dynamic.zb.ycx.ycx(this.ok);
            if (iYcx == 1) {
                view.setTag(2097610707, new Pair(this.ok.oty(), Long.valueOf(this.ok.hf())));
                view.setTag(2097610708, Integer.valueOf(iYcx));
            }
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU8=", "WuoptgyxZMiOftZa", 228);
        }
    }

    protected void zb(@NonNull View view) {
        com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud;
        com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar = this.ry;
        if (fbyVar == null || (ltVarLud = fbyVar.jc().lud()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(ltVarLud.kh()));
    }

    public boolean lud() {
        com.bytedance.sdk.component.adexpress.dynamic.dj.ul ulVar = this.ok;
        return (ulVar == null || ulVar.tru() == 0) ? false : true;
    }

    public void lt() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ul, this.fby);
        layoutParams.topMargin = this.jc;
        int i2 = this.jw;
        layoutParams.leftMargin = i2;
        layoutParams.setMarginStart(i2);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public int getClickArea() {
        return this.ok.tru();
    }

    public String getImageObjectFit() {
        return this.ok.duz();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.lt.ycx getDynamicClickListener() {
        return this.xkz.getDynamicClickListener();
    }

    protected Drawable getBackgroundDrawable() {
        return ycx(false, "");
    }

    protected Drawable ycx(boolean z, String str) {
        String[] strArrSplit;
        int[] iArr;
        int iBhi;
        if (!TextUtils.isEmpty(this.ok.ifb())) {
            try {
                String strIfb = this.ok.ifb();
                String strSubstring = strIfb.substring(strIfb.indexOf("(") + 1, strIfb.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.dj.ul.ycx(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.dj.ul.ycx(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.dj.ul.ycx(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.dj.ul.ycx(strArrSplit[2].substring(0, 7))};
                }
                int[] iArr2 = iArr;
                String[] strArr = strArrSplit;
                try {
                    double d = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d > 225.0d && d < 315.0d) {
                        int i2 = iArr2[1];
                        iArr2[1] = iArr2[0];
                        iArr2[0] = i2;
                    }
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU8=", "XOs5twK/YsCSRcJTiDWyKUzvL5kG", 309);
                }
                GradientDrawable gradientDrawableYcx = ycx(ycx(strArr[0]), iArr2);
                gradientDrawableYcx.setShape(0);
                gradientDrawableYcx.setCornerRadius(com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.syc()));
                return gradientDrawableYcx;
            } catch (Exception e2) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU8=", "XOs5twK/YsCSRcJTiDWyKUzvL5kG", 317);
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fYcx = com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.syc());
        drawable.setCornerRadius(fYcx);
        if (fYcx < 1.0f) {
            float fYcx2 = com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.rmf());
            float fYcx3 = com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.aeu());
            float fYcx4 = com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.xz());
            float fYcx5 = com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.rmy());
            float[] fArr = new float[8];
            if (fYcx2 > 0.0f) {
                fArr[0] = fYcx2;
                fArr[1] = fYcx2;
            }
            if (fYcx3 > 0.0f) {
                fArr[2] = fYcx3;
                fArr[3] = fYcx3;
            }
            if (fYcx4 > 0.0f) {
                fArr[4] = fYcx4;
                fArr[5] = fYcx4;
            }
            if (fYcx5 > 0.0f) {
                fArr[6] = fYcx5;
                fArr[7] = fYcx5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z) {
            iBhi = Color.parseColor(str);
        } else {
            iBhi = this.ok.bhi();
        }
        drawable.setColor(iBhi);
        if (this.ok.wie() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.wie()), this.ok.dy());
            return drawable;
        }
        if (this.ok.pmi() <= 0) {
            return drawable;
        }
        drawable.setStroke(this.ok.pmi(), this.ok.dy());
        drawable.setAlpha(50);
        if (!TextUtils.equals(this.ry.jc().zb(), "video-vd")) {
            return drawable;
        }
        setLayerType(1, null);
        return new uh((int) fYcx, this.ok.pmi());
    }

    protected zb ycx(Bitmap bitmap) {
        return new ycx(bitmap, null);
    }

    protected Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(ycx(zb(this.ok.ifb().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU8=", "XOs5uBaoYMuiS9RWiwOvPVXqCYcCq2jFjE8=", 394);
            return null;
        }
    }

    private Drawable[] ycx(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    iArr[i3] = com.bytedance.sdk.component.adexpress.dynamic.dj.ul.ycx(strArrSplit[i4].substring(0, 7));
                    i3 = i4;
                }
                GradientDrawable gradientDrawableYcx = ycx(ycx(strArrSplit[0]), iArr);
                gradientDrawableYcx.setShape(0);
                gradientDrawableYcx.setCornerRadius(com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.syc()));
                drawableArr[(list.size() - 1) - i2] = gradientDrawableYcx;
            }
        }
        return drawableArr;
    }

    private List<String> zb(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            if (str.charAt(i4) == '(') {
                i2++;
                z = true;
            } else if (str.charAt(i4) == ')' && i2 - 1 == 0 && z) {
                int i5 = i4 + 1;
                arrayList.add(str.substring(i3, i5));
                i3 = i5;
                z = false;
            }
        }
        return arrayList;
    }

    protected GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    protected GradientDrawable ycx(GradientDrawable.Orientation orientation, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new GradientDrawable();
        }
        if (iArr.length == 1) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(iArr[0]);
            return gradientDrawable;
        }
        return new GradientDrawable(orientation, iArr);
    }

    protected GradientDrawable.Orientation ycx(String str) {
        try {
            int i2 = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i2 <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i2 <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i2 <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU8=", "XOs5uhG1fcaUQ9hT", 473);
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.pmi.ycx(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.sya syaVar = this.pmi;
        View view = this.syc;
        if (view == null) {
            view = this;
        }
        syaVar.ycx(view, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ul();
        ycx();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        zb();
        super.onDetachedFromWindow();
    }

    public void ul() {
        if (fby()) {
            return;
        }
        View view = this.syc;
        if (view == null) {
            view = this;
        }
        this.wie = new com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.zb(view, this.ry.jc().lud().vbt());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.zb zbVar = lud.this.wie;
                if (zbVar != null) {
                    zbVar.ycx();
                }
            }
        });
    }

    public void zb() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.zb zbVar = this.wie;
        if (zbVar != null) {
            zbVar.zb();
        }
    }

    protected boolean fby() {
        com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar = this.ry;
        return fbyVar == null || fbyVar.jc() == null || this.ry.jc().lud() == null || this.ry.jc().lud().vbt() == null;
    }

    public int getDynamicWidth() {
        return this.ul;
    }

    public int getDynamicHeight() {
        return this.fby;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.dj.lt getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.dj.lud ludVarJc;
        com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar = this.ry;
        if (fbyVar == null || (ludVarJc = fbyVar.jc()) == null) {
            return null;
        }
        return ludVarJc.lud();
    }

    private void ycx() {
        if (isShown()) {
            int iYcx = com.bytedance.sdk.component.adexpress.dynamic.zb.ycx.ycx(this.ok);
            if (iYcx == 2) {
                if (this.thx == null) {
                    this.thx = new com.bytedance.sdk.component.utils.dv(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud.4
                };
                com.bytedance.sdk.component.adexpress.zb.ry renderRequest = this.xkz.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.syc();
                    renderRequest.thx();
                    renderRequest.uh();
                    return;
                }
                return;
            }
            if (iYcx == 3) {
                if (this.thx == null) {
                    this.thx = new com.bytedance.sdk.component.utils.dv(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud.5
                };
                com.bytedance.sdk.component.adexpress.zb.ry renderRequest2 = this.xkz.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.wie();
                    renderRequest2.wwx();
                    renderRequest2.pmi();
                    renderRequest2.htf();
                }
            }
        }
    }
}

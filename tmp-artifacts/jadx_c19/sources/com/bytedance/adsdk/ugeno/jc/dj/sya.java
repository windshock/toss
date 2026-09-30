package com.bytedance.adsdk.ugeno.jc.dj;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.ea;
import com.bytedance.adsdk.ugeno.fby.dj;
import com.bytedance.adsdk.ugeno.lt;
import com.bytedance.adsdk.ugeno.lud;
import com.bytedance.adsdk.ugeno.zb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.CompositionLocalKtExternalSyntheticLambda0;
import o.CompositionLocalKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya extends com.bytedance.adsdk.ugeno.zb.sya<ycx> {
    private float ci;
    protected String nc;
    private float pg;
    protected ImageView.ScaleType qt;
    private int sp;
    protected boolean te;
    private float tpg;
    private int vbt;
    public String ycx;

    public sya(Context context) {
        super(context);
        this.qt = ImageView.ScaleType.FIT_XY;
        this.vbt = -1;
        this.pg = -1.0f;
        this.ci = -1.0f;
        this.sp = 0;
        this.tpg = 50.0f;
    }

    public void zb() throws NumberFormatException {
        super.zb();
        jw();
        ((ycx) ((com.bytedance.adsdk.ugeno.zb.sya) this).lud).setScaleType(this.qt);
        ((ycx) ((com.bytedance.adsdk.ugeno.zb.sya) this).lud).setBorderColor(((com.bytedance.adsdk.ugeno.zb.sya) this).ui);
        ((ycx) ((com.bytedance.adsdk.ugeno.zb.sya) this).lud).setCornerRadius(((com.bytedance.adsdk.ugeno.zb.sya) this).yi);
        ((ycx) ((com.bytedance.adsdk.ugeno.zb.sya) this).lud).setBorderWidth(((com.bytedance.adsdk.ugeno.zb.sya) this).lv);
        int i2 = this.vbt;
        if (i2 != -1) {
            ((ycx) ((com.bytedance.adsdk.ugeno.zb.sya) this).lud).setColorFilter(i2);
        }
        ((ycx) ((com.bytedance.adsdk.ugeno.zb.sya) this).lud).setEraseEnabled(this.sp == 1);
        ((ycx) ((com.bytedance.adsdk.ugeno.zb.sya) this).lud).setEraseRadius(this.tpg);
    }

    public void xkz(String str) {
        this.ycx = str;
    }

    private void jw() throws NumberFormatException {
        if (TextUtils.isEmpty(this.ycx)) {
            return;
        }
        ((ycx) ((com.bytedance.adsdk.ugeno.zb.sya) this).lud).setImageDrawable(null);
        if (this.ycx.startsWith("local://")) {
            try {
                String strReplace = this.ycx.replace("local://", "");
                if (TextUtils.equals(sya(), "raw")) {
                    ((ycx) ((com.bytedance.adsdk.ugeno.zb.sya) this).lud).setImageResource(dj.ycx(((com.bytedance.adsdk.ugeno.zb.sya) this).zb, strReplace));
                    return;
                } else {
                    ycx((ImageView) ((com.bytedance.adsdk.ugeno.zb.sya) this).lud, strReplace);
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        if (this.ycx.startsWith("@")) {
            ((ycx) ((com.bytedance.adsdk.ugeno.zb.sya) this).lud).setImageResource(Integer.parseInt(this.ycx.substring(1)));
        } else {
            jc();
        }
    }

    public void ycx(ImageView imageView, String str) {
        imageView.setImageResource(dj.zb(((com.bytedance.adsdk.ugeno.zb.sya) this).zb, str));
    }

    private void jc() {
        if (this.pg > 0.0f) {
            lt.ycx().zb().ycx(((com.bytedance.adsdk.ugeno.zb.sya) this).jw, this.ycx, new 1(this));
            return;
        }
        com.bytedance.adsdk.ugeno.zb zbVarZb = lt.ycx().zb();
        ea eaVar = ((com.bytedance.adsdk.ugeno.zb.sya) this).jw;
        String str = this.ycx;
        View view = ((com.bytedance.adsdk.ugeno.zb.sya) this).lud;
        zbVarZb.ycx(eaVar, str, (ImageView) view, ((ycx) view).getWidth(), ((ycx) ((com.bytedance.adsdk.ugeno.zb.sya) this).lud).getHeight(), new zb.ycx() { // from class: com.bytedance.adsdk.ugeno.jc.dj.sya.2
            @Override // com.bytedance.adsdk.ugeno.zb.ycx
            public void ycx(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.zb.sya) sya.this).vyl != null) {
                        com.bytedance.adsdk.ugeno.core.lt unused = ((com.bytedance.adsdk.ugeno.zb.sya) sya.this).vyl;
                    }
                } else if (((com.bytedance.adsdk.ugeno.zb.sya) sya.this).vyl != null) {
                    com.bytedance.adsdk.ugeno.core.lt unused2 = ((com.bytedance.adsdk.ugeno.zb.sya) sya.this).vyl;
                }
            }
        });
        if (this.te || this.ci > 0.0f) {
            lt.ycx().zb().ycx(((com.bytedance.adsdk.ugeno.zb.sya) this).jw, this.ycx, new 3(this));
        }
    }

    /* renamed from: dj, reason: merged with bridge method [inline-methods] */
    public ycx ycx() {
        ycx ycxVar = new ycx(((com.bytedance.adsdk.ugeno.zb.sya) this).zb);
        ycxVar.ycx((lud) this);
        return ycxVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ycx(String str, String str2) {
        View view;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.ycx(str, str2);
        switch (str) {
            case "scaleMode":
            case "scaleType":
                this.qt = ry(str2);
                break;
            case "imageBlur":
                this.pg = com.bytedance.adsdk.ugeno.fby.sya.ycx(str2, -1.0f);
                break;
            case "eraseRadius":
                float fYcx = com.bytedance.adsdk.ugeno.fby.sya.ycx(str2, 50.0f);
                this.tpg = fYcx;
                View view2 = ((com.bytedance.adsdk.ugeno.zb.sya) this).lud;
                if (view2 != null) {
                    ((ycx) view2).setEraseRadius(fYcx);
                    break;
                }
                break;
            case "isBgGaussianBlur":
                this.te = com.bytedance.adsdk.ugeno.fby.sya.ycx(str2, false);
                break;
            case "src":
                this.ycx = str2;
                break;
            case "erase":
                int iYcx = com.bytedance.adsdk.ugeno.fby.sya.ycx(str2, 0);
                this.sp = iYcx;
                if (iYcx == 1 && (view = ((com.bytedance.adsdk.ugeno.zb.sya) this).lud) != null) {
                    ((ycx) view).setEraseEnabled(true);
                    break;
                }
                break;
            case "tintColor":
                this.vbt = com.bytedance.adsdk.ugeno.fby.ycx.ycx(str2);
                break;
            case "imageBgBlur":
                this.ci = com.bytedance.adsdk.ugeno.fby.sya.ycx(str2, -1.0f);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ImageView.ScaleType ry(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fit":
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    public void ul() {
        super.ul();
        ((ycx) ((com.bytedance.adsdk.ugeno.zb.sya) this).lud).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jc.dj.sya.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawable = ((ycx) ((com.bytedance.adsdk.ugeno.zb.sya) sya.this).lud).getDrawable();
                if (Build.VERSION.SDK_INT < 28 || !CompositionLocalKtExternalSyntheticLambda0.onWarmupCompleted(drawable)) {
                    return;
                }
                CompositionLocalKtExternalSyntheticLambda3.pG_(drawable).start();
            }
        });
    }

    public void fby() {
        super.fby();
        Drawable drawable = ((ycx) ((com.bytedance.adsdk.ugeno.zb.sya) this).lud).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !CompositionLocalKtExternalSyntheticLambda0.onWarmupCompleted(drawable)) {
            return;
        }
        CompositionLocalKtExternalSyntheticLambda3.pG_(drawable).stop();
    }

    public void ycx(String str, Map<String, Object> map) {
        ((com.bytedance.adsdk.ugeno.zb.sya) this).ul = (com.bytedance.adsdk.ugeno.zb.ycx) zb(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(rmy());
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        ycx(((com.bytedance.adsdk.ugeno.zb.sya) this).ul, str, arrayList.toArray());
    }

    private void ycx(com.bytedance.adsdk.ugeno.zb.sya syaVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.zb.sya<View>> listJw;
        if (syaVar != null) {
            syaVar.ycx(str, objArr);
            if (!(syaVar instanceof com.bytedance.adsdk.ugeno.zb.ycx) || (listJw = ((com.bytedance.adsdk.ugeno.zb.ycx) syaVar).jw()) == null || listJw.isEmpty()) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.zb.sya<View>> it = listJw.iterator();
            while (it.hasNext()) {
                ycx(it.next(), str, objArr);
            }
        }
    }

    protected String sya() {
        return this.nc;
    }
}

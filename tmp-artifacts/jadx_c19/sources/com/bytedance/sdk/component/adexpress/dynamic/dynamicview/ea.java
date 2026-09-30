package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Map;
import o.CompositionLocalKtExternalSyntheticLambda0;
import o.CompositionLocalKtExternalSyntheticLambda3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ea extends lt {
    private String ycx;

    public ea(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        if (!TextUtils.isEmpty(this.ok.bh()) && fbyVar.uh()) {
            com.bytedance.sdk.component.adexpress.lt.jc jcVar = new com.bytedance.sdk.component.adexpress.lt.jc(context);
            jcVar.setAnimationsLoop(this.ok.aq());
            jcVar.setImageLottieTosPath(this.ok.bh());
            jcVar.setLottieAppNameMaxLength(this.ok.xf());
            jcVar.setLottieAdTitleMaxLength(this.ok.uu());
            jcVar.setLottieAdDescMaxLength(this.ok.bjp());
            jcVar.setData(fbyVar.htf());
            this.syc = jcVar;
        } else if (this.ok.syc() > 0.0f) {
            com.bytedance.sdk.component.adexpress.lt.dv dvVar = new com.bytedance.sdk.component.adexpress.lt.dv(context);
            this.syc = dvVar;
            dvVar.setXRound((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(context, this.ok.syc()));
            ((com.bytedance.sdk.component.adexpress.lt.dv) this.syc).setYRound((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(context, this.ok.syc()));
        } else if (!fby() && "arrowButton".equals(fbyVar.jc().zb())) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.zb zbVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.zb(context);
            zbVar.setBrickNativeValue(this.ok);
            this.syc = zbVar;
        } else {
            this.syc = new ImageView(context);
        }
        this.ycx = getImageKey();
        this.syc.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(fbyVar.jc().zb())) {
            if (this.ok.zb() > 0 || this.ok.ycx() > 0) {
                int iMin = Math.min(this.ul, this.fby);
                this.ul = iMin;
                this.fby = Math.min(iMin, this.fby);
                this.jw = (int) (this.jw + com.bytedance.sdk.component.adexpress.dj.ul.ycx(context, this.ok.zb() + (this.ok.ycx() / 2) + 0.5f));
            } else {
                int iMax = Math.max(this.ul, this.fby);
                this.ul = iMax;
                this.fby = Math.max(iMax, this.fby);
            }
            this.ok.ycx(this.ul / 2);
        }
        addView(this.syc, new FrameLayout.LayoutParams(this.ul, this.fby));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.syc).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !CompositionLocalKtExternalSyntheticLambda0.onWarmupCompleted(drawable)) {
            return;
        }
        CompositionLocalKtExternalSyntheticLambda3.pG_(drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.syc).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !CompositionLocalKtExternalSyntheticLambda0.onWarmupCompleted(drawable)) {
            return;
        }
        CompositionLocalKtExternalSyntheticLambda3.pG_(drawable).stop();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rmy
    public boolean jw() throws Throwable {
        int iWie;
        super.jw();
        if (!TextUtils.isEmpty(this.ok.bh())) {
            ((ImageView) this.syc).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iDy = 0;
        if ("arrowButton".equals(this.ry.jc().zb())) {
            ((ImageView) this.syc).setImageResource(com.bytedance.sdk.component.utils.wwx.dj(this.ea, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.syc).getDrawable() != null) {
                ((ImageView) this.syc).getDrawable().setAutoMirrored(true);
            }
            this.syc.setPadding(0, 0, 0, 0);
            ((ImageView) this.syc).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.syc.setBackgroundColor(this.ok.bhi());
        String strSya = this.ry.jc().sya();
        if ("user".equals(strSya)) {
            ((ImageView) this.syc).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.syc).setColorFilter(this.ok.ul());
            ((ImageView) this.syc).setImageDrawable(com.bytedance.sdk.component.utils.wwx.sya(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.syc;
            int i2 = this.ul / 10;
            imageView.setPadding(i2, this.fby / 5, i2, 0);
        } else if (strSya != null && strSya.startsWith("@")) {
            try {
                ((ImageView) this.syc).setImageResource(Integer.parseInt(strSya.substring(1)));
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61au6NS9BYuhilPw==", "Wv49mRqSaNOJXNJumAisLQ==", 146);
            }
        }
        com.bytedance.sdk.component.lud.syc sycVarLud = com.bytedance.sdk.component.adexpress.ycx.ycx.ycx.ycx().lud();
        String strEa = this.ok.ea();
        if (!TextUtils.isEmpty(strEa) && !strEa.startsWith("http:") && !strEa.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.xkz;
            strEa = com.bytedance.sdk.component.adexpress.dynamic.lud.jw.zb(strEa, (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) ? null : this.xkz.getRenderRequest().dv());
        }
        com.bytedance.sdk.component.adexpress.ycx.ycx.sya syaVarSya = com.bytedance.sdk.component.adexpress.ycx.ycx.ycx.ycx().sya();
        if (syaVarSya != null) {
            iDy = syaVarSya.dy();
            iWie = syaVarSya.wie();
        } else {
            iWie = 0;
        }
        com.bytedance.sdk.component.lud.jc jcVarLud = sycVarLud.ycx(strEa).ycx(this.ycx).ycx(this.ul).zb(this.fby).dj(iDy).lud(iWie);
        String strXkz = this.xkz.getRenderRequest().xkz();
        if (!TextUtils.isEmpty(strXkz)) {
            jcVarLud.zb(strXkz);
        }
        if (ycx()) {
            ((ImageView) this.syc).setScaleType(ImageView.ScaleType.FIT_CENTER);
            jcVarLud.ycx(Bitmap.Config.ARGB_4444).sya(2).ycx(new ycx(this.ea)).ycx(new zb(this.syc, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.dj.zb()) {
                jcVarLud.sya(1).ycx((ImageView) this.syc);
            }
            ((ImageView) this.syc).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.syc instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.syc).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }

    static class ycx implements com.bytedance.sdk.component.lud.fby {
        private final WeakReference<Context> ycx;

        public ycx(Context context) {
            this.ycx = new WeakReference<>(context);
        }

        public Bitmap ycx(Bitmap bitmap) {
            Context context = this.ycx.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.dj.ycx.ycx(context, bitmap, 25);
            }
            return null;
        }
    }

    static class zb implements com.bytedance.sdk.component.lud.dy {
        private WeakReference<View> ycx;
        private Resources zb;

        public void ycx(int i2, String str, @Nullable Throwable th) {
        }

        public zb(View view, Resources resources) {
            this.ycx = new WeakReference<>(view);
            this.zb = resources;
        }

        public void ycx(com.bytedance.sdk.component.lud.ea eaVar) {
            Object objZb;
            View view = this.ycx.get();
            if (view == null || (objZb = eaVar.zb()) == null || eaVar.sya() == null) {
                return;
            }
            if (objZb instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.zb, (Bitmap) objZb));
            } else if (objZb instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && CompositionLocalKtExternalSyntheticLambda0.onWarmupCompleted(objZb)) {
                    CompositionLocalKtExternalSyntheticLambda3.pG_(objZb).start();
                }
                view.setBackground((Drawable) objZb);
            }
        }
    }

    private boolean ycx() {
        String strOk = this.ok.ok();
        if (this.ok.htf()) {
            return true;
        }
        if (TextUtils.isEmpty(strOk)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strOk);
            return Math.abs((((float) this.ul) / ((float) this.fby)) - (((float) jSONObject.optInt("width")) / ((float) jSONObject.optInt("height")))) > 0.01f;
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61au6NS9BYuhilPw==", "Uv0PmRau", 270);
            return false;
        }
    }

    private String getImageKey() {
        Map mapEa = this.xkz.getRenderRequest().ea();
        if (mapEa == null || mapEa.size() <= 0) {
            return null;
        }
        return (String) mapEa.get(this.ok.ea());
    }
}

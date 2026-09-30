package com.bytedance.adsdk.zb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.zb.lud.wwx;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw extends Drawable implements Animatable, Drawable.Callback {
    private RectF aeu;
    private Canvas av;
    private Bitmap bhi;
    private boolean dc;
    private ul dj;
    private boolean dv;
    private Matrix dwi;
    private Map<String, Typeface> dy;
    private final ValueAnimator.AnimatorUpdateListener ea;
    private boolean fby;
    private boolean hf;
    private com.bytedance.adsdk.zb.sya.sya.zb htf;
    private RectF ifb;
    private final ArrayList<ycx> jc;
    private zb jw;
    private Rect kgy;
    private boolean lt;
    private final com.bytedance.adsdk.zb.lt.sya lud;
    private View nji;
    private Matrix oby;
    private com.bytedance.adsdk.zb.zb.zb ok;
    private uh oty;
    private boolean pmi;
    private Rect rmf;
    private Rect rmy;
    private String ry;
    htf sya;
    private com.bytedance.adsdk.zb.zb.ycx syc;
    private int thx;
    private boolean tn;
    private final Matrix tru;
    private boolean uh;
    private boolean ul;
    private boolean wie;
    private boolean wwx;
    private dj xkz;
    private Paint xz;
    String ycx;
    private RectF yzp;
    sya zb;

    interface ycx {
        void ycx(ul ulVar);
    }

    enum zb {
        NONE,
        PLAY,
        RESUME
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public jw() {
        com.bytedance.adsdk.zb.lt.sya syaVar = new com.bytedance.adsdk.zb.lt.sya();
        this.lud = syaVar;
        this.lt = true;
        this.ul = false;
        this.fby = false;
        this.jw = zb.NONE;
        this.jc = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.zb.jw.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (jw.this.htf != null) {
                    jw.this.htf.ycx(jw.this.lud.lt());
                }
            }
        };
        this.ea = animatorUpdateListener;
        this.pmi = false;
        this.uh = true;
        this.thx = OggPageHeader.MAX_SEGMENT_COUNT;
        this.oty = uh.AUTOMATIC;
        this.hf = false;
        this.tru = new Matrix();
        this.dc = false;
        syaVar.addUpdateListener(animatorUpdateListener);
    }

    public void ycx(View view) {
        this.nji = view;
    }

    public View ycx() {
        return this.nji;
    }

    public void ycx(boolean z, Context context) {
        if (this.wie != z) {
            this.wie = z;
            if (this.dj != null) {
                ycx(context);
            }
        }
    }

    public void ycx(boolean z) {
        if (z != this.uh) {
            this.uh = z;
            com.bytedance.adsdk.zb.sya.sya.zb zbVar = this.htf;
            if (zbVar != null) {
                zbVar.zb(z);
            }
            invalidateSelf();
        }
    }

    public com.bytedance.adsdk.zb.sya.sya.zb zb() {
        return this.htf;
    }

    public boolean sya() {
        return this.uh;
    }

    public void ycx(String str) {
        this.ry = str;
    }

    public String dj() {
        return this.ry;
    }

    public void zb(boolean z) {
        this.pmi = z;
    }

    public boolean lud() {
        return this.pmi;
    }

    public boolean ycx(ul ulVar, Context context) {
        if (this.dj == ulVar) {
            return false;
        }
        this.dc = true;
        jc();
        this.dj = ulVar;
        ycx(context);
        this.lud.ycx(ulVar);
        dj(this.lud.getAnimatedFraction());
        Iterator it = new ArrayList(this.jc).iterator();
        while (it.hasNext()) {
            ycx ycxVar = (ycx) it.next();
            if (ycxVar != null) {
                ycxVar.ycx(ulVar);
            }
            it.remove();
        }
        this.jc.clear();
        ulVar.zb(this.wwx);
        aeu();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void ycx(uh uhVar) {
        this.oty = uhVar;
        aeu();
    }

    public uh lt() {
        return this.hf ? uh.SOFTWARE : uh.HARDWARE;
    }

    private void aeu() {
        ul ulVar = this.dj;
        if (ulVar == null) {
            return;
        }
        this.hf = this.oty.ycx(Build.VERSION.SDK_INT, ulVar.ycx(), ulVar.zb());
    }

    public boolean ul() {
        return this.hf;
    }

    public void sya(boolean z) {
        this.wwx = z;
        ul ulVar = this.dj;
        if (ulVar != null) {
            ulVar.zb(z);
        }
    }

    public void dj(boolean z) {
        if (this.tn != z) {
            this.tn = z;
            com.bytedance.adsdk.zb.sya.sya.zb zbVar = this.htf;
            if (zbVar != null) {
                zbVar.ycx(z);
            }
        }
    }

    public pmi fby() {
        ul ulVar = this.dj;
        if (ulVar != null) {
            return ulVar.sya();
        }
        return null;
    }

    public void lud(boolean z) {
        this.dv = z;
    }

    public boolean jw() {
        return this.dv;
    }

    private void ycx(Context context) {
        ul ulVar = this.dj;
        if (ulVar == null) {
            return;
        }
        com.bytedance.adsdk.zb.sya.sya.zb zbVar = new com.bytedance.adsdk.zb.sya.sya.zb(this, wwx.ycx(ulVar), ulVar.ry(), ulVar, context);
        this.htf = zbVar;
        if (this.tn) {
            zbVar.ycx(true);
        }
        this.htf.zb(this.uh);
    }

    public void jc() {
        if (this.lud.isRunning()) {
            this.lud.cancel();
            if (!isVisible()) {
                this.jw = zb.NONE;
            }
        }
        this.dj = null;
        this.htf = null;
        this.ok = null;
        this.lud.fby();
        invalidateSelf();
    }

    public void lt(boolean z) {
        this.fby = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.dc) {
            return;
        }
        this.dc = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.thx = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.thx;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        lud.ycx("Drawable#draw");
        try {
            if (this.hf) {
                ycx(canvas, this.htf);
            } else {
                ycx(canvas);
            }
        } catch (Throwable unused) {
        }
        this.dc = false;
        lud.zb("Drawable#draw");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        ea();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        ok();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return wwx();
    }

    public void ea() {
        if (this.htf == null) {
            this.jc.add(new ycx() { // from class: com.bytedance.adsdk.zb.jw.6
                @Override // com.bytedance.adsdk.zb.jw.ycx
                public void ycx(ul ulVar) {
                    jw.this.ea();
                }
            });
            return;
        }
        aeu();
        if (xz() || thx() == 0) {
            if (isVisible()) {
                this.lud.ea();
                this.jw = zb.NONE;
            } else {
                this.jw = zb.PLAY;
            }
        }
        if (xz()) {
            return;
        }
        sya((int) (dy() < 0.0f ? xkz() : syc()));
        this.lud.ok();
        if (isVisible()) {
            return;
        }
        this.jw = zb.NONE;
    }

    public void ok() {
        this.jc.clear();
        this.lud.ok();
        if (isVisible()) {
            return;
        }
        this.jw = zb.NONE;
    }

    public void ry() {
        if (this.htf == null) {
            this.jc.add(new ycx() { // from class: com.bytedance.adsdk.zb.jw.7
                @Override // com.bytedance.adsdk.zb.jw.ycx
                public void ycx(ul ulVar) {
                    jw.this.ry();
                }
            });
            return;
        }
        aeu();
        if (xz() || thx() == 0) {
            if (isVisible()) {
                this.lud.xkz();
                this.jw = zb.NONE;
            } else {
                this.jw = zb.RESUME;
            }
        }
        if (xz()) {
            return;
        }
        sya((int) (dy() < 0.0f ? xkz() : syc()));
        this.lud.ok();
        if (isVisible()) {
            return;
        }
        this.jw = zb.NONE;
    }

    public void ycx(final int i2) {
        if (this.dj == null) {
            this.jc.add(new ycx() { // from class: com.bytedance.adsdk.zb.jw.8
                @Override // com.bytedance.adsdk.zb.jw.ycx
                public void ycx(ul ulVar) {
                    jw.this.ycx(i2);
                }
            });
        } else {
            this.lud.ycx(i2);
        }
    }

    public float xkz() {
        return this.lud.syc();
    }

    public void ycx(final float f) {
        ul ulVar = this.dj;
        if (ulVar == null) {
            this.jc.add(new ycx() { // from class: com.bytedance.adsdk.zb.jw.9
                @Override // com.bytedance.adsdk.zb.jw.ycx
                public void ycx(ul ulVar2) {
                    jw.this.ycx(f);
                }
            });
        } else {
            ycx((int) com.bytedance.adsdk.zb.lt.lud.ycx(ulVar.lt(), this.dj.ul(), f));
        }
    }

    public void zb(final int i2) {
        if (this.dj == null) {
            this.jc.add(new ycx() { // from class: com.bytedance.adsdk.zb.jw.10
                @Override // com.bytedance.adsdk.zb.jw.ycx
                public void ycx(ul ulVar) {
                    jw.this.zb(i2);
                }
            });
        } else {
            this.lud.zb(i2 + 0.99f);
        }
    }

    public float syc() {
        return this.lud.dy();
    }

    public void zb(final float f) {
        ul ulVar = this.dj;
        if (ulVar == null) {
            this.jc.add(new ycx() { // from class: com.bytedance.adsdk.zb.jw.11
                @Override // com.bytedance.adsdk.zb.jw.ycx
                public void ycx(ul ulVar2) {
                    jw.this.zb(f);
                }
            });
        } else {
            this.lud.zb(com.bytedance.adsdk.zb.lt.lud.ycx(ulVar.lt(), this.dj.ul(), f));
        }
    }

    public void zb(final String str) {
        ul ulVar = this.dj;
        if (ulVar == null) {
            this.jc.add(new ycx() { // from class: com.bytedance.adsdk.zb.jw.12
                @Override // com.bytedance.adsdk.zb.jw.ycx
                public void ycx(ul ulVar2) {
                    jw.this.zb(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.zb.sya.lt ltVarSya = ulVar.sya(str);
        if (ltVarSya == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        ycx((int) ltVarSya.ycx);
    }

    public void sya(final String str) {
        ul ulVar = this.dj;
        if (ulVar == null) {
            this.jc.add(new ycx() { // from class: com.bytedance.adsdk.zb.jw.13
                @Override // com.bytedance.adsdk.zb.jw.ycx
                public void ycx(ul ulVar2) {
                    jw.this.sya(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.zb.sya.lt ltVarSya = ulVar.sya(str);
        if (ltVarSya == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        zb((int) (ltVarSya.ycx + ltVarSya.zb));
    }

    public void dj(final String str) {
        ul ulVar = this.dj;
        if (ulVar == null) {
            this.jc.add(new ycx() { // from class: com.bytedance.adsdk.zb.jw.2
                @Override // com.bytedance.adsdk.zb.jw.ycx
                public void ycx(ul ulVar2) {
                    jw.this.dj(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.zb.sya.lt ltVarSya = ulVar.sya(str);
        if (ltVarSya == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i2 = (int) ltVarSya.ycx;
        ycx(i2, ((int) ltVarSya.zb) + i2);
    }

    public void ycx(final int i2, final int i3) {
        if (this.dj == null) {
            this.jc.add(new ycx() { // from class: com.bytedance.adsdk.zb.jw.3
                @Override // com.bytedance.adsdk.zb.jw.ycx
                public void ycx(ul ulVar) {
                    jw.this.ycx(i2, i3);
                }
            });
        } else {
            this.lud.ycx(i2, i3 + 0.99f);
        }
    }

    public void sya(float f) {
        this.lud.sya(f);
    }

    public float dy() {
        return this.lud.jc();
    }

    public void ycx(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lud.addUpdateListener(animatorUpdateListener);
    }

    public void zb(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lud.removeUpdateListener(animatorUpdateListener);
    }

    public void wie() {
        this.lud.removeAllUpdateListeners();
        this.lud.addUpdateListener(this.ea);
    }

    public void ycx(Animator.AnimatorListener animatorListener) {
        this.lud.addListener(animatorListener);
    }

    public void zb(Animator.AnimatorListener animatorListener) {
        this.lud.removeListener(animatorListener);
    }

    public void pmi() {
        this.lud.removeAllListeners();
    }

    public void sya(final int i2) {
        if (this.dj == null) {
            this.jc.add(new ycx() { // from class: com.bytedance.adsdk.zb.jw.4
                @Override // com.bytedance.adsdk.zb.jw.ycx
                public void ycx(ul ulVar) {
                    jw.this.sya(i2);
                }
            });
        } else {
            this.lud.ycx(i2);
        }
    }

    public int uh() {
        return (int) this.lud.ul();
    }

    public void dj(final float f) {
        if (this.dj == null) {
            this.jc.add(new ycx() { // from class: com.bytedance.adsdk.zb.jw.5
                @Override // com.bytedance.adsdk.zb.jw.ycx
                public void ycx(ul ulVar) {
                    jw.this.dj(f);
                }
            });
            return;
        }
        lud.ycx("Drawable#setProgress");
        this.lud.ycx(this.dj.ycx(f));
        lud.zb("Drawable#setProgress");
    }

    public void dj(int i2) {
        this.lud.setRepeatMode(i2);
    }

    public int htf() {
        return this.lud.getRepeatMode();
    }

    public void lud(int i2) {
        this.lud.setRepeatCount(i2);
    }

    public int thx() {
        return this.lud.getRepeatCount();
    }

    public boolean wwx() {
        com.bytedance.adsdk.zb.lt.sya syaVar = this.lud;
        if (syaVar == null) {
            return false;
        }
        return syaVar.isRunning();
    }

    boolean tn() {
        if (isVisible()) {
            return this.lud.isRunning();
        }
        zb zbVar = this.jw;
        return zbVar == zb.PLAY || zbVar == zb.RESUME;
    }

    private boolean xz() {
        return this.lt || this.ul;
    }

    public void ycx(Boolean bool) {
        this.lt = bool.booleanValue();
    }

    public void ul(boolean z) {
        this.ul = z;
    }

    public void fby(boolean z) {
        this.lud.sya(z);
    }

    public void ycx(dj djVar) {
        this.xkz = djVar;
        com.bytedance.adsdk.zb.zb.zb zbVar = this.ok;
        if (zbVar != null) {
            zbVar.ycx(djVar);
        }
    }

    public void ycx(sya syaVar) {
        this.zb = syaVar;
        com.bytedance.adsdk.zb.zb.ycx ycxVar = this.syc;
        if (ycxVar != null) {
            ycxVar.ycx(syaVar);
        }
    }

    public void ycx(Map<String, Typeface> map) {
        if (map == this.dy) {
            return;
        }
        this.dy = map;
        invalidateSelf();
    }

    public void ycx(htf htfVar) {
        this.sya = htfVar;
    }

    public htf dv() {
        return this.sya;
    }

    public boolean oty() {
        return this.dy == null && this.sya == null && this.dj.xkz().size() > 0;
    }

    public ul hf() {
        return this.dj;
    }

    public void tru() {
        this.jc.clear();
        this.lud.cancel();
        if (isVisible()) {
            return;
        }
        this.jw = zb.NONE;
    }

    public void bhi() {
        this.jc.clear();
        this.lud.ry();
        if (isVisible()) {
            return;
        }
        this.jw = zb.NONE;
    }

    public float av() {
        return this.lud.lt();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        ul ulVar = this.dj;
        if (ulVar == null) {
            return -1;
        }
        return ulVar.dj().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        ul ulVar = this.dj;
        if (ulVar == null) {
            return -1;
        }
        return ulVar.dj().height();
    }

    public Bitmap ycx(String str, Bitmap bitmap) {
        com.bytedance.adsdk.zb.zb.zb zbVarRmy = rmy();
        if (zbVarRmy == null) {
            return null;
        }
        Bitmap bitmapYcx = zbVarRmy.ycx(str, bitmap);
        invalidateSelf();
        return bitmapYcx;
    }

    public Bitmap lud(String str) {
        com.bytedance.adsdk.zb.zb.zb zbVarRmy = rmy();
        if (zbVarRmy != null) {
            return zbVarRmy.ycx(str);
        }
        return null;
    }

    public jc lt(String str) {
        ul ulVar = this.dj;
        if (ulVar == null) {
            return null;
        }
        return ulVar.dy().get(str);
    }

    private com.bytedance.adsdk.zb.zb.zb rmy() {
        com.bytedance.adsdk.zb.zb.zb zbVar = this.ok;
        if (zbVar != null && !zbVar.ycx(ifb())) {
            this.ok = null;
        }
        if (this.ok == null) {
            this.ok = new com.bytedance.adsdk.zb.zb.zb(getCallback(), this.ry, this.xkz, this.dj.dy());
        }
        return this.ok;
    }

    public Typeface ycx(com.bytedance.adsdk.zb.sya.sya syaVar) {
        Map<String, Typeface> map = this.dy;
        if (map != null) {
            String strYcx = syaVar.ycx();
            if (map.containsKey(strYcx)) {
                return map.get(strYcx);
            }
            String strZb = syaVar.zb();
            if (map.containsKey(strZb)) {
                return map.get(strZb);
            }
            String str = syaVar.ycx() + "-" + syaVar.sya();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.zb.zb.ycx ycxVarKgy = kgy();
        if (ycxVarKgy != null) {
            return ycxVarKgy.ycx(syaVar);
        }
        return null;
    }

    private com.bytedance.adsdk.zb.zb.ycx kgy() {
        if (getCallback() == null) {
            return null;
        }
        if (this.syc == null) {
            com.bytedance.adsdk.zb.zb.ycx ycxVar = new com.bytedance.adsdk.zb.zb.ycx(getCallback(), this.zb);
            this.syc = ycxVar;
            String str = this.ycx;
            if (str != null) {
                ycxVar.ycx(str);
            }
        }
        return this.syc;
    }

    public void ul(String str) {
        this.ycx = str;
        com.bytedance.adsdk.zb.zb.ycx ycxVarKgy = kgy();
        if (ycxVarKgy != null) {
            ycxVarKgy.ycx(str);
        }
    }

    private Context ifb() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            zb zbVar = this.jw;
            if (zbVar == zb.PLAY) {
                ea();
                return visible;
            }
            if (zbVar == zb.RESUME) {
                ry();
                return visible;
            }
        } else {
            if (this.lud.isRunning()) {
                bhi();
                this.jw = zb.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.jw = zb.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    private void ycx(Canvas canvas) {
        com.bytedance.adsdk.zb.sya.sya.zb zbVar = this.htf;
        ul ulVar = this.dj;
        if (zbVar == null || ulVar == null) {
            return;
        }
        this.tru.reset();
        if (!getBounds().isEmpty()) {
            this.tru.preScale(r2.width() / ulVar.dj().width(), r2.height() / ulVar.dj().height());
            this.tru.preTranslate(r2.left, r2.top);
        }
        zbVar.ycx(canvas, this.tru, this.thx);
    }

    public RectF rmf() {
        return this.yzp;
    }

    private void ycx(Canvas canvas, com.bytedance.adsdk.zb.sya.sya.zb zbVar) {
        if (this.dj == null || zbVar == null) {
            return;
        }
        yzp();
        canvas.getMatrix(this.dwi);
        canvas.getClipBounds(this.rmf);
        ycx(this.rmf, this.aeu);
        this.dwi.mapRect(this.aeu);
        ycx(this.aeu, this.rmf);
        if (this.uh) {
            this.yzp.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            zbVar.ycx(this.yzp, (Matrix) null, false);
        }
        this.dwi.mapRect(this.yzp);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        ycx(this.yzp, fWidth, fHeight);
        if (!dwi()) {
            RectF rectF = this.yzp;
            Rect rect = this.rmf;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.yzp.width());
        int iCeil2 = (int) Math.ceil(this.yzp.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        zb(iCeil, iCeil2);
        if (this.dc) {
            this.tru.set(this.dwi);
            this.tru.preScale(fWidth, fHeight);
            Matrix matrix = this.tru;
            RectF rectF2 = this.yzp;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.bhi.eraseColor(0);
            zbVar.ycx(this.av, this.tru, this.thx);
            this.dwi.invert(this.oby);
            this.oby.mapRect(this.ifb, this.yzp);
            ycx(this.ifb, this.kgy);
        }
        this.rmy.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.bhi, this.rmy, this.kgy, this.xz);
    }

    private void yzp() {
        if (this.av != null) {
            return;
        }
        this.av = new Canvas();
        this.yzp = new RectF();
        this.dwi = new Matrix();
        this.oby = new Matrix();
        this.rmf = new Rect();
        this.aeu = new RectF();
        this.xz = new com.bytedance.adsdk.zb.ycx.ycx();
        this.rmy = new Rect();
        this.kgy = new Rect();
        this.ifb = new RectF();
    }

    private void zb(int i2, int i3) {
        Bitmap bitmap = this.bhi;
        if (bitmap == null || bitmap.getWidth() < i2 || this.bhi.getHeight() < i3) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            this.bhi = bitmapCreateBitmap;
            this.av.setBitmap(bitmapCreateBitmap);
            this.dc = true;
            return;
        }
        if (this.bhi.getWidth() > i2 || this.bhi.getHeight() > i3) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.bhi, 0, 0, i2, i3);
            this.bhi = bitmapCreateBitmap2;
            this.av.setBitmap(bitmapCreateBitmap2);
            this.dc = true;
        }
    }

    private void ycx(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void ycx(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void ycx(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    private boolean dwi() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }
}

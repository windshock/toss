package com.bytedance.adsdk.zb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.zb.ul;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt extends ImageView {
    private static final String ycx = "lt";
    private static final ea<Throwable> zb = new ea<Throwable>() { // from class: com.bytedance.adsdk.zb.lt.1
        @Override // com.bytedance.adsdk.zb.ea
        public void ycx(Throwable th) {
            com.bytedance.adsdk.zb.lt.lt.ycx(th);
        }
    };
    private zb av;
    private final Runnable bhi;
    private final ea<Throwable> dj;
    private int dv;
    private ul dy;
    private boolean ea;
    private String fby;
    private String hf;
    private long htf;
    private boolean jc;
    private int jw;
    private int lt;
    private ea<Throwable> lud;
    private boolean ok;
    private int oty;
    private int pmi;
    private ycx rmf;
    private final Set<dj> ry;
    private final ea<ul> sya;
    private ry<ul> syc;
    private com.bytedance.adsdk.zb.sya.sya.sya thx;
    private int tn;
    private JSONArray tru;
    private Handler uh;
    private final jw ul;
    private final Handler wie;
    private int wwx;
    private final Set<Object> xkz;

    enum dj {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public interface ycx {
    }

    public interface zb {
    }

    static /* synthetic */ int lud(lt ltVar) {
        int i2 = ltVar.pmi;
        ltVar.pmi = i2 + 1;
        return i2;
    }

    static /* synthetic */ int pmi(lt ltVar) {
        int i2 = ltVar.wwx;
        ltVar.wwx = i2 - 1;
        return i2;
    }

    /* renamed from: com.bytedance.adsdk.zb.lt$lt, reason: collision with other inner class name */
    static class C0012lt implements ea<ul> {
        private final WeakReference<lt> ycx;

        C0012lt(lt ltVar) {
            this.ycx = new WeakReference<>(ltVar);
        }

        @Override // com.bytedance.adsdk.zb.ea
        public void ycx(ul ulVar) {
            lt ltVar = this.ycx.get();
            if (ltVar == null) {
                return;
            }
            ltVar.setComposition(ulVar);
        }
    }

    static class lud implements ea<Throwable> {
        private final WeakReference<lt> ycx;

        lud(lt ltVar) {
            this.ycx = new WeakReference<>(ltVar);
        }

        @Override // com.bytedance.adsdk.zb.ea
        public void ycx(Throwable th) {
            lt ltVar = this.ycx.get();
            if (ltVar == null) {
                return;
            }
            if (ltVar.lt != 0) {
                ltVar.setImageResource(ltVar.lt);
            }
            (ltVar.lud == null ? lt.zb : ltVar.lud).ycx(th);
        }
    }

    public lt(Context context) {
        super(context);
        this.sya = new C0012lt(this);
        this.dj = new lud(this);
        this.lt = 0;
        this.ul = new jw();
        this.jc = false;
        this.ea = false;
        this.ok = true;
        this.ry = new HashSet();
        this.xkz = new HashSet();
        this.wie = new Handler(Looper.getMainLooper());
        this.pmi = 0;
        this.htf = 0L;
        this.bhi = new Runnable() { // from class: com.bytedance.adsdk.zb.lt.2
            @Override // java.lang.Runnable
            public void run() {
                int unused = lt.this.wwx;
                int unused2 = lt.this.tn;
                if (lt.this.wwx <= lt.this.tn) {
                    if (lt.this.dv < 0 || lt.this.oty < 0) {
                        int unused3 = lt.this.dv;
                        int unused4 = lt.this.oty;
                    } else {
                        int unused5 = lt.this.dv;
                        lt.this.ycx();
                        lt ltVar = lt.this;
                        ltVar.setFrame(ltVar.dv);
                        lt.this.ycx(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.zb.lt.2.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                if (lt.this.getFrame() < lt.this.oty - 1 || lt.this.getFrame() >= lt.this.oty + 2) {
                                    return;
                                }
                                int unused6 = lt.this.oty;
                                lt.this.zb(this);
                                lt.this.lt();
                            }
                        });
                    }
                    if ((!TextUtils.isEmpty(lt.this.hf) || (lt.this.tru != null && lt.this.tru.length() > 0)) && lt.this.av != null) {
                        zb unused6 = lt.this.av;
                        String unused7 = lt.this.hf;
                        JSONArray unused8 = lt.this.tru;
                        return;
                    }
                    return;
                }
                lt.pmi(lt.this);
                com.bytedance.adsdk.zb.sya.sya.sya syaVar = lt.this.thx;
                StringBuilder sb = new StringBuilder();
                sb.append(lt.this.wwx);
                syaVar.ycx(sb.toString());
                lt.this.invalidate();
                lt.this.syc();
            }
        };
        fby();
    }

    private void fby() {
        setSaveEnabled(false);
        this.ok = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        ycx(0.0f, false);
        ycx(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.ul.ycx(Boolean.valueOf(com.bytedance.adsdk.zb.lt.lt.ycx(getContext()) != 0.0f));
        jw();
        jc();
        ok();
    }

    private void jw() {
        ycx(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.zb.lt.4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) throws NumberFormatException {
                lt.this.zb(this);
                lt.this.xkz();
                lt.this.ea();
            }
        });
    }

    private void jc() {
        ycx(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.zb.lt.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) throws NumberFormatException {
                int i2;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                lt.lud(lt.this);
                ul.ycx globalConfig = lt.this.getGlobalConfig();
                if (globalConfig != null && (i2 = globalConfig.dj) > 0 && i2 > lt.this.pmi) {
                    lt.this.xkz();
                    lt.this.ycx();
                    lt.this.setProgress(0.0f);
                } else {
                    lt.this.zb(this);
                    if (lt.this.rmf != null) {
                        ycx unused = lt.this.rmf;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ea() {
        final ul.ycx globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.lud <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.lt) && globalConfig.ul == null) {
            return;
        }
        int maxFrame = globalConfig.lud;
        if (maxFrame > getMaxFrame()) {
            maxFrame = (int) getMaxFrame();
        }
        final float maxFrame2 = maxFrame / getMaxFrame();
        ycx(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.zb.lt.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame2) {
                    return;
                }
                lt.this.zb(this);
                if (lt.this.av != null) {
                    zb unused = lt.this.av;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycx(long j) {
        Map<String, Object> map;
        ul.ycx globalConfig = getGlobalConfig();
        if (this.rmf != null) {
            HashMap map2 = new HashMap();
            map2.put("duration", Long.valueOf(j));
            if (globalConfig == null || (map = globalConfig.zb) == null || map.isEmpty()) {
                return;
            }
            map2.putAll(globalConfig.zb);
        }
    }

    private void ok() {
        ycx(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.zb.lt.7
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) throws NumberFormatException {
                htf htfVarDv;
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - lt.this.htf;
                lt.this.zb(this);
                String playDelayedELExpressTimeS = lt.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (htfVarDv = lt.this.ul.dv()) != null) {
                    try {
                        int i2 = Integer.parseInt(htfVarDv.ycx(playDelayedELExpressTimeS));
                        if (lt.this.htf > 0) {
                            long jElapsedRealtime2 = (lt.this.htf + (i2 * 1000)) - SystemClock.elapsedRealtime();
                            if (jElapsedRealtime2 > 0) {
                                lt.this.lt();
                                lt.this.setVisibility(8);
                                if (lt.this.uh == null) {
                                    lt.this.uh = new Handler(Looper.getMainLooper());
                                }
                                lt.this.uh.removeCallbacksAndMessages(null);
                                lt.this.uh.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.zb.lt.7.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        lt.this.setVisibility(0);
                                        lt.this.ycx();
                                        lt.this.ycx(jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                lt.this.ycx(jElapsedRealtime);
            }
        });
    }

    public void setView(View view) {
        this.ul.ycx(view);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        ry();
        super.setImageResource(i2);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ry();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        ry();
        super.setImageBitmap(bitmap);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        jw jwVar;
        if (!this.jc && drawable == (jwVar = this.ul) && jwVar.wwx()) {
            lt();
        } else if (!this.jc && (drawable instanceof jw)) {
            jw jwVar2 = (jw) drawable;
            if (jwVar2.wwx()) {
                jwVar2.bhi();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof jw) && ((jw) drawable).lt() == uh.SOFTWARE) {
            this.ul.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        jw jwVar = this.ul;
        if (drawable2 == jwVar) {
            super.invalidateDrawable(jwVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        ul ulVarHf;
        jw jwVar = this.ul;
        if (jwVar == null || (ulVarHf = jwVar.hf()) == null) {
            return null;
        }
        return ulVarHf.jw();
    }

    private jc ycx(String str) {
        jw jwVar;
        ul ulVarHf;
        Map<String, jc> mapDy;
        if (TextUtils.isEmpty(str) || (jwVar = this.ul) == null || (ulVarHf = jwVar.hf()) == null || (mapDy = ulVarHf.dy()) == null) {
            return null;
        }
        return mapDy.get(str);
    }

    private ul.zb getGlobalEvent() {
        ul ulVarHf;
        jw jwVar = this.ul;
        if (jwVar == null || (ulVarHf = jwVar.hf()) == null) {
            return null;
        }
        return ulVarHf.jc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ul.ycx getGlobalConfig() {
        ul ulVarHf;
        jw jwVar = this.ul;
        if (jwVar == null || (ulVarHf = jwVar.hf()) == null) {
            return null;
        }
        return ulVarHf.ea();
    }

    private void ycx(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i2 = iArr2[0];
            final int i3 = iArr2[1];
            if (i2 < 0 || i3 < 0) {
                return;
            }
            dy();
            ycx();
            setFrame(i2);
            ycx(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.zb.lt.8
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (lt.this.getFrame() < i3 - 1 || lt.this.getFrame() >= i3 + 2) {
                        return;
                    }
                    lt.this.getFrame();
                    lt.this.zb(this);
                    lt.this.lt();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void ycx(String str, String str2, JSONArray jSONArray) {
        ul.zb globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.ycx;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.sya;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.zb.sya.sya.ycx ycxVarYcx = ycx(motionEvent);
        if (ycxVarYcx != null) {
            String strJw = ycxVarYcx.jw();
            if (ycxVarYcx instanceof com.bytedance.adsdk.zb.sya.sya.zb) {
                if (getGlobalConfig() == null || getGlobalConfig().ycx != 1) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            }
            if (strJw != null && strJw.startsWith("CSJCLOSE")) {
                dy();
            }
            jc jcVarYcx = ycx(ycxVarYcx.lud());
            if (jcVarYcx != null && motionEvent.getAction() == 1) {
                ycx(strJw, jcVarYcx.lud(), jcVarYcx.ul());
                int[][] iArrLt = jcVarYcx.lt();
                if (iArrLt != null) {
                    ycx(iArrLt);
                } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().zb) != null) {
                    ycx(iArr);
                }
            }
            if (strJw == null || !strJw.startsWith("CSJNTP")) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (getGlobalConfig() == null || getGlobalConfig().ycx != 1) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    private com.bytedance.adsdk.zb.sya.sya.ycx ycx(MotionEvent motionEvent) {
        com.bytedance.adsdk.zb.sya.sya.zb zbVarZb;
        jw jwVar = this.ul;
        if (jwVar == null || (zbVarZb = jwVar.zb()) == null) {
            return null;
        }
        return ycx(zbVarZb, motionEvent);
    }

    private com.bytedance.adsdk.zb.sya.sya.ycx ycx(com.bytedance.adsdk.zb.sya.sya.zb zbVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.zb.sya.sya.ycx ycxVarYcx;
        for (com.bytedance.adsdk.zb.sya.sya.ycx ycxVar : zbVar.ok()) {
            if (ycxVar instanceof com.bytedance.adsdk.zb.sya.sya.zb) {
                if (ycxVar.fby() && ycxVar.lt() > 0.0f) {
                    RectF rectF = new RectF();
                    ycxVar.ycx(rectF, ycxVar.dj(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (ycxVarYcx = ycx((com.bytedance.adsdk.zb.sya.sya.zb) ycxVar, motionEvent)) != null) {
                        return ycxVarYcx;
                    }
                }
            } else if (ycxVar.fby() && ycxVar.lt() > 0.0f) {
                RectF rectF2 = new RectF();
                jw jwVar = this.ul;
                if (jwVar != null && jwVar.ul()) {
                    ycxVar.ycx(rectF2, ycxVar.dj(), true);
                    RectF rectFRmf = this.ul.rmf();
                    if (rectFRmf != null) {
                        ycx(rectF2, rectFRmf);
                    }
                } else {
                    RectF rectF3 = new RectF();
                    ycxVar.ycx(rectF3, ycxVar.dj(), true);
                    zb(rectF2, rectF3);
                }
                if (ycx(motionEvent, rectF2)) {
                    return ycxVar;
                }
            }
        }
        return null;
    }

    private boolean ycx(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent == null || rectF == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= rectF.left && x <= rectF.right && y >= rectF.top && y <= rectF.bottom;
    }

    private void ycx(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i2 = AnonymousClass3.ycx[getScaleType().ordinal()];
        if (i2 == 1) {
            ycx(matrix, width, height, fWidth, fHeight);
        } else if (i2 == 2) {
            zb(matrix, width, height, fWidth, fHeight);
        } else if (i2 == 3) {
            sya(matrix, width, height, fWidth, fHeight);
        } else if (i2 == 4) {
            dj(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    /* renamed from: com.bytedance.adsdk.zb.lt$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] ycx;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ycx = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ycx[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ycx[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ycx[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void zb(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.ul.getBounds().width();
        float fHeight = this.ul.getBounds().height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i2 = AnonymousClass3.ycx[getScaleType().ordinal()];
        if (i2 == 1) {
            ycx(matrix, width, height, fWidth, fHeight);
        } else if (i2 == 2) {
            zb(matrix, width, height, fWidth, fHeight);
        } else if (i2 == 3) {
            sya(matrix, width, height, fWidth, fHeight);
        } else if (i2 == 4) {
            dj(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    private void ycx(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 / f4 >= f / f2) {
            float f5 = f2 / f4;
            matrix.preScale(f5, f5);
            matrix.postTranslate(-(((f3 * f5) - f) / 2.0f), 0.0f);
        } else {
            float f6 = f / f3;
            matrix.preScale(f6, f6);
            matrix.postTranslate(0.0f, -(((f4 * f6) - f2) / 2.0f));
        }
    }

    private void zb(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 < f && f4 < f2) {
            matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
            return;
        }
        if (f3 / f4 >= f / f2) {
            float f5 = f / f3;
            matrix.preScale(f5, f5);
            matrix.postTranslate(0.0f, (f2 - (f4 * f5)) / 2.0f);
        } else {
            float f6 = f2 / f4;
            matrix.preScale(f6, f6);
            matrix.postTranslate((f - (f3 * f6)) / 2.0f, 0.0f);
        }
    }

    private void sya(Matrix matrix, float f, float f2, float f3, float f4) {
        matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
    }

    private void dj(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 >= f || f4 >= f2) {
            if (f3 / f4 >= f / f2) {
                float f5 = f / f3;
                matrix.preScale(f5, f5);
                matrix.postTranslate(0.0f, (f2 - (f4 * f5)) / 2.0f);
                return;
            } else {
                float f6 = f2 / f4;
                matrix.preScale(f6, f6);
                matrix.postTranslate((f - (f3 * f6)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f3 / f4 >= f / f2) {
            float f7 = f / f3;
            matrix.preScale(f7, f7);
            matrix.postTranslate(0.0f, (f2 - (f4 * f7)) / 2.0f);
        } else {
            float f8 = f2 / f4;
            matrix.preScale(f8, f8);
            matrix.postTranslate((f - (f3 * f8)) / 2.0f, 0.0f);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        sya syaVar = new sya(super.onSaveInstanceState());
        syaVar.ycx = this.fby;
        syaVar.zb = this.jw;
        syaVar.sya = this.ul.av();
        syaVar.dj = this.ul.tn();
        syaVar.lud = this.ul.dj();
        syaVar.lt = this.ul.htf();
        syaVar.ul = this.ul.thx();
        return syaVar;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i2;
        if (!(parcelable instanceof sya)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sya syaVar = (sya) parcelable;
        super.onRestoreInstanceState(syaVar.getSuperState());
        this.fby = syaVar.ycx;
        Set<dj> set = this.ry;
        dj djVar = dj.SET_ANIMATION;
        if (!set.contains(djVar) && !TextUtils.isEmpty(this.fby)) {
            setAnimation(this.fby);
        }
        this.jw = syaVar.zb;
        if (!this.ry.contains(djVar) && (i2 = this.jw) != 0) {
            setAnimation(i2);
        }
        if (!this.ry.contains(dj.SET_PROGRESS)) {
            ycx(syaVar.sya, false);
        }
        if (!this.ry.contains(dj.PLAY_OPTION) && syaVar.dj) {
            ycx();
        }
        if (!this.ry.contains(dj.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(syaVar.lud);
        }
        if (!this.ry.contains(dj.SET_REPEAT_MODE)) {
            setRepeatMode(syaVar.lt);
        }
        if (this.ry.contains(dj.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(syaVar.ul);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.ea) {
            return;
        }
        this.ul.ea();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dy();
        Handler handler = this.uh;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        sya();
        zb();
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.ul.ul(z);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.ul.fby(z);
    }

    public void ycx(boolean z, Context context) {
        this.ul.ycx(z, context);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.ul.ycx(z);
    }

    public boolean getClipToCompositionBounds() {
        return this.ul.sya();
    }

    public void setCacheComposition(boolean z) {
        this.ok = z;
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.ul.dj(z);
    }

    public void setAnimation(int i2) {
        this.jw = i2;
        this.fby = null;
        setCompositionTask(ycx(i2));
    }

    private ry<ul> ycx(final int i2) {
        if (isInEditMode()) {
            return new ry<>(new Callable<ok<ul>>() { // from class: com.bytedance.adsdk.zb.lt.9
                @Override // java.util.concurrent.Callable
                /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
                public ok<ul> call() throws Exception {
                    return lt.this.ok ? fby.zb(lt.this.getContext(), i2) : fby.zb(lt.this.getContext(), i2, (String) null);
                }
            }, true);
        }
        return this.ok ? fby.ycx(getContext(), i2) : fby.ycx(getContext(), i2, (String) null);
    }

    public void setAnimation(String str) {
        this.fby = str;
        this.jw = 0;
        setCompositionTask(zb(str));
    }

    private ry<ul> zb(final String str) {
        if (isInEditMode()) {
            return new ry<>(new Callable<ok<ul>>() { // from class: com.bytedance.adsdk.zb.lt.10
                @Override // java.util.concurrent.Callable
                /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
                public ok<ul> call() throws Exception {
                    return lt.this.ok ? fby.sya(lt.this.getContext(), str) : fby.sya(lt.this.getContext(), str, null);
                }
            }, true);
        }
        return this.ok ? fby.zb(getContext(), str) : fby.zb(getContext(), str, (String) null);
    }

    public void setAnimationFromJson(String str) {
        ycx(str, (String) null);
    }

    public void ycx(String str, String str2) {
        ycx(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void ycx(InputStream inputStream, String str) {
        setCompositionTask(fby.ycx(inputStream, str));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.ok ? fby.ycx(getContext(), str) : fby.ycx(getContext(), str, (String) null));
    }

    public void setFailureListener(ea<Throwable> eaVar) {
        this.lud = eaVar;
    }

    public void setFallbackResource(int i2) {
        this.lt = i2;
    }

    private void setCompositionTask(ry<ul> ryVar) {
        this.ry.add(dj.SET_ANIMATION);
        wie();
        ry();
        this.syc = ryVar.ycx(this.sya).sya(this.dj);
    }

    private void ry() {
        ry<ul> ryVar = this.syc;
        if (ryVar != null) {
            ryVar.zb(this.sya);
            this.syc.dj(this.dj);
        }
    }

    private com.bytedance.adsdk.zb.sya.sya.sya ycx(com.bytedance.adsdk.zb.sya.sya.zb zbVar, String str) {
        for (com.bytedance.adsdk.zb.sya.sya.ycx ycxVar : zbVar.ok()) {
            if (ycxVar instanceof com.bytedance.adsdk.zb.sya.sya.zb) {
                com.bytedance.adsdk.zb.sya.sya.sya syaVarYcx = ycx((com.bytedance.adsdk.zb.sya.sya.zb) ycxVar, str);
                if (syaVarYcx != null) {
                    return syaVarYcx;
                }
            } else if (TextUtils.equals(str, ycxVar.jw()) && (ycxVar instanceof com.bytedance.adsdk.zb.sya.sya.sya)) {
                return (com.bytedance.adsdk.zb.sya.sya.sya) ycxVar;
            }
        }
        return null;
    }

    private com.bytedance.adsdk.zb.sya.sya.sya sya(String str) {
        com.bytedance.adsdk.zb.sya.sya.zb zbVarZb;
        jw jwVar = this.ul;
        if (jwVar == null || (zbVarZb = jwVar.zb()) == null) {
            return null;
        }
        return ycx(zbVarZb, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xkz() throws NumberFormatException {
        jw jwVar;
        final int i2;
        int i3;
        int i4;
        final int i5;
        if (this.dy == null || (jwVar = this.ul) == null) {
            return;
        }
        htf htfVarDv = jwVar.dv();
        ul.sya syaVarFby = this.dy.fby();
        if (syaVarFby == null || htfVarDv == null || (i2 = syaVarFby.ycx) < 0) {
            return;
        }
        int[] iArr = syaVarFby.lud;
        final int i6 = -1;
        if (iArr == null || iArr.length < 2) {
            i3 = -1;
            i4 = -1;
        } else {
            i4 = iArr[0];
            i3 = iArr[1];
        }
        String strYcx = htfVarDv.ycx(syaVarFby.sya);
        String strYcx2 = htfVarDv.ycx(syaVarFby.dj);
        try {
            int i7 = Integer.parseInt(strYcx);
            try {
                i6 = Integer.parseInt(strYcx2);
            } catch (NumberFormatException unused) {
            }
            i5 = i6;
            i6 = i7;
        } catch (NumberFormatException unused2) {
            i5 = -1;
        }
        if (!TextUtils.isEmpty(syaVarFby.zb)) {
            String str = syaVarFby.zb;
            com.bytedance.adsdk.zb.sya.sya.sya syaVarSya = sya(syaVarFby.zb);
            if (syaVarSya != null) {
                this.hf = syaVarFby.lt;
                this.tru = syaVarFby.ul;
                this.thx = syaVarSya;
                this.wwx = i6;
                this.tn = i6 - i5;
                this.dv = i4;
                this.oty = i3;
                StringBuilder sb = new StringBuilder();
                sb.append(this.wwx);
                syaVarSya.ycx(sb.toString());
                ycx(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.zb.lt.11
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (lt.this.getFrame() < i2 - 1 || lt.this.getFrame() >= i2 + 2) {
                            return;
                        }
                        lt.this.getFrame();
                        lt.this.zb(this);
                        if (i6 >= 0 && i5 >= 0) {
                            lt.this.syc();
                        }
                        lt.this.lt();
                    }
                });
                return;
            }
            return;
        }
        String str2 = syaVarFby.zb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syc() {
        this.wie.postDelayed(this.bhi, 1000L);
    }

    private void dy() {
        this.wie.removeCallbacksAndMessages(null);
    }

    public void setComposition(ul ulVar) {
        boolean z = com.bytedance.adsdk.zb.lud.ycx;
        this.ul.setCallback(this);
        this.dy = ulVar;
        this.jc = true;
        boolean zYcx = this.ul.ycx(ulVar, getContext().getApplicationContext());
        this.jc = false;
        if (getDrawable() != this.ul || zYcx) {
            if (!zYcx) {
                pmi();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.xkz.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public ul getComposition() {
        return this.dy;
    }

    public void ycx() {
        if (this.htf == 0) {
            this.htf = SystemClock.elapsedRealtime();
        }
        this.ry.add(dj.PLAY_OPTION);
        this.ul.ea();
    }

    public void setMinFrame(int i2) {
        this.ul.ycx(i2);
    }

    public float getMinFrame() {
        return this.ul.xkz();
    }

    public void setMinProgress(float f) {
        this.ul.ycx(f);
    }

    public void setMaxFrame(int i2) {
        this.ul.zb(i2);
    }

    public float getMaxFrame() {
        return this.ul.syc();
    }

    public void setMaxProgress(float f) {
        this.ul.zb(f);
    }

    public void setMinFrame(String str) {
        this.ul.zb(str);
    }

    public void setMaxFrame(String str) {
        this.ul.sya(str);
    }

    public void setMinAndMaxFrame(String str) {
        this.ul.dj(str);
    }

    public void setSpeed(float f) {
        this.ul.sya(f);
    }

    public float getSpeed() {
        return this.ul.dy();
    }

    public void ycx(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ul.ycx(animatorUpdateListener);
    }

    public void zb(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ul.zb(animatorUpdateListener);
    }

    public void zb() {
        this.ul.wie();
    }

    public void ycx(Animator.AnimatorListener animatorListener) {
        this.ul.ycx(animatorListener);
    }

    public void zb(Animator.AnimatorListener animatorListener) {
        this.ul.zb(animatorListener);
    }

    public void sya() {
        this.ul.pmi();
    }

    public void ycx(boolean z) {
        this.ul.lud(z ? -1 : 0);
    }

    public void setRepeatMode(int i2) {
        this.ry.add(dj.SET_REPEAT_MODE);
        this.ul.dj(i2);
    }

    public int getRepeatMode() {
        return this.ul.htf();
    }

    public void setRepeatCount(int i2) {
        this.ry.add(dj.SET_REPEAT_COUNT);
        this.ul.lud(i2);
    }

    public int getRepeatCount() {
        return this.ul.thx();
    }

    public boolean dj() {
        return this.ul.wwx();
    }

    public void setImageAssetsFolder(String str) {
        this.ul.ycx(str);
    }

    public String getImageAssetsFolder() {
        return this.ul.dj();
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.ul.zb(z);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.ul.lud();
    }

    public Bitmap ycx(String str, Bitmap bitmap) {
        return this.ul.ycx(str, bitmap);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.zb.dj djVar) {
        this.ul.ycx(djVar);
    }

    public void setDefaultFontFileExtension(String str) {
        this.ul.ul(str);
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.zb.sya syaVar) {
        this.ul.ycx(syaVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.ul.ycx(map);
    }

    public void setTextDelegate(htf htfVar) {
        this.ul.ycx(htfVar);
    }

    public void lud() {
        this.ry.add(dj.PLAY_OPTION);
        this.ul.tru();
    }

    public void lt() {
        this.ea = false;
        this.ul.bhi();
    }

    public void setFrame(int i2) {
        this.ul.sya(i2);
    }

    public int getFrame() {
        return this.ul.uh();
    }

    public void setProgress(float f) {
        ycx(f, true);
    }

    private void ycx(float f, boolean z) {
        if (z) {
            this.ry.add(dj.SET_PROGRESS);
        }
        this.ul.dj(f);
    }

    public float getProgress() {
        return this.ul.av();
    }

    public long getDuration() {
        ul ulVar = this.dy;
        if (ulVar != null) {
            return (long) ulVar.lud();
        }
        return 0L;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.ul.sya(z);
    }

    public pmi getPerformanceTracker() {
        return this.ul.fby();
    }

    private void wie() {
        this.dy = null;
        this.ul.jc();
    }

    public void setSafeMode(boolean z) {
        this.ul.lt(z);
    }

    public void setRenderMode(uh uhVar) {
        this.ul.ycx(uhVar);
    }

    public uh getRenderMode() {
        return this.ul.lt();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.ul.lud(z);
    }

    private void pmi() {
        boolean zDj = dj();
        setImageDrawable(null);
        setImageDrawable(this.ul);
        if (zDj) {
            this.ul.ry();
        }
    }

    static class sya extends View.BaseSavedState {
        public static final Parcelable.Creator<sya> CREATOR = new Parcelable.Creator<sya>() { // from class: com.bytedance.adsdk.zb.lt.sya.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
            public sya createFromParcel(Parcel parcel) {
                return new sya(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
            public sya[] newArray(int i2) {
                return new sya[i2];
            }
        };
        boolean dj;
        int lt;
        String lud;
        float sya;
        int ul;
        String ycx;
        int zb;

        sya(Parcelable parcelable) {
            super(parcelable);
        }

        private sya(Parcel parcel) {
            super(parcel);
            this.ycx = parcel.readString();
            this.sya = parcel.readFloat();
            this.dj = parcel.readInt() == 1;
            this.lud = parcel.readString();
            this.lt = parcel.readInt();
            this.ul = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.ycx);
            parcel.writeFloat(this.sya);
            parcel.writeInt(this.dj ? 1 : 0);
            parcel.writeString(this.lud);
            parcel.writeInt(this.lt);
            parcel.writeInt(this.ul);
        }
    }

    public void setLottieClicklistener(zb zbVar) {
        this.av = zbVar;
    }

    public void setLottieAnimListener(ycx ycxVar) {
        this.rmf = ycxVar;
    }
}

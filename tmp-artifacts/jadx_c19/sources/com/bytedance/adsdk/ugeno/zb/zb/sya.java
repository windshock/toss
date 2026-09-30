package com.bytedance.adsdk.ugeno.zb.zb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class sya {
    private com.bytedance.adsdk.ugeno.zb.zb.ycx dj;
    private boolean jw;
    private boolean lt;
    private View lud;
    private lud sya;
    private Application syc;
    private boolean ul;
    private final Context ycx;
    private zb zb;
    private boolean fby = true;
    private final Rect jc = new Rect();
    private final View.OnLayoutChangeListener ea = new View.OnLayoutChangeListener() { // from class: com.bytedance.adsdk.ugeno.zb.zb.sya.1
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (sya.this.dj != null) {
                sya.this.dj.setBounds(0, 0, i4 - i2, i5 - i3);
            }
            sya.this.fby();
        }
    };
    private final ViewTreeObserver.OnScrollChangedListener ok = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.adsdk.ugeno.zb.zb.sya.2
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            sya.this.fby();
        }
    };
    private final ViewTreeObserver.OnWindowFocusChangeListener ry = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.adsdk.ugeno.zb.zb.sya.3
        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean z) {
            sya.this.fby();
        }
    };
    private final View.OnAttachStateChangeListener xkz = new View.OnAttachStateChangeListener() { // from class: com.bytedance.adsdk.ugeno.zb.zb.sya.4
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            sya.this.lud();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            sya.this.lt();
        }
    };
    private final Application.ActivityLifecycleCallbacks dy = new ycx() { // from class: com.bytedance.adsdk.ugeno.zb.zb.sya.5
        @Override // com.bytedance.adsdk.ugeno.zb.zb.sya.ycx, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity == sya.this.dy()) {
                sya.this.fby = true;
                sya.this.fby();
            }
        }

        @Override // com.bytedance.adsdk.ugeno.zb.zb.sya.ycx, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (activity == sya.this.dy()) {
                sya.this.fby = false;
                sya.this.fby();
            }
        }
    };

    private static boolean syc() {
        return true;
    }

    public sya(Context context) {
        this.ycx = context != null ? context.getApplicationContext() : null;
    }

    public void ycx(String str) {
        zb zbVarYcx = zb.ycx(this.ycx, str);
        if (zbVarYcx == null || !zbVarYcx.sya()) {
            if (this.zb != null) {
                ry();
                xkz();
                this.zb = null;
                return;
            }
            return;
        }
        if (this.zb != zbVarYcx) {
            ry();
            xkz();
            this.zb = zbVarYcx;
            if (!this.lt || this.lud == null) {
                return;
            }
            ok();
            boolean z = this.ul;
            this.ul = false;
            ycx(z || ul());
        }
    }

    public boolean ycx() {
        return this.zb != null;
    }

    public void ycx(View view) {
        if (this.lud != view) {
            zb();
            this.lud = view;
            if (view == null || this.zb == null || !syc()) {
                return;
            }
            jc();
            if (this.lud.getWindowToken() != null) {
                lud();
            }
        }
    }

    public void zb() {
        lt();
        this.lud = null;
        xkz();
    }

    public void sya() {
        lud();
    }

    public void dj() {
        lt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lud() {
        if (this.lt || this.lud == null || this.zb == null || !syc()) {
            return;
        }
        jc();
        this.lt = true;
        ok();
        ViewTreeObserver viewTreeObserver = this.lud.getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnScrollChangedListener(this.ok);
            ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = this.ry;
            if (onWindowFocusChangeListener != null) {
                viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListener);
            }
        }
        wie();
        fby();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lt() {
        View view = this.lud;
        if (view == null) {
            this.lt = false;
            this.ul = false;
            pmi();
            this.jw = false;
            return;
        }
        if (this.lt) {
            this.lt = false;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.ok);
                ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = this.ry;
                if (onWindowFocusChangeListener != null) {
                    viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
                }
            }
            ycx(false);
            ry();
        }
        ea();
        pmi();
    }

    private boolean ul() {
        View view;
        return this.lt && (view = this.lud) != null && this.fby && view.getVisibility() == 0 && this.lud.getWindowVisibility() == 0 && this.lud.getWidth() > 0 && this.lud.getHeight() > 0 && this.lud.getAlpha() > 0.0f && this.lud.getGlobalVisibleRect(this.jc) && this.jc.width() > 1 && this.jc.height() > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fby() {
        ycx(ul());
    }

    private void ycx(boolean z) {
        if (this.ul != z) {
            this.ul = z;
            if (z) {
                jw();
                lud ludVar = this.sya;
                if (ludVar != null) {
                    ludVar.dj();
                }
                com.bytedance.adsdk.ugeno.zb.zb.ycx ycxVar = this.dj;
                if (ycxVar != null) {
                    ycxVar.ycx();
                    return;
                }
                return;
            }
            com.bytedance.adsdk.ugeno.zb.zb.ycx ycxVar2 = this.dj;
            if (ycxVar2 != null) {
                ycxVar2.zb();
            }
            lud ludVar2 = this.sya;
            if (ludVar2 != null) {
                ludVar2.lud();
            }
        }
    }

    private void jw() {
        zb zbVar = this.zb;
        if (zbVar != null) {
            if (this.sya == null) {
                this.sya = new lud(zbVar);
            }
            View view = this.lud;
            if (view != null) {
                this.sya.ycx(view.getWidth(), this.lud.getHeight());
            }
        }
    }

    private void jc() {
        View view = this.lud;
        if (view == null || this.jw) {
            return;
        }
        view.addOnLayoutChangeListener(this.ea);
        this.lud.addOnAttachStateChangeListener(this.xkz);
        this.jw = true;
    }

    private void ea() {
        View view = this.lud;
        if (view == null || !this.jw) {
            return;
        }
        view.removeOnLayoutChangeListener(this.ea);
        this.lud.removeOnAttachStateChangeListener(this.xkz);
        this.jw = false;
    }

    private void ok() {
        if (this.lud == null || this.zb == null || !syc()) {
            return;
        }
        jw();
        if (this.dj == null) {
            this.dj = new com.bytedance.adsdk.ugeno.zb.zb.ycx(this.sya);
        }
        int width = this.lud.getWidth();
        int height = this.lud.getHeight();
        if (width > 0 && height > 0) {
            this.dj.setBounds(0, 0, width, height);
        }
        this.lud.getOverlay().add(this.dj);
    }

    private void ry() {
        if (this.lud == null || this.dj == null || !syc()) {
            return;
        }
        this.lud.getOverlay().remove(this.dj);
    }

    private void xkz() {
        com.bytedance.adsdk.ugeno.zb.zb.ycx ycxVar = this.dj;
        if (ycxVar != null) {
            ycxVar.zb();
        }
        lud ludVar = this.sya;
        if (ludVar != null) {
            ludVar.lt();
            this.sya = null;
        }
        this.dj = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity dy() {
        View view = this.lud;
        if (view == null) {
            return null;
        }
        return ycx(view.getContext());
    }

    private static Activity ycx(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext == context) {
                return null;
            }
            context = baseContext;
        }
        return null;
    }

    private void wie() {
        Activity activityDy;
        Application application;
        if (this.syc != null || (activityDy = dy()) == null || (application = activityDy.getApplication()) == null) {
            return;
        }
        this.syc = application;
        application.registerActivityLifecycleCallbacks(this.dy);
    }

    private void pmi() {
        Application application = this.syc;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.dy);
            this.syc = null;
        }
    }

    static abstract class ycx implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        private ycx() {
        }
    }
}

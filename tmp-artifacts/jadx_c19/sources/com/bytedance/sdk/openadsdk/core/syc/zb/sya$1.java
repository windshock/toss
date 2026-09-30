package com.bytedance.sdk.openadsdk.core.syc.zb;

import com.bytedance.sdk.component.utils.jw;
import com.bytedance.sdk.openadsdk.core.syc.zb.sya;
import com.bytedance.sdk.openadsdk.core.xkz.dj;
import com.bytedance.sdk.openadsdk.core.xkz.ycx.ycx;
import com.bytedance.sdk.openadsdk.oty.ycx.sya;
import com.bytedance.sdk.openadsdk.oty.zb.lud;
import java.lang.ref.WeakReference;
import o.fillMetrics;
import o.getViewWidget;
import o.resolveMeasuredDimension;
import o.setMaxHeight;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class sya$1 implements resolveMeasuredDimension.onNavigationEvent {
    final /* synthetic */ sya ycx;

    public void sya(resolveMeasuredDimension resolvemeasureddimension) {
    }

    public void zb(resolveMeasuredDimension resolvemeasureddimension, int i2) {
    }

    sya$1(sya syaVar) {
        this.ycx = syaVar;
    }

    public void ycx(resolveMeasuredDimension resolvemeasureddimension) {
        dj djVarYcx;
        sya.lt(this.ycx).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.syc.zb.sya$1.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    lud.ycx(sya.ycx(sya$1.this.ycx), 5);
                    sya.ycx(sya.zb(sya$1.this.ycx), 5);
                    if (sya.sya(sya$1.this.ycx) != null) {
                        sya.dj(sya$1.this.ycx).ycx(9);
                    }
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CSRBrMnyYFe3kuJB6ksXuE=", "de85nBW5X86ET9h+gx+0OlTiIZAR+DiD0Q==", "Sfsj", 115);
                }
                sya.lud(sya$1.this.ycx);
            }
        });
        com.bytedance.sdk.openadsdk.core.model.dj djVarQye = sya.ul(this.ycx).qye();
        if (djVarQye == null || (djVarYcx = djVarQye.ycx()) == null) {
            return;
        }
        djVarYcx.dj(sya.fby(this.ycx));
    }

    public void ycx(resolveMeasuredDimension resolvemeasureddimension, long j) {
        sya.ycx(this.ycx, false);
        sya.jc(this.ycx).removeCallbacks(sya.jw(this.ycx));
        sya.syc(this.ycx).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.syc.zb.sya$1.2
            @Override // java.lang.Runnable
            public void run() {
                if (sya.ea(sya$1.this.ycx) != null) {
                    sya.ok(sya$1.this.ycx).zb();
                }
                if (!sya.ry(sya$1.this.ycx) || sya.xkz(sya$1.this.ycx) == null || sya.xkz(sya$1.this.ycx).get() == null) {
                    return;
                }
                ((sya.ycx) sya.xkz(sya$1.this.ycx).get()).ul();
            }
        });
        sya.dy(this.ycx);
        lud.ycx(sya.wie(this.ycx), 0);
        if (sya.pmi(this.ycx) != null) {
            sya.uh(this.ycx).sya();
        }
        sya syaVar = this.ycx;
        sya.ycx(syaVar, sya.htf(syaVar));
    }

    public void zb(resolveMeasuredDimension resolvemeasureddimension) {
        sya.thx(this.ycx).removeCallbacks(sya.jw(this.ycx));
        sya.oty(this.ycx).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.syc.zb.sya$1.3
            @Override // java.lang.Runnable
            public void run() {
                if (sya.wwx(sya$1.this.ycx) != null && sya.wwx(sya$1.this.ycx).get() != null) {
                    sya.wwx(sya$1.this.ycx).get();
                }
                if (sya.tn(sya$1.this.ycx) != null) {
                    sya.dv(sya$1.this.ycx).zb();
                }
            }
        });
        if (sya.hf(this.ycx)) {
            return;
        }
        sya syaVar = this.ycx;
        sya.zb(syaVar, sya.htf(syaVar));
    }

    public void ycx(resolveMeasuredDimension resolvemeasureddimension, final getViewWidget getviewwidget) {
        dj djVarYcx;
        sya.tru(this.ycx);
        getviewwidget.IAuthTabCallback();
        getviewwidget.onNavigationEvent();
        getviewwidget.onWarmupCompleted();
        sya.oby(this.ycx).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.syc.zb.sya$1.4
            @Override // java.lang.Runnable
            public void run() {
                int iIAuthTabCallback = getviewwidget.IAuthTabCallback();
                int iOnNavigationEvent = getviewwidget.onNavigationEvent();
                if (!sya$1.this.ycx.tru() || iOnNavigationEvent == -1004) {
                    if (sya.ycx(sya$1.this.ycx, iIAuthTabCallback, iOnNavigationEvent)) {
                        sya.bhi(sya$1.this.ycx);
                        sya.rmf(sya$1.this.ycx).ycx(sya.av(sya$1.this.ycx), (WeakReference) null, false);
                        sya$1.this.ycx.zb(true);
                        sya$1.this.ycx.lud();
                    }
                    if (sya.aeu(sya$1.this.ycx) != null) {
                        sya.xz(sya$1.this.ycx).zb();
                    }
                    if (sya.rmy(sya$1.this.ycx) != null) {
                        sya.dwi(sya$1.this.ycx).zb(sya.kgy(sya$1.this.ycx), setMaxHeight.onNavigationEvent(sya.ifb(sya$1.this.ycx), sya.yzp(sya$1.this.ycx)));
                    }
                    if (sya.wwx(sya$1.this.ycx) == null || sya.wwx(sya$1.this.ycx).get() == null || sya$1.this.ycx.tru()) {
                        return;
                    }
                    ((fillMetrics.onExtraCallbackWithResult) sya.wwx(sya$1.this.ycx).get()).ycx(iIAuthTabCallback, iOnNavigationEvent);
                }
            }
        });
        sya.ycx(this.ycx, getviewwidget);
        com.bytedance.sdk.openadsdk.core.model.dj djVarQye = sya.nji(this.ycx).qye();
        if (djVarQye != null && (djVarYcx = djVarQye.ycx()) != null) {
            djVarYcx.ycx(ycx.lud);
        }
        lud.ycx(sya.dc(this.ycx), 6);
        com.bytedance.sdk.openadsdk.oty.ycx.sya.zb(sya.sz(this.ycx));
        if (sya.yi(this.ycx) != null) {
            sya.xym(this.ycx).ycx(14);
        }
    }

    public void ycx(resolveMeasuredDimension resolvemeasureddimension, boolean z) {
        sya.bba(this.ycx).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.syc.zb.sya$1.5
            @Override // java.lang.Runnable
            public void run() {
                if (sya.rl(sya$1.this.ycx) != null) {
                    sya.zr(sya$1.this.ycx).zb();
                }
            }
        });
    }

    public void ycx(resolveMeasuredDimension resolvemeasureddimension, int i2, int i3) {
        jw.ycx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.syc.zb.sya$1.6
            @Override // java.lang.Runnable
            public void run() {
                sya.mp(sya$1.this.ycx);
            }
        });
    }

    public void ycx(resolveMeasuredDimension resolvemeasureddimension, int i2, int i3, int i4) {
        sya.zb(this.ycx, true);
        sya.lv(this.ycx).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.syc.zb.sya$1.7
            @Override // java.lang.Runnable
            public void run() {
                if (sya.uf(sya$1.this.ycx) != null) {
                    sya.duz(sya$1.this.ycx).wie();
                    sya.uz(sya$1.this.ycx).postDelayed(sya.jw(sya$1.this.ycx), 8000L);
                }
            }
        });
        lud.ycx(sya.ui(this.ycx), 2);
        if (sya.hpv(this.ycx) != null) {
            sya.iq(this.ycx).ycx(4);
        }
    }

    public void ycx(resolveMeasuredDimension resolvemeasureddimension, int i2) {
        sya.sya(this.ycx, false);
        sya.dqs(this.ycx).removeCallbacks(sya.jw(this.ycx));
        sya.wr(this.ycx).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.syc.zb.sya$1.8
            @Override // java.lang.Runnable
            public void run() {
                sya.ur(sya$1.this.ycx).zb();
            }
        });
        lud.ycx(sya.giw(this.ycx), 0);
        if (sya.sg(this.ycx) != null) {
            sya.bh(this.ycx).ycx(5);
        }
    }

    public void ycx(resolveMeasuredDimension resolvemeasureddimension, final long j, final long j2) {
        if (Math.abs(j - sya.aq(this.ycx)) < 50) {
            return;
        }
        sya syaVar = this.ycx;
        sya.sya(syaVar, sya.htf(syaVar));
        sya.bjp(this.ycx).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.syc.zb.sya$1.9
            @Override // java.lang.Runnable
            public void run() {
                sya.ycx(sya$1.this.ycx, j, j2);
                sya.zb(sya$1.this.ycx, j, j2);
            }
        });
    }

    public void dj(resolveMeasuredDimension resolvemeasureddimension) {
        dj djVarYcx;
        com.bytedance.sdk.openadsdk.core.model.dj djVarQye = sya.uu(this.ycx).qye();
        if (djVarQye != null && (djVarYcx = djVarQye.ycx()) != null) {
            djVarYcx.zb(sya.xf(this.ycx));
        }
        lud.ycx(sya.tx(this.ycx), 3);
        if (sya.ufy(this.ycx) != null) {
            sya.nzi(this.ycx).ycx(0);
        }
    }

    public void lud(resolveMeasuredDimension resolvemeasureddimension) {
        dj djVarYcx;
        com.bytedance.sdk.openadsdk.core.model.dj djVarQye = sya.wk(this.ycx).qye();
        if (djVarQye != null && (djVarYcx = djVarQye.ycx()) != null) {
            djVarYcx.sya(sya.zk(this.ycx));
        }
        if (sya.ujb(this.ycx) != null) {
            sya.qn(this.ycx).ycx(1);
        }
    }
}

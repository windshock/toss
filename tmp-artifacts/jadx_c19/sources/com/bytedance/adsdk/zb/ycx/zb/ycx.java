package com.bytedance.adsdk.zb.ycx.zb;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ycx<K, A> {
    private final sya<K> lud;
    protected com.bytedance.adsdk.zb.ul.zb<A> sya;
    final List<InterfaceC0014ycx> ycx = new ArrayList(1);
    private boolean dj = false;
    protected float zb = 0.0f;
    private A lt = null;
    private float ul = -1.0f;
    private float fby = -1.0f;

    interface sya<T> {
        float dj();

        float sya();

        boolean ycx();

        boolean ycx(float f);

        com.bytedance.adsdk.zb.ul.ycx<T> zb();

        boolean zb(float f);
    }

    /* renamed from: com.bytedance.adsdk.zb.ycx.zb.ycx$ycx, reason: collision with other inner class name */
    public interface InterfaceC0014ycx {
        void ycx();
    }

    abstract A ycx(com.bytedance.adsdk.zb.ul.ycx<K> ycxVar, float f);

    ycx(List<? extends com.bytedance.adsdk.zb.ul.ycx<K>> list) {
        this.lud = ycx(list);
    }

    public void ycx() {
        this.dj = true;
    }

    public void ycx(InterfaceC0014ycx interfaceC0014ycx) {
        this.ycx.add(interfaceC0014ycx);
    }

    public void ycx(float f) {
        if (this.lud.ycx()) {
            return;
        }
        if (f < jw()) {
            f = jw();
        } else if (f > lt()) {
            f = lt();
        }
        if (f != this.zb) {
            this.zb = f;
            if (this.lud.ycx(f)) {
                zb();
            }
        }
    }

    public void zb() {
        for (int i2 = 0; i2 < this.ycx.size(); i2++) {
            this.ycx.get(i2).ycx();
        }
    }

    protected com.bytedance.adsdk.zb.ul.ycx<K> sya() {
        com.bytedance.adsdk.zb.lud.ycx("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.zb.ul.ycx<K> ycxVarZb = this.lud.zb();
        com.bytedance.adsdk.zb.lud.zb("BaseKeyframeAnimation#getCurrentKeyframe");
        return ycxVarZb;
    }

    float dj() {
        if (this.dj) {
            return 0.0f;
        }
        com.bytedance.adsdk.zb.ul.ycx<K> ycxVarSya = sya();
        if (ycxVarSya.lud()) {
            return 0.0f;
        }
        return (this.zb - ycxVarSya.sya()) / (ycxVarSya.dj() - ycxVarSya.sya());
    }

    protected float lud() {
        com.bytedance.adsdk.zb.ul.ycx<K> ycxVarSya = sya();
        if (ycxVarSya == null || ycxVarSya.lud()) {
            return 0.0f;
        }
        return ycxVarSya.sya.getInterpolation(dj());
    }

    private float jw() {
        if (this.ul == -1.0f) {
            this.ul = this.lud.sya();
        }
        return this.ul;
    }

    float lt() {
        if (this.fby == -1.0f) {
            this.fby = this.lud.dj();
        }
        return this.fby;
    }

    public A ul() {
        A aYcx;
        float fDj = dj();
        if (this.sya == null && this.lud.zb(fDj)) {
            return this.lt;
        }
        com.bytedance.adsdk.zb.ul.ycx<K> ycxVarSya = sya();
        Interpolator interpolator = ycxVarSya.dj;
        if (interpolator != null && ycxVarSya.lud != null) {
            aYcx = ycx(ycxVarSya, fDj, interpolator.getInterpolation(fDj), ycxVarSya.lud.getInterpolation(fDj));
        } else {
            aYcx = ycx(ycxVarSya, lud());
        }
        this.lt = aYcx;
        return aYcx;
    }

    public float fby() {
        return this.zb;
    }

    protected A ycx(com.bytedance.adsdk.zb.ul.ycx<K> ycxVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> sya<T> ycx(List<? extends com.bytedance.adsdk.zb.ul.ycx<T>> list) {
        if (list.isEmpty()) {
            return new zb();
        }
        if (list.size() == 1) {
            return new lud(list);
        }
        return new dj(list);
    }

    static final class zb<T> implements sya<T> {
        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public float dj() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public float sya() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public boolean ycx() {
            return true;
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public boolean ycx(float f) {
            return false;
        }

        private zb() {
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public com.bytedance.adsdk.zb.ul.ycx<T> zb() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public boolean zb(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    static final class lud<T> implements sya<T> {
        private final com.bytedance.adsdk.zb.ul.ycx<T> ycx;
        private float zb = -1.0f;

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public boolean ycx() {
            return false;
        }

        lud(List<? extends com.bytedance.adsdk.zb.ul.ycx<T>> list) {
            this.ycx = list.get(0);
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public boolean ycx(float f) {
            return !this.ycx.lud();
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public com.bytedance.adsdk.zb.ul.ycx<T> zb() {
            return this.ycx;
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public float sya() {
            return this.ycx.sya();
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public float dj() {
            return this.ycx.dj();
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public boolean zb(float f) {
            if (this.zb == f) {
                return true;
            }
            this.zb = f;
            return false;
        }
    }

    static final class dj<T> implements sya<T> {
        private final List<? extends com.bytedance.adsdk.zb.ul.ycx<T>> ycx;
        private com.bytedance.adsdk.zb.ul.ycx<T> sya = null;
        private float dj = -1.0f;
        private com.bytedance.adsdk.zb.ul.ycx<T> zb = sya(0.0f);

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public boolean ycx() {
            return false;
        }

        dj(List<? extends com.bytedance.adsdk.zb.ul.ycx<T>> list) {
            this.ycx = list;
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public boolean ycx(float f) {
            if (this.zb.ycx(f)) {
                return !this.zb.lud();
            }
            this.zb = sya(f);
            return true;
        }

        private com.bytedance.adsdk.zb.ul.ycx<T> sya(float f) {
            com.bytedance.adsdk.zb.ul.ycx<T> ycxVar = this.ycx.get(r0.size() - 1);
            if (f >= ycxVar.sya()) {
                return ycxVar;
            }
            for (int size = this.ycx.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.zb.ul.ycx<T> ycxVar2 = this.ycx.get(size);
                if (this.zb != ycxVar2 && ycxVar2.ycx(f)) {
                    return ycxVar2;
                }
            }
            return this.ycx.get(0);
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public com.bytedance.adsdk.zb.ul.ycx<T> zb() {
            return this.zb;
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public float sya() {
            return this.ycx.get(0).sya();
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public float dj() {
            return this.ycx.get(r0.size() - 1).dj();
        }

        @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.sya
        public boolean zb(float f) {
            com.bytedance.adsdk.zb.ul.ycx<T> ycxVar = this.sya;
            com.bytedance.adsdk.zb.ul.ycx<T> ycxVar2 = this.zb;
            if (ycxVar == ycxVar2 && this.dj == f) {
                return true;
            }
            this.sya = ycxVar2;
            this.dj = f;
            return false;
        }
    }
}

package com.bytedance.adsdk.ugeno.ul;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.bytedance.adsdk.ugeno.jw.sya;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ycx<T> extends FrameLayout implements sya.dj {
    private static final Interpolator av = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.ul.ycx.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private final Runnable aeu;
    private boolean bhi;
    private int dj;
    private com.bytedance.adsdk.ugeno.ul.ycx.ycx dv;
    private boolean dy;
    private String ea;
    private int fby;
    private sya hf;
    private int htf;
    private int jc;
    private int jw;
    private int lt;
    private int lud;
    private float ok;
    private C0008ycx oty;
    private boolean pmi;
    private final Runnable rmf;
    private boolean ry;
    protected Context sya;
    private boolean syc;
    private int thx;
    private FrameLayout tn;
    private Scroller tru;
    private int uh;
    private int ul;
    private boolean wie;
    private int wwx;
    private boolean xkz;
    public List<T> ycx;
    protected com.bytedance.adsdk.ugeno.jw.sya zb;

    public abstract View ea(int i2);

    public ycx(Context context) {
        super(context);
        this.ycx = new CopyOnWriteArrayList();
        this.dj = -1;
        this.lud = 2000;
        this.lt = 500;
        this.ul = 500;
        this.fby = 0;
        this.jw = -1;
        this.jc = -1;
        this.ea = "normal";
        this.ok = 1.0f;
        this.ry = true;
        this.xkz = true;
        this.syc = true;
        this.dy = true;
        this.uh = 0;
        this.htf = 0;
        this.thx = 0;
        this.wwx = 0;
        this.bhi = true;
        this.rmf = new Runnable() { // from class: com.bytedance.adsdk.ugeno.ul.ycx.2
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                int currentItem = ycx.this.zb.getCurrentItem() + 1;
                if (ycx.this.syc) {
                    if (currentItem >= 1024) {
                        ycx.this.zb.ycx(512, false);
                        return;
                    } else {
                        ycx.this.zb.ycx(currentItem, true);
                        return;
                    }
                }
                com.bytedance.adsdk.ugeno.jw.zb adapter = ycx.this.zb.getAdapter();
                if (adapter != null) {
                    if (currentItem >= adapter.ycx()) {
                        ycx.this.zb.ycx(0, false);
                    } else {
                        ycx.this.zb.ycx(currentItem, true);
                    }
                }
            }
        };
        this.aeu = new Runnable() { // from class: com.bytedance.adsdk.ugeno.ul.ycx.3
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                if (ycx.this.xkz) {
                    ycx.this.bhi = false;
                    int currentItem = ycx.this.zb.getCurrentItem() + 1;
                    if (ycx.this.syc) {
                        if (currentItem >= 1024) {
                            ycx.this.zb.ycx(512, false);
                        } else {
                            ycx.this.zb.ycx(currentItem, true);
                        }
                        ycx ycxVar = ycx.this;
                        ycxVar.postDelayed(ycxVar.aeu, ycx.this.lud);
                        return;
                    }
                    com.bytedance.adsdk.ugeno.jw.zb adapter = ycx.this.zb.getAdapter();
                    if (adapter != null) {
                        if (currentItem >= adapter.ycx()) {
                            ycx.this.zb.ycx(0, false);
                            ycx ycxVar2 = ycx.this;
                            ycxVar2.postDelayed(ycxVar2.aeu, ycx.this.lud);
                        } else {
                            ycx.this.zb.ycx(currentItem, true);
                            ycx ycxVar3 = ycx.this;
                            ycxVar3.postDelayed(ycxVar3.aeu, ycx.this.lud);
                        }
                    }
                }
            }
        };
        this.sya = context;
        this.tn = new FrameLayout(context);
        this.zb = ycx();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.tn.addView(this.zb, layoutParams);
        addView(this.tn);
    }

    public com.bytedance.adsdk.ugeno.jw.sya ycx() {
        return new sya(this, getContext());
    }

    public ycx ycx(String str) {
        if (TextUtils.equals(str, "rectangle")) {
            this.dv = new com.bytedance.adsdk.ugeno.ul.ycx.sya(this.sya);
        } else {
            this.dv = new com.bytedance.adsdk.ugeno.ul.ycx.zb(this.sya);
        }
        addView(this.dv, new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    public ycx ycx(float f) {
        this.dv.setIndicatorWidth((int) f);
        return this;
    }

    public ycx zb(float f) {
        this.dv.setIndicatorHeight((int) f);
        return this;
    }

    public ycx sya(float f) {
        this.dv.setIndicatorX(f);
        return this;
    }

    public ycx dj(float f) {
        this.dv.setIndicatorY(f);
        return this;
    }

    public ycx zb() {
        this.dv.ycx();
        return this;
    }

    public ycx zb(String str) {
        this.dv.setIndicatorDirection(str);
        return this;
    }

    public ycx ycx(int i2) {
        this.wwx = i2;
        return this;
    }

    public ycx ycx(boolean z) {
        this.xkz = z;
        lud();
        return this;
    }

    public ycx zb(int i2) {
        this.lt = i2;
        return this;
    }

    public ycx sya(int i2) {
        this.ul = i2;
        if (this.tru == null) {
            this.tru = new zb(this, this.sya, av);
        }
        this.zb.setScroller(this.tru);
        return this;
    }

    public ycx dj(int i2) {
        this.lud = i2;
        lud();
        return this;
    }

    public ycx lud(int i2) {
        if (i2 < 0) {
            i2 = this.lud;
        }
        this.dj = i2;
        lud();
        return this;
    }

    public ycx zb(boolean z) {
        this.dy = z;
        return this;
    }

    public ycx sya(boolean z) {
        this.ry = z;
        return this;
    }

    public ycx lt(int i2) {
        this.dv.setSelectedColor(i2);
        return this;
    }

    public ycx ul(int i2) {
        this.dv.setUnSelectedColor(i2);
        return this;
    }

    public ycx dj(boolean z) throws Resources.NotFoundException {
        this.dv.setLoop(z);
        if (this.syc != z) {
            int iYcx = dj.ycx(z, this.zb.getCurrentItem(), this.ycx.size());
            this.syc = z;
            C0008ycx c0008ycx = this.oty;
            if (c0008ycx != null) {
                c0008ycx.sya();
                this.zb.setCurrentItem(iYcx);
            }
        }
        return this;
    }

    public ycx lud(float f) {
        this.ok = f;
        return this;
    }

    public ycx sya(String str) throws Resources.NotFoundException {
        this.ea = str;
        ycx(str, this.fby, this.jw, this.jc, true);
        return this;
    }

    public ycx fby(int i2) throws Resources.NotFoundException {
        this.fby = i2;
        ycx(this.ea, i2, this.jw, this.jc, true);
        return this;
    }

    public ycx<T> jw(int i2) throws Resources.NotFoundException {
        this.jw = i2;
        ycx(this.ea, this.fby, i2, this.jc, true);
        return this;
    }

    public ycx jc(int i2) throws Resources.NotFoundException {
        this.jc = i2;
        ycx(this.ea, this.fby, this.jw, i2, true);
        return this;
    }

    public ycx lud(boolean z) {
        this.wie = z;
        return this;
    }

    public void ycx(String str, int i2, int i3, int i4, boolean z) throws Resources.NotFoundException {
        C0008ycx c0008ycx = this.oty;
        if (c0008ycx != null) {
            c0008ycx.sya();
        }
        this.zb.setPageMargin(i2);
        if (i3 > 0 || i4 > 0) {
            if (this.wwx == 1) {
                this.zb.setPadding(0, i3 + i2, 0, i4 + i2);
            } else {
                this.zb.setPadding(i3 + i2, 0, i4 + i2, 0);
            }
            this.tn.setClipChildren(false);
            this.zb.setClipChildren(false);
            this.zb.setClipToPadding(false);
        }
        if (this.wwx == 1) {
            com.bytedance.adsdk.ugeno.ul.zb.dj djVar = new com.bytedance.adsdk.ugeno.ul.zb.dj();
            djVar.ycx(str);
            this.zb.ycx(true, (sya.lud) djVar);
            this.zb.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.zb.ycx(false, (sya.lud) new com.bytedance.adsdk.ugeno.ul.zb.sya());
        } else if (TextUtils.equals(str, "cube")) {
            this.zb.ycx(false, (sya.lud) new com.bytedance.adsdk.ugeno.ul.zb.ycx());
        } else if (TextUtils.equals(str, "fade")) {
            this.zb.ycx(false, (sya.lud) new com.bytedance.adsdk.ugeno.ul.zb.zb());
        } else {
            this.zb.ycx(false, (sya.lud) null);
        }
        this.zb.setOffscreenPageLimit((int) this.ok);
    }

    public void sya() throws Resources.NotFoundException {
        int i2;
        ycx(this.ea, this.fby, this.jw, this.jc, true);
        if (this.oty == null) {
            this.oty = new C0008ycx();
            this.zb.ycx((sya.dj) this);
            this.zb.setAdapter(this.oty);
        }
        int i3 = this.uh;
        if (i3 < 0 || i3 >= this.ycx.size()) {
            this.uh = 0;
        }
        if (this.syc) {
            i2 = this.uh + 512;
        } else {
            i2 = this.uh;
        }
        this.zb.ycx(i2, true);
        if (!this.syc) {
            ok(i2);
        }
        if (this.xkz) {
            lud();
        }
    }

    public void setTwoItems(boolean z) {
        this.pmi = z;
    }

    public void dj() throws Resources.NotFoundException {
        lt();
        if (this.oty != null) {
            this.zb.zb((sya.dj) this);
            this.zb.setAdapter(null);
            this.oty = null;
            this.zb.removeAllViews();
            this.ycx.clear();
            this.dv.sya();
        }
    }

    public View ycx(int i2, int i3) {
        if (this.ycx.size() == 0) {
            return new View(getContext());
        }
        View viewEa = ea(i3);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewEa instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (ul()) {
            viewEa.setTag("two_items_tag");
        }
        if (viewEa.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewEa.getParent()).removeView(viewEa);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewEa, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (ul()) {
            frameLayout.setTag(Integer.valueOf(i2));
        }
        return frameLayout;
    }

    public ycx<T> ycx(T t) {
        if (t != null) {
            this.ycx.add(t);
            if (this.ry) {
                this.dv.zb();
            }
        }
        C0008ycx c0008ycx = this.oty;
        if (c0008ycx != null) {
            c0008ycx.sya();
            this.dv.ycx(this.uh, this.zb.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.jw.sya.dj
    public void ycx(int i2, float f, int i3) {
        sya syaVar = this.hf;
        if (syaVar != null) {
            boolean z = this.syc;
            syaVar.ycx(z, dj.ycx(z, i2, this.ycx.size()), f, i3);
        }
        if (ul()) {
            ycx(i2, findViewWithTag(Integer.valueOf(i2)));
            if (f > 0.0f) {
                int i4 = i2 + 1;
                ycx(i4, findViewWithTag(Integer.valueOf(i4)));
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jw.sya.dj
    public void ok(int i2) {
        if (this.hf != null) {
            int iYcx = dj.ycx(this.syc, i2, this.ycx.size());
            this.hf.ycx(this.syc, iYcx, i2, iYcx == 0, iYcx == this.ycx.size() - 1);
        }
        if (this.ry) {
            this.dv.ycx(i2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jw.sya.dj
    public void ry(int i2) {
        if (i2 == 1 && this.wie) {
            lt();
        }
        sya syaVar = this.hf;
        if (syaVar != null) {
            syaVar.ycx(this.syc, i2);
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.ul.ycx$ycx, reason: collision with other inner class name */
    class C0008ycx extends com.bytedance.adsdk.ugeno.jw.zb {
        @Override // com.bytedance.adsdk.ugeno.jw.zb
        public int ycx(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.jw.zb
        public boolean ycx(View view, Object obj) {
            return view == obj;
        }

        C0008ycx() {
        }

        @Override // com.bytedance.adsdk.ugeno.jw.zb
        public int ycx() {
            if (ycx.this.syc) {
                return 1024;
            }
            return ycx.this.ycx.size();
        }

        @Override // com.bytedance.adsdk.ugeno.jw.zb
        public Object ycx(ViewGroup viewGroup, int i2) {
            View viewYcx = ycx.this.ycx(i2, dj.ycx(ycx.this.syc, i2, ycx.this.ycx.size()));
            viewGroup.addView(viewYcx);
            return viewYcx;
        }

        @Override // com.bytedance.adsdk.ugeno.jw.zb
        public void ycx(ViewGroup viewGroup, int i2, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.jw.zb
        public float ycx(int i2) {
            if (ycx.this.ok <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / ycx.this.ok;
        }
    }

    public void lud() {
        int i2;
        removeCallbacks(this.aeu);
        int i3 = this.lud;
        if (this.bhi && (i2 = this.dj) > 0) {
            i3 = i2;
        }
        postDelayed(this.aeu, i3);
    }

    public void lt() {
        removeCallbacks(this.aeu);
    }

    public void xkz(int i2) throws Resources.NotFoundException {
        ycx(this.ea, this.fby, this.jw, this.jc, true);
        if (this.oty == null) {
            this.oty = new C0008ycx();
            this.zb.ycx((sya.dj) this);
            this.zb.setAdapter(this.oty);
        }
        if (this.syc) {
            if (i2 >= 1024) {
                this.zb.ycx(512, false);
                return;
            } else {
                this.zb.ycx(i2, true);
                return;
            }
        }
        if (i2 < 0 || i2 >= this.ycx.size()) {
            return;
        }
        this.zb.ycx(i2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.xkz) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.wie) {
                    lud();
                }
            } else if (action == 0) {
                lt();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentItem() {
        return this.zb.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.jw.zb getAdapter() {
        return this.zb.getAdapter();
    }

    public com.bytedance.adsdk.ugeno.jw.sya getViewPager() {
        return this.zb;
    }

    public void setOnPageChangeListener(sya syaVar) {
        this.hf = syaVar;
    }

    private void ycx(int i2, View view) {
        View viewFindViewWithTag;
        if ((view instanceof ViewGroup) && (viewFindViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t = this.ycx.get(dj.ycx(true, i2, this.ycx.size()));
            if (t != null) {
                if (t instanceof com.bytedance.adsdk.ugeno.zb.sya) {
                    viewFindViewWithTag = ((com.bytedance.adsdk.ugeno.zb.sya) t).ea();
                } else if (t instanceof View) {
                    viewFindViewWithTag = (View) t;
                }
                if (viewFindViewWithTag != null) {
                    if (viewFindViewWithTag.getParent() instanceof ViewGroup) {
                        ((ViewGroup) viewFindViewWithTag.getParent()).removeView(viewFindViewWithTag);
                    }
                    ((ViewGroup) view).addView(viewFindViewWithTag);
                }
            }
        }
    }

    private boolean ul() {
        return this.ycx.size() <= 2 && this.syc;
    }
}

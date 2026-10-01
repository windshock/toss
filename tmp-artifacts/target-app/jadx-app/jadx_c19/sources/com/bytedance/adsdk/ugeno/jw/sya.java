package com.bytedance.adsdk.ugeno.jw;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya extends ViewGroup {
    private int aeu;
    private boolean av;
    private boolean bba;
    private int bh;
    private boolean bhi;
    private int dc;
    int dj;
    private int dqs;
    private int duz;
    private boolean dv;
    private int dwi;
    private int dy;
    private Parcelable ea;
    private final zb fby;
    private boolean hf;
    private List<Object> hpv;
    private float htf;
    private float ifb;
    private lud iq;
    private int jc;
    private final Rect jw;
    private float kgy;
    private dj lv;
    private boolean mp;
    private int nji;
    private VelocityTracker oby;
    private ClassLoader ok;
    private boolean oty;
    private int pmi;
    private EdgeEffect rl;
    private int rmf;
    private float rmy;
    private Scroller ry;
    private final Runnable sg;
    com.bytedance.adsdk.ugeno.jw.zb sya;
    private lt syc;
    private int sz;
    private float thx;
    private int tn;
    private int tru;
    private boolean uf;
    private int uh;
    private dj ui;
    private final ArrayList<zb> ul;
    private int ur;
    private List<dj> uz;
    private Drawable wie;
    private ArrayList<View> wr;
    private int wwx;
    private boolean xkz;
    private boolean xym;
    private int xz;
    private int ycx;
    private int yi;
    private float yzp;
    private EdgeEffect zr;
    static final int[] zb = {R.attr.layout_gravity};
    private static final Comparator<zb> lud = new Comparator<zb>() { // from class: com.bytedance.adsdk.ugeno.jw.sya.1
        @Override // java.util.Comparator
        /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
        public int compare(zb zbVar, zb zbVar2) {
            return zbVar.zb - zbVar2.zb;
        }
    };
    private static final Interpolator lt = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.jw.sya.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final fby giw = new fby();

    public interface dj {
        void ok(int i2);

        void ry(int i2);

        void ycx(int i2, float f, int i3);
    }

    public interface lud {
        void ycx(View view, float f);
    }

    static class zb {
        float dj;
        float lud;
        boolean sya;
        Object ycx;
        int zb;

        zb() {
        }
    }

    public sya(Context context) {
        super(context);
        this.ul = new ArrayList<>();
        this.fby = new zb();
        this.jw = new Rect();
        this.jc = -1;
        this.ea = null;
        this.ok = null;
        this.htf = -3.4028235E38f;
        this.thx = Float.MAX_VALUE;
        this.tru = 1;
        this.dwi = -1;
        this.bba = true;
        this.mp = false;
        this.sg = new Runnable() { // from class: com.bytedance.adsdk.ugeno.jw.sya.3
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                sya.this.setScrollState(0);
                sya.this.sya();
            }
        };
        this.bh = 0;
        ycx();
    }

    void ycx() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.ry = new Scroller(context, lt);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.xz = viewConfiguration.getScaledPagingTouchSlop();
        this.nji = (int) (400.0f * f);
        this.dc = viewConfiguration.getScaledMaximumFlingVelocity();
        this.rl = new EdgeEffect(context);
        this.zr = new EdgeEffect(context);
        this.sz = (int) (25.0f * f);
        this.yi = (int) (2.0f * f);
        this.rmf = (int) (f * 16.0f);
    }

    public void setScroller(Scroller scroller) {
        this.ry = scroller;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.sg);
        Scroller scroller = this.ry;
        if (scroller != null && !scroller.isFinished()) {
            this.ry.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    void setScrollState(int i2) {
        if (this.bh == i2) {
            return;
        }
        this.bh = i2;
        if (this.iq != null) {
            zb(i2 != 0);
        }
        lt(i2);
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.jw.zb zbVar) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.jw.zb zbVar2 = this.sya;
        if (zbVar2 != null) {
            zbVar2.ycx((DataSetObserver) null);
            for (int i2 = 0; i2 < this.ul.size(); i2++) {
                zb zbVar3 = this.ul.get(i2);
                this.sya.ycx((ViewGroup) this, zbVar3.zb, zbVar3.ycx);
            }
            this.ul.clear();
            lt();
            this.dj = 0;
            scrollTo(0, 0);
        }
        this.sya = zbVar;
        this.ycx = 0;
        if (zbVar != null) {
            if (this.syc == null) {
                this.syc = new lt();
            }
            this.sya.ycx((DataSetObserver) this.syc);
            this.hf = false;
            boolean z = this.bba;
            this.bba = true;
            this.ycx = this.sya.ycx();
            int i3 = this.jc;
            if (i3 >= 0) {
                ycx(i3, false, true);
                this.jc = -1;
                this.ea = null;
                this.ok = null;
            } else if (!z) {
                sya();
            } else {
                requestLayout();
            }
        }
        List<Object> list = this.hpv;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.hpv.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.hpv.get(i4);
        }
    }

    private void lt() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((C0006sya) getChildAt(i2).getLayoutParams()).ycx) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    public com.bytedance.adsdk.ugeno.jw.zb getAdapter() {
        return this.sya;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i2) throws Resources.NotFoundException {
        this.hf = false;
        ycx(i2, !this.bba, false);
    }

    public void ycx(int i2, boolean z) throws Resources.NotFoundException {
        this.hf = false;
        ycx(i2, z, false);
    }

    public int getCurrentItem() {
        return this.dj;
    }

    void ycx(int i2, boolean z, boolean z2) throws Resources.NotFoundException {
        ycx(i2, z, z2, 0);
    }

    void ycx(int i2, boolean z, boolean z2, int i3) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.jw.zb zbVar = this.sya;
        if (zbVar == null || zbVar.ycx() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.dj == i2 && this.ul.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.sya.ycx()) {
            i2 = this.sya.ycx() - 1;
        }
        int i4 = this.tru;
        int i5 = this.dj;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.ul.size(); i6++) {
                this.ul.get(i6).sya = true;
            }
        }
        boolean z3 = this.dj != i2;
        if (this.bba) {
            this.dj = i2;
            if (z3) {
                lud(i2);
            }
            requestLayout();
            return;
        }
        ycx(i2);
        ycx(i2, z, i3, z3);
    }

    private void ycx(int i2, boolean z, int i3, boolean z2) throws Resources.NotFoundException {
        zb zbVarZb = zb(i2);
        int clientWidth = zbVarZb != null ? (int) (getClientWidth() * Math.max(this.htf, Math.min(zbVarZb.lud, this.thx))) : 0;
        if (z) {
            ycx(clientWidth, 0, i3);
            if (z2) {
                lud(i2);
                return;
            }
            return;
        }
        if (z2) {
            lud(i2);
        }
        ycx(false);
        scrollTo(clientWidth, 0);
        dj(clientWidth);
    }

    @Deprecated
    public void setOnPageChangeListener(dj djVar) {
        this.lv = djVar;
    }

    public void ycx(dj djVar) {
        if (this.uz == null) {
            this.uz = new ArrayList();
        }
        this.uz.add(djVar);
    }

    public void zb(dj djVar) {
        List<dj> list = this.uz;
        if (list != null) {
            list.remove(djVar);
        }
    }

    public void ycx(boolean z, lud ludVar) throws Resources.NotFoundException {
        ycx(z, ludVar, 2);
    }

    public void ycx(boolean z, lud ludVar, int i2) throws Resources.NotFoundException {
        boolean z2 = ludVar != null;
        boolean z3 = z2 != (this.iq != null);
        this.iq = ludVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.ur = z ? 2 : 1;
            this.dqs = i2;
        } else {
            this.ur = 0;
        }
        if (z3) {
            sya();
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.ur == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((C0006sya) this.wr.get(i3).getLayoutParams()).lt;
    }

    public int getOffscreenPageLimit() {
        return this.tru;
    }

    public void setOffscreenPageLimit(int i2) throws Resources.NotFoundException {
        if (i2 <= 0) {
            i2 = 1;
        }
        if (i2 != this.tru) {
            this.tru = i2;
            sya();
        }
    }

    public void setPageMargin(int i2) {
        int i3 = this.dy;
        this.dy = i2;
        int width = getWidth();
        ycx(width, width, i2, i3);
        requestLayout();
    }

    public int getPageMargin() {
        return this.dy;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.wie = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i2));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.wie;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.wie;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    float ycx(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    void ycx(int i2, int i3, int i4) throws Resources.NotFoundException {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.ry;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.xkz ? this.ry.getCurrX() : this.ry.getStartX();
            this.ry.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            ycx(false);
            sya();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i8;
        float fYcx = ycx(Math.min(1.0f, Math.abs(i6) / f));
        int iAbs2 = Math.abs(i4);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs((f2 + (fYcx * f2)) / iAbs2) * 1000.0f) << 2;
        } else {
            iAbs = (int) (((Math.abs(i6) / ((f * this.sya.ycx(this.dj)) + this.dy)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.xkz = false;
        this.ry.startScroll(i5, scrollY, i6, i7, iMin);
        postInvalidateOnAnimation();
    }

    zb ycx(int i2, int i3) {
        zb zbVar = new zb();
        zbVar.zb = i2;
        zbVar.ycx = this.sya.ycx((ViewGroup) this, i2);
        zbVar.dj = this.sya.ycx(i2);
        if (i3 < 0 || i3 >= this.ul.size()) {
            this.ul.add(zbVar);
            return zbVar;
        }
        this.ul.add(i3, zbVar);
        return zbVar;
    }

    void zb() throws Resources.NotFoundException {
        int iYcx = this.sya.ycx();
        this.ycx = iYcx;
        boolean z = this.ul.size() < (this.tru << 1) + 1 && this.ul.size() < iYcx;
        int iMax = this.dj;
        int i2 = 0;
        while (i2 < this.ul.size()) {
            zb zbVar = this.ul.get(i2);
            int iYcx2 = this.sya.ycx(zbVar.ycx);
            if (iYcx2 != -1) {
                if (iYcx2 == -2) {
                    this.ul.remove(i2);
                    i2--;
                    this.sya.ycx((ViewGroup) this, zbVar.zb, zbVar.ycx);
                    int i3 = this.dj;
                    if (i3 == zbVar.zb) {
                        iMax = Math.max(0, Math.min(i3, iYcx - 1));
                    }
                } else {
                    int i4 = zbVar.zb;
                    if (i4 != iYcx2) {
                        if (i4 == this.dj) {
                            iMax = iYcx2;
                        }
                        zbVar.zb = iYcx2;
                    }
                }
                z = true;
            }
            i2++;
        }
        Collections.sort(this.ul, lud);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C0006sya c0006sya = (C0006sya) getChildAt(i5).getLayoutParams();
                if (!c0006sya.ycx) {
                    c0006sya.sya = 0.0f;
                }
            }
            ycx(iMax, false, true);
            requestLayout();
        }
    }

    void sya() throws Resources.NotFoundException {
        ycx(this.dj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0 A[PHI: r7 r10 r15
      0x00f0: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:60:0x00e5, B:57:0x00cf, B:51:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:60:0x00e5, B:57:0x00cf, B:51:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:60:0x00e5, B:57:0x00cf, B:51:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void ycx(int i2) throws Resources.NotFoundException {
        zb zbVarZb;
        String hexString;
        zb zbVarYcx;
        zb zbVarYcx2;
        zb zbVar;
        int i3 = this.dj;
        if (i3 != i2) {
            zbVarZb = zb(i3);
            this.dj = i2;
        } else {
            zbVarZb = null;
        }
        if (this.sya == null) {
            ul();
            return;
        }
        if (this.hf) {
            ul();
            return;
        }
        if (getWindowToken() != null) {
            int i4 = this.tru;
            int iMax = Math.max(0, this.dj - i4);
            int iYcx = this.sya.ycx();
            int iMin = Math.min(iYcx - 1, this.dj + i4);
            if (iYcx != this.ycx) {
                try {
                    hexString = getResources().getResourceName(getId());
                } catch (Resources.NotFoundException unused) {
                    hexString = Integer.toHexString(getId());
                }
                throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.ycx + ", found: " + iYcx + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.sya.getClass());
            }
            int i5 = 0;
            while (true) {
                if (i5 >= this.ul.size()) {
                    break;
                }
                zbVarYcx = this.ul.get(i5);
                int i6 = zbVarYcx.zb;
                int i7 = this.dj;
                if (i6 >= i7) {
                    if (i6 != i7) {
                        break;
                    }
                } else {
                    i5++;
                }
            }
            if (zbVarYcx == null && iYcx > 0) {
                zbVarYcx = ycx(this.dj, i5);
            }
            if (zbVarYcx != null) {
                int i8 = i5 - 1;
                zb zbVar2 = i8 >= 0 ? this.ul.get(i8) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - zbVarYcx.dj) + (getPaddingLeft() / clientWidth);
                float f = 0.0f;
                for (int i9 = this.dj - 1; i9 >= 0; i9--) {
                    if (f >= paddingLeft && i9 < iMax) {
                        if (zbVar2 == null) {
                            break;
                        }
                        if (i9 == zbVar2.zb && !zbVar2.sya) {
                            this.ul.remove(i8);
                            this.sya.ycx((ViewGroup) this, i9, zbVar2.ycx);
                            i8--;
                            i5--;
                            if (i8 >= 0) {
                                zbVar = this.ul.get(i8);
                            }
                            zbVar2 = zbVar;
                        }
                    } else if (zbVar2 != null && i9 == zbVar2.zb) {
                        f += zbVar2.dj;
                        i8--;
                        if (i8 >= 0) {
                            zbVar = this.ul.get(i8);
                        }
                        zbVar2 = zbVar;
                    } else {
                        f += ycx(i9, i8 + 1).dj;
                        i5++;
                        zbVar = i8 >= 0 ? this.ul.get(i8) : null;
                        zbVar2 = zbVar;
                    }
                }
                float f2 = zbVarYcx.dj;
                int i10 = i5 + 1;
                if (f2 < 2.0f) {
                    zb zbVar3 = i10 < this.ul.size() ? this.ul.get(i10) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    int i11 = this.dj;
                    while (true) {
                        i11++;
                        if (i11 >= iYcx) {
                            break;
                        }
                        if (f2 >= paddingRight && i11 > iMin) {
                            if (zbVar3 == null) {
                                break;
                            }
                            if (i11 == zbVar3.zb && !zbVar3.sya) {
                                this.ul.remove(i10);
                                this.sya.ycx((ViewGroup) this, i11, zbVar3.ycx);
                                if (i10 < this.ul.size()) {
                                    zbVar3 = this.ul.get(i10);
                                }
                            }
                        } else if (zbVar3 != null && i11 == zbVar3.zb) {
                            f2 += zbVar3.dj;
                            i10++;
                            if (i10 < this.ul.size()) {
                                zbVar3 = this.ul.get(i10);
                            }
                        } else {
                            zb zbVarYcx3 = ycx(i11, i10);
                            i10++;
                            f2 += zbVarYcx3.dj;
                            zbVar3 = i10 < this.ul.size() ? this.ul.get(i10) : null;
                        }
                    }
                }
                ycx(zbVarYcx, i5, zbVarZb);
            }
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                C0006sya c0006sya = (C0006sya) childAt.getLayoutParams();
                c0006sya.lt = i12;
                if (!c0006sya.ycx && c0006sya.sya == 0.0f && (zbVarYcx2 = ycx(childAt)) != null) {
                    c0006sya.sya = zbVarYcx2.dj;
                    c0006sya.lud = zbVarYcx2.zb;
                }
            }
            ul();
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                zb zbVarZb2 = viewFindFocus != null ? zb(viewFindFocus) : null;
                if (zbVarZb2 == null || zbVarZb2.zb != this.dj) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        View childAt2 = getChildAt(i13);
                        zb zbVarYcx4 = ycx(childAt2);
                        if (zbVarYcx4 != null && zbVarYcx4.zb == this.dj && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private void ul() {
        if (this.ur != 0) {
            ArrayList<View> arrayList = this.wr;
            if (arrayList == null) {
                this.wr = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.wr.add(getChildAt(i2));
            }
            Collections.sort(this.wr, giw);
        }
    }

    private void ycx(zb zbVar, int i2, zb zbVar2) {
        int i3;
        int i4;
        zb zbVar3;
        zb zbVar4;
        int iYcx = this.sya.ycx();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.dy / clientWidth : 0.0f;
        if (zbVar2 != null) {
            int i5 = zbVar2.zb;
            int i6 = zbVar.zb;
            if (i5 < i6) {
                float fYcx = zbVar2.lud + zbVar2.dj + f;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= zbVar.zb && i8 < this.ul.size()) {
                    zb zbVar5 = this.ul.get(i8);
                    while (true) {
                        zbVar4 = zbVar5;
                        if (i7 <= zbVar4.zb || i8 >= this.ul.size() - 1) {
                            break;
                        }
                        i8++;
                        zbVar5 = this.ul.get(i8);
                    }
                    while (i7 < zbVar4.zb) {
                        fYcx += this.sya.ycx(i7) + f;
                        i7++;
                    }
                    zbVar4.lud = fYcx;
                    fYcx += zbVar4.dj + f;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.ul.size() - 1;
                float fYcx2 = zbVar2.lud;
                while (true) {
                    i5--;
                    if (i5 < zbVar.zb || size < 0) {
                        break;
                    }
                    zb zbVar6 = this.ul.get(size);
                    while (true) {
                        zbVar3 = zbVar6;
                        if (i5 >= zbVar3.zb || size <= 0) {
                            break;
                        }
                        size--;
                        zbVar6 = this.ul.get(size);
                    }
                    while (i5 > zbVar3.zb) {
                        fYcx2 -= this.sya.ycx(i5) + f;
                        i5--;
                    }
                    fYcx2 -= zbVar3.dj + f;
                    zbVar3.lud = fYcx2;
                }
            }
        }
        int size2 = this.ul.size();
        float fYcx3 = zbVar.lud;
        int i9 = zbVar.zb;
        int i10 = i9 - 1;
        this.htf = i9 == 0 ? fYcx3 : -3.4028235E38f;
        int i11 = iYcx - 1;
        this.thx = i9 == i11 ? (zbVar.dj + fYcx3) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            zb zbVar7 = this.ul.get(i12);
            while (true) {
                i4 = zbVar7.zb;
                if (i10 <= i4) {
                    break;
                }
                fYcx3 -= this.sya.ycx(i10) + f;
                i10--;
            }
            fYcx3 -= zbVar7.dj + f;
            zbVar7.lud = fYcx3;
            if (i4 == 0) {
                this.htf = fYcx3;
            }
            i12--;
            i10--;
        }
        float fYcx4 = zbVar.lud + zbVar.dj + f;
        int i13 = zbVar.zb + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            zb zbVar8 = this.ul.get(i14);
            while (true) {
                i3 = zbVar8.zb;
                if (i13 >= i3) {
                    break;
                }
                fYcx4 += this.sya.ycx(i13) + f;
                i13++;
            }
            if (i3 == i11) {
                this.thx = (zbVar8.dj + fYcx4) - 1.0f;
            }
            zbVar8.lud = fYcx4;
            fYcx4 += zbVar8.dj + f;
            i14++;
            i13++;
        }
        this.mp = false;
    }

    public static class ul extends ycx {
        public static final Parcelable.Creator<ul> CREATOR = new Parcelable.ClassLoaderCreator<ul>() { // from class: com.bytedance.adsdk.ugeno.jw.sya.ul.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
            public ul createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new ul(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
            public ul createFromParcel(Parcel parcel) {
                return new ul(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
            public ul[] newArray(int i2) {
                return new ul[i2];
            }
        };
        ClassLoader dj;
        Parcelable sya;
        int zb;

        public ul(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // com.bytedance.adsdk.ugeno.jw.ycx, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.zb);
            parcel.writeParcelable(this.sya, i2);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.zb + "}";
        }

        ul(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.zb = parcel.readInt();
            this.sya = parcel.readParcelable(classLoader);
            this.dj = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ul ulVar = new ul(super.onSaveInstanceState());
        ulVar.zb = this.dj;
        com.bytedance.adsdk.ugeno.jw.zb zbVar = this.sya;
        if (zbVar != null) {
            ulVar.sya = zbVar.zb();
        }
        return ulVar;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof ul)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ul ulVar = (ul) parcelable;
        super.onRestoreInstanceState(ulVar.ycx());
        if (this.sya != null) {
            ycx(ulVar.zb, false, true);
            return;
        }
        this.jc = ulVar.zb;
        this.ea = ulVar.sya;
        this.ok = ulVar.dj;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0006sya c0006sya = (C0006sya) layoutParams;
        boolean zSya = c0006sya.ycx | sya(view);
        c0006sya.ycx = zSya;
        if (!this.dv) {
            super.addView(view, i2, layoutParams);
        } else {
            if (zSya) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0006sya.dj = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    private static boolean sya(View view) {
        return view.getClass().getAnnotation(ycx.class) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.dv) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    zb ycx(View view) {
        for (int i2 = 0; i2 < this.ul.size(); i2++) {
            zb zbVar = this.ul.get(i2);
            if (this.sya.ycx(view, zbVar.ycx)) {
                return zbVar;
            }
        }
        return null;
    }

    zb zb(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return ycx(view);
            }
        }
    }

    zb zb(int i2) {
        for (int i3 = 0; i3 < this.ul.size(); i3++) {
            zb zbVar = this.ul.get(i3);
            if (zbVar.zb == i2) {
                return zbVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.bba = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) throws Resources.NotFoundException {
        C0006sya c0006sya;
        C0006sya c0006sya2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.aeu = Math.min(measuredWidth / 10, this.rmf);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            boolean z = true;
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (c0006sya2 = (C0006sya) childAt.getLayoutParams()) != null && c0006sya2.ycx) {
                int i7 = c0006sya2.zb;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z2 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z = false;
                }
                int i10 = Integer.MIN_VALUE;
                if (z2) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = ((ViewGroup.LayoutParams) c0006sya2).width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = ((ViewGroup.LayoutParams) c0006sya2).height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        this.wwx = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.tn = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.dv = true;
        sya();
        this.dv = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((c0006sya = (C0006sya) childAt2.getLayoutParams()) == null || !c0006sya.ycx)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0006sya.sya), 1073741824), this.tn);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.dy;
            ycx(i2, i4, i6, i6);
        }
    }

    private void ycx(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.ul.isEmpty()) {
            if (!this.ry.isFinished()) {
                this.ry.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - paddingLeft) - paddingRight) + i4)), getScrollY());
            return;
        }
        zb zbVarZb = zb(this.dj);
        int iMin = (int) ((zbVarZb != null ? Math.min(zbVarZb.lud, this.thx) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            ycx(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) throws Resources.NotFoundException {
        boolean z2;
        zb zbVarYcx;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0006sya c0006sya = (C0006sya) childAt.getLayoutParams();
                if (c0006sya.ycx) {
                    int i10 = c0006sya.zb;
                    int i11 = i10 & 7;
                    int i12 = i10 & 112;
                    if (i11 == 1) {
                        iMax = Math.max((i6 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i11 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i11 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i6 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i12 != 16) {
                            iMax2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        } else {
                            if (i12 == 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i12 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i13 = paddingLeft + scrollX;
                            childAt.layout(i13, paddingTop, childAt.getMeasuredWidth() + i13, paddingTop + childAt.getMeasuredHeight());
                            i8++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        }
                        int i14 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i14;
                        int i132 = paddingLeft + scrollX;
                        childAt.layout(i132, paddingTop, childAt.getMeasuredWidth() + i132, paddingTop + childAt.getMeasuredHeight());
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    }
                    int i15 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i15;
                    if (i12 != 16) {
                    }
                    int i142 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i142;
                    int i1322 = paddingLeft + scrollX;
                    childAt.layout(i1322, paddingTop, childAt.getMeasuredWidth() + i1322, paddingTop + childAt.getMeasuredHeight());
                    i8++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                C0006sya c0006sya2 = (C0006sya) childAt2.getLayoutParams();
                if (!c0006sya2.ycx && (zbVarYcx = ycx(childAt2)) != null) {
                    float f = (i6 - paddingLeft) - paddingRight;
                    int i17 = ((int) (zbVarYcx.lud * f)) + paddingLeft;
                    if (c0006sya2.dj) {
                        c0006sya2.dj = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c0006sya2.sya), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i17, paddingTop, childAt2.getMeasuredWidth() + i17, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.pmi = paddingTop;
        this.uh = i7 - paddingBottom;
        this.duz = i8;
        if (this.bba) {
            z2 = false;
            ycx(this.dj, false, 0, false);
        } else {
            z2 = false;
        }
        this.bba = z2;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.xkz = true;
        if (!this.ry.isFinished() && this.ry.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.ry.getCurrX();
            int currY = this.ry.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!dj(currX)) {
                    this.ry.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            postInvalidateOnAnimation();
            return;
        }
        ycx(true);
    }

    private boolean dj(int i2) {
        if (this.ul.size() == 0) {
            if (this.bba) {
                return false;
            }
            this.uf = false;
            ycx(0, 0.0f, 0);
            if (this.uf) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        zb zbVarJw = jw();
        int clientWidth = getClientWidth();
        int i3 = this.dy;
        float f = clientWidth;
        int i4 = zbVarJw.zb;
        float f2 = ((i2 / f) - zbVarJw.lud) / (zbVarJw.dj + (i3 / f));
        this.uf = false;
        ycx(i4, f2, (int) ((clientWidth + i3) * f2));
        if (this.uf) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void ycx(int i2, float f, int i3) {
        int iMax;
        int width;
        int left;
        if (this.duz > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                C0006sya c0006sya = (C0006sya) childAt.getLayoutParams();
                if (c0006sya.ycx) {
                    int i5 = c0006sya.zb & 7;
                    if (i5 == 1) {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i5 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    }
                    int i6 = iMax;
                    width = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = width;
                }
            }
        }
        zb(i2, f, i3);
        if (this.iq != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                if (!((C0006sya) childAt2.getLayoutParams()).ycx) {
                    this.iq.ycx(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.uf = true;
    }

    private void zb(int i2, float f, int i3) {
        dj djVar = this.lv;
        if (djVar != null) {
            djVar.ycx(i2, f, i3);
        }
        List<dj> list = this.uz;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                dj djVar2 = this.uz.get(i4);
                if (djVar2 != null) {
                    djVar2.ycx(i2, f, i3);
                }
            }
        }
        dj djVar3 = this.ui;
        if (djVar3 != null) {
            djVar3.ycx(i2, f, i3);
        }
    }

    private void lud(int i2) {
        dj djVar = this.lv;
        if (djVar != null) {
            djVar.ok(i2);
        }
        List<dj> list = this.uz;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                dj djVar2 = this.uz.get(i3);
                if (djVar2 != null) {
                    djVar2.ok(i2);
                }
            }
        }
        dj djVar3 = this.ui;
        if (djVar3 != null) {
            djVar3.ok(i2);
        }
    }

    private void lt(int i2) {
        dj djVar = this.lv;
        if (djVar != null) {
            djVar.ry(i2);
        }
        List<dj> list = this.uz;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                dj djVar2 = this.uz.get(i3);
                if (djVar2 != null) {
                    djVar2.ry(i2);
                }
            }
        }
        dj djVar3 = this.ui;
        if (djVar3 != null) {
            djVar3.ry(i2);
        }
    }

    private void ycx(boolean z) {
        boolean z2 = this.bh == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.ry.isFinished()) {
                this.ry.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.ry.getCurrX();
                int currY = this.ry.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        dj(currX);
                    }
                }
            }
        }
        this.hf = false;
        for (int i2 = 0; i2 < this.ul.size(); i2++) {
            zb zbVar = this.ul.get(i2);
            if (zbVar.sya) {
                zbVar.sya = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.sg);
            } else {
                this.sg.run();
            }
        }
    }

    private boolean ycx(float f, float f2) {
        if (f >= this.aeu || f2 <= 0.0f) {
            return f > ((float) (getWidth() - this.aeu)) && f2 < 0.0f;
        }
        return true;
    }

    private void zb(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z ? this.dqs : 0, null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & OggPageHeader.MAX_SEGMENT_COUNT;
        if (action == 3 || action == 1) {
            fby();
            return false;
        }
        if (action != 0) {
            if (this.bhi) {
                return true;
            }
            if (this.av) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.ifb = x;
            this.rmy = x;
            float y = motionEvent.getY();
            this.yzp = y;
            this.kgy = y;
            this.dwi = motionEvent.getPointerId(0);
            this.av = false;
            this.xkz = true;
            this.ry.computeScrollOffset();
            if (this.bh == 2 && Math.abs(this.ry.getFinalX() - this.ry.getCurrX()) > this.yi) {
                this.ry.abortAnimation();
                this.hf = false;
                sya();
                this.bhi = true;
                sya(true);
                setScrollState(1);
            } else {
                ycx(false);
                this.bhi = false;
            }
        } else if (action == 2) {
            int i2 = this.dwi;
            if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.rmy;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.yzp);
                if (f != 0.0f && !ycx(this.rmy, f) && ycx(this, false, (int) f, (int) x2, (int) y2)) {
                    this.rmy = x2;
                    this.kgy = y2;
                    this.av = true;
                    return false;
                }
                float f2 = this.xz;
                if (fAbs > f2 && fAbs * 0.5f > fAbs2) {
                    this.bhi = true;
                    sya(true);
                    setScrollState(1);
                    this.rmy = f > 0.0f ? this.ifb + this.xz : this.ifb - this.xz;
                    this.kgy = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f2) {
                    this.av = true;
                }
                if (this.bhi && zb(x2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            ycx(motionEvent);
        }
        if (this.oby == null) {
            this.oby = VelocityTracker.obtain();
        }
        this.oby.addMovement(motionEvent);
        return this.bhi;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x013f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.jw.zb zbVar;
        boolean zFby;
        int iFindPointerIndex;
        if (this.xym) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (zbVar = this.sya) == null || zbVar.ycx() == 0) {
            return false;
        }
        if (this.oby == null) {
            this.oby = VelocityTracker.obtain();
        }
        this.oby.addMovement(motionEvent);
        int action = motionEvent.getAction() & OggPageHeader.MAX_SEGMENT_COUNT;
        if (action == 0) {
            this.ry.abortAnimation();
            this.hf = false;
            sya();
            float x = motionEvent.getX();
            this.ifb = x;
            this.rmy = x;
            float y = motionEvent.getY();
            this.yzp = y;
            this.kgy = y;
            this.dwi = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.rmy = motionEvent.getX(actionIndex);
                            this.dwi = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        ycx(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.dwi);
                        if (iFindPointerIndex2 != -1) {
                            this.rmy = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.bhi) {
                    ycx(this.dj, true, 0, false);
                    zFby = fby();
                    if (zFby) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (!this.bhi) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.dwi);
                if (iFindPointerIndex3 == -1) {
                    zFby = fby();
                    if (zFby) {
                    }
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x2 - this.rmy);
                    float y2 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y2 - this.kgy);
                    if (fAbs > this.xz && fAbs > fAbs2) {
                        this.bhi = true;
                        sya(true);
                        float f = this.ifb;
                        this.rmy = x2 - f > 0.0f ? f + this.xz : f - this.xz;
                        this.kgy = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.bhi) {
                        zFby = zb(motionEvent.getX(iFindPointerIndex));
                        if (zFby) {
                        }
                    }
                }
            } else if (this.bhi && (iFindPointerIndex = motionEvent.findPointerIndex(this.dwi)) != -1) {
                zFby = zb(motionEvent.getX(iFindPointerIndex));
                if (zFby) {
                }
            }
        } else if (this.bhi) {
            VelocityTracker velocityTracker = this.oby;
            velocityTracker.computeCurrentVelocity(1000, this.dc);
            int xVelocity = (int) velocityTracker.getXVelocity(this.dwi);
            this.hf = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            zb zbVarJw = jw();
            float f2 = clientWidth;
            int i2 = zbVarJw.zb;
            float f3 = ((scrollX / f2) - zbVarJw.lud) / (zbVarJw.dj + (this.dy / f2));
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.dwi);
            if (iFindPointerIndex4 != -1) {
                ycx(ycx(i2, f3, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.ifb)), true, true, xVelocity);
                zFby = fby();
                if (zFby) {
                }
            }
        }
        return true;
    }

    private boolean fby() {
        this.dwi = -1;
        jc();
        this.rl.onRelease();
        this.zr.onRelease();
        return this.rl.isFinished() || this.zr.isFinished();
    }

    private void sya(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean zb(float f) {
        boolean z;
        boolean z2;
        float f2 = this.rmy;
        this.rmy = f;
        float scrollX = getScrollX() + (f2 - f);
        float clientWidth = getClientWidth();
        float f3 = this.htf * clientWidth;
        float f4 = this.thx * clientWidth;
        boolean z3 = false;
        zb zbVar = this.ul.get(0);
        ArrayList<zb> arrayList = this.ul;
        zb zbVar2 = arrayList.get(arrayList.size() - 1);
        if (zbVar.zb != 0) {
            f3 = zbVar.lud * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (zbVar2.zb != this.sya.ycx() - 1) {
            f4 = zbVar2.lud * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.rl.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.zr.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i2 = (int) scrollX;
        this.rmy += scrollX - i2;
        scrollTo(i2, getScrollY());
        dj(i2);
        return z3;
    }

    private zb jw() {
        int i2;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.dy / clientWidth : 0.0f;
        int i3 = 0;
        boolean z = true;
        int i4 = -1;
        zb zbVar = null;
        float f3 = 0.0f;
        while (i3 < this.ul.size()) {
            zb zbVar2 = this.ul.get(i3);
            if (!z && zbVar2.zb != (i2 = i4 + 1)) {
                zbVar2 = this.fby;
                zbVar2.lud = f + f3 + f2;
                zbVar2.zb = i2;
                zbVar2.dj = this.sya.ycx(i2);
                i3--;
            }
            zb zbVar3 = zbVar2;
            f = zbVar3.lud;
            float f4 = zbVar3.dj;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f4 + f + f2 || i3 == this.ul.size() - 1) {
                return zbVar3;
            }
            i4 = zbVar3.zb;
            i3++;
            z = false;
            zbVar = zbVar3;
            f3 = zbVar3.dj;
        }
        return zbVar;
    }

    private int ycx(int i2, float f, int i3, int i4) {
        if (Math.abs(i4) <= this.sz || Math.abs(i3) <= this.nji) {
            i2 += (int) (f + (i2 >= this.dj ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.ul.size() <= 0) {
            return i2;
        }
        return Math.max(this.ul.get(0).zb, Math.min(i2, this.ul.get(r4.size() - 1).zb));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean zDraw;
        com.bytedance.adsdk.ugeno.jw.zb zbVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && (zbVar = this.sya) != null && zbVar.ycx() > 1)) {
            if (this.rl.isFinished()) {
                zDraw = false;
            } else {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.htf * width);
                this.rl.setSize(height, width);
                zDraw = this.rl.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.zr.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.thx + 1.0f)) * width2);
                this.zr.setSize((height2 - paddingTop) - paddingBottom, width2);
                zDraw |= this.zr.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
            if (zDraw) {
                postInvalidateOnAnimation();
                return;
            }
            return;
        }
        this.rl.finish();
        this.zr.finish();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.dy <= 0 || this.wie == null || this.ul.size() <= 0 || this.sya == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f3 = this.dy / width;
        int i3 = 0;
        zb zbVar = this.ul.get(0);
        float f4 = zbVar.lud;
        int size = this.ul.size();
        int i4 = zbVar.zb;
        int i5 = this.ul.get(size - 1).zb;
        while (i4 < i5) {
            while (true) {
                i2 = zbVar.zb;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                zbVar = this.ul.get(i3);
            }
            if (i4 == i2) {
                float f5 = zbVar.lud + zbVar.dj;
                f = f5 * width;
                f4 = f5 + f3;
            } else {
                float fYcx = this.sya.ycx(i4);
                float f6 = (f4 + fYcx) * width;
                f4 += fYcx + f3;
                f = f6;
            }
            if (this.dy + f > scrollX) {
                f2 = f3;
                this.wie.setBounds(Math.round(f), this.pmi, Math.round(this.dy + f), this.uh);
                this.wie.draw(canvas);
            } else {
                f2 = f3;
            }
            if (f > scrollX + r2) {
                return;
            }
            i4++;
            f3 = f2;
        }
    }

    private void ycx(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.dwi) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.rmy = motionEvent.getX(i2);
            this.dwi = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.oby;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void jc() {
        this.bhi = false;
        this.av = false;
        VelocityTracker velocityTracker = this.oby;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.oby = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.oty != z) {
            this.oty = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.sya == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.htf)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.thx));
    }

    protected boolean ycx(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    if (ycx(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || ycx(keyEvent);
    }

    public boolean ycx(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return dj();
            }
            return sya(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return lud();
            }
            return sya(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return sya(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return sya(1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean sya(int i2) throws Resources.NotFoundException {
        boolean zLud;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            new StringBuilder().append(viewFindFocus.getClass().getSimpleName());
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                parent2.getClass().getSimpleName();
            }
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i2 != 17 && i2 != 1) {
                zLud = (i2 == 66 || i2 == 2) ? lud() : false;
            }
            zLud = dj();
        } else if (i2 == 17) {
            int i3 = ycx(this.jw, viewFindNextFocus).left;
            int i4 = ycx(this.jw, viewFindFocus).left;
            if (viewFindFocus == null || i3 < i4) {
                zLud = viewFindNextFocus.requestFocus();
            } else {
                zLud = dj();
            }
        } else if (i2 == 66) {
            int i5 = ycx(this.jw, viewFindNextFocus).left;
            int i6 = ycx(this.jw, viewFindFocus).left;
            if (viewFindFocus == null || i5 > i6) {
                zLud = viewFindNextFocus.requestFocus();
            }
        }
        if (zLud) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zLud;
    }

    private Rect ycx(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    boolean dj() throws Resources.NotFoundException {
        int i2 = this.dj;
        if (i2 <= 0) {
            return false;
        }
        ycx(i2 - 1, true);
        return true;
    }

    boolean lud() throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.jw.zb zbVar = this.sya;
        if (zbVar == null || this.dj >= zbVar.ycx() - 1) {
            return false;
        }
        ycx(this.dj + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        zb zbVarYcx;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (zbVarYcx = ycx(childAt)) != null && zbVarYcx.zb == this.dj) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        zb zbVarYcx;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (zbVarYcx = ycx(childAt)) != null && zbVarYcx.zb == this.dj) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        zb zbVarYcx;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i5 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (zbVarYcx = ycx(childAt)) != null && zbVarYcx.zb == this.dj && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i5;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        zb zbVarYcx;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (zbVarYcx = ycx(childAt)) != null && zbVarYcx.zb == this.dj && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0006sya();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0006sya) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0006sya(getContext(), attributeSet);
    }

    class lt extends DataSetObserver {
        lt() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            sya.this.zb();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            sya.this.zb();
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.jw.sya$sya, reason: collision with other inner class name */
    public static class C0006sya extends ViewGroup.LayoutParams {
        boolean dj;
        int lt;
        int lud;
        float sya;
        public boolean ycx;
        public int zb;

        public C0006sya() {
            super(-1, -1);
            this.sya = 0.0f;
        }

        public C0006sya(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.sya = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sya.zb);
            this.zb = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static class fby implements Comparator<View> {
        fby() {
        }

        @Override // java.util.Comparator
        /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0006sya c0006sya = (C0006sya) view.getLayoutParams();
            C0006sya c0006sya2 = (C0006sya) view2.getLayoutParams();
            boolean z = c0006sya.ycx;
            if (z != c0006sya2.ycx) {
                return z ? 1 : -1;
            }
            return c0006sya.lud - c0006sya2.lud;
        }
    }
}

package com.bytedance.adsdk.ugeno.ul.ycx;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.ul.dj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ycx extends LinearLayout {
    private List<View> dj;
    private float ea;
    private boolean fby;
    private float jc;
    private int jw;
    private int lt;
    private int lud;
    private String ok;
    protected int sya;
    private int ul;
    protected Context ycx;
    protected int zb;

    public abstract Drawable zb(int i2);

    public ycx(Context context) {
        super(context);
        this.lud = -65536;
        this.lt = -16776961;
        this.ul = 5;
        this.zb = 40;
        this.sya = 20;
        this.ok = "row";
        this.ycx = context;
        this.dj = new ArrayList();
        setOrientation(0);
    }

    public void setIndicatorX(float f) {
        this.jc = f;
    }

    public void setIndicatorY(float f) {
        this.ea = f;
    }

    public void setIndicatorDirection(String str) {
        this.ok = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorWidth(int i2) {
        this.zb = i2;
    }

    public void setIndicatorHeight(int i2) {
        this.sya = i2;
    }

    public void ycx(int i2, int i3) {
        Iterator<View> it = this.dj.iterator();
        while (it.hasNext()) {
            it.next().setBackground(zb(this.lt));
        }
        if (i2 < 0 || i2 >= this.dj.size()) {
            i2 = 0;
        }
        if (this.dj.size() > 0) {
            this.dj.get(i2).setBackground(zb(this.lud));
            this.jw = i3;
        }
    }

    public int getSize() {
        return this.dj.size();
    }

    public void ycx() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ul.ycx.ycx.1
            @Override // java.lang.Runnable
            public void run() {
                ycx.this.dj();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dj() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        layoutParams.topMargin = (int) (((int) ((height * r5) / 100.0f)) - ((getHeight() * this.ea) / 100.0f));
        layoutParams.leftMargin = (int) (((int) ((width * r0) / 100.0f)) - ((width2 * this.jc) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public void setSelectedColor(int i2) {
        this.lud = i2;
    }

    public void setLoop(boolean z) {
        this.fby = z;
    }

    public void setUnSelectedColor(int i2) {
        this.lt = i2;
    }

    public void ycx(int i2) {
        if (this instanceof zb) {
            this.sya = this.zb;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.zb, this.sya);
        if (getOrientation() == 1) {
            int i3 = this.ul;
            layoutParams.topMargin = i3;
            layoutParams.bottomMargin = i3;
        } else {
            int i4 = this.ul;
            layoutParams.leftMargin = i4;
            layoutParams.rightMargin = i4;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.zb, this.sya);
        if (getOrientation() == 1) {
            int i5 = this.ul;
            layoutParams2.topMargin = i5;
            layoutParams2.bottomMargin = i5;
        } else {
            int i6 = this.ul;
            layoutParams2.leftMargin = i6;
            layoutParams2.rightMargin = i6;
        }
        int iYcx = dj.ycx(this.fby, this.jw, this.dj.size());
        int iYcx2 = dj.ycx(this.fby, i2, this.dj.size());
        if (this.dj.size() == 0) {
            iYcx2 = 0;
        }
        if (!this.dj.isEmpty() && dj.ycx(iYcx, this.dj) && dj.ycx(iYcx2, this.dj)) {
            this.dj.get(iYcx).setBackground(zb(this.lt));
            this.dj.get(iYcx).setLayoutParams(layoutParams2);
            this.dj.get(iYcx2).setBackground(zb(this.lud));
            this.dj.get(iYcx2).setLayoutParams(layoutParams);
            this.jw = i2;
        }
    }

    public void zb() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof zb) {
            this.sya = this.zb;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.zb, this.sya);
        if (getOrientation() == 1) {
            int i2 = this.ul;
            layoutParams.topMargin = i2;
            layoutParams.bottomMargin = i2;
        } else {
            int i3 = this.ul;
            layoutParams.leftMargin = i3;
            layoutParams.rightMargin = i3;
        }
        addView(view, layoutParams);
        view.setBackground(zb(this.lt));
        this.dj.add(view);
    }

    public void sya() {
        this.dj.clear();
        removeAllViews();
    }
}

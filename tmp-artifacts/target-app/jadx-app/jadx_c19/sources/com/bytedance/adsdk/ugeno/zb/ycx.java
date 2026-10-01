package com.bytedance.adsdk.ugeno.zb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.fby.fby;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx<E extends ViewGroup> extends sya {
    public List<sya<View>> ycx;

    public ycx(Context context) {
        this(context, null);
    }

    public ycx(Context context, ycx ycxVar) {
        super(context, ycxVar);
        this.ycx = new ArrayList();
    }

    public void zb() {
        super.zb();
    }

    public void ycx(sya syaVar) {
        if (syaVar != null) {
            this.ycx.add(syaVar);
            View viewEa = syaVar.ea();
            if (viewEa != null) {
                ((ViewGroup) ((sya) this).lud).addView(viewEa);
            }
        }
    }

    public void ycx(sya syaVar, ViewGroup.LayoutParams layoutParams) {
        if (syaVar != null) {
            this.ycx.add(syaVar);
            View viewEa = syaVar.ea();
            if (viewEa != null) {
                ((ViewGroup) ((sya) this).lud).addView(viewEa, layoutParams);
            }
        }
    }

    public List<sya<View>> jw() {
        return this.ycx;
    }

    public sya ycx(String str) {
        sya syaVarLud;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, ((sya) this).ea)) {
            return this;
        }
        for (sya<View> syaVar : this.ycx) {
            if (syaVar != null && (syaVarLud = syaVar.lud(str)) != null) {
                return syaVarLud;
            }
        }
        return null;
    }

    public sya zb(String str) {
        sya syaVarLt;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, ((sya) this).ok)) {
            return this;
        }
        for (sya<View> syaVar : this.ycx) {
            if (syaVar != null && (syaVarLt = syaVar.lt(str)) != null) {
                return syaVarLt;
            }
        }
        return null;
    }

    protected sya sya(String str) {
        sya syaVarUl;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, ((sya) this).ok) && ((sya) this).iq == 0) {
            return this;
        }
        if (((sya) this).iq != 0) {
            return null;
        }
        for (sya<View> syaVar : this.ycx) {
            if (syaVar != null && (syaVarUl = syaVar.ul(str)) != null) {
                return syaVarUl;
            }
        }
        return null;
    }

    protected sya dj(String str) {
        sya syaVarFby;
        if (!TextUtils.isEmpty(str) && ok(str) != null) {
            return this;
        }
        for (sya<View> syaVar : this.ycx) {
            if (syaVar != null && (syaVarFby = syaVar.fby(str)) != null) {
                return syaVarFby;
            }
        }
        return null;
    }

    public C0010ycx jc() {
        return new C0010ycx(this);
    }

    /* renamed from: com.bytedance.adsdk.ugeno.zb.ycx$ycx, reason: collision with other inner class name */
    public static class C0010ycx {
        public ViewGroup.LayoutParams dv;
        protected boolean dy;
        protected float ea;
        public float fby;
        public boolean htf;
        protected float jc;
        public float jw;
        public float lt;
        public float lud;
        protected float ok;
        public ycx oty;
        protected boolean pmi;
        protected float ry;
        protected boolean syc;
        public boolean thx;
        public boolean tn;
        protected boolean uh;
        public float ul;
        protected boolean wie;
        public boolean wwx;
        protected float xkz;
        public float ycx = -2.0f;
        public float zb = -2.0f;
        public float sya = 0.0f;
        public float dj = 0.0f;

        public C0010ycx(ycx ycxVar) {
            this.oty = ycxVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void ycx(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            switch (str) {
                case "paddingLeft":
                    this.ea = fby.ycx(context, str2);
                    this.dy = true;
                    break;
                case "minWidth":
                    this.sya = fby.ycx(context, str2);
                    break;
                case "height":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.zb = -1.0f;
                        break;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.zb = -2.0f;
                        break;
                    } else {
                        this.zb = fby.ycx(context, str2);
                        break;
                    }
                case "margin":
                    this.lud = fby.ycx(context, str2);
                    break;
                case "marginTop":
                    this.fby = fby.ycx(context, str2);
                    this.wwx = true;
                    break;
                case "padding":
                    this.jc = fby.ycx(context, str2);
                    this.syc = true;
                    break;
                case "marginBottom":
                    this.jw = fby.ycx(context, str2);
                    this.tn = true;
                    break;
                case "minHeight":
                    this.dj = fby.ycx(context, str2);
                    break;
                case "paddingTop":
                    this.ok = fby.ycx(context, str2);
                    this.pmi = true;
                    break;
                case "width":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.ycx = -1.0f;
                        break;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.ycx = -2.0f;
                        break;
                    } else {
                        this.ycx = fby.ycx(context, str2);
                        break;
                    }
                case "paddingBottom":
                    this.xkz = fby.ycx(context, str2);
                    this.uh = true;
                    break;
                case "paddingRight":
                    this.ry = fby.ycx(context, str2);
                    this.wie = true;
                    break;
                case "marginRight":
                    this.ul = fby.ycx(context, str2);
                    this.thx = true;
                    break;
                case "marginLeft":
                    this.lt = fby.ycx(context, str2);
                    this.htf = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.ycx + ", mHeight=" + this.zb + ", mMargin=" + this.lud + ", mMarginLeft=" + this.lt + ", mMarginRight=" + this.ul + ", mMarginTop=" + this.fby + ", mMarginBottom=" + this.jw + ", mParams=" + this.dv + '}';
        }

        public ViewGroup.LayoutParams ycx() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.ycx, (int) this.zb);
            marginLayoutParams.leftMargin = (int) (this.htf ? this.lt : this.lud);
            marginLayoutParams.rightMargin = (int) (this.thx ? this.ul : this.lud);
            marginLayoutParams.topMargin = (int) (this.wwx ? this.fby : this.lud);
            marginLayoutParams.bottomMargin = (int) (this.tn ? this.jw : this.lud);
            return marginLayoutParams;
        }
    }
}

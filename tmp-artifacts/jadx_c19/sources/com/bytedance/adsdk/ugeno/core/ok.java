package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.ul;
import com.bytedance.adsdk.ugeno.zb.sya;
import com.bytedance.adsdk.ugeno.zb.ycx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ok {
    private fby dj;
    private boolean dy;
    private String ea;
    private com.bytedance.adsdk.ugeno.lud.xkz fby;
    private float htf;
    private ul jc;
    private com.bytedance.adsdk.ugeno.lud.ry jw;
    private pmi lt;
    private syc lud;
    private ea ok;
    private List<String> pmi;
    private sya<View> sya;
    private com.bytedance.adsdk.ugeno.lud.ycx.ycx syc;
    private float thx;
    private lud uh;
    private dy ul;
    private boolean wie;
    private jw wwx;
    private Context ycx;
    private JSONObject zb;
    private boolean ry = true;
    private boolean xkz = false;

    public ok(Context context) {
        this.ycx = context;
    }

    public void ycx(String str, ea eaVar) {
        this.ok = eaVar;
        this.ea = str;
        if (eaVar != null) {
            this.zb = eaVar.ycx();
        }
    }

    public sya<View> ycx(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws JSONException {
        this.zb = jSONObject2;
        pmi pmiVar = this.lt;
        if (pmiVar != null) {
            pmiVar.ycx();
        }
        ul ulVar = new ul(jSONObject, jSONObject2, jSONObject3);
        this.jc = ulVar;
        ulVar.ycx(this.htf, this.thx);
        this.syc = new com.bytedance.adsdk.ugeno.lud.ycx.ycx();
        if (this.lud instanceof com.bytedance.adsdk.ugeno.core.ycx.zb) {
            this.jc.zb();
            throw null;
        }
        this.sya = ycx(this.jc.ycx(), (sya<View>) null);
        if (this.wwx != null) {
            throw null;
        }
        pmi pmiVar2 = this.lt;
        if (pmiVar2 != null) {
            pmiVar2.zb();
            this.sya.ycx(this.lt);
            this.lt.sya();
        }
        ycx(this.sya);
        if (this.lt != null) {
            wie wieVar = new wie();
            wieVar.ycx(0);
            wieVar.ycx(this.sya);
            this.lt.ycx(wieVar);
        }
        return this.sya;
    }

    public sya<View> ycx(ul.ycx ycxVar, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        this.zb = jSONObject;
        pmi pmiVar = this.lt;
        if (pmiVar != null) {
            pmiVar.ycx();
        }
        this.syc = new com.bytedance.adsdk.ugeno.lud.ycx.ycx();
        if (this.lud instanceof com.bytedance.adsdk.ugeno.core.ycx.zb) {
            throw null;
        }
        this.sya = ycx(ycxVar, (sya<View>) null);
        pmi pmiVar2 = this.lt;
        if (pmiVar2 != null) {
            pmiVar2.zb();
            this.sya.ycx(this.lt);
        }
        ycx(this.sya);
        return this.sya;
    }

    public sya<View> ycx(ul.ycx ycxVar, sya<View> syaVar) {
        ycx.C0010ycx c0010ycxJc;
        List<ul.ycx> listSya;
        if (!ul.dj(ycxVar)) {
            return null;
        }
        String strDj = ycxVar.dj();
        zb zbVarYcx = dj.ycx(strDj);
        zb zbVar = zbVarYcx;
        if (zbVarYcx == null) {
            this.dy = true;
            if (this.pmi == null) {
                this.pmi = new ArrayList();
            }
            this.pmi.add(strDj);
            strDj = "View";
            ycxVar.ycx("View");
            zb zbVarYcx2 = dj.ycx("View");
            zbVar = zbVarYcx2;
            if (zbVarYcx2 == null) {
                return null;
            }
        }
        sya syaVarYcx = zbVar.ycx(this.ycx);
        if (syaVarYcx == null) {
            return null;
        }
        JSONObject jSONObjectLud = ycxVar.lud();
        syaVarYcx.jw(com.bytedance.adsdk.ugeno.dj.zb.ycx(ycxVar.ycx(), this.zb));
        syaVarYcx.jc(strDj);
        syaVarYcx.sya(jSONObjectLud);
        syaVarYcx.ycx(ycxVar);
        syaVarYcx.zb(this.zb);
        ul ulVar = this.jc;
        if (ulVar == null) {
            syaVarYcx.zb(true);
        } else {
            syaVarYcx.zb(ulVar.dj());
        }
        syaVarYcx.ycx(this.ok);
        syaVarYcx.ycx(this.syc);
        Iterator<String> itKeys = jSONObjectLud.keys();
        if (syaVar instanceof com.bytedance.adsdk.ugeno.zb.ycx) {
            com.bytedance.adsdk.ugeno.zb.ycx ycxVar2 = (com.bytedance.adsdk.ugeno.zb.ycx) syaVar;
            c0010ycxJc = ycxVar2.jc();
            syaVarYcx.ycx(ycxVar2);
        } else {
            c0010ycxJc = null;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strYcx = com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObjectLud.optString(next), this.zb);
            syaVarYcx.ycx(next, strYcx);
            if (this.wwx != null) {
                throw null;
            }
            if (c0010ycxJc != null) {
                c0010ycxJc.ycx(this.ycx, next, strYcx);
            }
        }
        if (c0010ycxJc != null) {
            syaVarYcx.ycx(c0010ycxJc.ycx());
        }
        if (syaVar != null && TextUtils.equals("virtualNode", syaVar.rmy()) && syaVarYcx.mp()) {
            this.wie = true;
        }
        if (syaVarYcx instanceof com.bytedance.adsdk.ugeno.zb.ycx) {
            List<ul.ycx> listLt = ycxVar.lt();
            if (listLt == null || listLt.size() <= 0) {
                if (TextUtils.equals(syaVarYcx.kgy(), "RecyclerLayout") && (listSya = this.jc.sya()) != null && listSya.size() > 0) {
                    Iterator<ul.ycx> it = listSya.iterator();
                    while (it.hasNext()) {
                        sya<View> syaVarYcx2 = ycx(it.next(), (sya<View>) syaVarYcx);
                        if (syaVarYcx2 != null && syaVarYcx2.dwi()) {
                            ((com.bytedance.adsdk.ugeno.zb.ycx) syaVarYcx).ycx(syaVarYcx2);
                        }
                    }
                }
                return syaVarYcx;
            }
            if (TextUtils.equals(syaVarYcx.kgy(), "Swiper")) {
                listLt.size();
            }
            try {
                Collections.sort(listLt, new Comparator<ul.ycx>() { // from class: com.bytedance.adsdk.ugeno.core.ok.1
                    @Override // java.util.Comparator
                    /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
                    public int compare(ul.ycx ycxVar3, ul.ycx ycxVar4) {
                        return ycxVar3.lud().optInt("order", 0) - ycxVar4.lud().optInt("order", 0);
                    }
                });
            } catch (Throwable unused) {
            }
            Iterator<ul.ycx> it2 = listLt.iterator();
            while (it2.hasNext()) {
                sya<View> syaVarYcx3 = ycx(it2.next(), (sya<View>) syaVarYcx);
                if (syaVarYcx3 != null && !syaVarYcx3.mp()) {
                    ((com.bytedance.adsdk.ugeno.zb.ycx) syaVarYcx).ycx(syaVarYcx3, syaVarYcx3.av());
                }
            }
        }
        this.sya = syaVarYcx;
        return syaVarYcx;
    }

    public sya<View> ycx(JSONObject jSONObject) {
        pmi pmiVar = this.lt;
        if (pmiVar != null) {
            pmiVar.ycx();
        }
        ul ulVar = new ul(jSONObject, this.zb);
        this.jc = ulVar;
        if (this.lud instanceof com.bytedance.adsdk.ugeno.core.ycx.zb) {
            ulVar.zb();
            throw null;
        }
        this.sya = zb(ulVar.ycx(), (sya<View>) null);
        pmi pmiVar2 = this.lt;
        if (pmiVar2 != null) {
            pmiVar2.zb();
            this.sya.ycx(this.lt);
        }
        return this.sya;
    }

    public sya<View> zb(ul.ycx ycxVar, sya<View> syaVar) {
        List<ul.ycx> listSya;
        ycx.C0010ycx c0010ycxJc = null;
        if (!ul.dj(ycxVar)) {
            return null;
        }
        String strDj = ycxVar.dj();
        zb zbVarYcx = dj.ycx(strDj);
        if (zbVarYcx == null) {
            this.dy = true;
            if (this.pmi == null) {
                this.pmi = new ArrayList();
            }
            this.pmi.add(strDj);
            return null;
        }
        sya syaVarYcx = zbVarYcx.ycx(this.ycx);
        if (syaVarYcx == null) {
            return null;
        }
        syaVarYcx.jw(com.bytedance.adsdk.ugeno.dj.zb.ycx(ycxVar.ycx(), this.zb));
        syaVarYcx.jc(strDj);
        syaVarYcx.sya(ycxVar.lud());
        syaVarYcx.ycx(ycxVar);
        syaVarYcx.ycx(this.ok);
        if (syaVar instanceof com.bytedance.adsdk.ugeno.zb.ycx) {
            com.bytedance.adsdk.ugeno.zb.ycx ycxVar2 = (com.bytedance.adsdk.ugeno.zb.ycx) syaVar;
            syaVarYcx.ycx(ycxVar2);
            c0010ycxJc = ycxVar2.jc();
        }
        Iterator<String> itKeys = ycxVar.lud().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strYcx = com.bytedance.adsdk.ugeno.dj.zb.ycx(ycxVar.lud().optString(next), this.zb);
            syaVarYcx.ycx(next, strYcx);
            if (c0010ycxJc != null) {
                c0010ycxJc.ycx(this.ycx, next, strYcx);
            }
        }
        if (syaVarYcx instanceof com.bytedance.adsdk.ugeno.zb.ycx) {
            List<ul.ycx> listLt = ycxVar.lt();
            if (listLt == null || listLt.size() <= 0) {
                if (TextUtils.equals(syaVarYcx.kgy(), "RecyclerLayout") && (listSya = this.jc.sya()) != null && listSya.size() > 0) {
                    Iterator<ul.ycx> it = listSya.iterator();
                    while (it.hasNext()) {
                        sya<View> syaVarZb = zb(it.next(), (sya<View>) syaVarYcx);
                        if (syaVarZb != null && syaVarZb.dwi()) {
                            ((com.bytedance.adsdk.ugeno.zb.ycx) syaVarYcx).ycx(syaVarZb);
                        }
                    }
                }
                return syaVarYcx;
            }
            if (TextUtils.equals(syaVarYcx.kgy(), "Swiper")) {
                listLt.size();
            }
            Iterator<ul.ycx> it2 = listLt.iterator();
            while (it2.hasNext()) {
                sya<View> syaVarZb2 = zb(it2.next(), (sya<View>) syaVarYcx);
                if (syaVarZb2 != null && syaVarZb2.dwi()) {
                    ((com.bytedance.adsdk.ugeno.zb.ycx) syaVarYcx).ycx(syaVarZb2);
                }
            }
        }
        if (c0010ycxJc != null) {
            syaVarYcx.ycx(c0010ycxJc.ycx());
        }
        this.sya = syaVarYcx;
        return syaVarYcx;
    }

    public void zb(JSONObject jSONObject) throws JSONException {
        pmi pmiVar = this.lt;
        if (pmiVar != null) {
            pmiVar.sya();
        }
        this.zb = jSONObject;
        ycx(this.sya, jSONObject);
        ycx(this.sya);
        if (this.lt != null) {
            wie wieVar = new wie();
            wieVar.ycx(0);
            wieVar.ycx(this.sya);
            this.lt.ycx(wieVar);
        }
    }

    public void ycx(sya syaVar, JSONObject jSONObject) {
        if (syaVar != null) {
            if (syaVar instanceof com.bytedance.adsdk.ugeno.zb.ycx) {
                syaVar.ycx(jSONObject);
                List<sya<View>> listJw = ((com.bytedance.adsdk.ugeno.zb.ycx) syaVar).jw();
                if (listJw == null || listJw.size() <= 0) {
                    return;
                }
                Iterator<sya<View>> it = listJw.iterator();
                while (it.hasNext()) {
                    ycx(it.next(), jSONObject);
                }
                return;
            }
            syaVar.ycx(jSONObject);
        }
    }

    private void ycx(sya<View> syaVar) throws JSONException {
        List<sya<View>> listJw;
        if (syaVar == null) {
            return;
        }
        JSONObject jSONObjectHf = syaVar.hf();
        Iterator<String> itKeys = jSONObjectHf.keys();
        com.bytedance.adsdk.ugeno.zb.ycx ycxVarXz = syaVar.xz();
        ycx.C0010ycx c0010ycxJc = ycxVarXz != null ? ycxVarXz.jc() : null;
        zb(syaVar);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strYcx = com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObjectHf.optString(next), this.zb);
            syaVar.ycx(next, strYcx);
            if (c0010ycxJc != null) {
                c0010ycxJc.ycx(this.ycx, next, strYcx);
            }
        }
        syaVar.ycx(this.dj);
        syaVar.ycx(this.lud);
        syaVar.ycx(this.ul);
        jw jwVar = this.wwx;
        if (jwVar != null) {
            syaVar.ycx(jwVar);
        }
        lud ludVar = this.uh;
        if (ludVar != null) {
            syaVar.ycx(ludVar);
        }
        com.bytedance.adsdk.ugeno.lud.xkz xkzVar = this.fby;
        if (xkzVar != null) {
            syaVar.ycx(xkzVar);
        }
        com.bytedance.adsdk.ugeno.lud.ry ryVar = this.jw;
        if (ryVar != null) {
            syaVar.ycx(ryVar);
        }
        if ((syaVar instanceof com.bytedance.adsdk.ugeno.zb.ycx) && (listJw = ((com.bytedance.adsdk.ugeno.zb.ycx) syaVar).jw()) != null && listJw.size() > 0) {
            Iterator<sya<View>> it = listJw.iterator();
            while (it.hasNext()) {
                ycx(it.next());
            }
        }
        if (c0010ycxJc != null) {
            syaVar.ycx(c0010ycxJc.ycx());
        }
        syaVar.zb();
    }

    private void zb(sya syaVar) throws JSONException {
        try {
            if (!syaVar.aeu() || syaVar.rmf() == null || syaVar.rmf().ul() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", syaVar.rmf().ul());
            this.zb.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void ycx(syc sycVar) {
        com.bytedance.adsdk.ugeno.core.ycx.ycx ycxVarLt = com.bytedance.adsdk.ugeno.lt.ycx().lt();
        if (ycxVarLt == null) {
            this.lud = sycVar;
        } else {
            if (ycxVarLt.ycx(sycVar) == null) {
                this.lud = sycVar;
                return;
            }
            throw null;
        }
    }

    public void ycx(dy dyVar) {
        this.ul = dyVar;
    }

    public void ycx(sya syaVar, String str, Object... objArr) {
        List<sya<View>> listJw;
        if (syaVar != null) {
            syaVar.ycx(str, objArr);
            if (!(syaVar instanceof com.bytedance.adsdk.ugeno.zb.ycx) || (listJw = ((com.bytedance.adsdk.ugeno.zb.ycx) syaVar).jw()) == null || listJw.isEmpty()) {
                return;
            }
            Iterator<sya<View>> it = listJw.iterator();
            while (it.hasNext()) {
                ycx(it.next(), str, objArr);
            }
        }
    }

    public boolean ycx() {
        return this.dy;
    }

    public List<String> zb() {
        return this.pmi;
    }

    public void ycx(lud ludVar) {
        this.uh = ludVar;
    }

    public void ycx(JSONObject jSONObject, sya syaVar) throws JSONException {
        zb(jSONObject, syaVar);
        ycx((sya<View>) syaVar);
    }

    private void zb(JSONObject jSONObject, sya syaVar) {
        List<sya<View>> listJw;
        if (syaVar != null) {
            this.zb = jSONObject;
            syaVar.zb(jSONObject);
            syaVar.ycx(this.ok);
            ycx.C0010ycx c0010ycxJc = syaVar.xz() != null ? syaVar.xz().jc() : null;
            Iterator<String> itKeys = syaVar.hf().keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strYcx = com.bytedance.adsdk.ugeno.dj.zb.ycx(syaVar.hf().optString(next), jSONObject);
                syaVar.ycx(next, strYcx);
                if (c0010ycxJc != null) {
                    c0010ycxJc.ycx(this.ycx, next, strYcx);
                }
            }
            if ((syaVar instanceof com.bytedance.adsdk.ugeno.zb.ycx) && (listJw = ((com.bytedance.adsdk.ugeno.zb.ycx) syaVar).jw()) != null && !listJw.isEmpty()) {
                Iterator<sya<View>> it = listJw.iterator();
                while (it.hasNext()) {
                    zb(jSONObject, it.next());
                }
            }
            if (c0010ycxJc != null) {
                syaVar.ycx(c0010ycxJc.ycx());
            }
        }
    }

    public void ycx(com.bytedance.adsdk.ugeno.lud.xkz xkzVar) {
        this.fby = xkzVar;
    }
}

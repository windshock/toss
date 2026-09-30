package com.bytedance.sdk.component.adexpress.dynamic.lud;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.dj.fby;
import com.bytedance.sdk.component.adexpress.zb.ry;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb {
    private String fby;
    private ry jw;
    private int lt;
    private double lud;
    private double ul;
    public Map<String, sya> ycx = new HashMap();
    public Map<String, sya> zb = new HashMap();
    public Map<String, sya> sya = new HashMap();
    private double dj = Math.random();

    public zb(double d, int i2, double d2, String str, ry ryVar) {
        this.lud = d;
        this.lt = i2;
        this.ul = d2;
        this.fby = str;
        this.jw = ryVar;
    }

    public sya ycx(fby fbyVar, float f, float f2) {
        float f3;
        if (TextUtils.isEmpty(fbyVar.jc().sya()) && fbyVar.jc().lud().giw() == null) {
            return new sya(0.0f, 0.0f);
        }
        if (TextUtils.equals(fbyVar.jc().zb(), "creative-playable-bait")) {
            return new sya(0.0f, 0.0f);
        }
        float fFby = fbyVar.fby();
        float fJw = fbyVar.jw();
        com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud = fbyVar.jc().lud();
        String strBhi = ltVarLud.bhi();
        String strTru = ltVarLud.tru();
        float fRy = fbyVar.ry();
        float fXkz = fbyVar.xkz();
        float fSyc = fbyVar.syc();
        float fDy = fbyVar.dy();
        if (TextUtils.equals(strBhi, "fixed")) {
            f = Math.min(fFby, f);
            if (TextUtils.equals(strTru, TtmlNode.TEXT_EMPHASIS_AUTO)) {
                f3 = zb(fbyVar, f - fSyc, f2 - fDy).zb;
                fJw = f3 + fDy;
            }
        } else if (TextUtils.equals(strBhi, TtmlNode.TEXT_EMPHASIS_AUTO)) {
            sya syaVarZb = zb(fbyVar, f - fSyc, f2 - fDy);
            f = syaVarZb.ycx + fSyc;
            if (TextUtils.equals(strTru, TtmlNode.TEXT_EMPHASIS_AUTO)) {
                f3 = syaVarZb.zb;
                fJw = f3 + fDy;
            }
        } else if (!TextUtils.equals(strBhi, "flex")) {
            f = fFby;
        } else if (TextUtils.equals(strTru, TtmlNode.TEXT_EMPHASIS_AUTO)) {
            f3 = zb(fbyVar, f - fSyc, f2 - fDy).zb;
            fJw = f3 + fDy;
        }
        if (TextUtils.equals(strTru, "scale")) {
            float fRound = Math.round((f - fRy) / fJw) + fXkz;
            if (fRound > f2) {
                f = Math.round((f2 - fXkz) * fJw) + fRy;
            } else {
                f2 = fRound;
            }
        } else if (TextUtils.equals(strTru, "fixed")) {
            f2 = Math.min(fJw + fXkz, f2);
        } else if (!TextUtils.equals(strTru, "flex")) {
            f2 = fJw;
        }
        sya syaVar = new sya();
        syaVar.ycx = f;
        syaVar.zb = f2;
        return syaVar;
    }

    public sya zb(fby fbyVar, float f, float f2) {
        sya syaVar = new sya();
        if (fbyVar.jc().lud() == null) {
            return syaVar;
        }
        sya syaVarLud = lud(fbyVar, f, f2);
        float f3 = syaVarLud.ycx;
        float f4 = syaVarLud.zb;
        syaVar.ycx = Math.min(f3, f);
        syaVar.zb = Math.min(f4, f2);
        return syaVar;
    }

    private sya lud(fby fbyVar, float f, float f2) {
        String str = fbyVar.sya() + "_" + f + "_" + f2;
        if (this.sya.containsKey(str)) {
            return this.sya.get(str);
        }
        sya syaVarLt = lt(fbyVar, f, f2);
        this.sya.put(str, syaVarLt);
        return syaVarLt;
    }

    private sya lt(fby fbyVar, float f, float f2) {
        new sya();
        com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud = fbyVar.jc().lud();
        fbyVar.jc().sya();
        ltVarLud.duz();
        float fPmi = ltVarLud.pmi();
        int iUf = ltVarLud.uf();
        double dMp = ltVarLud.mp();
        int iUz = ltVarLud.uz();
        boolean zSz = ltVarLud.sz();
        boolean zLv = ltVarLud.lv();
        int iYi = ltVarLud.yi();
        C0015zb c0015zb = new C0015zb();
        c0015zb.ycx = fPmi;
        c0015zb.zb = iUf;
        c0015zb.sya = iUz;
        c0015zb.dj = dMp;
        c0015zb.lud = f;
        return ycx(fbyVar.jc().sya(), c0015zb, zSz, zLv, iYi, fbyVar);
    }

    private sya ycx(String str, C0015zb c0015zb, boolean z, boolean z2, int i2, fby fbyVar) throws JSONException {
        return ea.ycx(str, fbyVar.jc().zb(), C0015zb.ycx(c0015zb).toString(), z, z2, i2, fbyVar, this.lud, this.lt, this.ul, this.fby, this.jw);
    }

    public sya sya(fby fbyVar, float f, float f2) {
        if (fbyVar == null) {
            return null;
        }
        sya syaVarYcx = ycx(fbyVar);
        if (syaVarYcx != null && (syaVarYcx.ycx != 0.0f || syaVarYcx.zb != 0.0f)) {
            return syaVarYcx;
        }
        sya syaVarDj = dj(fbyVar, f, f2);
        ycx(fbyVar, syaVarDj);
        return syaVarDj;
    }

    public sya dj(fby fbyVar, float f, float f2) {
        float fMin;
        sya syaVar = new sya();
        float f3 = 0.0f;
        if (f2 <= 0.0f || f <= 0.0f) {
            syaVar.ycx = 0.0f;
            syaVar.zb = 0.0f;
            return syaVar;
        }
        if (fbyVar.pmi()) {
            return ycx(fbyVar, f, f2);
        }
        float fFby = fbyVar.fby();
        float fJw = fbyVar.jw();
        float fSyc = fbyVar.syc();
        float fDy = fbyVar.dy();
        com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud = fbyVar.jc().lud();
        String strBhi = ltVarLud.bhi();
        String strTru = ltVarLud.tru();
        float fMin2 = ((TextUtils.equals(strBhi, "flex") || TextUtils.equals(strBhi, TtmlNode.TEXT_EMPHASIS_AUTO)) ? f : Math.min(fFby, f)) - fSyc;
        if (TextUtils.equals(strTru, "scale")) {
            fMin = Math.round(fMin2 / fJw) + fDy;
            if (fMin > f2) {
                fMin2 = Math.round((f2 - fDy) * fJw);
            }
        } else {
            fMin = (TextUtils.equals(strTru, TtmlNode.TEXT_EMPHASIS_AUTO) || TextUtils.equals(strTru, "flex")) ? f2 : Math.min(fJw, f2);
        }
        float f4 = fMin - fDy;
        List<List<fby>> listWie = fbyVar.wie();
        Iterator<List<fby>> it = listWie.iterator();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        while (it.hasNext()) {
            Iterator<List<fby>> it2 = it;
            List<fby> next = it.next();
            float f5 = fDy;
            sya syaVarZb = zb(next, fMin2, f4);
            if (zb(next)) {
                f3 += 1.0f;
            } else {
                fMax = Math.max(fMax, syaVarZb.ycx);
            }
            float f6 = f3;
            if (fbyVar.jc().zb().equals("carousel")) {
                fMax2 = Math.max(fbyVar.jw(), syaVarZb.zb);
            } else {
                fMax2 += syaVarZb.zb;
            }
            fDy = f5;
            it = it2;
            f3 = f6;
        }
        float f7 = fDy;
        if (TextUtils.equals(strBhi, TtmlNode.TEXT_EMPHASIS_AUTO)) {
            if (f3 == listWie.size()) {
                fMin2 = f;
            } else {
                for (List<fby> list : listWie) {
                    sya(list);
                    zb(list, fMax, f4);
                }
                fMin2 = fMax;
            }
        }
        if (TextUtils.equals(strTru, TtmlNode.TEXT_EMPHASIS_AUTO)) {
            if (fMax2 <= f2) {
                f4 = fMax2;
            } else {
                ycx(listWie, fMin2, f4);
            }
        } else if ((TextUtils.equals(strTru, "fixed") || TextUtils.equals(strTru, "flex")) && f4 < fMax2) {
            ycx(listWie, fMin2, f4);
        }
        syaVar.ycx = Math.min(fMin2 + fSyc, f);
        syaVar.zb = Math.min(f4 + f7, f2);
        return syaVar;
    }

    private void ycx(List<List<fby>> list, float f, float f2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<fby>> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (ycx(it.next(), false)) {
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<fby> list2 : list) {
            ycx ycxVar = new ycx();
            boolean zYcx = ycx(list2, !z);
            ycxVar.ycx = zYcx ? 1.0f : zb(list2, f, f2).zb;
            ycxVar.zb = !zYcx;
            arrayList.add(ycxVar);
        }
        List<ycx> listYcx = jc.ycx(f2, arrayList);
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((ycx) arrayList.get(i2)).ycx != listYcx.get(i2).ycx) {
                List<fby> list3 = list.get(i2);
                sya(list3);
                zb(list3, f, listYcx.get(i2).ycx);
            }
        }
    }

    private boolean zb(List<fby> list) {
        List<List<fby>> listWie;
        Iterator<fby> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().jc().lud().bhi(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z = false;
            for (fby fbyVar : list) {
                if (TextUtils.equals(fbyVar.jc().lud().bhi(), TtmlNode.TEXT_EMPHASIS_AUTO) && (listWie = fbyVar.wie()) != null) {
                    int i2 = 0;
                    for (List<fby> list2 : listWie) {
                        i2++;
                        if (zb(list2)) {
                            if (i2 == list2.size()) {
                                z = true;
                            }
                        }
                    }
                }
            }
            return z;
        }
    }

    private sya zb(List<fby> list, float f, float f2) {
        sya syaVarYcx = ycx(list);
        if (syaVarYcx != null && (syaVarYcx.ycx != 0.0f || syaVarYcx.zb != 0.0f)) {
            return syaVarYcx;
        }
        sya syaVarSya = sya(list, f, f2);
        ycx(list, syaVarSya);
        return syaVarSya;
    }

    private sya sya(List<fby> list, float f, float f2) {
        float fMax;
        dj(list);
        sya syaVar = new sya();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (fby fbyVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud = fbyVar.jc().lud();
            if (ltVarLud.ui() == 1 || ltVarLud.ui() == 2) {
                arrayList.add(fbyVar);
            }
            if (ltVarLud.ui() != 1 && ltVarLud.ui() != 2) {
                arrayList2.add(fbyVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sya((fby) it.next(), f, f2);
        }
        if (arrayList2.size() <= 0) {
            return syaVar;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<fby> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(sya(it2.next(), f, f2).ycx));
        }
        ArrayList arrayList4 = new ArrayList();
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList2.size()) {
                break;
            }
            fby fbyVar2 = arrayList2.get(i2);
            String strBhi = fbyVar2.jc().lud().bhi();
            float fFby = fbyVar2.fby();
            boolean zEquals = TextUtils.equals(strBhi, "flex");
            if (TextUtils.equals(strBhi, TtmlNode.TEXT_EMPHASIS_AUTO)) {
                List<List<fby>> listWie = fbyVar2.wie();
                if (listWie == null || listWie.size() <= 0) {
                    zEquals = false;
                } else {
                    Iterator<List<fby>> it3 = listWie.iterator();
                    while (it3.hasNext()) {
                        if (zb(it3.next())) {
                            zEquals = true;
                            break;
                        }
                    }
                    zEquals = false;
                }
            }
            ycx ycxVar = new ycx();
            if (!zEquals) {
                fFby = ((Float) arrayList3.get(i2)).floatValue();
            }
            ycxVar.ycx = fFby;
            ycxVar.zb = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i2)).floatValue();
            }
            ycxVar.sya = fMax;
            arrayList4.add(ycxVar);
            i2++;
        }
        ycx(arrayList4, f, arrayList2);
        List<ycx> listYcx = jc.ycx(f, arrayList4);
        float f3 = 0.0f;
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            f3 += listYcx.get(i3).ycx;
            if (((Float) arrayList3.get(i3)).floatValue() != listYcx.get(i3).ycx) {
                dj(arrayList2.get(i3));
            }
        }
        Iterator<fby> it4 = arrayList2.iterator();
        boolean z = false;
        int i4 = 0;
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            i4++;
            if (!zb(it4.next())) {
                z = false;
                break;
            }
            if (i4 == arrayList2.size()) {
                z = true;
            }
        }
        fMax = z ? f2 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            fby fbyVar3 = arrayList2.get(i5);
            sya syaVarSya = sya(fbyVar3, listYcx.get(i5).ycx, f2);
            if (!zb(fbyVar3)) {
                fMax = Math.max(fMax, syaVarSya.zb);
            }
            arrayList5.add(syaVarSya);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((sya) it5.next()).zb));
        }
        if (!z) {
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                fby fbyVar4 = arrayList2.get(i6);
                if (zb(fbyVar4) && ((Float) arrayList6.get(i6)).floatValue() != fMax) {
                    dj(fbyVar4);
                    sya(fbyVar4, listYcx.get(i6).ycx, fMax);
                }
            }
        }
        syaVar.ycx = f3;
        syaVar.zb = fMax;
        return syaVar;
    }

    private boolean zb(fby fbyVar) {
        if (fbyVar == null) {
            return false;
        }
        if (TextUtils.equals(fbyVar.jc().lud().tru(), "flex")) {
            return true;
        }
        return sya(fbyVar);
    }

    private boolean sya(fby fbyVar) {
        List<List<fby>> listWie;
        if (!fbyVar.pmi() && TextUtils.equals(fbyVar.jc().lud().tru(), TtmlNode.TEXT_EMPHASIS_AUTO) && (listWie = fbyVar.wie()) != null && listWie.size() > 0) {
            if (listWie.size() == 1) {
                Iterator<fby> it = listWie.get(0).iterator();
                while (it.hasNext()) {
                    if (!zb(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<fby>> it2 = listWie.iterator();
            while (it2.hasNext()) {
                if (ycx(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean ycx(List<fby> list, boolean z) {
        for (fby fbyVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud = fbyVar.jc().lud();
            String strTru = ltVarLud.tru();
            if (TextUtils.equals(strTru, "flex") || (z && ((TextUtils.equals(ltVarLud.bhi(), "flex") && TextUtils.equals(ltVarLud.tru(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.dj.lud.ycx.get(fbyVar.jc().zb()).intValue() == 7) || TextUtils.equals(strTru, "flex")))) {
                return true;
            }
        }
        Iterator<fby> it = list.iterator();
        while (it.hasNext()) {
            if (sya(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void ycx(List<ycx> list, float f, List<fby> list2) {
        float f2 = 0.0f;
        for (ycx ycxVar : list) {
            if (ycxVar.zb) {
                f2 += ycxVar.ycx;
            }
        }
        if (f2 > f) {
            int i2 = 0;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                if (list.get(i3).zb && list2.get(i3).wwx()) {
                    i2++;
                }
            }
            if (i2 > 0) {
                float fCeil = (float) (Math.ceil(((f2 - f) / i2) * 1000.0f) / 1000.0d);
                for (int i4 = 0; i4 < list2.size(); i4++) {
                    ycx ycxVar2 = list.get(i4);
                    if (ycxVar2.zb && list2.get(i4).wwx()) {
                        ycxVar2.ycx -= fCeil;
                    }
                }
            }
        }
    }

    public void ycx() {
        this.sya.clear();
        this.ycx.clear();
        this.zb.clear();
    }

    public sya ycx(fby fbyVar) {
        return this.ycx.get(lud(fbyVar));
    }

    public sya ycx(List<fby> list) {
        return this.zb.get(dj(list));
    }

    private void dj(fby fbyVar) {
        this.ycx.remove(lud(fbyVar));
        List<List<fby>> listWie = fbyVar.wie();
        if (listWie == null || listWie.size() <= 0) {
            return;
        }
        Iterator<List<fby>> it = listWie.iterator();
        while (it.hasNext()) {
            sya(it.next());
        }
    }

    private void sya(List<fby> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.zb.remove(dj(list));
        Iterator<fby> it = list.iterator();
        while (it.hasNext()) {
            dj(it.next());
        }
    }

    private String lud(fby fbyVar) {
        return fbyVar.sya();
    }

    private String dj(List<fby> list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String strSya = list.get(i2).sya();
            if (i2 < list.size() - 1) {
                sb.append(strSya);
                sb.append("-");
            } else {
                sb.append(strSya);
            }
        }
        return sb.toString();
    }

    private void ycx(fby fbyVar, sya syaVar) {
        this.ycx.put(lud(fbyVar), syaVar);
    }

    private void ycx(List<fby> list, sya syaVar) {
        this.zb.put(dj(list), syaVar);
    }

    static class sya {
        float ycx;
        float zb;

        public sya() {
        }

        public sya(float f, float f2) {
            this.ycx = f;
            this.zb = f2;
        }

        public String toString() {
            return "UnitSize{width=" + this.ycx + ", height=" + this.zb + '}';
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.lud.zb$zb, reason: collision with other inner class name */
    static class C0015zb {
        double dj;
        float lud;
        int sya;
        float ycx;
        int zb;

        C0015zb() {
        }

        static JSONObject ycx(C0015zb c0015zb) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_SIZE, c0015zb.ycx);
                jSONObject.put("letterSpacing", c0015zb.zb);
                jSONObject.put("lineHeight", c0015zb.dj);
                jSONObject.put("maxWidth", c0015zb.lud);
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_WEIGHT, c0015zb.sya);
                return jSONObject;
            } catch (JSONException e) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "eOEghRaobPWVRtJPyDevJk/ZJJEXtFrTmUbS", "T+EHhgyy", 793);
                return jSONObject;
            }
        }
    }

    static class ycx implements Cloneable {
        float sya;
        float ycx;
        boolean zb;

        ycx() {
        }

        public Object clone() {
            try {
                return (ycx) super.clone();
            } catch (CloneNotSupportedException e) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "eOEghRaobPWVRtJPyDesLUPHI5MM", "WOIimwY=", 810);
                return null;
            }
        }
    }
}

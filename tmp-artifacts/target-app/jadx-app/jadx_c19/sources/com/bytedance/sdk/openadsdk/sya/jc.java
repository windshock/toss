package com.bytedance.sdk.openadsdk.sya;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.tn;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jc {
    private int dy;
    private String ea;
    private String jc;
    private String ok;
    private JSONObject ry;
    private int syc;
    private FilterWord wie;
    private tn xkz;
    public static FilterWord ycx = new FilterWord("", "");
    public static int zb = 1;
    public static int sya = 2;
    public static int dj = 3;
    public static int lud = 4;
    private final Set<sya> lt = new HashSet();
    private final Set<zb> ul = new HashSet();
    private final Set<dj> fby = new HashSet();
    private final Set<ycx> jw = new HashSet();

    public interface dj {
        void ycx(String str);
    }

    public interface sya {
        void ycx(FilterWord filterWord);
    }

    public interface ycx {
        void ycx(List<FilterWord> list);
    }

    public void ycx() {
        this.lt.clear();
        this.ul.clear();
        this.fby.clear();
        this.jw.clear();
    }

    public void ycx(String str) {
        this.jc = str;
    }

    public void zb(String str) {
        this.ea = str;
    }

    public void ycx(FilterWord filterWord) {
        this.wie = filterWord;
        jc();
    }

    public FilterWord zb() {
        return this.wie;
    }

    public boolean sya() {
        FilterWord filterWord = this.wie;
        return (filterWord == null || filterWord.equals(ycx)) ? false : true;
    }

    private void jc() {
        Iterator<sya> it = this.lt.iterator();
        while (it.hasNext()) {
            it.next().ycx(this.wie);
        }
    }

    public void ycx(sya syaVar) {
        this.lt.add(syaVar);
    }

    public void ycx(zb zbVar) {
        this.ul.add(zbVar);
    }

    public void ycx(dj djVar) {
        this.fby.add(djVar);
    }

    public void ycx(ycx ycxVar) {
        this.jw.add(ycxVar);
    }

    public void dj() {
        tn tnVar;
        if (!sya() && !TextUtils.isEmpty(this.ok)) {
            this.wie = new FilterWord("0:00", this.ok);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.wie);
        if (!TextUtils.isEmpty(this.jc)) {
            if (TextUtils.isEmpty(this.ok)) {
                zb.ycx().ycx(this.jc, arrayList, this.ea);
            } else {
                if (this.ry == null && (tnVar = this.xkz) != null) {
                    this.ry = tnVar.ry(true);
                }
                zb.ycx().ycx(this.jc, arrayList, this.ry, this.ok, this.ea);
            }
        }
        Iterator<zb> it = this.ul.iterator();
        while (it.hasNext()) {
            it.next().ycx(zb);
        }
        ycx(ycx);
        sya("");
    }

    public void lud() {
        Iterator<zb> it = this.ul.iterator();
        while (it.hasNext()) {
            it.next().ycx(sya);
        }
    }

    public void lt() {
        Iterator<zb> it = this.ul.iterator();
        while (it.hasNext()) {
            it.next().ycx(lud);
        }
    }

    public void ycx(List<FilterWord> list) {
        Iterator<ycx> it = this.jw.iterator();
        while (it.hasNext()) {
            it.next().ycx(list);
        }
    }

    public void sya(String str) {
        this.ok = str;
        Iterator<dj> it = this.fby.iterator();
        while (it.hasNext()) {
            it.next().ycx(this.ok);
        }
    }

    public String ul() {
        return this.ok;
    }

    public void ycx(tn tnVar) {
        this.xkz = tnVar;
    }

    public void ycx(int i2, int i3) {
        this.syc = i2;
        this.dy = i3;
    }

    public int fby() {
        return this.syc;
    }

    public boolean jw() {
        return this.syc < this.dy;
    }
}

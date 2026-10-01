package com.bytedance.adsdk.ugeno.lud;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.lud;
import com.bytedance.adsdk.ugeno.lud.dj.sya;
import com.bytedance.adsdk.ugeno.lud.lt;
import com.bytedance.adsdk.ugeno.lud.zb.ycx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw implements ea {
    private Map<String, List<sya>> dj;
    private boolean ea;
    private ry fby;
    private boolean jc;
    private com.bytedance.adsdk.ugeno.core.zb.ycx jw;
    private lud lt;
    private com.bytedance.adsdk.ugeno.zb.sya lud;
    private boolean ok;
    private Map<String, List<sya>> sya;
    private xkz ul;
    Handler ycx = new Handler(Looper.getMainLooper());
    private ycx zb;

    public jw(com.bytedance.adsdk.ugeno.zb.sya syaVar, ycx ycxVar) {
        this.lud = syaVar;
        this.zb = ycxVar;
        if (ycxVar != null) {
            this.sya = ycxVar.ycx;
            this.dj = ycxVar.zb;
        }
        if (syaVar != null && syaVar.uf() && this.jw == null) {
            this.jw = new com.bytedance.adsdk.ugeno.core.zb.ycx();
        }
    }

    public void ycx(lud ludVar) {
        this.lt = ludVar;
    }

    public void ycx(xkz xkzVar) {
        this.ul = xkzVar;
    }

    public void ycx(ry ryVar) {
        this.fby = ryVar;
    }

    public void ycx() {
        List<sya> listZb = zb("shake");
        if (listZb == null || listZb.isEmpty()) {
            return;
        }
        for (sya syaVar : listZb) {
            if (syaVar != null) {
                syaVar.ycx(this);
                syaVar.ycx(new Object[0]);
            }
        }
    }

    public void zb() {
        List<sya> listZb = zb("twist");
        if (listZb == null || listZb.isEmpty()) {
            return;
        }
        for (sya syaVar : listZb) {
            if (syaVar != null) {
                syaVar.ycx(this);
                syaVar.ycx(new Object[0]);
            }
        }
    }

    public void sya() {
        List<sya> value;
        ycx ycxVar = this.zb;
        if (ycxVar != null) {
            for (Map.Entry<String, List<sya>> entry : ycxVar.ycx.entrySet()) {
                if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                    for (sya syaVar : value) {
                        if (syaVar instanceof com.bytedance.adsdk.ugeno.lud.dj.dj) {
                            syaVar.ycx(this);
                            syaVar.ycx(new Object[0]);
                        }
                    }
                }
            }
        }
    }

    public void dj() {
        List<sya> listZb = zb("animateState");
        if (listZb == null || listZb.isEmpty()) {
            return;
        }
        for (sya syaVar : listZb) {
            if (syaVar != null) {
                syaVar.ycx(this);
                syaVar.ycx(new Object[0]);
            }
        }
    }

    public void lud() {
        List<sya> listZb = zb("timerState");
        if (listZb == null || listZb.isEmpty()) {
            return;
        }
        for (sya syaVar : listZb) {
            if (syaVar != null) {
                syaVar.ycx(this);
                syaVar.ycx(new Object[0]);
            }
        }
    }

    public void lt() {
        List<sya> listZb = zb("timer");
        if (listZb == null || listZb.isEmpty()) {
            return;
        }
        for (sya syaVar : listZb) {
            if (syaVar != null) {
                syaVar.ycx(this);
                syaVar.ycx(new Object[0]);
            }
        }
    }

    public void ycx(int i2) {
        List<sya> listZb = zb("timer");
        if (listZb == null || listZb.isEmpty()) {
            return;
        }
        for (sya syaVar : listZb) {
            if (syaVar instanceof com.bytedance.adsdk.ugeno.lud.dj.jc) {
                ((com.bytedance.adsdk.ugeno.lud.dj.jc) syaVar).ycx(i2);
            }
        }
    }

    public void ycx(boolean z) {
        List<sya> listZb = zb("timer");
        if (listZb == null || listZb.isEmpty()) {
            return;
        }
        for (sya syaVar : listZb) {
            if (syaVar instanceof com.bytedance.adsdk.ugeno.lud.dj.jc) {
                ((com.bytedance.adsdk.ugeno.lud.dj.jc) syaVar).ycx(z);
            }
        }
    }

    public void ycx(String str) {
        List<sya> listZb = zb("timer");
        if (listZb == null || listZb.isEmpty()) {
            return;
        }
        if (str == null) {
            str = "";
        }
        for (sya syaVar : listZb) {
            if (syaVar instanceof com.bytedance.adsdk.ugeno.lud.dj.jc) {
                com.bytedance.adsdk.ugeno.lud.dj.jc jcVar = (com.bytedance.adsdk.ugeno.lud.dj.jc) syaVar;
                if (TextUtils.equals(str, jcVar.zb())) {
                    jcVar.ycx();
                }
            }
        }
    }

    public boolean ycx(MotionEvent motionEvent) {
        List<sya> listZb = zb("touchStart");
        if (listZb != null && !listZb.isEmpty()) {
            for (sya syaVar : listZb) {
                if (syaVar instanceof com.bytedance.adsdk.ugeno.lud.dj.xkz) {
                    syaVar.ycx(this);
                    syaVar.ycx(motionEvent);
                }
            }
        }
        List<sya> listZb2 = zb("touchEnd");
        List<sya> listZb3 = zb("tap");
        List<sya> listZb4 = zb("slide");
        if (listZb2 != null && !listZb2.isEmpty()) {
            for (sya syaVar2 : listZb2) {
                if (syaVar2 instanceof com.bytedance.adsdk.ugeno.lud.dj.ry) {
                    syaVar2.ycx(this);
                    this.ok = syaVar2.ycx(motionEvent);
                }
            }
        }
        if ((listZb3 == null || listZb3.isEmpty()) && (listZb4 == null || listZb4.isEmpty())) {
            return this.ok;
        }
        if (this.ok && motionEvent.getAction() == 1) {
            return true;
        }
        com.bytedance.adsdk.ugeno.core.zb.ycx ycxVar = this.jw;
        if (ycxVar != null) {
            if (ycxVar.ycx(motionEvent)) {
                return false;
            }
            this.jw.ycx(this.lud, motionEvent);
        }
        if (listZb3 != null && !listZb3.isEmpty()) {
            for (sya syaVar3 : listZb3) {
                if (syaVar3 instanceof com.bytedance.adsdk.ugeno.lud.dj.jw) {
                    ((com.bytedance.adsdk.ugeno.lud.dj.jw) syaVar3).ycx(this.ul);
                    syaVar3.ycx(this);
                    this.jc = syaVar3.ycx(motionEvent);
                }
            }
        }
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && this.jc) {
            com.bytedance.adsdk.ugeno.core.zb.ycx ycxVar2 = this.jw;
            if (ycxVar2 != null) {
                ycxVar2.ycx();
            }
            return true;
        }
        if (listZb4 != null && !listZb4.isEmpty()) {
            for (sya syaVar4 : listZb4) {
                if (syaVar4 instanceof com.bytedance.adsdk.ugeno.lud.dj.lud) {
                    ((com.bytedance.adsdk.ugeno.lud.dj.lud) syaVar4).ycx(this.fby);
                    syaVar4.ycx(this);
                    this.ea = syaVar4.ycx(motionEvent);
                }
            }
        }
        if (action == 1 || action == 3) {
            if (this.ea) {
                com.bytedance.adsdk.ugeno.core.zb.ycx ycxVar3 = this.jw;
                if (ycxVar3 != null) {
                    ycxVar3.ycx();
                }
                return true;
            }
            com.bytedance.adsdk.ugeno.core.zb.ycx ycxVar4 = this.jw;
            if (ycxVar4 != null) {
                ycxVar4.ycx(this.lud);
            }
        }
        return this.jc || this.ea;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycx(String str, List<lt.ycx> list) throws Throwable {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (lt.ycx ycxVar : list) {
            if (ycxVar != null) {
                com.bytedance.adsdk.ugeno.lud.zb.ycx ycxVarYcx = ycx.C0007ycx.ycx(this.lud, str, ycxVar);
                ycxVar.toString();
                if (ycxVarYcx != null) {
                    ycxVarYcx.ycx();
                    ycxVarYcx.zb();
                }
            }
        }
    }

    public List<sya> zb(String str) {
        Map<String, List<sya>> map;
        Map<String, List<sya>> map2 = this.sya;
        if (((map2 == null || map2.isEmpty()) && ((map = this.dj) == null || map.isEmpty())) || TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, List<sya>> map3 = this.sya;
        if (map3 != null && map3.containsKey(str)) {
            return this.sya.get(str);
        }
        Map<String, List<sya>> map4 = this.dj;
        if (map4 != null && map4.containsKey(str)) {
            return this.dj.get(str);
        }
        return null;
    }

    public List<sya> sya(String str) {
        Map<String, List<sya>> map;
        Map<String, List<sya>> map2 = this.dj;
        if (map2 == null || map2.isEmpty() || TextUtils.isEmpty(str) || (map = this.dj) == null || !map.containsKey(str)) {
            return null;
        }
        return this.dj.get(str);
    }

    public void ycx(String str, Object... objArr) {
        List<sya> listSya = sya(str);
        if (listSya == null || listSya.isEmpty()) {
            return;
        }
        for (sya syaVar : listSya) {
            syaVar.ycx(this);
            syaVar.ycx(objArr);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lud.ea
    public void ycx(final com.bytedance.adsdk.ugeno.zb.sya syaVar, final String str, final List<lt.ycx> list, lt ltVar) throws Throwable {
        ltVar.sya();
        ltVar.dj();
        if (ltVar.sya()) {
            return;
        }
        final int iDj = ltVar.dj();
        if (iDj > 0) {
            this.ycx.postDelayed(new com.bytedance.adsdk.ugeno.fby.jc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.lud.jw.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    if (jw.this.lt != null) {
                        jw.this.lt.ycx(syaVar, str, list);
                    }
                    jw.this.ycx(str, (List<lt.ycx>) list);
                }
            }), iDj);
            return;
        }
        lud ludVar = this.lt;
        if (ludVar != null) {
            ludVar.ycx(syaVar, str, list);
        }
        ycx(str, list);
    }

    public static jw ycx(com.bytedance.adsdk.ugeno.zb.sya syaVar, String str) {
        sya syaVarYcx;
        if (syaVar != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                ycx ycxVar = new ycx(new HashMap(), new HashMap(), new HashMap());
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null && (syaVarYcx = sya.ycx.ycx(syaVar.ea().getContext(), syaVar, jSONObjectOptJSONObject, syaVar.ok())) != null) {
                        if (ycxVar.ycx.containsKey(syaVarYcx.dj())) {
                            List<sya> list = ycxVar.ycx.get(syaVarYcx.dj());
                            if (list == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(syaVarYcx);
                                ycxVar.ycx.put(syaVarYcx.dj(), arrayList);
                                ycxVar.zb.put(syaVarYcx.lt(), arrayList);
                            } else {
                                list.add(syaVarYcx);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(syaVarYcx);
                            ycxVar.ycx.put(syaVarYcx.dj(), arrayList2);
                            ycxVar.zb.put(syaVarYcx.lt(), arrayList2);
                        }
                        ycxVar.sya.put(syaVarYcx.lud(), syaVarYcx);
                    }
                }
                return new jw(syaVar, ycxVar);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static class ycx {
        public Map<String, sya> sya;
        public Map<String, List<sya>> ycx;
        public Map<String, List<sya>> zb;

        public ycx(Map<String, List<sya>> map, Map<String, sya> map2, Map<String, List<sya>> map3) {
            this.ycx = map;
            this.sya = map2;
            this.zb = map3;
        }
    }
}

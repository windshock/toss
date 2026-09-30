package com.bytedance.sdk.component.ycx;

import com.bytedance.sdk.component.ycx.sya;
import com.bytedance.sdk.openadsdk.oty.sya;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class lt {
    private final ycx fby;
    private final ea ul;
    private final ul ycx;
    private final Map<String, zb> zb = new HashMap();
    private final wie<String, pmi> sya = new wie<>();
    private final Map<String, sya$zb> dj = new HashMap();
    private final List<xkz> lud = new ArrayList();
    private final Set<sya> lt = new HashSet();

    lt(jw jwVar, ycx ycxVar) {
        this.fby = ycxVar;
        this.ycx = jwVar.dj;
        this.ul = jwVar.fby;
    }

    ycx ycx(xkz xkzVar, lud ludVar) throws Exception {
        zb zbVar = this.zb.get(xkzVar.dj);
        try {
            if (zbVar != null && (zbVar instanceof dj)) {
                return ycx(xkzVar, (dj) zbVar, ludVar);
            }
            zb zbVarYcx = this.sya.ycx(xkzVar.dj);
            if (zbVarYcx != null) {
                return ycx(xkzVar, (dj) zbVarYcx, ludVar);
            }
            sya$zb sya_zb = this.dj.get(xkzVar.dj);
            if (sya_zb == null) {
                return null;
            }
            sya syaVarYcx = sya_zb.ycx();
            syaVarYcx.ycx(xkzVar.dj);
            return ycx(xkzVar, syaVarYcx, ludVar);
        } catch (IllegalStateException e) {
            sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VqjtZ", "eO8hmSu9Z8OMT8U=", "U+8jkQ+5Q9SjS9tRphC2KQ==", 60);
            this.lud.add(xkzVar);
            return new ycx(false, uh.ycx(), (AnonymousClass1) null);
        }
    }

    void ycx(String str, dj<?, ?> djVar) {
        djVar.ycx(str);
        this.zb.put(str, djVar);
    }

    void ycx(Set<String> set, pmi<?, ?> pmiVar) {
        pmiVar.ycx(set);
        this.sya.ycx(set, pmiVar);
        Objects.toString(set);
    }

    void ycx(String str, sya$zb sya_zb) {
        this.dj.put(str, sya_zb);
    }

    void ycx() {
        Iterator<sya> it = this.lt.iterator();
        while (it.hasNext()) {
            it.next().lud();
        }
        this.lt.clear();
        this.zb.clear();
        this.dj.clear();
        this.sya.ycx();
    }

    private ycx ycx(xkz xkzVar, dj djVar, lud ludVar) throws Exception {
        return new ycx(true, uh.ycx(this.ycx.ycx((ul) djVar.ycx(xkzVar.dj, ycx(xkzVar.lud, (zb) djVar), ludVar)), djVar.zb()), (AnonymousClass1) null);
    }

    private ycx ycx(final xkz xkzVar, final sya syaVar, lud ludVar) throws Exception {
        this.lt.add(syaVar);
        syaVar.ycx(ycx(xkzVar.lud, (zb) syaVar), ludVar, new sya.ycx() { // from class: com.bytedance.sdk.component.ycx.lt.1
            public void ycx(Object obj) {
                if (lt.this.fby == null) {
                    return;
                }
                lt.this.fby.zb(uh.ycx(lt.this.ycx.ycx((ul) obj), syaVar.zb()), xkzVar);
                lt.this.lt.remove(syaVar);
            }

            public void ycx(Throwable th) {
                if (lt.this.fby == null) {
                    return;
                }
                lt.this.fby.zb(uh.ycx(th), xkzVar);
                lt.this.lt.remove(syaVar);
            }
        });
        return new ycx(false, uh.ycx(), (AnonymousClass1) null);
    }

    private Object ycx(String str, zb zbVar) throws JSONException {
        return this.ycx.ycx(str, ycx(zbVar)[0]);
    }

    private static Type[] ycx(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass == null) {
            throw new IllegalStateException("Method is not parameterized?!");
        }
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
    }
}

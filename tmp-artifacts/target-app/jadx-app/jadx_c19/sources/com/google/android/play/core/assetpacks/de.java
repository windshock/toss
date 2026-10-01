package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class de {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("ExtractorSessionStoreView");
    private final bh b;
    private final co c;
    private final Map d = new HashMap();
    private final ReentrantLock e = new ReentrantLock();
    private final com.google.android.play.core.assetpacks.internal.aq f;
    private final com.google.android.play.core.assetpacks.internal.aq g;

    de(bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, co coVar, com.google.android.play.core.assetpacks.internal.aq aqVar2) {
        this.b = bhVar;
        this.f = aqVar;
        this.c = coVar;
        this.g = aqVar2;
    }

    private final db q(int i2) {
        Map map = this.d;
        Integer numValueOf = Integer.valueOf(i2);
        db dbVar = (db) map.get(numValueOf);
        if (dbVar != null) {
            return dbVar;
        }
        throw new ck(String.format("Could not find session %d while trying to get it", numValueOf), i2);
    }

    private final Object r(dd ddVar) {
        try {
            this.e.lock();
            return ddVar.a();
        } finally {
            this.e.unlock();
        }
    }

    private static String s(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new ck("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    private static List t(List list) {
        return list == null ? Collections.EMPTY_LIST : list;
    }

    private final Map u(final List list) {
        return (Map) r(new dd() { // from class: com.google.android.play.core.assetpacks.cv
            @Override // com.google.android.play.core.assetpacks.dd
            public final Object a() {
                return this.a.i(list);
            }
        });
    }

    final /* synthetic */ Boolean a(Bundle bundle) {
        int i2 = bundle.getInt("session_id");
        if (i2 == 0) {
            return Boolean.TRUE;
        }
        Map map = this.d;
        Integer numValueOf = Integer.valueOf(i2);
        if (!map.containsKey(numValueOf)) {
            return Boolean.TRUE;
        }
        if (((db) this.d.get(numValueOf)).c.d == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!bg.c(r0.c.d, bundle.getInt(com.google.android.play.core.assetpacks.model.b.a("status", s(bundle)))));
    }

    final /* synthetic */ Boolean b(Bundle bundle) {
        int i2 = bundle.getInt("session_id");
        if (i2 == 0) {
            return Boolean.FALSE;
        }
        Map map = this.d;
        Integer numValueOf = Integer.valueOf(i2);
        boolean z = true;
        if (map.containsKey(numValueOf)) {
            db dbVarQ = q(i2);
            int i3 = bundle.getInt(com.google.android.play.core.assetpacks.model.b.a("status", dbVarQ.c.a));
            da daVar = dbVarQ.c;
            int i4 = daVar.d;
            if (bg.c(i4, i3)) {
                a.a("Found stale update for session %s with status %d.", numValueOf, Integer.valueOf(i4));
                da daVar2 = dbVarQ.c;
                int i5 = daVar2.d;
                String str = daVar2.a;
                if (i5 == 4) {
                    ((y) this.f.a()).h(i2, str);
                } else if (i5 == 5) {
                    ((y) this.f.a()).i(i2);
                } else if (i5 == 6) {
                    ((y) this.f.a()).e(Arrays.asList(str));
                }
            } else {
                daVar.d = i3;
                if (bg.d(i3)) {
                    n(i2);
                    this.c.c(dbVarQ.c.a);
                } else {
                    for (dc dcVar : daVar.f) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.google.android.play.core.assetpacks.model.b.b("chunk_intents", dbVarQ.c.a, dcVar.a));
                        if (parcelableArrayList != null) {
                            for (int i6 = 0; i6 < parcelableArrayList.size(); i6++) {
                                if (parcelableArrayList.get(i6) != null && ((Intent) parcelableArrayList.get(i6)).getData() != null) {
                                    ((cz) dcVar.d.get(i6)).a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String strS = s(bundle);
            long j = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("pack_version", strS));
            String string = bundle.getString(com.google.android.play.core.assetpacks.model.b.a("pack_version_tag", strS), "");
            int i7 = bundle.getInt(com.google.android.play.core.assetpacks.model.b.a("status", strS));
            long j2 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("total_bytes_to_download", strS));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(com.google.android.play.core.assetpacks.model.b.a("slice_ids", strS));
            ArrayList arrayList = new ArrayList();
            for (String str2 : t(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(com.google.android.play.core.assetpacks.model.b.b("chunk_intents", strS, str2));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = t(parcelableArrayList2).iterator();
                while (it.hasNext()) {
                    if (((Intent) it.next()) == null) {
                        z = false;
                    }
                    arrayList2.add(new cz(z));
                    z = true;
                }
                String string2 = bundle.getString(com.google.android.play.core.assetpacks.model.b.b("uncompressed_hash_sha256", strS, str2));
                long j3 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.b("uncompressed_size", strS, str2));
                int i8 = bundle.getInt(com.google.android.play.core.assetpacks.model.b.b("patch_format", strS, str2), 0);
                arrayList.add(i8 != 0 ? new dc(str2, string2, j3, arrayList2, 0, i8) : new dc(str2, string2, j3, arrayList2, bundle.getInt(com.google.android.play.core.assetpacks.model.b.b("compression_format", strS, str2), 0), 0));
                z = true;
            }
            this.d.put(Integer.valueOf(i2), new db(i2, bundle.getInt("app_version_code"), new da(strS, j, i7, j2, arrayList, string)));
        }
        return Boolean.TRUE;
    }

    final /* synthetic */ Object c(String str, int i2, long j) {
        db dbVar = (db) u(Arrays.asList(str)).get(str);
        if (dbVar == null || bg.d(dbVar.c.d)) {
            a.b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.b.E(str, i2, j);
        dbVar.c.d = 4;
        return null;
    }

    final /* synthetic */ Object d(int i2, int i3) {
        q(i2).c.d = 5;
        return null;
    }

    final /* synthetic */ Object e(int i2) {
        db dbVarQ = q(i2);
        da daVar = dbVarQ.c;
        if (!bg.d(daVar.d)) {
            throw new ck(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i2)), i2);
        }
        this.b.E(daVar.a, dbVarQ.b, daVar.b);
        da daVar2 = dbVarQ.c;
        int i3 = daVar2.d;
        if (i3 != 5 && i3 != 6) {
            return null;
        }
        this.b.F(daVar2.a, dbVarQ.b, daVar2.b);
        return null;
    }

    final Map f(List list) {
        return (Map) r(new cu(this, list));
    }

    final Map g() {
        return this.d;
    }

    final /* synthetic */ Map h(List list) {
        Map mapU = u(list);
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            db dbVar = (db) mapU.get(str);
            if (dbVar == null) {
                map.put(str, 8);
            } else {
                da daVar = dbVar.c;
                if (bg.a(daVar.d)) {
                    try {
                        daVar.d = 6;
                        ((Executor) this.g.a()).execute(new cx(this, dbVar));
                        this.c.c(str);
                    } catch (ck unused) {
                        a.d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(dbVar.a), str);
                    }
                }
                map.put(str, Integer.valueOf(dbVar.c.d));
            }
        }
        return map;
    }

    final /* synthetic */ Map i(List list) {
        HashMap map = new HashMap();
        for (db dbVar : this.d.values()) {
            String str = dbVar.c.a;
            if (list.contains(str)) {
                db dbVar2 = (db) map.get(str);
                if ((dbVar2 == null ? -1 : dbVar2.a) < dbVar.a) {
                    map.put(str, dbVar);
                }
            }
        }
        return map;
    }

    final void j() {
        this.e.lock();
    }

    final void k(final String str, final int i2, final long j) {
        r(new dd() { // from class: com.google.android.play.core.assetpacks.cs
            @Override // com.google.android.play.core.assetpacks.dd
            public final Object a() {
                this.a.c(str, i2, j);
                return null;
            }
        });
    }

    final void l() {
        this.e.unlock();
    }

    final void m(final int i2, @AssetPackStatus int i3) {
        final int i4 = 5;
        r(new dd(i2, i4) { // from class: com.google.android.play.core.assetpacks.ct
            public final /* synthetic */ int b;

            @Override // com.google.android.play.core.assetpacks.dd
            public final Object a() {
                this.a.d(this.b, 5);
                return null;
            }
        });
    }

    final void n(final int i2) {
        r(new dd() { // from class: com.google.android.play.core.assetpacks.cr
            @Override // com.google.android.play.core.assetpacks.dd
            public final Object a() {
                this.a.e(i2);
                return null;
            }
        });
    }

    final boolean o(final Bundle bundle) {
        return ((Boolean) r(new dd() { // from class: com.google.android.play.core.assetpacks.cy
            @Override // com.google.android.play.core.assetpacks.dd
            public final Object a() {
                return this.a.a(bundle);
            }
        })).booleanValue();
    }

    final boolean p(final Bundle bundle) {
        return ((Boolean) r(new dd() { // from class: com.google.android.play.core.assetpacks.cw
            @Override // com.google.android.play.core.assetpacks.dd
            public final Object a() {
                return this.a.b(bundle);
            }
        })).booleanValue();
    }
}

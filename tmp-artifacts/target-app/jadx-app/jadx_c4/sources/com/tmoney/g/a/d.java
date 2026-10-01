package com.tmoney.g.a;

import android.content.Context;
import android.nfc.tech.IsoDep;
import com.tmoney.b.y;
import com.tmoney.utils.LogHelper;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class d implements b {
    private static volatile d a;
    private static Queue<c> b = new LinkedList();
    private static c c;

    private d() {
        LogHelper.d("UsimTaskManager", "UsimTaskManager()");
    }

    private void a() {
        String str;
        LogHelper.d("UsimTaskManager", "execute mNowTask : " + c);
        if (b.peek() != null) {
            try {
                if (c != null) {
                    LogHelper.d("UsimTaskManager", "execute mNowTask curr: " + System.currentTimeMillis());
                    LogHelper.d("UsimTaskManager", "execute mNowTask start : " + c.getStartTime());
                    if (System.currentTimeMillis() - c.getStartTime() > 20000) {
                        LogHelper.d("UsimTaskManager", "execute mNowTask timeout");
                        c = null;
                    }
                }
            } catch (Exception unused) {
                c = null;
            }
            try {
                if (c != null) {
                    LogHelper.d("UsimTaskManager", "execute wait");
                    return;
                }
                c = b.poll();
                LogHelper.d("UsimTaskManager", "poll mNowTask:" + c);
                c.setOnTaskListener(this);
                c.setStartTime();
                LogHelper.d("UsimTaskManager", "execute createUsim");
                final boolean z = !(c.getExcuter() instanceof y);
                c.createUsim(new HashMap<String, Object>() { // from class: com.tmoney.g.a.d.1
                    {
                        put("needUicc", Boolean.valueOf(z));
                    }
                });
                return;
            } catch (Exception unused2) {
                str = "execute mQueue.poll() is null";
            }
        } else {
            str = "execute mQueue.peek() is null";
        }
        LogHelper.d("UsimTaskManager", str);
    }

    public static d getInstance() {
        LogHelper.d("UsimTaskManager", "getInstance() " + a);
        if (a == null) {
            synchronized (d.class) {
                if (a == null) {
                    a = new d();
                }
            }
        }
        return a;
    }

    public boolean offerTask(Context context, a aVar) {
        return offerTask(context, aVar, true, null);
    }

    public boolean offerTask(Context context, a aVar, boolean z) {
        return offerTask(context, aVar, z, null);
    }

    public boolean offerTask(Context context, a aVar, boolean z, IsoDep isoDep) {
        LogHelper.d("UsimTaskManager", "offerTask start mQueue.size:" + b.size() + ",executer:" + aVar.toString());
        if (b != null) {
            LogHelper.d("UsimTaskManager", "clearQueue:" + b.size());
            if (b.size() > 3) {
                LogHelper.d("UsimTaskManager", "clear Queue");
                b.clear();
            }
        }
        boolean zOffer = b.offer(new c(context, aVar, z, isoDep));
        LogHelper.d("UsimTaskManager", "offerTask isOffer:" + zOffer);
        a();
        return zOffer;
    }

    @Override // com.tmoney.g.a.b
    public void onTaskResult() {
        LogHelper.d("UsimTaskManager", "onTaskResult");
        c = null;
        a();
    }
}

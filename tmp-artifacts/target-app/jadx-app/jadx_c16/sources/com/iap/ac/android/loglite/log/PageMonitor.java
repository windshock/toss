package com.iap.ac.android.loglite.log;

import android.text.TextUtils;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.utils.LoggerWrapper;
import com.iap.ac.android.loglite.utils.LoggingUtil;
import com.iap.ac.android.loglite.utils.PageUtil;
import com.iap.ac.config.lite.preset.PresetParser;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PageMonitor {
    public static PageMonitor c;
    public Map<String, PageInfo> a = new HashMap();
    public PageInfo b;

    public static PageMonitor a() {
        if (c == null) {
            c = new PageMonitor();
        }
        return c;
    }

    public void a(Object obj) {
        if (obj != null) {
            String strA = PageUtil.a(obj);
            if (this.a.get(strA) != null) {
                this.a.remove(strA);
            }
        }
    }

    public void a(Object obj, String str) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            String strA = PageUtil.a(obj);
            PageInfo pageInfo = this.a.get(strA);
            if (pageInfo != null && !pageInfo.isEnd()) {
                LoggerWrapper.i("PageMonitor", "Start_not call end,and start twice,update spm");
                if (TextUtils.isEmpty(str)) {
                    LoggerWrapper.i("PageMonitor", "updateLastInfoSpm spm or lastInfo is null");
                    return;
                } else {
                    pageInfo.setSpm(str);
                    return;
                }
            }
            PageInfo pageInfo2 = this.a.get(strA);
            if (pageInfo2 == null) {
                pageInfo2 = new PageInfo();
                PageInfo pageInfo3 = this.b;
                if (pageInfo3 != null) {
                    pageInfo2.setReferPageInfo(PageInfo.clonePageInfo(pageInfo3));
                }
            }
            PageInfo pageInfo4 = pageInfo2;
            pageInfo4.setEnd(false);
            pageInfo4.setPageStartTime10(LoggingUtil.getServerTime());
            long pageStartTime10 = pageInfo4.getPageStartTime10();
            int iPow = (int) Math.pow(2.0d, 6.0d);
            char[] cArr = new char[iPow];
            int i = iPow;
            do {
                i--;
                cArr[i] = PageUtil.a[(int) (63 & pageStartTime10)];
                pageStartTime10 >>>= 6;
            } while (pageStartTime10 != 0);
            pageInfo4.setPageStartTime64(new String(cArr, i, iPow - i));
            pageInfo4.setPageId(str + "__" + pageInfo4.getPageStartTime64() + PresetParser.UNDERLINE);
            pageInfo4.setSpm(str);
            this.a.put(strA, pageInfo4);
            this.b = pageInfo4;
            return;
        }
        LoggerWrapper.i("PageMonitor", "Start_view is null or spm is null");
    }

    public final void a(Object obj, String str, String str2, String str3, Map<String, String> map) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            PageInfo pageInfo = this.a.get(PageUtil.a(obj));
            if (pageInfo == null) {
                LoggerWrapper.i("PageMonitor", "End_pageInfo is null");
                return;
            }
            if (pageInfo.isEnd()) {
                LoggerWrapper.i("PageMonitor", "is already call pageEnd");
                return;
            }
            pageInfo.setEnd(true);
            PageLog pageLog = new PageLog(str, map);
            pageLog.i = pageInfo.getRefer();
            pageLog.h = LoggingUtil.getServerTime() - pageInfo.getPageStartTime10();
            pageLog.j = pageInfo.getPageId();
            pageLog.k = pageInfo.getPageStartTime64();
            if (!TextUtils.isEmpty(str3)) {
                ((LogEvent) pageLog).e = str3;
            }
            if (!TextUtils.isEmpty(str2)) {
                ((LogEvent) pageLog).c = str2;
            }
            AnalyticsContext.getInstance().getStorageManager().a(pageLog, str3);
            return;
        }
        LoggerWrapper.i("PageMonitor", "End_View is null or spm is null");
    }
}

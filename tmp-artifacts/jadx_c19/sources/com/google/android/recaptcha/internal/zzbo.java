package com.google.android.recaptcha.internal;

import android.net.TrafficStats;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbo implements zzbn {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static long onNavigationEvent = 5617300551900247935L;
    private static int onWarmupCompleted = 1;
    private final String zza;

    public zzbo(@NotNull String str) {
        this.zza = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[PHI: r1
      0x006f: PHI (r1v11 com.google.android.recaptcha.internal.zznf) = (r1v9 com.google.android.recaptcha.internal.zznf), (r1v13 com.google.android.recaptcha.internal.zznf) binds: [B:13:0x006c, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzb(byte[] bArr) {
        zznf zznfVar;
        int i2 = 2 % 2;
        Iterator it = zzni.zzk(bArr).zzH().iterator();
        int i3 = onWarmupCompleted + 125;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 5;
        }
        while (it.hasNext()) {
            int i5 = onExtraCallback + 103;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                zznfVar = (zznf) it.next();
                String[] strArr = new String[2];
                strArr[1] = "INIT_TOTAL";
                strArr[1] = "EXECUTE_TOTAL";
                if (CollectionsKt.listOf(strArr).contains(zznfVar.zzj().name())) {
                    if (zznfVar.zzT()) {
                        int i6 = onWarmupCompleted + 21;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        zznfVar.zzJ();
                        zznfVar.zzK();
                        zznfVar.zzj();
                        zznfVar.zzg().zzk();
                        zznfVar.zzg().zzf();
                        zznfVar.zzU();
                    }
                }
                zznfVar.zzJ();
                zznfVar.zzK();
                zznfVar.zzj();
                zznfVar.zzU();
            } else {
                zznfVar = (zznf) it.next();
                if (!CollectionsKt.listOf(new String[]{"INIT_TOTAL", "EXECUTE_TOTAL"}).contains(zznfVar.zzj().name())) {
                }
                zznfVar.zzJ();
                zznfVar.zzK();
                zznfVar.zzj();
                zznfVar.zzU();
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbn
    public final boolean zza(@NotNull byte[] bArr) throws Throwable {
        HttpURLConnection httpURLConnection;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        onExtraCallback = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
                zzb(bArr);
                URLUtil.isHttpUrl(this.zza);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            zzb(bArr);
            if (URLUtil.isHttpUrl(this.zza)) {
                URLConnection uRLConnectionOpenConnection = new URL(this.zza).openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "");
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            } else {
                if (!URLUtil.isHttpsUrl(this.zza)) {
                    throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
                }
                URLConnection uRLConnectionOpenConnection2 = new URL(this.zza).openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection2, "");
                httpURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection2;
            }
            Object[] objArr = new Object[1];
            a(new char[]{1542, 18740, 1622, 34056, 7452, 26557, 34217, 688}, 1 - View.MeasureSpec.getMode(0), objArr);
            httpURLConnection.setRequestMethod(((String) objArr[0]).intern());
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/x-protobuffer");
            httpURLConnection.connect();
            httpURLConnection.getOutputStream().write(bArr);
            if (httpURLConnection.getResponseCode() != 200) {
                return false;
            }
            int i4 = onExtraCallback + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i4 = $11 + 73;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i6 = $11 + 125;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i8 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45812), 84 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 21233 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14186 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 19, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }
}

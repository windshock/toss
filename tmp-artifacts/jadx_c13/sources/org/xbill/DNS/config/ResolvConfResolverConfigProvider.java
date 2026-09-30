package org.xbill.DNS.config;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.StringTokenizer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.setPrivacyText;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ResolvConfResolverConfigProvider extends setPrivacyText {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onTransact = 1;
    private static long onWarmupCompleted = -4882947176630026929L;
    private int onExtraCallbackWithResult = 1;

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public void onExtraCallback() throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted();
            if (!onExtraCallback("/etc/resolv.conf")) {
                onExtraCallback("sys:/etc/resolv.cfg");
            }
            int i3 = IAuthTabCallback + 31;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        onWarmupCompleted();
        onExtraCallback("/etc/resolv.conf");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[PHI: r6
      0x0035: PHI (r6v8 java.io.InputStream) = (r6v7 java.io.InputStream), (r6v16 java.io.InputStream) binds: [B:12:0x0033, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.nio.file.Path] */
    /* JADX WARN: Type inference failed for: r6v13, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean onExtraCallback(String str) throws IOException {
        InputStream inputStreamNewInputStream;
        int i = 2 % 2;
        ?? r6 = Paths.get(str, new String[0]);
        if (Files.exists(r6, new LinkOption[0])) {
            int i2 = onTransact + 101;
            IAuthTabCallback = i2 % 128;
            try {
                try {
                    if (i2 % 2 != 0) {
                        inputStreamNewInputStream = Files.newInputStream(r6, new OpenOption[1]);
                        onExtraCallback(inputStreamNewInputStream);
                        if (inputStreamNewInputStream != null) {
                            int i3 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
                            IAuthTabCallback = i3 % 128;
                            if (i3 % 2 != 0) {
                                inputStreamNewInputStream.close();
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            inputStreamNewInputStream.close();
                        }
                    } else {
                        inputStreamNewInputStream = Files.newInputStream(r6, new OpenOption[0]);
                        onExtraCallback(inputStreamNewInputStream);
                        if (inputStreamNewInputStream != null) {
                        }
                    }
                    int i4 = onTransact + 3;
                    IAuthTabCallback = i4 % 128;
                    r6 = i4 % 2;
                    if (r6 != 0) {
                        int i5 = 34 / 0;
                    }
                    return true;
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        int i6 = onTransact + 61;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    protected void onExtraCallback(InputStream inputStream) throws IOException {
        int i = 2 % 2;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try {
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        inputStreamReader.close();
                        String str = System.getenv("LOCALDOMAIN");
                        if (str != null && !str.isEmpty()) {
                            int i2 = IAuthTabCallback + 31;
                            onTransact = i2 % 128;
                            if (i2 % 2 == 0) {
                                this.onNavigationEvent.clear();
                                IAuthTabCallback(str, " ");
                                int i3 = 98 / 0;
                            } else {
                                this.onNavigationEvent.clear();
                                IAuthTabCallback(str, " ");
                            }
                        }
                        String str2 = System.getenv("RES_OPTIONS");
                        if (str2 == null || str2.isEmpty()) {
                            return;
                        }
                        StringTokenizer stringTokenizer = new StringTokenizer(str2, " ");
                        while (stringTokenizer.hasMoreTokens()) {
                            int i4 = IAuthTabCallback + 15;
                            onTransact = i4 % 128;
                            if (i4 % 2 == 0) {
                                stringTokenizer.nextToken().startsWith("ndots:");
                                throw null;
                            }
                            String strNextToken = stringTokenizer.nextToken();
                            if (strNextToken.startsWith("ndots:")) {
                                int i5 = IAuthTabCallback + 71;
                                onTransact = i5 % 128;
                                this.onExtraCallbackWithResult = onExtraCallbackWithResult(i5 % 2 == 0 ? strNextToken.substring(23) : strNextToken.substring(6));
                            }
                        }
                        return;
                    }
                    StringTokenizer stringTokenizer2 = new StringTokenizer(line);
                    if (stringTokenizer2.hasMoreTokens()) {
                        String strNextToken2 = stringTokenizer2.nextToken();
                        switch (strNextToken2.hashCode()) {
                            case -1326197564:
                                if (!strNextToken2.equals("domain")) {
                                    break;
                                } else {
                                    this.onNavigationEvent.clear();
                                    if (!stringTokenizer2.hasMoreTokens()) {
                                        break;
                                    } else {
                                        onNavigationEvent(stringTokenizer2.nextToken());
                                        break;
                                    }
                                }
                            case -1249474914:
                                Object[] objArr = new Object[1];
                                a(new char[]{58447, 45492, 58400, 46983, 5285, 49629, 6231, 64812, 44693, 54141, 15798}, 1 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
                                if (!strNextToken2.equals(((String) objArr[0]).intern())) {
                                    break;
                                } else {
                                    while (stringTokenizer2.hasMoreTokens()) {
                                        String strNextToken3 = stringTokenizer2.nextToken();
                                        if (strNextToken3.startsWith("ndots:")) {
                                            this.onExtraCallbackWithResult = onExtraCallbackWithResult(strNextToken3.substring(6));
                                        }
                                    }
                                    break;
                                }
                            case -906336856:
                                if (!strNextToken2.equals("search")) {
                                    break;
                                } else {
                                    int i6 = onTransact + 25;
                                    IAuthTabCallback = i6 % 128;
                                    int i7 = i6 % 2;
                                    this.onNavigationEvent.clear();
                                    while (stringTokenizer2.hasMoreTokens()) {
                                        onNavigationEvent(stringTokenizer2.nextToken());
                                        int i8 = onTransact + 105;
                                        IAuthTabCallback = i8 % 128;
                                        int i9 = i8 % 2;
                                    }
                                    break;
                                }
                            case 154424718:
                                if (!strNextToken2.equals("nameserver")) {
                                    break;
                                } else {
                                    onNavigationEvent(new InetSocketAddress(stringTokenizer2.nextToken(), 53));
                                    int i10 = onTransact + 13;
                                    IAuthTabCallback = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        break;
                                    } else {
                                        int i11 = 3 / 4;
                                        break;
                                    }
                                }
                        }
                    } else {
                        int i12 = IAuthTabCallback + 107;
                        onTransact = i12 % 128;
                        int i13 = i12 % 2;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 77;
        $10 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                break;
            }
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - ((Process.getThreadPriority(0) + 20) >> 6)), Color.alpha(0) + 84, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21232, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 19 - KeyEvent.normalizeMetaState(0), 8809 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                i3 = $10 + 97;
                $11 = i3 % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 17;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i7 = 96 / 0;
            objArr[0] = str;
        }
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public int asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.onExtraCallbackWithResult;
        int i5 = i3 + 31;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return i4;
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (System.getProperty("os.name").contains("Windows") || System.getProperty("java.specification.vendor").toLowerCase().contains("android")) {
            return false;
        }
        int i2 = onTransact + 57;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

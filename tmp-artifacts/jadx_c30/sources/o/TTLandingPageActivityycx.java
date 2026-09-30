package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Iterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTLandingPageActivityycx {
    public static /* synthetic */ TTLandingPageActivity14 onWarmupCompleted(TTLandingPageActivity15 tTLandingPageActivity15) {
        TTLandingPageActivity14 tTLandingPageActivity14OnNavigationEvent = tTLandingPageActivity15.onNavigationEvent();
        while (tTLandingPageActivity14OnNavigationEvent != null && !tTLandingPageActivity15.IAuthTabCallback(tTLandingPageActivity14OnNavigationEvent)) {
            tTLandingPageActivity14OnNavigationEvent = tTLandingPageActivity15.onNavigationEvent();
        }
        return tTLandingPageActivity14OnNavigationEvent;
    }

    public static /* synthetic */ void onNavigationEvent(TTPlayableLandingPageActivity8 tTPlayableLandingPageActivity8, TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        while (true) {
            int iOnExtraCallbackWithResult = tTPlayableLandingPageActivity8.onExtraCallbackWithResult(bArr);
            if (-1 == iOnExtraCallbackWithResult) {
                return;
            }
            if (outputStream != null) {
                outputStream.write(bArr, 0, iOnExtraCallbackWithResult);
            }
        }
    }

    public static /* synthetic */ TTRewardVideoActivity7 onNavigationEvent(Iterator it) {
        if (it.hasNext()) {
            return (TTRewardVideoActivity7) it.next();
        }
        return null;
    }

    public static /* synthetic */ void IAuthTabCallback(TTVideoLandingPageActivity1 tTVideoLandingPageActivity1, TTRewardVideoActivity7 tTRewardVideoActivity7, OutputStream outputStream) throws IOException {
        InputStream inputStreamOnWarmupCompleted = tTVideoLandingPageActivity1.onWarmupCompleted(tTRewardVideoActivity7);
        try {
            PAGNativeAdLoadListener.onWarmupCompleted(inputStreamOnWarmupCompleted, outputStream);
            if (inputStreamOnWarmupCompleted != null) {
                inputStreamOnWarmupCompleted.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStreamOnWarmupCompleted != null) {
                    try {
                        inputStreamOnWarmupCompleted.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x000e, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ TTWebsiteActivity2 onNavigationEvent(Enumeration enumeration, dj15 dj15Var) {
        TTWebsiteActivity2 tTWebsiteActivity2;
        if (enumeration.hasMoreElements()) {
            tTWebsiteActivity2 = (TTWebsiteActivity2) enumeration.nextElement();
            while (tTWebsiteActivity2 != null && !dj15Var.IAuthTabCallback(tTWebsiteActivity2)) {
                if (enumeration.hasMoreElements()) {
                    tTWebsiteActivity2 = (TTWebsiteActivity2) enumeration.nextElement();
                }
            }
            return tTWebsiteActivity2;
        }
        tTWebsiteActivity2 = null;
    }

    public static /* synthetic */ void onWarmupCompleted(dj15 dj15Var, TTWebsiteActivity2 tTWebsiteActivity2, OutputStream outputStream) throws IOException {
        InputStream inputStreamOnNavigationEvent = dj15Var.onNavigationEvent(tTWebsiteActivity2);
        try {
            PAGNativeAdLoadListener.onWarmupCompleted(inputStreamOnNavigationEvent, outputStream);
            if (inputStreamOnNavigationEvent != null) {
                inputStreamOnNavigationEvent.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStreamOnNavigationEvent != null) {
                    try {
                        inputStreamOnNavigationEvent.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }
}

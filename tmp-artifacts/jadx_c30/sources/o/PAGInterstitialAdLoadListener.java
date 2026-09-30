package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class PAGInterstitialAdLoadListener {
    public static /* synthetic */ Object onWarmupCompleted(String str, String str2) {
        String property = System.getProperty(str, str2);
        try {
            return PAGInterstitialAdLoadListener.class.getClassLoader().loadClass(property).newInstance();
        } catch (Exception e) {
            throw new Error(PAGClientBidding.IAuthTabCallback("archive.3E", property), e);
        }
    }

    private PAGInterstitialAdLoadListener() {
    }
}

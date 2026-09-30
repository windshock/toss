package o;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTVideoLandingPageLink2Activity5 {
    private final int IAuthTabCallback;
    private final ThreadLocal<TTVideoLandingPageLink2Activity2> IAuthTabCallbackStub;
    private final long onExtraCallback;
    private final ExecutorService onExtraCallbackWithResult;
    private final PAGMediaView onNavigationEvent;
    private final Deque<TTVideoLandingPageLink2Activity2> onTransact;
    private final Deque<Future<? extends TTVideoLandingPageLink2Activity2>> onWarmupCompleted;

    public TTVideoLandingPageLink2Activity5() {
        this(Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()));
    }

    public TTVideoLandingPageLink2Activity5(ExecutorService executorService) {
        this(executorService, new TTVideoLandingPageActivity9(null));
    }

    public TTVideoLandingPageLink2Activity5(ExecutorService executorService, PAGMediaView pAGMediaView) {
        this(executorService, pAGMediaView, -1);
    }

    public TTVideoLandingPageLink2Activity5(ExecutorService executorService, PAGMediaView pAGMediaView, int i) throws IllegalArgumentException {
        this.onTransact = new ConcurrentLinkedDeque();
        this.onWarmupCompleted = new ConcurrentLinkedDeque();
        this.onExtraCallback = System.currentTimeMillis();
        this.IAuthTabCallbackStub = new ThreadLocal<TTVideoLandingPageLink2Activity2>() { // from class: o.TTVideoLandingPageLink2Activity5.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public TTVideoLandingPageLink2Activity2 initialValue() {
                try {
                    TTVideoLandingPageLink2Activity5 tTVideoLandingPageLink2Activity5 = TTVideoLandingPageLink2Activity5.this;
                    TTVideoLandingPageLink2Activity2 tTVideoLandingPageLink2Activity2IAuthTabCallback = tTVideoLandingPageLink2Activity5.IAuthTabCallback(tTVideoLandingPageLink2Activity5.onNavigationEvent);
                    TTVideoLandingPageLink2Activity5.this.onTransact.add(tTVideoLandingPageLink2Activity2IAuthTabCallback);
                    return tTVideoLandingPageLink2Activity2IAuthTabCallback;
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
        };
        if ((i < 0 || i > 9) && i != -1) {
            throw new IllegalArgumentException("Compression level is expected between -1~9");
        }
        this.onNavigationEvent = pAGMediaView;
        this.onExtraCallbackWithResult = executorService;
        this.IAuthTabCallback = i;
    }

    public static /* synthetic */ TTVideoLandingPageLink2Activity2 onExtraCallback(TTVideoLandingPageLink2Activity5 tTVideoLandingPageLink2Activity5, dj10 dj10Var) throws IOException {
        TTVideoLandingPageLink2Activity2 tTVideoLandingPageLink2Activity2 = tTVideoLandingPageLink2Activity5.IAuthTabCallbackStub.get();
        tTVideoLandingPageLink2Activity2.onExtraCallback(dj10Var);
        return tTVideoLandingPageLink2Activity2;
    }

    public static /* synthetic */ TTVideoLandingPageLink2Activity2 onWarmupCompleted(TTVideoLandingPageLink2Activity5 tTVideoLandingPageLink2Activity5, TTWebsiteActivity9 tTWebsiteActivity9) throws IOException {
        TTVideoLandingPageLink2Activity2 tTVideoLandingPageLink2Activity2 = tTVideoLandingPageLink2Activity5.IAuthTabCallbackStub.get();
        tTVideoLandingPageLink2Activity2.onExtraCallback(tTWebsiteActivity9.IAuthTabCallback());
        return tTVideoLandingPageLink2Activity2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TTVideoLandingPageLink2Activity2 IAuthTabCallback(PAGMediaView pAGMediaView) throws IOException {
        PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallbackOnExtraCallback = pAGMediaView.onExtraCallback();
        return new TTVideoLandingPageLink2Activity2(pAGInterstitialAdInteractionCallbackOnExtraCallback, TTVideoLandingPageLink2Activity12.onExtraCallback(this.IAuthTabCallback, pAGInterstitialAdInteractionCallbackOnExtraCallback));
    }

    public static /* synthetic */ TTVideoLandingPageLink2Activity2 onNavigationEvent(TTVideoLandingPageLink2Activity5 tTVideoLandingPageLink2Activity5, Callable callable) throws Exception {
        callable.call();
        return tTVideoLandingPageLink2Activity5.IAuthTabCallbackStub.get();
    }
}

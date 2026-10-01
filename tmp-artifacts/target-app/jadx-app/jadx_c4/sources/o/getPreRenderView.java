package o;

import im.toss.di.TossTransferModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getPreRenderView implements captureStartValues<r8lambdayAxCciBTrlcy1PZkLupny43YYs> {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    public r8lambdayAxCciBTrlcy1PZkLupny43YYs onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        r8lambdayAxCciBTrlcy1PZkLupny43YYs r8lambdayaxccibtrlcy1pzklupny43yysOnWarmupCompleted = onWarmupCompleted();
        int i4 = onWarmupCompleted + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return r8lambdayaxccibtrlcy1pzklupny43yysOnWarmupCompleted;
    }

    public static r8lambdayAxCciBTrlcy1PZkLupny43YYs onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdayAxCciBTrlcy1PZkLupny43YYs r8lambdayaxccibtrlcy1pzklupny43yys = (r8lambdayAxCciBTrlcy1PZkLupny43YYs) createAnimator.onNavigationEvent(TossTransferModule.onExtraCallback.onWarmupCompleted());
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        return r8lambdayaxccibtrlcy1pzklupny43yys;
    }
}

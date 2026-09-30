package o;

import im.toss.features.loan.refinancing.funnel.input.LoanRefinancingScrapingHandleActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getClientType implements setSize<LoanRefinancingScrapingHandleActivity> {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static void onNavigationEvent(LoanRefinancingScrapingHandleActivity loanRefinancingScrapingHandleActivity, zzag zzagVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingScrapingHandleActivity.tossClock = zzagVar;
        int i4 = onNavigationEvent + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}

package im.toss.features.loan.calculator;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;
import o.adaptAppModel;
import o.getMaxSupportedFrameRate;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda55 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ adaptAppModel f$0;
    public final /* synthetic */ LoanInterestCalculatorActivity f$1;
    public final /* synthetic */ Locale f$2;
    public final /* synthetic */ getMaxSupportedFrameRate f$3;
    public final /* synthetic */ getMaxSupportedFrameRate f$4;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$5;
    public final /* synthetic */ getMaxSupportedFrameRate f$6;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$7;

    public /* synthetic */ LoanInterestCalculatorActivity$$ExternalSyntheticLambda55(adaptAppModel adaptappmodel, LoanInterestCalculatorActivity loanInterestCalculatorActivity, Locale locale, getMaxSupportedFrameRate getmaxsupportedframerate, getMaxSupportedFrameRate getmaxsupportedframerate2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getMaxSupportedFrameRate getmaxsupportedframerate3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        this.f$0 = adaptappmodel;
        this.f$1 = loanInterestCalculatorActivity;
        this.f$2 = locale;
        this.f$3 = getmaxsupportedframerate;
        this.f$4 = getmaxsupportedframerate2;
        this.f$5 = getsupportedhighspeedresolutionsfor;
        this.f$6 = getmaxsupportedframerate3;
        this.f$7 = getsupportedhighspeedresolutionsfor2;
    }

    public final Object invoke(Object obj) {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        adaptAppModel adaptappmodel = this.f$0;
        LoanInterestCalculatorActivity loanInterestCalculatorActivity = this.f$1;
        if (i3 == 0) {
            unitIAuthTabCallback = LoanInterestCalculatorActivity.IAuthTabCallback(adaptappmodel, loanInterestCalculatorActivity, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj);
            int i4 = 27 / 0;
        } else {
            unitIAuthTabCallback = LoanInterestCalculatorActivity.IAuthTabCallback(adaptappmodel, loanInterestCalculatorActivity, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj);
        }
        int i5 = IAuthTabCallback + 7;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return unitIAuthTabCallback;
    }
}

package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setEmbedType implements captureStartValues<getQuestionnaireOptSwitch> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final createAnimators<g1> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getQuestionnaireOptSwitch getquestionnaireoptswitchOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return getquestionnaireoptswitchOnExtraCallback;
        }
        throw null;
    }

    public getQuestionnaireOptSwitch onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback((g1) this.onWarmupCompleted.get());
            throw null;
        }
        getQuestionnaireOptSwitch getquestionnaireoptswitchOnExtraCallback = onExtraCallback((g1) this.onWarmupCompleted.get());
        int i3 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return getquestionnaireoptswitchOnExtraCallback;
    }

    public static getQuestionnaireOptSwitch onExtraCallback(g1 g1Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getQuestionnaireOptSwitch getquestionnaireoptswitchIAuthTabCallbackDefault = TossApiServiceModule.IAuthTabCallback.IAuthTabCallbackDefault(g1Var);
        if (i3 == 0) {
            return (getQuestionnaireOptSwitch) createAnimator.onNavigationEvent(getquestionnaireoptswitchIAuthTabCallbackDefault);
        }
        int i4 = 79 / 0;
        return (getQuestionnaireOptSwitch) createAnimator.onNavigationEvent(getquestionnaireoptswitchIAuthTabCallbackDefault);
    }
}

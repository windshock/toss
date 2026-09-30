package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ycx8 {
    private final dv12<?>[] onNavigationEvent = new dv12[256];
    private final setClosedListenerKey onWarmupCompleted;

    public ycx8(setClosedListenerKey setclosedlistenerkey, dv18 dv18Var) {
        this.onWarmupCompleted = (setClosedListenerKey) pmi10.onExtraCallbackWithResult("bsonTypeClassMap", setclosedlistenerkey);
        pmi10.onExtraCallbackWithResult("codecRegistry", dv18Var);
        for (t_ t_Var : setclosedlistenerkey.onWarmupCompleted()) {
            Class<?> clsOnExtraCallback = setclosedlistenerkey.onExtraCallback(t_Var);
            if (clsOnExtraCallback != null) {
                try {
                    this.onNavigationEvent[t_Var.getValue()] = dv18Var.onNavigationEvent(clsOnExtraCallback);
                } catch (dv3 unused) {
                }
            }
        }
    }

    public dv12<?> onWarmupCompleted(t_ t_Var) {
        dv12<?> dv12Var = this.onNavigationEvent[t_Var.getValue()];
        if (dv12Var != null) {
            return dv12Var;
        }
        Class<?> clsOnExtraCallback = this.onWarmupCompleted.onExtraCallback(t_Var);
        if (clsOnExtraCallback == null) {
            throw new dv3(String.format("No class mapped for BSON type %s.", t_Var));
        }
        throw new dv3(String.format("Can't find a codec for %s.", clsOnExtraCallback));
    }
}

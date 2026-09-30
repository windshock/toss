package o;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class pmi5 implements dv14<getButtonTextForNewStyleBar> {
    private static final dv18 onWarmupCompleted = dv2.onWarmupCompleted(new dv11());
    private final dv18 IAuthTabCallback;
    private final ycx8 onExtraCallbackWithResult;

    public pmi5() {
        this(onWarmupCompleted);
    }

    public pmi5(dv18 dv18Var) {
        if (dv18Var == null) {
            throw new IllegalArgumentException("Codec registry can not be null");
        }
        this.IAuthTabCallback = dv18Var;
        this.onExtraCallbackWithResult = new ycx8(dv11.IAuthTabCallback(), dv18Var);
    }

    @Override // o.dv16
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public getButtonTextForNewStyleBar onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        ArrayList arrayList = new ArrayList();
        htfycxVar.warmup();
        while (htfycxVar.ICustomTabsCallbackStub() != t_.END_OF_DOCUMENT) {
            arrayList.add(new ea3(htfycxVar.requestPostMessageChannelWithExtras(), onExtraCallback(htfycxVar, dv17Var)));
        }
        htfycxVar.extraCommand();
        return new getButtonTextForNewStyleBar(arrayList);
    }

    protected jc2 onExtraCallback(htfycx htfycxVar, dv17 dv17Var) {
        return (jc2) this.onExtraCallbackWithResult.onWarmupCompleted(htfycxVar.onActivityLayout()).onNavigationEvent(htfycxVar, dv17Var);
    }

    @Override // o.dv13
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, getButtonTextForNewStyleBar getbuttontextfornewstylebar, dv15 dv15Var) {
        jc3Var.onActivityLayout();
        onNavigationEvent(jc3Var, dv15Var, getbuttontextfornewstylebar);
        for (Map.Entry<String, jc2> entry : getbuttontextfornewstylebar.entrySet()) {
            if (!onExtraCallback(dv15Var, entry.getKey())) {
                jc3Var.onTransact(entry.getKey());
                onWarmupCompleted(jc3Var, dv15Var, entry.getValue());
            }
        }
        jc3Var.readTypedObject();
    }

    private void onNavigationEvent(jc3 jc3Var, dv15 dv15Var, getButtonTextForNewStyleBar getbuttontextfornewstylebar) {
        if (dv15Var.onWarmupCompleted() && getbuttontextfornewstylebar.containsKey("_id")) {
            jc3Var.onTransact("_id");
            onWarmupCompleted(jc3Var, dv15Var, getbuttontextfornewstylebar.get("_id"));
        }
    }

    private boolean onExtraCallback(dv15 dv15Var, String str) {
        return dv15Var.onWarmupCompleted() && str.equals("_id");
    }

    private void onWarmupCompleted(jc3 jc3Var, dv15 dv15Var, jc2 jc2Var) {
        dv15Var.onNavigationEvent(this.IAuthTabCallback.onNavigationEvent(jc2Var.getClass()), jc3Var, jc2Var);
    }

    @Override // o.dv13
    public Class<getButtonTextForNewStyleBar> onNavigationEvent() {
        return getButtonTextForNewStyleBar.class;
    }
}

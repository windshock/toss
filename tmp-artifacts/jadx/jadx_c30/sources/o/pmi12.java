package o;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class pmi12 implements dv12<initViewsDefault> {
    private static final dv18 onExtraCallbackWithResult = dv2.onWarmupCompleted(new dv11());
    private final dv18 IAuthTabCallback;

    public pmi12() {
        this(onExtraCallbackWithResult);
    }

    public pmi12(dv18 dv18Var) {
        this.IAuthTabCallback = (dv18) pmi10.onExtraCallbackWithResult("codecRegistry", dv18Var);
    }

    @Override // o.dv16
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public initViewsDefault onNavigationEvent(htfycx htfycxVar, dv17 dv17Var) {
        htfycxVar.prefetchWithMultipleUrls();
        ArrayList arrayList = new ArrayList();
        while (htfycxVar.ICustomTabsCallbackStub() != t_.END_OF_DOCUMENT) {
            arrayList.add(onExtraCallback(htfycxVar, dv17Var));
        }
        htfycxVar.ICustomTabsService();
        return new initViewsDefault(arrayList);
    }

    @Override // o.dv13
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(jc3 jc3Var, initViewsDefault initviewsdefault, dv15 dv15Var) {
        jc3Var.extraCallback();
        Iterator<jc2> it = initviewsdefault.iterator();
        while (it.hasNext()) {
            jc2 next = it.next();
            dv15Var.onNavigationEvent(this.IAuthTabCallback.onNavigationEvent(next.getClass()), jc3Var, next);
        }
        jc3Var.access000();
    }

    @Override // o.dv13
    public Class<initViewsDefault> onNavigationEvent() {
        return initViewsDefault.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected jc2 onExtraCallback(htfycx htfycxVar, dv17 dv17Var) {
        return (jc2) this.IAuthTabCallback.onNavigationEvent(dv11.onExtraCallback(htfycxVar.onActivityLayout())).onNavigationEvent(htfycxVar, dv17Var);
    }
}

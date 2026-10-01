package im.toss.extensions;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.getPreRenderJob;
import o.onRenderReady;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FragmentsKt$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ TextLinkScopeExternalSyntheticLambda7 f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ FragmentsKt$$ExternalSyntheticLambda0(Function1 function1, boolean z, TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, String str) {
        this.f$0 = function1;
        this.f$1 = z;
        this.f$2 = textLinkScopeExternalSyntheticLambda7;
        this.f$3 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Function1 function1 = this.f$0;
        boolean z = this.f$1;
        Object[] objArr = {function1, Boolean.valueOf(z), this.f$2, this.f$3, obj};
        Unit unit = (Unit) onRenderReady.onWarmupCompleted(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1885204005, 1885204006, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i4 = IAuthTabCallback + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}

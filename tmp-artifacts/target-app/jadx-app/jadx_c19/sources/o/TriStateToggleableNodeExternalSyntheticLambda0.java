package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ToggleableNodeExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TriStateToggleableNodeExternalSyntheticLambda0 extends RulerAlignmentKtExternalSyntheticLambda4 {
    private int onExtraCallback;
    private int onExtraCallbackWithResult;
    private RulerAlignmentKtExternalSyntheticLambda5 onWarmupCompleted;

    public TriStateToggleableNodeExternalSyntheticLambda0() {
        super(0, false, 3, (DefaultConstructorMarker) null);
        this.onWarmupCompleted = RulerAlignmentKtExternalSyntheticLambda5.Companion;
        ToggleableNodeExternalSyntheticLambda1.onNavigationEvent onnavigationevent = ToggleableNodeExternalSyntheticLambda1.Companion;
        this.onExtraCallbackWithResult = onnavigationevent.asBinder();
        this.onExtraCallback = onnavigationevent.IAuthTabCallbackDefault();
    }

    public void IAuthTabCallback(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5) {
        this.onWarmupCompleted = rulerAlignmentKtExternalSyntheticLambda5;
    }

    public RulerAlignmentKtExternalSyntheticLambda5 onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public final int asInterface() {
        return this.onExtraCallbackWithResult;
    }

    public final void onWarmupCompleted(int i2) {
        this.onExtraCallbackWithResult = i2;
    }

    public final void IAuthTabCallback(int i2) {
        this.onExtraCallback = i2;
    }

    public final int onExtraCallback() {
        return this.onExtraCallback;
    }

    public RulerAlignmentKtExternalSyntheticLambda1 onNavigationEvent() {
        TriStateToggleableNodeExternalSyntheticLambda0 triStateToggleableNodeExternalSyntheticLambda0 = new TriStateToggleableNodeExternalSyntheticLambda0();
        triStateToggleableNodeExternalSyntheticLambda0.IAuthTabCallback(onExtraCallbackWithResult());
        triStateToggleableNodeExternalSyntheticLambda0.onExtraCallbackWithResult = this.onExtraCallbackWithResult;
        triStateToggleableNodeExternalSyntheticLambda0.onExtraCallback = this.onExtraCallback;
        List listIAuthTabCallback = triStateToggleableNodeExternalSyntheticLambda0.IAuthTabCallback();
        List listIAuthTabCallback2 = IAuthTabCallback();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallback2, 10));
        Iterator it = listIAuthTabCallback2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RulerAlignmentKtExternalSyntheticLambda1) it.next()).onNavigationEvent());
        }
        listIAuthTabCallback.addAll(arrayList);
        return triStateToggleableNodeExternalSyntheticLambda0;
    }

    public String toString() {
        return "EmittableColumn(modifier=" + onExtraCallbackWithResult() + ", verticalAlignment=" + ((Object) ToggleableNodeExternalSyntheticLambda1.IAuthTabCallback.onWarmupCompleted(this.onExtraCallbackWithResult)) + ", horizontalAlignment=" + ((Object) ToggleableNodeExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback(this.onExtraCallback)) + ", children=[\n" + onWarmupCompleted() + "\n])";
    }
}

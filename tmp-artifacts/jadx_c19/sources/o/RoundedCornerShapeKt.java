package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RoundedCornerShapeKt extends RulerAlignmentKtExternalSyntheticLambda4 {
    private ToggleableNodeExternalSyntheticLambda1 IAuthTabCallback;
    private RulerAlignmentKtExternalSyntheticLambda5 onExtraCallbackWithResult;

    public RoundedCornerShapeKt() {
        super(0, false, 3, (DefaultConstructorMarker) null);
        this.onExtraCallbackWithResult = RulerAlignmentKtExternalSyntheticLambda5.Companion;
        this.IAuthTabCallback = ToggleableNodeExternalSyntheticLambda1.Companion.asInterface();
    }

    public void IAuthTabCallback(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5) {
        this.onExtraCallbackWithResult = rulerAlignmentKtExternalSyntheticLambda5;
    }

    public RulerAlignmentKtExternalSyntheticLambda5 onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public final ToggleableNodeExternalSyntheticLambda1 onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public final void onWarmupCompleted(@NotNull ToggleableNodeExternalSyntheticLambda1 toggleableNodeExternalSyntheticLambda1) {
        this.IAuthTabCallback = toggleableNodeExternalSyntheticLambda1;
    }

    public RulerAlignmentKtExternalSyntheticLambda1 onNavigationEvent() {
        RoundedCornerShapeKt roundedCornerShapeKt = new RoundedCornerShapeKt();
        roundedCornerShapeKt.IAuthTabCallback(onExtraCallbackWithResult());
        roundedCornerShapeKt.IAuthTabCallback = this.IAuthTabCallback;
        List listIAuthTabCallback = roundedCornerShapeKt.IAuthTabCallback();
        List listIAuthTabCallback2 = IAuthTabCallback();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallback2, 10));
        Iterator it = listIAuthTabCallback2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RulerAlignmentKtExternalSyntheticLambda1) it.next()).onNavigationEvent());
        }
        listIAuthTabCallback.addAll(arrayList);
        return roundedCornerShapeKt;
    }

    public String toString() {
        return "EmittableBox(modifier=" + onExtraCallbackWithResult() + ", contentAlignment=" + this.IAuthTabCallback + "children=[\n" + onWarmupCompleted() + "\n])";
    }
}

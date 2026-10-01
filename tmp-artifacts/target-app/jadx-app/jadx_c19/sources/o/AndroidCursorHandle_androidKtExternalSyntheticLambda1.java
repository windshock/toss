package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ToggleableNodeExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidCursorHandle_androidKtExternalSyntheticLambda1 extends RulerAlignmentKtExternalSyntheticLambda4 {
    private int IAuthTabCallback;
    private RulerAlignmentKtExternalSyntheticLambda5 onExtraCallbackWithResult;
    private int onNavigationEvent;

    public AndroidCursorHandle_androidKtExternalSyntheticLambda1() {
        super(0, false, 3, (DefaultConstructorMarker) null);
        this.onExtraCallbackWithResult = RulerAlignmentKtExternalSyntheticLambda5.Companion;
        ToggleableNodeExternalSyntheticLambda1.onNavigationEvent onnavigationevent = ToggleableNodeExternalSyntheticLambda1.Companion;
        this.IAuthTabCallback = onnavigationevent.IAuthTabCallbackDefault();
        this.onNavigationEvent = onnavigationevent.asBinder();
    }

    public void IAuthTabCallback(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5) {
        this.onExtraCallbackWithResult = rulerAlignmentKtExternalSyntheticLambda5;
    }

    public RulerAlignmentKtExternalSyntheticLambda5 onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public final int onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public final void onNavigationEvent(int i2) {
        this.IAuthTabCallback = i2;
    }

    public final void IAuthTabCallback(int i2) {
        this.onNavigationEvent = i2;
    }

    public final int asInterface() {
        return this.onNavigationEvent;
    }

    public RulerAlignmentKtExternalSyntheticLambda1 onNavigationEvent() {
        AndroidCursorHandle_androidKtExternalSyntheticLambda1 androidCursorHandle_androidKtExternalSyntheticLambda1 = new AndroidCursorHandle_androidKtExternalSyntheticLambda1();
        androidCursorHandle_androidKtExternalSyntheticLambda1.IAuthTabCallback(onExtraCallbackWithResult());
        androidCursorHandle_androidKtExternalSyntheticLambda1.IAuthTabCallback = this.IAuthTabCallback;
        androidCursorHandle_androidKtExternalSyntheticLambda1.onNavigationEvent = this.onNavigationEvent;
        List listIAuthTabCallback = androidCursorHandle_androidKtExternalSyntheticLambda1.IAuthTabCallback();
        List listIAuthTabCallback2 = IAuthTabCallback();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallback2, 10));
        Iterator it = listIAuthTabCallback2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RulerAlignmentKtExternalSyntheticLambda1) it.next()).onNavigationEvent());
        }
        listIAuthTabCallback.addAll(arrayList);
        return androidCursorHandle_androidKtExternalSyntheticLambda1;
    }

    public String toString() {
        return "EmittableRow(modifier=" + onExtraCallbackWithResult() + ", horizontalAlignment=" + ((Object) ToggleableNodeExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback(this.IAuthTabCallback)) + ", verticalAlignment=" + ((Object) ToggleableNodeExternalSyntheticLambda1.IAuthTabCallback.onWarmupCompleted(this.onNavigationEvent)) + ", children=[\n" + onWarmupCompleted() + "\n])";
    }
}

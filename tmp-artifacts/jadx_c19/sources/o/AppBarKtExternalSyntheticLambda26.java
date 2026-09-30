package o;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppBarKtExternalSyntheticLambda26 {
    private final Set<Integer> IAuthTabCallback;
    private final onExtraCallbackWithResult onExtraCallback;
    private final ReceiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2 onWarmupCompleted;

    private AppBarKtExternalSyntheticLambda26(Set<Integer> set, ReceiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2 receiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2, onExtraCallbackWithResult onextracallbackwithresult) {
        this.IAuthTabCallback = set;
        this.onWarmupCompleted = receiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2;
        this.onExtraCallback = onextracallbackwithresult;
    }

    public final ReceiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2 onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public final onExtraCallbackWithResult onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final boolean IAuthTabCallback(@NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2) {
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, "");
        Iterator itIAuthTabCallback = ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2.Companion.IAuthTabCallback(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2).IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 = (ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2) itIAuthTabCallback.next();
            if (this.IAuthTabCallback.contains(Integer.valueOf(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7.asInterface())) && (!(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 instanceof ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7) || exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2.asInterface() == ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7.Companion.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7).asInterface())) {
                return true;
            }
        }
        return false;
    }
}

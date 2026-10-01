package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SelectionContainerKtExternalSyntheticLambda4 extends SelectionControllerExternalSyntheticLambda1 {
    private final int IAuthTabCallback;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10[] IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStub;
    private final int[] onExtraCallback;
    private final int[] onExtraCallbackWithResult;
    private final HashMap<Object, Integer> onNavigationEvent;
    private final Object[] onTransact;

    public SelectionContainerKtExternalSyntheticLambda4(Collection<? extends SelectionAdjustmentCompanionExternalSyntheticLambda2> collection, BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) {
        this(onNavigationEvent(collection), onWarmupCompleted(collection), bottomNavigationKtExternalSyntheticLambda7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private SelectionContainerKtExternalSyntheticLambda4(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10[] coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr, Object[] objArr, BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) {
        super(false, bottomNavigationKtExternalSyntheticLambda7);
        int i2 = 0;
        int length = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr.length;
        this.IAuthTabCallbackDefault = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr;
        this.onExtraCallback = new int[length];
        this.onExtraCallbackWithResult = new int[length];
        this.onTransact = objArr;
        this.onNavigationEvent = new HashMap<>();
        int length2 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr.length;
        int iOnExtraCallbackWithResult = 0;
        int iOnWarmupCompleted = 0;
        int i3 = 0;
        while (i2 < length2) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr[i2];
            this.IAuthTabCallbackDefault[i3] = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
            this.onExtraCallbackWithResult[i3] = iOnExtraCallbackWithResult;
            this.onExtraCallback[i3] = iOnWarmupCompleted;
            iOnExtraCallbackWithResult += coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult();
            iOnWarmupCompleted += this.IAuthTabCallbackDefault[i3].onWarmupCompleted();
            this.onNavigationEvent.put(objArr[i3], Integer.valueOf(i3));
            i2++;
            i3++;
        }
        this.IAuthTabCallbackStub = iOnExtraCallbackWithResult;
        this.IAuthTabCallback = iOnWarmupCompleted;
    }

    List<CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10> onNavigationEvent() {
        return Arrays.asList(this.IAuthTabCallbackDefault);
    }

    @Override // o.SelectionControllerExternalSyntheticLambda1
    protected int onWarmupCompleted(int i2) {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(this.onExtraCallback, i2 + 1, false, false);
    }

    @Override // o.SelectionControllerExternalSyntheticLambda1
    protected int onExtraCallbackWithResult(int i2) {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(this.onExtraCallbackWithResult, i2 + 1, false, false);
    }

    @Override // o.SelectionControllerExternalSyntheticLambda1
    protected int onExtraCallback(Object obj) {
        Integer num = this.onNavigationEvent.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // o.SelectionControllerExternalSyntheticLambda1
    protected CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onTransact(int i2) {
        return this.IAuthTabCallbackDefault[i2];
    }

    @Override // o.SelectionControllerExternalSyntheticLambda1
    protected int IAuthTabCallbackStub(int i2) {
        return this.onExtraCallback[i2];
    }

    @Override // o.SelectionControllerExternalSyntheticLambda1
    protected int asBinder(int i2) {
        return this.onExtraCallbackWithResult[i2];
    }

    @Override // o.SelectionControllerExternalSyntheticLambda1
    protected Object onExtraCallback(int i2) {
        return this.onTransact[i2];
    }

    public int onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStub;
    }

    public int onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public SelectionContainerKtExternalSyntheticLambda4 onExtraCallbackWithResult(BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10[] coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10[this.IAuthTabCallbackDefault.length];
        int i2 = 0;
        while (true) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10[] coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr2 = this.IAuthTabCallbackDefault;
            if (i2 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr2.length) {
                coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr[i2] = new BackdropScaffoldStateExternalSyntheticLambda2(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr2[i2]) { // from class: o.SelectionContainerKtExternalSyntheticLambda4.4
                    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback onNavigationEvent = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback();

                    @Override // o.BackdropScaffoldStateExternalSyntheticLambda2
                    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback IAuthTabCallback(int i3, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback, boolean z) {
                        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallbackIAuthTabCallback = super.IAuthTabCallback(i3, onextracallback, z);
                        if (super.IAuthTabCallback(onextracallbackIAuthTabCallback.IAuthTabCallbackStub, this.onNavigationEvent).IAuthTabCallbackStub()) {
                            onextracallbackIAuthTabCallback.onWarmupCompleted(onextracallback.onExtraCallback, onextracallback.asBinder, onextracallback.IAuthTabCallbackStub, onextracallback.IAuthTabCallback, onextracallback.onNavigationEvent, TextContextMenuHelperApi28ExternalSyntheticLambda7.IAuthTabCallback, true);
                            return onextracallbackIAuthTabCallback;
                        }
                        onextracallbackIAuthTabCallback.onWarmupCompleted = true;
                        return onextracallbackIAuthTabCallback;
                    }
                };
                i2++;
            } else {
                return new SelectionContainerKtExternalSyntheticLambda4(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr, this.onTransact, bottomNavigationKtExternalSyntheticLambda7);
            }
        }
    }

    private static Object[] onWarmupCompleted(Collection<? extends SelectionAdjustmentCompanionExternalSyntheticLambda2> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends SelectionAdjustmentCompanionExternalSyntheticLambda2> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            objArr[i2] = it.next().onExtraCallbackWithResult();
            i2++;
        }
        return objArr;
    }

    private static CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10[] onNavigationEvent(Collection<? extends SelectionAdjustmentCompanionExternalSyntheticLambda2> collection) {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10[] coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10[collection.size()];
        Iterator<? extends SelectionAdjustmentCompanionExternalSyntheticLambda2> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr[i2] = it.next().onWarmupCompleted();
            i2++;
        }
        return coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr;
    }
}

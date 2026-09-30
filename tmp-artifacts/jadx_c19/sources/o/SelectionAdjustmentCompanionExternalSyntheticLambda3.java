package o;

import android.util.Pair;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import o.AndroidSelectionHandles_androidKtExternalSyntheticLambda8;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.SelectionAdjustmentKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionAdjustmentCompanionExternalSyntheticLambda3 {
    private final SelectionContainerKtExternalSyntheticLambda8 IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private SelectionAdjustmentKtExternalSyntheticLambda1 IAuthTabCallbackStub;
    private SelectionAdjustmentKtExternalSyntheticLambda1 IAuthTabCallbackStubProxy;
    private AndroidSelectionHandles_androidKtExternalSyntheticLambda8.onWarmupCompleted IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private SelectionAdjustmentKtExternalSyntheticLambda1 access000;
    private SelectionAdjustmentKtExternalSyntheticLambda1 access100;
    private long asInterface;
    private final SelectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallback onExtraCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda16 onExtraCallbackWithResult;
    private SelectionAdjustmentKtExternalSyntheticLambda1 onNavigationEvent;
    private Object onTransact;
    private int onWarmupCompleted;
    private int writeTypedObject;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback asBinder = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback();
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback extraCallback = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback();
    private List<SelectionAdjustmentKtExternalSyntheticLambda1> getInterfaceDescriptor = new ArrayList();

    static boolean onWarmupCompleted(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    public SelectionAdjustmentCompanionExternalSyntheticLambda3(SelectionContainerKtExternalSyntheticLambda8 selectionContainerKtExternalSyntheticLambda8, TextFieldDecoratorModifierNodeExternalSyntheticLambda16 textFieldDecoratorModifierNodeExternalSyntheticLambda16, SelectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallback, AndroidSelectionHandles_androidKtExternalSyntheticLambda8.onWarmupCompleted onwarmupcompleted) {
        this.IAuthTabCallback = selectionContainerKtExternalSyntheticLambda8;
        this.onExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda16;
        this.onExtraCallback = iAuthTabCallback;
        this.IAuthTabCallback_Parcel = onwarmupcompleted;
    }

    public int onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, int i2) {
        this.writeTypedObject = i2;
        return onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
    }

    public int onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, boolean z) {
        this.ICustomTabsCallback = z;
        return onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
    }

    public void onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, AndroidSelectionHandles_androidKtExternalSyntheticLambda8.onWarmupCompleted onwarmupcompleted) {
        this.IAuthTabCallback_Parcel = onwarmupcompleted;
        onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
    }

    public boolean IAuthTabCallback(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = this.onNavigationEvent;
        return selectionAdjustmentKtExternalSyntheticLambda1 != null && selectionAdjustmentKtExternalSyntheticLambda1.onNavigationEvent == bottomDrawerStateCompanionExternalSyntheticLambda1;
    }

    public boolean onWarmupCompleted(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = this.IAuthTabCallbackStubProxy;
        return selectionAdjustmentKtExternalSyntheticLambda1 != null && selectionAdjustmentKtExternalSyntheticLambda1.onNavigationEvent == bottomDrawerStateCompanionExternalSyntheticLambda1;
    }

    public void onExtraCallback(long j) {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = this.onNavigationEvent;
        if (selectionAdjustmentKtExternalSyntheticLambda1 != null) {
            selectionAdjustmentKtExternalSyntheticLambda1.onExtraCallbackWithResult(j);
        }
    }

    public boolean IAuthTabCallbackStubProxy() {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = this.onNavigationEvent;
        if (selectionAdjustmentKtExternalSyntheticLambda1 != null) {
            return !selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult && selectionAdjustmentKtExternalSyntheticLambda1.asInterface() && this.onNavigationEvent.onWarmupCompleted.IAuthTabCallback != -9223372036854775807L && this.onWarmupCompleted < 100;
        }
        return true;
    }

    public SelectionAdjustmentCompanionExternalSyntheticLambda4 onWarmupCompleted(long j, SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11) {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = this.onNavigationEvent;
        if (selectionAdjustmentKtExternalSyntheticLambda1 == null) {
            return onNavigationEvent(selectionContainerKtExternalSyntheticLambda11);
        }
        return onWarmupCompleted(selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback, selectionAdjustmentKtExternalSyntheticLambda1, j);
    }

    public SelectionAdjustmentKtExternalSyntheticLambda1 onExtraCallbackWithResult(SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4) {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = this.onNavigationEvent;
        long jIAuthTabCallback = selectionAdjustmentKtExternalSyntheticLambda1 == null ? 1000000000000L : (selectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallback() + this.onNavigationEvent.onWarmupCompleted.IAuthTabCallback) - selectionAdjustmentCompanionExternalSyntheticLambda4.onTransact;
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback(selectionAdjustmentCompanionExternalSyntheticLambda4);
        if (selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback == null) {
            selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback = this.onExtraCallback.create(selectionAdjustmentCompanionExternalSyntheticLambda4, jIAuthTabCallback);
        } else {
            selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback.onWarmupCompleted = selectionAdjustmentCompanionExternalSyntheticLambda4;
            selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback.onNavigationEvent(jIAuthTabCallback);
        }
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda12 = this.onNavigationEvent;
        if (selectionAdjustmentKtExternalSyntheticLambda12 != null) {
            selectionAdjustmentKtExternalSyntheticLambda12.onExtraCallback(selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback);
        } else {
            this.IAuthTabCallbackStub = selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback;
            this.access100 = selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback;
            this.access000 = selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback;
        }
        this.onTransact = null;
        this.onNavigationEvent = selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback;
        this.onWarmupCompleted++;
        IAuthTabCallback_Parcel();
        return selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback;
    }

    public void onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1;
        if (this.IAuthTabCallback_Parcel.onNavigationEvent == -9223372036854775807L || (selectionAdjustmentKtExternalSyntheticLambda1 = this.onNavigationEvent) == null) {
            getInterfaceDescriptor();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> pairOnWarmupCompleted = onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallback.onExtraCallback, 0L);
        if (pairOnWarmupCompleted != null && !coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(pairOnWarmupCompleted.first, this.asBinder).IAuthTabCallbackStub, this.extraCallback).IAuthTabCallbackStub()) {
            long jOnNavigationEvent = onNavigationEvent(pairOnWarmupCompleted.first);
            if (jOnNavigationEvent == -1) {
                jOnNavigationEvent = this.asInterface;
                this.asInterface = 1 + jOnNavigationEvent;
            }
            SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4OnWarmupCompleted = onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, pairOnWarmupCompleted.first, ((Long) pairOnWarmupCompleted.second).longValue(), jOnNavigationEvent);
            SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback(selectionAdjustmentCompanionExternalSyntheticLambda4OnWarmupCompleted);
            if (selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback == null) {
                selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback = this.onExtraCallback.create(selectionAdjustmentCompanionExternalSyntheticLambda4OnWarmupCompleted, (selectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallback() + selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback) - selectionAdjustmentCompanionExternalSyntheticLambda4OnWarmupCompleted.onTransact);
            }
            arrayList.add(selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallback);
        }
        onNavigationEvent((List<SelectionAdjustmentKtExternalSyntheticLambda1>) arrayList);
    }

    public void getInterfaceDescriptor() {
        if (this.getInterfaceDescriptor.isEmpty()) {
            return;
        }
        onNavigationEvent((List<SelectionAdjustmentKtExternalSyntheticLambda1>) new ArrayList());
    }

    private SelectionAdjustmentKtExternalSyntheticLambda1 IAuthTabCallback(SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4) {
        for (int i2 = 0; i2 < this.getInterfaceDescriptor.size(); i2++) {
            if (this.getInterfaceDescriptor.get(i2).onNavigationEvent(selectionAdjustmentCompanionExternalSyntheticLambda4)) {
                return this.getInterfaceDescriptor.remove(i2);
            }
        }
        return null;
    }

    private void onNavigationEvent(List<SelectionAdjustmentKtExternalSyntheticLambda1> list) {
        for (int i2 = 0; i2 < this.getInterfaceDescriptor.size(); i2++) {
            this.getInterfaceDescriptor.get(i2).access000();
        }
        this.getInterfaceDescriptor = list;
        this.IAuthTabCallbackStubProxy = null;
        IAuthTabCallbackStub();
    }

    private SelectionAdjustmentCompanionExternalSyntheticLambda4 onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, Object obj, long j, long j2) {
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, obj, j, j2, this.extraCallback, this.asBinder);
        if (onextracallbackwithresultOnNavigationEvent.IAuthTabCallback()) {
            return onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresultOnNavigationEvent.onExtraCallback, onextracallbackwithresultOnNavigationEvent.onWarmupCompleted, onextracallbackwithresultOnNavigationEvent.IAuthTabCallback, j, onextracallbackwithresultOnNavigationEvent.onNavigationEvent, false);
        }
        return onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresultOnNavigationEvent.onExtraCallback, j, -9223372036854775807L, onextracallbackwithresultOnNavigationEvent.onNavigationEvent, false);
    }

    private Pair<Object, Long> onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, Object obj, long j) {
        int iOnNavigationEvent = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(obj, this.asBinder).IAuthTabCallbackStub, this.writeTypedObject, this.ICustomTabsCallback);
        if (iOnNavigationEvent != -1) {
            return coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted(this.extraCallback, this.asBinder, iOnNavigationEvent, -9223372036854775807L, j);
        }
        return null;
    }

    public SelectionAdjustmentKtExternalSyntheticLambda1 onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public SelectionAdjustmentKtExternalSyntheticLambda1 onTransact() {
        return this.IAuthTabCallbackStubProxy;
    }

    public SelectionAdjustmentKtExternalSyntheticLambda1 asBinder() {
        return this.IAuthTabCallbackStub;
    }

    public SelectionAdjustmentKtExternalSyntheticLambda1 asInterface() {
        return this.access100;
    }

    public SelectionAdjustmentKtExternalSyntheticLambda1 IAuthTabCallbackDefault() {
        return this.access000;
    }

    public SelectionAdjustmentKtExternalSyntheticLambda1 onExtraCallback() {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = this.access000;
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda12 = this.access100;
        if (selectionAdjustmentKtExternalSyntheticLambda1 == selectionAdjustmentKtExternalSyntheticLambda12) {
            this.access000 = ((SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onWarmupCompleted(selectionAdjustmentKtExternalSyntheticLambda12)).onExtraCallbackWithResult();
        }
        this.access100 = ((SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onWarmupCompleted(this.access100)).onExtraCallbackWithResult();
        IAuthTabCallback_Parcel();
        return (SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onWarmupCompleted(this.access100);
    }

    public SelectionAdjustmentKtExternalSyntheticLambda1 onWarmupCompleted() {
        this.access000 = ((SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onWarmupCompleted(this.access000)).onExtraCallbackWithResult();
        IAuthTabCallback_Parcel();
        return (SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onWarmupCompleted(this.access000);
    }

    public SelectionAdjustmentKtExternalSyntheticLambda1 IAuthTabCallback() {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = this.IAuthTabCallbackStub;
        if (selectionAdjustmentKtExternalSyntheticLambda1 == null) {
            return null;
        }
        if (selectionAdjustmentKtExternalSyntheticLambda1 == this.access100) {
            this.access100 = selectionAdjustmentKtExternalSyntheticLambda1.onExtraCallbackWithResult();
        }
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda12 = this.IAuthTabCallbackStub;
        if (selectionAdjustmentKtExternalSyntheticLambda12 == this.access000) {
            this.access000 = selectionAdjustmentKtExternalSyntheticLambda12.onExtraCallbackWithResult();
        }
        this.IAuthTabCallbackStub.access000();
        int i2 = this.onWarmupCompleted - 1;
        this.onWarmupCompleted = i2;
        if (i2 == 0) {
            this.onNavigationEvent = null;
            SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda13 = this.IAuthTabCallbackStub;
            this.onTransact = selectionAdjustmentKtExternalSyntheticLambda13.IAuthTabCallbackStub;
            this.IAuthTabCallbackDefault = selectionAdjustmentKtExternalSyntheticLambda13.onWarmupCompleted.onExtraCallback.onNavigationEvent;
        }
        this.IAuthTabCallbackStub = this.IAuthTabCallbackStub.onExtraCallbackWithResult();
        IAuthTabCallback_Parcel();
        return this.IAuthTabCallbackStub;
    }

    public int IAuthTabCallback(SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) {
        RecordingInputConnection_androidKt.onWarmupCompleted(selectionAdjustmentKtExternalSyntheticLambda1);
        int i2 = 0;
        if (selectionAdjustmentKtExternalSyntheticLambda1.equals(this.onNavigationEvent)) {
            return 0;
        }
        this.onNavigationEvent = selectionAdjustmentKtExternalSyntheticLambda1;
        while (selectionAdjustmentKtExternalSyntheticLambda1.onExtraCallbackWithResult() != null) {
            selectionAdjustmentKtExternalSyntheticLambda1 = (SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionAdjustmentKtExternalSyntheticLambda1.onExtraCallbackWithResult());
            if (selectionAdjustmentKtExternalSyntheticLambda1 == this.access100) {
                SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda12 = this.IAuthTabCallbackStub;
                this.access100 = selectionAdjustmentKtExternalSyntheticLambda12;
                this.access000 = selectionAdjustmentKtExternalSyntheticLambda12;
                i2 = 3;
            }
            if (selectionAdjustmentKtExternalSyntheticLambda1 == this.access000) {
                this.access000 = this.access100;
                i2 |= 2;
            }
            selectionAdjustmentKtExternalSyntheticLambda1.access000();
            this.onWarmupCompleted--;
        }
        ((SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)).onExtraCallback((SelectionAdjustmentKtExternalSyntheticLambda1) null);
        IAuthTabCallback_Parcel();
        return i2;
    }

    public void IAuthTabCallbackStub() {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = this.IAuthTabCallbackStubProxy;
        if (selectionAdjustmentKtExternalSyntheticLambda1 == null || selectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallbackDefault()) {
            this.IAuthTabCallbackStubProxy = null;
            for (int i2 = 0; i2 < this.getInterfaceDescriptor.size(); i2++) {
                SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda12 = this.getInterfaceDescriptor.get(i2);
                if (!selectionAdjustmentKtExternalSyntheticLambda12.IAuthTabCallbackDefault()) {
                    this.IAuthTabCallbackStubProxy = selectionAdjustmentKtExternalSyntheticLambda12;
                    return;
                }
            }
        }
    }

    public SelectionAdjustmentKtExternalSyntheticLambda1 onExtraCallbackWithResult(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        for (int i2 = 0; i2 < this.getInterfaceDescriptor.size(); i2++) {
            SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = this.getInterfaceDescriptor.get(i2);
            if (selectionAdjustmentKtExternalSyntheticLambda1.onNavigationEvent == bottomDrawerStateCompanionExternalSyntheticLambda1) {
                return selectionAdjustmentKtExternalSyntheticLambda1;
            }
        }
        return null;
    }

    public void onNavigationEvent() {
        if (this.onWarmupCompleted == 0) {
            return;
        }
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = (SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackStub);
        this.onTransact = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.IAuthTabCallbackStub;
        this.IAuthTabCallbackDefault = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.onExtraCallback.onNavigationEvent;
        while (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult != null) {
            selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.access000();
            selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallbackWithResult();
        }
        this.IAuthTabCallbackStub = null;
        this.onNavigationEvent = null;
        this.access100 = null;
        this.access000 = null;
        this.onWarmupCompleted = 0;
        IAuthTabCallback_Parcel();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ad, code lost:
    
        return IAuthTabCallback(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, long j, long j2, long j3) {
        SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4IAuthTabCallback;
        boolean z;
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = this.IAuthTabCallbackStub;
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = null;
        while (true) {
            int i2 = 0;
            if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult == null) {
                return 0;
            }
            SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4 = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted;
            if (selectionAdjustmentKtExternalSyntheticLambda1 == null) {
                selectionAdjustmentCompanionExternalSyntheticLambda4IAuthTabCallback = IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, selectionAdjustmentCompanionExternalSyntheticLambda4);
            } else {
                SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4OnWarmupCompleted = onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, selectionAdjustmentKtExternalSyntheticLambda1, j);
                if (selectionAdjustmentCompanionExternalSyntheticLambda4OnWarmupCompleted == null || !onExtraCallback(selectionAdjustmentCompanionExternalSyntheticLambda4, selectionAdjustmentCompanionExternalSyntheticLambda4OnWarmupCompleted)) {
                    break;
                }
                selectionAdjustmentCompanionExternalSyntheticLambda4IAuthTabCallback = selectionAdjustmentCompanionExternalSyntheticLambda4OnWarmupCompleted;
            }
            selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted = selectionAdjustmentCompanionExternalSyntheticLambda4IAuthTabCallback.onNavigationEvent(selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackStub);
            if (selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallback != selectionAdjustmentCompanionExternalSyntheticLambda4IAuthTabCallback.IAuthTabCallback) {
                selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.IAuthTabCallbackStubProxy();
                long j4 = selectionAdjustmentCompanionExternalSyntheticLambda4IAuthTabCallback.IAuthTabCallback;
                long jOnExtraCallback = j4 == -9223372036854775807L ? Long.MAX_VALUE : selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallback(j4);
                boolean z2 = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult == this.access100 && !selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.onNavigationEvent && (j2 == Long.MIN_VALUE || j2 >= jOnExtraCallback);
                boolean z3 = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult == this.access000 && (j3 == Long.MIN_VALUE || j3 >= jOnExtraCallback);
                int iIAuthTabCallback = IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult);
                if (iIAuthTabCallback != 0) {
                    return iIAuthTabCallback;
                }
                long j5 = selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallback;
                if (j5 == -9223372036854775807L && selectionAdjustmentCompanionExternalSyntheticLambda4.onWarmupCompleted == Long.MIN_VALUE) {
                    long j6 = selectionAdjustmentCompanionExternalSyntheticLambda4IAuthTabCallback.onWarmupCompleted;
                    if (j6 != -9223372036854775807L && j6 != Long.MIN_VALUE) {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (z2 && (j5 != -9223372036854775807L || z)) {
                    i2 = 1;
                }
                return z3 ? i2 | 2 : i2;
            }
            selectionAdjustmentKtExternalSyntheticLambda1 = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult;
            selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallbackWithResult();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SelectionAdjustmentCompanionExternalSyntheticLambda4 IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4) {
        long jOnNavigationEvent;
        long j;
        boolean zIAuthTabCallbackDefault;
        int i2;
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = selectionAdjustmentCompanionExternalSyntheticLambda4.onExtraCallback;
        boolean zOnNavigationEvent = onNavigationEvent(onextracallbackwithresult);
        boolean zOnWarmupCompleted = onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult);
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult, zOnNavigationEvent);
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(selectionAdjustmentCompanionExternalSyntheticLambda4.onExtraCallback.onExtraCallback, this.asBinder);
        long jOnNavigationEvent2 = (onextracallbackwithresult.IAuthTabCallback() || (i2 = onextracallbackwithresult.onExtraCallbackWithResult) == -1) ? -9223372036854775807L : this.asBinder.onNavigationEvent(i2);
        if (onextracallbackwithresult.IAuthTabCallback()) {
            jOnNavigationEvent = this.asBinder.onWarmupCompleted(onextracallbackwithresult.onWarmupCompleted, onextracallbackwithresult.IAuthTabCallback);
        } else if (jOnNavigationEvent2 == -9223372036854775807L || jOnNavigationEvent2 == Long.MIN_VALUE) {
            jOnNavigationEvent = this.asBinder.onNavigationEvent();
        } else {
            j = jOnNavigationEvent2;
            if (!onextracallbackwithresult.IAuthTabCallback()) {
                zIAuthTabCallbackDefault = this.asBinder.IAuthTabCallbackDefault(onextracallbackwithresult.onWarmupCompleted);
            } else {
                int i3 = onextracallbackwithresult.onExtraCallbackWithResult;
                zIAuthTabCallbackDefault = i3 != -1 && this.asBinder.IAuthTabCallbackDefault(i3);
            }
            return new SelectionAdjustmentCompanionExternalSyntheticLambda4(onextracallbackwithresult, selectionAdjustmentCompanionExternalSyntheticLambda4.onTransact, selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackStub, jOnNavigationEvent2, j, selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackDefault, zIAuthTabCallbackDefault, zOnNavigationEvent, zOnWarmupCompleted, zOnExtraCallbackWithResult);
        }
        j = jOnNavigationEvent;
        if (!onextracallbackwithresult.IAuthTabCallback()) {
        }
        return new SelectionAdjustmentCompanionExternalSyntheticLambda4(onextracallbackwithresult, selectionAdjustmentCompanionExternalSyntheticLambda4.onTransact, selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackStub, jOnNavigationEvent2, j, selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackDefault, zIAuthTabCallbackDefault, zOnNavigationEvent, zOnWarmupCompleted, zOnExtraCallbackWithResult);
    }

    private static BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, Object obj, long j, long j2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback) {
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(obj, onextracallback);
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(onextracallback.IAuthTabCallbackStub, iAuthTabCallback);
        Object objOnExtraCallbackWithResult = obj;
        for (int iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(obj); onExtraCallbackWithResult(onextracallback) && iIAuthTabCallback <= iAuthTabCallback.asBinder; iIAuthTabCallback++) {
            coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(iIAuthTabCallback, onextracallback, true);
            objOnExtraCallbackWithResult = RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback.asBinder);
        }
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(objOnExtraCallbackWithResult, onextracallback);
        int iOnExtraCallback = onextracallback.onExtraCallback(j);
        if (iOnExtraCallback == -1) {
            return new BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult(objOnExtraCallbackWithResult, j2, onextracallback.IAuthTabCallback(j));
        }
        return new BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult(objOnExtraCallbackWithResult, iOnExtraCallback, onextracallback.onWarmupCompleted(iOnExtraCallback), j2);
    }

    private static boolean onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback) {
        int iOnExtraCallback = onextracallback.onExtraCallback();
        if (iOnExtraCallback != 0 && ((iOnExtraCallback != 1 || !onextracallback.onTransact(0)) && onextracallback.IAuthTabCallbackDefault(onextracallback.asInterface()))) {
            long jOnExtraCallbackWithResult = 0;
            if (onextracallback.onExtraCallback(0L) == -1) {
                if (onextracallback.IAuthTabCallback == 0) {
                    return true;
                }
                int i2 = onextracallback.onTransact(iOnExtraCallback + (-1)) ? 2 : 1;
                for (int i3 = 0; i3 <= iOnExtraCallback - i2; i3++) {
                    jOnExtraCallbackWithResult += onextracallback.onExtraCallbackWithResult(i3);
                }
                if (onextracallback.IAuthTabCallback <= jOnExtraCallbackWithResult) {
                    return true;
                }
            }
        }
        return false;
    }

    public BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, Object obj, long j) {
        long jOnNavigationEvent = onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, obj);
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(obj, this.asBinder);
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(this.asBinder.IAuthTabCallbackStub, this.extraCallback);
        boolean z = false;
        for (int iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(obj); iIAuthTabCallback >= this.extraCallback.IAuthTabCallback; iIAuthTabCallback--) {
            coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(iIAuthTabCallback, this.asBinder, true);
            boolean z2 = this.asBinder.onExtraCallback() > 0;
            z |= z2;
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback = this.asBinder;
            if (onextracallback.onExtraCallback(onextracallback.IAuthTabCallback) != -1) {
                obj = RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.asBinder.asBinder);
            }
            if (z && (!z2 || this.asBinder.IAuthTabCallback != 0)) {
                break;
            }
        }
        return onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, obj, j, jOnNavigationEvent, this.extraCallback, this.asBinder);
    }

    private void IAuthTabCallback_Parcel() {
        final ImmutableList.Builder builder = ImmutableList.builder();
        for (SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = this.IAuthTabCallbackStub; selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult != null; selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallbackWithResult()) {
            builder.add(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.onExtraCallback);
        }
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = this.access100;
        final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = selectionAdjustmentKtExternalSyntheticLambda1 == null ? null : selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallback;
        this.onExtraCallbackWithResult.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.MediaPeriodQueue$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.IAuthTabCallback.onExtraCallback((List<BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult>) builder.build(), onextracallbackwithresult);
            }
        });
    }

    private long onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, Object obj) {
        int iIAuthTabCallback;
        int i2 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(obj, this.asBinder).IAuthTabCallbackStub;
        Object obj2 = this.onTransact;
        if (obj2 != null && (iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(obj2)) != -1 && coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(iIAuthTabCallback, this.asBinder).IAuthTabCallbackStub == i2) {
            return this.IAuthTabCallbackDefault;
        }
        for (SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = this.IAuthTabCallbackStub; selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult != null; selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallbackWithResult()) {
            if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.IAuthTabCallbackStub.equals(obj)) {
                return selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.onExtraCallback.onNavigationEvent;
            }
        }
        for (SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult2 = this.IAuthTabCallbackStub; selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult2 != null; selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult2 = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult2.onExtraCallbackWithResult()) {
            int iIAuthTabCallback2 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult2.IAuthTabCallbackStub);
            if (iIAuthTabCallback2 != -1 && coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(iIAuthTabCallback2, this.asBinder).IAuthTabCallbackStub == i2) {
                return selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult2.onWarmupCompleted.onExtraCallback.onNavigationEvent;
            }
        }
        long jOnNavigationEvent = onNavigationEvent(obj);
        if (jOnNavigationEvent != -1) {
            return jOnNavigationEvent;
        }
        long j = this.asInterface;
        this.asInterface = 1 + j;
        if (this.IAuthTabCallbackStub == null) {
            this.onTransact = obj;
            this.IAuthTabCallbackDefault = j;
        }
        return j;
    }

    private long onNavigationEvent(Object obj) {
        for (int i2 = 0; i2 < this.getInterfaceDescriptor.size(); i2++) {
            SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = this.getInterfaceDescriptor.get(i2);
            if (selectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallbackStub.equals(obj)) {
                return selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallback.onNavigationEvent;
            }
        }
        return -1L;
    }

    private boolean onExtraCallback(SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4, SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda42) {
        return selectionAdjustmentCompanionExternalSyntheticLambda4.onTransact == selectionAdjustmentCompanionExternalSyntheticLambda42.onTransact && selectionAdjustmentCompanionExternalSyntheticLambda4.onExtraCallback.equals(selectionAdjustmentCompanionExternalSyntheticLambda42.onExtraCallback);
    }

    private int onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = this.IAuthTabCallbackStub;
        if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult == null) {
            return 0;
        }
        int iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.IAuthTabCallbackStub);
        while (true) {
            iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(iIAuthTabCallback, this.asBinder, this.extraCallback, this.writeTypedObject, this.ICustomTabsCallback);
            while (((SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult)).onExtraCallbackWithResult() != null && !selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.asInterface) {
                selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallbackWithResult();
            }
            SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult2 = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallbackWithResult();
            if (iIAuthTabCallback == -1 || selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult2 == null || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult2.IAuthTabCallbackStub) != iIAuthTabCallback) {
                break;
            }
            selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult2;
        }
        int iIAuthTabCallback2 = IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult);
        selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted = IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted);
        return iIAuthTabCallback2;
    }

    private SelectionAdjustmentCompanionExternalSyntheticLambda4 onNavigationEvent(SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11) {
        return onNavigationEvent(selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback, selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted, selectionContainerKtExternalSyntheticLambda11.IAuthTabCallback_Parcel, selectionContainerKtExternalSyntheticLambda11.access100);
    }

    private SelectionAdjustmentCompanionExternalSyntheticLambda4 onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1, long j) {
        SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4 = selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted;
        long jIAuthTabCallback = (selectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallback() + selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallback) - j;
        if (selectionAdjustmentCompanionExternalSyntheticLambda4.asInterface) {
            return onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, selectionAdjustmentKtExternalSyntheticLambda1, jIAuthTabCallback);
        }
        return IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, selectionAdjustmentKtExternalSyntheticLambda1, jIAuthTabCallback);
    }

    private SelectionAdjustmentCompanionExternalSyntheticLambda4 onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1, long j) {
        SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        long jOnNavigationEvent;
        SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda42 = selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted;
        int iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(selectionAdjustmentCompanionExternalSyntheticLambda42.onExtraCallback.onExtraCallback), this.asBinder, this.extraCallback, this.writeTypedObject, this.ICustomTabsCallback);
        if (iIAuthTabCallback == -1) {
            return null;
        }
        int i2 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(iIAuthTabCallback, this.asBinder, true).IAuthTabCallbackStub;
        Object objOnExtraCallbackWithResult = RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.asBinder.asBinder);
        long j6 = selectionAdjustmentCompanionExternalSyntheticLambda42.onExtraCallback.onNavigationEvent;
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(i2, this.extraCallback).IAuthTabCallback == iIAuthTabCallback) {
            selectionAdjustmentCompanionExternalSyntheticLambda4 = selectionAdjustmentCompanionExternalSyntheticLambda42;
            Pair pairOnWarmupCompleted = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted(this.extraCallback, this.asBinder, i2, -9223372036854775807L, Math.max(0L, j));
            if (pairOnWarmupCompleted == null) {
                return null;
            }
            Object obj2 = pairOnWarmupCompleted.first;
            long jLongValue = ((Long) pairOnWarmupCompleted.second).longValue();
            SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = selectionAdjustmentKtExternalSyntheticLambda1.onExtraCallbackWithResult();
            if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult != null && selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.IAuthTabCallbackStub.equals(obj2)) {
                jOnNavigationEvent = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.onExtraCallback.onNavigationEvent;
            } else {
                jOnNavigationEvent = onNavigationEvent(obj2);
                if (jOnNavigationEvent == -1) {
                    jOnNavigationEvent = this.asInterface;
                    this.asInterface = 1 + jOnNavigationEvent;
                }
            }
            j2 = jOnNavigationEvent;
            j3 = -9223372036854775807L;
            obj = obj2;
            j4 = jLongValue;
        } else {
            selectionAdjustmentCompanionExternalSyntheticLambda4 = selectionAdjustmentCompanionExternalSyntheticLambda42;
            j2 = j6;
            j3 = 0;
            obj = objOnExtraCallbackWithResult;
            j4 = 0;
        }
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, obj, j4, j2, this.extraCallback, this.asBinder);
        if (j3 == -9223372036854775807L || selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackStub == -9223372036854775807L) {
            j5 = j4;
        } else {
            boolean zOnWarmupCompleted = onWarmupCompleted(selectionAdjustmentCompanionExternalSyntheticLambda4.onExtraCallback.onExtraCallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
            if (onextracallbackwithresultOnNavigationEvent.IAuthTabCallback() && zOnWarmupCompleted) {
                j3 = selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackStub;
            } else if (zOnWarmupCompleted) {
                j5 = selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackStub;
            }
            j5 = j4;
        }
        return onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresultOnNavigationEvent, j3, j5);
    }

    private SelectionAdjustmentCompanionExternalSyntheticLambda4 IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1, long j) {
        SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4 = selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted;
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = selectionAdjustmentCompanionExternalSyntheticLambda4.onExtraCallback;
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback, this.asBinder);
        boolean z = selectionAdjustmentCompanionExternalSyntheticLambda4.onNavigationEvent;
        if (onextracallbackwithresult.IAuthTabCallback()) {
            int i2 = onextracallbackwithresult.onWarmupCompleted;
            int iOnExtraCallback = this.asBinder.onExtraCallback(i2);
            if (iOnExtraCallback == -1) {
                return null;
            }
            int iOnExtraCallbackWithResult = this.asBinder.onExtraCallbackWithResult(i2, onextracallbackwithresult.IAuthTabCallback);
            if (iOnExtraCallbackWithResult < iOnExtraCallback) {
                return onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult.onExtraCallback, i2, iOnExtraCallbackWithResult, selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackStub, onextracallbackwithresult.onNavigationEvent, z);
            }
            long jLongValue = selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackStub;
            if (jLongValue == -9223372036854775807L) {
                CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback = this.extraCallback;
                CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback = this.asBinder;
                Pair pairOnWarmupCompleted = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted(iAuthTabCallback, onextracallback, onextracallback.IAuthTabCallbackStub, -9223372036854775807L, Math.max(0L, j));
                if (pairOnWarmupCompleted == null) {
                    return null;
                }
                jLongValue = ((Long) pairOnWarmupCompleted.second).longValue();
            }
            return onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult.onExtraCallback, Math.max(onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult.onExtraCallback, onextracallbackwithresult.onWarmupCompleted), jLongValue), selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackStub, onextracallbackwithresult.onNavigationEvent, z);
        }
        int i3 = onextracallbackwithresult.onExtraCallbackWithResult;
        if (i3 != -1 && this.asBinder.onTransact(i3)) {
            return onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, selectionAdjustmentKtExternalSyntheticLambda1, j);
        }
        int iOnWarmupCompleted = this.asBinder.onWarmupCompleted(onextracallbackwithresult.onExtraCallbackWithResult);
        boolean z2 = this.asBinder.IAuthTabCallbackDefault(onextracallbackwithresult.onExtraCallbackWithResult) && this.asBinder.onNavigationEvent(onextracallbackwithresult.onExtraCallbackWithResult, iOnWarmupCompleted) == 3;
        if (iOnWarmupCompleted == this.asBinder.onExtraCallback(onextracallbackwithresult.onExtraCallbackWithResult) || z2) {
            return onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult.onExtraCallback, onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult.onExtraCallback, onextracallbackwithresult.onExtraCallbackWithResult), selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallback, onextracallbackwithresult.onNavigationEvent, false);
        }
        return onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult.onExtraCallback, onextracallbackwithresult.onExtraCallbackWithResult, iOnWarmupCompleted, selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallback, onextracallbackwithresult.onNavigationEvent, z);
    }

    private boolean onWarmupCompleted(Object obj, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        int iOnExtraCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(obj, this.asBinder).onExtraCallback();
        int iAsInterface = this.asBinder.asInterface();
        if (iOnExtraCallback <= 0 || !this.asBinder.IAuthTabCallbackDefault(iAsInterface)) {
            return false;
        }
        return iOnExtraCallback > 1 || this.asBinder.onNavigationEvent(iAsInterface) != Long.MIN_VALUE;
    }

    private SelectionAdjustmentCompanionExternalSyntheticLambda4 onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, long j, long j2) {
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback, this.asBinder);
        if (onextracallbackwithresult.IAuthTabCallback()) {
            return onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult.onExtraCallback, onextracallbackwithresult.onWarmupCompleted, onextracallbackwithresult.IAuthTabCallback, j, onextracallbackwithresult.onNavigationEvent, false);
        }
        return onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult.onExtraCallback, j2, j, onextracallbackwithresult.onNavigationEvent, false);
    }

    private SelectionAdjustmentCompanionExternalSyntheticLambda4 onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, Object obj, int i2, int i3, long j, long j2, boolean z) {
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = new BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult(obj, i2, i3, j2);
        long jOnWarmupCompleted = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback, this.asBinder).onWarmupCompleted(onextracallbackwithresult.onWarmupCompleted, onextracallbackwithresult.IAuthTabCallback);
        long jIAuthTabCallback = i3 == this.asBinder.onWarmupCompleted(i2) ? this.asBinder.IAuthTabCallback() : 0L;
        return new SelectionAdjustmentCompanionExternalSyntheticLambda4(onextracallbackwithresult, (jOnWarmupCompleted == -9223372036854775807L || jIAuthTabCallback < jOnWarmupCompleted) ? jIAuthTabCallback : Math.max(0L, jOnWarmupCompleted - 1), j, -9223372036854775807L, jOnWarmupCompleted, z, this.asBinder.IAuthTabCallbackDefault(onextracallbackwithresult.onWarmupCompleted), false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private SelectionAdjustmentCompanionExternalSyntheticLambda4 onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, Object obj, long j, long j2, long j3, boolean z) {
        boolean z2;
        long j4;
        long jOnNavigationEvent;
        long j5;
        long jMax = j;
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(obj, this.asBinder);
        int iIAuthTabCallback = this.asBinder.IAuthTabCallback(jMax);
        if (iIAuthTabCallback == -1) {
            if (this.asBinder.onExtraCallback() > 0) {
                CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback = this.asBinder;
                z2 = onextracallback.IAuthTabCallbackDefault(onextracallback.asInterface());
            }
        } else if (this.asBinder.IAuthTabCallbackDefault(iIAuthTabCallback)) {
            long jOnNavigationEvent2 = this.asBinder.onNavigationEvent(iIAuthTabCallback);
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback2 = this.asBinder;
            if (jOnNavigationEvent2 == onextracallback2.IAuthTabCallback && onextracallback2.IAuthTabCallback(iIAuthTabCallback)) {
                z2 = true;
                iIAuthTabCallback = -1;
            }
        }
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = new BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult(obj, j3, iIAuthTabCallback);
        boolean zOnNavigationEvent = onNavigationEvent(onextracallbackwithresult);
        boolean zOnWarmupCompleted = onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult);
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult, zOnNavigationEvent);
        boolean z3 = (iIAuthTabCallback == -1 || !this.asBinder.IAuthTabCallbackDefault(iIAuthTabCallback) || this.asBinder.onTransact(iIAuthTabCallback)) ? false : true;
        boolean z4 = iIAuthTabCallback != -1 && this.asBinder.onTransact(iIAuthTabCallback) && this.asBinder.IAuthTabCallbackDefault(iIAuthTabCallback);
        if (iIAuthTabCallback != -1 && !z4) {
            jOnNavigationEvent = this.asBinder.onNavigationEvent(iIAuthTabCallback);
        } else if (z2) {
            jOnNavigationEvent = this.asBinder.IAuthTabCallback;
        } else {
            j4 = -9223372036854775807L;
            j5 = (j4 != -9223372036854775807L || j4 == Long.MIN_VALUE) ? this.asBinder.IAuthTabCallback : j4;
            if (j5 != -9223372036854775807L && jMax >= j5) {
                jMax = Math.max(0L, j5 - ((zOnExtraCallbackWithResult && z2) ? 0 : 1));
            }
            return new SelectionAdjustmentCompanionExternalSyntheticLambda4(onextracallbackwithresult, jMax, j2, j4, j5, z, z3, zOnNavigationEvent, zOnWarmupCompleted, zOnExtraCallbackWithResult);
        }
        j4 = jOnNavigationEvent;
        if (j4 != -9223372036854775807L) {
        }
        if (j5 != -9223372036854775807L) {
            if (zOnExtraCallbackWithResult) {
                jMax = Math.max(0L, j5 - ((zOnExtraCallbackWithResult && z2) ? 0 : 1));
            }
        }
        return new SelectionAdjustmentCompanionExternalSyntheticLambda4(onextracallbackwithresult, jMax, j2, j4, j5, z, z3, zOnNavigationEvent, zOnWarmupCompleted, zOnExtraCallbackWithResult);
    }

    private boolean onNavigationEvent(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        return !onextracallbackwithresult.IAuthTabCallback() && onextracallbackwithresult.onExtraCallbackWithResult == -1;
    }

    private boolean onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        if (onNavigationEvent(onextracallbackwithresult)) {
            return coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback, this.asBinder).IAuthTabCallbackStub, this.extraCallback).asBinder == coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(onextracallbackwithresult.onExtraCallback);
        }
        return false;
    }

    private boolean onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, boolean z) {
        int iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(onextracallbackwithresult.onExtraCallback);
        return !coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(iIAuthTabCallback, this.asBinder).IAuthTabCallbackStub, this.extraCallback).asInterface && coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted(iIAuthTabCallback, this.asBinder, this.extraCallback, this.writeTypedObject, this.ICustomTabsCallback) && z;
    }

    private long onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, Object obj, int i2) {
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(obj, this.asBinder);
        long jOnNavigationEvent = this.asBinder.onNavigationEvent(i2);
        if (jOnNavigationEvent == Long.MIN_VALUE) {
            return this.asBinder.IAuthTabCallback;
        }
        return jOnNavigationEvent + this.asBinder.onExtraCallbackWithResult(i2);
    }
}

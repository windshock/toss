package o;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.BottomNavigationKtExternalSyntheticLambda7;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.RecordingInputConnection_androidKt;
import o.SelectionContainerKtExternalSyntheticLambda10;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionContainerKtExternalSyntheticLambda10 {
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda16 IAuthTabCallback;
    private final onExtraCallbackWithResult IAuthTabCallbackStub;
    private final SelectionManagerExternalSyntheticLambda12 IAuthTabCallback_Parcel;
    private TextFieldSelectionStateExternalSyntheticLambda7 asBinder;
    private final SelectionContainerKtExternalSyntheticLambda8 onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private BottomNavigationKtExternalSyntheticLambda7 access000 = new BottomNavigationKtExternalSyntheticLambda7.onExtraCallbackWithResult(0);
    private final IdentityHashMap<BottomDrawerStateCompanionExternalSyntheticLambda1, onWarmupCompleted> IAuthTabCallbackDefault = new IdentityHashMap<>();
    private final Map<Object, onWarmupCompleted> asInterface = new HashMap();
    private final List<onWarmupCompleted> onTransact = new ArrayList();
    private final HashMap<onWarmupCompleted, IAuthTabCallback> onNavigationEvent = new HashMap<>();
    private final Set<onWarmupCompleted> onWarmupCompleted = new HashSet();

    public interface onExtraCallbackWithResult {
        void onExtraCallbackWithResult();
    }

    public SelectionContainerKtExternalSyntheticLambda10(onExtraCallbackWithResult onextracallbackwithresult, SelectionContainerKtExternalSyntheticLambda8 selectionContainerKtExternalSyntheticLambda8, TextFieldDecoratorModifierNodeExternalSyntheticLambda16 textFieldDecoratorModifierNodeExternalSyntheticLambda16, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        this.IAuthTabCallback_Parcel = selectionManagerExternalSyntheticLambda12;
        this.IAuthTabCallbackStub = onextracallbackwithresult;
        this.onExtraCallback = selectionContainerKtExternalSyntheticLambda8;
        this.IAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda16;
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 IAuthTabCallback(List<onWarmupCompleted> list, BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) {
        onWarmupCompleted(0, this.onTransact.size());
        return onWarmupCompleted(this.onTransact.size(), list, bottomNavigationKtExternalSyntheticLambda7);
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onWarmupCompleted(int i2, List<onWarmupCompleted> list, BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) {
        if (!list.isEmpty()) {
            this.access000 = bottomNavigationKtExternalSyntheticLambda7;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                onWarmupCompleted onwarmupcompleted = list.get(i3 - i2);
                if (i3 > 0) {
                    onWarmupCompleted onwarmupcompleted2 = this.onTransact.get(i3 - 1);
                    onwarmupcompleted.IAuthTabCallback(onwarmupcompleted2.onNavigationEvent + onwarmupcompleted2.onExtraCallback.asInterface().onExtraCallbackWithResult());
                } else {
                    onwarmupcompleted.IAuthTabCallback(0);
                }
                IAuthTabCallback(i3, onwarmupcompleted.onExtraCallback.asInterface().onExtraCallbackWithResult());
                this.onTransact.add(i3, onwarmupcompleted);
                this.asInterface.put(onwarmupcompleted.onExtraCallbackWithResult, onwarmupcompleted);
                if (this.onExtraCallbackWithResult) {
                    IAuthTabCallback(onwarmupcompleted);
                    if (this.IAuthTabCallbackDefault.isEmpty()) {
                        this.onWarmupCompleted.add(onwarmupcompleted);
                    } else {
                        onWarmupCompleted(onwarmupcompleted);
                    }
                }
            }
        }
        return onWarmupCompleted();
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 IAuthTabCallback(int i2, int i3, BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) {
        RecordingInputConnection_androidKt.onNavigationEvent(i2 >= 0 && i2 <= i3 && i3 <= onExtraCallbackWithResult());
        this.access000 = bottomNavigationKtExternalSyntheticLambda7;
        onWarmupCompleted(i2, i3);
        return onWarmupCompleted();
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onNavigationEvent(int i2, int i3, int i4, BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) {
        RecordingInputConnection_androidKt.onNavigationEvent(i2 >= 0 && i2 <= i3 && i3 <= onExtraCallbackWithResult() && i4 >= 0);
        this.access000 = bottomNavigationKtExternalSyntheticLambda7;
        if (i2 == i3 || i2 == i4) {
            return onWarmupCompleted();
        }
        int iMin = Math.min(i2, i4);
        int iMax = Math.max(((i3 - i2) + i4) - 1, i3 - 1);
        int iOnExtraCallbackWithResult = this.onTransact.get(iMin).onNavigationEvent;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(this.onTransact, i2, i3, i4);
        while (iMin <= iMax) {
            onWarmupCompleted onwarmupcompleted = this.onTransact.get(iMin);
            onwarmupcompleted.onNavigationEvent = iOnExtraCallbackWithResult;
            iOnExtraCallbackWithResult += onwarmupcompleted.onExtraCallback.asInterface().onExtraCallbackWithResult();
            iMin++;
        }
        return onWarmupCompleted();
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onNavigationEvent(int i2, int i3, List<TextFieldStateKtExternalSyntheticLambda0> list) {
        RecordingInputConnection_androidKt.onNavigationEvent(i2 >= 0 && i2 <= i3 && i3 <= onExtraCallbackWithResult());
        RecordingInputConnection_androidKt.onNavigationEvent(list.size() == i3 - i2);
        for (int i4 = i2; i4 < i3; i4++) {
            this.onTransact.get(i4).onExtraCallback.onExtraCallbackWithResult(list.get(i4 - i2));
        }
        return onWarmupCompleted();
    }

    public boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public int onExtraCallbackWithResult() {
        return this.onTransact.size();
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onExtraCallback(BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) {
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (bottomNavigationKtExternalSyntheticLambda7.onExtraCallback() != iOnExtraCallbackWithResult) {
            bottomNavigationKtExternalSyntheticLambda7 = bottomNavigationKtExternalSyntheticLambda7.onWarmupCompleted().IAuthTabCallback(0, iOnExtraCallbackWithResult);
        }
        this.access000 = bottomNavigationKtExternalSyntheticLambda7;
        return onWarmupCompleted();
    }

    public void onExtraCallbackWithResult(@Nullable TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onExtraCallbackWithResult);
        this.asBinder = textFieldSelectionStateExternalSyntheticLambda7;
        for (int i2 = 0; i2 < this.onTransact.size(); i2++) {
            onWarmupCompleted onwarmupcompleted = this.onTransact.get(i2);
            IAuthTabCallback(onwarmupcompleted);
            this.onWarmupCompleted.add(onwarmupcompleted);
        }
        this.onExtraCallbackWithResult = true;
    }

    public BottomDrawerStateCompanionExternalSyntheticLambda1 onNavigationEvent(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, long j) {
        Object objOnWarmupCompleted = onWarmupCompleted(onextracallbackwithresult.onExtraCallback);
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted(onExtraCallback(onextracallbackwithresult.onExtraCallback));
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.asInterface.get(objOnWarmupCompleted));
        onExtraCallbackWithResult(onwarmupcompleted);
        onwarmupcompleted.onWarmupCompleted.add(onextracallbackwithresultOnWarmupCompleted);
        BackdropScaffoldStateExternalSyntheticLambda1 backdropScaffoldStateExternalSyntheticLambda1OnExtraCallbackWithResult = onwarmupcompleted.onExtraCallback.onExtraCallbackWithResult(onextracallbackwithresultOnWarmupCompleted, composableSingletonsScaffoldKtExternalSyntheticLambda3, j);
        this.IAuthTabCallbackDefault.put(backdropScaffoldStateExternalSyntheticLambda1OnExtraCallbackWithResult, onwarmupcompleted);
        IAuthTabCallbackDefault();
        return backdropScaffoldStateExternalSyntheticLambda1OnExtraCallbackWithResult;
    }

    public void onExtraCallbackWithResult(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackDefault.remove(bottomDrawerStateCompanionExternalSyntheticLambda1));
        onwarmupcompleted.onExtraCallback.onExtraCallbackWithResult(bottomDrawerStateCompanionExternalSyntheticLambda1);
        onwarmupcompleted.onWarmupCompleted.remove(((BackdropScaffoldStateExternalSyntheticLambda1) bottomDrawerStateCompanionExternalSyntheticLambda1).onExtraCallbackWithResult);
        if (!this.IAuthTabCallbackDefault.isEmpty()) {
            IAuthTabCallbackDefault();
        }
        onNavigationEvent(onwarmupcompleted);
    }

    public void onExtraCallback() {
        for (IAuthTabCallback iAuthTabCallback : this.onNavigationEvent.values()) {
            try {
                iAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallback(iAuthTabCallback.onNavigationEvent);
            } catch (RuntimeException e) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MediaSourceList", "Failed to release child source.", e);
            }
            iAuthTabCallback.onExtraCallbackWithResult.onNavigationEvent(iAuthTabCallback.IAuthTabCallback);
            iAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted(iAuthTabCallback.IAuthTabCallback);
        }
        this.onNavigationEvent.clear();
        this.onWarmupCompleted.clear();
        this.onExtraCallbackWithResult = false;
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onWarmupCompleted() {
        if (this.onTransact.isEmpty()) {
            return CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted;
        }
        int iOnExtraCallbackWithResult = 0;
        for (int i2 = 0; i2 < this.onTransact.size(); i2++) {
            onWarmupCompleted onwarmupcompleted = this.onTransact.get(i2);
            onwarmupcompleted.onNavigationEvent = iOnExtraCallbackWithResult;
            iOnExtraCallbackWithResult += onwarmupcompleted.onExtraCallback.asInterface().onExtraCallbackWithResult();
        }
        return new SelectionContainerKtExternalSyntheticLambda4(this.onTransact, this.access000);
    }

    public BottomNavigationKtExternalSyntheticLambda7 onNavigationEvent() {
        return this.access000;
    }

    private void onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted) {
        this.onWarmupCompleted.add(onwarmupcompleted);
        IAuthTabCallback iAuthTabCallback = this.onNavigationEvent.get(onwarmupcompleted);
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted(iAuthTabCallback.onNavigationEvent);
        }
    }

    private void IAuthTabCallbackDefault() {
        Iterator<onWarmupCompleted> it = this.onWarmupCompleted.iterator();
        while (it.hasNext()) {
            onWarmupCompleted next = it.next();
            if (next.onWarmupCompleted.isEmpty()) {
                onWarmupCompleted(next);
                it.remove();
            }
        }
    }

    private void onWarmupCompleted(onWarmupCompleted onwarmupcompleted) {
        IAuthTabCallback iAuthTabCallback = this.onNavigationEvent.get(onwarmupcompleted);
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onExtraCallbackWithResult.onNavigationEvent(iAuthTabCallback.onNavigationEvent);
        }
    }

    private void onWarmupCompleted(int i2, int i3) {
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            }
            onWarmupCompleted onwarmupcompletedRemove = this.onTransact.remove(i3);
            this.asInterface.remove(onwarmupcompletedRemove.onExtraCallbackWithResult);
            IAuthTabCallback(i3, -onwarmupcompletedRemove.onExtraCallback.asInterface().onExtraCallbackWithResult());
            onwarmupcompletedRemove.IAuthTabCallback = true;
            if (this.onExtraCallbackWithResult) {
                onNavigationEvent(onwarmupcompletedRemove);
            }
        }
    }

    private void IAuthTabCallback(int i2, int i3) {
        while (i2 < this.onTransact.size()) {
            this.onTransact.get(i2).onNavigationEvent += i3;
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        for (int i2 = 0; i2 < onwarmupcompleted.onWarmupCompleted.size(); i2++) {
            if (onwarmupcompleted.onWarmupCompleted.get(i2).onNavigationEvent == onextracallbackwithresult.onNavigationEvent) {
                return onextracallbackwithresult.onWarmupCompleted(onExtraCallbackWithResult(onwarmupcompleted, onextracallbackwithresult.onExtraCallback));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int onNavigationEvent(onWarmupCompleted onwarmupcompleted, int i2) {
        return i2 + onwarmupcompleted.onNavigationEvent;
    }

    private void IAuthTabCallback(onWarmupCompleted onwarmupcompleted) {
        BadgeKtBadgedBox21ExternalSyntheticLambda0 badgeKtBadgedBox21ExternalSyntheticLambda0 = onwarmupcompleted.onExtraCallback;
        BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent onnavigationevent = new BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent() { // from class: androidx.media3.exoplayer.MediaSourceList$$ExternalSyntheticLambda0
            public final void onSourceInfoRefreshed(BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
                this.f$0.IAuthTabCallbackStub.onExtraCallbackWithResult();
            }
        };
        onNavigationEvent onnavigationevent2 = new onNavigationEvent(onwarmupcompleted);
        this.onNavigationEvent.put(onwarmupcompleted, new IAuthTabCallback(badgeKtBadgedBox21ExternalSyntheticLambda0, onnavigationevent, onnavigationevent2));
        badgeKtBadgedBox21ExternalSyntheticLambda0.onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(), onnavigationevent2);
        badgeKtBadgedBox21ExternalSyntheticLambda0.IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(), onnavigationevent2);
        badgeKtBadgedBox21ExternalSyntheticLambda0.onExtraCallbackWithResult(onnavigationevent, this.asBinder, this.IAuthTabCallback_Parcel);
    }

    private void onNavigationEvent(onWarmupCompleted onwarmupcompleted) {
        if (onwarmupcompleted.IAuthTabCallback && onwarmupcompleted.onWarmupCompleted.isEmpty()) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent.remove(onwarmupcompleted));
            iAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallback(iAuthTabCallback.onNavigationEvent);
            iAuthTabCallback.onExtraCallbackWithResult.onNavigationEvent(iAuthTabCallback.IAuthTabCallback);
            iAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted(iAuthTabCallback.IAuthTabCallback);
            this.onWarmupCompleted.remove(onwarmupcompleted);
        }
    }

    private static Object onWarmupCompleted(Object obj) {
        return SelectionControllerExternalSyntheticLambda1.onWarmupCompleted(obj);
    }

    private static Object onExtraCallback(Object obj) {
        return SelectionControllerExternalSyntheticLambda1.onExtraCallbackWithResult(obj);
    }

    private static Object onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, Object obj) {
        return SelectionControllerExternalSyntheticLambda1.onWarmupCompleted(onwarmupcompleted.onExtraCallbackWithResult, obj);
    }

    static final class onWarmupCompleted implements SelectionAdjustmentCompanionExternalSyntheticLambda2 {
        public boolean IAuthTabCallback;
        public final BadgeKtBadgedBox21ExternalSyntheticLambda0 onExtraCallback;
        public int onNavigationEvent;
        public final List<BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> onWarmupCompleted = new ArrayList();
        public final Object onExtraCallbackWithResult = new Object();

        public onWarmupCompleted(BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2, boolean z) {
            this.onExtraCallback = new BadgeKtBadgedBox21ExternalSyntheticLambda0(bottomDrawerStateExternalSyntheticLambda2, z);
        }

        public void IAuthTabCallback(int i2) {
            this.onNavigationEvent = i2;
            this.IAuthTabCallback = false;
            this.onWarmupCompleted.clear();
        }

        @Override // o.SelectionAdjustmentCompanionExternalSyntheticLambda2
        public Object onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.SelectionAdjustmentCompanionExternalSyntheticLambda2
        public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onWarmupCompleted() {
            return this.onExtraCallback.asInterface();
        }
    }

    static final class IAuthTabCallback {
        public final onNavigationEvent IAuthTabCallback;
        public final BottomDrawerStateExternalSyntheticLambda2 onExtraCallbackWithResult;
        public final BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent onNavigationEvent;

        public IAuthTabCallback(BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2, BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent onnavigationevent, onNavigationEvent onnavigationevent2) {
            this.onExtraCallbackWithResult = bottomDrawerStateExternalSyntheticLambda2;
            this.onNavigationEvent = onnavigationevent;
            this.IAuthTabCallback = onnavigationevent2;
        }
    }

    public final class onNavigationEvent implements BottomNavigationKtExternalSyntheticLambda0, SelectionManager_androidKtExternalSyntheticLambda8 {
        private final onWarmupCompleted IAuthTabCallback;

        public onNavigationEvent(onWarmupCompleted onwarmupcompleted) {
            this.IAuthTabCallback = onwarmupcompleted;
        }

        public void IAuthTabCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2, final int i3) {
            final Pair<Integer, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
            if (pairOnExtraCallbackWithResult != null) {
                SelectionContainerKtExternalSyntheticLambda10.this.IAuthTabCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent onnavigationevent = this.f$0;
                        Pair pair = pairOnExtraCallbackWithResult;
                        SelectionContainerKtExternalSyntheticLambda10.this.onExtraCallback.IAuthTabCallback(((Integer) pair.first).intValue(), (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) pair.second, badgeKtExternalSyntheticLambda0, badgeKtExternalSyntheticLambda2, i3);
                    }
                });
            }
        }

        public void onExtraCallbackWithResult(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
            final Pair<Integer, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
            if (pairOnExtraCallbackWithResult != null) {
                SelectionContainerKtExternalSyntheticLambda10.this.IAuthTabCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent onnavigationevent = this.f$0;
                        Pair pair = pairOnExtraCallbackWithResult;
                        SelectionContainerKtExternalSyntheticLambda10.this.onExtraCallback.onExtraCallbackWithResult(((Integer) pair.first).intValue(), (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) pair.second, badgeKtExternalSyntheticLambda0, badgeKtExternalSyntheticLambda2);
                    }
                });
            }
        }

        public void onNavigationEvent(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
            final Pair<Integer, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
            if (pairOnExtraCallbackWithResult != null) {
                SelectionContainerKtExternalSyntheticLambda10.this.IAuthTabCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent onnavigationevent = this.f$0;
                        Pair pair = pairOnExtraCallbackWithResult;
                        SelectionContainerKtExternalSyntheticLambda10.this.onExtraCallback.onNavigationEvent(((Integer) pair.first).intValue(), (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) pair.second, badgeKtExternalSyntheticLambda0, badgeKtExternalSyntheticLambda2);
                    }
                });
            }
        }

        public void onExtraCallbackWithResult(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2, final IOException iOException, final boolean z) {
            final Pair<Integer, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
            if (pairOnExtraCallbackWithResult != null) {
                SelectionContainerKtExternalSyntheticLambda10.this.IAuthTabCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent onnavigationevent = this.f$0;
                        Pair pair = pairOnExtraCallbackWithResult;
                        SelectionContainerKtExternalSyntheticLambda10.this.onExtraCallback.onExtraCallbackWithResult(((Integer) pair.first).intValue(), (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) pair.second, badgeKtExternalSyntheticLambda0, badgeKtExternalSyntheticLambda2, iOException, z);
                    }
                });
            }
        }

        public void onNavigationEvent(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
            final Pair<Integer, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
            if (pairOnExtraCallbackWithResult != null) {
                SelectionContainerKtExternalSyntheticLambda10.this.IAuthTabCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent onnavigationevent = this.f$0;
                        Pair pair = pairOnExtraCallbackWithResult;
                        SelectionContainerKtExternalSyntheticLambda10.this.onExtraCallback.onNavigationEvent((SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent) ((Integer) pair.first).intValue(), (Pair) RecordingInputConnection_androidKt.onExtraCallbackWithResult((BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) pair.second), badgeKtExternalSyntheticLambda2);
                    }
                });
            }
        }

        public void onExtraCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
            final Pair<Integer, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
            if (pairOnExtraCallbackWithResult != null) {
                SelectionContainerKtExternalSyntheticLambda10.this.IAuthTabCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent onnavigationevent = this.f$0;
                        Pair pair = pairOnExtraCallbackWithResult;
                        SelectionContainerKtExternalSyntheticLambda10.this.onExtraCallback.onExtraCallback((SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent) ((Integer) pair.first).intValue(), (Pair) pair.second, badgeKtExternalSyntheticLambda2);
                    }
                });
            }
        }

        public void IAuthTabCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final int i3) {
            final Pair<Integer, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
            if (pairOnExtraCallbackWithResult != null) {
                SelectionContainerKtExternalSyntheticLambda10.this.IAuthTabCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent onnavigationevent = this.f$0;
                        Pair pair = pairOnExtraCallbackWithResult;
                        SelectionContainerKtExternalSyntheticLambda10.this.onExtraCallback.IAuthTabCallback((SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent) ((Integer) pair.first).intValue(), (Pair) pair.second, i3);
                    }
                });
            }
        }

        public void onWarmupCompleted(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            final Pair<Integer, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
            if (pairOnExtraCallbackWithResult != null) {
                SelectionContainerKtExternalSyntheticLambda10.this.IAuthTabCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent onnavigationevent = this.f$0;
                        Pair pair = pairOnExtraCallbackWithResult;
                        SelectionContainerKtExternalSyntheticLambda10.this.onExtraCallback.onWarmupCompleted((SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent) ((Integer) pair.first).intValue(), (Pair) pair.second);
                    }
                });
            }
        }

        public void onNavigationEvent(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final Exception exc) {
            final Pair<Integer, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
            if (pairOnExtraCallbackWithResult != null) {
                SelectionContainerKtExternalSyntheticLambda10.this.IAuthTabCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent onnavigationevent = this.f$0;
                        Pair pair = pairOnExtraCallbackWithResult;
                        SelectionContainerKtExternalSyntheticLambda10.this.onExtraCallback.onNavigationEvent((SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent) ((Integer) pair.first).intValue(), (Pair) pair.second, exc);
                    }
                });
            }
        }

        public void IAuthTabCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            final Pair<Integer, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
            if (pairOnExtraCallbackWithResult != null) {
                SelectionContainerKtExternalSyntheticLambda10.this.IAuthTabCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent onnavigationevent = this.f$0;
                        Pair pair = pairOnExtraCallbackWithResult;
                        SelectionContainerKtExternalSyntheticLambda10.this.onExtraCallback.IAuthTabCallback((SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent) ((Integer) pair.first).intValue(), (Pair) pair.second);
                    }
                });
            }
        }

        public void onNavigationEvent(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            final Pair<Integer, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
            if (pairOnExtraCallbackWithResult != null) {
                SelectionContainerKtExternalSyntheticLambda10.this.IAuthTabCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent onnavigationevent = this.f$0;
                        Pair pair = pairOnExtraCallbackWithResult;
                        SelectionContainerKtExternalSyntheticLambda10.this.onExtraCallback.onNavigationEvent((SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent) ((Integer) pair.first).intValue(), (Pair) pair.second);
                    }
                });
            }
        }

        public void onExtraCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            final Pair<Integer, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
            if (pairOnExtraCallbackWithResult != null) {
                SelectionContainerKtExternalSyntheticLambda10.this.IAuthTabCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent onnavigationevent = this.f$0;
                        Pair pair = pairOnExtraCallbackWithResult;
                        SelectionContainerKtExternalSyntheticLambda10.this.onExtraCallback.onExtraCallback((SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent) ((Integer) pair.first).intValue(), (Pair) pair.second);
                    }
                });
            }
        }

        private Pair<Integer, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> onExtraCallbackWithResult(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2 = null;
            if (onextracallbackwithresult != null) {
                BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onExtraCallbackWithResult = SelectionContainerKtExternalSyntheticLambda10.onExtraCallbackWithResult(this.IAuthTabCallback, onextracallbackwithresult);
                if (onExtraCallbackWithResult == null) {
                    return null;
                }
                onextracallbackwithresult2 = onExtraCallbackWithResult;
            }
            return Pair.create(Integer.valueOf(SelectionContainerKtExternalSyntheticLambda10.onNavigationEvent(this.IAuthTabCallback, i2)), onextracallbackwithresult2);
        }
    }
}

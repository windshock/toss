package o;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import o.BackdropScaffoldKtExternalSyntheticLambda5;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class BackdropScaffoldKtExternalSyntheticLambda5<T> extends BackdropScaffoldKtExternalSyntheticLambda26 {
    private TextFieldSelectionStateExternalSyntheticLambda7 IAuthTabCallback;
    private Handler onExtraCallback;
    private final HashMap<T, IAuthTabCallback<T>> onNavigationEvent = new HashMap<>();

    protected int IAuthTabCallback(T t, int i2) {
        return i2;
    }

    protected long onExtraCallbackWithResult(T t, long j, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onExtraCallbackWithResult(T t, BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);

    protected BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onNavigationEvent(T t, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        return onextracallbackwithresult;
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda26
    public void onWarmupCompleted(@Nullable TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
        this.IAuthTabCallback = textFieldSelectionStateExternalSyntheticLambda7;
        this.onExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult();
    }

    public void onExtraCallback() throws IOException {
        Iterator<IAuthTabCallback<T>> it = this.onNavigationEvent.values().iterator();
        while (it.hasNext()) {
            it.next().onExtraCallback.onExtraCallback();
        }
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda26
    protected void IAuthTabCallback() {
        for (IAuthTabCallback<T> iAuthTabCallback : this.onNavigationEvent.values()) {
            iAuthTabCallback.onExtraCallback.onWarmupCompleted(iAuthTabCallback.onWarmupCompleted);
        }
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda26
    protected void onWarmupCompleted() {
        for (IAuthTabCallback<T> iAuthTabCallback : this.onNavigationEvent.values()) {
            iAuthTabCallback.onExtraCallback.onNavigationEvent(iAuthTabCallback.onWarmupCompleted);
        }
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda26
    public void onExtraCallbackWithResult() {
        for (IAuthTabCallback<T> iAuthTabCallback : this.onNavigationEvent.values()) {
            iAuthTabCallback.onExtraCallback.IAuthTabCallback(iAuthTabCallback.onWarmupCompleted);
            iAuthTabCallback.onExtraCallback.onNavigationEvent(iAuthTabCallback.onExtraCallbackWithResult);
            iAuthTabCallback.onExtraCallback.onWarmupCompleted(iAuthTabCallback.onExtraCallbackWithResult);
        }
        this.onNavigationEvent.clear();
    }

    public final void onNavigationEvent(final T t, BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2) {
        RecordingInputConnection_androidKt.onNavigationEvent(!this.onNavigationEvent.containsKey(t));
        BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent onnavigationevent = new BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent() { // from class: androidx.media3.exoplayer.source.CompositeMediaSource$$ExternalSyntheticLambda0
            public final void onSourceInfoRefreshed(BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda22, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
                this.f$0.onExtraCallbackWithResult((BackdropScaffoldKtExternalSyntheticLambda5) t, bottomDrawerStateExternalSyntheticLambda22, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
            }
        };
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(t);
        this.onNavigationEvent.put(t, new IAuthTabCallback<>(bottomDrawerStateExternalSyntheticLambda2, onnavigationevent, onextracallbackwithresult));
        bottomDrawerStateExternalSyntheticLambda2.onExtraCallback((Handler) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback), onextracallbackwithresult);
        bottomDrawerStateExternalSyntheticLambda2.IAuthTabCallback((Handler) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback), onextracallbackwithresult);
        bottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult(onnavigationevent, this.IAuthTabCallback, IAuthTabCallbackDefault());
        if (asBinder()) {
            return;
        }
        bottomDrawerStateExternalSyntheticLambda2.onNavigationEvent(onnavigationevent);
    }

    protected final void onWarmupCompleted(T t) {
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent.get(t));
        iAuthTabCallback.onExtraCallback.onWarmupCompleted(iAuthTabCallback.onWarmupCompleted);
    }

    protected final void onNavigationEvent(T t) {
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent.get(t));
        iAuthTabCallback.onExtraCallback.onNavigationEvent(iAuthTabCallback.onWarmupCompleted);
    }

    public final void onExtraCallback(T t) {
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent.remove(t));
        iAuthTabCallback.onExtraCallback.IAuthTabCallback(iAuthTabCallback.onWarmupCompleted);
        iAuthTabCallback.onExtraCallback.onNavigationEvent(iAuthTabCallback.onExtraCallbackWithResult);
        iAuthTabCallback.onExtraCallback.onWarmupCompleted(iAuthTabCallback.onExtraCallbackWithResult);
    }

    static final class IAuthTabCallback<T> {
        public final BottomDrawerStateExternalSyntheticLambda2 onExtraCallback;
        public final BackdropScaffoldKtExternalSyntheticLambda5<T>.onExtraCallbackWithResult onExtraCallbackWithResult;
        public final BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent onWarmupCompleted;

        public IAuthTabCallback(BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2, BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent onnavigationevent, BackdropScaffoldKtExternalSyntheticLambda5<T>.onExtraCallbackWithResult onextracallbackwithresult) {
            this.onExtraCallback = bottomDrawerStateExternalSyntheticLambda2;
            this.onWarmupCompleted = onnavigationevent;
            this.onExtraCallbackWithResult = onextracallbackwithresult;
        }
    }

    final class onExtraCallbackWithResult implements BottomNavigationKtExternalSyntheticLambda0, SelectionManager_androidKtExternalSyntheticLambda8 {
        private BottomNavigationKtExternalSyntheticLambda0$onExtraCallback IAuthTabCallback;
        private final T onExtraCallback;
        private SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted onExtraCallbackWithResult;

        public onExtraCallbackWithResult(T t) {
            this.IAuthTabCallback = BackdropScaffoldKtExternalSyntheticLambda5.this.onExtraCallback((BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) null);
            this.onExtraCallbackWithResult = BackdropScaffoldKtExternalSyntheticLambda5.this.onNavigationEvent((BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) null);
            this.onExtraCallback = t;
        }

        public void IAuthTabCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2, int i3) {
            if (onExtraCallbackWithResult(i2, onextracallbackwithresult)) {
                this.IAuthTabCallback.onExtraCallbackWithResult(badgeKtExternalSyntheticLambda0, onNavigationEvent(badgeKtExternalSyntheticLambda2, onextracallbackwithresult), i3);
            }
        }

        public void onExtraCallbackWithResult(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
            if (onExtraCallbackWithResult(i2, onextracallbackwithresult)) {
                this.IAuthTabCallback.IAuthTabCallback(badgeKtExternalSyntheticLambda0, onNavigationEvent(badgeKtExternalSyntheticLambda2, onextracallbackwithresult));
            }
        }

        public void onNavigationEvent(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
            if (onExtraCallbackWithResult(i2, onextracallbackwithresult)) {
                this.IAuthTabCallback.onWarmupCompleted(badgeKtExternalSyntheticLambda0, onNavigationEvent(badgeKtExternalSyntheticLambda2, onextracallbackwithresult));
            }
        }

        public void onExtraCallbackWithResult(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2, IOException iOException, boolean z) {
            if (onExtraCallbackWithResult(i2, onextracallbackwithresult)) {
                this.IAuthTabCallback.onWarmupCompleted(badgeKtExternalSyntheticLambda0, onNavigationEvent(badgeKtExternalSyntheticLambda2, onextracallbackwithresult), iOException, z);
            }
        }

        public void onNavigationEvent(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
            if (onExtraCallbackWithResult(i2, onextracallbackwithresult)) {
                this.IAuthTabCallback.IAuthTabCallback(onNavigationEvent(badgeKtExternalSyntheticLambda2, onextracallbackwithresult));
            }
        }

        public void onExtraCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
            if (onExtraCallbackWithResult(i2, onextracallbackwithresult)) {
                this.IAuthTabCallback.onExtraCallbackWithResult(onNavigationEvent(badgeKtExternalSyntheticLambda2, onextracallbackwithresult));
            }
        }

        public void IAuthTabCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, int i3) {
            if (onExtraCallbackWithResult(i2, onextracallbackwithresult)) {
                this.onExtraCallbackWithResult.onWarmupCompleted(i3);
            }
        }

        public void onWarmupCompleted(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            if (onExtraCallbackWithResult(i2, onextracallbackwithresult)) {
                this.onExtraCallbackWithResult.IAuthTabCallback();
            }
        }

        public void onNavigationEvent(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, Exception exc) {
            if (onExtraCallbackWithResult(i2, onextracallbackwithresult)) {
                this.onExtraCallbackWithResult.onExtraCallback(exc);
            }
        }

        public void IAuthTabCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            if (onExtraCallbackWithResult(i2, onextracallbackwithresult)) {
                this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            }
        }

        public void onNavigationEvent(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            if (onExtraCallbackWithResult(i2, onextracallbackwithresult)) {
                this.onExtraCallbackWithResult.onWarmupCompleted();
            }
        }

        public void onExtraCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            if (onExtraCallbackWithResult(i2, onextracallbackwithresult)) {
                this.onExtraCallbackWithResult.onExtraCallback();
            }
        }

        private boolean onExtraCallbackWithResult(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent;
            if (onextracallbackwithresult != null) {
                onextracallbackwithresultOnNavigationEvent = BackdropScaffoldKtExternalSyntheticLambda5.this.onNavigationEvent((BackdropScaffoldKtExternalSyntheticLambda5) this.onExtraCallback, onextracallbackwithresult);
                if (onextracallbackwithresultOnNavigationEvent == null) {
                    return false;
                }
            } else {
                onextracallbackwithresultOnNavigationEvent = null;
            }
            int iIAuthTabCallback = BackdropScaffoldKtExternalSyntheticLambda5.this.IAuthTabCallback((BackdropScaffoldKtExternalSyntheticLambda5) this.onExtraCallback, i2);
            BottomNavigationKtExternalSyntheticLambda0$onExtraCallback bottomNavigationKtExternalSyntheticLambda0$onExtraCallback = this.IAuthTabCallback;
            if (bottomNavigationKtExternalSyntheticLambda0$onExtraCallback.onExtraCallbackWithResult != iIAuthTabCallback || !Objects.equals(bottomNavigationKtExternalSyntheticLambda0$onExtraCallback.onNavigationEvent, onextracallbackwithresultOnNavigationEvent)) {
                this.IAuthTabCallback = BackdropScaffoldKtExternalSyntheticLambda5.this.asInterface(iIAuthTabCallback, onextracallbackwithresultOnNavigationEvent);
            }
            SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted = this.onExtraCallbackWithResult;
            if (selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.onExtraCallbackWithResult == iIAuthTabCallback && Objects.equals(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted.IAuthTabCallback, onextracallbackwithresultOnNavigationEvent)) {
                return true;
            }
            this.onExtraCallbackWithResult = BackdropScaffoldKtExternalSyntheticLambda5.this.onExtraCallbackWithResult(iIAuthTabCallback, onextracallbackwithresultOnNavigationEvent);
            return true;
        }

        private BadgeKtExternalSyntheticLambda2 onNavigationEvent(BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            long jOnExtraCallbackWithResult = BackdropScaffoldKtExternalSyntheticLambda5.this.onExtraCallbackWithResult((BackdropScaffoldKtExternalSyntheticLambda5) this.onExtraCallback, badgeKtExternalSyntheticLambda2.onExtraCallback, onextracallbackwithresult);
            long jOnExtraCallbackWithResult2 = BackdropScaffoldKtExternalSyntheticLambda5.this.onExtraCallbackWithResult((BackdropScaffoldKtExternalSyntheticLambda5) this.onExtraCallback, badgeKtExternalSyntheticLambda2.onExtraCallbackWithResult, onextracallbackwithresult);
            return (jOnExtraCallbackWithResult == badgeKtExternalSyntheticLambda2.onExtraCallback && jOnExtraCallbackWithResult2 == badgeKtExternalSyntheticLambda2.onExtraCallbackWithResult) ? badgeKtExternalSyntheticLambda2 : new BadgeKtExternalSyntheticLambda2(badgeKtExternalSyntheticLambda2.IAuthTabCallback, badgeKtExternalSyntheticLambda2.onTransact, badgeKtExternalSyntheticLambda2.onWarmupCompleted, badgeKtExternalSyntheticLambda2.IAuthTabCallbackDefault, badgeKtExternalSyntheticLambda2.onNavigationEvent, jOnExtraCallbackWithResult, jOnExtraCallbackWithResult2);
        }
    }
}

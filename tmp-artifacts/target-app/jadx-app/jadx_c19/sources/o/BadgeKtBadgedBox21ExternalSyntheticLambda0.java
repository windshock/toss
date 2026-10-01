package o;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Objects;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.TextFieldStateKtExternalSyntheticLambda0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BadgeKtBadgedBox21ExternalSyntheticLambda0 extends BottomSheetScaffoldKtExternalSyntheticLambda15 {
    private boolean IAuthTabCallback;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private onExtraCallbackWithResult asBinder;
    private boolean onExtraCallback;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onNavigationEvent;
    private BackdropScaffoldStateExternalSyntheticLambda1 onTransact;
    private boolean onWarmupCompleted;

    public BadgeKtBadgedBox21ExternalSyntheticLambda0(BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2, boolean z) {
        super(bottomDrawerStateExternalSyntheticLambda2);
        this.IAuthTabCallbackStub = z && bottomDrawerStateExternalSyntheticLambda2.access000();
        this.IAuthTabCallbackDefault = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback();
        this.onNavigationEvent = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback();
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IAuthTabCallbackStub = bottomDrawerStateExternalSyntheticLambda2.IAuthTabCallbackStub();
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IAuthTabCallbackStub != null) {
            this.asBinder = onExtraCallbackWithResult.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IAuthTabCallbackStub, (Object) null, (Object) null);
            this.onExtraCallback = true;
        } else {
            this.asBinder = onExtraCallbackWithResult.IAuthTabCallback(bottomDrawerStateExternalSyntheticLambda2.onNavigationEvent());
        }
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 asInterface() {
        return this.asBinder;
    }

    @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda15
    public boolean IAuthTabCallback(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        return ((BottomSheetScaffoldKtExternalSyntheticLambda15) this).onExtraCallbackWithResult.IAuthTabCallback(textFieldStateKtExternalSyntheticLambda0);
    }

    @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda15
    public void onExtraCallbackWithResult(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        if (this.onExtraCallback) {
            this.asBinder = this.asBinder.onNavigationEvent(new BottomSheetScaffoldKtExternalSyntheticLambda0(this.asBinder.onExtraCallbackWithResult, textFieldStateKtExternalSyntheticLambda0));
        } else {
            this.asBinder = onExtraCallbackWithResult.IAuthTabCallback(textFieldStateKtExternalSyntheticLambda0);
        }
        ((BottomSheetScaffoldKtExternalSyntheticLambda15) this).onExtraCallbackWithResult.onExtraCallbackWithResult(textFieldStateKtExternalSyntheticLambda0);
    }

    @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda15
    public void getInterfaceDescriptor() {
        if (this.IAuthTabCallbackStub) {
            return;
        }
        this.onWarmupCompleted = true;
        IAuthTabCallback_Parcel();
    }

    @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda15
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public BackdropScaffoldStateExternalSyntheticLambda1 onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, long j) {
        BackdropScaffoldStateExternalSyntheticLambda1 backdropScaffoldStateExternalSyntheticLambda1 = new BackdropScaffoldStateExternalSyntheticLambda1(onextracallbackwithresult, composableSingletonsScaffoldKtExternalSyntheticLambda3, j);
        backdropScaffoldStateExternalSyntheticLambda1.IAuthTabCallback(((BottomSheetScaffoldKtExternalSyntheticLambda15) this).onExtraCallbackWithResult);
        if (this.IAuthTabCallback) {
            backdropScaffoldStateExternalSyntheticLambda1.onExtraCallback(onextracallbackwithresult.onWarmupCompleted(IAuthTabCallback(onextracallbackwithresult.onExtraCallback)));
            return backdropScaffoldStateExternalSyntheticLambda1;
        }
        this.onTransact = backdropScaffoldStateExternalSyntheticLambda1;
        if (!this.onWarmupCompleted) {
            this.onWarmupCompleted = true;
            IAuthTabCallback_Parcel();
        }
        return backdropScaffoldStateExternalSyntheticLambda1;
    }

    @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda15
    public void onExtraCallbackWithResult(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        ((BackdropScaffoldStateExternalSyntheticLambda1) bottomDrawerStateCompanionExternalSyntheticLambda1).asInterface();
        if (bottomDrawerStateCompanionExternalSyntheticLambda1 == this.onTransact) {
            this.onTransact = null;
        }
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda5, o.BackdropScaffoldKtExternalSyntheticLambda26
    public void onExtraCallbackWithResult() {
        this.IAuthTabCallback = false;
        this.onWarmupCompleted = false;
        super.onExtraCallbackWithResult();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda15
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback;
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted;
        onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback2;
        if (this.IAuthTabCallback) {
            this.asBinder = this.asBinder.onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
            BackdropScaffoldStateExternalSyntheticLambda1 backdropScaffoldStateExternalSyntheticLambda1 = this.onTransact;
            if (backdropScaffoldStateExternalSyntheticLambda1 != null) {
                onExtraCallback(backdropScaffoldStateExternalSyntheticLambda1.onTransact());
            }
        } else if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
            if (this.onExtraCallback) {
                onextracallbackwithresultIAuthTabCallback2 = this.asBinder.onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
            } else {
                onextracallbackwithresultIAuthTabCallback2 = onExtraCallbackWithResult.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback.onNavigationEvent, onExtraCallbackWithResult.IAuthTabCallback);
            }
            this.asBinder = onextracallbackwithresultIAuthTabCallback2;
        } else {
            coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(0, this.IAuthTabCallbackDefault);
            long jOnExtraCallbackWithResult = this.IAuthTabCallbackDefault.onExtraCallbackWithResult();
            Object obj = this.IAuthTabCallbackDefault.extraCallback;
            BackdropScaffoldStateExternalSyntheticLambda1 backdropScaffoldStateExternalSyntheticLambda12 = this.onTransact;
            if (backdropScaffoldStateExternalSyntheticLambda12 != null) {
                long jAsBinder = backdropScaffoldStateExternalSyntheticLambda12.asBinder();
                this.asBinder.onExtraCallbackWithResult(this.onTransact.onExtraCallbackWithResult.onExtraCallback, this.onNavigationEvent);
                long jOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted() + jAsBinder;
                long j = jOnWarmupCompleted != this.asBinder.IAuthTabCallback(0, this.IAuthTabCallbackDefault).onExtraCallbackWithResult() ? jOnWarmupCompleted : jOnExtraCallbackWithResult;
                Pair pairOnExtraCallbackWithResult = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(this.IAuthTabCallbackDefault, this.onNavigationEvent, 0, j);
                Object obj2 = pairOnExtraCallbackWithResult.first;
                long jLongValue = ((Long) pairOnExtraCallbackWithResult.second).longValue();
                if (this.onExtraCallback) {
                    onextracallbackwithresultIAuthTabCallback = this.asBinder.onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
                } else {
                    onextracallbackwithresultIAuthTabCallback = onExtraCallbackWithResult.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, obj, obj2);
                }
                this.asBinder = onextracallbackwithresultIAuthTabCallback;
                BackdropScaffoldStateExternalSyntheticLambda1 backdropScaffoldStateExternalSyntheticLambda13 = this.onTransact;
                if (backdropScaffoldStateExternalSyntheticLambda13 != null && onExtraCallback(jLongValue)) {
                    BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = backdropScaffoldStateExternalSyntheticLambda13.onExtraCallbackWithResult;
                    onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted(IAuthTabCallback(onextracallbackwithresult.onExtraCallback));
                }
            }
            this.onExtraCallback = true;
            this.IAuthTabCallback = true;
            onNavigationEvent((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) this.asBinder);
            if (onextracallbackwithresultOnWarmupCompleted == null) {
                ((BackdropScaffoldStateExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onTransact)).onExtraCallback(onextracallbackwithresultOnWarmupCompleted);
                return;
            }
            return;
        }
        onextracallbackwithresultOnWarmupCompleted = null;
        this.onExtraCallback = true;
        this.IAuthTabCallback = true;
        onNavigationEvent((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) this.asBinder);
        if (onextracallbackwithresultOnWarmupCompleted == null) {
        }
    }

    @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda15
    protected BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult IAuthTabCallback(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        return onextracallbackwithresult.onWarmupCompleted(onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback));
    }

    private Object IAuthTabCallback(Object obj) {
        return (this.asBinder.onNavigationEvent == null || !obj.equals(onExtraCallbackWithResult.IAuthTabCallback)) ? obj : this.asBinder.onNavigationEvent;
    }

    private Object onExtraCallbackWithResult(Object obj) {
        return (this.asBinder.onNavigationEvent == null || !this.asBinder.onNavigationEvent.equals(obj)) ? obj : onExtraCallbackWithResult.IAuthTabCallback;
    }

    @RequiresNonNull
    private boolean onExtraCallback(long j) {
        BackdropScaffoldStateExternalSyntheticLambda1 backdropScaffoldStateExternalSyntheticLambda1 = this.onTransact;
        int iIAuthTabCallback = this.asBinder.IAuthTabCallback(backdropScaffoldStateExternalSyntheticLambda1.onExtraCallbackWithResult.onExtraCallback);
        if (iIAuthTabCallback == -1) {
            return false;
        }
        long j2 = this.asBinder.IAuthTabCallback(iIAuthTabCallback, this.onNavigationEvent).IAuthTabCallback;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        backdropScaffoldStateExternalSyntheticLambda1.onWarmupCompleted(j);
        return true;
    }

    static final class onExtraCallbackWithResult extends BackdropScaffoldStateExternalSyntheticLambda2 {
        public static final Object IAuthTabCallback = new Object();
        private final Object onExtraCallback;
        private final Object onNavigationEvent;

        public static onExtraCallbackWithResult IAuthTabCallback(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
            return new onExtraCallbackWithResult(new onExtraCallback(textFieldStateKtExternalSyntheticLambda0), CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback.onNavigationEvent, IAuthTabCallback);
        }

        public static onExtraCallbackWithResult IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, @Nullable Object obj, @Nullable Object obj2) {
            return new onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, obj, obj2);
        }

        private onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, @Nullable Object obj, @Nullable Object obj2) {
            super(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
            this.onExtraCallback = obj;
            this.onNavigationEvent = obj2;
        }

        public onExtraCallbackWithResult onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
            return new onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, this.onExtraCallback, this.onNavigationEvent);
        }

        @Override // o.BackdropScaffoldStateExternalSyntheticLambda2
        public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback onWarmupCompleted(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, long j) {
            this.onExtraCallbackWithResult.onWarmupCompleted(i2, iAuthTabCallback, j);
            if (Objects.equals(iAuthTabCallback.extraCallback, this.onExtraCallback)) {
                iAuthTabCallback.extraCallback = CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback.onNavigationEvent;
            }
            return iAuthTabCallback;
        }

        @Override // o.BackdropScaffoldStateExternalSyntheticLambda2
        public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback IAuthTabCallback(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback, boolean z) {
            this.onExtraCallbackWithResult.IAuthTabCallback(i2, onextracallback, z);
            if (Objects.equals(onextracallback.asBinder, this.onNavigationEvent) && z) {
                onextracallback.asBinder = IAuthTabCallback;
            }
            return onextracallback;
        }

        @Override // o.BackdropScaffoldStateExternalSyntheticLambda2
        public int IAuthTabCallback(Object obj) {
            Object obj2;
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = this.onExtraCallbackWithResult;
            if (IAuthTabCallback.equals(obj) && (obj2 = this.onNavigationEvent) != null) {
                obj = obj2;
            }
            return coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(obj);
        }

        @Override // o.BackdropScaffoldStateExternalSyntheticLambda2
        public Object onNavigationEvent(int i2) {
            Object objOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent(i2);
            return Objects.equals(objOnNavigationEvent, this.onNavigationEvent) ? IAuthTabCallback : objOnNavigationEvent;
        }
    }

    public static final class onExtraCallback extends CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 {
        private final TextFieldStateKtExternalSyntheticLambda0 onExtraCallback;

        public int onExtraCallbackWithResult() {
            return 1;
        }

        public int onWarmupCompleted() {
            return 1;
        }

        public onExtraCallback(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
            this.onExtraCallback = textFieldStateKtExternalSyntheticLambda0;
        }

        public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback onWarmupCompleted(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, long j) {
            iAuthTabCallback.onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback.onNavigationEvent, this.onExtraCallback, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (TextFieldStateKtExternalSyntheticLambda0.onTransact) null, 0L, -9223372036854775807L, 0, 0, 0L);
            iAuthTabCallback.IAuthTabCallbackStub = true;
            return iAuthTabCallback;
        }

        public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback IAuthTabCallback(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback, boolean z) {
            onextracallback.onWarmupCompleted(z ? 0 : null, z ? onExtraCallbackWithResult.IAuthTabCallback : null, 0, -9223372036854775807L, 0L, TextContextMenuHelperApi28ExternalSyntheticLambda7.IAuthTabCallback, true);
            return onextracallback;
        }

        public int IAuthTabCallback(Object obj) {
            return obj == onExtraCallbackWithResult.IAuthTabCallback ? 0 : -1;
        }

        public Object onNavigationEvent(int i2) {
            return onExtraCallbackWithResult.IAuthTabCallback;
        }
    }
}

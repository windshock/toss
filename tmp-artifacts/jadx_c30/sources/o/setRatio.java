package o;

import o.initSingleCardInTwoCardStyleLandscape;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setRatio extends initSingleCardInTwoCardStyleLandscape {
    private final getButtonTextForNewStyleBar onExtraCallbackWithResult;

    public setRatio(getButtonTextForNewStyleBar getbuttontextfornewstylebar) {
        super(new ok21());
        this.onExtraCallbackWithResult = getbuttontextfornewstylebar;
        onWarmupCompleted(new onWarmupCompleted());
    }

    /* renamed from: o.setRatio$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[initSingleCardInTwoCardStyleLandscape.onExtraCallback.values().length];
            onExtraCallback = iArr;
            try {
                iArr[initSingleCardInTwoCardStyleLandscape.onExtraCallback.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallback[initSingleCardInTwoCardStyleLandscape.onExtraCallback.VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallback[initSingleCardInTwoCardStyleLandscape.onExtraCallback.SCOPE_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void asInterface() {
        int i = AnonymousClass5.onExtraCallback[access100().ordinal()];
        if (i == 1) {
            onWarmupCompleted(new onWarmupCompleted(this.onExtraCallbackWithResult, RFEndCardBackUpLayoutycx.DOCUMENT, onTransact()));
            return;
        }
        if (i == 2) {
            onWarmupCompleted(new onWarmupCompleted(new getButtonTextForNewStyleBar(), RFEndCardBackUpLayoutycx.DOCUMENT, onTransact()));
        } else {
            if (i == 3) {
                onWarmupCompleted(new onWarmupCompleted(new getButtonTextForNewStyleBar(), RFEndCardBackUpLayoutycx.SCOPE_DOCUMENT, onTransact()));
                return;
            }
            throw new wie3("Unexpected state " + access100());
        }
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void IAuthTabCallback() {
        jc2 jc2Var = onTransact().onExtraCallbackWithResult;
        onWarmupCompleted(onTransact().onNavigationEvent());
        if (onTransact().onWarmupCompleted() != RFEndCardBackUpLayoutycx.JAVASCRIPT_WITH_SCOPE) {
            if (onTransact().onWarmupCompleted() != RFEndCardBackUpLayoutycx.TOP_LEVEL) {
                onNavigationEvent(jc2Var);
            }
        } else {
            ea4 ea4Var = (ea4) onTransact().onExtraCallbackWithResult;
            onWarmupCompleted(onTransact().onNavigationEvent());
            onNavigationEvent(new getOutline(ea4Var.onExtraCallback(), (getButtonTextForNewStyleBar) jc2Var));
        }
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void IAuthTabCallbackDefault() {
        onWarmupCompleted(new onWarmupCompleted(new initViewsDefault(), RFEndCardBackUpLayoutycx.ARRAY, onTransact()));
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onExtraCallbackWithResult() {
        jc2 jc2Var = onTransact().onExtraCallbackWithResult;
        onWarmupCompleted(onTransact().onNavigationEvent());
        onNavigationEvent(jc2Var);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onNavigationEvent(initOneSlotMultipleAdsLayoutLandscape initoneslotmultipleadslayoutlandscape) {
        onNavigationEvent((jc2) initoneslotmultipleadslayoutlandscape);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void onExtraCallbackWithResult(boolean z) {
        onNavigationEvent(RFEndCardBackUpLayout1.IAuthTabCallback(z));
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onNavigationEvent(long j) {
        onNavigationEvent(new getCnOrEnBtnText(j));
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onExtraCallback(RFEndCardBackUpLayout2 rFEndCardBackUpLayout2) {
        onNavigationEvent(rFEndCardBackUpLayout2);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onNavigationEvent(double d) {
        onNavigationEvent(new getBackupContainerBackgroundView(d));
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onWarmupCompleted(int i) {
        onNavigationEvent(new setWidthAndHeightRatio(i));
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onExtraCallback(long j) {
        onNavigationEvent(new wie5(j));
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onNavigationEvent(Decimal128 decimal128) {
        onNavigationEvent(new ea2(decimal128));
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onWarmupCompleted(String str) {
        onNavigationEvent(new wie4(str));
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void IAuthTabCallback(String str) {
        onWarmupCompleted(new onWarmupCompleted(new ea4(str), RFEndCardBackUpLayoutycx.JAVASCRIPT_WITH_SCOPE, onTransact()));
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onNavigationEvent() {
        onNavigationEvent(new wie6());
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onWarmupCompleted() {
        onNavigationEvent(new wiezb1());
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void asBinder() {
        onNavigationEvent(wiezb.onNavigationEvent);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void onExtraCallback(ObjectId objectId) {
        onNavigationEvent(new ycxdj1(objectId));
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void onExtraCallbackWithResult(ea41 ea41Var) {
        onNavigationEvent((jc2) ea41Var);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void onExtraCallback(String str) {
        onNavigationEvent(new ea4(str));
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void onExtraCallbackWithResult(String str) {
        onNavigationEvent(new htf4(str));
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void onNavigationEvent(p_ p_Var) {
        onNavigationEvent((jc2) p_Var);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void IAuthTabCallbackStub() {
        onNavigationEvent(new jc4());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.initSingleCardInTwoCardStyleLandscape
    /* renamed from: onMessageChannelReady, reason: merged with bridge method [inline-methods] */
    public onWarmupCompleted onTransact() {
        return (onWarmupCompleted) super.onTransact();
    }

    private void onNavigationEvent(jc2 jc2Var) {
        onTransact().onNavigationEvent(jc2Var);
    }

    class onWarmupCompleted extends initSingleCardInTwoCardStyleLandscape.IAuthTabCallback {
        private jc2 onExtraCallbackWithResult;

        onWarmupCompleted(jc2 jc2Var, RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycx, onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted, rFEndCardBackUpLayoutycx);
            this.onExtraCallbackWithResult = jc2Var;
        }

        onWarmupCompleted() {
            super(null, RFEndCardBackUpLayoutycx.TOP_LEVEL);
        }

        void onNavigationEvent(jc2 jc2Var) {
            jc2 jc2Var2 = this.onExtraCallbackWithResult;
            if (jc2Var2 instanceof initViewsDefault) {
                ((initViewsDefault) jc2Var2).add(jc2Var);
            } else {
                ((getButtonTextForNewStyleBar) jc2Var2).put(setRatio.this.IAuthTabCallback_Parcel(), jc2Var);
            }
        }
    }
}

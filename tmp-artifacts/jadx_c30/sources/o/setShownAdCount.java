package o;

import java.util.List;
import java.util.Stack;
import o.initSingleCardInThreeCardStyle;
import o.initSingleCardInTwoCardStyleLandscape;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setShownAdCount extends initSingleCardInTwoCardStyleLandscape {
    private final Stack<Integer> IAuthTabCallback;
    private final dv9 onExtraCallback;
    private final initViewsForVast onNavigationEvent;

    public setShownAdCount(dv9 dv9Var) {
        this(new ok21(), new initViewsForVast(), dv9Var);
    }

    public setShownAdCount(ok21 ok21Var, initViewsForVast initviewsforvast, dv9 dv9Var) {
        this(ok21Var, initviewsforvast, dv9Var, new pmi3());
    }

    public setShownAdCount(ok21 ok21Var, initViewsForVast initviewsforvast, dv9 dv9Var, okzb okzbVar) {
        super(ok21Var, okzbVar);
        Stack<Integer> stack = new Stack<>();
        this.IAuthTabCallback = stack;
        this.onNavigationEvent = initviewsforvast;
        this.onExtraCallback = dv9Var;
        stack.push(Integer.valueOf(initviewsforvast.onNavigationEvent()));
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.initSingleCardInTwoCardStyleLandscape
    /* renamed from: onMessageChannelReady, reason: merged with bridge method [inline-methods] */
    public onExtraCallback onTransact() {
        return (onExtraCallback) super.onTransact();
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void asInterface() {
        if (access100() == initSingleCardInTwoCardStyleLandscape.onExtraCallback.VALUE) {
            this.onExtraCallback.onWarmupCompleted(t_.DOCUMENT.getValue());
            onPostMessage();
        }
        onWarmupCompleted(new onExtraCallback(onTransact(), RFEndCardBackUpLayoutycx.DOCUMENT, this.onExtraCallback.onExtraCallbackWithResult()));
        this.onExtraCallback.onExtraCallbackWithResult(0);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void IAuthTabCallback() {
        this.onExtraCallback.onWarmupCompleted(0);
        onMinimized();
        onWarmupCompleted(onTransact().onNavigationEvent());
        if (onTransact() == null || onTransact().onWarmupCompleted() != RFEndCardBackUpLayoutycx.JAVASCRIPT_WITH_SCOPE) {
            return;
        }
        onMinimized();
        onWarmupCompleted(onTransact().onNavigationEvent());
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void IAuthTabCallbackDefault() {
        this.onExtraCallback.onWarmupCompleted(t_.ARRAY.getValue());
        onPostMessage();
        onWarmupCompleted(new onExtraCallback(onTransact(), RFEndCardBackUpLayoutycx.ARRAY, this.onExtraCallback.onExtraCallbackWithResult()));
        this.onExtraCallback.onExtraCallbackWithResult(0);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onExtraCallbackWithResult() {
        this.onExtraCallback.onWarmupCompleted(0);
        onMinimized();
        onWarmupCompleted(onTransact().onNavigationEvent());
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onNavigationEvent(initOneSlotMultipleAdsLayoutLandscape initoneslotmultipleadslayoutlandscape) {
        this.onExtraCallback.onWarmupCompleted(t_.BINARY.getValue());
        onPostMessage();
        int length = initoneslotmultipleadslayoutlandscape.onNavigationEvent().length;
        byte bOnExtraCallbackWithResult = initoneslotmultipleadslayoutlandscape.onExtraCallbackWithResult();
        initViewsForUGen initviewsforugen = initViewsForUGen.OLD_BINARY;
        if (bOnExtraCallbackWithResult == initviewsforugen.getValue()) {
            length += 4;
        }
        this.onExtraCallback.onExtraCallbackWithResult(length);
        this.onExtraCallback.onWarmupCompleted(initoneslotmultipleadslayoutlandscape.onExtraCallbackWithResult());
        if (initoneslotmultipleadslayoutlandscape.onExtraCallbackWithResult() == initviewsforugen.getValue()) {
            this.onExtraCallback.onExtraCallbackWithResult(length - 4);
        }
        this.onExtraCallback.onExtraCallback(initoneslotmultipleadslayoutlandscape.onNavigationEvent());
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void onExtraCallbackWithResult(boolean z) {
        this.onExtraCallback.onWarmupCompleted(t_.BOOLEAN.getValue());
        onPostMessage();
        this.onExtraCallback.onWarmupCompleted(z ? 1 : 0);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onNavigationEvent(long j) {
        this.onExtraCallback.onWarmupCompleted(t_.DATE_TIME.getValue());
        onPostMessage();
        this.onExtraCallback.onNavigationEvent(j);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onExtraCallback(RFEndCardBackUpLayout2 rFEndCardBackUpLayout2) {
        this.onExtraCallback.onWarmupCompleted(t_.DB_POINTER.getValue());
        onPostMessage();
        this.onExtraCallback.onNavigationEvent(rFEndCardBackUpLayout2.onExtraCallback());
        this.onExtraCallback.onExtraCallback(rFEndCardBackUpLayout2.onExtraCallbackWithResult().onNavigationEvent());
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onNavigationEvent(double d) {
        this.onExtraCallback.onWarmupCompleted(t_.DOUBLE.getValue());
        onPostMessage();
        this.onExtraCallback.IAuthTabCallback(d);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onWarmupCompleted(int i) {
        this.onExtraCallback.onWarmupCompleted(t_.INT32.getValue());
        onPostMessage();
        this.onExtraCallback.onExtraCallbackWithResult(i);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onExtraCallback(long j) {
        this.onExtraCallback.onWarmupCompleted(t_.INT64.getValue());
        onPostMessage();
        this.onExtraCallback.onNavigationEvent(j);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onNavigationEvent(Decimal128 decimal128) {
        this.onExtraCallback.onWarmupCompleted(t_.DECIMAL128.getValue());
        onPostMessage();
        this.onExtraCallback.onNavigationEvent(decimal128.onNavigationEvent());
        this.onExtraCallback.onNavigationEvent(decimal128.onExtraCallbackWithResult());
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onWarmupCompleted(String str) {
        this.onExtraCallback.onWarmupCompleted(t_.JAVASCRIPT.getValue());
        onPostMessage();
        this.onExtraCallback.onNavigationEvent(str);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void IAuthTabCallback(String str) {
        this.onExtraCallback.onWarmupCompleted(t_.JAVASCRIPT_WITH_SCOPE.getValue());
        onPostMessage();
        onWarmupCompleted(new onExtraCallback(onTransact(), RFEndCardBackUpLayoutycx.JAVASCRIPT_WITH_SCOPE, this.onExtraCallback.onExtraCallbackWithResult()));
        this.onExtraCallback.onExtraCallbackWithResult(0);
        this.onExtraCallback.onNavigationEvent(str);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onNavigationEvent() {
        this.onExtraCallback.onWarmupCompleted(t_.MAX_KEY.getValue());
        onPostMessage();
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    protected void onWarmupCompleted() {
        this.onExtraCallback.onWarmupCompleted(t_.MIN_KEY.getValue());
        onPostMessage();
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void asBinder() {
        this.onExtraCallback.onWarmupCompleted(t_.NULL.getValue());
        onPostMessage();
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void onExtraCallback(ObjectId objectId) {
        this.onExtraCallback.onWarmupCompleted(t_.OBJECT_ID.getValue());
        onPostMessage();
        this.onExtraCallback.onExtraCallback(objectId.onNavigationEvent());
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void onExtraCallbackWithResult(ea41 ea41Var) {
        this.onExtraCallback.onWarmupCompleted(t_.REGULAR_EXPRESSION.getValue());
        onPostMessage();
        this.onExtraCallback.onExtraCallbackWithResult(ea41Var.onNavigationEvent());
        this.onExtraCallback.onExtraCallbackWithResult(ea41Var.onWarmupCompleted());
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void onExtraCallback(String str) {
        this.onExtraCallback.onWarmupCompleted(t_.STRING.getValue());
        onPostMessage();
        this.onExtraCallback.onNavigationEvent(str);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void onExtraCallbackWithResult(String str) {
        this.onExtraCallback.onWarmupCompleted(t_.SYMBOL.getValue());
        onPostMessage();
        this.onExtraCallback.onNavigationEvent(str);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void onNavigationEvent(p_ p_Var) {
        this.onExtraCallback.onWarmupCompleted(t_.TIMESTAMP.getValue());
        onPostMessage();
        this.onExtraCallback.onNavigationEvent(p_Var.onWarmupCompleted());
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void IAuthTabCallbackStub() {
        this.onExtraCallback.onWarmupCompleted(t_.UNDEFINED.getValue());
        onPostMessage();
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape, o.jc3
    public void onWarmupCompleted(htfycx htfycxVar) {
        pmi10.onExtraCallbackWithResult("reader", htfycxVar);
        onExtraCallback(htfycxVar, (List<ea3>) null);
    }

    @Override // o.initSingleCardInTwoCardStyleLandscape
    public void onNavigationEvent(htfycx htfycxVar, List<ea3> list) {
        pmi10.onExtraCallbackWithResult("reader", htfycxVar);
        pmi10.onExtraCallbackWithResult("extraElements", list);
        onExtraCallback(htfycxVar, list);
    }

    private void onExtraCallback(htfycx htfycxVar, List<ea3> list) {
        if (!(htfycxVar instanceof setDownloadButtonData)) {
            if (list != null) {
                super.onNavigationEvent(htfycxVar, list);
                return;
            } else {
                super.onWarmupCompleted(htfycxVar);
                return;
            }
        }
        setDownloadButtonData setdownloadbuttondata = (setDownloadButtonData) htfycxVar;
        if (access100() == initSingleCardInTwoCardStyleLandscape.onExtraCallback.VALUE) {
            this.onExtraCallback.onWarmupCompleted(t_.DOCUMENT.getValue());
            onPostMessage();
        }
        dv81 dv81VarAccess200 = setdownloadbuttondata.access200();
        int iOnNavigationEvent = dv81VarAccess200.onNavigationEvent();
        if (iOnNavigationEvent < 5) {
            throw new ycxsya1("Document size must be at least 5");
        }
        int iOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        this.onExtraCallback.onExtraCallbackWithResult(iOnNavigationEvent);
        byte[] bArr = new byte[iOnNavigationEvent - 4];
        dv81VarAccess200.onWarmupCompleted(bArr);
        this.onExtraCallback.onExtraCallback(bArr);
        setdownloadbuttondata.onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
        if (list != null) {
            this.onExtraCallback.onNavigationEvent(r5.onExtraCallbackWithResult() - 1);
            onWarmupCompleted(new onExtraCallback(onTransact(), RFEndCardBackUpLayoutycx.DOCUMENT, iOnExtraCallbackWithResult));
            onExtraCallback(initSingleCardInTwoCardStyleLandscape.onExtraCallback.NAME);
            onWarmupCompleted(list);
            this.onExtraCallback.onWarmupCompleted(0);
            dv9 dv9Var = this.onExtraCallback;
            dv9Var.onExtraCallback(iOnExtraCallbackWithResult, dv9Var.onExtraCallbackWithResult() - iOnExtraCallbackWithResult);
            onWarmupCompleted(onTransact().onNavigationEvent());
        }
        if (onTransact() == null) {
            onExtraCallback(initSingleCardInTwoCardStyleLandscape.onExtraCallback.DONE);
        } else {
            if (onTransact().onWarmupCompleted() == RFEndCardBackUpLayoutycx.JAVASCRIPT_WITH_SCOPE) {
                onMinimized();
                onWarmupCompleted(onTransact().onNavigationEvent());
            }
            onExtraCallback(IAuthTabCallbackStubProxy());
        }
        onExtraCallbackWithResult(this.onExtraCallback.onExtraCallbackWithResult() - iOnExtraCallbackWithResult);
    }

    private void onPostMessage() {
        if (onTransact().onWarmupCompleted() == RFEndCardBackUpLayoutycx.ARRAY) {
            this.onExtraCallback.onExtraCallbackWithResult(Integer.toString(onExtraCallback.onNavigationEvent(onTransact())));
        } else {
            this.onExtraCallback.onExtraCallbackWithResult(IAuthTabCallback_Parcel());
        }
    }

    private void onMinimized() {
        int iOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult() - onTransact().onExtraCallback;
        onExtraCallbackWithResult(iOnExtraCallbackWithResult);
        dv9 dv9Var = this.onExtraCallback;
        dv9Var.onExtraCallback(dv9Var.onExtraCallbackWithResult() - iOnExtraCallbackWithResult, iOnExtraCallbackWithResult);
    }

    private void onExtraCallbackWithResult(int i) {
        if (i <= this.IAuthTabCallback.peek().intValue()) {
            return;
        }
        throw new wiesya1(String.format("Document size of %d is larger than maximum of %d.", Integer.valueOf(i), this.IAuthTabCallback.peek()));
    }

    protected class onExtraCallback extends initSingleCardInTwoCardStyleLandscape.IAuthTabCallback {
        private final int onExtraCallback;
        private int onExtraCallbackWithResult;

        static /* synthetic */ int onNavigationEvent(onExtraCallback onextracallback) {
            int i = onextracallback.onExtraCallbackWithResult;
            onextracallback.onExtraCallbackWithResult = i + 1;
            return i;
        }

        public onExtraCallback(onExtraCallback onextracallback, RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycx, int i) {
            super(onextracallback, rFEndCardBackUpLayoutycx);
            this.onExtraCallback = i;
        }

        @Override // o.initSingleCardInTwoCardStyleLandscape.IAuthTabCallback
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public onExtraCallback onNavigationEvent() {
            return (onExtraCallback) super.onNavigationEvent();
        }
    }
}

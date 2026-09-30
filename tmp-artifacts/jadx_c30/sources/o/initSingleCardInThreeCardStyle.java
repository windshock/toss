package o;

import java.util.Arrays;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class initSingleCardInThreeCardStyle implements htfycx {
    private IAuthTabCallback IAuthTabCallback;
    private t_ onExtraCallback;
    private String onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private onExtraCallback onWarmupCompleted = onExtraCallback.INITIAL;

    public enum onExtraCallback {
        INITIAL,
        TYPE,
        NAME,
        VALUE,
        SCOPE_DOCUMENT,
        END_OF_DOCUMENT,
        END_OF_ARRAY,
        DONE,
        CLOSED
    }

    protected abstract RFEndCardBackUpLayout2 IAuthTabCallback();

    protected abstract void IAuthTabCallbackDefault();

    protected abstract long IAuthTabCallbackStub();

    protected abstract void IAuthTabCallbackStubProxy();

    protected abstract ObjectId IAuthTabCallback_Parcel();

    protected abstract void ICustomTabsCallback();

    @Override // o.htfycx
    public abstract t_ ICustomTabsCallbackStub();

    protected abstract String access000();

    protected abstract ea41 access100();

    protected abstract double asBinder();

    protected abstract void asInterface();

    protected abstract String extraCallback();

    protected abstract p_ extraCallbackWithResult();

    protected abstract String getInterfaceDescriptor();

    protected abstract boolean onExtraCallback();

    protected abstract Decimal128 onExtraCallbackWithResult();

    protected abstract long onNavigationEvent();

    protected abstract int onTransact();

    protected abstract initOneSlotMultipleAdsLayoutLandscape onWarmupCompleted();

    protected abstract String readTypedObject();

    protected abstract void writeTypedObject();

    protected initSingleCardInThreeCardStyle() {
    }

    @Override // o.htfycx
    public t_ onActivityLayout() {
        return this.onExtraCallback;
    }

    protected void onExtraCallback(t_ t_Var) {
        this.onExtraCallback = t_Var;
    }

    public onExtraCallback onPostMessage() {
        return this.onWarmupCompleted;
    }

    protected void onWarmupCompleted(onExtraCallback onextracallback) {
        this.onWarmupCompleted = onextracallback;
    }

    protected void IAuthTabCallback(String str) {
        this.onExtraCallbackWithResult = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.onNavigationEvent = true;
    }

    protected boolean onActivityResized() {
        return this.onNavigationEvent;
    }

    @Override // o.htfycx
    public initOneSlotMultipleAdsLayoutLandscape ICustomTabsCallbackDefault() {
        onExtraCallback("readBinaryData", t_.BINARY);
        onWarmupCompleted(onMinimized());
        return onWarmupCompleted();
    }

    @Override // o.htfycx
    public boolean onRelationshipValidationResult() {
        onExtraCallback("readBoolean", t_.BOOLEAN);
        onWarmupCompleted(onMinimized());
        return onExtraCallback();
    }

    @Override // o.htfycx
    public long onUnminimized() {
        onExtraCallback("readDateTime", t_.DATE_TIME);
        onWarmupCompleted(onMinimized());
        return onNavigationEvent();
    }

    @Override // o.htfycx
    public double ICustomTabsCallback_Parcel() {
        onExtraCallback("readDouble", t_.DOUBLE);
        onWarmupCompleted(onMinimized());
        return asBinder();
    }

    @Override // o.htfycx
    public void ICustomTabsService() {
        if (onActivityResized()) {
            throw new IllegalStateException("BSONBinaryWriter");
        }
        RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycxOnNavigationEvent = onMessageChannelReady().onNavigationEvent();
        RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycx = RFEndCardBackUpLayoutycx.ARRAY;
        if (rFEndCardBackUpLayoutycxOnNavigationEvent != rFEndCardBackUpLayoutycx) {
            onNavigationEvent("readEndArray", onMessageChannelReady().onNavigationEvent(), rFEndCardBackUpLayoutycx);
        }
        if (onPostMessage() == onExtraCallback.TYPE) {
            ICustomTabsCallbackStub();
        }
        onExtraCallback onextracallbackOnPostMessage = onPostMessage();
        onExtraCallback onextracallback = onExtraCallback.END_OF_ARRAY;
        if (onextracallbackOnPostMessage != onextracallback) {
            onExtraCallbackWithResult("ReadEndArray", onextracallback);
        }
        IAuthTabCallbackDefault();
        ICustomTabsServiceStubProxy();
    }

    @Override // o.htfycx
    public void extraCommand() {
        if (onActivityResized()) {
            throw new IllegalStateException("BSONBinaryWriter");
        }
        RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycxOnNavigationEvent = onMessageChannelReady().onNavigationEvent();
        RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycx = RFEndCardBackUpLayoutycx.DOCUMENT;
        if (rFEndCardBackUpLayoutycxOnNavigationEvent != rFEndCardBackUpLayoutycx) {
            RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycxOnNavigationEvent2 = onMessageChannelReady().onNavigationEvent();
            RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycx2 = RFEndCardBackUpLayoutycx.SCOPE_DOCUMENT;
            if (rFEndCardBackUpLayoutycxOnNavigationEvent2 != rFEndCardBackUpLayoutycx2) {
                onNavigationEvent("readEndDocument", onMessageChannelReady().onNavigationEvent(), rFEndCardBackUpLayoutycx, rFEndCardBackUpLayoutycx2);
            }
        }
        if (onPostMessage() == onExtraCallback.TYPE) {
            ICustomTabsCallbackStub();
        }
        onExtraCallback onextracallbackOnPostMessage = onPostMessage();
        onExtraCallback onextracallback = onExtraCallback.END_OF_DOCUMENT;
        if (onextracallbackOnPostMessage != onextracallback) {
            onExtraCallbackWithResult("readEndDocument", onextracallback);
        }
        asInterface();
        ICustomTabsServiceStubProxy();
    }

    @Override // o.htfycx
    public int mayLaunchUrl() {
        onExtraCallback("readInt32", t_.INT32);
        onWarmupCompleted(onMinimized());
        return onTransact();
    }

    @Override // o.htfycx
    public long postMessage() {
        onExtraCallback("readInt64", t_.INT64);
        onWarmupCompleted(onMinimized());
        return IAuthTabCallbackStub();
    }

    @Override // o.htfycx
    public Decimal128 isEngagementSignalsApiAvailable() {
        onExtraCallback("readDecimal", t_.DECIMAL128);
        onWarmupCompleted(onMinimized());
        return onExtraCallbackWithResult();
    }

    @Override // o.htfycx
    public String newSession() {
        onExtraCallback("readJavaScript", t_.JAVASCRIPT);
        onWarmupCompleted(onMinimized());
        return getInterfaceDescriptor();
    }

    @Override // o.htfycx
    public String prefetch() {
        onExtraCallback("readJavaScriptWithScope", t_.JAVASCRIPT_WITH_SCOPE);
        onWarmupCompleted(onExtraCallback.SCOPE_DOCUMENT);
        return access000();
    }

    @Override // o.htfycx
    public void newSessionWithExtras() {
        onExtraCallback("readMaxKey", t_.MAX_KEY);
        onWarmupCompleted(onMinimized());
    }

    @Override // o.htfycx
    public void newAuthTabSession() {
        onExtraCallback("readMinKey", t_.MIN_KEY);
        onWarmupCompleted(onMinimized());
    }

    @Override // o.htfycx
    public void setEngagementSignalsCallback() {
        onExtraCallback("readNull", t_.NULL);
        onWarmupCompleted(onMinimized());
    }

    @Override // o.htfycx
    public ObjectId receiveFile() {
        onExtraCallback("readObjectId", t_.OBJECT_ID);
        onWarmupCompleted(onMinimized());
        return IAuthTabCallback_Parcel();
    }

    @Override // o.htfycx
    public ea41 requestPostMessageChannel() {
        onExtraCallback("readRegularExpression", t_.REGULAR_EXPRESSION);
        onWarmupCompleted(onMinimized());
        return access100();
    }

    @Override // o.htfycx
    public RFEndCardBackUpLayout2 ICustomTabsCallbackStubProxy() {
        onExtraCallback("readDBPointer", t_.DB_POINTER);
        onWarmupCompleted(onMinimized());
        return IAuthTabCallback();
    }

    @Override // o.htfycx
    public void prefetchWithMultipleUrls() {
        onExtraCallback("readStartArray", t_.ARRAY);
        IAuthTabCallbackStubProxy();
        onWarmupCompleted(onExtraCallback.TYPE);
    }

    @Override // o.htfycx
    public void warmup() {
        onExtraCallback("readStartDocument", t_.DOCUMENT);
        ICustomTabsCallback();
        onWarmupCompleted(onExtraCallback.TYPE);
    }

    @Override // o.htfycx
    public String ICustomTabsServiceStub() {
        onExtraCallback("readString", t_.STRING);
        onWarmupCompleted(onMinimized());
        return readTypedObject();
    }

    @Override // o.htfycx
    public String updateVisuals() {
        onExtraCallback("readSymbol", t_.SYMBOL);
        onWarmupCompleted(onMinimized());
        return extraCallback();
    }

    @Override // o.htfycx
    public p_ validateRelationship() {
        onExtraCallback("readTimestamp", t_.TIMESTAMP);
        onWarmupCompleted(onMinimized());
        return extraCallbackWithResult();
    }

    @Override // o.htfycx
    public void ICustomTabsServiceDefault() {
        onExtraCallback("readUndefined", t_.UNDEFINED);
        onWarmupCompleted(onMinimized());
    }

    public void IEngagementSignalsCallback() {
        if (onActivityResized()) {
            throw new IllegalStateException("This instance has been closed");
        }
        onExtraCallback onextracallbackOnPostMessage = onPostMessage();
        onExtraCallback onextracallback = onExtraCallback.NAME;
        if (onextracallbackOnPostMessage != onextracallback) {
            onExtraCallbackWithResult("skipName", onextracallback);
        }
        onWarmupCompleted(onExtraCallback.VALUE);
    }

    public void ICustomTabsService_Parcel() {
        if (onActivityResized()) {
            throw new IllegalStateException("BSONBinaryWriter");
        }
        onExtraCallback onextracallbackOnPostMessage = onPostMessage();
        onExtraCallback onextracallback = onExtraCallback.VALUE;
        if (onextracallbackOnPostMessage != onextracallback) {
            onExtraCallbackWithResult("skipValue", onextracallback);
        }
        writeTypedObject();
        onWarmupCompleted(onExtraCallback.TYPE);
    }

    @Override // o.htfycx
    public String requestPostMessageChannelWithExtras() {
        if (this.onWarmupCompleted == onExtraCallback.TYPE) {
            ICustomTabsCallbackStub();
        }
        onExtraCallback onextracallback = this.onWarmupCompleted;
        onExtraCallback onextracallback2 = onExtraCallback.NAME;
        if (onextracallback != onextracallback2) {
            onExtraCallbackWithResult("readName", onextracallback2);
        }
        this.onWarmupCompleted = onExtraCallback.VALUE;
        return this.onExtraCallbackWithResult;
    }

    protected void onNavigationEvent(String str, RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycx, RFEndCardBackUpLayoutycx... rFEndCardBackUpLayoutycxArr) {
        throw new wie3(String.format("%s can only be called when ContextType is %s, not when ContextType is %s.", str, pmi31.onExtraCallbackWithResult(" or ", Arrays.asList(rFEndCardBackUpLayoutycxArr)), rFEndCardBackUpLayoutycx));
    }

    protected void onExtraCallbackWithResult(String str, onExtraCallback... onextracallbackArr) {
        throw new wie3(String.format("%s can only be called when State is %s, not when State is %s.", str, pmi31.onExtraCallbackWithResult(" or ", Arrays.asList(onextracallbackArr)), this.onWarmupCompleted));
    }

    protected void onNavigationEvent(String str, t_ t_Var) {
        onExtraCallback onextracallback = this.onWarmupCompleted;
        if (onextracallback == onExtraCallback.INITIAL || onextracallback == onExtraCallback.SCOPE_DOCUMENT || onextracallback == onExtraCallback.TYPE) {
            ICustomTabsCallbackStub();
        }
        if (this.onWarmupCompleted == onExtraCallback.NAME) {
            IEngagementSignalsCallback();
        }
        onExtraCallback onextracallback2 = this.onWarmupCompleted;
        onExtraCallback onextracallback3 = onExtraCallback.VALUE;
        if (onextracallback2 != onextracallback3) {
            onExtraCallbackWithResult(str, onextracallback3);
        }
        t_ t_Var2 = this.onExtraCallback;
        if (t_Var2 != t_Var) {
            throw new wie3(String.format("%s can only be called when CurrentBSONType is %s, not when CurrentBSONType is %s.", str, t_Var, t_Var2));
        }
    }

    protected void onExtraCallback(String str, t_ t_Var) {
        if (onActivityResized()) {
            throw new IllegalStateException("BsonWriter is closed");
        }
        onNavigationEvent(str, t_Var);
    }

    protected IAuthTabCallback onMessageChannelReady() {
        return this.IAuthTabCallback;
    }

    protected void onNavigationEvent(IAuthTabCallback iAuthTabCallback) {
        this.IAuthTabCallback = iAuthTabCallback;
    }

    /* renamed from: o.initSingleCardInThreeCardStyle$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[RFEndCardBackUpLayoutycx.values().length];
            IAuthTabCallback = iArr;
            try {
                iArr[RFEndCardBackUpLayoutycx.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IAuthTabCallback[RFEndCardBackUpLayoutycx.DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IAuthTabCallback[RFEndCardBackUpLayoutycx.SCOPE_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IAuthTabCallback[RFEndCardBackUpLayoutycx.TOP_LEVEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    protected onExtraCallback onMinimized() {
        int i = AnonymousClass4.IAuthTabCallback[this.IAuthTabCallback.onNavigationEvent().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return onExtraCallback.TYPE;
        }
        if (i == 4) {
            return onExtraCallback.DONE;
        }
        throw new initSingleCardInTwoCardStyle(String.format("Unexpected ContextType %s.", this.IAuthTabCallback.onNavigationEvent()));
    }

    private void ICustomTabsServiceStubProxy() {
        int i = AnonymousClass4.IAuthTabCallback[onMessageChannelReady().onNavigationEvent().ordinal()];
        if (i == 1 || i == 2) {
            onWarmupCompleted(onExtraCallback.TYPE);
        } else {
            if (i == 4) {
                onWarmupCompleted(onExtraCallback.DONE);
                return;
            }
            throw new initSingleCardInTwoCardStyle(String.format("Unexpected ContextType %s.", onMessageChannelReady().onNavigationEvent()));
        }
    }

    protected abstract class IAuthTabCallback {
        private final RFEndCardBackUpLayoutycx IAuthTabCallback;
        private final IAuthTabCallback onExtraCallback;

        protected IAuthTabCallback(IAuthTabCallback iAuthTabCallback, RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycx) {
            this.onExtraCallback = iAuthTabCallback;
            this.IAuthTabCallback = rFEndCardBackUpLayoutycx;
        }

        protected IAuthTabCallback onWarmupCompleted() {
            return this.onExtraCallback;
        }

        protected RFEndCardBackUpLayoutycx onNavigationEvent() {
            return this.IAuthTabCallback;
        }
    }
}

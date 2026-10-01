package o;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.util.RequestPayload;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class getViewLifecycleOwner implements Closeable {
    public static final r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<isAdded> onNavigationEvent = r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo.onNavigationEvent(isAdded.values());
    public int IAuthTabCallback;
    protected transient RequestPayload onExtraCallback;

    public enum IAuthTabCallback {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public abstract String IAuthTabCallback(String str) throws IOException;

    public getViewLifecycleOwner IAuthTabCallback(int i2, int i3) {
        return this;
    }

    public abstract BigInteger IAuthTabCallbackStub() throws IOException;

    public abstract getTargetRequestCode ICustomTabsCallback();

    public abstract Number ICustomTabsCallbackDefault() throws IOException;

    public Object ICustomTabsCallbackStubProxy() throws IOException {
        return null;
    }

    public abstract int ICustomTabsCallback_Parcel() throws IOException;

    public abstract char[] ICustomTabsService() throws IOException;

    public boolean ICustomTabsService_Parcel() {
        return false;
    }

    @Deprecated
    public abstract getSharedElementTargetNames access000();

    public abstract getViewLifecycleOwnerLiveData access100();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public abstract double extraCallback() throws IOException;

    public abstract BigDecimal extraCallbackWithResult() throws IOException;

    public abstract String mayLaunchUrl() throws IOException;

    public Object newAuthTabSession() throws IOException {
        return null;
    }

    public abstract int newSession() throws IOException;

    @Deprecated
    public abstract getSharedElementTargetNames newSessionWithExtras();

    public abstract float onActivityLayout() throws IOException;

    public Object onActivityResized() throws IOException {
        return null;
    }

    public long onExtraCallback(long j) throws IOException {
        return j;
    }

    public abstract void onExtraCallback();

    public abstract boolean onExtraCallback(int i2);

    public abstract byte[] onExtraCallback(getPostOnViewCreatedAlpha getpostonviewcreatedalpha) throws IOException;

    public boolean onExtraCallbackWithResult() {
        return false;
    }

    public abstract boolean onExtraCallbackWithResult(getTargetRequestCode gettargetrequestcode);

    public abstract int onMessageChannelReady() throws IOException;

    public abstract IAuthTabCallback onMinimized() throws IOException;

    public boolean onNavigationEvent() {
        return false;
    }

    public abstract long onPostMessage() throws IOException;

    public abstract getUserVisibleHint onUnminimized();

    public int onWarmupCompleted(int i2) throws IOException {
        return i2;
    }

    public abstract boolean prefetchWithMultipleUrls();

    @Deprecated
    public abstract int readTypedObject();

    public abstract boolean requestPostMessageChannelWithExtras();

    public boolean updateVisuals() throws IOException {
        return false;
    }

    public abstract getTargetRequestCode validateRelationship() throws IOException;

    public abstract getViewLifecycleOwner writeTypedList() throws IOException;

    @Deprecated
    public abstract String writeTypedObject() throws IOException;

    public enum onExtraCallbackWithResult {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(false),
        USE_FAST_DOUBLE_PARSER(false),
        USE_FAST_BIG_NUMBER_PARSER(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        public static int collectDefaults() {
            int mask = 0;
            for (onExtraCallbackWithResult onextracallbackwithresult : values()) {
                if (onextracallbackwithresult.enabledByDefault()) {
                    mask |= onextracallbackwithresult.getMask();
                }
            }
            return mask;
        }

        onExtraCallbackWithResult(boolean z) {
            this._defaultState = z;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i2) {
            return (i2 & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public getViewLifecycleOwner() {
        this.IAuthTabCallback = getReturnTransition.onWarmupCompleted;
    }

    public getViewLifecycleOwner(int i2) {
        this.IAuthTabCallback = i2;
    }

    public isDetached access200() {
        return isDetached.IAuthTabCallback();
    }

    public void onNavigationEvent(getRetainInstance getretaininstance) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + getretaininstance.IAuthTabCallback() + "'");
    }

    public r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<isAdded> isEngagementSignalsApiAvailable() {
        return onNavigationEvent;
    }

    public getSharedElementTargetNames onWarmupCompleted() {
        return access000();
    }

    public getSharedElementTargetNames IAuthTabCallbackDefault() {
        return newSessionWithExtras();
    }

    public void onExtraCallback(Object obj) {
        getUserVisibleHint getuservisiblehintOnUnminimized = onUnminimized();
        if (getuservisiblehintOnUnminimized != null) {
            getuservisiblehintOnUnminimized.onWarmupCompleted(obj);
        }
    }

    public boolean IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult) {
        return onextracallbackwithresult.enabledIn(this.IAuthTabCallback);
    }

    public boolean onNavigationEvent(isPostponed ispostponed) {
        return ispostponed.mappedFeature().enabledIn(this.IAuthTabCallback);
    }

    @Deprecated
    public getViewLifecycleOwner onExtraCallbackWithResult(int i2) {
        this.IAuthTabCallback = i2;
        return this;
    }

    public getViewLifecycleOwner onExtraCallbackWithResult(int i2, int i3) {
        return onExtraCallbackWithResult((i2 & i3) | ((~i3) & this.IAuthTabCallback));
    }

    public String ICustomTabsServiceDefault() throws IOException {
        if (validateRelationship() == getTargetRequestCode.FIELD_NAME) {
            return asInterface();
        }
        return null;
    }

    public String ICustomTabsServiceStub() throws IOException {
        if (validateRelationship() == getTargetRequestCode.VALUE_STRING) {
            return mayLaunchUrl();
        }
        return null;
    }

    public getTargetRequestCode asBinder() {
        return ICustomTabsCallback();
    }

    public int onTransact() {
        return readTypedObject();
    }

    public boolean receiveFile() {
        return asBinder() == getTargetRequestCode.START_ARRAY;
    }

    public boolean warmup() {
        return asBinder() == getTargetRequestCode.START_OBJECT;
    }

    public boolean setEngagementSignalsCallback() {
        return asBinder() == getTargetRequestCode.VALUE_NUMBER_INT;
    }

    public String asInterface() throws IOException {
        return writeTypedObject();
    }

    public Object ICustomTabsCallbackStub() throws IOException {
        return ICustomTabsCallbackDefault();
    }

    public onNavigationEvent onRelationshipValidationResult() throws IOException {
        IAuthTabCallback iAuthTabCallbackOnMinimized = onMinimized();
        if (iAuthTabCallbackOnMinimized == IAuthTabCallback.BIG_DECIMAL) {
            return onNavigationEvent.BIG_DECIMAL;
        }
        if (iAuthTabCallbackOnMinimized == IAuthTabCallback.DOUBLE) {
            return onNavigationEvent.DOUBLE64;
        }
        if (iAuthTabCallbackOnMinimized == IAuthTabCallback.FLOAT) {
            return onNavigationEvent.FLOAT32;
        }
        return onNavigationEvent.UNKNOWN;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.core.exc.InputCoercionException */
    public byte getInterfaceDescriptor() throws IOException, InputCoercionException {
        int iOnMessageChannelReady = onMessageChannelReady();
        if (iOnMessageChannelReady < -128 || iOnMessageChannelReady > 255) {
            throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java byte", mayLaunchUrl()), getTargetRequestCode.VALUE_NUMBER_INT, Byte.TYPE);
        }
        return (byte) iOnMessageChannelReady;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.core.exc.InputCoercionException */
    public short extraCommand() throws IOException, InputCoercionException {
        int iOnMessageChannelReady = onMessageChannelReady();
        if (iOnMessageChannelReady < -32768 || iOnMessageChannelReady > 32767) {
            throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java short", mayLaunchUrl()), getTargetRequestCode.VALUE_NUMBER_INT, Short.TYPE);
        }
        return (short) iOnMessageChannelReady;
    }

    public boolean IAuthTabCallback_Parcel() throws IOException {
        getTargetRequestCode gettargetrequestcodeAsBinder = asBinder();
        if (gettargetrequestcodeAsBinder == getTargetRequestCode.VALUE_TRUE) {
            return true;
        }
        if (gettargetrequestcodeAsBinder == getTargetRequestCode.VALUE_FALSE) {
            return false;
        }
        throw new JsonParseException(this, String.format("Current token (%s) not of boolean type", gettargetrequestcodeAsBinder)).onExtraCallbackWithResult(this.onExtraCallback);
    }

    public byte[] IAuthTabCallbackStubProxy() throws IOException {
        return onExtraCallback(getPopEnterAnim.onNavigationEvent());
    }

    public int onNavigationEvent(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, OutputStream outputStream) throws IOException {
        IAuthTabCallback();
        return 0;
    }

    public int prefetch() throws IOException {
        return onWarmupCompleted(0);
    }

    public long postMessage() throws IOException {
        return onExtraCallback(0L);
    }

    public String requestPostMessageChannel() throws IOException {
        return IAuthTabCallback((String) null);
    }

    public JsonParseException onExtraCallbackWithResult(String str) {
        return new JsonParseException(this, str).onExtraCallbackWithResult(this.onExtraCallback);
    }

    protected void IAuthTabCallback() {
        throw new UnsupportedOperationException("Operation not supported by parser of type " + getClass().getName());
    }

    public JsonParseException onWarmupCompleted(String str) {
        return onExtraCallbackWithResult(str);
    }

    public JsonParseException onWarmupCompleted(String str, Object obj) {
        return onWarmupCompleted(String.format(str, obj));
    }

    public JsonParseException IAuthTabCallback(String str, Object obj, Object obj2) {
        return onWarmupCompleted(String.format(str, obj, obj2));
    }

    public JsonParseException onWarmupCompleted(String str, Throwable th) {
        JsonParseException jsonParseException = new JsonParseException(this, str, th);
        RequestPayload requestPayload = this.onExtraCallback;
        return requestPayload != null ? jsonParseException.onExtraCallbackWithResult(requestPayload) : jsonParseException;
    }

    public JsonParseException IAuthTabCallback(String str, getSharedElementTargetNames getsharedelementtargetnames) {
        JsonParseException jsonParseException = new JsonParseException(this, str, getsharedelementtargetnames);
        RequestPayload requestPayload = this.onExtraCallback;
        return requestPayload != null ? jsonParseException.onExtraCallbackWithResult(requestPayload) : jsonParseException;
    }
}

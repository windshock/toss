package o;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class noteStateNotSaved extends getViewLifecycleOwner {
    public static final BigDecimal mayLaunchUrl;
    public static final BigDecimal newAuthTabSession;
    public static final BigInteger newSession;
    public static final BigInteger newSessionWithExtras;
    public static final BigDecimal postMessage;
    public static final BigDecimal prefetch;
    public static final BigInteger receiveFile;
    public static final BigInteger requestPostMessageChannel;
    protected getTargetRequestCode ICustomTabsServiceDefault;
    public final isDetached ICustomTabsServiceStub;
    public getTargetRequestCode prefetchWithMultipleUrls;
    protected long updateVisuals;
    protected final boolean warmup;
    public static final byte[] setEngagementSignalsCallback = new byte[0];
    protected static final int[] requestPostMessageChannelWithExtras = new int[0];

    protected abstract void IPostMessageServiceDefault() throws JsonParseException;

    @Override // o.getViewLifecycleOwner
    public abstract String mayLaunchUrl() throws IOException;

    @Override // o.getViewLifecycleOwner
    public abstract getTargetRequestCode validateRelationship() throws IOException;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        receiveFile = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        newSessionWithExtras = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        requestPostMessageChannel = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        newSession = bigIntegerValueOf4;
        newAuthTabSession = new BigDecimal(bigIntegerValueOf3);
        postMessage = new BigDecimal(bigIntegerValueOf4);
        prefetch = new BigDecimal(bigIntegerValueOf);
        mayLaunchUrl = new BigDecimal(bigIntegerValueOf2);
    }

    @Deprecated
    protected noteStateNotSaved() {
        isDetached isdetachedIAuthTabCallback = isDetached.IAuthTabCallback();
        this.ICustomTabsServiceStub = isdetachedIAuthTabCallback;
        this.warmup = isdetachedIAuthTabCallback.onWarmupCompleted();
    }

    public noteStateNotSaved(isDetached isdetached) {
        isdetached = isdetached == null ? isDetached.IAuthTabCallback() : isdetached;
        this.ICustomTabsServiceStub = isdetached;
        this.warmup = isdetached.onWarmupCompleted();
    }

    protected noteStateNotSaved(int i2, isDetached isdetached) {
        super(i2);
        isdetached = isdetached == null ? isDetached.IAuthTabCallback() : isdetached;
        this.ICustomTabsServiceStub = isdetached;
        this.warmup = isdetached.onWarmupCompleted();
    }

    @Override // o.getViewLifecycleOwner
    public isDetached access200() {
        return this.ICustomTabsServiceStub;
    }

    @Override // o.getViewLifecycleOwner
    public getTargetRequestCode asBinder() {
        return this.prefetchWithMultipleUrls;
    }

    @Override // o.getViewLifecycleOwner
    public int onTransact() {
        getTargetRequestCode gettargetrequestcode = this.prefetchWithMultipleUrls;
        if (gettargetrequestcode == null) {
            return 0;
        }
        return gettargetrequestcode.id();
    }

    @Override // o.getViewLifecycleOwner
    public getTargetRequestCode ICustomTabsCallback() {
        return this.prefetchWithMultipleUrls;
    }

    @Override // o.getViewLifecycleOwner
    @Deprecated
    public int readTypedObject() {
        getTargetRequestCode gettargetrequestcode = this.prefetchWithMultipleUrls;
        if (gettargetrequestcode == null) {
            return 0;
        }
        return gettargetrequestcode.id();
    }

    @Override // o.getViewLifecycleOwner
    public boolean requestPostMessageChannelWithExtras() {
        return this.prefetchWithMultipleUrls != null;
    }

    @Override // o.getViewLifecycleOwner
    public boolean onExtraCallback(int i2) {
        getTargetRequestCode gettargetrequestcode = this.prefetchWithMultipleUrls;
        return gettargetrequestcode == null ? i2 == 0 : gettargetrequestcode.id() == i2;
    }

    @Override // o.getViewLifecycleOwner
    public boolean onExtraCallbackWithResult(getTargetRequestCode gettargetrequestcode) {
        return this.prefetchWithMultipleUrls == gettargetrequestcode;
    }

    @Override // o.getViewLifecycleOwner
    public boolean receiveFile() {
        return this.prefetchWithMultipleUrls == getTargetRequestCode.START_ARRAY;
    }

    @Override // o.getViewLifecycleOwner
    public boolean warmup() {
        return this.prefetchWithMultipleUrls == getTargetRequestCode.START_OBJECT;
    }

    @Override // o.getViewLifecycleOwner
    public boolean setEngagementSignalsCallback() {
        return this.prefetchWithMultipleUrls == getTargetRequestCode.VALUE_NUMBER_INT;
    }

    @Override // o.getViewLifecycleOwner
    public getViewLifecycleOwner writeTypedList() throws IOException {
        getTargetRequestCode gettargetrequestcode = this.prefetchWithMultipleUrls;
        if (gettargetrequestcode == getTargetRequestCode.START_OBJECT || gettargetrequestcode == getTargetRequestCode.START_ARRAY) {
            int i2 = 1;
            while (true) {
                getTargetRequestCode gettargetrequestcodeValidateRelationship = validateRelationship();
                if (gettargetrequestcodeValidateRelationship == null) {
                    IPostMessageServiceDefault();
                    return this;
                }
                if (gettargetrequestcodeValidateRelationship.isStructStart()) {
                    i2++;
                } else if (gettargetrequestcodeValidateRelationship.isStructEnd()) {
                    i2--;
                    if (i2 == 0) {
                        break;
                    }
                } else if (gettargetrequestcodeValidateRelationship == getTargetRequestCode.NOT_AVAILABLE) {
                    onExtraCallbackWithResult("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
                }
            }
        }
        return this;
    }

    @Override // o.getViewLifecycleOwner
    public void onExtraCallback() {
        getTargetRequestCode gettargetrequestcode = this.prefetchWithMultipleUrls;
        if (gettargetrequestcode != null) {
            this.ICustomTabsServiceDefault = gettargetrequestcode;
            this.prefetchWithMultipleUrls = null;
        }
    }

    @Override // o.getViewLifecycleOwner
    public int prefetch() throws IOException {
        getTargetRequestCode gettargetrequestcode = this.prefetchWithMultipleUrls;
        if (gettargetrequestcode == getTargetRequestCode.VALUE_NUMBER_INT || gettargetrequestcode == getTargetRequestCode.VALUE_NUMBER_FLOAT) {
            return onMessageChannelReady();
        }
        return onWarmupCompleted(0);
    }

    @Override // o.getViewLifecycleOwner
    public int onWarmupCompleted(int i2) throws IOException {
        getTargetRequestCode gettargetrequestcode = this.prefetchWithMultipleUrls;
        if (gettargetrequestcode == getTargetRequestCode.VALUE_NUMBER_INT || gettargetrequestcode == getTargetRequestCode.VALUE_NUMBER_FLOAT) {
            return onMessageChannelReady();
        }
        if (gettargetrequestcode == null) {
            return i2;
        }
        int iId = gettargetrequestcode.id();
        if (iId == 6) {
            String strMayLaunchUrl = mayLaunchUrl();
            if (onExtraCallback(strMayLaunchUrl)) {
                return 0;
            }
            return requestPermissions.onExtraCallback(strMayLaunchUrl, i2);
        }
        switch (iId) {
            case 9:
                return 1;
            case 10:
            case 11:
                return 0;
            case 12:
                Object objOnActivityResized = onActivityResized();
                return objOnActivityResized instanceof Number ? ((Number) objOnActivityResized).intValue() : i2;
            default:
                return i2;
        }
    }

    @Override // o.getViewLifecycleOwner
    public long postMessage() throws IOException {
        getTargetRequestCode gettargetrequestcode = this.prefetchWithMultipleUrls;
        if (gettargetrequestcode == getTargetRequestCode.VALUE_NUMBER_INT || gettargetrequestcode == getTargetRequestCode.VALUE_NUMBER_FLOAT) {
            return onPostMessage();
        }
        return onExtraCallback(0L);
    }

    @Override // o.getViewLifecycleOwner
    public long onExtraCallback(long j) throws IOException {
        getTargetRequestCode gettargetrequestcode = this.prefetchWithMultipleUrls;
        if (gettargetrequestcode == getTargetRequestCode.VALUE_NUMBER_INT || gettargetrequestcode == getTargetRequestCode.VALUE_NUMBER_FLOAT) {
            return onPostMessage();
        }
        if (gettargetrequestcode == null) {
            return j;
        }
        int iId = gettargetrequestcode.id();
        if (iId == 6) {
            String strMayLaunchUrl = mayLaunchUrl();
            if (onExtraCallback(strMayLaunchUrl)) {
                return 0L;
            }
            return requestPermissions.onExtraCallback(strMayLaunchUrl, j);
        }
        switch (iId) {
            case 9:
                return 1L;
            case 10:
            case 11:
                return 0L;
            case 12:
                Object objOnActivityResized = onActivityResized();
                return objOnActivityResized instanceof Number ? ((Number) objOnActivityResized).longValue() : j;
            default:
                return j;
        }
    }

    @Override // o.getViewLifecycleOwner
    public String requestPostMessageChannel() throws IOException {
        return IAuthTabCallback((String) null);
    }

    @Override // o.getViewLifecycleOwner
    public String IAuthTabCallback(String str) throws IOException {
        getTargetRequestCode gettargetrequestcode = this.prefetchWithMultipleUrls;
        if (gettargetrequestcode == getTargetRequestCode.VALUE_STRING) {
            return mayLaunchUrl();
        }
        if (gettargetrequestcode == getTargetRequestCode.FIELD_NAME) {
            return asInterface();
        }
        return (gettargetrequestcode == null || gettargetrequestcode == getTargetRequestCode.VALUE_NULL || !gettargetrequestcode.isScalarValue()) ? str : mayLaunchUrl();
    }

    public void onExtraCallbackWithResult(String str, startPostponedEnterTransition startpostponedentertransition, getPostOnViewCreatedAlpha getpostonviewcreatedalpha) throws IOException {
        try {
            getpostonviewcreatedalpha.onWarmupCompleted(str, startpostponedentertransition);
        } catch (IllegalArgumentException e) {
            onTransact(e.getMessage());
        }
    }

    protected boolean onExtraCallback(String str) {
        return "null".equals(str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.core.exc.InputCoercionException */
    protected void onNavigationEvent(String str, getTargetRequestCode gettargetrequestcode, Class<?> cls) throws InputCoercionException {
        throw new InputCoercionException(this, str, gettargetrequestcode, cls);
    }

    public void ITrustedWebActivityService_Parcel() throws JsonEOFException, JsonParseException {
        onExtraCallbackWithResult(" in " + this.prefetchWithMultipleUrls, this.prefetchWithMultipleUrls);
    }

    public void onWarmupCompleted(getTargetRequestCode gettargetrequestcode) throws JsonEOFException, JsonParseException {
        String str;
        if (gettargetrequestcode == getTargetRequestCode.VALUE_STRING) {
            str = " in a String value";
        } else if (gettargetrequestcode == getTargetRequestCode.VALUE_NUMBER_INT || gettargetrequestcode == getTargetRequestCode.VALUE_NUMBER_FLOAT) {
            str = " in a Number value";
        } else {
            str = " in a value";
        }
        onExtraCallbackWithResult(str, gettargetrequestcode);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.core.io.JsonEOFException */
    public void onExtraCallbackWithResult(String str, getTargetRequestCode gettargetrequestcode) throws JsonEOFException, JsonParseException {
        throw new JsonEOFException(this, gettargetrequestcode, "Unexpected end-of-input" + str);
    }

    public void IAuthTabCallbackStub(String str) throws JsonParseException {
        throw onWarmupCompleted("Invalid numeric value: " + str);
    }

    public void asBinder(int i2) throws JsonEOFException, JsonParseException {
        IAuthTabCallback(i2, "Expected space separating root-level values");
    }

    public void RemoteActionCompatParcelizer() throws IOException, InputCoercionException {
        asBinder(mayLaunchUrl());
    }

    protected void asBinder(String str) throws IOException, InputCoercionException {
        onNavigationEvent(str, asBinder());
    }

    protected void onNavigationEvent(String str, getTargetRequestCode gettargetrequestcode) throws IOException, InputCoercionException {
        onNavigationEvent(String.format("Numeric value (%s) out of range of int (%d - %s)", onNavigationEvent(str), Integer.MIN_VALUE, Integer.MAX_VALUE), gettargetrequestcode, Integer.TYPE);
    }

    public void ITrustedWebActivityServiceStubProxy() throws IOException, InputCoercionException {
        asInterface(mayLaunchUrl());
    }

    protected void asInterface(String str) throws IOException, InputCoercionException {
        onExtraCallback(str, asBinder());
    }

    protected void onExtraCallback(String str, getTargetRequestCode gettargetrequestcode) throws IOException, InputCoercionException {
        onNavigationEvent(String.format("Numeric value (%s) out of range of long (%d - %s)", onNavigationEvent(str), Long.MIN_VALUE, Long.MAX_VALUE), gettargetrequestcode, Long.TYPE);
    }

    protected String onNavigationEvent(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    protected String IAuthTabCallbackDefault(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    public void IAuthTabCallback(int i2, String str) throws JsonEOFException, JsonParseException {
        if (i2 < 0) {
            ITrustedWebActivityService_Parcel();
        }
        String str2 = String.format("Unexpected character (%s)", onNavigationEvent(i2));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw IAuthTabCallback(str2, notifyNotificationWithChannel());
    }

    public <T> T onExtraCallback(int i2, String str) throws JsonParseException {
        String str2 = String.format("Unexpected character (%s) in numeric value", onNavigationEvent(i2));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw IAuthTabCallback(str2, notifyNotificationWithChannel());
    }

    public void asInterface(int i2) throws JsonParseException {
        throw onWarmupCompleted("Illegal character (" + onNavigationEvent((char) i2) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    public final JsonParseException onNavigationEvent(String str, Throwable th) {
        return onWarmupCompleted(str, th);
    }

    protected getSharedElementTargetNames notifyNotificationWithChannel() {
        return onWarmupCompleted();
    }

    protected static final String onNavigationEvent(int i2) {
        char c = (char) i2;
        if (Character.isISOControl(c)) {
            return "(CTRL-CHAR, code " + i2 + ")";
        }
        if (i2 > 255) {
            return "'" + c + "' (code " + i2 + " / 0x" + Integer.toHexString(i2) + ")";
        }
        return "'" + c + "' (code " + i2 + ")";
    }

    public final void onTransact(String str) throws JsonParseException {
        throw onWarmupCompleted(str);
    }

    public final void onExtraCallbackWithResult(String str, Object obj) throws JsonParseException {
        throw onWarmupCompleted(str, obj);
    }

    public final void onNavigationEvent(String str, Object obj, Object obj2) throws JsonParseException {
        throw IAuthTabCallback(str, obj, obj2);
    }

    public final void read() {
        getSupportLoaderManager.onWarmupCompleted();
    }

    public final void onExtraCallback(String str, Throwable th) throws JsonParseException {
        throw onWarmupCompleted(str, th);
    }

    public final getTargetRequestCode IAuthTabCallback(getTargetRequestCode gettargetrequestcode) throws StreamConstraintsException {
        this.prefetchWithMultipleUrls = gettargetrequestcode;
        if (this.warmup) {
            isDetached isdetached = this.ICustomTabsServiceStub;
            long j = this.updateVisuals + 1;
            this.updateVisuals = j;
            isdetached.IAuthTabCallback(j);
        }
        return gettargetrequestcode;
    }

    public final getTargetRequestCode ITrustedWebActivityServiceStub() {
        this.prefetchWithMultipleUrls = null;
        return null;
    }
}

package o;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import o.getViewLifecycleOwner;
import o.setRetainInstance;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class getView implements Closeable, Flushable {
    protected static final r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<isInBackStack> IAuthTabCallback;
    protected static final r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<isInBackStack> onNavigationEvent;
    public static final r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<isInBackStack> onWarmupCompleted;
    public initState onExtraCallback;

    @Deprecated
    public abstract getView IAuthTabCallback(int i2);

    public getView IAuthTabCallback(int i2, int i3) {
        return this;
    }

    public getView IAuthTabCallback(performStart performstart) {
        return this;
    }

    public abstract void IAuthTabCallback(BigDecimal bigDecimal) throws IOException;

    public abstract void IAuthTabCallback(char[] cArr, int i2, int i3) throws IOException;

    public abstract int IAuthTabCallbackDefault();

    public abstract void IAuthTabCallbackStub(String str) throws IOException;

    public abstract void IAuthTabCallbackStubProxy() throws IOException;

    public abstract void IAuthTabCallback_Parcel() throws IOException;

    public abstract void access000() throws IOException;

    public abstract void access100() throws IOException;

    public abstract void asBinder(String str) throws IOException;

    public abstract void asInterface(String str) throws IOException;

    public boolean asInterface() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    @Override // java.io.Flushable
    public abstract void flush() throws IOException;

    public abstract void getInterfaceDescriptor() throws IOException;

    public getView onExtraCallback(int i2) {
        return this;
    }

    public abstract void onExtraCallback(long j) throws IOException;

    public boolean onExtraCallback() {
        return true;
    }

    public abstract int onExtraCallbackWithResult(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, InputStream inputStream, int i2) throws IOException;

    public abstract void onExtraCallbackWithResult(double d) throws IOException;

    public abstract void onExtraCallbackWithResult(int i2) throws IOException;

    public abstract void onExtraCallbackWithResult(Object obj) throws IOException;

    public abstract void onExtraCallbackWithResult(String str) throws IOException;

    public abstract void onExtraCallbackWithResult(BigInteger bigInteger) throws IOException;

    public abstract void onExtraCallbackWithResult(hasOptionsMenu hasoptionsmenu) throws IOException;

    public boolean onExtraCallbackWithResult() {
        return false;
    }

    public abstract boolean onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback);

    public abstract void onNavigationEvent(float f) throws IOException;

    public abstract void onNavigationEvent(hasOptionsMenu hasoptionsmenu) throws IOException;

    public abstract void onNavigationEvent(char[] cArr, int i2, int i3) throws IOException;

    public boolean onNavigationEvent() {
        return false;
    }

    public abstract getUserVisibleHint onTransact();

    public abstract void onTransact(String str) throws IOException;

    public abstract getView onWarmupCompleted(IAuthTabCallback iAuthTabCallback);

    public abstract void onWarmupCompleted(char c) throws IOException;

    public abstract void onWarmupCompleted(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, byte[] bArr, int i2, int i3) throws IOException;

    public abstract void onWarmupCompleted(boolean z) throws IOException;

    static {
        r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<isInBackStack> r8lambda4rohas4o6f2wophkvhomrg_7bzoOnNavigationEvent = r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo.onNavigationEvent(isInBackStack.values());
        onNavigationEvent = r8lambda4rohas4o6f2wophkvhomrg_7bzoOnNavigationEvent;
        onWarmupCompleted = r8lambda4rohas4o6f2wophkvhomrg_7bzoOnNavigationEvent.onExtraCallbackWithResult(isInBackStack.CAN_WRITE_FORMATTED_NUMBERS);
        IAuthTabCallback = r8lambda4rohas4o6f2wophkvhomrg_7bzoOnNavigationEvent.onExtraCallbackWithResult(isInBackStack.CAN_WRITE_BINARY_NATIVELY);
    }

    public enum IAuthTabCallback {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false),
        USE_FAST_DOUBLE_WRITER(false),
        WRITE_HEX_UPPER_CASE(true),
        ESCAPE_FORWARD_SLASHES(false),
        COMBINE_UNICODE_SURROGATES_IN_UTF8(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        public static int collectDefaults() {
            int mask = 0;
            for (IAuthTabCallback iAuthTabCallback : values()) {
                if (iAuthTabCallback.enabledByDefault()) {
                    mask |= iAuthTabCallback.getMask();
                }
            }
            return mask;
        }

        IAuthTabCallback(boolean z) {
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

    public isInLayout asBinder() {
        return isInLayout.onNavigationEvent();
    }

    public void IAuthTabCallback(Object obj) {
        getUserVisibleHint getuservisiblehintOnTransact = onTransact();
        if (getuservisiblehintOnTransact != null) {
            getuservisiblehintOnTransact.onWarmupCompleted(obj);
        }
    }

    @Deprecated
    public void onNavigationEvent(Object obj) {
        IAuthTabCallback(obj);
    }

    public getView onExtraCallbackWithResult(int i2, int i3) {
        return IAuthTabCallback((i2 & i3) | ((~i3) & IAuthTabCallbackDefault()));
    }

    public void onExtraCallbackWithResult(getRetainInstance getretaininstance) {
        throw new UnsupportedOperationException(String.format("Generator of type %s does not support schema of type '%s'", getClass().getName(), getretaininstance.IAuthTabCallback()));
    }

    public getView onNavigationEvent(initState initstate) {
        this.onExtraCallback = initstate;
        return this;
    }

    public initState IAuthTabCallbackStub() {
        return this.onExtraCallback;
    }

    public getView onWarmupCompleted(hasOptionsMenu hasoptionsmenu) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void onNavigationEvent(int i2) throws IOException {
        IAuthTabCallback_Parcel();
    }

    public void onTransact(Object obj) throws IOException {
        IAuthTabCallback_Parcel();
        onNavigationEvent(obj);
    }

    public void onExtraCallbackWithResult(Object obj, int i2) throws IOException {
        onNavigationEvent(i2);
        onNavigationEvent(obj);
    }

    public void IAuthTabCallbackStub(Object obj) throws IOException {
        getInterfaceDescriptor();
        onNavigationEvent(obj);
    }

    public void onNavigationEvent(Object obj, int i2) throws IOException {
        IAuthTabCallbackStub(obj);
    }

    public void onNavigationEvent(long j) throws IOException {
        onExtraCallbackWithResult(Long.toString(j));
    }

    public void IAuthTabCallback(int[] iArr, int i2, int i3) throws IOException {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        onExtraCallbackWithResult(iArr.length, i2, i3);
        onExtraCallbackWithResult(iArr, i3);
        for (int i4 = i2; i4 < i3 + i2; i4++) {
            onExtraCallbackWithResult(iArr[i4]);
        }
        access100();
    }

    public void IAuthTabCallback(long[] jArr, int i2, int i3) throws IOException {
        if (jArr == null) {
            throw new IllegalArgumentException("null array");
        }
        onExtraCallbackWithResult(jArr.length, i2, i3);
        onExtraCallbackWithResult(jArr, i3);
        for (int i4 = i2; i4 < i3 + i2; i4++) {
            onExtraCallback(jArr[i4]);
        }
        access100();
    }

    public void onNavigationEvent(double[] dArr, int i2, int i3) throws IOException {
        if (dArr == null) {
            throw new IllegalArgumentException("null array");
        }
        onExtraCallbackWithResult(dArr.length, i2, i3);
        onExtraCallbackWithResult(dArr, i3);
        for (int i4 = i2; i4 < i3 + i2; i4++) {
            onExtraCallbackWithResult(dArr[i4]);
        }
        access100();
    }

    public void IAuthTabCallback(hasOptionsMenu hasoptionsmenu) throws IOException {
        onTransact(hasoptionsmenu.onWarmupCompleted());
    }

    public void onExtraCallback(hasOptionsMenu hasoptionsmenu) throws IOException {
        IAuthTabCallbackStub(hasoptionsmenu.onWarmupCompleted());
    }

    public void IAuthTabCallback(byte[] bArr, int i2, int i3) throws IOException {
        onWarmupCompleted(getPopEnterAnim.onNavigationEvent(), bArr, i2, i3);
    }

    public void onWarmupCompleted(byte[] bArr) throws IOException {
        onWarmupCompleted(getPopEnterAnim.onNavigationEvent(), bArr, 0, bArr.length);
    }

    public int onExtraCallbackWithResult(InputStream inputStream, int i2) throws IOException {
        return onExtraCallbackWithResult(getPopEnterAnim.onNavigationEvent(), inputStream, i2);
    }

    public void onNavigationEvent(short s) throws IOException {
        onExtraCallbackWithResult((int) s);
    }

    public void onWarmupCompleted(Object obj) throws IOException {
        if (obj == null) {
            IAuthTabCallbackStubProxy();
        } else {
            if (obj instanceof byte[]) {
                onWarmupCompleted((byte[]) obj);
                return;
            }
            throw new JsonGenerationException("No native support for writing embedded objects of type " + obj.getClass().getName(), this);
        }
    }

    public void IAuthTabCallbackDefault(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void asBinder(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void asInterface(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public setRetainInstance onExtraCallbackWithResult(setRetainInstance setretaininstance) throws IOException {
        Object obj = setretaininstance.onNavigationEvent;
        getTargetRequestCode gettargetrequestcode = setretaininstance.asBinder;
        if (asInterface()) {
            setretaininstance.IAuthTabCallbackDefault = false;
            asInterface(obj);
        } else {
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            setretaininstance.IAuthTabCallbackDefault = true;
            setRetainInstance.onNavigationEvent onnavigationevent = setretaininstance.IAuthTabCallback;
            if (gettargetrequestcode != getTargetRequestCode.START_OBJECT && onnavigationevent.requiresObjectContext()) {
                onnavigationevent = setRetainInstance.onNavigationEvent.WRAPPER_ARRAY;
                setretaininstance.IAuthTabCallback = onnavigationevent;
            }
            int i2 = AnonymousClass3.IAuthTabCallback[onnavigationevent.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    IAuthTabCallbackStub(setretaininstance.onExtraCallback);
                    onNavigationEvent(setretaininstance.onExtraCallbackWithResult, strValueOf);
                    return setretaininstance;
                }
                if (i2 == 4) {
                    getInterfaceDescriptor();
                    onExtraCallbackWithResult(strValueOf);
                } else {
                    IAuthTabCallback_Parcel();
                    asBinder(strValueOf);
                }
            }
        }
        if (gettargetrequestcode == getTargetRequestCode.START_OBJECT) {
            IAuthTabCallbackStub(setretaininstance.onExtraCallback);
            return setretaininstance;
        }
        if (gettargetrequestcode == getTargetRequestCode.START_ARRAY) {
            IAuthTabCallback_Parcel();
        }
        return setretaininstance;
    }

    /* renamed from: o.getView$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[setRetainInstance.onNavigationEvent.values().length];
            IAuthTabCallback = iArr;
            try {
                iArr[setRetainInstance.onNavigationEvent.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IAuthTabCallback[setRetainInstance.onNavigationEvent.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IAuthTabCallback[setRetainInstance.onNavigationEvent.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IAuthTabCallback[setRetainInstance.onNavigationEvent.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IAuthTabCallback[setRetainInstance.onNavigationEvent.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public setRetainInstance onExtraCallback(setRetainInstance setretaininstance) throws IOException {
        getTargetRequestCode gettargetrequestcode = setretaininstance.asBinder;
        if (gettargetrequestcode == getTargetRequestCode.START_OBJECT) {
            access000();
        } else if (gettargetrequestcode == getTargetRequestCode.START_ARRAY) {
            access100();
        }
        if (setretaininstance.IAuthTabCallbackDefault) {
            int i2 = AnonymousClass3.IAuthTabCallback[setretaininstance.IAuthTabCallback.ordinal()];
            if (i2 == 1) {
                Object obj = setretaininstance.onNavigationEvent;
                onNavigationEvent(setretaininstance.onExtraCallbackWithResult, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (i2 != 2 && i2 != 3) {
                if (i2 == 5) {
                    access100();
                    return setretaininstance;
                }
                access000();
                return setretaininstance;
            }
        }
        return setretaininstance;
    }

    public void onExtraCallback(String str, byte[] bArr) throws IOException {
        onExtraCallbackWithResult(str);
        onWarmupCompleted(bArr);
    }

    public void onExtraCallbackWithResult(String str, boolean z) throws IOException {
        onExtraCallbackWithResult(str);
        onWarmupCompleted(z);
    }

    public void onNavigationEvent(String str, String str2) throws IOException {
        onExtraCallbackWithResult(str);
        asBinder(str2);
    }

    public void onWarmupCompleted(String str, int i2) throws IOException {
        onExtraCallbackWithResult(str);
        onExtraCallbackWithResult(i2);
    }

    public void IAuthTabCallback(String str, double d) throws IOException {
        onExtraCallbackWithResult(str);
        onExtraCallbackWithResult(d);
    }

    public void onExtraCallback(String str) throws IOException {
        onExtraCallbackWithResult(str);
        IAuthTabCallback_Parcel();
    }

    public void IAuthTabCallbackDefault(String str) throws IOException {
        onExtraCallbackWithResult(str);
        getInterfaceDescriptor();
    }

    public void onExtraCallback(getViewLifecycleOwner getviewlifecycleowner) throws IOException {
        getTargetRequestCode gettargetrequestcodeAsBinder = getviewlifecycleowner.asBinder();
        switch (gettargetrequestcodeAsBinder == null ? -1 : gettargetrequestcodeAsBinder.id()) {
            case -1:
                throw onNavigationEvent("No current event to copy");
            case 0:
            default:
                throw new IllegalStateException("Internal error: unknown current token, " + gettargetrequestcodeAsBinder);
            case 1:
                getInterfaceDescriptor();
                return;
            case 2:
                access000();
                return;
            case 3:
                IAuthTabCallback_Parcel();
                return;
            case 4:
                access100();
                return;
            case 5:
                onExtraCallbackWithResult(getviewlifecycleowner.asInterface());
                return;
            case 6:
                onExtraCallbackWithResult(getviewlifecycleowner);
                return;
            case 7:
                onNavigationEvent(getviewlifecycleowner);
                return;
            case 8:
                onWarmupCompleted(getviewlifecycleowner);
                return;
            case 9:
                onWarmupCompleted(true);
                return;
            case 10:
                onWarmupCompleted(false);
                return;
            case 11:
                IAuthTabCallbackStubProxy();
                return;
            case 12:
                onExtraCallbackWithResult(getviewlifecycleowner.onActivityResized());
                return;
        }
    }

    public void IAuthTabCallbackDefault(getViewLifecycleOwner getviewlifecycleowner) throws IOException {
        getTargetRequestCode gettargetrequestcodeAsBinder = getviewlifecycleowner.asBinder();
        int iId = gettargetrequestcodeAsBinder == null ? -1 : gettargetrequestcodeAsBinder.id();
        if (iId == 5) {
            onExtraCallbackWithResult(getviewlifecycleowner.asInterface());
            getTargetRequestCode gettargetrequestcodeValidateRelationship = getviewlifecycleowner.validateRelationship();
            iId = gettargetrequestcodeValidateRelationship != null ? gettargetrequestcodeValidateRelationship.id() : -1;
        }
        if (iId == 1) {
            getInterfaceDescriptor();
            IAuthTabCallback(getviewlifecycleowner);
        } else if (iId == 3) {
            IAuthTabCallback_Parcel();
            IAuthTabCallback(getviewlifecycleowner);
        } else {
            onExtraCallback(getviewlifecycleowner);
        }
    }

    protected void IAuthTabCallback(getViewLifecycleOwner getviewlifecycleowner) throws IOException {
        int i2 = 1;
        while (true) {
            getTargetRequestCode gettargetrequestcodeValidateRelationship = getviewlifecycleowner.validateRelationship();
            if (gettargetrequestcodeValidateRelationship == null) {
                return;
            }
            switch (gettargetrequestcodeValidateRelationship.id()) {
                case 1:
                    getInterfaceDescriptor();
                    break;
                case 2:
                    access000();
                    i2--;
                    if (i2 == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 3:
                    IAuthTabCallback_Parcel();
                    break;
                case 4:
                    access100();
                    i2--;
                    if (i2 == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 5:
                    onExtraCallbackWithResult(getviewlifecycleowner.asInterface());
                    continue;
                case 6:
                    onExtraCallbackWithResult(getviewlifecycleowner);
                    continue;
                case 7:
                    onNavigationEvent(getviewlifecycleowner);
                    continue;
                case 8:
                    onWarmupCompleted(getviewlifecycleowner);
                    continue;
                case 9:
                    onWarmupCompleted(true);
                    continue;
                case 10:
                    onWarmupCompleted(false);
                    continue;
                case 11:
                    IAuthTabCallbackStubProxy();
                    continue;
                case 12:
                    onExtraCallbackWithResult(getviewlifecycleowner.onActivityResized());
                    continue;
                default:
                    throw new IllegalStateException("Internal error: unknown current token, " + gettargetrequestcodeValidateRelationship);
            }
            i2++;
        }
    }

    protected void onWarmupCompleted(getViewLifecycleOwner getviewlifecycleowner) throws IOException {
        getViewLifecycleOwner.IAuthTabCallback iAuthTabCallbackOnMinimized = getviewlifecycleowner.onMinimized();
        if (iAuthTabCallbackOnMinimized == getViewLifecycleOwner.IAuthTabCallback.BIG_DECIMAL) {
            IAuthTabCallback(getviewlifecycleowner.extraCallbackWithResult());
        } else if (iAuthTabCallbackOnMinimized == getViewLifecycleOwner.IAuthTabCallback.FLOAT) {
            onNavigationEvent(getviewlifecycleowner.onActivityLayout());
        } else {
            onExtraCallbackWithResult(getviewlifecycleowner.extraCallback());
        }
    }

    protected void onNavigationEvent(getViewLifecycleOwner getviewlifecycleowner) throws IOException {
        getViewLifecycleOwner.IAuthTabCallback iAuthTabCallbackOnMinimized = getviewlifecycleowner.onMinimized();
        if (iAuthTabCallbackOnMinimized == getViewLifecycleOwner.IAuthTabCallback.INT) {
            onExtraCallbackWithResult(getviewlifecycleowner.onMessageChannelReady());
        } else if (iAuthTabCallbackOnMinimized == getViewLifecycleOwner.IAuthTabCallback.LONG) {
            onExtraCallback(getviewlifecycleowner.onPostMessage());
        } else {
            onExtraCallbackWithResult(getviewlifecycleowner.IAuthTabCallbackStub());
        }
    }

    protected void onExtraCallbackWithResult(getViewLifecycleOwner getviewlifecycleowner) throws IOException {
        if (getviewlifecycleowner.prefetchWithMultipleUrls()) {
            onNavigationEvent(getviewlifecycleowner.ICustomTabsService(), getviewlifecycleowner.newSession(), getviewlifecycleowner.ICustomTabsCallback_Parcel());
        } else {
            asBinder(getviewlifecycleowner.mayLaunchUrl());
        }
    }

    public void IAuthTabCallback(String str) throws JsonGenerationException {
        throw ((JsonGenerationException) onNavigationEvent(str));
    }

    public final void onWarmupCompleted() {
        getSupportLoaderManager.onWarmupCompleted();
    }

    public void IAuthTabCallback() {
        onWarmupCompleted("Operation not supported by `JsonGenerator` of type " + getClass().getName());
    }

    protected void onWarmupCompleted(String str) {
        throw new UnsupportedOperationException(str);
    }

    protected StreamWriteException onNavigationEvent(String str) {
        return new JsonGenerationException(str, this);
    }

    protected final void onExtraCallbackWithResult(int i2, int i3, int i4) {
        if (i3 < 0 || i3 + i4 > i2) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2)));
        }
    }

    public void onExtraCallback(Object obj) throws IOException {
        if (obj == null) {
            IAuthTabCallbackStubProxy();
            return;
        }
        if (obj instanceof String) {
            asBinder((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                onExtraCallbackWithResult(number.intValue());
                return;
            }
            if (number instanceof Long) {
                onExtraCallback(number.longValue());
                return;
            }
            if (number instanceof Double) {
                onExtraCallbackWithResult(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                onNavigationEvent(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                onNavigationEvent(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                onNavigationEvent(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                onExtraCallbackWithResult((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                IAuthTabCallback((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                onExtraCallbackWithResult(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                onExtraCallback(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            onWarmupCompleted((byte[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            onWarmupCompleted(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            onWarmupCompleted(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }
}

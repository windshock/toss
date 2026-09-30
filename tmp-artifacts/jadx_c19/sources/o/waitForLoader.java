package o;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import o.getView;
import o.getViewLifecycleOwner;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class waitForLoader extends getView {
    protected static final int onExtraCallbackWithResult = getView.IAuthTabCallback.collectDefaults();
    protected int IAuthTabCallbackDefault;
    protected onExtraCallbackWithResult IAuthTabCallbackStub;
    protected onExtraCallbackWithResult IAuthTabCallbackStubProxy;
    protected boolean IAuthTabCallback_Parcel;
    protected isDetached ICustomTabsCallback;
    protected boolean access000;
    protected boolean access100;
    protected boolean asBinder;
    protected boolean asInterface;
    protected getViewLifecycleOwnerLiveData extraCallback;
    protected getUserVisibleHint extraCallbackWithResult;
    protected boolean getInterfaceDescriptor;
    protected setInitialSavedState onPostMessage;
    protected int onTransact;
    protected Object readTypedObject;
    protected Object writeTypedObject;

    @Override // o.getView, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // o.getView
    public boolean onNavigationEvent() {
        return true;
    }

    public waitForLoader(getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, boolean z) {
        this.ICustomTabsCallback = isDetached.IAuthTabCallback();
        this.getInterfaceDescriptor = false;
        this.extraCallback = getviewlifecycleownerlivedata;
        this.onTransact = onExtraCallbackWithResult;
        this.onPostMessage = setInitialSavedState.onNavigationEvent((setEnterSharedElementCallback) null);
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        this.IAuthTabCallbackStubProxy = onextracallbackwithresult;
        this.IAuthTabCallbackStub = onextracallbackwithresult;
        this.IAuthTabCallbackDefault = 0;
        this.access000 = z;
        this.IAuthTabCallback_Parcel = z;
        this.access100 = z || z;
    }

    public waitForLoader(getViewLifecycleOwner getviewlifecycleowner, supportStartPostponedEnterTransition supportstartpostponedentertransition) {
        this.ICustomTabsCallback = isDetached.IAuthTabCallback();
        this.getInterfaceDescriptor = false;
        this.extraCallback = getviewlifecycleowner.access100();
        this.ICustomTabsCallback = getviewlifecycleowner.access200();
        this.extraCallbackWithResult = getviewlifecycleowner.onUnminimized();
        this.onTransact = onExtraCallbackWithResult;
        this.onPostMessage = setInitialSavedState.onNavigationEvent((setEnterSharedElementCallback) null);
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        this.IAuthTabCallbackStubProxy = onextracallbackwithresult;
        this.IAuthTabCallbackStub = onextracallbackwithresult;
        this.IAuthTabCallbackDefault = 0;
        this.access000 = getviewlifecycleowner.onNavigationEvent();
        boolean zOnExtraCallbackWithResult = getviewlifecycleowner.onExtraCallbackWithResult();
        this.IAuthTabCallback_Parcel = zOnExtraCallbackWithResult;
        this.access100 = this.access000 || zOnExtraCallbackWithResult;
        this.asInterface = supportstartpostponedentertransition != null ? supportstartpostponedentertransition.onWarmupCompleted(supportPostponeEnterTransition.USE_BIG_DECIMAL_FOR_FLOATS) : false;
    }

    public waitForLoader IAuthTabCallback(boolean z) {
        this.asInterface = z;
        return this;
    }

    public getViewLifecycleOwner extraCallback() {
        return onWarmupCompleted(this.extraCallback);
    }

    public getViewLifecycleOwner writeTypedObject() throws IOException {
        getViewLifecycleOwner getviewlifecycleownerOnWarmupCompleted = onWarmupCompleted(this.extraCallback);
        getviewlifecycleownerOnWarmupCompleted.validateRelationship();
        return getviewlifecycleownerOnWarmupCompleted;
    }

    public getViewLifecycleOwner onWarmupCompleted(getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata) {
        return new IAuthTabCallback(this.IAuthTabCallbackStub, getviewlifecycleownerlivedata, this.access000, this.IAuthTabCallback_Parcel, this.extraCallbackWithResult, this.ICustomTabsCallback);
    }

    public getViewLifecycleOwner onWarmupCompleted(isDetached isdetached) {
        return new IAuthTabCallback(this.IAuthTabCallbackStub, this.extraCallback, this.access000, this.IAuthTabCallback_Parcel, this.extraCallbackWithResult, isdetached);
    }

    public getViewLifecycleOwner asBinder(getViewLifecycleOwner getviewlifecycleowner) {
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.IAuthTabCallbackStub, getviewlifecycleowner.access100(), this.access000, this.IAuthTabCallback_Parcel, this.extraCallbackWithResult, getviewlifecycleowner.access200());
        iAuthTabCallback.IAuthTabCallback(getviewlifecycleowner.IAuthTabCallbackDefault());
        return iAuthTabCallback;
    }

    public getTargetRequestCode readTypedObject() {
        return this.IAuthTabCallbackStub.onNavigationEvent(0);
    }

    public waitForLoader onNavigationEvent(waitForLoader waitforloader) throws JsonEOFException, IOException {
        if (!this.access000) {
            this.access000 = waitforloader.asInterface();
        }
        if (!this.IAuthTabCallback_Parcel) {
            this.IAuthTabCallback_Parcel = waitforloader.onExtraCallbackWithResult();
        }
        this.access100 = this.access000 || this.IAuthTabCallback_Parcel;
        getViewLifecycleOwner getviewlifecycleownerExtraCallback = waitforloader.extraCallback();
        while (getviewlifecycleownerExtraCallback.validateRelationship() != null) {
            IAuthTabCallbackDefault(getviewlifecycleownerExtraCallback);
        }
        return this;
    }

    public void onExtraCallbackWithResult(getView getview) throws IOException {
        onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = this.IAuthTabCallbackStub;
        boolean z = this.access100;
        boolean z2 = z && onextracallbackwithresultOnNavigationEvent.IAuthTabCallback();
        int i2 = -1;
        while (true) {
            i2++;
            if (i2 >= 16) {
                onextracallbackwithresultOnNavigationEvent = onextracallbackwithresultOnNavigationEvent.onNavigationEvent();
                if (onextracallbackwithresultOnNavigationEvent == null) {
                    return;
                }
                z2 = z && onextracallbackwithresultOnNavigationEvent.IAuthTabCallback();
                i2 = 0;
            }
            getTargetRequestCode gettargetrequestcodeOnNavigationEvent = onextracallbackwithresultOnNavigationEvent.onNavigationEvent(i2);
            if (gettargetrequestcodeOnNavigationEvent == null) {
                return;
            }
            if (z2) {
                Object objOnExtraCallback = onextracallbackwithresultOnNavigationEvent.onExtraCallback(i2);
                if (objOnExtraCallback != null) {
                    getview.IAuthTabCallbackDefault(objOnExtraCallback);
                }
                Object objIAuthTabCallback = onextracallbackwithresultOnNavigationEvent.IAuthTabCallback(i2);
                if (objIAuthTabCallback != null) {
                    getview.asInterface(objIAuthTabCallback);
                }
            }
            switch (AnonymousClass1.onExtraCallback[gettargetrequestcodeOnNavigationEvent.ordinal()]) {
                case 1:
                    getview.getInterfaceDescriptor();
                    break;
                case 2:
                    getview.access000();
                    break;
                case 3:
                    getview.IAuthTabCallback_Parcel();
                    break;
                case 4:
                    getview.access100();
                    break;
                case 5:
                    Object objOnExtraCallbackWithResult = onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult(i2);
                    if (objOnExtraCallbackWithResult instanceof hasOptionsMenu) {
                        getview.onNavigationEvent((hasOptionsMenu) objOnExtraCallbackWithResult);
                        break;
                    } else {
                        getview.onExtraCallbackWithResult((String) objOnExtraCallbackWithResult);
                        break;
                    }
                case 6:
                    Object objOnExtraCallbackWithResult2 = onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult(i2);
                    if (objOnExtraCallbackWithResult2 instanceof hasOptionsMenu) {
                        getview.onExtraCallbackWithResult((hasOptionsMenu) objOnExtraCallbackWithResult2);
                        break;
                    } else {
                        getview.asBinder((String) objOnExtraCallbackWithResult2);
                        break;
                    }
                case 7:
                    Object objOnExtraCallbackWithResult3 = onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult(i2);
                    if (objOnExtraCallbackWithResult3 instanceof Integer) {
                        getview.onExtraCallbackWithResult(((Integer) objOnExtraCallbackWithResult3).intValue());
                        break;
                    } else if (objOnExtraCallbackWithResult3 instanceof BigInteger) {
                        getview.onExtraCallbackWithResult((BigInteger) objOnExtraCallbackWithResult3);
                        break;
                    } else if (objOnExtraCallbackWithResult3 instanceof Long) {
                        getview.onExtraCallback(((Long) objOnExtraCallbackWithResult3).longValue());
                        break;
                    } else if (objOnExtraCallbackWithResult3 instanceof Short) {
                        getview.onNavigationEvent(((Short) objOnExtraCallbackWithResult3).shortValue());
                        break;
                    } else {
                        getview.onExtraCallbackWithResult(((Number) objOnExtraCallbackWithResult3).intValue());
                        break;
                    }
                case 8:
                    Object objOnExtraCallbackWithResult4 = onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult(i2);
                    if (objOnExtraCallbackWithResult4 instanceof Double) {
                        getview.onExtraCallbackWithResult(((Double) objOnExtraCallbackWithResult4).doubleValue());
                        break;
                    } else if (objOnExtraCallbackWithResult4 instanceof BigDecimal) {
                        getview.IAuthTabCallback((BigDecimal) objOnExtraCallbackWithResult4);
                        break;
                    } else if (!(objOnExtraCallbackWithResult4 instanceof Float)) {
                        if (objOnExtraCallbackWithResult4 == null) {
                            getview.IAuthTabCallbackStubProxy();
                            break;
                        } else if (objOnExtraCallbackWithResult4 instanceof String) {
                            getview.asInterface((String) objOnExtraCallbackWithResult4);
                            break;
                        } else {
                            IAuthTabCallback(String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize", objOnExtraCallbackWithResult4.getClass().getName()));
                            break;
                        }
                    } else {
                        getview.onNavigationEvent(((Float) objOnExtraCallbackWithResult4).floatValue());
                        break;
                    }
                case 9:
                    getview.onWarmupCompleted(true);
                    break;
                case 10:
                    getview.onWarmupCompleted(false);
                    break;
                case 11:
                    getview.IAuthTabCallbackStubProxy();
                    break;
                case 12:
                    Object objOnExtraCallbackWithResult5 = onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult(i2);
                    if (objOnExtraCallbackWithResult5 instanceof RawValue) {
                        ((RawValue) objOnExtraCallbackWithResult5).IAuthTabCallback(getview);
                        break;
                    } else if (objOnExtraCallbackWithResult5 instanceof FragmentActivityExternalSyntheticLambda0) {
                        getview.onExtraCallbackWithResult(objOnExtraCallbackWithResult5);
                        break;
                    } else {
                        getview.onWarmupCompleted(objOnExtraCallbackWithResult5);
                        break;
                    }
                default:
                    throw new RuntimeException("Internal error: should never end up through this code path");
            }
        }
    }

    public waitForLoader onExtraCallback(getViewLifecycleOwner getviewlifecycleowner, supportStartPostponedEnterTransition supportstartpostponedentertransition) throws JsonEOFException, IOException, JsonMappingException {
        getTargetRequestCode gettargetrequestcodeValidateRelationship;
        if (!getviewlifecycleowner.onExtraCallbackWithResult(getTargetRequestCode.FIELD_NAME)) {
            IAuthTabCallbackDefault(getviewlifecycleowner);
            return this;
        }
        getInterfaceDescriptor();
        do {
            IAuthTabCallbackDefault(getviewlifecycleowner);
            gettargetrequestcodeValidateRelationship = getviewlifecycleowner.validateRelationship();
        } while (gettargetrequestcodeValidateRelationship == getTargetRequestCode.FIELD_NAME);
        getTargetRequestCode gettargetrequestcode = getTargetRequestCode.END_OBJECT;
        if (gettargetrequestcodeValidateRelationship != gettargetrequestcode) {
            supportstartpostponedentertransition.onExtraCallback(waitForLoader.class, gettargetrequestcode, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + gettargetrequestcodeValidateRelationship, new Object[0]);
        }
        access000();
        return this;
    }

    public String toString() {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append("[TokenBuffer: ");
        getViewLifecycleOwner getviewlifecycleownerExtraCallback = extraCallback();
        boolean z = false;
        if (this.access000 || this.IAuthTabCallback_Parcel) {
            z = true;
            i2 = 0;
        } else {
            i2 = 0;
        }
        while (true) {
            try {
                getTargetRequestCode gettargetrequestcodeValidateRelationship = getviewlifecycleownerExtraCallback.validateRelationship();
                if (gettargetrequestcodeValidateRelationship == null) {
                    break;
                }
                if (z) {
                    IAuthTabCallback(sb);
                }
                if (i2 < 100) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(gettargetrequestcodeValidateRelationship.toString());
                    if (gettargetrequestcodeValidateRelationship == getTargetRequestCode.FIELD_NAME) {
                        sb.append('(');
                        sb.append(getviewlifecycleownerExtraCallback.asInterface());
                        sb.append(')');
                    }
                }
                i2++;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        if (i2 >= 100) {
            sb.append(" ... (truncated ");
            sb.append(i2 - 100);
            sb.append(" entries)");
        }
        sb.append(']');
        return sb.toString();
    }

    private final void IAuthTabCallback(StringBuilder sb) {
        Object objOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(this.IAuthTabCallbackDefault - 1);
        if (objOnExtraCallback != null) {
            sb.append("[objectId=");
            sb.append(String.valueOf(objOnExtraCallback));
            sb.append(']');
        }
        Object objIAuthTabCallback = this.IAuthTabCallbackStubProxy.IAuthTabCallback(this.IAuthTabCallbackDefault - 1);
        if (objIAuthTabCallback != null) {
            sb.append("[typeId=");
            sb.append(String.valueOf(objIAuthTabCallback));
            sb.append(']');
        }
    }

    @Override // o.getView
    public getView onWarmupCompleted(getView.IAuthTabCallback iAuthTabCallback) {
        this.onTransact = (~iAuthTabCallback.getMask()) & this.onTransact;
        return this;
    }

    @Override // o.getView
    public boolean onExtraCallbackWithResult(getView.IAuthTabCallback iAuthTabCallback) {
        return (iAuthTabCallback.getMask() & this.onTransact) != 0;
    }

    @Override // o.getView
    public int IAuthTabCallbackDefault() {
        return this.onTransact;
    }

    @Override // o.getView
    @Deprecated
    public getView IAuthTabCallback(int i2) {
        this.onTransact = i2;
        return this;
    }

    @Override // o.getView
    public getView onExtraCallbackWithResult(int i2, int i3) {
        this.onTransact = (i2 & i3) | ((~i3) & IAuthTabCallbackDefault());
        return this;
    }

    @Override // o.getView
    /* renamed from: ICustomTabsCallback, reason: merged with bridge method [inline-methods] */
    public final setInitialSavedState onTransact() {
        return this.onPostMessage;
    }

    @Override // o.getView, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.asBinder = true;
    }

    @Override // o.getView
    public final void IAuthTabCallback_Parcel() throws IOException {
        this.onPostMessage.writeTypedObject();
        IAuthTabCallback(getTargetRequestCode.START_ARRAY);
        this.onPostMessage = this.onPostMessage.access100();
    }

    @Override // o.getView
    public void onTransact(Object obj) throws IOException {
        this.onPostMessage.writeTypedObject();
        IAuthTabCallback(getTargetRequestCode.START_ARRAY);
        this.onPostMessage = this.onPostMessage.onExtraCallbackWithResult(obj);
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(Object obj, int i2) throws IOException {
        this.onPostMessage.writeTypedObject();
        IAuthTabCallback(getTargetRequestCode.START_ARRAY);
        this.onPostMessage = this.onPostMessage.onExtraCallbackWithResult(obj);
    }

    @Override // o.getView
    public final void access100() throws IOException {
        onExtraCallback(getTargetRequestCode.END_ARRAY);
        setInitialSavedState setinitialsavedstateAsInterface = this.onPostMessage.asInterface();
        if (setinitialsavedstateAsInterface != null) {
            this.onPostMessage = setinitialsavedstateAsInterface;
        }
    }

    @Override // o.getView
    public final void getInterfaceDescriptor() throws IOException {
        this.onPostMessage.writeTypedObject();
        IAuthTabCallback(getTargetRequestCode.START_OBJECT);
        this.onPostMessage = this.onPostMessage.access000();
    }

    @Override // o.getView
    public void IAuthTabCallbackStub(Object obj) throws IOException {
        this.onPostMessage.writeTypedObject();
        IAuthTabCallback(getTargetRequestCode.START_OBJECT);
        this.onPostMessage = this.onPostMessage.onExtraCallback(obj);
    }

    @Override // o.getView
    public void onNavigationEvent(Object obj, int i2) throws IOException {
        this.onPostMessage.writeTypedObject();
        IAuthTabCallback(getTargetRequestCode.START_OBJECT);
        this.onPostMessage = this.onPostMessage.onExtraCallback(obj);
    }

    @Override // o.getView
    public final void access000() throws IOException {
        onExtraCallback(getTargetRequestCode.END_OBJECT);
        setInitialSavedState setinitialsavedstateAsInterface = this.onPostMessage.asInterface();
        if (setinitialsavedstateAsInterface != null) {
            this.onPostMessage = setinitialsavedstateAsInterface;
        }
    }

    @Override // o.getView
    public final void onExtraCallbackWithResult(String str) throws IOException {
        this.onPostMessage.onExtraCallbackWithResult(str);
        access100(str);
    }

    @Override // o.getView
    public void onNavigationEvent(hasOptionsMenu hasoptionsmenu) throws IOException {
        this.onPostMessage.onExtraCallbackWithResult(hasoptionsmenu.onWarmupCompleted());
        access100(hasoptionsmenu);
    }

    @Override // o.getView
    public void asBinder(String str) throws IOException {
        if (str == null) {
            IAuthTabCallbackStubProxy();
        } else {
            onExtraCallback(getTargetRequestCode.VALUE_STRING, str);
        }
    }

    @Override // o.getView
    public void onNavigationEvent(char[] cArr, int i2, int i3) throws IOException {
        asBinder(new String(cArr, i2, i3));
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(hasOptionsMenu hasoptionsmenu) throws IOException {
        if (hasoptionsmenu == null) {
            IAuthTabCallbackStubProxy();
        } else {
            onExtraCallback(getTargetRequestCode.VALUE_STRING, hasoptionsmenu);
        }
    }

    @Override // o.getView
    public void onTransact(String str) throws IOException {
        IAuthTabCallback();
    }

    @Override // o.getView
    public void IAuthTabCallback(hasOptionsMenu hasoptionsmenu) throws IOException {
        IAuthTabCallback();
    }

    @Override // o.getView
    public void IAuthTabCallback(char[] cArr, int i2, int i3) throws IOException {
        IAuthTabCallback();
    }

    @Override // o.getView
    public void onWarmupCompleted(char c) throws IOException {
        IAuthTabCallback();
    }

    @Override // o.getView
    public void IAuthTabCallbackStub(String str) throws IOException {
        onExtraCallback(getTargetRequestCode.VALUE_EMBEDDED_OBJECT, new RawValue(str));
    }

    @Override // o.getView
    public void onNavigationEvent(short s) throws IOException {
        onExtraCallback(getTargetRequestCode.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(int i2) throws IOException {
        onExtraCallback(getTargetRequestCode.VALUE_NUMBER_INT, Integer.valueOf(i2));
    }

    @Override // o.getView
    public void onExtraCallback(long j) throws IOException {
        onExtraCallback(getTargetRequestCode.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(double d) throws IOException {
        onExtraCallback(getTargetRequestCode.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    @Override // o.getView
    public void onNavigationEvent(float f) throws IOException {
        onExtraCallback(getTargetRequestCode.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    @Override // o.getView
    public void IAuthTabCallback(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            IAuthTabCallbackStubProxy();
        } else {
            onExtraCallback(getTargetRequestCode.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            IAuthTabCallbackStubProxy();
        } else {
            onExtraCallback(getTargetRequestCode.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // o.getView
    public void asInterface(String str) throws IOException {
        onExtraCallback(getTargetRequestCode.VALUE_NUMBER_FLOAT, str);
    }

    private void IAuthTabCallback_Parcel(Object obj) throws IOException {
        onExtraCallback(getTargetRequestCode.VALUE_NUMBER_INT, obj);
    }

    private void getInterfaceDescriptor(Object obj) throws IOException {
        onExtraCallback(getTargetRequestCode.VALUE_NUMBER_FLOAT, obj);
    }

    @Override // o.getView
    public void onWarmupCompleted(boolean z) throws IOException {
        onNavigationEvent(z ? getTargetRequestCode.VALUE_TRUE : getTargetRequestCode.VALUE_FALSE);
    }

    @Override // o.getView
    public void IAuthTabCallbackStubProxy() throws IOException {
        onNavigationEvent(getTargetRequestCode.VALUE_NULL);
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(Object obj) throws IOException {
        if (obj == null) {
            IAuthTabCallbackStubProxy();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof RawValue)) {
            onExtraCallback(getTargetRequestCode.VALUE_EMBEDDED_OBJECT, obj);
            return;
        }
        getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata = this.extraCallback;
        if (getviewlifecycleownerlivedata == null) {
            onExtraCallback(getTargetRequestCode.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            getviewlifecycleownerlivedata.onWarmupCompleted(this, obj);
        }
    }

    @Override // o.getView
    public void onWarmupCompleted(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, byte[] bArr, int i2, int i3) throws IOException {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        onExtraCallbackWithResult(bArr2);
    }

    @Override // o.getView
    public int onExtraCallbackWithResult(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, InputStream inputStream, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // o.getView
    public boolean asInterface() {
        return this.access000;
    }

    @Override // o.getView
    public boolean onExtraCallbackWithResult() {
        return this.IAuthTabCallback_Parcel;
    }

    @Override // o.getView
    public void asInterface(Object obj) {
        this.writeTypedObject = obj;
        this.getInterfaceDescriptor = true;
    }

    @Override // o.getView
    public void IAuthTabCallbackDefault(Object obj) {
        this.readTypedObject = obj;
        this.getInterfaceDescriptor = true;
    }

    @Override // o.getView
    public void onWarmupCompleted(Object obj) throws IOException {
        onExtraCallback(getTargetRequestCode.VALUE_EMBEDDED_OBJECT, obj);
    }

    @Override // o.getView
    public void onExtraCallback(getViewLifecycleOwner getviewlifecycleowner) throws IOException {
        if (this.access100) {
            asInterface(getviewlifecycleowner);
        }
        switch (AnonymousClass1.onExtraCallback[getviewlifecycleowner.asBinder().ordinal()]) {
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
                if (getviewlifecycleowner.prefetchWithMultipleUrls()) {
                    onNavigationEvent(getviewlifecycleowner.ICustomTabsService(), getviewlifecycleowner.newSession(), getviewlifecycleowner.ICustomTabsCallback_Parcel());
                    return;
                } else {
                    asBinder(getviewlifecycleowner.mayLaunchUrl());
                    return;
                }
            case 7:
                int i2 = AnonymousClass1.IAuthTabCallback[getviewlifecycleowner.onMinimized().ordinal()];
                if (i2 == 1) {
                    onExtraCallbackWithResult(getviewlifecycleowner.onMessageChannelReady());
                    return;
                } else if (i2 == 2) {
                    IAuthTabCallback_Parcel(getviewlifecycleowner.ICustomTabsCallbackStub());
                    return;
                } else {
                    onExtraCallback(getviewlifecycleowner.onPostMessage());
                    return;
                }
            case 8:
                getInterfaceDescriptor(getviewlifecycleowner.ICustomTabsCallbackStub());
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
            default:
                throw new RuntimeException("Internal error: unexpected token: " + getviewlifecycleowner.asBinder());
        }
    }

    /* renamed from: o.waitForLoader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] IAuthTabCallback;
        static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[getViewLifecycleOwner.IAuthTabCallback.values().length];
            IAuthTabCallback = iArr;
            try {
                iArr[getViewLifecycleOwner.IAuthTabCallback.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IAuthTabCallback[getViewLifecycleOwner.IAuthTabCallback.BIG_INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[getTargetRequestCode.values().length];
            onExtraCallback = iArr2;
            try {
                iArr2[getTargetRequestCode.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallback[getTargetRequestCode.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onExtraCallback[getTargetRequestCode.START_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onExtraCallback[getTargetRequestCode.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onExtraCallback[getTargetRequestCode.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onExtraCallback[getTargetRequestCode.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onExtraCallback[getTargetRequestCode.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onExtraCallback[getTargetRequestCode.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                onExtraCallback[getTargetRequestCode.VALUE_TRUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                onExtraCallback[getTargetRequestCode.VALUE_FALSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                onExtraCallback[getTargetRequestCode.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                onExtraCallback[getTargetRequestCode.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.core.io.JsonEOFException */
    @Override // o.getView
    public void IAuthTabCallbackDefault(getViewLifecycleOwner getviewlifecycleowner) throws JsonEOFException, IOException {
        getTargetRequestCode gettargetrequestcodeAsBinder = getviewlifecycleowner.asBinder();
        if (gettargetrequestcodeAsBinder == getTargetRequestCode.FIELD_NAME) {
            if (this.access100) {
                asInterface(getviewlifecycleowner);
            }
            onExtraCallbackWithResult(getviewlifecycleowner.asInterface());
            gettargetrequestcodeAsBinder = getviewlifecycleowner.validateRelationship();
        } else if (gettargetrequestcodeAsBinder == null) {
            throw new JsonEOFException(getviewlifecycleowner, (getTargetRequestCode) null, "Unexpected end-of-input");
        }
        int i2 = AnonymousClass1.onExtraCallback[gettargetrequestcodeAsBinder.ordinal()];
        if (i2 == 1) {
            if (this.access100) {
                asInterface(getviewlifecycleowner);
            }
            getInterfaceDescriptor();
            IAuthTabCallbackStub(getviewlifecycleowner);
            return;
        }
        if (i2 == 2) {
            access000();
            return;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                access100();
                return;
            } else {
                onNavigationEvent(getviewlifecycleowner, gettargetrequestcodeAsBinder);
                return;
            }
        }
        if (this.access100) {
            asInterface(getviewlifecycleowner);
        }
        IAuthTabCallback_Parcel();
        IAuthTabCallbackStub(getviewlifecycleowner);
    }

    protected void IAuthTabCallbackStub(getViewLifecycleOwner getviewlifecycleowner) throws IOException {
        int i2 = 1;
        while (true) {
            getTargetRequestCode gettargetrequestcodeValidateRelationship = getviewlifecycleowner.validateRelationship();
            if (gettargetrequestcodeValidateRelationship == null) {
                return;
            }
            int i3 = AnonymousClass1.onExtraCallback[gettargetrequestcodeValidateRelationship.ordinal()];
            if (i3 == 1) {
                if (this.access100) {
                    asInterface(getviewlifecycleowner);
                }
                getInterfaceDescriptor();
            } else if (i3 == 2) {
                access000();
                i2--;
                if (i2 == 0) {
                    return;
                }
            } else if (i3 == 3) {
                if (this.access100) {
                    asInterface(getviewlifecycleowner);
                }
                IAuthTabCallback_Parcel();
            } else if (i3 == 4) {
                access100();
                i2--;
                if (i2 == 0) {
                    return;
                }
            } else if (i3 == 5) {
                if (this.access100) {
                    asInterface(getviewlifecycleowner);
                }
                onExtraCallbackWithResult(getviewlifecycleowner.asInterface());
            } else {
                onNavigationEvent(getviewlifecycleowner, gettargetrequestcodeValidateRelationship);
            }
            i2++;
        }
    }

    private void onNavigationEvent(getViewLifecycleOwner getviewlifecycleowner, getTargetRequestCode gettargetrequestcode) throws IOException {
        if (this.access100) {
            asInterface(getviewlifecycleowner);
        }
        switch (AnonymousClass1.onExtraCallback[gettargetrequestcode.ordinal()]) {
            case 6:
                if (getviewlifecycleowner.prefetchWithMultipleUrls()) {
                    onNavigationEvent(getviewlifecycleowner.ICustomTabsService(), getviewlifecycleowner.newSession(), getviewlifecycleowner.ICustomTabsCallback_Parcel());
                    return;
                } else {
                    asBinder(getviewlifecycleowner.mayLaunchUrl());
                    return;
                }
            case 7:
                int i2 = AnonymousClass1.IAuthTabCallback[getviewlifecycleowner.onMinimized().ordinal()];
                if (i2 == 1) {
                    onExtraCallbackWithResult(getviewlifecycleowner.onMessageChannelReady());
                    return;
                } else if (i2 == 2) {
                    IAuthTabCallback_Parcel(getviewlifecycleowner.ICustomTabsCallbackStub());
                    return;
                } else {
                    onExtraCallback(getviewlifecycleowner.onPostMessage());
                    return;
                }
            case 8:
                getInterfaceDescriptor(getviewlifecycleowner.ICustomTabsCallbackStub());
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
            default:
                throw new RuntimeException("Internal error: unexpected token: " + gettargetrequestcode);
        }
    }

    private final void asInterface(getViewLifecycleOwner getviewlifecycleowner) throws IOException {
        Object objNewAuthTabSession = getviewlifecycleowner.newAuthTabSession();
        this.writeTypedObject = objNewAuthTabSession;
        if (objNewAuthTabSession != null) {
            this.getInterfaceDescriptor = true;
        }
        Object objICustomTabsCallbackStubProxy = getviewlifecycleowner.ICustomTabsCallbackStubProxy();
        this.readTypedObject = objICustomTabsCallbackStubProxy;
        if (objICustomTabsCallbackStubProxy != null) {
            this.getInterfaceDescriptor = true;
        }
    }

    protected final void onNavigationEvent(getTargetRequestCode gettargetrequestcode) {
        onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback;
        this.onPostMessage.writeTypedObject();
        if (this.getInterfaceDescriptor) {
            onextracallbackwithresultOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(this.IAuthTabCallbackDefault, gettargetrequestcode, this.readTypedObject, this.writeTypedObject);
        } else {
            onextracallbackwithresultOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(this.IAuthTabCallbackDefault, gettargetrequestcode);
        }
        if (onextracallbackwithresultOnExtraCallback == null) {
            this.IAuthTabCallbackDefault++;
        } else {
            this.IAuthTabCallbackStubProxy = onextracallbackwithresultOnExtraCallback;
            this.IAuthTabCallbackDefault = 1;
        }
    }

    protected final void onExtraCallback(getTargetRequestCode gettargetrequestcode, Object obj) {
        onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent;
        this.onPostMessage.writeTypedObject();
        if (this.getInterfaceDescriptor) {
            onextracallbackwithresultOnNavigationEvent = this.IAuthTabCallbackStubProxy.onNavigationEvent(this.IAuthTabCallbackDefault, gettargetrequestcode, obj, this.readTypedObject, this.writeTypedObject);
        } else {
            onextracallbackwithresultOnNavigationEvent = this.IAuthTabCallbackStubProxy.onNavigationEvent(this.IAuthTabCallbackDefault, gettargetrequestcode, obj);
        }
        if (onextracallbackwithresultOnNavigationEvent == null) {
            this.IAuthTabCallbackDefault++;
        } else {
            this.IAuthTabCallbackStubProxy = onextracallbackwithresultOnNavigationEvent;
            this.IAuthTabCallbackDefault = 1;
        }
    }

    protected final void access100(Object obj) {
        onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent;
        if (this.getInterfaceDescriptor) {
            onextracallbackwithresultOnNavigationEvent = this.IAuthTabCallbackStubProxy.onNavigationEvent(this.IAuthTabCallbackDefault, getTargetRequestCode.FIELD_NAME, obj, this.readTypedObject, this.writeTypedObject);
        } else {
            onextracallbackwithresultOnNavigationEvent = this.IAuthTabCallbackStubProxy.onNavigationEvent(this.IAuthTabCallbackDefault, getTargetRequestCode.FIELD_NAME, obj);
        }
        if (onextracallbackwithresultOnNavigationEvent == null) {
            this.IAuthTabCallbackDefault++;
        } else {
            this.IAuthTabCallbackStubProxy = onextracallbackwithresultOnNavigationEvent;
            this.IAuthTabCallbackDefault = 1;
        }
    }

    protected final void IAuthTabCallback(getTargetRequestCode gettargetrequestcode) {
        onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback;
        if (this.getInterfaceDescriptor) {
            onextracallbackwithresultOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(this.IAuthTabCallbackDefault, gettargetrequestcode, this.readTypedObject, this.writeTypedObject);
        } else {
            onextracallbackwithresultOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(this.IAuthTabCallbackDefault, gettargetrequestcode);
        }
        if (onextracallbackwithresultOnExtraCallback == null) {
            this.IAuthTabCallbackDefault++;
        } else {
            this.IAuthTabCallbackStubProxy = onextracallbackwithresultOnExtraCallback;
            this.IAuthTabCallbackDefault = 1;
        }
    }

    protected final void onExtraCallback(getTargetRequestCode gettargetrequestcode) {
        onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(this.IAuthTabCallbackDefault, gettargetrequestcode);
        if (onextracallbackwithresultOnExtraCallback == null) {
            this.IAuthTabCallbackDefault++;
        } else {
            this.IAuthTabCallbackStubProxy = onextracallbackwithresultOnExtraCallback;
            this.IAuthTabCallbackDefault = 1;
        }
    }

    @Override // o.getView
    public void IAuthTabCallback() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    protected static final class IAuthTabCallback extends noteStateNotSaved {
        protected final boolean IAuthTabCallbackDefault;
        protected getSharedElementTargetNames IAuthTabCallbackStub;
        protected onExtraCallbackWithResult IAuthTabCallbackStubProxy;
        protected onForceLoad IAuthTabCallback_Parcel;
        protected int access000;
        protected final boolean asBinder;
        protected getViewLifecycleOwnerLiveData asInterface;
        protected boolean onExtraCallbackWithResult;
        protected final boolean onTransact;
        protected transient startPostponedEnterTransition onWarmupCompleted;

        @Override // o.getViewLifecycleOwner
        public int newSession() {
            return 0;
        }

        @Override // o.getViewLifecycleOwner
        public boolean prefetchWithMultipleUrls() {
            return false;
        }

        public IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, boolean z, boolean z2, getUserVisibleHint getuservisiblehint, isDetached isdetached) {
            super(isdetached);
            this.IAuthTabCallbackStub = null;
            this.IAuthTabCallbackStubProxy = onextracallbackwithresult;
            this.access000 = -1;
            this.asInterface = getviewlifecycleownerlivedata;
            this.IAuthTabCallback_Parcel = onForceLoad.onNavigationEvent(getuservisiblehint);
            this.asBinder = z;
            this.IAuthTabCallbackDefault = z2;
            this.onTransact = z || z2;
        }

        public void IAuthTabCallback(getSharedElementTargetNames getsharedelementtargetnames) {
            this.IAuthTabCallbackStub = getsharedelementtargetnames;
        }

        @Override // o.getViewLifecycleOwner
        public getViewLifecycleOwnerLiveData access100() {
            return this.asInterface;
        }

        @Override // o.getViewLifecycleOwner
        public r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<isAdded> isEngagementSignalsApiAvailable() {
            return getViewLifecycleOwner.onNavigationEvent;
        }

        @Override // o.noteStateNotSaved, o.getViewLifecycleOwner
        public isDetached access200() {
            return this.ICustomTabsServiceStub;
        }

        @Override // o.getViewLifecycleOwner, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.onExtraCallbackWithResult) {
                return;
            }
            this.onExtraCallbackWithResult = true;
        }

        @Override // o.noteStateNotSaved, o.getViewLifecycleOwner
        public getTargetRequestCode validateRelationship() throws IOException {
            onExtraCallbackWithResult onextracallbackwithresult;
            if (this.onExtraCallbackWithResult || (onextracallbackwithresult = this.IAuthTabCallbackStubProxy) == null) {
                return null;
            }
            int i2 = this.access000 + 1;
            this.access000 = i2;
            if (i2 >= 16) {
                this.access000 = 0;
                onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
                this.IAuthTabCallbackStubProxy = onextracallbackwithresultOnNavigationEvent;
                if (onextracallbackwithresultOnNavigationEvent == null) {
                    return null;
                }
            }
            IAuthTabCallback(this.IAuthTabCallbackStubProxy.onNavigationEvent(this.access000));
            getTargetRequestCode gettargetrequestcode = this.prefetchWithMultipleUrls;
            if (gettargetrequestcode == getTargetRequestCode.FIELD_NAME) {
                Object objIEngagementSignalsCallback = IEngagementSignalsCallback();
                this.IAuthTabCallback_Parcel.IAuthTabCallback(objIEngagementSignalsCallback instanceof String ? (String) objIEngagementSignalsCallback : objIEngagementSignalsCallback.toString());
            } else if (gettargetrequestcode == getTargetRequestCode.START_OBJECT) {
                this.IAuthTabCallback_Parcel = this.IAuthTabCallback_Parcel.IAuthTabCallbackStubProxy();
            } else if (gettargetrequestcode == getTargetRequestCode.START_ARRAY) {
                this.IAuthTabCallback_Parcel = this.IAuthTabCallback_Parcel.access100();
            } else if (gettargetrequestcode == getTargetRequestCode.END_OBJECT || gettargetrequestcode == getTargetRequestCode.END_ARRAY) {
                this.IAuthTabCallback_Parcel = this.IAuthTabCallback_Parcel.access000();
            } else {
                this.IAuthTabCallback_Parcel.extraCallbackWithResult();
            }
            return this.prefetchWithMultipleUrls;
        }

        @Override // o.getViewLifecycleOwner
        public String ICustomTabsServiceDefault() throws IOException {
            onExtraCallbackWithResult onextracallbackwithresult;
            if (this.onExtraCallbackWithResult || (onextracallbackwithresult = this.IAuthTabCallbackStubProxy) == null) {
                return null;
            }
            int i2 = this.access000 + 1;
            if (i2 < 16) {
                getTargetRequestCode gettargetrequestcodeOnNavigationEvent = onextracallbackwithresult.onNavigationEvent(i2);
                getTargetRequestCode gettargetrequestcode = getTargetRequestCode.FIELD_NAME;
                if (gettargetrequestcodeOnNavigationEvent == gettargetrequestcode) {
                    this.access000 = i2;
                    IAuthTabCallback(gettargetrequestcode);
                    Object objOnExtraCallbackWithResult = this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(i2);
                    String string = objOnExtraCallbackWithResult instanceof String ? (String) objOnExtraCallbackWithResult : objOnExtraCallbackWithResult.toString();
                    this.IAuthTabCallback_Parcel.IAuthTabCallback(string);
                    return string;
                }
            }
            if (validateRelationship() == getTargetRequestCode.FIELD_NAME) {
                return asInterface();
            }
            return null;
        }

        @Override // o.getViewLifecycleOwner
        public getUserVisibleHint onUnminimized() {
            return this.IAuthTabCallback_Parcel;
        }

        @Override // o.getViewLifecycleOwner
        public getSharedElementTargetNames onWarmupCompleted() {
            getSharedElementTargetNames getsharedelementtargetnames = this.IAuthTabCallbackStub;
            return getsharedelementtargetnames == null ? getSharedElementTargetNames.IAuthTabCallback : getsharedelementtargetnames;
        }

        @Override // o.getViewLifecycleOwner
        public getSharedElementTargetNames IAuthTabCallbackDefault() {
            return onWarmupCompleted();
        }

        @Override // o.getViewLifecycleOwner
        @Deprecated
        public getSharedElementTargetNames newSessionWithExtras() {
            return IAuthTabCallbackDefault();
        }

        @Override // o.getViewLifecycleOwner
        @Deprecated
        public getSharedElementTargetNames access000() {
            return onWarmupCompleted();
        }

        @Override // o.getViewLifecycleOwner
        public String asInterface() {
            getTargetRequestCode gettargetrequestcode = this.prefetchWithMultipleUrls;
            if (gettargetrequestcode == getTargetRequestCode.START_OBJECT || gettargetrequestcode == getTargetRequestCode.START_ARRAY) {
                return this.IAuthTabCallback_Parcel.asInterface().onExtraCallbackWithResult();
            }
            return this.IAuthTabCallback_Parcel.onExtraCallbackWithResult();
        }

        @Override // o.getViewLifecycleOwner
        @Deprecated
        public String writeTypedObject() {
            return asInterface();
        }

        @Override // o.noteStateNotSaved, o.getViewLifecycleOwner
        public String mayLaunchUrl() {
            getTargetRequestCode gettargetrequestcode = this.prefetchWithMultipleUrls;
            if (gettargetrequestcode == getTargetRequestCode.VALUE_STRING || gettargetrequestcode == getTargetRequestCode.FIELD_NAME) {
                Object objIEngagementSignalsCallback = IEngagementSignalsCallback();
                if (objIEngagementSignalsCallback instanceof String) {
                    return (String) objIEngagementSignalsCallback;
                }
                return SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(objIEngagementSignalsCallback);
            }
            if (gettargetrequestcode == null) {
                return null;
            }
            int i2 = AnonymousClass1.onExtraCallback[gettargetrequestcode.ordinal()];
            if (i2 == 7 || i2 == 8) {
                return SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(IEngagementSignalsCallback());
            }
            return this.prefetchWithMultipleUrls.asString();
        }

        @Override // o.getViewLifecycleOwner
        public char[] ICustomTabsService() {
            String strMayLaunchUrl = mayLaunchUrl();
            if (strMayLaunchUrl == null) {
                return null;
            }
            return strMayLaunchUrl.toCharArray();
        }

        @Override // o.getViewLifecycleOwner
        public int ICustomTabsCallback_Parcel() {
            String strMayLaunchUrl = mayLaunchUrl();
            if (strMayLaunchUrl == null) {
                return 0;
            }
            return strMayLaunchUrl.length();
        }

        @Override // o.getViewLifecycleOwner
        public boolean updateVisuals() {
            boolean zIsFinite;
            if (this.prefetchWithMultipleUrls != getTargetRequestCode.VALUE_NUMBER_FLOAT) {
                return false;
            }
            Object objIEngagementSignalsCallback = IEngagementSignalsCallback();
            if (objIEngagementSignalsCallback instanceof Double) {
                zIsFinite = Double.isFinite(((Double) objIEngagementSignalsCallback).doubleValue());
            } else {
                if (!(objIEngagementSignalsCallback instanceof Float)) {
                    return false;
                }
                zIsFinite = Double.isFinite(((Float) objIEngagementSignalsCallback).floatValue());
            }
            return !zIsFinite;
        }

        @Override // o.getViewLifecycleOwner
        public BigInteger IAuthTabCallbackStub() throws NumberFormatException, IOException {
            Number numberOnExtraCallbackWithResult = onExtraCallbackWithResult(true);
            if (numberOnExtraCallbackWithResult instanceof BigInteger) {
                return (BigInteger) numberOnExtraCallbackWithResult;
            }
            if (numberOnExtraCallbackWithResult instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) numberOnExtraCallbackWithResult;
                access200().onExtraCallback(bigDecimal.scale());
                return bigDecimal.toBigInteger();
            }
            return BigInteger.valueOf(numberOnExtraCallbackWithResult.longValue());
        }

        @Override // o.getViewLifecycleOwner
        public BigDecimal extraCallbackWithResult() throws NumberFormatException, IOException {
            Number numberOnExtraCallbackWithResult = onExtraCallbackWithResult(true);
            if (numberOnExtraCallbackWithResult instanceof BigDecimal) {
                return (BigDecimal) numberOnExtraCallbackWithResult;
            }
            if (numberOnExtraCallbackWithResult instanceof Integer) {
                return BigDecimal.valueOf(numberOnExtraCallbackWithResult.intValue());
            }
            if (numberOnExtraCallbackWithResult instanceof Long) {
                return BigDecimal.valueOf(numberOnExtraCallbackWithResult.longValue());
            }
            if (numberOnExtraCallbackWithResult instanceof BigInteger) {
                return new BigDecimal((BigInteger) numberOnExtraCallbackWithResult);
            }
            return BigDecimal.valueOf(numberOnExtraCallbackWithResult.doubleValue());
        }

        @Override // o.getViewLifecycleOwner
        public double extraCallback() throws IOException {
            return ICustomTabsCallbackDefault().doubleValue();
        }

        @Override // o.getViewLifecycleOwner
        public float onActivityLayout() throws IOException {
            return ICustomTabsCallbackDefault().floatValue();
        }

        @Override // o.getViewLifecycleOwner
        public int onMessageChannelReady() throws NumberFormatException, IOException {
            Number numberOnExtraCallbackWithResult = onExtraCallbackWithResult(false);
            if ((numberOnExtraCallbackWithResult instanceof Integer) || onExtraCallbackWithResult(numberOnExtraCallbackWithResult)) {
                return numberOnExtraCallbackWithResult.intValue();
            }
            return onNavigationEvent(numberOnExtraCallbackWithResult);
        }

        @Override // o.getViewLifecycleOwner
        public long onPostMessage() throws NumberFormatException, IOException {
            Number numberOnExtraCallbackWithResult = onExtraCallbackWithResult(false);
            if ((numberOnExtraCallbackWithResult instanceof Long) || onWarmupCompleted(numberOnExtraCallbackWithResult)) {
                return numberOnExtraCallbackWithResult.longValue();
            }
            return onExtraCallback(numberOnExtraCallbackWithResult);
        }

        @Override // o.getViewLifecycleOwner
        public getViewLifecycleOwner.IAuthTabCallback onMinimized() throws IOException {
            Object objICustomTabsCallbackStub = ICustomTabsCallbackStub();
            if (objICustomTabsCallbackStub instanceof Integer) {
                return getViewLifecycleOwner.IAuthTabCallback.INT;
            }
            if (objICustomTabsCallbackStub instanceof Long) {
                return getViewLifecycleOwner.IAuthTabCallback.LONG;
            }
            if (objICustomTabsCallbackStub instanceof Double) {
                return getViewLifecycleOwner.IAuthTabCallback.DOUBLE;
            }
            if (objICustomTabsCallbackStub instanceof BigDecimal) {
                return getViewLifecycleOwner.IAuthTabCallback.BIG_DECIMAL;
            }
            if (objICustomTabsCallbackStub instanceof BigInteger) {
                return getViewLifecycleOwner.IAuthTabCallback.BIG_INTEGER;
            }
            if (objICustomTabsCallbackStub instanceof Float) {
                return getViewLifecycleOwner.IAuthTabCallback.FLOAT;
            }
            if (objICustomTabsCallbackStub instanceof Short) {
                return getViewLifecycleOwner.IAuthTabCallback.INT;
            }
            if (objICustomTabsCallbackStub instanceof String) {
                return this.prefetchWithMultipleUrls == getTargetRequestCode.VALUE_NUMBER_FLOAT ? getViewLifecycleOwner.IAuthTabCallback.BIG_DECIMAL : getViewLifecycleOwner.IAuthTabCallback.BIG_INTEGER;
            }
            return null;
        }

        @Override // o.getViewLifecycleOwner
        public getViewLifecycleOwner.onNavigationEvent onRelationshipValidationResult() throws IOException {
            if (this.prefetchWithMultipleUrls == getTargetRequestCode.VALUE_NUMBER_FLOAT) {
                Object objIEngagementSignalsCallback = IEngagementSignalsCallback();
                if (objIEngagementSignalsCallback instanceof Double) {
                    return getViewLifecycleOwner.onNavigationEvent.DOUBLE64;
                }
                if (objIEngagementSignalsCallback instanceof BigDecimal) {
                    return getViewLifecycleOwner.onNavigationEvent.BIG_DECIMAL;
                }
                if (objIEngagementSignalsCallback instanceof Float) {
                    return getViewLifecycleOwner.onNavigationEvent.FLOAT32;
                }
            }
            return getViewLifecycleOwner.onNavigationEvent.UNKNOWN;
        }

        @Override // o.getViewLifecycleOwner
        public final Number ICustomTabsCallbackDefault() throws IOException {
            return onExtraCallbackWithResult(false);
        }

        @Override // o.getViewLifecycleOwner
        public Object ICustomTabsCallbackStub() throws IOException {
            ICustomTabsServiceStubProxy();
            return IEngagementSignalsCallback();
        }

        private Number onExtraCallbackWithResult(boolean z) throws NumberFormatException, IOException {
            ICustomTabsServiceStubProxy();
            Object objIEngagementSignalsCallback = IEngagementSignalsCallback();
            if (objIEngagementSignalsCallback instanceof Number) {
                return (Number) objIEngagementSignalsCallback;
            }
            if (objIEngagementSignalsCallback instanceof String) {
                String str = (String) objIEngagementSignalsCallback;
                int length = str.length();
                if (this.prefetchWithMultipleUrls == getTargetRequestCode.VALUE_NUMBER_INT) {
                    if (z || length >= 19) {
                        return requestPermissions.IAuthTabCallback(str, onNavigationEvent(isPostponed.USE_FAST_BIG_NUMBER_PARSER));
                    }
                    if (length >= 10) {
                        return Long.valueOf(requestPermissions.onExtraCallback(str));
                    }
                    return Integer.valueOf(requestPermissions.onWarmupCompleted(str));
                }
                if (z) {
                    BigDecimal bigDecimalOnWarmupCompleted = requestPermissions.onWarmupCompleted(str, onNavigationEvent(isPostponed.USE_FAST_BIG_NUMBER_PARSER));
                    if (bigDecimalOnWarmupCompleted != null) {
                        return bigDecimalOnWarmupCompleted;
                    }
                    throw new IllegalStateException("Internal error: failed to parse number '" + str + "'");
                }
                return Double.valueOf(requestPermissions.onExtraCallback(str, onNavigationEvent(isPostponed.USE_FAST_DOUBLE_PARSER)));
            }
            throw new IllegalStateException("Internal error: entry should be a Number, but is of type " + SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(objIEngagementSignalsCallback));
        }

        private final boolean onExtraCallbackWithResult(Number number) {
            return (number instanceof Short) || (number instanceof Byte);
        }

        private final boolean onWarmupCompleted(Number number) {
            return (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }

        protected int onNavigationEvent(Number number) throws IOException, InputCoercionException {
            if (number instanceof Long) {
                long jLongValue = number.longValue();
                int i2 = (int) jLongValue;
                if (i2 != jLongValue) {
                    RemoteActionCompatParcelizer();
                }
                return i2;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (noteStateNotSaved.receiveFile.compareTo(bigInteger) > 0 || noteStateNotSaved.newSessionWithExtras.compareTo(bigInteger) < 0) {
                    RemoteActionCompatParcelizer();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -2.147483648E9d || dDoubleValue > 2.147483647E9d) {
                        RemoteActionCompatParcelizer();
                    }
                    return (int) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (noteStateNotSaved.prefetch.compareTo(bigDecimal) > 0 || noteStateNotSaved.mayLaunchUrl.compareTo(bigDecimal) < 0) {
                        RemoteActionCompatParcelizer();
                    }
                } else {
                    read();
                }
            }
            return number.intValue();
        }

        protected long onExtraCallback(Number number) throws IOException, InputCoercionException {
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (noteStateNotSaved.requestPostMessageChannel.compareTo(bigInteger) > 0 || noteStateNotSaved.newSession.compareTo(bigInteger) < 0) {
                    ITrustedWebActivityServiceStubProxy();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -9.223372036854776E18d || dDoubleValue > 9.223372036854776E18d) {
                        ITrustedWebActivityServiceStubProxy();
                    }
                    return (long) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (noteStateNotSaved.newAuthTabSession.compareTo(bigDecimal) > 0 || noteStateNotSaved.postMessage.compareTo(bigDecimal) < 0) {
                        ITrustedWebActivityServiceStubProxy();
                    }
                } else {
                    read();
                }
            }
            return number.longValue();
        }

        @Override // o.getViewLifecycleOwner
        public Object onActivityResized() {
            if (this.prefetchWithMultipleUrls == getTargetRequestCode.VALUE_EMBEDDED_OBJECT) {
                return IEngagementSignalsCallback();
            }
            return null;
        }

        @Override // o.getViewLifecycleOwner
        public byte[] onExtraCallback(getPostOnViewCreatedAlpha getpostonviewcreatedalpha) throws IOException {
            if (this.prefetchWithMultipleUrls == getTargetRequestCode.VALUE_EMBEDDED_OBJECT) {
                Object objIEngagementSignalsCallback = IEngagementSignalsCallback();
                if (objIEngagementSignalsCallback instanceof byte[]) {
                    return (byte[]) objIEngagementSignalsCallback;
                }
            }
            if (this.prefetchWithMultipleUrls != getTargetRequestCode.VALUE_STRING) {
                throw onExtraCallbackWithResult("Current token (" + this.prefetchWithMultipleUrls + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            }
            String strMayLaunchUrl = mayLaunchUrl();
            if (strMayLaunchUrl == null) {
                return null;
            }
            startPostponedEnterTransition startpostponedentertransition = this.onWarmupCompleted;
            if (startpostponedentertransition == null) {
                startpostponedentertransition = new startPostponedEnterTransition(100);
                this.onWarmupCompleted = startpostponedentertransition;
            } else {
                startpostponedentertransition.IAuthTabCallbackDefault();
            }
            onExtraCallbackWithResult(strMayLaunchUrl, startpostponedentertransition, getpostonviewcreatedalpha);
            return startpostponedentertransition.asInterface();
        }

        @Override // o.getViewLifecycleOwner
        public int onNavigationEvent(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, OutputStream outputStream) throws IOException {
            byte[] bArrOnExtraCallback = onExtraCallback(getpostonviewcreatedalpha);
            if (bArrOnExtraCallback == null) {
                return 0;
            }
            outputStream.write(bArrOnExtraCallback, 0, bArrOnExtraCallback.length);
            return bArrOnExtraCallback.length;
        }

        @Override // o.getViewLifecycleOwner
        public boolean onExtraCallbackWithResult() {
            return this.IAuthTabCallbackDefault;
        }

        @Override // o.getViewLifecycleOwner
        public boolean onNavigationEvent() {
            return this.asBinder;
        }

        @Override // o.getViewLifecycleOwner
        public Object newAuthTabSession() {
            return this.IAuthTabCallbackStubProxy.IAuthTabCallback(this.access000);
        }

        @Override // o.getViewLifecycleOwner
        public Object ICustomTabsCallbackStubProxy() {
            return this.IAuthTabCallbackStubProxy.onExtraCallback(this.access000);
        }

        protected final Object IEngagementSignalsCallback() {
            return this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(this.access000);
        }

        protected final void ICustomTabsServiceStubProxy() throws JacksonException {
            getTargetRequestCode gettargetrequestcode = this.prefetchWithMultipleUrls;
            if (gettargetrequestcode == null || !gettargetrequestcode.isNumeric()) {
                throw onExtraCallbackWithResult("Current token (" + this.prefetchWithMultipleUrls + ") not numeric, cannot use numeric value accessors");
            }
        }

        @Override // o.noteStateNotSaved
        public void IPostMessageServiceDefault() {
            read();
        }
    }

    protected static final class onExtraCallbackWithResult {
        private static final getTargetRequestCode[] IAuthTabCallback;
        protected long onExtraCallback;
        protected TreeMap<Integer, Object> onExtraCallbackWithResult;
        protected onExtraCallbackWithResult onNavigationEvent;
        protected final Object[] onWarmupCompleted = new Object[16];

        private final int IAuthTabCallbackStub(int i2) {
            return i2 + i2;
        }

        private final int onWarmupCompleted(int i2) {
            return i2 + i2 + 1;
        }

        static {
            getTargetRequestCode[] gettargetrequestcodeArr = new getTargetRequestCode[16];
            IAuthTabCallback = gettargetrequestcodeArr;
            getTargetRequestCode[] gettargetrequestcodeArrValues = getTargetRequestCode.values();
            System.arraycopy(gettargetrequestcodeArrValues, 1, gettargetrequestcodeArr, 1, Math.min(15, gettargetrequestcodeArrValues.length - 1));
        }

        public getTargetRequestCode onNavigationEvent(int i2) {
            long j = this.onExtraCallback;
            if (i2 > 0) {
                j >>= i2 << 2;
            }
            return IAuthTabCallback[((int) j) & 15];
        }

        public Object onExtraCallbackWithResult(int i2) {
            return this.onWarmupCompleted[i2];
        }

        public onExtraCallbackWithResult onNavigationEvent() {
            return this.onNavigationEvent;
        }

        public boolean IAuthTabCallback() {
            return this.onExtraCallbackWithResult != null;
        }

        public onExtraCallbackWithResult onExtraCallback(int i2, getTargetRequestCode gettargetrequestcode) {
            if (i2 < 16) {
                onNavigationEvent(i2, gettargetrequestcode);
                return null;
            }
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
            this.onNavigationEvent = onextracallbackwithresult;
            onextracallbackwithresult.onNavigationEvent(0, gettargetrequestcode);
            return this.onNavigationEvent;
        }

        public onExtraCallbackWithResult onExtraCallback(int i2, getTargetRequestCode gettargetrequestcode, Object obj, Object obj2) {
            if (i2 < 16) {
                onNavigationEvent(i2, gettargetrequestcode, obj, obj2);
                return null;
            }
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
            this.onNavigationEvent = onextracallbackwithresult;
            onextracallbackwithresult.onNavigationEvent(0, gettargetrequestcode, obj, obj2);
            return this.onNavigationEvent;
        }

        public onExtraCallbackWithResult onNavigationEvent(int i2, getTargetRequestCode gettargetrequestcode, Object obj) {
            if (i2 < 16) {
                IAuthTabCallback(i2, gettargetrequestcode, obj);
                return null;
            }
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
            this.onNavigationEvent = onextracallbackwithresult;
            onextracallbackwithresult.IAuthTabCallback(0, gettargetrequestcode, obj);
            return this.onNavigationEvent;
        }

        public onExtraCallbackWithResult onNavigationEvent(int i2, getTargetRequestCode gettargetrequestcode, Object obj, Object obj2, Object obj3) {
            if (i2 < 16) {
                onExtraCallback(i2, gettargetrequestcode, obj, obj2, obj3);
                return null;
            }
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
            this.onNavigationEvent = onextracallbackwithresult;
            onextracallbackwithresult.onExtraCallback(0, gettargetrequestcode, obj, obj2, obj3);
            return this.onNavigationEvent;
        }

        private void onNavigationEvent(int i2, getTargetRequestCode gettargetrequestcode) {
            long jOrdinal = gettargetrequestcode.ordinal();
            if (i2 > 0) {
                jOrdinal <<= i2 << 2;
            }
            this.onExtraCallback |= jOrdinal;
        }

        private void onNavigationEvent(int i2, getTargetRequestCode gettargetrequestcode, Object obj, Object obj2) {
            long jOrdinal = gettargetrequestcode.ordinal();
            if (i2 > 0) {
                jOrdinal <<= i2 << 2;
            }
            this.onExtraCallback = jOrdinal | this.onExtraCallback;
            IAuthTabCallback(i2, obj, obj2);
        }

        private void IAuthTabCallback(int i2, getTargetRequestCode gettargetrequestcode, Object obj) {
            this.onWarmupCompleted[i2] = obj;
            long jOrdinal = gettargetrequestcode.ordinal();
            if (i2 > 0) {
                jOrdinal <<= i2 << 2;
            }
            this.onExtraCallback |= jOrdinal;
        }

        private void onExtraCallback(int i2, getTargetRequestCode gettargetrequestcode, Object obj, Object obj2, Object obj3) {
            this.onWarmupCompleted[i2] = obj;
            long jOrdinal = gettargetrequestcode.ordinal();
            if (i2 > 0) {
                jOrdinal <<= i2 << 2;
            }
            this.onExtraCallback = jOrdinal | this.onExtraCallback;
            IAuthTabCallback(i2, obj2, obj3);
        }

        private final void IAuthTabCallback(int i2, Object obj, Object obj2) {
            if (this.onExtraCallbackWithResult == null) {
                this.onExtraCallbackWithResult = new TreeMap<>();
            }
            if (obj != null) {
                this.onExtraCallbackWithResult.put(Integer.valueOf(onWarmupCompleted(i2)), obj);
            }
            if (obj2 != null) {
                this.onExtraCallbackWithResult.put(Integer.valueOf(IAuthTabCallbackStub(i2)), obj2);
            }
        }

        Object onExtraCallback(int i2) {
            TreeMap<Integer, Object> treeMap = this.onExtraCallbackWithResult;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(onWarmupCompleted(i2)));
        }

        Object IAuthTabCallback(int i2) {
            TreeMap<Integer, Object> treeMap = this.onExtraCallbackWithResult;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(IAuthTabCallbackStub(i2)));
        }
    }
}

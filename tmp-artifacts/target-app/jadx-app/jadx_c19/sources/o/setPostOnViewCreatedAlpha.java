package o;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.getView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setPostOnViewCreatedAlpha extends setExitSharedElementCallback {
    protected int ICustomTabsCallbackDefault;
    protected char[] ICustomTabsCallbackStub;
    protected char ICustomTabsCallbackStubProxy;
    protected final Writer ICustomTabsService;
    protected hasOptionsMenu onActivityLayout;
    protected char[] onActivityResized;
    protected char[] onPostMessage;
    protected int onRelationshipValidationResult;
    protected int onUnminimized;
    protected static final char[] onMinimized = postponeEnterTransition.onExtraCallback(true);
    protected static final char[] onMessageChannelReady = postponeEnterTransition.onExtraCallback(false);

    private char[] onActivityLayout() {
        return this.access100 ? onMinimized : onMessageChannelReady;
    }

    public setPostOnViewCreatedAlpha(performViewCreated performviewcreated, int i2, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, Writer writer, char c) {
        super(performviewcreated, i2, getviewlifecycleownerlivedata);
        this.ICustomTabsService = writer;
        char[] cArrOnExtraCallback = performviewcreated.onExtraCallback();
        this.ICustomTabsCallbackStub = cArrOnExtraCallback;
        this.onUnminimized = cArrOnExtraCallback.length;
        this.ICustomTabsCallbackStubProxy = c;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(setNextTransition.ESCAPE_FORWARD_SLASHES.mappedFeature());
        if (c != '\"' || zOnExtraCallbackWithResult) {
            this.readTypedObject = postponeEnterTransition.onExtraCallbackWithResult(c, zOnExtraCallbackWithResult);
        }
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(String str) throws IOException {
        int iOnExtraCallbackWithResult = this.getInterfaceDescriptor.onExtraCallbackWithResult(str);
        if (iOnExtraCallbackWithResult == 4) {
            IAuthTabCallback("Can not write a field name, expecting a value");
        }
        onNavigationEvent(str, iOnExtraCallbackWithResult == 1);
    }

    @Override // o.isRemoving, o.getView
    public void onNavigationEvent(hasOptionsMenu hasoptionsmenu) throws IOException {
        int iOnExtraCallbackWithResult = this.getInterfaceDescriptor.onExtraCallbackWithResult(hasoptionsmenu.onWarmupCompleted());
        if (iOnExtraCallbackWithResult == 4) {
            IAuthTabCallback("Can not write a field name, expecting a value");
        }
        onExtraCallback(hasoptionsmenu, iOnExtraCallbackWithResult == 1);
    }

    protected void onNavigationEvent(String str, boolean z) throws IOException {
        if (this.onExtraCallback != null) {
            onWarmupCompleted(str, z);
            return;
        }
        if (this.ICustomTabsCallbackDefault + 1 >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        if (z) {
            char[] cArr = this.ICustomTabsCallbackStub;
            int i2 = this.ICustomTabsCallbackDefault;
            this.ICustomTabsCallbackDefault = i2 + 1;
            cArr[i2] = ',';
        }
        if (this.IAuthTabCallbackStubProxy) {
            getInterfaceDescriptor(str);
            return;
        }
        char[] cArr2 = this.ICustomTabsCallbackStub;
        int i3 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i3 + 1;
        cArr2[i3] = this.ICustomTabsCallbackStubProxy;
        getInterfaceDescriptor(str);
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr3 = this.ICustomTabsCallbackStub;
        int i4 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i4 + 1;
        cArr3[i4] = this.ICustomTabsCallbackStubProxy;
    }

    protected void onExtraCallback(hasOptionsMenu hasoptionsmenu, boolean z) throws IOException {
        if (this.onExtraCallback != null) {
            onExtraCallbackWithResult(hasoptionsmenu, z);
            return;
        }
        if (this.ICustomTabsCallbackDefault + 1 >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        if (z) {
            char[] cArr = this.ICustomTabsCallbackStub;
            int i2 = this.ICustomTabsCallbackDefault;
            this.ICustomTabsCallbackDefault = i2 + 1;
            cArr[i2] = ',';
        }
        if (this.IAuthTabCallbackStubProxy) {
            char[] cArrIAuthTabCallback = hasoptionsmenu.IAuthTabCallback();
            IAuthTabCallback(cArrIAuthTabCallback, 0, cArrIAuthTabCallback.length);
            return;
        }
        char[] cArr2 = this.ICustomTabsCallbackStub;
        int i3 = this.ICustomTabsCallbackDefault;
        int i4 = i3 + 1;
        this.ICustomTabsCallbackDefault = i4;
        cArr2[i3] = this.ICustomTabsCallbackStubProxy;
        int iIAuthTabCallback = hasoptionsmenu.IAuthTabCallback(cArr2, i4);
        if (iIAuthTabCallback < 0) {
            asInterface(hasoptionsmenu);
            return;
        }
        int i5 = this.ICustomTabsCallbackDefault + iIAuthTabCallback;
        this.ICustomTabsCallbackDefault = i5;
        if (i5 >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr3 = this.ICustomTabsCallbackStub;
        int i6 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i6 + 1;
        cArr3[i6] = this.ICustomTabsCallbackStubProxy;
    }

    protected void asInterface(hasOptionsMenu hasoptionsmenu) throws IOException {
        char[] cArrIAuthTabCallback = hasoptionsmenu.IAuthTabCallback();
        IAuthTabCallback(cArrIAuthTabCallback, 0, cArrIAuthTabCallback.length);
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i2 + 1;
        cArr[i2] = this.ICustomTabsCallbackStubProxy;
    }

    @Override // o.getView
    public void IAuthTabCallback_Parcel() throws IOException {
        IAuthTabCallback_Parcel("start an array");
        this.getInterfaceDescriptor = this.getInterfaceDescriptor.access100();
        asBinder().onExtraCallbackWithResult(this.getInterfaceDescriptor.onExtraCallback());
        initState initstate = this.onExtraCallback;
        if (initstate != null) {
            initstate.IAuthTabCallbackDefault(this);
            return;
        }
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i2 + 1;
        cArr[i2] = '[';
    }

    @Override // o.getView
    public void onTransact(Object obj) throws IOException {
        IAuthTabCallback_Parcel("start an array");
        this.getInterfaceDescriptor = this.getInterfaceDescriptor.onExtraCallbackWithResult(obj);
        asBinder().onExtraCallbackWithResult(this.getInterfaceDescriptor.onExtraCallback());
        initState initstate = this.onExtraCallback;
        if (initstate != null) {
            initstate.IAuthTabCallbackDefault(this);
            return;
        }
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i2 + 1;
        cArr[i2] = '[';
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(Object obj, int i2) throws IOException {
        IAuthTabCallback_Parcel("start an array");
        this.getInterfaceDescriptor = this.getInterfaceDescriptor.onExtraCallbackWithResult(obj);
        asBinder().onExtraCallbackWithResult(this.getInterfaceDescriptor.onExtraCallback());
        initState initstate = this.onExtraCallback;
        if (initstate != null) {
            initstate.IAuthTabCallbackDefault(this);
            return;
        }
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i3 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i3 + 1;
        cArr[i3] = '[';
    }

    @Override // o.getView
    public void access100() throws IOException {
        if (!this.getInterfaceDescriptor.IAuthTabCallbackStub()) {
            IAuthTabCallback("Current context not Array but " + this.getInterfaceDescriptor.getInterfaceDescriptor());
        }
        initState initstate = this.onExtraCallback;
        if (initstate != null) {
            initstate.onWarmupCompleted(this, this.getInterfaceDescriptor.onWarmupCompleted());
        } else {
            if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
                extraCallbackWithResult();
            }
            char[] cArr = this.ICustomTabsCallbackStub;
            int i2 = this.ICustomTabsCallbackDefault;
            this.ICustomTabsCallbackDefault = i2 + 1;
            cArr[i2] = ']';
        }
        this.getInterfaceDescriptor = this.getInterfaceDescriptor.IAuthTabCallbackStubProxy();
    }

    @Override // o.getView
    public void getInterfaceDescriptor() throws IOException {
        IAuthTabCallback_Parcel("start an object");
        this.getInterfaceDescriptor = this.getInterfaceDescriptor.access000();
        asBinder().onExtraCallbackWithResult(this.getInterfaceDescriptor.onExtraCallback());
        initState initstate = this.onExtraCallback;
        if (initstate != null) {
            initstate.onTransact(this);
            return;
        }
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i2 + 1;
        cArr[i2] = '{';
    }

    @Override // o.isRemoving, o.getView
    public void IAuthTabCallbackStub(Object obj) throws IOException {
        IAuthTabCallback_Parcel("start an object");
        setInitialSavedState setinitialsavedstateOnExtraCallback = this.getInterfaceDescriptor.onExtraCallback(obj);
        asBinder().onExtraCallbackWithResult(this.getInterfaceDescriptor.onExtraCallback());
        this.getInterfaceDescriptor = setinitialsavedstateOnExtraCallback;
        initState initstate = this.onExtraCallback;
        if (initstate != null) {
            initstate.onTransact(this);
            return;
        }
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i2 + 1;
        cArr[i2] = '{';
    }

    @Override // o.getView
    public void onNavigationEvent(Object obj, int i2) throws IOException {
        IAuthTabCallbackStub(obj);
    }

    @Override // o.getView
    public void access000() throws IOException {
        if (!this.getInterfaceDescriptor.asBinder()) {
            IAuthTabCallback("Current context not Object but " + this.getInterfaceDescriptor.getInterfaceDescriptor());
        }
        initState initstate = this.onExtraCallback;
        if (initstate != null) {
            initstate.onNavigationEvent(this, this.getInterfaceDescriptor.onWarmupCompleted());
        } else {
            if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
                extraCallbackWithResult();
            }
            char[] cArr = this.ICustomTabsCallbackStub;
            int i2 = this.ICustomTabsCallbackDefault;
            this.ICustomTabsCallbackDefault = i2 + 1;
            cArr[i2] = '}';
        }
        this.getInterfaceDescriptor = this.getInterfaceDescriptor.IAuthTabCallbackStubProxy();
    }

    protected void onWarmupCompleted(String str, boolean z) throws IOException {
        if (z) {
            this.onExtraCallback.onExtraCallback(this);
        } else {
            this.onExtraCallback.onWarmupCompleted(this);
        }
        if (this.IAuthTabCallbackStubProxy) {
            getInterfaceDescriptor(str);
            return;
        }
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i2 + 1;
        cArr[i2] = this.ICustomTabsCallbackStubProxy;
        getInterfaceDescriptor(str);
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr2 = this.ICustomTabsCallbackStub;
        int i3 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i3 + 1;
        cArr2[i3] = this.ICustomTabsCallbackStubProxy;
    }

    protected void onExtraCallbackWithResult(hasOptionsMenu hasoptionsmenu, boolean z) throws IOException {
        if (z) {
            this.onExtraCallback.onExtraCallback(this);
        } else {
            this.onExtraCallback.onWarmupCompleted(this);
        }
        char[] cArrIAuthTabCallback = hasoptionsmenu.IAuthTabCallback();
        if (this.IAuthTabCallbackStubProxy) {
            IAuthTabCallback(cArrIAuthTabCallback, 0, cArrIAuthTabCallback.length);
            return;
        }
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i2 + 1;
        cArr[i2] = this.ICustomTabsCallbackStubProxy;
        IAuthTabCallback(cArrIAuthTabCallback, 0, cArrIAuthTabCallback.length);
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr2 = this.ICustomTabsCallbackStub;
        int i3 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i3 + 1;
        cArr2[i3] = this.ICustomTabsCallbackStubProxy;
    }

    @Override // o.getView
    public void asBinder(String str) throws IOException {
        IAuthTabCallback_Parcel("write a string");
        if (str == null) {
            extraCallback();
            return;
        }
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i2 + 1;
        cArr[i2] = this.ICustomTabsCallbackStubProxy;
        getInterfaceDescriptor(str);
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr2 = this.ICustomTabsCallbackStub;
        int i3 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i3 + 1;
        cArr2[i3] = this.ICustomTabsCallbackStubProxy;
    }

    @Override // o.getView
    public void onNavigationEvent(char[] cArr, int i2, int i3) throws IOException {
        IAuthTabCallback_Parcel("write a string");
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr2 = this.ICustomTabsCallbackStub;
        int i4 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i4 + 1;
        cArr2[i4] = this.ICustomTabsCallbackStubProxy;
        onWarmupCompleted(cArr, i2, i3);
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr3 = this.ICustomTabsCallbackStub;
        int i5 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i5 + 1;
        cArr3[i5] = this.ICustomTabsCallbackStubProxy;
    }

    @Override // o.isRemoving, o.getView
    public void onExtraCallbackWithResult(hasOptionsMenu hasoptionsmenu) throws IOException {
        IAuthTabCallback_Parcel("write a string");
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        int i3 = i2 + 1;
        this.ICustomTabsCallbackDefault = i3;
        cArr[i2] = this.ICustomTabsCallbackStubProxy;
        int iIAuthTabCallback = hasoptionsmenu.IAuthTabCallback(cArr, i3);
        if (iIAuthTabCallback < 0) {
            onTransact(hasoptionsmenu);
            return;
        }
        int i4 = this.ICustomTabsCallbackDefault + iIAuthTabCallback;
        this.ICustomTabsCallbackDefault = i4;
        if (i4 >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr2 = this.ICustomTabsCallbackStub;
        int i5 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i5 + 1;
        cArr2[i5] = this.ICustomTabsCallbackStubProxy;
    }

    private void onTransact(hasOptionsMenu hasoptionsmenu) throws IOException {
        char[] cArrIAuthTabCallback = hasoptionsmenu.IAuthTabCallback();
        int length = cArrIAuthTabCallback.length;
        if (length < 32) {
            if (length > this.onUnminimized - this.ICustomTabsCallbackDefault) {
                extraCallbackWithResult();
            }
            System.arraycopy(cArrIAuthTabCallback, 0, this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault, length);
            this.ICustomTabsCallbackDefault += length;
        } else {
            extraCallbackWithResult();
            this.ICustomTabsService.write(cArrIAuthTabCallback, 0, length);
        }
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i2 + 1;
        cArr[i2] = this.ICustomTabsCallbackStubProxy;
    }

    @Override // o.getView
    public void onTransact(String str) throws IOException {
        int length = str.length();
        int i2 = this.onUnminimized - this.ICustomTabsCallbackDefault;
        if (i2 == 0) {
            extraCallbackWithResult();
            i2 = this.onUnminimized - this.ICustomTabsCallbackDefault;
        }
        if (i2 >= length) {
            str.getChars(0, length, this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault);
            this.ICustomTabsCallbackDefault += length;
        } else {
            extraCallbackWithResult(str);
        }
    }

    @Override // o.getView
    public void IAuthTabCallback(hasOptionsMenu hasoptionsmenu) throws IOException {
        int iOnWarmupCompleted = hasoptionsmenu.onWarmupCompleted(this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault);
        if (iOnWarmupCompleted < 0) {
            onTransact(hasoptionsmenu.onWarmupCompleted());
        } else {
            this.ICustomTabsCallbackDefault += iOnWarmupCompleted;
        }
    }

    @Override // o.getView
    public void IAuthTabCallback(char[] cArr, int i2, int i3) throws IOException {
        onExtraCallback(cArr, i2, i3);
        if (i3 < 32) {
            if (i3 > this.onUnminimized - this.ICustomTabsCallbackDefault) {
                extraCallbackWithResult();
            }
            System.arraycopy(cArr, i2, this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault, i3);
            this.ICustomTabsCallbackDefault += i3;
            return;
        }
        extraCallbackWithResult();
        this.ICustomTabsService.write(cArr, i2, i3);
    }

    @Override // o.getView
    public void onWarmupCompleted(char c) throws IOException {
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i2 + 1;
        cArr[i2] = c;
    }

    private void extraCallbackWithResult(String str) throws IOException {
        int i2 = this.onUnminimized;
        int i3 = this.ICustomTabsCallbackDefault;
        int i4 = i2 - i3;
        str.getChars(0, i4, this.ICustomTabsCallbackStub, i3);
        this.ICustomTabsCallbackDefault += i4;
        extraCallbackWithResult();
        int length = str.length() - i4;
        while (true) {
            int i5 = this.onUnminimized;
            if (length > i5) {
                int i6 = i4 + i5;
                str.getChars(i4, i6, this.ICustomTabsCallbackStub, 0);
                this.onRelationshipValidationResult = 0;
                this.ICustomTabsCallbackDefault = i5;
                extraCallbackWithResult();
                length -= i5;
                i4 = i6;
            } else {
                str.getChars(i4, i4 + length, this.ICustomTabsCallbackStub, 0);
                this.onRelationshipValidationResult = 0;
                this.ICustomTabsCallbackDefault = length;
                return;
            }
        }
    }

    @Override // o.getView
    public void onWarmupCompleted(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, byte[] bArr, int i2, int i3) throws IOException {
        onNavigationEvent(bArr, i2, i3);
        IAuthTabCallback_Parcel("write a binary value");
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i4 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i4 + 1;
        cArr[i4] = this.ICustomTabsCallbackStubProxy;
        onNavigationEvent(getpostonviewcreatedalpha, bArr, i2, i3 + i2);
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr2 = this.ICustomTabsCallbackStub;
        int i5 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i5 + 1;
        cArr2[i5] = this.ICustomTabsCallbackStubProxy;
    }

    @Override // o.isRemoving, o.getView
    public int onExtraCallbackWithResult(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, InputStream inputStream, int i2) throws IOException {
        IAuthTabCallback_Parcel("write a binary value");
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i3 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i3 + 1;
        cArr[i3] = this.ICustomTabsCallbackStubProxy;
        byte[] bArrIAuthTabCallback = this.asInterface.IAuthTabCallback();
        try {
            if (i2 < 0) {
                i2 = onExtraCallback(getpostonviewcreatedalpha, inputStream, bArrIAuthTabCallback);
            } else {
                int iIAuthTabCallback = IAuthTabCallback(getpostonviewcreatedalpha, inputStream, bArrIAuthTabCallback, i2);
                if (iIAuthTabCallback > 0) {
                    IAuthTabCallback("Too few bytes available: missing " + iIAuthTabCallback + " bytes (out of " + i2 + ")");
                }
            }
            this.asInterface.onNavigationEvent(bArrIAuthTabCallback);
            if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
                extraCallbackWithResult();
            }
            char[] cArr2 = this.ICustomTabsCallbackStub;
            int i4 = this.ICustomTabsCallbackDefault;
            this.ICustomTabsCallbackDefault = i4 + 1;
            cArr2[i4] = this.ICustomTabsCallbackStubProxy;
            return i2;
        } catch (Throwable th) {
            this.asInterface.onNavigationEvent(bArrIAuthTabCallback);
            throw th;
        }
    }

    @Override // o.getView
    public void onNavigationEvent(short s) throws IOException {
        IAuthTabCallback_Parcel("write a number");
        if (this.onTransact) {
            onExtraCallback(s);
            return;
        }
        if (this.ICustomTabsCallbackDefault + 6 >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        Object[] objArr = {Integer.valueOf(s), this.ICustomTabsCallbackStub, Integer.valueOf(this.ICustomTabsCallbackDefault)};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        this.ICustomTabsCallbackDefault = ((Integer) requireActivity.onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1336744677, iOnNavigationEvent, 1336744679, iOnNavigationEvent2, objArr)).intValue();
    }

    private void onExtraCallback(short s) throws IOException {
        if (this.ICustomTabsCallbackDefault + 8 >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        int i3 = i2 + 1;
        this.ICustomTabsCallbackDefault = i3;
        cArr[i2] = this.ICustomTabsCallbackStubProxy;
        Object[] objArr = {Integer.valueOf(s), cArr, Integer.valueOf(i3)};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iIntValue = ((Integer) requireActivity.onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1336744677, iOnNavigationEvent, 1336744679, iOnNavigationEvent2, objArr)).intValue();
        char[] cArr2 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackDefault = iIntValue + 1;
        cArr2[iIntValue] = this.ICustomTabsCallbackStubProxy;
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(int i2) throws IOException {
        IAuthTabCallback_Parcel("write a number");
        if (this.onTransact) {
            onWarmupCompleted(i2);
            return;
        }
        if (this.ICustomTabsCallbackDefault + 11 >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        Object[] objArr = {Integer.valueOf(i2), this.ICustomTabsCallbackStub, Integer.valueOf(this.ICustomTabsCallbackDefault)};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        this.ICustomTabsCallbackDefault = ((Integer) requireActivity.onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1336744677, iOnNavigationEvent, 1336744679, iOnNavigationEvent2, objArr)).intValue();
    }

    private void onWarmupCompleted(int i2) throws IOException {
        if (this.ICustomTabsCallbackDefault + 13 >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i3 = this.ICustomTabsCallbackDefault;
        int i4 = i3 + 1;
        this.ICustomTabsCallbackDefault = i4;
        cArr[i3] = this.ICustomTabsCallbackStubProxy;
        Object[] objArr = {Integer.valueOf(i2), cArr, Integer.valueOf(i4)};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iIntValue = ((Integer) requireActivity.onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1336744677, iOnNavigationEvent, 1336744679, iOnNavigationEvent2, objArr)).intValue();
        char[] cArr2 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackDefault = iIntValue + 1;
        cArr2[iIntValue] = this.ICustomTabsCallbackStubProxy;
    }

    @Override // o.getView
    public void onExtraCallback(long j) throws IOException {
        IAuthTabCallback_Parcel("write a number");
        if (this.onTransact) {
            onWarmupCompleted(j);
            return;
        }
        if (this.ICustomTabsCallbackDefault + 21 >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        this.ICustomTabsCallbackDefault = requireActivity.onExtraCallbackWithResult(j, this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault);
    }

    private void onWarmupCompleted(long j) throws IOException {
        if (this.ICustomTabsCallbackDefault + 23 >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        int i3 = i2 + 1;
        this.ICustomTabsCallbackDefault = i3;
        cArr[i2] = this.ICustomTabsCallbackStubProxy;
        int iOnExtraCallbackWithResult = requireActivity.onExtraCallbackWithResult(j, cArr, i3);
        char[] cArr2 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackDefault = iOnExtraCallbackWithResult + 1;
        cArr2[iOnExtraCallbackWithResult] = this.ICustomTabsCallbackStubProxy;
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(BigInteger bigInteger) throws IOException {
        IAuthTabCallback_Parcel("write a number");
        if (bigInteger == null) {
            extraCallback();
        } else if (this.onTransact) {
            access000(bigInteger.toString());
        } else {
            onTransact(bigInteger.toString());
        }
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(double d) throws IOException {
        if (this.onTransact || (requireActivity.onNavigationEvent(d) && onExtraCallbackWithResult(getView.IAuthTabCallback.QUOTE_NON_NUMERIC_NUMBERS))) {
            asBinder(requireActivity.onWarmupCompleted(d, onExtraCallbackWithResult(getView.IAuthTabCallback.USE_FAST_DOUBLE_WRITER)));
        } else {
            IAuthTabCallback_Parcel("write a number");
            onTransact(requireActivity.onWarmupCompleted(d, onExtraCallbackWithResult(getView.IAuthTabCallback.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // o.getView
    public void onNavigationEvent(float f) throws IOException {
        if (this.onTransact || (requireActivity.onExtraCallback(f) && onExtraCallbackWithResult(getView.IAuthTabCallback.QUOTE_NON_NUMERIC_NUMBERS))) {
            asBinder(requireActivity.onWarmupCompleted(f, onExtraCallbackWithResult(getView.IAuthTabCallback.USE_FAST_DOUBLE_WRITER)));
        } else {
            IAuthTabCallback_Parcel("write a number");
            onTransact(requireActivity.onWarmupCompleted(f, onExtraCallbackWithResult(getView.IAuthTabCallback.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // o.getView
    public void IAuthTabCallback(BigDecimal bigDecimal) throws IOException {
        IAuthTabCallback_Parcel("write a number");
        if (bigDecimal == null) {
            extraCallback();
        } else if (this.onTransact) {
            access000(onWarmupCompleted(bigDecimal));
        } else {
            onTransact(onWarmupCompleted(bigDecimal));
        }
    }

    @Override // o.getView
    public void asInterface(String str) throws IOException {
        IAuthTabCallback_Parcel("write a number");
        if (str == null) {
            extraCallback();
        } else if (this.onTransact) {
            access000(str);
        } else {
            onTransact(str);
        }
    }

    private void access000(String str) throws IOException {
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i2 + 1;
        cArr[i2] = this.ICustomTabsCallbackStubProxy;
        onTransact(str);
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr2 = this.ICustomTabsCallbackStub;
        int i3 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i3 + 1;
        cArr2[i3] = this.ICustomTabsCallbackStubProxy;
    }

    @Override // o.getView
    public void onWarmupCompleted(boolean z) throws IOException {
        int i2;
        IAuthTabCallback_Parcel("write a boolean value");
        if (this.ICustomTabsCallbackDefault + 5 >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        int i3 = this.ICustomTabsCallbackDefault;
        char[] cArr = this.ICustomTabsCallbackStub;
        if (z) {
            cArr[i3] = 't';
            cArr[i3 + 1] = 'r';
            cArr[i3 + 2] = 'u';
            i2 = i3 + 3;
            cArr[i2] = 'e';
        } else {
            cArr[i3] = 'f';
            cArr[i3 + 1] = 'a';
            cArr[i3 + 2] = 'l';
            cArr[i3 + 3] = 's';
            i2 = i3 + 4;
            cArr[i2] = 'e';
        }
        this.ICustomTabsCallbackDefault = i2 + 1;
    }

    @Override // o.getView
    public void IAuthTabCallbackStubProxy() throws IOException {
        IAuthTabCallback_Parcel("write a null");
        extraCallback();
    }

    @Override // o.isRemoving
    public void IAuthTabCallback_Parcel(String str) throws IOException {
        char c;
        int iWriteTypedObject = this.getInterfaceDescriptor.writeTypedObject();
        if (this.onExtraCallback != null) {
            onNavigationEvent(str, iWriteTypedObject);
            return;
        }
        if (iWriteTypedObject == 1) {
            c = ',';
        } else {
            if (iWriteTypedObject != 2) {
                if (iWriteTypedObject != 3) {
                    if (iWriteTypedObject == 5) {
                        IAuthTabCallbackStubProxy(str);
                        return;
                    }
                    return;
                } else {
                    hasOptionsMenu hasoptionsmenu = this.writeTypedObject;
                    if (hasoptionsmenu != null) {
                        onTransact(hasoptionsmenu.onWarmupCompleted());
                        return;
                    }
                    return;
                }
            }
            c = ':';
        }
        if (this.ICustomTabsCallbackDefault >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        char[] cArr = this.ICustomTabsCallbackStub;
        int i2 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = i2 + 1;
        cArr[i2] = c;
    }

    @Override // o.getView, java.io.Flushable
    public void flush() throws IOException {
        extraCallbackWithResult();
        if (this.ICustomTabsService == null || !onExtraCallbackWithResult(getView.IAuthTabCallback.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.ICustomTabsService.flush();
    }

    @Override // o.isRemoving, o.getView, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        super.close();
        try {
            if (this.ICustomTabsCallbackStub != null && onExtraCallbackWithResult(getView.IAuthTabCallback.AUTO_CLOSE_JSON_CONTENT)) {
                while (true) {
                    getUserVisibleHint getuservisiblehintOnTransact = onTransact();
                    if (getuservisiblehintOnTransact.IAuthTabCallbackStub()) {
                        access100();
                    } else if (!getuservisiblehintOnTransact.asBinder()) {
                        break;
                    } else {
                        access000();
                    }
                }
            }
            extraCallbackWithResult();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        this.onRelationshipValidationResult = 0;
        this.ICustomTabsCallbackDefault = 0;
        if (this.ICustomTabsService != null) {
            try {
                if (this.asInterface.onTransact() || onExtraCallbackWithResult(getView.IAuthTabCallback.AUTO_CLOSE_TARGET)) {
                    this.ICustomTabsService.close();
                } else if (onExtraCallbackWithResult(getView.IAuthTabCallback.FLUSH_PASSED_TO_STREAM)) {
                    this.ICustomTabsService.flush();
                }
            } catch (IOException | RuntimeException e2) {
                if (e != null) {
                    e2.addSuppressed(e);
                }
                throw e2;
            }
        }
        writeTypedObject();
        if (e != null) {
            throw e;
        }
    }

    public void writeTypedObject() {
        char[] cArr = this.ICustomTabsCallbackStub;
        if (cArr != null) {
            this.ICustomTabsCallbackStub = null;
            this.asInterface.onExtraCallback(cArr);
        }
        char[] cArr2 = this.onActivityResized;
        if (cArr2 != null) {
            this.onActivityResized = null;
            this.asInterface.onExtraCallbackWithResult(cArr2);
        }
    }

    private void getInterfaceDescriptor(String str) throws IOException {
        int length = str.length();
        int i2 = this.onUnminimized;
        if (length > i2) {
            access100(str);
            return;
        }
        if (this.ICustomTabsCallbackDefault + length > i2) {
            extraCallbackWithResult();
        }
        str.getChars(0, length, this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault);
        if (this.ICustomTabsCallback != null) {
            onTransact(length);
            return;
        }
        int i3 = this.extraCallback;
        if (i3 != 0) {
            onTransact(length, i3);
        } else {
            IAuthTabCallbackDefault(length);
        }
    }

    private void IAuthTabCallbackDefault(int i2) throws IOException {
        int i3;
        int i4 = this.ICustomTabsCallbackDefault + i2;
        int[] iArr = this.readTypedObject;
        int length = iArr.length;
        while (this.ICustomTabsCallbackDefault < i4) {
            do {
                char[] cArr = this.ICustomTabsCallbackStub;
                int i5 = this.ICustomTabsCallbackDefault;
                char c = cArr[i5];
                if (c >= length || iArr[c] == 0) {
                    i3 = i5 + 1;
                    this.ICustomTabsCallbackDefault = i3;
                } else {
                    int i6 = this.onRelationshipValidationResult;
                    int i7 = i5 - i6;
                    if (i7 > 0) {
                        this.ICustomTabsService.write(cArr, i6, i7);
                    }
                    char[] cArr2 = this.ICustomTabsCallbackStub;
                    int i8 = this.ICustomTabsCallbackDefault;
                    this.ICustomTabsCallbackDefault = i8 + 1;
                    char c2 = cArr2[i8];
                    onWarmupCompleted(c2, iArr[c2]);
                }
            } while (i3 < i4);
            return;
        }
    }

    private void access100(String str) throws IOException {
        extraCallbackWithResult();
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = this.onUnminimized;
            if (i2 + i3 > length) {
                i3 = length - i2;
            }
            int i4 = i2 + i3;
            str.getChars(i2, i4, this.ICustomTabsCallbackStub, 0);
            if (this.ICustomTabsCallback != null) {
                asBinder(i3);
            } else {
                int i5 = this.extraCallback;
                if (i5 != 0) {
                    onExtraCallback(i3, i5);
                } else {
                    asInterface(i3);
                }
            }
            if (i4 >= length) {
                return;
            } else {
                i2 = i4;
            }
        }
    }

    private void asInterface(int i2) throws IOException {
        char[] cArr;
        char c;
        int[] iArr = this.readTypedObject;
        int length = iArr.length;
        int i3 = 0;
        int iOnNavigationEvent = 0;
        while (i3 < i2) {
            do {
                cArr = this.ICustomTabsCallbackStub;
                c = cArr[i3];
                if (c < length && iArr[c] != 0) {
                    break;
                } else {
                    i3++;
                }
            } while (i3 < i2);
            int i4 = i3 - iOnNavigationEvent;
            if (i4 > 0) {
                this.ICustomTabsService.write(cArr, iOnNavigationEvent, i4);
                if (i3 >= i2) {
                    return;
                }
            }
            i3++;
            iOnNavigationEvent = onNavigationEvent(this.ICustomTabsCallbackStub, i3, i2, c, iArr[c]);
        }
    }

    private void onWarmupCompleted(char[] cArr, int i2, int i3) throws IOException {
        if (this.ICustomTabsCallback != null) {
            onExtraCallbackWithResult(cArr, i2, i3);
            return;
        }
        int i4 = this.extraCallback;
        if (i4 != 0) {
            onExtraCallbackWithResult(cArr, i2, i3, i4);
            return;
        }
        int i5 = i3 + i2;
        int[] iArr = this.readTypedObject;
        int length = iArr.length;
        while (i2 < i5) {
            int i6 = i2;
            do {
                char c = cArr[i6];
                if (c < length && iArr[c] != 0) {
                    break;
                } else {
                    i6++;
                }
            } while (i6 < i5);
            int i7 = i6 - i2;
            if (i7 < 32) {
                if (this.ICustomTabsCallbackDefault + i7 > this.onUnminimized) {
                    extraCallbackWithResult();
                }
                if (i7 > 0) {
                    System.arraycopy(cArr, i2, this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault, i7);
                    this.ICustomTabsCallbackDefault += i7;
                }
            } else {
                extraCallbackWithResult();
                this.ICustomTabsService.write(cArr, i2, i7);
            }
            if (i6 >= i5) {
                return;
            }
            i2 = i6 + 1;
            char c2 = cArr[i6];
            onNavigationEvent(c2, iArr[c2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onTransact(int i2, int i3) throws IOException {
        int i4;
        int i5;
        int i6;
        int i7 = this.ICustomTabsCallbackDefault + i2;
        int[] iArr = this.readTypedObject;
        int iMin = Math.min(iArr.length, i3 + 1);
        while (this.ICustomTabsCallbackDefault < i7) {
            do {
                char[] cArr = this.ICustomTabsCallbackStub;
                int i8 = this.ICustomTabsCallbackDefault;
                char c = cArr[i8];
                if (c < iMin) {
                    i4 = iArr[c];
                    if (i4 != 0) {
                        int i9 = this.onRelationshipValidationResult;
                        i5 = i8 - i9;
                        if (i5 <= 0) {
                            this.ICustomTabsService.write(cArr, i9, i5);
                        }
                        this.ICustomTabsCallbackDefault++;
                        onWarmupCompleted(c, i4);
                    }
                    i6 = i8 + 1;
                    this.ICustomTabsCallbackDefault = i6;
                } else {
                    if (c > i3) {
                        i4 = -1;
                        int i92 = this.onRelationshipValidationResult;
                        i5 = i8 - i92;
                        if (i5 <= 0) {
                        }
                        this.ICustomTabsCallbackDefault++;
                        onWarmupCompleted(c, i4);
                    }
                    i6 = i8 + 1;
                    this.ICustomTabsCallbackDefault = i6;
                }
            } while (i6 < i7);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d A[PHI: r3
      0x001d: PHI (r3v5 int) = (r3v2 int), (r3v6 int) binds: [B:9:0x0019, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallback(int i2, int i3) throws IOException {
        char[] cArr;
        char c;
        int[] iArr = this.readTypedObject;
        int iMin = Math.min(iArr.length, i3 + 1);
        int i4 = 0;
        int i5 = 0;
        int iOnNavigationEvent = 0;
        while (i4 < i2) {
            while (true) {
                cArr = this.ICustomTabsCallbackStub;
                c = cArr[i4];
                if (c < iMin) {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                    i4++;
                    if (i4 >= i2) {
                        break;
                    }
                } else if (c > i3) {
                    i5 = -1;
                    break;
                }
            }
            int i6 = i4 - iOnNavigationEvent;
            if (i6 > 0) {
                this.ICustomTabsService.write(cArr, iOnNavigationEvent, i6);
                if (i4 >= i2) {
                    return;
                }
            }
            i4++;
            iOnNavigationEvent = onNavigationEvent(this.ICustomTabsCallbackStub, i4, i2, c, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[PHI: r2
      0x001b: PHI (r2v6 int) = (r2v3 int), (r2v7 int) binds: [B:10:0x0017, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallbackWithResult(char[] cArr, int i2, int i3, int i4) throws IOException {
        char c;
        int i5 = i3 + i2;
        int[] iArr = this.readTypedObject;
        int iMin = Math.min(iArr.length, i4 + 1);
        int i6 = 0;
        while (i2 < i5) {
            int i7 = i2;
            while (true) {
                c = cArr[i7];
                if (c < iMin) {
                    i6 = iArr[c];
                    if (i6 != 0) {
                        break;
                    }
                    i7++;
                    if (i7 >= i5) {
                        break;
                    }
                } else if (c > i4) {
                    i6 = -1;
                    break;
                }
            }
            int i8 = i7 - i2;
            if (i8 < 32) {
                if (this.ICustomTabsCallbackDefault + i8 > this.onUnminimized) {
                    extraCallbackWithResult();
                }
                if (i8 > 0) {
                    System.arraycopy(cArr, i2, this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault, i8);
                    this.ICustomTabsCallbackDefault += i8;
                }
            } else {
                extraCallbackWithResult();
                this.ICustomTabsService.write(cArr, i2, i8);
            }
            if (i7 >= i5) {
                return;
            }
            i2 = i7 + 1;
            onNavigationEvent(c, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onTransact(int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6 = this.ICustomTabsCallbackDefault + i2;
        int[] iArr = this.readTypedObject;
        int i7 = this.extraCallback;
        if (i7 <= 0) {
            i7 = RtpPacket.MAX_SEQUENCE_NUMBER;
        }
        int iMin = Math.min(iArr.length, i7 + 1);
        performStart performstart = this.ICustomTabsCallback;
        while (this.ICustomTabsCallbackDefault < i6) {
            do {
                char c = this.ICustomTabsCallbackStub[this.ICustomTabsCallbackDefault];
                if (c < iMin) {
                    i3 = iArr[c];
                    if (i3 != 0) {
                        int i8 = this.ICustomTabsCallbackDefault;
                        int i9 = this.onRelationshipValidationResult;
                        i4 = i8 - i9;
                        if (i4 <= 0) {
                            this.ICustomTabsService.write(this.ICustomTabsCallbackStub, i9, i4);
                        }
                        this.ICustomTabsCallbackDefault++;
                        onWarmupCompleted(c, i3);
                    }
                    i5 = this.ICustomTabsCallbackDefault + 1;
                    this.ICustomTabsCallbackDefault = i5;
                } else {
                    if (c > i7) {
                        i3 = -1;
                    } else {
                        hasOptionsMenu hasoptionsmenuIAuthTabCallback = performstart.IAuthTabCallback(c);
                        this.onActivityLayout = hasoptionsmenuIAuthTabCallback;
                        if (hasoptionsmenuIAuthTabCallback != null) {
                            i3 = -2;
                        }
                        i5 = this.ICustomTabsCallbackDefault + 1;
                        this.ICustomTabsCallbackDefault = i5;
                    }
                    int i82 = this.ICustomTabsCallbackDefault;
                    int i92 = this.onRelationshipValidationResult;
                    i4 = i82 - i92;
                    if (i4 <= 0) {
                    }
                    this.ICustomTabsCallbackDefault++;
                    onWarmupCompleted(c, i3);
                }
            } while (i5 < i6);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[PHI: r5
      0x0030: PHI (r5v6 int) = (r5v2 int), (r5v7 int) binds: [B:15:0x002c, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void asBinder(int i2) throws IOException {
        char c;
        int[] iArr = this.readTypedObject;
        int i3 = this.extraCallback;
        if (i3 <= 0) {
            i3 = RtpPacket.MAX_SEQUENCE_NUMBER;
        }
        int iMin = Math.min(iArr.length, i3 + 1);
        performStart performstart = this.ICustomTabsCallback;
        int i4 = 0;
        int i5 = 0;
        int iOnNavigationEvent = 0;
        while (i4 < i2) {
            while (true) {
                c = this.ICustomTabsCallbackStub[i4];
                if (c < iMin) {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                    i4++;
                    if (i4 >= i2) {
                        break;
                    }
                } else {
                    if (c > i3) {
                        i5 = -1;
                        break;
                    }
                    hasOptionsMenu hasoptionsmenuIAuthTabCallback = performstart.IAuthTabCallback(c);
                    this.onActivityLayout = hasoptionsmenuIAuthTabCallback;
                    if (hasoptionsmenuIAuthTabCallback != null) {
                        i5 = -2;
                        break;
                    }
                }
            }
            int i6 = i4 - iOnNavigationEvent;
            if (i6 > 0) {
                this.ICustomTabsService.write(this.ICustomTabsCallbackStub, iOnNavigationEvent, i6);
                if (i4 >= i2) {
                    return;
                }
            }
            i4++;
            iOnNavigationEvent = onNavigationEvent(this.ICustomTabsCallbackStub, i4, i2, c, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e A[PHI: r4
      0x002e: PHI (r4v6 int) = (r4v2 int), (r4v7 int) binds: [B:16:0x002a, B:11:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallbackWithResult(char[] cArr, int i2, int i3) throws IOException {
        char c;
        int i4 = i3 + i2;
        int[] iArr = this.readTypedObject;
        int i5 = this.extraCallback;
        if (i5 <= 0) {
            i5 = RtpPacket.MAX_SEQUENCE_NUMBER;
        }
        int iMin = Math.min(iArr.length, i5 + 1);
        performStart performstart = this.ICustomTabsCallback;
        int i6 = 0;
        while (i2 < i4) {
            int i7 = i2;
            while (true) {
                c = cArr[i7];
                if (c < iMin) {
                    i6 = iArr[c];
                    if (i6 != 0) {
                        break;
                    }
                    i7++;
                    if (i7 >= i4) {
                        break;
                    }
                } else {
                    if (c > i5) {
                        i6 = -1;
                        break;
                    }
                    hasOptionsMenu hasoptionsmenuIAuthTabCallback = performstart.IAuthTabCallback(c);
                    this.onActivityLayout = hasoptionsmenuIAuthTabCallback;
                    if (hasoptionsmenuIAuthTabCallback != null) {
                        i6 = -2;
                        break;
                    }
                }
            }
            int i8 = i7 - i2;
            if (i8 < 32) {
                if (this.ICustomTabsCallbackDefault + i8 > this.onUnminimized) {
                    extraCallbackWithResult();
                }
                if (i8 > 0) {
                    System.arraycopy(cArr, i2, this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault, i8);
                    this.ICustomTabsCallbackDefault += i8;
                }
            } else {
                extraCallbackWithResult();
                this.ICustomTabsService.write(cArr, i2, i8);
            }
            if (i7 >= i4) {
                return;
            }
            i2 = i7 + 1;
            onNavigationEvent(c, i6);
        }
    }

    protected void onNavigationEvent(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int iOnWarmupCompleted;
        int i5 = this.onUnminimized - 6;
        int iIAuthTabCallback = getpostonviewcreatedalpha.IAuthTabCallback();
        loop0: while (true) {
            int i6 = iIAuthTabCallback >> 2;
            while (i2 <= i3 - 3) {
                if (this.ICustomTabsCallbackDefault > i5) {
                    extraCallbackWithResult();
                }
                byte b = bArr[i2];
                byte b2 = bArr[i2 + 1];
                i4 = i2 + 3;
                iOnWarmupCompleted = getpostonviewcreatedalpha.onWarmupCompleted((bArr[i2 + 2] & 255) | (((b << 8) | (b2 & 255)) << 8), this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault);
                this.ICustomTabsCallbackDefault = iOnWarmupCompleted;
                i6--;
                if (i6 <= 0) {
                    break;
                } else {
                    i2 = i4;
                }
            }
            char[] cArr = this.ICustomTabsCallbackStub;
            cArr[iOnWarmupCompleted] = '\\';
            this.ICustomTabsCallbackDefault = iOnWarmupCompleted + 2;
            cArr[iOnWarmupCompleted + 1] = 'n';
            iIAuthTabCallback = getpostonviewcreatedalpha.IAuthTabCallback();
            i2 = i4;
        }
        int i7 = i3 - i2;
        if (i7 > 0) {
            if (this.ICustomTabsCallbackDefault > i5) {
                extraCallbackWithResult();
            }
            int i8 = bArr[i2] << 16;
            if (i7 == 2) {
                i8 |= (bArr[i2 + 1] & 255) << 8;
            }
            this.ICustomTabsCallbackDefault = getpostonviewcreatedalpha.onWarmupCompleted(i8, i7, this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault);
        }
    }

    protected int IAuthTabCallback(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, InputStream inputStream, byte[] bArr, int i2) throws IOException {
        int iOnWarmupCompleted;
        int i3 = this.onUnminimized - 6;
        int i4 = 2;
        int i5 = -3;
        int i6 = i2;
        int iIAuthTabCallback = getpostonviewcreatedalpha.IAuthTabCallback() >> 2;
        int i7 = 0;
        int iOnWarmupCompleted2 = 0;
        while (true) {
            if (i6 <= 2) {
                break;
            }
            if (i7 > i5) {
                iOnWarmupCompleted2 = onWarmupCompleted(inputStream, bArr, i7, iOnWarmupCompleted2, i6);
                if (iOnWarmupCompleted2 < 3) {
                    i7 = 0;
                    break;
                }
                i5 = iOnWarmupCompleted2 - 3;
                i7 = 0;
            }
            if (this.ICustomTabsCallbackDefault > i3) {
                extraCallbackWithResult();
            }
            int i8 = i7 + 3;
            i6 -= 3;
            int iOnWarmupCompleted3 = getpostonviewcreatedalpha.onWarmupCompleted((((bArr[i7] << 8) | (bArr[i7 + 1] & 255)) << 8) | (bArr[i7 + 2] & 255), this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault);
            this.ICustomTabsCallbackDefault = iOnWarmupCompleted3;
            iIAuthTabCallback--;
            if (iIAuthTabCallback <= 0) {
                char[] cArr = this.ICustomTabsCallbackStub;
                cArr[iOnWarmupCompleted3] = '\\';
                this.ICustomTabsCallbackDefault = iOnWarmupCompleted3 + 2;
                cArr[iOnWarmupCompleted3 + 1] = 'n';
                iIAuthTabCallback = getpostonviewcreatedalpha.IAuthTabCallback() >> 2;
            }
            i7 = i8;
        }
        if (i6 <= 0 || (iOnWarmupCompleted = onWarmupCompleted(inputStream, bArr, i7, iOnWarmupCompleted2, i6)) <= 0) {
            return i6;
        }
        if (this.ICustomTabsCallbackDefault > i3) {
            extraCallbackWithResult();
        }
        int i9 = bArr[0] << 16;
        if (1 < iOnWarmupCompleted) {
            i9 |= (bArr[1] & 255) << 8;
        } else {
            i4 = 1;
        }
        this.ICustomTabsCallbackDefault = getpostonviewcreatedalpha.onWarmupCompleted(i9, i4, this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault);
        return i6 - i4;
    }

    protected int onExtraCallback(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, InputStream inputStream, byte[] bArr) throws IOException {
        int i2 = this.onUnminimized - 6;
        int i3 = 2;
        int iIAuthTabCallback = getpostonviewcreatedalpha.IAuthTabCallback() >> 2;
        int i4 = -3;
        int i5 = 0;
        int iOnWarmupCompleted = 0;
        int i6 = 0;
        while (true) {
            if (i5 > i4) {
                iOnWarmupCompleted = onWarmupCompleted(inputStream, bArr, i5, iOnWarmupCompleted, bArr.length);
                if (iOnWarmupCompleted < 3) {
                    break;
                }
                i4 = iOnWarmupCompleted - 3;
                i5 = 0;
            }
            if (this.ICustomTabsCallbackDefault > i2) {
                extraCallbackWithResult();
            }
            int i7 = i5 + 3;
            i6 += 3;
            int iOnWarmupCompleted2 = getpostonviewcreatedalpha.onWarmupCompleted((((bArr[i5] << 8) | (bArr[i5 + 1] & 255)) << 8) | (bArr[i5 + 2] & 255), this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault);
            this.ICustomTabsCallbackDefault = iOnWarmupCompleted2;
            iIAuthTabCallback--;
            if (iIAuthTabCallback <= 0) {
                char[] cArr = this.ICustomTabsCallbackStub;
                cArr[iOnWarmupCompleted2] = '\\';
                this.ICustomTabsCallbackDefault = iOnWarmupCompleted2 + 2;
                cArr[iOnWarmupCompleted2 + 1] = 'n';
                iIAuthTabCallback = getpostonviewcreatedalpha.IAuthTabCallback() >> 2;
            }
            i5 = i7;
        }
        if (iOnWarmupCompleted <= 0) {
            return i6;
        }
        if (this.ICustomTabsCallbackDefault > i2) {
            extraCallbackWithResult();
        }
        int i8 = bArr[0] << 16;
        if (1 < iOnWarmupCompleted) {
            i8 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        int i9 = i6 + i3;
        this.ICustomTabsCallbackDefault = getpostonviewcreatedalpha.onWarmupCompleted(i8, i3, this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault);
        return i9;
    }

    private int onWarmupCompleted(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) throws IOException {
        int i5;
        int i6 = 0;
        while (i2 < i3) {
            bArr[i6] = bArr[i2];
            i6++;
            i2++;
        }
        int iMin = Math.min(i4, bArr.length);
        do {
            int i7 = iMin - i6;
            if (i7 == 0 || (i5 = inputStream.read(bArr, i6, i7)) < 0) {
                break;
            }
            i6 += i5;
        } while (i6 < 3);
        return i6;
    }

    private final void extraCallback() throws IOException {
        if (this.ICustomTabsCallbackDefault + 4 >= this.onUnminimized) {
            extraCallbackWithResult();
        }
        int i2 = this.ICustomTabsCallbackDefault;
        char[] cArr = this.ICustomTabsCallbackStub;
        cArr[i2] = 'n';
        cArr[i2 + 1] = 'u';
        cArr[i2 + 2] = 'l';
        cArr[i2 + 3] = 'l';
        this.ICustomTabsCallbackDefault = i2 + 4;
    }

    private void onWarmupCompleted(char c, int i2) throws IOException {
        String strOnWarmupCompleted;
        int i3;
        if (i2 >= 0) {
            int i4 = this.ICustomTabsCallbackDefault;
            if (i4 >= 2) {
                int i5 = i4 - 2;
                this.onRelationshipValidationResult = i5;
                char[] cArr = this.ICustomTabsCallbackStub;
                cArr[i5] = '\\';
                cArr[i4 - 1] = (char) i2;
                return;
            }
            char[] cArrICustomTabsCallback = this.onPostMessage;
            if (cArrICustomTabsCallback == null) {
                cArrICustomTabsCallback = ICustomTabsCallback();
            }
            this.onRelationshipValidationResult = this.ICustomTabsCallbackDefault;
            cArrICustomTabsCallback[1] = (char) i2;
            this.ICustomTabsService.write(cArrICustomTabsCallback, 0, 2);
            return;
        }
        if (i2 != -2) {
            char[] cArrOnActivityLayout = onActivityLayout();
            int i6 = this.ICustomTabsCallbackDefault;
            if (i6 >= 6) {
                char[] cArr2 = this.ICustomTabsCallbackStub;
                int i7 = i6 - 6;
                this.onRelationshipValidationResult = i7;
                cArr2[i7] = '\\';
                cArr2[i6 - 5] = 'u';
                if (c > 255) {
                    int i8 = c >> '\b';
                    cArr2[i6 - 4] = cArrOnActivityLayout[(i8 & OggPageHeader.MAX_SEGMENT_COUNT) >> 4];
                    i3 = i6 - 3;
                    cArr2[i3] = cArrOnActivityLayout[i8 & 15];
                    c = (char) (c & 255);
                } else {
                    cArr2[i6 - 4] = '0';
                    i3 = i6 - 3;
                    cArr2[i3] = '0';
                }
                cArr2[i3 + 1] = cArrOnActivityLayout[c >> 4];
                cArr2[i3 + 2] = cArrOnActivityLayout[c & 15];
                return;
            }
            char[] cArrICustomTabsCallback2 = this.onPostMessage;
            if (cArrICustomTabsCallback2 == null) {
                cArrICustomTabsCallback2 = ICustomTabsCallback();
            }
            this.onRelationshipValidationResult = this.ICustomTabsCallbackDefault;
            if (c > 255) {
                int i9 = c >> '\b';
                cArrICustomTabsCallback2[10] = cArrOnActivityLayout[(i9 & OggPageHeader.MAX_SEGMENT_COUNT) >> 4];
                cArrICustomTabsCallback2[11] = cArrOnActivityLayout[i9 & 15];
                cArrICustomTabsCallback2[12] = cArrOnActivityLayout[(c & 255) >> 4];
                cArrICustomTabsCallback2[13] = cArrOnActivityLayout[c & 15];
                this.ICustomTabsService.write(cArrICustomTabsCallback2, 8, 6);
                return;
            }
            cArrICustomTabsCallback2[6] = cArrOnActivityLayout[c >> 4];
            cArrICustomTabsCallback2[7] = cArrOnActivityLayout[c & 15];
            this.ICustomTabsService.write(cArrICustomTabsCallback2, 2, 6);
            return;
        }
        hasOptionsMenu hasoptionsmenu = this.onActivityLayout;
        if (hasoptionsmenu == null) {
            strOnWarmupCompleted = this.ICustomTabsCallback.IAuthTabCallback(c).onWarmupCompleted();
        } else {
            strOnWarmupCompleted = hasoptionsmenu.onWarmupCompleted();
            this.onActivityLayout = null;
        }
        int length = strOnWarmupCompleted.length();
        int i10 = this.ICustomTabsCallbackDefault;
        if (i10 >= length) {
            int i11 = i10 - length;
            this.onRelationshipValidationResult = i11;
            strOnWarmupCompleted.getChars(0, length, this.ICustomTabsCallbackStub, i11);
        } else {
            this.onRelationshipValidationResult = i10;
            this.ICustomTabsService.write(strOnWarmupCompleted);
        }
    }

    private int onNavigationEvent(char[] cArr, int i2, int i3, char c, int i4) throws IOException {
        String strOnWarmupCompleted;
        int i5;
        if (i4 >= 0) {
            if (i2 > 1 && i2 < i3) {
                int i6 = i2 - 2;
                cArr[i6] = '\\';
                cArr[i2 - 1] = (char) i4;
                return i6;
            }
            char[] cArrICustomTabsCallback = this.onPostMessage;
            if (cArrICustomTabsCallback == null) {
                cArrICustomTabsCallback = ICustomTabsCallback();
            }
            cArrICustomTabsCallback[1] = (char) i4;
            this.ICustomTabsService.write(cArrICustomTabsCallback, 0, 2);
            return i2;
        }
        if (i4 != -2) {
            char[] cArrOnActivityLayout = onActivityLayout();
            if (i2 > 5 && i2 < i3) {
                cArr[i2 - 6] = '\\';
                int i7 = i2 - 4;
                cArr[i2 - 5] = 'u';
                if (c > 255) {
                    int i8 = c >> '\b';
                    cArr[i7] = cArrOnActivityLayout[(i8 & OggPageHeader.MAX_SEGMENT_COUNT) >> 4];
                    i5 = i2 - 2;
                    cArr[i2 - 3] = cArrOnActivityLayout[i8 & 15];
                    c = (char) (c & 255);
                } else {
                    cArr[i7] = '0';
                    i5 = i2 - 2;
                    cArr[i2 - 3] = '0';
                }
                cArr[i5] = cArrOnActivityLayout[c >> 4];
                cArr[i5 + 1] = cArrOnActivityLayout[c & 15];
                return i5 - 4;
            }
            char[] cArrICustomTabsCallback2 = this.onPostMessage;
            if (cArrICustomTabsCallback2 == null) {
                cArrICustomTabsCallback2 = ICustomTabsCallback();
            }
            this.onRelationshipValidationResult = this.ICustomTabsCallbackDefault;
            if (c > 255) {
                int i9 = c >> '\b';
                cArrICustomTabsCallback2[10] = cArrOnActivityLayout[(i9 & OggPageHeader.MAX_SEGMENT_COUNT) >> 4];
                cArrICustomTabsCallback2[11] = cArrOnActivityLayout[i9 & 15];
                cArrICustomTabsCallback2[12] = cArrOnActivityLayout[(c & 255) >> 4];
                cArrICustomTabsCallback2[13] = cArrOnActivityLayout[c & 15];
                this.ICustomTabsService.write(cArrICustomTabsCallback2, 8, 6);
                return i2;
            }
            cArrICustomTabsCallback2[6] = cArrOnActivityLayout[c >> 4];
            cArrICustomTabsCallback2[7] = cArrOnActivityLayout[c & 15];
            this.ICustomTabsService.write(cArrICustomTabsCallback2, 2, 6);
            return i2;
        }
        hasOptionsMenu hasoptionsmenu = this.onActivityLayout;
        if (hasoptionsmenu == null) {
            strOnWarmupCompleted = this.ICustomTabsCallback.IAuthTabCallback(c).onWarmupCompleted();
        } else {
            strOnWarmupCompleted = hasoptionsmenu.onWarmupCompleted();
            this.onActivityLayout = null;
        }
        int length = strOnWarmupCompleted.length();
        if (i2 >= length && i2 < i3) {
            int i10 = i2 - length;
            strOnWarmupCompleted.getChars(0, length, cArr, i10);
            return i10;
        }
        this.ICustomTabsService.write(strOnWarmupCompleted);
        return i2;
    }

    private void onNavigationEvent(char c, int i2) throws IOException {
        String strOnWarmupCompleted;
        int i3;
        if (i2 >= 0) {
            if (this.ICustomTabsCallbackDefault + 2 > this.onUnminimized) {
                extraCallbackWithResult();
            }
            char[] cArr = this.ICustomTabsCallbackStub;
            int i4 = this.ICustomTabsCallbackDefault;
            cArr[i4] = '\\';
            this.ICustomTabsCallbackDefault = i4 + 2;
            cArr[i4 + 1] = (char) i2;
            return;
        }
        if (i2 != -2) {
            if (this.ICustomTabsCallbackDefault + 5 >= this.onUnminimized) {
                extraCallbackWithResult();
            }
            int i5 = this.ICustomTabsCallbackDefault;
            char[] cArr2 = this.ICustomTabsCallbackStub;
            char[] cArrOnActivityLayout = onActivityLayout();
            cArr2[i5] = '\\';
            int i6 = i5 + 2;
            cArr2[i5 + 1] = 'u';
            if (c > 255) {
                int i7 = c >> '\b';
                cArr2[i6] = cArrOnActivityLayout[(i7 & OggPageHeader.MAX_SEGMENT_COUNT) >> 4];
                i3 = i5 + 4;
                cArr2[i5 + 3] = cArrOnActivityLayout[i7 & 15];
                c = (char) (c & 255);
            } else {
                cArr2[i6] = '0';
                i3 = i5 + 4;
                cArr2[i5 + 3] = '0';
            }
            cArr2[i3] = cArrOnActivityLayout[c >> 4];
            cArr2[i3 + 1] = cArrOnActivityLayout[c & 15];
            this.ICustomTabsCallbackDefault = i3 + 2;
            return;
        }
        hasOptionsMenu hasoptionsmenu = this.onActivityLayout;
        if (hasoptionsmenu == null) {
            strOnWarmupCompleted = this.ICustomTabsCallback.IAuthTabCallback(c).onWarmupCompleted();
        } else {
            strOnWarmupCompleted = hasoptionsmenu.onWarmupCompleted();
            this.onActivityLayout = null;
        }
        int length = strOnWarmupCompleted.length();
        if (this.ICustomTabsCallbackDefault + length > this.onUnminimized) {
            extraCallbackWithResult();
            if (length > this.onUnminimized) {
                this.ICustomTabsService.write(strOnWarmupCompleted);
                return;
            }
        }
        strOnWarmupCompleted.getChars(0, length, this.ICustomTabsCallbackStub, this.ICustomTabsCallbackDefault);
        this.ICustomTabsCallbackDefault += length;
    }

    private char[] ICustomTabsCallback() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.onPostMessage = cArr;
        return cArr;
    }

    protected void extraCallbackWithResult() throws IOException {
        int i2 = this.ICustomTabsCallbackDefault;
        int i3 = this.onRelationshipValidationResult;
        int i4 = i2 - i3;
        if (i4 > 0) {
            this.onRelationshipValidationResult = 0;
            this.ICustomTabsCallbackDefault = 0;
            this.ICustomTabsService.write(this.ICustomTabsCallbackStub, i3, i4);
        }
    }
}

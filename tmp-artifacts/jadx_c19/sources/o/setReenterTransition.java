package o;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.getView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setReenterTransition extends setExitSharedElementCallback {
    protected int ICustomTabsCallbackStub;
    protected final OutputStream ICustomTabsCallbackStubProxy;
    protected final int onActivityLayout;
    protected boolean onActivityResized;
    protected final int onMessageChannelReady;
    protected char[] onMinimized;
    protected byte[] onPostMessage;
    protected final int onRelationshipValidationResult;
    protected byte onUnminimized;
    private static final byte[] extraCommand = postponeEnterTransition.onNavigationEvent(true);
    private static final byte[] ICustomTabsCallback_Parcel = postponeEnterTransition.onNavigationEvent(false);
    private static final byte[] ICustomTabsService = {110, 117, 108, 108};
    private static final byte[] mayLaunchUrl = {116, 114, 117, 101};
    private static final byte[] ICustomTabsCallbackDefault = {102, 97, 108, 115, 101};

    private static boolean onWarmupCompleted(int i2) {
        return (i2 & 64512) == 55296;
    }

    public setReenterTransition(performViewCreated performviewcreated, int i2, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, OutputStream outputStream, char c) {
        super(performviewcreated, i2, getviewlifecycleownerlivedata);
        this.ICustomTabsCallbackStubProxy = outputStream;
        this.onUnminimized = (byte) c;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(setNextTransition.ESCAPE_FORWARD_SLASHES.mappedFeature());
        if (c != '\"' || zOnExtraCallbackWithResult) {
            this.readTypedObject = postponeEnterTransition.onExtraCallbackWithResult(c, zOnExtraCallbackWithResult);
        }
        this.onActivityResized = true;
        byte[] bArrOnExtraCallbackWithResult = performviewcreated.onExtraCallbackWithResult();
        this.onPostMessage = bArrOnExtraCallbackWithResult;
        int length = bArrOnExtraCallbackWithResult.length;
        this.onActivityLayout = length;
        this.onRelationshipValidationResult = length >> 3;
        char[] cArrOnExtraCallback = performviewcreated.onExtraCallback();
        this.onMinimized = cArrOnExtraCallback;
        this.onMessageChannelReady = cArrOnExtraCallback.length;
        if (onExtraCallbackWithResult(setNextTransition.ESCAPE_NON_ASCII.mappedFeature())) {
            onExtraCallback(127);
        }
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(String str) throws IOException {
        if (this.onExtraCallback != null) {
            access000(str);
            return;
        }
        int iOnExtraCallbackWithResult = this.getInterfaceDescriptor.onExtraCallbackWithResult(str);
        if (iOnExtraCallbackWithResult == 4) {
            IAuthTabCallback("Can not write a field name, expecting a value");
        }
        if (iOnExtraCallbackWithResult == 1) {
            if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
                extraCallback();
            }
            byte[] bArr = this.onPostMessage;
            int i2 = this.ICustomTabsCallbackStub;
            this.ICustomTabsCallbackStub = i2 + 1;
            bArr[i2] = 44;
        }
        if (this.IAuthTabCallbackStubProxy) {
            onNavigationEvent(str, false);
            return;
        }
        int length = str.length();
        if (length > this.onMessageChannelReady) {
            onNavigationEvent(str, true);
            return;
        }
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr2 = this.onPostMessage;
        int i3 = this.ICustomTabsCallbackStub;
        int i4 = i3 + 1;
        this.ICustomTabsCallbackStub = i4;
        bArr2[i3] = this.onUnminimized;
        if (length <= this.onRelationshipValidationResult) {
            if (i4 + length > this.onActivityLayout) {
                extraCallback();
            }
            IAuthTabCallback(str, 0, length);
        } else {
            onTransact(str, 0, length);
        }
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr3 = this.onPostMessage;
        int i5 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i5 + 1;
        bArr3[i5] = this.onUnminimized;
    }

    @Override // o.isRemoving, o.getView
    public void onNavigationEvent(hasOptionsMenu hasoptionsmenu) throws IOException {
        if (this.onExtraCallback != null) {
            asBinder(hasoptionsmenu);
            return;
        }
        int iOnExtraCallbackWithResult = this.getInterfaceDescriptor.onExtraCallbackWithResult(hasoptionsmenu.onWarmupCompleted());
        if (iOnExtraCallbackWithResult == 4) {
            IAuthTabCallback("Can not write a field name, expecting a value");
        }
        if (iOnExtraCallbackWithResult == 1) {
            if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
                extraCallback();
            }
            byte[] bArr = this.onPostMessage;
            int i2 = this.ICustomTabsCallbackStub;
            this.ICustomTabsCallbackStub = i2 + 1;
            bArr[i2] = 44;
        }
        if (this.IAuthTabCallbackStubProxy) {
            onTransact(hasoptionsmenu);
            return;
        }
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr2 = this.onPostMessage;
        int i3 = this.ICustomTabsCallbackStub;
        int i4 = i3 + 1;
        this.ICustomTabsCallbackStub = i4;
        bArr2[i3] = this.onUnminimized;
        int iOnWarmupCompleted = hasoptionsmenu.onWarmupCompleted(bArr2, i4);
        if (iOnWarmupCompleted < 0) {
            onExtraCallback(hasoptionsmenu.onExtraCallbackWithResult());
        } else {
            this.ICustomTabsCallbackStub += iOnWarmupCompleted;
        }
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr3 = this.onPostMessage;
        int i5 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i5 + 1;
        bArr3[i5] = this.onUnminimized;
    }

    private final void onTransact(hasOptionsMenu hasoptionsmenu) throws IOException {
        int iOnWarmupCompleted = hasoptionsmenu.onWarmupCompleted(this.onPostMessage, this.ICustomTabsCallbackStub);
        if (iOnWarmupCompleted < 0) {
            onExtraCallback(hasoptionsmenu.onExtraCallbackWithResult());
        } else {
            this.ICustomTabsCallbackStub += iOnWarmupCompleted;
        }
    }

    @Override // o.getView
    public final void IAuthTabCallback_Parcel() throws IOException {
        IAuthTabCallback_Parcel("start an array");
        this.getInterfaceDescriptor = this.getInterfaceDescriptor.access100();
        asBinder().onExtraCallbackWithResult(this.getInterfaceDescriptor.onExtraCallback());
        initState initstate = this.onExtraCallback;
        if (initstate != null) {
            initstate.IAuthTabCallbackDefault(this);
            return;
        }
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i2 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i2 + 1;
        bArr[i2] = 91;
    }

    @Override // o.getView
    public final void onTransact(Object obj) throws IOException {
        IAuthTabCallback_Parcel("start an array");
        this.getInterfaceDescriptor = this.getInterfaceDescriptor.onExtraCallbackWithResult(obj);
        asBinder().onExtraCallbackWithResult(this.getInterfaceDescriptor.onExtraCallback());
        initState initstate = this.onExtraCallback;
        if (initstate != null) {
            initstate.IAuthTabCallbackDefault(this);
            return;
        }
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i2 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i2 + 1;
        bArr[i2] = 91;
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
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i3 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i3 + 1;
        bArr[i3] = 91;
    }

    @Override // o.getView
    public final void access100() throws IOException {
        if (!this.getInterfaceDescriptor.IAuthTabCallbackStub()) {
            IAuthTabCallback("Current context not Array but " + this.getInterfaceDescriptor.getInterfaceDescriptor());
        }
        initState initstate = this.onExtraCallback;
        if (initstate != null) {
            initstate.onWarmupCompleted(this, this.getInterfaceDescriptor.onWarmupCompleted());
        } else {
            if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
                extraCallback();
            }
            byte[] bArr = this.onPostMessage;
            int i2 = this.ICustomTabsCallbackStub;
            this.ICustomTabsCallbackStub = i2 + 1;
            bArr[i2] = 93;
        }
        this.getInterfaceDescriptor = this.getInterfaceDescriptor.IAuthTabCallbackStubProxy();
    }

    @Override // o.getView
    public final void getInterfaceDescriptor() throws IOException {
        IAuthTabCallback_Parcel("start an object");
        this.getInterfaceDescriptor = this.getInterfaceDescriptor.access000();
        asBinder().onExtraCallbackWithResult(this.getInterfaceDescriptor.onExtraCallback());
        initState initstate = this.onExtraCallback;
        if (initstate != null) {
            initstate.onTransact(this);
            return;
        }
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i2 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i2 + 1;
        bArr[i2] = 123;
    }

    @Override // o.isRemoving, o.getView
    public void IAuthTabCallbackStub(Object obj) throws IOException {
        IAuthTabCallback_Parcel("start an object");
        setInitialSavedState setinitialsavedstateOnExtraCallback = this.getInterfaceDescriptor.onExtraCallback(obj);
        asBinder().onExtraCallbackWithResult(setinitialsavedstateOnExtraCallback.onExtraCallback());
        this.getInterfaceDescriptor = setinitialsavedstateOnExtraCallback;
        initState initstate = this.onExtraCallback;
        if (initstate != null) {
            initstate.onTransact(this);
            return;
        }
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i2 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i2 + 1;
        bArr[i2] = 123;
    }

    @Override // o.getView
    public void onNavigationEvent(Object obj, int i2) throws IOException {
        IAuthTabCallbackStub(obj);
    }

    @Override // o.getView
    public final void access000() throws IOException {
        if (!this.getInterfaceDescriptor.asBinder()) {
            IAuthTabCallback("Current context not Object but " + this.getInterfaceDescriptor.getInterfaceDescriptor());
        }
        initState initstate = this.onExtraCallback;
        if (initstate != null) {
            initstate.onNavigationEvent(this, this.getInterfaceDescriptor.onWarmupCompleted());
        } else {
            if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
                extraCallback();
            }
            byte[] bArr = this.onPostMessage;
            int i2 = this.ICustomTabsCallbackStub;
            this.ICustomTabsCallbackStub = i2 + 1;
            bArr[i2] = 125;
        }
        this.getInterfaceDescriptor = this.getInterfaceDescriptor.IAuthTabCallbackStubProxy();
    }

    protected final void access000(String str) throws IOException {
        int iOnExtraCallbackWithResult = this.getInterfaceDescriptor.onExtraCallbackWithResult(str);
        if (iOnExtraCallbackWithResult == 4) {
            IAuthTabCallback("Can not write a field name, expecting a value");
        }
        if (iOnExtraCallbackWithResult == 1) {
            this.onExtraCallback.onExtraCallback(this);
        } else {
            this.onExtraCallback.onWarmupCompleted(this);
        }
        if (this.IAuthTabCallbackStubProxy) {
            onNavigationEvent(str, false);
            return;
        }
        int length = str.length();
        if (length > this.onMessageChannelReady) {
            onNavigationEvent(str, true);
            return;
        }
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i2 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i2 + 1;
        bArr[i2] = this.onUnminimized;
        str.getChars(0, length, this.onMinimized, 0);
        if (length <= this.onRelationshipValidationResult) {
            if (this.ICustomTabsCallbackStub + length > this.onActivityLayout) {
                extraCallback();
            }
            asInterface(this.onMinimized, 0, length);
        } else {
            IAuthTabCallbackStub(this.onMinimized, 0, length);
        }
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr2 = this.onPostMessage;
        int i3 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i3 + 1;
        bArr2[i3] = this.onUnminimized;
    }

    protected final void asBinder(hasOptionsMenu hasoptionsmenu) throws IOException {
        int iOnExtraCallbackWithResult = this.getInterfaceDescriptor.onExtraCallbackWithResult(hasoptionsmenu.onWarmupCompleted());
        if (iOnExtraCallbackWithResult == 4) {
            IAuthTabCallback("Can not write a field name, expecting a value");
        }
        if (iOnExtraCallbackWithResult == 1) {
            this.onExtraCallback.onExtraCallback(this);
        } else {
            this.onExtraCallback.onWarmupCompleted(this);
        }
        boolean z = this.IAuthTabCallbackStubProxy;
        if (!z) {
            if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
                extraCallback();
            }
            byte[] bArr = this.onPostMessage;
            int i2 = this.ICustomTabsCallbackStub;
            this.ICustomTabsCallbackStub = i2 + 1;
            bArr[i2] = this.onUnminimized;
        }
        int iOnWarmupCompleted = hasoptionsmenu.onWarmupCompleted(this.onPostMessage, this.ICustomTabsCallbackStub);
        if (iOnWarmupCompleted < 0) {
            onExtraCallback(hasoptionsmenu.onExtraCallbackWithResult());
        } else {
            this.ICustomTabsCallbackStub += iOnWarmupCompleted;
        }
        if (z) {
            return;
        }
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr2 = this.onPostMessage;
        int i3 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i3 + 1;
        bArr2[i3] = this.onUnminimized;
    }

    @Override // o.getView
    public void asBinder(String str) throws IOException {
        IAuthTabCallback_Parcel("write a string");
        if (str == null) {
            writeTypedObject();
            return;
        }
        int length = str.length();
        if (length > this.onRelationshipValidationResult) {
            onNavigationEvent(str, true);
            return;
        }
        if (this.ICustomTabsCallbackStub + length >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i2 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i2 + 1;
        bArr[i2] = this.onUnminimized;
        IAuthTabCallback(str, 0, length);
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr2 = this.onPostMessage;
        int i3 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i3 + 1;
        bArr2[i3] = this.onUnminimized;
    }

    @Override // o.getView
    public void onNavigationEvent(char[] cArr, int i2, int i3) throws IOException {
        IAuthTabCallback_Parcel("write a string");
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i4 = this.ICustomTabsCallbackStub;
        int i5 = i4 + 1;
        this.ICustomTabsCallbackStub = i5;
        bArr[i4] = this.onUnminimized;
        if (i3 <= this.onRelationshipValidationResult) {
            if (i5 + i3 > this.onActivityLayout) {
                extraCallback();
            }
            asInterface(cArr, i2, i3);
        } else {
            IAuthTabCallbackStub(cArr, i2, i3);
        }
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr2 = this.onPostMessage;
        int i6 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i6 + 1;
        bArr2[i6] = this.onUnminimized;
    }

    @Override // o.isRemoving, o.getView
    public final void onExtraCallbackWithResult(hasOptionsMenu hasoptionsmenu) throws IOException {
        IAuthTabCallback_Parcel("write a string");
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i2 = this.ICustomTabsCallbackStub;
        int i3 = i2 + 1;
        this.ICustomTabsCallbackStub = i3;
        bArr[i2] = this.onUnminimized;
        int iOnWarmupCompleted = hasoptionsmenu.onWarmupCompleted(bArr, i3);
        if (iOnWarmupCompleted < 0) {
            onExtraCallback(hasoptionsmenu.onExtraCallbackWithResult());
        } else {
            this.ICustomTabsCallbackStub += iOnWarmupCompleted;
        }
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr2 = this.onPostMessage;
        int i4 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i4 + 1;
        bArr2[i4] = this.onUnminimized;
    }

    @Override // o.getView
    public void onTransact(String str) throws IOException {
        int length = str.length();
        char[] cArr = this.onMinimized;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            IAuthTabCallback(cArr, 0, length);
        } else {
            onExtraCallbackWithResult(str, 0, length);
        }
    }

    public void onExtraCallbackWithResult(String str, int i2, int i3) throws IOException {
        int i4;
        char c;
        onWarmupCompleted(str, i2, i3);
        char[] cArr = this.onMinimized;
        int length = cArr.length;
        if (i3 <= length) {
            str.getChars(i2, i2 + i3, cArr, 0);
            IAuthTabCallback(cArr, 0, i3);
            return;
        }
        int i5 = this.onActivityLayout;
        int iMin = Math.min(length, (i5 >> 2) + (i5 >> 4));
        while (i3 > 0) {
            int iMin2 = Math.min(iMin, i3);
            str.getChars(i2, i2 + iMin2, cArr, 0);
            if (this.ICustomTabsCallbackStub + (iMin * 3) > this.onActivityLayout) {
                extraCallback();
            }
            if (iMin2 > 1 && (c = cArr[iMin2 - 1]) >= 55296 && c <= 56319) {
                iMin2 = i4;
            }
            onExtraCallbackWithResult(cArr, 0, iMin2);
            i2 += iMin2;
            i3 -= iMin2;
        }
    }

    @Override // o.getView
    public void IAuthTabCallback(hasOptionsMenu hasoptionsmenu) throws IOException {
        int iOnNavigationEvent = hasoptionsmenu.onNavigationEvent(this.onPostMessage, this.ICustomTabsCallbackStub);
        if (iOnNavigationEvent < 0) {
            onExtraCallback(hasoptionsmenu.onNavigationEvent());
        } else {
            this.ICustomTabsCallbackStub += iOnNavigationEvent;
        }
    }

    @Override // o.isRemoving, o.getView
    public void onExtraCallback(hasOptionsMenu hasoptionsmenu) throws IOException {
        IAuthTabCallback_Parcel("write a raw (unencoded) value");
        int iOnNavigationEvent = hasoptionsmenu.onNavigationEvent(this.onPostMessage, this.ICustomTabsCallbackStub);
        if (iOnNavigationEvent < 0) {
            onExtraCallback(hasoptionsmenu.onNavigationEvent());
        } else {
            this.ICustomTabsCallbackStub += iOnNavigationEvent;
        }
    }

    @Override // o.getView
    public final void IAuthTabCallback(char[] cArr, int i2, int i3) throws IOException {
        onExtraCallback(cArr, i2, i3);
        int i4 = i3 + i3 + i3;
        int i5 = this.ICustomTabsCallbackStub;
        int i6 = this.onActivityLayout;
        if (i5 + i4 > i6) {
            if (i6 < i4) {
                asBinder(cArr, i2, i3);
                return;
            }
            extraCallback();
        }
        int i7 = i3 + i2;
        while (i2 < i7) {
            do {
                char c = cArr[i2];
                if (c > 127) {
                    i2++;
                    if (c < 2048) {
                        byte[] bArr = this.onPostMessage;
                        int i8 = this.ICustomTabsCallbackStub;
                        bArr[i8] = (byte) ((c >> 6) | 192);
                        this.ICustomTabsCallbackStub = i8 + 2;
                        bArr[i8 + 1] = (byte) ((c & '?') | 128);
                    } else {
                        i2 = onExtraCallbackWithResult(c, cArr, i2, i7);
                    }
                } else {
                    byte[] bArr2 = this.onPostMessage;
                    int i9 = this.ICustomTabsCallbackStub;
                    this.ICustomTabsCallbackStub = i9 + 1;
                    bArr2[i9] = (byte) c;
                    i2++;
                }
            } while (i2 < i7);
            return;
        }
    }

    @Override // o.getView
    public void onWarmupCompleted(char c) throws IOException {
        if (this.ICustomTabsCallbackStub + 3 >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        if (c <= 127) {
            int i2 = this.ICustomTabsCallbackStub;
            this.ICustomTabsCallbackStub = i2 + 1;
            bArr[i2] = (byte) c;
        } else {
            if (c < 2048) {
                int i3 = this.ICustomTabsCallbackStub;
                bArr[i3] = (byte) ((c >> 6) | 192);
                this.ICustomTabsCallbackStub = i3 + 2;
                bArr[i3 + 1] = (byte) ((c & '?') | 128);
                return;
            }
            onExtraCallbackWithResult(c, (char[]) null, 0, 0);
        }
    }

    private final void asBinder(char[] cArr, int i2, int i3) throws IOException {
        int i4 = this.onActivityLayout;
        byte[] bArr = this.onPostMessage;
        int i5 = i3 + i2;
        while (i2 < i5) {
            do {
                char c = cArr[i2];
                if (c <= 127) {
                    if (this.ICustomTabsCallbackStub >= i4) {
                        extraCallback();
                    }
                    int i6 = this.ICustomTabsCallbackStub;
                    this.ICustomTabsCallbackStub = i6 + 1;
                    bArr[i6] = (byte) c;
                    i2++;
                } else {
                    if (this.ICustomTabsCallbackStub + 3 >= this.onActivityLayout) {
                        extraCallback();
                    }
                    int i7 = i2 + 1;
                    char c2 = cArr[i2];
                    if (c2 < 2048) {
                        int i8 = this.ICustomTabsCallbackStub;
                        bArr[i8] = (byte) ((c2 >> 6) | 192);
                        this.ICustomTabsCallbackStub = i8 + 2;
                        bArr[i8 + 1] = (byte) ((c2 & '?') | 128);
                        i2 = i7;
                    } else {
                        i2 = onExtraCallbackWithResult(c2, cArr, i7, i5);
                    }
                }
            } while (i2 < i5);
            return;
        }
    }

    private void onExtraCallbackWithResult(char[] cArr, int i2, int i3) throws IOException {
        while (i2 < i3) {
            do {
                char c = cArr[i2];
                if (c > 127) {
                    i2++;
                    if (c < 2048) {
                        byte[] bArr = this.onPostMessage;
                        int i4 = this.ICustomTabsCallbackStub;
                        bArr[i4] = (byte) ((c >> 6) | 192);
                        this.ICustomTabsCallbackStub = i4 + 2;
                        bArr[i4 + 1] = (byte) ((c & '?') | 128);
                    } else {
                        i2 = onExtraCallbackWithResult(c, cArr, i2, i3);
                    }
                } else {
                    byte[] bArr2 = this.onPostMessage;
                    int i5 = this.ICustomTabsCallbackStub;
                    this.ICustomTabsCallbackStub = i5 + 1;
                    bArr2[i5] = (byte) c;
                    i2++;
                }
            } while (i2 < i3);
            return;
        }
    }

    @Override // o.getView
    public void onWarmupCompleted(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, byte[] bArr, int i2, int i3) throws IOException {
        onNavigationEvent(bArr, i2, i3);
        IAuthTabCallback_Parcel("write a binary value");
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr2 = this.onPostMessage;
        int i4 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i4 + 1;
        bArr2[i4] = this.onUnminimized;
        onExtraCallbackWithResult(getpostonviewcreatedalpha, bArr, i2, i3 + i2);
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr3 = this.onPostMessage;
        int i5 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i5 + 1;
        bArr3[i5] = this.onUnminimized;
    }

    @Override // o.isRemoving, o.getView
    public int onExtraCallbackWithResult(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, InputStream inputStream, int i2) throws IOException {
        IAuthTabCallback_Parcel("write a binary value");
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i3 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i3 + 1;
        bArr[i3] = this.onUnminimized;
        byte[] bArrIAuthTabCallback = this.asInterface.IAuthTabCallback();
        try {
            if (i2 < 0) {
                i2 = onWarmupCompleted(getpostonviewcreatedalpha, inputStream, bArrIAuthTabCallback);
            } else {
                int iOnExtraCallbackWithResult = onExtraCallbackWithResult(getpostonviewcreatedalpha, inputStream, bArrIAuthTabCallback, i2);
                if (iOnExtraCallbackWithResult > 0) {
                    IAuthTabCallback("Too few bytes available: missing " + iOnExtraCallbackWithResult + " bytes (out of " + i2 + ")");
                }
            }
            this.asInterface.onNavigationEvent(bArrIAuthTabCallback);
            if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
                extraCallback();
            }
            byte[] bArr2 = this.onPostMessage;
            int i4 = this.ICustomTabsCallbackStub;
            this.ICustomTabsCallbackStub = i4 + 1;
            bArr2[i4] = this.onUnminimized;
            return i2;
        } catch (Throwable th) {
            this.asInterface.onNavigationEvent(bArrIAuthTabCallback);
            throw th;
        }
    }

    @Override // o.getView
    public void onNavigationEvent(short s) throws IOException {
        IAuthTabCallback_Parcel("write a number");
        if (this.ICustomTabsCallbackStub + 6 >= this.onActivityLayout) {
            extraCallback();
        }
        if (this.onTransact) {
            onExtraCallbackWithResult(s);
        } else {
            this.ICustomTabsCallbackStub = requireActivity.IAuthTabCallback(s, this.onPostMessage, this.ICustomTabsCallbackStub);
        }
    }

    private final void onExtraCallbackWithResult(short s) throws IOException {
        if (this.ICustomTabsCallbackStub + 8 >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i2 = this.ICustomTabsCallbackStub;
        int i3 = i2 + 1;
        this.ICustomTabsCallbackStub = i3;
        bArr[i2] = this.onUnminimized;
        int iIAuthTabCallback = requireActivity.IAuthTabCallback(s, bArr, i3);
        byte[] bArr2 = this.onPostMessage;
        this.ICustomTabsCallbackStub = iIAuthTabCallback + 1;
        bArr2[iIAuthTabCallback] = this.onUnminimized;
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(int i2) throws IOException {
        IAuthTabCallback_Parcel("write a number");
        if (this.ICustomTabsCallbackStub + 11 >= this.onActivityLayout) {
            extraCallback();
        }
        if (this.onTransact) {
            IAuthTabCallbackDefault(i2);
        } else {
            this.ICustomTabsCallbackStub = requireActivity.IAuthTabCallback(i2, this.onPostMessage, this.ICustomTabsCallbackStub);
        }
    }

    private final void IAuthTabCallbackDefault(int i2) throws IOException {
        if (this.ICustomTabsCallbackStub + 13 >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i3 = this.ICustomTabsCallbackStub;
        int i4 = i3 + 1;
        this.ICustomTabsCallbackStub = i4;
        bArr[i3] = this.onUnminimized;
        int iIAuthTabCallback = requireActivity.IAuthTabCallback(i2, bArr, i4);
        byte[] bArr2 = this.onPostMessage;
        this.ICustomTabsCallbackStub = iIAuthTabCallback + 1;
        bArr2[iIAuthTabCallback] = this.onUnminimized;
    }

    @Override // o.getView
    public void onExtraCallback(long j) throws IOException {
        IAuthTabCallback_Parcel("write a number");
        if (this.onTransact) {
            onExtraCallbackWithResult(j);
            return;
        }
        if (this.ICustomTabsCallbackStub + 21 >= this.onActivityLayout) {
            extraCallback();
        }
        this.ICustomTabsCallbackStub = requireActivity.onExtraCallbackWithResult(j, this.onPostMessage, this.ICustomTabsCallbackStub);
    }

    private final void onExtraCallbackWithResult(long j) throws IOException {
        if (this.ICustomTabsCallbackStub + 23 >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i2 = this.ICustomTabsCallbackStub;
        int i3 = i2 + 1;
        this.ICustomTabsCallbackStub = i3;
        bArr[i2] = this.onUnminimized;
        int iOnExtraCallbackWithResult = requireActivity.onExtraCallbackWithResult(j, bArr, i3);
        byte[] bArr2 = this.onPostMessage;
        this.ICustomTabsCallbackStub = iOnExtraCallbackWithResult + 1;
        bArr2[iOnExtraCallbackWithResult] = this.onUnminimized;
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(BigInteger bigInteger) throws IOException {
        IAuthTabCallback_Parcel("write a number");
        if (bigInteger == null) {
            writeTypedObject();
        } else if (this.onTransact) {
            getInterfaceDescriptor(bigInteger.toString());
        } else {
            onTransact(bigInteger.toString());
        }
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(double d) throws IOException {
        if (this.onTransact || (requireActivity.onNavigationEvent(d) && getView.IAuthTabCallback.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.IAuthTabCallbackDefault))) {
            asBinder(requireActivity.onWarmupCompleted(d, onExtraCallbackWithResult(getView.IAuthTabCallback.USE_FAST_DOUBLE_WRITER)));
        } else {
            IAuthTabCallback_Parcel("write a number");
            onTransact(requireActivity.onWarmupCompleted(d, onExtraCallbackWithResult(getView.IAuthTabCallback.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // o.getView
    public void onNavigationEvent(float f) throws IOException {
        if (this.onTransact || (requireActivity.onExtraCallback(f) && getView.IAuthTabCallback.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.IAuthTabCallbackDefault))) {
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
            writeTypedObject();
        } else if (this.onTransact) {
            getInterfaceDescriptor(onWarmupCompleted(bigDecimal));
        } else {
            onTransact(onWarmupCompleted(bigDecimal));
        }
    }

    @Override // o.getView
    public void asInterface(String str) throws IOException {
        IAuthTabCallback_Parcel("write a number");
        if (str == null) {
            writeTypedObject();
        } else if (this.onTransact) {
            getInterfaceDescriptor(str);
        } else {
            onTransact(str);
        }
    }

    private final void getInterfaceDescriptor(String str) throws IOException {
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i2 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i2 + 1;
        bArr[i2] = this.onUnminimized;
        onTransact(str);
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr2 = this.onPostMessage;
        int i3 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i3 + 1;
        bArr2[i3] = this.onUnminimized;
    }

    @Override // o.getView
    public void onWarmupCompleted(boolean z) throws IOException {
        IAuthTabCallback_Parcel("write a boolean value");
        if (this.ICustomTabsCallbackStub + 5 >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = z ? mayLaunchUrl : ICustomTabsCallbackDefault;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.onPostMessage, this.ICustomTabsCallbackStub, length);
        this.ICustomTabsCallbackStub += length;
    }

    @Override // o.getView
    public void IAuthTabCallbackStubProxy() throws IOException {
        IAuthTabCallback_Parcel("write a null");
        writeTypedObject();
    }

    @Override // o.isRemoving
    public final void IAuthTabCallback_Parcel(String str) throws IOException {
        byte b;
        int iWriteTypedObject = this.getInterfaceDescriptor.writeTypedObject();
        if (this.onExtraCallback != null) {
            onNavigationEvent(str, iWriteTypedObject);
            return;
        }
        if (iWriteTypedObject == 1) {
            b = 44;
        } else {
            if (iWriteTypedObject != 2) {
                if (iWriteTypedObject != 3) {
                    if (iWriteTypedObject == 5) {
                        IAuthTabCallbackStubProxy(str);
                        return;
                    }
                    return;
                }
                hasOptionsMenu hasoptionsmenu = this.writeTypedObject;
                if (hasoptionsmenu != null) {
                    byte[] bArrOnNavigationEvent = hasoptionsmenu.onNavigationEvent();
                    if (bArrOnNavigationEvent.length > 0) {
                        onExtraCallback(bArrOnNavigationEvent);
                        return;
                    }
                    return;
                }
                return;
            }
            b = 58;
        }
        if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i2 = this.ICustomTabsCallbackStub;
        this.ICustomTabsCallbackStub = i2 + 1;
        bArr[i2] = b;
    }

    @Override // o.getView, java.io.Flushable
    public void flush() throws IOException {
        extraCallback();
        if (this.ICustomTabsCallbackStubProxy == null || !onExtraCallbackWithResult(getView.IAuthTabCallback.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.ICustomTabsCallbackStubProxy.flush();
    }

    @Override // o.isRemoving, o.getView, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        super.close();
        try {
            if (this.onPostMessage != null && onExtraCallbackWithResult(getView.IAuthTabCallback.AUTO_CLOSE_JSON_CONTENT)) {
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
            extraCallback();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        this.ICustomTabsCallbackStub = 0;
        if (this.ICustomTabsCallbackStubProxy != null) {
            try {
                if (this.asInterface.onTransact() || onExtraCallbackWithResult(getView.IAuthTabCallback.AUTO_CLOSE_TARGET)) {
                    this.ICustomTabsCallbackStubProxy.close();
                } else if (onExtraCallbackWithResult(getView.IAuthTabCallback.FLUSH_PASSED_TO_STREAM)) {
                    this.ICustomTabsCallbackStubProxy.flush();
                }
            } catch (IOException | RuntimeException e2) {
                if (e != null) {
                    e2.addSuppressed(e);
                }
                throw e2;
            }
        }
        ICustomTabsCallback();
        if (e != null) {
            throw e;
        }
    }

    public void ICustomTabsCallback() {
        byte[] bArr = this.onPostMessage;
        if (bArr != null && this.onActivityResized) {
            this.onPostMessage = null;
            this.asInterface.IAuthTabCallback(bArr);
        }
        char[] cArr = this.onMinimized;
        if (cArr != null) {
            this.onMinimized = null;
            this.asInterface.onExtraCallback(cArr);
        }
    }

    private final void onExtraCallback(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.ICustomTabsCallbackStub + length > this.onActivityLayout) {
            extraCallback();
            if (length > 512) {
                this.ICustomTabsCallbackStubProxy.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.onPostMessage, this.ICustomTabsCallbackStub, length);
        this.ICustomTabsCallbackStub += length;
    }

    private final void onNavigationEvent(String str, boolean z) throws IOException {
        if (z) {
            if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
                extraCallback();
            }
            byte[] bArr = this.onPostMessage;
            int i2 = this.ICustomTabsCallbackStub;
            this.ICustomTabsCallbackStub = i2 + 1;
            bArr[i2] = this.onUnminimized;
        }
        int length = str.length();
        int i3 = 0;
        while (length > 0) {
            int iMin = Math.min(this.onRelationshipValidationResult, length);
            if (this.ICustomTabsCallbackStub + iMin > this.onActivityLayout) {
                extraCallback();
            }
            IAuthTabCallback(str, i3, iMin);
            i3 += iMin;
            length -= iMin;
        }
        if (z) {
            if (this.ICustomTabsCallbackStub >= this.onActivityLayout) {
                extraCallback();
            }
            byte[] bArr2 = this.onPostMessage;
            int i4 = this.ICustomTabsCallbackStub;
            this.ICustomTabsCallbackStub = i4 + 1;
            bArr2[i4] = this.onUnminimized;
        }
    }

    private final void IAuthTabCallbackStub(char[] cArr, int i2, int i3) throws IOException {
        do {
            int iMin = Math.min(this.onRelationshipValidationResult, i3);
            if (this.ICustomTabsCallbackStub + iMin > this.onActivityLayout) {
                extraCallback();
            }
            asInterface(cArr, i2, iMin);
            i2 += iMin;
            i3 -= iMin;
        } while (i3 > 0);
    }

    private final void onTransact(String str, int i2, int i3) throws IOException {
        do {
            int iMin = Math.min(this.onRelationshipValidationResult, i3);
            if (this.ICustomTabsCallbackStub + iMin > this.onActivityLayout) {
                extraCallback();
            }
            IAuthTabCallback(str, i2, iMin);
            i2 += iMin;
            i3 -= iMin;
        } while (i3 > 0);
    }

    private final void asInterface(char[] cArr, int i2, int i3) throws IOException {
        int i4 = i3 + i2;
        int i5 = this.ICustomTabsCallbackStub;
        byte[] bArr = this.onPostMessage;
        int[] iArr = this.readTypedObject;
        while (i2 < i4) {
            char c = cArr[i2];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            bArr[i5] = (byte) c;
            i2++;
            i5++;
        }
        this.ICustomTabsCallbackStub = i5;
        if (i2 < i4) {
            if (this.ICustomTabsCallback != null) {
                onWarmupCompleted(cArr, i2, i4);
            } else if (this.extraCallback == 0) {
                onTransact(cArr, i2, i4);
            } else {
                IAuthTabCallbackDefault(cArr, i2, i4);
            }
        }
    }

    private final void IAuthTabCallback(String str, int i2, int i3) throws IOException {
        int i4 = i3 + i2;
        int i5 = this.ICustomTabsCallbackStub;
        byte[] bArr = this.onPostMessage;
        int[] iArr = this.readTypedObject;
        while (i2 < i4) {
            char cCharAt = str.charAt(i2);
            if (cCharAt > 127 || iArr[cCharAt] != 0) {
                break;
            }
            bArr[i5] = (byte) cCharAt;
            i2++;
            i5++;
        }
        this.ICustomTabsCallbackStub = i5;
        if (i2 < i4) {
            if (this.ICustomTabsCallback != null) {
                onExtraCallback(str, i2, i4);
            } else if (this.extraCallback == 0) {
                onNavigationEvent(str, i2, i4);
            } else {
                asBinder(str, i2, i4);
            }
        }
    }

    private final void onTransact(char[] cArr, int i2, int i3) throws IOException {
        int iAsInterface;
        if (this.ICustomTabsCallbackStub + ((i3 - i2) * 6) > this.onActivityLayout) {
            extraCallback();
        }
        int iIAuthTabCallback = this.ICustomTabsCallbackStub;
        byte[] bArr = this.onPostMessage;
        int[] iArr = this.readTypedObject;
        while (i2 < i3) {
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c <= 127) {
                int i5 = iArr[c];
                if (i5 == 0) {
                    iAsInterface = iIAuthTabCallback + 1;
                    bArr[iIAuthTabCallback] = (byte) c;
                } else if (i5 > 0) {
                    bArr[iIAuthTabCallback] = 92;
                    bArr[iIAuthTabCallback + 1] = (byte) i5;
                    iIAuthTabCallback += 2;
                    i2 = i4;
                } else {
                    iAsInterface = asInterface(c, iIAuthTabCallback);
                }
            } else if (c <= 2047) {
                bArr[iIAuthTabCallback] = (byte) ((c >> 6) | 192);
                iAsInterface = iIAuthTabCallback + 2;
                bArr[iIAuthTabCallback + 1] = (byte) ((c & '?') | 128);
            } else if (onWarmupCompleted((int) c) && getView.IAuthTabCallback.COMBINE_UNICODE_SURROGATES_IN_UTF8.enabledIn(this.IAuthTabCallbackDefault) && i4 < i3) {
                i2 += 2;
                iIAuthTabCallback = IAuthTabCallback(c, cArr[i4], iIAuthTabCallback);
            } else {
                iAsInterface = IAuthTabCallbackStub(c, iIAuthTabCallback);
            }
            iIAuthTabCallback = iAsInterface;
            i2 = i4;
        }
        this.ICustomTabsCallbackStub = iIAuthTabCallback;
    }

    private final void onNavigationEvent(String str, int i2, int i3) throws IOException {
        int iAsInterface;
        if (this.ICustomTabsCallbackStub + ((i3 - i2) * 6) > this.onActivityLayout) {
            extraCallback();
        }
        int iIAuthTabCallback = this.ICustomTabsCallbackStub;
        byte[] bArr = this.onPostMessage;
        int[] iArr = this.readTypedObject;
        while (i2 < i3) {
            int i4 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 127) {
                int i5 = iArr[cCharAt];
                if (i5 == 0) {
                    iAsInterface = iIAuthTabCallback + 1;
                    bArr[iIAuthTabCallback] = (byte) cCharAt;
                } else if (i5 > 0) {
                    bArr[iIAuthTabCallback] = 92;
                    bArr[iIAuthTabCallback + 1] = (byte) i5;
                    iIAuthTabCallback += 2;
                    i2 = i4;
                } else {
                    iAsInterface = asInterface(cCharAt, iIAuthTabCallback);
                }
            } else if (cCharAt <= 2047) {
                bArr[iIAuthTabCallback] = (byte) ((cCharAt >> 6) | 192);
                iAsInterface = iIAuthTabCallback + 2;
                bArr[iIAuthTabCallback + 1] = (byte) ((cCharAt & '?') | 128);
            } else if (onWarmupCompleted((int) cCharAt) && getView.IAuthTabCallback.COMBINE_UNICODE_SURROGATES_IN_UTF8.enabledIn(this.IAuthTabCallbackDefault) && i4 < i3) {
                i2 += 2;
                iIAuthTabCallback = IAuthTabCallback(cCharAt, str.charAt(i4), iIAuthTabCallback);
            } else {
                iAsInterface = IAuthTabCallbackStub(cCharAt, iIAuthTabCallback);
            }
            iIAuthTabCallback = iAsInterface;
            i2 = i4;
        }
        this.ICustomTabsCallbackStub = iIAuthTabCallback;
    }

    private final void IAuthTabCallbackDefault(char[] cArr, int i2, int i3) throws IOException {
        int iIAuthTabCallbackStub;
        if (this.ICustomTabsCallbackStub + ((i3 - i2) * 6) > this.onActivityLayout) {
            extraCallback();
        }
        int i4 = this.ICustomTabsCallbackStub;
        byte[] bArr = this.onPostMessage;
        int[] iArr = this.readTypedObject;
        int i5 = this.extraCallback;
        while (i2 < i3) {
            int i6 = i2 + 1;
            char c = cArr[i2];
            if (c <= 127) {
                int i7 = iArr[c];
                if (i7 == 0) {
                    bArr[i4] = (byte) c;
                    i4++;
                } else {
                    if (i7 > 0) {
                        bArr[i4] = 92;
                        iIAuthTabCallbackStub = i4 + 2;
                        bArr[i4 + 1] = (byte) i7;
                    } else {
                        iIAuthTabCallbackStub = asInterface(c, i4);
                    }
                    i4 = iIAuthTabCallbackStub;
                }
            } else {
                if (c > i5) {
                    iIAuthTabCallbackStub = asInterface(c, i4);
                } else if (c <= 2047) {
                    bArr[i4] = (byte) ((c >> 6) | 192);
                    int i8 = i4 + 2;
                    bArr[i4 + 1] = (byte) ((c & '?') | 128);
                    i4 = i8;
                } else {
                    iIAuthTabCallbackStub = IAuthTabCallbackStub(c, i4);
                }
                i4 = iIAuthTabCallbackStub;
            }
            i2 = i6;
        }
        this.ICustomTabsCallbackStub = i4;
    }

    private final void asBinder(String str, int i2, int i3) throws IOException {
        int iIAuthTabCallbackStub;
        if (this.ICustomTabsCallbackStub + ((i3 - i2) * 6) > this.onActivityLayout) {
            extraCallback();
        }
        int i4 = this.ICustomTabsCallbackStub;
        byte[] bArr = this.onPostMessage;
        int[] iArr = this.readTypedObject;
        int i5 = this.extraCallback;
        while (i2 < i3) {
            int i6 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 127) {
                int i7 = iArr[cCharAt];
                if (i7 == 0) {
                    bArr[i4] = (byte) cCharAt;
                    i4++;
                } else {
                    if (i7 > 0) {
                        bArr[i4] = 92;
                        iIAuthTabCallbackStub = i4 + 2;
                        bArr[i4 + 1] = (byte) i7;
                    } else {
                        iIAuthTabCallbackStub = asInterface(cCharAt, i4);
                    }
                    i4 = iIAuthTabCallbackStub;
                }
            } else {
                if (cCharAt > i5) {
                    iIAuthTabCallbackStub = asInterface(cCharAt, i4);
                } else if (cCharAt <= 2047) {
                    bArr[i4] = (byte) ((cCharAt >> 6) | 192);
                    int i8 = i4 + 2;
                    bArr[i4 + 1] = (byte) ((cCharAt & '?') | 128);
                    i4 = i8;
                } else {
                    iIAuthTabCallbackStub = IAuthTabCallbackStub(cCharAt, i4);
                }
                i4 = iIAuthTabCallbackStub;
            }
            i2 = i6;
        }
        this.ICustomTabsCallbackStub = i4;
    }

    private final void onWarmupCompleted(char[] cArr, int i2, int i3) throws IOException {
        int iAsInterface;
        if (this.ICustomTabsCallbackStub + ((i3 - i2) * 6) > this.onActivityLayout) {
            extraCallback();
        }
        int iIAuthTabCallback = this.ICustomTabsCallbackStub;
        byte[] bArr = this.onPostMessage;
        int[] iArr = this.readTypedObject;
        int i4 = this.extraCallback;
        if (i4 <= 0) {
            i4 = RtpPacket.MAX_SEQUENCE_NUMBER;
        }
        performStart performstart = this.ICustomTabsCallback;
        while (i2 < i3) {
            int i5 = i2 + 1;
            char c = cArr[i2];
            if (c <= 127) {
                int i6 = iArr[c];
                if (i6 == 0) {
                    iAsInterface = iIAuthTabCallback + 1;
                    bArr[iIAuthTabCallback] = (byte) c;
                } else if (i6 > 0) {
                    bArr[iIAuthTabCallback] = 92;
                    bArr[iIAuthTabCallback + 1] = (byte) i6;
                    iIAuthTabCallback += 2;
                    i2 = i5;
                } else if (i6 == -2) {
                    hasOptionsMenu hasoptionsmenuIAuthTabCallback = performstart.IAuthTabCallback(c);
                    if (hasoptionsmenuIAuthTabCallback == null) {
                        IAuthTabCallback("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c) + ", although was supposed to have one");
                    }
                    iAsInterface = onWarmupCompleted(bArr, iIAuthTabCallback, hasoptionsmenuIAuthTabCallback, i3 - i5);
                } else {
                    iAsInterface = asInterface(c, iIAuthTabCallback);
                }
            } else if (c > i4) {
                iAsInterface = asInterface(c, iIAuthTabCallback);
            } else {
                hasOptionsMenu hasoptionsmenuIAuthTabCallback2 = performstart.IAuthTabCallback(c);
                if (hasoptionsmenuIAuthTabCallback2 != null) {
                    iAsInterface = onWarmupCompleted(bArr, iIAuthTabCallback, hasoptionsmenuIAuthTabCallback2, i3 - i5);
                } else if (c <= 2047) {
                    bArr[iIAuthTabCallback] = (byte) ((c >> 6) | 192);
                    iAsInterface = iIAuthTabCallback + 2;
                    bArr[iIAuthTabCallback + 1] = (byte) ((c & '?') | 128);
                } else if (onWarmupCompleted((int) c) && getView.IAuthTabCallback.COMBINE_UNICODE_SURROGATES_IN_UTF8.enabledIn(this.IAuthTabCallbackDefault) && i5 < i3) {
                    i2 += 2;
                    iIAuthTabCallback = IAuthTabCallback(c, cArr[i5], iIAuthTabCallback);
                } else {
                    iAsInterface = IAuthTabCallbackStub(c, iIAuthTabCallback);
                }
            }
            iIAuthTabCallback = iAsInterface;
            i2 = i5;
        }
        this.ICustomTabsCallbackStub = iIAuthTabCallback;
    }

    private final void onExtraCallback(String str, int i2, int i3) throws IOException {
        int iAsInterface;
        if (this.ICustomTabsCallbackStub + ((i3 - i2) * 6) > this.onActivityLayout) {
            extraCallback();
        }
        int iIAuthTabCallback = this.ICustomTabsCallbackStub;
        byte[] bArr = this.onPostMessage;
        int[] iArr = this.readTypedObject;
        int i4 = this.extraCallback;
        if (i4 <= 0) {
            i4 = RtpPacket.MAX_SEQUENCE_NUMBER;
        }
        performStart performstart = this.ICustomTabsCallback;
        while (i2 < i3) {
            int i5 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 127) {
                int i6 = iArr[cCharAt];
                if (i6 == 0) {
                    iAsInterface = iIAuthTabCallback + 1;
                    bArr[iIAuthTabCallback] = (byte) cCharAt;
                } else if (i6 > 0) {
                    bArr[iIAuthTabCallback] = 92;
                    bArr[iIAuthTabCallback + 1] = (byte) i6;
                    iIAuthTabCallback += 2;
                    i2 = i5;
                } else if (i6 == -2) {
                    hasOptionsMenu hasoptionsmenuIAuthTabCallback = performstart.IAuthTabCallback(cCharAt);
                    if (hasoptionsmenuIAuthTabCallback == null) {
                        IAuthTabCallback("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(cCharAt) + ", although was supposed to have one");
                    }
                    iAsInterface = onWarmupCompleted(bArr, iIAuthTabCallback, hasoptionsmenuIAuthTabCallback, i3 - i5);
                } else {
                    iAsInterface = asInterface(cCharAt, iIAuthTabCallback);
                }
            } else if (cCharAt > i4) {
                iAsInterface = asInterface(cCharAt, iIAuthTabCallback);
            } else {
                hasOptionsMenu hasoptionsmenuIAuthTabCallback2 = performstart.IAuthTabCallback(cCharAt);
                if (hasoptionsmenuIAuthTabCallback2 != null) {
                    iAsInterface = onWarmupCompleted(bArr, iIAuthTabCallback, hasoptionsmenuIAuthTabCallback2, i3 - i5);
                } else if (cCharAt <= 2047) {
                    bArr[iIAuthTabCallback] = (byte) ((cCharAt >> 6) | 192);
                    iAsInterface = iIAuthTabCallback + 2;
                    bArr[iIAuthTabCallback + 1] = (byte) ((cCharAt & '?') | 128);
                } else if (onWarmupCompleted((int) cCharAt) && getView.IAuthTabCallback.COMBINE_UNICODE_SURROGATES_IN_UTF8.enabledIn(this.IAuthTabCallbackDefault) && i5 < i3) {
                    i2 += 2;
                    iIAuthTabCallback = IAuthTabCallback(cCharAt, str.charAt(i5), iIAuthTabCallback);
                } else {
                    iAsInterface = IAuthTabCallbackStub(cCharAt, iIAuthTabCallback);
                }
            }
            iIAuthTabCallback = iAsInterface;
            i2 = i5;
        }
        this.ICustomTabsCallbackStub = iIAuthTabCallback;
    }

    private final int onWarmupCompleted(byte[] bArr, int i2, hasOptionsMenu hasoptionsmenu, int i3) throws IOException {
        byte[] bArrOnNavigationEvent = hasoptionsmenu.onNavigationEvent();
        int length = bArrOnNavigationEvent.length;
        if (length > 6) {
            return onWarmupCompleted(bArr, i2, this.onActivityLayout, bArrOnNavigationEvent, i3);
        }
        System.arraycopy(bArrOnNavigationEvent, 0, bArr, i2, length);
        return i2 + length;
    }

    private final int onWarmupCompleted(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws IOException {
        int length = bArr2.length;
        if (i2 + length > i3) {
            this.ICustomTabsCallbackStub = i2;
            extraCallback();
            i2 = this.ICustomTabsCallbackStub;
            if (length > bArr.length) {
                this.ICustomTabsCallbackStubProxy.write(bArr2, 0, length);
                return i2;
            }
        }
        System.arraycopy(bArr2, 0, bArr, i2, length);
        int i5 = i2 + length;
        if ((i4 * 6) + i5 <= i3) {
            return i5;
        }
        this.ICustomTabsCallbackStub = i5;
        extraCallback();
        return this.ICustomTabsCallbackStub;
    }

    protected final void onExtraCallbackWithResult(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int iOnNavigationEvent;
        int i5 = this.onActivityLayout - 6;
        int iIAuthTabCallback = getpostonviewcreatedalpha.IAuthTabCallback();
        loop0: while (true) {
            int i6 = iIAuthTabCallback >> 2;
            while (i2 <= i3 - 3) {
                if (this.ICustomTabsCallbackStub > i5) {
                    extraCallback();
                }
                byte b = bArr[i2];
                byte b2 = bArr[i2 + 1];
                i4 = i2 + 3;
                iOnNavigationEvent = getpostonviewcreatedalpha.onNavigationEvent((bArr[i2 + 2] & 255) | (((b << 8) | (b2 & 255)) << 8), this.onPostMessage, this.ICustomTabsCallbackStub);
                this.ICustomTabsCallbackStub = iOnNavigationEvent;
                i6--;
                if (i6 <= 0) {
                    break;
                } else {
                    i2 = i4;
                }
            }
            byte[] bArr2 = this.onPostMessage;
            bArr2[iOnNavigationEvent] = 92;
            this.ICustomTabsCallbackStub = iOnNavigationEvent + 2;
            bArr2[iOnNavigationEvent + 1] = 110;
            iIAuthTabCallback = getpostonviewcreatedalpha.IAuthTabCallback();
            i2 = i4;
        }
        int i7 = i3 - i2;
        if (i7 > 0) {
            if (this.ICustomTabsCallbackStub > i5) {
                extraCallback();
            }
            int i8 = bArr[i2] << 16;
            if (i7 == 2) {
                i8 |= (bArr[i2 + 1] & 255) << 8;
            }
            this.ICustomTabsCallbackStub = getpostonviewcreatedalpha.onExtraCallback(i8, i7, this.onPostMessage, this.ICustomTabsCallbackStub);
        }
    }

    protected final int onExtraCallbackWithResult(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, InputStream inputStream, byte[] bArr, int i2) throws IOException {
        int iOnWarmupCompleted;
        int i3 = this.onActivityLayout - 6;
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
            if (this.ICustomTabsCallbackStub > i3) {
                extraCallback();
            }
            int i8 = i7 + 3;
            i6 -= 3;
            int iOnNavigationEvent = getpostonviewcreatedalpha.onNavigationEvent((((bArr[i7] << 8) | (bArr[i7 + 1] & 255)) << 8) | (bArr[i7 + 2] & 255), this.onPostMessage, this.ICustomTabsCallbackStub);
            this.ICustomTabsCallbackStub = iOnNavigationEvent;
            iIAuthTabCallback--;
            if (iIAuthTabCallback <= 0) {
                byte[] bArr2 = this.onPostMessage;
                bArr2[iOnNavigationEvent] = 92;
                this.ICustomTabsCallbackStub = iOnNavigationEvent + 2;
                bArr2[iOnNavigationEvent + 1] = 110;
                iIAuthTabCallback = getpostonviewcreatedalpha.IAuthTabCallback() >> 2;
            }
            i7 = i8;
        }
        if (i6 <= 0 || (iOnWarmupCompleted = onWarmupCompleted(inputStream, bArr, i7, iOnWarmupCompleted2, i6)) <= 0) {
            return i6;
        }
        if (this.ICustomTabsCallbackStub > i3) {
            extraCallback();
        }
        int i9 = bArr[0] << 16;
        if (1 < iOnWarmupCompleted) {
            i9 |= (bArr[1] & 255) << 8;
        } else {
            i4 = 1;
        }
        this.ICustomTabsCallbackStub = getpostonviewcreatedalpha.onExtraCallback(i9, i4, this.onPostMessage, this.ICustomTabsCallbackStub);
        return i6 - i4;
    }

    protected final int onWarmupCompleted(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, InputStream inputStream, byte[] bArr) throws IOException {
        int i2 = this.onActivityLayout - 6;
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
            if (this.ICustomTabsCallbackStub > i2) {
                extraCallback();
            }
            int i7 = i5 + 3;
            i6 += 3;
            int iOnNavigationEvent = getpostonviewcreatedalpha.onNavigationEvent((((bArr[i5] << 8) | (bArr[i5 + 1] & 255)) << 8) | (bArr[i5 + 2] & 255), this.onPostMessage, this.ICustomTabsCallbackStub);
            this.ICustomTabsCallbackStub = iOnNavigationEvent;
            iIAuthTabCallback--;
            if (iIAuthTabCallback <= 0) {
                byte[] bArr2 = this.onPostMessage;
                bArr2[iOnNavigationEvent] = 92;
                this.ICustomTabsCallbackStub = iOnNavigationEvent + 2;
                bArr2[iOnNavigationEvent + 1] = 110;
                iIAuthTabCallback = getpostonviewcreatedalpha.IAuthTabCallback() >> 2;
            }
            i5 = i7;
        }
        if (iOnWarmupCompleted <= 0) {
            return i6;
        }
        if (this.ICustomTabsCallbackStub > i2) {
            extraCallback();
        }
        int i8 = bArr[0] << 16;
        if (1 < iOnWarmupCompleted) {
            i8 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        int i9 = i6 + i3;
        this.ICustomTabsCallbackStub = getpostonviewcreatedalpha.onExtraCallback(i8, i3, this.onPostMessage, this.ICustomTabsCallbackStub);
        return i9;
    }

    private final int onWarmupCompleted(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) throws IOException {
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

    private final int onExtraCallbackWithResult(int i2, char[] cArr, int i3, int i4) throws IOException {
        if (i2 >= 55296 && i2 <= 57343) {
            if (i3 >= i4 || cArr == null) {
                IAuthTabCallback(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i2)));
            } else {
                onExtraCallback(i2, cArr[i3]);
            }
            return i3 + 1;
        }
        byte[] bArr = this.onPostMessage;
        int i5 = this.ICustomTabsCallbackStub;
        bArr[i5] = (byte) ((i2 >> 12) | 224);
        bArr[i5 + 1] = (byte) (((i2 >> 6) & 63) | 128);
        this.ICustomTabsCallbackStub = i5 + 3;
        bArr[i5 + 2] = (byte) ((i2 & 63) | 128);
        return i3;
    }

    protected final void onExtraCallback(int i2, int i3) throws IOException {
        int iOnWarmupCompleted = onWarmupCompleted(i2, i3);
        if (this.ICustomTabsCallbackStub + 4 > this.onActivityLayout) {
            extraCallback();
        }
        byte[] bArr = this.onPostMessage;
        int i4 = this.ICustomTabsCallbackStub;
        bArr[i4] = (byte) ((iOnWarmupCompleted >> 18) | 240);
        bArr[i4 + 1] = (byte) (((iOnWarmupCompleted >> 12) & 63) | 128);
        bArr[i4 + 2] = (byte) (((iOnWarmupCompleted >> 6) & 63) | 128);
        this.ICustomTabsCallbackStub = i4 + 4;
        bArr[i4 + 3] = (byte) ((iOnWarmupCompleted & 63) | 128);
    }

    private int IAuthTabCallback(char c, char c2, int i2) {
        int i3 = ((c & 1023) << 10) + 65536 + (c2 & 1023);
        byte[] bArr = this.onPostMessage;
        bArr[i2] = (byte) (((i3 >> 18) & 7) + 240);
        bArr[i2 + 1] = (byte) (((i3 >> 12) & 63) + 128);
        bArr[i2 + 2] = (byte) (((i3 >> 6) & 63) + 128);
        bArr[i2 + 3] = (byte) ((i3 & 63) + 128);
        return i2 + 4;
    }

    private final int IAuthTabCallbackStub(int i2, int i3) throws IOException {
        byte[] bArrExtraCallbackWithResult = extraCallbackWithResult();
        byte[] bArr = this.onPostMessage;
        if (i2 >= 55296 && i2 <= 57343) {
            bArr[i3] = 92;
            bArr[i3 + 1] = 117;
            bArr[i3 + 2] = bArrExtraCallbackWithResult[(i2 >> 12) & 15];
            bArr[i3 + 3] = bArrExtraCallbackWithResult[(i2 >> 8) & 15];
            bArr[i3 + 4] = bArrExtraCallbackWithResult[(i2 >> 4) & 15];
            bArr[i3 + 5] = bArrExtraCallbackWithResult[i2 & 15];
            return i3 + 6;
        }
        bArr[i3] = (byte) ((i2 >> 12) | 224);
        bArr[i3 + 1] = (byte) (((i2 >> 6) & 63) | 128);
        bArr[i3 + 2] = (byte) ((i2 & 63) | 128);
        return i3 + 3;
    }

    private final void writeTypedObject() throws IOException {
        if (this.ICustomTabsCallbackStub + 4 >= this.onActivityLayout) {
            extraCallback();
        }
        System.arraycopy(ICustomTabsService, 0, this.onPostMessage, this.ICustomTabsCallbackStub, 4);
        this.ICustomTabsCallbackStub += 4;
    }

    private int asInterface(int i2, int i3) throws IOException {
        int i4;
        byte[] bArr = this.onPostMessage;
        byte[] bArrExtraCallbackWithResult = extraCallbackWithResult();
        bArr[i3] = 92;
        int i5 = i3 + 2;
        bArr[i3 + 1] = 117;
        if (i2 > 255) {
            int i6 = i2 >> 8;
            bArr[i5] = bArrExtraCallbackWithResult[(i6 & OggPageHeader.MAX_SEGMENT_COUNT) >> 4];
            i4 = i3 + 4;
            bArr[i3 + 3] = bArrExtraCallbackWithResult[i6 & 15];
            i2 &= OggPageHeader.MAX_SEGMENT_COUNT;
        } else {
            bArr[i5] = 48;
            i4 = i3 + 4;
            bArr[i3 + 3] = 48;
        }
        bArr[i4] = bArrExtraCallbackWithResult[i2 >> 4];
        bArr[i4 + 1] = bArrExtraCallbackWithResult[i2 & 15];
        return i4 + 2;
    }

    protected final void extraCallback() throws IOException {
        int i2 = this.ICustomTabsCallbackStub;
        if (i2 > 0) {
            this.ICustomTabsCallbackStub = 0;
            this.ICustomTabsCallbackStubProxy.write(this.onPostMessage, 0, i2);
        }
    }

    private byte[] extraCallbackWithResult() {
        return this.access100 ? extraCommand : ICustomTabsCallback_Parcel;
    }
}

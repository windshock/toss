package o;

import java.nio.ByteBuffer;
import o.initSingleCardInThreeCardStyle;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setDownloadButtonData extends initSingleCardInThreeCardStyle {
    private final dv81 onExtraCallbackWithResult;

    public setDownloadButtonData(ByteBuffer byteBuffer) {
        this(new sya21(new jc5((ByteBuffer) pmi10.onExtraCallbackWithResult("byteBuffer", byteBuffer))));
    }

    public setDownloadButtonData(dv81 dv81Var) {
        if (dv81Var == null) {
            throw new IllegalArgumentException("bsonInput is null");
        }
        this.onExtraCallbackWithResult = dv81Var;
        onNavigationEvent(new onWarmupCompleted(null, RFEndCardBackUpLayoutycx.TOP_LEVEL, 0, 0));
    }

    @Override // o.initSingleCardInThreeCardStyle, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    public dv81 access200() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.initSingleCardInThreeCardStyle, o.htfycx
    public t_ ICustomTabsCallbackStub() {
        if (onActivityResized()) {
            throw new IllegalStateException("BSONBinaryWriter");
        }
        if (onPostMessage() == initSingleCardInThreeCardStyle.onExtraCallback.INITIAL || onPostMessage() == initSingleCardInThreeCardStyle.onExtraCallback.DONE || onPostMessage() == initSingleCardInThreeCardStyle.onExtraCallback.SCOPE_DOCUMENT) {
            onExtraCallback(t_.DOCUMENT);
            onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.VALUE);
            return onActivityLayout();
        }
        initSingleCardInThreeCardStyle.onExtraCallback onextracallbackOnPostMessage = onPostMessage();
        initSingleCardInThreeCardStyle.onExtraCallback onextracallback = initSingleCardInThreeCardStyle.onExtraCallback.TYPE;
        if (onextracallbackOnPostMessage != onextracallback) {
            onExtraCallbackWithResult("ReadBSONType", onextracallback);
        }
        byte bIAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback();
        t_ t_VarFindByValue = t_.findByValue(bIAuthTabCallback);
        if (t_VarFindByValue == null) {
            throw new ycxsya1(String.format("Detected unknown BSON type \"\\x%x\" for fieldname \"%s\". Are you using the latest driver version?", Byte.valueOf(bIAuthTabCallback), this.onExtraCallbackWithResult.onWarmupCompleted()));
        }
        onExtraCallback(t_VarFindByValue);
        t_ t_VarOnActivityLayout = onActivityLayout();
        t_ t_Var = t_.END_OF_DOCUMENT;
        if (t_VarOnActivityLayout == t_Var) {
            int i = AnonymousClass4.onWarmupCompleted[onMessageChannelReady().onNavigationEvent().ordinal()];
            if (i == 1) {
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.END_OF_ARRAY);
                return t_Var;
            }
            if (i == 2 || i == 3) {
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.END_OF_DOCUMENT);
                return t_Var;
            }
            throw new ycxsya1(String.format("BSONType EndOfDocument is not valid when ContextType is %s.", onMessageChannelReady().onNavigationEvent()));
        }
        int i2 = AnonymousClass4.onWarmupCompleted[onMessageChannelReady().onNavigationEvent().ordinal()];
        if (i2 == 1) {
            this.onExtraCallbackWithResult.asInterface();
            onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.VALUE);
        } else if (i2 == 2 || i2 == 3) {
            IAuthTabCallback(this.onExtraCallbackWithResult.onWarmupCompleted());
            onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.NAME);
        } else {
            throw new initSingleCardInTwoCardStyle("Unexpected ContextType.");
        }
        return onActivityLayout();
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected initOneSlotMultipleAdsLayoutLandscape onWarmupCompleted() {
        int iWriteTypedList = writeTypedList();
        byte bIAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback();
        if (bIAuthTabCallback == initViewsForUGen.OLD_BINARY.getValue() && this.onExtraCallbackWithResult.onNavigationEvent() != iWriteTypedList - 4) {
            throw new ycxsya1("Binary sub type OldBinary has inconsistent sizes");
        }
        byte[] bArr = new byte[iWriteTypedList];
        this.onExtraCallbackWithResult.onWarmupCompleted(bArr);
        return new initOneSlotMultipleAdsLayoutLandscape(bIAuthTabCallback, bArr);
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected boolean onExtraCallback() {
        byte bIAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback();
        if (bIAuthTabCallback == 0 || bIAuthTabCallback == 1) {
            return bIAuthTabCallback == 1;
        }
        throw new ycxsya1(String.format("Expected a boolean value but found %d", Byte.valueOf(bIAuthTabCallback)));
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected long onNavigationEvent() {
        return this.onExtraCallbackWithResult.IAuthTabCallbackStub();
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected double asBinder() {
        return this.onExtraCallbackWithResult.onExtraCallback();
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected int onTransact() {
        return this.onExtraCallbackWithResult.onNavigationEvent();
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected long IAuthTabCallbackStub() {
        return this.onExtraCallbackWithResult.IAuthTabCallbackStub();
    }

    @Override // o.initSingleCardInThreeCardStyle
    public Decimal128 onExtraCallbackWithResult() {
        return Decimal128.fromIEEE754BIDEncoding(this.onExtraCallbackWithResult.IAuthTabCallbackStub(), this.onExtraCallbackWithResult.IAuthTabCallbackStub());
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected String getInterfaceDescriptor() {
        return this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected String access000() {
        onNavigationEvent(new onWarmupCompleted(onMessageChannelReady(), RFEndCardBackUpLayoutycx.JAVASCRIPT_WITH_SCOPE, this.onExtraCallbackWithResult.onExtraCallbackWithResult(), writeTypedList()));
        return this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected ObjectId IAuthTabCallback_Parcel() {
        return this.onExtraCallbackWithResult.onTransact();
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected ea41 access100() {
        return new ea41(this.onExtraCallbackWithResult.onWarmupCompleted(), this.onExtraCallbackWithResult.onWarmupCompleted());
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected RFEndCardBackUpLayout2 IAuthTabCallback() {
        return new RFEndCardBackUpLayout2(this.onExtraCallbackWithResult.IAuthTabCallbackDefault(), this.onExtraCallbackWithResult.onTransact());
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected String readTypedObject() {
        return this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected String extraCallback() {
        return this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected p_ extraCallbackWithResult() {
        return new p_(this.onExtraCallbackWithResult.IAuthTabCallbackStub());
    }

    @Override // o.initSingleCardInThreeCardStyle
    public void IAuthTabCallbackStubProxy() {
        onNavigationEvent(new onWarmupCompleted(onMessageChannelReady(), RFEndCardBackUpLayoutycx.ARRAY, this.onExtraCallbackWithResult.onExtraCallbackWithResult(), writeTypedList()));
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected void ICustomTabsCallback() {
        onNavigationEvent(new onWarmupCompleted(onMessageChannelReady(), onPostMessage() == initSingleCardInThreeCardStyle.onExtraCallback.SCOPE_DOCUMENT ? RFEndCardBackUpLayoutycx.SCOPE_DOCUMENT : RFEndCardBackUpLayoutycx.DOCUMENT, this.onExtraCallbackWithResult.onExtraCallbackWithResult(), writeTypedList()));
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected void IAuthTabCallbackDefault() {
        onNavigationEvent(onMessageChannelReady().IAuthTabCallback(this.onExtraCallbackWithResult.onExtraCallbackWithResult()));
    }

    @Override // o.initSingleCardInThreeCardStyle
    protected void asInterface() {
        onNavigationEvent(onMessageChannelReady().IAuthTabCallback(this.onExtraCallbackWithResult.onExtraCallbackWithResult()));
        if (onMessageChannelReady().onNavigationEvent() == RFEndCardBackUpLayoutycx.JAVASCRIPT_WITH_SCOPE) {
            onNavigationEvent(onMessageChannelReady().IAuthTabCallback(this.onExtraCallbackWithResult.onExtraCallbackWithResult()));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.initSingleCardInThreeCardStyle
    protected void writeTypedObject() {
        int iWriteTypedList;
        if (onActivityResized()) {
            throw new IllegalStateException("BSONBinaryWriter");
        }
        initSingleCardInThreeCardStyle.onExtraCallback onextracallbackOnPostMessage = onPostMessage();
        initSingleCardInThreeCardStyle.onExtraCallback onextracallback = initSingleCardInThreeCardStyle.onExtraCallback.VALUE;
        if (onextracallbackOnPostMessage != onextracallback) {
            onExtraCallbackWithResult("skipValue", onextracallback);
        }
        int iWriteTypedList2 = 12;
        switch (AnonymousClass4.IAuthTabCallback[onActivityLayout().ordinal()]) {
            case 1:
                iWriteTypedList = writeTypedList();
                iWriteTypedList2 = iWriteTypedList - 4;
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            case 2:
                iWriteTypedList2 = writeTypedList() + 1;
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            case 3:
                iWriteTypedList2 = 1;
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            case 4:
            case 6:
            case 8:
            case 19:
                iWriteTypedList2 = 8;
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            case 5:
                iWriteTypedList = writeTypedList();
                iWriteTypedList2 = iWriteTypedList - 4;
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            case 7:
                iWriteTypedList2 = 4;
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            case 9:
                iWriteTypedList2 = 16;
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            case 10:
                iWriteTypedList2 = writeTypedList();
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            case 11:
                iWriteTypedList = writeTypedList();
                iWriteTypedList2 = iWriteTypedList - 4;
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            case 12:
            case 13:
            case 14:
            case 20:
                iWriteTypedList2 = 0;
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            case 15:
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            case 16:
                this.onExtraCallbackWithResult.asInterface();
                this.onExtraCallbackWithResult.asInterface();
                iWriteTypedList2 = 0;
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            case 17:
                iWriteTypedList2 = writeTypedList();
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            case 18:
                iWriteTypedList2 = writeTypedList();
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            case 21:
                iWriteTypedList2 = 12 + writeTypedList();
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(iWriteTypedList2);
                onWarmupCompleted(initSingleCardInThreeCardStyle.onExtraCallback.TYPE);
                return;
            default:
                throw new initSingleCardInTwoCardStyle("Unexpected BSON type: " + onActivityLayout());
        }
    }

    /* renamed from: o.setDownloadButtonData$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] IAuthTabCallback;
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[t_.values().length];
            IAuthTabCallback = iArr;
            try {
                iArr[t_.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IAuthTabCallback[t_.BINARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IAuthTabCallback[t_.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IAuthTabCallback[t_.DATE_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IAuthTabCallback[t_.DOCUMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IAuthTabCallback[t_.DOUBLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                IAuthTabCallback[t_.INT32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                IAuthTabCallback[t_.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                IAuthTabCallback[t_.DECIMAL128.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                IAuthTabCallback[t_.JAVASCRIPT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                IAuthTabCallback[t_.JAVASCRIPT_WITH_SCOPE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                IAuthTabCallback[t_.MAX_KEY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                IAuthTabCallback[t_.MIN_KEY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                IAuthTabCallback[t_.NULL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                IAuthTabCallback[t_.OBJECT_ID.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                IAuthTabCallback[t_.REGULAR_EXPRESSION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                IAuthTabCallback[t_.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                IAuthTabCallback[t_.SYMBOL.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                IAuthTabCallback[t_.TIMESTAMP.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                IAuthTabCallback[t_.UNDEFINED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                IAuthTabCallback[t_.DB_POINTER.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            int[] iArr2 = new int[RFEndCardBackUpLayoutycx.values().length];
            onWarmupCompleted = iArr2;
            try {
                iArr2[RFEndCardBackUpLayoutycx.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                onWarmupCompleted[RFEndCardBackUpLayoutycx.DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                onWarmupCompleted[RFEndCardBackUpLayoutycx.SCOPE_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    private int writeTypedList() {
        int iOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent();
        if (iOnNavigationEvent >= 0) {
            return iOnNavigationEvent;
        }
        throw new ycxsya1(String.format("Size %s is not valid because it is negative.", Integer.valueOf(iOnNavigationEvent)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.initSingleCardInThreeCardStyle
    /* renamed from: ICustomTabsServiceStubProxy, reason: merged with bridge method [inline-methods] */
    public onWarmupCompleted onMessageChannelReady() {
        return (onWarmupCompleted) super.onMessageChannelReady();
    }

    protected class onWarmupCompleted extends initSingleCardInThreeCardStyle.IAuthTabCallback {
        private final int onExtraCallback;
        private final int onExtraCallbackWithResult;

        onWarmupCompleted(onWarmupCompleted onwarmupcompleted, RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycx, int i, int i2) {
            super(onwarmupcompleted, rFEndCardBackUpLayoutycx);
            this.onExtraCallbackWithResult = i;
            this.onExtraCallback = i2;
        }

        onWarmupCompleted IAuthTabCallback(int i) {
            int i2 = i - this.onExtraCallbackWithResult;
            int i3 = this.onExtraCallback;
            if (i2 != i3) {
                throw new ycxsya1(String.format("Expected size to be %d, not %d.", Integer.valueOf(i3), Integer.valueOf(i2)));
            }
            return onWarmupCompleted();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.initSingleCardInThreeCardStyle.IAuthTabCallback
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public onWarmupCompleted onWarmupCompleted() {
            return (onWarmupCompleted) super.onWarmupCompleted();
        }
    }
}

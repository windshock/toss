package o;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.vbt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getColumnNames extends vy implements setAnimationType {
    private onExtraCallbackWithResult IAuthTabCallback;
    private final cypher4Encrypt IAuthTabCallbackDefault;
    private final wie2 IAuthTabCallbackStub;
    private final setRecycler onExtraCallback;
    private final changeVideoState onExtraCallbackWithResult;
    public final getBeforeTimestamp onNavigationEvent;
    private final hfycx onTransact;
    private int onWarmupCompleted;

    public final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[cypher4Encrypt.values().length];
            try {
                iArr[cypher4Encrypt.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cypher4Encrypt.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cypher4Encrypt.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[cypher4Encrypt.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public Void onExtraCallback() {
        return null;
    }

    @Override // o.setAnimationType
    public final wie2 access000() {
        return this.IAuthTabCallbackStub;
    }

    public getColumnNames(@NotNull wie2 wie2Var, @NotNull cypher4Encrypt cypher4encrypt, @NotNull getBeforeTimestamp getbeforetimestamp, @NotNull SerialDescriptor serialDescriptor, @Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(cypher4encrypt, "");
        Intrinsics.checkNotNullParameter(getbeforetimestamp, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        this.IAuthTabCallbackStub = wie2Var;
        this.IAuthTabCallbackDefault = cypher4encrypt;
        this.onNavigationEvent = getbeforetimestamp;
        this.onTransact = wie2Var.onExtraCallback();
        this.onWarmupCompleted = -1;
        this.IAuthTabCallback = onextracallbackwithresult;
        changeVideoState changevideostateIAuthTabCallback = wie2Var.IAuthTabCallback();
        this.onExtraCallbackWithResult = changevideostateIAuthTabCallback;
        this.onExtraCallback = changevideostateIAuthTabCallback.asInterface() ? null : new setRecycler(serialDescriptor);
    }

    public static final class onExtraCallbackWithResult {
        public String onExtraCallback;

        public onExtraCallbackWithResult(@Nullable String str) {
            this.onExtraCallback = str;
        }
    }

    private final boolean onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, String str) {
        if (onextracallbackwithresult == null || !Intrinsics.areEqual(onextracallbackwithresult.onExtraCallback, str)) {
            return false;
        }
        onextracallbackwithresult.onExtraCallback = null;
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder, o.yw
    public hfycx IAuthTabCallback() {
        return this.onTransact;
    }

    @Override // o.setAnimationType
    public JsonElement onWarmupCompleted() {
        return new setTouchListenerProxy(this.IAuthTabCallbackStub.IAuthTabCallback(), this.onNavigationEvent).onNavigationEvent();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016c  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> T onWarmupCompleted(@NotNull jp<? extends T> jpVar) {
        String message;
        JsonPrimitive jsonPrimitiveOnNavigationEvent;
        Intrinsics.checkNotNullParameter(jpVar, "");
        try {
        } catch (MissingFieldException e) {
            message = e.getMessage();
            Intrinsics.checkNotNull(message);
            if (!StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "at path", false, 2, (Object) null)) {
            }
        }
        if ((jpVar instanceof xf) && !this.IAuthTabCallbackStub.IAuthTabCallback().writeTypedObject()) {
            String strIAuthTabCallback = setRecycled.IAuthTabCallback(((xf) jpVar).getDescriptor(), this.IAuthTabCallbackStub);
            String strIAuthTabCallback2 = this.onNavigationEvent.IAuthTabCallback(strIAuthTabCallback, ((Boolean) changeVideoState.onExtraCallback(-1913675560, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1913675562, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this.onExtraCallbackWithResult}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).booleanValue());
            if (strIAuthTabCallback2 != null) {
                try {
                    jp jpVarOnExtraCallback = mue.onExtraCallback((xf) jpVar, this, strIAuthTabCallback2);
                    Intrinsics.checkNotNull(jpVarOnExtraCallback, "");
                    this.IAuthTabCallback = new onExtraCallbackWithResult(strIAuthTabCallback);
                    return (T) jpVarOnExtraCallback.deserialize(this);
                } catch (qn e2) {
                    String message2 = e2.getMessage();
                    Intrinsics.checkNotNull(message2);
                    String strRemoveSuffix = StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.substringBefore$default(message2, '\n', (String) null, 2, (Object) null), (CharSequence) ".");
                    String message3 = e2.getMessage();
                    Intrinsics.checkNotNull(message3);
                    getBeforeTimestamp.onExtraCallbackWithResult(this.onNavigationEvent, strRemoveSuffix, 0, StringsKt__StringsKt.substringAfter(message3, '\n', _UrlKt.FRAGMENT_ENCODE_SET), 2, null);
                    throw new setWrite();
                }
            }
            if (access000().IAuthTabCallback().writeTypedObject()) {
                return jpVar.deserialize(this);
            }
            String strIAuthTabCallback3 = setRecycled.IAuthTabCallback(((xf) jpVar).getDescriptor(), access000());
            JsonElement jsonElementOnWarmupCompleted = onWarmupCompleted();
            String strOnExtraCallbackWithResult = ((xf) jpVar).getDescriptor().onExtraCallbackWithResult();
            if (jsonElementOnWarmupCompleted instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) jsonElementOnWarmupCompleted;
                JsonElement jsonElement = (JsonElement) jsonObject.get(strIAuthTabCallback3);
                try {
                    jp jpVarOnExtraCallback2 = mue.onExtraCallback((xf) jpVar, this, (jsonElement == null || (jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonElement)) == null) ? null : initRenderFinish.onNavigationEvent(jsonPrimitiveOnNavigationEvent));
                    Intrinsics.checkNotNull(jpVarOnExtraCallback2, "");
                    return (T) cypher4Decrypt.onNavigationEvent(access000(), strIAuthTabCallback3, jsonObject, jpVarOnExtraCallback2);
                } catch (qn e3) {
                    String message4 = e3.getMessage();
                    Intrinsics.checkNotNull(message4);
                    throw setTouchStateListener.onExtraCallbackWithResult(-1, message4, jsonObject.toString());
                }
            }
            throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementOnWarmupCompleted.getClass()).getSimpleName() + " as the serialized body of " + strOnExtraCallbackWithResult + " at element: " + this.onNavigationEvent.IAuthTabCallback.onExtraCallback(), jsonElementOnWarmupCompleted.toString());
            message = e.getMessage();
            Intrinsics.checkNotNull(message);
            if (!StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "at path", false, 2, (Object) null)) {
                throw e;
            }
            throw new MissingFieldException(e.onWarmupCompleted(), e.getMessage() + " at path: " + this.onNavigationEvent.IAuthTabCallback.onExtraCallback(), e);
        }
        return jpVar.deserialize(this);
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public yw onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        cypher4Encrypt cypher4encryptIAuthTabCallback = cypher4EncryptWithNoWrapBase64.IAuthTabCallback(this.IAuthTabCallbackStub, serialDescriptor);
        this.onNavigationEvent.IAuthTabCallback.onExtraCallback(serialDescriptor);
        this.onNavigationEvent.onExtraCallback(cypher4encryptIAuthTabCallback.begin);
        getInterfaceDescriptor();
        int i = onExtraCallback.onExtraCallbackWithResult[cypher4encryptIAuthTabCallback.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new getColumnNames(this.IAuthTabCallbackStub, cypher4encryptIAuthTabCallback, this.onNavigationEvent, serialDescriptor, this.IAuthTabCallback);
        }
        return (this.IAuthTabCallbackDefault == cypher4encryptIAuthTabCallback && this.IAuthTabCallbackStub.IAuthTabCallback().asInterface()) ? this : new getColumnNames(this.IAuthTabCallbackStub, cypher4encryptIAuthTabCallback, this.onNavigationEvent, serialDescriptor, this.IAuthTabCallback);
    }

    @Override // o.vy, o.yw
    public void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (serialDescriptor.onExtraCallback() == 0 && setShakeValue.onExtraCallback(serialDescriptor, this.IAuthTabCallbackStub)) {
            asInterface(serialDescriptor);
        }
        if (this.onNavigationEvent.extraCallbackWithResult() && !this.IAuthTabCallbackStub.IAuthTabCallback().onNavigationEvent()) {
            setTouchStateListener.onNavigationEvent(this.onNavigationEvent, _UrlKt.FRAGMENT_ENCODE_SET);
            throw new setWrite();
        }
        this.onNavigationEvent.onExtraCallback(this.IAuthTabCallbackDefault.end);
        this.onNavigationEvent.IAuthTabCallback.onExtraCallbackWithResult();
    }

    private final void asInterface(SerialDescriptor serialDescriptor) {
        while (onNavigationEvent(serialDescriptor) != -1) {
        }
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public boolean onNavigationEvent() {
        setRecycler setrecycler = this.onExtraCallback;
        return (setrecycler == null || !setrecycler.onWarmupCompleted()) && !getBeforeTimestamp.onExtraCallback(this.onNavigationEvent, false, 1, null);
    }

    private final void getInterfaceDescriptor() {
        if (this.onNavigationEvent.IAuthTabCallback_Parcel() != 4) {
            return;
        }
        getBeforeTimestamp.onExtraCallbackWithResult(this.onNavigationEvent, "Unexpected leading comma", 0, null, 6, null);
        throw new setWrite();
    }

    @Override // o.vy, o.yw
    public <T> T onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull jp<? extends T> jpVar, @Nullable T t) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(jpVar, "");
        boolean z = this.IAuthTabCallbackDefault == cypher4Encrypt.MAP && (i & 1) == 0;
        if (z) {
            this.onNavigationEvent.IAuthTabCallback.onNavigationEvent();
        }
        T t2 = (T) super.onNavigationEvent(serialDescriptor, i, jpVar, t);
        if (z) {
            this.onNavigationEvent.IAuthTabCallback.onWarmupCompleted(t2);
        }
        return t2;
    }

    @Override // o.yw
    public int onNavigationEvent(@NotNull SerialDescriptor serialDescriptor) {
        int typedObject;
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        int i = onExtraCallback.onExtraCallbackWithResult[this.IAuthTabCallbackDefault.ordinal()];
        if (i == 2) {
            typedObject = readTypedObject();
        } else if (i == 4) {
            typedObject = IAuthTabCallbackDefault(serialDescriptor);
        } else {
            typedObject = writeTypedObject();
        }
        if (this.IAuthTabCallbackDefault != cypher4Encrypt.MAP) {
            this.onNavigationEvent.IAuthTabCallback.onExtraCallback(typedObject);
        }
        return typedObject;
    }

    private final int readTypedObject() {
        int i = this.onWarmupCompleted;
        boolean zExtraCallbackWithResult = false;
        boolean z = i % 2 != 0;
        if (!z) {
            this.onNavigationEvent.onExtraCallback(':');
        } else if (i != -1) {
            zExtraCallbackWithResult = this.onNavigationEvent.extraCallbackWithResult();
        }
        if (this.onNavigationEvent.onWarmupCompleted()) {
            if (z) {
                if (this.onWarmupCompleted != -1) {
                    getBeforeTimestamp getbeforetimestamp = this.onNavigationEvent;
                    int i2 = getbeforetimestamp.onWarmupCompleted;
                    if (!zExtraCallbackWithResult) {
                        getBeforeTimestamp.onExtraCallbackWithResult(getbeforetimestamp, "Expected comma after the key-value pair", i2, null, 4, null);
                        throw new setWrite();
                    }
                } else {
                    getBeforeTimestamp getbeforetimestamp2 = this.onNavigationEvent;
                    int i3 = getbeforetimestamp2.onWarmupCompleted;
                    if (zExtraCallbackWithResult) {
                        getBeforeTimestamp.onExtraCallbackWithResult(getbeforetimestamp2, "Unexpected leading comma", i3, null, 4, null);
                        throw new setWrite();
                    }
                }
            }
            int i4 = this.onWarmupCompleted + 1;
            this.onWarmupCompleted = i4;
            return i4;
        }
        if (!zExtraCallbackWithResult || this.IAuthTabCallbackStub.IAuthTabCallback().onNavigationEvent()) {
            return -1;
        }
        setTouchStateListener.onWarmupCompleted(this.onNavigationEvent, (String) null, 1, (Object) null);
        throw new setWrite();
    }

    private final boolean IAuthTabCallback_Parcel(SerialDescriptor serialDescriptor, int i) {
        wie2 wie2Var = this.IAuthTabCallbackStub;
        boolean zOnExtraCallback = serialDescriptor.onExtraCallback(i);
        SerialDescriptor serialDescriptorOnNavigationEvent = serialDescriptor.onNavigationEvent(i);
        if (zOnExtraCallback && !serialDescriptorOnNavigationEvent.asInterface() && this.onNavigationEvent.IAuthTabCallback(true)) {
            return true;
        }
        if (!Intrinsics.areEqual(serialDescriptorOnNavigationEvent.IAuthTabCallback(), vbt.onExtraCallbackWithResult.onWarmupCompleted) || (serialDescriptorOnNavigationEvent.asInterface() && this.onNavigationEvent.IAuthTabCallback(false))) {
            return false;
        }
        String strOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted(((Boolean) changeVideoState.onExtraCallback(-1913675560, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1913675562, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this.onExtraCallbackWithResult}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).booleanValue());
        if (strOnWarmupCompleted == null) {
            return false;
        }
        int iIAuthTabCallback = setShakeValue.IAuthTabCallback(serialDescriptorOnNavigationEvent, wie2Var, strOnWarmupCompleted);
        boolean z = !wie2Var.IAuthTabCallback().asInterface() && serialDescriptorOnNavigationEvent.asInterface();
        if (iIAuthTabCallback == -3 && (zOnExtraCallback || z)) {
            this.onNavigationEvent.asBinder();
            return true;
        }
        return false;
    }

    private final int IAuthTabCallbackDefault(SerialDescriptor serialDescriptor) {
        int iIAuthTabCallback;
        boolean zExtraCallbackWithResult;
        boolean zExtraCallbackWithResult2 = this.onNavigationEvent.extraCallbackWithResult();
        while (true) {
            boolean z = true;
            if (this.onNavigationEvent.onWarmupCompleted()) {
                String strExtraCallback = extraCallback();
                this.onNavigationEvent.onExtraCallback(':');
                iIAuthTabCallback = setShakeValue.IAuthTabCallback(serialDescriptor, this.IAuthTabCallbackStub, strExtraCallback);
                if (iIAuthTabCallback == -3) {
                    zExtraCallbackWithResult = false;
                } else {
                    if (!this.onExtraCallbackWithResult.asBinder() || !IAuthTabCallback_Parcel(serialDescriptor, iIAuthTabCallback)) {
                        break;
                    }
                    zExtraCallbackWithResult = this.onNavigationEvent.extraCallbackWithResult();
                    z = false;
                }
                zExtraCallbackWithResult2 = z ? onExtraCallback(serialDescriptor, strExtraCallback) : zExtraCallbackWithResult;
            } else {
                if (zExtraCallbackWithResult2 && !this.IAuthTabCallbackStub.IAuthTabCallback().onNavigationEvent()) {
                    setTouchStateListener.onWarmupCompleted(this.onNavigationEvent, (String) null, 1, (Object) null);
                    throw new setWrite();
                }
                setRecycler setrecycler = this.onExtraCallback;
                if (setrecycler != null) {
                    return setrecycler.onExtraCallbackWithResult();
                }
                return -1;
            }
        }
        setRecycler setrecycler2 = this.onExtraCallback;
        if (setrecycler2 != null) {
            setrecycler2.onNavigationEvent(iIAuthTabCallback);
        }
        return iIAuthTabCallback;
    }

    private final boolean onExtraCallback(SerialDescriptor serialDescriptor, String str) {
        if (setShakeValue.onExtraCallback(serialDescriptor, this.IAuthTabCallbackStub) || onNavigationEvent(this.IAuthTabCallback, str)) {
            getBeforeTimestamp getbeforetimestamp = this.onNavigationEvent;
            Object[] objArr = {this.onExtraCallbackWithResult};
            getbeforetimestamp.onNavigationEvent(((Boolean) changeVideoState.onExtraCallback(-1913675560, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1913675562, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).booleanValue());
        } else {
            this.onNavigationEvent.IAuthTabCallback.onExtraCallbackWithResult();
            this.onNavigationEvent.onExtraCallbackWithResult(str);
        }
        return this.onNavigationEvent.extraCallbackWithResult();
    }

    private final int writeTypedObject() {
        boolean zExtraCallbackWithResult = this.onNavigationEvent.extraCallbackWithResult();
        if (this.onNavigationEvent.onWarmupCompleted()) {
            int i = this.onWarmupCompleted;
            if (i != -1 && !zExtraCallbackWithResult) {
                getBeforeTimestamp.onExtraCallbackWithResult(this.onNavigationEvent, "Expected end of the array or comma", 0, null, 6, null);
                throw new setWrite();
            }
            int i2 = i + 1;
            this.onWarmupCompleted = i2;
            return i2;
        }
        if (!zExtraCallbackWithResult || this.IAuthTabCallbackStub.IAuthTabCallback().onNavigationEvent()) {
            return -1;
        }
        setTouchStateListener.onNavigationEvent(this.onNavigationEvent, "array");
        throw new setWrite();
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public boolean onExtraCallbackWithResult() {
        return this.onNavigationEvent.onExtraCallbackWithResult();
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public byte IAuthTabCallbackStub() {
        long jOnNavigationEvent = this.onNavigationEvent.onNavigationEvent();
        byte b = (byte) jOnNavigationEvent;
        if (jOnNavigationEvent == b) {
            return b;
        }
        getBeforeTimestamp.onExtraCallbackWithResult(this.onNavigationEvent, "Failed to parse byte for input '" + jOnNavigationEvent + '\'', 0, null, 6, null);
        throw new setWrite();
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public short IAuthTabCallbackStubProxy() {
        long jOnNavigationEvent = this.onNavigationEvent.onNavigationEvent();
        short s = (short) jOnNavigationEvent;
        if (jOnNavigationEvent == s) {
            return s;
        }
        getBeforeTimestamp.onExtraCallbackWithResult(this.onNavigationEvent, "Failed to parse short for input '" + jOnNavigationEvent + '\'', 0, null, 6, null);
        throw new setWrite();
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public int asInterface() {
        long jOnNavigationEvent = this.onNavigationEvent.onNavigationEvent();
        int i = (int) jOnNavigationEvent;
        if (jOnNavigationEvent == i) {
            return i;
        }
        getBeforeTimestamp.onExtraCallbackWithResult(this.onNavigationEvent, "Failed to parse int for input '" + jOnNavigationEvent + '\'', 0, null, 6, null);
        throw new setWrite();
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public long access100() {
        return this.onNavigationEvent.onNavigationEvent();
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public float asBinder() throws NumberFormatException {
        getBeforeTimestamp getbeforetimestamp = this.onNavigationEvent;
        String strOnTransact = getbeforetimestamp.onTransact();
        try {
            float f = Float.parseFloat(strOnTransact);
            if (this.IAuthTabCallbackStub.IAuthTabCallback().onExtraCallback() || Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            setTouchStateListener.onExtraCallbackWithResult(this.onNavigationEvent, Float.valueOf(f));
            throw new setWrite();
        } catch (IllegalArgumentException unused) {
            getBeforeTimestamp.onExtraCallbackWithResult(getbeforetimestamp, "Failed to parse type 'float' for input '" + strOnTransact + '\'', 0, null, 6, null);
            throw new setWrite();
        }
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public double IAuthTabCallbackDefault() throws NumberFormatException {
        getBeforeTimestamp getbeforetimestamp = this.onNavigationEvent;
        String strOnTransact = getbeforetimestamp.onTransact();
        try {
            double d = Double.parseDouble(strOnTransact);
            if (this.IAuthTabCallbackStub.IAuthTabCallback().onExtraCallback() || Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            setTouchStateListener.onExtraCallbackWithResult(this.onNavigationEvent, Double.valueOf(d));
            throw new setWrite();
        } catch (IllegalArgumentException unused) {
            getBeforeTimestamp.onExtraCallbackWithResult(getbeforetimestamp, "Failed to parse type 'double' for input '" + strOnTransact + '\'', 0, null, 6, null);
            throw new setWrite();
        }
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public char onTransact() {
        String strOnTransact = this.onNavigationEvent.onTransact();
        if (strOnTransact.length() != 1) {
            getBeforeTimestamp.onExtraCallbackWithResult(this.onNavigationEvent, "Expected single char, but got '" + strOnTransact + '\'', 0, null, 6, null);
            throw new setWrite();
        }
        return strOnTransact.charAt(0);
    }

    private final String extraCallback() {
        Object[] objArr = {this.onExtraCallbackWithResult};
        if (((Boolean) changeVideoState.onExtraCallback(-1913675560, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1913675562, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).booleanValue()) {
            return this.onNavigationEvent.IAuthTabCallbackStub();
        }
        return this.onNavigationEvent.IAuthTabCallback();
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public String IAuthTabCallback_Parcel() {
        Object[] objArr = {this.onExtraCallbackWithResult};
        if (((Boolean) changeVideoState.onExtraCallback(-1913675560, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1913675562, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).booleanValue()) {
            return this.onNavigationEvent.IAuthTabCallbackStub();
        }
        return this.onNavigationEvent.asBinder();
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public Decoder onExtraCallback(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return syaycx1.onExtraCallback(serialDescriptor) ? new setWebTouchProxy(this.onNavigationEvent, this.IAuthTabCallbackStub) : super.onExtraCallback(serialDescriptor);
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public int IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return setShakeValue.onExtraCallbackWithResult(serialDescriptor, this.IAuthTabCallbackStub, IAuthTabCallback_Parcel(), " at path " + this.onNavigationEvent.IAuthTabCallback.onExtraCallback());
    }
}

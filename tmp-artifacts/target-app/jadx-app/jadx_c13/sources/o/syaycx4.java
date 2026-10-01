package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import o.setRecycled;
import o.uu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class syaycx4 extends wr implements skipVideo {
    private final setCalculationMethod IAuthTabCallback;
    private String IAuthTabCallbackDefault;
    private final skipVideo[] IAuthTabCallbackStub;
    private final hfycx asBinder;
    private boolean onExtraCallback;
    private final changeVideoState onExtraCallbackWithResult;
    private final wie2 onNavigationEvent;
    private String onTransact;
    private final cypher4Encrypt onWarmupCompleted;

    public final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] onWarmupCompleted;

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
            onWarmupCompleted = iArr;
        }
    }

    @Override // o.skipVideo
    public wie2 onExtraCallback() {
        return this.onNavigationEvent;
    }

    public syaycx4(@NotNull setCalculationMethod setcalculationmethod, @NotNull wie2 wie2Var, @NotNull cypher4Encrypt cypher4encrypt, @Nullable skipVideo[] skipvideoArr) {
        Intrinsics.checkNotNullParameter(setcalculationmethod, "");
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(cypher4encrypt, "");
        this.IAuthTabCallback = setcalculationmethod;
        this.onNavigationEvent = wie2Var;
        this.onWarmupCompleted = cypher4encrypt;
        this.IAuthTabCallbackStub = skipvideoArr;
        this.asBinder = onExtraCallback().onExtraCallback();
        this.onExtraCallbackWithResult = onExtraCallback().IAuthTabCallback();
        int iOrdinal = cypher4encrypt.ordinal();
        if (skipvideoArr != null) {
            skipVideo skipvideo = skipvideoArr[iOrdinal];
            if (skipvideo == null && skipvideo == this) {
                return;
            }
            skipvideoArr[iOrdinal] = this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public syaycx4(@NotNull setPreProgressHundred setpreprogresshundred, @NotNull wie2 wie2Var, @NotNull cypher4Encrypt cypher4encrypt, @NotNull skipVideo[] skipvideoArr) {
        this(setMaterialMeta.IAuthTabCallback(setpreprogresshundred, wie2Var), wie2Var, cypher4encrypt, skipvideoArr);
        Intrinsics.checkNotNullParameter(setpreprogresshundred, "");
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(cypher4encrypt, "");
        Intrinsics.checkNotNullParameter(skipvideoArr, "");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public hfycx onNavigationEvent() {
        return this.asBinder;
    }

    @Override // o.skipVideo
    public void onExtraCallbackWithResult(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        if (this.onTransact != null && !(jsonElement instanceof JsonObject)) {
            setRecycled.onExtraCallback(this.IAuthTabCallbackDefault, jsonElement);
            throw new setWrite();
        }
        onExtraCallbackWithResult((py<? super clickEvent>) clickEvent.onExtraCallback, (clickEvent) jsonElement);
    }

    @Override // o.vyl
    public boolean onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return this.onExtraCallbackWithResult.IAuthTabCallbackStub();
    }

    private final void onNavigationEvent(String str, String str2) {
        this.IAuthTabCallback.onExtraCallback();
        onExtraCallbackWithResult(str);
        this.IAuthTabCallback.onExtraCallback(':');
        this.IAuthTabCallback.onNavigationEvent();
        onExtraCallbackWithResult(str2);
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public vyl onExtraCallback(@NotNull SerialDescriptor serialDescriptor) {
        skipVideo skipvideo;
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        cypher4Encrypt cypher4encryptIAuthTabCallback = cypher4EncryptWithNoWrapBase64.IAuthTabCallback(onExtraCallback(), serialDescriptor);
        char c = cypher4encryptIAuthTabCallback.begin;
        if (c != 0) {
            this.IAuthTabCallback.onExtraCallback(c);
            this.IAuthTabCallback.onWarmupCompleted();
        }
        String str = this.onTransact;
        if (str != null) {
            String strOnExtraCallbackWithResult = this.IAuthTabCallbackDefault;
            if (strOnExtraCallbackWithResult == null) {
                strOnExtraCallbackWithResult = serialDescriptor.onExtraCallbackWithResult();
            }
            onNavigationEvent(str, strOnExtraCallbackWithResult);
            this.onTransact = null;
            this.IAuthTabCallbackDefault = null;
        }
        if (this.onWarmupCompleted == cypher4encryptIAuthTabCallback) {
            return this;
        }
        skipVideo[] skipvideoArr = this.IAuthTabCallbackStub;
        return (skipvideoArr == null || (skipvideo = skipvideoArr[cypher4encryptIAuthTabCallback.ordinal()]) == null) ? new syaycx4(this.IAuthTabCallback, onExtraCallback(), cypher4encryptIAuthTabCallback, this.IAuthTabCallbackStub) : skipvideo;
    }

    @Override // o.wr, o.vyl
    public void onNavigationEvent(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (this.onWarmupCompleted.end != 0) {
            this.IAuthTabCallback.asInterface();
            this.IAuthTabCallback.IAuthTabCallback();
            this.IAuthTabCallback.onExtraCallback(this.onWarmupCompleted.end);
        }
    }

    @Override // o.wr
    public boolean onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        int i2 = IAuthTabCallback.onWarmupCompleted[this.onWarmupCompleted.ordinal()];
        if (i2 != 1) {
            boolean z = false;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (!this.IAuthTabCallback.onExtraCallbackWithResult()) {
                        this.IAuthTabCallback.onExtraCallback(',');
                    }
                    this.IAuthTabCallback.onExtraCallback();
                    onExtraCallbackWithResult(setShakeValue.IAuthTabCallback(serialDescriptor, onExtraCallback(), i));
                    this.IAuthTabCallback.onExtraCallback(':');
                    this.IAuthTabCallback.onNavigationEvent();
                } else {
                    if (i == 0) {
                        this.onExtraCallback = true;
                    }
                    if (i == 1) {
                        this.IAuthTabCallback.onExtraCallback(',');
                        this.IAuthTabCallback.onNavigationEvent();
                        this.onExtraCallback = false;
                    }
                }
            } else if (!this.IAuthTabCallback.onExtraCallbackWithResult()) {
                if (i % 2 == 0) {
                    this.IAuthTabCallback.onExtraCallback(',');
                    this.IAuthTabCallback.onExtraCallback();
                    z = true;
                } else {
                    this.IAuthTabCallback.onExtraCallback(':');
                    this.IAuthTabCallback.onNavigationEvent();
                }
                this.onExtraCallback = z;
            } else {
                this.onExtraCallback = true;
            }
            return true;
        }
        if (!this.IAuthTabCallback.onExtraCallbackWithResult()) {
            this.IAuthTabCallback.onExtraCallback(',');
        }
        this.IAuthTabCallback.onExtraCallback();
        return true;
    }

    @Override // o.wr, o.vyl
    public <T> void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull py<? super T> pyVar, @Nullable T t) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(pyVar, "");
        if (t != null || this.onExtraCallbackWithResult.asInterface()) {
            super.onExtraCallbackWithResult(serialDescriptor, i, pyVar, t);
        }
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public Encoder onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (!syaycx1.onExtraCallback(serialDescriptor)) {
            if (!syaycx1.onNavigationEvent(serialDescriptor)) {
                if (this.onTransact == null) {
                    return super.onWarmupCompleted(serialDescriptor);
                }
                this.IAuthTabCallbackDefault = serialDescriptor.onExtraCallbackWithResult();
                return this;
            }
            setCalculationMethod setlandingpageclickbegin = this.IAuthTabCallback;
            if (!(setlandingpageclickbegin instanceof setLandingPageClickBegin)) {
                setlandingpageclickbegin = new setLandingPageClickBegin(setlandingpageclickbegin.IAuthTabCallback, this.onExtraCallback);
            }
            return new syaycx4(setlandingpageclickbegin, onExtraCallback(), this.onWarmupCompleted, (skipVideo[]) null);
        }
        setCalculationMethod setlandingpage = this.IAuthTabCallback;
        if (!(setlandingpage instanceof setLandingPage)) {
            setlandingpage = new setLandingPage(setlandingpage.IAuthTabCallback, this.onExtraCallback);
        }
        return new syaycx4(setlandingpage, onExtraCallback(), this.onWarmupCompleted, (skipVideo[]) null);
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onWarmupCompleted() {
        this.IAuthTabCallback.onExtraCallbackWithResult("null");
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onWarmupCompleted(boolean z) {
        if (this.onExtraCallback) {
            onExtraCallbackWithResult(String.valueOf(z));
        } else {
            this.IAuthTabCallback.onNavigationEvent(z);
        }
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onExtraCallbackWithResult(byte b) {
        if (this.onExtraCallback) {
            onExtraCallbackWithResult(String.valueOf((int) b));
        } else {
            this.IAuthTabCallback.onExtraCallback(b);
        }
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onExtraCallbackWithResult(short s) {
        if (this.onExtraCallback) {
            onExtraCallbackWithResult(String.valueOf((int) s));
        } else {
            this.IAuthTabCallback.onNavigationEvent(s);
        }
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onWarmupCompleted(int i) {
        if (this.onExtraCallback) {
            onExtraCallbackWithResult(String.valueOf(i));
        } else {
            this.IAuthTabCallback.onExtraCallback(i);
        }
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onExtraCallbackWithResult(long j) {
        if (this.onExtraCallback) {
            onExtraCallbackWithResult(String.valueOf(j));
        } else {
            this.IAuthTabCallback.onExtraCallbackWithResult(j);
        }
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onExtraCallback(float f) {
        if (this.onExtraCallback) {
            onExtraCallbackWithResult(String.valueOf(f));
        } else {
            this.IAuthTabCallback.onWarmupCompleted(f);
        }
        if (!this.onExtraCallbackWithResult.onExtraCallback() && Math.abs(f) > Float.MAX_VALUE) {
            throw setTouchStateListener.onWarmupCompleted(Float.valueOf(f), this.IAuthTabCallback.IAuthTabCallback.toString());
        }
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onNavigationEvent(double d) {
        if (this.onExtraCallback) {
            onExtraCallbackWithResult(String.valueOf(d));
        } else {
            this.IAuthTabCallback.onExtraCallbackWithResult(d);
        }
        if (!this.onExtraCallbackWithResult.onExtraCallback() && Math.abs(d) > Double.MAX_VALUE) {
            throw setTouchStateListener.onWarmupCompleted(Double.valueOf(d), this.IAuthTabCallback.IAuthTabCallback.toString());
        }
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void IAuthTabCallback(char c) {
        onExtraCallbackWithResult(String.valueOf(c));
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback.onExtraCallback(str);
    }

    @Override // o.wr, kotlinx.serialization.encoding.Encoder
    public void onExtraCallback(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        onExtraCallbackWithResult(serialDescriptor.onWarmupCompleted(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> void onExtraCallbackWithResult(@NotNull py<? super T> pyVar, T t) {
        String strIAuthTabCallback;
        Intrinsics.checkNotNullParameter(pyVar, "");
        if (onExtraCallback().IAuthTabCallback().writeTypedObject()) {
            pyVar.serialize(this, t);
            return;
        }
        boolean z = pyVar instanceof xf;
        if (z) {
            strIAuthTabCallback = onExtraCallback().IAuthTabCallback().IAuthTabCallbackDefault() != wwx2.NONE ? setRecycled.IAuthTabCallback(pyVar.getDescriptor(), onExtraCallback()) : null;
        } else {
            int i = setRecycled.onExtraCallbackWithResult.onNavigationEvent[onExtraCallback().IAuthTabCallback().IAuthTabCallbackDefault().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                vbt vbtVarIAuthTabCallback = pyVar.getDescriptor().IAuthTabCallback();
                if (Intrinsics.areEqual(vbtVarIAuthTabCallback, uu.onExtraCallbackWithResult.onNavigationEvent) || Intrinsics.areEqual(vbtVarIAuthTabCallback, uu.onExtraCallback.onExtraCallbackWithResult)) {
                }
            }
        }
        if (z) {
            xf xfVar = (xf) pyVar;
            if (t == 0) {
                throw new IllegalArgumentException(("Value for serializer " + xfVar.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            py<? super T> pyVarOnNavigationEvent = mue.onNavigationEvent(xfVar, this, t);
            if (strIAuthTabCallback != null) {
                setRecycled.onNavigationEvent(pyVar, pyVarOnNavigationEvent, strIAuthTabCallback);
                setRecycled.onWarmupCompleted(pyVarOnNavigationEvent.getDescriptor().IAuthTabCallback());
            }
            Intrinsics.checkNotNull(pyVarOnNavigationEvent, "");
            pyVar = pyVarOnNavigationEvent;
        }
        if (strIAuthTabCallback != null) {
            String strOnExtraCallbackWithResult = pyVar.getDescriptor().onExtraCallbackWithResult();
            this.onTransact = strIAuthTabCallback;
            this.IAuthTabCallbackDefault = strOnExtraCallbackWithResult;
        }
        pyVar.serialize(this, t);
    }
}

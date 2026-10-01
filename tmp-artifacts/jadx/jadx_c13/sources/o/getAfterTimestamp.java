package o;

import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import o.getAfterTimestamp;
import o.setRecycled;
import o.uu;
import o.vbt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getAfterTimestamp extends ea1 implements skipVideo {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int[] asBinder = {367339003, 1603322891, -2024225989, 1604224403, 1897315444, -869455157, -1627441169, 2006316132, -996282612, 1042909627, -2068542043, -807074611, -1855763401, 1085285530, -1932706987, -1794905178, 1919959438, 559434954};
    private static int onTransact = 1;
    private final wie2 IAuthTabCallback;
    private String onExtraCallback;
    protected final changeVideoState onExtraCallbackWithResult;
    private final Function1<JsonElement, Unit> onNavigationEvent;
    private String onWarmupCompleted;

    public /* synthetic */ getAfterTimestamp(wie2 wie2Var, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(wie2Var, function1);
    }

    public static /* synthetic */ Unit IAuthTabCallback(getAfterTimestamp getaftertimestamp, JsonElement jsonElement) {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getaftertimestamp, jsonElement);
        int i4 = onTransact + 39;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    @Override // o.oty2, kotlinx.serialization.encoding.Encoder
    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public abstract JsonElement asBinder();

    @Override // o.ea1
    public String onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int i4 = onTransact + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public abstract void onExtraCallbackWithResult(@NotNull String str, @NotNull JsonElement jsonElement);

    @Override // o.oty2
    public /* synthetic */ void IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(str);
        int i4 = onTransact + 13;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.oty2
    public /* bridge */ /* synthetic */ void IAuthTabCallback(String str, char c) {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback2(str, c);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 1;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.oty2
    public /* synthetic */ void onExtraCallback(String str, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(str, j);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.oty2
    public /* synthetic */ void onExtraCallback(String str, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(str, obj);
        int i4 = IAuthTabCallbackDefault + 31;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.oty2
    public /* synthetic */ Encoder onExtraCallbackWithResult(String str, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Encoder encoderOnExtraCallback = onExtraCallback(str, serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 43;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return encoderOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.oty2
    public /* synthetic */ void onExtraCallbackWithResult(String str, byte b) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(str, b);
        int i4 = onTransact + 29;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.oty2
    public /* synthetic */ void onExtraCallbackWithResult(String str, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(str, f);
        int i4 = IAuthTabCallbackDefault + 43;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
    }

    @Override // o.oty2
    public /* synthetic */ void onExtraCallbackWithResult(String str, SerialDescriptor serialDescriptor, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 83;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(str, serialDescriptor, i);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.oty2
    public /* synthetic */ void onExtraCallbackWithResult(String str, short s) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(str, s);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
    }

    @Override // o.oty2
    public /* synthetic */ void onExtraCallbackWithResult(String str, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(str, z);
        int i4 = onTransact + 63;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.oty2
    public /* synthetic */ void onNavigationEvent(String str, double d) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(str, d);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // o.oty2
    public /* bridge */ /* synthetic */ void onNavigationEvent(String str, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 71;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent2(str, i);
        int i5 = onTransact + 111;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.oty2
    public /* synthetic */ void onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(str, str2);
        int i4 = IAuthTabCallbackDefault + 93;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.skipVideo
    public final wie2 onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 41;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        wie2 wie2Var = this.IAuthTabCallback;
        int i5 = i2 + 89;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return wie2Var;
    }

    protected final Function1<JsonElement, Unit> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private getAfterTimestamp(wie2 wie2Var, Function1<? super JsonElement, Unit> function1) {
        this.IAuthTabCallback = wie2Var;
        this.onNavigationEvent = function1;
        this.onExtraCallbackWithResult = wie2Var.IAuthTabCallback();
    }

    @Override // o.oty2, kotlinx.serialization.encoding.Encoder
    public final hfycx onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        hfycx hfycxVarOnExtraCallback = this.IAuthTabCallback.onExtraCallback();
        int i4 = IAuthTabCallbackDefault + 71;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return hfycxVarOnExtraCallback;
    }

    @Override // o.ea1
    public String onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i) {
        String strIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 19;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(serialDescriptor, "");
            strIAuthTabCallback = setShakeValue.IAuthTabCallback(serialDescriptor, this.IAuthTabCallback, i);
            int i4 = 15 / 0;
        } else {
            Intrinsics.checkNotNullParameter(serialDescriptor, "");
            strIAuthTabCallback = setShakeValue.IAuthTabCallback(serialDescriptor, this.IAuthTabCallback, i);
        }
        int i5 = onTransact + 107;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    @Override // o.skipVideo
    public void onExtraCallbackWithResult(@NotNull JsonElement jsonElement) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jsonElement, "");
        if (this.onWarmupCompleted != null && !(jsonElement instanceof JsonObject)) {
            setRecycled.onExtraCallback(this.onExtraCallback, jsonElement);
            throw new setWrite();
        }
        onExtraCallbackWithResult((py<? super clickEvent>) clickEvent.onExtraCallback, (clickEvent) jsonElement);
        int i4 = onTransact + 45;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.vyl
    public boolean onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 3;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        boolean zIAuthTabCallbackStub = this.onExtraCallbackWithResult.IAuthTabCallbackStub();
        int i5 = IAuthTabCallbackDefault + 111;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return zIAuthTabCallbackStub;
    }

    @Override // o.oty2, kotlinx.serialization.encoding.Encoder
    public void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strCt_ = ct_();
        if (strCt_ == null) {
            this.onNavigationEvent.invoke(JsonNull.INSTANCE);
            return;
        }
        onNavigationEvent(strCt_);
        int i4 = IAuthTabCallbackDefault + 91;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
    }

    protected void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(str, JsonNull.INSTANCE);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallbackWithResult(str, JsonNull.INSTANCE);
        int i3 = onTransact + 111;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: onNavigationEvent, reason: avoid collision after fix types in other method */
    protected void onNavigationEvent2(@NotNull String str, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 29;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(str, initRenderFinish.IAuthTabCallback(Integer.valueOf(i)));
            int i4 = 98 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(str, initRenderFinish.IAuthTabCallback(Integer.valueOf(i)));
        }
        int i5 = IAuthTabCallbackDefault + 15;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
    }

    protected void onWarmupCompleted(@NotNull String str, byte b) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(str, initRenderFinish.IAuthTabCallback(Byte.valueOf(b)));
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallbackWithResult(str, initRenderFinish.IAuthTabCallback(Byte.valueOf(b)));
        int i3 = onTransact + 71;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    protected void onExtraCallback(@NotNull String str, short s) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(str, initRenderFinish.IAuthTabCallback(Short.valueOf(s)));
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallbackWithResult(str, initRenderFinish.IAuthTabCallback(Short.valueOf(s)));
        int i3 = IAuthTabCallbackDefault + 75;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void IAuthTabCallback(@NotNull String str, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(str, initRenderFinish.IAuthTabCallback(Long.valueOf(j)));
            int i3 = 23 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(str, initRenderFinish.IAuthTabCallback(Long.valueOf(j)));
        }
        int i4 = IAuthTabCallbackDefault + 61;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (java.lang.Math.abs(r5) > Float.MAX_VALUE) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        throw o.setTouchStateListener.onExtraCallbackWithResult(java.lang.Float.valueOf(r5), r4, asBinder().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        r4 = o.getAfterTimestamp.IAuthTabCallbackDefault + 115;
        o.getAfterTimestamp.onTransact = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        if (r3.onExtraCallbackWithResult.onExtraCallback() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r3.onExtraCallbackWithResult.onExtraCallback() != true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onNavigationEvent(@NotNull String str, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(str, initRenderFinish.IAuthTabCallback(Float.valueOf(f)));
            int i3 = 37 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(str, initRenderFinish.IAuthTabCallback(Float.valueOf(f)));
        }
    }

    protected void onWarmupCompleted(@NotNull String str, double d) {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(str, initRenderFinish.IAuthTabCallback(Double.valueOf(d)));
            this.onExtraCallbackWithResult.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallbackWithResult(str, initRenderFinish.IAuthTabCallback(Double.valueOf(d)));
        if (!this.onExtraCallbackWithResult.onExtraCallback()) {
            if (Math.abs(d) > Double.MAX_VALUE) {
                throw setTouchStateListener.onExtraCallbackWithResult(Double.valueOf(d), str, asBinder().toString());
            }
            int i3 = onTransact + 111;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    protected void onNavigationEvent(@NotNull String str, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(str, initRenderFinish.onWarmupCompleted(Boolean.valueOf(z)));
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(str, initRenderFinish.onWarmupCompleted(Boolean.valueOf(z)));
            throw null;
        }
    }

    /* renamed from: IAuthTabCallback, reason: avoid collision after fix types in other method */
    protected void IAuthTabCallback2(@NotNull String str, char c) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(str, initRenderFinish.onNavigationEvent(String.valueOf(c)));
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult(str, initRenderFinish.onNavigationEvent(String.valueOf(c)));
            throw null;
        }
    }

    protected void onNavigationEvent(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            onExtraCallbackWithResult(str, initRenderFinish.onNavigationEvent(str2));
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            onExtraCallbackWithResult(str, initRenderFinish.onNavigationEvent(str2));
            throw null;
        }
    }

    protected void onExtraCallback(@NotNull String str, @NotNull SerialDescriptor serialDescriptor, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        onExtraCallbackWithResult(str, initRenderFinish.onNavigationEvent(serialDescriptor.onWarmupCompleted(i)));
        int i5 = onTransact + 29;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    protected void onWarmupCompleted(@NotNull String str, @NotNull Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(obj, "");
            onExtraCallbackWithResult(str, initRenderFinish.onNavigationEvent(obj.toString()));
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        onExtraCallbackWithResult(str, initRenderFinish.onNavigationEvent(obj.toString()));
        int i3 = onTransact + 17;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    protected Encoder onExtraCallback(@NotNull String str, @NotNull SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (!syaycx1.onExtraCallback(serialDescriptor)) {
            if (!(!syaycx1.onNavigationEvent(serialDescriptor))) {
                return onExtraCallbackWithResult2(str, serialDescriptor);
            }
            Encoder encoderOnExtraCallbackWithResult = super.onExtraCallbackWithResult((getAfterTimestamp) str, serialDescriptor);
            int i4 = IAuthTabCallbackDefault + 15;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return encoderOnExtraCallbackWithResult;
        }
        int i6 = onTransact + 113;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return onWarmupCompleted(str);
        }
        onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.oty2, kotlinx.serialization.encoding.Encoder
    public Encoder onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (ct_() == null) {
            Encoder encoderOnWarmupCompleted = new fbysya(this.IAuthTabCallback, this.onNavigationEvent).onWarmupCompleted(serialDescriptor);
            int i4 = onTransact + 107;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                return encoderOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallbackDefault + 23;
        int i6 = i5 % 128;
        onTransact = i6;
        int i7 = i5 % 2;
        if (this.onWarmupCompleted != null) {
            int i8 = i6 + 35;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            this.onExtraCallback = serialDescriptor.onExtraCallbackWithResult();
            int i10 = IAuthTabCallbackDefault + 81;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
        }
        return super.onWarmupCompleted(serialDescriptor);
    }

    public static final class onNavigationEvent extends wr {
        final /* synthetic */ String IAuthTabCallback;
        private final hfycx onExtraCallback;

        onNavigationEvent(String str) {
            this.IAuthTabCallback = str;
            this.onExtraCallback = getAfterTimestamp.this.onExtraCallback().onExtraCallback();
        }

        @Override // kotlinx.serialization.encoding.Encoder
        public hfycx onNavigationEvent() {
            return this.onExtraCallback;
        }

        public final void onNavigationEvent(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            getAfterTimestamp.this.onExtraCallbackWithResult(this.IAuthTabCallback, new muteVideo(str, false, null, 4, null));
        }

        @Override // o.wr, kotlinx.serialization.encoding.Encoder
        public void onWarmupCompleted(int i) {
            onNavigationEvent(Long.toString(UInt.m35constructorimpl(i) & 4294967295L, 10));
        }

        @Override // o.wr, kotlinx.serialization.encoding.Encoder
        public void onExtraCallbackWithResult(long j) {
            onNavigationEvent(getTemplateInfo.onWarmupCompleted(access13000.onExtraCallback(j), 10));
        }

        @Override // o.wr, kotlinx.serialization.encoding.Encoder
        public void onExtraCallbackWithResult(byte b) {
            onNavigationEvent(UByte.IAuthTabCallback(UByte.m34constructorimpl(b)));
        }

        @Override // o.wr, kotlinx.serialization.encoding.Encoder
        public void onExtraCallbackWithResult(short s) {
            onNavigationEvent(getU64.IAuthTabCallback(getU64.onNavigationEvent(s)));
        }
    }

    private final onNavigationEvent onWarmupCompleted(String str) {
        int i = 2 % 2;
        onNavigationEvent onnavigationevent = new onNavigationEvent(str);
        int i2 = onTransact + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return onnavigationevent;
    }

    public static final class onWarmupCompleted extends wr {
        final /* synthetic */ SerialDescriptor onExtraCallbackWithResult;
        final /* synthetic */ String onWarmupCompleted;

        onWarmupCompleted(String str, SerialDescriptor serialDescriptor) {
            this.onWarmupCompleted = str;
            this.onExtraCallbackWithResult = serialDescriptor;
        }

        @Override // kotlinx.serialization.encoding.Encoder
        public hfycx onNavigationEvent() {
            return getAfterTimestamp.this.onExtraCallback().onExtraCallback();
        }

        @Override // o.wr, kotlinx.serialization.encoding.Encoder
        public void onExtraCallbackWithResult(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            getAfterTimestamp.this.onExtraCallbackWithResult(this.onWarmupCompleted, new muteVideo(str, false, this.onExtraCallbackWithResult));
        }
    }

    /* renamed from: onExtraCallbackWithResult, reason: avoid collision after fix types in other method */
    private final onWarmupCompleted onExtraCallbackWithResult2(String str, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(str, serialDescriptor);
        int i2 = onTransact + 43;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 11 / 0;
        }
        return onwarmupcompleted;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = asBinder;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = $10 + 75;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 83;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 1), TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 72, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i9++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = asBinder;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr5[i12]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 73, 8847 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i12++;
                i5 = -1469660336;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i13 = $11 + 45;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i15 = $11 + 33;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            for (int i17 = 0; i17 < 16; i17++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 22253), (Process.myPid() >> 22) + 39, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getScrollBarSize() >> 8)), 78 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 7398 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit onNavigationEvent(getAfterTimestamp getaftertimestamp, JsonElement jsonElement) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(jsonElement, "");
            getaftertimestamp.onExtraCallbackWithResult(getaftertimestamp.onExtraCallbackWithResult(), jsonElement);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(jsonElement, "");
        getaftertimestamp.onExtraCallbackWithResult(getaftertimestamp.onExtraCallbackWithResult(), jsonElement);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 83;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    @Override // o.oty2, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vyl onExtraCallback(@NotNull SerialDescriptor serialDescriptor) throws Throwable {
        getAfterTimestamp setdestroyondetached;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Function1<JsonElement, Unit> function1 = ct_() == null ? this.onNavigationEvent : new Function1() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getAfterTimestamp.IAuthTabCallback(this.f$0, (JsonElement) obj);
            }
        };
        vbt vbtVarIAuthTabCallback = serialDescriptor.IAuthTabCallback();
        Object obj = null;
        if (!Intrinsics.areEqual(vbtVarIAuthTabCallback, uu.onNavigationEvent.onExtraCallbackWithResult)) {
            int i2 = IAuthTabCallbackDefault + 59;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = vbtVarIAuthTabCallback instanceof ufy;
                throw null;
            }
            if (vbtVarIAuthTabCallback instanceof ufy) {
                setdestroyondetached = new setDestroyOnDetached(this.IAuthTabCallback, function1);
            } else if (Intrinsics.areEqual(vbtVarIAuthTabCallback, uu.onWarmupCompleted.onWarmupCompleted)) {
                wie2 wie2Var = this.IAuthTabCallback;
                SerialDescriptor serialDescriptorOnNavigationEvent = cypher4EncryptWithNoWrapBase64.onNavigationEvent(serialDescriptor.onNavigationEvent(0), wie2Var.onExtraCallback());
                vbt vbtVarIAuthTabCallback2 = serialDescriptorOnNavigationEvent.IAuthTabCallback();
                if ((vbtVarIAuthTabCallback2 instanceof spv) || Intrinsics.areEqual(vbtVarIAuthTabCallback2, vbt.onExtraCallbackWithResult.onWarmupCompleted)) {
                    setdestroyondetached = new setWebEventProxy(this.IAuthTabCallback, function1);
                } else {
                    int i3 = IAuthTabCallbackDefault + 35;
                    onTransact = i3 % 128;
                    int i4 = i3 % 2;
                    if (!wie2Var.IAuthTabCallback().onWarmupCompleted()) {
                        throw setTouchStateListener.onWarmupCompleted(serialDescriptorOnNavigationEvent);
                    }
                    setdestroyondetached = new setDestroyOnDetached(this.IAuthTabCallback, function1);
                }
            } else {
                setdestroyondetached = new getReuseCount(this.IAuthTabCallback, function1);
            }
        }
        String str = this.onWarmupCompleted;
        if (str != null) {
            int i5 = onTransact;
            int i6 = i5 + 75;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z2 = setdestroyondetached instanceof setWebEventProxy;
                throw null;
            }
            if (!(setdestroyondetached instanceof setWebEventProxy)) {
                String strOnExtraCallbackWithResult = this.onExtraCallback;
                if (strOnExtraCallbackWithResult == null) {
                    int i7 = i5 + 55;
                    IAuthTabCallbackDefault = i7 % 128;
                    if (i7 % 2 != 0) {
                        serialDescriptor.onExtraCallbackWithResult();
                        obj.hashCode();
                        throw null;
                    }
                    strOnExtraCallbackWithResult = serialDescriptor.onExtraCallbackWithResult();
                }
                setdestroyondetached.onExtraCallbackWithResult(str, initRenderFinish.onNavigationEvent(strOnExtraCallbackWithResult));
            } else {
                setWebEventProxy setwebeventproxy = (setWebEventProxy) setdestroyondetached;
                Object[] objArr = new Object[1];
                a(new int[]{-2108952266, 2091149514}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3, objArr);
                setwebeventproxy.onExtraCallbackWithResult(((String) objArr[0]).intern(), initRenderFinish.onNavigationEvent(str));
                String strOnExtraCallbackWithResult2 = this.onExtraCallback;
                if (strOnExtraCallbackWithResult2 == null) {
                    int i8 = IAuthTabCallbackDefault + 63;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                    strOnExtraCallbackWithResult2 = serialDescriptor.onExtraCallbackWithResult();
                }
                Object[] objArr2 = new Object[1];
                a(new int[]{-1724479520, -1997368688, -926501203, -2069147927}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5, objArr2);
                setwebeventproxy.onExtraCallbackWithResult(((String) objArr2[0]).intern(), initRenderFinish.onNavigationEvent(strOnExtraCallbackWithResult2));
            }
            this.onWarmupCompleted = null;
            this.onExtraCallback = null;
        }
        return setdestroyondetached;
    }

    @Override // o.oty2
    public void IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(serialDescriptor, "");
            this.onNavigationEvent.invoke(asBinder());
        } else {
            Intrinsics.checkNotNullParameter(serialDescriptor, "");
            this.onNavigationEvent.invoke(asBinder());
            int i3 = 63 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> void onExtraCallbackWithResult(@NotNull py<? super T> pyVar, T t) {
        String strIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pyVar, "");
        if (ct_() == null) {
            int i2 = IAuthTabCallbackDefault + 43;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (djsya.onWarmupCompleted(cypher4EncryptWithNoWrapBase64.onNavigationEvent(pyVar.getDescriptor(), onNavigationEvent()))) {
                new fbysya(this.IAuthTabCallback, this.onNavigationEvent).onExtraCallbackWithResult((py<? super py<? super T>>) pyVar, (py<? super T>) t);
                return;
            }
        }
        if (onExtraCallback().IAuthTabCallback().writeTypedObject()) {
            pyVar.serialize(this, t);
            return;
        }
        boolean z = pyVar instanceof xf;
        if (!z) {
            int i4 = setRecycled.onExtraCallbackWithResult.onNavigationEvent[onExtraCallback().IAuthTabCallback().IAuthTabCallbackDefault().ordinal()];
            if (i4 != 1) {
                int i5 = onTransact;
                int i6 = i5 + 75;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i8 = i5 + 81;
                    IAuthTabCallbackDefault = i8 % 128;
                    int i9 = i8 % 2;
                    vbt vbtVarIAuthTabCallback = pyVar.getDescriptor().IAuthTabCallback();
                    if (Intrinsics.areEqual(vbtVarIAuthTabCallback, uu.onExtraCallbackWithResult.onNavigationEvent) || Intrinsics.areEqual(vbtVarIAuthTabCallback, uu.onExtraCallback.onExtraCallbackWithResult)) {
                    }
                }
            }
            strIAuthTabCallback = null;
        } else if (onExtraCallback().IAuthTabCallback().IAuthTabCallbackDefault() != wwx2.NONE) {
            strIAuthTabCallback = setRecycled.IAuthTabCallback(pyVar.getDescriptor(), onExtraCallback());
            int i10 = onTransact + 107;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
        } else {
            strIAuthTabCallback = null;
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
            int i12 = onTransact + 17;
            IAuthTabCallbackDefault = i12 % 128;
            int i13 = i12 % 2;
            pyVar = pyVarOnNavigationEvent;
        }
        if (strIAuthTabCallback != null) {
            String strOnExtraCallbackWithResult = pyVar.getDescriptor().onExtraCallbackWithResult();
            this.onWarmupCompleted = strIAuthTabCallback;
            this.onExtraCallback = strOnExtraCallbackWithResult;
        }
        pyVar.serialize(this, t);
    }
}

package im.toss.tds.foundation.anim.rally;

import android.graphics.BlurMaskFilter;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda18;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.deprecated_javaName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RallyCanvas {
    private static int onMinimized = 1;
    private static int onPostMessage;
    private Float IAuthTabCallback;
    private float IAuthTabCallbackDefault;
    private float IAuthTabCallbackStub;
    private float IAuthTabCallbackStubProxy;
    private Float IAuthTabCallback_Parcel;
    private Float ICustomTabsCallback;
    private float access000;
    private Integer access100;
    private Float asBinder;
    private float asInterface;
    private float extraCallback;
    private float extraCallbackWithResult;
    private float getInterfaceDescriptor;
    private final View onActivityResized;
    private final Paint onExtraCallback;
    private float onExtraCallbackWithResult;
    private Float onMessageChannelReady;
    private float onNavigationEvent;
    private float onTransact;
    private Integer onWarmupCompleted;
    private float readTypedObject;
    private float writeTypedObject;

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i3 | i);
        int i8 = ~(i | i2);
        int i9 = i7 | i8;
        int i10 = ~i3;
        int i11 = ~i;
        int i12 = (~(i10 | i2)) | (~(i10 | i11)) | (~(i11 | i2));
        int i13 = ~i2;
        int i14 = i12 | (~(i13 | i3 | i));
        int i15 = (~(i13 | i11)) | i3 | i8;
        int i16 = i3 + i + i4 + (1962400304 * i6) + (1167700406 * i5);
        int i17 = i16 * i16;
        int i18 = ((i3 * (-1019457937)) - 559939584) + ((-1019457937) * i) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i4) + ((-1660944384) * i6) + ((-325058560) * i5) + (867827712 * i17);
        int i19 = ((i3 * (-1629562239)) - 1134582380) + (i * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i4 * (-1629561329)) + (i6 * (-1621399344)) + (i5 * (-873382486)) + (i17 * 1407582208);
        switch (i18 + (i19 * i19 * (-1895432192))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 7;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 27;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 111;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMinimized + 33;
        int i3 = i2 % 128;
        onPostMessage = i3;
        float f = i2 % 2 != 0 ? 2.0f : 0.0f;
        int i4 = i3 + 63;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public RallyCanvas(@NotNull View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, @Nullable Integer num, @Nullable Float f13, @Nullable Float f14, @Nullable Float f15, @Nullable Integer num2, @Nullable Float f16, @Nullable Float f17, float f18) {
        Intrinsics.checkNotNullParameter(view, "");
        this.onActivityResized = view;
        this.extraCallback = f;
        this.readTypedObject = f2;
        this.IAuthTabCallbackStub = f3;
        this.asInterface = f4;
        this.IAuthTabCallbackStubProxy = f5;
        this.onExtraCallbackWithResult = f6;
        this.access000 = f7;
        this.getInterfaceDescriptor = f8;
        this.writeTypedObject = f9;
        this.extraCallbackWithResult = f10;
        this.onTransact = f11;
        this.IAuthTabCallbackDefault = f12;
        this.onWarmupCompleted = num;
        this.onMessageChannelReady = f13;
        this.IAuthTabCallback = f14;
        this.IAuthTabCallback_Parcel = f15;
        this.access100 = num2;
        this.asBinder = f16;
        this.ICustomTabsCallback = f17;
        this.onNavigationEvent = f18;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(new deprecated_javaName(0).IAuthTabCallback());
        this.onExtraCallback = paint;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RallyCanvas(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, Integer num, Float f13, Float f14, Float f15, Integer num2, Float f16, Float f17, float f18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        float f19;
        float f20;
        Integer num3;
        Float f21;
        int i2;
        Float f22;
        Float f23;
        Float f24;
        Float f25;
        Integer num4;
        Float f26;
        float f27;
        float f28 = (i & 2) != 0 ? 0.0f : f;
        float f29 = (i & 4) != 0 ? 0.0f : f2;
        float f30 = (i & 8) != 0 ? 0.0f : f3;
        float f31 = (i & 16) != 0 ? 0.0f : f4;
        if ((i & 32) != 0) {
            int i3 = onPostMessage + 49;
            onMinimized = i3 % 128;
            f19 = i3 % 2 == 0 ? 2.0f : 0.0f;
        } else {
            f19 = f5;
        }
        float f32 = 1.0f;
        if ((i & 64) != 0) {
            int i4 = onMinimized + 107;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            f20 = 1.0f;
        } else {
            f20 = f6;
        }
        float f33 = (i & 128) != 0 ? 1.0f : f7;
        if ((i & 256) != 0) {
            int i6 = onPostMessage + 65;
            onMinimized = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            f32 = f8;
        }
        float f34 = (i & 512) != 0 ? 0.0f : f9;
        float f35 = (i & 1024) != 0 ? 0.0f : f10;
        float f36 = (i & 2048) != 0 ? 0.5f : f11;
        float f37 = (i & 4096) == 0 ? f12 : 0.5f;
        if ((i & 8192) != 0) {
            int i9 = onPostMessage + 5;
            onMinimized = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            num3 = null;
        } else {
            num3 = num;
        }
        Float f38 = (i & 16384) != 0 ? null : f13;
        if ((i & 32768) != 0) {
            int i12 = onMinimized + 33;
            f21 = f38;
            onPostMessage = i12 % 128;
            i2 = 2;
            int i13 = i12 % 2;
            f22 = null;
        } else {
            f21 = f38;
            i2 = 2;
            f22 = f14;
        }
        if ((i & 65536) != 0) {
            int i14 = i2 % i2;
            f23 = null;
        } else {
            f23 = f15;
        }
        if ((i & 131072) != 0) {
            f25 = f23;
            int i15 = onPostMessage + 101;
            f24 = f22;
            onMinimized = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 2 % 2;
            num4 = null;
        } else {
            f24 = f22;
            f25 = f23;
            num4 = num2;
        }
        Float f39 = (262144 & i) != 0 ? null : f16;
        Float f40 = (i & 524288) == 0 ? f17 : null;
        if ((i & 1048576) != 0) {
            int i18 = onMinimized + 103;
            f26 = f39;
            onPostMessage = i18 % 128;
            int i19 = i18 % 2;
            f27 = 0.0f;
        } else {
            f26 = f39;
            f27 = f18;
        }
        this(view, f28, f29, f30, f31, f19, f20, f33, f32, f34, f35, f36, f37, num3, f21, f24, f25, num4, f26, f40, f27);
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        RallyCanvas rallyCanvas = (RallyCanvas) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 75;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        View view = rallyCanvas.onActivityResized;
        if (i3 != 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RallyCanvas rallyCanvas = (RallyCanvas) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 73;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        rallyCanvas.extraCallback = fFloatValue;
        int i5 = i2 + 107;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final float extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 49;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        float f = this.extraCallback;
        int i5 = i2 + 43;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final void access000(float f) {
        int i = 2 % 2;
        int i2 = onMinimized + 93;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        this.readTypedObject = f;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
    }

    public final float writeTypedObject() {
        int i = 2 % 2;
        int i2 = onPostMessage + 43;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return this.readTypedObject;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        RallyCanvas rallyCanvas = (RallyCanvas) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = onPostMessage + 57;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        rallyCanvas.IAuthTabCallbackStub = fFloatValue;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 111;
        onPostMessage = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return null;
    }

    public final float IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onMinimized + 53;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        float f = this.IAuthTabCallbackStub;
        int i5 = i3 + 77;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        RallyCanvas rallyCanvas = (RallyCanvas) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 69;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        float f = rallyCanvas.asInterface;
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return Float.valueOf(f);
    }

    public final void IAuthTabCallbackStub(float f) {
        int i = 2 % 2;
        int i2 = onPostMessage + 123;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = f;
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
    }

    public final float IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onMinimized + 23;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        float f = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 109;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final void onTransact(float f) {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 99;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStubProxy = f;
        if (i4 == 0) {
            int i5 = 54 / 0;
        }
        int i6 = i2 + 63;
        onMinimized = i6 % 128;
        int i7 = i6 % 2;
    }

    public final float asInterface() {
        int i = 2 % 2;
        int i2 = onPostMessage + 101;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        float f = this.onExtraCallbackWithResult;
        int i5 = i3 + 3;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final void onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = onPostMessage + 77;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.onExtraCallbackWithResult = f;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 75;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RallyCanvas rallyCanvas = (RallyCanvas) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 21;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        float f = rallyCanvas.access000;
        int i5 = i3 + 19;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return Float.valueOf(f);
        }
        int i6 = 47 / 0;
        return Float.valueOf(f);
    }

    public final void asBinder(float f) {
        int i = 2 % 2;
        int i2 = onPostMessage + 1;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        this.access000 = f;
        if (i3 == 0) {
            throw null;
        }
    }

    public final float access000() {
        int i = 2 % 2;
        int i2 = onMinimized + 75;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getInterfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void asInterface(float f) {
        int i = 2 % 2;
        int i2 = onMinimized + 73;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        this.getInterfaceDescriptor = f;
        int i5 = i3 + 73;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public final float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onMinimized + 85;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        float f = this.onTransact;
        int i5 = i3 + 67;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = onPostMessage + 65;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        this.onTransact = f;
        int i5 = i3 + 101;
        onPostMessage = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = onMinimized + 31;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault = f;
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
    }

    public final float onTransact() {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 71;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        float f = this.IAuthTabCallbackDefault;
        int i5 = i2 + 85;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final void IAuthTabCallback(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onPostMessage + 21;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        this.onWarmupCompleted = num;
        int i5 = i3 + 57;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Integer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 33;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.onWarmupCompleted;
        int i5 = i2 + 65;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return num;
    }

    public final Float onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onMinimized + 43;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Float f = this.onMessageChannelReady;
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return f;
    }

    public final void onWarmupCompleted(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onPostMessage + 23;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        this.onMessageChannelReady = f;
        int i5 = i3 + 83;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Float asBinder() {
        int i = 2 % 2;
        int i2 = onPostMessage + 37;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final void onExtraCallback(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onPostMessage + 95;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallback = f;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 13;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void IAuthTabCallback(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onPostMessage + 31;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback_Parcel = f;
        if (i3 == 0) {
            throw null;
        }
    }

    public final Float ICustomTabsCallback() {
        Float f;
        int i = 2 % 2;
        int i2 = onPostMessage + 19;
        int i3 = i2 % 128;
        onMinimized = i3;
        if (i2 % 2 == 0) {
            f = this.IAuthTabCallback_Parcel;
            int i4 = 77 / 0;
        } else {
            f = this.IAuthTabCallback_Parcel;
        }
        int i5 = i3 + 61;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        RallyCanvas rallyCanvas = (RallyCanvas) objArr[0];
        Integer num = (Integer) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 93;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        rallyCanvas.access100 = num;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 1;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final Integer access100() {
        int i = 2 % 2;
        int i2 = onMinimized + 47;
        int i3 = i2 % 128;
        onPostMessage = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.access100;
        int i4 = i3 + 51;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final void onExtraCallbackWithResult(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 47;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        this.asBinder = f;
        int i5 = i2 + 89;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RallyCanvas rallyCanvas = (RallyCanvas) objArr[0];
        Float f = (Float) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 37;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        rallyCanvas.ICustomTabsCallback = f;
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final Float readTypedObject() {
        int i = 2 % 2;
        int i2 = onPostMessage + 27;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Float f = this.ICustomTabsCallback;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return f;
    }

    public final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 25;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = f;
        int i5 = i2 + 9;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onPostMessage + 51;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        float f = this.onNavigationEvent;
        int i5 = i3 + 57;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public final void onNavigationEvent(@NotNull Canvas canvas, @NotNull Function1<? super Canvas, Unit> function1) {
        float width;
        float height;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Camera camera = new Camera();
        Matrix matrix = new Matrix();
        camera.save();
        Float f = this.asBinder;
        if (f != null) {
            camera.setLocation(0.0f, 0.0f, -f.floatValue());
        }
        camera.rotate(this.IAuthTabCallbackStub, this.asInterface, -this.IAuthTabCallbackStubProxy);
        camera.getMatrix(matrix);
        matrix.preTranslate((-this.onTransact) * canvas.getWidth(), (-this.IAuthTabCallbackDefault) * canvas.getHeight());
        matrix.postTranslate(this.onTransact * canvas.getWidth(), this.IAuthTabCallbackDefault * canvas.getHeight());
        camera.restore();
        canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (this.onExtraCallbackWithResult * 255.0f));
        Float f2 = this.onMessageChannelReady;
        if (f2 != null) {
            int i2 = onPostMessage + 119;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            width = f2.floatValue();
        } else {
            width = canvas.getWidth();
        }
        float f3 = width;
        Float f4 = this.IAuthTabCallback;
        if (f4 != null) {
            int i4 = onMinimized + 63;
            onPostMessage = i4 % 128;
            if (i4 % 2 != 0) {
                height = f4.floatValue();
                int i5 = 98 / 0;
            } else {
                height = f4.floatValue();
            }
        } else {
            height = canvas.getHeight();
        }
        float f5 = height;
        canvas.scale(f3 / canvas.getWidth(), f5 / canvas.getHeight(), this.onTransact, this.IAuthTabCallbackDefault);
        canvas.save();
        canvas.scale(this.access000, this.getInterfaceDescriptor, this.onTransact * canvas.getWidth(), this.IAuthTabCallbackDefault * canvas.getHeight());
        canvas.translate(this.extraCallback, this.readTypedObject);
        canvas.concat(matrix);
        function1.invoke(canvas);
        if (this.onNavigationEvent > 0.0f) {
            canvas.save();
            this.onExtraCallback.setMaskFilter(new BlurMaskFilter(this.onNavigationEvent, BlurMaskFilter.Blur.NORMAL));
            canvas.drawRect(0.0f, 0.0f, f3, f5, this.onExtraCallback);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
    }

    public final float getInterfaceDescriptor() {
        return ((Float) onWarmupCompleted(new Object[]{this}, 1996037039, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1996037038, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult())).floatValue();
    }

    public final float IAuthTabCallbackStubProxy() {
        return ((Float) onWarmupCompleted(new Object[]{this}, -133090235, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), 133090237, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult())).floatValue();
    }

    public final View extraCallback() {
        return (View) onWarmupCompleted(new Object[]{this}, 776567273, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -776567268, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public final void onExtraCallback(float f) {
        onWarmupCompleted(new Object[]{this, Float.valueOf(f)}, -1554595333, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1554595339, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public final void onExtraCallbackWithResult(@Nullable Integer num) {
        onWarmupCompleted(new Object[]{this, num}, -1323884131, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1323884135, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public final void IAuthTabCallbackDefault(float f) {
        onWarmupCompleted(new Object[]{this, Float.valueOf(f)}, 1558751007, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1558751007, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public final void onNavigationEvent(@Nullable Float f) {
        onWarmupCompleted(new Object[]{this, f}, 809116625, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -809116622, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }
}

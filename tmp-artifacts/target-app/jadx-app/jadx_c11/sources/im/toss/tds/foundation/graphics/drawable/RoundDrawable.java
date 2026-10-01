package im.toss.tds.foundation.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.deprecated_noStore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RoundDrawable extends Drawable {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int getInterfaceDescriptor;
    private float IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private float IAuthTabCallbackStub;
    private boolean access100;
    private float asBinder;
    private boolean asInterface;
    private final Paint onExtraCallback;
    private float onExtraCallbackWithResult;
    private int onNavigationEvent;
    private float onTransact;
    private boolean onWarmupCompleted;

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = i | i7 | (~i4);
        int i9 = ~i;
        int i10 = (~(i4 | i7)) | (~(i7 | i9));
        int i11 = i2 + i + i3 + ((-92689393) * i5) + (1942122663 * i6);
        int i12 = i11 * i11;
        int i13 = (((-665130586) * i2) - 357761024) + ((-674687396) * i) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i3) + ((-1056047104) * i5) + ((-742522880) * i6) + ((-592117760) * i12);
        int i14 = (i2 * 1048061654) + 1366922925 + (i * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i3 * 1048061961) + (i5 * 439444615) + (i6 * (-1279783457)) + (i12 * 173867008);
        return i13 + ((i14 * i14) * (-1898250240)) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public int getOpacity() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 91;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 113;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RoundDrawable(int i, float f, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 4) != 0) {
            int i4 = getInterfaceDescriptor + 29;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            i2 = 15;
        }
        if ((i3 & 8) != 0) {
            int i6 = IAuthTabCallbackStubProxy + 99;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            z = false;
        }
        this(i, f, i2, z);
    }

    public RoundDrawable(int i, float f, int i2, boolean z) {
        this.asInterface = true;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.onExtraCallback = paint;
        this.onNavigationEvent = -1;
        this.IAuthTabCallbackDefault = 15;
        paint.setColor(-1);
        IAuthTabCallback(i);
        IAuthTabCallback(f);
        this.IAuthTabCallbackDefault = i2;
        this.onWarmupCompleted = z;
    }

    public RoundDrawable(int i, float f, float f2, float f3, float f4, int i2, boolean z) {
        this.asInterface = true;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.onExtraCallback = paint;
        this.onNavigationEvent = -1;
        this.IAuthTabCallbackDefault = 15;
        paint.setColor(-1);
        IAuthTabCallback(i);
        this.IAuthTabCallbackStub = f;
        this.onTransact = f2;
        this.IAuthTabCallback = f3;
        this.onExtraCallbackWithResult = f4;
        this.IAuthTabCallbackDefault = i2;
        this.onWarmupCompleted = z;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 != 0) {
            if (z != this.asInterface) {
                this.asInterface = z;
                invalidateSelf();
                return;
            } else {
                int i4 = i3 + 71;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
        }
        throw null;
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        if (z != this.access100) {
            int i2 = getInterfaceDescriptor + 5;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            this.access100 = z;
            invalidateSelf();
            int i4 = IAuthTabCallbackStubProxy + 85;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 13;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.onNavigationEvent;
        int i5 = i2 + 25;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        Object obj = null;
        if (i != this.onNavigationEvent) {
            int i3 = IAuthTabCallbackStubProxy + 123;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 != 0) {
                this.onNavigationEvent = i;
                this.onExtraCallback.setColor(i);
                invalidateSelf();
                throw null;
            }
            this.onNavigationEvent = i;
            this.onExtraCallback.setColor(i);
            invalidateSelf();
        }
        int i4 = getInterfaceDescriptor + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        float f = this.asBinder;
        int i5 = i3 + 111;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((r2 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r5 = 62 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r4.asBinder = r5;
        r4.IAuthTabCallbackStub = r5;
        r4.onTransact = r5;
        r4.IAuthTabCallback = r5;
        r4.onExtraCallbackWithResult = r5;
        invalidateSelf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r5 == r4.asBinder) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r5 == r4.asBinder) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r2 = r2 + 51;
        im.toss.tds.foundation.graphics.drawable.RoundDrawable.getInterfaceDescriptor = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 == 0) {
            int i4 = 86 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RoundDrawable roundDrawable = (RoundDrawable) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 77;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        roundDrawable.IAuthTabCallbackStub = fFloatValue;
        int i5 = i3 + 11;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final void onTransact(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact = f;
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
    }

    public final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 55;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback = f;
        int i5 = i2 + 55;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        this.onExtraCallbackWithResult = f;
        if (i4 != 0) {
            int i5 = 30 / 0;
        }
        int i6 = i3 + 47;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RoundDrawable roundDrawable = (RoundDrawable) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 49;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        roundDrawable.IAuthTabCallbackDefault = iIntValue;
        if (i4 != 0) {
            int i5 = 71 / 0;
        }
        int i6 = i2 + 111;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 105;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = z;
        int i5 = i2 + 81;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Path pathOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        if (!(!this.onWarmupCompleted)) {
            pathOnExtraCallbackWithResult = deprecated_noStore.onExtraCallback.onExtraCallbackWithResult(getBounds().right, getBounds().bottom, this.IAuthTabCallbackStub, this.onTransact, this.IAuthTabCallback, this.onExtraCallbackWithResult, this.IAuthTabCallbackDefault, true);
        } else if (!(!this.access100)) {
            pathOnExtraCallbackWithResult = deprecated_noStore.onExtraCallback.onExtraCallback(getBounds().right, getBounds().bottom, this.IAuthTabCallbackStub, this.onTransact, this.IAuthTabCallback, this.onExtraCallbackWithResult);
        } else if (this.asInterface) {
            int i4 = IAuthTabCallbackStubProxy + 7;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            pathOnExtraCallbackWithResult = deprecated_noStore.onExtraCallback.onNavigationEvent(getBounds().right, getBounds().bottom, this.IAuthTabCallbackStub, this.onTransact, this.IAuthTabCallback, this.onExtraCallbackWithResult, this.IAuthTabCallbackDefault, true);
        } else {
            Path pathOnExtraCallback = deprecated_noStore.onExtraCallback.onExtraCallback(getBounds().right, getBounds().bottom, this.IAuthTabCallbackStub, this.onTransact, this.IAuthTabCallback, this.onExtraCallbackWithResult, this.IAuthTabCallbackDefault);
            int i6 = getInterfaceDescriptor + 7;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            pathOnExtraCallbackWithResult = pathOnExtraCallback;
        }
        canvas.drawPath(pathOnExtraCallbackWithResult, this.onExtraCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int i2 = 2 % 2;
        if (this.onExtraCallback.getAlpha() != i) {
            int i3 = IAuthTabCallbackStubProxy + 45;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            this.onExtraCallback.setAlpha(i);
            invalidateSelf();
        }
        int i5 = getInterfaceDescriptor + 61;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Paint paint = this.onExtraCallback;
        if (i3 == 0) {
            return paint.getAlpha();
        }
        paint.getAlpha();
        throw null;
    }

    public final void onNavigationEvent(@NotNull Paint.Style style) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(style, "");
        this.onExtraCallback.setStyle(style);
        int i4 = getInterfaceDescriptor + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.setStrokeWidth(f);
        int i4 = IAuthTabCallbackStubProxy + 79;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.setColorFilter(colorFilter);
        int i4 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        onWarmupCompleted(492958229, -492958228, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), objArr, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback());
    }

    public final void onNavigationEvent(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        onWarmupCompleted(997860432, -997860432, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), objArr, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback());
    }
}

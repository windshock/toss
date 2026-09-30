package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import kotlin.jvm.internal.Intrinsics;
import o.AppDataCollector;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class findProcessName {
    private static int ICustomTabsCallback = 1;
    private static int extraCallback;
    private final AppDataCollector[] IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private char IAuthTabCallbackStub;
    private float IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private float access000;
    private final calculateDurationInForegroundbugsnag_android_core_release access100;
    private int asBinder;
    private float asInterface;
    private float extraCallbackWithResult;
    private float getInterfaceDescriptor;
    private float onExtraCallback;
    private float onExtraCallbackWithResult;
    private float onNavigationEvent;
    private char[] onTransact;
    private int onWarmupCompleted;
    private char writeTypedObject;

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i) | i5);
        int i11 = i9 | i10 | (~(i5 | i4));
        int i12 = (~(i4 | i)) | (~(i7 | i));
        int i13 = i8 | i10;
        int i14 = i + i5 + i2 + (793188503 * i3) + (2090109681 * i6);
        int i15 = i14 * i14;
        int i16 = (837707615 * i) + 1286602752 + ((-1676358574) * i5) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i2) + (1186463744 * i3) + (1166540800 * i6) + ((-1956446208) * i15);
        int i17 = ((i * 1389925299) - 652765764) + (i5 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i2 * 1389926445) + (i3 * (-1551828341)) + (i6 * (-2047638435)) + (i15 * 1214709760);
        return i16 + ((i17 * i17) * 445972480) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public findProcessName(@NotNull AppDataCollector[] appDataCollectorArr, @NotNull calculateDurationInForegroundbugsnag_android_core_release calculatedurationinforegroundbugsnag_android_core_release) {
        Intrinsics.checkNotNullParameter(appDataCollectorArr, "");
        Intrinsics.checkNotNullParameter(calculatedurationinforegroundbugsnag_android_core_release, "");
        this.IAuthTabCallback = appDataCollectorArr;
        this.access100 = calculatedurationinforegroundbugsnag_android_core_release;
    }

    public final char IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 43;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        char c = this.IAuthTabCallbackStub;
        int i5 = i2 + 107;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(char c) {
        int i = 2 % 2;
        int i2 = 1;
        int i3 = extraCallback + 1;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        this.writeTypedObject = c;
        this.access000 = this.asInterface;
        float fOnExtraCallbackWithResult = this.access100.onExtraCallbackWithResult(c);
        this.extraCallbackWithResult = fOnExtraCallbackWithResult;
        this.IAuthTabCallbackStubProxy = Math.max(this.access000, fOnExtraCallbackWithResult);
        asInterface();
        if (this.IAuthTabCallbackDefault >= this.IAuthTabCallback_Parcel) {
            int i5 = extraCallback + 97;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i2 = -1;
        }
        this.asBinder = i2;
        this.getInterfaceDescriptor = this.onExtraCallbackWithResult;
        this.onExtraCallbackWithResult = 0.0f;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        findProcessName findprocessname = (findProcessName) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        findprocessname.onNavigationEvent();
        float f = findprocessname.asInterface;
        int i4 = extraCallback + 101;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return Float.valueOf(f);
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 27;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent();
        float f = this.IAuthTabCallbackStubProxy;
        int i4 = extraCallback + 83;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (r1 == r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r1 == r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        r2 = r2 + 113;
        o.findProcessName.extraCallback = r2 % 128;
        r2 = r2 % 2;
        r8.onTransact = new char[]{r1};
        r8.IAuthTabCallbackDefault = 0;
        r8.IAuthTabCallback_Parcel = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        r8.onTransact = new char[]{r1, r5};
        r8.IAuthTabCallback_Parcel = 0;
        r8.IAuthTabCallbackDefault = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void asInterface() {
        int length;
        int i;
        char c;
        char c2;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 87;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            this.onTransact = null;
            length = this.IAuthTabCallback.length;
            i = 1;
        } else {
            this.onTransact = null;
            length = this.IAuthTabCallback.length;
            i = 0;
        }
        while (i < length) {
            AppDataCollector.onWarmupCompleted onwarmupcompletedOnNavigationEvent = this.IAuthTabCallback[i].onNavigationEvent(this.IAuthTabCallbackStub, this.writeTypedObject);
            if (onwarmupcompletedOnNavigationEvent != null) {
                int i4 = extraCallback + 3;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                this.onTransact = this.IAuthTabCallback[i].onExtraCallbackWithResult();
                this.IAuthTabCallback_Parcel = onwarmupcompletedOnNavigationEvent.onExtraCallback();
                this.IAuthTabCallbackDefault = onwarmupcompletedOnNavigationEvent.onNavigationEvent();
            }
            i++;
        }
        if (this.onTransact != null) {
            return;
        }
        int i6 = extraCallback + 109;
        int i7 = i6 % 128;
        ICustomTabsCallback = i7;
        if (i6 % 2 == 0) {
            c = this.IAuthTabCallbackStub;
            c2 = this.writeTypedObject;
            int i8 = 48 / 0;
        } else {
            c = this.IAuthTabCallbackStub;
            c2 = this.writeTypedObject;
        }
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 23;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent();
        this.IAuthTabCallbackStubProxy = this.asInterface;
        int i4 = extraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallbackWithResult = this.access100.onExtraCallbackWithResult(this.writeTypedObject);
        float f = this.asInterface;
        float f2 = this.extraCallbackWithResult;
        if (f != f2 || f2 == fOnExtraCallbackWithResult) {
            return;
        }
        this.extraCallbackWithResult = fOnExtraCallbackWithResult;
        this.asInterface = fOnExtraCallbackWithResult;
        this.IAuthTabCallbackStubProxy = fOnExtraCallbackWithResult;
        int i4 = ICustomTabsCallback + 17;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        findProcessName findprocessname = (findProcessName) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (fFloatValue == 1.0f) {
            findprocessname.IAuthTabCallbackStub = findprocessname.writeTypedObject;
            findprocessname.onExtraCallbackWithResult = 0.0f;
            findprocessname.getInterfaceDescriptor = 0.0f;
        }
        float fOnExtraCallbackWithResult = findprocessname.access100.onExtraCallbackWithResult();
        float fAbs = ((Math.abs(findprocessname.IAuthTabCallbackDefault - findprocessname.IAuthTabCallback_Parcel) * fOnExtraCallbackWithResult) * fFloatValue) / fOnExtraCallbackWithResult;
        int i4 = (int) fAbs;
        float f = findprocessname.getInterfaceDescriptor;
        int i5 = findprocessname.asBinder;
        findprocessname.onExtraCallback = ((fAbs - i4) * fOnExtraCallbackWithResult * i5) + (f * (1.0f - fFloatValue));
        findprocessname.onWarmupCompleted = findprocessname.IAuthTabCallback_Parcel + (i4 * i5);
        findprocessname.onNavigationEvent = fOnExtraCallbackWithResult;
        float f2 = findprocessname.access000;
        findprocessname.asInterface = f2 + ((findprocessname.extraCallbackWithResult - f2) * fFloatValue);
        int i6 = ICustomTabsCallback + 47;
        extraCallback = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull Canvas canvas, @NotNull Paint paint) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        if (onExtraCallbackWithResult(canvas, paint, this.onTransact, this.onWarmupCompleted, this.onExtraCallback * 1.2f)) {
            int i2 = extraCallback + 115;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.onWarmupCompleted >= 0) {
                char[] cArr = this.onTransact;
                Intrinsics.checkNotNull(cArr);
                this.IAuthTabCallbackStub = cArr[this.onWarmupCompleted];
                int i3 = extraCallback + 43;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            this.onExtraCallbackWithResult = this.onExtraCallback;
        }
        onExtraCallbackWithResult(canvas, paint, this.onTransact, this.onWarmupCompleted + 1, (this.onExtraCallback - this.onNavigationEvent) * 1.2f);
        onExtraCallbackWithResult(canvas, paint, this.onTransact, this.onWarmupCompleted - 1, (this.onExtraCallback + this.onNavigationEvent) * 1.2f);
    }

    private final boolean onExtraCallbackWithResult(Canvas canvas, Paint paint, char[] cArr, int i, float f) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 97;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        if (i < 0) {
            return false;
        }
        Intrinsics.checkNotNull(cArr);
        if (i >= cArr.length) {
            return false;
        }
        int i5 = extraCallback + 87;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            canvas.drawText(cArr, i, 0, 1.0f, f, paint);
            return false;
        }
        canvas.drawText(cArr, i, 1, 0.0f, f, paint);
        return true;
    }

    public final float onWarmupCompleted() {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return ((Float) onNavigationEvent(-1776784766, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1776784766, new Object[]{this}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult())).floatValue();
    }

    public final void onExtraCallbackWithResult(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        onNavigationEvent(-288861722, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 288861723, objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
    }
}

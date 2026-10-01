package o;

import android.opengl.GLES20;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class stopNestedScroll implements scrollStep {
    private final Integer IAuthTabCallback;
    private final Integer asBinder;
    private final int asInterface;
    private final int onExtraCallback;
    private final Integer onExtraCallbackWithResult;
    private final Integer onNavigationEvent;
    private final int onWarmupCompleted;

    public stopNestedScroll() {
        this(0, 0, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    public stopNestedScroll(int i2) {
        this(i2, 0, (Integer) null, 6, (DefaultConstructorMarker) null);
    }

    public stopNestedScroll(int i2, int i3) {
        this(i2, i3, (Integer) null, 4, (DefaultConstructorMarker) null);
    }

    public stopNestedScroll(int i2, int i3, int i4, int i5) {
        this(i2, i3, i4, i5, 0, 0, 0, 112, null);
    }

    public stopNestedScroll(int i2, int i3, int i4, int i5, int i6) {
        this(i2, i3, i4, i5, i6, 0, 0, 96, null);
    }

    public stopNestedScroll(int i2, int i3, int i4, int i5, int i6, int i7) {
        this(i2, i3, i4, i5, i6, i7, 0, 64, null);
    }

    private stopNestedScroll(int i2, int i3, Integer num, Integer num2, Integer num3, Integer num4, final Integer num5, Integer num6) {
        int iIntValue;
        this.asInterface = i2;
        this.onExtraCallback = i3;
        this.asBinder = num2;
        this.onNavigationEvent = num3;
        this.onExtraCallbackWithResult = num4;
        this.IAuthTabCallback = num6;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int[] iArrOnExtraCallback = access13400.onExtraCallback(1);
            int iIAuthTabCallback = access13400.IAuthTabCallback(iArrOnExtraCallback);
            int[] iArr = new int[iIAuthTabCallback];
            for (int i4 = 0; i4 < iIAuthTabCallback; i4++) {
                iArr[i4] = access13400.onExtraCallbackWithResult(iArrOnExtraCallback, i4);
            }
            GLES20.glGenTextures(1, iArr, 0);
            Unit unit = Unit.INSTANCE;
            access13400.onWarmupCompleted(iArrOnExtraCallback, 0, UInt.constructor-impl(iArr[0]));
            scrollByInternal.IAuthTabCallback("glGenTextures");
            iIntValue = access13400.onExtraCallbackWithResult(iArrOnExtraCallback, 0);
        }
        this.onWarmupCompleted = iIntValue;
        if (num == null) {
            setChildDrawingOrderCallback.onNavigationEvent(this, new Function0<Unit>() { // from class: o.stopNestedScroll.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* synthetic */ Object invoke() {
                    onExtraCallbackWithResult();
                    return Unit.INSTANCE;
                }

                public final void onExtraCallbackWithResult() {
                    if (stopNestedScroll.this.asBinder() != null && stopNestedScroll.this.onNavigationEvent() != null && stopNestedScroll.this.IAuthTabCallback() != null && num5 != null && stopNestedScroll.this.asInterface() != null) {
                        GLES20.glTexImage2D(UInt.constructor-impl(stopNestedScroll.this.onTransact()), 0, num5.intValue(), stopNestedScroll.this.asBinder().intValue(), stopNestedScroll.this.onNavigationEvent().intValue(), 0, UInt.constructor-impl(stopNestedScroll.this.IAuthTabCallback().intValue()), UInt.constructor-impl(stopNestedScroll.this.asInterface().intValue()), null);
                    }
                    GLES20.glTexParameterf(UInt.constructor-impl(stopNestedScroll.this.onTransact()), setScrollingTouchSlop.getInterfaceDescriptor(), setScrollingTouchSlop.IAuthTabCallbackStub());
                    GLES20.glTexParameterf(UInt.constructor-impl(stopNestedScroll.this.onTransact()), setScrollingTouchSlop.IAuthTabCallbackStubProxy(), setScrollingTouchSlop.onNavigationEvent());
                    GLES20.glTexParameteri(UInt.constructor-impl(stopNestedScroll.this.onTransact()), setScrollingTouchSlop.access000(), setScrollingTouchSlop.onExtraCallbackWithResult());
                    GLES20.glTexParameteri(UInt.constructor-impl(stopNestedScroll.this.onTransact()), setScrollingTouchSlop.access100(), setScrollingTouchSlop.onExtraCallbackWithResult());
                    scrollByInternal.IAuthTabCallback("glTexParameter");
                }
            });
        }
    }

    public final int onTransact() {
        return this.onExtraCallback;
    }

    public final Integer asBinder() {
        return this.asBinder;
    }

    public final Integer onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public final Integer IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final Integer asInterface() {
        return this.IAuthTabCallback;
    }

    public /* synthetic */ stopNestedScroll(int i2, int i3, Integer num, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? setScrollingTouchSlop.asInterface() : i2, (i4 & 2) != 0 ? setScrollingTouchSlop.IAuthTabCallback_Parcel() : i3, (i4 & 4) != 0 ? null : num);
    }

    public stopNestedScroll(int i2, int i3, @Nullable Integer num) {
        this(i2, i3, num, null, null, null, null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ stopNestedScroll(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        int iIAuthTabCallbackDefault = (i9 & 16) != 0 ? setScrollingTouchSlop.IAuthTabCallbackDefault() : i6;
        this(i2, i3, i4, i5, iIAuthTabCallbackDefault, (i9 & 32) != 0 ? iIAuthTabCallbackDefault : i7, (i9 & 64) != 0 ? setScrollingTouchSlop.extraCallback() : i8);
    }

    public stopNestedScroll(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this(i2, i3, null, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
    }

    public final int onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    @Override // o.scrollStep
    public void onExtraCallback() {
        GLES20.glActiveTexture(UInt.constructor-impl(this.asInterface));
        GLES20.glBindTexture(UInt.constructor-impl(this.onExtraCallback), UInt.constructor-impl(this.onWarmupCompleted));
        scrollByInternal.IAuthTabCallback("bind");
    }

    @Override // o.scrollStep
    public void onWarmupCompleted() {
        GLES20.glBindTexture(UInt.constructor-impl(this.onExtraCallback), UInt.constructor-impl(0));
        GLES20.glActiveTexture(setScrollingTouchSlop.asInterface());
        scrollByInternal.IAuthTabCallback("unbind");
    }

    public final void IAuthTabCallbackStub() {
        int[] iArr = {UInt.constructor-impl(this.onWarmupCompleted)};
        int iIAuthTabCallback = access13400.IAuthTabCallback(iArr);
        int[] iArr2 = new int[iIAuthTabCallback];
        for (int i2 = 0; i2 < iIAuthTabCallback; i2++) {
            iArr2[i2] = access13400.onExtraCallbackWithResult(iArr, i2);
        }
        GLES20.glDeleteTextures(1, iArr2, 0);
        Unit unit = Unit.INSTANCE;
        access13400.onWarmupCompleted(iArr, 0, UInt.constructor-impl(iArr2[0]));
    }
}

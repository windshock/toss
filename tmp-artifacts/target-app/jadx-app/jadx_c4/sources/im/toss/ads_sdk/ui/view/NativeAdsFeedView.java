package im.toss.ads_sdk.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.ui.view.NativeAdsFeedView;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography13;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.access8100;
import o.deleteProfile;
import o.getPathName;
import o.getRearDisplayMetrics;
import o.getStrokeWidth;
import o.getWrite;
import o.setTagsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsFeedView extends ConstraintLayout {
    private final getPathName IAuthTabCallback;
    private static final byte[] $$a = {69, 81, 99, -123};
    private static final int $$b = 6;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 478308922;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4;
        int i5 = (s * 3) + 105;
        int i6 = 1 - (i * 4);
        byte[] bArr = $$a;
        int i7 = 3 - (i2 * 3);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i5 += i7;
            i7 = i8;
            i3 = i4;
            i4 = i3 + 1;
            int i9 = i7 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i9];
            i7 = i5;
            i5 = b;
            i8 = i9;
            i5 += i7;
            i7 = i8;
            i3 = i4;
            i4 = i3 + 1;
            int i92 = i7 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            int i922 = i7 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsFeedView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsFeedView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i5 | i4)) | (~(i | i4));
        int i10 = ~i;
        int i11 = (~(i10 | i4)) | i5;
        int i12 = (~(i4 | i5 | i)) | (~(i8 | i10));
        int i13 = i5 + i + i6 + ((-373584967) * i3) + ((-1711780345) * i2);
        int i14 = i13 * i13;
        int i15 = (i5 * 1075882953) + 1902575616 + (1075882953 * i) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i6) + ((-375259136) * i3) + ((-1109524480) * i2) + (585564160 * i14);
        int i16 = ((i5 * 235012993) - 778813113) + (i * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i6 * 235013625) + (i3 * 915899377) + (i2 * (-1709701169)) + (i14 * 1974403072);
        return i15 + ((i16 * i16) * (-848756736)) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
        NativeAdsDto.Creative.Feed feed = (NativeAdsDto.Creative.Feed) objArr[1];
        MotionEvent motionEvent = (MotionEvent) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(iAuthTabCallback, feed, motionEvent);
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        int i5 = onExtraCallback + 11;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit IAuthTabCallback(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(iAuthTabCallback, feed, motionEvent);
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return asBinder(iAuthTabCallback, feed, motionEvent);
        }
        asBinder(iAuthTabCallback, feed, motionEvent);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(-1799208015, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{iAuthTabCallback, feed, motionEvent}, iOnExtraCallbackWithResult, 1799208015, iOnExtraCallbackWithResult2);
        int i4 = onExtraCallback + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getPathName getpathname, IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(getpathname, iAuthTabCallback, feed, motionEvent);
        }
        onWarmupCompleted(getpathname, iAuthTabCallback, feed, motionEvent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(iAuthTabCallback, feed, motionEvent);
        int i4 = onNavigationEvent + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeAdsFeedView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        getPathName getpathnameOnExtraCallback = getPathName.onExtraCallback(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(getpathnameOnExtraCallback, "");
        this.IAuthTabCallback = getpathnameOnExtraCallback;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsFeedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 123;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 73;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 % 3;
            } else {
                int i8 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = onExtraCallback + 19;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Unit unit;
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
        NativeAdsDto.Creative.Feed feed = (NativeAdsDto.Creative.Feed) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            iAuthTabCallback.IAuthTabCallback(feed, feed.onWarmupCompleted(), "103");
            unit = Unit.INSTANCE;
            int i3 = 37 / 0;
        } else {
            iAuthTabCallback.IAuthTabCallback(feed, feed.onWarmupCompleted(), "103");
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            iAuthTabCallback.IAuthTabCallback(feed, feed.onWarmupCompleted(), "202");
            return Unit.INSTANCE;
        }
        iAuthTabCallback.IAuthTabCallback(feed, feed.onWarmupCompleted(), "202");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        long j;
        float f;
        long j2;
        Throwable cause;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            j = 0;
            f = 0.0f;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i5 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22, 10277 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16790059), View.MeasureSpec.getSize(0) + 55, 2167 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i6 = $10 + 93;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i8 = $11 + 53;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    cArr4[i9] = cArr2[0];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback3 == null) {
                        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 12843);
                        int i11 = 55 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1));
                        int i12 = 2168 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(threadPriority, i11, i12, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    j2 = 0;
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        j2 = 0;
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getScrollBarSize() >> 8)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 55, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2167, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    } else {
                        j2 = 0;
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                j = j2;
                f = 0.0f;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[PHI: r2 r4 r10
      0x0052: PHI (r2v4 float) = (r2v3 float), (r2v5 float) binds: [B:14:0x004d, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r4v1 o.getStrokeWidth) = (r4v0 o.getStrokeWidth), (r4v2 o.getStrokeWidth) binds: [B:14:0x004d, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r10v3 float) = (r10v1 float), (r10v4 float) binds: [B:14:0x004d, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(getPathName getpathname, IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        float x;
        float y;
        getStrokeWidth getstrokewidth;
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            int i4 = 0 / 0;
            if (motionEvent != null) {
                int i5 = i3 + 47;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    x = motionEvent.getX();
                    y = motionEvent.getY();
                    getstrokewidth = getStrokeWidth.onExtraCallback;
                    Typography6 typography6 = getpathname.getInterfaceDescriptor;
                    Intrinsics.checkNotNullExpressionValue(typography6, "");
                    int i6 = 68 / 0;
                    if (getstrokewidth.onExtraCallback((View) typography6, x, y)) {
                        str = "101";
                    } else {
                        Typography6 typography62 = getpathname.access000;
                        Intrinsics.checkNotNullExpressionValue(typography62, "");
                        str = getstrokewidth.onExtraCallback((View) typography62, x, y) ? "102" : null;
                    }
                } else {
                    x = motionEvent.getX();
                    y = motionEvent.getY();
                    getstrokewidth = getStrokeWidth.onExtraCallback;
                    Typography6 typography63 = getpathname.getInterfaceDescriptor;
                    Intrinsics.checkNotNullExpressionValue(typography63, "");
                    if (getstrokewidth.onExtraCallback((View) typography63, x, y)) {
                    }
                }
                iAuthTabCallback.IAuthTabCallback(feed, feed.onWarmupCompleted(), str);
                int i7 = onNavigationEvent + 11;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            } else {
                IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, feed, feed.onWarmupCompleted(), null, 4, null);
            }
        } else if (motionEvent != null) {
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, feed, feed.onWarmupCompleted(), null, 3, null);
        } else {
            IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, feed, feed.onWarmupCompleted(), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            iAuthTabCallback.IAuthTabCallback(feed, feed.onWarmupCompleted(), "201");
            return Unit.INSTANCE;
        }
        iAuthTabCallback.IAuthTabCallback(feed, feed.onWarmupCompleted(), "201");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = feed.onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(1 - View.MeasureSpec.getSize(0), 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{0}, false, 68 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        iAuthTabCallback.IAuthTabCallback(feed, strOnWarmupCompleted, ((String) objArr[0]).intern());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0469  */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setItem(@NotNull final NativeAdsDto.Creative.Feed feed, @NotNull deleteProfile deleteprofile, boolean z, @NotNull final IAuthTabCallback iAuthTabCallback) throws Throwable {
        int color;
        int i;
        int i2;
        ?? r2;
        int i3;
        Configuration configuration;
        String strAsInterface;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(feed, "");
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        final getPathName getpathname = this.IAuthTabCallback;
        View view = getpathname.asBinder;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(8);
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        boolean zOnExtraCallbackWithResult = getstrokewidth.onExtraCallbackWithResult(context, deleteprofile);
        int color2 = Color.parseColor(zOnExtraCallbackWithResult ? "#1cd9d9ff" : "#0d022047");
        this.IAuthTabCallback.onTransact.setStrokeColor(color2);
        this.IAuthTabCallback.IAuthTabCallbackStubProxy.setTextColor(!zOnExtraCallbackWithResult ? Color.parseColor("#ff333d4b") : -1);
        Typography7 typography7 = this.IAuthTabCallback.ICustomTabsCallback;
        if (zOnExtraCallbackWithResult) {
            int i5 = onNavigationEvent + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            color = -1;
        } else {
            color = Color.parseColor("#ff8b95a1");
        }
        typography7.setTextColor(color);
        this.IAuthTabCallback.getInterfaceDescriptor.setTextColor(zOnExtraCallbackWithResult ? -1 : Color.parseColor("#ff333d4b"));
        this.IAuthTabCallback.access000.setTextColor(zOnExtraCallbackWithResult ? -1 : Color.parseColor("#ff4e5968"));
        this.IAuthTabCallback.access100.setTextColor(Color.parseColor("#ff8b95a1"));
        this.IAuthTabCallback.IAuthTabCallbackStub.setStrokeColor(color2);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(getpathname.IAuthTabCallbackStubProxy, "103");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(getpathname.onTransact, "202");
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(getpathname.getInterfaceDescriptor, "101");
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(getpathname.access000, "102");
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(getpathname.IAuthTabCallback, "201");
        ConstraintLayout constraintLayout = getpathname.asInterface;
        Object[] objArr = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 1, 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{0}, false, 's' - AndroidCharacter.getMirror('0'), objArr);
        Function0<Unit> function0OnWarmupCompleted = getRearDisplayMetrics.onWarmupCompleted(this, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback(constraintLayout, ((String) objArr[0]).intern())}));
        boolean zIsBlank = StringsKt.isBlank(feed.asBinder());
        TdsRoundLayout tdsRoundLayout = getpathname.onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        if (zIsBlank) {
            i = 8;
        } else {
            int i7 = onNavigationEvent + 101;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        }
        tdsRoundLayout.setVisibility(i);
        if (!zIsBlank) {
            TdsImageView tdsImageView = getpathname.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            TdsImageView.setImage$default(tdsImageView, feed.asBinder(), (Function1) null, (Function1) null, 6, (Object) null);
        }
        getpathname.onNavigationEvent.setContentDescription(null);
        getpathname.onNavigationEvent.setImportantForAccessibility(2);
        getpathname.onNavigationEvent.setFocusable(false);
        getpathname.IAuthTabCallbackStubProxy.setText(feed.IAuthTabCallbackDefault());
        getpathname.IAuthTabCallbackStubProxy.setImportantForAccessibility(1);
        Typography6 typography6 = getpathname.IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(typography6, "");
        View root = this.IAuthTabCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, typography6, false, null, 0, root, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsFeedView$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i9 = 2 % 2;
                int i10 = onWarmupCompleted + 3;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                NativeAdsFeedView.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                if (i11 != 0) {
                    return NativeAdsFeedView.onNavigationEvent(iAuthTabCallback2, feed, (MotionEvent) obj);
                }
                Unit unitOnNavigationEvent = NativeAdsFeedView.onNavigationEvent(iAuthTabCallback2, feed, (MotionEvent) obj);
                int i12 = 34 / 0;
                return unitOnNavigationEvent;
            }
        }, 1973, null);
        TdsRoundLayout tdsRoundLayout2 = getpathname.onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
        View root2 = this.IAuthTabCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout2, false, null, 0, root2, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsFeedView$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i9 = 2 % 2;
                int i10 = onWarmupCompleted + 87;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                Unit unitOnExtraCallbackWithResult = NativeAdsFeedView.onExtraCallbackWithResult(iAuthTabCallback, feed, (MotionEvent) obj);
                int i12 = onWarmupCompleted + 33;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 1973, null);
        if (z) {
            getpathname.IAuthTabCallbackStubProxy.setMinHeight(0);
            Typography7 typography72 = getpathname.ICustomTabsCallback;
            Intrinsics.checkNotNullExpressionValue(typography72, "");
            typography72.setVisibility(0);
            getpathname.ICustomTabsCallback.setContentDescription(null);
            getpathname.ICustomTabsCallback.setFocusable(false);
            i2 = 8;
        } else {
            getpathname.IAuthTabCallbackStubProxy.setMinHeight(setTagsokhttp.onExtraCallbackWithResult(this, 36));
            Typography7 typography73 = getpathname.ICustomTabsCallback;
            Intrinsics.checkNotNullExpressionValue(typography73, "");
            i2 = 8;
            typography73.setVisibility(8);
        }
        if (StringsKt.isBlank(feed.asInterface())) {
            r2 = 1;
            Typography6 typography62 = getpathname.getInterfaceDescriptor;
            Intrinsics.checkNotNullExpressionValue(typography62, "");
            typography62.setVisibility(8);
            ConstraintLayout constraintLayout2 = getpathname.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            View view2 = getpathname.asBinder;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(0);
        } else {
            getpathname.getInterfaceDescriptor.setText(feed.asInterface());
            View view3 = getpathname.asBinder;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            view3.setVisibility(i2);
            ConstraintLayout constraintLayout3 = getpathname.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            constraintLayout3.setVisibility(0);
            Typography6 typography63 = getpathname.getInterfaceDescriptor;
            Intrinsics.checkNotNullExpressionValue(typography63, "");
            typography63.setVisibility(0);
            if (StringsKt.isBlank(feed.IAuthTabCallbackStub())) {
                Typography6 typography64 = getpathname.access000;
                Intrinsics.checkNotNullExpressionValue(typography64, "");
                typography64.setVisibility(8);
            } else {
                getpathname.access000.setText(feed.IAuthTabCallbackStub());
                Typography6 typography65 = getpathname.access000;
                Intrinsics.checkNotNullExpressionValue(typography65, "");
                typography65.setVisibility(0);
            }
            if (StringsKt.isBlank(feed.IAuthTabCallbackStub())) {
                strAsInterface = feed.asInterface();
            } else {
                strAsInterface = feed.asInterface() + ", " + feed.IAuthTabCallbackStub();
            }
            getpathname.IAuthTabCallbackDefault.setContentDescription(strAsInterface);
            getpathname.IAuthTabCallbackDefault.setImportantForAccessibility(1);
            getpathname.IAuthTabCallbackDefault.setFocusable(true);
            ConstraintLayout constraintLayout4 = getpathname.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
            View root3 = this.IAuthTabCallback.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "");
            r2 = 1;
            getStrokeWidth.onExtraCallback(getstrokewidth, constraintLayout4, false, null, 0, root3, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsFeedView$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = onWarmupCompleted + 33;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    getPathName getpathname2 = getpathname;
                    if (i11 != 0) {
                        return NativeAdsFeedView.onNavigationEvent(getpathname2, iAuthTabCallback, feed, (MotionEvent) obj);
                    }
                    Unit unitOnNavigationEvent = NativeAdsFeedView.onNavigationEvent(getpathname2, iAuthTabCallback, feed, (MotionEvent) obj);
                    int i12 = 56 / 0;
                    return unitOnNavigationEvent;
                }
            }, 1973, null);
        }
        TdsImageView tdsImageView2 = getpathname.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        TdsImageView.setImage$default(tdsImageView2, feed.getInterfaceDescriptor(), (Function1) null, (Function1) null, 6, (Object) null);
        if (StringsKt.isBlank(feed.access000())) {
            getpathname.IAuthTabCallback.setContentDescription(null);
            getpathname.IAuthTabCallback.setImportantForAccessibility(2);
            getpathname.IAuthTabCallback.setFocusable(false);
        } else {
            getpathname.IAuthTabCallback.setContentDescription(feed.access000());
            getpathname.IAuthTabCallback.setImportantForAccessibility(r2);
            getpathname.IAuthTabCallback.setFocusable(r2);
        }
        View root4 = this.IAuthTabCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root4, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, root4, false, null, 0, null, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsFeedView$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + 123;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                NativeAdsFeedView.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                if (i11 == 0) {
                    Object[] objArr2 = {iAuthTabCallback2, feed, (MotionEvent) obj};
                    int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                    return (Unit) NativeAdsFeedView.IAuthTabCallback(-1228009282, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr2, iOnExtraCallbackWithResult, 1228009283, iOnExtraCallbackWithResult2);
                }
                Object[] objArr3 = {iAuthTabCallback2, feed, (MotionEvent) obj};
                int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                int i12 = 6 / 0;
                return (Unit) NativeAdsFeedView.IAuthTabCallback(-1228009282, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr3, iOnExtraCallbackWithResult3, 1228009283, iOnExtraCallbackWithResult4);
            }
        }, 1981, null);
        TdsImageView tdsImageView3 = getpathname.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
        View root5 = this.IAuthTabCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root5, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsImageView3, false, null, 0, root5, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsFeedView$$ExternalSyntheticLambda4
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + 93;
                onExtraCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    NativeAdsFeedView.onWarmupCompleted(iAuthTabCallback, feed, (MotionEvent) obj);
                    throw null;
                }
                Unit unitOnWarmupCompleted = NativeAdsFeedView.onWarmupCompleted(iAuthTabCallback, feed, (MotionEvent) obj);
                int i11 = onExtraCallbackWithResult + 7;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                return unitOnWarmupCompleted;
            }
        }, 1973, null);
        ConstraintLayout constraintLayout5 = getpathname.asInterface;
        Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
        View root6 = this.IAuthTabCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root6, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, constraintLayout5, false, null, 0, root6, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsFeedView$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) throws Throwable {
                int i9 = 2 % 2;
                int i10 = onExtraCallback + 35;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                Unit unitIAuthTabCallback = NativeAdsFeedView.IAuthTabCallback(iAuthTabCallback, feed, (MotionEvent) obj);
                int i12 = IAuthTabCallback + 69;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                return unitIAuthTabCallback;
            }
        }, 1973, null);
        if (((StringsKt.isBlank((String) NativeAdsDto.Creative.Feed.IAuthTabCallback(790435775, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -790435774, new Object[]{feed}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback())) ? 1 : 0) ^ r2) != r2) {
            getpathname.IAuthTabCallback_Parcel.setText(getContext().getString(R.string.ads_sdk_text_more));
        } else {
            int i9 = onExtraCallback + 41;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                getpathname.IAuthTabCallback_Parcel.setText((String) NativeAdsDto.Creative.Feed.IAuthTabCallback(790435775, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -790435774, new Object[]{feed}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback()));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getpathname.IAuthTabCallback_Parcel.setText((String) NativeAdsDto.Creative.Feed.IAuthTabCallback(790435775, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -790435774, new Object[]{feed}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback()));
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iIAuthTabCallback = getstrokewidth.IAuthTabCallback(context2, feed.IAuthTabCallback_Parcel(), -1);
        getpathname.IAuthTabCallback_Parcel.setTextColor(iIAuthTabCallback);
        getpathname.onExtraCallback.setImageTintList(ColorStateList.valueOf(iIAuthTabCallback));
        ConstraintLayout constraintLayout6 = getpathname.asInterface;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        constraintLayout6.setBackgroundColor(getstrokewidth.IAuthTabCallback(context3, (String) NativeAdsDto.Creative.Feed.IAuthTabCallback(545562487, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -545562487, new Object[]{feed}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback()), Color.parseColor("#262459")));
        String strOnTransact = feed.onTransact();
        if (strOnTransact != null) {
            int i10 = onNavigationEvent + 89;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0 ? ((StringsKt.isBlank(strOnTransact) ? 1 : 0) ^ r2) != r2 : StringsKt.isBlank(strOnTransact)) {
                SubTypography13 subTypography13 = getpathname.access100;
                Intrinsics.checkNotNullExpressionValue(subTypography13, "");
                subTypography13.setVisibility(8);
            } else {
                SubTypography13 subTypography132 = getpathname.access100;
                Intrinsics.checkNotNullExpressionValue(subTypography132, "");
                subTypography132.setVisibility(0);
                getpathname.access100.setText(feed.onTransact());
            }
        }
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this);
        if (zIsBlank != r2) {
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getpathname.IAuthTabCallbackStubProxy.getId(), 6, getpathname.onTransact.getId(), 7);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getpathname.ICustomTabsCallback.getId(), 6, getpathname.onTransact.getId(), 7);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(getpathname.IAuthTabCallbackStubProxy.getId(), 6, setTagsokhttp.onExtraCallbackWithResult(this, 10));
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(getpathname.ICustomTabsCallback.getId(), 6, setTagsokhttp.onExtraCallbackWithResult(this, 10));
            i3 = 4;
        } else {
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getpathname.IAuthTabCallbackStubProxy.getId(), 6, 0, 6);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getpathname.ICustomTabsCallback.getId(), 6, 0, 6);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(getpathname.IAuthTabCallbackStubProxy.getId(), 6, 0);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(getpathname.ICustomTabsCallback.getId(), 6, 0);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(getpathname.onTransact.getId(), 3);
            i3 = 4;
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(getpathname.onTransact.getId(), 4);
        }
        if (!zIsBlank) {
            int i11 = onExtraCallback + 47;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            if (z) {
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                Resources resources = context4.getResources();
                if (((resources == null || (configuration = resources.getConfiguration()) == null) ? 1.0f : configuration.fontScale) > 1.1f) {
                    int i13 = onExtraCallback + 121;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 != 0) {
                        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getpathname.onTransact.getId(), i3, (int) r2, 5);
                        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(getpathname.onTransact.getId(), 3);
                    } else {
                        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getpathname.onTransact.getId(), 3, 0, 3);
                        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(getpathname.onTransact.getId(), i3);
                    }
                } else {
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getpathname.onTransact.getId(), 3, getpathname.IAuthTabCallbackStubProxy.getId(), 3);
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getpathname.onTransact.getId(), i3, getpathname.ICustomTabsCallback.getId(), i3);
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(getpathname.onTransact.getId(), 0.5f);
                }
            } else {
                deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getpathname.onTransact.getId(), 3, getpathname.IAuthTabCallbackStubProxy.getId(), 3);
                deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(getpathname.onTransact.getId(), i3, getpathname.IAuthTabCallbackStubProxy.getId(), i3);
                deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(getpathname.onTransact.getId(), 0.5f);
            }
        }
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(this);
        requestLayout();
    }

    public interface IAuthTabCallback {
        void IAuthTabCallback(@NotNull NativeAdsDto.Creative.Feed feed, @NotNull String str, @Nullable String str2);

        static /* synthetic */ void IAuthTabCallback(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClick");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            iAuthTabCallback.IAuthTabCallback(feed, str, str2);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1228009282, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{iAuthTabCallback, feed, motionEvent}, iOnExtraCallbackWithResult, 1228009283, iOnExtraCallbackWithResult2);
    }

    private static final Unit asInterface(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1799208015, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{iAuthTabCallback, feed, motionEvent}, iOnExtraCallbackWithResult, 1799208015, iOnExtraCallbackWithResult2);
    }
}

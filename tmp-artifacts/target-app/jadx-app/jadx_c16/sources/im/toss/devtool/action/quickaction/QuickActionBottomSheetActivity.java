package im.toss.devtool.action.quickaction;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import im.toss.devtool.action.presentation.DevToolActionListViewModel;
import im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.ForwardingCameraControl;
import o.RepeatableSpec;
import o.RightClickGesturesKtonRightClickDown2;
import o.TimelineExternalSyntheticLambda1;
import o.access5300;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.setRubIn;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class QuickActionBottomSheetActivity extends Hilt_QuickActionBottomSheetActivity {
    public static final Object Companion;
    private static char[] IAuthTabCallbackDefault;
    public static final int IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy;
    private static long IAuthTabCallback_Parcel;
    private static final String asInterface;
    private final Lazy asBinder;

    @Inject
    public Object controller;
    private final Lazy onTransact;

    @Inject
    public Object schemeRepository;
    private static final byte[] $$a = {69, -38, -90, 81};
    private static final int $$b = 13;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 1;
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = 97 - (i * 2);
        int i6 = (i2 * 3) + 4;
        int i7 = (s * 4) + 1;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            i5 = i7;
            int i8 = i6;
            i4 = 0;
            i5 += i6;
            i6 = i8 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i8 = i6;
            i6 = bArr[i6];
            i5 += i6;
            i6 = i8 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    static {
        IAuthTabCallbackStubProxy = 0;
        IAuthTabCallbackDefault();
        Object[] objArr = new Object[1];
        a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, TextUtils.indexOf("", "") + 10, (char) (55334 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr);
        asInterface = ((String) objArr[0]).intern();
        Object obj = null;
        try {
            Object[] objArr2 = {null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1970961104);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 82 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 8920, -1144685664, false, (String) null, new Class[]{DefaultConstructorMarker.class});
            }
            Companion = ((Constructor) objOnExtraCallback).newInstance(objArr2);
            IAuthTabCallbackStub = 8;
            int i = access000 + 19;
            IAuthTabCallbackStubProxy = i % 128;
            if (i % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuickActionBottomSheetActivity quickActionBottomSheetActivity) {
        int i = 2 % 2;
        int i2 = access100 + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(quickActionBottomSheetActivity);
        int i4 = getInterfaceDescriptor + 113;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = i8 | i4;
        int i10 = (~(i7 | i8)) | (~(i7 | i4)) | (~i9);
        int i11 = ~i4;
        int i12 = (~(i3 | i11 | i5)) | (~(i7 | i11 | i8)) | (~(i9 | i5));
        int i13 = ~(i8 | i11 | i5);
        int i14 = i4 + i5 + i2 + ((-973178360) * i) + (1542423572 * i6);
        int i15 = i14 * i14;
        int i16 = (((-1657973228) * i4) - 1073741824) + ((-187520530) * i5) + ((-735226349) * i10) + (i12 * 735226349) + (735226349 * i13) + ((-922746880) * i2) + (1207959552 * i) + ((-1275068416) * i6) + (196542464 * i15);
        int i17 = (i4 * (-490823948)) + 944362368 + (i5 * (-490821954)) + (i10 * (-997)) + (i12 * 997) + (i13 * 997) + (i2 * (-490822951)) + (i * 2145288392) + (i6 * 779328756) + (i15 * (-1138819072));
        if (i16 + (i17 * i17 * 1440284672) != 1) {
            return onExtraCallback(objArr);
        }
        QuickActionBottomSheetActivity quickActionBottomSheetActivity = (QuickActionBottomSheetActivity) objArr[0];
        int i18 = 2 % 2;
        int i19 = getInterfaceDescriptor + 25;
        access100 = i19 % 128;
        int i20 = i19 % 2;
        String strOnExtraCallback = onExtraCallback(quickActionBottomSheetActivity);
        int i21 = access100 + 77;
        getInterfaceDescriptor = i21 % 128;
        int i22 = i21 % 2;
        return strOnExtraCallback;
    }

    public static /* synthetic */ Enum onExtraCallbackWithResult$178f0c48(QuickActionBottomSheetActivity quickActionBottomSheetActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Enum enumOnWarmupCompleted$178f0c48 = onWarmupCompleted$178f0c48(quickActionBottomSheetActivity);
        int i4 = access100 + 57;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return enumOnWarmupCompleted$178f0c48;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuickActionBottomSheetActivity quickActionBottomSheetActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 83;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quickActionBottomSheetActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getInterfaceDescriptor + 125;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return unitIAuthTabCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public QuickActionBottomSheetActivity() throws Throwable {
        try {
            Object[] objArr = {this};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1041827727);
            Function0 function0 = (Function0) ((Constructor) (objOnExtraCallback == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 77 - ((Process.getThreadPriority(0) + 20) >> 6), 9490 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -257554719, false, (String) null, new Class[]{ComponentActivity.class}) : objOnExtraCallback)).newInstance(objArr);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DevToolActionListViewModel.class);
            Object[] objArr2 = {this};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-646046851);
            Function0 function02 = (Function0) ((Constructor) (objOnExtraCallback2 == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 85 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 9567 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -398531091, false, (String) null, new Class[]{ComponentActivity.class}) : objOnExtraCallback2)).newInstance(objArr2);
            Object[] objArr3 = {null, this};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1220411395);
            this.onTransact = new RightClickGesturesKtonRightClickDown2(orCreateKotlinClass, function02, function0, (Function0) ((Constructor) (objOnExtraCallback3 == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 89 - TextUtils.indexOf("", ""), View.MeasureSpec.getSize(0) + 9653, -2046754451, false, (String) null, new Class[]{Function0.class, ComponentActivity.class}) : objOnExtraCallback3)).newInstance(objArr3));
            this.asBinder = LazyKt.onExtraCallbackWithResult(new QuickActionBottomSheetActivity$.ExternalSyntheticLambda0(this));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final Object IAuthTabCallback$9f4917e() {
        int i = 2 % 2;
        Object obj = this.schemeRepository;
        if (obj != null) {
            int i2 = access100 + 77;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return obj;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = getInterfaceDescriptor + 97;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r2 = r2 + 87;
        im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity.getInterfaceDescriptor = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        QuickActionBottomSheetActivity quickActionBottomSheetActivity = (QuickActionBottomSheetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 33;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Object obj = quickActionBottomSheetActivity.controller;
        if (i4 == 0) {
            int i5 = 0 / 0;
        }
    }

    private final DevToolActionListViewModel onTransact() {
        int i = 2 % 2;
        int i2 = access100 + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        DevToolActionListViewModel devToolActionListViewModel = (DevToolActionListViewModel) this.onTransact.getValue();
        int i4 = getInterfaceDescriptor + 45;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return devToolActionListViewModel;
        }
        throw null;
    }

    private final Enum asBinder$594a33d5() {
        int i = 2 % 2;
        int i2 = access100 + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Enum r1 = (Enum) this.asBinder.getValue();
        int i4 = access100 + 95;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Enum onWarmupCompleted$178f0c48(QuickActionBottomSheetActivity quickActionBottomSheetActivity) throws Throwable {
        int i = 2 % 2;
        Intent intent = quickActionBottomSheetActivity.getIntent();
        Object[] objArr = new Object[1];
        a(KeyEvent.keyCodeFromString(""), 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (55333 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr);
        if (!intent.getBooleanExtra(((String) objArr[0]).intern(), false)) {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1759054081);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 10625 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1503262609, false, "PINNED", (Class[]) null);
            }
            return (Enum) ((Field) objOnExtraCallback).get(null);
        }
        int i2 = access100 + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(786441766);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 13 - Color.blue(0), 10625 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 530634934, false, "ALL", (Class[]) null);
        }
        Enum r11 = (Enum) ((Field) objOnExtraCallback2).get(null);
        int i4 = getInterfaceDescriptor + 97;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return r11;
    }

    private static final String onExtraCallback(QuickActionBottomSheetActivity quickActionBottomSheetActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 9;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback$9f4917e = quickActionBottomSheetActivity.IAuthTabCallback$9f4917e();
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-315650475);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 11123), 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11102, -596676411, false, "onExtraCallback", new Class[0]);
            }
            String str = (String) ((Method) objOnExtraCallback).invoke(objIAuthTabCallback$9f4917e, null);
            int i4 = access100 + 77;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return str;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(QuickActionBottomSheetActivity quickActionBottomSheetActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        quickActionBottomSheetActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 51;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01b6 A[Catch: all -> 0x03b7, TRY_ENTER, TryCatch #0 {all -> 0x03b7, blocks: (B:76:0x02d8, B:78:0x0316, B:79:0x0397, B:65:0x026f, B:67:0x027c, B:68:0x02a9, B:56:0x0210, B:58:0x021d, B:59:0x024c, B:47:0x01b6, B:49:0x01c3, B:50:0x01ed, B:38:0x014e, B:40:0x015b, B:41:0x0188, B:29:0x00f0, B:31:0x00fd, B:32:0x012b, B:20:0x0094, B:22:0x00a1, B:23:0x00cb), top: B:95:0x0094 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(QuickActionBottomSheetActivity quickActionBottomSheetActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = access100 + 67;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr = new Object[1];
                a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, 125 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1040767223, i, -1, ((String) objArr[0]).intern());
            }
            setRubIn setrubinOnExtraCallback = quickActionBottomSheetActivity.onTransact().onExtraCallback();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(quickActionBottomSheetActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new QuickActionBottomSheetActivity$.ExternalSyntheticLambda1(quickActionBottomSheetActivity);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Function0 function0 = (Function0) objOnMinimized;
            DevToolActionListViewModel devToolActionListViewModelOnTransact = quickActionBottomSheetActivity.onTransact();
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(devToolActionListViewModelOnTransact);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                try {
                    Object[] objArr2 = {devToolActionListViewModelOnTransact};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2095561293);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 6691), View.MeasureSpec.getSize(0) + 83, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9002, -1302807773, false, (String) null, new Class[]{Object.class});
                    }
                    objOnMinimized2 = ((Constructor) objOnExtraCallback).newInstance(objArr2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            Function1 function1 = (access5300) objOnMinimized2;
            DevToolActionListViewModel devToolActionListViewModelOnTransact2 = quickActionBottomSheetActivity.onTransact();
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(devToolActionListViewModelOnTransact2);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback3 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object[] objArr3 = {devToolActionListViewModelOnTransact2};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1880471096);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (56984 - TextUtils.indexOf((CharSequence) "", '0', 0)), 84 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 9085, 1096108200, false, (String) null, new Class[]{Object.class});
                }
                objOnMinimized3 = ((Constructor) objOnExtraCallback2).newInstance(objArr3);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            Function1 function12 = (access5300) objOnMinimized3;
            DevToolActionListViewModel devToolActionListViewModelOnTransact3 = quickActionBottomSheetActivity.onTransact();
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(devToolActionListViewModelOnTransact3);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback4 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object[] objArr4 = {devToolActionListViewModelOnTransact3};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1296635910);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), TextUtils.indexOf("", "", 0) + 91, 9168 - (ViewConfiguration.getEdgeSlop() >> 16), 2081023638, false, (String) null, new Class[]{Object.class});
                }
                objOnMinimized4 = ((Constructor) objOnExtraCallback3).newInstance(objArr4);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
            Function1 function13 = (access5300) objOnMinimized4;
            DevToolActionListViewModel devToolActionListViewModelOnTransact4 = quickActionBottomSheetActivity.onTransact();
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(devToolActionListViewModelOnTransact4);
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback5) {
                int i5 = access100 + 77;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Object[] objArr5 = {devToolActionListViewModelOnTransact4};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-391279479);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), Color.alpha(0) + 81, 9307 - AndroidCharacter.getMirror('0'), -638750183, false, (String) null, new Class[]{Object.class});
                    }
                    objOnMinimized5 = ((Constructor) objOnExtraCallback4).newInstance(objArr5);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                }
                Function1 function14 = (access5300) objOnMinimized5;
                DevToolActionListViewModel devToolActionListViewModelOnTransact5 = quickActionBottomSheetActivity.onTransact();
                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(devToolActionListViewModelOnTransact5);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback6 || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Object[] objArr6 = {devToolActionListViewModelOnTransact5};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1366852262);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 77, 9339 - Process.getGidForName(""), -1614314550, false, (String) null, new Class[]{Object.class});
                    }
                    objOnMinimized6 = ((Constructor) objOnExtraCallback5).newInstance(objArr6);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                }
                Function1 function15 = (access5300) objOnMinimized6;
                DevToolActionListViewModel devToolActionListViewModelOnTransact6 = quickActionBottomSheetActivity.onTransact();
                boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(devToolActionListViewModelOnTransact6);
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback7 || objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Object[] objArr7 = {devToolActionListViewModelOnTransact6};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-103868057);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 74, 9416 - Color.blue(0), -930093065, false, (String) null, new Class[]{Object.class});
                    }
                    objOnMinimized7 = ((Constructor) objOnExtraCallback6).newInstance(objArr7);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
                }
                Function1 function16 = (access5300) objOnMinimized7;
                boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(quickActionBottomSheetActivity);
                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback8 || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized8 = new QuickActionBottomSheetActivity$.ExternalSyntheticLambda2(quickActionBottomSheetActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
                }
                Object[] objArr8 = {setrubinOnExtraCallback, function0, function1, function12, function13, function14, function15, function16, (Function0) objOnMinimized8, quickActionBottomSheetActivity.asBinder$594a33d5(), cameraCaptureResultEmptyCameraCaptureResult, 0, 0};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1487888994);
                if (objOnExtraCallback7 == null) {
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 47536), 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 9767 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1777310962, false, "onExtraCallback", new Class[]{setRubIn.class, Function0.class, Function1.class, Function1.class, Function1.class, Function1.class, Function1.class, Function1.class, Function0.class, (Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getWindowTouchSlop() >> 8) + 13, TextUtils.getOffsetAfter("", 0) + 10625), CameraCaptureResultEmptyCameraCaptureResult.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = getInterfaceDescriptor + 65;
                    access100 = i7 % 128;
                    if (i7 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        RepeatableSpec.onExtraCallbackWithResult(getWindow(), false);
        Object[] objArr = {onTransact(), onNavigationEvent$15da5ecc()};
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        DevToolActionListViewModel.IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -433857971, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, objArr, 433857971, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1040767223, true, new QuickActionBottomSheetActivity$.ExternalSyntheticLambda3(this))), 1, (Object) null);
        Object[] objArr2 = {onTransact()};
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        DevToolActionListViewModel.IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1139016909, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback2, objArr2, 1139016916, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i2 = access100 + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDestroy() throws NoSuchMethodException, SecurityException {
        int i = 2 % 2;
        int i2 = access100 + 93;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
            if (onTransact().onNavigationEvent$15da5ecc() == onNavigationEvent$15da5ecc()) {
                Object[] objArr = {onTransact(), null};
                int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
                DevToolActionListViewModel.IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -433857971, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, objArr, 433857971, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
            }
        } else if (onTransact().onNavigationEvent$15da5ecc() == onNavigationEvent$15da5ecc()) {
        }
        super.onDestroy();
        int i4 = access100 + 81;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        CharSequence charSequence;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 23;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackDefault[i - i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - Process.getGidForName("")), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17, 10973 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(IAuthTabCallback_Parcel), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        charSequence = "";
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 46135), 30 - TextUtils.indexOf(charSequence, '0'), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    } else {
                        charSequence = "";
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore(charSequence, 0) + 49123), 44 - TextUtils.indexOf(charSequence, charSequence, 0), 1494 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(IAuthTabCallbackDefault[i + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - Color.alpha(0)), 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), 10973 - (ViewConfiguration.getJumpTapTimeout() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback_Parcel), Integer.valueOf(c)};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - TextUtils.getOffsetBefore("", 0)), 30 - TextUtils.lastIndexOf("", '0'), 20220 - (ViewConfiguration.getLongPressTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                        try {
                            Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback6 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.getOffsetBefore("", 0) + 44, 1495 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback6).invoke(null, objArr7);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 81;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 49123), 43 - ImageFormat.getBitsPerPixel(0), TextUtils.getCapsMode("", 0, 0) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    public static /* synthetic */ String onNavigationEvent(QuickActionBottomSheetActivity quickActionBottomSheetActivity) {
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return (String) onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{quickActionBottomSheetActivity}, iOnWarmupCompleted, -120185322, 120185323, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    public final Object onNavigationEvent$15da5ecc() {
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this}, iOnWarmupCompleted, 1034078342, -1034078342, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    @Override // im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getInterfaceDescriptor + 113;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 25;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = access100 + 117;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = getInterfaceDescriptor + 37;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallbackDefault() {
        IAuthTabCallbackDefault = new char[]{13698, 31425, 43822, 56206, 2256, 47397, 59789, 7885, 20304, 65419, 60861, 41697, 29514, 936, 53467, 24863, 12727, 50834, 38768, 10153, 62674, 34152, 21915, 60099, 47976, 19410, 6197, 43375, 31120, 3637, 57179, 28546, 15466, 52557, 40417, 21029, 58183, 46071, 16405, 4431, 41456, 30229, 1723, 55266, 25674, 13453, 50625, 39429, 10919, 64471, 34901, 22703, 59856, 48757, 20123, 8130, 44102, 31891, 3360, 49784, 37515, 9009, 61543, 32900, 20769, 58969, 46816, 18189, 5191, 42216, 29981, 2650, 56045, 27400, 15277, 51362, 39179, 10674, 65271, 36638, 24481, 60637, 48480, 19881, 650, 54048, 25493, 12482, 49515, 37266, 9773, 63329, 34699, 21545, 58695, 46546, 19044, 6932, 43973, 30777, 2381, 55807, 28191, 16237, 53223, 39944, 11453, 64995, 45578, 17054, 5083, 40984, 28848, 467, 54905, 26271, 14284, 50297, 38033, 9688, 64069, 35487, 23328, 59493, 47250, 18741, 7744, 44693, 32618, 3159, 56544, 28022, 8720, 62125, 33629};
        IAuthTabCallback_Parcel = 6017924745415205516L;
    }
}

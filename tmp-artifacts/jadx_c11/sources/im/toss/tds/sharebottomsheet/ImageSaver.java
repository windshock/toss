package im.toss.tds.sharebottomsheet;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.sharebottomsheet.ImageSaver$;
import im.toss.uikit.base.UIKitBaseActivity;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.Cookies_clearAll;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ICustomTabsServiceDefault;
import o.IPostMessageService_Parcel;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.LowLightBoostStateState;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.access13800;
import o.addFixedPosition;
import o.component5;
import o.findResAndMsg;
import o.getAwbState;
import o.getWrite;
import o.isZslDisabledByByUserCaseConfig;
import o.maybeUpdateAnimatable;
import o.prefetch;
import o.putChannelInfo;
import o.resolveQuirkNames;
import o.setRandomHost;
import o.toPreviewOnlyRange;
import o.y1hExternalSyntheticLambda0;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ImageSaver extends UIKitBaseActivity {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private Uri IAuthTabCallbackDefault;
    private final String asInterface = "toss_image_" + System.currentTimeMillis() + ".jpg";
    private Function0<Unit> getInterfaceDescriptor;
    private Function1<? super Throwable, Unit> onTransact;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int IAuthTabCallbackStub = 8;
    private static final Map<Uri, Pair<Function0<Unit>, Function1<Throwable, Unit>>> asBinder = new LinkedHashMap();

    public static /* synthetic */ Unit onExtraCallback(ImageSaver imageSaver, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 81;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(imageSaver, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 56 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~i3;
        int i10 = (~(i7 | i8 | i9)) | (~(i5 | i6));
        int i11 = ~(i3 | i6);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i6);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i5 + i6 + i + (1349231875 * i4) + (1735201104 * i2);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i5) + 1558183936 + (237349861 * i6) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i) + ((-1337982976) * i4) + (469762048 * i2) + (1272971264 * i16);
        int i18 = ((i5 * 236314795) - 374860141) + (i6 * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i * 236313959) + (i4 * (-66979019)) + (i2 * (-1872492752)) + (i16 * (-417333248));
        int i19 = i17 + (i18 * i18 * 639631360);
        if (i19 == 1) {
            return onExtraCallback(objArr);
        }
        if (i19 != 2) {
            return onNavigationEvent(objArr);
        }
        UIKitBaseActivity uIKitBaseActivity = (ImageSaver) objArr[0];
        int i20 = 2 % 2;
        int i21 = IAuthTabCallbackStubProxy + 21;
        IAuthTabCallback_Parcel = i21 % 128;
        int i22 = i21 % 2;
        if (Build.VERSION.SDK_INT >= 33) {
            int i23 = IAuthTabCallback_Parcel + 43;
            IAuthTabCallbackStubProxy = i23 % 128;
            int i24 = i23 % 2;
            return true;
        }
        if (uIKitBaseActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        int i25 = IAuthTabCallbackStubProxy;
        int i26 = i25 + 61;
        IAuthTabCallback_Parcel = i26 % 128;
        boolean z = i26 % 2 != 0;
        int i27 = i25 + 25;
        IAuthTabCallback_Parcel = i27 % 128;
        int i28 = i27 % 2;
        return Boolean.valueOf(z);
    }

    public static /* synthetic */ Unit onNavigationEvent(ImageSaver imageSaver, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 23;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {imageSaver, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -969513899, objArr, 969513899);
        int i5 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ImageSaver imageSaver, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(imageSaver, z);
        int i4 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 91;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public static final /* synthetic */ Function1 IAuthTabCallback(ImageSaver imageSaver) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        Object obj = null;
        Function1<? super Throwable, Unit> function1 = imageSaver.onTransact;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 103;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return function1;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ImageSaver imageSaver = (ImageSaver) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0 = imageSaver.getInterfaceDescriptor;
        if (i3 != 0) {
            return function0;
        }
        throw null;
    }

    public static final /* synthetic */ String onExtraCallback(ImageSaver imageSaver) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 51;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        String str = imageSaver.asInterface;
        int i5 = i2 + 11;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ Uri onExtraCallbackWithResult(ImageSaver imageSaver) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        Uri uri = imageSaver.IAuthTabCallbackDefault;
        int i5 = i3 + 71;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return uri;
    }

    public static final /* synthetic */ Map onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 25;
        IAuthTabCallbackStubProxy = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Map<Uri, Pair<Function0<Unit>, Function1<Throwable, Unit>>> map = asBinder;
        int i4 = i2 + 107;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public static final /* synthetic */ boolean onNavigationEvent(ImageSaver imageSaver) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted3, -696114116, new Object[]{imageSaver}, 696114118)).booleanValue();
        int i4 = IAuthTabCallback_Parcel + 73;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static final /* synthetic */ void onTransact(ImageSaver imageSaver) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        imageSaver.IAuthTabCallback();
        int i4 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r5.IAuthTabCallbackDefault = r6;
        r1 = im.toss.tds.sharebottomsheet.ImageSaver.asBinder;
        r6 = r1.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r6 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r5.getInterfaceDescriptor = (kotlin.jvm.functions.Function0) r6.getFirst();
        r5.onTransact = (kotlin.jvm.functions.Function1) r6.getSecond();
        r6 = r5.IAuthTabCallbackDefault;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r6 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r6 = im.toss.tds.sharebottomsheet.ImageSaver.IAuthTabCallbackStubProxy + 47;
        im.toss.tds.sharebottomsheet.ImageSaver.IAuthTabCallback_Parcel = r6 % 128;
        r6 = r6 % 2;
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r6 = im.toss.tds.sharebottomsheet.ImageSaver.IAuthTabCallback_Parcel + 95;
        im.toss.tds.sharebottomsheet.ImageSaver.IAuthTabCallbackStubProxy = r6 % 128;
        r6 = r6 % 2;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        r6 = r1.remove(r6);
        o.requestPostMessageChannelWithExtras.onExtraCallback(r5, (o.CameraConfigBuilder) null, o.setAdVideoPlaybackListener.onWarmupCompleted(o.ForwardingCameraControl.onExtraCallbackWithResult(-2004474653, true, new im.toss.tds.sharebottomsheet.ImageSaver$.ExternalSyntheticLambda2(r5))), 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r6 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r6 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        finish();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) {
        Uri data;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            overridePendingTransition(1, 1);
            super.onCreate(bundle);
            data = getIntent().getData();
        } else {
            overridePendingTransition(0, 0);
            super.onCreate(bundle);
            data = getIntent().getData();
        }
    }

    private static final Unit onExtraCallbackWithResult(ImageSaver imageSaver, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (z) {
            imageSaver.IAuthTabCallback();
        } else {
            Function1<? super Throwable, Unit> function1 = imageSaver.onTransact;
            if (function1 == null) {
                int i4 = i3 + 87;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                function1 = null;
            }
            function1.invoke(new IllegalStateException("permission denied."));
            imageSaver.finish();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStubProxy + 55;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ ICustomTabsServiceDefault<String, Boolean> $requestPermissionLauncher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(ICustomTabsServiceDefault<String, Boolean> iCustomTabsServiceDefault, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$requestPermissionLauncher = iCustomTabsServiceDefault;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 125;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 19 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = ImageSaver.this.new onNavigationEvent(this.$requestPermissionLauncher, access13800Var);
            int i2 = onNavigationEvent + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 79;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (ImageSaver.onNavigationEvent(ImageSaver.this)) {
                ImageSaver.onTransact(ImageSaver.this);
            } else {
                int i7 = IAuthTabCallback + 27;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    this.$requestPermissionLauncher.onNavigationEvent("android.permission.WRITE_EXTERNAL_STORAGE");
                    int i8 = 78 / 0;
                } else {
                    this.$requestPermissionLauncher.onNavigationEvent("android.permission.WRITE_EXTERNAL_STORAGE");
                }
                int i9 = onNavigationEvent + 119;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ImageSaver imageSaver = (ImageSaver) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1875713989, iIntValue, -1, "im.toss.tds.sharebottomsheet.ImageSaver.onCreate.<anonymous>.<anonymous> (ImageSaver.kt:68)");
            }
            IPostMessageService_Parcel.asBinder asbinder = new IPostMessageService_Parcel.asBinder();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(imageSaver);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new ImageSaver$.ExternalSyntheticLambda1(imageSaver);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            ICustomTabsServiceDefault iCustomTabsServiceDefaultOnWarmupCompleted = prefetch.onWarmupCompleted(asbinder, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
            Unit unit = Unit.INSTANCE;
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(imageSaver);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iCustomTabsServiceDefaultOnWarmupCompleted);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback2 | zOnExtraCallback3)) {
                int i2 = IAuthTabCallbackStubProxy + 45;
                IAuthTabCallback_Parcel = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 52 / 0;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = imageSaver.new onNavigationEvent(iCustomTabsServiceDefaultOnWarmupCompleted, null);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                        int i4 = IAuthTabCallback_Parcel + 111;
                        IAuthTabCallbackStubProxy = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    LowLightBoostStateState.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f)), ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f), 0L, 0, cameraCaptureResultEmptyCameraCaptureResult, 390, 24);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback2 = QuirkSettingsLoader.Companion.onExtraCallback();
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null);
                    component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback2, false);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent2);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    LowLightBoostStateState.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f)), ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f), 0L, 0, cameraCaptureResultEmptyCameraCaptureResult, 390, 24);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = IAuthTabCallback_Parcel + 75;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 % 4;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(ImageSaver imageSaver, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 97;
        int i4 = i3 % 128;
        IAuthTabCallback_Parcel = i4;
        boolean z = false;
        if (i3 % 2 != 0 ? (i & 3) != 2 : (i & 4) != 3) {
            int i5 = i4 + 41;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i6 = IAuthTabCallback_Parcel + 47;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2004474653, i, -1, "im.toss.tds.sharebottomsheet.ImageSaver.onCreate.<anonymous> (ImageSaver.kt:67)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1875713989, true, new ImageSaver$.ExternalSyntheticLambda0(imageSaver), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private /* synthetic */ Object L$0;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = ImageSaver.this.new onExtraCallback(access13800Var);
            onextracallback.L$0 = obj;
            int i2 = onExtraCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws FileNotFoundException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws FileNotFoundException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[PHI: r14
          0x003d: PHI (r14v4 android.content.ContentResolver) = (r14v3 android.content.ContentResolver), (r14v9 android.content.ContentResolver) binds: [B:10:0x003b, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a0 A[Catch: all -> 0x00fd, TryCatch #0 {all -> 0x00fd, blocks: (B:19:0x009a, B:21:0x00a0, B:23:0x00c5, B:24:0x00c9, B:25:0x00cf, B:27:0x00d5, B:30:0x00e4, B:32:0x00f1, B:33:0x00f7, B:18:0x0090, B:15:0x0052), top: B:44:0x0052, inners: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d5 A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #0 {all -> 0x00fd, blocks: (B:19:0x009a, B:21:0x00a0, B:23:0x00c5, B:24:0x00c9, B:25:0x00cf, B:27:0x00d5, B:30:0x00e4, B:32:0x00f1, B:33:0x00f7, B:18:0x0090, B:15:0x0052), top: B:44:0x0052, inners: #2 }] */
        /* JADX WARN: Type inference failed for: r1v14, types: [android.content.Context, im.toss.tds.sharebottomsheet.ImageSaver, java.lang.Object] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws FileNotFoundException {
            ContentResolver contentResolver;
            Uri uriOnExtraCallbackWithResult;
            Object obj2;
            Throwable th;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i3 != 0) {
                contentResolver = ImageSaver.this.getContentResolver();
                uriOnExtraCallbackWithResult = ImageSaver.onExtraCallbackWithResult(ImageSaver.this);
                int i4 = 90 / 0;
                if (uriOnExtraCallbackWithResult == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    uriOnExtraCallbackWithResult = null;
                }
            } else {
                contentResolver = ImageSaver.this.getContentResolver();
                uriOnExtraCallbackWithResult = ImageSaver.onExtraCallbackWithResult(ImageSaver.this);
                if (uriOnExtraCallbackWithResult == null) {
                }
            }
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uriOnExtraCallbackWithResult);
            if (inputStreamOpenInputStream != null) {
                int i5 = onExtraCallback + 83;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                ?? r1 = ImageSaver.this;
                try {
                    try {
                        Result.Companion companion = Result.Companion;
                        Cookies_clearAll.onWarmupCompleted onwarmupcompleted = Cookies_clearAll.Companion;
                        ContentResolver contentResolver2 = r1.getContentResolver();
                        Intrinsics.checkNotNullExpressionValue(contentResolver2, "");
                        obj2 = Result.constructor-impl(onwarmupcompleted.onExtraCallbackWithResult(contentResolver2).onWarmupCompleted(ImageSaver.onExtraCallback((ImageSaver) r1)).onNavigationEvent(Bitmap.CompressFormat.JPEG).onWarmupCompleted(100).IAuthTabCallback(ByteStreamsKt.readBytes(inputStreamOpenInputStream)).IAuthTabCallback());
                        int i7 = onExtraCallbackWithResult + 29;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                    } finally {
                    }
                } finally {
                    if (Result.onNavigationEvent(obj2)) {
                    }
                    th = Result.exceptionOrNull-impl(obj2);
                    if (th != null) {
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(inputStreamOpenInputStream, (Throwable) null);
                }
                if (Result.onNavigationEvent(obj2)) {
                    int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                    Function0 function0 = (Function0) ImageSaver.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -2061542584, new Object[]{r1}, 2061542585);
                    if (function0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        function0 = null;
                    }
                    function0.invoke();
                    r1.finish();
                }
                th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                    Function1 function1IAuthTabCallback = ImageSaver.IAuthTabCallback(r1);
                    if (function1IAuthTabCallback == null) {
                        int i9 = onExtraCallback + 73;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i11 = onExtraCallbackWithResult + 115;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        function1IAuthTabCallback = null;
                    }
                    function1IAuthTabCallback.invoke(th);
                    r1.finish();
                }
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(inputStreamOpenInputStream, (Throwable) null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onExtraCallback(null), 2, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            super/*android.app.Activity*/.finish();
            overridePendingTransition(1, 0);
        } else {
            super/*android.app.Activity*/.finish();
            overridePendingTransition(0, 0);
        }
        int i3 = IAuthTabCallbackStubProxy + 69;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final Map<Uri, Pair<Function0<Unit>, Function1<Throwable, Unit>>> onWarmupCompleted() {
            Map<Uri, Pair<Function0<Unit>, Function1<Throwable, Unit>>> mapOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                mapOnNavigationEvent = ImageSaver.onNavigationEvent();
                int i3 = 82 / 0;
            } else {
                mapOnNavigationEvent = ImageSaver.onNavigationEvent();
            }
            int i4 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return mapOnNavigationEvent;
        }

        public final void onExtraCallbackWithResult(@NotNull Context context, @NotNull Uri uri, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(uri, "");
                Intrinsics.checkNotNullParameter(function0, "");
                Intrinsics.checkNotNullParameter(function1, "");
                onWarmupCompleted().containsKey(uri);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function1, "");
            if (!onWarmupCompleted().containsKey(uri)) {
                onWarmupCompleted().put(uri, getWrite.IAuthTabCallback(function0, function1));
                context.startActivity(new Intent(context, (Class<?>) ImageSaver.class).setData(uri));
                return;
            }
            int i3 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = access100 + 69;
        access000 = i % 128;
        if (i % 2 != 0) {
            int i2 = 98 / 0;
        }
    }

    public static final /* synthetic */ Function0 onWarmupCompleted(ImageSaver imageSaver) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Function0) onExtraCallbackWithResult(iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted3, -2061542584, new Object[]{imageSaver}, 2061542585);
    }

    private final boolean onWarmupCompleted() {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted3, -696114116, new Object[]{this}, 696114118)).booleanValue();
    }

    private static final Unit onExtraCallbackWithResult(ImageSaver imageSaver, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {imageSaver, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -969513899, objArr, 969513899);
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}

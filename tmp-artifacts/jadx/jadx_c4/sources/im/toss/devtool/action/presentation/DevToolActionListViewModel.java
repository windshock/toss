package im.toss.devtool.action.presentation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.tmoney.LiveCheckConstants;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$;
import im.toss.devtool.domain.usecase.RunDevToolActionUseCase;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.ALCAgeGenderGENDER;
import o.ALCFaceDetectionItem;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.GeckoHubImp;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UpdatePackageContent;
import o.access13800;
import o.access14000;
import o.access8100;
import o.findResAndMsg;
import o.getCornerRadius;
import o.getScopeType;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import o.ycxycx;
import o.zzad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DevToolActionListViewModel extends ViewModel {
    public static final Object Companion;
    public static final int IAuthTabCallback;
    private static long IAuthTabCallbackStubProxy;
    private static char IAuthTabCallback_Parcel;
    private static char ICustomTabsCallback;
    private static char access000;
    private static int access100;
    private static char extraCallback;
    private static int onActivityResized;
    private static char readTypedObject;
    private final HashMap<String, Long> IAuthTabCallbackDefault;
    private Object IAuthTabCallbackStub;
    private final RunDevToolActionUseCase asBinder;
    private final getScopeType asInterface;
    private final setRubIn<Object> getInterfaceDescriptor;
    private final Context onExtraCallback;
    private Object onExtraCallbackWithResult;
    private final zzad onNavigationEvent;
    private String onTransact;
    private final getCornerRadius<Object> onWarmupCompleted;
    private static final byte[] $$a = {60, -123, -116, -1};
    private static final int $$b = 134;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onMinimized = 1;
    private static int writeTypedObject = 0;
    private static int extraCallbackWithResult = 1;

    private static String $$c(byte b, byte b2, byte b3) {
        int i = (b * 2) + 4;
        int i2 = b3 * 2;
        byte[] bArr = $$a;
        int i3 = 110 - b2;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3 += i4;
            i++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i];
            i++;
        }
    }

    static {
        onActivityResized = 0;
        onWarmupCompleted();
        try {
            Object[] objArr = {null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(421297575);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getTouchSlop() >> 8)), 78 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 7398 - View.resolveSizeAndState(0, 0, 0), 677151543, false, (String) null, new Class[]{DefaultConstructorMarker.class});
            }
            Companion = ((Constructor) objOnExtraCallback).newInstance(objArr);
            IAuthTabCallback = 8;
            int i = onMinimized + 65;
            onActivityResized = i % 128;
            int i2 = i % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i4)) | i9;
        int i11 = (~((~i4) | i7 | i5)) | (~(i8 | i2));
        int i12 = i2 + i5 + i + (531708263 * i6) + ((-608630064) * i3);
        int i13 = i12 * i12;
        int i14 = ((i2 * (-1679524527)) - 150938974) + (i5 * (-1679524527)) + (i9 * 282) + (i10 * 282) + (i11 * 282) + ((-1679524245) * i) + ((-166744051) * i6) + (2062148848 * i3) + (i13 * (-865337344));
        switch ((i2 * (-228234701)) + 730857472 + ((-228234701) * i5) + (i9 * (-1010133554)) + (i10 * (-1010133554)) + ((-1010133554) * i11) + ((-1238368256) * i) + ((-45088768) * i6) + ((-419430400) * i3) + ((-1471938560) * i13) + (i14 * i14 * (-1617166336))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                DevToolActionListViewModel devToolActionListViewModel = (DevToolActionListViewModel) objArr[0];
                int i15 = 2 % 2;
                boolean zMediaMetadataCompat = devToolActionListViewModel.onNavigationEvent.MediaMetadataCompat();
                boolean zRemoteActionCompatParcelizer = devToolActionListViewModel.onNavigationEvent.RemoteActionCompatParcelizer();
                findResAndMsg findresandmsgIAuthTabCallback = ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(devToolActionListViewModel);
                try {
                    Object[] objArr2 = {devToolActionListViewModel, Boolean.valueOf(zMediaMetadataCompat), Boolean.valueOf(zRemoteActionCompatParcelizer), null};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2035496263);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 64992), 80 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ExpandableListView.getPackedPositionType(0L) + 7476, 1209256919, false, (String) null, new Class[]{DevToolActionListViewModel.class, Boolean.TYPE, Boolean.TYPE, access13800.class});
                    }
                    maybeUpdateAnimatable.onNavigationEvent(findresandmsgIAuthTabCallback, (CoroutineContext) null, (setRandomHost) null, (Function2) ((Constructor) objOnExtraCallback).newInstance(objArr2), 3, (Object) null);
                    int i16 = writeTypedObject + 89;
                    extraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                    return null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ CharSequence onExtraCallback(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 83;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact(str);
        }
        onTransact(str);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(DevToolActionListViewModel devToolActionListViewModel, String str) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 119;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback4 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback5 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback6 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(iIAuthTabCallback5, -788908663, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback4, new Object[]{devToolActionListViewModel, str}, 788908665, iIAuthTabCallback6);
        int i3 = writeTypedObject + 55;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DevToolActionListViewModel devToolActionListViewModel, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(devToolActionListViewModel, str);
        int i4 = writeTypedObject + 69;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onNavigationEvent(DevToolActionListViewModel devToolActionListViewModel, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(devToolActionListViewModel, str);
        int i4 = writeTypedObject + 123;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DevToolActionListViewModel devToolActionListViewModel, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 69;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(devToolActionListViewModel, str);
        int i4 = extraCallbackWithResult + 123;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    @Inject
    public DevToolActionListViewModel(@NotNull Context context, @NotNull RunDevToolActionUseCase runDevToolActionUseCase, @NotNull getScopeType getscopetype, @NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(runDevToolActionUseCase, "");
        Intrinsics.checkNotNullParameter(getscopetype, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.onExtraCallback = context;
        this.asBinder = runDevToolActionUseCase;
        this.asInterface = getscopetype;
        this.onNavigationEvent = zzadVar;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1484006637);
        getCornerRadius<Object> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(((Field) (objOnExtraCallback == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (15705 - ExpandableListView.getPackedPositionType(0L)), 32 - TextUtils.lastIndexOf("", '0', 0), 7293 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1765071485, false, "onExtraCallback", (Class[]) null) : objOnExtraCallback)).get(null));
        this.onWarmupCompleted = getcornerradiusOnNavigationEvent;
        this.getInterfaceDescriptor = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
        this.onTransact = "";
        this.IAuthTabCallbackDefault = new HashMap<>();
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DevToolActionListViewModel devToolActionListViewModel = (DevToolActionListViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 79;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getScopeType getscopetype = devToolActionListViewModel.asInterface;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 43;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return getscopetype;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback$e304490(DevToolActionListViewModel devToolActionListViewModel, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        Object obj2 = null;
        devToolActionListViewModel.IAuthTabCallbackStub = obj;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 1;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public static final /* synthetic */ getCornerRadius asBinder(DevToolActionListViewModel devToolActionListViewModel) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 1;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<Object> getcornerradius = devToolActionListViewModel.onWarmupCompleted;
        int i5 = i2 + 11;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public static final /* synthetic */ void onExtraCallback$3e81929a(DevToolActionListViewModel devToolActionListViewModel, String str, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            IAuthTabCallback(iIAuthTabCallback2, 1171978520, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, new Object[]{devToolActionListViewModel, str, obj}, -1171978517, iIAuthTabCallback3);
            int i3 = 19 / 0;
        } else {
            int iIAuthTabCallback4 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback5 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback6 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            IAuthTabCallback(iIAuthTabCallback5, 1171978520, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback4, new Object[]{devToolActionListViewModel, str, obj}, -1171978517, iIAuthTabCallback6);
        }
        int i4 = writeTypedObject + 3;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallback$58d8e52c(DevToolActionListViewModel devToolActionListViewModel) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 95;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Object obj2 = devToolActionListViewModel.IAuthTabCallbackStub;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 27;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return obj2;
        }
        throw null;
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(DevToolActionListViewModel devToolActionListViewModel) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 19;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = devToolActionListViewModel.onTransact;
        if (i3 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ RunDevToolActionUseCase onNavigationEvent(DevToolActionListViewModel devToolActionListViewModel) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 81;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        RunDevToolActionUseCase runDevToolActionUseCase = devToolActionListViewModel.asBinder;
        int i5 = i3 + 89;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return runDevToolActionUseCase;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        DevToolActionListViewModel devToolActionListViewModel = (DevToolActionListViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 105;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Context context = devToolActionListViewModel.onExtraCallback;
        int i5 = i3 + 39;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return context;
        }
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(DevToolActionListViewModel devToolActionListViewModel, List list, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 53;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            devToolActionListViewModel.IAuthTabCallback((List<Object>) list, (access13800<? super Map<String, Boolean>>) access13800Var);
            obj.hashCode();
            throw null;
        }
        Object objIAuthTabCallback = devToolActionListViewModel.IAuthTabCallback((List<Object>) list, (access13800<? super Map<String, Boolean>>) access13800Var);
        int i3 = writeTypedObject + 93;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return objIAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ List onWarmupCompleted(DevToolActionListViewModel devToolActionListViewModel, List list, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 29;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List<Object> listOnExtraCallback = devToolActionListViewModel.onExtraCallback((List<Object>) list, str);
        int i4 = writeTypedObject + 67;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return listOnExtraCallback;
        }
        throw null;
    }

    public final setRubIn<Object> onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 27;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        setRubIn<Object> setrubin = this.getInterfaceDescriptor;
        int i5 = i3 + 75;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return setrubin;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        DevToolActionListViewModel devToolActionListViewModel = (DevToolActionListViewModel) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 39;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        devToolActionListViewModel.onExtraCallbackWithResult = obj;
        int i5 = i2 + 95;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final Object onNavigationEvent$15da5ecc() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 19;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Object obj = this.onExtraCallbackWithResult;
        int i5 = i3 + 39;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final void IAuthTabCallback$252026d8(@NotNull Object obj) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        findResAndMsg findresandmsgIAuthTabCallback = ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this);
        try {
            Object[] objArr = {this, obj, null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1408679771);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22156 - AndroidCharacter.getMirror('0')), 80 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getFadingEdgeLength() >> 16) + 7920, -1656111563, false, (String) null, new Class[]{DevToolActionListViewModel.class, (Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (33477 - ExpandableListView.getPackedPositionChild(0L)), 21 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 10881 - TextUtils.lastIndexOf("", '0', 0)), access13800.class});
            }
            maybeUpdateAnimatable.onNavigationEvent(findresandmsgIAuthTabCallback, (CoroutineContext) null, (setRandomHost) null, (Function2) ((Constructor) objOnExtraCallback).newInstance(objArr), 3, (Object) null);
            int i2 = extraCallbackWithResult + 115;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static final Unit asInterface(DevToolActionListViewModel devToolActionListViewModel, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 33;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            devToolActionListViewModel.asBinder$2f0e2754(str);
            throw null;
        }
        Object objAsBinder$2f0e2754 = devToolActionListViewModel.asBinder$2f0e2754(str);
        if (objAsBinder$2f0e2754 != null) {
            devToolActionListViewModel.IAuthTabCallback$252026d8(objAsBinder$2f0e2754);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = writeTypedObject + 101;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onNavigationEvent(str, (Function0<Unit>) new DevToolActionListViewModel$.ExternalSyntheticLambda0(this, str));
        int i2 = extraCallbackWithResult + 51;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        DevToolActionListViewModel devToolActionListViewModel = (DevToolActionListViewModel) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 115;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object objAsBinder$2f0e2754 = devToolActionListViewModel.asBinder$2f0e2754(str);
        if (objAsBinder$2f0e2754 != null) {
            findResAndMsg findresandmsgIAuthTabCallback = ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(devToolActionListViewModel);
            UpdatePackageContent updatePackageContent = UpdatePackageContent.onExtraCallback;
            try {
                Object[] objArr2 = {devToolActionListViewModel, objAsBinder$2f0e2754, null};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1195630477);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 36724), 87 - TextUtils.lastIndexOf("", '0', 0), 7999 - TextUtils.indexOf((CharSequence) "", '0'), -1979916573, false, (String) null, new Class[]{DevToolActionListViewModel.class, (Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (33478 - TextUtils.indexOf("", "", 0)), 20 - TextUtils.indexOf((CharSequence) "", '0'), 10881 - MotionEvent.axisFromString("")), access13800.class});
                }
                maybeUpdateAnimatable.onNavigationEvent(findresandmsgIAuthTabCallback, updatePackageContent, (setRandomHost) null, (Function2) ((Constructor) objOnExtraCallback).newInstance(objArr2), 2, (Object) null);
                int i4 = writeTypedObject + 117;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = writeTypedObject + 27;
        extraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 33 / 0;
        }
        return unit;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 113;
            $10 = i5 % 128;
            char c = 1;
            if (i5 % 2 != 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            int i6 = 58224;
            while (i2 < 16) {
                int i7 = $10 + 37;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (readTypedObject ^ 1094535280733222934L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(extraCallback);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int i11 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int offsetAfter = 12434 - TextUtils.getOffsetAfter("", 0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSizeAndState, i11, offsetAfter, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i12 = i6;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (access000 ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ICustomTabsCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 10, 12435 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 = i12 - 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 13 - Process.getGidForName(""), 19900 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final void onExtraCallbackWithResult(@NotNull String str) throws Throwable {
        Object objAsBinder$2f0e2754;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 105;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            objAsBinder$2f0e2754 = asBinder$2f0e2754(str);
            int i3 = 44 / 0;
            if (objAsBinder$2f0e2754 == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            objAsBinder$2f0e2754 = asBinder$2f0e2754(str);
            if (objAsBinder$2f0e2754 == null) {
                return;
            }
        }
        int i4 = extraCallbackWithResult + 33;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            IAuthTabCallback(iIAuthTabCallback2, 347772651, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this, objAsBinder$2f0e2754}, -347772647, iIAuthTabCallback3);
            return;
        }
        int iIAuthTabCallback4 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback5 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback6 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(iIAuthTabCallback5, 347772651, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback4, new Object[]{this, objAsBinder$2f0e2754}, -347772647, iIAuthTabCallback6);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(DevToolActionListViewModel devToolActionListViewModel, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 69;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object objAsBinder$2f0e2754 = devToolActionListViewModel.asBinder$2f0e2754(str);
        if (objAsBinder$2f0e2754 != null) {
            int i4 = writeTypedObject + 9;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            devToolActionListViewModel.onExtraCallbackWithResult$252026d8(objAsBinder$2f0e2754);
            if (i5 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = extraCallbackWithResult + 13;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public final void asInterface(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        b(new char[]{18542, 53378, 25649, 38039}, (ViewConfiguration.getPressedStateDuration() >> 16) + 4, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        onNavigationEvent(sb.toString(), (Function0<Unit>) new DevToolActionListViewModel$.ExternalSyntheticLambda2(this, str));
        int i2 = writeTypedObject + 43;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull List<String> list) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Object objIAuthTabCallback = this.IAuthTabCallbackStub;
        if (objIAuthTabCallback == null) {
            int i2 = extraCallbackWithResult + 87;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            objIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback();
            if (((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16777247, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7366)).isInstance(objIAuthTabCallback)) {
                int i4 = extraCallbackWithResult + 1;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
            } else {
                objIAuthTabCallback = null;
            }
            if (objIAuthTabCallback == null) {
                return;
            }
        }
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-217933743);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), (Process.myTid() >> 22) + 31, 7367 - (KeyEvent.getMaxKeyCode() >> 16), -1035835711, false, "IAuthTabCallback", new Class[0]);
            }
            Collection collection = (Collection) ((Method) objOnExtraCallback).invoke(objIAuthTabCallback, null);
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1335731427);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31, Color.blue(0) + 7367, 2128435827, false, "onNavigationEvent", new Class[0]);
            }
            List listPlus = CollectionsKt.plus(collection, (Iterable) ((Method) objOnExtraCallback2).invoke(objIAuthTabCallback, null));
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(listPlus, 10)), 16));
            Iterator it = listPlus.iterator();
            while (!(!it.hasNext())) {
                Object next = it.next();
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1988707221);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (33478 - (Process.myTid() >> 22)), 21 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 10881 - Process.getGidForName(""), 1204403461, false, "onWarmupCompleted", new Class[0]);
                }
                linkedHashMap.put(((Method) objOnExtraCallback3).invoke(next, null), next);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                int i6 = extraCallbackWithResult + 9;
                writeTypedObject = i6 % 128;
                int i7 = i6 % 2;
                Object obj = linkedHashMap.get((String) it2.next());
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            onNavigationEvent(arrayList);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $11 + 113;
        $10 = i3 % 128;
        char c3 = 3;
        if (i3 % 2 != 0) {
            int i4 = 4 / 3;
        }
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $11 + 27;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int edgeSlop = 43 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1451;
                    byte b = (byte) ($$a[c3] + 1);
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cAlpha, edgeSlop, packedPositionGroup, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char cAxisFromString = (char) (49122 - MotionEvent.axisFromString(""));
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 44;
                        int offsetAfter = 1494 - TextUtils.getOffsetAfter("", 0);
                        byte b3 = $$a[c3];
                        byte b4 = (byte) (b3 + 1);
                        byte b5 = (byte) (-b3);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cAxisFromString, iIndexOf, offsetAfter, 1533236389, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            c2 = 3;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 23972), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, 22939 - View.resolveSize(0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        } else {
                            c2 = 3;
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45849 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 28, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (access100 ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackStubProxy ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback_Parcel ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            c3 = c2;
                            cArr5 = cArr5;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
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
        objArr[0] = new String(cArr6);
    }

    public final void IAuthTabCallback(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        b(new char[]{56400, 9490, 39342, 11979, 1750, 16224, 30169, 20765, 40090, 46818, 41794, 55058, 3350, 3501}, 14 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        onNavigationEvent(sb.toString(), (Function0<Unit>) new DevToolActionListViewModel$.ExternalSyntheticLambda3(this, str));
        int i2 = extraCallbackWithResult + 125;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback(DevToolActionListViewModel devToolActionListViewModel, String str) throws Throwable {
        Object next;
        int i = 2 % 2;
        Object objIAuthTabCallback = devToolActionListViewModel.onWarmupCompleted.IAuthTabCallback();
        Object obj = null;
        if (!((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) Color.alpha(0), TextUtils.lastIndexOf("", '0', 0) + 32, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7367)).isInstance(objIAuthTabCallback)) {
            objIAuthTabCallback = null;
        }
        if (objIAuthTabCallback != null) {
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2098975886);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 7367 - ExpandableListView.getPackedPositionGroup(0L), -1281042974, false, "onExtraCallback", new Class[0]);
                }
                Object objInvoke = ((Method) objOnExtraCallback).invoke(objIAuthTabCallback, null);
                if (objInvoke != null) {
                    int i2 = extraCallbackWithResult + 53;
                    writeTypedObject = i2 % 128;
                    int i3 = i2 % 2;
                    Iterator it = ((Iterable) objInvoke).iterator();
                    while (it.hasNext()) {
                        int i4 = writeTypedObject + 123;
                        extraCallbackWithResult = i4 % 128;
                        if (i4 % 2 == 0) {
                            next = it.next();
                            try {
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1988707221);
                                if (objOnExtraCallback2 == null) {
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 33477), ExpandableListView.getPackedPositionChild(0L) + 22, TextUtils.getOffsetBefore("", 0) + 10882, 1204403461, false, "onWarmupCompleted", new Class[0]);
                                }
                                boolean zAreEqual = Intrinsics.areEqual(((Method) objOnExtraCallback2).invoke(next, null), str);
                                int i5 = 41 / 0;
                                if (zAreEqual) {
                                    obj = next;
                                    break;
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } else {
                            next = it.next();
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1988707221);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33477), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20, TextUtils.lastIndexOf("", '0', 0) + 10883, 1204403461, false, "onWarmupCompleted", new Class[0]);
                            }
                            if (Intrinsics.areEqual(((Method) objOnExtraCallback3).invoke(next, null), str)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    if (obj != null) {
                        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
                        IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 802804775, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, new Object[]{devToolActionListViewModel, obj}, -802804769, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                        int i6 = extraCallbackWithResult + 103;
                        writeTypedObject = i6 % 128;
                        int i7 = i6 % 2;
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent(String str, Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Long l = this.IAuthTabCallbackDefault.get(str);
        if (jUptimeMillis - (l != null ? l.longValue() : 0L) >= 500) {
            int i4 = extraCallbackWithResult + 111;
            writeTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                this.IAuthTabCallbackDefault.put(str, Long.valueOf(jUptimeMillis));
                function0.invoke();
            } else {
                this.IAuthTabCallbackDefault.put(str, Long.valueOf(jUptimeMillis));
                function0.invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        boolean zBooleanValue;
        Object objInvoke;
        DevToolActionListViewModel devToolActionListViewModel = (DevToolActionListViewModel) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1895961919);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 33478), 22 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 10882, 1078127535, false, "onExtraCallback", new Class[0]);
            }
            Object obj2 = null;
            Object objInvoke2 = ((Method) objOnExtraCallback).invoke(obj, null);
            if (((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (TextUtils.getOffsetAfter("", 0) + 59697), Color.red(0) + 17, (ViewConfiguration.getWindowTouchSlop() >> 8) + 10973)).isInstance(objInvoke2)) {
                int i2 = writeTypedObject + 111;
                extraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
            } else {
                objInvoke2 = null;
            }
            if (objInvoke2 != null) {
                int i3 = extraCallbackWithResult + 7;
                writeTypedObject = i3 % 128;
                int i4 = i3 % 2;
                Object objIAuthTabCallback = devToolActionListViewModel.onWarmupCompleted.IAuthTabCallback();
                if (((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.normalizeMetaState(0) + 31, 7368 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).isInstance(objIAuthTabCallback)) {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1499541675);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 31 - View.MeasureSpec.getSize(0), 7367 - View.MeasureSpec.makeMeasureSpec(0, 0), -1747045947, false, "onExtraCallbackWithResult", new Class[0]);
                    }
                    Map map = (Map) ((Method) objOnExtraCallback2).invoke(objIAuthTabCallback, null);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1988707221);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (33479 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 21 - (ViewConfiguration.getFadingEdgeLength() >> 16), 10882 - Color.green(0), 1204403461, false, "onWarmupCompleted", new Class[0]);
                    }
                    Boolean bool = (Boolean) map.get(((Method) objOnExtraCallback3).invoke(obj, null));
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        int i5 = writeTypedObject + 1;
                        extraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        zBooleanValue = false;
                    }
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1499541675);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), Color.green(0) + 31, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7367, -1747045947, false, "onExtraCallbackWithResult", new Class[0]);
                    }
                    Map map2 = (Map) ((Method) objOnExtraCallback4).invoke(objIAuthTabCallback, null);
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1988707221);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (33478 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 21 - (ViewConfiguration.getLongPressTimeout() >> 16), 10882 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1204403461, false, "onWarmupCompleted", new Class[0]);
                    }
                    Object[] objArr2 = {objIAuthTabCallback, null, null, null, access8100.IAuthTabCallback(map2, getWrite.IAuthTabCallback(((Method) objOnExtraCallback5).invoke(obj, null), Boolean.valueOf(!zBooleanValue))), 7, null};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(600378940);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), Color.blue(0) + 31, 7367 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 311029932, false, "IAuthTabCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) TextUtils.getCapsMode("", 0, 0), MotionEvent.axisFromString("") + 32, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7367), List.class, List.class, List.class, Map.class, Integer.TYPE, Object.class});
                    }
                    Object objInvoke3 = ((Method) objOnExtraCallback6).invoke(null, objArr2);
                    Object obj3 = devToolActionListViewModel.IAuthTabCallbackStub;
                    if (obj3 != null) {
                        Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1499541675);
                        if (objOnExtraCallback7 == null) {
                            objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, 7366 - MotionEvent.axisFromString(""), -1747045947, false, "onExtraCallbackWithResult", new Class[0]);
                        }
                        Object[] objArr3 = {obj3, null, null, null, ((Method) objOnExtraCallback7).invoke(objInvoke3, null), 7, null};
                        Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(600378940);
                        if (objOnExtraCallback8 == null) {
                            objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 32, Color.rgb(0, 0, 0) + 16784583, 311029932, false, "IAuthTabCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((Process.getThreadPriority(0) + 20) >> 6), 31 - (Process.myPid() >> 22), 7367 - (ViewConfiguration.getTapTimeout() >> 16)), List.class, List.class, List.class, Map.class, Integer.TYPE, Object.class});
                        }
                        objInvoke = ((Method) objOnExtraCallback8).invoke(null, objArr3);
                        int i7 = extraCallbackWithResult + 79;
                        writeTypedObject = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        objInvoke = null;
                    }
                    devToolActionListViewModel.IAuthTabCallbackStub = objInvoke;
                    devToolActionListViewModel.onWarmupCompleted.onNavigationEvent(objInvoke3);
                }
            }
            findResAndMsg findresandmsgIAuthTabCallback = ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(devToolActionListViewModel);
            Object[] objArr4 = {devToolActionListViewModel, obj, objInvoke2, null};
            Object objOnExtraCallback9 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1008514341);
            if (objOnExtraCallback9 == null) {
                objOnExtraCallback9 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), Gravity.getAbsoluteGravity(0, 0) + 73, 8162 - TextUtils.getOffsetAfter("", 0), -224152501, false, (String) null, new Class[]{DevToolActionListViewModel.class, (Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (33478 - TextUtils.indexOf("", "", 0)), TextUtils.lastIndexOf("", '0', 0) + 22, KeyEvent.normalizeMetaState(0) + 10882), (Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (59697 - KeyEvent.normalizeMetaState(0)), 17 - View.combineMeasuredStates(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10972), access13800.class});
            }
            maybeUpdateAnimatable.onNavigationEvent(findresandmsgIAuthTabCallback, (CoroutineContext) null, (setRandomHost) null, (Function2) ((Constructor) objOnExtraCallback9).newInstance(objArr4), 3, (Object) null);
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(List<Object> list, access13800<? super Map<String, Boolean>> access13800Var) throws Throwable {
        Object obj;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1895961919);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (33478 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10881, 1078127535, false, "onExtraCallback", new Class[0]);
                }
                Pair pairIAuthTabCallback = null;
                Object objInvoke = ((Method) objOnExtraCallback).invoke(obj2, null);
                if (((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59697), KeyEvent.keyCodeFromString("") + 17, (ViewConfiguration.getLongPressTimeout() >> 16) + 10973)).isInstance(objInvoke)) {
                    int i2 = writeTypedObject + 77;
                    extraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                } else {
                    objInvoke = null;
                }
                if (objInvoke == null) {
                    int i3 = writeTypedObject + 27;
                    extraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        pairIAuthTabCallback.hashCode();
                        throw null;
                    }
                } else {
                    try {
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1988707221);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 33478), 21 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10882, 1204403461, false, "onWarmupCompleted", new Class[0]);
                        }
                        Object objInvoke2 = ((Method) objOnExtraCallback2).invoke(obj2, null);
                        try {
                            Result.Companion companion = Result.Companion;
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23461046);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 59697), KeyEvent.keyCodeFromString("") + 17, 10973 - ExpandableListView.getPackedPositionType(0L), -807731750, false, "onWarmupCompleted", new Class[0]);
                            }
                            try {
                                obj = Result.constructor-impl(access14000.onNavigationEvent(((Boolean) ((Function1) ((Method) objOnExtraCallback3).invoke(objInvoke, null)).invoke(this.onExtraCallback)).booleanValue()));
                            } catch (Throwable th2) {
                                th = th2;
                                Result.Companion companion2 = Result.Companion;
                                obj = Result.constructor-impl(ResultKt.createFailure(th));
                                Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
                                if (Result.onExtraCallback(obj)) {
                                }
                                pairIAuthTabCallback = getWrite.IAuthTabCallback(objInvoke2, obj);
                                if (pairIAuthTabCallback == null) {
                                }
                            }
                            Boolean boolOnNavigationEvent2 = access14000.onNavigationEvent(false);
                            if (Result.onExtraCallback(obj)) {
                                obj = boolOnNavigationEvent2;
                            }
                            pairIAuthTabCallback = getWrite.IAuthTabCallback(objInvoke2, obj);
                        } catch (Throwable th3) {
                            Throwable cause = th3.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        Throwable cause2 = th4.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th4;
                    }
                }
                if (pairIAuthTabCallback == null) {
                    int i4 = writeTypedObject + 83;
                    extraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    arrayList.add(pairIAuthTabCallback);
                }
            } catch (Throwable th5) {
                Throwable cause3 = th5.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th5;
            }
        }
        return access8100.onExtraCallbackWithResult(arrayList);
    }

    public final void onExtraCallbackWithResult$252026d8(@NotNull Object obj) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        findResAndMsg findresandmsgIAuthTabCallback = ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this);
        try {
            Object[] objArr = {this, obj, null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1780750284);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), ImageFormat.getBitsPerPixel(0) + 87, 8325 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1533339996, false, (String) null, new Class[]{DevToolActionListViewModel.class, (Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (33477 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.lastIndexOf("", '0', 0) + 22, 10882 - (Process.myTid() >> 22)), access13800.class});
            }
            maybeUpdateAnimatable.onNavigationEvent(findresandmsgIAuthTabCallback, (CoroutineContext) null, (setRandomHost) null, (Function2) ((Constructor) objOnExtraCallback).newInstance(objArr), 3, (Object) null);
            int i2 = writeTypedObject + 3;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void onNavigationEvent(@NotNull List<Object> list) throws Throwable {
        Object objInvoke;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Object obj = this.IAuthTabCallbackStub;
        if (obj != null) {
            int i2 = extraCallbackWithResult + 3;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            try {
                Object[] objArr = {obj, null, list, null, null, 13, null};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(600378940);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 31 - TextUtils.indexOf("", "", 0), ExpandableListView.getPackedPositionGroup(0L) + 7367, 311029932, false, "IAuthTabCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 31 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 7367 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), List.class, List.class, List.class, Map.class, Integer.TYPE, Object.class});
                }
                objInvoke = ((Method) objOnExtraCallback).invoke(null, objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else {
            int i4 = writeTypedObject + 123;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            objInvoke = null;
        }
        this.IAuthTabCallbackStub = objInvoke;
        Object objIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback();
        if (((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 30, TextUtils.getTrimmedLength("") + 7367)).isInstance(objIAuthTabCallback)) {
            getCornerRadius<Object> getcornerradius = this.onWarmupCompleted;
            Object[] objArr2 = {objIAuthTabCallback, null, list, null, null, 13, null};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(600378940);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 32, 7366 - TextUtils.lastIndexOf("", '0'), 311029932, false, "IAuthTabCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((-1) - MotionEvent.axisFromString("")), (ViewConfiguration.getTapTimeout() >> 16) + 31, ExpandableListView.getPackedPositionType(0L) + 7367), List.class, List.class, List.class, Map.class, Integer.TYPE, Object.class});
            }
            getcornerradius.onNavigationEvent(((Method) objOnExtraCallback2).invoke(null, objArr2));
        }
        findResAndMsg findresandmsgIAuthTabCallback = ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this);
        Object[] objArr3 = {this, list, null};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1948136509);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), AndroidCharacter.getMirror('0') + '#', 8523 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1163840173, false, (String) null, new Class[]{DevToolActionListViewModel.class, List.class, access13800.class});
        }
        maybeUpdateAnimatable.onNavigationEvent(findresandmsgIAuthTabCallback, (CoroutineContext) null, (setRandomHost) null, (Function2) ((Constructor) objOnExtraCallback3).newInstance(objArr3), 3, (Object) null);
        int i6 = writeTypedObject + 45;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        Object objInvoke;
        DevToolActionListViewModel devToolActionListViewModel = (DevToolActionListViewModel) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = devToolActionListViewModel.IAuthTabCallbackStub;
        try {
            if (obj2 != null) {
                int i2 = extraCallbackWithResult + 123;
                writeTypedObject = i2 % 128;
                if (i2 % 2 != 0) {
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2098975886);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 31 - (ViewConfiguration.getFadingEdgeLength() >> 16), 7367 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1281042974, false, "onExtraCallback", new Class[0]);
                    }
                    Object[] objArr2 = {obj2, CollectionsKt.minus((Iterable) ((Method) objOnExtraCallback).invoke(obj2, null), obj), null, null, null, 86, null};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(600378940);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (Process.myPid() >> 22) + 31, 7367 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 311029932, false, "IAuthTabCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (Process.myTid() >> 22) + 31, 7367 - (Process.myTid() >> 22)), List.class, List.class, List.class, Map.class, Integer.TYPE, Object.class});
                    }
                    objInvoke = ((Method) objOnExtraCallback2).invoke(null, objArr2);
                } else {
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2098975886);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 32, TextUtils.indexOf((CharSequence) "", '0', 0) + 7368, -1281042974, false, "onExtraCallback", new Class[0]);
                    }
                    Object[] objArr3 = {obj2, CollectionsKt.minus((Iterable) ((Method) objOnExtraCallback3).invoke(obj2, null), obj), null, null, null, 14, null};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(600378940);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), View.MeasureSpec.getSize(0) + 31, 7368 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 311029932, false, "IAuthTabCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ExpandableListView.getPackedPositionGroup(0L), 31 - (Process.myTid() >> 22), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7366), List.class, List.class, List.class, Map.class, Integer.TYPE, Object.class});
                    }
                    objInvoke = ((Method) objOnExtraCallback4).invoke(null, objArr3);
                }
            } else {
                int i3 = extraCallbackWithResult + 111;
                writeTypedObject = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 5 / 2;
                }
                objInvoke = null;
            }
            devToolActionListViewModel.IAuthTabCallbackStub = objInvoke;
            Object objIAuthTabCallback = devToolActionListViewModel.onWarmupCompleted.IAuthTabCallback();
            if (((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 30, 7368 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).isInstance(objIAuthTabCallback)) {
                int i5 = writeTypedObject + 103;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                getCornerRadius<Object> getcornerradius = devToolActionListViewModel.onWarmupCompleted;
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2098975886);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, ExpandableListView.getPackedPositionChild(0L) + 7368, -1281042974, false, "onExtraCallback", new Class[0]);
                }
                Object[] objArr4 = {objIAuthTabCallback, CollectionsKt.minus((Iterable) ((Method) objOnExtraCallback5).invoke(objIAuthTabCallback, null), obj), null, null, null, 14, null};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(600378940);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 31, 7367 - (ViewConfiguration.getPressedStateDuration() >> 16), 311029932, false, "IAuthTabCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) Drawable.resolveOpacity(0, 0), 32 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 7367), List.class, List.class, List.class, Map.class, Integer.TYPE, Object.class});
                }
                getcornerradius.onNavigationEvent(((Method) objOnExtraCallback6).invoke(null, objArr4));
            }
            findResAndMsg findresandmsgIAuthTabCallback = ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(devToolActionListViewModel);
            Object[] objArr5 = {devToolActionListViewModel, obj, null};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(428808055);
            if (objOnExtraCallback7 == null) {
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), 79 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7760, 684714471, false, (String) null, new Class[]{DevToolActionListViewModel.class, (Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33478), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 21, 10882 - KeyEvent.keyCodeFromString("")), access13800.class});
            }
            maybeUpdateAnimatable.onNavigationEvent(findresandmsgIAuthTabCallback, (CoroutineContext) null, (setRandomHost) null, (Function2) ((Constructor) objOnExtraCallback7).newInstance(objArr5), 3, (Object) null);
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final void onNavigationEvent(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object objIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback();
        if (!(!((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) KeyEvent.getDeadChar(0, 0), 31 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 7366 - ExpandableListView.getPackedPositionChild(0L))).isInstance(objIAuthTabCallback))) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1171978520, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this, str, objIAuthTabCallback}, -1171978517, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
        }
        int i4 = extraCallbackWithResult + 59;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        DevToolActionListViewModel devToolActionListViewModel = (DevToolActionListViewModel) objArr[0];
        String str = (String) objArr[1];
        Object obj = objArr[2];
        int i = 2 % 2;
        devToolActionListViewModel.onTransact = str;
        findResAndMsg findresandmsgIAuthTabCallback = ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(devToolActionListViewModel);
        GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
        try {
            Object[] objArr2 = {str, devToolActionListViewModel, obj, null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(535146228);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 24825), AndroidCharacter.getMirror('0') + 26, 8088 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 782585956, false, (String) null, new Class[]{String.class, DevToolActionListViewModel.class, (Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 32 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 7367 - (KeyEvent.getMaxKeyCode() >> 16)), access13800.class});
            }
            maybeUpdateAnimatable.onNavigationEvent(findresandmsgIAuthTabCallback, geckoHubImpIAuthTabCallback, (setRandomHost) null, (Function2) ((Constructor) objOnExtraCallback).newInstance(objArr2), 2, (Object) null);
            int i2 = writeTypedObject + 23;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final CharSequence onTransact(String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = {ALCFaceDetectionItem.onNavigationEvent.onNavigationEvent(ALCFaceDetectionItem.Companion, str, null, 2, null)};
        String str2 = (String) ALCAgeGenderGENDER.onExtraCallback(343121645, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), objArr, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -343121645);
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        a((char) (58573 - View.MeasureSpec.getMode(0)), 1188445583 + (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{7838, 3295, 42131}, new char[]{8326, 63159, 12950, 55795}, new char[]{36810, 54845, 52550, 13028}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        b(new char[]{61787, 37582, ' ', 24437}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = writeTypedObject + 59;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    private final List<Object> onExtraCallback(List<Object> list, String str) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a((char) (10216 - Drawable.resolveOpacity(0, 0)), (-107793333) - Color.rgb(0, 0, 0), new char[]{21591}, new char[]{8326, 63159, 12950, 55795}, new char[]{19386, 37684, 59642, 46631}, objArr);
        String strReplace$default = StringsKt.replace$default(str, ((String) objArr[0]).intern(), "", false, 4, (Object) null);
        Object[] objArr2 = new Object[1];
        a((char) (10215 - TextUtils.lastIndexOf("", '0', 0)), Color.blue(0) - 91016117, new char[]{21591}, new char[]{8326, 63159, 12950, 55795}, new char[]{19386, 37684, 59642, 46631}, objArr2);
        Pattern patternCompile = Pattern.compile(CollectionsKt.joinToString$default(StringsKt.split$default(str, new String[]{((String) objArr2[0]).intern()}, false, 0, 6, (Object) null), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new DevToolActionListViewModel$.ExternalSyntheticLambda1(), 30, (Object) null), 2);
        ArrayList arrayList = new ArrayList();
        int i2 = extraCallbackWithResult + 57;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 % 2;
        }
        for (Object obj : list) {
            int i4 = extraCallbackWithResult + 1;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1988707221);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (33478 - (ViewConfiguration.getTapTimeout() >> 16)), 21 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 10882 - Color.green(0), 1204403461, false, "onWarmupCompleted", new Class[0]);
                }
                String str2 = (String) ((Method) objOnExtraCallback).invoke(obj, null);
                Object[] objArr3 = new Object[1];
                b(new char[]{24434, 17912}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr3);
                boolean zContains = StringsKt.contains(StringsKt.replace$default(str2, ((String) objArr3[0]).intern(), "", false, 4, (Object) null), strReplace$default, true);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-916710847);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (33478 - View.MeasureSpec.makeMeasureSpec(0, 0)), 21 - KeyEvent.keyCodeFromString(""), View.getDefaultSize(0, 0) + 10882, -132324143, false, "IAuthTabCallbackDefault", new Class[0]);
                }
                boolean zMatches = patternCompile.matcher((CharSequence) ((Method) objOnExtraCallback2).invoke(obj, null)).matches();
                if (!zContains) {
                    int i6 = extraCallbackWithResult + 29;
                    writeTypedObject = i6 % 128;
                    int i7 = i6 % 2;
                    if (zMatches) {
                    }
                }
                arrayList.add(obj);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return CollectionsKt.distinct(arrayList);
    }

    private final Object asBinder$2f0e2754(String str) throws Throwable {
        Object next;
        int i = 2 % 2;
        Object objIAuthTabCallback = this.IAuthTabCallbackStub;
        Object obj = null;
        if (objIAuthTabCallback == null) {
            objIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback();
            if (!((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30, Gravity.getAbsoluteGravity(0, 0) + 7367)).isInstance(objIAuthTabCallback)) {
                objIAuthTabCallback = null;
            } else {
                int i2 = writeTypedObject + 79;
                extraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
            }
            if (objIAuthTabCallback == null) {
                int i3 = writeTypedObject + 1;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
        }
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1335731427);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), TextUtils.lastIndexOf("", '0', 0) + 32, 7367 - TextUtils.getOffsetAfter("", 0), 2128435827, false, "onNavigationEvent", new Class[0]);
            }
            Iterator it = ((Iterable) ((Method) objOnExtraCallback).invoke(objIAuthTabCallback, null)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1988707221);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33478), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 20, 10882 - Color.red(0), 1204403461, false, "onWarmupCompleted", new Class[0]);
                }
                if (Intrinsics.areEqual(((Method) objOnExtraCallback2).invoke(next, null), str)) {
                    int i5 = writeTypedObject + 71;
                    extraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    break;
                }
            }
            if (next == null) {
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-217933743);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (Process.myTid() >> 22) + 31, 7367 - Color.red(0), -1035835711, false, "IAuthTabCallback", new Class[0]);
                }
                Iterator it2 = ((Iterable) ((Method) objOnExtraCallback3).invoke(objIAuthTabCallback, null)).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    Object next2 = it2.next();
                    try {
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1988707221);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 33478), 21 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10882, 1204403461, false, "onWarmupCompleted", new Class[0]);
                        }
                        if (Intrinsics.areEqual(((Method) objOnExtraCallback4).invoke(next2, null), str)) {
                            next = next2;
                            break;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (next == null) {
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2098975886);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, TextUtils.indexOf("", "", 0, 0) + 7367, -1281042974, false, "onExtraCallback", new Class[0]);
                    }
                    for (Object obj2 : (Iterable) ((Method) objOnExtraCallback5).invoke(objIAuthTabCallback, null)) {
                        Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1988707221);
                        if (objOnExtraCallback6 == null) {
                            objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33478), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 21, 10883 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1204403461, false, "onWarmupCompleted", new Class[0]);
                        }
                        if (Intrinsics.areEqual(((Method) objOnExtraCallback6).invoke(obj2, null), str)) {
                            return obj2;
                        }
                    }
                    return null;
                }
            }
            return next;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    public static final /* synthetic */ Context onWarmupCompleted(DevToolActionListViewModel devToolActionListViewModel) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Context) IAuthTabCallback(iIAuthTabCallback2, 1132334793, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, new Object[]{devToolActionListViewModel}, -1132334788, iIAuthTabCallback3);
    }

    public static final /* synthetic */ getScopeType IAuthTabCallback(DevToolActionListViewModel devToolActionListViewModel) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (getScopeType) IAuthTabCallback(iIAuthTabCallback2, 899842925, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, new Object[]{devToolActionListViewModel}, -899842924, iIAuthTabCallback3);
    }

    private static final Unit IAuthTabCallbackDefault(DevToolActionListViewModel devToolActionListViewModel, String str) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) IAuthTabCallback(iIAuthTabCallback2, -788908663, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, new Object[]{devToolActionListViewModel, str}, 788908665, iIAuthTabCallback3);
    }

    private final void onWarmupCompleted$1c2d45f5(String str, Object obj) throws Throwable {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(iIAuthTabCallback2, 1171978520, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this, str, obj}, -1171978517, iIAuthTabCallback3);
    }

    public final void IAuthTabCallback() throws Throwable {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(iIAuthTabCallback2, -1139016909, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this}, 1139016916, iIAuthTabCallback3);
    }

    public final void onNavigationEvent$252026d8(@NotNull Object obj) throws Throwable {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(iIAuthTabCallback2, 802804775, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this, obj}, -802804769, iIAuthTabCallback3);
    }

    public final void onExtraCallbackWithResult$1c977d52(@Nullable Object obj) throws Throwable {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(iIAuthTabCallback2, -433857971, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this, obj}, 433857971, iIAuthTabCallback3);
    }

    public final void onWarmupCompleted$252026d8(@NotNull Object obj) throws Throwable {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(iIAuthTabCallback2, 347772651, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this, obj}, -347772647, iIAuthTabCallback3);
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackStubProxy = -5347674223989601411L;
        access100 = -1776194565;
        IAuthTabCallback_Parcel = (char) 27643;
        access000 = (char) 12814;
        ICustomTabsCallback = (char) 42606;
        readTypedObject = (char) 24101;
        extraCallback = (char) 38482;
    }
}

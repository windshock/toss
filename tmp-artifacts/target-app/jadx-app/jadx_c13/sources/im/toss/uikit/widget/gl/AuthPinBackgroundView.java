package im.toss.uikit.widget.gl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.uikit.R;
import im.toss.uikit.widget.gl.AuthPinBackgroundView$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.GeckoHubImp1;
import o.M_;
import o.TossBundleLoader_importService;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.access14100;
import o.access15300;
import o.access15400;
import o.findResAndMsg;
import o.generateInviteUrl;
import o.generateLink;
import o.hasVaryAll;
import o.maybeUpdateAnimatable;
import o.onLoadStarted;
import o.putChannelInfo;
import o.setActivityIntentMetadata;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AuthPinBackgroundView extends GLSurfaceView {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallback;
    private static int ICustomTabsCallback = 0;
    private static char[] access000 = null;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 1;
    private static int readTypedObject = 1;
    private final Lazy IAuthTabCallbackDefault;
    private final Map<onNavigationEvent, setActivityIntentMetadata.onExtraCallback> IAuthTabCallbackStub;
    private final Lazy IAuthTabCallbackStubProxy;
    private Bitmap IAuthTabCallback_Parcel;
    private final Lazy access100;
    private final Lazy asBinder;
    private setActivityIntentMetadata asInterface;
    private int getInterfaceDescriptor;
    private final Lazy onExtraCallback;
    private Bitmap onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final String onTransact;
    private final Lazy onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        Companion = new onExtraCallback(null);
        IAuthTabCallback = 8;
        int i = extraCallback + 13;
        extraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 62 / 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuthPinBackgroundView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ String IAuthTabCallback(AuthPinBackgroundView authPinBackgroundView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1763044966, new Object[]{authPinBackgroundView}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1763044966, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        int i4 = ICustomTabsCallback + 75;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallbackStub(AuthPinBackgroundView authPinBackgroundView) {
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            extraCallbackWithResult(authPinBackgroundView);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zExtraCallbackWithResult = extraCallbackWithResult(authPinBackgroundView);
        int i3 = readTypedObject + 17;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return zExtraCallbackWithResult;
    }

    public static /* synthetic */ void onExtraCallback(AuthPinBackgroundView authPinBackgroundView) {
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(authPinBackgroundView);
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i);
        int i9 = ~i;
        int i10 = i8 | (~(i9 | i2));
        int i11 = (~(i | i2)) | (~((~i2) | i7 | i9));
        int i12 = i7 | i2 | i9;
        int i13 = i2 + i5 + i3 + (1362283521 * i6) + ((-853422242) * i4);
        int i14 = i13 * i13;
        int i15 = ((1713903284 * i2) - 1228931072) + ((-782767794) * i5) + (i10 * 1248335539) + (1248335539 * i11) + ((-1248335539) * i12) + (i3 * 465567744) + (465567744 * i6) + (1887436800 * i4) + ((-1154482176) * i14);
        int i16 = ((i2 * 722868660) - 41817558) + (i5 * 722869710) + (i10 * (-525)) + (i11 * (-525)) + (i12 * 525) + (i3 * 722869185) + (i6 * 1172694977) + (i4 * (-747618338)) + (i14 * 791674880);
        switch (i15 + (i16 * i16 * 751828992)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ String onExtraCallbackWithResult(AuthPinBackgroundView authPinBackgroundView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 93;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return (String) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -78580637, new Object[]{authPinBackgroundView}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 78580642, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ float onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return fOnExtraCallbackWithResult;
    }

    public static /* synthetic */ String onNavigationEvent(AuthPinBackgroundView authPinBackgroundView) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            access100(authPinBackgroundView);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strAccess100 = access100(authPinBackgroundView);
        int i3 = readTypedObject + 7;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 51 / 0;
        }
        return strAccess100;
    }

    public static /* synthetic */ float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = readTypedObject + 101;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        int i4 = ICustomTabsCallback + 49;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ int onWarmupCompleted(AuthPinBackgroundView authPinBackgroundView) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(authPinBackgroundView);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        int i5 = readTypedObject + 21;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return iIAuthTabCallbackStubProxy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthPinBackgroundView(@NotNull Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.asBinder = LazyKt__LazyJVMKt.lazy(new AuthPinBackgroundView$.ExternalSyntheticLambda0(this));
        this.IAuthTabCallbackStubProxy = LazyKt__LazyJVMKt.lazy(new AuthPinBackgroundView$.ExternalSyntheticLambda1(this));
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new AuthPinBackgroundView$.ExternalSyntheticLambda2(this));
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new AuthPinBackgroundView$.ExternalSyntheticLambda3(this));
        Object[] objArr = new Object[1];
        a(new int[]{0, 46, 14, 28}, false, new byte[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0}, objArr);
        this.onTransact = ((String) objArr[0]).intern();
        this.access100 = LazyKt__LazyJVMKt.lazy(new AuthPinBackgroundView$.ExternalSyntheticLambda4());
        this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new AuthPinBackgroundView$.ExternalSyntheticLambda5(this));
        this.IAuthTabCallbackDefault = LazyKt__LazyJVMKt.lazy(new AuthPinBackgroundView$.ExternalSyntheticLambda6(context));
        this.IAuthTabCallbackStub = new LinkedHashMap();
        this.getInterfaceDescriptor = -1;
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setZOrderMediaOverlay(true);
        getHolder().setFormat(-3);
        setActivityIntentMetadata setactivityintentmetadata = new setActivityIntentMetadata(this, IAuthTabCallbackDefault());
        this.asInterface = setactivityintentmetadata;
        setRenderer(setactivityintentmetadata);
        setRenderMode(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AuthPinBackgroundView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = readTypedObject + 53;
            ICustomTabsCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AuthPinBackgroundView authPinBackgroundView = (AuthPinBackgroundView) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 7;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = authPinBackgroundView.onTransact;
        int i5 = i2 + 107;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ int IAuthTabCallbackDefault(AuthPinBackgroundView authPinBackgroundView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 1;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            authPinBackgroundView.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback = authPinBackgroundView.onExtraCallback();
        int i3 = ICustomTabsCallback + 61;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return iOnExtraCallback;
    }

    public static final /* synthetic */ String access000(AuthPinBackgroundView authPinBackgroundView) {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            authPinBackgroundView.onTransact();
            throw null;
        }
        String strOnTransact = authPinBackgroundView.onTransact();
        int i3 = readTypedObject + 25;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return strOnTransact;
    }

    public static final /* synthetic */ String asBinder(AuthPinBackgroundView authPinBackgroundView) {
        int i = 2 % 2;
        int i2 = readTypedObject + 11;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return authPinBackgroundView.asBinder();
        }
        authPinBackgroundView.asBinder();
        throw null;
    }

    public static final /* synthetic */ setActivityIntentMetadata asInterface(AuthPinBackgroundView authPinBackgroundView) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 119;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        setActivityIntentMetadata setactivityintentmetadata = authPinBackgroundView.asInterface;
        int i5 = i2 + 13;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return setactivityintentmetadata;
        }
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(AuthPinBackgroundView authPinBackgroundView, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Function0 function0, Function0 function02, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 33;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = authPinBackgroundView.onExtraCallbackWithResult(bitmap, bitmap2, bitmap3, bitmap4, (Function0<Unit>) function0, (Function0<Unit>) function02, (access13800<? super Unit>) access13800Var);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AuthPinBackgroundView authPinBackgroundView = (AuthPinBackgroundView) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = authPinBackgroundView.IAuthTabCallback();
        int i4 = readTypedObject + 19;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return strIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 29;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.asBinder.getValue()).booleanValue();
        int i4 = readTypedObject + 21;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final boolean extraCallbackWithResult(AuthPinBackgroundView authPinBackgroundView) {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Resources resources = authPinBackgroundView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        if (i3 != 0) {
            generateLink.IAuthTabCallback(resources);
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback = generateLink.IAuthTabCallback(resources);
        int i4 = readTypedObject + 79;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private final String onTransact() {
        int i = 2 % 2;
        int i2 = readTypedObject + 57;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackStubProxy.getValue();
        int i4 = readTypedObject + 61;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        return ((java.lang.String) r2[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        r3 = new java.lang.Object[1];
        a(new int[]{343, 46, 0, 14}, false, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, r3);
        r5 = ((java.lang.String) r3[0]).intern();
        r0 = im.toss.uikit.widget.gl.AuthPinBackgroundView.ICustomTabsCallback + 21;
        im.toss.uikit.widget.gl.AuthPinBackgroundView.readTypedObject = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r5.IAuthTabCallbackDefault() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r5.IAuthTabCallbackDefault() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r2 = new java.lang.Object[1];
        a(new int[]{298, 45, 0, 0}, false, new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1}, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        AuthPinBackgroundView authPinBackgroundView = (AuthPinBackgroundView) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 5;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
    }

    private final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = readTypedObject + 15;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            str = (String) this.onNavigationEvent.getValue();
            int i3 = 54 / 0;
        } else {
            str = (String) this.onNavigationEvent.getValue();
        }
        int i4 = readTypedObject + 3;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        int i = 2 % 2;
        if (((AuthPinBackgroundView) objArr[0]).IAuthTabCallbackDefault()) {
            int i2 = readTypedObject + 11;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                a(new int[]{46, 63, 67, 44}, true, new byte[]{1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0}, objArr2);
                return ((String) objArr2[0]).intern();
            }
            Object[] objArr3 = new Object[1];
            a(new int[]{46, 63, 67, 44}, false, new byte[]{1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0}, objArr3);
            return ((String) objArr3[0]).intern();
        }
        Object[] objArr4 = new Object[1];
        a(new int[]{109, 64, 0, 0}, true, new byte[]{1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0}, objArr4);
        String strIntern = ((String) objArr4[0]).intern();
        int i3 = readTypedObject + 57;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    private final String asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            str = (String) this.onExtraCallback.getValue();
            int i3 = 62 / 0;
        } else {
            str = (String) this.onExtraCallback.getValue();
        }
        int i4 = readTypedObject + 39;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String access100(AuthPinBackgroundView authPinBackgroundView) throws Throwable {
        int i = 2 % 2;
        if (!authPinBackgroundView.IAuthTabCallbackDefault()) {
            Object[] objArr = new Object[1];
            a(new int[]{235, 63, 136, 30}, false, new byte[]{0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0}, objArr);
            return ((String) objArr[0]).intern();
        }
        int i2 = readTypedObject + 81;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a(new int[]{173, 62, 0, 27}, false, new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int i4 = ICustomTabsCallback + 77;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    private final float asInterface() {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            ((Number) this.access100.getValue()).floatValue();
            throw null;
        }
        float fFloatValue = ((Number) this.access100.getValue()).floatValue();
        int i3 = readTypedObject + 95;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return fFloatValue;
    }

    private static final float IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            M_.onExtraCallback.asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fAsInterface = M_.onExtraCallback.asInterface();
        int i3 = ICustomTabsCallback + 103;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 53 / 0;
        }
        return fAsInterface;
    }

    private final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.onWarmupCompleted.getValue()).intValue();
        int i4 = ICustomTabsCallback + 49;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return iIntValue;
    }

    private static final int IAuthTabCallbackStubProxy(AuthPinBackgroundView authPinBackgroundView) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int dimensionPixelOffset = authPinBackgroundView.getResources().getDimensionPixelOffset(R.dimen.actionBarSize);
        int i4 = ICustomTabsCallback + 105;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return dimensionPixelOffset;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AuthPinBackgroundView authPinBackgroundView = (AuthPinBackgroundView) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 11;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) authPinBackgroundView.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            number.floatValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fFloatValue = number.floatValue();
        int i4 = ICustomTabsCallback + 115;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return Float.valueOf(fFloatValue);
    }

    private static final float onExtraCallbackWithResult(Context context) {
        int iAccess000;
        int i = 2 % 2;
        int i2 = readTypedObject + 105;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            hasVaryAll.onExtraCallback(context);
            throw null;
        }
        Activity activityOnExtraCallback = hasVaryAll.onExtraCallback(context);
        WindowManager windowManager = activityOnExtraCallback != null ? activityOnExtraCallback.getWindowManager() : null;
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                int i3 = readTypedObject + 81;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
                iAccess000 = windowManager.getCurrentWindowMetrics().getBounds().height();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                iAccess000 = displayMetrics.heightPixels;
            }
        } else {
            M_ m_ = M_.onExtraCallback;
            iAccess000 = m_.access000() + m_.IAuthTabCallbackDefault() + m_.onExtraCallbackWithResult();
        }
        float f = iAccess000;
        int i5 = readTypedObject + 103;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return f;
    }

    public final Bitmap onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        Bitmap bitmap = this.onExtraCallbackWithResult;
        int i5 = i3 + 47;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return bitmap;
    }

    public final void setAppImage(@Nullable Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 85;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult = bitmap;
        int i5 = i2 + 13;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = AuthPinBackgroundView.this.new onExtraCallbackWithResult(access13800Var);
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i4 = onNavigationEvent + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallbackWithResult) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Bitmap bitmapOnNavigationEvent = AuthPinBackgroundView.this.onNavigationEvent();
            if (bitmapOnNavigationEvent != null) {
                AuthPinBackgroundView authPinBackgroundView = AuthPinBackgroundView.this;
                M_ m_ = M_.onExtraCallback;
                Rect rect = new Rect(0, m_.IAuthTabCallbackStub(), m_.asInterface(), m_.IAuthTabCallbackStub() + AuthPinBackgroundView.IAuthTabCallbackDefault(authPinBackgroundView));
                setActivityIntentMetadata setactivityintentmetadataAsInterface = AuthPinBackgroundView.asInterface(authPinBackgroundView);
                if (setactivityintentmetadataAsInterface != null) {
                    int i2 = onNavigationEvent + 69;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    setactivityintentmetadataAsInterface.IAuthTabCallback(TossBundleLoader_importService.IAuthTabCallback(TossBundleLoader_importService.onWarmupCompleted, bitmapOnNavigationEvent, rect, 0, 4, null));
                    int i4 = onNavigationEvent + 97;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 4 % 5;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAppImage(@Nullable Bitmap bitmap, boolean z, @NotNull findResAndMsg findresandmsg) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        setActivityIntentMetadata setactivityintentmetadata = this.asInterface;
        if (setactivityintentmetadata != null) {
            int i2 = readTypedObject + 103;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            setactivityintentmetadata.onExtraCallbackWithResult(z);
        }
        this.onExtraCallbackWithResult = bitmap;
        onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 597082944, new Object[]{this, bitmap}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -597082938, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        Object obj = null;
        if (bitmap != null) {
            int i4 = ICustomTabsCallback + 105;
            readTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (z) {
                setActivityIntentMetadata.onExtraCallback onextracallback = this.IAuthTabCallbackStub.get(onNavigationEvent.FRAME);
                if (onextracallback != null) {
                    int i5 = ICustomTabsCallback + 125;
                    readTypedObject = i5 % 128;
                    int i6 = i5 % 2;
                    Bitmap bitmapOnWarmupCompleted = onextracallback.onWarmupCompleted();
                    if (bitmapOnWarmupCompleted != null) {
                        bitmapOnWarmupCompleted.recycle();
                    }
                    onextracallback.onWarmupCompleted((Bitmap) null);
                }
            }
        }
        onLoadStarted.onExtraCallback(findresandmsg, putChannelInfo.IAuthTabCallback(), null, new onExtraCallbackWithResult(null), 2, null);
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        AuthPinBackgroundView authPinBackgroundView = (AuthPinBackgroundView) objArr[0];
        Bitmap bitmap = (Bitmap) objArr[1];
        int i = 2 % 2;
        authPinBackgroundView.IAuthTabCallbackStub.put(onNavigationEvent.APP, new setActivityIntentMetadata.onExtraCallback(bitmap, authPinBackgroundView.asInterface(), ((Float) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1269787621, new Object[]{authPinBackgroundView}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1269787624, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).floatValue(), 1.0f, authPinBackgroundView.asInterface() / 2.0f, ((Float) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1269787621, new Object[]{authPinBackgroundView}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1269787624, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).floatValue() / 2.0f, 0.0f, 1.0f, 0.0f, "APP", 320, null));
        int i2 = readTypedObject + 23;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    public final void setSpreadHeight(int i) {
        int i2 = 2 % 2;
        this.getInterfaceDescriptor = i;
        if (this.IAuthTabCallbackStub.size() == 5 && i > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<onNavigationEvent> it = onNavigationEvent.getEntries().iterator();
            while (it.hasNext()) {
                setActivityIntentMetadata.onExtraCallback onextracallback = this.IAuthTabCallbackStub.get(it.next());
                if (onextracallback != null && onextracallback.onWarmupCompleted() != null) {
                    arrayList.add(onextracallback);
                }
            }
            setActivityIntentMetadata setactivityintentmetadata = this.asInterface;
            if (setactivityintentmetadata != null) {
                setActivityIntentMetadata.onExtraCallbackWithResult(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1238507485, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1238507485, new Object[]{setactivityintentmetadata, arrayList});
            }
        }
        float f = i;
        this.IAuthTabCallbackStub.put(onNavigationEvent.SPREAD, new setActivityIntentMetadata.onExtraCallback(this.IAuthTabCallback_Parcel, 2.5f * asInterface(), f, 0.0f, asInterface() / 2.0f, ((Float) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1269787621, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1269787624, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).floatValue() - (f / 2.0f), 0.0f, 0.0f, 0.0f, "SPREAD", 320, null));
        if (this.IAuthTabCallbackStub.size() == 5) {
            int i3 = ICustomTabsCallback + 45;
            readTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 73 / 0;
                if (i <= 0) {
                    return;
                }
            } else if (i <= 0) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<onNavigationEvent> it2 = onNavigationEvent.getEntries().iterator();
            while (it2.hasNext()) {
                int i5 = ICustomTabsCallback + 125;
                readTypedObject = i5 % 128;
                int i6 = i5 % 2;
                setActivityIntentMetadata.onExtraCallback onextracallback2 = this.IAuthTabCallbackStub.get(it2.next());
                if (onextracallback2 != null && onextracallback2.onWarmupCompleted() != null) {
                    int i7 = ICustomTabsCallback + 27;
                    readTypedObject = i7 % 128;
                    int i8 = i7 % 2;
                    arrayList2.add(onextracallback2);
                }
            }
            setActivityIntentMetadata setactivityintentmetadata2 = this.asInterface;
            if (setactivityintentmetadata2 != null) {
                setActivityIntentMetadata.onExtraCallbackWithResult(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1238507485, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1238507485, new Object[]{setactivityintentmetadata2, arrayList2});
            }
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0<Unit> $onComplete;
        final /* synthetic */ Function0<Unit> $onFailed;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Function0<Unit> function0, Function0<Unit> function02, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$onComplete = function0;
            this.$onFailed = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = AuthPinBackgroundView.this.new IAuthTabCallback(this.$onComplete, this.$onFailed, access13800Var);
            iAuthTabCallback.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg2, access13800Var2);
                obj.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg2, access13800Var2);
            int i3 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((IAuthTabCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* renamed from: im.toss.uikit.widget.gl.AuthPinBackgroundView$IAuthTabCallback$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            int label;
            final /* synthetic */ AuthPinBackgroundView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(AuthPinBackgroundView authPinBackgroundView, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.this$0 = authPinBackgroundView;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 47;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass5 anonymousClass5 = (AnonymousClass5) create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return anonymousClass5.invokeSuspend(unit);
                }
                anonymousClass5.invokeSuspend(unit);
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, access13800Var);
                int i2 = onNavigationEvent + 107;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass5;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 17;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i4 = IAuthTabCallback + 71;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return objIAuthTabCallback;
                }
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    AuthPinBackgroundView authPinBackgroundView = this.this$0;
                    String strAccess000 = AuthPinBackgroundView.access000(authPinBackgroundView);
                    this.label = 1;
                    Object objOnExtraCallbackWithResult = generateInviteUrl.onExtraCallbackWithResult(authPinBackgroundView, strAccess000, null, null, this, 6, null);
                    if (objOnExtraCallbackWithResult != objOnExtraCallback) {
                        return objOnExtraCallbackWithResult;
                    }
                    int i3 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        return objOnExtraCallback;
                    }
                    throw null;
                }
                int i4 = IAuthTabCallback + 27;
                int i5 = i4 % 128;
                onNavigationEvent = i5;
                if (i4 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i5 + 65;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i7 == 0) {
                    int i8 = 69 / 0;
                }
                return obj;
            }
        }

        /* renamed from: im.toss.uikit.widget.gl.AuthPinBackgroundView$IAuthTabCallback$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            int label;
            final /* synthetic */ AuthPinBackgroundView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(AuthPinBackgroundView authPinBackgroundView, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.this$0 = authPinBackgroundView;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 35;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                if (i3 != 0) {
                    int i4 = 70 / 0;
                }
                int i5 = IAuthTabCallback + 53;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, access13800Var);
                int i2 = IAuthTabCallback + 25;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 51;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i4 = onNavigationEvent + 87;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objIAuthTabCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 125;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    AuthPinBackgroundView authPinBackgroundView = this.this$0;
                    String str = (String) AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1913174093, new Object[]{authPinBackgroundView}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1913174089, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
                    this.label = 1;
                    Object objOnExtraCallbackWithResult = generateInviteUrl.onExtraCallbackWithResult(authPinBackgroundView, str, null, null, this, 6, null);
                    return objOnExtraCallbackWithResult == objOnExtraCallback ? objOnExtraCallback : objOnExtraCallbackWithResult;
                }
                int i5 = onNavigationEvent + 91;
                int i6 = i5 % 128;
                IAuthTabCallback = i6;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = i6 + 63;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                ResultKt.onNavigationEvent(obj);
                int i9 = onNavigationEvent + 79;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    return obj;
                }
                throw null;
            }
        }

        /* renamed from: im.toss.uikit.widget.gl.AuthPinBackgroundView$IAuthTabCallback$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            int label;
            final /* synthetic */ AuthPinBackgroundView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AuthPinBackgroundView authPinBackgroundView, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.this$0 = authPinBackgroundView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, access13800Var);
                int i2 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass2;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i4 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 57 / 0;
                }
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 85;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }
                int i4 = 69 / 0;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    access14100.onExtraCallback();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                AuthPinBackgroundView authPinBackgroundView = this.this$0;
                String strAsBinder = AuthPinBackgroundView.asBinder(authPinBackgroundView);
                this.label = 1;
                Object objOnExtraCallbackWithResult = generateInviteUrl.onExtraCallbackWithResult(authPinBackgroundView, strAsBinder, null, null, this, 6, null);
                if (objOnExtraCallbackWithResult != objOnExtraCallback) {
                    return objOnExtraCallbackWithResult;
                }
                int i4 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }
        }

        /* renamed from: im.toss.uikit.widget.gl.AuthPinBackgroundView$IAuthTabCallback$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            int label;
            final /* synthetic */ AuthPinBackgroundView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AuthPinBackgroundView authPinBackgroundView, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.this$0 = authPinBackgroundView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, access13800Var);
                int i2 = onExtraCallback + 47;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 111;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                if (i3 == 0) {
                    int i4 = 68 / 0;
                }
                int i5 = onWarmupCompleted + 33;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 8 / 0;
                }
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 11;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return anonymousClass1.invokeSuspend(unit);
                }
                anonymousClass1.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 91;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    AuthPinBackgroundView authPinBackgroundView = this.this$0;
                    String str = (String) AuthPinBackgroundView.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1536859882, new Object[]{authPinBackgroundView}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1536859884, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
                    this.label = 1;
                    Object objOnExtraCallbackWithResult = generateInviteUrl.onExtraCallbackWithResult(authPinBackgroundView, str, null, null, this, 6, null);
                    return objOnExtraCallbackWithResult == objOnExtraCallback ? objOnExtraCallback : objOnExtraCallbackWithResult;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onWarmupCompleted + 119;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x014a, code lost:
        
            if (im.toss.uikit.widget.gl.AuthPinBackgroundView.onExtraCallbackWithResult(r0, r3, r6, r7, (android.graphics.Bitmap) r5, r9, r10, r17) != r15) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00fb A[PHI: r0 r3 r6 r7
          0x00fb: PHI (r0v6 android.graphics.Bitmap) = (r0v5 android.graphics.Bitmap), (r0v13 android.graphics.Bitmap) binds: [B:28:0x00f9, B:19:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x00fb: PHI (r3v5 android.graphics.Bitmap) = (r3v4 android.graphics.Bitmap), (r3v13 android.graphics.Bitmap) binds: [B:28:0x00f9, B:19:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x00fb: PHI (r6v6 im.toss.uikit.widget.gl.AuthPinBackgroundView) = (r6v5 im.toss.uikit.widget.gl.AuthPinBackgroundView), (r6v14 im.toss.uikit.widget.gl.AuthPinBackgroundView) binds: [B:28:0x00f9, B:19:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x00fb: PHI (r7v2 java.lang.Object) = (r7v1 java.lang.Object), (r7v6 java.lang.Object) binds: [B:28:0x00f9, B:19:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0123  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AuthPinBackgroundView authPinBackgroundView;
            Object objIAuthTabCallback;
            Object objIAuthTabCallback2;
            AuthPinBackgroundView authPinBackgroundView2;
            Bitmap bitmap;
            Bitmap bitmap2;
            Object objIAuthTabCallback3;
            Bitmap bitmap3;
            Object objIAuthTabCallback4;
            Bitmap bitmap4;
            AuthPinBackgroundView authPinBackgroundView3;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                access14100.onExtraCallback();
                throw null;
            }
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                authPinBackgroundView = AuthPinBackgroundView.this;
                GeckoHubImp1 geckoHubImp1OnWarmupCompleted = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass5(authPinBackgroundView, null), 3, null);
                this.L$0 = findresandmsg;
                this.L$1 = authPinBackgroundView;
                this.label = 1;
                objIAuthTabCallback = geckoHubImp1OnWarmupCompleted.IAuthTabCallback(this);
                if (objIAuthTabCallback != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            if (i3 == 1) {
                authPinBackgroundView = (AuthPinBackgroundView) this.L$1;
                ResultKt.onNavigationEvent(obj);
                objIAuthTabCallback = obj;
            } else {
                if (i3 == 2) {
                    bitmap = (Bitmap) this.L$2;
                    authPinBackgroundView2 = (AuthPinBackgroundView) this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    int i4 = onNavigationEvent + 125;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    objIAuthTabCallback2 = obj;
                    bitmap2 = (Bitmap) objIAuthTabCallback2;
                    GeckoHubImp1 geckoHubImp1OnWarmupCompleted2 = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass2(AuthPinBackgroundView.this, null), 3, null);
                    this.L$0 = findresandmsg;
                    this.L$1 = authPinBackgroundView2;
                    this.L$2 = bitmap;
                    this.L$3 = bitmap2;
                    this.label = 3;
                    objIAuthTabCallback3 = geckoHubImp1OnWarmupCompleted2.IAuthTabCallback(this);
                    if (objIAuthTabCallback3 != objOnExtraCallback) {
                        bitmap3 = (Bitmap) objIAuthTabCallback3;
                        GeckoHubImp1 geckoHubImp1OnWarmupCompleted3 = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass1(AuthPinBackgroundView.this, null), 3, null);
                        this.L$0 = access15400.onNavigationEvent(findresandmsg);
                        this.L$1 = authPinBackgroundView2;
                        this.L$2 = bitmap;
                        this.L$3 = bitmap2;
                        this.L$4 = bitmap3;
                        this.label = 4;
                        objIAuthTabCallback4 = geckoHubImp1OnWarmupCompleted3.IAuthTabCallback(this);
                        if (objIAuthTabCallback4 != objOnExtraCallback) {
                        }
                    }
                    return objOnExtraCallback;
                }
                if (i3 == 3) {
                    bitmap2 = (Bitmap) this.L$3;
                    bitmap = (Bitmap) this.L$2;
                    authPinBackgroundView2 = (AuthPinBackgroundView) this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    objIAuthTabCallback3 = obj;
                    bitmap3 = (Bitmap) objIAuthTabCallback3;
                    GeckoHubImp1 geckoHubImp1OnWarmupCompleted32 = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass1(AuthPinBackgroundView.this, null), 3, null);
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.L$1 = authPinBackgroundView2;
                    this.L$2 = bitmap;
                    this.L$3 = bitmap2;
                    this.L$4 = bitmap3;
                    this.label = 4;
                    objIAuthTabCallback4 = geckoHubImp1OnWarmupCompleted32.IAuthTabCallback(this);
                    if (objIAuthTabCallback4 != objOnExtraCallback) {
                        AuthPinBackgroundView authPinBackgroundView4 = authPinBackgroundView2;
                        bitmap4 = bitmap2;
                        authPinBackgroundView3 = authPinBackgroundView4;
                        Function0<Unit> function0 = this.$onComplete;
                        Function0<Unit> function02 = this.$onFailed;
                        this.L$0 = access15400.onNavigationEvent(findresandmsg);
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 5;
                    }
                    return objOnExtraCallback;
                }
                if (i3 != 4) {
                    int i6 = onNavigationEvent + 55;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0 ? i3 != 5 : i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                Bitmap bitmap5 = (Bitmap) this.L$4;
                Bitmap bitmap6 = (Bitmap) this.L$3;
                Bitmap bitmap7 = (Bitmap) this.L$2;
                AuthPinBackgroundView authPinBackgroundView5 = (AuthPinBackgroundView) this.L$1;
                ResultKt.onNavigationEvent(obj);
                bitmap3 = bitmap5;
                authPinBackgroundView3 = authPinBackgroundView5;
                bitmap4 = bitmap6;
                bitmap = bitmap7;
                objIAuthTabCallback4 = obj;
                Function0<Unit> function03 = this.$onComplete;
                Function0<Unit> function022 = this.$onFailed;
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 5;
            }
            Bitmap bitmap8 = (Bitmap) objIAuthTabCallback;
            GeckoHubImp1 geckoHubImp1OnWarmupCompleted4 = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass4(AuthPinBackgroundView.this, null), 3, null);
            this.L$0 = findresandmsg;
            this.L$1 = authPinBackgroundView;
            this.L$2 = bitmap8;
            this.label = 2;
            objIAuthTabCallback2 = geckoHubImp1OnWarmupCompleted4.IAuthTabCallback(this);
            if (objIAuthTabCallback2 != objOnExtraCallback) {
                authPinBackgroundView2 = authPinBackgroundView;
                bitmap = bitmap8;
                bitmap2 = (Bitmap) objIAuthTabCallback2;
                GeckoHubImp1 geckoHubImp1OnWarmupCompleted22 = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass2(AuthPinBackgroundView.this, null), 3, null);
                this.L$0 = findresandmsg;
                this.L$1 = authPinBackgroundView2;
                this.L$2 = bitmap;
                this.L$3 = bitmap2;
                this.label = 3;
                objIAuthTabCallback3 = geckoHubImp1OnWarmupCompleted22.IAuthTabCallback(this);
                if (objIAuthTabCallback3 != objOnExtraCallback) {
                }
            }
            return objOnExtraCallback;
        }
    }

    public final void onNavigationEvent(@NotNull findResAndMsg findresandmsg, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        onLoadStarted.onExtraCallback(findresandmsg, null, null, new IAuthTabCallback(function0, function02, null), 3, null);
        int i2 = ICustomTabsCallback + 17;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Bitmap $backgroundImage;
        final /* synthetic */ Bitmap $errorImage;
        final /* synthetic */ Function0<Unit> $onComplete;
        final /* synthetic */ Function0<Unit> $onFailed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Bitmap bitmap, Bitmap bitmap2, Function0<Unit> function0, Function0<Unit> function02, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$backgroundImage = bitmap;
            this.$errorImage = bitmap2;
            this.$onFailed = function0;
            this.$onComplete = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$backgroundImage, this.$errorImage, this.$onFailed, this.$onComplete, access13800Var);
            int i2 = onWarmupCompleted + 53;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i4 = onWarmupCompleted + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onWarmupCompleted) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$backgroundImage != null) {
                int i2 = onWarmupCompleted + 119;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (this.$errorImage != null) {
                    this.$onComplete.invoke();
                } else {
                    this.$onFailed.invoke();
                    int i3 = onWarmupCompleted + 65;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final Object onExtraCallbackWithResult(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Function0<Unit> function0, Function0<Unit> function02, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        this.IAuthTabCallbackStub.clear();
        Object obj = null;
        if (bitmap2 == null || bitmap3 == null) {
            onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 597082944, new Object[]{this, null}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -597082938, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        } else {
            int i2 = ICustomTabsCallback + 21;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = {this, this.onExtraCallbackWithResult};
                onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 597082944, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -597082938, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = {this, this.onExtraCallbackWithResult};
            onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 597082944, objArr2, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -597082938, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        }
        onExtraCallback(bitmap4, bitmap2, bitmap3);
        if (bitmap != null) {
            this.IAuthTabCallback_Parcel = bitmap;
        }
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onExtraCallback(), new onWarmupCompleted(bitmap2, bitmap3, function02, function0, null), access13800Var);
        if (objOnExtraCallback != access14100.onExtraCallback()) {
            return Unit.INSTANCE;
        }
        int i3 = ICustomTabsCallback + 21;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = access000;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - Drawable.resolveOpacity(0, 0)), Color.red(0) + 35, (Process.myPid() >> 22) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i7 = $10 + 53;
                $11 = i7 % 128;
                if (i7 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, 17657 - (Process.myPid() >> 22), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - KeyEvent.getDeadChar(0, 0)), 65 - KeyEvent.normalizeMetaState(0), ImageFormat.getBitsPerPixel(0) + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 49467), KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 70, 12486 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i10 = $11 + 109;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i12 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i12, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i12);
        }
        if (z) {
            int i13 = $11 + 83;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i15 = $10 + 37;
            $11 = i15 % 128;
            int i16 = 2;
            int i17 = i15 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i18 = $11 + 51;
                $10 = i18 % 128;
                int i19 = i18 % i16;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                i16 = 2;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private final void onExtraCallback(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        int i = 2 % 2;
        this.IAuthTabCallbackStub.put(onNavigationEvent.FRAME, new setActivityIntentMetadata.onExtraCallback(bitmap, asInterface(), asInterface(), 1.0f, asInterface() / 2.0f, asInterface() / 2.0f, 0.0f, 1.0f, 0.0f, "FRAME", 320, null));
        Map<onNavigationEvent, setActivityIntentMetadata.onExtraCallback> map = this.IAuthTabCallbackStub;
        onNavigationEvent onnavigationevent = onNavigationEvent.BACKGROUND;
        float fFloatValue = ((Float) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1269787621, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1269787624, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).floatValue();
        float fFloatValue2 = ((Float) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1269787621, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1269787624, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).floatValue();
        float f = fFloatValue * 2.0f;
        float f2 = fFloatValue2 * 2.0f;
        map.put(onnavigationevent, new setActivityIntentMetadata.onExtraCallback(bitmap2, f, f2, 1.0f, asInterface() / 2.0f, ((Float) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1269787621, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1269787624, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).floatValue(), 0.0f, 0.0f, 0.0f, "BACKGROUND", 320, null));
        Map<onNavigationEvent, setActivityIntentMetadata.onExtraCallback> map2 = this.IAuthTabCallbackStub;
        onNavigationEvent onnavigationevent2 = onNavigationEvent.ERROR;
        float fFloatValue3 = ((Float) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1269787621, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1269787624, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).floatValue();
        float fFloatValue4 = ((Float) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1269787621, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1269787624, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).floatValue();
        float f3 = fFloatValue3 * 2.0f;
        float f4 = fFloatValue4 * 2.0f;
        map2.put(onnavigationevent2, new setActivityIntentMetadata.onExtraCallback(bitmap3, f3, f4, 0.0f, asInterface() / 2.0f, ((Float) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1269787621, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1269787624, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).floatValue(), 0.0f, 0.0f, 0.0f, "ERROR", 328, null));
        int i2 = readTypedObject + 9;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void onExtraCallback(@NotNull onNavigationEvent onnavigationevent, float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 75;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        setActivityIntentMetadata setactivityintentmetadata = this.asInterface;
        if (setactivityintentmetadata != null) {
            int i4 = readTypedObject + 107;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            setactivityintentmetadata.onExtraCallback(onnavigationevent.name(), f);
            if (i5 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AuthPinBackgroundView authPinBackgroundView = (AuthPinBackgroundView) objArr[0];
        onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            setActivityIntentMetadata setactivityintentmetadata = authPinBackgroundView.asInterface;
            throw null;
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        setActivityIntentMetadata setactivityintentmetadata2 = authPinBackgroundView.asInterface;
        if (setactivityintentmetadata2 != null) {
            int i3 = ICustomTabsCallback + 21;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr2 = {setactivityintentmetadata2, onnavigationevent.name(), Float.valueOf(fFloatValue)};
            setActivityIntentMetadata.onExtraCallbackWithResult(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 32765721, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -32765719, objArr2);
        }
        return null;
    }

    public final void onWarmupCompleted(@NotNull onNavigationEvent onnavigationevent, float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        setActivityIntentMetadata setactivityintentmetadata = this.asInterface;
        if (setactivityintentmetadata != null) {
            int i2 = readTypedObject + 89;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            setactivityintentmetadata.IAuthTabCallback(onnavigationevent.name(), f);
            if (i3 != 0) {
                int i4 = 3 / 0;
            }
        }
        int i5 = readTypedObject + 107;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        setActivityIntentMetadata setactivityintentmetadata = this.asInterface;
        if (setactivityintentmetadata != null) {
            int i5 = i3 + 105;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            setactivityintentmetadata.onExtraCallback(f);
            int i7 = ICustomTabsCallback + 89;
            readTypedObject = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AuthPinBackgroundView authPinBackgroundView = (AuthPinBackgroundView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 79;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        setActivityIntentMetadata setactivityintentmetadata = authPinBackgroundView.asInterface;
        if (setactivityintentmetadata != null) {
            int i5 = i3 + 49;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            setactivityintentmetadata.onNavigationEvent(fFloatValue);
            if (i6 == 0) {
                int i7 = 88 / 0;
            }
        }
        int i8 = readTypedObject + 41;
        ICustomTabsCallback = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    public final void onExtraCallbackWithResult(@NotNull onNavigationEvent onnavigationevent, float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 91;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        setActivityIntentMetadata setactivityintentmetadata = this.asInterface;
        if (setactivityintentmetadata != null) {
            Object[] objArr = {setactivityintentmetadata, onnavigationevent.name(), Float.valueOf(f)};
            setActivityIntentMetadata.onExtraCallbackWithResult(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 119633648, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -119633647, objArr);
        }
        int i4 = ICustomTabsCallback + 51;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onWarmupCompleted(float f) {
        float f2;
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 109;
        int i4 = i3 % 128;
        ICustomTabsCallback = i4;
        int i5 = i3 % 2;
        setActivityIntentMetadata setactivityintentmetadata = this.asInterface;
        if (setactivityintentmetadata != null) {
            if (this.onExtraCallbackWithResult != null) {
                int i6 = i2 + 61;
                ICustomTabsCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                f2 = 0.6f;
            } else {
                int i7 = i4 + 59;
                readTypedObject = i7 % 128;
                int i8 = i7 % 2;
                f2 = 1.0f;
            }
            setactivityintentmetadata.IAuthTabCallback(f * f2);
            int i9 = ICustomTabsCallback + 91;
            readTypedObject = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    private static final void writeTypedObject(AuthPinBackgroundView authPinBackgroundView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        setActivityIntentMetadata setactivityintentmetadata = authPinBackgroundView.asInterface;
        if (i3 == 0) {
            throw null;
        }
        if (setactivityintentmetadata != null) {
            setactivityintentmetadata.onNavigationEvent();
        }
        int i4 = readTypedObject + 13;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final onNavigationEvent APP = new onNavigationEvent("APP", 0);
        public static final onNavigationEvent FRAME = new onNavigationEvent("FRAME", 1);
        public static final onNavigationEvent BACKGROUND = new onNavigationEvent("BACKGROUND", 2);
        public static final onNavigationEvent ERROR = new onNavigationEvent("ERROR", 3);
        public static final onNavigationEvent SPREAD = new onNavigationEvent("SPREAD", 4);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 39;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {APP, FRAME, BACKGROUND, ERROR, SPREAD};
            int i5 = i2 + 11;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 52 / 0;
            }
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            if (i3 != 0) {
                int i4 = 13 / 0;
            }
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 != 0) {
                int i4 = 8 / 0;
            }
            int i5 = IAuthTabCallback + 115;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = $VALUES;
            if (i3 != 0) {
                return (onNavigationEvent[]) onnavigationeventArr.clone();
            }
            int i4 = 96 / 0;
            return (onNavigationEvent[]) onnavigationeventArr.clone();
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onExtraCallback + 119;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public static final /* synthetic */ String onTransact(AuthPinBackgroundView authPinBackgroundView) {
        return (String) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1913174093, new Object[]{authPinBackgroundView}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1913174089, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static final /* synthetic */ String getInterfaceDescriptor(AuthPinBackgroundView authPinBackgroundView) {
        return (String) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1536859882, new Object[]{authPinBackgroundView}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1536859884, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private final void IAuthTabCallback(Bitmap bitmap) {
        onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 597082944, new Object[]{this, bitmap}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -597082938, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final String IAuthTabCallback_Parcel(AuthPinBackgroundView authPinBackgroundView) {
        return (String) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -78580637, new Object[]{authPinBackgroundView}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 78580642, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private final float IAuthTabCallbackStub() {
        return ((Float) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1269787621, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1269787624, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).floatValue();
    }

    private static final String ICustomTabsCallback(AuthPinBackgroundView authPinBackgroundView) {
        return (String) onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1763044966, new Object[]{authPinBackgroundView}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1763044966, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final void onNavigationEvent(@NotNull onNavigationEvent onnavigationevent, float f) {
        Object[] objArr = {this, onnavigationevent, Float.valueOf(f)};
        onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1302876685, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1302876684, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final void onNavigationEvent(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 792103246, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -792103239, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    static void onExtraCallbackWithResult() {
        access000 = new char[]{27150, 27152, 27159, 27191, 27154, 27156, 27184, 27183, 27155, 27188, 27191, 27154, 27153, 27191, 27190, 27191, 27197, 27193, 27157, 27161, 27188, 27193, 27195, 27193, 27161, 27155, 27187, 27190, 27195, 27186, 27340, 27342, 27185, 27178, 27148, 27251, 27153, 27343, 27190, 27190, 27186, 27194, 27160, 27153, 27185, 27185, 27254, 27328, 27360, 27359, 27329, 27389, 27352, 27356, 27361, 27360, 27359, 27330, 27371, 27362, 27391, 27329, 27332, 27366, 27365, 27331, 27331, 27361, 27362, 27371, 27367, 27364, 27362, 27386, 27357, 27332, 27364, 27389, 27390, 27330, 27358, 27391, 27365, 27364, 27389, 27384, 27357, 27356, 27388, 27363, 27364, 27391, 27385, 27387, 27386, 27351, 27193, 27196, 27354, 27384, 27363, 27363, 27391, 27367, 27333, 27354, 27386, 27386, 27384, 27261, 27172, 27169, 27137, 27166, 27197, 27198, 27177, 27174, 27168, 27139, 27143, 27171, 27198, 27177, 27145, 27166, 27199, 27175, 27177, 27176, 27180, 27175, 27170, 27140, 27140, 27174, 27179, 27145, 27166, 27168, 27177, 27174, 27172, 27139, 27136, 27173, 27170, 27137, 27165, 27198, 27138, 27136, 27173, 27141, 27166, 27197, 27199, 27199, 27167, 27142, 27176, 27168, 27172, 27172, 27197, 27167, 27233, 27258, 27160, 27199, 27196, 27194, 27168, 27263, 27179, 27174, 27140, 27140, 27170, 27175, 27180, 27176, 27177, 27175, 27199, 27166, 27137, 27173, 27178, 27142, 27139, 27168, 27174, 27177, 27198, 27197, 27166, 27137, 27169, 27172, 27177, 27168, 27194, 27196, 27199, 27160, 27258, 27233, 27167, 27197, 27172, 27172, 27168, 27176, 27142, 27167, 27199, 27199, 27197, 27166, 27141, 27173, 27136, 27138, 27198, 27165, 27137, 27170, 27173, 27136, 27143, 27180, 27175, 27168, 27138, 27190, 27320, 27286, 27265, 27299, 27326, 27292, 27292, 27322, 27327, 27300, 27296, 27297, 27327, 27319, 27286, 27289, 27325, 27298, 27294, 27291, 27320, 27326, 27297, 27318, 27317, 27286, 27289, 27321, 27324, 27297, 27320, 27314, 27316, 27319, 27280, 27378, 27385, 27287, 27317, 27324, 27324, 27320, 27296, 27294, 27287, 27319, 27319, 27317, 27286, 27293, 27325, 27288, 27290, 27318, 27285, 27289, 27322, 27325, 27288, 27291, 27324, 27326, 27258, 27168, 27194, 27196, 27199, 27160, 27258, 27233, 27167, 27197, 27172, 27172, 27168, 27176, 27142, 27167, 27199, 27199, 27197, 27166, 27141, 27173, 27136, 27138, 27198, 27165, 27137, 27170, 27173, 27136, 27143, 27180, 27175, 27168, 27138, 27166, 27199, 27199, 27173, 27181, 27180, 27143, 27137, 27169, 27172, 27261, 27177, 27168, 27166, 27166, 27199, 27199, 27173, 27181, 27180, 27143, 27137, 27169, 27172, 27177, 27168, 27194, 27196, 27199, 27160, 27258, 27233, 27167, 27197, 27172, 27172, 27168, 27176, 27142, 27167, 27199, 27199, 27197, 27166, 27141, 27173, 27136, 27138, 27198, 27165, 27137, 27170, 27173, 27136, 27139, 27172};
    }
}

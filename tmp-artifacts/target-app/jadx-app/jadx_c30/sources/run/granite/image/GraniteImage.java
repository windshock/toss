package run.granite.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CertToolkitMgrRevokeReason;
import o.CertTransferMgr;
import o.getKey7;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import o.setTaggedAddrCtrl;
import o.transGetKmPriKey;
import o.transGetSignCert;
import o.utilBase64Decode;
import o.utilBase64Encode;
import o.utilBinToHexString;
import o.utilHexStringToBin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GraniteImage extends FrameLayout {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static long IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    private String IAuthTabCallback;
    private String IAuthTabCallbackDefault;
    private Integer IAuthTabCallbackStub;
    private utilBinToHexString asBinder;
    private Function0<? extends getKey7> asInterface;
    private View onExtraCallback;
    private transGetSignCert onExtraCallbackWithResult;
    private Map<String, String> onNavigationEvent;
    private ImageView.ScaleType onTransact;
    private String onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        Companion = new onExtraCallback(null);
        int i = access100 + 77;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = i3 | i9;
        int i11 = ~i3;
        int i12 = i9 | (~(i11 | i5));
        int i13 = (~(i2 | i7 | i3)) | (~(i8 | i11 | i7));
        int i14 = i5 + i3 + i + ((-619979367) * i4) + (68302741 * i6);
        int i15 = i14 * i14;
        int i16 = (i5 * 561304900) + 382271488 + (561304900 * i3) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i) + (1615200256 * i4) + ((-1821507584) * i6) + (428933120 * i15);
        int i17 = ((i5 * (-96142684)) - 56799437) + (i3 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i * (-96141863)) + (i4 * (-1380774991)) + (i6 * (-1175232947)) + (i15 * (-118947840));
        int i18 = i16 + (i17 * i17 * (-1369505792));
        if (i18 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i18 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i18 != 3) {
            return onExtraCallback(objArr);
        }
        GraniteImage graniteImage = (GraniteImage) objArr[0];
        int i19 = 2 % 2;
        int i20 = getInterfaceDescriptor + 103;
        access000 = i20 % 128;
        int i21 = i20 % 2;
        View view = graniteImage.onExtraCallback;
        if (view != null) {
            graniteImage.removeView(view);
            graniteImage.onExtraCallback = null;
        }
        int i22 = getInterfaceDescriptor + 45;
        access000 = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    public static /* synthetic */ getKey7 onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        getKey7 getkey7 = (getKey7) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, new Object[0], 1388202953, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1388202952, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        int i4 = getInterfaceDescriptor + 89;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return getkey7;
    }

    public static /* synthetic */ void onExtraCallback(GraniteImage graniteImage, long j, long j2) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(graniteImage, j, j2);
        int i4 = getInterfaceDescriptor + 43;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallback(GraniteImage graniteImage, Bitmap bitmap, Exception exc, int i, int i2, View view, getKey7 getkey7) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 117;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(graniteImage, bitmap, exc, i, i2, view, getkey7);
        if (i5 == 0) {
            int i6 = 92 / 0;
        }
        int i7 = getInterfaceDescriptor + 47;
        access000 = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GraniteImage graniteImage, View view, getKey7 getkey7, Bitmap bitmap, Exception exc, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 49;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            onExtraCallback(graniteImage, view, getkey7, bitmap, exc, i, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(graniteImage, view, getkey7, bitmap, exc, i, i2);
        int i5 = access000 + 97;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GraniteImage graniteImage, long j, long j2) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {graniteImage, Long.valueOf(j), Long.valueOf(j2)};
        Unit unit = (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, 1068364012, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1068364010, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        int i4 = access000 + 73;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return unit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraniteImage(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        this.asInterface = new Function0() { // from class: run.granite.image.GraniteImage$$ExternalSyntheticLambda4
            public final Object invoke() {
                return GraniteImage.onExtraCallback();
            }
        };
        this.onTransact = ImageView.ScaleType.CENTER_CROP;
        this.asBinder = utilBinToHexString.NORMAL;
        this.onExtraCallbackWithResult = transGetSignCert.DISK;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        getKey7 getkey7IAuthTabCallback = CertToolkitMgrRevokeReason.onExtraCallback.IAuthTabCallback();
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return getkey7IAuthTabCallback;
    }

    public final void setProviderResolver$granite_js_image_release(@NotNull Function0<? extends getKey7> function0) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, BuildConfig.FLAVOR);
            this.asInterface = function0;
            throw null;
        }
        Intrinsics.checkNotNullParameter(function0, BuildConfig.FLAVOR);
        this.asInterface = function0;
        int i3 = getInterfaceDescriptor + 51;
        access000 = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void IAuthTabCallback(Event<?> event) {
        ReactContext reactContext;
        int i = 2 % 2;
        ReactContext context = getContext();
        if (context instanceof ReactContext) {
            int i2 = access000 + 69;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            reactContext = context;
        } else {
            reactContext = null;
        }
        if (reactContext != null) {
            int i4 = getInterfaceDescriptor + 21;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(reactContext, getId());
            if (eventDispatcherOnExtraCallbackWithResult != null) {
                eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(event);
                int i6 = getInterfaceDescriptor + 99;
                access000 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    private final void onTransact() {
        int i = 2 % 2;
        IAuthTabCallback(new utilBase64Encode(r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(this), getId()));
        int i2 = access000 + 39;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void onNavigationEvent(int i, int i2) {
        int i3 = 2 % 2;
        IAuthTabCallback(new CertTransferMgr(r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(this), getId(), i, i2));
        int i4 = getInterfaceDescriptor + 95;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    private final void IAuthTabCallback(int i, int i2) {
        int i3 = 2 % 2;
        IAuthTabCallback(new utilHexStringToBin(r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(this), getId(), i, i2));
        int i4 = getInterfaceDescriptor + 3;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(String str) {
        int i = 2 % 2;
        IAuthTabCallback(new transGetKmPriKey(r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(this), getId(), str));
        int i2 = getInterfaceDescriptor + 29;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        IAuthTabCallback(new utilBase64Decode(r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(this), getId()));
        int i2 = access000 + 77;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setUri(@Nullable String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
            if (Intrinsics.areEqual(str, this.IAuthTabCallbackDefault)) {
                return;
            }
        } else if (Intrinsics.areEqual(str, this.IAuthTabCallbackDefault)) {
            return;
        }
        this.IAuthTabCallbackDefault = str;
        asInterface();
        int i4 = getInterfaceDescriptor + 31;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setHeaders(@Nullable String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 107;
        access000 = i2 % 128;
        LinkedHashMap linkedHashMap = null;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
            if (str != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(itKeys, BuildConfig.FLAVOR);
                    int i4 = access000 + 103;
                    getInterfaceDescriptor = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 / 3;
                    }
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        linkedHashMap2.put(next, jSONObject.getString(next));
                    }
                    linkedHashMap = linkedHashMap2;
                } catch (Exception e) {
                    e.toString();
                }
            }
        } else if (str != null) {
        }
        this.onNavigationEvent = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = $11 + 125;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, View.resolveSizeAndState(0, 0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallbackStubProxy ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59, 6382 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 83;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 59 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 59, Color.argb(0, 0, 0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i7 = $11 + 95;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr2);
        int i9 = $11 + 95;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setContentMode(@Nullable String str) {
        ImageView.ScaleType scaleType;
        int i = 2 % 2;
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (!str.equals("stretch")) {
                        scaleType = ImageView.ScaleType.CENTER_CROP;
                        break;
                    } else {
                        int i2 = getInterfaceDescriptor + 77;
                        access000 = i2 % 128;
                        int i3 = i2 % 2;
                        scaleType = ImageView.ScaleType.FIT_XY;
                        break;
                    }
                case -1364013995:
                    if (str.equals("center")) {
                        scaleType = ImageView.ScaleType.CENTER;
                        break;
                    }
                    break;
                case 94852023:
                    str.equals("cover");
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                    break;
                case 951526612:
                    if (str.equals("contain")) {
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                        break;
                    }
                    break;
            }
        }
        if (scaleType != this.onTransact) {
            int i4 = access000 + 117;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                this.onTransact = scaleType;
                boolean z = this.onExtraCallback instanceof ImageView;
                imageView.hashCode();
                throw null;
            }
            this.onTransact = scaleType;
            View view = this.onExtraCallback;
            imageView = view instanceof ImageView ? (ImageView) view : null;
            if (imageView != null) {
                imageView.setScaleType(scaleType);
            }
        }
    }

    public final void setPriority(@Nullable String str) {
        int i = 2 % 2;
        int i2 = access000 + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = utilBinToHexString.Companion.onExtraCallbackWithResult(str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCachePolicy(@Nullable String str) throws Throwable {
        transGetSignCert transgetsigncert;
        int i = 2 % 2;
        if (Intrinsics.areEqual(str, "memory")) {
            int i2 = access000 + 5;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            transgetsigncert = transGetSignCert.MEMORY;
        } else {
            Object[] objArr = new Object[1];
            a(new char[]{29284, 59700, 17606, 41884}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 39761, objArr);
            if (Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
                int i4 = getInterfaceDescriptor + 7;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                transgetsigncert = transGetSignCert.NONE;
            } else {
                transgetsigncert = transGetSignCert.DISK;
                int i6 = access000 + 33;
                getInterfaceDescriptor = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 % 3;
                }
            }
        }
        this.onExtraCallbackWithResult = transgetsigncert;
    }

    public final void setTintColor(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        int i3 = i2 % 128;
        access000 = i3;
        if (i2 % 2 == 0) {
            this.IAuthTabCallbackStub = num;
            int i4 = 12 / 0;
            if (num == null) {
                return;
            }
        } else {
            this.IAuthTabCallbackStub = num;
            if (num == null) {
                return;
            }
        }
        View view = this.onExtraCallback;
        ImageView imageView = null;
        if (view instanceof ImageView) {
            int i5 = i3 + 119;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            imageView = (ImageView) view;
        }
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        }
    }

    public final void setDefaultSource(@Nullable String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 111;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.IAuthTabCallback = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 37;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setFallbackSource(@Nullable String str) {
        int i = 2 % 2;
        int i2 = access000 + 43;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        this.onWarmupCompleted = str;
        int i5 = i3 + 123;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void asInterface() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this}, -92384962, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 92384965, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
            final getKey7 getkey7 = (getKey7) this.asInterface.invoke();
            if (getkey7 == null) {
                int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this, "No GraniteImageProvider registered"}, 1293766704, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1293766704, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                onWarmupCompleted("No GraniteImageProvider registered");
                return;
            }
            String str = this.IAuthTabCallbackDefault;
            if (str == null || str.length() == 0) {
                int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{this, "No URI provided"}, 1293766704, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1293766704, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                onWarmupCompleted("No URI provided");
                return;
            }
            onTransact();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
            final View viewIAuthTabCallback = getkey7.IAuthTabCallback(context);
            onNavigationEvent(viewIAuthTabCallback);
            getkey7.IAuthTabCallback(str, viewIAuthTabCallback, this.onTransact, this.onNavigationEvent, this.asBinder, this.onExtraCallbackWithResult, this.IAuthTabCallback, new Function2() { // from class: run.granite.image.GraniteImage$$ExternalSyntheticLambda1
                public final Object invoke(Object obj2, Object obj3) {
                    return GraniteImage.onWarmupCompleted(this.f$0, ((Long) obj2).longValue(), ((Long) obj3).longValue());
                }
            }, new setTaggedAddrCtrl() { // from class: run.granite.image.GraniteImage$$ExternalSyntheticLambda2
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    return GraniteImage.onExtraCallbackWithResult(this.f$0, viewIAuthTabCallback, getkey7, (Bitmap) obj2, (Exception) obj3, ((Integer) obj4).intValue(), ((Integer) obj5).intValue());
                }
            });
            int i3 = access000 + 83;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback4, new Object[]{this}, -92384962, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 92384965, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(GraniteImage graniteImage, long j, long j2) {
        int i = 2 % 2;
        int i2 = access000 + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        graniteImage.onNavigationEvent((int) j, (int) j2);
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final GraniteImage graniteImage = (GraniteImage) objArr[0];
        final long jLongValue = ((Number) objArr[1]).longValue();
        final long jLongValue2 = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        graniteImage.post(new Runnable() { // from class: run.granite.image.GraniteImage$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                GraniteImage.onExtraCallback(this.f$0, jLongValue, jLongValue2);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 107;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
        return unit;
    }

    private static final void IAuthTabCallback(GraniteImage graniteImage, Bitmap bitmap, Exception exc, int i, int i2, View view, getKey7 getkey7) {
        int i3 = 2 % 2;
        int i4 = access000 + 17;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        graniteImage.onExtraCallbackWithResult(bitmap, exc, i, i2, view, getkey7);
        int i6 = getInterfaceDescriptor + 97;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(final GraniteImage graniteImage, final View view, final getKey7 getkey7, final Bitmap bitmap, final Exception exc, final int i, final int i2) {
        int i3 = 2 % 2;
        graniteImage.post(new Runnable() { // from class: run.granite.image.GraniteImage$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GraniteImage.onExtraCallback(this.f$0, bitmap, exc, i, i2, view, getkey7);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 123;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return unit;
    }

    private final void onNavigationEvent(View view) {
        int i = 2 % 2;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.onExtraCallback = view;
        onWarmupCompleted(view);
        int i2 = getInterfaceDescriptor + 45;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
    }

    private final void onWarmupCompleted(View view) {
        int i = 2 % 2;
        int i2 = access000 + 109;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (getWidth() > 0) {
                int i3 = access000 + 3;
                getInterfaceDescriptor = i3 % 128;
                if (i3 % 2 != 0) {
                    getHeight();
                    throw null;
                }
                if (getHeight() > 0) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
                    view.layout(0, 0, getWidth(), getHeight());
                    int i4 = getInterfaceDescriptor + 61;
                    access000 = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                return;
            }
            return;
        }
        getWidth();
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        super.onSizeChanged(i, i2, i3, i4);
        View view = this.onExtraCallback;
        if (view != null) {
            int i6 = access000 + 123;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            onWarmupCompleted(view);
        }
        int i8 = access000 + 25;
        getInterfaceDescriptor = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = getInterfaceDescriptor + 57;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.onExtraCallback;
        if (view != null) {
            int i8 = getInterfaceDescriptor + 25;
            access000 = i8 % 128;
            int i9 = i8 % 2;
            onWarmupCompleted(view);
        }
    }

    private final void onExtraCallbackWithResult(Bitmap bitmap, Exception exc, int i, int i2, View view, getKey7 getkey7) {
        int i3 = 2 % 2;
        if (exc != null) {
            int i4 = getInterfaceDescriptor + 53;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                exc.getMessage();
                throw null;
            }
            String message = exc.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            onWarmupCompleted(message);
            String str = this.onWarmupCompleted;
            if (str != null) {
                int i5 = getInterfaceDescriptor + 103;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                getkey7.IAuthTabCallback(str, view, this.onTransact, (Map) null, utilBinToHexString.HIGH, transGetSignCert.DISK, (String) null, (Function2) null, (setTaggedAddrCtrl) null);
                int i7 = getInterfaceDescriptor + 21;
                access000 = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            IAuthTabCallback(i, i2);
            Integer num = this.IAuthTabCallbackStub;
            if (num != null) {
                getkey7.onExtraCallbackWithResult(num.intValue(), view);
            }
        }
        onNavigationEvent();
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        GraniteImage graniteImage = (GraniteImage) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        FrameLayout frameLayout = new FrameLayout(graniteImage.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-65536);
        TextView textView = new TextView(graniteImage.getContext());
        textView.setText(str);
        textView.setTextColor(-1);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.addView(textView);
        graniteImage.onNavigationEvent(frameLayout);
        int i2 = access000 + 25;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        getKey7 getkey7 = (getKey7) this.asInterface.invoke();
        View view = this.onExtraCallback;
        if (view != null && getkey7 != null) {
            int i2 = getInterfaceDescriptor + 35;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            getkey7.onNavigationEvent(view);
        }
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this}, -92384962, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 92384965, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        this.IAuthTabCallbackDefault = null;
        int i4 = getInterfaceDescriptor + 99;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private final void IAuthTabCallback() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this}, -92384962, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 92384965, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(GraniteImage graniteImage, long j, long j2) {
        Object[] objArr = {graniteImage, Long.valueOf(j), Long.valueOf(j2)};
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, 1068364012, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1068364010, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final getKey7 IAuthTabCallbackDefault() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (getKey7) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, new Object[0], 1388202953, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1388202952, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private final void IAuthTabCallback(String str) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this, str}, 1293766704, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1293766704, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackStubProxy = -482525738696116419L;
    }
}

package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import dagger.Lazy;
import im.toss.core.tracker.entry.CustomizableLog;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.core.tracker.entry.TrackLog;
import im.toss.core.tracker.entry.TrackState;
import im.toss.core.tracker.entry.TrackView;
import im.toss.state.spec.SessionState;
import j$.time.ZoneId;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import o.AFj1nSDK;
import o.H_;
import o.setApTextSize;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

@Singleton
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1nSDK extends RetrofitService implements AppLovinBroadcastManagerReceiver {
    public static final onWarmupCompleted Companion;
    private static int ICustomTabsCallback;
    private static int onActivityResized;
    public static final int onExtraCallback;
    private final Context IAuthTabCallback;
    private TrackState IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private final Lazy<getRearDisplayPresentation> IAuthTabCallbackStubProxy;
    private final Lazy<zzag> IAuthTabCallback_Parcel;
    private final SessionState access000;
    private final Lazy<setSegmentCollection> access100;
    private TrackView asBinder;
    private final Lazy<setAdUnitIds> asInterface;
    private final Lazy<ConstraintsSizeResolverExternalSyntheticLambda0> extraCallback;
    private String extraCallbackWithResult;
    private final Lazy<access600> getInterfaceDescriptor;
    private TrackEvent onExtraCallbackWithResult;
    private String onNavigationEvent;
    private final Lazy<getStartTimeMillis> onTransact;
    private final boolean onWarmupCompleted;
    private final Lazy<getBillingPeriod> readTypedObject;
    private final kotlin.Lazy writeTypedObject;
    private static final byte[] $$a = {48, -22, 122, 126};
    private static final int $$b = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onMessageChannelReady = 0;
    private static int onActivityLayout = 0;
    private static int onMinimized = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3 = (i * 2) + 105;
        int i4 = s * 2;
        int i5 = 4 - (b * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            i3 = i4;
            int i7 = 0;
            i5++;
            i3 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i5];
            i5++;
            i3 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    static {
        onActivityResized = 1;
        onActivityResized();
        Companion = new onWarmupCompleted(null);
        onExtraCallback = 8;
        int i = onMessageChannelReady + 69;
        onActivityResized = i % 128;
        if (i % 2 == 0) {
            int i2 = 93 / 0;
        }
    }

    public static /* synthetic */ H_ IAuthTabCallback(AFj1nSDK aFj1nSDK) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 75;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        H_ h_ = (H_) onExtraCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{aFj1nSDK}, 359484995, iOnExtraCallback, -359484995, iOnExtraCallback2);
        int i4 = onMinimized + 19;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return h_;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i4;
        int i11 = i9 | (~(i8 | i10));
        int i12 = ~(i4 | i3 | i5);
        int i13 = i11 | i12;
        int i14 = i10 | i3;
        int i15 = i3 + i5 + i6 + (112060874 * i) + ((-1891258303) * i2);
        int i16 = i15 * i15;
        int i17 = (i3 * 1286644997) + 1783103488 + (1286644997 * i5) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i6) + ((-1427111936) * i) + (1712848896 * i2) + (159514624 * i16);
        int i18 = ((i3 * (-1669307009)) - 1771304782) + (i5 * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + (i6 * (-1669306445)) + (i * (-1582645698)) + (i2 * (-198941581)) + (i16 * (-203030528));
        return i17 + ((i18 * i18) * (-2008154112)) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ long onNavigationEvent(AFj1nSDK aFj1nSDK) {
        long jOnExtraCallback;
        int i = 2 % 2;
        int i2 = onMinimized + Imgproc.COLOR_YUV2RGBA_YVYU;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            jOnExtraCallback = onExtraCallback(aFj1nSDK);
            int i3 = 43 / 0;
        } else {
            jOnExtraCallback = onExtraCallback(aFj1nSDK);
        }
        int i4 = onActivityLayout + 47;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return jOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public AFj1nSDK(@NotNull RawWorkInfoDao_Impl rawWorkInfoDao_Impl, @NotNull Context context, @NotNull SessionState sessionState, @NotNull Lazy<access600> lazy, @NotNull Lazy<ConstraintsSizeResolverExternalSyntheticLambda0> lazy2, @NotNull Lazy<setAdUnitIds> lazy3, @NotNull Lazy<setSegmentCollection> lazy4, @NotNull Lazy<getStartTimeMillis> lazy5, @NotNull Lazy<getBillingPeriod> lazy6, @NotNull Lazy<getRearDisplayPresentation> lazy7, @NotNull Lazy<zzag> lazy8) {
        super(context);
        Intrinsics.checkNotNullParameter(rawWorkInfoDao_Impl, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(sessionState, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        Intrinsics.checkNotNullParameter(lazy2, "");
        Intrinsics.checkNotNullParameter(lazy3, "");
        Intrinsics.checkNotNullParameter(lazy4, "");
        Intrinsics.checkNotNullParameter(lazy5, "");
        Intrinsics.checkNotNullParameter(lazy6, "");
        Intrinsics.checkNotNullParameter(lazy7, "");
        Intrinsics.checkNotNullParameter(lazy8, "");
        this.IAuthTabCallback = context;
        this.access000 = sessionState;
        this.getInterfaceDescriptor = lazy;
        this.extraCallback = lazy2;
        this.asInterface = lazy3;
        this.access100 = lazy4;
        this.onTransact = lazy5;
        this.readTypedObject = lazy6;
        this.IAuthTabCallbackStubProxy = lazy7;
        this.IAuthTabCallback_Parcel = lazy8;
        this.onWarmupCompleted = rawWorkInfoDao_Impl.IAuthTabCallback_Parcel();
        this.extraCallbackWithResult = _UrlKt.FRAGMENT_ENCODE_SET;
        this.onNavigationEvent = _UrlKt.FRAGMENT_ENCODE_SET;
        this.writeTypedObject = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.tracker.TossAppLogProcessor$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 87;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                H_ h_IAuthTabCallback = AFj1nSDK.IAuthTabCallback(this.f$0);
                int i4 = onExtraCallbackWithResult + 111;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return h_IAuthTabCallback;
            }
        });
    }

    public void onExtraCallbackWithResult(@Nullable TrackEvent trackEvent) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 73;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult = trackEvent;
        int i5 = i2 + 91;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void onExtraCallback(@Nullable TrackState trackState) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 113;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = trackState;
        int i5 = i2 + 97;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public TrackState onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 111;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        TrackState trackState = this.IAuthTabCallbackDefault;
        int i5 = i3 + 95;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return trackState;
    }

    public void onExtraCallbackWithResult(@Nullable TrackView trackView) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 79;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        this.asBinder = trackView;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 119;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onMinimized + 33;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        boolean z = this.onWarmupCompleted;
        int i5 = i3 + 9;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public String access000() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 47;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = this.access000.onNavigationEvent();
        int i4 = onMinimized + 63;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 35;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zNewSessionWithExtras = DERSet.onExtraCallback.newSessionWithExtras();
        int i4 = onMinimized + 101;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return zNewSessionWithExtras;
    }

    public boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = onMinimized + 37;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onTextViewSizeChanged.onExtraCallbackWithResult.onExtraCallbackWithResult(this.IAuthTabCallback);
        int i4 = onMinimized + 71;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    private final H_ onMessageChannelReady() {
        H_ h_;
        int i = 2 % 2;
        int i2 = onActivityLayout + 99;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            h_ = (H_) this.writeTypedObject.getValue();
            int i3 = 3 / 0;
        } else {
            h_ = (H_) this.writeTypedObject.getValue();
        }
        int i4 = onActivityLayout + 15;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return h_;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final AFj1nSDK aFj1nSDK = (AFj1nSDK) objArr[0];
        int i = 2 % 2;
        H_ h_ = new H_(new Function0() { // from class: im.toss.tracker.TossAppLogProcessor$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 73;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                AFj1nSDK aFj1nSDK2 = this.f$0;
                if (i4 == 0) {
                    return Long.valueOf(AFj1nSDK.onNavigationEvent(aFj1nSDK2));
                }
                Long.valueOf(AFj1nSDK.onNavigationEvent(aFj1nSDK2));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = onActivityLayout + 99;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 29 / 0;
        }
        return h_;
    }

    private static final long onExtraCallback(AFj1nSDK aFj1nSDK) {
        long jIAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = onActivityLayout + 3;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object obj = aFj1nSDK.IAuthTabCallback_Parcel.get();
        if (i3 == 0) {
            jIAuthTabCallbackDefault = ((zzag) obj).IAuthTabCallbackDefault();
            int i4 = 20 / 0;
        } else {
            jIAuthTabCallbackDefault = ((zzag) obj).IAuthTabCallbackDefault();
        }
        int i5 = onMinimized + 9;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return jIAuthTabCallbackDefault;
        }
        throw null;
    }

    public boolean onExtraCallbackWithResult(@NotNull aq aqVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aqVar, "");
        boolean z = false;
        if (!(aqVar instanceof downloadZip)) {
            int i2 = onActivityLayout + 5;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        downloadZip downloadzip = (downloadZip) aqVar;
        boolean zBooleanValue = ((Boolean) onExtraCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{this, downloadzip}, -823798131, C40Encoder.onExtraCallback(), 823798132, C40Encoder.onExtraCallback())).booleanValue();
        if (zBooleanValue) {
            IAuthTabCallback(aqVar);
        }
        if (zBooleanValue && onExtraCallback(downloadzip)) {
            z = true;
        }
        if (aqVar instanceof ALCFaceSDK) {
            int i4 = onMinimized + 63;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallbackWithResult((ALCFaceSDK) aqVar);
            int i6 = onMinimized + 27;
            onActivityLayout = i6 % 128;
            int i7 = i6 % 2;
        }
        return z;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ALCFaceSDK aLCFaceSDK = (downloadZip) objArr[1];
        int i = 2 % 2;
        ALCFaceSDK aLCFaceSDK2 = null;
        if (aLCFaceSDK instanceof ALCFaceSDK) {
            int i2 = onActivityLayout + 87;
            onMinimized = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            aLCFaceSDK2 = aLCFaceSDK;
        } else {
            int i3 = onActivityLayout + 17;
            onMinimized = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 3;
            }
        }
        if (aLCFaceSDK2 == null) {
            return true;
        }
        int i5 = onActivityLayout + 111;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(aLCFaceSDK2.access100());
    }

    private final boolean onExtraCallback(downloadZip downloadzip) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 89;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        if ((downloadzip instanceof ALCFaceSDK) || (downloadzip instanceof CustomizableLog) || (downloadzip instanceof TrackLog)) {
            return dispatchEvent.onNavigationEvent.onWarmupCompleted(onWarmupCompleted(downloadzip)).onExtraCallbackWithResult(downloadzip);
        }
        int i5 = i2 + 105;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private final String onWarmupCompleted(downloadZip downloadzip) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 89;
        int i4 = i3 % 128;
        onActivityLayout = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = downloadzip instanceof CustomizableLog;
            throw null;
        }
        if (downloadzip instanceof CustomizableLog) {
            int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
            return (String) CustomizableLog.onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{(CustomizableLog) downloadzip}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1940829915, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1940829916);
        }
        if (downloadzip instanceof TrackLog) {
            int i7 = i4 + 25;
            onMinimized = i7 % 128;
            if (i7 % 2 != 0) {
                return ((TrackLog) downloadzip).asBinder();
            }
            ((TrackLog) downloadzip).asBinder();
            obj.hashCode();
            throw null;
        }
        if (!(downloadzip instanceof TrackEvent)) {
            Object[] objArr = new Object[1];
            a(4 - (KeyEvent.getMaxKeyCode() >> 16), KeyEvent.getDeadChar(0, 0) + 1, new char[]{65531, 65529, 5, '\b'}, false, (ViewConfiguration.getEdgeSlop() >> 16) + Imgcodecs.IMWRITE_TIFF_COMPRESSION, objArr);
            return ((String) objArr[0]).intern();
        }
        String strIAuthTabCallback_Parcel = ((TrackEvent) downloadzip).IAuthTabCallback_Parcel();
        int i8 = onActivityLayout + 71;
        onMinimized = i8 % 128;
        int i9 = i8 % 2;
        return strIAuthTabCallback_Parcel;
    }

    private final void IAuthTabCallback(aq aqVar) {
        int i = 2 % 2;
        if (!(!(aqVar instanceof TrackEvent))) {
            int i2 = onMinimized + 61;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((TrackEvent) aqVar);
            return;
        }
        if (aqVar instanceof TrackView) {
            onExtraCallbackWithResult((TrackView) aqVar);
            return;
        }
        if (aqVar instanceof TrackState) {
            int i4 = onMinimized + 31;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallback((TrackState) aqVar);
            int i6 = onActivityLayout + 125;
            onMinimized = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(ICustomTabsCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - Color.argb(0, 0, 0, 0)), 23 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), 10278 - ExpandableListView.getPackedPositionType(0L), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12843), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 55, 2167 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i7 = $11 + 81;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $10 + 79;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 12843), 55 - Color.green(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i11 = $11 + 103;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                i4 = 2083011369;
            }
            int i13 = $10 + 69;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private final void onExtraCallbackWithResult(ALCFaceSDK aLCFaceSDK) {
        int i = 2 % 2;
        List listIAuthTabCallbackStubProxy = aLCFaceSDK.IAuthTabCallbackStubProxy();
        if (listIAuthTabCallbackStubProxy.isEmpty()) {
            return;
        }
        Map mapOnNavigationEvent = onWarmupCompleted.onNavigationEvent(Companion, aLCFaceSDK.onNavigationEvent());
        if (!aLCFaceSDK.extraCallbackWithResult()) {
            ((access600) this.getInterfaceDescriptor.get()).onExtraCallback(aLCFaceSDK.access000(), mapOnNavigationEvent, listIAuthTabCallbackStubProxy);
            return;
        }
        int i2 = onMinimized + 45;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            ((access600) this.getInterfaceDescriptor.get()).onNavigationEvent(aLCFaceSDK.access000(), mapOnNavigationEvent, listIAuthTabCallbackStubProxy);
            throw null;
        }
        ((access600) this.getInterfaceDescriptor.get()).onNavigationEvent(aLCFaceSDK.access000(), mapOnNavigationEvent, listIAuthTabCallbackStubProxy);
        int i3 = onMinimized + 27;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
    }

    public boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMinimized + 45;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess000 = RemoteWorkManager.onWarmupCompleted.access000();
        int i4 = onActivityLayout + 13;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return zAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 11;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = ((ConstraintsSizeResolverExternalSyntheticLambda0) this.extraCallback.get()).onNavigationEvent();
        int i4 = onActivityLayout + 69;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return strOnNavigationEvent;
    }

    public String access100() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 83;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            onTextViewSizeChanged.onExtraCallbackWithResult.onWarmupCompleted(this.IAuthTabCallback);
            throw null;
        }
        String strOnWarmupCompleted = onTextViewSizeChanged.onExtraCallbackWithResult.onWarmupCompleted(this.IAuthTabCallback);
        int i3 = onMinimized + 15;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            return strOnWarmupCompleted;
        }
        throw null;
    }

    public String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onMinimized + 37;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        String strValueOf = String.valueOf(onTextViewSizeChanged.onExtraCallbackWithResult.IAuthTabCallback());
        int i4 = onMinimized + 35;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return strValueOf;
        }
        throw null;
    }

    public String onNavigationEvent() {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onActivityLayout + 35;
        onMinimized = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                strOnWarmupCompleted = onWarmupCompleted(onMessageChannelReady().IAuthTabCallback());
                int i3 = 83 / 0;
            } else {
                strOnWarmupCompleted = onWarmupCompleted(onMessageChannelReady().IAuthTabCallback());
            }
            return strOnWarmupCompleted;
        } catch (Throwable unused) {
            return onWarmupCompleted(System.currentTimeMillis());
        }
    }

    public String readTypedObject() throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 65;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onPostMessage();
            String str = this.extraCallbackWithResult;
            int i3 = onMinimized + 51;
            onActivityLayout = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }
        onPostMessage();
        obj.hashCode();
        throw null;
    }

    public String onTransact() throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + Imgproc.COLOR_YUV2RGB_YVYU;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onPostMessage();
        String str = this.onNavigationEvent;
        int i4 = onActivityLayout + 39;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onPostMessage() throws Throwable {
        synchronized (this) {
            boolean zIAuthTabCallback = ((setAdUnitIds) this.asInterface.get()).IAuthTabCallback();
            if (zIAuthTabCallback != this.IAuthTabCallbackStub) {
                this.IAuthTabCallbackStub = zIAuthTabCallback;
                String strOnMinimized = PlayerErrorCode.onMinimized();
                if (strOnMinimized.length() == 0) {
                    Object[] objArr = new Object[1];
                    a(1 - (ViewConfiguration.getTapTimeout() >> 16), 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{0}, false, (ViewConfiguration.getFadingEdgeLength() >> 16) + 201, objArr);
                    strOnMinimized = ((String) objArr[0]).intern();
                }
                this.extraCallbackWithResult = strOnMinimized;
                String strOnActivityLayout = PlayerErrorCode.onActivityLayout();
                if (strOnActivityLayout.length() == 0) {
                    Object[] objArr2 = new Object[1];
                    a((ViewConfiguration.getFadingEdgeLength() >> 16) + 1, TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 1, new char[]{0}, false, 200 - ImageFormat.getBitsPerPixel(0), objArr2);
                    strOnActivityLayout = ((String) objArr2[0]).intern();
                }
                this.onNavigationEvent = strOnActivityLayout;
            } else if (this.extraCallbackWithResult.length() == 0) {
                String strOnMinimized2 = PlayerErrorCode.onMinimized();
                if (strOnMinimized2.length() == 0) {
                    Object[] objArr3 = new Object[1];
                    a(View.resolveSizeAndState(0, 0, 0) + 1, 1 - ExpandableListView.getPackedPositionGroup(0L), new char[]{0}, false, (ViewConfiguration.getScrollBarSize() >> 8) + 201, objArr3);
                    strOnMinimized2 = ((String) objArr3[0]).intern();
                }
                this.extraCallbackWithResult = strOnMinimized2;
                String strOnActivityLayout2 = PlayerErrorCode.onActivityLayout();
                if (strOnActivityLayout2.length() == 0) {
                    Object[] objArr4 = new Object[1];
                    a(1 - TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, new char[]{0}, false, 201 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), objArr4);
                    strOnActivityLayout2 = ((String) objArr4[0]).intern();
                }
                this.onNavigationEvent = strOnActivityLayout2;
            }
        }
    }

    public Long asBinder() {
        int i = 2 % 2;
        int i2 = onMinimized + 1;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Long lValueOf = Long.valueOf(((setSegmentCollection) this.access100.get()).onExtraCallback());
        int i4 = onActivityLayout + 1;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return lValueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onMinimized + 99;
        onActivityLayout = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            int i3 = 61 / 0;
            if (!Intrinsics.areEqual(str, "tossbank")) {
                if (!Intrinsics.areEqual(str, "bank")) {
                    int i4 = onActivityLayout + Imgproc.COLOR_YUV2RGB_YVYU;
                    onMinimized = i4 % 128;
                    int i5 = i4 % 2;
                    return null;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if (!Intrinsics.areEqual(str, "tossbank")) {
            }
        }
        String strIAuthTabCallback = ((getRearDisplayPresentation) this.IAuthTabCallbackStubProxy.get()).IAuthTabCallback();
        int i6 = onActivityLayout + 105;
        onMinimized = i6 % 128;
        if (i6 % 2 != 0) {
            return strIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onMinimized + 99;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        SessionState sessionState = this.access000;
        if (i3 == 0) {
            return sessionState.onWarmupCompleted();
        }
        sessionState.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String asInterface() {
        int i = 2 % 2;
        int i2 = onMinimized + 19;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        getStartTimeMillis getstarttimemillis = (getStartTimeMillis) this.onTransact.get();
        if (i3 == 0) {
            return getstarttimemillis.onExtraCallback();
        }
        getstarttimemillis.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 105;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        if (!(!((getBillingPeriod) this.readTypedObject.get()).onExtraCallback())) {
            return ZoneId.systemDefault().getId();
        }
        int i4 = onActivityLayout + 125;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final boolean onExtraCallbackWithResult(downloadZip downloadzip) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return ((Boolean) onExtraCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{this, downloadzip}, -823798131, iOnExtraCallback, 823798132, iOnExtraCallback2)).booleanValue();
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public static final /* synthetic */ Map onNavigationEvent(onWarmupCompleted onwarmupcompleted, Map map) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Map mapOnNavigationEvent = onwarmupcompleted.onNavigationEvent(map);
            int i4 = onNavigationEvent + 55;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return mapOnNavigationEvent;
        }

        private final <V> Map<String, V> onNavigationEvent(Map<String, ? extends V> map) {
            int i = 2 % 2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends V> entry : map.entrySet()) {
                int i2 = onNavigationEvent + 5;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                if (!StringsKt__StringsJVMKt.startsWith$default(entry.getKey(), "_", false, 2, null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            int i4 = onNavigationEvent + 31;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return linkedHashMap;
        }
    }

    private static final H_ onExtraCallbackWithResult(AFj1nSDK aFj1nSDK) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (H_) onExtraCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{aFj1nSDK}, 359484995, iOnExtraCallback, -359484995, iOnExtraCallback2);
    }

    static void onActivityResized() {
        ICustomTabsCallback = 478309040;
    }
}

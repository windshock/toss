package im.toss.features.benefit.ui.component;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.initech.xsafe.cert.INIXSAFEProtocolException;
import im.toss.features.benefit.R$string;
import im.toss.features.benefit.dto.AdContentType;
import im.toss.features.benefit.dto.AdsInfo;
import im.toss.features.benefit.ui.component.VideoAdsController$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppSetIdAndScope1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda7;
import o.CarouselKtExternalSyntheticLambda8;
import o.CarouselPagerStateExternalSyntheticLambda1;
import o.CommonModule_setSecureScreen;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.NavigatorBridgeExtension;
import o.RecomposerErrorInformation;
import o.RecomposerKt;
import o.RecomposeraddCompositionRegistrationObserver2;
import o.RecomposerawaitIdle2;
import o.RelativeGroupPath;
import o.SpannedDataExternalSyntheticLambda0;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.ea10;
import o.findRes;
import o.findResAndMsg;
import o.getAdService;
import o.getCornerRadius;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getPackageType;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.onDeactivateMessage;
import o.putChannelInfo;
import o.readIntokhttp;
import o.setProtocolsokhttp;
import o.setRandomHost;
import o.setShine;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class VideoAdsController extends ConstraintLayout {
    private static int extraCallbackWithResult = 1;
    private static int onMinimized = 0;
    private static int onPostMessage = 1;
    private static int readTypedObject;
    private final List<onExtraCallback> IAuthTabCallback;
    private final getCornerRadius<Boolean> IAuthTabCallbackDefault;
    private final AtomicBoolean IAuthTabCallbackStub;
    private final getCornerRadius<AdsInfo> IAuthTabCallbackStubProxy;
    private ExoPlayer IAuthTabCallback_Parcel;
    private getPackageType ICustomTabsCallback;
    private TextFieldScrollKtExternalSyntheticLambda0 access000;
    private IAuthTabCallback access100;
    private final getCornerRadius<AdsInfo> asBinder;
    private long asInterface;
    private getPackageType extraCallback;
    private String getInterfaceDescriptor;
    private final NavigatorBridgeExtension onExtraCallback;
    private final Lazy onNavigationEvent;
    private IAuthTabCallbackStub onTransact;
    private final getCornerRadius<Boolean> writeTypedObject;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult((DefaultConstructorMarker) null);
    public static final int onExtraCallbackWithResult = 8;
    private static final AppSetIdAndScope1 onWarmupCompleted = ea10.onExtraCallbackWithResult("VideoAdsController");

    static final class IAuthTabCallbackStubProxy extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = VideoAdsController.onExtraCallbackWithResult(VideoAdsController.this, (AdsInfo) null, (access13800) this);
            int i4 = onExtraCallback + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 62 / 0;
            }
            return objOnExtraCallbackWithResult;
        }
    }

    public interface onExtraCallback {
        void IAuthTabCallback(@NotNull asBinder asbinder, long j);

        void onExtraCallback();

        void onExtraCallback(@NotNull onWarmupCompleted onwarmupcompleted);

        void onExtraCallbackWithResult();

        void onExtraCallbackWithResult(@NotNull asBinder asbinder);

        void onNavigationEvent(int i);

        void onNavigationEvent(long j);

        void onWarmupCompleted();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoAdsController(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoAdsController(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(VideoAdsController videoAdsController, AdsInfo adsInfo, RecomposerKt recomposerKt) {
        int i = 2 % 2;
        int i2 = readTypedObject + 67;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(videoAdsController, adsInfo, recomposerKt);
        }
        onWarmupCompleted(videoAdsController, adsInfo, recomposerKt);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(VideoAdsController videoAdsController, View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 29;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsController, view}, iOnWarmupCompleted3, iOnWarmupCompleted2, 1793946919, -1793946917, iOnWarmupCompleted);
        int i4 = readTypedObject + 49;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(VideoAdsController videoAdsController, View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(videoAdsController, view, suspendAnimationKtExternalSyntheticLambda4);
        int i4 = readTypedObject + 75;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(VideoAdsController videoAdsController, View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsController, view}, iOnWarmupCompleted3, iOnWarmupCompleted2, -1174282065, 1174282065, iOnWarmupCompleted);
        int i4 = readTypedObject + 49;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ DefaultLoadControl onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = readTypedObject + 5;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DefaultLoadControl defaultLoadControlAsBinder = asBinder();
        int i4 = readTypedObject + 85;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultLoadControlAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(VideoAdsController videoAdsController, View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 71;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
            onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsController, view}, iOnWarmupCompleted3, iOnWarmupCompleted2, -1382696392, 1382696395, iOnWarmupCompleted);
            throw null;
        }
        int iOnWarmupCompleted4 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted5 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted6 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsController, view}, iOnWarmupCompleted6, iOnWarmupCompleted5, -1382696392, 1382696395, iOnWarmupCompleted4);
        int i3 = readTypedObject + 47;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~((~i6) | i7 | i5);
        int i9 = (~(i7 | (~i5))) | (~(i5 | i6));
        int i10 = (~(i6 | i4)) | i5;
        int i11 = i5 + i4 + i3 + ((-407681510) * i2) + ((-298114539) * i);
        int i12 = i11 * i11;
        int i13 = ((-1498977624) * i5) + 672923648 + (2103481690 * i4) + (i8 * 346253991) + (346253991 * i9) + ((-346253991) * i10) + ((-1845231616) * i3) + ((-328728576) * i2) + ((-2108424192) * i) + ((-1296629760) * i12);
        int i14 = ((i5 * 57881544) - 1472685786) + (i4 * 57881954) + (i8 * (-205)) + (i9 * (-205)) + (i10 * 205) + (i3 * 57881749) + (i2 * 289608994) + (i * 969284153) + (i12 * 813891584);
        switch (i13 + (i14 * i14 * 454098944)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return onTransact(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ void onWarmupCompleted(VideoAdsController videoAdsController, View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 63;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(videoAdsController, view);
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
    }

    public static final class IAuthTabCallback_Parcel implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallback_Parcel(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.onWarmupCompleted) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.onWarmupCompleted) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = im.toss.features.benefit.ui.component.VideoAdsController.IAuthTabCallback_Parcel.IAuthTabCallback + 117;
            im.toss.features.benefit.ui.component.VideoAdsController.IAuthTabCallback_Parcel.onNavigationEvent = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 83 / 0;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VideoAdsController(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        NavigatorBridgeExtension navigatorBridgeExtensionIAuthTabCallback = NavigatorBridgeExtension.IAuthTabCallback(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(navigatorBridgeExtensionIAuthTabCallback, "");
        this.onExtraCallback = navigatorBridgeExtensionIAuthTabCallback;
        this.IAuthTabCallback = new ArrayList();
        this.asBinder = setShine.onNavigationEvent((Object) null);
        this.IAuthTabCallbackStubProxy = setShine.onNavigationEvent((Object) null);
        Boolean bool = Boolean.FALSE;
        this.writeTypedObject = setShine.onNavigationEvent(bool);
        this.IAuthTabCallbackDefault = setShine.onNavigationEvent(bool);
        this.access100 = IAuthTabCallback.INITIAL_STATE;
        navigatorBridgeExtensionIAuthTabCallback.getRoot().setOnClickListener(new VideoAdsController$.ExternalSyntheticLambda0(this));
        navigatorBridgeExtensionIAuthTabCallback.onExtraCallback.setOnClickListener(new VideoAdsController$.ExternalSyntheticLambda1(this));
        navigatorBridgeExtensionIAuthTabCallback.onWarmupCompleted.setOnClickListener(new VideoAdsController$.ExternalSyntheticLambda2(this));
        IAuthTabCallbackDefault().IAuthTabCallback.setOnClickListener(new VideoAdsController$.ExternalSyntheticLambda3(this));
        IAuthTabCallbackStub();
        this.IAuthTabCallbackStub = new AtomicBoolean(false);
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new VideoAdsController$.ExternalSyntheticLambda4());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VideoAdsController(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = readTypedObject + 113;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = extraCallbackWithResult + 3;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ List IAuthTabCallback(VideoAdsController videoAdsController) {
        int i = 2 % 2;
        int i2 = readTypedObject + 5;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Object obj = null;
        List<onExtraCallback> list = videoAdsController.IAuthTabCallback;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 13;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public static final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 IAuthTabCallbackDefault(VideoAdsController videoAdsController) {
        int i = 2 % 2;
        int i2 = readTypedObject + 87;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = videoAdsController.access000;
        int i5 = i3 + 33;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return textFieldScrollKtExternalSyntheticLambda0;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        VideoAdsController videoAdsController = (VideoAdsController) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 47;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<AdsInfo> getcornerradius = videoAdsController.asBinder;
        int i5 = i2 + 121;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return getcornerradius;
        }
        throw null;
    }

    public static final /* synthetic */ onDeactivateMessage IAuthTabCallbackStub(VideoAdsController videoAdsController) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 71;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            videoAdsController.IAuthTabCallbackDefault();
            throw null;
        }
        onDeactivateMessage ondeactivatemessageIAuthTabCallbackDefault = videoAdsController.IAuthTabCallbackDefault();
        int i3 = readTypedObject + 21;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return ondeactivatemessageIAuthTabCallbackDefault;
    }

    public static final /* synthetic */ void access100(VideoAdsController videoAdsController) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 95;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        videoAdsController.IAuthTabCallback_Parcel();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 95;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        VideoAdsController videoAdsController = (VideoAdsController) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 121;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getPackageType getpackagetype = videoAdsController.ICustomTabsCallback;
        if (i4 == 0) {
            int i5 = 33 / 0;
        }
        int i6 = i2 + 35;
        extraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return getpackagetype;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        VideoAdsController videoAdsController = (VideoAdsController) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 25;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<Boolean> getcornerradius = videoAdsController.writeTypedObject;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 89;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public static final /* synthetic */ AppSetIdAndScope1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 87;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = onWarmupCompleted;
        int i5 = i3 + 123;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return appSetIdAndScope1;
        }
        throw null;
    }

    public static final /* synthetic */ getCornerRadius onExtraCallback(VideoAdsController videoAdsController) {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getCornerRadius<Boolean> getcornerradius = videoAdsController.IAuthTabCallbackDefault;
        if (i4 == 0) {
            int i5 = 3 / 0;
        }
        int i6 = i3 + 57;
        readTypedObject = i6 % 128;
        if (i6 % 2 == 0) {
            return getcornerradius;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(VideoAdsController videoAdsController, AdsInfo adsInfo, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = readTypedObject + 31;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = videoAdsController.onNavigationEvent(adsInfo, (access13800<? super Unit>) access13800Var);
        int i4 = extraCallbackWithResult + 115;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ NavigatorBridgeExtension onExtraCallbackWithResult(VideoAdsController videoAdsController) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        NavigatorBridgeExtension navigatorBridgeExtension = videoAdsController.onExtraCallback;
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return navigatorBridgeExtension;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(VideoAdsController videoAdsController, AdsInfo adsInfo) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 79;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        videoAdsController.IAuthTabCallback(adsInfo);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 97;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(VideoAdsController videoAdsController, getPackageType getpackagetype) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 33;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        videoAdsController.ICustomTabsCallback = getpackagetype;
        int i5 = i2 + 29;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(VideoAdsController videoAdsController, AdsInfo adsInfo) {
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
            onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsController, adsInfo}, iOnWarmupCompleted3, iOnWarmupCompleted2, -196325678, 196325683, iOnWarmupCompleted);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted4 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted5 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted6 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsController, adsInfo}, iOnWarmupCompleted6, iOnWarmupCompleted5, -196325678, 196325683, iOnWarmupCompleted4);
        int i3 = extraCallbackWithResult + 85;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        VideoAdsController videoAdsController = (VideoAdsController) objArr[0];
        StyledPlayerView styledPlayerView = (StyledPlayerView) objArr[1];
        AdsInfo adsInfo = (AdsInfo) objArr[2];
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        videoAdsController.onWarmupCompleted(styledPlayerView, adsInfo);
        int i4 = readTypedObject + 41;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        VideoAdsController videoAdsController = (VideoAdsController) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 45;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<AdsInfo> getcornerradius = videoAdsController.IAuthTabCallbackStubProxy;
        if (i3 != 0) {
            return getcornerradius;
        }
        throw null;
    }

    public static final /* synthetic */ String onWarmupCompleted(VideoAdsController videoAdsController) {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = videoAdsController.getInterfaceDescriptor;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return str;
    }

    private final onDeactivateMessage IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 83;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(this.onExtraCallback.onNavigationEvent, "");
            throw null;
        }
        onDeactivateMessage ondeactivatemessage = this.onExtraCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(ondeactivatemessage, "");
        int i3 = readTypedObject + 107;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return ondeactivatemessage;
    }

    private final boolean onTransact() {
        Float fValueOf;
        int i = 2 % 2;
        ExoPlayer exoPlayer = this.IAuthTabCallback_Parcel;
        if (exoPlayer == null) {
            return true;
        }
        if (exoPlayer != null) {
            int i2 = readTypedObject + 79;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            fValueOf = Float.valueOf(exoPlayer.getVolume());
        } else {
            fValueOf = null;
        }
        if (Intrinsics.areEqual(fValueOf, 0.0f)) {
            return true;
        }
        int i4 = readTypedObject + 119;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        if (z) {
            ExoPlayer exoPlayer = this.IAuthTabCallback_Parcel;
            if (exoPlayer != null) {
                exoPlayer.setVolume(0.0f);
                int i2 = extraCallbackWithResult + 37;
                readTypedObject = i2 % 128;
                int i3 = i2 % 2;
            }
            ExoPlayer exoPlayer2 = this.IAuthTabCallback_Parcel;
            if (exoPlayer2 != null) {
                exoPlayer2.setAudioAttributes(AudioAttributes.DEFAULT, false);
            }
            this.onExtraCallback.onExtraCallbackWithResult.setImageResource(R.drawable.icon_sound_off_mono_2_white);
            this.onExtraCallback.onWarmupCompleted.setContentDescription(getContext().getString(R$string.benefit_btn_mute_off));
            return;
        }
        ExoPlayer exoPlayer3 = this.IAuthTabCallback_Parcel;
        if (exoPlayer3 != null) {
            int i4 = readTypedObject + 31;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                exoPlayer3.setAudioAttributes(AudioAttributes.DEFAULT, false);
            } else {
                exoPlayer3.setAudioAttributes(AudioAttributes.DEFAULT, true);
            }
            int i5 = readTypedObject + 59;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        this.onExtraCallback.onExtraCallbackWithResult.setImageResource(R.drawable.icon_sound_on_mono_2_white);
        this.onExtraCallback.onWarmupCompleted.setContentDescription(getContext().getString(R$string.benefit_btn_mute_on));
        ExoPlayer exoPlayer4 = this.IAuthTabCallback_Parcel;
        if (exoPlayer4 != null) {
            exoPlayer4.setVolume(1.0f);
        }
    }

    static final class extraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ AdsInfo $adsInfo;
        Object L$0;
        int label;
        private static final byte[] $$a = {15, 58, -59};
        private static final int $$b = 243;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static long onWarmupCompleted = 7798559133331975163L;
        private static int onNavigationEvent = -234714027;
        private static char onExtraCallback = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, short s2, short s3) {
            int i;
            int i2 = (s3 * 2) + 3;
            byte[] bArr = $$a;
            int i3 = s + 109;
            int i4 = s2 * 3;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            if (bArr == null) {
                int i6 = i5;
                int i7 = i2;
                i = 0;
                i2++;
                i3 = i7 + (-i6);
                int i8 = i2;
                int i9 = i3;
                bArr2[i] = (byte) i9;
                if (i == i5) {
                    return new String(bArr2, 0);
                }
                i++;
                i6 = bArr[i8];
                i2 = i8;
                i7 = i9;
                i2++;
                i3 = i7 + (-i6);
                int i82 = i2;
                int i92 = i3;
                bArr2[i] = (byte) i92;
                if (i == i5) {
                }
            } else {
                i = 0;
                int i822 = i2;
                int i922 = i3;
                bArr2[i] = (byte) i922;
                if (i == i5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        extraCallbackWithResult(AdsInfo adsInfo, access13800<? super extraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$adsInfo = adsInfo;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCallbackWithResult extracallbackwithresult = VideoAdsController.this.new extraCallbackWithResult(this.$adsInfo, access13800Var);
            int i2 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return extracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 15 / 0;
            }
            int i5 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
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
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i4 = $10 + 69;
                $11 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                        int minimumFlingVelocity = 43 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1451;
                        byte b = (byte) ($$b & 5);
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, minimumFlingVelocity, keyRepeatTimeout, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.getOffsetAfter("", 0) + 44, 1494 - (ViewConfiguration.getPressedStateDuration() >> 16), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getPressedStateDuration() >> 16)), Color.blue(0) + 50, ImageFormat.getBitsPerPixel(0) + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 45848), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28, TextUtils.indexOf("", "") + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i6 = $10 + 119;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[PHI: r1
          0x004a: PHI (r1v33 java.lang.Object) = (r1v4 java.lang.Object), (r1v34 java.lang.Object) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r5
          0x0026: PHI (r5v1 int) = (r5v0 int), (r5v17 int) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 48 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Context context = VideoAdsController.this.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    RecomposerawaitIdle2 recomposerawaitIdle2OnExtraCallbackWithResult = new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(this.$adsInfo.readTypedObject()).onExtraCallbackWithResult();
                    Context context2 = VideoAdsController.this.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context2);
                    this.L$0 = access15400.onNavigationEvent(recomposerawaitIdle2OnExtraCallbackWithResult);
                    this.label = 1;
                    obj = carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onNavigationEvent(recomposerawaitIdle2OnExtraCallbackWithResult, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = onExtraCallbackWithResult + 41;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.onNavigationEvent(obj);
                    int i7 = IAuthTabCallback + 53;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            RecomposerKt recomposerKt = (RecomposerErrorInformation) obj;
            if (!(!(recomposerKt instanceof RecomposerKt))) {
                int i9 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                if (!Intrinsics.areEqual(this.$adsInfo, ((getCornerRadius) VideoAdsController.onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{VideoAdsController.this}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1607906445, 1607906452, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).IAuthTabCallback())) {
                    int i11 = onExtraCallbackWithResult + 51;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    return Unit.INSTANCE;
                }
                ConstraintLayout constraintLayoutOnWarmupCompleted = VideoAdsController.onExtraCallbackWithResult(VideoAdsController.this).onNavigationEvent.onWarmupCompleted();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutOnWarmupCompleted, "");
                constraintLayoutOnWarmupCompleted.setVisibility(8);
                TdsImageView tdsImageView = VideoAdsController.IAuthTabCallbackStub(VideoAdsController.this).onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                tdsImageView.setVisibility(8);
                TdsImageView tdsImageView2 = VideoAdsController.IAuthTabCallbackStub(VideoAdsController.this).onExtraCallbackWithResult;
                Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                tdsImageView2.setVisibility(8);
                Typography5 typography5 = VideoAdsController.IAuthTabCallbackStub(VideoAdsController.this).IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(typography5, "");
                typography5.setVisibility(8);
                FrameLayout frameLayout = VideoAdsController.onExtraCallbackWithResult(VideoAdsController.this).onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                frameLayout.setVisibility(8);
                TdsImageView tdsImageView3 = VideoAdsController.onExtraCallbackWithResult(VideoAdsController.this).IAuthTabCallback;
                CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult = recomposerKt.onExtraCallbackWithResult();
                Resources resources = VideoAdsController.this.getContext().getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                tdsImageView3.setImageDrawable(CarouselPagerStateExternalSyntheticLambda1.onWarmupCompleted(carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult, resources));
                TdsImageView tdsImageView4 = VideoAdsController.onExtraCallbackWithResult(VideoAdsController.this).IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(tdsImageView4, "");
                tdsImageView4.setVisibility(0);
                ((getCornerRadius) VideoAdsController.onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{VideoAdsController.this}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1588598151, -1588598147, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).onWarmupCompleted(this.$adsInfo);
            } else {
                if (!(recomposerKt instanceof RecomposeraddCompositionRegistrationObserver2)) {
                    throw new NoWhenBranchMatchedException();
                }
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("ad_id", access14000.onExtraCallback(this.$adsInfo.IAuthTabCallbackStub()));
                Object[] objArr = new Object[1];
                a((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3355), (-241221570) + (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{58636, 31363, 54725}, new char[]{0, 0, 0, 0}, new char[]{16196, 40768, 7153, 53517}, objArr);
                ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "benefit_thumbnailBanner_imageLoad_fail", (String) null, (Throwable) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.$adsInfo.IAuthTabCallback_Parcel()), getWrite.IAuthTabCallback("thumbnail_url", this.$adsInfo.readTypedObject())}), 4, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    private static final void onNavigationEvent(VideoAdsController videoAdsController, View view) {
        Iterator it;
        int i = 2 % 2;
        int i2 = readTypedObject + 115;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List<onExtraCallback> list = videoAdsController.IAuthTabCallback;
        if (i3 == 0) {
            it = list.iterator();
            int i4 = 61 / 0;
        } else {
            it = list.iterator();
        }
        while (it.hasNext()) {
            int i5 = readTypedObject + 49;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                ((onExtraCallback) it.next()).onExtraCallbackWithResult();
                int i6 = 51 / 0;
            } else {
                ((onExtraCallback) it.next()).onExtraCallbackWithResult();
            }
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Iterator it;
        VideoAdsController videoAdsController = (VideoAdsController) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        List<onExtraCallback> list = videoAdsController.IAuthTabCallback;
        if (i3 != 0) {
            it = list.iterator();
            int i4 = 40 / 0;
        } else {
            it = list.iterator();
        }
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                return null;
            }
            int i5 = extraCallbackWithResult + 51;
            readTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                ((onExtraCallback) it.next()).onWarmupCompleted();
                obj.hashCode();
                throw null;
            }
            ((onExtraCallback) it.next()).onWarmupCompleted();
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        VideoAdsController videoAdsController = (VideoAdsController) objArr[0];
        int i = 2 % 2;
        if (videoAdsController.onTransact()) {
            Iterator<T> it = videoAdsController.IAuthTabCallback.iterator();
            while (it.hasNext()) {
                int i2 = readTypedObject + 25;
                extraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                ((onExtraCallback) it.next()).onExtraCallback(onWarmupCompleted.UNMUTE);
            }
        } else {
            Iterator<T> it2 = videoAdsController.IAuthTabCallback.iterator();
            int i4 = readTypedObject + 3;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 5;
            }
            while (it2.hasNext()) {
                int i6 = extraCallbackWithResult + 39;
                readTypedObject = i6 % 128;
                if (i6 % 2 != 0) {
                    ((onExtraCallback) it2.next()).onExtraCallback(onWarmupCompleted.MUTE);
                    throw null;
                }
                ((onExtraCallback) it2.next()).onExtraCallback(onWarmupCompleted.MUTE);
            }
        }
        videoAdsController.onNavigationEvent(!videoAdsController.onTransact());
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        VideoAdsController videoAdsController = (VideoAdsController) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        ExoPlayer exoPlayer = videoAdsController.IAuthTabCallback_Parcel;
        if (exoPlayer != null) {
            int i5 = i3 + 63;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int playbackState = exoPlayer.getPlaybackState();
            if (playbackState != 3) {
                if (playbackState == 4) {
                    Iterator<T> it = videoAdsController.IAuthTabCallback.iterator();
                    while (!(!it.hasNext())) {
                        ((onExtraCallback) it.next()).onExtraCallback(onWarmupCompleted.REPLAY);
                    }
                    Iterator<T> it2 = videoAdsController.IAuthTabCallback.iterator();
                    int i7 = readTypedObject + 117;
                    extraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    while (it2.hasNext()) {
                        int i9 = extraCallbackWithResult + 9;
                        readTypedObject = i9 % 128;
                        if (i9 % 2 != 0) {
                            ((onExtraCallback) it2.next()).onExtraCallbackWithResult(asBinder.MANUAL);
                            int i10 = 32 / 0;
                        } else {
                            ((onExtraCallback) it2.next()).onExtraCallbackWithResult(asBinder.MANUAL);
                        }
                    }
                    exoPlayer.seekTo(0L);
                    videoAdsController.IAuthTabCallback("play click");
                    return null;
                }
            } else {
                if (exoPlayer.getPlayWhenReady()) {
                    Iterator<T> it3 = videoAdsController.IAuthTabCallback.iterator();
                    while (!(!it3.hasNext())) {
                        ((onExtraCallback) it3.next()).onExtraCallback(onWarmupCompleted.PAUSE);
                    }
                    Iterator<T> it4 = videoAdsController.IAuthTabCallback.iterator();
                    while (it4.hasNext()) {
                        ((onExtraCallback) it4.next()).IAuthTabCallback(asBinder.MANUAL, exoPlayer.getCurrentPosition());
                    }
                    videoAdsController.onExtraCallback(IAuthTabCallback.USER_ACTION);
                    return null;
                }
                Iterator<T> it5 = videoAdsController.IAuthTabCallback.iterator();
                while (it5.hasNext()) {
                    ((onExtraCallback) it5.next()).onExtraCallback(onWarmupCompleted.PLAY);
                }
                Iterator<T> it6 = videoAdsController.IAuthTabCallback.iterator();
                while (it6.hasNext()) {
                    int i11 = extraCallbackWithResult + 91;
                    readTypedObject = i11 % 128;
                    int i12 = i11 % 2;
                    ((onExtraCallback) it6.next()).onExtraCallbackWithResult(asBinder.MANUAL);
                }
                videoAdsController.IAuthTabCallback("play click");
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(VideoAdsController videoAdsController, View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 15;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            string.hashCode();
            throw null;
        }
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            CharSequence text = videoAdsController.IAuthTabCallbackDefault().IAuthTabCallbackStub.getText();
            Typography5 typography5 = videoAdsController.IAuthTabCallbackDefault().IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            string = typography5.getVisibility() == 0 ? text : null;
            if (string == null) {
                string = videoAdsController.getContext().getString(R$string.benefit_btn_play_pause);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            suspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback(string);
        }
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            int i3 = extraCallbackWithResult + 37;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            suspendAnimationKtExternalSyntheticLambda4.onExtraCallback("android.widget.Button");
        }
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        Typography7 typography7 = this.onExtraCallback.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        setProtocolsokhttp.onExtraCallback(typography7);
        FrameLayout frameLayout = this.onExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        setProtocolsokhttp.onExtraCallback(frameLayout);
        View view = IAuthTabCallbackDefault().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(view, "");
        setProtocolsokhttp.IAuthTabCallback(view, new VideoAdsController$.ExternalSyntheticLambda6(this));
        IAuthTabCallbackDefault().onExtraCallback.setImportantForAccessibility(2);
        IAuthTabCallbackDefault().IAuthTabCallbackStub.setImportantForAccessibility(2);
        int i2 = extraCallbackWithResult + 107;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ExoPlayer exoPlayer = this.IAuthTabCallback_Parcel;
        if (exoPlayer != null) {
            boolean z = exoPlayer.getPlaybackState() == 4;
            if (z) {
                TdsImageView tdsImageView = this.onExtraCallback.IAuthTabCallback;
                tdsImageView.setImageDrawable((Drawable) null);
                Intrinsics.checkNotNull(tdsImageView);
                RelativeGroupPath.onExtraCallback(tdsImageView);
                tdsImageView.setVisibility(0);
            }
            if (!z) {
                int i4 = readTypedObject + 29;
                extraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 52 / 0;
                    if (!this.access100.getShouldResumeOnVisible()) {
                        return;
                    }
                } else if (!this.access100.getShouldResumeOnVisible()) {
                    return;
                }
                TdsImageView tdsImageView2 = this.onExtraCallback.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                tdsImageView2.setVisibility(8);
                Iterator<T> it = this.IAuthTabCallback.iterator();
                while (it.hasNext()) {
                    ((onExtraCallback) it.next()).onExtraCallbackWithResult(asBinder.AUTO);
                }
                IAuthTabCallback("shouldResumeOnVisible");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x015e, code lost:
    
        if (o.formatMsgs.onWarmupCompleted(1000, r4) == r6) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[PHI: r4 r7
      0x0031: PHI (r4v10 im.toss.features.benefit.ui.component.VideoAdsController$IAuthTabCallbackStubProxy) = 
      (r4v9 im.toss.features.benefit.ui.component.VideoAdsController$IAuthTabCallbackStubProxy)
      (r4v12 im.toss.features.benefit.ui.component.VideoAdsController$IAuthTabCallbackStubProxy)
     binds: [B:10:0x002f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r7v6 int) = (r7v5 int), (r7v8 int) binds: [B:10:0x002f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(AdsInfo adsInfo, access13800<? super Unit> access13800Var) {
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy;
        int i;
        int i2;
        AdsInfo adsInfo2 = adsInfo;
        int i3 = 2 % 2;
        int i4 = 0;
        if (access13800Var instanceof IAuthTabCallbackStubProxy) {
            int i5 = readTypedObject + 93;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                iAuthTabCallbackStubProxy = (IAuthTabCallbackStubProxy) access13800Var;
                i2 = iAuthTabCallbackStubProxy.label;
                int i6 = 16 / 0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    int i7 = extraCallbackWithResult + 69;
                    readTypedObject = i7 % 128;
                    int i8 = i7 % 2;
                    iAuthTabCallbackStubProxy.label = i2 - 2147483648;
                } else {
                    iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(access13800Var);
                }
            } else {
                iAuthTabCallbackStubProxy = (IAuthTabCallbackStubProxy) access13800Var;
                i2 = iAuthTabCallbackStubProxy.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object obj = iAuthTabCallbackStubProxy.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i9 = iAuthTabCallbackStubProxy.label;
        int i10 = 1;
        if (i9 == 0) {
            ResultKt.onNavigationEvent(obj);
            Objects.toString(adsInfo);
            if (adsInfo.onWarmupCompleted() == AdContentType.VIDEO) {
                int i11 = extraCallbackWithResult + 29;
                readTypedObject = i11 % 128;
                int i12 = i11 % 2;
                i = 1;
            } else {
                i = 0;
            }
            if (i != 0) {
                ExoPlayer exoPlayer = this.IAuthTabCallback_Parcel;
                if (exoPlayer != null && exoPlayer.getContentPosition() == 0) {
                    i4 = 1;
                }
                if (i4 != 0) {
                    int i13 = extraCallbackWithResult + 93;
                    readTypedObject = i13 % 128;
                    if (i13 % 2 != 0) {
                        if (((Double) AdsInfo.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{adsInfo}, 1982881010, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1982881008)).doubleValue() > 0.0d) {
                            access000 access000Var = new access000(adsInfo2, this, (access13800) null);
                            iAuthTabCallbackStubProxy.L$0 = adsInfo2;
                            iAuthTabCallbackStubProxy.I$0 = 1;
                            iAuthTabCallbackStubProxy.I$1 = i4;
                            iAuthTabCallbackStubProxy.label = 1;
                            if (findRes.onExtraCallbackWithResult(access000Var, iAuthTabCallbackStubProxy) != objOnWarmupCompleted) {
                            }
                            return objOnWarmupCompleted;
                        }
                        IAuthTabCallback_Parcel();
                    } else {
                        if (((Double) AdsInfo.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{adsInfo}, 1982881010, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1982881008)).doubleValue() > 0.0d) {
                        }
                    }
                } else {
                    IAuthTabCallback_Parcel();
                }
            } else {
                i10 = i;
            }
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i14 = extraCallbackWithResult + 53;
                readTypedObject = i14 % 128;
                if (i14 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                adsInfo2 = (AdsInfo) iAuthTabCallbackStubProxy.L$0;
                ResultKt.onNavigationEvent(obj);
                Objects.toString(adsInfo2);
                Iterator<T> it = this.IAuthTabCallback.iterator();
                while (it.hasNext()) {
                    ((onExtraCallback) it.next()).onExtraCallback();
                }
                Unit unit = Unit.INSTANCE;
                int i15 = readTypedObject + 107;
                extraCallbackWithResult = i15 % 128;
                if (i15 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
            i10 = iAuthTabCallbackStubProxy.I$0;
            adsInfo2 = (AdsInfo) iAuthTabCallbackStubProxy.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        this.asInterface = zzaj.onWarmupCompleted().IAuthTabCallbackDefault();
        for (onExtraCallback onextracallback : this.IAuthTabCallback) {
            int i16 = readTypedObject + 67;
            extraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
        }
        iAuthTabCallbackStubProxy.L$0 = adsInfo2;
        iAuthTabCallbackStubProxy.I$0 = i10;
        iAuthTabCallbackStubProxy.label = 2;
    }

    public static final class getInterfaceDescriptor implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public getInterfaceDescriptor(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onWarmupCompleted + 83;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            obj.hashCode();
            throw null;
        }
    }

    private final void IAuthTabCallback(AdsInfo adsInfo) {
        int i = 2 % 2;
        Objects.toString(adsInfo);
        ExoPlayer exoPlayer = this.IAuthTabCallback_Parcel;
        if (exoPlayer != null && exoPlayer.isPlaying()) {
            int i2 = readTypedObject + 57;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(IAuthTabCallback.LOST_FOCUS);
            ExoPlayer exoPlayer2 = this.IAuthTabCallback_Parcel;
            long currentPosition = exoPlayer2 != null ? exoPlayer2.getCurrentPosition() : -1L;
            Iterator<T> it = this.IAuthTabCallback.iterator();
            while (it.hasNext()) {
                int i4 = readTypedObject + 81;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                ((onExtraCallback) it.next()).IAuthTabCallback(asBinder.AUTO, currentPosition);
                int i6 = extraCallbackWithResult + 121;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (this.asInterface > 0) {
            zzaj.onWarmupCompleted().IAuthTabCallbackDefault();
            for (onExtraCallback onextracallback : this.IAuthTabCallback) {
            }
            this.asInterface = 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0;
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        int i = 2 % 2;
        int i2 = readTypedObject + 85;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.onAttachedToWindow();
        this.access000 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (this.IAuthTabCallbackStub.getAndSet(true) || (textFieldScrollKtExternalSyntheticLambda0 = this.access000) == null || (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0)) == null || (textFieldScrollKtExternalSyntheticLambda02 = this.access000) == null || (lifecycle = textFieldScrollKtExternalSyntheticLambda02.getLifecycle()) == null) {
            return;
        }
        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new access100(lifecycle, this, (access13800) null), 3, (Object) null);
        int i4 = readTypedObject + 91;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallbackDefault implements AnalyticsListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int asInterface = 1;
        final /* synthetic */ AdsInfo IAuthTabCallback;
        final /* synthetic */ VideoAdsController onExtraCallbackWithResult;
        final /* synthetic */ StyledPlayerView onWarmupCompleted;
        private static char[] onNavigationEvent = {64991, 64966, 64961, 64990};
        private static char onExtraCallback = 51243;

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onNavigationEvent;
            int i4 = 3;
            if (cArr2 != null) {
                int i5 = $11 + 53;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + i4;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 26 - TextUtils.indexOf("", ""), Color.red(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7++;
                        i4 = 3;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i10 = $10 + 117;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            long j = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(j) + 24824), 73 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf("", "") + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 30 - KeyEvent.keyCodeFromString(""), View.resolveSizeAndState(0, 0, 0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                            int i13 = $10 + 115;
                            $11 = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i14 = 4 / 4;
                            }
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        } else {
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    j = 0;
                }
            }
            int i19 = 0;
            while (i19 < i) {
                int i20 = $10 + 113;
                $11 = i20 % 128;
                if (i20 % 2 == 0) {
                    cArr4[i19] = (char) (cArr4[i19] ^ 29324);
                    i19 += 43;
                } else {
                    cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                    i19++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        IAuthTabCallbackDefault(AdsInfo adsInfo, VideoAdsController videoAdsController, StyledPlayerView styledPlayerView) {
            this.IAuthTabCallback = adsInfo;
            this.onExtraCallbackWithResult = videoAdsController;
            this.onWarmupCompleted = styledPlayerView;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x00d9, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00da, code lost:
        
            r1 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            r4 = o.getWrite.IAuthTabCallback("ad_id", java.lang.Long.valueOf(r21.IAuthTabCallback.IAuthTabCallbackStub()));
            r12 = new java.lang.Object[1];
            a(new char[]{0, 3, 13929}, (byte) (115 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 3, r12);
            r1.onExtraCallbackWithResult("benefit_thumbnailBanner_playback_failed", (java.lang.String) null, r23, o.access8100.onWarmupCompleted(new kotlin.Pair[]{r4, o.getWrite.IAuthTabCallback(((java.lang.String) r12[0]).intern(), r21.IAuthTabCallback.IAuthTabCallback_Parcel()), o.getWrite.IAuthTabCallback("thumbnail_url", r21.IAuthTabCallback.readTypedObject())}));
            im.toss.features.benefit.ui.component.VideoAdsController.onNavigationEvent(r21.onExtraCallbackWithResult, r21.IAuthTabCallback);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x013c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
        
            if (kotlin.text.StringsKt.endsWith$default(r21.IAuthTabCallback.IAuthTabCallback_Parcel(), ".m3u8", false, 3, (java.lang.Object) null) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
        
            if (kotlin.text.StringsKt.endsWith$default(r21.IAuthTabCallback.IAuthTabCallback_Parcel(), ".m3u8", false, 2, (java.lang.Object) null) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
        
            r1 = o.getWrite.IAuthTabCallback("ad_id", java.lang.Long.valueOf(r21.IAuthTabCallback.IAuthTabCallbackStub()));
            r6 = new java.lang.Object[1];
            a(new char[]{0, 3, 13929}, (byte) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 115), android.text.TextUtils.indexOf("", "", 0) + 3, r6);
            o.ConvertFloatArrayToByteArray.onExtraCallback(o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "benefit_thumbnailBanner_m3u8_fallback", "m3u8 file error - error:" + r23, o.access8100.onWarmupCompleted(new kotlin.Pair[]{r1, o.getWrite.IAuthTabCallback(((java.lang.String) r6[0]).intern(), r21.IAuthTabCallback.IAuthTabCallback_Parcel())}), (java.lang.String) null, false, (java.lang.String) null, 56, (java.lang.Object) null);
            im.toss.features.benefit.ui.component.VideoAdsController.onNavigationEvent(io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new java.lang.Object[]{r21.onExtraCallbackWithResult, r21.onWarmupCompleted, r21.IAuthTabCallback}, io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1840330377, -1840330368, io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            r1 = im.toss.features.benefit.ui.component.VideoAdsController.IAuthTabCallbackDefault.IAuthTabCallbackStub + 11;
            im.toss.features.benefit.ui.component.VideoAdsController.IAuthTabCallbackDefault.asInterface = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 121;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(eventTime, "");
                Intrinsics.checkNotNullParameter(playbackException, "");
                super.onPlayerError(eventTime, playbackException);
            } else {
                Intrinsics.checkNotNullParameter(eventTime, "");
                Intrinsics.checkNotNullParameter(playbackException, "");
                super.onPlayerError(eventTime, playbackException);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, im.toss.features.benefit.ui.component.VideoAdsController] */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        boolean zOnNavigationEvent;
        ?? r1 = (VideoAdsController) objArr[0];
        StyledPlayerView styledPlayerView = (StyledPlayerView) objArr[1];
        AdsInfo adsInfo = (AdsInfo) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(styledPlayerView, "");
        Intrinsics.checkNotNullParameter(adsInfo, "");
        adsInfo.IAuthTabCallback(false);
        ((VideoAdsController) r1).asBinder.onWarmupCompleted(adsInfo);
        ExoPlayer exoPlayer = ((VideoAdsController) r1).IAuthTabCallback_Parcel;
        if (exoPlayer != null) {
            zOnNavigationEvent = r1.onNavigationEvent(exoPlayer, adsInfo.IAuthTabCallback_Parcel());
            int i2 = readTypedObject + 103;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        } else {
            zOnNavigationEvent = false;
        }
        if (zOnNavigationEvent) {
            Objects.toString(adsInfo);
            ((VideoAdsController) r1).IAuthTabCallbackStubProxy.onWarmupCompleted(((VideoAdsController) r1).asBinder.IAuthTabCallback());
        } else {
            Objects.toString(adsInfo);
            r1.onWarmupCompleted("new MediaUri requested: " + adsInfo);
        }
        AdContentType adContentTypeOnWarmupCompleted = adsInfo.onWarmupCompleted();
        int i4 = adContentTypeOnWarmupCompleted == null ? -1 : asInterface.onExtraCallbackWithResult[adContentTypeOnWarmupCompleted.ordinal()];
        if (i4 == 1) {
            TdsImageView tdsImageView = ((VideoAdsController) r1).onExtraCallback.IAuthTabCallback;
            Context context = r1.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsImageView.setBackgroundColor(new getUrlokhttp(new IAuthTabCallback_Parcel(configuration)).access200());
            r1.onExtraCallback(styledPlayerView, adsInfo);
            if (!zOnNavigationEvent) {
                ConstraintLayout constraintLayoutOnWarmupCompleted = ((VideoAdsController) r1).onExtraCallback.onNavigationEvent.onWarmupCompleted();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutOnWarmupCompleted, "");
                constraintLayoutOnWarmupCompleted.setVisibility(0);
                TdsImageView tdsImageView2 = r1.IAuthTabCallbackDefault().onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                tdsImageView2.setVisibility(8);
                TdsImageView tdsImageView3 = r1.IAuthTabCallbackDefault().onExtraCallbackWithResult;
                Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
                tdsImageView3.setVisibility(8);
                FrameLayout frameLayout = ((VideoAdsController) r1).onExtraCallback.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                frameLayout.setVisibility(8);
                Typography5 typography5 = r1.IAuthTabCallbackDefault().IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(typography5, "");
                typography5.setVisibility(8);
                r1.onExtraCallback("newContent prepare()");
                int i5 = extraCallbackWithResult + 59;
                readTypedObject = i5 % 128;
                int i6 = i5 % 2;
            }
        } else if (i4 == 2) {
            ConstraintLayout constraintLayoutOnWarmupCompleted2 = ((VideoAdsController) r1).onExtraCallback.onNavigationEvent.onWarmupCompleted();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutOnWarmupCompleted2, "");
            constraintLayoutOnWarmupCompleted2.setVisibility(8);
            TdsImageView tdsImageView4 = r1.IAuthTabCallbackDefault().onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView4, "");
            tdsImageView4.setVisibility(8);
            FrameLayout frameLayout2 = ((VideoAdsController) r1).onExtraCallback.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            frameLayout2.setVisibility(8);
            Typography5 typography52 = r1.IAuthTabCallbackDefault().IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(typography52, "");
            typography52.setVisibility(8);
            TdsImageView tdsImageView5 = ((VideoAdsController) r1).onExtraCallback.IAuthTabCallback;
            Context context2 = r1.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Resources resources = context2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration2 = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            tdsImageView5.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new getInterfaceDescriptor(configuration2)).onWarmupCompleted());
            TdsImageView tdsImageView6 = ((VideoAdsController) r1).onExtraCallback.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView6, "");
            TdsImageView.setImage$default(tdsImageView6, adsInfo.IAuthTabCallback_Parcel(), new VideoAdsController$.ExternalSyntheticLambda5((VideoAdsController) r1, adsInfo), (Function1) null, 4, (Object) null);
            TdsImageView tdsImageView7 = ((VideoAdsController) r1).onExtraCallback.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView7, "");
            tdsImageView7.setVisibility(0);
            return null;
        }
        int i7 = extraCallbackWithResult + 21;
        readTypedObject = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(VideoAdsController videoAdsController, AdsInfo adsInfo, RecomposerKt recomposerKt) {
        int i = 2 % 2;
        int i2 = readTypedObject + 61;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(recomposerKt, "");
            Intrinsics.areEqual(videoAdsController.asBinder.IAuthTabCallback(), adsInfo);
            throw null;
        }
        Intrinsics.checkNotNullParameter(recomposerKt, "");
        if (Intrinsics.areEqual(videoAdsController.asBinder.IAuthTabCallback(), adsInfo)) {
            Objects.toString(adsInfo);
            videoAdsController.IAuthTabCallbackStubProxy.onWarmupCompleted(adsInfo);
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        int i3 = readTypedObject + 19;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public final void IAuthTabCallback() {
        String strAccess000;
        int i = 2 % 2;
        AdsInfo adsInfo = (AdsInfo) this.asBinder.IAuthTabCallback();
        if (adsInfo != null) {
            int i2 = readTypedObject + 71;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            strAccess000 = adsInfo.access000();
            if (i3 == 0) {
                int i4 = 85 / 0;
            }
        } else {
            strAccess000 = null;
        }
        this.getInterfaceDescriptor = strAccess000;
        int i5 = readTypedObject + 3;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private final LoadControl asInterface() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 7;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onNavigationEvent.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        LoadControl loadControl = (LoadControl) value;
        int i4 = extraCallbackWithResult + 3;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return loadControl;
        }
        throw null;
    }

    private static final DefaultLoadControl asBinder() {
        int i = 2 % 2;
        DefaultLoadControl defaultLoadControlBuild = new DefaultLoadControl.Builder().setPrioritizeTimeOverSizeThresholds(true).setBufferDurationsMs(2500, INIXSAFEProtocolException.IO_EXCEPTION, 2500, 2500).build();
        int i2 = readTypedObject + 113;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return defaultLoadControlBuild;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean onNavigationEvent(ExoPlayer exoPlayer, String str) {
        MediaItem.LocalConfiguration localConfiguration;
        int i = 2 % 2;
        int i2 = readTypedObject + 65;
        extraCallbackWithResult = i2 % 128;
        Uri uri = null;
        if (i2 % 2 == 0) {
            exoPlayer.getCurrentMediaItem();
            uri.hashCode();
            throw null;
        }
        MediaItem currentMediaItem = exoPlayer.getCurrentMediaItem();
        if (currentMediaItem != null && (localConfiguration = currentMediaItem.localConfiguration) != null) {
            int i3 = readTypedObject + 31;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            uri = localConfiguration.uri;
        }
        return Intrinsics.areEqual(uri, Uri.parse(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ExoPlayer onExtraCallback(StyledPlayerView styledPlayerView, AdsInfo adsInfo) {
        ExoPlayer exoPlayer;
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        int i = 2 % 2;
        if (this.IAuthTabCallback_Parcel == null) {
            int i2 = extraCallbackWithResult + 59;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ExoPlayer exoPlayerIAuthTabCallback = CommonModule_setSecureScreen.IAuthTabCallback(commonModule_setSecureScreen, context, (String) null, asInterface(), (Function1) null, (Function1) null, 26, (Object) null);
            this.IAuthTabCallback_Parcel = exoPlayerIAuthTabCallback;
            if (exoPlayerIAuthTabCallback != null) {
                int i4 = extraCallbackWithResult + 81;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
                exoPlayerIAuthTabCallback.setVolume(0.0f);
            }
        }
        ExoPlayer exoPlayer2 = this.IAuthTabCallback_Parcel;
        if (exoPlayer2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i6 = readTypedObject + 111;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        styledPlayerView.setPlayer(exoPlayer2);
        IAuthTabCallbackStub iAuthTabCallbackStub = this.onTransact;
        if (iAuthTabCallbackStub != null) {
            int i8 = extraCallbackWithResult + 55;
            readTypedObject = i8 % 128;
            int i9 = i8 % 2;
            exoPlayer2.removeListener(iAuthTabCallbackStub);
        }
        IAuthTabCallbackStub iAuthTabCallbackStub2 = new IAuthTabCallbackStub(this, exoPlayer2, styledPlayerView, adsInfo);
        exoPlayer2.addListener(iAuthTabCallbackStub2);
        this.onTransact = iAuthTabCallbackStub2;
        if (onNavigationEvent(exoPlayer2, adsInfo.IAuthTabCallback_Parcel())) {
            return exoPlayer2;
        }
        exoPlayer2.setPauseAtEndOfMediaItems(true);
        this.access100 = IAuthTabCallback.INITIAL_STATE;
        onNavigationEvent(true);
        CommonModule_setSecureScreen commonModule_setSecureScreen2 = CommonModule_setSecureScreen.onWarmupCompleted;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        CommonModule_setSecureScreen.onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{commonModule_setSecureScreen2, exoPlayer2, context2, adsInfo.IAuthTabCallback_Parcel(), false, new IAuthTabCallbackDefault(adsInfo, this, styledPlayerView), 4, null}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        long jCurrentTimeMillis = System.currentTimeMillis();
        getPackageType getpackagetype = this.extraCallback;
        getPackageType getpackagetypeOnNavigationEvent = null;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = this.access000;
        if (textFieldScrollKtExternalSyntheticLambda0 == null || (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0)) == null) {
            exoPlayer = exoPlayer2;
        } else {
            exoPlayer = exoPlayer2;
            getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onTransact(this, adsInfo, jCurrentTimeMillis, exoPlayer2, (access13800) null), 2, (Object) null);
        }
        this.extraCallback = getpackagetypeOnNavigationEvent;
        int i10 = readTypedObject + 107;
        extraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return exoPlayer;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        VideoAdsController videoAdsController = (VideoAdsController) objArr[0];
        AdsInfo adsInfo = (AdsInfo) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 117;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetype = videoAdsController.extraCallback;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = videoAdsController.access000;
        videoAdsController.extraCallback = (textFieldScrollKtExternalSyntheticLambda0 == null || (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0)) == null) ? null : maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, videoAdsController.new extraCallbackWithResult(adsInfo, null), 3, (Object) null);
        int i4 = extraCallbackWithResult + 65;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void onWarmupCompleted(StyledPlayerView styledPlayerView, AdsInfo adsInfo) {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this, styledPlayerView, (AdsInfo) AdsInfo.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{adsInfo, null, StringsKt.replace$default(adsInfo.IAuthTabCallback_Parcel(), ".m3u8", ".mp4", false, 4, (Object) null), null, Double.valueOf(0.0d), null, 0L, null, 0L, 0L, null, 0L, null, null, null, null, null, null, null, 0L, null, null, null, null, 8388605, null}, 1197461679, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1197461676)};
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, -1903258308, 1903258314, iOnWarmupCompleted);
        int i4 = readTypedObject + 79;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }

    private static final void onNavigationEvent(VideoAdsController videoAdsController, onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = readTypedObject + 29;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Typography5 typography5 = videoAdsController.IAuthTabCallbackDefault().IAuthTabCallbackStub;
        Intrinsics.checkNotNull(typography5);
        typography5.setVisibility(0);
        typography5.setText(typography5.getContext().getString(onnavigationevent.getTitleId()));
        int i4 = readTypedObject + 59;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ExoPlayer exoPlayer = this.IAuthTabCallback_Parcel;
        if (exoPlayer != null) {
            int i2 = extraCallbackWithResult + 9;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            exoPlayer.prepare();
            int i4 = extraCallbackWithResult + 89;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ExoPlayer exoPlayer = this.IAuthTabCallback_Parcel;
        if (exoPlayer != null) {
            int i2 = readTypedObject + 121;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            exoPlayer.play();
        }
        int i4 = readTypedObject + 53;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onExtraCallback(@NotNull IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Objects.toString(iAuthTabCallback);
        this.access100 = iAuthTabCallback;
        ExoPlayer exoPlayer = this.IAuthTabCallback_Parcel;
        if (exoPlayer != null) {
            int i2 = extraCallbackWithResult + 69;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            exoPlayer.pause();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = extraCallbackWithResult + 63;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallbackStubProxy.onWarmupCompleted((Object) null);
        if (this.IAuthTabCallback_Parcel != null) {
            ExoPlayer exoPlayer = this.IAuthTabCallback_Parcel;
            if (exoPlayer != null) {
                exoPlayer.release();
            }
            this.IAuthTabCallback_Parcel = null;
        }
        getPackageType getpackagetype = this.ICustomTabsCallback;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            int i4 = extraCallbackWithResult + 47;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = readTypedObject + 83;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setOnPlayerViewVisible(boolean z) {
        int i = 2 % 2;
        this.writeTypedObject.onWarmupCompleted(Boolean.valueOf(z));
        int i2 = extraCallbackWithResult + 115;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
        }
    }

    public final void setContentLoadState(boolean z) {
        int i = 2 % 2;
        this.IAuthTabCallbackDefault.onWarmupCompleted(Boolean.valueOf(z));
        int i2 = readTypedObject + 13;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView recyclerViewOnWarmupCompleted = onWarmupCompleted((View) this);
        if (recyclerViewOnWarmupCompleted == null) {
            return false;
        }
        Rect rect = new Rect();
        recyclerViewOnWarmupCompleted.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        getGlobalVisibleRect(rect2);
        if (!new Rect().setIntersect(rect, rect2)) {
            return false;
        }
        if (r3.height() / getHeight() <= 0.5f) {
            return false;
        }
        int i4 = extraCallbackWithResult + 65;
        int i5 = i4 % 128;
        readTypedObject = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 91;
        extraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private final RecyclerView onWarmupCompleted(View view) {
        ViewParent parent;
        int i = 2 % 2;
        if (view != null) {
            parent = view.getParent();
        } else {
            int i2 = readTypedObject + 61;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            parent = null;
        }
        while (parent != null && !(parent instanceof RecyclerView)) {
            parent = parent.getParent();
        }
        if (!(parent instanceof RecyclerView)) {
            return null;
        }
        int i4 = readTypedObject;
        int i5 = i4 + 77;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        RecyclerView recyclerView = (RecyclerView) parent;
        int i7 = i4 + 19;
        extraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return recyclerView;
    }

    public final void onNavigationEvent(@NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.IAuthTabCallback.add(onextracallback);
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.IAuthTabCallback.add(onextracallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.clear();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = onPostMessage + 109;
        onMinimized = i % 128;
        if (i % 2 != 0) {
            int i2 = 53 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setPlayState(@NotNull onNavigationEvent onnavigationevent) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        int i2 = asInterface.onExtraCallback[onnavigationevent.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = readTypedObject + 101;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.onExtraCallback.IAuthTabCallback.setImageDrawable((Drawable) null);
            TdsImageView tdsImageView = this.onExtraCallback.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            RelativeGroupPath.onExtraCallback(tdsImageView);
            onNavigationEvent(this, onnavigationevent);
            return;
        }
        int i5 = asInterface.IAuthTabCallback[this.access100.ordinal()];
        if (i5 == 1) {
            Typography5 typography5 = IAuthTabCallbackDefault().IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            typography5.setVisibility(8);
            return;
        }
        if (i5 == 2) {
            Typography5 typography52 = IAuthTabCallbackDefault().IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(typography52, "");
            typography52.setVisibility(8);
            TdsImageView tdsImageView2 = IAuthTabCallbackDefault().onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
            tdsImageView2.setVisibility(8);
            TdsImageView tdsImageView3 = IAuthTabCallbackDefault().onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
            tdsImageView3.setVisibility(8);
            return;
        }
        int i6 = extraCallbackWithResult + 103;
        int i7 = i6 % 128;
        readTypedObject = i7;
        int i8 = i6 % 2;
        if (i5 != 3) {
            int i9 = i7 + 75;
            extraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0 ? i5 != 4 : i5 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        onNavigationEvent(this, onnavigationevent);
    }

    private static final void asBinder(VideoAdsController videoAdsController, View view) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsController, view}, iOnWarmupCompleted3, iOnWarmupCompleted2, -1174282065, 1174282065, iOnWarmupCompleted);
    }

    private static final void IAuthTabCallbackStub(VideoAdsController videoAdsController, View view) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsController, view}, iOnWarmupCompleted3, iOnWarmupCompleted2, 1793946919, -1793946917, iOnWarmupCompleted);
    }

    private static final void asInterface(VideoAdsController videoAdsController, View view) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsController, view}, iOnWarmupCompleted3, iOnWarmupCompleted2, -1382696392, 1382696395, iOnWarmupCompleted);
    }

    public static final /* synthetic */ getCornerRadius onNavigationEvent(VideoAdsController videoAdsController) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (getCornerRadius) onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsController}, iOnWarmupCompleted3, iOnWarmupCompleted2, -1607906445, 1607906452, iOnWarmupCompleted);
    }

    public static final /* synthetic */ getCornerRadius onTransact(VideoAdsController videoAdsController) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (getCornerRadius) onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsController}, iOnWarmupCompleted3, iOnWarmupCompleted2, 1588598151, -1588598147, iOnWarmupCompleted);
    }

    public static final /* synthetic */ getPackageType asBinder(VideoAdsController videoAdsController) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (getPackageType) onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsController}, iOnWarmupCompleted3, iOnWarmupCompleted2, -1742404414, 1742404422, iOnWarmupCompleted);
    }

    public static final /* synthetic */ getCornerRadius asInterface(VideoAdsController videoAdsController) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (getCornerRadius) onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsController}, iOnWarmupCompleted3, iOnWarmupCompleted2, 460508431, -460508430, iOnWarmupCompleted);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(VideoAdsController videoAdsController, StyledPlayerView styledPlayerView, AdsInfo adsInfo) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{videoAdsController, styledPlayerView, adsInfo}, iOnWarmupCompleted3, iOnWarmupCompleted2, 1840330377, -1840330368, iOnWarmupCompleted);
    }

    private final void onExtraCallback(AdsInfo adsInfo) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, adsInfo}, iOnWarmupCompleted3, iOnWarmupCompleted2, -196325678, 196325683, iOnWarmupCompleted);
    }

    public final void onExtraCallbackWithResult(@NotNull StyledPlayerView styledPlayerView, @NotNull AdsInfo adsInfo) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, styledPlayerView, adsInfo}, iOnWarmupCompleted3, iOnWarmupCompleted2, -1903258308, 1903258314, iOnWarmupCompleted);
    }
}

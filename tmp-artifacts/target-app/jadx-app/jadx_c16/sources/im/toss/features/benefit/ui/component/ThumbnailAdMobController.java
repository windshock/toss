package im.toss.features.benefit.ui.component;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.transform.RoundedCornersTransformation;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.zziea;
import im.toss.features.benefit.R$string;
import im.toss.features.benefit.ui.component.ThumbnailAdMobController$;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppSetIdAndScope1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BasicSystemInfoExtension;
import o.HCEBridgeExtension;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.ea10;
import o.getCornerRadius;
import o.maybeUpdateAnimatable;
import o.patch;
import o.setProtocolsokhttp;
import o.setRandomHost;
import o.setShine;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ThumbnailAdMobController extends ConstraintLayout {
    private boolean IAuthTabCallback;
    private final getCornerRadius<Boolean> IAuthTabCallbackDefault;
    private TextFieldScrollKtExternalSyntheticLambda0 IAuthTabCallbackStub;
    private AppSetIdAndScope1 asBinder;
    private boolean asInterface;
    private final getCornerRadius<Double> getInterfaceDescriptor;
    private final HCEBridgeExtension onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final getCornerRadius<Boolean> onNavigationEvent;
    private final getCornerRadius<NativeAd> onTransact;
    private boolean onWarmupCompleted;
    private static final byte[] $$a = {70, 83, 77, 1};
    private static final int $$b = 193;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 0;
    private static int extraCallback = 1;
    private static long IAuthTabCallback_Parcel = 2566598250378980511L;
    private static int access000 = -1776194565;
    private static char IAuthTabCallbackStubProxy = 27643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i;
        int i2 = 110 - s;
        int i3 = s2 + 4;
        byte[] bArr = $$a;
        int i4 = (b * 2) + 1;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i5 = i3;
            int i6 = i4;
            i = 0;
            int i7 = i3 + (-i6);
            i3 = i5;
            i2 = i7;
            bArr2[i] = (byte) i2;
            i++;
            int i8 = i3 + 1;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i8];
            i3 = i2;
            i5 = i8;
            int i72 = i3 + (-i6);
            i3 = i5;
            i2 = i72;
            bArr2[i] = (byte) i2;
            i++;
            int i82 = i3 + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i++;
            int i822 = i3 + 1;
            if (i == i4) {
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThumbnailAdMobController(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThumbnailAdMobController(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ThumbnailAdMobController thumbnailAdMobController = (ThumbnailAdMobController) objArr[0];
        View view = (View) objArr[1];
        SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4 = (SuspendAnimationKtExternalSyntheticLambda4) objArr[2];
        int i = 2 % 2;
        int i2 = access100 + 107;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(thumbnailAdMobController, view, suspendAnimationKtExternalSyntheticLambda4);
        int i4 = extraCallback + 1;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(ThumbnailAdMobController thumbnailAdMobController, NativeAd nativeAd) {
        int i = 2 % 2;
        int i2 = extraCallback + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(thumbnailAdMobController, nativeAd);
        int i4 = extraCallback + 83;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [android.view.View, im.toss.features.benefit.ui.component.ThumbnailAdMobController] */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        String strIntern;
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i5) | i4);
        int i11 = i9 | i10 | (~(i4 | i2));
        int i12 = (~(i2 | i5)) | (~(i7 | i5));
        int i13 = i8 | i10;
        int i14 = i5 + i4 + i + (793188503 * i3) + (2090109681 * i6);
        int i15 = i14 * i14;
        int i16 = (837707615 * i5) + 1286602752 + ((-1676358574) * i4) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i) + (1186463744 * i3) + (1166540800 * i6) + ((-1956446208) * i15);
        int i17 = ((i5 * 1389925299) - 652765764) + (i4 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i * 1389926445) + (i3 * (-1551828341)) + (i6 * (-2047638435)) + (i15 * 1214709760);
        int i18 = i16 + (i17 * i17 * 445972480);
        if (i18 == 1) {
            ?? r9 = (ThumbnailAdMobController) objArr[0];
            NativeAd nativeAd = (NativeAd) objArr[1];
            int i19 = 2 % 2;
            int i20 = extraCallback + 1;
            access100 = i20 % 128;
            int i21 = i20 % 2;
            if (!((ThumbnailAdMobController) r9).IAuthTabCallback) {
                r9.post(new ThumbnailAdMobController$.ExternalSyntheticLambda4((ThumbnailAdMobController) r9, nativeAd));
            }
            int i22 = access100 + 83;
            extraCallback = i22 % 128;
            int i23 = i22 % 2;
            return null;
        }
        if (i18 != 2) {
            return i18 != 3 ? i18 != 4 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
        }
        ThumbnailAdMobController thumbnailAdMobController = (ThumbnailAdMobController) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i24 = 2 % 2;
        TdsImageView tdsImageView = thumbnailAdMobController.onExtraCallback.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        if (zBooleanValue) {
            int i25 = access100 + 25;
            extraCallback = i25 % 128;
            int i26 = i25 % 2;
            Object[] objArr2 = new Object[1];
            a((char) (KeyEvent.getDeadChar(0, 0) + 31537), (-585359247) - KeyEvent.normalizeMetaState(0), new char[]{4084, 59384, 59366, 21760, 40139, 33763, 38417, 19052, 63811, 13789, 53294, 7218, 54491, 25849, 56590, 29297, 45264, 12901, 63620, 22705, 57865, 30629, 3295, 12331, 24980, 12862, 35158, 46929, 22261, 43867, 1007, 32710, 33234, 45526, 31947, 31882, 63027, 54784, 59966, 40749, 21900, 7572, 31672, 62036, 44182, 35741, 10108, 2173, 52990, 40037, 20374, 1722, 31780, 51875, 32371, 54779, 48085, 51194, 44555, 20007, 41315, 44232, 48468, 8524, 60725, 52360, 64665}, new char[]{1892, 13531, 28596, 20388}, new char[]{29004, 7200, 12765, 41595}, objArr2);
            strIntern = ((String) objArr2[0]).intern();
        } else {
            Object[] objArr3 = new Object[1];
            a((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19566), TextUtils.getTrimmedLength(""), new char[]{10675, 3699, 36013, 42725, 57775, 38257, 13117, 44617, 35761, 18756, 40434, 57580, 10270, 51280, 19710, 46135, 56157, 29492, 17473, 36277, 25499, 28635, 57050, 43396, 1970, 42888, 62398, 52873, 51940, 43080, 21732, 13231, 31607, 11083, 12124, 9086, 5127, 29337, 37557, 25263, 21670, 4656, 5174, 35050, 40122, 63127, 46115, 59896, 5642, 39889, 50043, 5892, 10435, 2887, 46090, 41978, 40966, 59728, 10701, 30874, 50947, 52781, 19554, 29841, 24195, 53402}, new char[]{1892, 13531, 28596, 20388}, new char[]{45133, 22516, 28393, 5708}, objArr3);
            strIntern = ((String) objArr3[0]).intern();
        }
        TdsImageView.setImage$default(tdsImageView, strIntern, (Function1) null, (Function1) null, 6, (Object) null);
        int i27 = access100 + 39;
        extraCallback = i27 % 128;
        int i28 = i27 % 2;
        return null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[0];
        ThumbnailAdMobController thumbnailAdMobController = (ThumbnailAdMobController) objArr[1];
        VideoController videoController = (VideoController) objArr[2];
        View view = (View) objArr[3];
        int i = 2 % 2;
        int i2 = access100 + 103;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(booleanRef, thumbnailAdMobController, videoController, view);
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = access100 + 27;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(ThumbnailAdMobController thumbnailAdMobController, VideoController videoController, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 3;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(thumbnailAdMobController, videoController, view);
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, String str, View view) {
        int i = 2 % 2;
        int i2 = access100 + 53;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, str, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 109;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onWarmupCompleted implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public onWarmupCompleted() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onWarmupCompleted + 27;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            int width = (int) ((ThumbnailAdMobController.onNavigationEvent(ThumbnailAdMobController.this).getRoot().getWidth() * 2.0f) / 3.0f);
            ThumbnailAdMobController.onNavigationEvent(ThumbnailAdMobController.this).IAuthTabCallbackDefault.setMaxWidth(width);
            ThumbnailAdMobController.onNavigationEvent(ThumbnailAdMobController.this).asBinder.setMaxWidth(width);
            int i12 = onExtraCallback + 81;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 9 / 0;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ThumbnailAdMobController(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult("ThumbnailAdMob");
        Intrinsics.checkNotNullExpressionValue(appSetIdAndScope1OnExtraCallbackWithResult, "");
        this.asBinder = appSetIdAndScope1OnExtraCallbackWithResult;
        HCEBridgeExtension hCEBridgeExtensionOnWarmupCompleted = HCEBridgeExtension.onWarmupCompleted(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hCEBridgeExtensionOnWarmupCompleted, "");
        this.onExtraCallback = hCEBridgeExtensionOnWarmupCompleted;
        this.asInterface = true;
        this.getInterfaceDescriptor = setShine.onNavigationEvent(Double.valueOf(1.0d));
        Boolean bool = Boolean.FALSE;
        this.IAuthTabCallbackDefault = setShine.onNavigationEvent(bool);
        this.onNavigationEvent = setShine.onNavigationEvent(bool);
        this.onTransact = setShine.onNavigationEvent((Object) null);
        NativeAdView nativeAdView = hCEBridgeExtensionOnWarmupCompleted.asInterface;
        nativeAdView.setHeadlineView(hCEBridgeExtensionOnWarmupCompleted.IAuthTabCallbackDefault);
        nativeAdView.setBodyView(hCEBridgeExtensionOnWarmupCompleted.asBinder);
        nativeAdView.setMediaView(hCEBridgeExtensionOnWarmupCompleted.onWarmupCompleted);
        hCEBridgeExtensionOnWarmupCompleted.onWarmupCompleted.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
        onNavigationEvent();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ThumbnailAdMobController(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = access100 + 31;
            extraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = extraCallback + 33;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ThumbnailAdMobController thumbnailAdMobController = (ThumbnailAdMobController) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = thumbnailAdMobController.asBinder;
        int i5 = i3 + 31;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return appSetIdAndScope1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallback(ThumbnailAdMobController thumbnailAdMobController) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<Boolean> getcornerradius = thumbnailAdMobController.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return getcornerradius;
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallbackStub(ThumbnailAdMobController thumbnailAdMobController) {
        int i = 2 % 2;
        int i2 = extraCallback + 89;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        getCornerRadius<Boolean> getcornerradius = thumbnailAdMobController.IAuthTabCallbackDefault;
        int i5 = i3 + 29;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return getcornerradius;
        }
        throw null;
    }

    public static final /* synthetic */ getCornerRadius asInterface(ThumbnailAdMobController thumbnailAdMobController) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 71;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<Double> getcornerradius = thumbnailAdMobController.getInterfaceDescriptor;
        int i5 = i2 + 55;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return getcornerradius;
        }
        throw null;
    }

    public static final /* synthetic */ getCornerRadius onExtraCallback(ThumbnailAdMobController thumbnailAdMobController) {
        int i = 2 % 2;
        int i2 = access100 + 101;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        getCornerRadius<NativeAd> getcornerradius = thumbnailAdMobController.onTransact;
        int i5 = i3 + 33;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public static final /* synthetic */ void onExtraCallback(ThumbnailAdMobController thumbnailAdMobController, NativeAd nativeAd) {
        int i = 2 % 2;
        int i2 = extraCallback + 77;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        thumbnailAdMobController.onExtraCallback(nativeAd);
        int i4 = access100 + 33;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(ThumbnailAdMobController thumbnailAdMobController) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 83;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = thumbnailAdMobController.IAuthTabCallback;
        int i5 = i2 + 51;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ HCEBridgeExtension onNavigationEvent(ThumbnailAdMobController thumbnailAdMobController) {
        int i = 2 % 2;
        int i2 = access100 + 27;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        HCEBridgeExtension hCEBridgeExtension = thumbnailAdMobController.onExtraCallback;
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return hCEBridgeExtension;
    }

    public static final /* synthetic */ void onNavigationEvent(ThumbnailAdMobController thumbnailAdMobController, NativeAd nativeAd) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 21;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        onNavigationEvent(zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), -247809285, 247809286, zziea.IAuthTabCallback(), new Object[]{thumbnailAdMobController, nativeAd});
        int i4 = access100 + 119;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(ThumbnailAdMobController thumbnailAdMobController, NativeAd nativeAd) {
        int i = 2 % 2;
        int i2 = access100 + 75;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        thumbnailAdMobController.IAuthTabCallback(nativeAd);
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
    }

    private final void onExtraCallbackWithResult(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (z != this.asInterface) {
            Object[] objArr = {this, Boolean.valueOf(z)};
            onNavigationEvent(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -1047684499, 1047684501, zziea.IAuthTabCallback(), objArr);
        }
        this.asInterface = z;
        int i4 = access100 + 117;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean onExtraCallback() {
        MediaContent mediaContent;
        int i = 2 % 2;
        NativeAd nativeAd = (NativeAd) this.onTransact.IAuthTabCallback();
        if (nativeAd == null || (mediaContent = nativeAd.getMediaContent()) == null) {
            return false;
        }
        int i2 = extraCallback + 57;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (!mediaContent.hasVideoContent()) {
            return false;
        }
        int i4 = extraCallback + 121;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        int i = 2 % 2;
        int i2 = access100 + 89;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.onAttachedToWindow();
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        this.IAuthTabCallbackStub = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        if (!this.onWarmupCompleted) {
            int i4 = access100 + 35;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            this.onWarmupCompleted = true;
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null && (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult)) != null && (textFieldScrollKtExternalSyntheticLambda0 = this.IAuthTabCallbackStub) != null && (lifecycle = textFieldScrollKtExternalSyntheticLambda0.getLifecycle()) != null) {
                maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(lifecycle, this, (access13800) null), 3, (Object) null);
                maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(this, (access13800) null), 3, (Object) null);
            }
        }
        int i6 = access100 + 7;
        extraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 73 / 0;
        }
    }

    private final void IAuthTabCallback(NativeAd nativeAd) {
        NativeAdView nativeAdView;
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallback + 103;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            nativeAdView = this.onExtraCallback.asInterface;
            Intrinsics.checkNotNullExpressionValue(nativeAdView, "");
            i = 1;
        } else {
            nativeAdView = this.onExtraCallback.asInterface;
            Intrinsics.checkNotNullExpressionValue(nativeAdView, "");
            i = 0;
        }
        nativeAdView.setVisibility(i);
        onWarmupCompleted(nativeAd);
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $11 + 31;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(i4, i4, i4);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', i4) + 44;
                    int scrollBarSize = 1451 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b = $$a[3];
                    byte b2 = (byte) (b - 1);
                    byte b3 = (byte) (-b);
                    String str$$c = $$c(b2, b3, (byte) (b3 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSizeAndState, iLastIndexOf, scrollBarSize, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char c2 = (char) ((ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1)) + 49124);
                        int iMyTid = 44 - (Process.myTid() >> 22);
                        int defaultSize = View.getDefaultSize(i4, i4) + 1494;
                        byte b4 = $$a[3];
                        byte b5 = (byte) (-b4);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iMyTid, defaultSize, 1533236389, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 50 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 22939 - TextUtils.getTrimmedLength(""), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45849 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 29 - Color.green(0), Color.green(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback_Parcel ^ 7798559133331975163L)) ^ ((int) (access000 ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackStubProxy ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i2 = 2;
                            i4 = 0;
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
        String str = new String(cArr6);
        int i7 = $11 + 73;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(ThumbnailAdMobController thumbnailAdMobController, View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            CharSequence text = thumbnailAdMobController.onExtraCallback.IAuthTabCallbackStub.IAuthTabCallbackStub.getText();
            Typography5 typography5 = thumbnailAdMobController.onExtraCallback.IAuthTabCallbackStub.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            if (typography5.getVisibility() != 0) {
                int i2 = access100 + 13;
                extraCallback = i2 % 128;
                int i3 = i2 % 2;
                text = null;
            }
            if (text == null) {
                int i4 = access100 + 13;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                text = thumbnailAdMobController.getContext().getString(R$string.benefit_btn_play_pause);
                Intrinsics.checkNotNullExpressionValue(text, "");
            }
            suspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback(text);
        }
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            suspendAnimationKtExternalSyntheticLambda4.onExtraCallback("android.widget.Button");
        }
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        FrameLayout frameLayout = this.onExtraCallback.onTransact;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        setProtocolsokhttp.onExtraCallback(frameLayout);
        FrameLayout frameLayout2 = this.onExtraCallback.access000;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        setProtocolsokhttp.onExtraCallback(frameLayout2);
        View view = this.onExtraCallback.IAuthTabCallbackStub.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(view, "");
        setProtocolsokhttp.IAuthTabCallback(view, new ThumbnailAdMobController$.ExternalSyntheticLambda3(this));
        this.onExtraCallback.IAuthTabCallbackStub.onExtraCallback.setImportantForAccessibility(2);
        this.onExtraCallback.IAuthTabCallbackStub.IAuthTabCallbackStub.setImportantForAccessibility(2);
        int i2 = access100 + 125;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(Function1 function1, String str, View view) {
        int i = 2 % 2;
        int i2 = access100 + 39;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCallback + 105;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallbackWithResult(ThumbnailAdMobController thumbnailAdMobController, VideoController videoController, View view) throws Throwable {
        int i = 2 % 2;
        thumbnailAdMobController.onExtraCallbackWithResult(!thumbnailAdMobController.asInterface);
        if (videoController != null) {
            int i2 = extraCallback + 117;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            videoController.mute(thumbnailAdMobController.asInterface);
            if (i3 != 0) {
                int i4 = 77 / 0;
            }
        }
        int i5 = access100 + 113;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class IAuthTabCallback extends VideoController.VideoLifecycleCallbacks {
        private static int IAuthTabCallbackDefault = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Ref.BooleanRef IAuthTabCallback;
        final /* synthetic */ BasicSystemInfoExtension onExtraCallbackWithResult;
        final /* synthetic */ Function1<BasicSystemInfoExtension, Unit> onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(Ref.BooleanRef booleanRef, Function1<? super BasicSystemInfoExtension, Unit> function1, BasicSystemInfoExtension basicSystemInfoExtension) {
            this.IAuthTabCallback = booleanRef;
            this.onNavigationEvent = function1;
            this.onExtraCallbackWithResult = basicSystemInfoExtension;
        }

        public void onVideoPause() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {ThumbnailAdMobController.this};
            this.IAuthTabCallback.element = false;
            ConstraintLayout constraintLayout = ThumbnailAdMobController.onNavigationEvent(ThumbnailAdMobController.this).IAuthTabCallbackStub.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            ThumbnailAdMobController.onNavigationEvent(ThumbnailAdMobController.this).IAuthTabCallbackStub.IAuthTabCallbackStub.setText(ThumbnailAdMobController.this.getContext().getString(R$string.benefit_btn_play_continue));
            int i4 = onWarmupCompleted + 89;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 25 / 0;
            }
        }

        public void onVideoEnd() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {ThumbnailAdMobController.this};
            this.IAuthTabCallback.element = false;
            ConstraintLayout constraintLayout = ThumbnailAdMobController.onNavigationEvent(ThumbnailAdMobController.this).IAuthTabCallbackStub.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            ThumbnailAdMobController.onNavigationEvent(ThumbnailAdMobController.this).IAuthTabCallbackStub.IAuthTabCallbackStub.setText(ThumbnailAdMobController.this.getContext().getString(R$string.benefit_btn_replay));
            this.onNavigationEvent.invoke(this.onExtraCallbackWithResult);
            int i4 = IAuthTabCallbackDefault + 119;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onVideoPlay() {
            ConstraintLayout constraintLayout;
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 95;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = {ThumbnailAdMobController.this};
                this.IAuthTabCallback.element = false;
                constraintLayout = ThumbnailAdMobController.onNavigationEvent(ThumbnailAdMobController.this).IAuthTabCallbackStub.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                i = 41;
            } else {
                Object[] objArr2 = {ThumbnailAdMobController.this};
                this.IAuthTabCallback.element = true;
                constraintLayout = ThumbnailAdMobController.onNavigationEvent(ThumbnailAdMobController.this).IAuthTabCallbackStub.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                i = 8;
            }
            constraintLayout.setVisibility(i);
        }
    }

    private static final void IAuthTabCallback(Ref.BooleanRef booleanRef, ThumbnailAdMobController thumbnailAdMobController, VideoController videoController, View view) {
        int i = 2 % 2;
        if (booleanRef.element) {
            thumbnailAdMobController.onExtraCallbackWithResult = true;
            if (videoController != null) {
                int i2 = access100 + 65;
                extraCallback = i2 % 128;
                int i3 = i2 % 2;
                videoController.pause();
                return;
            }
            return;
        }
        thumbnailAdMobController.onExtraCallbackWithResult = false;
        if (videoController != null) {
            int i4 = access100 + 27;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            videoController.play();
            if (i5 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final void IAuthTabCallback(ThumbnailAdMobController thumbnailAdMobController, NativeAd nativeAd) {
        int i = 2 % 2;
        int i2 = access100 + 7;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        thumbnailAdMobController.onExtraCallback.asInterface.setNativeAd(nativeAd);
        thumbnailAdMobController.onWarmupCompleted(nativeAd);
        thumbnailAdMobController.IAuthTabCallback = true;
        int i4 = access100 + 47;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[PHI: r1
      0x0060: PHI (r1v18 com.google.android.gms.ads.MediaContent) = (r1v17 com.google.android.gms.ads.MediaContent), (r1v27 com.google.android.gms.ads.MediaContent) binds: [B:16:0x005e, B:13:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(NativeAd nativeAd) {
        MediaContent mediaContent;
        int i = 2 % 2;
        if (onExtraCallback()) {
            int i2 = access100 + 61;
            extraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.onExtraCallbackWithResult || ((Number) this.getInterfaceDescriptor.IAuthTabCallback()).doubleValue() <= 0.5d) {
                return;
            }
            int i3 = extraCallback + 3;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                ConstraintLayout constraintLayout = this.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(114);
                mediaContent = nativeAd.getMediaContent();
                if (mediaContent != null) {
                    VideoController videoController = mediaContent.getVideoController();
                    if (videoController != null) {
                        int i4 = extraCallback + 51;
                        access100 = i4 % 128;
                        int i5 = i4 % 2;
                        videoController.mute(this.asInterface);
                    }
                }
            } else {
                ConstraintLayout constraintLayout2 = this.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                constraintLayout2.setVisibility(8);
                mediaContent = nativeAd.getMediaContent();
                if (mediaContent != null) {
                }
            }
            MediaContent mediaContent2 = nativeAd.getMediaContent();
            if (mediaContent2 != null) {
                int i6 = access100 + 103;
                extraCallback = i6 % 128;
                int i7 = i6 % 2;
                VideoController videoController2 = mediaContent2.getVideoController();
                if (videoController2 != null) {
                    videoController2.play();
                    int i8 = extraCallback + 109;
                    access100 = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
        }
    }

    public final void setOnViewVisible(boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 117;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<Boolean> getcornerradius = this.IAuthTabCallbackDefault;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (i3 != 0) {
            getcornerradius.onWarmupCompleted(boolValueOf);
            return;
        }
        getcornerradius.onWarmupCompleted(boolValueOf);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setVisibleRatio(double d) {
        int i = 2 % 2;
        int i2 = extraCallback + 27;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.getInterfaceDescriptor.onWarmupCompleted(Double.valueOf(d));
            obj.hashCode();
            throw null;
        }
        this.getInterfaceDescriptor.onWarmupCompleted(Double.valueOf(d));
        int i3 = extraCallback + 93;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void setContentLoadState(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onWarmupCompleted(Boolean.valueOf(z));
        if (i3 != 0) {
            throw null;
        }
    }

    private final void onExtraCallback(NativeAd nativeAd) {
        int i = 2 % 2;
        int i2 = extraCallback + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (!onExtraCallback() || this.onExtraCallbackWithResult) {
            return;
        }
        MediaContent mediaContent = nativeAd.getMediaContent();
        if (mediaContent != null) {
            int i4 = extraCallback + 1;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                mediaContent.getVideoController();
                throw null;
            }
            VideoController videoController = mediaContent.getVideoController();
            if (videoController != null) {
                videoController.pause();
                int i5 = access100 + 111;
                extraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        ConstraintLayout constraintLayout = this.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
    }

    public final void IAuthTabCallback() {
        NativeAdView nativeAdView;
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallback + 117;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            this.IAuthTabCallback = true;
            nativeAdView = this.onExtraCallback.asInterface;
            Intrinsics.checkNotNullExpressionValue(nativeAdView, "");
            i = 3;
        } else {
            this.IAuthTabCallback = false;
            nativeAdView = this.onExtraCallback.asInterface;
            Intrinsics.checkNotNullExpressionValue(nativeAdView, "");
            i = 4;
        }
        nativeAdView.setVisibility(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setData(@NotNull BasicSystemInfoExtension basicSystemInfoExtension, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super BasicSystemInfoExtension, Unit> function12) throws Throwable {
        VideoController videoController;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        Bundle responseExtras;
        Uri uri;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(basicSystemInfoExtension, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        NativeAd nativeAdIAuthTabCallback = basicSystemInfoExtension.IAuthTabCallback();
        boolean z2 = false;
        boolean z3 = this.onTransact.IAuthTabCallback() != nativeAdIAuthTabCallback;
        MediaContent mediaContent = nativeAdIAuthTabCallback.getMediaContent();
        if (mediaContent != null) {
            int i6 = extraCallback + 73;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                mediaContent.getVideoController();
                throw null;
            }
            videoController = mediaContent.getVideoController();
        } else {
            videoController = null;
        }
        if (z3) {
            onExtraCallbackWithResult(true);
        }
        this.onTransact.onWarmupCompleted(nativeAdIAuthTabCallback);
        if (((Number) this.getInterfaceDescriptor.IAuthTabCallback()).doubleValue() > 0.0d) {
            onNavigationEvent(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -247809285, 247809286, zziea.IAuthTabCallback(), new Object[]{this, nativeAdIAuthTabCallback});
        }
        this.onExtraCallbackWithResult = false;
        this.onExtraCallback.IAuthTabCallbackDefault.setText(nativeAdIAuthTabCallback.getHeadline());
        this.onExtraCallback.asBinder.setText(nativeAdIAuthTabCallback.getBody());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(context);
        NativeAd.Image icon = nativeAdIAuthTabCallback.getIcon();
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = onnavigationevent.onExtraCallback((icon == null || (uri = icon.getUri()) == null) ? null : uri.toString());
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventIAuthTabCallback = RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new RoundedCornersTransformation(varyMatches.onNavigationEvent(4, r12))});
        TdsImageView tdsImageView = this.onExtraCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, onnavigationeventIAuthTabCallback, (Function1) null, (Function1) null, 6, (Object) null);
        TdsImageView tdsImageView2 = this.onExtraCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        if (nativeAdIAuthTabCallback.getIcon() != null) {
            int i7 = extraCallback + 109;
            access100 = i7 % 128;
            i = i7 % 2 != 0 ? 8 : 0;
        }
        tdsImageView2.setVisibility(i);
        Typography7 typography7 = this.onExtraCallback.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        String headline = nativeAdIAuthTabCallback.getHeadline();
        if (headline == null || StringsKt.isBlank(headline)) {
            int i8 = access100 + 29;
            extraCallback = i8 % 128;
            int i9 = i8 % 2;
            i2 = 8;
        } else {
            i2 = 0;
        }
        typography7.setVisibility(i2);
        Typography7 typography72 = this.onExtraCallback.asBinder;
        Intrinsics.checkNotNullExpressionValue(typography72, "");
        String body = nativeAdIAuthTabCallback.getBody();
        if (body == null || StringsKt.isBlank(body)) {
            z = true;
        } else {
            int i10 = extraCallback + 119;
            access100 = i10 % 128;
            int i11 = i10 % 2;
            z = false;
        }
        if (!z) {
            int i12 = extraCallback + 113;
            access100 = i12 % 128;
            int i13 = i12 % 2;
            i3 = 0;
        } else {
            i3 = 8;
        }
        typography72.setVisibility(i3);
        TdsImageView tdsImageView3 = this.onExtraCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
        String body2 = nativeAdIAuthTabCallback.getBody();
        if (body2 != null) {
            int i14 = extraCallback + 105;
            access100 = i14 % 128;
            int i15 = i14 % 2;
            i4 = !StringsKt.isBlank(body2) ? 0 : 8;
        }
        tdsImageView3.setVisibility(i4);
        ConstraintLayout constraintLayout = this.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        ResponseInfo responseInfo = nativeAdIAuthTabCallback.getResponseInfo();
        this.onExtraCallback.onTransact.setOnClickListener(new ThumbnailAdMobController$.ExternalSyntheticLambda0(function1, (responseInfo == null || (responseExtras = responseInfo.getResponseExtras()) == null) ? null : responseExtras.getString("ad_transparency_url")));
        MediaContent mediaContent2 = nativeAdIAuthTabCallback.getMediaContent();
        if (mediaContent2 == null || !mediaContent2.hasVideoContent()) {
            FrameLayout frameLayout = this.onExtraCallback.access000;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(8);
            ConstraintLayout constraintLayoutOnWarmupCompleted = this.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutOnWarmupCompleted, "");
            constraintLayoutOnWarmupCompleted.setVisibility(8);
        } else {
            FrameLayout frameLayout2 = this.onExtraCallback.access000;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            frameLayout2.setVisibility(0);
            ConstraintLayout constraintLayoutOnWarmupCompleted2 = this.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutOnWarmupCompleted2, "");
            constraintLayoutOnWarmupCompleted2.setVisibility(0);
            onNavigationEvent(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -1047684499, 1047684501, zziea.IAuthTabCallback(), new Object[]{this, Boolean.valueOf(this.asInterface)});
            FrameLayout frameLayout3 = this.onExtraCallback.access000;
            Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
            patch.IAuthTabCallback(frameLayout3, 0.0f, 1, (Object) null);
            this.onExtraCallback.access000.setOnClickListener(new ThumbnailAdMobController$.ExternalSyntheticLambda1(this, videoController));
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (videoController != null) {
            int i16 = access100 + 89;
            extraCallback = i16 % 128;
            int i17 = i16 % 2;
            if (videoController.hasVideoContent()) {
                z2 = true;
            }
        }
        booleanRef.element = z2;
        if (videoController != null) {
            videoController.setVideoLifecycleCallbacks(new IAuthTabCallback(booleanRef, function12, basicSystemInfoExtension));
        }
        this.onExtraCallback.IAuthTabCallbackStub.IAuthTabCallback.setOnClickListener(new ThumbnailAdMobController$.ExternalSyntheticLambda2(booleanRef, this, videoController));
        View root = this.onExtraCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        if (!root.isLaidOut() || root.isLayoutRequested()) {
            root.addOnLayoutChangeListener(new onWarmupCompleted());
            return;
        }
        int width = (int) ((onNavigationEvent(this).getRoot().getWidth() * 2.0f) / 3.0f);
        onNavigationEvent(this).IAuthTabCallbackDefault.setMaxWidth(width);
        onNavigationEvent(this).asBinder.setMaxWidth(width);
    }

    public static /* synthetic */ void onNavigationEvent(Ref.BooleanRef booleanRef, ThumbnailAdMobController thumbnailAdMobController, VideoController videoController, View view) throws Throwable {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        onNavigationEvent(zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), 20642425, -20642422, zziea.IAuthTabCallback(), new Object[]{booleanRef, thumbnailAdMobController, videoController, view});
    }

    public static /* synthetic */ Unit onNavigationEvent(ThumbnailAdMobController thumbnailAdMobController, View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        return (Unit) onNavigationEvent(zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), 1214304752, -1214304752, zziea.IAuthTabCallback(), new Object[]{thumbnailAdMobController, view, suspendAnimationKtExternalSyntheticLambda4});
    }

    public static final /* synthetic */ AppSetIdAndScope1 onWarmupCompleted(ThumbnailAdMobController thumbnailAdMobController) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        return (AppSetIdAndScope1) onNavigationEvent(zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), 1357816291, -1357816287, zziea.IAuthTabCallback(), new Object[]{thumbnailAdMobController});
    }

    private final void onExtraCallbackWithResult(NativeAd nativeAd) throws Throwable {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        onNavigationEvent(zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), -247809285, 247809286, zziea.IAuthTabCallback(), new Object[]{this, nativeAd});
    }

    private final void onWarmupCompleted(boolean z) throws Throwable {
        Object[] objArr = {this, Boolean.valueOf(z)};
        onNavigationEvent(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -1047684499, 1047684501, zziea.IAuthTabCallback(), objArr);
    }
}

package im.toss.ads_sdk.ui.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
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
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView$;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.getCornerRadius;
import o.getPathData;
import o.getStrokeWidth;
import o.maybeUpdateAnimatable;
import o.patch;
import o.setProtocolsokhttp;
import o.setRandomHost;
import o.setShine;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsThumbnailAdMobView extends ConstraintLayout {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallback = 0;
    private static int readTypedObject = 1;
    private final getCornerRadius<Boolean> IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final getCornerRadius<NativeAd> IAuthTabCallbackStub;
    private final getCornerRadius<Double> IAuthTabCallbackStubProxy;
    private final getCornerRadius<Boolean> access000;
    private Function1<? super NativeAd, Unit> access100;
    private TextFieldScrollKtExternalSyntheticLambda0 asBinder;
    private boolean asInterface;
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private NativeAd onTransact;
    private final getPathData onWarmupCompleted;
    private static char[] getInterfaceDescriptor = {64978, 64967, 65065, 64976, 64986, 64905, 64926, 64964, 64924, 64897, 64966, 64925, 64903, 65064, 64982, 64971, 64981, 64988, 64990, 64987, 64989, 64983, 64980, 64960, 64963};
    private static char IAuthTabCallback_Parcel = 51244;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsThumbnailAdMobView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsThumbnailAdMobView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void onExtraCallback(NativeAd nativeAd, NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, View view) {
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(nativeAd, nativeAdsThumbnailAdMobView, view);
        int i4 = extraCallback + 121;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, NativeAd nativeAd) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 93;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallback(nativeAdsThumbnailAdMobView, nativeAd);
        if (i3 == 0) {
            throw null;
        }
        int i4 = readTypedObject + 29;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView = (NativeAdsThumbnailAdMobView) objArr[0];
        VideoController videoController = (VideoController) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = readTypedObject + 15;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(nativeAdsThumbnailAdMobView, videoController, view);
        int i4 = readTypedObject + 3;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i3)) | i5;
        int i9 = ~i5;
        int i10 = ~(i9 | i3 | i2);
        int i11 = (~(i2 | i9)) | i3 | (~(i7 | i5));
        int i12 = i3 + i5 + i + ((-381402339) * i6) + ((-2062754392) * i4);
        int i13 = i12 * i12;
        int i14 = (1317609343 * i3) + 1063714816 + (1288888451 * i5) + (i8 * 14360446) + (14360446 * i10) + ((-14360446) * i11) + (1303248896 * i) + (1454768128 * i6) + (808452096 * i4) + ((-1790509056) * i13);
        int i15 = ((i3 * (-1355236691)) - 921838429) + (i5 * (-1355236103)) + (i8 * (-294)) + (i10 * (-294)) + (i11 * 294) + (i * (-1355236397)) + (i6 * (-1583251481)) + (i4 * 1682205048) + (i13 * (-427491328));
        int i16 = i14 + (i15 * i15 * 844169216);
        if (i16 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i16 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i16 != 3) {
            return i16 != 4 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
        }
        NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView = (NativeAdsThumbnailAdMobView) objArr[0];
        int i17 = 2 % 2;
        int i18 = extraCallback + 113;
        readTypedObject = i18 % 128;
        int i19 = i18 % 2;
        ConstraintLayout constraintLayout = nativeAdsThumbnailAdMobView.onWarmupCompleted.IAuthTabCallbackDefault.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        TdsImageView tdsImageView = nativeAdsThumbnailAdMobView.onWarmupCompleted.IAuthTabCallbackDefault.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(8);
        Typography5 typography5 = nativeAdsThumbnailAdMobView.onWarmupCompleted.IAuthTabCallbackDefault.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        typography5.setVisibility(8);
        int i20 = readTypedObject + 1;
        extraCallback = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    public static final class IAuthTabCallback implements View.OnLayoutChangeListener {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public IAuthTabCallback() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            int width = (int) ((NativeAdsThumbnailAdMobView.onExtraCallback(NativeAdsThumbnailAdMobView.this).asInterface.getWidth() * 2.0f) / 3.0f);
            NativeAdsThumbnailAdMobView.onExtraCallback(NativeAdsThumbnailAdMobView.this).asBinder.setMaxWidth(width);
            NativeAdsThumbnailAdMobView.onExtraCallback(NativeAdsThumbnailAdMobView.this).onTransact.setMaxWidth(width);
            int i12 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 39 / 0;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeAdsThumbnailAdMobView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        getPathData getpathdataOnNavigationEvent = getPathData.onNavigationEvent(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(getpathdataOnNavigationEvent, "");
        this.onWarmupCompleted = getpathdataOnNavigationEvent;
        this.asInterface = true;
        this.IAuthTabCallbackStubProxy = setShine.onNavigationEvent(Double.valueOf(1.0d));
        Boolean bool = Boolean.FALSE;
        this.access000 = setShine.onNavigationEvent(bool);
        this.IAuthTabCallback = setShine.onNavigationEvent(bool);
        this.IAuthTabCallbackStub = setShine.onNavigationEvent((Object) null);
        NativeAdView nativeAdView = getpathdataOnNavigationEvent.asInterface;
        nativeAdView.setHeadlineView(getpathdataOnNavigationEvent.asBinder);
        nativeAdView.setBodyView(getpathdataOnNavigationEvent.onTransact);
        nativeAdView.setIconView(getpathdataOnNavigationEvent.onWarmupCompleted);
        nativeAdView.setMediaView(getpathdataOnNavigationEvent.onNavigationEvent);
        nativeAdView.setCallToActionView(getpathdataOnNavigationEvent.onExtraCallback);
        getpathdataOnNavigationEvent.onNavigationEvent.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
        onWarmupCompleted();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsThumbnailAdMobView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = extraCallback + 91;
            readTypedObject = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = readTypedObject + 7;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView = (NativeAdsThumbnailAdMobView) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -584913187, new Object[]{nativeAdsThumbnailAdMobView}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 584913190, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            return null;
        }
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, -584913187, new Object[]{nativeAdsThumbnailAdMobView}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 584913190, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, NativeAd nativeAd) {
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailAdMobView.IAuthTabCallback(nativeAd);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallback + 79;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallbackDefault(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView) {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailAdMobView.IAuthTabCallback();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView = (NativeAdsThumbnailAdMobView) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<NativeAd> getcornerradius = nativeAdsThumbnailAdMobView.IAuthTabCallbackStub;
        if (i3 != 0) {
            return getcornerradius;
        }
        throw null;
    }

    public static final /* synthetic */ getPathData onExtraCallback(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 121;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        getPathData getpathdata = nativeAdsThumbnailAdMobView.onWarmupCompleted;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 55;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return getpathdata;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getCornerRadius onExtraCallbackWithResult(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 3;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<Boolean> getcornerradius = nativeAdsThumbnailAdMobView.access000;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 27;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public static final /* synthetic */ getCornerRadius onNavigationEvent(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView) {
        int i = 2 % 2;
        int i2 = readTypedObject + 97;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<Boolean> getcornerradius = nativeAdsThumbnailAdMobView.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return getcornerradius;
    }

    public static final /* synthetic */ getCornerRadius onTransact(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 95;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<Double> getcornerradius = nativeAdsThumbnailAdMobView.IAuthTabCallbackStubProxy;
        int i5 = i2 + 37;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView = (NativeAdsThumbnailAdMobView) objArr[0];
        NativeAd nativeAd = (NativeAd) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 15;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailAdMobView.onWarmupCompleted(nativeAd);
        int i4 = extraCallback + 69;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, NativeAd nativeAd) {
        int i = 2 % 2;
        int i2 = readTypedObject + 103;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailAdMobView.onNavigationEvent(nativeAd);
        int i4 = extraCallback + 23;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean onWarmupCompleted(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 91;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = nativeAdsThumbnailAdMobView.onNavigationEvent;
        int i5 = i2 + 117;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private final void onExtraCallbackWithResult(boolean z) throws Throwable {
        String strIntern;
        Object obj;
        int i = 2 % 2;
        this.asInterface = z;
        TdsImageView tdsImageView = this.onWarmupCompleted.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        if (!(!z)) {
            int i2 = readTypedObject + 65;
            extraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{16, 4, 4, 21, 20, '\b', 13786, 13786, 21, 3, 1, 2, 0, 4, 16, 6, 18, 22, 21, '\r', 3, 19, '\t', 3, 2, 18, 21, 24, '\t', 23, 21, 23, 7, '\r', 18, 5, 0, 4, 15, 22, '\b', 21, 15, '\f', 21, 22, 7, 16, 13857, 13857, '\b', 16, 15, 22, 16, 7, 5, 7, '\t', 17, 0, 2, '\n', '\f', 20, 21, 13858}, (byte) (21 << TextUtils.indexOf((CharSequence) "", 'C')), TextUtils.getOffsetAfter("", 0) + 106, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{16, 4, 4, 21, 20, '\b', 13786, 13786, 21, 3, 1, 2, 0, 4, 16, 6, 18, 22, 21, '\r', 3, 19, '\t', 3, 2, 18, 21, 24, '\t', 23, 21, 23, 7, '\r', 18, 5, 0, 4, 15, 22, '\b', 21, 15, '\f', 21, 22, 7, 16, 13857, 13857, '\b', 16, 15, 22, 16, 7, 5, 7, '\t', 17, 0, 2, '\n', '\f', 20, 21, 13858}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 38), 67 - TextUtils.getOffsetAfter("", 0), objArr2);
                obj = objArr2[0];
            }
            strIntern = ((String) obj).intern();
        } else {
            Object[] objArr3 = new Object[1];
            a(new char[]{16, 4, 4, 21, 20, '\b', 13759, 13759, 21, 3, 1, 2, 0, 4, 16, 6, 18, 22, 21, '\r', 3, 19, '\t', 3, 2, 18, 21, 24, '\t', 23, 21, 23, 7, '\r', 18, 5, 0, 4, 15, 22, '\b', 21, 15, '\f', 21, 22, 7, 16, 21, 5, 19, 18, 22, 15, 7, 5, 7, '\b', 24, '\t', 4, 11, 14, 21, 21, 23}, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10), 66 - TextUtils.indexOf("", "", 0), objArr3);
            strIntern = ((String) objArr3[0]).intern();
            int i3 = extraCallback + 87;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
        }
        TdsImageView.setImage$default(tdsImageView, strIntern, (Function1) null, (Function1) null, 6, (Object) null);
    }

    private final boolean onNavigationEvent() {
        MediaContent mediaContent;
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAd nativeAd = (NativeAd) this.IAuthTabCallbackStub.IAuthTabCallback();
        if (nativeAd != null && (mediaContent = nativeAd.getMediaContent()) != null) {
            int i4 = readTypedObject + 95;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            boolean zHasVideoContent = mediaContent.hasVideoContent();
            if (i5 == 0 ? zHasVideoContent : zHasVideoContent) {
                return true;
            }
        }
        int i6 = extraCallback + 35;
        readTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*android.view.View*/.onAttachedToWindow();
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            this.asBinder = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
            if (this.IAuthTabCallbackDefault) {
                return;
            }
            this.IAuthTabCallbackDefault = true;
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null || (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult)) == null) {
                return;
            }
            int i3 = extraCallback + 11;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = this.asBinder;
            if (textFieldScrollKtExternalSyntheticLambda0 == null || (lifecycle = textFieldScrollKtExternalSyntheticLambda0.getLifecycle()) == null) {
                return;
            }
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(lifecycle, this, (access13800) null), 3, (Object) null);
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this, (access13800) null), 3, (Object) null);
            return;
        }
        super/*android.view.View*/.onAttachedToWindow();
        this.asBinder = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        throw null;
    }

    private final void onWarmupCompleted(NativeAd nativeAd) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 11;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        NativeAdView nativeAdView = this.onWarmupCompleted.asInterface;
        Intrinsics.checkNotNullExpressionValue(nativeAdView, "");
        nativeAdView.setVisibility(0);
        if (onNavigationEvent() && !this.onExtraCallbackWithResult) {
            onExtraCallbackWithResult(nativeAd);
            int i4 = readTypedObject + 63;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!(!this.onExtraCallback)) {
            return;
        }
        int i6 = readTypedObject + 49;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
        this.onExtraCallback = true;
        Function1<? super NativeAd, Unit> function1 = this.access100;
        if (function1 != null) {
            function1.invoke(nativeAd);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[PHI: r4
      0x003c: PHI (r4v4 com.google.android.gms.ads.VideoController) = (r4v3 com.google.android.gms.ads.VideoController), (r4v5 com.google.android.gms.ads.VideoController) binds: [B:16:0x003a, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(NativeAd nativeAd) {
        VideoController videoController;
        int i = 2 % 2;
        int i2 = readTypedObject + 55;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            if ((!onNavigationEvent()) || this.onExtraCallbackWithResult) {
                return;
            }
            MediaContent mediaContent = nativeAd.getMediaContent();
            if (mediaContent != null) {
                int i3 = extraCallback + 47;
                readTypedObject = i3 % 128;
                if (i3 % 2 == 0) {
                    videoController = mediaContent.getVideoController();
                    int i4 = 80 / 0;
                    if (videoController != null) {
                        int i5 = extraCallback + 33;
                        readTypedObject = i5 % 128;
                        int i6 = i5 % 2;
                        videoController.pause();
                    }
                } else {
                    videoController = mediaContent.getVideoController();
                    if (videoController != null) {
                    }
                }
            }
            IAuthTabCallback();
            return;
        }
        onNavigationEvent();
        throw null;
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallback + 87;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout frameLayout = this.onWarmupCompleted.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        setProtocolsokhttp.onExtraCallback(frameLayout);
        FrameLayout frameLayout2 = this.onWarmupCompleted.access000;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        setProtocolsokhttp.onExtraCallback(frameLayout2);
        this.onWarmupCompleted.IAuthTabCallbackDefault.IAuthTabCallback.setImportantForAccessibility(2);
        this.onWarmupCompleted.IAuthTabCallbackDefault.IAuthTabCallbackDefault.setImportantForAccessibility(2);
        int i4 = extraCallback + 83;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallbackWithResult(NativeAd nativeAd, NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, View view) {
        Bundle responseExtras;
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        ResponseInfo responseInfo = nativeAd.getResponseInfo();
        if (responseInfo != null && (responseExtras = responseInfo.getResponseExtras()) != null) {
            int i4 = readTypedObject + 41;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            String string = responseExtras.getString("ad_transparency_url");
            if (string != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    nativeAdsThumbnailAdMobView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
                    getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
                    Context context = nativeAdsThumbnailAdMobView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    getStrokeWidth.onExtraCallbackWithResult(getstrokewidth, context, string, "ads_sdk_admob_transparency", null, 4, null);
                    Result.constructor-impl(Unit.INSTANCE);
                    return;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
        }
        int i6 = readTypedObject + 79;
        extraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, VideoController videoController, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailAdMobView.onExtraCallbackWithResult(!nativeAdsThumbnailAdMobView.asInterface);
        if (videoController != null) {
            videoController.mute(nativeAdsThumbnailAdMobView.asInterface);
        }
        int i4 = readTypedObject + 87;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallback extends VideoController.VideoLifecycleCallbacks {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        onExtraCallback() {
        }

        public void onVideoPlay() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {NativeAdsThumbnailAdMobView.this};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            NativeAdsThumbnailAdMobView.onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1120934396, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1120934394, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            int i4 = onWarmupCompleted + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onVideoPause() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                NativeAdsThumbnailAdMobView.onExtraCallback(NativeAdsThumbnailAdMobView.this).IAuthTabCallbackDefault.IAuthTabCallbackDefault.setText(NativeAdsThumbnailAdMobView.this.getContext().getString(R.string.ads_sdk_continue_play));
                NativeAdsThumbnailAdMobView.IAuthTabCallbackDefault(NativeAdsThumbnailAdMobView.this);
                int i3 = 33 / 0;
            } else {
                NativeAdsThumbnailAdMobView.onExtraCallback(NativeAdsThumbnailAdMobView.this).IAuthTabCallbackDefault.IAuthTabCallbackDefault.setText(NativeAdsThumbnailAdMobView.this.getContext().getString(R.string.ads_sdk_continue_play));
                NativeAdsThumbnailAdMobView.IAuthTabCallbackDefault(NativeAdsThumbnailAdMobView.this);
            }
            int i4 = onExtraCallback + 51;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public void onVideoEnd() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsThumbnailAdMobView.onExtraCallback(NativeAdsThumbnailAdMobView.this).IAuthTabCallbackDefault.IAuthTabCallbackDefault.setText(NativeAdsThumbnailAdMobView.this.getContext().getString(R.string.ads_sdk_continue_replay));
            NativeAdsThumbnailAdMobView.IAuthTabCallbackDefault(NativeAdsThumbnailAdMobView.this);
            int i4 = onExtraCallback + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setOnViewVisible(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 79;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.access000.onWarmupCompleted(Boolean.valueOf(z));
        int i4 = readTypedObject + 115;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setVisibleRatio(double d) {
        int i = 2 % 2;
        int i2 = extraCallback + 13;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(Double.valueOf(d));
        int i4 = extraCallback + 49;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
    }

    public final void setContentLoadState(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.onWarmupCompleted(Boolean.valueOf(z));
        int i4 = extraCallback + 15;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(NativeAd nativeAd) {
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.onNavigationEvent) {
            return;
        }
        post(new NativeAdsThumbnailAdMobView$.ExternalSyntheticLambda0(this, nativeAd));
        int i3 = readTypedObject + 125;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void onExtraCallback(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, NativeAd nativeAd) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 87;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailAdMobView.onWarmupCompleted.asInterface.setNativeAd(nativeAd);
        nativeAdsThumbnailAdMobView.onExtraCallbackWithResult(nativeAd);
        nativeAdsThumbnailAdMobView.onNavigationEvent = true;
        int i4 = readTypedObject + 77;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(NativeAd nativeAd) throws Throwable {
        int i = 2 % 2;
        if (onNavigationEvent()) {
            int i2 = extraCallback + 47;
            int i3 = i2 % 128;
            readTypedObject = i3;
            int i4 = i2 % 2;
            if (!this.onExtraCallbackWithResult) {
                int i5 = i3 + 3;
                extraCallback = i5 % 128;
                Object obj = null;
                if (i5 % 2 != 0) {
                    ((Number) this.IAuthTabCallbackStubProxy.IAuthTabCallback()).doubleValue();
                    throw null;
                }
                if (((Number) this.IAuthTabCallbackStubProxy.IAuthTabCallback()).doubleValue() > 0.5d) {
                    int i6 = extraCallback + 23;
                    readTypedObject = i6 % 128;
                    int i7 = i6 % 2;
                    onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -584913187, new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 584913190, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
                    onExtraCallbackWithResult(true);
                    MediaContent mediaContent = nativeAd.getMediaContent();
                    if (mediaContent != null) {
                        int i8 = readTypedObject + 59;
                        extraCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            mediaContent.getVideoController();
                            obj.hashCode();
                            throw null;
                        }
                        VideoController videoController = mediaContent.getVideoController();
                        if (videoController != null) {
                            int i9 = readTypedObject + 121;
                            extraCallback = i9 % 128;
                            if (i9 % 2 != 0) {
                                videoController.mute(true);
                            } else {
                                videoController.mute(true);
                            }
                        }
                    }
                    MediaContent mediaContent2 = nativeAd.getMediaContent();
                    if (mediaContent2 != null) {
                        int i10 = extraCallback + 47;
                        readTypedObject = i10 % 128;
                        if (i10 % 2 == 0) {
                            mediaContent2.getVideoController();
                            throw null;
                        }
                        VideoController videoController2 = mediaContent2.getVideoController();
                        if (videoController2 != null) {
                            int i11 = readTypedObject + 103;
                            extraCallback = i11 % 128;
                            int i12 = i11 % 2;
                            videoController2.play();
                            if (i12 == 0) {
                                return;
                            }
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = getInterfaceDescriptor;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $11 + 5;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback_Parcel)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 26 - Drawable.resolveOpacity(0, 0), 23139 - (ViewConfiguration.getEdgeSlop() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                int i7 = $10 + 115;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent % 0];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (KeyEvent.getMaxKeyCode() >> 16)), 74 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getTouchSlop() >> 8) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i8 = $11 + 15;
                            $10 = i8 % 128;
                            int i9 = i8 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 30 - ExpandableListView.getPackedPositionType(0L), 19488 - Color.alpha(0), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i11 = $11 + 125;
                                $10 = i11 % 128;
                                int i12 = i11 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                                int i15 = $10 + 25;
                                $11 = i15 % 128;
                                int i16 = i15 % 2;
                            } else {
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                            }
                        }
                    }
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f7, code lost:
    
        if ((!r1.isLayoutRequested()) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01fe, code lost:
    
        if (r1.isLayoutRequested() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0200, code lost:
    
        r1 = (int) ((onExtraCallback(r17).asInterface.getWidth() * 2.0f) / 3.0f);
        onExtraCallback(r17).asBinder.setMaxWidth(r1);
        onExtraCallback(r17).onTransact.setMaxWidth(r1);
        r1 = im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView.extraCallback + 95;
        im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView.readTypedObject = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x022d, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull NativeAd nativeAd, @NotNull Function1<? super NativeAd, Unit> function1) throws Throwable {
        int i;
        int i2;
        Uri uri;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(nativeAd, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onTransact = nativeAd;
        this.access100 = function1;
        this.onExtraCallback = false;
        this.IAuthTabCallbackStub.onWarmupCompleted(nativeAd);
        this.onExtraCallbackWithResult = false;
        if (((Number) this.IAuthTabCallbackStubProxy.IAuthTabCallback()).doubleValue() > 0.0d) {
            IAuthTabCallback(nativeAd);
        }
        this.onWarmupCompleted.asBinder.setText(nativeAd.getHeadline());
        this.onWarmupCompleted.onTransact.setText(nativeAd.getBody());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(context);
        NativeAd.Image icon = nativeAd.getIcon();
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = onnavigationevent.onExtraCallback((icon == null || (uri = icon.getUri()) == null) ? null : uri.toString());
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventIAuthTabCallback = RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new RoundedCornersTransformation(varyMatches.onNavigationEvent(4, r6))});
        TdsImageView tdsImageView = this.onWarmupCompleted.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, onnavigationeventIAuthTabCallback, (Function1) null, (Function1) null, 6, (Object) null);
        TdsImageView tdsImageView2 = this.onWarmupCompleted.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        tdsImageView2.setVisibility(nativeAd.getIcon() != null ? 0 : 8);
        Typography7 typography7 = this.onWarmupCompleted.asBinder;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        String headline = nativeAd.getHeadline();
        if (headline == null || StringsKt.isBlank(headline)) {
            i = 8;
        } else {
            int i4 = readTypedObject + 7;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        }
        typography7.setVisibility(i);
        Typography7 typography72 = this.onWarmupCompleted.onTransact;
        Intrinsics.checkNotNullExpressionValue(typography72, "");
        String body = nativeAd.getBody();
        if (body == null || StringsKt.isBlank(body)) {
            i2 = 8;
        } else {
            int i6 = extraCallback + 29;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            i2 = 0;
        }
        typography72.setVisibility(i2);
        TdsImageView tdsImageView3 = this.onWarmupCompleted.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
        String body2 = nativeAd.getBody();
        tdsImageView3.setVisibility((body2 == null || StringsKt.isBlank(body2)) ? 8 : 0);
        this.onWarmupCompleted.IAuthTabCallbackStub.setOnClickListener(new NativeAdsThumbnailAdMobView$.ExternalSyntheticLambda1(nativeAd, this));
        MediaContent mediaContent = nativeAd.getMediaContent();
        VideoController videoController = mediaContent != null ? mediaContent.getVideoController() : null;
        MediaContent mediaContent2 = nativeAd.getMediaContent();
        if (mediaContent2 != null) {
            int i8 = extraCallback + 69;
            readTypedObject = i8 % 128;
            int i9 = i8 % 2;
            if (mediaContent2.hasVideoContent()) {
                FrameLayout frameLayout = this.onWarmupCompleted.access000;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                frameLayout.setVisibility(0);
                ConstraintLayout constraintLayoutOnNavigationEvent = this.onWarmupCompleted.IAuthTabCallbackDefault.onNavigationEvent();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
                constraintLayoutOnNavigationEvent.setVisibility(0);
                onExtraCallbackWithResult(true);
                onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -584913187, new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 584913190, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
                FrameLayout frameLayout2 = this.onWarmupCompleted.access000;
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
                patch.IAuthTabCallback(frameLayout2, 0.0f, 1, (Object) null);
                this.onWarmupCompleted.access000.setOnClickListener(new NativeAdsThumbnailAdMobView$.ExternalSyntheticLambda2(this, videoController));
                int i10 = extraCallback + 17;
                readTypedObject = i10 % 128;
                int i11 = i10 % 2;
            } else {
                FrameLayout frameLayout3 = this.onWarmupCompleted.access000;
                Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
                frameLayout3.setVisibility(8);
                ConstraintLayout constraintLayoutOnNavigationEvent2 = this.onWarmupCompleted.IAuthTabCallbackDefault.onNavigationEvent();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent2, "");
                constraintLayoutOnNavigationEvent2.setVisibility(8);
                onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -584913187, new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 584913190, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            }
        }
        if (videoController != null) {
            videoController.setVideoLifecycleCallbacks(new onExtraCallback());
        }
        NativeAdView nativeAdView = this.onWarmupCompleted.asInterface;
        Intrinsics.checkNotNullExpressionValue(nativeAdView, "");
        if (!(!nativeAdView.isLaidOut())) {
            int i12 = extraCallback + 71;
            readTypedObject = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 71 / 0;
            }
        }
        nativeAdView.addOnLayoutChangeListener(new IAuthTabCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 com.google.android.gms.ads.nativead.NativeAd) = (r1v4 com.google.android.gms.ads.nativead.NativeAd), (r1v8 com.google.android.gms.ads.nativead.NativeAd) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback() {
        NativeAd nativeAd;
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent = true;
            this.onExtraCallback = false;
            nativeAd = this.onTransact;
            if (nativeAd != null) {
                nativeAd.destroy();
            }
        } else {
            this.onNavigationEvent = false;
            this.onExtraCallback = false;
            nativeAd = this.onTransact;
            if (nativeAd != null) {
            }
        }
        Object obj = null;
        this.onTransact = null;
        this.IAuthTabCallbackStub.onWarmupCompleted((Object) null);
        NativeAdView nativeAdView = this.onWarmupCompleted.asInterface;
        Intrinsics.checkNotNullExpressionValue(nativeAdView, "");
        nativeAdView.setVisibility(4);
        int i3 = extraCallback + 67;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 15;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = this.onWarmupCompleted.IAuthTabCallbackDefault.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        TdsImageView tdsImageView = this.onWarmupCompleted.IAuthTabCallbackDefault.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(0);
        Typography5 typography5 = this.onWarmupCompleted.IAuthTabCallbackDefault.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        typography5.setVisibility(0);
        int i4 = extraCallback + 95;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, VideoController videoController, View view) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1403125017, new Object[]{nativeAdsThumbnailAdMobView, videoController, view}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1403125016, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallback(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (getCornerRadius) onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -1108856079, new Object[]{nativeAdsThumbnailAdMobView}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 1108856079, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1120934396, new Object[]{nativeAdsThumbnailAdMobView}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1120934394, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, NativeAd nativeAd) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1901605491, new Object[]{nativeAdsThumbnailAdMobView, nativeAd}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1901605487, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private final void onExtraCallbackWithResult() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -584913187, new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 584913190, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }
}

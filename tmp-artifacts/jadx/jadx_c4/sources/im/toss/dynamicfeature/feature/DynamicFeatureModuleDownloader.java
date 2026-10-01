package im.toss.dynamicfeature.feature;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.sdk.openadsdk.wwx.lt;
import com.google.android.gms.internal.ads.zzgc;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.tmoney.LiveCheckConstants;
import im.toss.dynamicfeature.R;
import im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader;
import im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader$;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.IAnimation;
import o.Response;
import o.SetDetectableSize;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.UserChoiceBillingListener;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access14600;
import o.access15400;
import o.access8100;
import o.applyTransparentTitle;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdService;
import o.getBacktraceNote;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.logInvite;
import o.maybeRemoveAttachStateListener;
import o.maybeUpdateAnimatable;
import o.parse;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.readIntokhttp;
import o.response;
import o.setCommandLine;
import o.setLogBuffers;
import o.setPingIntervalokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.setResourceInternal;
import o.setRevision;
import o.setRipple;
import o.setTagsokhttp;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DynamicFeatureModuleDownloader extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static final Lazy<applyTransparentTitle> IAuthTabCallback;
    private static char[] IAuthTabCallbackDefault = null;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private static int asBinder;
    private static char asInterface;
    private static int getInterfaceDescriptor;
    private BottomSheetHeader onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final Function0<Unit> onTransact;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        DynamicFeatureModuleDownloader dynamicFeatureModuleDownloader = (DynamicFeatureModuleDownloader) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tdsBottomCtaV1View, dynamicFeatureModuleDownloader, view);
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ applyTransparentTitle IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(DynamicFeatureModuleDownloader dynamicFeatureModuleDownloader, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(dynamicFeatureModuleDownloader, commonModule_setLeftEdgeTouchEnabled);
        }
        onWarmupCompleted(dynamicFeatureModuleDownloader, commonModule_setLeftEdgeTouchEnabled);
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i | i5 | i2;
        int i8 = (~((~i2) | i5)) | i;
        int i9 = ~((~i) | i5);
        int i10 = i + i5 + i6 + (1132004924 * i3) + ((-2047965933) * i4);
        int i11 = i10 * i10;
        int i12 = ((1650805025 * i) - 289800192) + ((-1513965855) * i5) + ((-565098208) * i7) + (i8 * 565098208) + (565098208 * i9) + ((-2079064064) * i6) + (1823473664 * i3) + (830210048 * i4) + ((-1143341056) * i11);
        int i13 = ((i * (-767560105)) - 1188649921) + (i5 * (-767559017)) + (i7 * (-544)) + (i8 * 544) + (i9 * 544) + (i6 * (-767559561)) + (i3 * 1544553956) + (i4 * (-1468578859)) + (i11 * (-2108293120));
        if (i12 + (i13 * i13 * (-2075787264)) != 1) {
            return IAuthTabCallback(objArr);
        }
        int i14 = 2 % 2;
        int i15 = asBinder + 83;
        int i16 = i15 % 128;
        IAuthTabCallback_Parcel = i16;
        int i17 = i15 % 2;
        Lazy<applyTransparentTitle> lazy = IAuthTabCallback;
        int i18 = i16 + 5;
        asBinder = i18 % 128;
        int i19 = i18 % 2;
        return lazy;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(dialogInterface);
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DynamicFeatureModuleDownloader dynamicFeatureModuleDownloader, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(dynamicFeatureModuleDownloader, dialogInterface);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 67;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicFeatureModuleDownloader(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull Function0<Unit> function0) {
        super(context, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallbackWithResult = str;
        this.onNavigationEvent = str2;
        this.onTransact = function0;
    }

    public static final /* synthetic */ BottomSheetHeader onExtraCallback(DynamicFeatureModuleDownloader dynamicFeatureModuleDownloader) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 91;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        BottomSheetHeader bottomSheetHeader = dynamicFeatureModuleDownloader.onExtraCallback;
        int i5 = i2 + 15;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return bottomSheetHeader;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onNavigationEvent(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        
            if (r1 == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            r2.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r3 = im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader.onNavigationEvent.onNavigationEvent + 25;
            im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader.onNavigationEvent.onWarmupCompleted = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        
            if ((r3 % 2) != 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r5.IAuthTabCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r5.IAuthTabCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            r1 = im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader.onNavigationEvent.onWarmupCompleted + 97;
            im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader.onNavigationEvent.onNavigationEvent = r1 % 128;
            r1 = r1 % 2;
            r0 = o.getSpecialFeatureOptInStatus.Dark;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                int i3 = 96 / 0;
            }
        }
    }

    private static final Unit onExtraCallbackWithResult(DynamicFeatureModuleDownloader dynamicFeatureModuleDownloader, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "DFM", "User Canceled", access8100.onNavigationEvent(getWrite.IAuthTabCallback("module", dynamicFeatureModuleDownloader.onExtraCallbackWithResult)), false, (String) null, 24, (Object) null);
        dialogInterface.dismiss();
        dynamicFeatureModuleDownloader.dismiss();
        dynamicFeatureModuleDownloader.cancel();
        dynamicFeatureModuleDownloader.onTransact.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 111;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 43;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(final DynamicFeatureModuleDownloader dynamicFeatureModuleDownloader, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(commonModule_setLeftEdgeTouchEnabled.onWarmupCompleted().getString(R.string.dynamic_features_cancel_download_question));
        String string = commonModule_setLeftEdgeTouchEnabled.onWarmupCompleted().getString(R.string.dynamic_features_stop);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DANGER, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 14, (DefaultConstructorMarker) null), false, new Function1() { // from class: im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 33;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = DynamicFeatureModuleDownloader.onWarmupCompleted(this.f$0, (DialogInterface) obj);
                int i5 = onNavigationEvent + 123;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        }, 4, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = commonModule_setLeftEdgeTouchEnabled.onWarmupCompleted().getString(R.string.dynamic_features_continue);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 25;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = DynamicFeatureModuleDownloader.onWarmupCompleted((DialogInterface) obj);
                int i5 = onNavigationEvent + 103;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 121;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(TdsBottomCtaV1View tdsBottomCtaV1View, final DynamicFeatureModuleDownloader dynamicFeatureModuleDownloader, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Context context = tdsBottomCtaV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 69;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = DynamicFeatureModuleDownloader.onNavigationEvent(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
                int i5 = onWarmupCompleted + 61;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub;
        int i = 2 % 2;
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        setCancelable(false);
        getBehavior().setDraggable(false);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context2, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsScrollView.setLayoutParams(layoutParams);
        Context context3 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        LinearLayout linearLayout2 = new LinearLayout(context3);
        linearLayout2.setOrientation(1);
        Context context4 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context4, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(this.onNavigationEvent);
        String string = bottomSheetHeader.getContext().getString(R.string.dynamic_features_download_progress);
        Intrinsics.checkNotNullExpressionValue(string, "");
        bottomSheetHeader.setDescription(string);
        Configuration configuration = bottomSheetHeader.getContext().getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        bottomSheetHeader.setDescriptionColor(new getUrlokhttp(new onNavigationEvent(configuration)).asBinder());
        bottomSheetHeader.setDescriptionFont(response.Bold);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, bottomSheetHeader);
        this.onExtraCallback = bottomSheetHeader;
        Context context5 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsImageView tdsImageView = new TdsImageView(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.gravity = 1;
        layoutParams4.height = setTagsokhttp.onExtraCallbackWithResult(tdsImageView, 100);
        layoutParams4.width = setTagsokhttp.onExtraCallbackWithResult(tdsImageView, 100);
        tdsImageView.setLayoutParams(layoutParams3);
        Object[] objArr = new Object[1];
        a(new char[]{3, 22, 24, 21, 18, '\n', 13840, 13840, 18, 20, 22, 24, 2, '\r', 3, 20, 0, 16, 20, 5, 4, '\r', '\f', 21, 6, '\r', 17, 5, 7, '\t', '\t', 19, 6, 11, '\t', 22, 0, '\t', 6, 1, '\r', '\b', 5, 11, 0, '\t', 13904, 13904, 0, 5, 21, 5, 13912}, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 91), ImageFormat.getBitsPerPixel(0) + 54, objArr);
        TdsImageView.setImage$default(tdsImageView, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsImageView);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(linearLayout2.getContext());
        ViewGroup.LayoutParams layoutParams5 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams6.gravity = 1;
        layoutParams6.height = setTagsokhttp.onExtraCallbackWithResult(lottieAnimationView, 100);
        layoutParams6.width = setTagsokhttp.onExtraCallbackWithResult(lottieAnimationView, 100);
        lottieAnimationView.setLayoutParams(layoutParams5);
        lottieAnimationView.setVisibility(8);
        Object[] objArr2 = new Object[1];
        a(new char[]{3, 22, 24, 21, 18, '\n', 13814, 13814, 18, 20, 22, 24, 2, '\r', 3, 20, 0, 16, 20, 5, 4, '\r', '\n', 6, 3, 21, 3, '\b', 5, 17, '\f', '\r', 7, '\f', '\r', 17, 0, 19, 21, 0, 24, 3, '\b', 0, '\f', 0, 20, 3, 17, 16, 6, 11}, (byte) (View.combineMeasuredStates(0, 0) + 65), TextUtils.indexOf((CharSequence) "", '0', 0) + 53, objArr2);
        lottieAnimationView.setAnimationFromUrl(((String) objArr2[0]).intern());
        setPingIntervalokhttp.onWarmupCompleted(lottieAnimationView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, lottieAnimationView);
        Context context6 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context6);
        Context context7 = tdsBottomCtaV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        Resources resources = context7.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration2 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        if (readIntokhttp.onExtraCallback(configuration2)) {
            int i2 = IAuthTabCallback_Parcel + 65;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub2 = TdsButtonV1View.IAuthTabCallbackStub.LIGHT;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iAuthTabCallbackStub = TdsButtonV1View.IAuthTabCallbackStub.LIGHT;
        } else {
            iAuthTabCallbackStub = TdsButtonV1View.IAuthTabCallbackStub.DARK;
            int i3 = asBinder + 39;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        tdsBottomCtaV1View.asInterface().setButtonType(iAuthTabCallbackStub);
        tdsBottomCtaV1View.asInterface().setButtonStyle(TdsButtonV1View.IAuthTabCallbackDefault.WEAK);
        String string2 = tdsBottomCtaV1View.getContext().getString(R.string.dynamic_features_cancel);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        logInvite.onExtraCallback(tdsBottomCtaV1View, string2, 0L, (TdsButtonV1View.asInterface) null, false, new DynamicFeatureModuleDownloader$.ExternalSyntheticLambda0(tdsBottomCtaV1View, this), 14, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsBottomCtaV1View);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsScrollView);
        setContentView(linearLayout);
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Unit onExtraCallback(TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            Unit unit = (Unit) onExtraCallbackWithResult(-1668603021, new Object[]{textFieldPressGestureFilterKtExternalSyntheticLambda0}, 1668603022, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
            int i4 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i2;
            int i8 = ~i;
            int i9 = ~(i7 | i8 | i3);
            int i10 = ~i3;
            int i11 = (~(i7 | i10)) | (~(i8 | i2 | i3));
            int i12 = (~(i3 | i7)) | (~(i8 | i10));
            int i13 = i2 + i + i6 + ((-1255669517) * i5) + (533247121 * i4);
            int i14 = i13 * i13;
            int i15 = ((i2 * (-1895547823)) - 858849280) + ((-1895547823) * i) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i6) + (760610816 * i5) + ((-1057882112) * i4) + (1344208896 * i14);
            int i16 = ((i2 * (-122328301)) - 2132886715) + (i * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i6 * (-122328029)) + (i5 * (-1196579527)) + (i4 * 656595923) + (i14 * 138215424);
            return i15 + ((i16 * i16) * (-833028096)) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
        }

        public static /* synthetic */ Unit onWarmupCompleted(String str, Map map, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(str, map, setDetectableSize);
            int i4 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnExtraCallback;
            }
            throw null;
        }

        private IAuthTabCallback() {
        }

        public static final /* synthetic */ applyTransparentTitle onExtraCallback(IAuthTabCallback iAuthTabCallback) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            applyTransparentTitle applytransparenttitleOnNavigationEvent = iAuthTabCallback.onNavigationEvent();
            if (i3 == 0) {
                int i4 = 56 / 0;
            }
            return applytransparenttitleOnNavigationEvent;
        }

        public static final /* synthetic */ void onNavigationEvent(IAuthTabCallback iAuthTabCallback, Map map, String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
                onExtraCallbackWithResult(1433571950, new Object[]{iAuthTabCallback, map, str}, -1433571950, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = lt.40.onExtraCallbackWithResult();
            onExtraCallbackWithResult(1433571950, new Object[]{iAuthTabCallback, map, str}, -1433571950, iOnExtraCallbackWithResult3, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4);
            int i3 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }

        private final applyTransparentTitle onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            applyTransparentTitle applytransparenttitle = (applyTransparentTitle) ((Lazy) DynamicFeatureModuleDownloader.onWarmupCompleted(-1452028519, new Object[0], PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1452028520, PushInfo.Companion.onExtraCallback())).getValue();
            int i4 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return applytransparenttitle;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        
            o.ConvertFloatArrayToByteArray.onWarmupCompleted(o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5212420, false, null, null, new im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader$Companion$$ExternalSyntheticLambda1(r15, r1), 14, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        
            if (r1 == null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        
            if (r1 == null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            r3 = r3 + 11;
            im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader.IAuthTabCallback.onExtraCallbackWithResult = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        
            if ((r3 % 2) != 0) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
            final Map map = (Map) objArr[1];
            final String str = (String) objArr[2];
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 21;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 52 / 0;
            }
        }

        private static final Unit onExtraCallback(String str, Map map, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("result_type", str);
            setDetectableSize.onExtraCallback(map);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public static /* synthetic */ Object onWarmupCompleted(IAuthTabCallback iAuthTabCallback, Context context, String str, String str2, Map map, access13800 access13800Var, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i3 % 128;
            Object objIAuthTabCallback = iAuthTabCallback.IAuthTabCallback(context, str, str2, (i3 % 2 == 0 ? (i & 8) == 0 : (i & 80) == 0) ? map : null, access13800Var);
            int i4 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        /* renamed from: im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        static final class C0009IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            int label;

            C0009IAuthTabCallback(access13800<? super C0009IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                C0009IAuthTabCallback c0009IAuthTabCallback = new C0009IAuthTabCallback(access13800Var);
                int i2 = onWarmupCompleted + 1;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return c0009IAuthTabCallback;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 67;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                C0009IAuthTabCallback c0009IAuthTabCallbackCreate = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    c0009IAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = c0009IAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 83;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    applyTransparentTitle applytransparenttitleOnExtraCallback = IAuthTabCallback.onExtraCallback(DynamicFeatureModuleDownloader.Companion);
                    this.label = 1;
                    if (applytransparenttitleOnExtraCallback.onNavigationEvent(this) == objOnWarmupCompleted) {
                        int i3 = onWarmupCompleted + 55;
                        onExtraCallbackWithResult = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 12 / 0;
                        }
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = onExtraCallbackWithResult + 81;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0 = (TextFieldPressGestureFilterKtExternalSyntheticLambda0) objArr[0];
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0 != null) {
                maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0, (CoroutineContext) null, (setRandomHost) null, new C0009IAuthTabCallback(null), 3, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ Context $context;
            final /* synthetic */ maybeRemoveAttachStateListener<Unit> $continuation;
            final /* synthetic */ DynamicFeatureModuleDownloader $dialog;
            final /* synthetic */ Map<String, Object> $logParams;
            final /* synthetic */ String $moduleName;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallback(String str, DynamicFeatureModuleDownloader dynamicFeatureModuleDownloader, maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener, Map<String, ? extends Object> map, Context context, access13800<? super onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.$moduleName = str;
                this.$dialog = dynamicFeatureModuleDownloader;
                this.$continuation = mayberemoveattachstatelistener;
                this.$logParams = map;
                this.$context = context;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(this.$moduleName, this.$dialog, this.$continuation, this.$logParams, this.$context, access13800Var);
                int i2 = onExtraCallback + 119;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return onextracallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 37;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    return onNavigationEvent(findresandmsg, access13800Var);
                }
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 117;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 119;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* renamed from: im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader$IAuthTabCallback$onExtraCallback$4, reason: invalid class name */
            static final class AnonymousClass4 extends SuspendLambda implements getBacktraceNote<setRipple<? super parse>, Throwable, access13800<? super Unit>, Object> {
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;
                final /* synthetic */ Context $context;
                final /* synthetic */ maybeRemoveAttachStateListener<Unit> $continuation;
                final /* synthetic */ DynamicFeatureModuleDownloader $dialog;
                final /* synthetic */ Map<String, Object> $logParams;
                final /* synthetic */ String $moduleName;
                /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(String str, DynamicFeatureModuleDownloader dynamicFeatureModuleDownloader, maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener, Map<String, ? extends Object> map, Context context, access13800<? super AnonymousClass4> access13800Var) {
                    super(3, access13800Var);
                    this.$moduleName = str;
                    this.$dialog = dynamicFeatureModuleDownloader;
                    this.$continuation = mayberemoveattachstatelistener;
                    this.$logParams = map;
                    this.$context = context;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 103;
                    onNavigationEvent = i2 % 128;
                    Object obj4 = null;
                    setRipple<? super parse> setripple = (setRipple) obj;
                    Throwable th = (Throwable) obj2;
                    if (i2 % 2 == 0) {
                        onExtraCallbackWithResult(setripple, th, (access13800) obj3);
                        obj4.hashCode();
                        throw null;
                    }
                    Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(setripple, th, (access13800) obj3);
                    int i3 = onNavigationEvent + 115;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnExtraCallbackWithResult;
                    }
                    obj4.hashCode();
                    throw null;
                }

                public final Object onExtraCallbackWithResult(setRipple<? super parse> setripple, Throwable th, access13800<? super Unit> access13800Var) throws Throwable {
                    int i = 2 % 2;
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$moduleName, this.$dialog, this.$continuation, this.$logParams, this.$context, access13800Var);
                    anonymousClass4.L$0 = th;
                    Object objInvokeSuspend = anonymousClass4.invokeSuspend(Unit.INSTANCE);
                    int i2 = IAuthTabCallback + 21;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return objInvokeSuspend;
                }

                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i = 2 % 2;
                    Throwable th = (Throwable) this.L$0;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    Object obj2 = null;
                    if (i2 != 0) {
                        int i3 = IAuthTabCallback;
                        int i4 = i3 + 63;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = i3 + 107;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        ResultKt.onNavigationEvent(obj);
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        if (!(!(th instanceof applyTransparentTitle.IAuthTabCallback))) {
                            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "DFM", "installWithProgressFlow canceled", access8100.onNavigationEvent(getWrite.IAuthTabCallback("module", this.$moduleName)), (String) null, false, (String) null, 56, (Object) null);
                            this.$dialog.dismiss();
                            if (this.$continuation.onNavigationEvent()) {
                                maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener = this.$continuation;
                                Result.Companion companion = Result.Companion;
                                mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(ResultKt.createFailure(th)));
                                int i8 = onNavigationEvent + 63;
                                IAuthTabCallback = i8 % 128;
                                int i9 = i8 % 2;
                            }
                            return Unit.INSTANCE;
                        }
                        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("DFM", "installWithProgressFlow failed", th, access8100.onNavigationEvent(getWrite.IAuthTabCallback("module", this.$moduleName)));
                        IAuthTabCallback.onNavigationEvent(DynamicFeatureModuleDownloader.Companion, this.$logParams, "fail");
                        BottomSheetHeader bottomSheetHeaderOnExtraCallback = DynamicFeatureModuleDownloader.onExtraCallback(this.$dialog);
                        if (bottomSheetHeaderOnExtraCallback != null) {
                            int i10 = IAuthTabCallback + 49;
                            onNavigationEvent = i10 % 128;
                            if (i10 % 2 == 0) {
                                bottomSheetHeaderOnExtraCallback.setDescription(this.$context.getString(R.string.dynamic_features_installation_error));
                                throw null;
                            }
                            bottomSheetHeaderOnExtraCallback.setDescription(this.$context.getString(R.string.dynamic_features_installation_error));
                        }
                        this.L$0 = th;
                        this.label = 1;
                        if (formatMsgs.onWarmupCompleted(2000L, this) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                    this.$dialog.dismiss();
                    if (this.$continuation.onNavigationEvent()) {
                        int i11 = onNavigationEvent + 53;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 != 0) {
                            maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener2 = this.$continuation;
                            Result.Companion companion2 = Result.Companion;
                            mayberemoveattachstatelistener2.resumeWith(Result.constructor-impl(ResultKt.createFailure(th)));
                            obj2.hashCode();
                            throw null;
                        }
                        maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener3 = this.$continuation;
                        Result.Companion companion3 = Result.Companion;
                        mayberemoveattachstatelistener3.resumeWith(Result.constructor-impl(ResultKt.createFailure(th)));
                    }
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader$IAuthTabCallback$onExtraCallback$3, reason: invalid class name */
            static final class AnonymousClass3 extends SuspendLambda implements Function2<parse, access13800<? super Unit>, Object> {
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;
                final /* synthetic */ Context $context;
                final /* synthetic */ maybeRemoveAttachStateListener<Unit> $continuation;
                final /* synthetic */ DynamicFeatureModuleDownloader $dialog;
                final /* synthetic */ Ref.ObjectRef<String> $lastLoggedStatus;
                final /* synthetic */ Map<String, Object> $logParams;
                final /* synthetic */ String $moduleName;
                float F$0;
                /* synthetic */ Object L$0;
                Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(Ref.ObjectRef<String> objectRef, String str, DynamicFeatureModuleDownloader dynamicFeatureModuleDownloader, Context context, Map<String, ? extends Object> map, maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener, access13800<? super AnonymousClass3> access13800Var) {
                    super(2, access13800Var);
                    this.$lastLoggedStatus = objectRef;
                    this.$moduleName = str;
                    this.$dialog = dynamicFeatureModuleDownloader;
                    this.$context = context;
                    this.$logParams = map;
                    this.$continuation = mayberemoveattachstatelistener;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$lastLoggedStatus, this.$moduleName, this.$dialog, this.$context, this.$logParams, this.$continuation, access13800Var);
                    anonymousClass3.L$0 = obj;
                    int i2 = onNavigationEvent + 123;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass3;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 35;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((parse) obj, (access13800) obj2);
                    int i4 = IAuthTabCallback + 57;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnExtraCallbackWithResult;
                }

                public final Object onExtraCallbackWithResult(parse parseVar, access13800<? super Unit> access13800Var) throws Throwable {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 103;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(parseVar, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onNavigationEvent + 103;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objInvokeSuspend;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i = 2 % 2;
                    parse parseVar = (parse) this.L$0;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        float fOnExtraCallbackWithResult = parseVar.onExtraCallbackWithResult();
                        String simpleName = Reflection.getOrCreateKotlinClass(parseVar.getClass()).getSimpleName();
                        if (!Intrinsics.areEqual(this.$lastLoggedStatus.element, simpleName)) {
                            int i3 = IAuthTabCallback + 43;
                            onNavigationEvent = i3 % 128;
                            int i4 = i3 % 2;
                            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "DFM", "installStateFlow", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("module", this.$moduleName), getWrite.IAuthTabCallback("status", simpleName), getWrite.IAuthTabCallback("progress", String.valueOf(fOnExtraCallbackWithResult))}), (String) null, false, (String) null, 56, (Object) null);
                            this.$lastLoggedStatus.element = simpleName;
                        }
                        if ((parseVar instanceof parse.onExtraCallback) || (parseVar instanceof parse.asInterface)) {
                            BottomSheetHeader bottomSheetHeaderOnExtraCallback = DynamicFeatureModuleDownloader.onExtraCallback(this.$dialog);
                            if (bottomSheetHeaderOnExtraCallback != null) {
                                bottomSheetHeaderOnExtraCallback.setDescription(MessageFormat.format(this.$context.getString(R.string.dynamic_features_progress_loading), access14000.onNavigationEvent((int) (fOnExtraCallbackWithResult * 100.0f))));
                            }
                        } else {
                            int i5 = IAuthTabCallback;
                            int i6 = i5 + 107;
                            onNavigationEvent = i6 % 128;
                            Object obj2 = null;
                            if (i6 % 2 != 0) {
                                boolean z = parseVar instanceof parse.asBinder;
                                obj2.hashCode();
                                throw null;
                            }
                            if (!(!(parseVar instanceof parse.asBinder))) {
                                IAuthTabCallback.onNavigationEvent(DynamicFeatureModuleDownloader.Companion, this.$logParams, "complete");
                                BottomSheetHeader bottomSheetHeaderOnExtraCallback2 = DynamicFeatureModuleDownloader.onExtraCallback(this.$dialog);
                                if (bottomSheetHeaderOnExtraCallback2 != null) {
                                    int i7 = onNavigationEvent + 11;
                                    IAuthTabCallback = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        bottomSheetHeaderOnExtraCallback2.setDescription(this.$context.getString(R.string.dynamic_features_progress_end));
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    bottomSheetHeaderOnExtraCallback2.setDescription(this.$context.getString(R.string.dynamic_features_progress_end));
                                }
                                this.$dialog.dismiss();
                                if (this.$continuation.onNavigationEvent()) {
                                    maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener = this.$continuation;
                                    Result.Companion companion = Result.Companion;
                                    mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(Unit.INSTANCE));
                                }
                            } else if (parseVar instanceof parse.IAuthTabCallback) {
                                int i8 = i5 + 113;
                                onNavigationEvent = i8 % 128;
                                if (i8 % 2 != 0) {
                                    IAuthTabCallback.onNavigationEvent(DynamicFeatureModuleDownloader.Companion, this.$logParams, "fail");
                                    DynamicFeatureModuleDownloader.onExtraCallback(this.$dialog);
                                    throw null;
                                }
                                IAuthTabCallback.onNavigationEvent(DynamicFeatureModuleDownloader.Companion, this.$logParams, "fail");
                                BottomSheetHeader bottomSheetHeaderOnExtraCallback3 = DynamicFeatureModuleDownloader.onExtraCallback(this.$dialog);
                                if (bottomSheetHeaderOnExtraCallback3 != null) {
                                    int i9 = onNavigationEvent + 85;
                                    IAuthTabCallback = i9 % 128;
                                    int i10 = i9 % 2;
                                    bottomSheetHeaderOnExtraCallback3.setDescription(this.$context.getString(R.string.dynamic_features_installation_error));
                                }
                                this.L$0 = parseVar;
                                this.L$1 = access15400.onNavigationEvent(simpleName);
                                this.F$0 = fOnExtraCallbackWithResult;
                                this.label = 1;
                                if (formatMsgs.onWarmupCompleted(2000L, this) == objOnWarmupCompleted) {
                                    int i11 = onNavigationEvent + 87;
                                    IAuthTabCallback = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        return objOnWarmupCompleted;
                                    }
                                    throw null;
                                }
                            } else if (parseVar instanceof parse.onWarmupCompleted) {
                                int i12 = i5 + 35;
                                onNavigationEvent = i12 % 128;
                                if (i12 % 2 != 0) {
                                    this.$dialog.dismiss();
                                    this.$continuation.onNavigationEvent();
                                    throw null;
                                }
                                this.$dialog.dismiss();
                                if (this.$continuation.onNavigationEvent()) {
                                    maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener2 = this.$continuation;
                                    Result.Companion companion2 = Result.Companion;
                                    mayberemoveattachstatelistener2.resumeWith(Result.constructor-impl(ResultKt.createFailure(new applyTransparentTitle.IAuthTabCallback())));
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i13 = IAuthTabCallback + 97;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    this.$dialog.dismiss();
                    if (this.$continuation.onNavigationEvent()) {
                        maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener3 = this.$continuation;
                        Result.Companion companion3 = Result.Companion;
                        parse.IAuthTabCallback iAuthTabCallback = (parse.IAuthTabCallback) parseVar;
                        mayberemoveattachstatelistener3.resumeWith(Result.constructor-impl(ResultKt.createFailure(new applyTransparentTitle.onExtraCallback(CollectionsKt.listOf(this.$moduleName), iAuthTabCallback.onNavigationEvent(), iAuthTabCallback.onWarmupCompleted()))));
                    }
                    return Unit.INSTANCE;
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onExtraCallback + 49;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i4 = onExtraCallback + 7;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    IAnimation<parse> iAnimationOnExtraCallback = IAuthTabCallback.onExtraCallback(DynamicFeatureModuleDownloader.Companion).onExtraCallback(this.$moduleName);
                    setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                    IAnimation iAnimationOnWarmupCompleted = ycxycx.onWarmupCompleted(ycxycx.onNavigationEvent(iAnimationOnExtraCallback, setCommandLine.onWarmupCompleted(5, setRevision.MINUTES)), new AnonymousClass4(this.$moduleName, this.$dialog, this.$continuation, this.$logParams, this.$context, null));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(objectRef, this.$moduleName, this.$dialog, this.$context, this.$logParams, this.$continuation, null);
                    this.L$0 = access15400.onNavigationEvent(objectRef);
                    this.label = 1;
                    if (ycxycx.onWarmupCompleted(iAnimationOnWarmupCompleted, anonymousClass3, this) == objOnWarmupCompleted) {
                        int i6 = onExtraCallback + 105;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i8 = onWarmupCompleted + 35;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 69 / 0;
                }
                return unit;
            }
        }

        static final class onWarmupCompleted implements Function1<Throwable, Unit> {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            final /* synthetic */ DynamicFeatureModuleDownloader IAuthTabCallback;

            onWarmupCompleted(DynamicFeatureModuleDownloader dynamicFeatureModuleDownloader) {
                this.IAuthTabCallback = dynamicFeatureModuleDownloader;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 53;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult((Throwable) obj);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    int i4 = 83 / 0;
                }
                return unit;
            }

            public final void onExtraCallbackWithResult(Throwable th) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 81;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    this.IAuthTabCallback.dismiss();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                this.IAuthTabCallback.dismiss();
                int i3 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            }
        }

        static final class onNavigationEvent implements Function1<SetDetectableSize, Unit> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ Map<String, Object> onExtraCallback;

            onNavigationEvent(Map<String, ? extends Object> map) {
                this.onExtraCallback = map;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted((SetDetectableSize) obj);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    return unit;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public final void onWarmupCompleted(SetDetectableSize setDetectableSize) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 97;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setDetectableSize, "");
                    setDetectableSize.onExtraCallback(this.onExtraCallback);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback(this.onExtraCallback);
                int i3 = IAuthTabCallback + 107;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 75 / 0;
                }
            }
        }

        public final Object IAuthTabCallback(@NotNull Context context, @NotNull String str, @NotNull String str2, @Nullable Map<String, ? extends Object> map, @NotNull access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!(!onNavigationEvent().onWarmupCompleted(str))) {
                return Unit.INSTANCE;
            }
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = context instanceof TextFieldScrollKtExternalSyntheticLambda0 ? (TextFieldScrollKtExternalSyntheticLambda0) context : null;
            final TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = textFieldScrollKtExternalSyntheticLambda0 != null ? TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0) : null;
            DynamicFeatureModuleDownloader dynamicFeatureModuleDownloader = new DynamicFeatureModuleDownloader(context, str, str2, new Function0() { // from class: im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader$Companion$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 33;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0 = textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
                    if (i6 != 0) {
                        return DynamicFeatureModuleDownloader.IAuthTabCallback.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0);
                    }
                    DynamicFeatureModuleDownloader.IAuthTabCallback.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            setResourceInternal setresourceinternal = new setResourceInternal(access14300.onWarmupCompleted(access13800Var), 1);
            setresourceinternal.onTransact();
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(str, dynamicFeatureModuleDownloader, setresourceinternal, map, context, null), 3, (Object) null);
            }
            setresourceinternal.IAuthTabCallback(new onWarmupCompleted(dynamicFeatureModuleDownloader));
            if (map != null) {
                ((Boolean) ConvertFloatArrayToByteArray.IAuthTabCallback(-102207491, zzgc.onExtraCallbackWithResult(), 102207492, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5212418L, false, null, null, new onNavigationEvent(map), 14, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult())).booleanValue();
                int i4 = onExtraCallbackWithResult + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
            dynamicFeatureModuleDownloader.show();
            Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
            if (objIAuthTabCallbackDefault == access14300.onWarmupCompleted()) {
                access14600.IAuthTabCallback(access13800Var);
            }
            if (objIAuthTabCallbackDefault != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i6 = onWarmupCompleted;
            int i7 = i6 + 85;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            int i8 = i6 + 69;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return objIAuthTabCallbackDefault;
        }

        private final void onNavigationEvent(Map<String, ? extends Object> map, String str) {
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            onExtraCallbackWithResult(1433571950, new Object[]{this, map, str}, -1433571950, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        }

        private static final Unit onWarmupCompleted(TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0) {
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            return (Unit) onExtraCallbackWithResult(-1668603021, new Object[]{textFieldPressGestureFilterKtExternalSyntheticLambda0}, 1668603022, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        }
    }

    static {
        onNavigationEvent();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.dynamicfeature.feature.DynamicFeatureModuleDownloader$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 121;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                applyTransparentTitle applytransparenttitleIAuthTabCallback = DynamicFeatureModuleDownloader.IAuthTabCallback();
                int i4 = onNavigationEvent + 65;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return applytransparenttitleIAuthTabCallback;
            }
        });
        int i = access000 + 99;
        getInterfaceDescriptor = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static final applyTransparentTitle onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        applyTransparentTitle applytransparenttitleICustomTabsCallbackStub = ((applyTransparentTitle.onNavigationEvent) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), applyTransparentTitle.onNavigationEvent.class)).ICustomTabsCallbackStub();
        int i4 = asBinder + 89;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return applytransparenttitleICustomTabsCallbackStub;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallbackDefault;
        char c = '0';
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.lastIndexOf("", c) + 27, 23139 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    c = '0';
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
        Object[] objArr3 = {Integer.valueOf(asInterface)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        long j = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25, 23139 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $11 + 43;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                i2 = i + 55;
                cArr4[i2] = (char) (cArr[i2] * b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i6 = $11 + 53;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i8 = $11 + 71;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1))), 74 - KeyEvent.keyCodeFromString(""), 8089 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i9 = $11 + 43;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30, 19487 - TextUtils.lastIndexOf("", '0'), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            } else {
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
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
                j = 0;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            i16++;
            int i17 = $11 + 43;
            $10 = i17 % 128;
            int i18 = i17 % 2;
        }
        String str = new String(cArr4);
        int i19 = $10 + 27;
        $11 = i19 % 128;
        int i20 = i19 % 2;
        objArr[0] = str;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsBottomCtaV1View tdsBottomCtaV1View, DynamicFeatureModuleDownloader dynamicFeatureModuleDownloader, View view) {
        return (Unit) onWarmupCompleted(-651373118, new Object[]{tdsBottomCtaV1View, dynamicFeatureModuleDownloader, view}, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 651373118, PushInfo.Companion.onExtraCallback());
    }

    public static final /* synthetic */ Lazy onExtraCallback() {
        return (Lazy) onWarmupCompleted(-1452028519, new Object[0], PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1452028520, PushInfo.Companion.onExtraCallback());
    }

    static void onNavigationEvent() {
        IAuthTabCallbackDefault = new char[]{64925, 64988, 64987, 64986, 64926, 64991, 64989, 64982, 64983, 64912, 64980, 64924, 64976, 64905, 64990, 64960, 64985, 64913, 64984, 64927, 64963, 64978, 64896, 64967, 64970};
        asInterface = (char) 51244;
    }
}

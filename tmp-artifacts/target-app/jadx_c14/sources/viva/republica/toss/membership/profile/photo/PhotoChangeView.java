package viva.republica.toss.membership.profile.photo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.gson.Gson;
import im.toss.base.BaseActivity;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.utils.RxUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.rx2.RxSingleKt;
import o.AdSettingsIntegrationErrorMode;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.IconRoundCornerProgressBarSavedState;
import o.NetConverter3;
import o.PlayerErrorCode;
import o.Plugin;
import o.ProducerSequenceFactoryExternalSyntheticLambda4;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.RememberObserver;
import o.RequestLoggingListenerCompanion;
import o.SetDetectableSize;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.TitleBarRightButtonView;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.clearTestDevices;
import o.deserializeUriNullableCollection;
import o.findRes;
import o.findResAndMsg;
import o.getNightColor;
import o.getPackageType;
import o.getTypedExportedConstants;
import o.getUrlPrefix;
import o.isNeedUnzip;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setMessageBytes;
import o.setRandomHost;
import o.switchToLightTheme;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;
import viva.republica.toss.R;
import viva.republica.toss.membership.profile.photo.PhotoChangeView$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PhotoChangeView extends FrameLayout {
    private final TdsBottomCtaV1View IAuthTabCallback;
    private final View.OnClickListener IAuthTabCallbackDefault;
    private final ViewPager IAuthTabCallbackStub;
    private final findResAndMsg asBinder;
    private final TdsImageView asInterface;
    private final ScrollingPagerIndicator onExtraCallback;
    private getTypedExportedConstants onExtraCallbackWithResult;
    private final getUrlPrefix onNavigationEvent;
    private String onTransact;
    private final BottomSheetHeader onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoChangeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoChangeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoChangeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onTransact = "";
        this.onNavigationEvent = new getUrlPrefix();
        findResAndMsg findresandmsgOnWarmupCompleted = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.onExtraCallback().onExtraCallback()));
        this.asBinder = findresandmsgOnWarmupCompleted;
        View.inflate(context, R.layout.view_photo_change, this);
        BottomSheetHeader bottomSheetHeaderFindViewById = findViewById(R.id.headerText);
        Intrinsics.checkNotNullExpressionValue(bottomSheetHeaderFindViewById, "");
        this.onWarmupCompleted = bottomSheetHeaderFindViewById;
        TdsImageView tdsImageViewFindViewById = findViewById(R.id.profileImageView);
        Intrinsics.checkNotNullExpressionValue(tdsImageViewFindViewById, "");
        this.asInterface = tdsImageViewFindViewById;
        TdsBottomCtaV1View tdsBottomCtaV1ViewFindViewById = findViewById(R.id.bottomCta);
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1ViewFindViewById, "");
        this.IAuthTabCallback = tdsBottomCtaV1ViewFindViewById;
        ViewPager viewPagerFindViewById = findViewById(R.id.panelPager);
        Intrinsics.checkNotNullExpressionValue(viewPagerFindViewById, "");
        this.IAuthTabCallbackStub = viewPagerFindViewById;
        ScrollingPagerIndicator scrollingPagerIndicatorFindViewById = findViewById(R.id.listIndicator);
        Intrinsics.checkNotNullExpressionValue(scrollingPagerIndicatorFindViewById, "");
        this.onExtraCallback = scrollingPagerIndicatorFindViewById;
        this.IAuthTabCallbackDefault = new PhotoChangeView$.ExternalSyntheticLambda1(context, this);
        maybeUpdateAnimatable.onNavigationEvent(findresandmsgOnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(null), 3, (Object) null);
    }

    public /* synthetic */ PhotoChangeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(Context context, PhotoChangeView photoChangeView, View view) {
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        if (baseActivity != null) {
            photoChangeView.IAuthTabCallback.asInterface().setLoading(true);
            if (photoChangeView.onTransact.length() == 0) {
                writeRaw writerawOnWarmupCompleted = RxSingleKt.IAuthTabCallback((CoroutineContext) null, new onWarmupCompleted(context, null), 1, (Object) null).IAuthTabCallback(NetConverter3.onExtraCallback()).onWarmupCompleted(new PhotoChangeView$.ExternalSyntheticLambda3(photoChangeView, baseActivity));
                Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
                setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new PhotoChangeView$.ExternalSyntheticLambda4(), new PhotoChangeView$.ExternalSyntheticLambda5());
            } else {
                if (StringsKt.contains$default(photoChangeView.onTransact, "illusts", false, 2, (Object) null)) {
                    writeRaw writerawIAuthTabCallback = switchToLightTheme.Companion.onWarmupCompleted(context).menuHostHelperlambda0().IAuthTabCallback(photoChangeView.onTransact, true).onWarmupCompleted(new PhotoChangeView$.ExternalSyntheticLambda7(new PhotoChangeView$.ExternalSyntheticLambda6(photoChangeView))).IAuthTabCallback(NetConverter3.onExtraCallback());
                    Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                    IconRoundCornerProgressBarSavedState.IAuthTabCallback(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new PhotoChangeView$.ExternalSyntheticLambda8(photoChangeView), new PhotoChangeView$.ExternalSyntheticLambda9(photoChangeView, baseActivity)), context instanceof r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ ? (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) context : null);
                    return;
                }
                CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context).onWarmupCompleted(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(photoChangeView.onTransact).IAuthTabCallback(new onNavigationEvent(context, baseActivity, photoChangeView)).onExtraCallbackWithResult());
            }
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends Unit>>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Context context, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onWarmupCompleted(this.$context, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Result<Unit>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                getNightColor getnightcolorMenuHostHelperlambda0 = switchToLightTheme.Companion.onWarmupCompleted(this.$context).menuHostHelperlambda0();
                this.label = 1;
                objOnExtraCallback = getnightcolorMenuHostHelperlambda0.onExtraCallback(this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = ((Result) obj).onNavigationEvent();
            }
            return Result.IAuthTabCallback(objOnExtraCallback);
        }
    }

    public static void onWarmupCompleted(PhotoChangeView photoChangeView, BaseActivity baseActivity) {
        photoChangeView.IAuthTabCallback.asInterface().setLoading(false);
        baseActivity.setResult(-1);
        getTypedExportedConstants gettypedexportedconstants = photoChangeView.onExtraCallbackWithResult;
        if (gettypedexportedconstants != null) {
            gettypedexportedconstants.dismiss();
        }
    }

    public static Unit onWarmupCompleted(Result result) {
        TitleBarRightButtonView.onExtraCallback.onWarmupCompleted("");
        return Unit.INSTANCE;
    }

    public static Unit onNavigationEvent(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static Pair onExtraCallbackWithResult(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public static Pair onWarmupCompleted(PhotoChangeView photoChangeView, Result result) {
        return new Pair(photoChangeView.onTransact, result);
    }

    public static Unit IAuthTabCallback(PhotoChangeView photoChangeView, BaseActivity baseActivity, Pair pair) {
        photoChangeView.IAuthTabCallback.asInterface().setLoading(false);
        TitleBarRightButtonView.onExtraCallback.onWarmupCompleted((String) pair.getFirst());
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1008845L, false, (String) null, (Map) null, new PhotoChangeView$.ExternalSyntheticLambda2(pair), 14, (Object) null);
        baseActivity.setResult(-1);
        getTypedExportedConstants gettypedexportedconstants = photoChangeView.onExtraCallbackWithResult;
        if (gettypedexportedconstants != null) {
            gettypedexportedconstants.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static Unit onWarmupCompleted(Pair pair, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("picture", "N");
        setDetectableSize.onExtraCallback("profile_emoji_url", pair.getFirst());
        return Unit.INSTANCE;
    }

    public static Unit onExtraCallback(PhotoChangeView photoChangeView, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        photoChangeView.IAuthTabCallback.asInterface().setLoading(false);
        return Unit.INSTANCE;
    }

    /* renamed from: viva.republica.toss.membership.profile.photo.PhotoChangeView$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static short[] onExtraCallback;
        Object L$0;
        int label;
        private static final byte[] $$a = {126, 1, 26, -71};
        private static final int $$b = 119;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int IAuthTabCallback = 101356226;
        private static int onNavigationEvent = -1538795472;
        private static int onWarmupCompleted = -2141849852;
        private static byte[] onExtraCallbackWithResult = {9, -65, -72, 4, -113, -65, 69, -70, -68, 0, -114, -65, 69, 69, -79, -69, 68, 7, -115, -76, 87, -76, 75, -68, -77, 84, -69, 115, -6, -71, 73, -76, 70, 84, 116, -124, 66, 125, -3, 70, 66, -67, 0, -115, -68, -77, 85, -85, 71, 2, 70, -77, -127, 69, -70, 70, 74};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r6, short r7, byte r8) {
            /*
                int r8 = r8 * 4
                int r8 = r8 + 115
                int r7 = r7 * 2
                int r7 = r7 + 1
                int r6 = r6 * 3
                int r6 = 3 - r6
                byte[] r0 = viva.republica.toss.membership.profile.photo.PhotoChangeView.AnonymousClass4.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r7
                goto L29
            L17:
                r3 = r2
            L18:
                int r6 = r6 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L27:
                r3 = r0[r6]
            L29:
                int r8 = r8 + r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.membership.profile.photo.PhotoChangeView.AnonymousClass4.$$c(short, short, byte):java.lang.String");
        }

        AnonymousClass4(access13800<? super AnonymousClass4> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass4 anonymousClass4 = PhotoChangeView.this.new AnonymousClass4(access13800Var);
            int i2 = asInterface + 89;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return anonymousClass4;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 123;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallbackStub + 15;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 47;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            AnonymousClass4 anonymousClass4Create = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                anonymousClass4Create.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = anonymousClass4Create.invokeSuspend(unit);
            int i4 = asInterface + 37;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.membership.profile.photo.PhotoChangeView.AnonymousClass4.IAuthTabCallbackStub
                int r1 = r1 + 113
                int r2 = r1 % 128
                viva.republica.toss.membership.profile.photo.PhotoChangeView.AnonymousClass4.asInterface = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 != 0) goto Lb3
                java.lang.Object r1 = o.access14300.onWarmupCompleted()
                int r3 = r11.label
                r4 = 1
                if (r3 == 0) goto L33
                int r1 = viva.republica.toss.membership.profile.photo.PhotoChangeView.AnonymousClass4.IAuthTabCallbackStub
                int r1 = r1 + 101
                int r5 = r1 % 128
                viva.republica.toss.membership.profile.photo.PhotoChangeView.AnonymousClass4.asInterface = r5
                int r1 = r1 % r0
                if (r3 != r4) goto L2b
                java.lang.Object r1 = r11.L$0
                viva.republica.toss.membership.profile.photo.PhotoChangeView r1 = (viva.republica.toss.membership.profile.photo.PhotoChangeView) r1
                kotlin.ResultKt.onNavigationEvent(r12)
                goto L4f
            L2b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L33:
                kotlin.ResultKt.onNavigationEvent(r12)
                viva.republica.toss.membership.profile.photo.PhotoChangeView r12 = viva.republica.toss.membership.profile.photo.PhotoChangeView.this
                o.TitleBarRightButtonView r3 = o.TitleBarRightButtonView.onExtraCallback
                java.lang.String r5 = o.PlayerErrorCode.onMinimized()
                long r5 = java.lang.Long.parseLong(r5)
                r11.L$0 = r12
                r11.label = r4
                java.lang.Object r3 = r3.onExtraCallbackWithResult(r5, r11)
                if (r3 != r1) goto L4d
                return r1
            L4d:
                r1 = r12
                r12 = r3
            L4f:
                java.lang.String r12 = (java.lang.String) r12
                if (r12 == 0) goto L69
                int r3 = viva.republica.toss.membership.profile.photo.PhotoChangeView.AnonymousClass4.IAuthTabCallbackStub
                int r3 = r3 + 69
                int r5 = r3 % 128
                viva.republica.toss.membership.profile.photo.PhotoChangeView.AnonymousClass4.asInterface = r5
                int r3 = r3 % r0
                if (r3 != 0) goto L65
                int r0 = r12.length()
                if (r0 != 0) goto La8
                goto L69
            L65:
                r12.length()
                throw r2
            L69:
                int r12 = android.view.ViewConfiguration.getKeyRepeatDelay()
                int r12 = r12 >> 16
                short r5 = (short) r12
                java.lang.String r12 = ""
                r0 = 0
                int r12 = android.text.TextUtils.getCapsMode(r12, r0, r0)
                int r12 = 78 - r12
                byte r6 = (byte) r12
                int r12 = android.view.ViewConfiguration.getTapTimeout()
                int r12 = r12 >> 16
                r2 = 1571992886(0x5db2b536, float:1.6096573E18)
                int r7 = r2 - r12
                int r12 = android.view.ViewConfiguration.getWindowTouchSlop()
                int r12 = r12 >> 8
                r2 = -605171364(0xffffffffdbedd15c, float:-1.33879525E17)
                int r8 = r12 + r2
                long r2 = android.widget.ExpandableListView.getPackedPositionForChild(r0, r0)
                r9 = 0
                int r12 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                int r9 = r12 + (-56)
                java.lang.Object[] r12 = new java.lang.Object[r4]
                r10 = r12
                a(r5, r6, r7, r8, r9, r10)
                r12 = r12[r0]
                java.lang.String r12 = (java.lang.String) r12
                java.lang.String r12 = r12.intern()
            La8:
                viva.republica.toss.membership.profile.photo.PhotoChangeView.onExtraCallbackWithResult(r1, r12)
                viva.republica.toss.membership.profile.photo.PhotoChangeView r12 = viva.republica.toss.membership.profile.photo.PhotoChangeView.this
                viva.republica.toss.membership.profile.photo.PhotoChangeView.onNavigationEvent(r12)
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            Lb3:
                o.access14300.onWarmupCompleted()
                r2.hashCode()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.membership.profile.photo.PhotoChangeView.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5;
            int i6 = 2;
            int i7 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 42, TextUtils.lastIndexOf("", '0', 0) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                boolean z = !(iIntValue != -1);
                float f = 0.0f;
                long j = 0;
                if (z) {
                    int i8 = $10 + 91;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    byte[] bArr = onExtraCallbackWithResult;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i10 = 0;
                        while (i10 < length) {
                            int i11 = $11 + 113;
                            $10 = i11 % 128;
                            if (i11 % i6 != 0) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12843);
                                    int i12 = 56 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                                    int i13 = (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 2167;
                                    byte b2 = (byte) ($$a[1] - 1);
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, i12, i13, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i10 >>= 1;
                            } else {
                                Object[] objArr4 = {Integer.valueOf(bArr[i10])};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback3 == null) {
                                    char c = (char) (12844 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                    int iLastIndexOf = 54 - TextUtils.lastIndexOf("", '0');
                                    int iRed = 2167 - Color.red(0);
                                    byte b4 = (byte) ($$a[1] - 1);
                                    byte b5 = b4;
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c, iLastIndexOf, iRed, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr2[i10] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                                i10++;
                            }
                            i6 = 2;
                            f = 0.0f;
                            j = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = onExtraCallbackWithResult;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 43424), (ViewConfiguration.getLongPressTimeout() >> 16) + 42, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (onExtraCallback[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    int i14 = $11;
                    int i15 = i14 + 13;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                    if (z) {
                        int i18 = i14 + 15;
                        int i19 = i18 % 128;
                        $10 = i19;
                        int i20 = i18 % 2;
                        int i21 = i19 + 51;
                        $11 = i21 % 128;
                        int i22 = i21 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i17 + i4;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), Drawable.resolveOpacity(0, 0) + 86, ExpandableListView.getPackedPositionType(0L) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallbackWithResult;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i23 = 0;
                        while (i23 < length2) {
                            int i24 = $10;
                            int i25 = i24 + 13;
                            $11 = i25 % 128;
                            int i26 = i25 % 2;
                            bArr5[i23] = (byte) (bArr4[i23] ^ (-4629411779493505016L));
                            i23++;
                            int i27 = i24 + 19;
                            $11 = i27 % 128;
                            int i28 = i27 % 2;
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            int i29 = $10 + 111;
                            $11 = i29 % 128;
                            if (i29 % 2 == 0) {
                                byte[] bArr6 = onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent % 1;
                                i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback - (((byte) (((byte) (bArr6[r8] - 4629411779493505016L)) >>> s)) ^ b);
                            } else {
                                byte[] bArr7 = onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b);
                            }
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i5;
                        } else {
                            short[] sArr = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        findRes.onExtraCallbackWithResult(this.asBinder, (CancellationException) null, 1, (Object) null);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IAuthTabCallback() {
        String string;
        TdsBottomCtaV1View.setCta$default(this.IAuthTabCallback, R.string.save, this.IAuthTabCallbackDefault, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        TdsBottomCtaV1View tdsBottomCtaV1View = this.IAuthTabCallback;
        String string2 = getContext().getString(R.string.profile_cta_secondary_title);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1View, string2, new PhotoChangeView$.ExternalSyntheticLambda0(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        this.IAuthTabCallback.setEnabledCta(false);
        ((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this.IAuthTabCallback}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setEnabled(this.onTransact.length() > 0);
        BottomSheetHeader bottomSheetHeader = this.onWarmupCompleted;
        if (this.onTransact.length() == 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string3 = getContext().getString(R.string.profile_change_title);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            string = String.format(string3, Arrays.copyOf(new Object[]{PlayerErrorCode.onPostMessage()}, 1));
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else {
            string = getContext().getString(R.string.profile_change_title_empty);
            Intrinsics.checkNotNull(string);
        }
        bottomSheetHeader.setTitle(string);
        TdsImageView tdsImageView = this.asInterface;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsImageView.setImage$default(tdsImageView, RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(this.onTransact).onExtraCallbackWithResult(RememberObserver.FIT), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new Plugin(0.0f, 0.0f, 0.0f, 0, 0, 31, (DefaultConstructorMarker) null)}), (Function1) null, (Function1) null, 6, (Object) null);
        this.onWarmupCompleted.setShowCloseIcon(false);
        this.IAuthTabCallbackStub.setAdapter(this.onNavigationEvent);
        this.onExtraCallback.onWarmupCompleted(this.IAuthTabCallbackStub);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(PhotoChangeView photoChangeView, View view) {
        photoChangeView.onTransact = "";
        photoChangeView.asInterface.setImageResource(im.toss.core.R.drawable.img_profile_default_alt);
        photoChangeView.IAuthTabCallback.setEnabledCta(true);
        Object[] objArr = {photoChangeView.IAuthTabCallback};
        ((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setEnabled(photoChangeView.onTransact.length() > 0);
    }

    public final void setEmojiList(@NotNull Function1<? super clearTestDevices, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        onExtraCallbackWithResult((Function1<? super List<ProducerSequenceFactoryExternalSyntheticLambda4>, Unit>) new PhotoChangeView$.ExternalSyntheticLambda10(this, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(PhotoChangeView photoChangeView, Function1 function1, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<ProducerSequenceFactoryExternalSyntheticLambda4> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ProducerSequenceFactoryExternalSyntheticLambda4 producerSequenceFactoryExternalSyntheticLambda4 : list2) {
            arrayList.add(new clearTestDevices(producerSequenceFactoryExternalSyntheticLambda4.onExtraCallback(), producerSequenceFactoryExternalSyntheticLambda4.onExtraCallbackWithResult(), false, false, 12, null));
        }
        photoChangeView.onNavigationEvent.onExtraCallbackWithResult(CollectionsKt.toMutableList(arrayList), function1);
        return Unit.INSTANCE;
    }

    public final void IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onTransact = str;
        TdsImageView tdsImageView = this.asInterface;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsImageView.setImage$default(tdsImageView, RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(this.onTransact).onExtraCallbackWithResult(RememberObserver.FIT), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new Plugin(0.0f, 0.0f, 0.0f, 0, 0, 31, (DefaultConstructorMarker) null)}), (Function1) null, (Function1) null, 6, (Object) null);
        this.IAuthTabCallback.setEnabledCta(true);
        ((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this.IAuthTabCallback}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setEnabled(str.length() > 0);
    }

    public final void setDialog(@Nullable getTypedExportedConstants gettypedexportedconstants) {
        this.onExtraCallbackWithResult = gettypedexportedconstants;
    }

    private final void onExtraCallbackWithResult(Function1<? super List<ProducerSequenceFactoryExternalSyntheticLambda4>, Unit> function1) {
        writeRaw writerawIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.asBinder().onExtraCallbackWithResult().IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new PhotoChangeView$.ExternalSyntheticLambda12(new PhotoChangeView$.ExternalSyntheticLambda11(this, function1)), new PhotoChangeView$.ExternalSyntheticLambda14(new PhotoChangeView$.ExternalSyntheticLambda13(this, function1)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        Context context = getContext();
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnNavigationEvent, context instanceof r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ ? (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) context : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(PhotoChangeView photoChangeView, Function1 function1, Response response) throws IOException {
        List<ProducerSequenceFactoryExternalSyntheticLambda4> listOnExtraCallbackWithResult;
        if (response.onExtraCallbackWithResult()) {
            RequestLoggingListenerCompanion requestLoggingListenerCompanion = (RequestLoggingListenerCompanion) response.onExtraCallback();
            listOnExtraCallbackWithResult = requestLoggingListenerCompanion != null ? requestLoggingListenerCompanion.onWarmupCompleted() : null;
            if (listOnExtraCallbackWithResult == null) {
                listOnExtraCallbackWithResult = CollectionsKt.emptyList();
            }
        } else {
            Context context = photoChangeView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            listOnExtraCallbackWithResult = photoChangeView.onExtraCallbackWithResult(context);
        }
        function1.invoke(listOnExtraCallbackWithResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(PhotoChangeView photoChangeView, Function1 function1, Throwable th) {
        Context context = photoChangeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        function1.invoke(photoChangeView.onExtraCallbackWithResult(context));
        return Unit.INSTANCE;
    }

    private final List<ProducerSequenceFactoryExternalSyntheticLambda4> onExtraCallbackWithResult(Context context) throws IOException {
        try {
            InputStream inputStreamOpen = context.getAssets().open("profile_emojis.json");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                return ((RequestLoggingListenerCompanion) new Gson().fromJson(text, RequestLoggingListenerCompanion.class)).onWarmupCompleted();
            } finally {
            }
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }
}

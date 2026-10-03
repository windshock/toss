package o;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.gson.annotations.Expose;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.base.BaseActivity;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.uikit.widget.textField.BaseEditText;
import im.toss.uikit.widget.textField.TextField;
import im.toss.uikit.widget.textField.TextFieldLine;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.ContentHints;
import o.SetDetectableSize;
import o.createMediaViewVideoRendererApi;
import o.initMiniApp;
import o.shouldBeKeptAsChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ContentHints extends isSignaturePolicyImplied implements getSigPolicyId, RequireInput {
    public static final onWarmupCompleted Companion;
    private static char IAuthTabCallback_Parcel;
    private static int access100;
    private static int asBinder;
    private static long onTransact;
    public static final int onWarmupCompleted;
    private final TypographyKtExternalSyntheticLambda0 IAuthTabCallback;
    private final getDigestAlgorithms<?> IAuthTabCallbackDefault;
    private getSigPolicyId IAuthTabCallbackStub;
    private final CardIssueOverviewViewModel asInterface;

    @Expose
    private String inputValue;
    private final createMediaViewVideoRendererApi onExtraCallback;
    private EditText onExtraCallbackWithResult;
    private final Context onNavigationEvent;
    private static final byte[] $$a = {108, -1, -36, 99};
    private static final int $$b = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[createMediaViewVideoRendererApi.IAuthTabCallback.values().length];
            try {
                iArr[createMediaViewVideoRendererApi.IAuthTabCallback.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[createMediaViewVideoRendererApi.IAuthTabCallback.BIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[createMediaViewVideoRendererApi.IAuthTabCallback.BIG_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[createMediaViewVideoRendererApi.IAuthTabCallback.LINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr;
            int[] iArr2 = new int[createMediaViewVideoRendererApi.onWarmupCompleted.values().length];
            try {
                iArr2[createMediaViewVideoRendererApi.onWarmupCompleted.CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            onNavigationEvent = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, short r8) {
        /*
            byte[] r0 = o.ContentHints.$$a
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r6 = 110 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ContentHints.$$c(int, short, short):java.lang.String");
    }

    static {
        access100 = 1;
        IAuthTabCallbackStub();
        Companion = new onWarmupCompleted(null);
        onWarmupCompleted = 8;
        int i = getInterfaceDescriptor + 65;
        access100 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ContentHints contentHints = (ContentHints) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(contentHints, view);
        int i4 = IAuthTabCallbackStubProxy + 5;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void IAuthTabCallback(ContentHints contentHints, TdsButtonV1View tdsButtonV1View, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(contentHints, tdsButtonV1View, view);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = i4 | i2;
        int i8 = ~((~i2) | i4);
        int i9 = ~i4;
        int i10 = i8 | (~(i9 | i5 | i2));
        int i11 = (~(i2 | i9)) | i5;
        int i12 = i4 + i5 + i3 + (2127773517 * i) + (1026174006 * i6);
        int i13 = i12 * i12;
        int i14 = (i4 * (-484454144)) + 743702528 + ((-484454144) * i5) + (i7 * (-1605095679)) + (1605095679 * i10) + ((-1605095679) * i11) + ((-2089549824) * i3) + (367263744 * i) + ((-1434976256) * i6) + (1105526784 * i13);
        int i15 = (i4 * 21308160) + 1622758390 + (i5 * 21308160) + (i7 * 947) + (i10 * (-947)) + (i11 * 947) + (i3 * 21309107) + (i * 1708896471) + (i6 * 664464834) + (i13 * 287244288);
        switch (i14 + (i15 * i15 * 966983680)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                final ContentHints contentHints = (ContentHints) objArr[0];
                int i16 = 2 % 2;
                BaseActivity baseActivityOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(contentHints.onNavigationEvent);
                Intrinsics.checkNotNull(baseActivityOnWarmupCompleted);
                getByteBuffer getbytebufferOnExtraCallbackWithResult = new RxPermissions(baseActivityOnWarmupCompleted).onExtraCallbackWithResult(new String[]{"android.permission.READ_CONTACTS"});
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.InputView$$ExternalSyntheticLambda5
                    public final Object invoke(Object obj) {
                        return ContentHints.onExtraCallback(this.f$0, (shouldBeKeptAsChild) obj);
                    }
                };
                deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.InputView$$ExternalSyntheticLambda6
                    public final void accept(Object obj) {
                        ContentHints.onExtraCallbackWithResult(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.InputView$$ExternalSyntheticLambda7
                    public final Object invoke(Object obj) {
                        return ContentHints.onNavigationEvent((Throwable) obj);
                    }
                };
                getbytebufferOnExtraCallbackWithResult.onExtraCallbackWithResult(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.InputView$$ExternalSyntheticLambda8
                    public final void accept(Object obj) {
                        ContentHints.onNavigationEvent(function12, obj);
                    }
                });
                int i17 = access000 + 33;
                IAuthTabCallbackStubProxy = i17 % 128;
                int i18 = i17 % 2;
                return null;
            case 2:
                ContentHints contentHints2 = (ContentHints) objArr[0];
                TdsButtonV1View tdsButtonV1View = (TdsButtonV1View) objArr[1];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
                int i19 = 2 % 2;
                int i20 = IAuthTabCallbackStubProxy + 37;
                access000 = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback("card_id", contentHints2.asInterface.IAuthTabCallbackStub());
                setDetectableSize.onExtraCallback("session_id", contentHints2.asInterface.ICustomTabsCallbackStubProxy());
                setDetectableSize.onExtraCallback("funnel_id", contentHints2.asInterface.getInterfaceDescriptor());
                setDetectableSize.onExtraCallback("screen_type", ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{contentHints2.IAuthTabCallbackDefault}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).onExtraCallback());
                Object[] objArr2 = new Object[1];
                a((char) (23001 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), View.MeasureSpec.getMode(0) + 1067987207, new char[]{37275, 45892, 27185, 60196, 38353}, new char[]{0, 0, 0, 0}, new char[]{1844, 43057, 55615, 62809}, objArr2);
                setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), tdsButtonV1View.getContext().getString(R.string.app_card_issue_free_form_input_email_prefill_button_title));
                Unit unit = Unit.INSTANCE;
                int i22 = IAuthTabCallbackStubProxy + 117;
                access000 = i22 % 128;
                int i23 = i22 % 2;
                return unit;
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return onNavigationEvent(objArr);
            case 7:
                return onTransact(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(ContentHints contentHints, shouldBeKeptAsChild shouldbekeptaschild) {
        int i = 2 % 2;
        int i2 = access000 + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(contentHints, shouldbekeptaschild);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(contentHints, shouldbekeptaschild);
        int i3 = access000 + 37;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallback(ContentHints contentHints) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{contentHints}, -1104564424, 1104564427, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        int i4 = IAuthTabCallbackStubProxy + 43;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean onExtraCallback(ContentHints contentHints, TextFieldLine textFieldLine, TextView textView, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 63;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {contentHints, textFieldLine, textView, Integer.valueOf(i), keyEvent};
        boolean zBooleanValue = ((Boolean) onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr, 1675167957, -1675167950, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult())).booleanValue();
        int i5 = access000 + 27;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 69;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(th);
        int i4 = IAuthTabCallbackStubProxy + 63;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(ContentHints contentHints, TdsButtonV1View tdsButtonV1View, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{contentHints, tdsButtonV1View, setDetectableSize}, -605344829, 605344831, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        int i4 = IAuthTabCallbackStubProxy + 95;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access000 + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(gettypedexportedconstants, view);
        int i4 = access000 + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsBottomCtaV1View tdsBottomCtaV1View, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(tdsBottomCtaV1View, gettypedexportedconstants, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(tdsBottomCtaV1View, gettypedexportedconstants, view);
        int i3 = IAuthTabCallbackStubProxy + 115;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ boolean onWarmupCompleted(ContentHints contentHints, TextField textField, TextView textView, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = access000 + 81;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(contentHints, textField, textView, i, keyEvent);
        }
        onExtraCallback(contentHints, textField, textView, i, keyEvent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onTransact(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asInterface implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final asInterface onExtraCallbackWithResult = new asInterface();

        public final void onExtraCallbackWithResult(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c A[PHI: r9
      0x002c: PHI (r9v16 java.lang.String) = (r9v9 java.lang.String), (r9v11 java.lang.String), (r9v1 java.lang.String) binds: [B:19:0x008e, B:16:0x006b, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ContentHints(@org.jetbrains.annotations.NotNull android.content.Context r9, @org.jetbrains.annotations.NotNull o.createMediaViewVideoRendererApi r10, @org.jetbrains.annotations.NotNull o.TypographyKtExternalSyntheticLambda0 r11, @org.jetbrains.annotations.NotNull o.getDigestAlgorithms<?> r12, @org.jetbrains.annotations.NotNull viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel r13) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r8.<init>()
            r8.onNavigationEvent = r9
            r8.onExtraCallback = r10
            r8.IAuthTabCallback = r11
            r8.IAuthTabCallbackDefault = r12
            r8.asInterface = r13
            java.lang.String r9 = r10.onExtraCallback()
            r10 = 2
            if (r9 == 0) goto L2e
            boolean r11 = kotlin.text.StringsKt.isBlank(r9)
            if (r11 == 0) goto L2c
            goto L2e
        L2c:
            r0 = r9
            goto L92
        L2e:
            boolean r9 = r8.getInterfaceDescriptor()
            if (r9 == 0) goto L90
            boolean r9 = r8.IAuthTabCallbackStubProxy()
            r11 = 1
            if (r9 == r11) goto L3c
            goto L90
        L3c:
            int r9 = o.ContentHints.access000
            int r9 = r9 + 87
            int r11 = r9 % 128
            o.ContentHints.IAuthTabCallbackStubProxy = r11
            int r9 = r9 % r10
            if (r9 == 0) goto L6e
            java.lang.Object[] r4 = new java.lang.Object[]{r8}
            int r2 = com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult()
            int r3 = com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult()
            int r1 = com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult()
            int r7 = com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult()
            r5 = -1377514548(0xffffffffade4cbcc, float:-2.6011103E-11)
            r6 = 1377514553(0x521b3439, float:1.6664902E11)
            java.lang.Object r9 = onExtraCallback(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = (java.lang.String) r9
            r11 = 19
            int r11 = r11 / 0
            if (r9 != 0) goto L2c
            goto L90
        L6e:
            java.lang.Object[] r4 = new java.lang.Object[]{r8}
            int r2 = com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult()
            int r3 = com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult()
            int r1 = com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult()
            int r7 = com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult()
            r5 = -1377514548(0xffffffffade4cbcc, float:-2.6011103E-11)
            r6 = 1377514553(0x521b3439, float:1.6664902E11)
            java.lang.Object r9 = onExtraCallback(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L2c
        L90:
            int r9 = r10 % r10
        L92:
            r8.inputValue = r0
            int r9 = o.ContentHints.IAuthTabCallbackStubProxy
            int r9 = r9 + 71
            int r11 = r9 % 128
            o.ContentHints.access000 = r11
            int r9 = r9 % r10
            if (r9 == 0) goto La0
            return
        La0:
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ContentHints.<init>(android.content.Context, o.createMediaViewVideoRendererApi, o.TypographyKtExternalSyntheticLambda0, o.getDigestAlgorithms, viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel):void");
    }

    public static final /* synthetic */ EditText IAuthTabCallback(ContentHints contentHints) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = contentHints.onExtraCallbackWithResult;
        if (i3 != 0) {
            return editText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onNavigationEvent(ContentHints contentHints) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean interfaceDescriptor = contentHints.getInterfaceDescriptor();
        int i4 = IAuthTabCallbackStubProxy + 101;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static final /* synthetic */ createMediaViewVideoRendererApi onWarmupCompleted(ContentHints contentHints) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 83;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        createMediaViewVideoRendererApi createmediaviewvideorendererapi = contentHints.onExtraCallback;
        if (i4 == 0) {
            int i5 = 94 / 0;
        }
        int i6 = i2 + 93;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return createmediaviewvideorendererapi;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ContentHints contentHints = (ContentHints) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            contentHints.inputValue = str;
            return null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        contentHints.inputValue = str;
        int i3 = 56 / 0;
        return null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.inputValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements TextWatcher {
        final /* synthetic */ TextField IAuthTabCallback;
        final /* synthetic */ Context onExtraCallbackWithResult;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public IAuthTabCallback(TextField textField, Context context) {
            this.IAuthTabCallback = textField;
            this.onExtraCallbackWithResult = context;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) throws Throwable {
            String string;
            Object next;
            CharSequence charSequenceTrimStart;
            ContentHints contentHints = ContentHints.this;
            if (editable == null || (charSequenceTrimStart = StringsKt.trimStart(editable)) == null || (string = charSequenceTrimStart.toString()) == null) {
                string = "";
            }
            ContentHints.onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{contentHints, string}, -1134011270, 1134011276, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
            if (!Intrinsics.areEqual(String.valueOf(editable), ContentHints.this.onExtraCallbackWithResult())) {
                EditText editTextIAuthTabCallback = ContentHints.IAuthTabCallback(ContentHints.this);
                if (editTextIAuthTabCallback != null) {
                    editTextIAuthTabCallback.setText(ContentHints.this.onExtraCallbackWithResult());
                }
                EditText editTextIAuthTabCallback2 = ContentHints.IAuthTabCallback(ContentHints.this);
                if (editTextIAuthTabCallback2 != null) {
                    editTextIAuthTabCallback2.setSelection(ContentHints.this.onExtraCallbackWithResult().length());
                }
            }
            Iterator<T> it = ContentHints.onWarmupCompleted(ContentHints.this).onNavigationEvent().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (!ElGamalParameter.onNavigationEvent((createMediaViewApi) next, ContentHints.this.onExtraCallbackWithResult())) {
                        break;
                    }
                }
            }
            createMediaViewApi createmediaviewapi = (createMediaViewApi) next;
            if (editable == null || editable.length() == 0) {
                this.IAuthTabCallback.setError((CharSequence) null);
                this.IAuthTabCallback.setMessage((String) createMediaViewVideoRendererApi.onWarmupCompleted(-662920368, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{ContentHints.onWarmupCompleted(ContentHints.this)}, 662920368));
            } else if (createmediaviewapi != null) {
                this.IAuthTabCallback.setError(createmediaviewapi.IAuthTabCallback());
            } else {
                this.IAuthTabCallback.setError((CharSequence) null);
                TextField textField = this.IAuthTabCallback;
                String strOnExtraCallbackWithResult = ContentHints.onWarmupCompleted(ContentHints.this).onExtraCallbackWithResult();
                if (strOnExtraCallbackWithResult == null) {
                    strOnExtraCallbackWithResult = (String) createMediaViewVideoRendererApi.onWarmupCompleted(-662920368, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{ContentHints.onWarmupCompleted(ContentHints.this)}, 662920368);
                }
                textField.setMessage(strOnExtraCallbackWithResult);
            }
            if (ContentHints.onNavigationEvent(ContentHints.this)) {
                if (disableMountItemReorderingAndroid.onNavigationEvent.onExtraCallbackWithResult(ContentHints.this.onExtraCallbackWithResult())) {
                    this.IAuthTabCallback.setError((CharSequence) null);
                } else {
                    this.IAuthTabCallback.setError(this.onExtraCallbackWithResult.getString(R.string.app_credit_card_freeform_input_field_email_format_error_message));
                }
            }
        }
    }

    public static final class onExtraCallback implements TextWatcher {
        final /* synthetic */ TextFieldLine onExtraCallback;
        final /* synthetic */ Context onExtraCallbackWithResult;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public onExtraCallback(TextFieldLine textFieldLine, Context context) {
            this.onExtraCallback = textFieldLine;
            this.onExtraCallbackWithResult = context;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) throws Throwable {
            String string;
            Object next;
            CharSequence charSequenceTrimStart;
            ContentHints contentHints = ContentHints.this;
            if (editable == null || (charSequenceTrimStart = StringsKt.trimStart(editable)) == null || (string = charSequenceTrimStart.toString()) == null) {
                string = "";
            }
            ContentHints.onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{contentHints, string}, -1134011270, 1134011276, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
            if (!Intrinsics.areEqual(String.valueOf(editable), ContentHints.this.onExtraCallbackWithResult())) {
                EditText editText = this.onExtraCallback.getEditText();
                if (editText != null) {
                    editText.setText(ContentHints.this.onExtraCallbackWithResult());
                }
                EditText editText2 = this.onExtraCallback.getEditText();
                if (editText2 != null) {
                    editText2.setSelection(ContentHints.this.onExtraCallbackWithResult().length());
                }
            }
            Iterator<T> it = ContentHints.onWarmupCompleted(ContentHints.this).onNavigationEvent().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (!ElGamalParameter.onNavigationEvent((createMediaViewApi) next, ContentHints.this.onExtraCallbackWithResult())) {
                        break;
                    }
                }
            }
            createMediaViewApi createmediaviewapi = (createMediaViewApi) next;
            if (editable == null || editable.length() == 0) {
                this.onExtraCallback.setError((CharSequence) null);
                this.onExtraCallback.setMessage((String) createMediaViewVideoRendererApi.onWarmupCompleted(-662920368, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{ContentHints.onWarmupCompleted(ContentHints.this)}, 662920368));
            } else if (createmediaviewapi != null) {
                this.onExtraCallback.setError(createmediaviewapi.IAuthTabCallback());
            } else {
                this.onExtraCallback.setError((CharSequence) null);
                TextFieldLine textFieldLine = this.onExtraCallback;
                String strOnExtraCallbackWithResult = ContentHints.onWarmupCompleted(ContentHints.this).onExtraCallbackWithResult();
                if (strOnExtraCallbackWithResult == null) {
                    strOnExtraCallbackWithResult = (String) createMediaViewVideoRendererApi.onWarmupCompleted(-662920368, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{ContentHints.onWarmupCompleted(ContentHints.this)}, 662920368);
                }
                textFieldLine.setMessage(strOnExtraCallbackWithResult);
            }
            if (ContentHints.onNavigationEvent(ContentHints.this)) {
                this.onExtraCallback.setError(disableMountItemReorderingAndroid.onNavigationEvent.onExtraCallbackWithResult(ContentHints.this.onExtraCallbackWithResult()) ? null : this.onExtraCallbackWithResult.getString(R.string.app_credit_card_freeform_input_field_email_format_error_message));
            }
        }
    }

    public static final class onExtraCallbackWithResult implements TextWatcher {
        final /* synthetic */ Function0 onNavigationEvent;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public onExtraCallbackWithResult(Function0 function0) {
            this.onNavigationEvent = function0;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EditText editTextIAuthTabCallback = ContentHints.IAuthTabCallback(ContentHints.this);
            if (editTextIAuthTabCallback == null || !editTextIAuthTabCallback.isFocusable()) {
                return;
            }
            this.onNavigationEvent.invoke();
        }
    }

    public getSigPolicyId asBinder() {
        int i = 2 % 2;
        int i2 = access000 + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    @Override // o.getSigPolicyId
    public void onExtraCallbackWithResult(@Nullable getSigPolicyId getsigpolicyid) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackStub = getsigpolicyid;
        int i5 = i3 + 105;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = access000 + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallback.asInterface();
            createNativeAdLayoutApi createnativeadlayoutapi = createNativeAdLayoutApi.EMAIL;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.onExtraCallback.asInterface() != createNativeAdLayoutApi.EMAIL) {
            return false;
        }
        int i3 = access000 + 23;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r1 == 3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r1 != 4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r1 = onExtraCallbackWithResult(r4.onNavigationEvent);
        r2 = o.ContentHints.access000 + 81;
        o.ContentHints.IAuthTabCallbackStubProxy = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        return onExtraCallbackWithResult(r4.onNavigationEvent, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        return onExtraCallbackWithResult(r4.onNavigationEvent, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r1 == 2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.view.View access000() throws kotlin.NoWhenBranchMatchedException {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.ContentHints.IAuthTabCallbackStubProxy
            int r1 = r1 + 85
            int r2 = r1 % 128
            o.ContentHints.access000 = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L20
            o.createMediaViewVideoRendererApi r1 = r4.onExtraCallback
            o.createMediaViewVideoRendererApi$IAuthTabCallback r1 = r1.access000()
            int[] r3 = o.ContentHints.onNavigationEvent.IAuthTabCallback
            int r1 = r1.ordinal()
            r1 = r3[r1]
            if (r1 == r2) goto L55
            goto L30
        L20:
            o.createMediaViewVideoRendererApi r1 = r4.onExtraCallback
            o.createMediaViewVideoRendererApi$IAuthTabCallback r1 = r1.access000()
            int[] r3 = o.ContentHints.onNavigationEvent.IAuthTabCallback
            int r1 = r1.ordinal()
            r1 = r3[r1]
            if (r1 == r2) goto L55
        L30:
            if (r1 == r0) goto L4e
            r3 = 3
            if (r1 == r3) goto L4e
            r2 = 4
            if (r1 != r2) goto L48
            android.content.Context r1 = r4.onNavigationEvent
            android.view.View r1 = r4.onExtraCallbackWithResult(r1)
            int r2 = o.ContentHints.access000
            int r2 = r2 + 81
            int r3 = r2 % 128
            o.ContentHints.IAuthTabCallbackStubProxy = r3
            int r2 = r2 % r0
            return r1
        L48:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L4e:
            android.content.Context r0 = r4.onNavigationEvent
            android.view.View r0 = r4.onExtraCallbackWithResult(r0, r2)
            return r0
        L55:
            android.content.Context r0 = r4.onNavigationEvent
            r1 = 0
            android.view.View r0 = r4.onExtraCallbackWithResult(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ContentHints.access000():android.view.View");
    }

    private static final void onWarmupCompleted(ContentHints contentHints, View view) {
        int i = 2 % 2;
        int i2 = access000 + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            EditText editText = contentHints.onExtraCallbackWithResult;
            throw null;
        }
        EditText editText2 = contentHints.onExtraCallbackWithResult;
        if (editText2 != null && !editText2.isFocusable()) {
            int i3 = IAuthTabCallbackStubProxy + 33;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                contentHints.onExtraCallback.IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            if (contentHints.onExtraCallback.IAuthTabCallback() != null) {
                getDigestAlgorithms.onExtraCallbackWithResult(contentHints.IAuthTabCallbackDefault, contentHints.IAuthTabCallback, contentHints.onExtraCallback.IAuthTabCallback(), contentHints.asInterface, (String) null, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
            }
        }
        int i4 = IAuthTabCallbackStubProxy + 99;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.isSignaturePolicyImplied
    public View onWarmupCompleted() {
        int i = 2 % 2;
        LinearLayout linearLayout = new LinearLayout(this.onNavigationEvent);
        linearLayout.setOrientation(1);
        linearLayout.addView(access000());
        Object[] objArr = {this.onExtraCallback};
        createNativeBannerAdViewApi createnativebanneradviewapi = (createNativeBannerAdViewApi) createMediaViewVideoRendererApi.onWarmupCompleted(-546415036, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, 546415037);
        if (createnativebanneradviewapi != null) {
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            LinearLayout linearLayoutOnWarmupCompleted = getSubjectPublicKeyInfo.onWarmupCompleted(createnativebanneradviewapi, context, this.IAuthTabCallback, this.asInterface, this.IAuthTabCallbackDefault);
            if (linearLayoutOnWarmupCompleted != null) {
                linearLayout.addView(linearLayoutOnWarmupCompleted);
            }
        }
        EditText editText = this.onExtraCallbackWithResult;
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.InputView$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    Object[] objArr2 = {this.f$0, view};
                    ContentHints.onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr2, -1147489712, 1147489716, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
                }
            });
        }
        if (getInterfaceDescriptor() && StringsKt.isBlank(this.inputValue)) {
            int i2 = IAuthTabCallbackStubProxy + 107;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            if (!IAuthTabCallbackStubProxy()) {
                int i4 = access000 + 47;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                linearLayout.addView(asInterface());
                int i6 = access000 + 21;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        int i8 = access000 + 21;
        IAuthTabCallbackStubProxy = i8 % 128;
        int i9 = i8 % 2;
        return linearLayout;
    }

    private static final boolean onExtraCallback(ContentHints contentHints, TextField textField, TextView textView, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = access000 + 117;
        int i4 = i3 % 128;
        IAuthTabCallbackStubProxy = i4;
        int i5 = i3 % 2;
        if (i != 6) {
            return false;
        }
        int i6 = i4 + 49;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        if (!contentHints.IAuthTabCallback() || contentHints.asBinder() == null) {
            setMethodokhttp.onExtraCallback(textField);
            return true;
        }
        getSigPolicyId getsigpolicyidAsBinder = contentHints.asBinder();
        if (getsigpolicyidAsBinder == null) {
            return true;
        }
        int i8 = access000 + 119;
        IAuthTabCallbackStubProxy = i8 % 128;
        if (i8 % 2 == 0) {
            getsigpolicyidAsBinder.IAuthTabCallbackDefault();
            return true;
        }
        getsigpolicyidAsBinder.IAuthTabCallbackDefault();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
        int i3 = $11 + 39;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 4;
        }
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43;
                    int i5 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1450;
                    byte b = (byte) ($$a[1] + 1);
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, minimumFlingVelocity, i5, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cGreen = (char) (49123 - Color.green(0));
                    int packedPositionGroup = 44 - ExpandableListView.getPackedPositionGroup(0L);
                    int iLastIndexOf = 1493 - TextUtils.lastIndexOf("", '0');
                    byte b3 = (byte) (-$$a[1]);
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, packedPositionGroup, iLastIndexOf, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 23972), 50 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 22938 - ((byte) KeyEvent.getModifierMetaStateMask()), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - KeyEvent.normalizeMetaState(0)), 29 - TextUtils.indexOf("", "", 0), 12577 - TextUtils.indexOf("", "", 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onTransact ^ 7798559133331975163L)) ^ ((int) (asBinder ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback_Parcel ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 49;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 93 / 0;
            objArr[0] = str;
        }
    }

    private final View onExtraCallbackWithResult(Context context, boolean z) {
        int i = 2 % 2;
        final TextField textField = new TextField(context);
        textField.setHint(this.onExtraCallback.asBinder());
        textField.IAuthTabCallback().setMaxLines(1);
        textField.IAuthTabCallback().setInputType(this.onExtraCallback.asInterface().getInputType());
        if (z) {
            textField.setTextFieldType(TextField.onWarmupCompleted.BIG);
        }
        textField.setLabel(this.onExtraCallback.IAuthTabCallbackStubProxy());
        textField.setSuffix(this.onExtraCallback.IAuthTabCallback_Parcel());
        Object[] objArr = {this.onExtraCallback};
        textField.setMessage((String) createMediaViewVideoRendererApi.onWarmupCompleted(-662920368, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, 662920368));
        DisplayMetrics displayMetrics = textField.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        Object[] objArr2 = {textField, Integer.valueOf(varyMatches.onNavigationEvent(24, displayMetrics))};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, objArr2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        DisplayMetrics displayMetrics2 = textField.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(textField, varyMatches.onNavigationEvent(24, displayMetrics2));
        BaseEditText baseEditTextIAuthTabCallback = textField.IAuthTabCallback();
        this.onExtraCallbackWithResult = baseEditTextIAuthTabCallback;
        if (baseEditTextIAuthTabCallback != null) {
            int i2 = IAuthTabCallbackStubProxy + 43;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            baseEditTextIAuthTabCallback.setId(View.generateViewId());
        }
        EditText editText = this.onExtraCallbackWithResult;
        if (editText != null) {
            int i4 = access000 + 121;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            editText.setImeOptions(6);
        }
        EditText editText2 = this.onExtraCallbackWithResult;
        if (editText2 != null) {
            editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.InputView$$ExternalSyntheticLambda11
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                    return ContentHints.onWarmupCompleted(this.f$0, textField, textView, i6, keyEvent);
                }
            });
        }
        textField.setText(this.inputValue);
        EditText editText3 = this.onExtraCallbackWithResult;
        if (editText3 != null) {
            int i6 = IAuthTabCallbackStubProxy + 33;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            editText3.setSelection(this.inputValue.length());
        }
        textField.IAuthTabCallback().addTextChangedListener(new IAuthTabCallback(textField, context));
        createMediaViewVideoRendererApi.onWarmupCompleted onwarmupcompletedOnTransact = this.onExtraCallback.onTransact();
        if (onwarmupcompletedOnTransact != null && onNavigationEvent.onNavigationEvent[onwarmupcompletedOnTransact.ordinal()] == 1) {
            TextField.setNumberFormat$default(textField, 0, (TextField.onExtraCallbackWithResult) null, 3, (Object) null);
        }
        return textField;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onTransact(java.lang.Object[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            o.ContentHints r1 = (o.ContentHints) r1
            r2 = 1
            r3 = r7[r2]
            im.toss.uikit.widget.textField.TextFieldLine r3 = (im.toss.uikit.widget.textField.TextFieldLine) r3
            r4 = 2
            r5 = r7[r4]
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5 = 3
            r5 = r7[r5]
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r6 = 4
            r7 = r7[r6]
            android.view.KeyEvent r7 = (android.view.KeyEvent) r7
            int r7 = r4 % r4
            int r7 = o.ContentHints.access000
            int r7 = r7 + 71
            int r6 = r7 % 128
            o.ContentHints.IAuthTabCallbackStubProxy = r6
            int r7 = r7 % r4
            if (r7 == 0) goto L2f
            r7 = 74
            if (r5 != r7) goto L64
            goto L32
        L2f:
            r7 = 6
            if (r5 != r7) goto L64
        L32:
            boolean r7 = r1.IAuthTabCallback()
            if (r7 == r2) goto L39
            goto L54
        L39:
            int r7 = o.ContentHints.IAuthTabCallbackStubProxy
            int r7 = r7 + 119
            int r0 = r7 % 128
            o.ContentHints.access000 = r0
            int r7 = r7 % r4
            if (r7 == 0) goto L5c
            o.getSigPolicyId r7 = r1.asBinder()
            if (r7 == 0) goto L54
            o.getSigPolicyId r7 = r1.asBinder()
            if (r7 == 0) goto L57
            r7.IAuthTabCallbackDefault()
            goto L57
        L54:
            o.setMethodokhttp.onExtraCallback(r3)
        L57:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        L5c:
            r1.asBinder()
            r7 = 0
            r7.hashCode()
            throw r7
        L64:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ContentHints.onTransact(java.lang.Object[]):java.lang.Object");
    }

    private final View onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        final TextFieldLine textFieldLine = new TextFieldLine(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        textFieldLine.setPlaceholderText(this.onExtraCallback.asBinder());
        textFieldLine.setSuffixText(this.onExtraCallback.IAuthTabCallback_Parcel());
        textFieldLine.setHint(this.onExtraCallback.IAuthTabCallbackStubProxy());
        EditText editText = textFieldLine.getEditText();
        if (editText != null) {
            int i2 = access000 + 61;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            editText.setMaxLines(1);
        }
        EditText editText2 = textFieldLine.getEditText();
        if (editText2 != null) {
            int i4 = IAuthTabCallbackStubProxy + 105;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            editText2.setInputType(this.onExtraCallback.asInterface().getInputType());
        }
        Object[] objArr = {this.onExtraCallback};
        textFieldLine.setMessage((String) createMediaViewVideoRendererApi.onWarmupCompleted(-662920368, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, 662920368));
        DisplayMetrics displayMetrics = textFieldLine.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        Object[] objArr2 = {textFieldLine, Integer.valueOf(varyMatches.onNavigationEvent(24, displayMetrics))};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, objArr2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        DisplayMetrics displayMetrics2 = textFieldLine.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(textFieldLine, varyMatches.onNavigationEvent(24, displayMetrics2));
        DisplayMetrics displayMetrics3 = textFieldLine.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(textFieldLine, varyMatches.onNavigationEvent(20, displayMetrics3));
        this.onExtraCallbackWithResult = textFieldLine.getEditText();
        EditText editText3 = textFieldLine.getEditText();
        Object obj = null;
        if (editText3 != null) {
            int i6 = access000 + 13;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                editText3.setId(View.generateViewId());
                obj.hashCode();
                throw null;
            }
            editText3.setId(View.generateViewId());
        }
        EditText editText4 = textFieldLine.getEditText();
        if (editText4 != null) {
            int i7 = IAuthTabCallbackStubProxy + 87;
            access000 = i7 % 128;
            if (i7 % 2 == 0) {
                editText4.setImeOptions(76);
            } else {
                editText4.setImeOptions(6);
            }
        }
        EditText editText5 = textFieldLine.getEditText();
        if (editText5 != null) {
            editText5.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.InputView$$ExternalSyntheticLambda10
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                    return ContentHints.onExtraCallback(this.f$0, textFieldLine, textView, i8, keyEvent);
                }
            });
        }
        EditText editText6 = textFieldLine.getEditText();
        if (editText6 != null) {
            editText6.setText(this.inputValue);
        }
        EditText editText7 = textFieldLine.getEditText();
        if (editText7 != null) {
            editText7.setSelection(this.inputValue.length());
        }
        EditText editText8 = textFieldLine.getEditText();
        if (editText8 != null) {
            editText8.addTextChangedListener(new onExtraCallback(textFieldLine, context));
        }
        if (this.onExtraCallback.onTransact() == createMediaViewVideoRendererApi.onWarmupCompleted.CURRENCY) {
            int i8 = access000 + 97;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            TextFieldLine.setNumberFormat$default(textFieldLine, 0, 1, (Object) null);
        }
        return textFieldLine;
    }

    private final boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        if (ContextCompat.checkSelfPermission(this.onNavigationEvent, "android.permission.READ_CONTACTS") != 0) {
            return false;
        }
        int i2 = access000 + 13;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        boolean z = i2 % 2 == 0;
        int i4 = i3 + 71;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return z;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Object obj;
        Object next;
        int i = 2 % 2;
        Account[] accountsByType = AccountManager.get(((ContentHints) objArr[0]).onNavigationEvent).getAccountsByType("com.google");
        Intrinsics.checkNotNullExpressionValue(accountsByType, "");
        ArrayList arrayList = new ArrayList(accountsByType.length);
        for (Account account : accountsByType) {
            int i2 = IAuthTabCallbackStubProxy + 71;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(account.name);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str = (String) next;
            Intrinsics.checkNotNull(str);
            if (StringsKt.contains$default(str, "gmail.com", false, 2, (Object) null)) {
                break;
            }
        }
        String str2 = (String) next;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            int i4 = IAuthTabCallbackStubProxy + 49;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 64 / 0;
            }
            return str2;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i6 = access000 + 117;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return (String) CollectionsKt.first(arrayList);
        }
        obj.hashCode();
        throw null;
    }

    private final TdsButtonV1View asInterface() {
        int i = 2 % 2;
        final TdsButtonV1View tdsButtonV1View = new TdsButtonV1View(this.onNavigationEvent);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(setTagsokhttp.onExtraCallbackWithResult(tdsButtonV1View, 24));
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(tdsButtonV1View, setTagsokhttp.onExtraCallbackWithResult(tdsButtonV1View, 8));
        setMinWebSocketMessageToCompressokhttp.onNavigationEvent(tdsButtonV1View, setTagsokhttp.onExtraCallbackWithResult(tdsButtonV1View, 24));
        tdsButtonV1View.setLayoutParams(marginLayoutParams);
        TdsButtonV1View.setTheme$default(tdsButtonV1View, TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, TdsButtonV1View.onWarmupCompleted.SMALL, (TdsButtonV1View.IAuthTabCallback) null, 8, (Object) null);
        tdsButtonV1View.setText(tdsButtonV1View.getContext().getString(R.string.app_card_issue_free_form_input_email_prefill_button_title));
        tdsButtonV1View.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.InputView$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                ContentHints.IAuthTabCallback(this.f$0, tdsButtonV1View, view);
            }
        });
        int i2 = IAuthTabCallbackStubProxy + 59;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return tdsButtonV1View;
    }

    private static final void onNavigationEvent(final ContentHints contentHints, final TdsButtonV1View tdsButtonV1View, View view) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385612L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.InputView$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return ContentHints.onNavigationEvent(this.f$0, tdsButtonV1View, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        if (!contentHints.IAuthTabCallbackStubProxy()) {
            int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{contentHints}, 384432370, -384432369, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
            return;
        }
        int i2 = IAuthTabCallbackStubProxy + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        String str = (String) onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, new Object[]{contentHints}, -1377514548, 1377514553, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        if (str != null) {
            EditText editText = contentHints.onExtraCallbackWithResult;
            if (editText != null) {
                editText.setText(str);
            }
            TdsToastV1.onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
            String string = tdsButtonV1View.getContext().getString(R.string.app_card_issue_free_form_input_email_prefill_toast);
            Intrinsics.checkNotNullExpressionValue(string, "");
            isShowTransAnimate.onWarmupCompleted(onwarmupcompleted, string).onNavigationEvent();
        }
        int i4 = IAuthTabCallbackStubProxy + 103;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = access000 + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("InputView", th);
            return Unit.INSTANCE;
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("InputView", th);
        int i3 = 57 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(ContentHints contentHints, shouldBeKeptAsChild shouldbekeptaschild) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (shouldbekeptaschild.onNavigationEvent) {
                int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                String str = (String) onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{contentHints}, -1377514548, 1377514553, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
                if (str != null) {
                    int i3 = access000 + 99;
                    IAuthTabCallbackStubProxy = i3 % 128;
                    int i4 = i3 % 2;
                    EditText editText = contentHints.onExtraCallbackWithResult;
                    if (editText != null) {
                        editText.setText(str);
                    }
                    TdsToastV1.onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
                    String string = contentHints.onNavigationEvent.getString(R.string.app_card_issue_free_form_input_email_prefill_toast);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    isShowTransAnimate.onWarmupCompleted(onwarmupcompleted, string).onNavigationEvent();
                }
            } else {
                boolean z = shouldbekeptaschild.onExtraCallbackWithResult;
                contentHints.extraCallbackWithResult();
            }
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallbackStubProxy + 55;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        boolean z2 = shouldbekeptaschild.onNavigationEvent;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = access000 + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(TdsBottomCtaV1View tdsBottomCtaV1View, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + tdsBottomCtaV1View.getContext().getPackageName()));
        tdsBottomCtaV1View.getContext().startActivity(intent);
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = access000 + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            gettypedexportedconstants.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private final void extraCallbackWithResult() {
        int i = 2 % 2;
        Context context = this.onNavigationEvent;
        asInterface asinterface = asInterface.onExtraCallbackWithResult;
        logAndOpenStore.IAuthTabCallback(context, (Long) null);
        final getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(context, 0, false, false, -1L, asinterface, 14, (DefaultConstructorMarker) null);
        Context context2 = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setShowCloseIcon(false);
        bottomSheetHeader.setTitle(bottomSheetHeader.getContext().getString(R.string.app_card_issue_free_form_input_email_prefill_bottomsheet_title, PlayerErrorCode.onPostMessage()));
        bottomSheetHeader.setDescription(bottomSheetHeader.getContext().getString(R.string.app_card_issue_free_form_input_email_prefill_bottomsheet_subtitle));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        final TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
        String string = tdsBottomCtaV1View.getContext().getString(R.string.app_card_issue_free_form_input_email_prefill_bottomsheet_cta_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        logInvite.onExtraCallback(tdsBottomCtaV1View, string, 0L, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.InputView$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return ContentHints.onWarmupCompleted(tdsBottomCtaV1View, gettypedexportedconstants, (View) obj);
            }
        }, 14, (Object) null);
        tdsBottomCtaV1View.setBottomButtonType(TdsTextButtonV0View.IAuthTabCallback.GREY);
        tdsBottomCtaV1View.setBottomButton(tdsBottomCtaV1View.getContext().getString(R.string.app_card_issue_free_form_input_email_prefill_bottomsheet_cta_bottom_title), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.InputView$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                Object[] objArr = {gettypedexportedconstants, (View) obj};
                return (Unit) ContentHints.onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr, 1098622666, -1098622666, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
            }
        });
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
        int i2 = IAuthTabCallbackStubProxy + 109;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ContentHints contentHints = (ContentHints) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Object[] objArr2 = {M_.onExtraCallback, contentHints.onExtraCallbackWithResult};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            M_.onNavigationEvent(1312897292, objArr2, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
            obj.hashCode();
            throw null;
        }
        Object[] objArr3 = {M_.onExtraCallback, contentHints.onExtraCallbackWithResult};
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        M_.onNavigationEvent(1312897292, objArr3, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent3, -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent4);
        int i3 = IAuthTabCallbackStubProxy + 115;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.getSigPolicyId
    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        if (!IAuthTabCallback()) {
            EditText editText = this.onExtraCallbackWithResult;
            if (editText != null) {
                editText.postDelayed(new Runnable() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.InputView$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        ContentHints.onExtraCallback(this.f$0);
                    }
                }, 300L);
                return;
            }
            return;
        }
        getSigPolicyId getsigpolicyidAsBinder = asBinder();
        if (getsigpolicyidAsBinder != null) {
            int i2 = access000 + 47;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            getsigpolicyidAsBinder.IAuthTabCallbackDefault();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = access000 + 3;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        return o.getWrite.IAuthTabCallback(r4.onExtraCallback.IAuthTabCallbackDefault(), o.NetscapeCertType.Companion.onExtraCallbackWithResult(r4.inputValue));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        o.getWrite.IAuthTabCallback(r4.onExtraCallback.IAuthTabCallbackDefault(), o.NetscapeCertType.Companion.onExtraCallbackWithResult(r4.inputValue));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        return o.getWrite.IAuthTabCallback(r4.onExtraCallback.IAuthTabCallbackDefault(), r4.inputValue);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r4.onExtraCallback.onTransact() == o.createMediaViewVideoRendererApi.onWarmupCompleted.PHONE) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r4.onExtraCallback.onTransact() == o.createMediaViewVideoRendererApi.onWarmupCompleted.PHONE) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = o.ContentHints.access000 + 99;
        o.ContentHints.IAuthTabCallbackStubProxy = r1 % 128;
     */
    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlin.Pair<java.lang.String, java.lang.Object> onNavigationEvent() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.ContentHints.IAuthTabCallbackStubProxy
            int r1 = r1 + 19
            int r2 = r1 % 128
            o.ContentHints.access000 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            o.createMediaViewVideoRendererApi r1 = r4.onExtraCallback
            o.createMediaViewVideoRendererApi$onWarmupCompleted r1 = r1.onTransact()
            o.createMediaViewVideoRendererApi$onWarmupCompleted r2 = o.createMediaViewVideoRendererApi.onWarmupCompleted.PHONE
            r3 = 90
            int r3 = r3 / 0
            if (r1 != r2) goto L58
            goto L27
        L1d:
            o.createMediaViewVideoRendererApi r1 = r4.onExtraCallback
            o.createMediaViewVideoRendererApi$onWarmupCompleted r1 = r1.onTransact()
            o.createMediaViewVideoRendererApi$onWarmupCompleted r2 = o.createMediaViewVideoRendererApi.onWarmupCompleted.PHONE
            if (r1 != r2) goto L58
        L27:
            int r1 = o.ContentHints.access000
            int r1 = r1 + 99
            int r2 = r1 % 128
            o.ContentHints.IAuthTabCallbackStubProxy = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L45
            o.createMediaViewVideoRendererApi r0 = r4.onExtraCallback
            java.lang.String r0 = r0.IAuthTabCallbackDefault()
            o.NetscapeCertType$onWarmupCompleted r1 = o.NetscapeCertType.Companion
            java.lang.String r2 = r4.inputValue
            java.lang.String r1 = r1.onExtraCallbackWithResult(r2)
            kotlin.Pair r0 = o.getWrite.IAuthTabCallback(r0, r1)
            return r0
        L45:
            o.createMediaViewVideoRendererApi r0 = r4.onExtraCallback
            java.lang.String r0 = r0.IAuthTabCallbackDefault()
            o.NetscapeCertType$onWarmupCompleted r1 = o.NetscapeCertType.Companion
            java.lang.String r2 = r4.inputValue
            java.lang.String r1 = r1.onExtraCallbackWithResult(r2)
            o.getWrite.IAuthTabCallback(r0, r1)
            r0 = 0
            throw r0
        L58:
            o.createMediaViewVideoRendererApi r0 = r4.onExtraCallback
            java.lang.String r0 = r0.IAuthTabCallbackDefault()
            java.lang.String r1 = r4.inputValue
            kotlin.Pair r0 = o.getWrite.IAuthTabCallback(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ContentHints.onNavigationEvent():kotlin.Pair");
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        if (getInterfaceDescriptor()) {
            boolean zOnExtraCallbackWithResult = disableMountItemReorderingAndroid.onNavigationEvent.onExtraCallbackWithResult(this.inputValue);
            int i2 = IAuthTabCallbackStubProxy + 85;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return zOnExtraCallbackWithResult;
        }
        int i4 = access000 + 105;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        List<createMediaViewApi> listOnNavigationEvent = this.onExtraCallback.onNavigationEvent();
        if (listOnNavigationEvent instanceof Collection) {
            int i6 = access000 + 37;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            if (listOnNavigationEvent.isEmpty()) {
                int i8 = IAuthTabCallbackStubProxy + 11;
                access000 = i8 % 128;
                int i9 = i8 % 2;
                return true;
            }
        }
        Iterator<T> it = listOnNavigationEvent.iterator();
        while (it.hasNext()) {
            if (!ElGamalParameter.onNavigationEvent((createMediaViewApi) it.next(), this.inputValue)) {
                return false;
            }
        }
        return true;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 1;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        EditText editText = this.onExtraCallbackWithResult;
        if (editText == null) {
            return 0;
        }
        int i5 = i3 + 59;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        int id = editText.getId();
        if (i6 == 0) {
            int i7 = 26 / 0;
        }
        return id;
    }

    public final void onWarmupCompleted(boolean z, @NotNull String str) throws NoWhenBranchMatchedException {
        EditText editText;
        int inputType;
        int iOnActivityLayout;
        int i = 2 % 2;
        int i2 = access000 + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        EditText editText2 = this.onExtraCallbackWithResult;
        if (editText2 != null) {
            editText2.setFocusable(z);
            editText2.setFocusableInTouchMode(z);
            if (z) {
                int i3 = IAuthTabCallbackStubProxy + 101;
                access000 = i3 % 128;
                int i4 = i3 % 2;
                inputType = this.onExtraCallback.asInterface().getInputType();
            } else {
                inputType = 0;
            }
            editText2.setInputType(inputType);
            if (z) {
                Context context = editText2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                iOnActivityLayout = new getUrlokhttp(new IAuthTabCallbackDefault(configuration)).onRelationshipValidationResult();
            } else {
                Context context2 = editText2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration2 = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                getUrlokhttp geturlokhttp = new getUrlokhttp(new onTransact(configuration2));
                iOnActivityLayout = geturlokhttp.ITrustedWebActivityCallbackDefault() == getSpecialFeatureOptInStatus.Dark ? geturlokhttp.getInterfaceDescriptor().onActivityLayout() : geturlokhttp.requestPostMessageChannel().onMessageChannelReady();
            }
            editText2.setTextColor(iOnActivityLayout);
        }
        if (!z && (editText = this.onExtraCallbackWithResult) != null) {
            int i5 = access000 + 123;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                editText.setText(str);
                int i6 = 97 / 0;
            } else {
                editText.setText(str);
            }
        }
        int i7 = access000 + 1;
        IAuthTabCallbackStubProxy = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 40 / 0;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public void onExtraCallbackWithResult(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function0, "");
        EditText editText = this.onExtraCallbackWithResult;
        if (editText != null) {
            editText.addTextChangedListener(new onExtraCallbackWithResult(function0));
            int i3 = IAuthTabCallbackStubProxy + 65;
            access000 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(ContentHints contentHints, View view) throws Throwable {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{contentHints, view}, -1147489712, 1147489716, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallback(getTypedExportedConstants gettypedexportedconstants, View view) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{gettypedexportedconstants, view}, 1098622666, -1098622666, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(ContentHints contentHints, TdsButtonV1View tdsButtonV1View, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{contentHints, tdsButtonV1View, setDetectableSize}, -605344829, 605344831, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    private static final boolean onExtraCallbackWithResult(ContentHints contentHints, TextFieldLine textFieldLine, TextView textView, int i, KeyEvent keyEvent) {
        Object[] objArr = {contentHints, textFieldLine, textView, Integer.valueOf(i), keyEvent};
        return ((Boolean) onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr, 1675167957, -1675167950, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult())).booleanValue();
    }

    private final String access100() {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (String) onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this}, -1377514548, 1377514553, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    private final void IAuthTabCallback_Parcel() throws Throwable {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this}, 384432370, -384432369, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    private static final void onExtraCallbackWithResult(ContentHints contentHints) throws Throwable {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{contentHints}, -1104564424, 1104564427, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    public final void IAuthTabCallback(@NotNull String str) throws Throwable {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onExtraCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this, str}, -1134011270, 1134011276, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    static void IAuthTabCallbackStub() {
        onTransact = 7798559133331975163L;
        asBinder = -1776194565;
        IAuthTabCallback_Parcel = (char) 44085;
    }
}

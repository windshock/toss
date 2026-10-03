package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.DigestInfo;
import o.DynamicFromArrayCompanion;
import o.EncryptedContentInfoParser;
import o.GraniteBrownfieldModule_closeView;
import o.MapConverter;
import o.NativeAdsManagerApi;
import o.PBKDF2Params;
import o.PageContext;
import o.PlayerErrorCode;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RefCountCloseableReference;
import o.RippleNode;
import o.Rmipmap;
import o.TSA_RequestTimeStampWithHash;
import o.UserChoiceBillingListener;
import o.access;
import o.addAllCommandLine;
import o.advance;
import o.clearNestedRecyclerViewIfNotNested;
import o.createAudienceNetworkExportedActivityApi;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.generateLink;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.getHostnameVerifierokhttp;
import o.preFillDefault;
import o.setCTABackgroundColor;
import o.setMessageBytes;
import o.setPrimaryTextColor;
import o.wasLastName;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.securekey.SecureKeyboardView;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssuePasswordFragment extends CardIssueBaseFragment<PBKDF2Params> {
    public static final int IAuthTabCallback;
    private static char[] IAuthTabCallbackDefault;
    private static long asInterface;
    private static int getInterfaceDescriptor;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult;
    private final PageContext onExtraCallback;
    private final Lazy onNavigationEvent;
    private String onTransact;
    private String onWarmupCompleted;
    private static final byte[] $$a = {108, -1, -36, 99};
    private static final int $$b = 65;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[DynamicFromArrayCompanion.onExtraCallback.values().length];
            try {
                iArr[DynamicFromArrayCompanion.onExtraCallback.NOT_CONTAINS_PHONE_NUMBERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DynamicFromArrayCompanion.onExtraCallback.NOT_CONTAINS_RRN_NUMBERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DynamicFromArrayCompanion.onExtraCallback.NOT_THREE_OR_MORE_NUMBERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DynamicFromArrayCompanion.onExtraCallback.NOT_THREE_OR_MORE_DUPLICATE_NUMBERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DynamicFromArrayCompanion.onExtraCallback.NOT_THREE_OR_MORE_CONSECUTIVE_NUMBERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DynamicFromArrayCompanion.onExtraCallback.NOT_FOUR_OR_MORE_CONSECUTIVE_NUMBERS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DynamicFromArrayCompanion.onExtraCallback.NOT_POPULAR_PASSWORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, short r8, byte r9) {
        /*
            byte[] r0 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment.$$a
            int r8 = r8 * 4
            int r8 = r8 + 97
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r9 = r9 * 4
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2c:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment.$$c(short, short, byte):java.lang.String");
    }

    static {
        getInterfaceDescriptor = 0;
        IAuthTabCallback();
        onExtraCallbackWithResult = new addAllCommandLine[]{new PropertyReference1Impl<>(CardIssuePasswordFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssuePasswordBinding;", 0)};
        IAuthTabCallback = 8;
        int i = IAuthTabCallback_Parcel + 47;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssuePasswordFragment cardIssuePasswordFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(cardIssuePasswordFragment, deserializeurinullablecollection);
        }
        onNavigationEvent(cardIssuePasswordFragment, deserializeurinullablecollection);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(CardIssuePasswordFragment cardIssuePasswordFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(cardIssuePasswordFragment);
        int i4 = asBinder + 79;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        CardIssuePasswordFragment cardIssuePasswordFragment = (CardIssuePasswordFragment) objArr[0];
        RefCountCloseableReference.onNavigationEvent onnavigationevent = (RefCountCloseableReference.onNavigationEvent) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(cardIssuePasswordFragment, onnavigationevent, view);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        int i5 = asBinder + 89;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CardIssuePasswordFragment cardIssuePasswordFragment = (CardIssuePasswordFragment) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{cardIssuePasswordFragment, th}, -1296057584, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1296057584, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        int i4 = IAuthTabCallbackStub + 119;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i);
        int i9 = (~(i7 | i2)) | i8;
        int i10 = ~i;
        int i11 = ~i2;
        int i12 = i9 | (~(i10 | i11 | i5));
        int i13 = ~(i7 | i10 | i11);
        int i14 = i10 | i5;
        int i15 = (~(i2 | i14)) | i13;
        int i16 = (~i14) | i8;
        int i17 = i5 + i + i4 + ((-327997910) * i6) + ((-604038433) * i3);
        int i18 = i17 * i17;
        int i19 = ((i5 * 234895570) - 128974848) + (234895570 * i) + (i12 * 695176798) + (695176798 * i15) + ((-347588399) * i16) + (582483968 * i4) + (36700160 * i6) + ((-297271296) * i3) + (1302134784 * i18);
        int i20 = (i5 * (-238133666)) + 182491156 + (i * (-238133666)) + (i12 * (-1294)) + (i15 * (-1294)) + (i16 * 647) + (i4 * (-238134313)) + (i6 * (-1022231738)) + (i3 * 4118089) + (i18 * (-35979264));
        switch (i19 + (i20 * i20 * 1404239872)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssuePasswordFragment cardIssuePasswordFragment, String str, setPrimaryTextColor setprimarytextcolor) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(cardIssuePasswordFragment, str, setprimarytextcolor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssuePasswordFragment, str, setprimarytextcolor);
        int i3 = IAuthTabCallbackStub + 113;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssuePasswordFragment cardIssuePasswordFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(cardIssuePasswordFragment, th);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssuePasswordFragment, th);
        int i3 = IAuthTabCallbackStub + 87;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ clearNestedRecyclerViewIfNotNested onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            access100();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        clearNestedRecyclerViewIfNotNested clearnestedrecyclerviewifnotnestedAccess100 = access100();
        int i3 = IAuthTabCallbackStub + 27;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return clearnestedrecyclerviewifnotnestedAccess100;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(new Object[]{function1, obj}, 509818850, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -509818843, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
            return;
        }
        onExtraCallback(new Object[]{function1, obj}, 509818850, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -509818843, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CardIssuePasswordFragment cardIssuePasswordFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(cardIssuePasswordFragment);
        int i4 = IAuthTabCallbackStub + 65;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(th);
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        int i5 = IAuthTabCallbackStub + 21;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(setPrimaryTextColor setprimarytextcolor, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(setprimarytextcolor, commonModule_setLeftEdgeTouchEnabled);
        int i4 = asBinder + 69;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssuePasswordFragment cardIssuePasswordFragment, DynamicFromArrayCompanion.onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardIssuePasswordFragment, onextracallback);
        int i4 = asBinder + 39;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        Object[] objArr = {function1, obj};
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback4 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        if (i3 == 0) {
            onExtraCallback(objArr, 923545248, iIAuthTabCallback, iIAuthTabCallback4, iIAuthTabCallback2, -923545247, iIAuthTabCallback3);
            throw null;
        }
        onExtraCallback(objArr, 923545248, iIAuthTabCallback, iIAuthTabCallback4, iIAuthTabCallback2, -923545247, iIAuthTabCallback3);
        int i4 = IAuthTabCallbackStub + 17;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        CardIssuePasswordFragment cardIssuePasswordFragment = (CardIssuePasswordFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardIssuePasswordFragment, str);
        int i4 = IAuthTabCallbackStub + 101;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssuePasswordFragment cardIssuePasswordFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardIssuePasswordFragment, deserializeurinullablecollection);
        int i4 = IAuthTabCallbackStub + 49;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, TSA_RequestTimeStampWithHash> {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1, TSA_RequestTimeStampWithHash.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssuePasswordBinding;", 0);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final TSA_RequestTimeStampWithHash invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return TSA_RequestTimeStampWithHash.IAuthTabCallback(view);
        }
    }

    public CardIssuePasswordFragment() {
        super(R.layout.fragment_card_issue_password);
        this.onExtraCallback = preFillDefault.onExtraCallbackWithResult(this, onExtraCallbackWithResult.IAuthTabCallback);
        this.onTransact = "";
        this.onWarmupCompleted = "";
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment$$ExternalSyntheticLambda5
            public final Object invoke() {
                return CardIssuePasswordFragment.onExtraCallbackWithResult();
            }
        });
    }

    public static final /* synthetic */ void onExtraCallback(CardIssuePasswordFragment cardIssuePasswordFragment, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        cardIssuePasswordFragment.onExtraCallback(str);
        int i4 = IAuthTabCallbackStub + 73;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ String onNavigationEvent(CardIssuePasswordFragment cardIssuePasswordFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = cardIssuePasswordFragment.onWarmupCompleted;
        int i5 = i3 + 79;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private final TSA_RequestTimeStampWithHash onWarmupCompleted() {
        PageContext pageContext;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = asBinder + 81;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            pageContext = this.onExtraCallback;
            addallcommandline = onExtraCallbackWithResult[1];
        } else {
            pageContext = this.onExtraCallback;
            addallcommandline = onExtraCallbackWithResult[0];
        }
        TSA_RequestTimeStampWithHash tSA_RequestTimeStampWithHash = (TSA_RequestTimeStampWithHash) pageContext.onExtraCallbackWithResult(this, addallcommandline);
        int i3 = asBinder + 51;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return tSA_RequestTimeStampWithHash;
    }

    private final Typography5 asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Typography5 typography5 = onWarmupCompleted().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        int i4 = asBinder + 9;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return typography5;
    }

    private final Typography5 IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Typography5 typography5 = onWarmupCompleted().onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            return typography5;
        }
        Typography5 typography52 = onWarmupCompleted().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(typography52, "");
        int i3 = 28 / 0;
        return typography52;
    }

    private final Typography5 onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(onWarmupCompleted().IAuthTabCallback, "");
            throw null;
        }
        Typography5 typography5 = onWarmupCompleted().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        return typography5;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CardIssuePasswordFragment cardIssuePasswordFragment = (CardIssuePasswordFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Typography5 typography5 = cardIssuePasswordFragment.onWarmupCompleted().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        if (i3 != 0) {
            return typography5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TdsTopV1View getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            TdsTopV1View tdsTopV1View = onWarmupCompleted().asInterface;
            Intrinsics.checkNotNullExpressionValue(tdsTopV1View, "");
            return tdsTopV1View;
        }
        TdsTopV1View tdsTopV1View2 = onWarmupCompleted().asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1View2, "");
        int i3 = 56 / 0;
        return tdsTopV1View2;
    }

    private final SecureKeyboardView access000() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            SecureKeyboardView secureKeyboardView = onWarmupCompleted().onTransact;
            Intrinsics.checkNotNullExpressionValue(secureKeyboardView, "");
            return secureKeyboardView;
        }
        Intrinsics.checkNotNullExpressionValue(onWarmupCompleted().onTransact, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CardIssuePasswordFragment cardIssuePasswordFragment = (CardIssuePasswordFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TdsTextButtonV0View tdsTextButtonV0View = cardIssuePasswordFragment.onWarmupCompleted().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsTextButtonV0View, "");
        int i4 = asBinder + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return tdsTextButtonV0View;
    }

    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        if (str.length() == 4) {
            int i2 = asBinder + 113;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            this.onTransact = str;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 83;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = asBinder + 7;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final class onNavigationEvent<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onNavigationEvent;

        public onNavigationEvent(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onNavigationEvent = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        public final deserializeIp<setPrimaryTextColor> apply(writeRaw<BaseApiResponse<setPrimaryTextColor>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass4 anonymousClass4 = new Function1<BaseApiResponse<setPrimaryTextColor>, deserializeIp<? extends setPrimaryTextColor>>() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment.onNavigationEvent.4
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends setPrimaryTextColor> invoke(BaseApiResponse<setPrimaryTextColor> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = setPrimaryTextColor.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass4) { // from class: o.UtilsKtExternalSyntheticLambda17$removeMenuProvider
                private final /* synthetic */ Function1 onWarmupCompleted;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass4, "");
                    this.onWarmupCompleted = anonymousClass4;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onWarmupCompleted.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onNavigationEvent;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallbackWithResult;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    private final void onExtraCallback(String str) {
        float f;
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        View[] viewArr = {asBinder(), IAuthTabCallbackDefault(), onTransact(), (Typography5) onExtraCallback(new Object[]{this}, -429030481, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 429030485, access.IAuthTabCallbackStubProxy.IAuthTabCallback())};
        int i5 = 0;
        while (i4 < 4) {
            View view = viewArr[i4];
            if (i5 <= str.length() - 1) {
                int i6 = IAuthTabCallbackStub;
                int i7 = i6 + 91;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 33;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
                f = 1.0f;
            } else {
                f = 0.12f;
            }
            view.setAlpha(f);
            i4++;
            i5++;
        }
        this.onWarmupCompleted = str;
        onWarmupCompleted(str);
    }

    private final clearNestedRecyclerViewIfNotNested asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        clearNestedRecyclerViewIfNotNested clearnestedrecyclerviewifnotnested = (clearNestedRecyclerViewIfNotNested) this.onNavigationEvent.getValue();
        int i4 = asBinder + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return clearnestedrecyclerviewifnotnested;
    }

    private static final clearNestedRecyclerViewIfNotNested access100() {
        int i = 2 % 2;
        clearNestedRecyclerViewIfNotNested clearnestedrecyclerviewifnotnested = new clearNestedRecyclerViewIfNotNested(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
        clearnestedrecyclerviewifnotnested.onNavigationEvent("");
        int i2 = IAuthTabCallbackStub + 123;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return clearnestedrecyclerviewifnotnested;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback implements SecureKeyboardView.IAuthTabCallback {

        public static final /* synthetic */ class onExtraCallbackWithResult {
            public static final /* synthetic */ int[] onExtraCallback;

            static {
                int[] iArr = new int[DigestInfo.values().length];
                try {
                    iArr[DigestInfo.KEY_DELETE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DigestInfo.KEY_RESET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                onExtraCallback = iArr;
            }
        }

        onExtraCallback() {
        }

        @Override // viva.republica.toss.common.securekey.SecureKeyboardView.IAuthTabCallback
        public void onNavigationEvent(DigestInfo digestInfo) {
            String strDropLast = "";
            Intrinsics.checkNotNullParameter(digestInfo, "");
            CardIssuePasswordFragment cardIssuePasswordFragment = CardIssuePasswordFragment.this;
            int i = onExtraCallbackWithResult.onExtraCallback[digestInfo.ordinal()];
            if (i == 1) {
                strDropLast = StringsKt.dropLast(CardIssuePasswordFragment.onNavigationEvent(CardIssuePasswordFragment.this), 1);
            } else if (i != 2) {
                strDropLast = CardIssuePasswordFragment.onNavigationEvent(CardIssuePasswordFragment.this) + digestInfo.getTitle();
            }
            CardIssuePasswordFragment.onExtraCallback(cardIssuePasswordFragment, strDropLast);
        }
    }

    private static final void onWarmupCompleted(CardIssuePasswordFragment cardIssuePasswordFragment, RefCountCloseableReference.onNavigationEvent onnavigationevent, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            getDigestAlgorithms.onExtraCallbackWithResult(cardIssuePasswordFragment.writeTypedObject(), RippleNode.onNavigationEvent(cardIssuePasswordFragment), onnavigationevent.onNavigationEvent(), cardIssuePasswordFragment.extraCallback(), onnavigationevent.onWarmupCompleted(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 19, (Object) null);
        } else {
            getDigestAlgorithms.onExtraCallbackWithResult(cardIssuePasswordFragment.writeTypedObject(), RippleNode.onNavigationEvent(cardIssuePasswordFragment), onnavigationevent.onNavigationEvent(), cardIssuePasswordFragment.extraCallback(), onnavigationevent.onWarmupCompleted(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        }
    }

    public static final class onWarmupCompleted implements DynamicFromArrayCompanion.onExtraCallbackWithResult {
        onWarmupCompleted() {
        }

        @Override // o.DynamicFromArrayCompanion.onExtraCallbackWithResult
        public String onExtraCallbackWithResult() {
            int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            return (String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, iOnNavigationEvent2, iOnNavigationEvent, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
        }

        @Override // o.DynamicFromArrayCompanion.onExtraCallbackWithResult
        public String onNavigationEvent() {
            return StringsKt.takeLast(PlayerErrorCode.extraCallback(), 6);
        }
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 107;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r26, int r27, char r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment.a(int, int, char, java.lang.Object[]):void");
    }

    private static final Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 123;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = asBinder + 55;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            getInterfaceDescriptor().setUpperText(((PBKDF2Params) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).IAuthTabCallbackStub());
            ((PBKDF2Params) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).asInterface();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        getInterfaceDescriptor().setUpperText(((PBKDF2Params) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).IAuthTabCallbackStub());
        String strAsInterface = ((PBKDF2Params) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).asInterface();
        if (strAsInterface != null) {
            int i3 = asBinder + 115;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                getInterfaceDescriptor().setLowerText(strAsInterface);
                obj.hashCode();
                throw null;
            }
            getInterfaceDescriptor().setLowerText(strAsInterface);
        }
        SecureKeyboardView secureKeyboardViewAccess000 = access000();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        secureKeyboardViewAccess000.setDarkMode(((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{contextRequireContext}, 194147643, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue());
        access000().setOnSecureKeyListener(new onExtraCallback());
        access000().onWarmupCompleted();
        final RefCountCloseableReference.onNavigationEvent onnavigationeventOnWarmupCompleted = ((PBKDF2Params) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).onWarmupCompleted();
        if (onnavigationeventOnWarmupCompleted != null && (strOnWarmupCompleted = onnavigationeventOnWarmupCompleted.onWarmupCompleted()) != null && strOnWarmupCompleted.length() != 0) {
            ((TdsTextButtonV0View) onExtraCallback(new Object[]{this}, -1228388323, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1228388332, access.IAuthTabCallbackStubProxy.IAuthTabCallback())).setVisibility(0);
            ((TdsTextButtonV0View) onExtraCallback(new Object[]{this}, -1228388323, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1228388332, access.IAuthTabCallbackStubProxy.IAuthTabCallback())).setText(onnavigationeventOnWarmupCompleted.onWarmupCompleted());
            ((TdsTextButtonV0View) onExtraCallback(new Object[]{this}, -1228388323, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1228388332, access.IAuthTabCallbackStubProxy.IAuthTabCallback())).setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CardIssuePasswordFragment.onExtraCallback(new Object[]{this.f$0, onnavigationeventOnWarmupCompleted, view2}, -100035776, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 100035784, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
                }
            });
        }
        wasLastName waslastname = (wasLastName) DynamicFromArrayCompanion.IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{DynamicFromArrayCompanion.onExtraCallbackWithResult, new onWarmupCompleted(), null, null, 6, null}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1276900957, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1276900962, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
        deserializeDecimalCollection deserializedecimalcollection = new deserializeDecimalCollection() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment$$ExternalSyntheticLambda1
            public final void run() {
                CardIssuePasswordFragment.onExtraCallback();
            }
        };
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj2) {
                return (Unit) CardIssuePasswordFragment.onExtraCallback(new Object[]{(Throwable) obj2}, -1406857376, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1406857378, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = waslastname.onWarmupCompleted(deserializedecimalcollection, new deserializeFloat() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment$$ExternalSyntheticLambda3
            public final void accept(Object obj2) {
                CardIssuePasswordFragment.onExtraCallback(function1, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        autoDisposable(deserializeurinullablecollectionOnWarmupCompleted);
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 85;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onExtraCallback(CardIssuePasswordFragment cardIssuePasswordFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Rmipmap<Boolean> rmipmapICustomTabsCallback_Parcel = cardIssuePasswordFragment.extraCallback().ICustomTabsCallback_Parcel();
        if (i3 != 0) {
            rmipmapICustomTabsCallback_Parcel.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
        rmipmapICustomTabsCallback_Parcel.setValue(Boolean.TRUE);
        int i4 = 7 / 0;
        return Unit.INSTANCE;
    }

    private static final void onExtraCallback(CardIssuePasswordFragment cardIssuePasswordFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        cardIssuePasswordFragment.extraCallback().ICustomTabsCallback_Parcel().setValue(Boolean.FALSE);
        if (i3 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(CardIssuePasswordFragment cardIssuePasswordFragment, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            if (cardIssuePasswordFragment.readTypedObject().access000()) {
                cardIssuePasswordFragment.IAuthTabCallback(str);
            } else {
                cardIssuePasswordFragment.onNavigationEvent(str);
                cardIssuePasswordFragment.onExtraCallback("");
                cardIssuePasswordFragment.getInterfaceDescriptor().setUpperText(cardIssuePasswordFragment.getString(R.string.app_cardrecommend_issuev2_ui___a9aefa2f19));
                cardIssuePasswordFragment.getInterfaceDescriptor().setLowerText("");
                int i3 = IAuthTabCallbackStub + 79;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            }
            return Unit.INSTANCE;
        }
        cardIssuePasswordFragment.readTypedObject().access000();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onWarmupCompleted(CardIssuePasswordFragment cardIssuePasswordFragment, DynamicFromArrayCompanion.onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        String string;
        int i;
        int i2 = 2 % 2;
        cardIssuePasswordFragment.getInterfaceDescriptor().setUpperText(cardIssuePasswordFragment.getString(R.string.app_cardrecommend_issuev2_ui___aaca461cbf));
        TdsTopV1View interfaceDescriptor = cardIssuePasswordFragment.getInterfaceDescriptor();
        switch (onextracallback == null ? -1 : IAuthTabCallback.onExtraCallbackWithResult[onextracallback.ordinal()]) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                string = cardIssuePasswordFragment.getString(R.string.app_cardrecommend_issuev2_ui___a87dc52257);
                interfaceDescriptor.setLowerText(string);
                cardIssuePasswordFragment.onExtraCallback("");
                return Unit.INSTANCE;
            case 2:
                string = cardIssuePasswordFragment.getString(R.string.app_cardrecommend_issuev2_ui___fbfc653400);
                i = IAuthTabCallbackStub + 125;
                asBinder = i % 128;
                int i3 = i % 2;
                interfaceDescriptor.setLowerText(string);
                cardIssuePasswordFragment.onExtraCallback("");
                return Unit.INSTANCE;
            case 3:
                string = cardIssuePasswordFragment.getString(R.string.app_cardrecommend_issuev2_ui___21d11f30a7);
                interfaceDescriptor.setLowerText(string);
                cardIssuePasswordFragment.onExtraCallback("");
                return Unit.INSTANCE;
            case 4:
                string = cardIssuePasswordFragment.getString(R.string.app_cardrecommend_issuev2_ui___633a3b8ed3);
                interfaceDescriptor.setLowerText(string);
                cardIssuePasswordFragment.onExtraCallback("");
                return Unit.INSTANCE;
            case 5:
            case 6:
                string = cardIssuePasswordFragment.getString(R.string.app_cardrecommend_issuev2_ui___7c06276443);
                i = asBinder + 73;
                IAuthTabCallbackStub = i % 128;
                int i32 = i % 2;
                interfaceDescriptor.setLowerText(string);
                cardIssuePasswordFragment.onExtraCallback("");
                return Unit.INSTANCE;
            case 7:
                string = cardIssuePasswordFragment.getString(R.string.app_cardrecommend_issuev2_ui___e341a062ae);
                interfaceDescriptor.setLowerText(string);
                cardIssuePasswordFragment.onExtraCallback("");
                return Unit.INSTANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final Unit IAuthTabCallback(CardIssuePasswordFragment cardIssuePasswordFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            cardIssuePasswordFragment.getInterfaceDescriptor().setUpperText(cardIssuePasswordFragment.getString(R.string.app_cardrecommend_issuev2_ui___aaca461cbf));
            cardIssuePasswordFragment.getInterfaceDescriptor().setLowerText(th.getMessage());
            cardIssuePasswordFragment.onExtraCallback("");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(th, "");
        cardIssuePasswordFragment.getInterfaceDescriptor().setUpperText(cardIssuePasswordFragment.getString(R.string.app_cardrecommend_issuev2_ui___aaca461cbf));
        cardIssuePasswordFragment.getInterfaceDescriptor().setLowerText(th.getMessage());
        cardIssuePasswordFragment.onExtraCallback("");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private final void onWarmupCompleted(final String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (str.length() != 4) {
            return;
        }
        if (this.onTransact.length() == 0) {
            advance advanceVar = (advance) DynamicFromArrayCompanion.IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{DynamicFromArrayCompanion.onExtraCallbackWithResult, new GraniteBrownfieldModule_closeView(str)}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -566981147, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 566981155, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment$$ExternalSyntheticLambda11
                public final Object invoke(Object obj) {
                    return CardIssuePasswordFragment.onWarmupCompleted(this.f$0, (deserializeUriNullableCollection) obj);
                }
            };
            advance advanceVarIAuthTabCallback = advanceVar.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment$$ExternalSyntheticLambda12
                public final void accept(Object obj) {
                    CardIssuePasswordFragment.onExtraCallbackWithResult(function1, obj);
                }
            }).IAuthTabCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment$$ExternalSyntheticLambda13
                public final void run() {
                    CardIssuePasswordFragment.onExtraCallbackWithResult(this.f$0);
                }
            });
            Intrinsics.checkNotNullExpressionValue(advanceVarIAuthTabCallback, "");
            setMessageBytes.onExtraCallbackWithResult(advanceVarIAuthTabCallback, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment$$ExternalSyntheticLambda14
                public final Object invoke(Object obj) {
                    return CardIssuePasswordFragment.onExtraCallbackWithResult(this.f$0, (Throwable) obj);
                }
            }, new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment$$ExternalSyntheticLambda15
                public final Object invoke() {
                    return (Unit) CardIssuePasswordFragment.onExtraCallback(new Object[]{this.f$0, str}, 1073319362, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1073319357, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
                }
            }, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment$$ExternalSyntheticLambda16
                public final Object invoke(Object obj) {
                    return CardIssuePasswordFragment.onNavigationEvent(this.f$0, (DynamicFromArrayCompanion.onExtraCallback) obj);
                }
            });
        } else if (!Intrinsics.areEqual(this.onTransact, str)) {
            if (!Intrinsics.areEqual(this.onTransact, str)) {
                getInterfaceDescriptor().setUpperText(getString(R.string.app_cardrecommend_issuev2_ui___aaca461cbf));
                getInterfaceDescriptor().setLowerText(getString(R.string.app_cardrecommend_issuev2_ui___740715e3bf));
            }
        } else {
            int i4 = asBinder + 81;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            IAuthTabCallbackStubProxy();
        }
        access000().onWarmupCompleted();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object asBinder(java.lang.Object[] r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment.asBinder(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(CardIssuePasswordFragment cardIssuePasswordFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getHostnameVerifierokhttp.onNavigationEvent(cardIssuePasswordFragment, (String) null, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 7;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(CardIssuePasswordFragment cardIssuePasswordFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        cardIssuePasswordFragment.dismissLoadingIndicator();
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
    }

    private static final Unit IAuthTabCallback(setPrimaryTextColor setprimarytextcolor, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        String strOnExtraCallbackWithResult = setprimarytextcolor.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult != null) {
            int i2 = asBinder + 9;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (strOnExtraCallbackWithResult.length() != 0) {
                commonModule_setLeftEdgeTouchEnabled.onExtraCallback(setprimarytextcolor.onExtraCallbackWithResult());
                int i4 = asBinder + 25;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(setprimarytextcolor.onExtraCallback());
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(CardIssuePasswordFragment cardIssuePasswordFragment, String str, final setPrimaryTextColor setprimarytextcolor) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (setprimarytextcolor.IAuthTabCallback()) {
            cardIssuePasswordFragment.onNavigationEvent(str);
            cardIssuePasswordFragment.onExtraCallback("");
            cardIssuePasswordFragment.getInterfaceDescriptor().setUpperText(cardIssuePasswordFragment.getString(R.string.app_cardrecommend_issuev2_ui___a9aefa2f19));
            cardIssuePasswordFragment.getInterfaceDescriptor().setLowerText("");
        } else {
            Context context = cardIssuePasswordFragment.getContext();
            if (context != null) {
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment$$ExternalSyntheticLambda4
                    public final Object invoke(Object obj) {
                        return CardIssuePasswordFragment.onNavigationEvent(setprimarytextcolor, (CommonModule_setLeftEdgeTouchEnabled) obj);
                    }
                });
                int i4 = asBinder + 75;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 5;
                }
            }
            cardIssuePasswordFragment.onExtraCallback("");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IAuthTabCallback(final java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment.IAuthTabCallback(java.lang.String):void");
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CardIssuePasswordFragment cardIssuePasswordFragment = (CardIssuePasswordFragment) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        cardIssuePasswordFragment.extraCallback().mayLaunchUrl().setValue(th);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 123;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final void IAuthTabCallbackStubProxy() {
        String strIAuthTabCallback;
        int i = 2 % 2;
        String str = (String) onExtraCallback(new Object[]{this, this.onTransact}, 129726388, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -129726382, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        setCTABackgroundColor setctabackgroundcolorOnExtraCallbackWithResult = readTypedObject().onExtraCallbackWithResult();
        String strOnNavigationEvent = null;
        if (setctabackgroundcolorOnExtraCallbackWithResult != null) {
            int i2 = IAuthTabCallbackStub + 99;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            strIAuthTabCallback = setctabackgroundcolorOnExtraCallbackWithResult.IAuthTabCallback();
        } else {
            strIAuthTabCallback = null;
        }
        NativeAdsManagerApi nativeAdsManagerApiOnTransact = readTypedObject().onTransact();
        if (nativeAdsManagerApiOnTransact != null) {
            int i4 = asBinder + 7;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                strOnNavigationEvent = nativeAdsManagerApiOnTransact.onNavigationEvent();
                int i5 = 15 / 0;
            } else {
                strOnNavigationEvent = nativeAdsManagerApiOnTransact.onNavigationEvent();
            }
        }
        getDigestAlgorithms.onExtraCallback(writeTypedObject(), RippleNode.onNavigationEvent(this), extraCallback(), new createAudienceNetworkExportedActivityApi(str, strIAuthTabCallback, strOnNavigationEvent), (String) null, (String) null, (Map) null, 40, (Object) null);
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssuePasswordFragment cardIssuePasswordFragment, Throwable th) {
        return (Unit) onExtraCallback(new Object[]{cardIssuePasswordFragment, th}, 872071009, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -872071006, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        return (Unit) onExtraCallback(new Object[]{th}, -1406857376, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1406857378, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssuePasswordFragment cardIssuePasswordFragment, String str) {
        return (Unit) onExtraCallback(new Object[]{cardIssuePasswordFragment, str}, 1073319362, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1073319357, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        onExtraCallback(new Object[]{function1, obj}, 509818850, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -509818843, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private final String onExtraCallbackWithResult(String str) {
        return (String) onExtraCallback(new Object[]{this, str}, 129726388, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -129726382, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private final TdsTextButtonV0View onNavigationEvent() {
        return (TdsTextButtonV0View) onExtraCallback(new Object[]{this}, -1228388323, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1228388332, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private final Typography5 IAuthTabCallbackStub() {
        return (Typography5) onExtraCallback(new Object[]{this}, -429030481, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 429030485, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final void asInterface(Function1 function1, Object obj) {
        onExtraCallback(new Object[]{function1, obj}, 923545248, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -923545247, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(CardIssuePasswordFragment cardIssuePasswordFragment, Throwable th) {
        return (Unit) onExtraCallback(new Object[]{cardIssuePasswordFragment, th}, -1296057584, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1296057584, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackDefault = new char[]{55394, 18567, 63929};
        asInterface = -962406516173144784L;
    }
}

package viva.republica.toss.cardrecommend.issuev2.ui.select;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.OnBackPressedCallback;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.PageContext;
import o.RippleNode;
import o.SetDetectableSize;
import o.TypographyKtExternalSyntheticLambda0;
import o.UTIL_Base64Encode;
import o.addAllCommandLine;
import o.extraCommand;
import o.getDataGroupNumber;
import o.getDatagroupHash;
import o.getDigestAlgorithms;
import o.getExponent1;
import o.getStringArrayList;
import o.handleRemoveKey;
import o.preFillDefault;
import o.setBodyokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueTripleInLocaSelectFragment extends CardIssueBaseFragment<getExponent1> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int IAuthTabCallback;
    private static char IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int extraCallback = 1;
    private static char getInterfaceDescriptor;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    private static char onTransact;
    private final getDataGroupNumber IAuthTabCallbackStub;
    private int asBinder;
    private final List<getDatagroupHash> asInterface;
    private final PageContext onExtraCallbackWithResult;
    private ArrayList<String> onNavigationEvent;
    private getDatagroupHash onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        onExtraCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(CardIssueTripleInLocaSelectFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueTripleInLocaSelectBinding;", 0)};
        IAuthTabCallback = 8;
        int i = access000 + 125;
        extraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueTripleInLocaSelectFragment cardIssueTripleInLocaSelectFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = access100 + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardIssueTripleInLocaSelectFragment, onBackPressedCallback);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueTripleInLocaSelectFragment cardIssueTripleInLocaSelectFragment, View view) {
        int i = 2 % 2;
        int i2 = access100 + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), -599524367, handleRemoveKey.onExtraCallbackWithResult(), 599524370, new Object[]{cardIssueTripleInLocaSelectFragment, view}, iOnExtraCallbackWithResult, handleRemoveKey.onExtraCallbackWithResult());
        int i4 = IAuthTabCallback_Parcel + 89;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueTripleInLocaSelectFragment cardIssueTripleInLocaSelectFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardIssueTripleInLocaSelectFragment, setDetectableSize);
        int i4 = IAuthTabCallback_Parcel + 109;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CardIssueTripleInLocaSelectFragment cardIssueTripleInLocaSelectFragment = (CardIssueTripleInLocaSelectFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardIssueTripleInLocaSelectFragment, view);
        int i4 = IAuthTabCallback_Parcel + 39;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueTripleInLocaSelectFragment cardIssueTripleInLocaSelectFragment, getDatagroupHash getdatagrouphash) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardIssueTripleInLocaSelectFragment, getdatagrouphash);
        int i4 = IAuthTabCallback_Parcel + 117;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i5)) | i9;
        int i11 = (~((~i5) | i7 | i4)) | (~(i8 | i2));
        int i12 = i2 + i4 + i + (531708263 * i3) + ((-608630064) * i6);
        int i13 = i12 * i12;
        int i14 = (i2 * (-228234701)) + 730857472 + ((-228234701) * i4) + (i9 * (-1010133554)) + (i10 * (-1010133554)) + ((-1010133554) * i11) + ((-1238368256) * i) + ((-45088768) * i3) + ((-419430400) * i6) + ((-1471938560) * i13);
        int i15 = ((i2 * (-1679524527)) - 150938974) + (i4 * (-1679524527)) + (i9 * 282) + (i10 * 282) + (i11 * 282) + (i * (-1679524245)) + (i3 * (-166744051)) + (i6 * 2062148848) + (i13 * (-865337344));
        int i16 = i14 + (i15 * i15 * (-1617166336));
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public CardIssueTripleInLocaSelectFragment() throws Throwable {
        super(R.layout.fragment_card_issue_triple_in_loca_select);
        this.onExtraCallbackWithResult = preFillDefault.onExtraCallbackWithResult(this, IAuthTabCallback.IAuthTabCallback);
        this.IAuthTabCallbackStub = new getDataGroupNumber(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueTripleInLocaSelectFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueTripleInLocaSelectFragment.onExtraCallbackWithResult(this.f$0, (getDatagroupHash) obj);
            }
        });
        Object[] objArr = new Object[1];
        a(new char[]{56871, 35493, 5817, 20992, 14881, 6274, 59962, 441, 7413, 505, 44992, 25528, 59829, 59911, 29993, 43001, 61825, 3950, 56871, 46251, 15017, 31860, 25283, 46435, 45058, 22300, 5295, 38382, 38198, 53278, 61045, 58525, 49644, 7034, 36176, 43899, 20675, 49393, 34399, 21402, 1638, 19521, 4232, 52283, 9285, 53009, 33878, 27645, 36176, 43899}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 50, objArr);
        getDatagroupHash getdatagrouphash = new getDatagroupHash(((String) objArr[0]).intern(), "통신료 할인", "SKT, KT, LG, U+, MVNO", "TELECOMMUNICATION", false, null, 48, null);
        Object[] objArr2 = new Object[1];
        a(new char[]{56871, 35493, 5817, 20992, 14881, 6274, 59962, 441, 7413, 505, 44992, 25528, 59829, 59911, 29993, 43001, 61825, 3950, 56871, 46251, 15017, 31860, 50798, 54762, 7128, 489, 44363, 12948, 49644, 7034, 36176, 43899, 20675, 49393, 34399, 21402, 59829, 59911, 11346, 46889, 19819, 1408, 44992, 25528, 42973, 25533, 62606, 47181, 3371, 7016, 56871, 46251, 11922, 38334, 15453, 38607}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 55, objArr2);
        getDatagroupHash getdatagrouphash2 = new getDatagroupHash(((String) objArr2[0]).intern(), "렌탈료 할인", "정수기, 비데 등 렌탈 정기 결제", "RENTAL", false, null, 48, null);
        Object[] objArr3 = new Object[1];
        a(new char[]{56871, 35493, 5817, 20992, 14881, 6274, 59962, 441, 7413, 505, 44992, 25528, 59829, 59911, 29993, 43001, 61825, 3950, 56871, 46251, 15017, 31860, 25283, 46435, 45058, 22300, 5295, 38382, 38198, 53278, 61045, 58525, 49644, 7034, 36176, 43899, 20675, 49393, 34399, 21402, 1638, 19521, 4232, 52283, 4904, 19914, 33878, 27645, 36176, 43899}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 51, objArr3);
        getDatagroupHash getdatagrouphash3 = new getDatagroupHash(((String) objArr3[0]).intern(), "교육비 할인", "학원, 학습지, 유치원, 어린이집 ", "EDUCATION", false, null, 48, null);
        Object[] objArr4 = new Object[1];
        a(new char[]{56871, 35493, 5817, 20992, 14881, 6274, 59962, 441, 7413, 505, 44992, 25528, 59829, 59911, 29993, 43001, 61825, 3950, 56871, 46251, 15017, 31860, 50798, 54762, 7128, 489, 44363, 12948, 49644, 7034, 36176, 43899, 20675, 49393, 34399, 21402, 59829, 59911, 11346, 46889, 14330, 21982, 47160, 53868, 28944, 1731, 24298, 3872, 14872, 8082, 33878, 27645, 36176, 43899}, TextUtils.lastIndexOf("", '0', 0) + 55, objArr4);
        getDatagroupHash getdatagrouphash4 = new getDatagroupHash(((String) objArr4[0]).intern(), "OTT 할인", "넷플릭스, 유튜브, 웨이브, 왓챠, 멜론, 지니뮤직, 디즈니플러스", "OTT", false, null, 48, null);
        Object[] objArr5 = new Object[1];
        a(new char[]{56871, 35493, 5817, 20992, 14881, 6274, 59962, 441, 7413, 505, 44992, 25528, 59829, 59911, 29993, 43001, 61825, 3950, 56871, 46251, 15017, 31860, 50798, 54762, 7128, 489, 44363, 12948, 49644, 7034, 36176, 43899, 20675, 49393, 34399, 21402, 59829, 59911, 11346, 46889, 42110, 21442, 23166, 2119, 47588, 62886, 45058, 22300, 40872, 41173, 5624, 3112, 14330, 21982, 57821, 24501, 24877, 11121, 11922, 38334, 15453, 38607}, Process.getGidForName("") + 62, objArr5);
        this.asInterface = CollectionsKt.listOf(new getDatagroupHash[]{getdatagrouphash, getdatagrouphash2, getdatagrouphash3, getdatagrouphash4, new getDatagroupHash(((String) objArr5[0]).intern(), "보험 할인", "생명, 자동차, 화재, 운전자", "INSURANCE", false, null, 48, null)});
        this.onNavigationEvent = new ArrayList<>();
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<View, UTIL_Base64Encode> {
        public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();

        IAuthTabCallback() {
            super(1, UTIL_Base64Encode.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueTripleInLocaSelectBinding;", 0);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final UTIL_Base64Encode invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return UTIL_Base64Encode.onExtraCallbackWithResult(view);
        }
    }

    private final UTIL_Base64Encode onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        UTIL_Base64Encode uTIL_Base64Encode = (UTIL_Base64Encode) this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, onExtraCallback[0]);
        int i4 = IAuthTabCallback_Parcel + 13;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return uTIL_Base64Encode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(CardIssueTripleInLocaSelectFragment cardIssueTripleInLocaSelectFragment, getDatagroupHash getdatagrouphash) {
        int i = 2 % 2;
        int i2 = access100 + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getdatagrouphash, "");
            cardIssueTripleInLocaSelectFragment.onWarmupCompleted = getdatagrouphash;
            cardIssueTripleInLocaSelectFragment.IAuthTabCallbackStub();
            cardIssueTripleInLocaSelectFragment.asBinder();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(getdatagrouphash, "");
        cardIssueTripleInLocaSelectFragment.onWarmupCompleted = getdatagrouphash;
        cardIssueTripleInLocaSelectFragment.IAuthTabCallbackStub();
        cardIssueTripleInLocaSelectFragment.asBinder();
        int i3 = 19 / 0;
        return Unit.INSTANCE;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), -2027322611, handleRemoveKey.onExtraCallbackWithResult(), 2027322613, new Object[]{this}, iOnExtraCallbackWithResult, handleRemoveKey.onExtraCallbackWithResult());
        onExtraCallback();
        onWarmupCompleted().onNavigationEvent.setAdapter(this.IAuthTabCallbackStub);
        extraCommand.IAuthTabCallback(requireBaseActivity().getOnBackPressedDispatcher(), this, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueTripleInLocaSelectFragment$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return CardIssueTripleInLocaSelectFragment.IAuthTabCallback(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 2, (Object) null);
        int i2 = access100 + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(CardIssueTripleInLocaSelectFragment cardIssueTripleInLocaSelectFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = access100 + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        if (cardIssueTripleInLocaSelectFragment.asBinder != 0) {
            int i4 = access100 + 59;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            cardIssueTripleInLocaSelectFragment.onWarmupCompleted = null;
            cardIssueTripleInLocaSelectFragment.onWarmupCompleted().onExtraCallback.asInterface().setEnabled(false);
            Object[] objArr = {cardIssueTripleInLocaSelectFragment.onWarmupCompleted().onExtraCallback};
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            ((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setVisibility(8);
            cardIssueTripleInLocaSelectFragment.onExtraCallback();
        } else {
            RippleNode.onNavigationEvent(cardIssueTripleInLocaSelectFragment).access100();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CardIssueTripleInLocaSelectFragment cardIssueTripleInLocaSelectFragment = (CardIssueTripleInLocaSelectFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        cardIssueTripleInLocaSelectFragment.onWarmupCompleted().onExtraCallbackWithResult.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        cardIssueTripleInLocaSelectFragment.onWarmupCompleted().onExtraCallbackWithResult.setTitleTextColor(setBodyokhttp.onExtraCallback(cardIssueTripleInLocaSelectFragment).onUnminimized());
        int i4 = access100 + 105;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return null;
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = 0;
        this.onNavigationEvent.clear();
        TdsTopV2View tdsTopV2View = onWarmupCompleted().onExtraCallbackWithResult;
        String string = getString(R.string.app_card_issue_triple_in_loca_title, new Object[]{40});
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        onWarmupCompleted().IAuthTabCallback.onExtraCallbackWithResult();
        this.IAuthTabCallbackStub.onExtraCallbackWithResult(this.asInterface, true);
        int i4 = access100 + 47;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = 1;
        onExtraCallbackWithResult(0);
        onWarmupCompleted().IAuthTabCallback.onNavigationEvent();
        TdsTopV2View tdsTopV2View = onWarmupCompleted().onExtraCallbackWithResult;
        String string = getString(R.string.app_card_issue_triple_in_loca_title, new Object[]{80});
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        asBinder();
        int i4 = access100 + 111;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void asInterface() {
        int i = 2 % 2;
        int i2 = access100 + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = 2;
        onExtraCallbackWithResult(1);
        onWarmupCompleted().IAuthTabCallback.onWarmupCompleted();
        TdsTopV2View tdsTopV2View = onWarmupCompleted().onExtraCallbackWithResult;
        String string = getString(R.string.app_card_issue_triple_in_loca_title, new Object[]{120});
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        asBinder();
        int i4 = access100 + 49;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallbackStub() {
        Object obj;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.IAuthTabCallbackStub.onExtraCallbackWithResult().iterator();
        while (it.hasNext()) {
            arrayList.add(getDatagroupHash.onNavigationEvent((getDatagroupHash) it.next(), null, null, null, null, false, null, 47, null));
        }
        Iterator it2 = arrayList.iterator();
        int i2 = access100 + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            String strOnExtraCallbackWithResult = ((getDatagroupHash) next).onExtraCallbackWithResult();
            getDatagroupHash getdatagrouphash = this.onWarmupCompleted;
            if (Intrinsics.areEqual(strOnExtraCallbackWithResult, getdatagrouphash != null ? getdatagrouphash.onExtraCallbackWithResult() : null)) {
                int i4 = access100 + 9;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                obj = next;
                break;
            }
        }
        getDatagroupHash getdatagrouphash2 = (getDatagroupHash) obj;
        if (getdatagrouphash2 != null) {
            arrayList.set(arrayList.indexOf(getdatagrouphash2), getDatagroupHash.onNavigationEvent(getdatagrouphash2, null, null, null, null, true, null, 47, null));
            int i6 = access100 + 93;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
        }
        this.IAuthTabCallbackStub.onExtraCallbackWithResult(arrayList, true);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 23;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 91;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (IAuthTabCallbackStubProxy ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getInterfaceDescriptor);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                        int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', i3);
                        int i12 = 12435 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mirror, iLastIndexOf, i12, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i13 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onTransact ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackDefault)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 9 - TextUtils.indexOf((CharSequence) "", '0'), 12434 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i13 + 1;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 15, 19901 - Color.green(0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i14 = $11 + 7;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final void onExtraCallbackWithResult(int i) {
        Object next;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.IAuthTabCallbackStub.onExtraCallbackWithResult().iterator();
        int i3 = IAuthTabCallback_Parcel + 105;
        while (true) {
            access100 = i3 % 128;
            int i4 = i3 % 2;
            if (!it.hasNext()) {
                break;
            }
            arrayList.add(getDatagroupHash.onNavigationEvent((getDatagroupHash) it.next(), null, null, null, null, false, null, 47, null));
            i3 = IAuthTabCallback_Parcel + 77;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            int i5 = access100 + 3;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                ((getDatagroupHash) it2.next()).onExtraCallbackWithResult();
                obj.hashCode();
                throw null;
            }
            next = it2.next();
            String strOnExtraCallbackWithResult = ((getDatagroupHash) next).onExtraCallbackWithResult();
            getDatagroupHash getdatagrouphash = this.onWarmupCompleted;
            if (Intrinsics.areEqual(strOnExtraCallbackWithResult, getdatagrouphash != null ? getdatagrouphash.onExtraCallbackWithResult() : null)) {
                int i6 = access100 + 51;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                break;
            }
        }
        getDatagroupHash getdatagrouphash2 = (getDatagroupHash) next;
        if (getdatagrouphash2 != null) {
            arrayList.remove(getdatagrouphash2);
            arrayList.add(i, getDatagroupHash.onNavigationEvent(getdatagrouphash2, null, null, null, null, false, (getDatagroupHash.onWarmupCompleted) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), 371750998, handleRemoveKey.onExtraCallbackWithResult(), -371750998, new Object[]{this, Integer.valueOf(i)}, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult()), 31, null));
            this.onNavigationEvent.add(getdatagrouphash2.onExtraCallbackWithResult());
        }
        this.IAuthTabCallbackStub.onExtraCallbackWithResult(arrayList, true);
        this.onWarmupCompleted = null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CardIssueTripleInLocaSelectFragment cardIssueTripleInLocaSelectFragment = (CardIssueTripleInLocaSelectFragment) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = access100 + 91;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (iIntValue == 0) {
            String string = cardIssueTripleInLocaSelectFragment.getString(R.string.app_card_issue_triple_in_loca_badge_title, new Object[]{40});
            Intrinsics.checkNotNullExpressionValue(string, "");
            return new getDatagroupHash.onWarmupCompleted(string, new TdsBadgeV1View.onExtraCallbackWithResult(TdsBadgeV1View.onWarmupCompleted.BLUE, TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.SMALL));
        }
        int i4 = i3 + 117;
        access100 = i4 % 128;
        if (i4 % 2 != 0 ? iIntValue != 1 : iIntValue != 0) {
            return null;
        }
        String string2 = cardIssueTripleInLocaSelectFragment.getString(R.string.app_card_issue_triple_in_loca_badge_title, new Object[]{80});
        Intrinsics.checkNotNullExpressionValue(string2, "");
        getDatagroupHash.onWarmupCompleted onwarmupcompleted = new getDatagroupHash.onWarmupCompleted(string2, new TdsBadgeV1View.onExtraCallbackWithResult(TdsBadgeV1View.onWarmupCompleted.YELLOW, TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.SMALL));
        int i5 = access100 + 49;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return onwarmupcompleted;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(CardIssueTripleInLocaSelectFragment cardIssueTripleInLocaSelectFragment, View view) {
        getDatagroupHash getdatagrouphash;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        cardIssueTripleInLocaSelectFragment.onWarmupCompleted().onExtraCallback.asInterface().setEnabled(false);
        int i4 = cardIssueTripleInLocaSelectFragment.asBinder;
        if (i4 != 0) {
            int i5 = access100 + 13;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0 ? i4 == 1 : i4 == 0) {
                cardIssueTripleInLocaSelectFragment.asInterface();
                i = access100 + 113;
                i2 = i % 128;
            } else if (i4 == 2 && (getdatagrouphash = cardIssueTripleInLocaSelectFragment.onWarmupCompleted) != null) {
                cardIssueTripleInLocaSelectFragment.onNavigationEvent.add(getdatagrouphash.onExtraCallbackWithResult());
                cardIssueTripleInLocaSelectFragment.onTransact();
                getDigestAlgorithms<getExponent1> getdigestalgorithmsWriteTypedObject = cardIssueTripleInLocaSelectFragment.writeTypedObject();
                TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(cardIssueTripleInLocaSelectFragment);
                CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = cardIssueTripleInLocaSelectFragment.extraCallback();
                String str = cardIssueTripleInLocaSelectFragment.onNavigationEvent.get(0);
                Intrinsics.checkNotNullExpressionValue(str, "");
                String str2 = cardIssueTripleInLocaSelectFragment.onNavigationEvent.get(1);
                Intrinsics.checkNotNullExpressionValue(str2, "");
                String str3 = cardIssueTripleInLocaSelectFragment.onNavigationEvent.get(2);
                Intrinsics.checkNotNullExpressionValue(str3, "");
                getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback, new getStringArrayList(str, str2, str3), (String) null, cardIssueTripleInLocaSelectFragment.onWarmupCompleted().onExtraCallback.asInterface().getText().toString(), (Map) null, 40, (Object) null);
                i = access100 + 67;
                i2 = i % 128;
            }
            IAuthTabCallback_Parcel = i2;
            int i6 = i % 2;
        } else {
            cardIssueTripleInLocaSelectFragment.onNavigationEvent();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = access100 + 65;
        IAuthTabCallback_Parcel = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 67 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CardIssueTripleInLocaSelectFragment cardIssueTripleInLocaSelectFragment = (CardIssueTripleInLocaSelectFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        cardIssueTripleInLocaSelectFragment.onWarmupCompleted = null;
        cardIssueTripleInLocaSelectFragment.onWarmupCompleted().onExtraCallback.asInterface().setEnabled(false);
        Object[] objArr2 = {cardIssueTripleInLocaSelectFragment.onWarmupCompleted().onExtraCallback};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        ((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr2, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setVisibility(8);
        cardIssueTripleInLocaSelectFragment.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 97;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onTransact() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1350583L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueTripleInLocaSelectFragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return CardIssueTripleInLocaSelectFragment.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 13;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
        }
    }

    private static final Unit onWarmupCompleted(CardIssueTripleInLocaSelectFragment cardIssueTripleInLocaSelectFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{55479, 6510, 27715, 29031, 17423, 45985, 42973, 25533}, 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), cardIssueTripleInLocaSelectFragment.extraCallback().onActivityResized());
        setDetectableSize.onExtraCallback("card_id", cardIssueTripleInLocaSelectFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("funnel_id", cardIssueTripleInLocaSelectFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("screen_type", cardIssueTripleInLocaSelectFragment.readTypedObject().onExtraCallback());
        setDetectableSize.onExtraCallback("benefit1", cardIssueTripleInLocaSelectFragment.onNavigationEvent.get(0));
        setDetectableSize.onExtraCallback("benefit2", cardIssueTripleInLocaSelectFragment.onNavigationEvent.get(1));
        setDetectableSize.onExtraCallback("benefit3", cardIssueTripleInLocaSelectFragment.onNavigationEvent.get(2));
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 107;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return unit;
    }

    private final void asBinder() {
        boolean z;
        int i = 2 % 2;
        int i2 = access100 + 121;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            TdsButtonV1View tdsButtonV1ViewAsInterface = onWarmupCompleted().onExtraCallback.asInterface();
            if (this.onWarmupCompleted != null) {
                int i3 = IAuthTabCallback_Parcel + 99;
                int i4 = i3 % 128;
                access100 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 77;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            tdsButtonV1ViewAsInterface.setEnabled(z);
            TdsBottomCtaV1View tdsBottomCtaV1View = onWarmupCompleted().onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
            String string = getString(R.string.next);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueTripleInLocaSelectFragment$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return (Unit) CardIssueTripleInLocaSelectFragment.onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), -1951750340, handleRemoveKey.onExtraCallbackWithResult(), 1951750341, new Object[]{this.f$0, (View) obj}, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult());
                }
            }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            if (this.asBinder == 2) {
                Object[] objArr = {onWarmupCompleted().onExtraCallback};
                int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                ((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setTheme(new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null));
                TdsBottomCtaV1View tdsBottomCtaV1View2 = onWarmupCompleted().onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
                String string2 = getString(R.string.app_cardrecommend_issuev2_ui___94e15db13c);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1View2, string2, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueTripleInLocaSelectFragment$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj) {
                        return CardIssueTripleInLocaSelectFragment.onExtraCallback(this.f$0, (View) obj);
                    }
                }, (TdsButtonV1View.asInterface) null, 4, (Object) null);
                return;
            }
            Object[] objArr2 = {onWarmupCompleted().onExtraCallback};
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            ((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, objArr2, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setVisibility(8);
            return;
        }
        onWarmupCompleted().onExtraCallback.asInterface();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueTripleInLocaSelectFragment cardIssueTripleInLocaSelectFragment, View view) {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), -1951750340, handleRemoveKey.onExtraCallbackWithResult(), 1951750341, new Object[]{cardIssueTripleInLocaSelectFragment, view}, iOnExtraCallbackWithResult, handleRemoveKey.onExtraCallbackWithResult());
    }

    private final getDatagroupHash.onWarmupCompleted IAuthTabCallback(int i) {
        return (getDatagroupHash.onWarmupCompleted) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), 371750998, handleRemoveKey.onExtraCallbackWithResult(), -371750998, new Object[]{this, Integer.valueOf(i)}, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult());
    }

    private final void IAuthTabCallback() {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), -2027322611, handleRemoveKey.onExtraCallbackWithResult(), 2027322613, new Object[]{this}, iOnExtraCallbackWithResult, handleRemoveKey.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(CardIssueTripleInLocaSelectFragment cardIssueTripleInLocaSelectFragment, View view) {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), -599524367, handleRemoveKey.onExtraCallbackWithResult(), 599524370, new Object[]{cardIssueTripleInLocaSelectFragment, view}, iOnExtraCallbackWithResult, handleRemoveKey.onExtraCallbackWithResult());
    }

    static void onExtraCallbackWithResult() {
        onTransact = (char) 19898;
        IAuthTabCallbackDefault = (char) 14159;
        IAuthTabCallbackStubProxy = (char) 58866;
        getInterfaceDescriptor = (char) 45187;
    }
}

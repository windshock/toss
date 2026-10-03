package viva.republica.toss.cardrecommend.issuev2.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CertificationRequest;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.DynamicLoader;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.RippleNode;
import o.access15300;
import o.createNativeAdRatingApi;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.getSubjectPublicKeyInfo;
import o.isSignaturePolicyImplied;
import o.r8lambdap2AUa7LEnrxhmLLPyD8tYwKakeE;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueBottomSheetFragment extends r8lambdap2AUa7LEnrxhmLLPyD8tYwKakeE {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private static char[] onNavigationEvent = {32623, 32636, 32627};
    private static int IAuthTabCallback = -1184334055;
    private static boolean asBinder = true;
    private static boolean IAuthTabCallbackDefault = true;
    private final Lazy onExtraCallbackWithResult = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CardIssueOverviewViewModel.class), new onExtraCallbackWithResult(this), new onExtraCallback(null, this), new onWarmupCompleted(this));
    private onNavigationEvent onExtraCallback = onNavigationEvent.NONE;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[onNavigationEvent.values().length];
            try {
                iArr[onNavigationEvent.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onNavigationEvent.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onNavigationEvent.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CardIssueBottomSheetFragment cardIssueBottomSheetFragment = (CardIssueBottomSheetFragment) objArr[0];
        Dialog dialog = (Dialog) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(cardIssueBottomSheetFragment, dialog, view);
        }
        onExtraCallback(cardIssueBottomSheetFragment, dialog, view);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueBottomSheetFragment cardIssueBottomSheetFragment, Dialog dialog, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueBottomSheetFragment, dialog, view);
        int i4 = onTransact + 83;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = (~i5) | i8;
        int i10 = i7 | (~i9);
        int i11 = i5 | i8;
        int i12 = ~(i9 | i6);
        int i13 = i4 + i6 + i2 + (1075552530 * i3) + ((-1519595880) * i);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i4) - 1639710720) + ((-2116975300) * i6) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i2) + ((-189792256) * i3) + (1111490560 * i) + (1415839744 * i14);
        int i16 = (i4 * 251836610) + 257048825 + (i6 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i2 * 251837547) + (i3 * 1710852742) + (i * (-1855850104)) + (i14 * (-1244921856));
        return i15 + ((i16 * i16) * (-1300496384)) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        List list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tdsBottomCtaV1View, list);
        int i4 = IAuthTabCallbackStub + 103;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public boolean at_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 35;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return 1009533L;
    }

    private final getDigestAlgorithms<CertificationRequest> asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Parcelable parcelable = requireArguments().getParcelable("navigator");
            Intrinsics.checkNotNull(parcelable);
            return (getDigestAlgorithms) parcelable;
        }
        Parcelable parcelable2 = requireArguments().getParcelable("navigator");
        Intrinsics.checkNotNull(parcelable2);
        int i3 = 80 / 0;
        return (getDigestAlgorithms) parcelable2;
    }

    private final CertificationRequest onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        CertificationRequest certificationRequest = (CertificationRequest) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{asBinder()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
        int i3 = IAuthTabCallbackStub + 11;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return certificationRequest;
    }

    private final CardIssueOverviewViewModel IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        CardIssueOverviewViewModel cardIssueOverviewViewModel = (CardIssueOverviewViewModel) this.onExtraCallbackWithResult.getValue();
        int i3 = IAuthTabCallbackStub + 45;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return cardIssueOverviewViewModel;
        }
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("card_id", IAuthTabCallbackStub().IAuthTabCallbackStub());
        linkedHashMap.put("funnel_id", IAuthTabCallbackStub().getInterfaceDescriptor());
        linkedHashMap.put("session_id", IAuthTabCallbackStub().ICustomTabsCallbackStubProxy());
        linkedHashMap.put("screen_type", onExtraCallback().onExtraCallback());
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, 127 - View.resolveSize(0, 0), objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), IAuthTabCallbackStub().onActivityResized());
        linkedHashMap.put("referrer_item_id", IAuthTabCallbackStub().onPostMessage());
        linkedHashMap.put("service_referrer", IAuthTabCallbackStub().ICustomTabsCallbackStub());
        Map<String, Object> interfaceDescriptor = onExtraCallback().getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            int i2 = onTransact + 19;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            linkedHashMap.putAll(interfaceDescriptor);
            int i4 = onTransact + 125;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return linkedHashMap;
    }

    private final LinearLayout onExtraCallbackWithResult() {
        int i = 2 % 2;
        Dialog dialog = getDialog();
        Object obj = null;
        if (dialog == null) {
            return null;
        }
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = (LinearLayout) dialog.findViewById(R.id.freeformContainer);
        int i4 = IAuthTabCallbackStub + 77;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return linearLayout;
        }
        obj.hashCode();
        throw null;
    }

    private final BottomSheetHeader onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getDialog();
            obj.hashCode();
            throw null;
        }
        Dialog dialog = getDialog();
        if (dialog == null) {
            return null;
        }
        BottomSheetHeader bottomSheetHeaderFindViewById = dialog.findViewById(R.id.header);
        int i3 = onTransact + 85;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return bottomSheetHeaderFindViewById;
    }

    private final TdsBottomCtaV1View onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getDialog();
            obj.hashCode();
            throw null;
        }
        Dialog dialog = getDialog();
        if (dialog == null) {
            int i3 = IAuthTabCallbackStub + 103;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i4 = onTransact + 47;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        TdsBottomCtaV1View tdsBottomCtaV1ViewFindViewById = dialog.findViewById(R.id.bottomCta);
        if (i5 == 0) {
            return tdsBottomCtaV1ViewFindViewById;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onNavigationEvent PRIMARY = new onNavigationEvent("PRIMARY", 0);
        public static final onNavigationEvent SECONDARY = new onNavigationEvent("SECONDARY", 1);
        public static final onNavigationEvent NONE = new onNavigationEvent("NONE", 2);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            return new onNavigationEvent[]{PRIMARY, SECONDARY, NONE};
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            return $ENTRIES;
        }

        public static onNavigationEvent valueOf(String str) {
            return (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
        }

        public static onNavigationEvent[] values() {
            return (onNavigationEvent[]) $VALUES.clone();
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
        }
    }

    private static final Unit onExtraCallback(CardIssueBottomSheetFragment cardIssueBottomSheetFragment, Dialog dialog, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            cardIssueBottomSheetFragment.onExtraCallback = onNavigationEvent.PRIMARY;
            dialog.dismiss();
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        cardIssueBottomSheetFragment.onExtraCallback = onNavigationEvent.PRIMARY;
        dialog.dismiss();
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 63;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return unit2;
    }

    private static final Unit onExtraCallbackWithResult(CardIssueBottomSheetFragment cardIssueBottomSheetFragment, Dialog dialog, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        cardIssueBottomSheetFragment.onExtraCallback = onNavigationEvent.SECONDARY;
        dialog.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 31;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(TdsBottomCtaV1View tdsBottomCtaV1View, List list) {
        int i = 2 % 2;
        List list2 = list;
        boolean z = true;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((isSignaturePolicyImplied) it.next()).onTransact()) {
                    int i2 = IAuthTabCallbackStub + 121;
                    onTransact = i2 % 128;
                    int i3 = i2 % 2;
                    z = false;
                    break;
                }
            }
        }
        tdsBottomCtaV1View.setEnabledCta(z);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 33;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setupDialog(@NotNull final Dialog dialog, int i) {
        BottomSheetHeader bottomSheetHeaderOnNavigationEvent;
        final TdsBottomCtaV1View tdsBottomCtaV1ViewOnWarmupCompleted;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(dialog, "");
        super/*androidx.appcompat.app.AppCompatDialogFragment*/.setupDialog(dialog, i);
        dialog.setContentView(R.layout.dialog_card_issue_bottom_sheet);
        LinearLayout linearLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (linearLayoutOnExtraCallbackWithResult == null || (bottomSheetHeaderOnNavigationEvent = onNavigationEvent()) == null || (tdsBottomCtaV1ViewOnWarmupCompleted = onWarmupCompleted()) == null) {
            return;
        }
        bottomSheetHeaderOnNavigationEvent.setTitle(onExtraCallback().asInterface());
        bottomSheetHeaderOnNavigationEvent.setDescription(onExtraCallback().IAuthTabCallbackStub());
        List<createNativeAdRatingApi> listOnWarmupCompleted = onExtraCallback().onWarmupCompleted();
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
        for (createNativeAdRatingApi createnativeadratingapi : listOnWarmupCompleted) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            arrayList.add(getSubjectPublicKeyInfo.onExtraCallback(createnativeadratingapi, contextRequireContext, RippleNode.onNavigationEvent(this), IAuthTabCallbackStub(), asBinder()));
        }
        linearLayoutOnExtraCallbackWithResult.removeAllViews();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linearLayoutOnExtraCallbackWithResult.addView(((isSignaturePolicyImplied) it.next()).onWarmupCompleted());
        }
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1ViewOnWarmupCompleted, onExtraCallback().onExtraCallbackWithResult().onExtraCallback().onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, dialog, (View) obj};
                int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                return (Unit) CardIssueBottomSheetFragment.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -210095993, objArr, iOnWarmupCompleted, 210095994);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        String strOnWarmupCompleted = onExtraCallback().onExtraCallbackWithResult().onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            int i3 = onTransact + 31;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            tdsBottomCtaV1ViewOnWarmupCompleted.setTopDescription(strOnWarmupCompleted);
        }
        DynamicLoader dynamicLoaderOnNavigationEvent = onExtraCallback().onExtraCallbackWithResult().onNavigationEvent();
        if (dynamicLoaderOnNavigationEvent != null) {
            TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1ViewOnWarmupCompleted, dynamicLoaderOnNavigationEvent.onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return CardIssueBottomSheetFragment.IAuthTabCallback(this.f$0, dialog, (View) obj);
                }
            }, (TdsButtonV1View.asInterface) null, 4, (Object) null);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof RequireInput) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        int i5 = onTransact + 25;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        while (it2.hasNext()) {
            ((RequireInput) it2.next()).onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment$$ExternalSyntheticLambda2
                public final Object invoke() {
                    Object[] objArr = {tdsBottomCtaV1ViewOnWarmupCompleted, arrayList};
                    int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                    return (Unit) CardIssueBottomSheetFragment.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1509650229, objArr, iOnWarmupCompleted, -1509650229);
                }
            });
        }
        boolean z = true;
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                int i7 = onTransact + 87;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    ((isSignaturePolicyImplied) it3.next()).onTransact();
                    throw null;
                }
                if (!((isSignaturePolicyImplied) it3.next()).onTransact()) {
                    z = false;
                    break;
                }
            }
        }
        tdsBottomCtaV1ViewOnWarmupCompleted.setEnabledCta(z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[PHI: r12
      0x0037: PHI (r12v4 int) = (r12v3 int), (r12v23 int) binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDismiss(@org.jetbrains.annotations.NotNull android.content.DialogInterface r12) throws kotlin.NoWhenBranchMatchedException {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment.onTransact
            int r1 = r1 + 57
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            java.lang.String r4 = ""
            if (r1 == 0) goto L25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r4)
            super/*androidx.fragment.app.DialogFragment*/.onDismiss(r12)
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment$onNavigationEvent r12 = r11.onExtraCallback
            int[] r1 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment.IAuthTabCallback.IAuthTabCallback
            int r12 = r12.ordinal()
            r12 = r1[r12]
            if (r12 == r3) goto L51
            goto L37
        L25:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r4)
            super/*androidx.fragment.app.DialogFragment*/.onDismiss(r12)
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment$onNavigationEvent r12 = r11.onExtraCallback
            int[] r1 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment.IAuthTabCallback.IAuthTabCallback
            int r12 = r12.ordinal()
            r12 = r1[r12]
            if (r12 == r3) goto L51
        L37:
            if (r12 == r0) goto L44
            r1 = 3
            if (r12 != r1) goto L3e
            r12 = r2
            goto L5d
        L3e:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L44:
            o.CertificationRequest r12 = r11.onExtraCallback()
            o.reportDexLoadingIssue r12 = r12.onExtraCallbackWithResult()
            o.DynamicLoader r12 = r12.onNavigationEvent()
            goto L5d
        L51:
            o.CertificationRequest r12 = r11.onExtraCallback()
            o.reportDexLoadingIssue r12 = r12.onExtraCallbackWithResult()
            o.DynamicLoader r12 = r12.onExtraCallback()
        L5d:
            if (r12 == 0) goto Laf
            o.getDigestAlgorithms r3 = r11.asBinder()
            o.TypographyKtExternalSyntheticLambda0 r4 = o.RippleNode.onNavigationEvent(r11)
            o.createAdSizeApi r5 = r12.onWarmupCompleted()
            viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel r6 = r11.IAuthTabCallbackStub()
            java.lang.String r7 = r12.onNavigationEvent()
            o.createAudienceNetworkRemoteService r8 = new o.createAudienceNetworkRemoteService
            r8.<init>()
            o.CertificationRequest r1 = r11.onExtraCallback()
            o.reportDexLoadingIssue r1 = r1.onExtraCallbackWithResult()
            java.lang.String r1 = r1.onExtraCallbackWithResult()
            if (r1 == 0) goto Laa
            int r9 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment.onTransact
            int r9 = r9 + 123
            int r10 = r9 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment.IAuthTabCallbackStub = r10
            int r9 = r9 % r0
            if (r9 != 0) goto La2
            java.lang.String r12 = r12.IAuthTabCallback()
            r8.put(r1, r12)
            int r12 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment.onTransact
            int r12 = r12 + 71
            int r1 = r12 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment.IAuthTabCallbackStub = r1
            int r12 = r12 % r0
            goto Laa
        La2:
            java.lang.String r12 = r12.IAuthTabCallback()
            r8.put(r1, r12)
            throw r2
        Laa:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            r3.onWarmupCompleted(r4, r5, r6, r7, r8)
        Laf:
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment$onNavigationEvent r12 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment.onNavigationEvent.NONE
            r11.onExtraCallback = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment.onDismiss(android.content.DialogInterface):void");
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onNavigationEvent;
        long j = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 78 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), 20952 - Drawable.resolveOpacity(0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 75 - (Process.myPid() >> 22), 16036 - TextUtils.lastIndexOf("", '0', 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (IAuthTabCallbackDefault) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i4 = $10 + 95;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] >> iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 63 - View.MeasureSpec.getMode(0), Color.blue(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getTapTimeout() >> 16) + 63, (ViewConfiguration.getWindowTouchSlop() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!asBinder) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i5 = $11 + 59;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                int i7 = $10 + 1;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 4 % 2;
                }
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i9 = $11 + 39;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 63 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), ExpandableListView.getPackedPositionType(0L) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    public static /* synthetic */ Unit onExtraCallback(TdsBottomCtaV1View tdsBottomCtaV1View, List list) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, 1509650229, new Object[]{tdsBottomCtaV1View, list}, iOnWarmupCompleted, -1509650229);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueBottomSheetFragment cardIssueBottomSheetFragment, Dialog dialog, View view) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, -210095993, new Object[]{cardIssueBottomSheetFragment, dialog, view}, iOnWarmupCompleted, 210095994);
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class onExtraCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }
}

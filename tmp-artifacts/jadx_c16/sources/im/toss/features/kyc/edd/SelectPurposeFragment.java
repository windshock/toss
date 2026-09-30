package im.toss.features.kyc.edd;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.features.kyc.edd.SelectPurposeFragment$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.utils.RxUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.SetDetectableSize;
import o.deserializeUriNullableCollection;
import o.extractSceneVersion;
import o.getEnableJsT2;
import o.getExtPages;
import o.getParamImp;
import o.initMiniApp;
import o.isDevSource;
import o.isInnerCrawlingAntPlugin;
import o.readToArray;
import o.setProxySelectorokhttp;
import o.varyMatches;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SelectPurposeFragment extends Hilt_SelectPurposeFragment implements isInnerCrawlingAntPlugin.onNavigationEvent {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;

    @Inject
    public getEnableJsT2 kycHelper;
    private onExtraCallbackWithResult onExtraCallback;
    private TdsBottomCtaV1View onExtraCallbackWithResult;
    private getExtPages onTransact;
    public static final onWarmupCompleted Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
    public static final int onNavigationEvent = 8;
    private final isInnerCrawlingAntPlugin onWarmupCompleted = new isInnerCrawlingAntPlugin(this);
    private final List<getExtPages> IAuthTabCallback = new ArrayList();

    static {
        int i = IAuthTabCallbackDefault + 31;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        SelectPurposeFragment selectPurposeFragment = (SelectPurposeFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(selectPurposeFragment, setDetectableSize);
        int i4 = IAuthTabCallbackStub + 61;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(SelectPurposeFragment selectPurposeFragment, List list) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(selectPurposeFragment, list);
        }
        onExtraCallbackWithResult(selectPurposeFragment, list);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = asInterface + 105;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = (~(i7 | i6)) | i5;
        int i9 = ~i5;
        int i10 = ~(i7 | i9);
        int i11 = ~i6;
        int i12 = i10 | (~(i9 | i11));
        int i13 = (~(i6 | i9)) | (~(i7 | i11));
        int i14 = i3 + i5 + i4 + (417615942 * i2) + (566850886 * i);
        int i15 = i14 * i14;
        int i16 = ((-370608051) * i3) + 147849216 + ((-2147356519) * i5) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i4) + ((-354418688) * i2) + ((-85983232) * i) + ((-608960512) * i15);
        int i17 = (i3 * (-1357469509)) + 140661806 + (i5 * (-1357469617)) + (i8 * 108) + (i12 * 108) + (i13 * 108) + (i4 * (-1357469401)) + (i2 * 1137340586) + (i * 304092074) + (i15 * 1282146304);
        int i18 = i16 + (i17 * i17 * 1158414336);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        int i4 = asInterface + 9;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = asInterface + 13;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        SelectPurposeFragment selectPurposeFragment = (SelectPurposeFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(selectPurposeFragment, view);
        int i4 = asInterface + 63;
        IAuthTabCallbackStub = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(SelectPurposeFragment selectPurposeFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(selectPurposeFragment, th);
        int i4 = asInterface + 63;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(SelectPurposeFragment selectPurposeFragment, List list) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback3, 207537003, iOnExtraCallback2, -207537002, iOnExtraCallback, new Object[]{selectPurposeFragment, list});
        int i4 = IAuthTabCallbackStub + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SelectPurposeFragment selectPurposeFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(selectPurposeFragment, dialogInterface);
        }
        onExtraCallbackWithResult(selectPurposeFragment, dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return 1224767L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ List onExtraCallbackWithResult(SelectPurposeFragment selectPurposeFragment) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 43;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        List<getExtPages> list = selectPurposeFragment.IAuthTabCallback;
        int i5 = i2 + 115;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public /* bridge */ void onExtraCallbackWithResult(@NotNull isDevSource isdevsource, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 85;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        super.onExtraCallbackWithResult(isdevsource, i);
        if (i4 != 0) {
            throw null;
        }
        int i5 = asInterface + 9;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final getEnableJsT2 onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        getEnableJsT2 getenablejst2 = this.kycHelper;
        if (getenablejst2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 11;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return getenablejst2;
        }
        throw null;
    }

    public static final class onNavigationEvent extends View.AccessibilityDelegate {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        onNavigationEvent() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfo.CollectionInfo collectionInfoObtain;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                collectionInfoObtain = AccessibilityNodeInfo.CollectionInfo.obtain(SelectPurposeFragment.onExtraCallbackWithResult(SelectPurposeFragment.this).size(), 0, false);
            } else {
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                collectionInfoObtain = AccessibilityNodeInfo.CollectionInfo.obtain(SelectPurposeFragment.onExtraCallbackWithResult(SelectPurposeFragment.this).size(), 1, false);
            }
            accessibilityNodeInfo.setCollectionInfo(collectionInfoObtain);
        }
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsRecyclerView tdsRecyclerView = new TdsRecyclerView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsRecyclerView.setLayoutManager(new LinearLayoutManager(tdsRecyclerView.getContext(), 1, false));
        tdsRecyclerView.setAdapter(this.onWarmupCompleted);
        tdsRecyclerView.setClipToPadding(false);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsRecyclerView.setLayoutParams(layoutParams);
        tdsRecyclerView.setPadding(tdsRecyclerView.getPaddingLeft(), tdsRecyclerView.getPaddingTop(), tdsRecyclerView.getPaddingRight(), varyMatches.IAuthTabCallback(tdsRecyclerView, 80));
        tdsRecyclerView.setAccessibilityDelegate(new onNavigationEvent());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsRecyclerView);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context2);
        TdsBottomCtaV1View.IAuthTabCallback(tdsBottomCtaV1View, tdsRecyclerView, false, 0, 6, (Object) null);
        String string = getString(R.string.next);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new SelectPurposeFragment$.ExternalSyntheticLambda0(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        this.onExtraCallbackWithResult = tdsBottomCtaV1View;
        int i2 = IAuthTabCallbackStub + 107;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return linearLayout;
        }
        throw null;
    }

    private static final void onWarmupCompleted(SelectPurposeFragment selectPurposeFragment, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        selectPurposeFragment.IAuthTabCallbackStub();
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        int i5 = asInterface + 95;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            asBinder();
            asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        asBinder();
        asInterface();
        int i3 = IAuthTabCallbackStub + 3;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    private final extractSceneVersion IAuthTabCallbackDefault() {
        int i = 2 % 2;
        String string = getString(im.toss.features.kyc.R.string.kyc_purpose_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        extractSceneVersion extractsceneversion = new extractSceneVersion(string, (CharSequence) null, 2, (DefaultConstructorMarker) null);
        int i2 = asInterface + 35;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        return extractsceneversion;
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 87;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SelectPurposeFragment selectPurposeFragment = (SelectPurposeFragment) objArr[0];
        List list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 73;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            selectPurposeFragment.IAuthTabCallback.clear();
            List<getExtPages> list2 = selectPurposeFragment.IAuthTabCallback;
            Intrinsics.checkNotNull(list);
            list2.addAll(list);
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallbackStub + 119;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        selectPurposeFragment.IAuthTabCallback.clear();
        List<getExtPages> list3 = selectPurposeFragment.IAuthTabCallback;
        Intrinsics.checkNotNull(list);
        list3.addAll(list);
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 85;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(SelectPurposeFragment selectPurposeFragment, List list) {
        Object next;
        int i = 2 % 2;
        int i2 = asInterface + 71;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
            if (selectPurposeFragment.onTransact == null) {
                Intrinsics.checkNotNull(list);
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        int i4 = IAuthTabCallbackStub + 25;
                        asInterface = i4 % 128;
                        int i5 = i4 % 2;
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((getExtPages) next).onExtraCallback()) {
                        break;
                    }
                }
                selectPurposeFragment.onTransact = (getExtPages) next;
                selectPurposeFragment.asInterface();
            }
        } else if (selectPurposeFragment.onTransact == null) {
        }
        Intrinsics.checkNotNull(list);
        List<getExtPages> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (getExtPages getextpages : list2) {
            isDevSource isdevsource = new isDevSource(String.valueOf(getextpages.IAuthTabCallback()), getextpages.onExtraCallbackWithResult(), false, 4, (DefaultConstructorMarker) null);
            isdevsource.onWarmupCompleted(Intrinsics.areEqual(getextpages, selectPurposeFragment.onTransact));
            arrayList.add(isdevsource);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(selectPurposeFragment.IAuthTabCallbackDefault());
        arrayList2.addAll(arrayList);
        selectPurposeFragment.onWarmupCompleted.onExtraCallbackWithResult(arrayList2, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r2
      0x001f: PHI (r2v2 androidx.fragment.app.FragmentActivity) = (r2v1 androidx.fragment.app.FragmentActivity), (r2v5 androidx.fragment.app.FragmentActivity) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(SelectPurposeFragment selectPurposeFragment, DialogInterface dialogInterface) {
        FragmentActivity activity;
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            activity = selectPurposeFragment.getActivity();
            int i3 = 74 / 0;
            if (activity != null) {
                int i4 = IAuthTabCallbackStub + 49;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                activity.finish();
            }
        } else {
            activity = selectPurposeFragment.getActivity();
            if (activity != null) {
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStub + 33;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(SelectPurposeFragment selectPurposeFragment, Throwable th) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SelectPurposeFragment", th.getMessage(), th, (Map) null, 8, (Object) null);
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, selectPurposeFragment.requireContext(), true, (initMiniApp) null, (Function0) null, new SelectPurposeFragment$.ExternalSyntheticLambda1(selectPurposeFragment), 12, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private final void asBinder() {
        int i = 2 % 2;
        writeRaw writerawIAuthTabCallback = readToArray.IAuthTabCallback.onNavigationEvent().IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new SelectPurposeFragment$.ExternalSyntheticLambda3(new SelectPurposeFragment$.ExternalSyntheticLambda2(this))).onNavigationEvent(new SelectPurposeFragment$.ExternalSyntheticLambda5(new SelectPurposeFragment$.ExternalSyntheticLambda4(this)), new SelectPurposeFragment$.ExternalSyntheticLambda7(new SelectPurposeFragment$.ExternalSyntheticLambda6(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = asInterface + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onNavigationEvent();
        int i4 = IAuthTabCallbackStub + 65;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(@NotNull isDevSource isdevsource) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        asInterface = i2 % 128;
        getExtPages getextpages = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(isdevsource, "");
            int i3 = 2 / 0;
            if (isdevsource.onNavigationEvent()) {
                Iterator<T> it = this.IAuthTabCallback.iterator();
                int i4 = asInterface + 67;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.areEqual(String.valueOf(((getExtPages) next).IAuthTabCallback()), isdevsource.onExtraCallbackWithResult())) {
                        getextpages = next;
                        break;
                    }
                }
                getextpages = getextpages;
            }
        } else {
            Intrinsics.checkNotNullParameter(isdevsource, "");
            if (isdevsource.onNavigationEvent()) {
            }
        }
        this.onTransact = getextpages;
        asInterface();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void asInterface() {
        int i = 2 % 2;
        TdsBottomCtaV1View tdsBottomCtaV1View = this.onExtraCallbackWithResult;
        if (tdsBottomCtaV1View != null) {
            int i2 = asInterface + 13;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            boolean z = false;
            if (i2 % 2 == 0) {
                int i4 = 77 / 0;
                if (this.onTransact != null) {
                    z = true;
                } else {
                    int i5 = i3 + 71;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else if (this.onTransact != null) {
            }
            tdsBottomCtaV1View.setEnabledCta(z);
            int i7 = asInterface + 73;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private final void IAuthTabCallbackStub() {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getExtPages getextpages = this.onTransact;
        if (getextpages != null && (onextracallbackwithresult = this.onExtraCallback) != null) {
            int i4 = i3 + 113;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                onextracallbackwithresult.onWarmupCompleted(getextpages);
                obj.hashCode();
                throw null;
            }
            onextracallbackwithresult.onWarmupCompleted(getextpages);
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1224769L, false, (String) null, (Map) null, new SelectPurposeFragment$.ExternalSyntheticLambda8(this), 14, (Object) null);
    }

    private static final Unit onNavigationEvent(SelectPurposeFragment selectPurposeFragment, SetDetectableSize setDetectableSize) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = asInterface + 125;
        IAuthTabCallbackStub = i4 % 128;
        String strOnExtraCallbackWithResult = null;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(selectPurposeFragment.getScreenParams());
            getExtPages getextpages = selectPurposeFragment.onTransact;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(selectPurposeFragment.getScreenParams());
        getExtPages getextpages2 = selectPurposeFragment.onTransact;
        if (getextpages2 != null) {
            strOnExtraCallbackWithResult = getextpages2.onExtraCallbackWithResult();
            i = IAuthTabCallbackStub + 123;
            i2 = i % 128;
        } else {
            i = IAuthTabCallbackStub + 27;
            i2 = i % 128;
        }
        asInterface = i2;
        int i5 = i % 2;
        setDetectableSize.onExtraCallback("purpose", strOnExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStub + 39;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public Map<String, Object> getScreenParams() {
        Map<String, Object> mapOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            mapOnNavigationEvent = onExtraCallback().onNavigationEvent();
            int i3 = 41 / 0;
        } else {
            mapOnNavigationEvent = onExtraCallback().onNavigationEvent();
        }
        int i4 = asInterface + 33;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return mapOnNavigationEvent;
        }
        throw null;
    }

    @Override // im.toss.features.kyc.edd.Hilt_SelectPurposeFragment
    public void onAttach(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        if (!(context instanceof onExtraCallbackWithResult)) {
            int i2 = asInterface + 53;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                getParentFragment();
                throw null;
            }
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null && !(parentFragment instanceof onExtraCallbackWithResult)) {
                throw new IllegalStateException("Must implement callback from parent Activity or Fragment");
            }
            context = (onExtraCallbackWithResult) getParentFragment();
            int i3 = asInterface + 75;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        }
        this.onExtraCallback = (onExtraCallbackWithResult) context;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SelectPurposeFragment selectPurposeFragment, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback3, 1243063494, iOnExtraCallback2, -1243063492, iOnExtraCallback, new Object[]{selectPurposeFragment, setDetectableSize});
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SelectPurposeFragment selectPurposeFragment, View view) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback3, 1385814248, iOnExtraCallback2, -1385814248, iOnExtraCallback, new Object[]{selectPurposeFragment, view});
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback3, -1813010900, iOnExtraCallback2, 1813010903, iOnExtraCallback, new Object[]{function1, obj});
    }

    private static final Unit IAuthTabCallback(SelectPurposeFragment selectPurposeFragment, List list) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback3, 207537003, iOnExtraCallback2, -207537002, iOnExtraCallback, new Object[]{selectPurposeFragment, list});
    }
}

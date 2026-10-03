package o;

import com.facebook.react.uimanager.LayoutShadowNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getEncryptionAlgorithm {
    public static /* synthetic */ void onWarmupCompleted(List list, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, int i, int i2, CardIssueOverviewViewModel cardIssueOverviewViewModel, getEncryptedData getencrypteddata, boolean z, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            getencrypteddata = null;
        }
        getEncryptedData getencrypteddata2 = getencrypteddata;
        if ((i3 & 32) != 0) {
            z = false;
        }
        IAuthTabCallback(list, typographyKtExternalSyntheticLambda0, i, i2, cardIssueOverviewViewModel, getencrypteddata2, z);
    }

    public static final void IAuthTabCallback(@NotNull List<? extends getEncryptedData> list, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, int i, int i2, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel, @Nullable getEncryptedData getencrypteddata, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        List listFilterNotNull = CollectionsKt.filterNotNull(list);
        if (listFilterNotNull.isEmpty()) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CardIssueLayout", "layouts.isEmpty(), skipping build", (Map) null, (String) null, false, (String) null, 60, (Object) null);
        } else {
            onExtraCallback(listFilterNotNull, typographyKtExternalSyntheticLambda0, i, i2, cardIssueOverviewViewModel, getencrypteddata, z);
        }
    }

    private static final void onExtraCallback(List<? extends getEncryptedData> list, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, int i, int i2, CardIssueOverviewViewModel cardIssueOverviewViewModel, getEncryptedData getencrypteddata, boolean z) {
        getDigestAlgorithms getdigestalgorithms;
        List<? extends getEncryptedData> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i3 = 0;
        for (Object obj : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            getEncryptedData getencrypteddata2 = (getEncryptedData) obj;
            if (i3 != CollectionsKt.getLastIndex(list)) {
                getdigestalgorithms = new getDigestAlgorithms(getencrypteddata2, i, i2, (getEncryptedData) CollectionsKt.getOrNull(list, i4), false, null, 48, null);
            } else {
                getdigestalgorithms = new getDigestAlgorithms(getencrypteddata2, i, i2, getencrypteddata, false, null, 48, null);
            }
            arrayList.add(getdigestalgorithms);
            i3 = i4;
        }
        ArrayList<getDigestAlgorithms<? extends getEncryptedData>> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int i5 = 0;
        for (Object obj2 : arrayList) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            getDigestAlgorithms getdigestalgorithmsOnExtraCallback = (getDigestAlgorithms) obj2;
            if (i5 != CollectionsKt.getLastIndex(list)) {
                getdigestalgorithmsOnExtraCallback = getDigestAlgorithms.onExtraCallback(getdigestalgorithmsOnExtraCallback, (getEncryptedData) null, 0, 0, (getEncryptedData) null, false, (getDigestAlgorithms) arrayList.get(i6), 31, (Object) null);
            }
            arrayList2.add(getdigestalgorithmsOnExtraCallback);
            i5 = i6;
        }
        if (z) {
            cardIssueOverviewViewModel.IAuthTabCallback(Integer.valueOf(((getEncryptedData) CollectionsKt.first(list)).access100()));
            ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 = new ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8(typographyKtExternalSyntheticLambda0.IAuthTabCallback_Parcel(), 0, ((getEncryptedData) CollectionsKt.first(list)).access100());
            for (getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms2 : arrayList2) {
                ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{getdigestalgorithms2}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).onWarmupCompleted(getdigestalgorithms2.IAuthTabCallback());
                ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{getdigestalgorithms2}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).onExtraCallbackWithResult(typographyKtExternalSyntheticLambda0, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, getdigestalgorithms2, cardIssueOverviewViewModel);
            }
            typographyKtExternalSyntheticLambda0.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onExtraCallback());
            return;
        }
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7AsBinder = typographyKtExternalSyntheticLambda0.asBinder();
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda82 = new ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8(typographyKtExternalSyntheticLambda0.IAuthTabCallback_Parcel(), 0, ((getEncryptedData) CollectionsKt.first(list)).access100());
        for (getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms3 : arrayList2) {
            ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{getdigestalgorithms3}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).onWarmupCompleted(getdigestalgorithms3.IAuthTabCallback());
            ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{getdigestalgorithms3}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).onExtraCallbackWithResult(typographyKtExternalSyntheticLambda0, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda82, getdigestalgorithms3, cardIssueOverviewViewModel);
        }
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7AsBinder.onExtraCallback(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda82.onExtraCallback());
    }
}

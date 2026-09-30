package o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import im.toss.features.credit.data.legacy.detail.CreditTipV2;
import im.toss.features.credit.ui.legacy.detail.tips.CreditTipListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getScheme extends FragmentStatePagerAdapter {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final List<Triple<connectWithOverlayPermission, Boolean, String>> IAuthTabCallback;
    private final CreditTipV2 onExtraCallback;
    private final String[] onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getScheme(@NotNull Context context, @NotNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @NotNull CreditTipV2 creditTipV2) {
        super(flowMeasureLazyPolicyExternalSyntheticLambda3, 1);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(creditTipV2, "");
        this.onExtraCallback = creditTipV2;
        List listListOf = CollectionsKt.listOf(new Triple[]{new Triple(connectWithOverlayPermission.CARD, Boolean.valueOf(creditTipV2.IAuthTabCallback().IAuthTabCallbackDefault()), "card"), new Triple(connectWithOverlayPermission.LOAN, Boolean.valueOf(creditTipV2.onWarmupCompleted().IAuthTabCallbackDefault()), "loan"), new Triple(connectWithOverlayPermission.OVERDUE, Boolean.valueOf(creditTipV2.onExtraCallbackWithResult().IAuthTabCallbackDefault()), "overdue"), new Triple(connectWithOverlayPermission.GUARANTEE, Boolean.valueOf(creditTipV2.onExtraCallback().IAuthTabCallbackDefault()), "guarantee")});
        ArrayList arrayList = new ArrayList();
        int i = 2 % 2;
        for (Object obj : listListOf) {
            if (!((Boolean) ((Triple) obj).getSecond()).booleanValue()) {
                arrayList.add(obj);
                int i2 = onNavigationEvent + 31;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        this.IAuthTabCallback = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        while (!(!it.hasNext())) {
            arrayList3.add(context.getString(((connectWithOverlayPermission) ((Triple) it.next()).getFirst()).getTitleResId()));
        }
        this.onWarmupCompleted = (String[]) arrayList3.toArray(new String[0]);
        int i6 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public Fragment getItem(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Triple<connectWithOverlayPermission, Boolean, String> triple = this.IAuthTabCallback.get(i);
            CreditTipListFragment.Companion.onNavigationEvent(this.onExtraCallback.onWarmupCompleted((connectWithOverlayPermission) triple.getFirst()), (String) triple.getThird());
            obj.hashCode();
            throw null;
        }
        Triple<connectWithOverlayPermission, Boolean, String> triple2 = this.IAuthTabCallback.get(i);
        CreditTipListFragment creditTipListFragmentOnNavigationEvent = CreditTipListFragment.Companion.onNavigationEvent(this.onExtraCallback.onWarmupCompleted((connectWithOverlayPermission) triple2.getFirst()), (String) triple2.getThird());
        int i4 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return creditTipListFragmentOnNavigationEvent;
        }
        throw null;
    }

    public CharSequence getPageTitle(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            String str = this.onWarmupCompleted[i];
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }
        String str2 = this.onWarmupCompleted[i];
        Intrinsics.checkNotNullExpressionValue(str2, "");
        int i4 = 83 / 0;
        return str2;
    }

    public int getCount() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int size = this.IAuthTabCallback.size();
        int i4 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return size;
        }
        throw null;
    }

    public final String onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = (String) this.IAuthTabCallback.get(i).getThird();
        int i5 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onWarmupCompleted(@NotNull String str) {
        Iterator it;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i3 % 128;
        int i4 = 0;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            it = this.IAuthTabCallback.iterator();
            i = 1;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            it = this.IAuthTabCallback.iterator();
            i = 0;
        }
        while (it.hasNext()) {
            int i5 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            Object next = it.next();
            if (i4 < 0) {
                int i7 = onNavigationEvent + 7;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CollectionsKt.throwIndexOverflow();
                if (i8 != 0) {
                    throw null;
                }
            }
            if (Intrinsics.areEqual(((Triple) next).getThird(), str)) {
                i = i4;
            }
            i4++;
            int i9 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
        }
        return i;
    }
}

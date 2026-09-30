package com.tnkfactory.ad.basic;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.TnkAdListModel;
import com.tnkfactory.ad.TnkRwdFilter;
import com.tnkfactory.ad.TnkSession;
import com.tnkfactory.ad.basic.ITnkHeader;
import com.tnkfactory.ad.basic.event.TnkEventAdItemA;
import com.tnkfactory.ad.basic.event.TnkEventItemA;
import com.tnkfactory.ad.basic.event.TnkEventItemC;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.EventListVo;
import com.tnkfactory.ad.off.data.RecommendList;
import com.tnkfactory.ad.rwd.Resources;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.data.MultiCampaignJoinListItem;
import com.tnkfactory.ad.rwd.data.MultiCampaignJoinListItemKt;
import com.tnkfactory.ad.rwd.data.view.CategorySet;
import com.tnkfactory.ad.rwd.data.view.Filter;
import com.tnkfactory.ad.style.DpUtil;
import com.tnkfactory.ad.style.TnkViewHolder;
import com.tnkfactory.ad.tnkassert.OfferwallTabClick;
import com.tnkfactory.ad.tnkassert.TnkAssert;
import com.xwray.groupie.GroupieAdapter;
import com.xwray.groupie.Item;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ITnkHeaderImpl implements ITnkHeader {
    public View a;
    public TnkAdListModel adListModel;
    public int e;
    public Boolean k;
    private static final byte[] $$a = {51, -39, 98, -44};
    private static final int $$b = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onWarmupCompleted = 7798559133331975163L;
    private static int IAuthTabCallback = -1776194565;
    private static char onExtraCallback = 63385;
    public final GroupieAdapter b = new GroupieAdapter();
    public final GroupieAdapter c = new GroupieAdapter();
    public int d = DpUtil.INSTANCE.dpToPx(0.0f);
    public final Lazy f = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.basic.ITnkHeaderImpl$$ExternalSyntheticLambda0
        public final Object invoke() {
            return ITnkHeaderImpl.a(this.f$0);
        }
    });
    public GroupieAdapter g = new GroupieAdapter();
    public GroupieAdapter h = new GroupieAdapter();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f31i = new ArrayList();
    public final Lazy j = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.basic.ITnkHeaderImpl$$ExternalSyntheticLambda1
        public final Object invoke() {
            return ITnkHeaderImpl.b(this.f$0);
        }
    });
    public boolean l = true;

    private static String $$c(byte b, byte b2, byte b3) {
        int i2 = b2 + 109;
        byte[] bArr = $$a;
        int i3 = b * 3;
        int i4 = 3 - (b3 * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = (-i2) + i4;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i4 + 1;
            i2 = (-bArr[i8]) + i2;
            i4 = i8;
            i6 = i7;
        }
    }

    public static final void b(TnkAdListModel tnkAdListModel, View view) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        tnkAdListModel.onClickClose();
        if (i4 == 0) {
            throw null;
        }
        int i5 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final TnkAdListModel getAdListModel() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 33;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        TnkAdListModel tnkAdListModel = this.adListModel;
        Object obj = null;
        if (tnkAdListModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i6 = i4 + 73;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return tnkAdListModel;
        }
        obj.hashCode();
        throw null;
    }

    public final GroupieAdapter getEventAdAdapter() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        GroupieAdapter groupieAdapter = this.h;
        int i6 = i4 + 125;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return groupieAdapter;
    }

    public final ArrayList<Item<?>> getEventItems() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        ArrayList<Item<?>> arrayList = this.f31i;
        int i6 = i4 + 23;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 93 / 0;
        }
        return arrayList;
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public View getIvMy() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        View ivMy = ITnkHeader.DefaultImpls.getIvMy(this);
        int i5 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return ivMy;
    }

    public final GroupieAdapter getMCategoryAdapter() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        GroupieAdapter groupieAdapter = this.b;
        int i6 = i4 + 41;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return groupieAdapter;
    }

    public final GroupieAdapter getMFilterAdapter() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        GroupieAdapter groupieAdapter = this.c;
        int i6 = i3 + 5;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return groupieAdapter;
    }

    public final GroupieAdapter getRecommendAdAdapter() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return this.g;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TnkAdRecommendLayout getRecommendItem() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object value = this.f.getValue();
        if (i4 != 0) {
            return (TnkAdRecommendLayout) value;
        }
        int i5 = 54 / 0;
        return (TnkAdRecommendLayout) value;
    }

    public final ArrayList<TnkAdRecommendLayout> getRecommendItems() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        ArrayList<TnkAdRecommendLayout> arrayList = (ArrayList) this.j.getValue();
        int i4 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    public final int getRecommendLayoutHeight() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return this.e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final View getRootView() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        View view = this.a;
        if (i4 == 0) {
            int i5 = 38 / 0;
        }
        return view;
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public RecyclerView getRvCategory() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        RecyclerView rvCategory = ITnkHeader.DefaultImpls.getRvCategory(this);
        int i5 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return rvCategory;
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public RecyclerView getRvFilter() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        RecyclerView rvFilter = ITnkHeader.DefaultImpls.getRvFilter(this);
        int i5 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rvFilter;
    }

    public final int getTopHeight() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = this.d;
        int i6 = i4 + 85;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 65 / 0;
        }
        return i5;
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public View getTvClose() {
        View tvClose;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            tvClose = ITnkHeader.DefaultImpls.getTvClose(this);
            int i4 = 77 / 0;
        } else {
            tvClose = ITnkHeader.DefaultImpls.getTvClose(this);
        }
        int i5 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return tvClose;
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public TextView getTvEarnPoint() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return ITnkHeader.DefaultImpls.getTvEarnPoint(this);
        }
        ITnkHeader.DefaultImpls.getTvEarnPoint(this);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public TextView getTvEarnPointUnit() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            ITnkHeader.DefaultImpls.getTvEarnPointUnit(this);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextView tvEarnPointUnit = ITnkHeader.DefaultImpls.getTvEarnPointUnit(this);
        int i4 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return tvEarnPointUnit;
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public TextView getTvTitle() {
        TextView tvTitle;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            tvTitle = ITnkHeader.DefaultImpls.getTvTitle(this);
            int i4 = 84 / 0;
        } else {
            tvTitle = ITnkHeader.DefaultImpls.getTvTitle(this);
        }
        int i5 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return tvTitle;
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public View getViewRoot() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        View view = this.a;
        int i6 = i3 + 23;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return view;
        }
        throw null;
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public TnkViewHolder initCategory(@NotNull CategorySet categorySet, boolean z, @NotNull Function1<? super Integer, Unit> function1) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(categorySet, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CategoryItem categoryItem = new CategoryItem(categorySet, z, function1);
        int i3 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return categoryItem;
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public TnkViewHolder initFilter(@NotNull Filter filter, boolean z, @NotNull Function1<? super Integer, Unit> function1) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(filter, "");
        Intrinsics.checkNotNullParameter(function1, "");
        FilterItem filterItem = new FilterItem(filter, z, function1);
        int i3 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return filterItem;
    }

    public final boolean isFirst() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return this.l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAdListModel(@NotNull TnkAdListModel tnkAdListModel) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(tnkAdListModel, "");
        this.adListModel = tnkAdListModel;
        int i5 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void setEventAdAdapter(@NotNull GroupieAdapter groupieAdapter) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(groupieAdapter, "");
        this.h = groupieAdapter;
        int i5 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setEventItems(@NotNull ArrayList<Item<?>> arrayList) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.f31i = arrayList;
        int i5 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
    }

    public final void setFirst(boolean z) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 39;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        this.l = z;
        int i6 = i4 + 15;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setRecommendAdAdapter(@NotNull GroupieAdapter groupieAdapter) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(groupieAdapter, "");
        this.g = groupieAdapter;
        int i5 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setRecommendLayoutHeight(int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 1;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.e = i2;
        int i7 = i4 + 37;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public final void setRootView(@Nullable View view) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        this.a = view;
        int i6 = i4 + 89;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final void setTopHeight(int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 31;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.d = i2;
        if (i6 != 0) {
            int i7 = 92 / 0;
        }
        int i8 = i4 + 123;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
    }

    public static final void a(TnkAdListModel tnkAdListModel, View view) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        OfferwallTabClick mOfferwallTabClick = TnkAssert.INSTANCE.getMOfferwallTabClick();
        mOfferwallTabClick.setParticipationList5(mOfferwallTabClick.getParticipationList5() + 1);
        tnkAdListModel.onClickMy(0);
        int i5 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final Unit b(ITnkHeaderImpl iTnkHeaderImpl, TnkRwdFilter tnkRwdFilter, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        iTnkHeaderImpl.l = false;
        iTnkHeaderImpl.a();
        tnkRwdFilter.changeFilter(i2);
        return Unit.INSTANCE;
    }

    public static final Unit a(ITnkHeaderImpl iTnkHeaderImpl, TnkRwdFilter tnkRwdFilter, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        iTnkHeaderImpl.l = false;
        iTnkHeaderImpl.a();
        tnkRwdFilter.changeCategory(i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final ArrayList b(ITnkHeaderImpl iTnkHeaderImpl) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(iTnkHeaderImpl.getRecommendItem());
        int i3 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Unit b(ITnkHeaderImpl iTnkHeaderImpl, EventListVo eventListVo) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(eventListVo, "");
            iTnkHeaderImpl.getAdListModel().onClickEvent(eventListVo);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(eventListVo, "");
        iTnkHeaderImpl.getAdListModel().onClickEvent(eventListVo);
        int i4 = 11 / 0;
        return Unit.INSTANCE;
    }

    public static final TnkAdRecommendLayout a(ITnkHeaderImpl iTnkHeaderImpl) {
        int i2 = 2 % 2;
        TnkAdRecommendLayout tnkAdRecommendLayout = new TnkAdRecommendLayout(new ArrayList(), iTnkHeaderImpl.getAdListModel(), iTnkHeaderImpl.getAdListModel().getTnkContext());
        int i3 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 37 / 0;
        }
        return tnkAdRecommendLayout;
    }

    public static final Unit a(ITnkHeaderImpl iTnkHeaderImpl, EventListVo eventListVo) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(eventListVo, "");
            iTnkHeaderImpl.getAdListModel().onClickEvent(eventListVo);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(eventListVo, "");
        iTnkHeaderImpl.getAdListModel().onClickEvent(eventListVo);
        int i4 = 73 / 0;
        return Unit.INSTANCE;
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public void initHeaderMenu(@NotNull View view, @NotNull final TnkAdListModel tnkAdListModel) {
        String strIntern;
        RecyclerView rvFilter;
        RecyclerView rvCategory;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(tnkAdListModel, "");
        this.a = view;
        setAdListModel(tnkAdListModel);
        view.setTag("header");
        TextView tvTitle = getTvTitle();
        if (tvTitle != null) {
            tvTitle.setText(tnkAdListModel.getHeaderTitle());
        }
        TextView tvEarnPoint = getTvEarnPoint();
        if (tvEarnPoint != null) {
            try {
                strIntern = new DecimalFormat("###,###").format(tnkAdListModel.getEarnPoint());
            } catch (Exception unused) {
                Object[] objArr = new Object[1];
                m((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 60646), TextUtils.indexOf("", "", 0) + 109292821, new char[]{50114}, new char[]{0, 0, 0, 0}, new char[]{5416, 33709, 58886, 27884}, objArr);
                strIntern = ((String) objArr[0]).intern();
            }
            tvEarnPoint.setText(strIntern);
        }
        TextView tvEarnPointUnit = getTvEarnPointUnit();
        if (tvEarnPointUnit != null) {
            tvEarnPointUnit.setText(tnkAdListModel.getPubInfo().getPnt_unit());
        }
        if ((!TextUtils.isEmpty(tnkAdListModel.getPubInfo().getCat_show_yn())) && (rvCategory = getRvCategory()) != null) {
            if (Intrinsics.areEqual(tnkAdListModel.getPubInfo().getCat_show_yn(), "Y")) {
                i2 = 0;
            } else {
                int i6 = onNavigationEvent + 1;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                i2 = 8;
            }
            rvCategory.setVisibility(i2);
        }
        if (!TextUtils.isEmpty(tnkAdListModel.getPubInfo().getFilter_show_yn()) && (rvFilter = getRvFilter()) != null) {
            rvFilter.setVisibility(Intrinsics.areEqual(tnkAdListModel.getPubInfo().getFilter_show_yn(), "Y") ? 0 : 8);
        }
        RecyclerView rvCategory2 = getRvCategory();
        if (rvCategory2 != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNull(context);
            rvCategory2.setLayoutManager(new LinearLayoutManager(context, 0, false));
            rvCategory2.setAdapter(this.b);
        }
        RecyclerView rvFilter2 = getRvFilter();
        if (rvFilter2 != null) {
            Context context2 = view.getContext();
            Intrinsics.checkNotNull(context2);
            rvFilter2.setLayoutManager(new LinearLayoutManager(context2, 0, false));
            rvFilter2.setAdapter(this.c);
        }
        View ivMy = getIvMy();
        if (ivMy != null) {
            ivMy.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.ITnkHeaderImpl$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ITnkHeaderImpl.a(tnkAdListModel, view2);
                }
            });
        }
        View tvClose = getTvClose();
        if (tvClose != null) {
            tvClose.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.ITnkHeaderImpl$$ExternalSyntheticLambda9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ITnkHeaderImpl.b(tnkAdListModel, view2);
                }
            });
        }
        setJoinItem((ArrayList) tnkAdListModel.getMultiJoinItems().getValue(), tnkAdListModel.getPubInfo().getPnt_unit());
        updateFilter(tnkAdListModel.getRwdFilter());
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit a(ITnkHeaderImpl iTnkHeaderImpl, View view, LinearLayout linearLayout, LinearLayout linearLayout2, int i2) {
        int measuredHeight;
        float f;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            View view2 = iTnkHeaderImpl.a;
            throw null;
        }
        if (iTnkHeaderImpl.a == null) {
            return Unit.INSTANCE;
        }
        iTnkHeaderImpl.d = view != null ? view.getMeasuredHeight() : 0;
        View view3 = iTnkHeaderImpl.a;
        Intrinsics.checkNotNull(view3);
        if (view3.getMeasuredWidth() > 0) {
            TnkSession tnkSession = TnkSession.INSTANCE;
            View view4 = iTnkHeaderImpl.a;
            Intrinsics.checkNotNull(view4);
            tnkSession.setHeaderStickyHeight(view4.getMeasuredHeight());
        }
        if (linearLayout != null) {
            measuredHeight = linearLayout.getMeasuredHeight();
        } else {
            int i5 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            measuredHeight = 0;
        }
        if (iTnkHeaderImpl.a != null) {
            if (i2 > measuredHeight) {
                i2 = measuredHeight;
            }
            linearLayout2.layout(0, (-i2) + iTnkHeaderImpl.d, linearLayout2.getMeasuredWidth(), (linearLayout2.getMeasuredHeight() - i2) + iTnkHeaderImpl.d);
            try {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                boolean globalVisibleRect = linearLayout.getGlobalVisibleRect(rect);
                boolean globalVisibleRect2 = linearLayout2.getGlobalVisibleRect(rect2);
                Rect rect3 = new Rect(rect);
                boolean z = true;
                boolean z2 = globalVisibleRect2 && globalVisibleRect && rect3.intersect(rect2);
                int width = linearLayout.getWidth() * linearLayout.getHeight();
                int iWidth = z2 ? rect3.width() * rect3.height() : 0;
                if (width > 0) {
                    int i7 = onExtraCallbackWithResult + 99;
                    onNavigationEvent = i7 % 128;
                    f = i7 % 2 != 0 ? iWidth % width : iWidth / width;
                } else {
                    f = 0.0f;
                }
                if (linearLayout.isShown() && linearLayout.getVisibility() == 0) {
                    int i8 = onNavigationEvent + 109;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    if (f < 0.98f) {
                    }
                    if (!Intrinsics.areEqual(iTnkHeaderImpl.k, Boolean.valueOf(z))) {
                    }
                } else {
                    z = false;
                    if (!Intrinsics.areEqual(iTnkHeaderImpl.k, Boolean.valueOf(z))) {
                        int i10 = onNavigationEvent + 115;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 == 0) {
                            iTnkHeaderImpl.k = Boolean.valueOf(z);
                            iTnkHeaderImpl.getRecommendItem().setAutoScrollEnabled(z);
                            int i11 = 49 / 0;
                        } else {
                            iTnkHeaderImpl.k = Boolean.valueOf(z);
                            iTnkHeaderImpl.getRecommendItem().setAutoScrollEnabled(z);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return Unit.INSTANCE;
    }

    public final void a() {
        ViewGroup viewGroup;
        LinearLayout linearLayout;
        int i2 = 2 % 2;
        View viewRoot = getViewRoot();
        if (viewRoot != null) {
            int i3 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            ViewGroup viewGroup2 = (ViewGroup) viewRoot.findViewById(R.id.com_tnk_off_header_tv_join_message);
            if (viewGroup2 != null) {
                int i5 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    viewGroup2.setVisibility(1);
                } else {
                    viewGroup2.setVisibility(8);
                }
            }
        }
        View view = this.a;
        LinearLayout linearLayout2 = null;
        if (view instanceof ViewGroup) {
            int i6 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i6 % 128;
            viewGroup = (ViewGroup) view;
            if (i6 % 2 != 0) {
                int i7 = 6 / 0;
            }
        } else {
            int i8 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            viewGroup = null;
        }
        if (viewGroup != null) {
            int i10 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                linearLayout = (LinearLayout) viewGroup.findViewById(R.id.com_tnk_off_header_header_sticky);
                int i11 = 89 / 0;
            } else {
                linearLayout = (LinearLayout) viewGroup.findViewById(R.id.com_tnk_off_header_header_sticky);
            }
            linearLayout2 = linearLayout;
        }
        if (linearLayout2 == null) {
            return;
        }
        View view2 = this.a;
        TnkSession.INSTANCE.setHeaderStickyHeightFoldedHeight((view2 != null ? view2.getMeasuredHeight() : 0) - linearLayout2.getMeasuredHeight());
    }

    public static final void a(ViewGroup viewGroup) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        viewGroup.setVisibility(8);
        int i5 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void m(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $11 + 119;
            $10 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 43 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1451 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1494 - (ViewConfiguration.getTapTimeout() >> 16), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23973 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.indexOf("", "", 0) + 50, 22939 - TextUtils.indexOf("", ""), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 45849), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 29, (ViewConfiguration.getTapTimeout() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i7 = $11 + 89;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            i3 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ad A[Catch: Exception -> 0x01f6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x01f6, blocks: (B:3:0x0015, B:6:0x001a, B:10:0x002e, B:23:0x005d, B:28:0x0070, B:29:0x0075, B:31:0x007d, B:32:0x0086, B:34:0x008d, B:36:0x00a6, B:37:0x00aa, B:39:0x00b0, B:42:0x00c0, B:45:0x00d6, B:47:0x00e5, B:49:0x00ec, B:48:0x00e9, B:50:0x00f6, B:53:0x00fc, B:55:0x0103, B:57:0x010d, B:58:0x0117, B:60:0x011d, B:61:0x012a, B:62:0x0131, B:64:0x013b, B:66:0x0143, B:70:0x014b, B:74:0x0159, B:76:0x015e, B:80:0x0173, B:84:0x017e, B:85:0x0183, B:86:0x0188, B:87:0x018b, B:90:0x018e, B:103:0x01bb, B:100:0x01ad, B:107:0x01ca, B:109:0x01cf, B:113:0x01da, B:115:0x01de, B:117:0x01f3, B:111:0x01d5, B:19:0x0053, B:20:0x0057, B:14:0x003c), top: B:120:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[PHI: r4
      0x0046: PHI (r4v6 android.view.ViewGroup) = (r4v5 android.view.ViewGroup), (r4v18 android.view.ViewGroup) binds: [B:15:0x0044, B:12:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9 A[Catch: Exception -> 0x01f6, TryCatch #0 {Exception -> 0x01f6, blocks: (B:3:0x0015, B:6:0x001a, B:10:0x002e, B:23:0x005d, B:28:0x0070, B:29:0x0075, B:31:0x007d, B:32:0x0086, B:34:0x008d, B:36:0x00a6, B:37:0x00aa, B:39:0x00b0, B:42:0x00c0, B:45:0x00d6, B:47:0x00e5, B:49:0x00ec, B:48:0x00e9, B:50:0x00f6, B:53:0x00fc, B:55:0x0103, B:57:0x010d, B:58:0x0117, B:60:0x011d, B:61:0x012a, B:62:0x0131, B:64:0x013b, B:66:0x0143, B:70:0x014b, B:74:0x0159, B:76:0x015e, B:80:0x0173, B:84:0x017e, B:85:0x0183, B:86:0x0188, B:87:0x018b, B:90:0x018e, B:103:0x01bb, B:100:0x01ad, B:107:0x01ca, B:109:0x01cf, B:113:0x01da, B:115:0x01de, B:117:0x01f3, B:111:0x01d5, B:19:0x0053, B:20:0x0057, B:14:0x003c), top: B:120:0x0015 }] */
    @Override // com.tnkfactory.ad.basic.ITnkHeader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setJoinItem(@Nullable ArrayList<MultiCampaignJoinListItem> arrayList, @NotNull String str) {
        View viewRoot;
        final ViewGroup viewGroup;
        Object tag;
        int size;
        String pnt_unit;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (this.a == null || (viewRoot = getViewRoot()) == null) {
                return;
            }
            int i5 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                viewGroup = (ViewGroup) viewRoot.findViewById(R.id.com_tnk_off_header_tv_join_message);
                int i6 = 33 / 0;
                if (viewGroup != null) {
                    int i7 = onNavigationEvent + 7;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        viewGroup.setVisibility(41);
                    } else {
                        viewGroup.setVisibility(8);
                    }
                }
            } else {
                viewGroup = (ViewGroup) viewRoot.findViewById(R.id.com_tnk_off_header_tv_join_message);
                if (viewGroup != null) {
                }
            }
            ImageView imageView = null;
            if (viewGroup != null) {
                tag = viewGroup.getTag();
                int i8 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            } else {
                tag = null;
            }
            if (tag == null) {
                if (viewGroup != null) {
                    viewGroup.setTag("set");
                }
                Ref.IntRef intRef = new Ref.IntRef();
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = arrayList.iterator();
                    while (!(!it.hasNext())) {
                        Object next = it.next();
                        View view = this.a;
                        Intrinsics.checkNotNull(view);
                        Context context = view.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        if (MultiCampaignJoinListItemKt.isCorrectItem((MultiCampaignJoinListItem) next, context)) {
                            arrayList2.add(next);
                        }
                    }
                    size = arrayList2.size();
                } else {
                    size = 0;
                }
                intRef.element = size;
                TextView textView = (TextView) viewRoot.findViewById(R.id.com_tnk_off_header_tv_cnt);
                if (intRef.element > 0) {
                    if (viewGroup != null) {
                        int i10 = Calendar.getInstance().get(6);
                        if (intRef.element > 0) {
                            int i11 = onNavigationEvent + 27;
                            onExtraCallbackWithResult = i11 % 128;
                            int i12 = i11 % 2;
                            Settings settings = Settings.INSTANCE;
                            Context context2 = viewGroup.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "");
                            if (settings.isMultiJoinMessage(context2) != i10) {
                                viewGroup.setVisibility(0);
                            } else {
                                viewGroup.setVisibility(8);
                            }
                            viewGroup.postDelayed(new Runnable() { // from class: com.tnkfactory.ad.basic.ITnkHeaderImpl$$ExternalSyntheticLambda2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ITnkHeaderImpl.a(viewGroup);
                                }
                            }, 3000L);
                        }
                    }
                    if (intRef.element > 0) {
                        List listEmptyList = arrayList == null ? CollectionsKt.emptyList() : arrayList;
                        TextView textView2 = (TextView) viewRoot.findViewById(R.id.com_tnk_off_header_tv_join_point);
                        if (textView2 != null) {
                            Resources resources = Resources.getResources();
                            Iterator it2 = listEmptyList.iterator();
                            long pnt_amt = 0;
                            while (it2.hasNext()) {
                                pnt_amt += ((MultiCampaignJoinListItem) it2.next()).getPnt_amt();
                            }
                            textView2.setText(resources.formatCurrency(pnt_amt));
                        }
                        TextView textView3 = (TextView) viewRoot.findViewById(R.id.com_tnk_off_header_tv_join_unit);
                        if (textView3 != null) {
                            MultiCampaignJoinListItem multiCampaignJoinListItem = (MultiCampaignJoinListItem) CollectionsKt.firstOrNull(listEmptyList);
                            if (multiCampaignJoinListItem != null && (pnt_unit = multiCampaignJoinListItem.getPnt_unit()) != null) {
                                str2 = pnt_unit;
                            }
                            textView3.setText(str2);
                            textView3.setVisibility(TnkAdConfig.INSTANCE.getUsePointUnit() ? 0 : 8);
                        } else {
                            textView3 = null;
                        }
                        ImageView imageView2 = (ImageView) viewRoot.findViewById(R.id.com_tnk_off_header_tv_join_icon);
                        if (imageView2 != null) {
                            int i13 = onExtraCallbackWithResult + 53;
                            onNavigationEvent = i13 % 128;
                            if (i13 % 2 != 0) {
                                TnkAdConfig.INSTANCE.getUsePointUnit();
                                imageView.hashCode();
                                throw null;
                            }
                            imageView2.setVisibility(TnkAdConfig.INSTANCE.getUsePointUnit() ? 8 : 0);
                            imageView = imageView2;
                        }
                        int pointEffectType = TnkAdConfig.INSTANCE.getPointEffectType();
                        if (pointEffectType != 0) {
                            if (pointEffectType == 1) {
                                if (imageView != null) {
                                    int i14 = onNavigationEvent + 59;
                                    onExtraCallbackWithResult = i14 % 128;
                                    int i15 = i14 % 2;
                                    imageView.setVisibility(0);
                                }
                                if (textView3 != null) {
                                    textView3.setVisibility(0);
                                }
                            } else if (pointEffectType == 2) {
                                int i16 = onNavigationEvent + 19;
                                onExtraCallbackWithResult = i16 % 128;
                                if (i16 % 2 == 0) {
                                    int i17 = 73 / 0;
                                    if (imageView != null) {
                                        imageView.setVisibility(8);
                                    }
                                    if (textView3 != null) {
                                        int i18 = onExtraCallbackWithResult + 49;
                                        onNavigationEvent = i18 % 128;
                                        int i19 = i18 % 2;
                                        textView3.setVisibility(8);
                                    }
                                } else {
                                    if (imageView != null) {
                                    }
                                    if (textView3 != null) {
                                    }
                                }
                            }
                        }
                    }
                } else if (textView != null) {
                    textView.setVisibility(8);
                }
                if (textView != null) {
                    if (intRef.element <= 0) {
                        textView.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(0);
                    int i20 = intRef.element;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i20);
                    textView.setText(sb.toString());
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[PHI: r1
      0x0037: PHI (r1v12 java.util.ArrayList) = (r1v11 java.util.ArrayList), (r1v21 java.util.ArrayList) binds: [B:10:0x0035, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateJoinCount() {
        ArrayList arrayList;
        int size;
        int i2 = 2 % 2;
        if (this.a != null) {
            int i3 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                arrayList = (ArrayList) getAdListModel().getMultiJoinItems().getValue();
                int i4 = 22 / 0;
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        View view = this.a;
                        Intrinsics.checkNotNull(view);
                        Context context = view.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        if (MultiCampaignJoinListItemKt.isCorrectItem((MultiCampaignJoinListItem) obj, context)) {
                            int i5 = onExtraCallbackWithResult + 57;
                            onNavigationEvent = i5 % 128;
                            int i6 = i5 % 2;
                            arrayList2.add(obj);
                        }
                    }
                    size = arrayList2.size();
                } else {
                    size = 0;
                }
            } else {
                arrayList = (ArrayList) getAdListModel().getMultiJoinItems().getValue();
                if (arrayList != null) {
                }
            }
            View view2 = this.a;
            Intrinsics.checkNotNull(view2);
            TextView textView = (TextView) view2.findViewById(R.id.com_tnk_off_header_tv_cnt);
            if (textView != null) {
                if (size > 0) {
                    textView.setVisibility(0);
                    StringBuilder sb = new StringBuilder();
                    sb.append(size);
                    textView.setText(sb.toString());
                    return;
                }
                textView.setVisibility(8);
            }
        }
        int i7 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setRecommendInfo(@NotNull RecommendList recommendList) {
        ViewGroup viewGroup;
        final LinearLayout linearLayout;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(recommendList, "");
            TnkSession tnkSession = TnkSession.INSTANCE;
            View view = this.a;
            Intrinsics.checkNotNull(view);
            tnkSession.setHeaderStickyHeight(view.getMeasuredHeight());
            throw null;
        }
        Intrinsics.checkNotNullParameter(recommendList, "");
        TnkSession tnkSession2 = TnkSession.INSTANCE;
        View view2 = this.a;
        Intrinsics.checkNotNull(view2);
        tnkSession2.setHeaderStickyHeight(view2.getMeasuredHeight());
        View view3 = this.a;
        final View viewFindViewById = view3 != null ? view3.findViewById(R.id.com_tnk_off_header_cl_top) : null;
        View view4 = this.a;
        if (view4 instanceof ViewGroup) {
            int i4 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            viewGroup = (ViewGroup) view4;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            linearLayout = (LinearLayout) viewGroup.findViewById(R.id.com_tnk_off_header_header_sticky);
            int i5 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 3;
            }
        } else {
            linearLayout = null;
        }
        View view5 = this.a;
        ViewGroup viewGroup2 = view5 instanceof ViewGroup ? (ViewGroup) view5 : null;
        final LinearLayout linearLayout2 = viewGroup2 != null ? (LinearLayout) viewGroup2.findViewById(R.id.com_tnk_off_header_rwd_plus_header_sticky) : null;
        if (linearLayout2 == null || linearLayout == null) {
            return;
        }
        View view6 = this.a;
        Intrinsics.checkNotNull(view6);
        RecyclerView recyclerView = new RecyclerView(view6.getContext());
        View view7 = this.a;
        Intrinsics.checkNotNull(view7);
        RecyclerView recyclerView2 = new RecyclerView(view7.getContext());
        if (recommendList.getEvt_list().isEmpty() && recommendList.getAd_list().isEmpty() && recommendList.getRec_list().isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        if (linearLayout.getChildCount() == 0) {
            View view8 = this.a;
            Intrinsics.checkNotNull(view8);
            recyclerView.setLayoutManager(new GridLayoutManager(view8.getContext(), 1, 1, false));
            recyclerView.setAdapter(this.g);
            linearLayout.addView((View) recyclerView, -1, -2);
            linearLayout.addView((View) recyclerView2, -1, -2);
            View view9 = this.a;
            Intrinsics.checkNotNull(view9);
            recyclerView2.setBackgroundColor(view9.getContext().getResources().getColor(R.color.tnk_color_background));
            recyclerView2.setAdapter(this.h);
            recyclerView2.setClipToPadding(false);
            View view10 = this.a;
            Intrinsics.checkNotNull(view10);
            recyclerView2.setLayoutManager(new GridLayoutManager(view10.getContext(), 1, 0, false));
            DpUtil dpUtil = DpUtil.INSTANCE;
            recyclerView2.setPadding(dpUtil.dpToPx(20.0f), 0, dpUtil.dpToPx(20.0f), 0);
            View view11 = this.a;
            Intrinsics.checkNotNull(view11);
            linearLayout.addView(LayoutInflater.from(view11.getContext()).inflate(R.layout.com_tnk_offerwall_header_sticky_bottom_item, (ViewGroup) null, true), -1, -2);
        }
        if (recommendList.getRec_list().isEmpty()) {
            recyclerView.setVisibility(8);
        } else {
            getRecommendItem().setArrAdItems(recommendList.getRec_list());
            this.g.update(getRecommendItems());
            this.g.notifyDataSetChanged();
            getRecommendItem().setAutoScrollEnabled(true);
        }
        ArrayList<EventListVo> evt_list = recommendList.getEvt_list();
        ArrayList<AdListVo> ad_list = recommendList.getAd_list();
        if (evt_list.isEmpty() && ad_list.isEmpty()) {
            int i7 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            recyclerView2.setVisibility(8);
        } else {
            this.f31i.clear();
            recyclerView2.setVisibility(0);
            if (evt_list.size() == 1) {
                int i9 = onExtraCallbackWithResult + 119;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                if (ad_list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(evt_list, 10));
                    Iterator<T> it = evt_list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new TnkEventItemA((EventListVo) it.next(), new Function1() { // from class: com.tnkfactory.ad.basic.ITnkHeaderImpl$$ExternalSyntheticLambda3
                            public final Object invoke(Object obj2) {
                                return ITnkHeaderImpl.a(this.f$0, (EventListVo) obj2);
                            }
                        }));
                    }
                    this.f31i.addAll(arrayList);
                    this.h.update(this.f31i);
                } else if (evt_list.isEmpty()) {
                    int i11 = onExtraCallbackWithResult + 87;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    if (ad_list.isEmpty()) {
                        this.h.clear();
                    } else {
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(ad_list, 10));
                        for (AdListVo adListVo : ad_list) {
                            TnkEventAdItemA tnkEventAdItemA = new TnkEventAdItemA();
                            tnkEventAdItemA.onItemInit(getAdListModel().getTnkContext(), adListVo);
                            arrayList2.add(tnkEventAdItemA);
                        }
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(evt_list, 10));
                        Iterator<T> it2 = evt_list.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(new TnkEventItemC((EventListVo) it2.next(), new Function1() { // from class: com.tnkfactory.ad.basic.ITnkHeaderImpl$$ExternalSyntheticLambda4
                                public final Object invoke(Object obj2) {
                                    return ITnkHeaderImpl.b(this.f$0, (EventListVo) obj2);
                                }
                            }));
                        }
                        this.f31i.addAll(arrayList2);
                        this.f31i.addAll(arrayList3);
                        this.h.update(this.f31i);
                    }
                }
                this.h.notifyDataSetChanged();
            }
        }
        getAdListModel().setScrollEventListener(new Function1() { // from class: com.tnkfactory.ad.basic.ITnkHeaderImpl$$ExternalSyntheticLambda5
            public final Object invoke(Object obj2) {
                return ITnkHeaderImpl.a(this.f$0, viewFindViewById, linearLayout, linearLayout2, ((Integer) obj2).intValue());
            }
        });
        if (linearLayout.getChildCount() > 0) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public void updateFilter(@NotNull final TnkRwdFilter tnkRwdFilter) {
        ArrayList arrayList;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(tnkRwdFilter, "");
        Object value = tnkRwdFilter.getFilterUiModel().getValue();
        Intrinsics.checkNotNull(value);
        TnkRwdFilter.FilterModel filterModel = (TnkRwdFilter.FilterModel) value;
        ArrayList<CategorySet> categorySet = tnkRwdFilter.getCategorySet();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(categorySet, 10));
        Iterator<T> it = categorySet.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            CategorySet categorySet2 = (CategorySet) it.next();
            if (categorySet2.getCatId() != filterModel.getSelectedCategoryId()) {
                z = true;
            }
            arrayList2.add(initCategory(categorySet2, !z, new Function1() { // from class: com.tnkfactory.ad.basic.ITnkHeaderImpl$$ExternalSyntheticLambda6
                public final Object invoke(Object obj) {
                    return ITnkHeaderImpl.a(this.f$0, tnkRwdFilter, ((Integer) obj).intValue());
                }
            }));
        }
        this.b.update(arrayList2);
        this.b.notifyDataSetChanged();
        RecyclerView rvFilter = getRvFilter();
        if (rvFilter != null) {
            rvFilter.setVisibility(Intrinsics.areEqual(getAdListModel().getPubInfo().getFilter_show_yn(), "Y") ? 0 : 8);
        }
        List<Filter> filterList = filterModel.getSelectedCategory().getFilterList();
        if (filterList != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterList, 10));
            Iterator<T> it2 = filterList.iterator();
            int i3 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            while (!(!it2.hasNext())) {
                int i5 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                Filter filter = (Filter) it2.next();
                arrayList.add(initFilter(filter, filter.getFilterId() == filterModel.getSelectedFilterId(), new Function1() { // from class: com.tnkfactory.ad.basic.ITnkHeaderImpl$$ExternalSyntheticLambda7
                    public final Object invoke(Object obj) {
                        return ITnkHeaderImpl.b(this.f$0, tnkRwdFilter, ((Integer) obj).intValue());
                    }
                }));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.c.update(arrayList);
            this.c.notifyDataSetChanged();
        }
        RecommendList recommendList = (RecommendList) getAdListModel().getRecommendList().getValue();
        if (recommendList != null) {
            int i7 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            ArrayList<EventListVo> evt_list = recommendList.getEvt_list();
            if (evt_list != null) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(evt_list, 10));
                Iterator<T> it3 = evt_list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((EventListVo) it3.next()).getApp_nm());
                }
            }
            try {
                setRecommendInfo(recommendList);
            } catch (Exception unused) {
            }
        }
        updateJoinCount();
    }
}

package com.tnkfactory.ad.basic;

import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdListModel;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.basic.TnkAdRecommendLayout;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import com.tnkfactory.ad.style.DpUtil;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import com.xwray.groupie.GroupieAdapter;
import com.xwray.groupie.Item;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdRecommendLayout extends ITnkSection {
    public List a;
    public final TnkAdListModel b;
    public final TnkContext c;
    public final ArrayList d;
    public final HorizontalHolder e;
    public final int f;
    public final long g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f33i;
    public int j;

    public final class HorizontalHolder extends Item<setColorSchemeColors> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static long onWarmupCompleted = 5940562190468853175L;
        public int b;
        public TnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1 d;
        public TnkAdRecommendLayout$HorizontalHolder$bind$5 e;
        public TnkAdRecommendLayout$HorizontalHolder$bind$7 f;
        public ViewPager2 g;
        public final GroupieAdapter a = new GroupieAdapter();
        public final Handler c = new Handler(Looper.getMainLooper());

        public HorizontalHolder() {
        }

        public static final /* synthetic */ void access$applyAutoScrollState(HorizontalHolder horizontalHolder) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            horizontalHolder.a();
            if (i4 != 0) {
                int i5 = 30 / 0;
            }
        }

        public static final /* synthetic */ Handler access$getAutoScrollHandler$p(HorizontalHolder horizontalHolder) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Handler handler = horizontalHolder.c;
            if (i5 != 0) {
                throw null;
            }
            int i6 = i3 + 43;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 34 / 0;
            }
            return handler;
        }

        @Override // com.xwray.groupie.Item
        public int getLayout() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 117;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = R.layout.com_tnk_recommend_layout;
            if (i4 != 0) {
                return i5;
            }
            throw null;
        }

        public final GroupieAdapter getMAdapter() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 55;
            onExtraCallback = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            GroupieAdapter groupieAdapter = this.a;
            int i5 = i3 + 77;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return groupieAdapter;
            }
            throw null;
        }

        public final int getSize() {
            int i2;
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 7;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            if (i4 % 2 != 0) {
                i2 = this.b;
                int i6 = 80 / 0;
            } else {
                i2 = this.b;
            }
            int i7 = i5 + 109;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return i2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.xwray.groupie.Item
        public int getSpanSize(int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = IAuthTabCallback;
            int i6 = i5 + 83;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 17;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return 12;
        }

        @Override // com.xwray.groupie.Item
        public int getViewType() {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 111;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            List<AdListVo> arrAdItems = TnkAdRecommendLayout.this.getArrAdItems();
            if (i4 == 0) {
                return arrAdItems.hashCode();
            }
            arrAdItems.hashCode();
            throw null;
        }

        public final void setSize(int i2) {
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback;
            int i5 = i4 + 7;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            Object obj = null;
            this.b = i2;
            if (i6 == 0) {
                obj.hashCode();
                throw null;
            }
            int i7 = i4 + 3;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        public final void setAutoScrollEnabled(boolean z) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 9;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                TnkAdRecommendLayout.this.f33i = z;
                a();
            } else {
                TnkAdRecommendLayout.this.f33i = z;
                a();
                throw null;
            }
        }

        public static final void access$stopAutoScroll(HorizontalHolder horizontalHolder) {
            int i2 = 2 % 2;
            TnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1 tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1 = horizontalHolder.d;
            if (tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1 != null) {
                int i3 = onExtraCallback + 57;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    horizontalHolder.c.removeCallbacks(tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1);
                    throw null;
                }
                horizontalHolder.c.removeCallbacks(tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1);
            }
            horizontalHolder.d = null;
            int i4 = IAuthTabCallback + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 78 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [com.tnkfactory.ad.basic.TnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1, java.lang.Object, java.lang.Runnable] */
        public final void a() {
            int i2 = 2 % 2;
            final ViewPager2 viewPager2 = this.g;
            if (viewPager2 != null) {
                int i3 = IAuthTabCallback + 11;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (!TnkAdRecommendLayout.this.f33i) {
                    int i5 = IAuthTabCallback + 23;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    TnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1 tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1 = this.d;
                    if (tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1 != null) {
                        this.c.removeCallbacks(tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1);
                    }
                    this.d = null;
                    return;
                }
                final int i7 = TnkAdRecommendLayout.this.h;
                TnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1 tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$12 = this.d;
                if (tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$12 != null) {
                    int i8 = IAuthTabCallback + 35;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        this.c.removeCallbacks(tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$12);
                        int i9 = 70 / 0;
                    } else {
                        this.c.removeCallbacks(tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$12);
                    }
                }
                this.d = null;
                if (i7 < TnkAdRecommendLayout.this.getMinAutoScrollItemCount()) {
                    return;
                }
                final TnkAdRecommendLayout tnkAdRecommendLayout = TnkAdRecommendLayout.this;
                ?? r0 = new Runnable() { // from class: com.tnkfactory.ad.basic.TnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1
                    @Override // java.lang.Runnable
                    public void run() {
                        viewPager2.setCurrentItem(viewPager2.onNavigationEvent() + 1 < i7 ? viewPager2.onNavigationEvent() + 1 : 0, true);
                        TnkAdRecommendLayout.HorizontalHolder.access$getAutoScrollHandler$p(this).postDelayed(this, tnkAdRecommendLayout.getAutoScrollDelay());
                    }
                };
                this.d = r0;
                Handler handler = this.c;
                Intrinsics.checkNotNull((Object) r0);
                handler.postDelayed(r0, TnkAdRecommendLayout.this.getAutoScrollDelay());
            }
        }

        public static final void a(TnkAdRecommendLayout tnkAdRecommendLayout, ViewPager2 viewPager2) {
            int i2 = 2 % 2;
            if (tnkAdRecommendLayout.j == 0 && viewPager2.getHeight() > 0) {
                tnkAdRecommendLayout.j = viewPager2.getHeight();
            }
            if (tnkAdRecommendLayout.j <= 0 || viewPager2.getLayoutParams().height == tnkAdRecommendLayout.j) {
                return;
            }
            int i3 = IAuthTabCallback + 103;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
            layoutParams.height = tnkAdRecommendLayout.j;
            viewPager2.setLayoutParams(layoutParams);
            viewPager2.requestLayout();
            int i5 = IAuthTabCallback + 41;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            if (r7 > 1.0f) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            r6.setTranslationX(r4);
            r4 = com.tnkfactory.ad.basic.TnkAdRecommendLayout.HorizontalHolder.IAuthTabCallback + 33;
            com.tnkfactory.ad.basic.TnkAdRecommendLayout.HorizontalHolder.onExtraCallback = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if ((r4 % 2) != 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        
            r4 = 12 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        
            r6.setTranslationX(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r7 < (-1.0f)) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
        
            if (r7 < (-1.0f)) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        
            r5 = com.tnkfactory.ad.basic.TnkAdRecommendLayout.HorizontalHolder.IAuthTabCallback + 79;
            com.tnkfactory.ad.basic.TnkAdRecommendLayout.HorizontalHolder.onExtraCallback = r5 % 128;
            r5 = r5 % 2;
            r6.setTranslationX(-r4);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void a(int i2, int i3, View view, float f) {
            float f2;
            int i4 = 2 % 2;
            int i5 = IAuthTabCallback + 75;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                f2 = (-(i2 << i3)) * f;
            } else {
                Intrinsics.checkNotNullParameter(view, "");
                f2 = (-((i2 << 1) + i3)) * f;
            }
        }

        private static void i(char[] cArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i2);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i4 = $10 + 41;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i6 = $11 + 39;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i8 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45811), ((byte) KeyEvent.getModifierMetaStateMask()) + 85, 21233 - (ViewConfiguration.getWindowTouchSlop() >> 8), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14185), 20 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 8808 - View.combineMeasuredStates(0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v11, types: [android.view.View$OnAttachStateChangeListener, com.tnkfactory.ad.basic.TnkAdRecommendLayout$HorizontalHolder$bind$7, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v9, types: [androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback, com.tnkfactory.ad.basic.TnkAdRecommendLayout$HorizontalHolder$bind$5, java.lang.Object] */
        @Override // com.xwray.groupie.Item
        public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) throws Throwable {
            int i3;
            TnkAdListBasicItem tnkAdRecommendItem;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
            View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view, "");
            View viewFindViewById = view.findViewById(R.id.com_tnk_off_rv_recommend);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            final ViewPager2 viewPager2 = (ViewPager2) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.com_tnk_off_page_idx);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            final TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.com_tnk_off_page_cnt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            TextView textView2 = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.com_tnk_off_recommend_indicator);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            LinearLayout linearLayout = (LinearLayout) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.tv_recommend_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            ((TextView) viewFindViewById5).setText("오늘의 추천");
            List<AdListVo> arrAdItems = TnkAdRecommendLayout.this.getArrAdItems();
            TnkAdRecommendLayout tnkAdRecommendLayout = TnkAdRecommendLayout.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrAdItems, 10));
            for (AdListVo adListVo : arrAdItems) {
                if (adListVo.getAdType() == 4) {
                    tnkAdRecommendItem = new TnkAdRecommendItemCps();
                    tnkAdRecommendItem.onItemInit(tnkAdRecommendLayout.getTnkContext(), adListVo);
                } else {
                    tnkAdRecommendItem = new TnkAdRecommendItem();
                    tnkAdRecommendItem.onItemInit(tnkAdRecommendLayout.getTnkContext(), adListVo);
                }
                arrayList.add(tnkAdRecommendItem);
            }
            TnkAdRecommendLayout tnkAdRecommendLayout2 = TnkAdRecommendLayout.this;
            tnkAdRecommendLayout2.getArrBindItem().clear();
            tnkAdRecommendLayout2.getArrBindItem().addAll(arrayList);
            tnkAdRecommendLayout2.h = tnkAdRecommendLayout2.getArrBindItem().size();
            if (this.a.getItemCount() == 0) {
                this.a.addAll(TnkAdRecommendLayout.this.getArrBindItem());
            } else {
                this.a.update(TnkAdRecommendLayout.this.getArrBindItem());
            }
            this.b = TnkAdRecommendLayout.this.getArrBindItem().size();
            viewPager2.setAdapter(this.a);
            final TnkAdRecommendLayout tnkAdRecommendLayout3 = TnkAdRecommendLayout.this;
            viewPager2.post(new Runnable() { // from class: com.tnkfactory.ad.basic.TnkAdRecommendLayout$HorizontalHolder$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TnkAdRecommendLayout.HorizontalHolder.a(tnkAdRecommendLayout3, viewPager2);
                }
            });
            Object[] objArr = new Object[1];
            i(new char[]{18844, 32342, 18861, 13533, 48686}, ExpandableListView.getPackedPositionType(0L) + 1, objArr);
            textView.setText(((String) objArr[0]).intern());
            viewPager2.setUserInputEnabled(TnkAdRecommendLayout.this.getArrBindItem().size() > 1);
            if (TnkAdRecommendLayout.this.getArrBindItem().size() > 1) {
                int i5 = IAuthTabCallback + 65;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                i3 = 0;
            } else {
                i3 = 8;
            }
            linearLayout.setVisibility(i3);
            Object obj = null;
            if (TnkAdRecommendLayout.this.getArrBindItem().size() > 1) {
                textView2.setText("/" + TnkAdRecommendLayout.this.getArrBindItem().size());
                ViewPager2 viewPager22 = this.g;
                if (viewPager22 != null) {
                    int i7 = onExtraCallback + 89;
                    int i8 = i7 % 128;
                    IAuthTabCallback = i8;
                    int i9 = i7 % 2;
                    if (viewPager22 != viewPager2) {
                        int i10 = i8 + 41;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        TnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1 tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1 = this.d;
                        if (tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1 != null) {
                            this.c.removeCallbacks(tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1);
                        }
                        this.d = null;
                        TnkAdRecommendLayout$HorizontalHolder$bind$5 tnkAdRecommendLayout$HorizontalHolder$bind$5 = this.e;
                        if (tnkAdRecommendLayout$HorizontalHolder$bind$5 != null) {
                            int i12 = IAuthTabCallback + 43;
                            onExtraCallback = i12 % 128;
                            try {
                                if (i12 % 2 == 0) {
                                    viewPager22.onWarmupCompleted(tnkAdRecommendLayout$HorizontalHolder$bind$5);
                                    obj.hashCode();
                                    throw null;
                                }
                                viewPager22.onWarmupCompleted(tnkAdRecommendLayout$HorizontalHolder$bind$5);
                            } catch (Exception unused) {
                            }
                        }
                        TnkAdRecommendLayout$HorizontalHolder$bind$7 tnkAdRecommendLayout$HorizontalHolder$bind$7 = this.f;
                        if (tnkAdRecommendLayout$HorizontalHolder$bind$7 != null) {
                            viewPager22.removeOnAttachStateChangeListener(tnkAdRecommendLayout$HorizontalHolder$bind$7);
                        }
                    }
                }
                this.g = viewPager2;
                TnkAdRecommendLayout$HorizontalHolder$bind$5 tnkAdRecommendLayout$HorizontalHolder$bind$52 = this.e;
                if (tnkAdRecommendLayout$HorizontalHolder$bind$52 != null) {
                    int i13 = IAuthTabCallback + 95;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    try {
                        viewPager2.onWarmupCompleted(tnkAdRecommendLayout$HorizontalHolder$bind$52);
                    } catch (Exception unused2) {
                    }
                }
                final TnkAdRecommendLayout tnkAdRecommendLayout4 = TnkAdRecommendLayout.this;
                ?? r11 = new ViewPager2.OnPageChangeCallback() { // from class: com.tnkfactory.ad.basic.TnkAdRecommendLayout$HorizontalHolder$bind$5
                    public void onPageSelected(int i15) {
                        super.onPageSelected(i15);
                        TextView textView3 = textView;
                        int size = tnkAdRecommendLayout4.getArrBindItem().size();
                        StringBuilder sb = new StringBuilder();
                        sb.append((i15 % size) + 1);
                        textView3.setText(sb.toString());
                    }
                };
                this.e = r11;
                Intrinsics.checkNotNull((Object) r11);
                viewPager2.onExtraCallbackWithResult((ViewPager2.OnPageChangeCallback) r11);
                a();
                TnkAdRecommendLayout$HorizontalHolder$bind$7 tnkAdRecommendLayout$HorizontalHolder$bind$72 = this.f;
                if (tnkAdRecommendLayout$HorizontalHolder$bind$72 != null) {
                    viewPager2.removeOnAttachStateChangeListener(tnkAdRecommendLayout$HorizontalHolder$bind$72);
                }
                ?? r112 = new View.OnAttachStateChangeListener() { // from class: com.tnkfactory.ad.basic.TnkAdRecommendLayout$HorizontalHolder$bind$7
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view2) {
                        Intrinsics.checkNotNullParameter(view2, "");
                        TnkAdRecommendLayout.HorizontalHolder.access$applyAutoScrollState(this.a);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view2) {
                        Intrinsics.checkNotNullParameter(view2, "");
                        TnkAdRecommendLayout.HorizontalHolder.access$stopAutoScroll(this.a);
                    }
                };
                this.f = r112;
                Intrinsics.checkNotNull((Object) r112);
                viewPager2.addOnAttachStateChangeListener(r112);
            } else {
                TnkAdRecommendLayout tnkAdRecommendLayout5 = TnkAdRecommendLayout.this;
                tnkAdRecommendLayout5.h = tnkAdRecommendLayout5.getArrBindItem().size();
                TnkAdRecommendLayout$HorizontalHolder$startAutoScroll$1 tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$12 = this.d;
                if (tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$12 != null) {
                    this.c.removeCallbacks(tnkAdRecommendLayout$HorizontalHolder$startAutoScroll$12);
                }
                this.d = null;
            }
            DpUtil dpUtil = DpUtil.INSTANCE;
            final int iDpToPx = dpUtil.dpToPx(10.0f);
            final int iDpToPx2 = dpUtil.dpToPx(10.0f);
            viewPager2.setOffscreenPageLimit(3);
            viewPager2.setPageTransformer(new ViewPager2.onExtraCallbackWithResult() { // from class: com.tnkfactory.ad.basic.TnkAdRecommendLayout$HorizontalHolder$$ExternalSyntheticLambda1
                public final void transformPage(View view2, float f) {
                    TnkAdRecommendLayout.HorizontalHolder.a(iDpToPx2, iDpToPx, view2, f);
                }
            });
            viewPager2.setUserInputEnabled(TnkAdRecommendLayout.this.getArrBindItem().size() > 1);
        }
    }

    public TnkAdRecommendLayout(@NotNull List<? extends AdListVo> list, @NotNull TnkAdListModel tnkAdListModel, @NotNull TnkContext tnkContext) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(tnkAdListModel, "");
        Intrinsics.checkNotNullParameter(tnkContext, "");
        this.a = list;
        this.b = tnkAdListModel;
        this.c = tnkContext;
        this.d = new ArrayList();
        HorizontalHolder horizontalHolder = new HorizontalHolder();
        this.e = horizontalHolder;
        add(horizontalHolder);
        this.f = 2;
        this.g = 7000L;
        this.f33i = true;
    }

    public final TnkAdListModel getAdListModel() {
        return this.b;
    }

    public final List<AdListVo> getArrAdItems() {
        return this.a;
    }

    public final ArrayList<ITnkOffAdItem> getArrBindItem() {
        return this.d;
    }

    public final long getAutoScrollDelay() {
        return this.g;
    }

    public final int getMinAutoScrollItemCount() {
        return this.f;
    }

    public final TnkContext getTnkContext() {
        return this.c;
    }

    @Override // com.tnkfactory.ad.basic.ITnkSection
    public boolean onUpdate() {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (AdListVoKt.isRemoved(((ITnkOffAdItem) obj).getAdItem())) {
                arrayList2.add(obj);
            }
        }
        this.d.removeAll(arrayList2);
        return this.d.size() > 0;
    }

    public final void setArrAdItems(@NotNull List<? extends AdListVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.a = list;
    }

    public final void setAutoScrollEnabled(boolean z) {
        this.e.setAutoScrollEnabled(z);
    }
}

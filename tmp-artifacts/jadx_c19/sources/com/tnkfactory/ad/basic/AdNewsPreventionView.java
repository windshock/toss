package com.tnkfactory.ad.basic;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.basic.AdNewsPreventionView;
import com.tnkfactory.ad.style.DpUtil;
import com.xwray.groupie.GroupieAdapter;
import com.xwray.groupie.Item;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdNewsPreventionView {
    public static final Companion Companion = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f30i = 100101;
    public final ViewGroup a;
    public final Function0 b;
    public GroupieAdapter c;
    public HashMap d;
    public final Integer[] e;
    public int f;
    public int g;
    public int h;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final int getPREVENTION_DIALOG() {
            return AdNewsPreventionView.f30i;
        }
    }

    public final class KeypadHolder extends Item<setColorSchemeColors> {
        public final int a;

        public KeypadHolder(int i2) {
            this.a = i2;
        }

        public static final void a(AdNewsPreventionView adNewsPreventionView, KeypadHolder keypadHolder, View view) {
            adNewsPreventionView.onClickNum(keypadHolder.a);
        }

        @Override // com.xwray.groupie.Item
        public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
            Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
            TextView textView = (TextView) setcolorschemecolors.onNavigationEvent().findViewById(R.id.com_tnk_offerwall_news_prevention_key);
            if (textView != null) {
                final AdNewsPreventionView adNewsPreventionView = AdNewsPreventionView.this;
                int i3 = this.a;
                if (i3 == -1) {
                    textView.setText("");
                } else {
                    textView.setText(String.valueOf(i3));
                }
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdNewsPreventionView$KeypadHolder$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AdNewsPreventionView.KeypadHolder.a(adNewsPreventionView, this, view);
                    }
                });
            }
        }

        @Override // com.xwray.groupie.Item
        public int getLayout() {
            return R.layout.com_tnk_offerwall_news_prevention_key_item;
        }

        public final int getNum() {
            return this.a;
        }
    }

    public AdNewsPreventionView(@NotNull ViewGroup viewGroup, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.a = viewGroup;
        this.b = function0;
        this.c = new GroupieAdapter();
        this.d = new HashMap();
        this.e = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1};
        RecyclerView recyclerViewFindViewById = viewGroup.findViewById(R.id.com_tnk_news_prevention_keypad);
        if (recyclerViewFindViewById != null) {
            recyclerViewFindViewById.setAdapter(this.c);
            recyclerViewFindViewById.setLayoutManager(new GridLayoutManager(viewGroup.getContext(), 4));
        }
        this.g = -1;
        this.h = -1;
    }

    public final void drawNumber(@NotNull View view, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        DpUtil dpUtil = DpUtil.INSTANCE;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dpUtil.dpToPx(60.0f), dpUtil.dpToPx(60.0f), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(16119287);
        TextPaint paint = new TextView(view.getContext()).getPaint();
        paint.setTextSize(dpUtil.dpToPx(42.0f));
        paint.setColor(-16777216);
        paint.setStrokeWidth(dpUtil.dpToPx(3.0f));
        canvas.drawText(String.valueOf(i2), dpUtil.dpToPx(5.0f), dpUtil.dpToPx(45.0f), paint);
        IntRange intRange = new IntRange(0, 10);
        Random.Default r4 = Random.onNavigationEvent;
        int iRandom = RangesKt.random(intRange, r4);
        int iRandom2 = RangesKt.random(new IntRange(20, 40), r4);
        int iRandom3 = RangesKt.random(new IntRange(50, 60), r4);
        int iRandom4 = RangesKt.random(new IntRange(20, 40), r4);
        paint.setColor(-16777216);
        canvas.drawLine(dpUtil.dpToPx(iRandom), dpUtil.dpToPx(iRandom2), dpUtil.dpToPx(iRandom3), dpUtil.dpToPx(iRandom4), paint);
        view.setBackgroundDrawable(new BitmapDrawable(bitmapCreateBitmap));
    }

    public final GroupieAdapter getGroupAdapter() {
        return this.c;
    }

    public final int getInput1() {
        return this.g;
    }

    public final int getInput2() {
        return this.h;
    }

    public final Integer[] getKeyItems() {
        return this.e;
    }

    public final Function0<Unit> getOnComplete() {
        return this.b;
    }

    public final int getRn() {
        return this.f;
    }

    public final HashMap<Integer, Integer> getRndNum() {
        return this.d;
    }

    public final ViewGroup getViewGroup() {
        return this.a;
    }

    public final void onClickNum(int i2) {
        if (i2 != -1) {
            int i3 = this.g;
            if (i3 == -1) {
                this.g = i2;
            } else if (this.h == -1) {
                this.h = i2;
                if ((i3 * 10) + i2 == this.f) {
                    this.b.invoke();
                    this.a.setVisibility(8);
                    return;
                } else {
                    Toast.makeText(this.a.getContext(), "입력된 값이 일치하지 않습니다.", 0).show();
                    setRndNum();
                    this.g = -1;
                    this.h = -1;
                }
            }
            DecimalFormat decimalFormat = new DecimalFormat("##");
            TextView textView = (TextView) this.a.findViewById(R.id.com_tnk_news_prevention_edit);
            if (textView != null) {
                int i4 = this.g;
                if (i4 == -1) {
                    textView.setText("");
                    return;
                }
                int i5 = this.h;
                if (i5 == -1) {
                    textView.setText(String.valueOf(i4));
                } else {
                    textView.setText(decimalFormat.format(Integer.valueOf((i4 * 10) + i5)));
                }
            }
        }
    }

    public final void setGroupAdapter(@NotNull GroupieAdapter groupieAdapter) {
        Intrinsics.checkNotNullParameter(groupieAdapter, "");
        this.c = groupieAdapter;
    }

    public final void setInput1(int i2) {
        this.g = i2;
    }

    public final void setInput2(int i2) {
        this.h = i2;
    }

    public final void setRn(int i2) {
        this.f = i2;
    }

    public final void setRndNum(@NotNull HashMap<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.d = map;
    }

    public final void setRndNum() {
        this.f = RangesKt.random(new IntRange(10, 99), RandomKt.onWarmupCompleted(System.currentTimeMillis()));
        ArraysKt.shuffle(this.e);
        for (int i2 = 0; i2 < 12; i2++) {
            this.d.put(Integer.valueOf(i2), this.e[i2]);
        }
        this.c.clear();
        Iterator it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            this.c.add(new KeypadHolder(((Number) ((Map.Entry) it.next()).getValue()).intValue()));
        }
        View viewFindViewById = this.a.findViewById(R.id.com_tnk_news_prevention_number);
        if (viewFindViewById != null) {
            drawNumber(viewFindViewById, this.f);
        }
    }
}

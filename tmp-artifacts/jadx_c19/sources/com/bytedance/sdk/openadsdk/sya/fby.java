package com.bytedance.sdk.openadsdk.sya;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.sya.jc;
import com.bytedance.sdk.openadsdk.utils.dc;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby extends ViewGroup implements jc.sya {
    private final jc ycx;

    public fby(Context context, jc jcVar) {
        super(context);
        this.ycx = jcVar;
        jcVar.ycx(this);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        View.MeasureSpec.getMode(i2);
        View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        View.MeasureSpec.getSize(i3);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < getChildCount()) {
            View childAt = getChildAt(i4);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            measureChild(childAt, i2, i3);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i7 = i4 != 0 ? marginLayoutParams.leftMargin : 0;
            int i8 = (measuredWidth + i7) + i6 < size ? i6 + i7 : 0;
            if (i8 == 0) {
                i5 += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i6 = i8 + measuredWidth + marginLayoutParams.rightMargin;
            i4++;
        }
        setMeasuredDimension(size, i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i10 = i7 != 0 ? marginLayoutParams.leftMargin : 0;
            if (measuredWidth + i10 + i8 < i4 - i2) {
                i6 = i8 + i10;
            } else {
                i9 += marginLayoutParams.bottomMargin + measuredHeight;
                i6 = 0;
            }
            childAt.layout(i6, marginLayoutParams.topMargin + i9, i6 + measuredWidth, measuredHeight + i9);
            i8 = i6 + measuredWidth + marginLayoutParams.rightMargin;
            i7++;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public void ycx(List<FilterWord> list) {
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                FilterWord filterWord = list.get(i2);
                if (filterWord != null) {
                    addView(zb(filterWord));
                }
            }
        }
    }

    private View zb(FilterWord filterWord) {
        TextView textView = new TextView(getContext());
        textView.setTag(filterWord);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int iZb = dc.zb(getContext(), 8.0f);
        marginLayoutParams.leftMargin = iZb;
        marginLayoutParams.bottomMargin = iZb;
        textView.setTextColor(ycx());
        textView.setText(filterWord.getName());
        textView.setPadding(iZb, iZb, iZb, iZb);
        textView.setBackground(zb());
        textView.setSelected(false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.sya.fby.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (fby.this.ycx != null) {
                    if (view.isSelected()) {
                        fby.this.ycx.ycx(jc.ycx);
                        return;
                    }
                    Object tag = view.getTag();
                    if (tag instanceof FilterWord) {
                        fby.this.ycx.ycx((FilterWord) tag);
                    }
                }
            }
        });
        textView.setSelected(false);
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    private ColorStateList ycx() {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{Color.rgb(OggPageHeader.MAX_SEGMENT_COUNT, 44, 85), -16777216});
    }

    private Drawable zb() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fZb = dc.zb(getContext(), 5.0f);
        gradientDrawable.setCornerRadius(fZb);
        gradientDrawable.setColor(Color.parseColor("#0D000000"));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(dc.zb(getContext(), 1.0f), Color.parseColor("#FE2C55"));
        gradientDrawable2.setCornerRadius(fZb);
        gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    @Override // com.bytedance.sdk.openadsdk.sya.jc.sya
    public void ycx(FilterWord filterWord) {
        if (filterWord != null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null) {
                    if (jc.ycx.equals(filterWord)) {
                        childAt.setSelected(false);
                    } else {
                        childAt.setSelected(filterWord.equals(childAt.getTag()));
                    }
                }
            }
        }
    }
}

package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import java.util.Collection;
import java.util.Iterator;
import o.setCardBackgroundColor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class MonthAdapter extends BaseAdapter {
    private static final int NO_DAY_NUMBER = -1;
    final CalendarConstraints calendarConstraints;
    CalendarStyle calendarStyle;
    final DateSelector<?> dateSelector;
    final DayViewDecorator dayViewDecorator;
    final Month month;
    private Collection<Long> previouslySelectedDates;
    static final int MAXIMUM_WEEKS = UtcDates.getUtcCalendar().getMaximum(4);
    private static final int MAXIMUM_GRID_CELLS = (UtcDates.getUtcCalendar().getMaximum(5) + UtcDates.getUtcCalendar().getMaximum(7)) - 1;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        this.month = month;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
        this.dayViewDecorator = dayViewDecorator;
        this.previouslySelectedDates = dateSelector.getSelectedDays();
    }

    @Override // android.widget.Adapter
    public Long getItem(int i2) {
        if (i2 < firstPositionInMonth() || i2 > lastPositionInMonth()) {
            return null;
        }
        return Long.valueOf(this.month.getDay(positionToDay(i2)));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2 / this.month.daysInWeek;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return MAXIMUM_GRID_CELLS;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextView getView(int i2, @Nullable View view, @NonNull ViewGroup viewGroup) {
        int i3;
        initializeStyles(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iFirstPositionInMonth = i2 - firstPositionInMonth();
        if (iFirstPositionInMonth >= 0) {
            Month month = this.month;
            if (iFirstPositionInMonth >= month.daysInMonth) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i3 = -1;
            } else {
                i3 = iFirstPositionInMonth + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i3)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        }
        Long item = getItem(i2);
        if (item == null) {
            return textView;
        }
        updateSelectedState(textView, item.longValue(), i3);
        return textView;
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.previouslySelectedDates.iterator();
        while (it.hasNext()) {
            updateSelectedStateForDate(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.dateSelector;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.getSelectedDays().iterator();
            while (it2.hasNext()) {
                updateSelectedStateForDate(materialCalendarGridView, it2.next().longValue());
            }
            this.previouslySelectedDates = this.dateSelector.getSelectedDays();
        }
    }

    private void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.create(j).equals(this.month)) {
            int dayOfMonth = this.month.getDayOfMonth(j);
            updateSelectedState((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().dayToPosition(dayOfMonth) - materialCalendarGridView.getFirstVisiblePosition()), j, dayOfMonth);
        }
    }

    private void updateSelectedState(@Nullable TextView textView, long j, int i2) {
        boolean z;
        CalendarItemStyle calendarItemStyle;
        CalendarItemStyle calendarItemStyle2;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String dayContentDescription = getDayContentDescription(context, j);
        textView.setContentDescription(dayContentDescription);
        boolean zIsValid = this.calendarConstraints.getDateValidator().isValid(j);
        if (zIsValid) {
            textView.setEnabled(true);
            boolean zIsSelected = isSelected(j);
            textView.setSelected(zIsSelected);
            if (zIsSelected) {
                calendarItemStyle2 = this.calendarStyle.selectedDay;
            } else if (isToday(j)) {
                calendarItemStyle2 = this.calendarStyle.todayDay;
            } else {
                calendarItemStyle2 = this.calendarStyle.day;
            }
            calendarItemStyle = calendarItemStyle2;
            z = zIsSelected;
        } else {
            textView.setEnabled(false);
            z = false;
            calendarItemStyle = this.calendarStyle.invalidDay;
        }
        DayViewDecorator dayViewDecorator = this.dayViewDecorator;
        if (dayViewDecorator != null && i2 != -1) {
            Month month = this.month;
            int i3 = month.year;
            int i4 = month.month;
            ColorStateList backgroundColor = dayViewDecorator.getBackgroundColor(context, i3, i4, i2, zIsValid, z);
            boolean z2 = z;
            calendarItemStyle.styleItem(textView, backgroundColor, this.dayViewDecorator.getTextColor(context, i3, i4, i2, zIsValid, z2));
            Drawable compoundDrawableLeft = this.dayViewDecorator.getCompoundDrawableLeft(context, i3, i4, i2, zIsValid, z2);
            Drawable compoundDrawableTop = this.dayViewDecorator.getCompoundDrawableTop(context, i3, i4, i2, zIsValid, z2);
            Drawable compoundDrawableRight = this.dayViewDecorator.getCompoundDrawableRight(context, i3, i4, i2, zIsValid, z2);
            boolean z3 = z;
            textView.setCompoundDrawables(compoundDrawableLeft, compoundDrawableTop, compoundDrawableRight, this.dayViewDecorator.getCompoundDrawableBottom(context, i3, i4, i2, zIsValid, z3));
            textView.setContentDescription(this.dayViewDecorator.getContentDescription(context, i3, i4, i2, zIsValid, z3, dayContentDescription));
            return;
        }
        calendarItemStyle.styleItem(textView);
    }

    private String getDayContentDescription(Context context, long j) {
        return DateStrings.getDayContentDescription(context, j, isToday(j), isStartOfRange(j), isEndOfRange(j));
    }

    private boolean isToday(long j) {
        return UtcDates.getTodayCalendar().getTimeInMillis() == j;
    }

    boolean isStartOfRange(long j) {
        Iterator<setCardBackgroundColor<Long, Long>> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Object obj = it.next().onWarmupCompleted;
            if (obj != null && ((Long) obj).longValue() == j) {
                return true;
            }
        }
        return false;
    }

    boolean isEndOfRange(long j) {
        Iterator<setCardBackgroundColor<Long, Long>> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Object obj = it.next().onExtraCallbackWithResult;
            if (obj != null && ((Long) obj).longValue() == j) {
                return true;
            }
        }
        return false;
    }

    private boolean isSelected(long j) {
        Iterator<Long> it = this.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (UtcDates.canonicalYearMonthDay(j) == UtcDates.canonicalYearMonthDay(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void initializeStyles(Context context) {
        if (this.calendarStyle == null) {
            this.calendarStyle = new CalendarStyle(context);
        }
    }

    int firstPositionInMonth() {
        return this.month.daysFromStartOfWeekToFirstOfMonth(this.calendarConstraints.getFirstDayOfWeek());
    }

    int lastPositionInMonth() {
        return (firstPositionInMonth() + this.month.daysInMonth) - 1;
    }

    int positionToDay(int i2) {
        return (i2 - firstPositionInMonth()) + 1;
    }

    int dayToPosition(int i2) {
        return firstPositionInMonth() + (i2 - 1);
    }

    boolean withinMonth(int i2) {
        return i2 >= firstPositionInMonth() && i2 <= lastPositionInMonth();
    }

    boolean isFirstInRow(int i2) {
        return i2 % this.month.daysInWeek == 0;
    }

    boolean isLastInRow(int i2) {
        return (i2 + 1) % this.month.daysInWeek == 0;
    }
}

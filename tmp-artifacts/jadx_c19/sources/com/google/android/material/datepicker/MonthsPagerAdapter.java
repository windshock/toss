package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class MonthsPagerAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final CalendarConstraints calendarConstraints;
    private final DateSelector<?> dateSelector;
    private final DayViewDecorator dayViewDecorator;
    private final int itemHeight;
    private final MaterialCalendar.OnDayClickListener onDayClickListener;

    MonthsPagerAdapter(@NonNull Context context, DateSelector<?> dateSelector, @NonNull CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator, MaterialCalendar.OnDayClickListener onDayClickListener) {
        Month start = calendarConstraints.getStart();
        Month end = calendarConstraints.getEnd();
        Month openAt = calendarConstraints.getOpenAt();
        if (start.compareTo(openAt) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (openAt.compareTo(end) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.itemHeight = (MonthAdapter.MAXIMUM_WEEKS * MaterialCalendar.getDayHeight(context)) + (MaterialDatePicker.isFullscreen(context) ? MaterialCalendar.getDayHeight(context) : 0);
        this.calendarConstraints = calendarConstraints;
        this.dateSelector = dateSelector;
        this.dayViewDecorator = dayViewDecorator;
        this.onDayClickListener = onDayClickListener;
        setHasStableIds(true);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final MaterialCalendarGridView monthGrid;
        final TextView monthTitle;

        ViewHolder(@NonNull LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.monthTitle = textView;
            ViewCompat.IAuthTabCallback(textView, true);
            this.monthGrid = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (MaterialDatePicker.isFullscreen(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.itemHeight));
            return new ViewHolder(linearLayout, true);
        }
        return new ViewHolder(linearLayout, false);
    }

    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i2) {
        Month monthMonthsLater = this.calendarConstraints.getStart().monthsLater(i2);
        viewHolder.monthTitle.setText(monthMonthsLater.getLongName());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder.monthGrid.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() != null && monthMonthsLater.equals(materialCalendarGridView.getAdapter().month)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().updateSelectedStates(materialCalendarGridView);
        } else {
            MonthAdapter monthAdapter = new MonthAdapter(monthMonthsLater, this.dateSelector, this.calendarConstraints, this.dayViewDecorator);
            materialCalendarGridView.setNumColumns(monthMonthsLater.daysInWeek);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.datepicker.MonthsPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j) {
                if (materialCalendarGridView.getAdapter().withinMonth(i3)) {
                    MonthsPagerAdapter.this.onDayClickListener.onDayClick(materialCalendarGridView.getAdapter().getItem(i3).longValue());
                }
            }
        });
    }

    public long getItemId(int i2) {
        return this.calendarConstraints.getStart().monthsLater(i2).getStableId();
    }

    public int getItemCount() {
        return this.calendarConstraints.getMonthSpan();
    }

    CharSequence getPageTitle(int i2) {
        return getPageMonth(i2).getLongName();
    }

    Month getPageMonth(int i2) {
        return this.calendarConstraints.getStart().monthsLater(i2);
    }

    int getPosition(@NonNull Month month) {
        return this.calendarConstraints.getStart().monthsUntil(month);
    }
}

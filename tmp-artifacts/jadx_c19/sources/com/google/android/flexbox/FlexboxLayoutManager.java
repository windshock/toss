package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxHelper;
import java.util.ArrayList;
import java.util.List;
import o.ExposedDropdownMenuPositionProviderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements FlexContainer, RecyclerView.SmoothScroller.ScrollVectorProvider {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = false;
    private static final String TAG = "FlexboxLayoutManager";
    private static final Rect TEMP_RECT = new Rect();
    private int mAlignItems;
    private AnchorInfo mAnchorInfo;
    private final Context mContext;
    private int mDirtyPosition;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private final FlexboxHelper mFlexboxHelper;
    private boolean mFromBottomToTop;
    private boolean mIsRtl;
    private int mJustifyContent;
    private int mLastHeight;
    private int mLastWidth;
    private LayoutState mLayoutState;
    private int mMaxLine;
    private ExposedDropdownMenuPositionProviderExternalSyntheticLambda0 mOrientationHelper;
    private View mParent;
    private SavedState mPendingSavedState;
    private int mPendingScrollPosition;
    private int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private RecyclerView.Recycler mRecycler;
    private RecyclerView.State mState;
    private ExposedDropdownMenuPositionProviderExternalSyntheticLambda0 mSubOrientationHelper;
    private SparseArray<View> mViewCache;

    public int getAlignContent() {
        return 5;
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void onNewFlexLineAdded(FlexLine flexLine) {
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    public FlexboxLayoutManager(Context context, int i2) {
        this(context, i2, 1);
    }

    public FlexboxLayoutManager(Context context, int i2, int i3) {
        this.mMaxLine = -1;
        this.mFlexLines = new ArrayList();
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mAnchorInfo = new AnchorInfo();
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mLastWidth = Integer.MIN_VALUE;
        this.mLastHeight = Integer.MIN_VALUE;
        this.mViewCache = new SparseArray<>();
        this.mDirtyPosition = -1;
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        setFlexDirection(i2);
        setFlexWrap(i3);
        setAlignItems(4);
        this.mContext = context;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.mMaxLine = -1;
        this.mFlexLines = new ArrayList();
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mAnchorInfo = new AnchorInfo();
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mLastWidth = Integer.MIN_VALUE;
        this.mLastHeight = Integer.MIN_VALUE;
        this.mViewCache = new SparseArray<>();
        this.mDirtyPosition = -1;
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i2, i3);
        int i4 = properties.onNavigationEvent;
        if (i4 != 0) {
            if (i4 == 1) {
                if (properties.onWarmupCompleted) {
                    setFlexDirection(3);
                } else {
                    setFlexDirection(2);
                }
            }
        } else if (properties.onWarmupCompleted) {
            setFlexDirection(1);
        } else {
            setFlexDirection(0);
        }
        setFlexWrap(1);
        setAlignItems(4);
        this.mContext = context;
    }

    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    public void setFlexDirection(int i2) {
        if (this.mFlexDirection != i2) {
            removeAllViews();
            this.mFlexDirection = i2;
            this.mOrientationHelper = null;
            this.mSubOrientationHelper = null;
            clearFlexLines();
            requestLayout();
        }
    }

    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    public void setFlexWrap(int i2) {
        if (i2 == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i3 = this.mFlexWrap;
        if (i3 != i2) {
            if (i3 == 0 || i2 == 0) {
                removeAllViews();
                clearFlexLines();
            }
            this.mFlexWrap = i2;
            this.mOrientationHelper = null;
            this.mSubOrientationHelper = null;
            requestLayout();
        }
    }

    public int getJustifyContent() {
        return this.mJustifyContent;
    }

    public void setJustifyContent(int i2) {
        if (this.mJustifyContent != i2) {
            this.mJustifyContent = i2;
            requestLayout();
        }
    }

    public int getAlignItems() {
        return this.mAlignItems;
    }

    public void setAlignItems(int i2) {
        int i3 = this.mAlignItems;
        if (i3 != i2) {
            if (i3 == 4 || i2 == 4) {
                removeAllViews();
                clearFlexLines();
            }
            this.mAlignItems = i2;
            requestLayout();
        }
    }

    public void setAlignContent(int i2) {
        throw new UnsupportedOperationException("Setting the alignContent in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to use this attribute.");
    }

    public int getMaxLine() {
        return this.mMaxLine;
    }

    public void setMaxLine(int i2) {
        if (this.mMaxLine != i2) {
            this.mMaxLine = i2;
            requestLayout();
        }
    }

    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        int size = this.mFlexLines.size();
        for (int i2 = 0; i2 < size; i2++) {
            FlexLine flexLine = this.mFlexLines.get(i2);
            if (flexLine.getItemCount() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    public int getDecorationLengthMainAxis(View view, int i2, int i3) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (isMainAxisDirectionHorizontal()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    public int getDecorationLengthCrossAxis(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (isMainAxisDirectionHorizontal()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    public void onNewFlexItemAdded(View view, int i2, int i3, FlexLine flexLine) {
        calculateItemDecorationsForChild(view, TEMP_RECT);
        if (isMainAxisDirectionHorizontal()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            flexLine.mMainSize += leftDecorationWidth;
            flexLine.mDividerLengthInMainSize += leftDecorationWidth;
        } else {
            int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
            flexLine.mMainSize += topDecorationHeight;
            flexLine.mDividerLengthInMainSize += topDecorationHeight;
        }
    }

    public int getFlexItemCount() {
        return this.mState.onWarmupCompleted();
    }

    public View getFlexItemAt(int i2) {
        View view = this.mViewCache.get(i2);
        return view != null ? view : this.mRecycler.IAuthTabCallback(i2);
    }

    public View getReorderedFlexItemAt(int i2) {
        return getFlexItemAt(i2);
    }

    public int getChildWidthMeasureSpec(int i2, int i3, int i4) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i3, i4, canScrollHorizontally());
    }

    public int getChildHeightMeasureSpec(int i2, int i3, int i4) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i3, i4, canScrollVertically());
    }

    public int getLargestMainSize() {
        if (this.mFlexLines.size() == 0) {
            return 0;
        }
        int size = this.mFlexLines.size();
        int iMax = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            iMax = Math.max(iMax, this.mFlexLines.get(i2).mMainSize);
        }
        return iMax;
    }

    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += this.mFlexLines.get(i3).mCrossSize;
        }
        return i2;
    }

    public void setFlexLines(List<FlexLine> list) {
        this.mFlexLines = list;
    }

    public List<FlexLine> getFlexLinesInternal() {
        return this.mFlexLines;
    }

    public void updateViewCache(int i2, View view) {
        this.mViewCache.put(i2, view);
    }

    public PointF computeScrollVectorForPosition(int i2) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i3 = i2 < getPosition(childAt) ? -1 : 1;
        if (isMainAxisDirectionHorizontal()) {
            return new PointF(0.0f, i3);
        }
        return new PointF(i3, 0.0f);
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            View childClosestToStart = getChildClosestToStart();
            savedState.mAnchorPosition = getPosition(childClosestToStart);
            savedState.mAnchorOffset = this.mOrientationHelper.onExtraCallback(childClosestToStart) - this.mOrientationHelper.asBinder();
            return savedState;
        }
        savedState.invalidateAnchor();
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i2, int i3) {
        super.onItemsAdded(recyclerView, i2, i3);
        updateDirtyPosition(i2);
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i2, int i3, Object obj) {
        super.onItemsUpdated(recyclerView, i2, i3, obj);
        updateDirtyPosition(i2);
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i2, int i3) {
        super.onItemsUpdated(recyclerView, i2, i3);
        updateDirtyPosition(i2);
    }

    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i2, int i3) {
        super.onItemsRemoved(recyclerView, i2, i3);
        updateDirtyPosition(i2);
    }

    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i2, int i3, int i4) {
        super.onItemsMoved(recyclerView, i2, i3, i4);
        updateDirtyPosition(Math.min(i2, i3));
    }

    private void updateDirtyPosition(int i2) {
        if (i2 < findLastVisibleItemPosition()) {
            int childCount = getChildCount();
            this.mFlexboxHelper.ensureMeasureSpecCache(childCount);
            this.mFlexboxHelper.ensureMeasuredSizeCache(childCount);
            this.mFlexboxHelper.ensureIndexToFlexLine(childCount);
            if (i2 < this.mFlexboxHelper.mIndexToFlexLine.length) {
                this.mDirtyPosition = i2;
                View childClosestToStart = getChildClosestToStart();
                if (childClosestToStart == null) {
                    return;
                }
                this.mPendingScrollPosition = getPosition(childClosestToStart);
                if (!isMainAxisDirectionHorizontal() && this.mIsRtl) {
                    this.mPendingScrollPositionOffset = this.mOrientationHelper.onNavigationEvent(childClosestToStart) + this.mOrientationHelper.IAuthTabCallback();
                } else {
                    this.mPendingScrollPositionOffset = this.mOrientationHelper.onExtraCallback(childClosestToStart) - this.mOrientationHelper.asBinder();
                }
            }
        }
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        int i3;
        this.mRecycler = recycler;
        this.mState = state;
        int iOnWarmupCompleted = state.onWarmupCompleted();
        if (iOnWarmupCompleted == 0 && state.IAuthTabCallback()) {
            return;
        }
        resolveLayoutDirection();
        ensureOrientationHelper();
        ensureLayoutState();
        this.mFlexboxHelper.ensureMeasureSpecCache(iOnWarmupCompleted);
        this.mFlexboxHelper.ensureMeasuredSizeCache(iOnWarmupCompleted);
        this.mFlexboxHelper.ensureIndexToFlexLine(iOnWarmupCompleted);
        this.mLayoutState.mShouldRecycle = false;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.hasValidAnchor(iOnWarmupCompleted)) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }
        if (!this.mAnchorInfo.mValid || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            this.mAnchorInfo.reset();
            updateAnchorInfoForLayout(state, this.mAnchorInfo);
            this.mAnchorInfo.mValid = true;
        }
        detachAndScrapAttachedViews(recycler);
        if (this.mAnchorInfo.mLayoutFromEnd) {
            updateLayoutStateToFillStart(this.mAnchorInfo, false, true);
        } else {
            updateLayoutStateToFillEnd(this.mAnchorInfo, false, true);
        }
        updateFlexLines(iOnWarmupCompleted);
        fill(recycler, state, this.mLayoutState);
        if (this.mAnchorInfo.mLayoutFromEnd) {
            i3 = this.mLayoutState.mOffset;
            updateLayoutStateToFillEnd(this.mAnchorInfo, true, false);
            fill(recycler, state, this.mLayoutState);
            i2 = this.mLayoutState.mOffset;
        } else {
            i2 = this.mLayoutState.mOffset;
            updateLayoutStateToFillStart(this.mAnchorInfo, true, false);
            fill(recycler, state, this.mLayoutState);
            i3 = this.mLayoutState.mOffset;
        }
        if (getChildCount() > 0) {
            if (this.mAnchorInfo.mLayoutFromEnd) {
                fixLayoutStartGap(i3 + fixLayoutEndGap(i2, recycler, state, true), recycler, state, false);
            } else {
                fixLayoutEndGap(i2 + fixLayoutStartGap(i3, recycler, state, true), recycler, state, false);
            }
        }
    }

    private int fixLayoutStartGap(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int iHandleScrollingMainOrientation;
        int iAsBinder;
        if (!isMainAxisDirectionHorizontal() && this.mIsRtl) {
            int iOnWarmupCompleted = this.mOrientationHelper.onWarmupCompleted() - i2;
            if (iOnWarmupCompleted <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = handleScrollingMainOrientation(-iOnWarmupCompleted, recycler, state);
        } else {
            int iAsBinder2 = i2 - this.mOrientationHelper.asBinder();
            if (iAsBinder2 <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = -handleScrollingMainOrientation(iAsBinder2, recycler, state);
        }
        if (!z || (iAsBinder = (i2 + iHandleScrollingMainOrientation) - this.mOrientationHelper.asBinder()) <= 0) {
            return iHandleScrollingMainOrientation;
        }
        this.mOrientationHelper.onNavigationEvent(-iAsBinder);
        return iHandleScrollingMainOrientation - iAsBinder;
    }

    private int fixLayoutEndGap(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int iHandleScrollingMainOrientation;
        int iOnWarmupCompleted;
        if (!isMainAxisDirectionHorizontal() && this.mIsRtl) {
            int iAsBinder = i2 - this.mOrientationHelper.asBinder();
            if (iAsBinder <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = handleScrollingMainOrientation(iAsBinder, recycler, state);
        } else {
            int iOnWarmupCompleted2 = this.mOrientationHelper.onWarmupCompleted() - i2;
            if (iOnWarmupCompleted2 <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = -handleScrollingMainOrientation(-iOnWarmupCompleted2, recycler, state);
        }
        if (!z || (iOnWarmupCompleted = this.mOrientationHelper.onWarmupCompleted() - (i2 + iHandleScrollingMainOrientation)) <= 0) {
            return iHandleScrollingMainOrientation;
        }
        this.mOrientationHelper.onNavigationEvent(iOnWarmupCompleted);
        return iOnWarmupCompleted + iHandleScrollingMainOrientation;
    }

    private void updateFlexLines(int i2) {
        boolean z;
        int i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        if (isMainAxisDirectionHorizontal()) {
            int i4 = this.mLastWidth;
            z = (i4 == Integer.MIN_VALUE || i4 == width) ? false : true;
            i3 = this.mLayoutState.mInfinite ? this.mContext.getResources().getDisplayMetrics().heightPixels : this.mLayoutState.mAvailable;
        } else {
            int i5 = this.mLastHeight;
            z = (i5 == Integer.MIN_VALUE || i5 == height) ? false : true;
            i3 = this.mLayoutState.mInfinite ? this.mContext.getResources().getDisplayMetrics().widthPixels : this.mLayoutState.mAvailable;
        }
        int i6 = i3;
        this.mLastWidth = width;
        this.mLastHeight = height;
        int i7 = this.mDirtyPosition;
        if (i7 != -1 || (this.mPendingScrollPosition == -1 && !z)) {
            int iMin = i7 != -1 ? Math.min(i7, this.mAnchorInfo.mPosition) : this.mAnchorInfo.mPosition;
            this.mFlexLinesResult.reset();
            if (isMainAxisDirectionHorizontal()) {
                if (this.mFlexLines.size() > 0) {
                    this.mFlexboxHelper.clearFlexLines(this.mFlexLines, iMin);
                    this.mFlexboxHelper.calculateFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i6, iMin, this.mAnchorInfo.mPosition, this.mFlexLines);
                } else {
                    this.mFlexboxHelper.ensureIndexToFlexLine(i2);
                    this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i6, 0, this.mFlexLines);
                }
            } else if (this.mFlexLines.size() > 0) {
                this.mFlexboxHelper.clearFlexLines(this.mFlexLines, iMin);
                this.mFlexboxHelper.calculateFlexLines(this.mFlexLinesResult, iMakeMeasureSpec2, iMakeMeasureSpec, i6, iMin, this.mAnchorInfo.mPosition, this.mFlexLines);
            } else {
                this.mFlexboxHelper.ensureIndexToFlexLine(i2);
                this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i6, 0, this.mFlexLines);
            }
            this.mFlexLines = this.mFlexLinesResult.mFlexLines;
            this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            this.mFlexboxHelper.stretchViews(iMin);
            return;
        }
        if (this.mAnchorInfo.mLayoutFromEnd) {
            return;
        }
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        if (isMainAxisDirectionHorizontal()) {
            this.mFlexboxHelper.calculateHorizontalFlexLinesToIndex(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i6, this.mAnchorInfo.mPosition, this.mFlexLines);
        } else {
            this.mFlexboxHelper.calculateVerticalFlexLinesToIndex(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i6, this.mAnchorInfo.mPosition, this.mFlexLines);
        }
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.mFlexboxHelper.stretchViews();
        AnchorInfo anchorInfo = this.mAnchorInfo;
        anchorInfo.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[anchorInfo.mPosition];
        this.mLayoutState.mFlexLinePosition = this.mAnchorInfo.mFlexLinePosition;
    }

    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mDirtyPosition = -1;
        this.mAnchorInfo.reset();
        this.mViewCache.clear();
    }

    boolean isLayoutRtl() {
        return this.mIsRtl;
    }

    private void resolveLayoutDirection() {
        int layoutDirection = getLayoutDirection();
        int i2 = this.mFlexDirection;
        if (i2 == 0) {
            this.mIsRtl = layoutDirection == 1;
            this.mFromBottomToTop = this.mFlexWrap == 2;
            return;
        }
        if (i2 == 1) {
            this.mIsRtl = layoutDirection != 1;
            this.mFromBottomToTop = this.mFlexWrap == 2;
            return;
        }
        if (i2 == 2) {
            boolean z = layoutDirection == 1;
            this.mIsRtl = z;
            if (this.mFlexWrap == 2) {
                this.mIsRtl = !z;
            }
            this.mFromBottomToTop = false;
            return;
        }
        if (i2 == 3) {
            boolean z2 = layoutDirection == 1;
            this.mIsRtl = z2;
            if (this.mFlexWrap == 2) {
                this.mIsRtl = !z2;
            }
            this.mFromBottomToTop = true;
            return;
        }
        this.mIsRtl = false;
        this.mFromBottomToTop = false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.State state, AnchorInfo anchorInfo) {
        if (updateAnchorFromPendingState(state, anchorInfo, this.mPendingSavedState) || updateAnchorFromChildren(state, anchorInfo)) {
            return;
        }
        anchorInfo.assignCoordinateFromPadding();
        anchorInfo.mPosition = 0;
        anchorInfo.mFlexLinePosition = 0;
    }

    private boolean updateAnchorFromPendingState(RecyclerView.State state, AnchorInfo anchorInfo, SavedState savedState) {
        int i2;
        View childAt;
        int iOnExtraCallback;
        if (!state.IAuthTabCallback() && (i2 = this.mPendingScrollPosition) != -1) {
            if (i2 < 0 || i2 >= state.onWarmupCompleted()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            } else {
                anchorInfo.mPosition = this.mPendingScrollPosition;
                anchorInfo.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[anchorInfo.mPosition];
                SavedState savedState2 = this.mPendingSavedState;
                if (savedState2 == null || !savedState2.hasValidAnchor(state.onWarmupCompleted())) {
                    if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                        View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                        if (viewFindViewByPosition != null) {
                            if (this.mOrientationHelper.onExtraCallbackWithResult(viewFindViewByPosition) <= this.mOrientationHelper.asInterface()) {
                                if (this.mOrientationHelper.onExtraCallback(viewFindViewByPosition) - this.mOrientationHelper.asBinder() >= 0) {
                                    if (this.mOrientationHelper.onWarmupCompleted() - this.mOrientationHelper.onNavigationEvent(viewFindViewByPosition) < 0) {
                                        anchorInfo.mCoordinate = this.mOrientationHelper.onWarmupCompleted();
                                        anchorInfo.mLayoutFromEnd = true;
                                        return true;
                                    }
                                    if (anchorInfo.mLayoutFromEnd) {
                                        iOnExtraCallback = this.mOrientationHelper.onNavigationEvent(viewFindViewByPosition) + this.mOrientationHelper.IAuthTabCallbackStub();
                                    } else {
                                        iOnExtraCallback = this.mOrientationHelper.onExtraCallback(viewFindViewByPosition);
                                    }
                                    anchorInfo.mCoordinate = iOnExtraCallback;
                                } else {
                                    anchorInfo.mCoordinate = this.mOrientationHelper.asBinder();
                                    anchorInfo.mLayoutFromEnd = false;
                                    return true;
                                }
                            } else {
                                anchorInfo.assignCoordinateFromPadding();
                                return true;
                            }
                        } else {
                            if (getChildCount() > 0 && (childAt = getChildAt(0)) != null) {
                                anchorInfo.mLayoutFromEnd = this.mPendingScrollPosition < getPosition(childAt);
                            }
                            anchorInfo.assignCoordinateFromPadding();
                        }
                        return true;
                    }
                    if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
                        anchorInfo.mCoordinate = this.mOrientationHelper.asBinder() + this.mPendingScrollPositionOffset;
                    } else {
                        anchorInfo.mCoordinate = this.mPendingScrollPositionOffset - this.mOrientationHelper.IAuthTabCallback();
                    }
                    return true;
                }
                anchorInfo.mCoordinate = this.mOrientationHelper.asBinder() + savedState.mAnchorOffset;
                anchorInfo.mAssignedFromSavedState = true;
                anchorInfo.mFlexLinePosition = -1;
                return true;
            }
        }
        return false;
    }

    private boolean updateAnchorFromChildren(RecyclerView.State state, AnchorInfo anchorInfo) {
        View viewFindFirstReferenceChild;
        int iAsBinder;
        if (getChildCount() == 0) {
            return false;
        }
        if (anchorInfo.mLayoutFromEnd) {
            viewFindFirstReferenceChild = findLastReferenceChild(state.onWarmupCompleted());
        } else {
            viewFindFirstReferenceChild = findFirstReferenceChild(state.onWarmupCompleted());
        }
        if (viewFindFirstReferenceChild == null) {
            return false;
        }
        anchorInfo.assignFromView(viewFindFirstReferenceChild);
        if (state.IAuthTabCallback() || !supportsPredictiveItemAnimations()) {
            return true;
        }
        if (this.mOrientationHelper.onExtraCallback(viewFindFirstReferenceChild) < this.mOrientationHelper.onWarmupCompleted() && this.mOrientationHelper.onNavigationEvent(viewFindFirstReferenceChild) >= this.mOrientationHelper.asBinder()) {
            return true;
        }
        if (anchorInfo.mLayoutFromEnd) {
            iAsBinder = this.mOrientationHelper.onWarmupCompleted();
        } else {
            iAsBinder = this.mOrientationHelper.asBinder();
        }
        anchorInfo.mCoordinate = iAsBinder;
        return true;
    }

    private View findFirstReferenceChild(int i2) {
        View viewFindReferenceChild = findReferenceChild(0, getChildCount(), i2);
        if (viewFindReferenceChild == null) {
            return null;
        }
        int i3 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(viewFindReferenceChild)];
        if (i3 == -1) {
            return null;
        }
        return findFirstReferenceViewInLine(viewFindReferenceChild, this.mFlexLines.get(i3));
    }

    private View findLastReferenceChild(int i2) {
        View viewFindReferenceChild = findReferenceChild(getChildCount() - 1, -1, i2);
        if (viewFindReferenceChild == null) {
            return null;
        }
        return findLastReferenceViewInLine(viewFindReferenceChild, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[getPosition(viewFindReferenceChild)]));
    }

    private View findReferenceChild(int i2, int i3, int i4) {
        int position;
        ensureOrientationHelper();
        ensureLayoutState();
        int iAsBinder = this.mOrientationHelper.asBinder();
        int iOnWarmupCompleted = this.mOrientationHelper.onWarmupCompleted();
        int i5 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i4) {
                if (childAt.getLayoutParams().isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.onExtraCallback(childAt) >= iAsBinder && this.mOrientationHelper.onNavigationEvent(childAt) <= iOnWarmupCompleted) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i2 += i5;
        }
        return view != null ? view : view2;
    }

    private View getChildClosestToStart() {
        return getChildAt(0);
    }

    private int fill(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState) {
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            if (layoutState.mAvailable < 0) {
                LayoutState.access$2012(layoutState, layoutState.mAvailable);
            }
            recycleByLayoutState(recycler, layoutState);
        }
        int i2 = layoutState.mAvailable;
        int crossSize = layoutState.mAvailable;
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int iLayoutFlexLine = 0;
        while (true) {
            if ((crossSize <= 0 && !this.mLayoutState.mInfinite) || !layoutState.hasMore(state, this.mFlexLines)) {
                break;
            }
            FlexLine flexLine = this.mFlexLines.get(layoutState.mFlexLinePosition);
            layoutState.mPosition = flexLine.mFirstIndex;
            iLayoutFlexLine += layoutFlexLine(flexLine, layoutState);
            if (zIsMainAxisDirectionHorizontal || !this.mIsRtl) {
                LayoutState.access$1012(layoutState, flexLine.getCrossSize() * layoutState.mLayoutDirection);
            } else {
                LayoutState.access$1020(layoutState, flexLine.getCrossSize() * layoutState.mLayoutDirection);
            }
            crossSize -= flexLine.getCrossSize();
        }
        LayoutState.access$1220(layoutState, iLayoutFlexLine);
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            LayoutState.access$2012(layoutState, iLayoutFlexLine);
            if (layoutState.mAvailable < 0) {
                LayoutState.access$2012(layoutState, layoutState.mAvailable);
            }
            recycleByLayoutState(recycler, layoutState);
        }
        return i2 - layoutState.mAvailable;
    }

    private void recycleByLayoutState(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (layoutState.mShouldRecycle) {
            if (layoutState.mLayoutDirection == -1) {
                recycleFlexLinesFromEnd(recycler, layoutState);
            } else {
                recycleFlexLinesFromStart(recycler, layoutState);
            }
        }
    }

    private void recycleFlexLinesFromStart(RecyclerView.Recycler recycler, LayoutState layoutState) {
        int childCount;
        View childAt;
        if (layoutState.mScrollingOffset < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(0)) == null) {
            return;
        }
        int i2 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(childAt)];
        int i3 = -1;
        if (i2 == -1) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(i2);
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt2 = getChildAt(i4);
            if (childAt2 != null) {
                if (!canViewBeRecycledFromStart(childAt2, layoutState.mScrollingOffset)) {
                    break;
                }
                if (flexLine.mLastIndex != getPosition(childAt2)) {
                    continue;
                } else if (i2 >= this.mFlexLines.size() - 1) {
                    i3 = i4;
                    break;
                } else {
                    i2 += layoutState.mLayoutDirection;
                    flexLine = this.mFlexLines.get(i2);
                    i3 = i4;
                }
            }
            i4++;
        }
        recycleChildren(recycler, 0, i3);
    }

    private boolean canViewBeRecycledFromStart(View view, int i2) {
        return (isMainAxisDirectionHorizontal() || !this.mIsRtl) ? this.mOrientationHelper.onNavigationEvent(view) <= i2 : this.mOrientationHelper.onNavigationEvent() - this.mOrientationHelper.onExtraCallback(view) <= i2;
    }

    private void recycleFlexLinesFromEnd(RecyclerView.Recycler recycler, LayoutState layoutState) {
        int childCount;
        int i2;
        View childAt;
        int i3;
        if (layoutState.mScrollingOffset < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(childCount - 1)) == null || (i3 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(childAt)]) == -1) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(i3);
        int i4 = i2;
        while (true) {
            if (i4 < 0) {
                break;
            }
            View childAt2 = getChildAt(i4);
            if (childAt2 != null) {
                if (!canViewBeRecycledFromEnd(childAt2, layoutState.mScrollingOffset)) {
                    break;
                }
                if (flexLine.mFirstIndex != getPosition(childAt2)) {
                    continue;
                } else if (i3 <= 0) {
                    childCount = i4;
                    break;
                } else {
                    i3 += layoutState.mLayoutDirection;
                    flexLine = this.mFlexLines.get(i3);
                    childCount = i4;
                }
            }
            i4--;
        }
        recycleChildren(recycler, childCount, i2);
    }

    private boolean canViewBeRecycledFromEnd(View view, int i2) {
        return (isMainAxisDirectionHorizontal() || !this.mIsRtl) ? this.mOrientationHelper.onExtraCallback(view) >= this.mOrientationHelper.onNavigationEvent() - i2 : this.mOrientationHelper.onNavigationEvent(view) <= i2;
    }

    private void recycleChildren(RecyclerView.Recycler recycler, int i2, int i3) {
        while (i3 >= i2) {
            removeAndRecycleViewAt(i3, recycler);
            i3--;
        }
    }

    private int layoutFlexLine(FlexLine flexLine, LayoutState layoutState) {
        if (isMainAxisDirectionHorizontal()) {
            return layoutFlexLineMainAxisHorizontal(flexLine, layoutState);
        }
        return layoutFlexLineMainAxisVertical(flexLine, layoutState);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int layoutFlexLineMainAxisHorizontal(FlexLine flexLine, LayoutState layoutState) {
        float f;
        float f2;
        float f3;
        int itemCount;
        int i2;
        RecyclerView.LayoutParams layoutParams;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int width = getWidth();
        int i3 = layoutState.mOffset;
        if (layoutState.mLayoutDirection == -1) {
            i3 -= flexLine.mCrossSize;
        }
        int i4 = i3;
        int i5 = layoutState.mPosition;
        int i6 = this.mJustifyContent;
        int i7 = 1;
        if (i6 == 0) {
            f = paddingLeft;
            f2 = width - paddingRight;
        } else if (i6 == 1) {
            int i8 = flexLine.mMainSize;
            float f4 = (width - i8) + paddingRight;
            f2 = i8 - paddingLeft;
            f = f4;
        } else if (i6 == 2) {
            float f5 = (width - flexLine.mMainSize) / 2.0f;
            f = paddingLeft + f5;
            f2 = (width - paddingRight) - f5;
        } else {
            if (i6 == 3) {
                f = paddingLeft;
                f3 = (width - flexLine.mMainSize) / (flexLine.mItemCount != 1 ? r4 - 1 : 1.0f);
                f2 = width - paddingRight;
            } else if (i6 == 4) {
                int i9 = flexLine.mItemCount;
                f3 = i9 != 0 ? (width - flexLine.mMainSize) / i9 : 0.0f;
                float f6 = f3 / 2.0f;
                f = paddingLeft + f6;
                f2 = (width - paddingRight) - f6;
            } else if (i6 == 5) {
                f3 = flexLine.mItemCount != 0 ? (width - flexLine.mMainSize) / (r4 + 1) : 0.0f;
                f = paddingLeft + f3;
                f2 = (width - paddingRight) - f3;
            } else {
                throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
            }
            float measuredWidth = f - this.mAnchorInfo.mPerpendicularCoordinate;
            float measuredWidth2 = f2 - this.mAnchorInfo.mPerpendicularCoordinate;
            float fMax = Math.max(f3, 0.0f);
            itemCount = flexLine.getItemCount();
            int i10 = 0;
            i2 = i5;
            while (i2 < i5 + itemCount) {
                View flexItemAt = getFlexItemAt(i2);
                if (flexItemAt != null) {
                    if (layoutState.mLayoutDirection == i7) {
                        calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                        addView(flexItemAt);
                    } else {
                        calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                        addView(flexItemAt, i10);
                        i10++;
                    }
                    int i11 = i10;
                    FlexboxHelper flexboxHelper = this.mFlexboxHelper;
                    long j = flexboxHelper.mMeasureSpecCache[i2];
                    int iExtractLowerInt = flexboxHelper.extractLowerInt(j);
                    int iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j);
                    RecyclerView.LayoutParams layoutParams2 = (LayoutParams) flexItemAt.getLayoutParams();
                    if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, layoutParams2)) {
                        flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                    }
                    float leftDecorationWidth = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + getLeftDecorationWidth(flexItemAt);
                    float rightDecorationWidth = measuredWidth2 - (((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + getRightDecorationWidth(flexItemAt));
                    int topDecorationHeight = i4 + getTopDecorationHeight(flexItemAt);
                    if (this.mIsRtl) {
                        layoutParams = layoutParams2;
                        this.mFlexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine, Math.round(rightDecorationWidth) - flexItemAt.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                    } else {
                        layoutParams = layoutParams2;
                        this.mFlexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine, Math.round(leftDecorationWidth), topDecorationHeight, flexItemAt.getMeasuredWidth() + Math.round(leftDecorationWidth), topDecorationHeight + flexItemAt.getMeasuredHeight());
                    }
                    i10 = i11;
                    measuredWidth = leftDecorationWidth + flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(flexItemAt) + fMax;
                    measuredWidth2 = rightDecorationWidth - (((flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + getLeftDecorationWidth(flexItemAt)) + fMax);
                }
                i2++;
                i7 = 1;
            }
            LayoutState.access$1512(layoutState, this.mLayoutState.mLayoutDirection);
            return flexLine.getCrossSize();
        }
        f3 = 0.0f;
        float measuredWidth3 = f - this.mAnchorInfo.mPerpendicularCoordinate;
        float measuredWidth22 = f2 - this.mAnchorInfo.mPerpendicularCoordinate;
        float fMax2 = Math.max(f3, 0.0f);
        itemCount = flexLine.getItemCount();
        int i102 = 0;
        i2 = i5;
        while (i2 < i5 + itemCount) {
        }
        LayoutState.access$1512(layoutState, this.mLayoutState.mLayoutDirection);
        return flexLine.getCrossSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int layoutFlexLineMainAxisVertical(FlexLine flexLine, LayoutState layoutState) {
        float f;
        float f2;
        float f3;
        int itemCount;
        int i2;
        int i3;
        boolean z;
        float f4;
        View view;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = layoutState.mOffset;
        int i5 = layoutState.mOffset;
        if (layoutState.mLayoutDirection == -1) {
            int i6 = flexLine.mCrossSize;
            i4 -= i6;
            i5 += i6;
        }
        int i7 = i4;
        int i8 = i5;
        int i9 = layoutState.mPosition;
        int i10 = this.mJustifyContent;
        boolean z2 = true;
        if (i10 == 0) {
            f = paddingTop;
            f2 = height - paddingBottom;
        } else if (i10 == 1) {
            int i11 = flexLine.mMainSize;
            float f5 = (height - i11) + paddingBottom;
            f2 = i11 - paddingTop;
            f = f5;
        } else if (i10 == 2) {
            float f6 = (height - flexLine.mMainSize) / 2.0f;
            f = paddingTop + f6;
            f2 = (height - paddingBottom) - f6;
        } else {
            if (i10 == 3) {
                f = paddingTop;
                f3 = (height - flexLine.mMainSize) / (flexLine.mItemCount != 1 ? r4 - 1 : 1.0f);
                f2 = height - paddingBottom;
            } else if (i10 == 4) {
                int i12 = flexLine.mItemCount;
                f3 = i12 != 0 ? (height - flexLine.mMainSize) / i12 : 0.0f;
                float f7 = f3 / 2.0f;
                f = paddingTop + f7;
                f2 = (height - paddingBottom) - f7;
            } else if (i10 == 5) {
                f3 = flexLine.mItemCount != 0 ? (height - flexLine.mMainSize) / (r4 + 1) : 0.0f;
                f = paddingTop + f3;
                f2 = (height - paddingBottom) - f3;
            } else {
                throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
            }
            float measuredHeight = f - this.mAnchorInfo.mPerpendicularCoordinate;
            float measuredHeight2 = f2 - this.mAnchorInfo.mPerpendicularCoordinate;
            float fMax = Math.max(f3, 0.0f);
            itemCount = flexLine.getItemCount();
            int i13 = 0;
            i2 = i9;
            while (i2 < i9 + itemCount) {
                View flexItemAt = getFlexItemAt(i2);
                if (flexItemAt != null) {
                    FlexboxHelper flexboxHelper = this.mFlexboxHelper;
                    f4 = fMax;
                    long j = flexboxHelper.mMeasureSpecCache[i2];
                    int iExtractLowerInt = flexboxHelper.extractLowerInt(j);
                    int iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j);
                    if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, (LayoutParams) flexItemAt.getLayoutParams())) {
                        flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                    }
                    float topDecorationHeight = measuredHeight + ((ViewGroup.MarginLayoutParams) r13).topMargin + getTopDecorationHeight(flexItemAt);
                    float bottomDecorationHeight = measuredHeight2 - (((ViewGroup.MarginLayoutParams) r13).rightMargin + getBottomDecorationHeight(flexItemAt));
                    if (layoutState.mLayoutDirection == 1) {
                        calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                        addView(flexItemAt);
                    } else {
                        calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                        addView(flexItemAt, i13);
                        i13++;
                    }
                    int i14 = i13;
                    int leftDecorationWidth = getLeftDecorationWidth(flexItemAt) + i7;
                    int rightDecorationWidth = i8 - getRightDecorationWidth(flexItemAt);
                    boolean z3 = this.mIsRtl;
                    if (z3) {
                        if (this.mFromBottomToTop) {
                            z = true;
                            view = flexItemAt;
                            i3 = i2;
                            this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z3, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(bottomDecorationHeight) - flexItemAt.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight));
                        } else {
                            z = true;
                            view = flexItemAt;
                            i3 = i2;
                            this.mFlexboxHelper.layoutSingleChildVertical(view, flexLine, z3, rightDecorationWidth - view.getMeasuredWidth(), Math.round(topDecorationHeight), rightDecorationWidth, view.getMeasuredHeight() + Math.round(topDecorationHeight));
                        }
                    } else {
                        z = true;
                        view = flexItemAt;
                        i3 = i2;
                        if (this.mFromBottomToTop) {
                            this.mFlexboxHelper.layoutSingleChildVertical(view, flexLine, z3, leftDecorationWidth, Math.round(bottomDecorationHeight) - view.getMeasuredHeight(), leftDecorationWidth + view.getMeasuredWidth(), Math.round(bottomDecorationHeight));
                        } else {
                            this.mFlexboxHelper.layoutSingleChildVertical(view, flexLine, z3, leftDecorationWidth, Math.round(topDecorationHeight), leftDecorationWidth + view.getMeasuredWidth(), view.getMeasuredHeight() + Math.round(topDecorationHeight));
                        }
                    }
                    View view2 = view;
                    measuredHeight = topDecorationHeight + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r13).topMargin + getBottomDecorationHeight(view2) + f4;
                    i13 = i14;
                    measuredHeight2 = bottomDecorationHeight - (((view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r13).bottomMargin) + getTopDecorationHeight(view2)) + f4);
                } else {
                    i3 = i2;
                    z = z2;
                    f4 = fMax;
                }
                i2 = i3 + 1;
                fMax = f4;
                z2 = z;
            }
            LayoutState.access$1512(layoutState, this.mLayoutState.mLayoutDirection);
            return flexLine.getCrossSize();
        }
        f3 = 0.0f;
        float measuredHeight3 = f - this.mAnchorInfo.mPerpendicularCoordinate;
        float measuredHeight22 = f2 - this.mAnchorInfo.mPerpendicularCoordinate;
        float fMax2 = Math.max(f3, 0.0f);
        itemCount = flexLine.getItemCount();
        int i132 = 0;
        i2 = i9;
        while (i2 < i9 + itemCount) {
        }
        LayoutState.access$1512(layoutState, this.mLayoutState.mLayoutDirection);
        return flexLine.getCrossSize();
    }

    public boolean isMainAxisDirectionHorizontal() {
        int i2 = this.mFlexDirection;
        return i2 == 0 || i2 == 1;
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo, boolean z, boolean z2) {
        if (z2) {
            resolveInfiniteAmount();
        } else {
            this.mLayoutState.mInfinite = false;
        }
        if (!isMainAxisDirectionHorizontal() && this.mIsRtl) {
            this.mLayoutState.mAvailable = anchorInfo.mCoordinate - getPaddingRight();
        } else {
            this.mLayoutState.mAvailable = this.mOrientationHelper.onWarmupCompleted() - anchorInfo.mCoordinate;
        }
        this.mLayoutState.mPosition = anchorInfo.mPosition;
        this.mLayoutState.mItemDirection = 1;
        this.mLayoutState.mLayoutDirection = 1;
        this.mLayoutState.mOffset = anchorInfo.mCoordinate;
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        this.mLayoutState.mFlexLinePosition = anchorInfo.mFlexLinePosition;
        if (!z || this.mFlexLines.size() <= 1 || anchorInfo.mFlexLinePosition < 0 || anchorInfo.mFlexLinePosition >= this.mFlexLines.size() - 1) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(anchorInfo.mFlexLinePosition);
        LayoutState.access$1508(this.mLayoutState);
        LayoutState.access$2212(this.mLayoutState, flexLine.getItemCount());
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo, boolean z, boolean z2) {
        if (z2) {
            resolveInfiniteAmount();
        } else {
            this.mLayoutState.mInfinite = false;
        }
        if (!isMainAxisDirectionHorizontal() && this.mIsRtl) {
            this.mLayoutState.mAvailable = (this.mParent.getWidth() - anchorInfo.mCoordinate) - this.mOrientationHelper.asBinder();
        } else {
            this.mLayoutState.mAvailable = anchorInfo.mCoordinate - this.mOrientationHelper.asBinder();
        }
        this.mLayoutState.mPosition = anchorInfo.mPosition;
        this.mLayoutState.mItemDirection = 1;
        this.mLayoutState.mLayoutDirection = -1;
        this.mLayoutState.mOffset = anchorInfo.mCoordinate;
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        this.mLayoutState.mFlexLinePosition = anchorInfo.mFlexLinePosition;
        if (!z || anchorInfo.mFlexLinePosition <= 0 || this.mFlexLines.size() <= anchorInfo.mFlexLinePosition) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(anchorInfo.mFlexLinePosition);
        LayoutState.access$1510(this.mLayoutState);
        LayoutState.access$2220(this.mLayoutState, flexLine.getItemCount());
    }

    private void resolveInfiniteAmount() {
        int widthMode;
        if (isMainAxisDirectionHorizontal()) {
            widthMode = getHeightMode();
        } else {
            widthMode = getWidthMode();
        }
        this.mLayoutState.mInfinite = widthMode == 0 || widthMode == Integer.MIN_VALUE;
    }

    private void ensureOrientationHelper() {
        if (this.mOrientationHelper != null) {
            return;
        }
        if (isMainAxisDirectionHorizontal()) {
            if (this.mFlexWrap == 0) {
                this.mOrientationHelper = ExposedDropdownMenuPositionProviderExternalSyntheticLambda0.IAuthTabCallback(this);
                this.mSubOrientationHelper = ExposedDropdownMenuPositionProviderExternalSyntheticLambda0.onWarmupCompleted(this);
                return;
            } else {
                this.mOrientationHelper = ExposedDropdownMenuPositionProviderExternalSyntheticLambda0.onWarmupCompleted(this);
                this.mSubOrientationHelper = ExposedDropdownMenuPositionProviderExternalSyntheticLambda0.IAuthTabCallback(this);
                return;
            }
        }
        if (this.mFlexWrap == 0) {
            this.mOrientationHelper = ExposedDropdownMenuPositionProviderExternalSyntheticLambda0.onWarmupCompleted(this);
            this.mSubOrientationHelper = ExposedDropdownMenuPositionProviderExternalSyntheticLambda0.IAuthTabCallback(this);
        } else {
            this.mOrientationHelper = ExposedDropdownMenuPositionProviderExternalSyntheticLambda0.IAuthTabCallback(this);
            this.mSubOrientationHelper = ExposedDropdownMenuPositionProviderExternalSyntheticLambda0.onWarmupCompleted(this);
        }
    }

    private void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = new LayoutState();
        }
    }

    public void scrollToPosition(int i2) {
        this.mPendingScrollPosition = i2;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i2);
        startSmoothScroll(linearSmoothScroller);
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.mParent = (View) recyclerView.getParent();
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.IAuthTabCallback();
        }
    }

    public boolean canScrollHorizontally() {
        if (this.mFlexWrap == 0) {
            return isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            return true;
        }
        int width = getWidth();
        View view = this.mParent;
        return width > (view != null ? view.getWidth() : 0);
    }

    public boolean canScrollVertically() {
        if (this.mFlexWrap == 0) {
            return !isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            int height = getHeight();
            View view = this.mParent;
            if (height <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    public int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!isMainAxisDirectionHorizontal() || this.mFlexWrap == 0) {
            int iHandleScrollingMainOrientation = handleScrollingMainOrientation(i2, recycler, state);
            this.mViewCache.clear();
            return iHandleScrollingMainOrientation;
        }
        int iHandleScrollingSubOrientation = handleScrollingSubOrientation(i2);
        AnchorInfo.access$2412(this.mAnchorInfo, iHandleScrollingSubOrientation);
        this.mSubOrientationHelper.onNavigationEvent(-iHandleScrollingSubOrientation);
        return iHandleScrollingSubOrientation;
    }

    public int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (isMainAxisDirectionHorizontal() || (this.mFlexWrap == 0 && !isMainAxisDirectionHorizontal())) {
            int iHandleScrollingMainOrientation = handleScrollingMainOrientation(i2, recycler, state);
            this.mViewCache.clear();
            return iHandleScrollingMainOrientation;
        }
        int iHandleScrollingSubOrientation = handleScrollingSubOrientation(i2);
        AnchorInfo.access$2412(this.mAnchorInfo, iHandleScrollingSubOrientation);
        this.mSubOrientationHelper.onNavigationEvent(-iHandleScrollingSubOrientation);
        return iHandleScrollingSubOrientation;
    }

    private int handleScrollingMainOrientation(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        ensureOrientationHelper();
        int i3 = 1;
        this.mLayoutState.mShouldRecycle = true;
        boolean z = !isMainAxisDirectionHorizontal() && this.mIsRtl;
        if (!z ? i2 <= 0 : i2 >= 0) {
            i3 = -1;
        }
        int iAbs = Math.abs(i2);
        updateLayoutState(i3, iAbs);
        int iFill = this.mLayoutState.mScrollingOffset + fill(recycler, state, this.mLayoutState);
        if (iFill < 0) {
            return 0;
        }
        if (z) {
            if (iAbs > iFill) {
                i2 = (-i3) * iFill;
            }
        } else if (iAbs > iFill) {
            i2 = i3 * iFill;
        }
        this.mOrientationHelper.onNavigationEvent(-i2);
        this.mLayoutState.mLastScrollDelta = i2;
        return i2;
    }

    private int handleScrollingSubOrientation(int i2) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        ensureOrientationHelper();
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        View view = this.mParent;
        int width = zIsMainAxisDirectionHorizontal ? view.getWidth() : view.getHeight();
        int width2 = zIsMainAxisDirectionHorizontal ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            int iAbs = Math.abs(i2);
            if (i2 < 0) {
                return -Math.min((width2 + this.mAnchorInfo.mPerpendicularCoordinate) - width, iAbs);
            }
            if (this.mAnchorInfo.mPerpendicularCoordinate + i2 > 0) {
                return -this.mAnchorInfo.mPerpendicularCoordinate;
            }
        } else {
            if (i2 > 0) {
                return Math.min((width2 - this.mAnchorInfo.mPerpendicularCoordinate) - width, i2);
            }
            if (this.mAnchorInfo.mPerpendicularCoordinate + i2 < 0) {
                return -this.mAnchorInfo.mPerpendicularCoordinate;
            }
        }
        return i2;
    }

    private void updateLayoutState(int i2, int i3) {
        this.mLayoutState.mLayoutDirection = i2;
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z = !zIsMainAxisDirectionHorizontal && this.mIsRtl;
        if (i2 == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt == null) {
                return;
            }
            this.mLayoutState.mOffset = this.mOrientationHelper.onNavigationEvent(childAt);
            int position = getPosition(childAt);
            View viewFindLastReferenceViewInLine = findLastReferenceViewInLine(childAt, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[position]));
            this.mLayoutState.mItemDirection = 1;
            LayoutState layoutState = this.mLayoutState;
            layoutState.mPosition = position + layoutState.mItemDirection;
            if (this.mFlexboxHelper.mIndexToFlexLine.length > this.mLayoutState.mPosition) {
                LayoutState layoutState2 = this.mLayoutState;
                layoutState2.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[layoutState2.mPosition];
            } else {
                this.mLayoutState.mFlexLinePosition = -1;
            }
            if (z) {
                this.mLayoutState.mOffset = this.mOrientationHelper.onExtraCallback(viewFindLastReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = (-this.mOrientationHelper.onExtraCallback(viewFindLastReferenceViewInLine)) + this.mOrientationHelper.asBinder();
                LayoutState layoutState3 = this.mLayoutState;
                layoutState3.mScrollingOffset = Math.max(layoutState3.mScrollingOffset, 0);
            } else {
                this.mLayoutState.mOffset = this.mOrientationHelper.onNavigationEvent(viewFindLastReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.onNavigationEvent(viewFindLastReferenceViewInLine) - this.mOrientationHelper.onWarmupCompleted();
            }
            if ((this.mLayoutState.mFlexLinePosition == -1 || this.mLayoutState.mFlexLinePosition > this.mFlexLines.size() - 1) && this.mLayoutState.mPosition <= getFlexItemCount()) {
                int i4 = i3 - this.mLayoutState.mScrollingOffset;
                this.mFlexLinesResult.reset();
                if (i4 > 0) {
                    if (zIsMainAxisDirectionHorizontal) {
                        this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i4, this.mLayoutState.mPosition, this.mFlexLines);
                    } else {
                        this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i4, this.mLayoutState.mPosition, this.mFlexLines);
                    }
                    this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2, this.mLayoutState.mPosition);
                    this.mFlexboxHelper.stretchViews(this.mLayoutState.mPosition);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 == null) {
                return;
            }
            this.mLayoutState.mOffset = this.mOrientationHelper.onExtraCallback(childAt2);
            int position2 = getPosition(childAt2);
            View viewFindFirstReferenceViewInLine = findFirstReferenceViewInLine(childAt2, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[position2]));
            this.mLayoutState.mItemDirection = 1;
            int i5 = this.mFlexboxHelper.mIndexToFlexLine[position2];
            if (i5 == -1) {
                i5 = 0;
            }
            if (i5 > 0) {
                this.mLayoutState.mPosition = position2 - this.mFlexLines.get(i5 - 1).getItemCount();
            } else {
                this.mLayoutState.mPosition = -1;
            }
            this.mLayoutState.mFlexLinePosition = i5 > 0 ? i5 - 1 : 0;
            if (z) {
                this.mLayoutState.mOffset = this.mOrientationHelper.onNavigationEvent(viewFindFirstReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.onNavigationEvent(viewFindFirstReferenceViewInLine) - this.mOrientationHelper.onWarmupCompleted();
                LayoutState layoutState4 = this.mLayoutState;
                layoutState4.mScrollingOffset = Math.max(layoutState4.mScrollingOffset, 0);
            } else {
                this.mLayoutState.mOffset = this.mOrientationHelper.onExtraCallback(viewFindFirstReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = (-this.mOrientationHelper.onExtraCallback(viewFindFirstReferenceViewInLine)) + this.mOrientationHelper.asBinder();
            }
        }
        LayoutState layoutState5 = this.mLayoutState;
        layoutState5.mAvailable = i3 - layoutState5.mScrollingOffset;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private View findFirstReferenceViewInLine(View view, FlexLine flexLine) {
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i2 = flexLine.mItemCount;
        for (int i3 = 1; i3 < i2; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (this.mIsRtl && !zIsMainAxisDirectionHorizontal) {
                    if (this.mOrientationHelper.onNavigationEvent(view) < this.mOrientationHelper.onNavigationEvent(childAt)) {
                    }
                } else if (this.mOrientationHelper.onExtraCallback(view) > this.mOrientationHelper.onExtraCallback(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private View findLastReferenceViewInLine(View view, FlexLine flexLine) {
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int childCount = getChildCount();
        int i2 = flexLine.mItemCount;
        for (int childCount2 = getChildCount() - 2; childCount2 > (childCount - i2) - 1; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (this.mIsRtl && !zIsMainAxisDirectionHorizontal) {
                    if (this.mOrientationHelper.onExtraCallback(view) > this.mOrientationHelper.onExtraCallback(childAt)) {
                    }
                } else if (this.mOrientationHelper.onNavigationEvent(view) < this.mOrientationHelper.onNavigationEvent(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public int computeHorizontalScrollExtent(@NonNull RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    public int computeVerticalScrollExtent(@NonNull RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iOnWarmupCompleted = state.onWarmupCompleted();
        ensureOrientationHelper();
        View viewFindFirstReferenceChild = findFirstReferenceChild(iOnWarmupCompleted);
        View viewFindLastReferenceChild = findLastReferenceChild(iOnWarmupCompleted);
        if (state.onWarmupCompleted() == 0 || viewFindFirstReferenceChild == null || viewFindLastReferenceChild == null) {
            return 0;
        }
        return Math.min(this.mOrientationHelper.asInterface(), this.mOrientationHelper.onNavigationEvent(viewFindLastReferenceChild) - this.mOrientationHelper.onExtraCallback(viewFindFirstReferenceChild));
    }

    public int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    public int computeVerticalScrollOffset(@NonNull RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iOnWarmupCompleted = state.onWarmupCompleted();
        View viewFindFirstReferenceChild = findFirstReferenceChild(iOnWarmupCompleted);
        View viewFindLastReferenceChild = findLastReferenceChild(iOnWarmupCompleted);
        if (state.onWarmupCompleted() != 0 && viewFindFirstReferenceChild != null && viewFindLastReferenceChild != null) {
            int position = getPosition(viewFindFirstReferenceChild);
            int position2 = getPosition(viewFindLastReferenceChild);
            int iAbs = Math.abs(this.mOrientationHelper.onNavigationEvent(viewFindLastReferenceChild) - this.mOrientationHelper.onExtraCallback(viewFindFirstReferenceChild));
            int i2 = this.mFlexboxHelper.mIndexToFlexLine[position];
            if (i2 != 0 && i2 != -1) {
                return Math.round((i2 * (iAbs / ((r4[position2] - i2) + 1))) + (this.mOrientationHelper.asBinder() - this.mOrientationHelper.onExtraCallback(viewFindFirstReferenceChild)));
            }
        }
        return 0;
    }

    public int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public int computeVerticalScrollRange(@NonNull RecyclerView.State state) {
        return computeScrollRange(state);
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iOnWarmupCompleted = state.onWarmupCompleted();
        View viewFindFirstReferenceChild = findFirstReferenceChild(iOnWarmupCompleted);
        View viewFindLastReferenceChild = findLastReferenceChild(iOnWarmupCompleted);
        if (state.onWarmupCompleted() == 0 || viewFindFirstReferenceChild == null || viewFindLastReferenceChild == null) {
            return 0;
        }
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        return (int) ((Math.abs(this.mOrientationHelper.onNavigationEvent(viewFindLastReferenceChild) - this.mOrientationHelper.onExtraCallback(viewFindFirstReferenceChild)) / ((findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1)) * state.onWarmupCompleted());
    }

    private boolean shouldMeasureChild(View view, int i2, int i3, RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    private static boolean isMeasurementUpToDate(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i2;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i2;
        }
        return true;
    }

    private void clearFlexLines() {
        this.mFlexLines.clear();
        this.mAnchorInfo.reset();
        this.mAnchorInfo.mPerpendicularCoordinate = 0;
    }

    private int getChildLeft(View view) {
        return getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
    }

    private int getChildRight(View view) {
        return getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
    }

    private int getChildTop(View view) {
        return getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    private int getChildBottom(View view) {
        return getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    private boolean isViewVisible(View view, boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int childLeft = getChildLeft(view);
        int childTop = getChildTop(view);
        int childRight = getChildRight(view);
        int childBottom = getChildBottom(view);
        return z ? (paddingLeft <= childLeft && width >= childRight) && (paddingTop <= childTop && height >= childBottom) : (childLeft >= width || childRight >= paddingLeft) && (childTop >= height || childBottom >= paddingTop);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    private View findOneVisibleChild(int i2, int i3, boolean z) {
        int i4 = i3 > i2 ? 1 : -1;
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (isViewVisible(childAt, z)) {
                return childAt;
            }
            i2 += i4;
        }
        return null;
    }

    int getPositionToFlexLineIndex(int i2) {
        return this.mFlexboxHelper.mIndexToFlexLine[i2];
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.LayoutParams.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int i2) {
                return new LayoutParams[i2];
            }
        };
        private int mAlignSelf;
        private float mFlexBasisPercent;
        private float mFlexGrow;
        private float mFlexShrink;
        private int mMaxHeight;
        private int mMaxWidth;
        private int mMinHeight;
        private int mMinWidth;
        private boolean mWrapBefore;

        public int describeContents() {
            return 0;
        }

        public int getOrder() {
            return 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void setWidth(int i2) {
            ((ViewGroup.MarginLayoutParams) this).width = i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void setHeight(int i2) {
            ((ViewGroup.MarginLayoutParams) this).height = i2;
        }

        public float getFlexGrow() {
            return this.mFlexGrow;
        }

        public void setFlexGrow(float f) {
            this.mFlexGrow = f;
        }

        public float getFlexShrink() {
            return this.mFlexShrink;
        }

        public void setFlexShrink(float f) {
            this.mFlexShrink = f;
        }

        public int getAlignSelf() {
            return this.mAlignSelf;
        }

        public void setAlignSelf(int i2) {
            this.mAlignSelf = i2;
        }

        public int getMinWidth() {
            return this.mMinWidth;
        }

        public void setMinWidth(int i2) {
            this.mMinWidth = i2;
        }

        public int getMinHeight() {
            return this.mMinHeight;
        }

        public void setMinHeight(int i2) {
            this.mMinHeight = i2;
        }

        public int getMaxWidth() {
            return this.mMaxWidth;
        }

        public void setMaxWidth(int i2) {
            this.mMaxWidth = i2;
        }

        public int getMaxHeight() {
            return this.mMaxHeight;
        }

        public void setMaxHeight(int i2) {
            this.mMaxHeight = i2;
        }

        public boolean isWrapBefore() {
            return this.mWrapBefore;
        }

        public void setWrapBefore(boolean z) {
            this.mWrapBefore = z;
        }

        public float getFlexBasisPercent() {
            return this.mFlexBasisPercent;
        }

        public void setFlexBasisPercent(float f) {
            this.mFlexBasisPercent = f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mFlexGrow = layoutParams.mFlexGrow;
            this.mFlexShrink = layoutParams.mFlexShrink;
            this.mAlignSelf = layoutParams.mAlignSelf;
            this.mFlexBasisPercent = layoutParams.mFlexBasisPercent;
            this.mMinWidth = layoutParams.mMinWidth;
            this.mMinHeight = layoutParams.mMinHeight;
            this.mMaxWidth = layoutParams.mMaxWidth;
            this.mMaxHeight = layoutParams.mMaxHeight;
            this.mWrapBefore = layoutParams.mWrapBefore;
        }

        public void setOrder(int i2) {
            throw new UnsupportedOperationException("Setting the order in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to reorder using the attribute.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeFloat(this.mFlexGrow);
            parcel.writeFloat(this.mFlexShrink);
            parcel.writeInt(this.mAlignSelf);
            parcel.writeFloat(this.mFlexBasisPercent);
            parcel.writeInt(this.mMinWidth);
            parcel.writeInt(this.mMinHeight);
            parcel.writeInt(this.mMaxWidth);
            parcel.writeInt(this.mMaxHeight);
            parcel.writeByte(this.mWrapBefore ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mFlexGrow = parcel.readFloat();
            this.mFlexShrink = parcel.readFloat();
            this.mAlignSelf = parcel.readInt();
            this.mFlexBasisPercent = parcel.readFloat();
            this.mMinWidth = parcel.readInt();
            this.mMinHeight = parcel.readInt();
            this.mMaxWidth = parcel.readInt();
            this.mMaxHeight = parcel.readInt();
            this.mWrapBefore = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    class AnchorInfo {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private boolean mAssignedFromSavedState;
        private int mCoordinate;
        private int mFlexLinePosition;
        private boolean mLayoutFromEnd;
        private int mPerpendicularCoordinate;
        private int mPosition;
        private boolean mValid;

        private AnchorInfo() {
            this.mPerpendicularCoordinate = 0;
        }

        static /* synthetic */ int access$2412(AnchorInfo anchorInfo, int i2) {
            int i3 = anchorInfo.mPerpendicularCoordinate + i2;
            anchorInfo.mPerpendicularCoordinate = i3;
            return i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.mPosition = -1;
            this.mFlexLinePosition = -1;
            this.mCoordinate = Integer.MIN_VALUE;
            this.mValid = false;
            this.mAssignedFromSavedState = false;
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal()) {
                if (FlexboxLayoutManager.this.mFlexWrap == 0) {
                    this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexDirection == 1;
                    return;
                } else {
                    this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexWrap == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.mFlexWrap == 0) {
                this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexDirection == 3;
            } else {
                this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexWrap == 2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void assignCoordinateFromPadding() {
            if (!FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() && FlexboxLayoutManager.this.mIsRtl) {
                this.mCoordinate = this.mLayoutFromEnd ? FlexboxLayoutManager.this.mOrientationHelper.onWarmupCompleted() : FlexboxLayoutManager.this.getWidth() - FlexboxLayoutManager.this.mOrientationHelper.asBinder();
            } else {
                this.mCoordinate = this.mLayoutFromEnd ? FlexboxLayoutManager.this.mOrientationHelper.onWarmupCompleted() : FlexboxLayoutManager.this.mOrientationHelper.asBinder();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void assignFromView(View view) {
            ExposedDropdownMenuPositionProviderExternalSyntheticLambda0 exposedDropdownMenuPositionProviderExternalSyntheticLambda0 = FlexboxLayoutManager.this.mFlexWrap == 0 ? FlexboxLayoutManager.this.mSubOrientationHelper : FlexboxLayoutManager.this.mOrientationHelper;
            if (!FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() && FlexboxLayoutManager.this.mIsRtl) {
                if (this.mLayoutFromEnd) {
                    this.mCoordinate = exposedDropdownMenuPositionProviderExternalSyntheticLambda0.onExtraCallback(view) + exposedDropdownMenuPositionProviderExternalSyntheticLambda0.IAuthTabCallbackStub();
                } else {
                    this.mCoordinate = exposedDropdownMenuPositionProviderExternalSyntheticLambda0.onNavigationEvent(view);
                }
            } else if (this.mLayoutFromEnd) {
                this.mCoordinate = exposedDropdownMenuPositionProviderExternalSyntheticLambda0.onNavigationEvent(view) + exposedDropdownMenuPositionProviderExternalSyntheticLambda0.IAuthTabCallbackStub();
            } else {
                this.mCoordinate = exposedDropdownMenuPositionProviderExternalSyntheticLambda0.onExtraCallback(view);
            }
            this.mPosition = FlexboxLayoutManager.this.getPosition(view);
            this.mAssignedFromSavedState = false;
            int[] iArr = FlexboxLayoutManager.this.mFlexboxHelper.mIndexToFlexLine;
            int i2 = this.mPosition;
            if (i2 == -1) {
                i2 = 0;
            }
            int i3 = iArr[i2];
            this.mFlexLinePosition = i3 != -1 ? i3 : 0;
            if (FlexboxLayoutManager.this.mFlexLines.size() > this.mFlexLinePosition) {
                this.mPosition = ((FlexLine) FlexboxLayoutManager.this.mFlexLines.get(this.mFlexLinePosition)).mFirstIndex;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.mPosition + ", mFlexLinePosition=" + this.mFlexLinePosition + ", mCoordinate=" + this.mCoordinate + ", mPerpendicularCoordinate=" + this.mPerpendicularCoordinate + ", mLayoutFromEnd=" + this.mLayoutFromEnd + ", mValid=" + this.mValid + ", mAssignedFromSavedState=" + this.mAssignedFromSavedState + '}';
        }
    }

    static class LayoutState {
        private static final int ITEM_DIRECTION_TAIL = 1;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;
        private static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
        private int mAvailable;
        private int mFlexLinePosition;
        private boolean mInfinite;
        private int mItemDirection;
        private int mLastScrollDelta;
        private int mLayoutDirection;
        private int mOffset;
        private int mPosition;
        private int mScrollingOffset;
        private boolean mShouldRecycle;

        private LayoutState() {
            this.mItemDirection = 1;
            this.mLayoutDirection = 1;
        }

        static /* synthetic */ int access$1012(LayoutState layoutState, int i2) {
            int i3 = layoutState.mOffset + i2;
            layoutState.mOffset = i3;
            return i3;
        }

        static /* synthetic */ int access$1020(LayoutState layoutState, int i2) {
            int i3 = layoutState.mOffset - i2;
            layoutState.mOffset = i3;
            return i3;
        }

        static /* synthetic */ int access$1220(LayoutState layoutState, int i2) {
            int i3 = layoutState.mAvailable - i2;
            layoutState.mAvailable = i3;
            return i3;
        }

        static /* synthetic */ int access$1508(LayoutState layoutState) {
            int i2 = layoutState.mFlexLinePosition;
            layoutState.mFlexLinePosition = i2 + 1;
            return i2;
        }

        static /* synthetic */ int access$1510(LayoutState layoutState) {
            int i2 = layoutState.mFlexLinePosition;
            layoutState.mFlexLinePosition = i2 - 1;
            return i2;
        }

        static /* synthetic */ int access$1512(LayoutState layoutState, int i2) {
            int i3 = layoutState.mFlexLinePosition + i2;
            layoutState.mFlexLinePosition = i3;
            return i3;
        }

        static /* synthetic */ int access$2012(LayoutState layoutState, int i2) {
            int i3 = layoutState.mScrollingOffset + i2;
            layoutState.mScrollingOffset = i3;
            return i3;
        }

        static /* synthetic */ int access$2212(LayoutState layoutState, int i2) {
            int i3 = layoutState.mPosition + i2;
            layoutState.mPosition = i3;
            return i3;
        }

        static /* synthetic */ int access$2220(LayoutState layoutState, int i2) {
            int i3 = layoutState.mPosition - i2;
            layoutState.mPosition = i3;
            return i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasMore(RecyclerView.State state, List<FlexLine> list) {
            int i2;
            int i3 = this.mPosition;
            return i3 >= 0 && i3 < state.onWarmupCompleted() && (i2 = this.mFlexLinePosition) >= 0 && i2 < list.size();
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.mAvailable + ", mFlexLinePosition=" + this.mFlexLinePosition + ", mPosition=" + this.mPosition + ", mOffset=" + this.mOffset + ", mScrollingOffset=" + this.mScrollingOffset + ", mLastScrollDelta=" + this.mLastScrollDelta + ", mItemDirection=" + this.mItemDirection + ", mLayoutDirection=" + this.mLayoutDirection + '}';
        }
    }

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };
        private int mAnchorOffset;
        private int mAnchorPosition;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
        }

        SavedState() {
        }

        private SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
        }

        private SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasValidAnchor(int i2) {
            int i3 = this.mAnchorPosition;
            return i3 >= 0 && i3 < i2;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.mAnchorPosition + ", mAnchorOffset=" + this.mAnchorOffset + '}';
        }
    }
}

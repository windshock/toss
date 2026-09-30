package o;

import android.database.DataSetObserver;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class pkcs12MakePFXWithEncPKCS8 extends pkcs12MakePFX<ViewPager> {
    private DataSetObserver IAuthTabCallback;
    private ViewPager onExtraCallback;
    private PagerAdapter onExtraCallbackWithResult;
    private ViewPager.asInterface onNavigationEvent;

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.IAuthTabCallback
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(@NonNull final ScrollingPagerIndicator scrollingPagerIndicator, @NonNull ViewPager viewPager) {
        PagerAdapter adapter = viewPager.getAdapter();
        this.onExtraCallbackWithResult = adapter;
        if (adapter == null) {
            throw new IllegalStateException("Set adapter before call attachToPager() method");
        }
        this.onExtraCallback = viewPager;
        onExtraCallbackWithResult(scrollingPagerIndicator);
        DataSetObserver dataSetObserver = new DataSetObserver() { // from class: o.pkcs12MakePFXWithEncPKCS8.5
            @Override // android.database.DataSetObserver
            public void onChanged() {
                scrollingPagerIndicator.onExtraCallbackWithResult();
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                onChanged();
            }
        };
        this.IAuthTabCallback = dataSetObserver;
        this.onExtraCallbackWithResult.registerDataSetObserver(dataSetObserver);
        ViewPager.asInterface asinterface = new ViewPager.asInterface() { // from class: o.pkcs12MakePFXWithEncPKCS8.1
            boolean onWarmupCompleted = true;

            public void onPageScrolled(int i, float f, int i2) {
                pkcs12MakePFXWithEncPKCS8.this.onExtraCallbackWithResult(scrollingPagerIndicator, i, f);
            }

            public void onPageSelected(int i) {
                if (this.onWarmupCompleted) {
                    pkcs12MakePFXWithEncPKCS8.this.onExtraCallbackWithResult(scrollingPagerIndicator);
                }
            }

            public void onPageScrollStateChanged(int i) {
                this.onWarmupCompleted = i == 0;
            }
        };
        this.onNavigationEvent = asinterface;
        viewPager.addOnPageChangeListener(asinterface);
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.IAuthTabCallback
    public void onExtraCallbackWithResult() {
        this.onExtraCallbackWithResult.unregisterDataSetObserver(this.IAuthTabCallback);
        this.onExtraCallback.removeOnPageChangeListener(this.onNavigationEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallbackWithResult(ScrollingPagerIndicator scrollingPagerIndicator) {
        scrollingPagerIndicator.setDotCount(this.onExtraCallbackWithResult.getCount());
        scrollingPagerIndicator.setCurrentPosition(this.onExtraCallback.getCurrentItem());
    }
}

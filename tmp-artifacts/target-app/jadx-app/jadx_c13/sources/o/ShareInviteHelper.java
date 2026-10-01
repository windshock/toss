package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.widget.TextView;
import com.google.common.collect.Synchronized;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.uikit.extensions.TextViewsKt$;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.RecomposerawaitIdle2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ShareInviteHelper {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ BitmapDrawable IAuthTabCallback(TextView textView, Bitmap bitmap, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 93;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        BitmapDrawable bitmapDrawableOnNavigationEvent = onNavigationEvent(textView, bitmap, i, i2);
        int i6 = onNavigationEvent + 19;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return bitmapDrawableOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(function1, th);
        }
        onNavigationEvent(function1, th);
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(TextView textView, Bitmap bitmap, setDeeplinkPath setdeeplinkpath, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(textView, bitmap, setdeeplinkpath, z);
        int i4 = onNavigationEvent + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onNavigationEvent(iOnNavigationEvent2, 2137104859, -2137104858, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, new Object[]{function1, obj}, iOnNavigationEvent);
        int i4 = IAuthTabCallback + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = i7 | i3;
        int i9 = ~(i8 | i6);
        int i10 = (~i6) | (~((~i3) | i2));
        int i11 = (~(i6 | i3)) | (~(i7 | i6)) | (~i8);
        int i12 = i2 + i3 + i + ((-953487067) * i5) + ((-1992133889) * i4);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i2) + 1765277696 + (1051104396 * i3) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i) + ((-1703411712) * i5) + (1961361408 * i4) + (907935744 * i13);
        int i15 = ((i2 * 272661978) - 2115615402) + (i3 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i * 272662391) + (i5 * 2077717299) + (i4 * 1957688713) + (i13 * 166854656);
        int i16 = i14 + (i15 * i15 * (-213778432));
        boolean z = true;
        if (i16 == 1) {
            Function1 function1 = (Function1) objArr[0];
            Object obj = objArr[1];
            int i17 = 2 % 2;
            int i18 = onNavigationEvent + 41;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % 2;
            function1.invoke(obj);
            int i20 = onNavigationEvent + 39;
            IAuthTabCallback = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        if (i16 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 3) {
            TextView textView = (TextView) objArr[0];
            String str = (String) objArr[1];
            setDeeplinkPath setdeeplinkpath = (setDeeplinkPath) objArr[2];
            boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
            int i22 = 2 % 2;
            Intrinsics.checkNotNullParameter(textView, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(setdeeplinkpath, "");
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context);
            Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onWarmupCompleted(new RecomposerawaitIdle2.onNavigationEvent(context2).onExtraCallback(str).IAuthTabCallback(new onExtraCallback(textView, setdeeplinkpath, zBooleanValue)).onExtraCallbackWithResult());
            int i23 = IAuthTabCallback + 79;
            onNavigationEvent = i23 % 128;
            int i24 = i23 % 2;
            return null;
        }
        if (i16 == 4) {
            return onExtraCallbackWithResult(objArr);
        }
        TextView textView2 = (TextView) objArr[0];
        String str2 = (String) objArr[1];
        setDeeplinkPath setdeeplinkpath2 = (setDeeplinkPath) objArr[2];
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj2 = objArr[5];
        int i25 = 2 % 2;
        int i26 = IAuthTabCallback + 103;
        onNavigationEvent = i26 % 128;
        int i27 = i26 % 2;
        if ((iIntValue & 2) != 0) {
            setdeeplinkpath2 = setDeeplinkPath.LEFT;
        }
        if ((iIntValue & 4) != 0) {
            int i28 = IAuthTabCallback + 113;
            onNavigationEvent = i28 % 128;
            int i29 = i28 % 2;
        } else {
            z = zBooleanValue2;
        }
        onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1621487811, 1621487814, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{textView2, str2, setdeeplinkpath2, Boolean.valueOf(z)}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TextView textView, setDeeplinkPath setdeeplinkpath, BitmapDrawable bitmapDrawable) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(iOnNavigationEvent2, 1589049235, -1589049233, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, new Object[]{textView, setdeeplinkpath, bitmapDrawable}, iOnNavigationEvent);
        int i4 = onNavigationEvent + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, BitmapDrawable bitmapDrawable) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(function1, bitmapDrawable);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, bitmapDrawable);
        int i3 = IAuthTabCallback + 73;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TextView textView, setDeeplinkPath setdeeplinkpath, BitmapDrawable bitmapDrawable) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(textView, setdeeplinkpath, bitmapDrawable);
        int i4 = onNavigationEvent + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.IAuthTabCallback) != true) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.IAuthTabCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            r1 = o.ShareInviteHelper.IAuthTabCallback.onNavigationEvent + 97;
            o.ShareInviteHelper.IAuthTabCallback.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 70 / 0;
            }
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TextView textView = (TextView) objArr[0];
        setDeeplinkPath setdeeplinkpath = (setDeeplinkPath) objArr[1];
        BitmapDrawable bitmapDrawable = (BitmapDrawable) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(textView, bitmapDrawable, setdeeplinkpath);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return unit;
    }

    public static final class onExtraCallback implements ReusableRememberObserverHolder {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ TextView IAuthTabCallback;
        final /* synthetic */ setDeeplinkPath onExtraCallbackWithResult;
        final /* synthetic */ boolean onWarmupCompleted;

        onExtraCallback(TextView textView, setDeeplinkPath setdeeplinkpath, boolean z) {
            this.IAuthTabCallback = textView;
            this.onExtraCallbackWithResult = setdeeplinkpath;
            this.onWarmupCompleted = z;
        }

        public /* bridge */ void onWarmupCompleted(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(carouselKtExternalSyntheticLambda7);
            if (i3 == 0) {
                int i4 = 59 / 0;
            }
            int i5 = onExtraCallback + 77;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void IAuthTabCallback(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            ShareInviteHelper.IAuthTabCallback(this.IAuthTabCallback, (Bitmap) null, this.onExtraCallbackWithResult, this.onWarmupCompleted);
            int i4 = onExtraCallback + 53;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public void onExtraCallbackWithResult(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(carouselKtExternalSyntheticLambda7, "");
            ShareInviteHelper.IAuthTabCallback(this.IAuthTabCallback, CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(carouselKtExternalSyntheticLambda7, 0, 0, 3, (Object) null), this.onExtraCallbackWithResult, this.onWarmupCompleted);
            int i4 = onNavigationEvent + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onExtraCallbackWithResult(TextView textView, setDeeplinkPath setdeeplinkpath, BitmapDrawable bitmapDrawable) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(textView, bitmapDrawable, setdeeplinkpath);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(TextView textView, Bitmap bitmap, setDeeplinkPath setdeeplinkpath, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (bitmap != null) {
            textView.setGravity(16);
            textView.measure(0, 0);
            onExtraCallback(textView);
            Pair<Float, Float> pairOnNavigationEvent = onNavigationEvent(textView, bitmap, z);
            onNavigationEvent(textView, bitmap, (int) pairOnNavigationEvent.onExtraCallbackWithResult().floatValue(), (int) pairOnNavigationEvent.IAuthTabCallback().floatValue(), (Function1<? super BitmapDrawable, Unit>) new TextViewsKt$.ExternalSyntheticLambda0(textView, setdeeplinkpath));
            return;
        }
        onNavigationEvent(textView, (BitmapDrawable) null, (setDeeplinkPath) null, 2, (Object) null);
        int i3 = IAuthTabCallback + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final Pair<Float, Float> onNavigationEvent(@NotNull TextView textView, @NotNull Bitmap bitmap, boolean z) {
        int iCoerceAtMost;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        if (z) {
            iCoerceAtMost = textView.getLineHeight();
            int i2 = onNavigationEvent + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(bitmap.getHeight(), textView.getLineHeight());
        }
        float f = iCoerceAtMost;
        Pair<Float, Float> pair = new Pair<>(Float.valueOf(bitmap.getWidth() * (f / bitmap.getHeight())), Float.valueOf(f));
        int i4 = onNavigationEvent + 97;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return pair;
    }

    public static /* synthetic */ void onNavigationEvent(TextView textView, BitmapDrawable bitmapDrawable, setDeeplinkPath setdeeplinkpath, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallback + 47;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            setdeeplinkpath = setDeeplinkPath.LEFT;
        }
        onWarmupCompleted(textView, bitmapDrawable, setdeeplinkpath);
        int i5 = IAuthTabCallback + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void onWarmupCompleted(@NotNull TextView textView, @Nullable BitmapDrawable bitmapDrawable, @NotNull setDeeplinkPath setdeeplinkpath) {
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        BitmapDrawable bitmapDrawable4;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(setdeeplinkpath, "");
        if (setdeeplinkpath == setDeeplinkPath.LEFT) {
            int i2 = onNavigationEvent + 37;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 37 / 0;
            }
            bitmapDrawable2 = bitmapDrawable;
        } else {
            bitmapDrawable2 = null;
        }
        if (setdeeplinkpath == setDeeplinkPath.TOP) {
            int i4 = onNavigationEvent + 115;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            bitmapDrawable3 = bitmapDrawable;
        } else {
            int i5 = IAuthTabCallback + 5;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            bitmapDrawable3 = null;
        }
        if (setdeeplinkpath == setDeeplinkPath.RIGHT) {
            int i7 = IAuthTabCallback + 15;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            bitmapDrawable4 = bitmapDrawable;
        } else {
            bitmapDrawable4 = null;
        }
        if (setdeeplinkpath != setDeeplinkPath.BOTTOM) {
            bitmapDrawable = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(bitmapDrawable2, bitmapDrawable3, bitmapDrawable4, bitmapDrawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(TextView textView) {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 107;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int iOnWarmupCompleted = M_.onWarmupCompleted(M_.onExtraCallback, Float.valueOf(textView.getTextSize()), (Context) null, 2, (Object) null);
        if (iOnWarmupCompleted >= 0) {
            int i5 = onNavigationEvent + 35;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0 ? iOnWarmupCompleted < 16 : iOnWarmupCompleted < 43) {
                i = 6;
            } else if (16 <= iOnWarmupCompleted && iOnWarmupCompleted < 19) {
                int i6 = IAuthTabCallback + 91;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                i = 7;
            } else if (19 <= iOnWarmupCompleted) {
                int i8 = onNavigationEvent;
                int i9 = i8 + 43;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                if (iOnWarmupCompleted < 23) {
                    int i11 = i8 + 51;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    i = 8;
                } else if (23 <= iOnWarmupCompleted) {
                    int i13 = IAuthTabCallback + 75;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 == 0 ? iOnWarmupCompleted < 29 : iOnWarmupCompleted < 15) {
                        i = 9;
                    } else if (29 <= iOnWarmupCompleted && iOnWarmupCompleted < 35) {
                        int i14 = IAuthTabCallback + 105;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                        i = 10;
                    } else if (35 > iOnWarmupCompleted || iOnWarmupCompleted >= 41) {
                        i = 12;
                    } else {
                        int i16 = onNavigationEvent + 47;
                        IAuthTabCallback = i16 % 128;
                        int i17 = i16 % 2;
                        i = 11;
                    }
                }
            }
        }
        DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        textView.setCompoundDrawablePadding(varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics));
    }

    private static final BitmapDrawable onNavigationEvent(TextView textView, Bitmap bitmap, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        BitmapDrawable bitmapDrawableOnExtraCallback = onExtraCallback(textView, bitmap, i, i2);
        if (i5 == 0) {
            int i6 = 78 / 0;
        }
        return bitmapDrawableOnExtraCallback;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, BitmapDrawable bitmapDrawable) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(bitmapDrawable);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onNavigationEvent(TextView textView, Bitmap bitmap, int i, int i2, Function1<? super BitmapDrawable, Unit> function1) {
        int i3 = 2 % 2;
        if (bitmap == null) {
            int i4 = IAuthTabCallback + 47;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            function1.invoke(null);
            return;
        }
        Intrinsics.checkNotNull(writeRaw.onNavigationEvent((Callable) new TextViewsKt$.ExternalSyntheticLambda1(textView, bitmap, i, i2)).onNavigationEvent(clearTid.onExtraCallback()).IAuthTabCallback(NetConverter3.onExtraCallback()).onNavigationEvent(new TextViewsKt$.ExternalSyntheticLambda3(new TextViewsKt$.ExternalSyntheticLambda2(function1)), new TextViewsKt$.ExternalSyntheticLambda5(new TextViewsKt$.ExternalSyntheticLambda4(function1))));
        int i6 = onNavigationEvent + 125;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(Function1 function1, Throwable th) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final BitmapDrawable onExtraCallback(@NotNull TextView textView, @NotNull Bitmap bitmap, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, false);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(textView.getContext().getResources(), bitmapCreateScaledBitmap);
        bitmapDrawable.setBounds(0, 0, bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight());
        int i4 = onNavigationEvent + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return bitmapDrawable;
    }

    public static /* synthetic */ void onExtraCallback(BaseTextView baseTextView, boolean z, setDeeplinkPath setdeeplinkpath, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 75;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        int i6 = i4 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i5 + 123;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                setdeeplinkpath = setDeeplinkPath.RIGHT;
                int i8 = 77 / 0;
            } else {
                setdeeplinkpath = setDeeplinkPath.RIGHT;
            }
        }
        if ((i2 & 4) != 0) {
            Context context = baseTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            i = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-1357410872, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new IAuthTabCallback(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 1357410876, matches.onExtraCallback())).intValue();
            int i9 = onNavigationEvent + 79;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 % 3;
            }
        }
        onExtraCallback(baseTextView, z, setdeeplinkpath, i);
    }

    public static final class onWarmupCompleted extends BitmapDrawable {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ setDeeplinkPath IAuthTabCallback;
        final /* synthetic */ BaseTextView onExtraCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(BaseTextView baseTextView, setDeeplinkPath setdeeplinkpath, Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
            this.onExtraCallback = baseTextView;
            this.IAuthTabCallback = setdeeplinkpath;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void draw(Canvas canvas) {
            float f;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(canvas, "");
            float measuredWidth = this.onExtraCallback.getMeasuredWidth() / 2.0f;
            float measuredHeight = this.onExtraCallback.getMeasuredHeight() / 2.0f;
            float intrinsicWidth = getIntrinsicWidth() / 2.0f;
            float intrinsicHeight = getIntrinsicHeight() / 2.0f;
            canvas.save();
            setDeeplinkPath setdeeplinkpath = this.IAuthTabCallback;
            float intrinsicHeight2 = (setdeeplinkpath == setDeeplinkPath.RIGHT || setdeeplinkpath == setDeeplinkPath.LEFT) ? ((-measuredHeight) + intrinsicHeight) - ((getIntrinsicHeight() - this.onExtraCallback.getFirstBaselineToTopHeight()) / 2.0f) : 0.0f;
            setDeeplinkPath setdeeplinkpath2 = this.IAuthTabCallback;
            if (setdeeplinkpath2 != setDeeplinkPath.TOP) {
                int i4 = onExtraCallbackWithResult + 33;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    setDeeplinkPath setdeeplinkpath3 = setDeeplinkPath.BOTTOM;
                    throw null;
                }
                f = setdeeplinkpath2 == setDeeplinkPath.BOTTOM ? (-measuredWidth) + intrinsicWidth : 0.0f;
            }
            canvas.translate(f, intrinsicHeight2);
            super.draw(canvas);
            canvas.restore();
            int i5 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 73 / 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        onWarmupCompleted((android.widget.TextView) r3, (android.graphics.drawable.BitmapDrawable) null, r5);
        r3 = o.ShareInviteHelper.onNavigationEvent + 5;
        o.ShareInviteHelper.IAuthTabCallback = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if ((r3 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r3 = 10 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r4 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r4 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r4 = r3.getContext().getResources();
        r0 = r3.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        onWarmupCompleted((android.widget.TextView) r3, (android.graphics.drawable.BitmapDrawable) new o.ShareInviteHelper.onWarmupCompleted(r3, r5, r4, o.generateInviteUrl.onExtraCallback(r0, r6)), r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull BaseTextView baseTextView, boolean z, @NotNull setDeeplinkPath setdeeplinkpath, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(baseTextView, "");
            Intrinsics.checkNotNullParameter(setdeeplinkpath, "");
            int i4 = 64 / 0;
        } else {
            Intrinsics.checkNotNullParameter(baseTextView, "");
            Intrinsics.checkNotNullParameter(setdeeplinkpath, "");
        }
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onNavigationEvent(iOnNavigationEvent2, 493944635, -493944631, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, new Object[]{function1, obj}, iOnNavigationEvent);
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onNavigationEvent(iOnNavigationEvent2, 2137104859, -2137104858, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, new Object[]{function1, obj}, iOnNavigationEvent);
    }

    private static final Unit onExtraCallback(TextView textView, setDeeplinkPath setdeeplinkpath, BitmapDrawable bitmapDrawable) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onNavigationEvent(iOnNavigationEvent2, 1589049235, -1589049233, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, new Object[]{textView, setdeeplinkpath, bitmapDrawable}, iOnNavigationEvent);
    }

    public static final void onNavigationEvent(@NotNull TextView textView, @NotNull String str, @NotNull setDeeplinkPath setdeeplinkpath, boolean z) {
        Object[] objArr = {textView, str, setdeeplinkpath, Boolean.valueOf(z)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1621487811, 1621487814, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, iOnNavigationEvent);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TextView textView, String str, setDeeplinkPath setdeeplinkpath, boolean z, int i, Object obj) {
        Object[] objArr = {textView, str, setdeeplinkpath, Boolean.valueOf(z), Integer.valueOf(i), obj};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1018644981, 1018644981, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, iOnNavigationEvent);
    }
}

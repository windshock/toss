package im.toss.tds.view.component.atom.image;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import im.toss.tds.R;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda8;
import o.RecomposerKt;
import o.RecomposeraddCompositionRegistrationObserver2;
import o.RecomposerawaitIdle2;
import o.Recomposerjoin2;
import o.RecomposerrecompositionRunner2;
import o.RememberObserverHolder;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.access13800;
import o.accessgetDEFAULT_PROTOCOLScp;
import o.clearFaultAdjacentMetadata;
import o.deprecated_authenticator;
import o.deprecated_cookieJar;
import o.deprecated_followRedirects;
import o.followRedirects;
import o.getDefaultViewModelCreationExtras;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.readIntokhttp;
import o.setBodyokhttp;
import o.verifyClientState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class TdsImageView extends AppCompatImageView {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static int onTransact;
    private boolean onExtraCallback;
    private int onNavigationEvent;
    private ColorStateList onWarmupCompleted;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final Regex IAuthTabCallback = new Regex(".*(icon|icn).*[_-]line($|\\..*)");
    private static final Set<Integer> onExtraCallbackWithResult = clearFaultAdjacentMetadata.onExtraCallback(new Integer[]{Integer.valueOf(R.drawable.arrow), Integer.valueOf(R.drawable.arrow_small), Integer.valueOf(R.drawable.icn_arrow_downwards), Integer.valueOf(R.drawable.icn_arrow_rightwards), Integer.valueOf(R.drawable.icon_arrow_down_mono), Integer.valueOf(R.drawable.icon_arrow_right_mono), Integer.valueOf(R.drawable.icon_arrow_up_mono), Integer.valueOf(R.drawable.list_arrow), Integer.valueOf(R.drawable.list_down_arrow)});

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        String string;
        int iIAuthTabCallbackStub;
        String string2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, im.toss.tds.view.R.styleable.TdsImageView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = 2 % 2;
            string = null;
            for (int i3 = 0; i3 < indexCount; i3++) {
                int i4 = onTransact + 93;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == im.toss.tds.view.R.styleable.TdsImageView_baseTint) {
                    this.onNavigationEvent = typedArrayObtainStyledAttributes.getColor(index, 0);
                } else if (index == im.toss.tds.view.R.styleable.TdsImageView_imageUrl) {
                    int i6 = asBinder + 27;
                    onTransact = i6 % 128;
                    if (i6 % 2 != 0) {
                        typedArrayObtainStyledAttributes.getString(index);
                        throw null;
                    }
                    string = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    continue;
                }
            }
        } else {
            string = null;
        }
        getDefaultViewModelCreationExtras getdefaultviewmodelcreationextrasOnExtraCallbackWithResult = getDefaultViewModelCreationExtras.onExtraCallbackWithResult(context, attributeSet, androidx.appcompat.R.styleable.AppCompatImageView, i, 0);
        Integer numValueOf = Integer.valueOf(getdefaultviewmodelcreationextrasOnExtraCallbackWithResult.IAuthTabCallbackStub(androidx.appcompat.R.styleable.AppCompatImageView_srcCompat, 0));
        if (numValueOf.intValue() == 0) {
            int i7 = onTransact + 115;
            int i8 = i7 % 128;
            asBinder = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 71;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIAuthTabCallbackStub = numValueOf.intValue();
        } else {
            iIAuthTabCallbackStub = getdefaultviewmodelcreationextrasOnExtraCallbackWithResult.IAuthTabCallbackStub(androidx.appcompat.R.styleable.AppCompatImageView_android_src, 0);
            int i13 = 2 % 2;
        }
        if (iIAuthTabCallbackStub != 0 && !getdefaultviewmodelcreationextrasOnExtraCallbackWithResult.IAuthTabCallbackDefault(androidx.appcompat.R.styleable.AppCompatImageView_tint) && onExtraCallbackWithResult(iIAuthTabCallbackStub)) {
            asInterface();
            int i14 = 2 % 2;
        }
        if (string != null) {
            String str = StringsKt.isBlank(string) ? null : string;
            if (str == null || (string2 = StringsKt.trim(str).toString()) == null) {
                return;
            }
            setImage$default(this, string2, (Function1) null, (Function1) null, 6, (Object) null);
        }
    }

    public static final /* synthetic */ int onWarmupCompleted(TdsImageView tdsImageView) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int typedObject = tdsImageView.readTypedObject();
        int i4 = asBinder + 91;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onTransact + 121;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 34 / 0;
            }
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onTransact + 69;
            asBinder = i6 % 128;
            i = i6 % 2 == 0 ? 1 : 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setImageTintList(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super/*android.widget.ImageView*/.setImageTintList(colorStateList);
        this.onWarmupCompleted = colorStateList;
        int i4 = onTransact + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.setSupportImageTintList(colorStateList);
        this.onWarmupCompleted = colorStateList;
        int i4 = onTransact + 105;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
    }

    public void setImageResource(int i) {
        int i2 = 2 % 2;
        super.setImageResource(i);
        if (i != 0) {
            int i3 = onTransact + 39;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult(i);
                throw null;
            }
            if (onExtraCallbackWithResult(i)) {
                int i4 = asBinder + 83;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                asInterface();
                return;
            }
        }
        IAuthTabCallbackDefault();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int readTypedObject() {
        int i = 2 % 2;
        int i2 = this.onNavigationEvent;
        if (i2 != 0) {
            int i3 = onTransact;
            int i4 = i3 + 35;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 93;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return i2;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).ITrustedWebActivityCallbackDefault() == getSpecialFeatureOptInStatus.Dark) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            return new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration2)).ICustomTabsCallbackStubProxy();
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration3 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        return new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration3)).onPostMessage();
    }

    private final void asInterface() {
        boolean z;
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            setSupportImageTintList(ColorStateList.valueOf(readTypedObject()));
            z = false;
        } else {
            setSupportImageTintList(ColorStateList.valueOf(readTypedObject()));
            z = true;
        }
        this.onExtraCallback = z;
        int i3 = onTransact + 39;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        if (this.onExtraCallback) {
            setSupportImageTintList(null);
            this.onExtraCallback = false;
            int i2 = asBinder + 63;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = asBinder + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onWarmupCompleted extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ TdsImageView IAuthTabCallback;
        private final String onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(String str, TdsImageView tdsImageView) {
            this.IAuthTabCallback = tdsImageView;
            Context context = tdsImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            this.onWarmupCompleted = str + readIntokhttp.onExtraCallback(configuration);
        }

        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 85;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 19;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public Object onWarmupCompleted(Bitmap bitmap, RememberObserverHolder rememberObserverHolder, access13800<? super Bitmap> access13800Var) {
            int i = 2 % 2;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setColorFilter(new PorterDuffColorFilter(TdsImageView.onWarmupCompleted(this.IAuthTabCallback), PorterDuff.Mode.SRC_IN));
            Unit unit = Unit.INSTANCE;
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return bitmapCreateBitmap;
        }
    }

    private final void onNavigationEvent(RecomposerawaitIdle2.onNavigationEvent onnavigationevent, String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        List listEmptyList;
        int i = 2 % 2;
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(str, this);
        Field declaredField = RecomposerawaitIdle2.onNavigationEvent.class.getDeclaredField("transformations");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(onnavigationevent);
        Object obj2 = null;
        if (true ^ (obj instanceof List)) {
            listEmptyList = null;
        } else {
            listEmptyList = (List) obj;
            int i2 = onTransact + 65;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }
        if (listEmptyList == null) {
            int i4 = asBinder + 41;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            listEmptyList = CollectionsKt.emptyList();
        }
        RecomposerrecompositionRunner2.onWarmupCompleted(onnavigationevent, CollectionsKt.plus(listEmptyList, onwarmupcompleted));
        int i6 = onTransact + 57;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if ((r8 & 4) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r1 = r1 + 17;
        im.toss.tds.view.component.atom.image.TdsImageView.asBinder = r1 % 128;
        r1 = r1 % 2;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r4.setImage(r5, (kotlin.jvm.functions.Function1<? super o.RecomposerKt, kotlin.Unit>) r6, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setImage");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r9 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r9 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if ((r8 & 2) == 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void setImage$default(TdsImageView tdsImageView, String str, Function1 function1, Function1 function12, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 39;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setImage(@Nullable String str, @Nullable Function1<? super RecomposerKt, Unit> function1, @Nullable Function1<? super Throwable, Unit> function12) {
        String string;
        int i = 2 % 2;
        int i2 = asBinder + 75;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (str != null) {
            string = StringsKt.trim(str).toString();
        } else {
            int i5 = i3 + 83;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            string = null;
        }
        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(getContext());
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = Recomposerjoin2.onExtraCallback(new RecomposerawaitIdle2.onNavigationEvent(getContext()).onExtraCallback(string), this);
        RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, true);
        onnavigationeventOnExtraCallback.onNavigationEvent(new onNavigationEvent(function1, function12));
        carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onWarmupCompleted(onnavigationeventOnExtraCallback.onExtraCallbackWithResult());
        if (!onExtraCallbackWithResult(string)) {
            IAuthTabCallbackDefault();
            int i7 = onTransact + 1;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = asBinder + 33;
        onTransact = i9 % 128;
        if (i9 % 2 == 0) {
            asInterface();
        } else {
            asInterface();
            int i10 = 91 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setImage$default(TdsImageView tdsImageView, RecomposerawaitIdle2.onNavigationEvent onnavigationevent, Function1 function1, Function1 function12, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact + 29;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setImage");
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 43;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = null;
        }
        tdsImageView.setImage(onnavigationevent, (Function1<? super RecomposerKt, Unit>) function1, (Function1<? super Throwable, Unit>) function12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setImage(@NotNull RecomposerawaitIdle2.onNavigationEvent onnavigationevent, @Nullable Function1<? super RecomposerKt, Unit> function1, @Nullable Function1<? super Throwable, Unit> function12) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        try {
            Object objOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult().onExtraCallbackWithResult();
            if (objOnExtraCallbackWithResult instanceof String) {
                if (!(!onExtraCallbackWithResult((String) objOnExtraCallbackWithResult))) {
                    onNavigationEvent(onnavigationevent, (String) objOnExtraCallbackWithResult);
                }
            } else if (objOnExtraCallbackWithResult instanceof Integer) {
                int i2 = onTransact + 119;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                if (!Intrinsics.areEqual(objOnExtraCallbackWithResult, 0)) {
                    int i4 = asBinder + 113;
                    onTransact = i4 % 128;
                    if (i4 % 2 != 0) {
                        onExtraCallbackWithResult(((Number) objOnExtraCallbackWithResult).intValue());
                        throw null;
                    }
                    if (onExtraCallbackWithResult(((Number) objOnExtraCallbackWithResult).intValue())) {
                        onNavigationEvent(onnavigationevent, String.valueOf(((Number) objOnExtraCallbackWithResult).intValue()));
                        int i5 = onTransact + 109;
                        asBinder = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 2 / 2;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context).onWarmupCompleted(RecomposerrecompositionRunner2.IAuthTabCallback(Recomposerjoin2.onExtraCallback(onnavigationevent, this), true).onNavigationEvent(new onNavigationEvent(function1, function12)).onExtraCallbackWithResult());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setImage(@NotNull deprecated_followRedirects deprecated_followredirects) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
            boolean z = deprecated_followredirects instanceof deprecated_cookieJar;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        if (deprecated_followredirects instanceof deprecated_cookieJar) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            setImage(((deprecated_cookieJar) deprecated_followredirects).onExtraCallbackWithResult(context));
            return;
        }
        if (deprecated_followredirects instanceof accessgetDEFAULT_PROTOCOLScp) {
            int i3 = asBinder + 5;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                setImageResource(((accessgetDEFAULT_PROTOCOLScp) deprecated_followredirects).onNavigationEvent());
                return;
            } else {
                setImageResource(((accessgetDEFAULT_PROTOCOLScp) deprecated_followredirects).onNavigationEvent());
                int i4 = 70 / 0;
                return;
            }
        }
        if (!(deprecated_followredirects instanceof verifyClientState)) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = asBinder + 21;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            setImage$default(this, deprecated_authenticator.onWarmupCompleted((verifyClientState) deprecated_followredirects, context2), (Function1) null, (Function1) null, 40, (Object) null);
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            setImage$default(this, deprecated_authenticator.onWarmupCompleted((verifyClientState) deprecated_followredirects, context3), (Function1) null, (Function1) null, 6, (Object) null);
        }
    }

    public static /* synthetic */ void setImageWithSize$default(TdsImageView tdsImageView, String str, int i, int i2, Function1 function1, Function1 function12, int i3, Object obj) {
        Function1 function13;
        int i4 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setImageWithSize");
        }
        int i5 = onTransact + 49;
        int i6 = i5 % 128;
        asBinder = i6;
        int i7 = i5 % 2;
        Function1 function14 = (i3 & 8) != 0 ? null : function1;
        if ((i3 & 16) != 0) {
            int i8 = i6 + 31;
            onTransact = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 26 / 0;
            }
            function13 = null;
        } else {
            function13 = function12;
        }
        tdsImageView.onExtraCallback(str, i, i2, function14, function13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onExtraCallback(@Nullable String str, int i, int i2, @Nullable Function1<? super RecomposerKt, Unit> function1, @Nullable Function1<? super Throwable, Unit> function12) {
        String string;
        int i3 = 2 % 2;
        if (str != null) {
            int i4 = onTransact + 101;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            string = StringsKt.trim(str).toString();
        } else {
            string = null;
        }
        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(getContext());
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = Recomposerjoin2.onExtraCallback(new RecomposerawaitIdle2.onNavigationEvent(getContext()).onExtraCallback(string), this);
        onnavigationeventOnExtraCallback.onExtraCallback(i, i2);
        RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, true);
        onnavigationeventOnExtraCallback.onNavigationEvent(new onNavigationEvent(function1, function12));
        carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onWarmupCompleted(onnavigationeventOnExtraCallback.onExtraCallbackWithResult());
        if (onExtraCallbackWithResult(string)) {
            int i6 = asBinder + 77;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            asInterface();
            return;
        }
        IAuthTabCallbackDefault();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r7 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        r3 = im.toss.tds.view.component.atom.image.TdsImageView.Companion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (im.toss.tds.view.component.atom.image.TdsImageView.onExtraCallbackWithResult.IAuthTabCallback(r3, im.toss.tds.view.component.atom.image.TdsImageView.onExtraCallbackWithResult.onExtraCallback(r3, r7)) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if ((!im.toss.tds.view.component.atom.image.TdsImageView.onExtraCallbackWithResult.onExtraCallbackWithResult(r3, r7)) == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        r7 = im.toss.tds.view.component.atom.image.TdsImageView.onTransact + 89;
        im.toss.tds.view.component.atom.image.TdsImageView.asBinder = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if ((r7 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onExtraCallbackWithResult(int i) {
        String string;
        int i2 = 2 % 2;
        if (onExtraCallbackWithResult.contains(Integer.valueOf(i))) {
            int i3 = asBinder + 39;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (i == 0) {
            int i5 = asBinder + 123;
            int i6 = i5 % 128;
            onTransact = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 25;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        followRedirects followredirects = followRedirects.onExtraCallbackWithResult;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        CharSequence charSequence = followredirects.onWarmupCompleted(context, i).string;
        if (charSequence != null) {
            int i10 = onTransact + 63;
            asBinder = i10 % 128;
            if (i10 % 2 == 0) {
                string = charSequence.toString();
                int i11 = 21 / 0;
            } else {
                string = charSequence.toString();
            }
        }
        return false;
    }

    private final boolean onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (str == null) {
            return false;
        }
        if (onExtraCallbackWithResult.onNavigationEvent(Companion, str)) {
            int i4 = onTransact + 43;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
                if (IAuthTabCallback.onExtraCallbackWithResult(str)) {
                    return true;
                }
            } else if (IAuthTabCallback.onExtraCallbackWithResult(str)) {
                return true;
            }
        }
        int i6 = asBinder + 55;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    static final class onNavigationEvent implements RecomposerawaitIdle2.onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final Function1<Throwable, Unit> IAuthTabCallback;
        private final Function1<RecomposerKt, Unit> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public onNavigationEvent(@Nullable Function1<? super RecomposerKt, Unit> function1, @Nullable Function1<? super Throwable, Unit> function12) {
            this.onWarmupCompleted = function1;
            this.IAuthTabCallback = function12;
        }

        public /* bridge */ void IAuthTabCallback(@NotNull RecomposerawaitIdle2 recomposerawaitIdle2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(recomposerawaitIdle2);
            if (i3 != 0) {
                int i4 = 24 / 0;
            }
        }

        public /* bridge */ void onExtraCallback(@NotNull RecomposerawaitIdle2 recomposerawaitIdle2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(recomposerawaitIdle2);
            int i4 = onExtraCallbackWithResult + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onExtraCallback(@NotNull RecomposerawaitIdle2 recomposerawaitIdle2, @NotNull RecomposeraddCompositionRegistrationObserver2 recomposeraddCompositionRegistrationObserver2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(recomposerawaitIdle2, "");
            Intrinsics.checkNotNullParameter(recomposeraddCompositionRegistrationObserver2, "");
            super.onExtraCallback(recomposerawaitIdle2, recomposeraddCompositionRegistrationObserver2);
            Function1<Throwable, Unit> function1 = this.IAuthTabCallback;
            if (function1 != null) {
                int i2 = onExtraCallbackWithResult + 105;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                function1.invoke(recomposeraddCompositionRegistrationObserver2.onWarmupCompleted());
                if (i3 != 0) {
                    int i4 = 24 / 0;
                }
                int i5 = onExtraCallbackWithResult + 33;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        public void onNavigationEvent(@NotNull RecomposerawaitIdle2 recomposerawaitIdle2, @NotNull RecomposerKt recomposerKt) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(recomposerawaitIdle2, "");
            Intrinsics.checkNotNullParameter(recomposerKt, "");
            super.onNavigationEvent(recomposerawaitIdle2, recomposerKt);
            Function1<RecomposerKt, Unit> function1 = this.onWarmupCompleted;
            if (function1 != null) {
                int i2 = onExtraCallback + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                function1.invoke(recomposerKt);
            }
            int i4 = onExtraCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 9 / 0;
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public static final /* synthetic */ boolean IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted(str);
            int i4 = onExtraCallbackWithResult + 21;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return zOnWarmupCompleted;
            }
            throw null;
        }

        public static final /* synthetic */ String onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult(str);
            int i4 = onExtraCallbackWithResult + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return strOnExtraCallbackWithResult;
        }

        public static final /* synthetic */ boolean onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback(str);
            int i4 = onExtraCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return zIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ boolean onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnExtraCallback = onextracallbackwithresult.onExtraCallback(str);
            if (i3 == 0) {
                int i4 = 45 / 0;
            }
            int i5 = onExtraCallback + 117;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return zOnExtraCallback;
        }

        private final boolean onExtraCallback(String str) {
            Object obj;
            int i = 2 % 2;
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(Uri.parse(str).getHost());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.onExtraCallback(obj)) {
                int i2 = onExtraCallback + 17;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                obj = null;
            }
            String str2 = (String) obj;
            if (str2 == null) {
                return true;
            }
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (!Intrinsics.areEqual(CollectionsKt.takeLast(StringsKt.split$default(lowerCase, new char[]{'.'}, false, 0, 6, (Object) null), 2), CollectionsKt.listOf(new String[]{"toss", "im"}))) {
                return false;
            }
            int i4 = onExtraCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        private final String onExtraCallbackWithResult(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strSubstringAfterLast$default = StringsKt.substringAfterLast$default(StringsKt.substringBeforeLast$default(str, '.', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null);
            int i4 = onExtraCallbackWithResult + 1;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return strSubstringAfterLast$default;
        }

        private final boolean IAuthTabCallback(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!StringsKt.startsWith$default(str, "icn_navigation_", false, 2, (Object) null)) {
                int i4 = onExtraCallbackWithResult + 93;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0 ? !StringsKt.startsWith$default(str, "icon_navigation_", false, 2, (Object) null) : !StringsKt.startsWith$default(str, "icon_navigation_", true, 5, (Object) null)) {
                    return false;
                }
            }
            return true;
        }

        private final boolean onWarmupCompleted(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            return StringsKt.endsWith$default(str, "_line", false, i2 % 2 != 0 ? 4 : 2, (Object) null);
        }
    }

    static {
        int i = asInterface + 57;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}

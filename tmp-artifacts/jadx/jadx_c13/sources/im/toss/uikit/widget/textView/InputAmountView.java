package im.toss.uikit.widget.textView;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.readIntokhttp;
import o.response;
import o.setDone;
import o.varyMatches;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class InputAmountView extends View {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private static int extraCallback = 0;
    private static int writeTypedObject = 1;
    private boolean IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub;
    private final float IAuthTabCallbackStubProxy;
    private final float access000;
    private String access100;
    private final Paint asBinder;
    private final ArrayList<onWarmupCompleted> asInterface;
    private long getInterfaceDescriptor;
    private final Paint onExtraCallbackWithResult;
    private long onTransact;
    public static final int IAuthTabCallback = 8;
    private static final DecelerateInterpolator onWarmupCompleted = new DecelerateInterpolator();
    private static final OvershootInterpolator onExtraCallback = new OvershootInterpolator(1.2f);
    private static final DecelerateInterpolator onNavigationEvent = new DecelerateInterpolator();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputAmountView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputAmountView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 99;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 25;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputAmountView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.IAuthTabCallbackStubProxy = varyMatches.onNavigationEvent(Float.valueOf(30.0f), r13);
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.access000 = varyMatches.onNavigationEvent(Float.valueOf(20.0f), r13);
        Paint paint = new Paint(5);
        this.onExtraCallbackWithResult = paint;
        Paint paint2 = new Paint(5);
        this.asBinder = paint2;
        this.IAuthTabCallbackStub = _UrlKt.FRAGMENT_ENCODE_SET;
        this.asInterface = new ArrayList<>();
        this.onTransact = 500L;
        this.getInterfaceDescriptor = 300L;
        this.access100 = "원";
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        paint.setColor(new getUrlokhttp(new asBinder(configuration)).onUnminimized());
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        paint.setTextSize(varyMatches.onNavigationEvent(Float.valueOf(48.0f), r14));
        Paint.Align align = Paint.Align.LEFT;
        paint.setTextAlign(align);
        response responseVar = response.Medium;
        paint.setTypeface(response.toTypeface$default(responseVar, context, (setDone) null, 2, (Object) null));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        paint2.setColor(new getUrlokhttp(new IAuthTabCallbackStub(configuration2)).onUnminimized());
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        paint2.setTextSize(varyMatches.onNavigationEvent(Float.valueOf(43.0f), r13));
        paint2.setTextAlign(align);
        paint2.setTypeface(response.toTypeface$default(responseVar, context, (setDone) null, 2, (Object) null));
        setLayerType(2, null);
        setAmount$default(this, 0L, null, 2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InputAmountView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = extraCallback + 79;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = extraCallback + 83;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ long onExtraCallback(InputAmountView inputAmountView) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 31;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = inputAmountView.getInterfaceDescriptor;
        int i5 = i2 + 73;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public static final /* synthetic */ long onWarmupCompleted(InputAmountView inputAmountView) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return inputAmountView.onTransact;
        }
        long j = inputAmountView.onTransact;
        throw null;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int iResolveSize;
        DisplayMetrics displayMetrics;
        Float fValueOf;
        int i3 = 2 % 2;
        int i4 = extraCallback + 5;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            iResolveSize = View.resolveSize(0, i);
            displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            fValueOf = Float.valueOf(48.0f);
        } else {
            iResolveSize = View.resolveSize(0, i);
            displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            fValueOf = Float.valueOf(48.0f);
        }
        setMeasuredDimension(iResolveSize, View.resolveSize(varyMatches.onNavigationEvent(fValueOf, displayMetrics), i2));
    }

    public final void setAnimationEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 47;
        extraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        long j = 1;
        this.onTransact = z ? 500L : 1L;
        if (z) {
            int i4 = i2 + 7;
            extraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            j = 300;
        }
        this.getInterfaceDescriptor = j;
    }

    public static /* synthetic */ void setAmount$default(InputAmountView inputAmountView, long j, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 61;
        int i4 = i3 % 128;
        writeTypedObject = i4;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 4) != 0) {
            int i5 = i4 + Imgproc.COLOR_YUV2RGB_YVYU;
            extraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = "원";
        }
        inputAmountView.setAmount(j, str);
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 43;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class asBinder implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asBinder(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 109;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 54 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public final void setAmount(long j, @NotNull String str) {
        float fOnNavigationEvent;
        int i;
        float fOnNavigationEvent2;
        Object next;
        int i2 = 2 % 2;
        int i3 = extraCallback + 23;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        float f = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        Intrinsics.checkNotNullParameter(str, "");
        String strValueOf = String.valueOf(j);
        int i5 = 1;
        if ((!Intrinsics.areEqual(strValueOf, this.IAuthTabCallbackStub)) || !Intrinsics.areEqual(this.access100, str)) {
            this.access100 = str;
            ArrayList<Triple<Float, String, String>> arrayList = new ArrayList<>();
            ArrayList<onWarmupCompleted> arrayList2 = this.asInterface;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((onWarmupCompleted) obj).onExtraCallbackWithResult().onExtraCallbackWithResult().isNumber()) {
                    int i6 = writeTypedObject + 73;
                    extraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList3.add(obj);
                }
                f = 0.0f;
            }
            Object obj2 = null;
            if (strValueOf.length() > this.IAuthTabCallbackStub.length()) {
                String str2 = this.IAuthTabCallbackStub;
                int i8 = 0;
                int i9 = 0;
                while (i8 < str2.length()) {
                    char cCharAt = str2.charAt(i8);
                    onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) CollectionsKt___CollectionsKt.getOrNull(arrayList3, i9);
                    arrayList.add(new Triple<>(Float.valueOf(onwarmupcompleted != null ? onwarmupcompleted.onNavigationEvent() : f), String.valueOf(cCharAt), String.valueOf(strValueOf.charAt(i9))));
                    i8++;
                    i9++;
                    f = 0.0f;
                }
                String strSubstring = strValueOf.substring(this.IAuthTabCallbackStub.length(), strValueOf.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                for (int i10 = 0; i10 < strSubstring.length(); i10++) {
                    arrayList.add(new Triple<>(fValueOf, _UrlKt.FRAGMENT_ENCODE_SET, String.valueOf(strSubstring.charAt(i10))));
                }
            } else if (strValueOf.length() < this.IAuthTabCallbackStub.length()) {
                int i11 = writeTypedObject + Imgproc.COLOR_YUV2RGBA_YVYU;
                extraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    i = 0;
                } else {
                    i = 0;
                    i5 = 0;
                }
                while (i5 < strValueOf.length()) {
                    char cCharAt2 = strValueOf.charAt(i5);
                    onWarmupCompleted onwarmupcompleted2 = (onWarmupCompleted) CollectionsKt___CollectionsKt.getOrNull(arrayList3, i);
                    arrayList.add(new Triple<>(Float.valueOf(onwarmupcompleted2 != null ? onwarmupcompleted2.onNavigationEvent() : 0.0f), String.valueOf(this.IAuthTabCallbackStub.charAt(i)), String.valueOf(cCharAt2)));
                    i5++;
                    i++;
                }
                String strSubstring2 = this.IAuthTabCallbackStub.substring(strValueOf.length(), this.IAuthTabCallbackStub.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                int i12 = extraCallback + 21;
                writeTypedObject = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 0;
                int i15 = 0;
                while (i14 < strSubstring2.length()) {
                    char cCharAt3 = strSubstring2.charAt(i14);
                    onWarmupCompleted onwarmupcompleted3 = (onWarmupCompleted) CollectionsKt___CollectionsKt.getOrNull(arrayList3, strValueOf.length() + i15);
                    if (onwarmupcompleted3 != null) {
                        int i16 = writeTypedObject + 85;
                        extraCallback = i16 % 128;
                        int i17 = i16 % 2;
                        fOnNavigationEvent2 = onwarmupcompleted3.onNavigationEvent();
                    } else {
                        fOnNavigationEvent2 = 0.0f;
                    }
                    arrayList.add(new Triple<>(Float.valueOf(fOnNavigationEvent2), String.valueOf(cCharAt3), _UrlKt.FRAGMENT_ENCODE_SET));
                    i14++;
                    i15++;
                }
            } else {
                String str3 = this.IAuthTabCallbackStub;
                int i18 = 0;
                int i19 = 0;
                while (i18 < str3.length()) {
                    int i20 = extraCallback + 81;
                    writeTypedObject = i20 % 128;
                    if (i20 % 2 == 0) {
                        str3.charAt(i18);
                        obj2.hashCode();
                        throw null;
                    }
                    char cCharAt4 = str3.charAt(i18);
                    onWarmupCompleted onwarmupcompleted4 = (onWarmupCompleted) CollectionsKt___CollectionsKt.getOrNull(arrayList3, i19);
                    if (onwarmupcompleted4 != null) {
                        int i21 = writeTypedObject + 15;
                        extraCallback = i21 % 128;
                        int i22 = i21 % 2;
                        fOnNavigationEvent = onwarmupcompleted4.onNavigationEvent();
                    } else {
                        fOnNavigationEvent = 0.0f;
                    }
                    arrayList.add(new Triple<>(Float.valueOf(fOnNavigationEvent), String.valueOf(cCharAt4), String.valueOf(strValueOf.charAt(i19))));
                    i18++;
                    i19++;
                }
            }
            Iterator<T> it = this.asInterface.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((onWarmupCompleted) next).onExtraCallbackWithResult().onExtraCallbackWithResult() == onExtraCallback.CURRENCY) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            onWarmupCompleted onwarmupcompleted5 = (onWarmupCompleted) next;
            arrayList.add(new Triple<>(Float.valueOf(onwarmupcompleted5 != null ? onwarmupcompleted5.onNavigationEvent() : 0.0f), str, str));
            this.IAuthTabCallbackStub = strValueOf;
            String str4 = NumberFormat.getNumberInstance(Locale.US).format(j);
            Intrinsics.checkNotNull(str4);
            int i23 = 0;
            int i24 = 0;
            while (i24 < str4.length()) {
                if (Intrinsics.areEqual(String.valueOf(str4.charAt(i24)), ",")) {
                    arrayList.add(i23, new Triple<>(fValueOf, _UrlKt.FRAGMENT_ENCODE_SET, ","));
                }
                i24++;
                i23++;
            }
            onExtraCallback(arrayList);
            onExtraCallbackWithResult();
            int i25 = extraCallback + 89;
            writeTypedObject = i25 % 128;
            if (i25 % 2 != 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
    }

    private final void onExtraCallbackWithResult() {
        AccessibilityManager accessibilityManager;
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object systemService = getContext().getSystemService("accessibility");
            Intrinsics.checkNotNull(systemService, "");
            accessibilityManager = (AccessibilityManager) systemService;
            int i3 = 39 / 0;
            if (!accessibilityManager.isEnabled()) {
                return;
            }
        } else {
            Object systemService2 = getContext().getSystemService("accessibility");
            Intrinsics.checkNotNull(systemService2, "");
            accessibilityManager = (AccessibilityManager) systemService2;
            if (!accessibilityManager.isEnabled()) {
                return;
            }
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(Http2.INITIAL_MAX_FRAME_SIZE);
        accessibilityEventObtain.setClassName(InputAmountView.class.getName());
        accessibilityEventObtain.setPackageName(getContext().getPackageName());
        accessibilityEventObtain.getText().add(this.IAuthTabCallbackStub + this.access100);
        accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        int i4 = extraCallback + 11;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallback(ArrayList<Triple<Float, String, String>> arrayList) {
        float fMeasureText;
        int i = 2 % 2;
        ArrayList<IAuthTabCallback> arrayList2 = new ArrayList<>();
        Iterator<T> it = arrayList.iterator();
        float f = 0.0f;
        while (!(!it.hasNext())) {
            Triple triple = (Triple) it.next();
            if (Intrinsics.areEqual(triple.getSecond(), this.access100)) {
                onExtraCallback onextracallback = onExtraCallback.CURRENCY;
                fMeasureText = this.asBinder.measureText(this.access100);
                arrayList2.add(new IAuthTabCallback(onextracallback, ((Number) triple.getFirst()).floatValue(), f, fMeasureText, (String) triple.getSecond(), (String) triple.getThird()));
            } else if (Intrinsics.areEqual(triple.getThird(), ",")) {
                onExtraCallback onextracallback2 = onExtraCallback.COMMA;
                fMeasureText = this.onExtraCallbackWithResult.measureText(",");
                arrayList2.add(new IAuthTabCallback(onextracallback2, ((Number) triple.getFirst()).floatValue(), f, fMeasureText, (String) triple.getSecond(), (String) triple.getThird()));
            } else if (((CharSequence) triple.getSecond()).length() == 0) {
                onExtraCallback onextracallback3 = onExtraCallback.ADD;
                fMeasureText = this.onExtraCallbackWithResult.measureText((String) triple.getThird());
                arrayList2.add(new IAuthTabCallback(onextracallback3, ((Number) triple.getFirst()).floatValue(), f, fMeasureText, (String) triple.getSecond(), (String) triple.getThird()));
            } else if (((CharSequence) triple.getThird()).length() == 0) {
                arrayList2.add(new IAuthTabCallback(onExtraCallback.REMOVE, ((Number) triple.getFirst()).floatValue(), f, this.onExtraCallbackWithResult.measureText((String) triple.getSecond()), (String) triple.getSecond(), (String) triple.getThird()));
                int i2 = extraCallback + 73;
                writeTypedObject = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 3 % 3;
                }
            } else {
                onExtraCallback onextracallback4 = onExtraCallback.REPLACE;
                fMeasureText = this.onExtraCallbackWithResult.measureText((String) triple.getThird());
                arrayList2.add(new IAuthTabCallback(onextracallback4, ((Number) triple.getFirst()).floatValue(), f, fMeasureText, (String) triple.getSecond(), (String) triple.getThird()));
                int i4 = extraCallback + 97;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
            }
            f += fMeasureText;
        }
        onWarmupCompleted(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(ArrayList<IAuthTabCallback> arrayList) {
        ArrayList arrayList2;
        boolean z;
        IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult;
        Object next;
        int i = 2;
        int i2 = 2 % 2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList<onWarmupCompleted> arrayList4 = this.asInterface;
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it = arrayList4.iterator();
        while (it.hasNext()) {
            int i3 = writeTypedObject + 115;
            extraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                next = it.next();
                int i4 = 43 / 0;
                if (((onWarmupCompleted) next).onExtraCallbackWithResult().onExtraCallbackWithResult().isNumber()) {
                    arrayList5.add(next);
                }
            } else {
                next = it.next();
                if (((onWarmupCompleted) next).onExtraCallbackWithResult().onExtraCallbackWithResult().isNumber()) {
                    arrayList5.add(next);
                }
            }
        }
        int i5 = 0;
        for (IAuthTabCallback iAuthTabCallback : arrayList) {
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) CollectionsKt___CollectionsKt.getOrNull(arrayList5, i5);
            if (Intrinsics.areEqual((onwarmupcompleted == null || (iAuthTabCallbackOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult()) == null) ? null : iAuthTabCallbackOnExtraCallbackWithResult.onExtraCallback(), iAuthTabCallback.onExtraCallback())) {
                int i6 = extraCallback + 89;
                writeTypedObject = i6 % 128;
                if (i6 % i != 0 ? System.currentTimeMillis() >= onwarmupcompleted.onWarmupCompleted() + this.onTransact : System.currentTimeMillis() >= (onwarmupcompleted.onWarmupCompleted() ^ this.onTransact)) {
                    int i7 = writeTypedObject + 79;
                    extraCallback = i7 % 128;
                    int i8 = i7 % i;
                    if (System.currentTimeMillis() >= onwarmupcompleted.IAuthTabCallback() + this.onTransact) {
                        arrayList2 = arrayList5;
                        z = true;
                        arrayList3.add(new onWarmupCompleted(this, iAuthTabCallback, iAuthTabCallback.IAuthTabCallback(), 0L, 0L, 12, (DefaultConstructorMarker) null));
                    }
                }
                onwarmupcompleted.onExtraCallbackWithResult().onExtraCallbackWithResult(iAuthTabCallback.onTransact());
                onwarmupcompleted.onNavigationEvent(System.currentTimeMillis());
                arrayList3.add(onwarmupcompleted);
                arrayList2 = arrayList5;
                z = true;
            }
            if (iAuthTabCallback.onExtraCallbackWithResult().isNumber() != z) {
                arrayList5 = arrayList2;
                i = 2;
            } else {
                int i9 = extraCallback + 83;
                writeTypedObject = i9 % 128;
                int i10 = i9 % 2;
                i5++;
                i = 2;
                arrayList5 = arrayList2;
            }
        }
        this.asInterface.clear();
        this.asInterface.addAll(arrayList3);
        this.IAuthTabCallbackDefault = true;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0261 A[PHI: r3
      0x0261: PHI (r3v7 char) = (r3v6 char), (r3v11 char) binds: [B:47:0x025f, B:44:0x0254] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x026b A[PHI: r3
      0x026b: PHI (r3v10 char) = (r3v6 char), (r3v11 char) binds: [B:47:0x025f, B:44:0x0254] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(@NotNull Canvas canvas) {
        String str;
        char c;
        float fOnTransact;
        int i = 2;
        int i2 = 2 % 2;
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float measuredWidth = (getMeasuredWidth() - ((onWarmupCompleted) CollectionsKt___CollectionsKt.last((List) this.asInterface)).onExtraCallbackWithResult().onNavigationEvent()) / 2.0f;
        float measuredHeight = (getMeasuredHeight() - (this.onExtraCallbackWithResult.getFontMetrics().top + this.onExtraCallbackWithResult.getFontMetrics().bottom)) / 2.0f;
        for (onWarmupCompleted onwarmupcompleted : this.asInterface) {
            int i3 = writeTypedObject + 77;
            extraCallback = i3 % 128;
            int i4 = i3 % i;
            int i5 = onNavigationEvent.onExtraCallbackWithResult[onwarmupcompleted.onExtraCallbackWithResult().onExtraCallbackWithResult().ordinal()];
            if (i5 != 1) {
                int i6 = writeTypedObject;
                int i7 = i6 + 77;
                extraCallback = i7 % 128;
                int i8 = i7 % i;
                if (i5 == i || i5 == 3) {
                    if (!(!Intrinsics.areEqual(onwarmupcompleted.onExtraCallbackWithResult().onExtraCallback(), onwarmupcompleted.onExtraCallbackWithResult().onWarmupCompleted()))) {
                        int i9 = writeTypedObject + 37;
                        extraCallback = i9 % 128;
                        int i10 = i9 % i;
                        float fOnTransact2 = onwarmupcompleted.onNavigationEvent() == 0.0f ? onwarmupcompleted.onExtraCallbackWithResult().onTransact() + measuredWidth : (onwarmupcompleted.onExtraCallbackWithResult().onTransact() + measuredWidth) - (((onwarmupcompleted.onExtraCallbackWithResult().onTransact() + measuredWidth) - onwarmupcompleted.onNavigationEvent()) * (1.0f - onWarmupCompleted.getInterpolation(Math.min(this.onTransact, System.currentTimeMillis() - onwarmupcompleted.onWarmupCompleted()) / this.onTransact)));
                        this.onExtraCallbackWithResult.setAlpha(255);
                        canvas.drawText(onwarmupcompleted.onExtraCallbackWithResult().onExtraCallback(), fOnTransact2, measuredHeight, this.onExtraCallbackWithResult);
                        onwarmupcompleted.onExtraCallback(fOnTransact2);
                    } else {
                        if (onwarmupcompleted.onExtraCallbackWithResult().onWarmupCompleted().length() > 0) {
                            float fOnTransact3 = onwarmupcompleted.onNavigationEvent() == 0.0f ? onwarmupcompleted.onExtraCallbackWithResult().onTransact() + measuredWidth : onwarmupcompleted.onNavigationEvent();
                            str = str2;
                            float interpolation = (this.access000 * onNavigationEvent.getInterpolation(Math.min(this.getInterfaceDescriptor, System.currentTimeMillis() - onwarmupcompleted.IAuthTabCallback()) / this.getInterfaceDescriptor)) + measuredHeight;
                            this.onExtraCallbackWithResult.setAlpha((int) ((1.0f - (Math.min(this.access000, Math.abs(interpolation - measuredHeight)) / this.access000)) * 255.0f));
                            canvas.drawText(onwarmupcompleted.onExtraCallbackWithResult().onWarmupCompleted(), fOnTransact3, interpolation, this.onExtraCallbackWithResult);
                        } else {
                            str = str2;
                        }
                        if (onwarmupcompleted.onExtraCallbackWithResult().onExtraCallback().length() > 0) {
                            int i11 = writeTypedObject + 107;
                            extraCallback = i11 % 128;
                            if (i11 % 2 != 0) {
                                float fOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
                                c = CharCompanionObject.MIN_VALUE;
                                fOnTransact = fOnNavigationEvent == 2.0f ? onwarmupcompleted.onExtraCallbackWithResult().onTransact() + measuredWidth : (onwarmupcompleted.onExtraCallbackWithResult().onTransact() + measuredWidth) - (((onwarmupcompleted.onExtraCallbackWithResult().onTransact() + measuredWidth) - onwarmupcompleted.onNavigationEvent()) * (1.0f - onWarmupCompleted.getInterpolation(Math.min(this.onTransact, System.currentTimeMillis() - onwarmupcompleted.onWarmupCompleted()) / this.onTransact)));
                            } else {
                                c = CharCompanionObject.MIN_VALUE;
                                if (onwarmupcompleted.onNavigationEvent() == 0.0f) {
                                }
                            }
                            float interpolation2 = measuredHeight - (this.IAuthTabCallbackStubProxy * (1.0f - onExtraCallback.getInterpolation(Math.min(this.onTransact, System.currentTimeMillis() - onwarmupcompleted.IAuthTabCallback()) / this.onTransact)));
                            this.onExtraCallbackWithResult.setAlpha((int) ((1.0f - (Math.min(this.IAuthTabCallbackStubProxy, Math.abs(interpolation2 - measuredHeight)) / this.IAuthTabCallbackStubProxy)) * 255.0f));
                            canvas.drawText(onwarmupcompleted.onExtraCallbackWithResult().onExtraCallback(), fOnTransact, interpolation2, this.onExtraCallbackWithResult);
                            onwarmupcompleted.onExtraCallback(fOnTransact);
                            str2 = str;
                            i = 2;
                        } else {
                            str2 = str;
                            i = 2;
                        }
                    }
                } else if (i5 != 4) {
                    int i12 = i6 + 101;
                    extraCallback = i12 % 128;
                    int i13 = i12 % i;
                    if (i5 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    float fOnTransact4 = onwarmupcompleted.onExtraCallbackWithResult().onTransact();
                    this.onExtraCallbackWithResult.setAlpha((int) (onWarmupCompleted.getInterpolation(Math.min(this.onTransact, System.currentTimeMillis() - onwarmupcompleted.onWarmupCompleted()) / this.onTransact) * 255.0f));
                    canvas.drawText(onwarmupcompleted.onExtraCallbackWithResult().onExtraCallback(), fOnTransact4 + measuredWidth, measuredHeight, this.onExtraCallbackWithResult);
                } else {
                    float fOnTransact5 = onwarmupcompleted.onNavigationEvent() == 0.0f ? onwarmupcompleted.onExtraCallbackWithResult().onTransact() + measuredWidth : (onwarmupcompleted.onExtraCallbackWithResult().onTransact() + measuredWidth) - (((onwarmupcompleted.onExtraCallbackWithResult().onTransact() + measuredWidth) - onwarmupcompleted.onNavigationEvent()) * (1.0f - onWarmupCompleted.getInterpolation(Math.min(this.onTransact, System.currentTimeMillis() - onwarmupcompleted.onWarmupCompleted()) / this.onTransact)));
                    Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), str2);
                    canvas.drawText(onwarmupcompleted.onExtraCallbackWithResult().onExtraCallback(), fOnTransact5, measuredHeight - varyMatches.onNavigationEvent(Float.valueOf(2.5f), r9), this.asBinder);
                    onwarmupcompleted.onExtraCallback(fOnTransact5);
                }
            }
        }
        if (onWarmupCompleted()) {
            int i14 = extraCallback + 103;
            writeTypedObject = i14 % 128;
            int i15 = i14 % 2;
            invalidate();
            return;
        }
        if (this.IAuthTabCallbackDefault) {
            int i16 = extraCallback + 57;
            writeTypedObject = i16 % 128;
            int i17 = i16 % 2;
            this.IAuthTabCallbackDefault = false;
            invalidate();
        }
    }

    private final boolean onWarmupCompleted() {
        int i = 2 % 2;
        ArrayList<onWarmupCompleted> arrayList = this.asInterface;
        if (arrayList != null && arrayList.isEmpty()) {
            int i2 = extraCallback + 115;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 47 / 0;
            }
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (((onWarmupCompleted) it.next()).onExtraCallback()) {
                int i4 = writeTypedObject + 79;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputConnection onCreateInputConnection(@Nullable EditorInfo editorInfo) {
        int i = 2 % 2;
        int i2 = extraCallback + 99;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        if (i2 % 2 == 0) {
            int i4 = 26 / 0;
            if (editorInfo != null) {
                int i5 = i3 + 63;
                extraCallback = i5 % 128;
                int i6 = i5 % 2;
                editorInfo.inputType = 2;
            }
        } else if (editorInfo != null) {
        }
        return new BaseInputConnection(this, false);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = ICustomTabsCallback + 49;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}

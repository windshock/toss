package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SizeF;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.content.res.ResourcesCompat;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.R;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import o.AppLovinSdkSettings;
import o.ConnectionPool;
import o.ConnectionSpec;
import o.ForwardingLiveDataExternalSyntheticLambda0;
import o.M_;
import o.OkHttpClientCompanion;
import o.RequestBodyCompanion;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.access15300;
import o.accessgetTlsVersionsAsStringp;
import o.authParams;
import o.connectionCount;
import o.deprecated_cacheResponse;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.eExternalSyntheticLambda0;
import o.getAdService;
import o.getDelegateokhttp;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.handshake;
import o.isFireOS;
import o.isMuted;
import o.processDeepLink;
import o.pxToDp;
import o.readIntokhttp;
import o.response;
import o.runOnUiThreadDelayed;
import o.setConnectionSpecsokhttp;
import o.setDnsokhttp;
import o.setDone;
import o.setTagsokhttp;
import o.setVisitUrl;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsTooltipV1View extends View {
    private static int ICustomTabsCallbackDefault = 1;
    private static int ICustomTabsCallbackStub = 0;
    private static int ICustomTabsCallback_Parcel = 0;
    private static int extraCommand = 1;
    private Path IAuthTabCallback;
    private Bitmap IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private final Lazy IAuthTabCallbackStubProxy;
    private final Paint IAuthTabCallback_Parcel;
    private Path ICustomTabsCallback;
    private final float ICustomTabsCallbackStubProxy;
    private final Rect access000;
    private StaticLayout access100;
    private Rally asBinder;
    private boolean asInterface;
    private int extraCallback;
    private float extraCallbackWithResult;
    private final Paint getInterfaceDescriptor;
    private onNavigationEvent onActivityLayout;
    private onExtraCallback onActivityResized;
    private float onExtraCallback;
    private final float onMessageChannelReady;
    private IAuthTabCallback onMinimized;
    private Layout.Alignment onNavigationEvent;
    private runOnUiThreadDelayed onPostMessage;
    private final setDnsokhttp onRelationshipValidationResult;
    private final Paint onTransact;
    private CharSequence onUnminimized;
    private SizeF onWarmupCompleted;
    private float readTypedObject;
    private int writeTypedObject;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int onExtraCallbackWithResult = 8;

    public static final /* synthetic */ class onTransact {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            try {
                iArr[onExtraCallback.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallback.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[IAuthTabCallback.values().length];
            try {
                iArr2[IAuthTabCallback.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IAuthTabCallback.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IAuthTabCallback.LEFT.ordinal()] = 3;
                int i = onExtraCallback + 105;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IAuthTabCallback.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallbackWithResult = iArr2;
            int i4 = IAuthTabCallback + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ EnumEntries<Layout.Alignment> IAuthTabCallback = access15300.onExtraCallbackWithResult(Layout.Alignment.values());
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 119;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = ICustomTabsCallback_Parcel + 45;
        extraCommand = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTooltipV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTooltipV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Paint IAuthTabCallback(TdsTooltipV1View tdsTooltipV1View, Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 125;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(tdsTooltipV1View, context);
        }
        onExtraCallback(tdsTooltipV1View, context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 105;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0);
        int i4 = ICustomTabsCallbackStub + 3;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 93;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{function0}, 1093695380, -1093695379, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
        int i4 = ICustomTabsCallbackStub + 35;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i3;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i2 | i3 | i5));
        int i13 = i7 | i10;
        int i14 = i9 | (~i13) | i11;
        int i15 = (~(i5 | i3)) | (~(i13 | i8)) | (~(i2 | i5));
        int i16 = i2 + i3 + i4 + ((-298151579) * i6) + ((-427515960) * i);
        int i17 = i16 * i16;
        int i18 = (i2 * (-431502880)) + 875560960 + ((-431502880) * i3) + ((-1881159201) * i12) + ((-532648894) * i14) + (1881159201 * i15) + (1449656320 * i4) + ((-16252928) * i6) + (423624704 * i) + (1109590016 * i17);
        int i19 = ((i2 * (-2003555040)) - 1632655964) + (i3 * (-2003555040)) + (i12 * (-423)) + (i14 * 846) + (i15 * 423) + (i4 * (-2003554617)) + (i6 * 1812671363) + (i * (-1519508360)) + (i17 * (-1288372224));
        int i20 = i18 + (i19 * i19 * (-1796407296));
        return i20 != 1 ? i20 != 2 ? i20 != 3 ? i20 != 4 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 9;
        ICustomTabsCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(function0);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function0);
        int i3 = ICustomTabsCallbackStub + 111;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsTooltipV1View(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        boolean z;
        float dimensionPixelSize;
        float dimensionPixelSize2;
        int dimensionPixelSize3;
        int iAsInterface;
        String str;
        String str2;
        super(context, attributeSet, i);
        String str3 = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullParameter(context, "");
        this.access000 = new Rect();
        eExternalSyntheticLambda0 eexternalsyntheticlambda0 = eExternalSyntheticLambda0.TooltipDefaultFill;
        this.writeTypedObject = OkHttpClientCompanion.onWarmupCompleted(this, eexternalsyntheticlambda0);
        onExtraCallback onextracallback = onExtraCallback.NONE;
        this.onActivityResized = onextracallback;
        this.IAuthTabCallbackStubProxy = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TdsTooltipV1View$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 53;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Paint paintIAuthTabCallback = TdsTooltipV1View.IAuthTabCallback(this.f$0, context);
                int i6 = onExtraCallbackWithResult + 103;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return paintIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(this.writeTypedObject);
        paint.setAntiAlias(true);
        this.onTransact = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setColor(VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(ResourcesCompat.onExtraCallbackWithResult(getResources(), R.color.balloon_shadow, context.getTheme()), 88));
        paint2.setAntiAlias(true);
        paint2.setMaskFilter(new BlurMaskFilter(32.0f, BlurMaskFilter.Blur.NORMAL));
        this.getInterfaceDescriptor = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(Paint.Style.STROKE);
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        paint3.setStrokeWidth(varyMatches.onNavigationEvent(Float.valueOf(0.5f), r7));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        paint3.setColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new asInterface(configuration))}, 2109422447, -2109422438, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
        paint3.setAntiAlias(true);
        this.IAuthTabCallback_Parcel = paint3;
        onNavigationEvent onnavigationevent = onNavigationEvent.MEDIUM;
        this.onActivityLayout = onnavigationevent;
        Float fValueOf = Float.valueOf(24.0f);
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.extraCallbackWithResult = varyMatches.onNavigationEvent(fValueOf, r9);
        getDelegateokhttp.onExtraCallback onextracallback2 = getDelegateokhttp.Companion;
        this.onRelationshipValidationResult = setConnectionSpecsokhttp.IAuthTabCallback((Function1) null, 0.0f, onextracallback2.onWarmupCompleted(), onextracallback2.IAuthTabCallback(), 3, (Object) null);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.onNavigationEvent = alignment;
        this.extraCallback = IntCompanionObject.MAX_VALUE;
        this.onUnminimized = _UrlKt.FRAGMENT_ENCODE_SET;
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.TOP;
        this.onMinimized = iAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.ICustomTabsCallbackStubProxy = varyMatches.onNavigationEvent(Float.valueOf(2.0f), r12);
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.onMessageChannelReady = varyMatches.onNavigationEvent(Float.valueOf(12.0f), r12);
        this.asInterface = true;
        this.readTypedObject = -1.0f;
        int iOnExtraCallback = deprecated_cacheResponse.onExtraCallback(this, this.onActivityLayout.getTextSize(), 0.0f, 2, (Object) null);
        int iOnNavigationEvent = RequestBodyCompanion.onNavigationEvent(this, authParams.TextPrimary);
        int iOnWarmupCompleted = OkHttpClientCompanion.onWarmupCompleted(this, eexternalsyntheticlambda0);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fOnNavigationEvent = varyMatches.onNavigationEvent(fValueOf, displayMetrics);
        boolean z2 = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsTooltipV1, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z3 = true;
            int i3 = 0;
            boolean z4 = false;
            int color = iOnNavigationEvent;
            dimensionPixelSize = -1.0f;
            dimensionPixelSize2 = 0.0f;
            dimensionPixelSize3 = IntCompanionObject.MAX_VALUE;
            while (i3 < indexCount) {
                int i4 = ICustomTabsCallbackDefault + 107;
                int i5 = indexCount;
                ICustomTabsCallbackStub = i4 % 128;
                int i6 = i4 % 2;
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == R.styleable.TdsTooltipV1_android_text) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    if (string != null) {
                        int i7 = 2 % 2;
                        str3 = string;
                    }
                } else {
                    if (index == R.styleable.TdsTooltipV1_android_textSize) {
                        iOnExtraCallback = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iOnExtraCallback);
                    } else if (index == R.styleable.TdsTooltipV1_android_textColor) {
                        color = typedArrayObtainStyledAttributes.getColor(index, color);
                    } else if (index == R.styleable.TdsTooltipV1_dropShadow) {
                        z3 = typedArrayObtainStyledAttributes.getBoolean(index, z3);
                    } else if (index == R.styleable.TdsTooltipV1_tail) {
                        int i8 = ICustomTabsCallbackStub + 115;
                        ICustomTabsCallbackDefault = i8 % 128;
                        iAuthTabCallback = i8 % 2 == 0 ? IAuthTabCallback.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 1)) : IAuthTabCallback.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0));
                    } else if (index == R.styleable.TdsTooltipV1_tailOffset) {
                        dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) dimensionPixelSize);
                    } else if (index == R.styleable.TdsTooltipV1_tailReverse) {
                        int i9 = ICustomTabsCallbackDefault + 69;
                        String str4 = str3;
                        ICustomTabsCallbackStub = i9 % 128;
                        if (i9 % 2 != 0) {
                            typedArrayObtainStyledAttributes.getBoolean(index, z4);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        z4 = typedArrayObtainStyledAttributes.getBoolean(index, z4);
                        str3 = str4;
                    } else {
                        str = str3;
                        boolean z5 = z4;
                        if (index == R.styleable.TdsTooltipV1_tailCrossAxisOffset) {
                            dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) dimensionPixelSize2);
                        } else {
                            if (index == R.styleable.TdsTooltipV1_alignment) {
                                int i10 = ICustomTabsCallbackDefault + 109;
                                ICustomTabsCallbackStub = i10 % 128;
                                if (i10 % 2 != 0) {
                                    alignment = onWarmupCompleted.IAuthTabCallback.get(typedArrayObtainStyledAttributes.getInt(index, 5));
                                } else {
                                    z4 = z5;
                                    alignment = onWarmupCompleted.IAuthTabCallback.get(typedArrayObtainStyledAttributes.getInt(index, 2));
                                }
                            } else if (index == R.styleable.TdsTooltipV1_maxWidth) {
                                int i11 = ICustomTabsCallbackStub + 123;
                                z4 = z5;
                                ICustomTabsCallbackDefault = i11 % 128;
                                if (i11 % 2 == 0) {
                                    typedArrayObtainStyledAttributes.getDimensionPixelSize(index, IntCompanionObject.MAX_VALUE);
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, IntCompanionObject.MAX_VALUE);
                                str3 = str;
                                str2 = str3;
                                i3++;
                                str3 = str2;
                                indexCount = i5;
                            } else {
                                z4 = z5;
                                if (index == R.styleable.TdsTooltipV1_tooltipColor) {
                                    iOnWarmupCompleted = typedArrayObtainStyledAttributes.getColor(index, iOnWarmupCompleted);
                                } else if (index == R.styleable.TdsTooltipV1_tooltipSize) {
                                    onnavigationevent = onNavigationEvent.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0));
                                } else if (index == R.styleable.TdsTooltipV1_outerPadding) {
                                    fOnNavigationEvent = typedArrayObtainStyledAttributes.getDimension(index, fOnNavigationEvent);
                                } else {
                                    if (index == R.styleable.TdsTooltipV1_clipToEnd) {
                                        int i12 = ICustomTabsCallbackDefault + 115;
                                        ICustomTabsCallbackStub = i12 % 128;
                                        int i13 = i12 % 2;
                                        onextracallback = onExtraCallback.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0));
                                    }
                                    str2 = str;
                                    i3++;
                                    str3 = str2;
                                    indexCount = i5;
                                }
                                int i14 = 2 % 2;
                            }
                            str2 = str;
                            i3++;
                            str3 = str2;
                            indexCount = i5;
                        }
                        z4 = z5;
                        str2 = str;
                        i3++;
                        str3 = str2;
                        indexCount = i5;
                    }
                    str = str3;
                    str2 = str;
                    i3++;
                    str3 = str2;
                    indexCount = i5;
                }
                str2 = str3;
                i3++;
                str3 = str2;
                indexCount = i5;
            }
            i2 = color;
            z = z3;
            z2 = z4;
        } else {
            int i15 = 2 % 2;
            i2 = iOnNavigationEvent;
            z = true;
            dimensionPixelSize = -1.0f;
            dimensionPixelSize2 = 0.0f;
            dimensionPixelSize3 = IntCompanionObject.MAX_VALUE;
        }
        setText(str3);
        setDropShadow(z);
        setTail(iAuthTabCallback);
        setSize(onnavigationevent);
        setAlignment(alignment);
        Integer numValueOf = Integer.valueOf(dimensionPixelSize3);
        Integer num = numValueOf.intValue() == Integer.MAX_VALUE ? null : numValueOf;
        if (num != null) {
            iAsInterface = num.intValue();
            int i16 = ICustomTabsCallbackStub + 87;
            ICustomTabsCallbackDefault = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 2 % 2;
        } else {
            iAsInterface = M_.onExtraCallback.asInterface() - (setTagsokhttp.onExtraCallbackWithResult(this, 48) << 1);
        }
        setMaxWidth(iAsInterface);
        setTailClipToEnd(onextracallback);
        IAuthTabCallbackStub().setTextSize(iOnExtraCallback);
        setTextColor(i2);
        setOffset(dimensionPixelSize, z2);
        setCrossAxisOffset(dimensionPixelSize2);
        setTooltipColor(iOnWarmupCompleted);
        setOuterPadding(fOnNavigationEvent);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsTooltipV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = ICustomTabsCallbackDefault + 61;
            ICustomTabsCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 39 / 0;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = ICustomTabsCallbackStub + 77;
            ICustomTabsCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class asInterface implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asInterface(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i2 = onNavigationEvent + 119;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 27 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallback + 115;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final onNavigationEvent LARGE;
        public static final onNavigationEvent MEDIUM;
        public static final onNavigationEvent SMALL;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final float balloonRadiusDip;
        private final float clippedTailHeightDip;
        private final float clippedTailWidthDip;
        private final response font;
        private final float horizontalPaddingDip;
        private final float tailHeightDip;
        private final float tailWidthDip;
        private final handshake tdsLineHeight;
        private final connectionCount textSize;
        private final float verticalPaddingDip;

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 29;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {SMALL, MEDIUM, LARGE};
            int i5 = i2 + 125;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 16 / 0;
            }
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i3 + 71;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onWarmupCompleted + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = IAuthTabCallback + 79;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, connectionCount connectioncount, handshake handshakeVar, response responseVar) {
            this.balloonRadiusDip = f;
            this.tailWidthDip = f2;
            this.tailHeightDip = f3;
            this.clippedTailWidthDip = f4;
            this.clippedTailHeightDip = f5;
            this.horizontalPaddingDip = f6;
            this.verticalPaddingDip = f7;
            this.textSize = connectioncount;
            this.tdsLineHeight = handshakeVar;
            this.font = responseVar;
        }

        public final float getBalloonRadiusDip() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.balloonRadiusDip;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float getTailWidthDip() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            float f = this.tailWidthDip;
            int i5 = i3 + 87;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            throw null;
        }

        public final float getTailHeightDip() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            float f = this.tailHeightDip;
            if (i3 == 0) {
                int i4 = 26 / 0;
            }
            return f;
        }

        public final float getClippedTailWidthDip() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 3;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            float f = this.clippedTailWidthDip;
            int i4 = i2 + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        public final float getClippedTailHeightDip() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 89;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            float f = this.clippedTailHeightDip;
            int i4 = i2 + 105;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return f;
            }
            obj.hashCode();
            throw null;
        }

        public final float getHorizontalPaddingDip() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            float f = this.horizontalPaddingDip;
            int i5 = i3 + 41;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float getVerticalPaddingDip() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            float f = this.verticalPaddingDip;
            int i5 = i2 + 49;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final connectionCount getTextSize() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 79;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            connectionCount connectioncount = this.textSize;
            int i5 = i2 + 115;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 56 / 0;
            }
            return connectioncount;
        }

        public final handshake getTdsLineHeight() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            handshake handshakeVar = this.tdsLineHeight;
            int i5 = i3 + 107;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return handshakeVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final response getFont() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            response responseVar = this.font;
            int i5 = i3 + 71;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return responseVar;
            }
            throw null;
        }

        static {
            connectionCount connectioncount = new connectionCount(accessgetTlsVersionsAsStringp.Typography7.getSize(), 0.0f, 2, (DefaultConstructorMarker) null);
            ConnectionPool connectionPool = ConnectionPool.onWarmupCompleted;
            handshake.onNavigationEvent onnavigationeventIAuthTabCallback = connectionPool.IAuthTabCallback();
            response responseVar = response.Bold;
            SMALL = new onNavigationEvent("SMALL", 0, 12.0f, 20.0f, 9.0f, 14.0f, 7.5f, 16.0f, 6.0f, connectioncount, onnavigationeventIAuthTabCallback, responseVar);
            MEDIUM = new onNavigationEvent("MEDIUM", 1, 16.0f, 30.0f, 12.0f, 19.0f, 10.0f, 16.0f, 12.0f, new connectionCount(accessgetTlsVersionsAsStringp.Typography6.getSize(), 0.0f, 2, (DefaultConstructorMarker) null), connectionPool.IAuthTabCallback(), responseVar);
            LARGE = new onNavigationEvent("LARGE", 2, 18.0f, 30.0f, 12.0f, 19.0f, 10.0f, 22.0f, 12.0f, new connectionCount(accessgetTlsVersionsAsStringp.SubTypography8.getSize(), 0.0f, 2, (DefaultConstructorMarker) null), connectionPool.IAuthTabCallback(), responseVar);
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onNavigationEvent + 111;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 20 / 0;
            }
        }

        public final float calculateLineHeight(@NotNull View view) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                return deprecated_cacheResponse.IAuthTabCallback(view, this.textSize, 1.0f, this.tdsLineHeight, 4, (Object) null);
            }
            Intrinsics.checkNotNullParameter(view, "");
            return deprecated_cacheResponse.IAuthTabCallback(view, this.textSize, 0.0f, this.tdsLineHeight, 2, (Object) null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallback NONE = new onExtraCallback("NONE", 0);
        public static final onExtraCallback LEFT = new onExtraCallback("LEFT", 1);
        public static final onExtraCallback RIGHT = new onExtraCallback("RIGHT", 2);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return new onExtraCallback[]{NONE, LEFT, RIGHT};
            }
            onExtraCallback onextracallback = NONE;
            onExtraCallback onextracallback2 = LEFT;
            onExtraCallback onextracallback3 = RIGHT;
            onExtraCallback[] onextracallbackArr = new onExtraCallback[2];
            onextracallbackArr[1] = onextracallback;
            onextracallbackArr[1] = onextracallback2;
            onextracallbackArr[5] = onextracallback3;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 103;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 35 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 != 0) {
                return onextracallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback[] values() {
            onExtraCallback[] onextracallbackArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
                int i3 = 28 / 0;
            } else {
                onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            }
            int i4 = onNavigationEvent + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallbackWithResult + 125;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final int tail;
        public static final IAuthTabCallback TOP = new IAuthTabCallback("TOP", 0, 0);
        public static final IAuthTabCallback LEFT = new IAuthTabCallback("LEFT", 1, 1);
        public static final IAuthTabCallback RIGHT = new IAuthTabCallback("RIGHT", 2, 2);
        public static final IAuthTabCallback BOTTOM = new IAuthTabCallback("BOTTOM", 3, 3);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 3;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                IAuthTabCallback iAuthTabCallback = TOP;
                IAuthTabCallback iAuthTabCallback2 = LEFT;
                IAuthTabCallback iAuthTabCallback3 = RIGHT;
                IAuthTabCallback iAuthTabCallback4 = BOTTOM;
                iAuthTabCallbackArr = new IAuthTabCallback[4];
                iAuthTabCallbackArr[1] = iAuthTabCallback;
                iAuthTabCallbackArr[0] = iAuthTabCallback2;
                iAuthTabCallbackArr[5] = iAuthTabCallback3;
                iAuthTabCallbackArr[4] = iAuthTabCallback4;
            } else {
                iAuthTabCallbackArr = new IAuthTabCallback[]{TOP, LEFT, RIGHT, BOTTOM};
            }
            int i4 = i2 + 83;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onExtraCallback + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i, int i2) {
            this.tail = i2;
        }

        public final int getTail() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = this.tail;
            int i5 = i3 + 21;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            throw null;
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public final boolean isVertical() {
            int i = 2 % 2;
            if (this == TOP) {
                return true;
            }
            int i2 = IAuthTabCallback + 83;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this == BOTTOM) {
                return true;
            }
            int i5 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 35;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public final boolean isHorizontal() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 93;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this != LEFT && this != RIGHT) {
                int i4 = i2 + 43;
                IAuthTabCallback = i4 % 128;
                return i4 % 2 == 0;
            }
            int i5 = i2 + 123;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public final void setTailClipToEnd(@NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + Imgproc.COLOR_YUV2RGBA_YVYU;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onActivityResized = onextracallback;
        invalidate();
        int i4 = ICustomTabsCallbackDefault + 105;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
    }

    private final Paint IAuthTabCallbackStub() {
        Paint paint;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 29;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            paint = (Paint) this.IAuthTabCallbackStubProxy.getValue();
            int i3 = 23 / 0;
        } else {
            paint = (Paint) this.IAuthTabCallbackStubProxy.getValue();
        }
        int i4 = ICustomTabsCallbackDefault + 5;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return paint;
        }
        throw null;
    }

    private static final Paint onExtraCallback(TdsTooltipV1View tdsTooltipV1View, Context context) {
        int i = 2 % 2;
        Paint paint = new Paint();
        paint.setTextSize(deprecated_cacheResponse.onExtraCallback(tdsTooltipV1View, tdsTooltipV1View.onActivityLayout.getTextSize(), 0.0f, 2, (Object) null));
        paint.setTypeface(response.toTypeface$default(tdsTooltipV1View.onActivityLayout.getFont(), context, (setDone) null, 2, (Object) null));
        paint.setColor(RequestBodyCompanion.onNavigationEvent(tdsTooltipV1View, authParams.TextPrimary));
        paint.setAntiAlias(true);
        int i2 = ICustomTabsCallbackStub + 49;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return paint;
    }

    public final void setSize(@NotNull onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 1;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.onActivityLayout = onnavigationevent;
        Paint paintIAuthTabCallbackStub = IAuthTabCallbackStub();
        paintIAuthTabCallbackStub.setTextSize(deprecated_cacheResponse.onExtraCallback(this, onnavigationevent.getTextSize(), 0.0f, 2, (Object) null));
        response font = onnavigationevent.getFont();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        paintIAuthTabCallbackStub.setTypeface(response.toTypeface$default(font, context, (setDone) null, 2, (Object) null));
        asInterface();
        invalidate();
        int i4 = ICustomTabsCallbackStub + 13;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsTooltipV1View tdsTooltipV1View = (TdsTooltipV1View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 57;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        float f = tdsTooltipV1View.extraCallbackWithResult;
        float tailHeightDip = tdsTooltipV1View.onActivityLayout.getTailHeightDip();
        Intrinsics.checkNotNullExpressionValue(tdsTooltipV1View.getContext().getResources().getDisplayMetrics(), "");
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(f, varyMatches.onNavigationEvent(Float.valueOf(tailHeightDip), r5) * 2.0f);
        int i4 = ICustomTabsCallbackDefault + 83;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return Float.valueOf(fCoerceAtLeast);
        }
        int i5 = 65 / 0;
        return Float.valueOf(fCoerceAtLeast);
    }

    public final void setAlignment(@NotNull Layout.Alignment alignment) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 99;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(alignment, "");
        this.onNavigationEvent = alignment;
        asInterface();
        requestLayout();
        invalidate();
        int i4 = ICustomTabsCallbackDefault + 75;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
    }

    public final void setMaxWidth(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault + 89;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.extraCallback = i;
        asInterface();
        requestLayout();
        invalidate();
        int i5 = ICustomTabsCallbackDefault + 47;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CharSequence asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 111;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        CharSequence charSequence = this.onUnminimized;
        int i4 = i2 + 87;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return charSequence;
    }

    public final void setText(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 3;
        ICustomTabsCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            this.onUnminimized = (CharSequence) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, charSequence}, -1956599812, 1956599812, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
            asInterface();
            requestLayout();
            invalidate();
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback5 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback6 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        this.onUnminimized = (CharSequence) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, charSequence}, -1956599812, 1956599812, iOnExtraCallback5, iOnExtraCallback4, iOnExtraCallback6);
        asInterface();
        requestLayout();
        invalidate();
        int i3 = ICustomTabsCallbackDefault + 35;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setTail(@NotNull IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 37;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onMinimized = iAuthTabCallback;
        invalidate();
        int i4 = ICustomTabsCallbackStub + 91;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void setDropShadow(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 123;
        ICustomTabsCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.asInterface = z;
            obj.hashCode();
            throw null;
        }
        this.asInterface = z;
        if (z) {
            setLayerType(1, null);
        } else {
            setLayerType(0, null);
            int i3 = ICustomTabsCallbackDefault + 83;
            ICustomTabsCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        }
        invalidate();
        int i5 = ICustomTabsCallbackStub + 81;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IAuthTabCallback(TdsTooltipV1View tdsTooltipV1View, boolean z, Function0 function0, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = ICustomTabsCallbackDefault + 89;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = ICustomTabsCallbackStub + 45;
            ICustomTabsCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        tdsTooltipV1View.onNavigationEvent(z, function0, i);
        int i8 = ICustomTabsCallbackDefault + 119;
        ICustomTabsCallbackStub = i8 % 128;
        int i9 = i8 % 2;
    }

    public final void onNavigationEvent(boolean z, @Nullable final Function0<Unit> function0, int i) {
        Pair pair;
        int i2 = 2 % 2;
        Float fValueOf = Float.valueOf(1.25f);
        Float fValueOf2 = Float.valueOf(0.5f);
        Float fValueOf3 = Float.valueOf(0.0f);
        Float fValueOf4 = Float.valueOf(1.0f);
        if (z) {
            setAlpha(0.0f);
            setScaleX(0.0f);
            setScaleY(0.0f);
        }
        int i3 = onTransact.onExtraCallbackWithResult[this.onMinimized.ordinal()];
        if (i3 == 1) {
            int i4 = onTransact.onNavigationEvent[this.onActivityResized.ordinal()];
            if (i4 != 1) {
                int i5 = ICustomTabsCallbackStub + 125;
                ICustomTabsCallbackDefault = i5 % 128;
                pair = (i5 % 2 != 0 ? i4 == 2 : i4 == 2) ? new Pair(fValueOf4, fValueOf3) : new Pair(fValueOf2, fValueOf3);
            } else {
                pair = new Pair(fValueOf3, fValueOf3);
            }
        } else if (i3 == 2) {
            int i6 = onTransact.onNavigationEvent[this.onActivityResized.ordinal()];
            if (i6 != 1) {
                int i7 = ICustomTabsCallbackStub + 7;
                ICustomTabsCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                pair = i6 != 2 ? new Pair(fValueOf2, fValueOf4) : new Pair(fValueOf4, fValueOf4);
            } else {
                pair = new Pair(fValueOf3, fValueOf4);
            }
        } else if (i3 == 3) {
            pair = new Pair(fValueOf3, fValueOf2);
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(fValueOf4, fValueOf2);
        }
        float fFloatValue = ((Number) pair.onExtraCallbackWithResult()).floatValue();
        float fFloatValue2 = ((Number) pair.IAuthTabCallback()).floatValue();
        Rally rally = this.asBinder;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.onPostMessage;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
            int i9 = ICustomTabsCallbackDefault + 41;
            ICustomTabsCallbackStub = i9 % 128;
            int i10 = i9 % 2;
        }
        this.onPostMessage = processDeepLink.onExtraCallback() ? (runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt__CollectionsJVMKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.access000(isMuted.asInterface(isMuted.asBinder(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf4, (Function1) null, 5, (Object) null), (Float) null, fValueOf4, (Function1) null, 5, (Object) null), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue), (Function1) null, 4, (Object) null), Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue2), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.TRUE, i, 0L, false, 3321, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.TdsTooltipV1View$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i11 = 2 % 2;
                int i12 = IAuthTabCallback + 57;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                Function0 function02 = function0;
                if (i13 == 0) {
                    return TdsTooltipV1View.onWarmupCompleted(function02);
                }
                TdsTooltipV1View.onWarmupCompleted(function02);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 1, (Object) null), false, 1, (Object) null) : isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.access000(isMuted.asInterface(isMuted.asBinder(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf4, (Function1) null, 5, (Object) null), (Float) null, fValueOf, (Function1) null, 5, (Object) null), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue), (Function1) null, 4, (Object) null), Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue2), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(300.0d, 15.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf, fValueOf4, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 300, 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.TRUE, i, 0L, false, 3321, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.TdsTooltipV1View$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i11 = 2 % 2;
                int i12 = IAuthTabCallback + 47;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                Function0 function02 = function0;
                if (i13 != 0) {
                    return TdsTooltipV1View.onNavigationEvent(function02);
                }
                TdsTooltipV1View.onNavigationEvent(function02);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 1, (Object) null), false, 1, (Object) null);
    }

    private static final Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        if (function0 != null) {
            int i2 = ICustomTabsCallbackStub + 85;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
            int i4 = ICustomTabsCallbackDefault + 77;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 89;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (function0 != null) {
            int i4 = i3 + 15;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            function0.invoke();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = ICustomTabsCallbackStub + 61;
        ICustomTabsCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onWarmupCompleted(TdsTooltipV1View tdsTooltipV1View, int i, Function0 function0, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = ICustomTabsCallbackDefault + 19;
            ICustomTabsCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 4;
            }
            i = 0;
        }
        if ((i2 & 2) != 0) {
            int i6 = ICustomTabsCallbackStub + 103;
            ICustomTabsCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            function0 = null;
        }
        tdsTooltipV1View.onExtraCallback(i, (Function0<Unit>) function0);
    }

    public final void onExtraCallback(int i, @Nullable final Function0<Unit> function0) {
        int i2 = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        runOnUiThreadDelayed runonuithreaddelayed = this.onPostMessage;
        if (runonuithreaddelayed != null) {
            int i3 = ICustomTabsCallbackStub + 63;
            ICustomTabsCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            runonuithreaddelayed.onNavigationEvent();
        }
        Rally rally = this.asBinder;
        if (rally != null) {
            int i5 = ICustomTabsCallbackStub + 109;
            ICustomTabsCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            rally.ICustomTabsServiceStub();
            int i7 = ICustomTabsCallbackStub + 95;
            ICustomTabsCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
        }
        Object[] objArr = {(Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.asBinder(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, Boolean.TRUE, Integer.valueOf(i), 0L, false, 1660, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new Function0() { // from class: im.toss.uikit.widget.TdsTooltipV1View$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                Unit unitOnExtraCallbackWithResult = TdsTooltipV1View.onExtraCallbackWithResult(function0);
                if (i11 == 0) {
                    int i12 = 93 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        }, 1, null};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        this.asBinder = isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, iOnExtraCallback, objArr, 2128644226), false, 1, (Object) null);
        int i9 = ICustomTabsCallbackStub + 125;
        ICustomTabsCallbackDefault = i9 % 128;
        int i10 = i9 % 2;
    }

    private static final Unit onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 27;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (function0 != null) {
            int i5 = i2 + 105;
            ICustomTabsCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                function0.invoke();
                int i6 = 28 / 0;
            } else {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setOffset$default(TdsTooltipV1View tdsTooltipV1View, float f, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault;
        int i4 = i3 + 51;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 93;
            ICustomTabsCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i3 + 51;
            ICustomTabsCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        tdsTooltipV1View.setOffset(f, z);
        int i10 = ICustomTabsCallbackStub + 69;
        ICustomTabsCallbackDefault = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public final void setOffset(float f, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 29;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.readTypedObject = f;
        this.IAuthTabCallbackStub = z;
        invalidate();
        int i4 = ICustomTabsCallbackDefault + 123;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setCrossAxisOffset(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 9;
        ICustomTabsCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onExtraCallback = f;
            invalidate();
            int i3 = ICustomTabsCallbackDefault + 73;
            ICustomTabsCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.onExtraCallback = f;
        invalidate();
        obj.hashCode();
        throw null;
    }

    public final void setTextSize(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 103;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallbackStub().setTextSize(i);
        int i5 = ICustomTabsCallbackStub + 43;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTextColor(int i) {
        int i2 = 2 % 2;
        if (i != IAuthTabCallbackStub().getColor()) {
            int i3 = ICustomTabsCallbackStub + 37;
            ICustomTabsCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                IAuthTabCallbackStub().setColor(i);
                asInterface();
                invalidate();
                throw null;
            }
            IAuthTabCallbackStub().setColor(i);
            asInterface();
            invalidate();
        }
        int i4 = ICustomTabsCallbackDefault + 59;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void setFont(@NotNull response responseVar) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 23;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(responseVar, "");
            Paint paintIAuthTabCallbackStub = IAuthTabCallbackStub();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            paintIAuthTabCallbackStub.setTypeface(response.toTypeface$default(responseVar, context, (setDone) null, 5, (Object) null));
        } else {
            Intrinsics.checkNotNullParameter(responseVar, "");
            Paint paintIAuthTabCallbackStub2 = IAuthTabCallbackStub();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            paintIAuthTabCallbackStub2.setTypeface(response.toTypeface$default(responseVar, context2, (setDone) null, 2, (Object) null));
        }
        asInterface();
        invalidate();
    }

    public final void setTooltipColor(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 39;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.writeTypedObject = i;
        this.onTransact.setColor(i);
        invalidate();
        int i5 = ICustomTabsCallbackDefault + 5;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOuterPadding(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 7;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallbackWithResult = f;
        invalidate();
        int i4 = ICustomTabsCallbackStub + 69;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setLeftImage(@NotNull Drawable drawable) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 53;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(drawable, "");
        this.IAuthTabCallbackDefault = ForwardingLiveDataExternalSyntheticLambda0.onExtraCallback(drawable, setTagsokhttp.onExtraCallbackWithResult(this, 24), setTagsokhttp.onExtraCallbackWithResult(this, 24), (Bitmap.Config) null, 4, (Object) null);
        invalidate();
        int i4 = ICustomTabsCallbackStub + 3;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        SizeF sizeF;
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallbackStub + 105;
        ICustomTabsCallbackDefault = i4 % 128;
        SizeF sizeF2 = null;
        if (i4 % 2 == 0) {
            sizeF = this.onWarmupCompleted;
            int i5 = 73 / 0;
            if (sizeF == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                sizeF = null;
            }
        } else {
            sizeF = this.onWarmupCompleted;
            if (sizeF == null) {
            }
        }
        float width = sizeF.getWidth();
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (width + (((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue() * 2.0f)), 1073741824);
        SizeF sizeF3 = this.onWarmupCompleted;
        if (sizeF3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i6 = ICustomTabsCallbackStub + 53;
            ICustomTabsCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            sizeF2 = sizeF3;
        }
        float height = sizeF2.getHeight();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (height + (((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue() * 2.0f)), 1073741824));
    }

    @Override // android.view.View
    public void invalidate() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 51;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.invalidate();
        SizeF sizeFIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        this.onWarmupCompleted = sizeFIAuthTabCallbackDefault;
        Path path = null;
        if (sizeFIAuthTabCallbackDefault == null) {
            int i4 = ICustomTabsCallbackStub + 17;
            ICustomTabsCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                path.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            sizeFIAuthTabCallbackDefault = null;
        }
        float width = sizeFIAuthTabCallbackDefault.getWidth();
        SizeF sizeF = this.onWarmupCompleted;
        if (sizeF == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            sizeF = null;
        }
        Path pathOnNavigationEvent = onNavigationEvent((int) width, (int) sizeF.getHeight(), this.onMinimized, this.readTypedObject, this.onExtraCallback);
        this.IAuthTabCallback = pathOnNavigationEvent;
        if (pathOnNavigationEvent == null) {
            int i5 = ICustomTabsCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
            ICustomTabsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            if (i6 != 0) {
                throw null;
            }
        } else {
            path = pathOnNavigationEvent;
        }
        Path path2 = new Path(path);
        Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
        path2.offset(0.0f, varyMatches.onNavigationEvent(Float.valueOf(4.0f), r1));
        this.ICustomTabsCallback = path2;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        int i = 2 % 2;
        super.setAlpha(f);
        this.getInterfaceDescriptor.setColor(VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(ResourcesCompat.onExtraCallbackWithResult(getResources(), im.toss.uikit.R.color.balloon_shadow, getContext().getTheme()), (int) (Math.max(0.0f, f) * 88.0f)));
        this.onTransact.setAlpha((int) ((this.writeTypedObject >>> 24) * f));
        Paint paint = this.IAuthTabCallback_Parcel;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Object[] objArr = {new getUrlokhttp(new IAuthTabCallbackDefault(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        paint.setAlpha((int) ((((Integer) getUrlokhttp.onNavigationEvent(objArr, 2109422447, -2109422438, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue() >>> 24) * f));
        StaticLayout staticLayout = this.access100;
        if (staticLayout != null) {
            int i2 = ICustomTabsCallbackDefault + 79;
            ICustomTabsCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                staticLayout.getPaint();
                throw null;
            }
            TextPaint paint2 = staticLayout.getPaint();
            if (paint2 != null) {
                int i3 = ICustomTabsCallbackDefault + 107;
                ICustomTabsCallbackStub = i3 % 128;
                if (i3 % 2 != 0) {
                    paint2.setAlpha((int) (f % 255.0f));
                } else {
                    paint2.setAlpha((int) (f * 255.0f));
                }
                int i4 = ICustomTabsCallbackStub + 89;
                ICustomTabsCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        invalidate();
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsTooltipV1View tdsTooltipV1View = (TdsTooltipV1View) objArr[0];
        CharSequence charSequence = (CharSequence) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 119;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setDnsokhttp setdnsokhttp = tdsTooltipV1View.onRelationshipValidationResult;
        Context context = tdsTooltipV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        CharSequence charSequenceOnExtraCallbackWithResult = ConnectionSpec.onExtraCallbackWithResult(charSequence, setdnsokhttp.resolve(context, tdsTooltipV1View.IAuthTabCallbackStub().getTextSize()));
        int i4 = ICustomTabsCallbackDefault + 107;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceOnExtraCallbackWithResult;
    }

    private final Path onNavigationEvent(int i, int i2, IAuthTabCallback iAuthTabCallback, float f, float f2) {
        Pair pairIAuthTabCallback;
        float f3;
        Float fValueOf;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i3 = 2 % 2;
        Float fValueOf2 = Float.valueOf(0.0f);
        if (this.onActivityResized != onExtraCallback.NONE && iAuthTabCallback.isVertical()) {
            int i4 = ICustomTabsCallbackStub + 91;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return onExtraCallbackWithResult(i, i2, iAuthTabCallback);
        }
        float balloonRadiusDip = this.onActivityLayout.getBalloonRadiusDip();
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(balloonRadiusDip), displayMetrics);
        float tailWidthDip = this.onActivityLayout.getTailWidthDip();
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        float fOnNavigationEvent2 = varyMatches.onNavigationEvent(Float.valueOf(tailWidthDip), displayMetrics2);
        float tailHeightDip = this.onActivityLayout.getTailHeightDip();
        DisplayMetrics displayMetrics3 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        float fOnNavigationEvent3 = varyMatches.onNavigationEvent(Float.valueOf(tailHeightDip), displayMetrics3);
        float f12 = i;
        float f13 = fOnNavigationEvent * 2.0f;
        float f14 = f12 - f13;
        int i6 = i2;
        float f15 = i6;
        float f16 = f15 - f13;
        if (iAuthTabCallback.isVertical()) {
            i6 = i;
        }
        float f17 = i6;
        float f18 = f17 - f13;
        if (f18 < fOnNavigationEvent2) {
            int i7 = ICustomTabsCallbackDefault + 103;
            ICustomTabsCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            fOnNavigationEvent2 = f18;
        }
        float f19 = fOnNavigationEvent2 / 2.0f;
        float fAtan = (float) Math.atan(fOnNavigationEvent3 / f19);
        float fAbs = Math.abs(this.onMessageChannelReady / ((float) Math.tan((180.0f - fAtan) / 2.0f)));
        if (iAuthTabCallback.isHorizontal()) {
            int i9 = ICustomTabsCallbackDefault + 105;
            ICustomTabsCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            double d = fAtan;
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(((float) Math.sin(d)) * fAbs), Float.valueOf(((float) Math.cos(d)) * fAbs));
        } else {
            double d2 = fAtan;
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(((float) Math.cos(d2)) * fAbs), Float.valueOf(((float) Math.sin(d2)) * fAbs));
        }
        float fFloatValue = ((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).floatValue();
        float fFloatValue2 = ((Number) pairIAuthTabCallback.IAuthTabCallback()).floatValue();
        float fCoerceIn = !(iAuthTabCallback.isVertical() ^ true) ? (f12 / 2.0f) - f19 : (f15 / 2.0f) - f19;
        if (f >= 0.0f) {
            int i11 = ICustomTabsCallbackStub;
            int i12 = i11 + 113;
            ICustomTabsCallbackDefault = i12 % 128;
            int i13 = i12 % 2;
            float f20 = this.IAuthTabCallbackStub ? (f17 - fOnNavigationEvent2) - f : f;
            if (f18 >= fCoerceIn) {
                int i14 = i11 + 85;
                ICustomTabsCallbackDefault = i14 % 128;
                fCoerceIn = i14 % 2 == 0 ? (f17 + fOnNavigationEvent) / fOnNavigationEvent2 : (f17 - fOnNavigationEvent) - fOnNavigationEvent2;
            }
            fCoerceIn = RangesKt___RangesKt.coerceIn(f20, Math.min(fOnNavigationEvent, fCoerceIn), Math.max(fOnNavigationEvent, fCoerceIn));
        }
        if (f2 != 0.0f) {
            fCoerceIn = RangesKt___RangesKt.coerceIn(!iAuthTabCallback.isVertical() ? fCoerceIn + f2 : fCoerceIn - f2, fOnNavigationEvent, (f17 - fOnNavigationEvent) - fOnNavigationEvent2);
        }
        float f21 = (fCoerceIn - fOnNavigationEvent) - fAbs;
        float f22 = this.ICustomTabsCallbackStubProxy;
        float f23 = (f19 - fFloatValue) - f22;
        float f24 = -fFloatValue2;
        float f25 = fOnNavigationEvent3 - fFloatValue2;
        float f26 = -(f25 - f22);
        float f27 = -f22;
        float f28 = f21 + fAbs + fFloatValue + f23 + f22 + f22 + f23 + fFloatValue + fAbs;
        if (iAuthTabCallback.isVertical()) {
            int i15 = ICustomTabsCallbackDefault + 99;
            f3 = fFloatValue2;
            ICustomTabsCallbackStub = i15 % 128;
            int i16 = i15 % 2;
            Float fValueOf3 = Float.valueOf(fOnNavigationEvent);
            int i17 = ICustomTabsCallbackStub + 5;
            ICustomTabsCallbackDefault = i17 % 128;
            int i18 = i17 % 2;
            fValueOf = fValueOf3;
        } else {
            f3 = fFloatValue2;
            fValueOf = Float.valueOf(fOnNavigationEvent);
        }
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(fValueOf, fValueOf2);
        float fFloatValue3 = ((Number) pairIAuthTabCallback2.onExtraCallbackWithResult()).floatValue();
        float fFloatValue4 = ((Number) pairIAuthTabCallback2.IAuthTabCallback()).floatValue();
        Path path = new Path();
        path.moveTo(((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue() + fFloatValue3, ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue() + fFloatValue4);
        if (iAuthTabCallback == IAuthTabCallback.TOP) {
            f5 = 0.0f;
            path.rLineTo(f21, 0.0f);
            f4 = f25;
            float f29 = fAbs + fFloatValue;
            path.rQuadTo(fAbs, 0.0f, f29, f24);
            path.rLineTo(f23, f26);
            path.rQuadTo(f22, f27, f22 + f22, 0.0f);
            path.rLineTo(f23, -f26);
            float f30 = -f24;
            path.rQuadTo(fFloatValue, f30, f29, f30);
            path.rLineTo(f14 - f28, 0.0f);
        } else {
            f4 = f25;
            f5 = 0.0f;
            path.rLineTo(f14, 0.0f);
        }
        path.rQuadTo(fOnNavigationEvent, f5, fOnNavigationEvent, fOnNavigationEvent);
        if (iAuthTabCallback == IAuthTabCallback.RIGHT) {
            path.rLineTo(f5, f21);
            float f31 = fAbs + fFloatValue;
            path.rQuadTo(f5, fAbs, -f24, f31);
            path.rLineTo(-f26, f23);
            f6 = f14;
            path.rQuadTo(-f27, f22, f5, f22 + f22);
            path.rLineTo(f26, f23);
            path.rQuadTo(f24, fFloatValue, f24, f31);
            path.rLineTo(f5, f16 - f28);
            f7 = f16;
        } else {
            f6 = f14;
            f7 = f16;
            path.rLineTo(f5, f7);
        }
        float f32 = -fOnNavigationEvent;
        path.rQuadTo(f5, fOnNavigationEvent, f32, fOnNavigationEvent);
        if (iAuthTabCallback == IAuthTabCallback.BOTTOM) {
            path.rLineTo(-f21, f5);
            float f33 = -fAbs;
            float f34 = -(fAbs + fFloatValue);
            f9 = fOnNavigationEvent;
            f8 = f7;
            path.rQuadTo(f33, 0.0f, f34, -f24);
            float f35 = -f23;
            path.rLineTo(f35, -f26);
            f10 = f23;
            f11 = 0.0f;
            path.rQuadTo(f27, -f27, -(f22 + f22), 0.0f);
            path.rLineTo(f35, f26);
            path.rQuadTo(f33, f24, f34, f24);
            path.rLineTo(-(f6 - f28), 0.0f);
        } else {
            f8 = f7;
            f9 = fOnNavigationEvent;
            f10 = f23;
            f11 = f5;
            path.rLineTo(-f6, f11);
        }
        path.rQuadTo(f32, f11, f32, f32);
        if (iAuthTabCallback == IAuthTabCallback.LEFT) {
            path.rLineTo(f11, -f21);
            float f36 = -(fAbs + fFloatValue);
            path.rQuadTo(f11, -fAbs, f24, f36);
            float f37 = -f10;
            path.rLineTo(-(f4 - this.ICustomTabsCallbackStubProxy), f37);
            float f38 = -this.ICustomTabsCallbackStubProxy;
            path.rQuadTo(f38, f38, f11, f38 * 2.0f);
            path.rLineTo(f4 - this.ICustomTabsCallbackStubProxy, f37);
            float f39 = f3;
            path.rQuadTo(f39, -fFloatValue, f39, f36);
            path.rLineTo(f11, -(f8 - f28));
        } else {
            path.rLineTo(f11, -f8);
        }
        path.rQuadTo(f11, f32, f9, f32);
        path.close();
        return path;
    }

    private final void asInterface() {
        Float fValueOf;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 61;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 29) {
            Paint paintIAuthTabCallbackStub = IAuthTabCallbackStub();
            CharSequence charSequence = this.onUnminimized;
            paintIAuthTabCallbackStub.getTextBounds(charSequence, 0, charSequence.length(), this.access000);
        } else {
            IAuthTabCallbackStub().getTextBounds(this.onUnminimized.toString(), 0, this.onUnminimized.length(), this.access000);
        }
        float f = this.extraCallback;
        Iterator it = StringsKt__StringsKt.split$default(this.onUnminimized, new String[]{"\n"}, false, 0, 6, (Object) null).iterator();
        Object obj = null;
        if (!it.hasNext()) {
            int i4 = ICustomTabsCallbackStub + 29;
            ICustomTabsCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            fValueOf = null;
        } else {
            float fMeasureText = IAuthTabCallbackStub().measureText((String) it.next());
            while (!(!it.hasNext())) {
                int i5 = ICustomTabsCallbackStub + 35;
                ICustomTabsCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                fMeasureText = Math.max(fMeasureText, IAuthTabCallbackStub().measureText((String) it.next()));
            }
            fValueOf = Float.valueOf(fMeasureText);
        }
        float fMin = Math.min(f, fValueOf != null ? fValueOf.floatValue() : 0.0f);
        int fontMetricsInt = IAuthTabCallbackStub().getFontMetricsInt(null);
        int iIAuthTabCallback = varyMatches.IAuthTabCallback(this, Float.valueOf(this.onActivityLayout.calculateLineHeight(this)));
        CharSequence charSequence2 = this.onUnminimized;
        this.access100 = StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), new TextPaint(IAuthTabCallbackStub()), (int) fMin).setAlignment(this.onNavigationEvent).setLineSpacing(iIAuthTabCallback - fontMetricsInt, 1.0f).setIncludePad(true).build();
    }

    private final SizeF IAuthTabCallbackDefault() {
        int width;
        int height;
        int i = 2 % 2;
        StaticLayout staticLayout = this.access100;
        int width2 = 0;
        if (staticLayout != null) {
            width = staticLayout.getWidth();
        } else {
            int i2 = ICustomTabsCallbackDefault + 107;
            ICustomTabsCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            width = 0;
        }
        StaticLayout staticLayout2 = this.access100;
        if (staticLayout2 != null) {
            height = staticLayout2.getHeight();
        } else {
            int i4 = ICustomTabsCallbackStub + 43;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            height = 0;
        }
        Bitmap bitmap = this.IAuthTabCallbackDefault;
        if (bitmap != null) {
            int i6 = ICustomTabsCallbackStub + 101;
            ICustomTabsCallbackDefault = i6 % 128;
            if (i6 % 2 == 0) {
                bitmap.getWidth();
                throw null;
            }
            width2 = bitmap.getWidth();
            int i7 = ICustomTabsCallbackDefault + 41;
            ICustomTabsCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        }
        float horizontalPaddingDip = this.onActivityLayout.getHorizontalPaddingDip();
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(horizontalPaddingDip), displayMetrics);
        float verticalPaddingDip = this.onActivityLayout.getVerticalPaddingDip();
        Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
        return new SizeF(width + width2 + (iOnNavigationEvent << 1), height + (varyMatches.onNavigationEvent(Float.valueOf(verticalPaddingDip), r6) * 2.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Path onExtraCallbackWithResult(int i, int i2, IAuthTabCallback iAuthTabCallback) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        int i3 = 2 % 2;
        float balloonRadiusDip = this.onActivityLayout.getBalloonRadiusDip();
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(balloonRadiusDip), displayMetrics);
        float clippedTailWidthDip = this.onActivityLayout.getClippedTailWidthDip();
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        float fOnNavigationEvent2 = varyMatches.onNavigationEvent(Float.valueOf(clippedTailWidthDip), displayMetrics2);
        float clippedTailHeightDip = this.onActivityLayout.getClippedTailHeightDip();
        DisplayMetrics displayMetrics3 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        float fOnNavigationEvent3 = varyMatches.onNavigationEvent(Float.valueOf(clippedTailHeightDip), displayMetrics3);
        float clippedTailHeightDip2 = this.onActivityLayout.getClippedTailHeightDip() / 2.0f;
        DisplayMetrics displayMetrics4 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        float fOnNavigationEvent4 = varyMatches.onNavigationEvent(Float.valueOf(clippedTailHeightDip2), displayMetrics4);
        float clippedTailWidthDip2 = this.onActivityLayout.getClippedTailWidthDip();
        Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
        float fOnNavigationEvent5 = varyMatches.onNavigationEvent(Float.valueOf(clippedTailWidthDip2), r12) / 9.0f;
        float clippedTailWidthDip3 = this.onActivityLayout.getClippedTailWidthDip() / 3.5f;
        DisplayMetrics displayMetrics5 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
        float fOnNavigationEvent6 = varyMatches.onNavigationEvent(Float.valueOf(clippedTailWidthDip3), displayMetrics5);
        DisplayMetrics displayMetrics6 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
        float fOnNavigationEvent7 = varyMatches.onNavigationEvent(2, displayMetrics6);
        DisplayMetrics displayMetrics7 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
        float fOnNavigationEvent8 = varyMatches.onNavigationEvent(1, displayMetrics7);
        float f14 = (fOnNavigationEvent2 - fOnNavigationEvent4) - fOnNavigationEvent6;
        float f15 = ((fOnNavigationEvent3 - fOnNavigationEvent5) - fOnNavigationEvent7) + fOnNavigationEvent8;
        float f16 = i;
        float f17 = 2.0f * fOnNavigationEvent;
        float f18 = f16 - f17;
        float f19 = i2;
        float f20 = f19 - f17;
        Path path = new Path();
        if (this.onActivityResized == onExtraCallback.LEFT) {
            int i4 = ICustomTabsCallbackDefault + 105;
            ICustomTabsCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 95 / 0;
                if (iAuthTabCallback == IAuthTabCallback.TOP) {
                    int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                    float fFloatValue = ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue();
                    int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                    path.moveTo(fFloatValue, ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue());
                    path.rLineTo(0.0f, (-fOnNavigationEvent3) + fOnNavigationEvent7);
                    float f21 = -fOnNavigationEvent7;
                    float f22 = -fOnNavigationEvent8;
                    f4 = f15;
                    f12 = fOnNavigationEvent3;
                    f7 = f14;
                    f = fOnNavigationEvent8;
                    f2 = fOnNavigationEvent7;
                    path.rCubicTo(0.05f * fOnNavigationEvent6, f21 * 1.1f, fOnNavigationEvent6 * 0.6f, f21 * 1.6f, fOnNavigationEvent6, f22);
                    path.rLineTo(f7, f4);
                    path.rQuadTo(fOnNavigationEvent4 * 0.2f, fOnNavigationEvent5 * 0.7f, fOnNavigationEvent4, fOnNavigationEvent5);
                    path.rLineTo((f16 - fOnNavigationEvent) - fOnNavigationEvent2, 0.0f);
                    path.rQuadTo(fOnNavigationEvent, 0.0f, fOnNavigationEvent, fOnNavigationEvent);
                    path.rLineTo(0.0f, f20);
                    float f23 = -fOnNavigationEvent;
                    path.rQuadTo(0.0f, fOnNavigationEvent, f23, fOnNavigationEvent);
                    f5 = f16;
                    f13 = f18;
                    path.rLineTo(-f13, 0.0f);
                    path.rQuadTo(f23, 0.0f, f23, f23);
                    path.rLineTo(0.0f, (-i2) + fOnNavigationEvent);
                    int i6 = ICustomTabsCallbackDefault + 65;
                    ICustomTabsCallbackStub = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    f = fOnNavigationEvent8;
                    f12 = fOnNavigationEvent3;
                    f2 = fOnNavigationEvent7;
                    f4 = f15;
                    f7 = f14;
                    f13 = f18;
                    f5 = f16;
                }
            } else if (iAuthTabCallback == IAuthTabCallback.TOP) {
            }
            if (iAuthTabCallback == IAuthTabCallback.BOTTOM) {
                int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                float fFloatValue2 = ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue() + fOnNavigationEvent;
                int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                path.moveTo(fFloatValue2, ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback4, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue());
                path.rLineTo(f13, 0.0f);
                path.rQuadTo(fOnNavigationEvent, 0.0f, fOnNavigationEvent, fOnNavigationEvent);
                path.rLineTo(0.0f, f20);
                float f24 = -fOnNavigationEvent;
                path.rQuadTo(0.0f, fOnNavigationEvent, f24, fOnNavigationEvent);
                f18 = f13;
                path.rLineTo((-i) + fOnNavigationEvent + fOnNavigationEvent2, 0.0f);
                float f25 = -fOnNavigationEvent4;
                path.rQuadTo(f25 * 0.8f, fOnNavigationEvent5 * 0.3f, f25, fOnNavigationEvent5);
                path.rLineTo(-f7, f4);
                float f26 = -fOnNavigationEvent6;
                float f27 = f2 * 1.3f;
                path.rCubicTo(f26 * 0.4f, f27, f26 * 0.95f, f27, f26, -f);
                f6 = f12;
                f3 = 0.0f;
                path.rLineTo(0.0f, (-f6) + f2);
                path.rLineTo(0.0f, (-i2) + fOnNavigationEvent);
                path.rQuadTo(0.0f, f24, fOnNavigationEvent, f24);
            } else {
                f18 = f13;
                f6 = f12;
                f3 = 0.0f;
            }
        } else {
            f = fOnNavigationEvent8;
            f2 = fOnNavigationEvent7;
            f3 = 0.0f;
            f4 = f15;
            f5 = f16;
            f6 = fOnNavigationEvent3;
            f7 = f14;
        }
        int i8 = ICustomTabsCallbackDefault + 61;
        ICustomTabsCallbackStub = i8 % 128;
        if (i8 % 2 != 0) {
            onExtraCallback onextracallback = onExtraCallback.RIGHT;
            throw null;
        }
        if (this.onActivityResized == onExtraCallback.RIGHT) {
            if (iAuthTabCallback == IAuthTabCallback.TOP) {
                int i9 = ICustomTabsCallbackStub + 25;
                ICustomTabsCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                int iOnExtraCallback5 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                float fFloatValue3 = ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback5, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue() + fOnNavigationEvent;
                int iOnExtraCallback6 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                path.moveTo(fFloatValue3, ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback6, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue());
                path.rLineTo((f5 - fOnNavigationEvent) - fOnNavigationEvent2, f3);
                float f28 = -fOnNavigationEvent5;
                path.rQuadTo(fOnNavigationEvent4 * 0.8f, f28 * 0.3f, fOnNavigationEvent4, f28);
                path.rLineTo(f7, -f4);
                float f29 = -f2;
                float f30 = f29 * 1.3f;
                f10 = f18;
                f8 = fOnNavigationEvent2;
                f11 = f;
                f9 = 0.0f;
                path.rCubicTo(fOnNavigationEvent6 * 0.39999998f, f30, fOnNavigationEvent6 * 0.95f, f30, fOnNavigationEvent6, f11);
                path.rLineTo(0.0f, ((f29 + f6) + f19) - fOnNavigationEvent);
                float f31 = -fOnNavigationEvent;
                path.rQuadTo(0.0f, fOnNavigationEvent, f31, fOnNavigationEvent);
                path.rLineTo(-f10, 0.0f);
                path.rQuadTo(f31, 0.0f, f31, f31);
                path.rLineTo(0.0f, -f20);
                path.rQuadTo(0.0f, f31, fOnNavigationEvent, f31);
            } else {
                f8 = fOnNavigationEvent2;
                f9 = f3;
                f10 = f18;
                f11 = f;
            }
            if (iAuthTabCallback == IAuthTabCallback.BOTTOM) {
                int iOnExtraCallback7 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                float fFloatValue4 = ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback7, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue() + fOnNavigationEvent;
                int iOnExtraCallback8 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                path.moveTo(fFloatValue4, ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback8, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue());
                path.rLineTo(f10, f9);
                path.rQuadTo(fOnNavigationEvent, f9, fOnNavigationEvent, fOnNavigationEvent);
                path.rLineTo(f9, f20 + fOnNavigationEvent);
                path.rLineTo(f9, f6 - f2);
                float f32 = -fOnNavigationEvent6;
                path.rCubicTo(f32 * 0.050000012f, f2 * 1.6f, f32 * 0.6f, f2 * 1.1f, f32, f11);
                path.rLineTo(-f7, -f4);
                float f33 = -fOnNavigationEvent4;
                float f34 = -fOnNavigationEvent5;
                path.rQuadTo(f33 * 0.2f, f34 * 0.7f, f33, f34);
                float f35 = f9;
                path.rLineTo((-i) + fOnNavigationEvent + f8, f35);
                float f36 = -fOnNavigationEvent;
                path.rQuadTo(f36, f35, f36, f36);
                path.rLineTo(f35, -f20);
                path.rQuadTo(f35, f36, fOnNavigationEvent, f36);
            }
        }
        path.close();
        return path;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsTooltipV1View tdsTooltipV1View = (TdsTooltipV1View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 123;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            float balloonRadiusDip = tdsTooltipV1View.onActivityLayout.getBalloonRadiusDip();
            DisplayMetrics displayMetrics = tdsTooltipV1View.getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            varyMatches.onNavigationEvent(Float.valueOf(balloonRadiusDip), displayMetrics);
            throw null;
        }
        float balloonRadiusDip2 = tdsTooltipV1View.onActivityLayout.getBalloonRadiusDip();
        DisplayMetrics displayMetrics2 = tdsTooltipV1View.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(balloonRadiusDip2), displayMetrics2);
        int i3 = ICustomTabsCallbackStub + 83;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return Integer.valueOf(iOnNavigationEvent);
        }
        throw null;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 113;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            float tailWidthDip = this.onActivityLayout.getTailWidthDip();
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            return varyMatches.onNavigationEvent(Float.valueOf(tailWidthDip), displayMetrics);
        }
        float tailWidthDip2 = this.onActivityLayout.getTailWidthDip();
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(tailWidthDip2), displayMetrics2);
        int i3 = 38 / 0;
        return iOnNavigationEvent;
    }

    public final float onExtraCallback() {
        float fFloatValue;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 107;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            fFloatValue = ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3)).floatValue();
            int i3 = 66 / 0;
        } else {
            int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback5 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback6 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            fFloatValue = ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, iOnExtraCallback5, iOnExtraCallback4, iOnExtraCallback6)).floatValue();
        }
        int i4 = ICustomTabsCallbackDefault + 27;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsTooltipV1View tdsTooltipV1View = (TdsTooltipV1View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 93;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        float measuredWidth = tdsTooltipV1View.getMeasuredWidth();
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        float fFloatValue = measuredWidth - (((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{tdsTooltipV1View}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue() * 2.0f);
        int i4 = ICustomTabsCallbackDefault + 63;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return Float.valueOf(fFloatValue);
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 37;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        float fFloatValue = ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, 951127687, -951127685, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        float fIntValue = fFloatValue - (((Integer) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, 2004341969, -2004341966, iOnExtraCallback3, iOnExtraCallback2, iOnExtraCallback4)).intValue() << 1);
        int i4 = ICustomTabsCallbackStub + 81;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return fIntValue;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        SizeF sizeF = this.onWarmupCompleted;
        if (sizeF == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            sizeF = null;
        }
        float height = sizeF.getHeight();
        if (this.asInterface) {
            Path path = this.ICustomTabsCallback;
            if (path == null) {
                int i2 = ICustomTabsCallbackDefault + 39;
                ICustomTabsCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i4 = ICustomTabsCallbackStub + 99;
                ICustomTabsCallbackDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 4;
                }
                path = null;
            }
            canvas.drawPath(path, this.getInterfaceDescriptor);
        }
        Path path2 = this.IAuthTabCallback;
        if (path2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            path2 = null;
        }
        canvas.drawPath(path2, this.onTransact);
        Path path3 = this.IAuthTabCallback;
        if (path3 == null) {
            int i6 = ICustomTabsCallbackDefault + 55;
            ICustomTabsCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            path3 = null;
        }
        canvas.drawPath(path3, this.IAuthTabCallback_Parcel);
        float horizontalPaddingDip = this.onActivityLayout.getHorizontalPaddingDip();
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(horizontalPaddingDip), displayMetrics);
        float verticalPaddingDip = this.onActivityLayout.getVerticalPaddingDip();
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(Float.valueOf(verticalPaddingDip), displayMetrics2);
        Bitmap bitmap = this.IAuthTabCallbackDefault;
        if (bitmap != null) {
            int i8 = ICustomTabsCallbackStub + 11;
            ICustomTabsCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback5 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            canvas.drawBitmap(bitmap, ((Float) onWarmupCompleted(iOnExtraCallback4, new Object[]{this}, -1390908505, 1390908509, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3)).floatValue() + (iOnNavigationEvent / 2), (((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback5, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue() + (height / 2.0f)) - (bitmap.getHeight() / 2.0f), (Paint) null);
        }
        int iSave = canvas.save();
        try {
            Bitmap bitmap2 = this.IAuthTabCallbackDefault;
            int width = bitmap2 != null ? bitmap2.getWidth() : 0;
            canvas.translate(((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue() + width + iOnNavigationEvent, ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).floatValue() + iOnNavigationEvent2);
            StaticLayout staticLayout = this.access100;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    private final CharSequence onExtraCallbackWithResult(CharSequence charSequence) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (CharSequence) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, charSequence}, -1956599812, 1956599812, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
    }

    private final float onTransact() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -1390908505, 1390908509, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3)).floatValue();
    }

    private static final Unit IAuthTabCallbackStub(Function0 function0) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{function0}, 1093695380, -1093695379, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
    }

    public final float onWarmupCompleted() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Float) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, 951127687, -951127685, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3)).floatValue();
    }

    public final int IAuthTabCallback() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Integer) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, 2004341969, -2004341966, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3)).intValue();
    }
}

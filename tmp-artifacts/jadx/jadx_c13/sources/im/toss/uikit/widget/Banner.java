package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Player;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CommonModule_setSecureScreen;
import o.F_;
import o.JsonReaderUnknownNumberParsing;
import o.M_;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.hasVaryAll;
import o.readIntokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Banner extends TdsRoundLayout {
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private int onExtraCallback;
    private final F_ onExtraCallbackWithResult;
    private deserializeUriNullableCollection onNavigationEvent;
    private ExoPlayer onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Banner(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Banner(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(Banner banner) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(banner);
        int i4 = IAuthTabCallback + 97;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(th);
        int i4 = asInterface + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i5) | i);
        int i11 = i9 | i10 | (~(i | i6));
        int i12 = (~(i6 | i5)) | (~(i7 | i5));
        int i13 = i8 | i10;
        int i14 = i5 + i + i4 + (793188503 * i3) + (2090109681 * i2);
        int i15 = i14 * i14;
        int i16 = (837707615 * i5) + 1286602752 + ((-1676358574) * i) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i4) + (1186463744 * i3) + (1166540800 * i2) + ((-1956446208) * i15);
        int i17 = ((i5 * 1389925299) - 652765764) + (i * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i4 * 1389926445) + (i3 * (-1551828341)) + (i2 * (-2047638435)) + (i15 * 1214709760);
        int i18 = i16 + (i17 * i17 * 445972480);
        return i18 != 1 ? i18 != 2 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onNavigationEvent(1433728728, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted3, iOnWarmupCompleted2, -1433728727, iOnWarmupCompleted);
        int i4 = asInterface + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Banner banner, ExoPlayer exoPlayer) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(banner, exoPlayer);
        int i4 = asInterface + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0089 A[PHI: r7
      0x0089: PHI (r7v4 int) = (r7v3 int), (r7v32 int) binds: [B:12:0x0087, B:9:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[PHI: r7
      0x0092: PHI (r7v7 int) = (r7v3 int), (r7v32 int) binds: [B:12:0x0087, B:9:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Banner(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        ComponentActivity componentActivity;
        int index;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = 1;
        F_ f_OnExtraCallbackWithResult = F_.onExtraCallbackWithResult(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(f_OnExtraCallbackWithResult, "");
        this.onExtraCallbackWithResult = f_OnExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        setRadius(varyMatches.onNavigationEvent(Float.valueOf(12.0f), r2));
        f_OnExtraCallbackWithResult.onTransact.setTextSize(1, 19.0f);
        f_OnExtraCallbackWithResult.IAuthTabCallback.setTextSize(1, 15.0f);
        f_OnExtraCallbackWithResult.onExtraCallback.setTextSize(1, 15.0f);
        f_OnExtraCallbackWithResult.IAuthTabCallbackDefault.setTextSize(1, 16.0f);
        f_OnExtraCallbackWithResult.IAuthTabCallbackDefault.setPadding(0, 0, 0, 0);
        f_OnExtraCallbackWithResult.IAuthTabCallbackDefault.setEnabled(false);
        Object obj = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Banner);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (i2 < indexCount) {
                int i3 = IAuthTabCallback + 53;
                asInterface = i3 % 128;
                if (i3 % 2 == 0) {
                    index = typedArrayObtainStyledAttributes.getIndex(i2);
                    int i4 = 28 / 0;
                    if (index == R.styleable.Banner_title) {
                        setTitle(typedArrayObtainStyledAttributes.getString(index));
                    } else if (index == R.styleable.Banner_titleColor) {
                        setTitleColor(typedArrayObtainStyledAttributes.getColorStateList(index));
                    } else if (index == R.styleable.Banner_description1) {
                        setDescription1(typedArrayObtainStyledAttributes.getString(index));
                    } else if (index == R.styleable.Banner_description1Color) {
                        setDescription1Color(typedArrayObtainStyledAttributes.getColorStateList(index));
                    } else if (index == R.styleable.Banner_description2) {
                        setDescription2(typedArrayObtainStyledAttributes.getString(index));
                    } else {
                        if (index == R.styleable.Banner_description2Color) {
                            int i5 = asInterface + 23;
                            IAuthTabCallback = i5 % 128;
                            int i6 = i5 % 2;
                            setDescription2Color(typedArrayObtainStyledAttributes.getColorStateList(index));
                        } else if (index == R.styleable.Banner_textButton) {
                            int i7 = asInterface + 41;
                            IAuthTabCallback = i7 % 128;
                            if (i7 % 2 != 0) {
                                setTextButton(typedArrayObtainStyledAttributes.getString(index));
                                int i8 = 96 / 0;
                            } else {
                                setTextButton(typedArrayObtainStyledAttributes.getString(index));
                            }
                        } else if (index == R.styleable.Banner_image) {
                            setImage(typedArrayObtainStyledAttributes.getDrawable(index));
                        } else if (index == R.styleable.Banner_imageUrl) {
                            int i9 = IAuthTabCallback + 97;
                            asInterface = i9 % 128;
                            if (i9 % 2 == 0) {
                                setImageUrl(typedArrayObtainStyledAttributes.getString(index));
                                int i10 = 66 / 0;
                            } else {
                                setImageUrl(typedArrayObtainStyledAttributes.getString(index));
                            }
                        } else if (index == R.styleable.Banner_videoUrl) {
                            setVideoUrl(typedArrayObtainStyledAttributes.getString(index));
                        } else if (index == R.styleable.Banner_videoLoop) {
                            setVideoLoop(typedArrayObtainStyledAttributes.getBoolean(index, true));
                        } else if (index == R.styleable.Banner_icon) {
                            setIcon(typedArrayObtainStyledAttributes.getDrawable(index));
                        } else if (index == R.styleable.Banner_iconUrl) {
                            int i11 = asInterface + 21;
                            IAuthTabCallback = i11 % 128;
                            if (i11 % 2 != 0) {
                                setIconUrl(typedArrayObtainStyledAttributes.getString(index));
                                obj.hashCode();
                                throw null;
                            }
                            setIconUrl(typedArrayObtainStyledAttributes.getString(index));
                        } else if (index == R.styleable.Banner_backgroundColor) {
                            int i12 = IAuthTabCallback + 83;
                            asInterface = i12 % 128;
                            int i13 = i12 % 2;
                            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(index);
                            if (colorStateList != null) {
                                setBackgroundColor(colorStateList);
                            } else {
                                setBackgroundColor(typedArrayObtainStyledAttributes.getColor(index, 255));
                            }
                        } else if (index == R.styleable.Banner_smallTitle) {
                            this.onExtraCallbackWithResult.onTransact.setTextSize(1, typedArrayObtainStyledAttributes.getBoolean(index, false) ? 17.0f : 19.0f);
                        }
                        int i14 = 2 % 2;
                    }
                } else {
                    index = typedArrayObtainStyledAttributes.getIndex(i2);
                    if (index == R.styleable.Banner_title) {
                    }
                }
                i2++;
                int i15 = 2 % 2;
            }
            ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(R.styleable.Banner_textButtonColor);
            if (colorStateList2 == null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                colorStateList2 = ColorStateList.valueOf(new getUrlokhttp(new onNavigationEvent(configuration)).requestPostMessageChannel().onMinimized());
                Intrinsics.checkNotNullExpressionValue(colorStateList2, "");
            }
            setTextButtonColor(colorStateList2);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode() && this.onExtraCallbackWithResult.onTransact.length() == 0) {
            int i16 = IAuthTabCallback + 125;
            asInterface = i16 % 128;
            if (i16 % 2 == 0) {
                this.onExtraCallbackWithResult.IAuthTabCallback.length();
                throw null;
            }
            if (this.onExtraCallbackWithResult.IAuthTabCallback.length() == 0) {
                int i17 = asInterface + 19;
                IAuthTabCallback = i17 % 128;
                if (i17 % 2 != 0) {
                    this.onExtraCallbackWithResult.onExtraCallback.length();
                    throw null;
                }
                if (this.onExtraCallbackWithResult.onExtraCallback.length() == 0 && this.onExtraCallbackWithResult.IAuthTabCallbackDefault.length() == 0) {
                    this.onExtraCallbackWithResult.onTransact.setText("TITLE");
                    this.onExtraCallbackWithResult.IAuthTabCallback.setText("DESCRIPTION1");
                    this.onExtraCallbackWithResult.onExtraCallback.setText("DESCRIPTION2");
                    this.onExtraCallbackWithResult.IAuthTabCallbackDefault.setText("TEXT BUTTON");
                    this.onExtraCallbackWithResult.onTransact.setVisibility(0);
                    this.onExtraCallbackWithResult.IAuthTabCallback.setVisibility(0);
                    this.onExtraCallbackWithResult.onExtraCallback.setVisibility(0);
                    this.onExtraCallbackWithResult.IAuthTabCallbackDefault.setVisibility(0);
                    Typography6 typography6 = this.onExtraCallbackWithResult.onExtraCallback;
                    ViewGroup.LayoutParams layoutParams = typography6.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "");
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
                    typography6.setLayoutParams(layoutParams);
                }
            }
        }
        ComponentActivity componentActivityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (!(componentActivityIAuthTabCallback instanceof ComponentActivity)) {
            int i18 = 2 % 2;
            componentActivity = null;
        } else {
            int i19 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i19 % 128;
            int i20 = i19 % 2;
            componentActivity = componentActivityIAuthTabCallback;
        }
        if (componentActivity != null) {
            int i21 = IAuthTabCallback + 101;
            asInterface = i21 % 128;
            if (i21 % 2 == 0) {
                componentActivity.getLifecycle();
                throw null;
            }
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = componentActivity.getLifecycle();
            if (lifecycle != null) {
                lifecycle.IAuthTabCallback(new DefaultLifecycleObserver() { // from class: im.toss.uikit.widget.Banner.3
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                        int i22 = 2 % 2;
                        int i23 = IAuthTabCallback + 81;
                        onExtraCallbackWithResult = i23 % 128;
                        int i24 = i23 % 2;
                        super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                        if (i24 != 0) {
                            throw null;
                        }
                        int i25 = onExtraCallbackWithResult + 95;
                        IAuthTabCallback = i25 % 128;
                        if (i25 % 2 == 0) {
                            int i26 = 95 / 0;
                        }
                    }

                    public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                        int i22 = 2 % 2;
                        int i23 = IAuthTabCallback + 29;
                        onExtraCallbackWithResult = i23 % 128;
                        int i24 = i23 % 2;
                        Object obj2 = null;
                        super.onPause(textFieldScrollKtExternalSyntheticLambda0);
                        if (i24 != 0) {
                            throw null;
                        }
                        int i25 = IAuthTabCallback + 75;
                        onExtraCallbackWithResult = i25 % 128;
                        if (i25 % 2 == 0) {
                            return;
                        }
                        obj2.hashCode();
                        throw null;
                    }

                    public /* bridge */ void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                        int i22 = 2 % 2;
                        int i23 = IAuthTabCallback + 97;
                        onExtraCallbackWithResult = i23 % 128;
                        int i24 = i23 % 2;
                        super.onResume(textFieldScrollKtExternalSyntheticLambda0);
                        int i25 = onExtraCallbackWithResult + 41;
                        IAuthTabCallback = i25 % 128;
                        int i26 = i25 % 2;
                    }

                    public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                        int i22 = 2 % 2;
                        int i23 = onExtraCallbackWithResult + 65;
                        IAuthTabCallback = i23 % 128;
                        int i24 = i23 % 2;
                        super.onStart(textFieldScrollKtExternalSyntheticLambda0);
                        if (i24 == 0) {
                            throw null;
                        }
                        int i25 = onExtraCallbackWithResult + 37;
                        IAuthTabCallback = i25 % 128;
                        int i26 = i25 % 2;
                    }

                    public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                        int i22 = 2 % 2;
                        int i23 = onExtraCallbackWithResult + 39;
                        IAuthTabCallback = i23 % 128;
                        int i24 = i23 % 2;
                        super.onStop(textFieldScrollKtExternalSyntheticLambda0);
                        if (i24 == 0) {
                            throw null;
                        }
                        int i25 = IAuthTabCallback + 19;
                        onExtraCallbackWithResult = i25 % 128;
                        if (i25 % 2 != 0) {
                            throw null;
                        }
                    }

                    public void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                        int i22 = 2 % 2;
                        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                        super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = Banner.onNavigationEvent(Banner.this);
                        if (deserializeurinullablecollectionOnNavigationEvent != null) {
                            int i23 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                            onExtraCallbackWithResult = i23 % 128;
                            int i24 = i23 % 2;
                            deserializeurinullablecollectionOnNavigationEvent.dispose();
                            int i25 = onExtraCallbackWithResult + 53;
                            IAuthTabCallback = i25 % 128;
                            int i26 = i25 % 2;
                        }
                    }
                });
            }
        }
    }

    public static final /* synthetic */ deserializeUriNullableCollection onNavigationEvent(Banner banner) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollection = banner.onNavigationEvent;
        if (i3 == 0) {
            return deserializeurinullablecollection;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Banner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback + 69;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = asInterface + 3;
            IAuthTabCallback = i6 % 128;
            i = i6 % 2 != 0 ? 1 : 0;
        }
        this(context, attributeSet, i);
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onNavigationEvent(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onExtraCallback + 83;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTitle(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setTitle(getResources().getString(i));
        int i5 = asInterface + 89;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
    }

    public final void setTitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Typography4 typography4 = this.onExtraCallbackWithResult.onTransact;
        if (i3 != 0) {
            typography4.setText(charSequence);
        } else {
            typography4.setText(charSequence);
            throw null;
        }
    }

    public final void setTitleColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        if (colorStateList != null) {
            int i2 = IAuthTabCallback + 119;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.onTransact.setTextColor(colorStateList);
            int i4 = asInterface + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setTitleColor(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            this.onExtraCallbackWithResult.onTransact.setTextColor(i);
            throw null;
        }
        this.onExtraCallbackWithResult.onTransact.setTextColor(i);
        int i4 = asInterface + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setDescription1(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 71;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            setDescription1(getResources().getString(i));
            int i4 = 57 / 0;
        } else {
            setDescription1(getResources().getString(i));
        }
        int i5 = asInterface + 1;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDescription1(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback.setText(charSequence);
        if (this.onExtraCallbackWithResult.IAuthTabCallback.length() != 0) {
            this.onExtraCallbackWithResult.IAuthTabCallback.setVisibility(0);
            this.onExtraCallbackWithResult.onExtraCallback.setVisibility(8);
            this.onExtraCallbackWithResult.IAuthTabCallbackDefault.setVisibility(8);
            int i2 = IAuthTabCallback + 87;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i3 = asInterface + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback.setVisibility(8);
    }

    public final void setDescription1Color(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 15;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (colorStateList != null) {
            int i5 = i2 + 105;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            this.onExtraCallbackWithResult.IAuthTabCallback.setTextColor(colorStateList);
        }
    }

    public final void setDescription1Color(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback.setTextColor(i);
        int i5 = IAuthTabCallback + 41;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setDescription2(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        setDescription2(getResources().getString(i));
        int i5 = IAuthTabCallback + 45;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setDescription2(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallbackWithResult.onExtraCallback.setText(charSequence);
            this.onExtraCallbackWithResult.onExtraCallback.length();
            throw null;
        }
        this.onExtraCallbackWithResult.onExtraCallback.setText(charSequence);
        if (this.onExtraCallbackWithResult.onExtraCallback.length() == 0) {
            this.onExtraCallbackWithResult.onExtraCallback.setVisibility(8);
            if (this.onExtraCallbackWithResult.IAuthTabCallbackDefault.getVisibility() == 8) {
                this.onExtraCallbackWithResult.onNavigationEvent.setVisibility(8);
            }
            int i3 = IAuthTabCallback + 15;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onExtraCallbackWithResult.onNavigationEvent.setVisibility(0);
        this.onExtraCallbackWithResult.onExtraCallback.setVisibility(0);
        this.onExtraCallbackWithResult.IAuthTabCallback.setVisibility(8);
        this.onExtraCallbackWithResult.IAuthTabCallbackDefault.setVisibility(8);
        int i5 = asInterface + 51;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setDescription2Color(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        if (colorStateList != null) {
            int i2 = IAuthTabCallback + 21;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.onExtraCallback.setTextColor(colorStateList);
        }
        int i4 = asInterface + 103;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    public final void setDescription2Color(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 111;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.onExtraCallbackWithResult.onExtraCallback.setTextColor(i);
            obj.hashCode();
            throw null;
        }
        this.onExtraCallbackWithResult.onExtraCallback.setTextColor(i);
        int i4 = IAuthTabCallback + 43;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextButton(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 19;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setTextButton(getResources().getString(i));
        int i5 = IAuthTabCallback + 3;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setTextButton(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallbackDefault.setText(charSequence);
        if (this.onExtraCallbackWithResult.IAuthTabCallbackDefault.length() != 0) {
            this.onExtraCallbackWithResult.onNavigationEvent.setVisibility(0);
            this.onExtraCallbackWithResult.IAuthTabCallbackDefault.setVisibility(0);
            this.onExtraCallbackWithResult.IAuthTabCallback.setVisibility(8);
            this.onExtraCallbackWithResult.onExtraCallback.setVisibility(8);
            return;
        }
        int i4 = IAuthTabCallback + 125;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallbackDefault.setVisibility(8);
        if (this.onExtraCallbackWithResult.onExtraCallback.getVisibility() == 8) {
            int i6 = IAuthTabCallback + 9;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            this.onExtraCallbackWithResult.onNavigationEvent.setVisibility(8);
        }
    }

    public final void setTextButtonColor(@Nullable ColorStateList colorStateList) {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        if (colorStateList != null) {
            this.onExtraCallbackWithResult.IAuthTabCallbackDefault.setTextColor(colorStateList);
            Drawable drawable = this.onExtraCallbackWithResult.IAuthTabCallbackDefault.getCompoundDrawables()[2];
            if (drawable != null) {
                int i2 = IAuthTabCallback + 99;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    objOnNavigationEvent = M_.onNavigationEvent(532468797, new Object[]{M_.onExtraCallback, drawable, colorStateList, null, 4, null}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -532468797, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
                } else {
                    objOnNavigationEvent = M_.onNavigationEvent(532468797, new Object[]{M_.onExtraCallback, drawable, colorStateList, null, 4, null}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -532468797, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
                }
                drawable.invalidateSelf();
                int i3 = asInterface + 49;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }

    public final void setTextButtonColor(int i) {
        M_ m_;
        PorterDuff.Mode mode;
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 17;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallbackDefault.setTextColor(i);
        Drawable drawable = this.onExtraCallbackWithResult.IAuthTabCallbackDefault.getCompoundDrawables()[2];
        if (drawable != null) {
            int i6 = asInterface + 31;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                m_ = M_.onExtraCallback;
                mode = null;
                i2 = 2;
            } else {
                m_ = M_.onExtraCallback;
                mode = null;
                i2 = 4;
            }
            M_.onExtraCallbackWithResult(m_, drawable, i, mode, i2, (Object) null);
            drawable.invalidateSelf();
        }
        int i7 = asInterface + 33;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setImage(int i) {
        int i2 = 2 % 2;
        this.onExtraCallbackWithResult.asBinder.setImageResource(i);
        if (i != 0) {
            this.onExtraCallbackWithResult.asBinder.setVisibility(0);
            this.onExtraCallbackWithResult.IAuthTabCallback_Parcel.setVisibility(8);
            this.onExtraCallbackWithResult.IAuthTabCallbackStub.setVisibility(8);
            deserializeUriNullableCollection deserializeurinullablecollection = this.onNavigationEvent;
            if (deserializeurinullablecollection != null) {
                int i3 = IAuthTabCallback + 107;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                deserializeurinullablecollection.dispose();
                if (i4 == 0) {
                    int i5 = 67 / 0;
                    return;
                }
                return;
            }
            return;
        }
        int i6 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        this.onExtraCallbackWithResult.asBinder.setVisibility(8);
    }

    public final void setImage(@Nullable Drawable drawable) {
        int i = 2 % 2;
        this.onExtraCallbackWithResult.asBinder.setImageDrawable(drawable);
        if (drawable != null) {
            this.onExtraCallbackWithResult.asBinder.setVisibility(0);
            this.onExtraCallbackWithResult.IAuthTabCallback_Parcel.setVisibility(8);
            this.onExtraCallbackWithResult.IAuthTabCallbackStub.setVisibility(8);
            deserializeUriNullableCollection deserializeurinullablecollection = this.onNavigationEvent;
            if (deserializeurinullablecollection != null) {
                int i2 = asInterface + 17;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                deserializeurinullablecollection.dispose();
                return;
            }
            return;
        }
        int i4 = IAuthTabCallback + 89;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            this.onExtraCallbackWithResult.asBinder.setVisibility(60);
        } else {
            this.onExtraCallbackWithResult.asBinder.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setImageUrl(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (charSequence != null) {
            int i5 = i3 + 119;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                charSequence.length();
                obj.hashCode();
                throw null;
            }
            if (charSequence.length() != 0) {
                if (isInEditMode()) {
                    int i6 = asInterface + 65;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        this.onExtraCallbackWithResult.asBinder.setImageResource(R.drawable.icon_list_row_place_holder);
                        int i7 = 93 / 0;
                    } else {
                        this.onExtraCallbackWithResult.asBinder.setImageResource(R.drawable.icon_list_row_place_holder);
                    }
                    int i8 = IAuthTabCallback + 119;
                    asInterface = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    TdsImageView tdsImageView = this.onExtraCallbackWithResult.asBinder;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                    TdsImageView.setImage$default(tdsImageView, charSequence.toString(), (Function1) null, (Function1) null, 6, (Object) null);
                }
                this.onExtraCallbackWithResult.asBinder.setVisibility(0);
                this.onExtraCallbackWithResult.IAuthTabCallback_Parcel.setVisibility(8);
                this.onExtraCallbackWithResult.IAuthTabCallbackStub.setVisibility(8);
                deserializeUriNullableCollection deserializeurinullablecollection = this.onNavigationEvent;
                if (deserializeurinullablecollection != null) {
                    int i10 = IAuthTabCallback + 3;
                    asInterface = i10 % 128;
                    int i11 = i10 % 2;
                    deserializeurinullablecollection.dispose();
                    return;
                }
                return;
            }
        }
        this.onExtraCallbackWithResult.asBinder.setImageDrawable((Drawable) null);
        this.onExtraCallbackWithResult.asBinder.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVideoUrl(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        if (Intrinsics.areEqual(charSequence, this.onExtraCallbackWithResult.IAuthTabCallback_Parcel.getTag())) {
            return;
        }
        deserializeUriNullableCollection deserializeurinullablecollection = this.onNavigationEvent;
        if (deserializeurinullablecollection != null) {
            int i2 = IAuthTabCallback + 35;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            deserializeurinullablecollection.dispose();
        }
        if (charSequence != null) {
            int i4 = asInterface + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (charSequence.length() != 0) {
                int i6 = asInterface + 53;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    isInEditMode();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!isInEditMode()) {
                    CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ExoPlayer exoPlayerIAuthTabCallback = CommonModule_setSecureScreen.IAuthTabCallback(commonModule_setSecureScreen, context, charSequence.toString(), null, null, new Function1() { // from class: im.toss.uikit.widget.Banner$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i7 = 2 % 2;
                            int i8 = onNavigationEvent + 51;
                            IAuthTabCallback = i8 % 128;
                            int i9 = i8 % 2;
                            Unit unitOnWarmupCompleted = Banner.onWarmupCompleted(this.f$0, (ExoPlayer) obj2);
                            int i10 = IAuthTabCallback + 75;
                            onNavigationEvent = i10 % 128;
                            int i11 = i10 % 2;
                            return unitOnWarmupCompleted;
                        }
                    }, 12, null);
                    this.onWarmupCompleted = exoPlayerIAuthTabCallback;
                    this.onExtraCallbackWithResult.IAuthTabCallback_Parcel.setPlayer(exoPlayerIAuthTabCallback);
                    ExoPlayer exoPlayer = this.onWarmupCompleted;
                    if (exoPlayer != null) {
                        exoPlayer.prepare();
                        int i7 = IAuthTabCallback + 43;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
                this.onExtraCallbackWithResult.IAuthTabCallback_Parcel.setTag(charSequence);
                this.onExtraCallbackWithResult.IAuthTabCallback_Parcel.setVisibility(0);
                this.onExtraCallbackWithResult.asBinder.setVisibility(8);
                this.onExtraCallbackWithResult.IAuthTabCallbackStub.setVisibility(8);
                JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = JsonReaderUnknownNumberParsing.onExtraCallback().IAuthTabCallback(new deserializeDecimalCollection() { // from class: im.toss.uikit.widget.Banner$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    @Override // o.deserializeDecimalCollection
                    public final void run() {
                        int i9 = 2 % 2;
                        int i10 = IAuthTabCallback + 27;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        Banner.IAuthTabCallback(this.f$0);
                        int i12 = IAuthTabCallback + 105;
                        onNavigationEvent = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i13 = 93 / 0;
                        }
                    }
                });
                deserializeFloat deserializefloat = new deserializeFloat() { // from class: im.toss.uikit.widget.Banner$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    @Override // o.deserializeFloat
                    public final void accept(Object obj2) {
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 109;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        Banner.IAuthTabCallback(obj2);
                        int i12 = onWarmupCompleted + 7;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                    }
                };
                final Function1 function1 = new Function1() { // from class: im.toss.uikit.widget.Banner$$ExternalSyntheticLambda3
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallbackWithResult + 71;
                        onNavigationEvent = i10 % 128;
                        Throwable th = (Throwable) obj2;
                        if (i10 % 2 != 0) {
                            return Banner.onExtraCallbackWithResult(th);
                        }
                        Banner.onExtraCallbackWithResult(th);
                        throw null;
                    }
                };
                this.onNavigationEvent = jsonReaderUnknownNumberParsingIAuthTabCallback.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: im.toss.uikit.widget.Banner$$ExternalSyntheticLambda4
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    @Override // o.deserializeFloat
                    public final void accept(Object obj2) {
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 83;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 == 0) {
                            Banner.onNavigationEvent(function1, obj2);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Banner.onNavigationEvent(function1, obj2);
                        int i11 = onExtraCallbackWithResult + 69;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                    }
                });
                return;
            }
        }
        this.onExtraCallbackWithResult.IAuthTabCallback_Parcel.setVisibility(8);
    }

    private static final Unit onExtraCallback(Banner banner, ExoPlayer exoPlayer) {
        float f;
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(exoPlayer, "");
            exoPlayer.setPlayWhenReady(false);
            f = 2.0f;
        } else {
            Intrinsics.checkNotNullParameter(exoPlayer, "");
            exoPlayer.setPlayWhenReady(true);
            f = 0.0f;
        }
        exoPlayer.setVolume(f);
        exoPlayer.setRepeatMode(banner.onExtraCallback);
        return Unit.INSTANCE;
    }

    private static final void onExtraCallback(Banner banner) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onNavigationEvent(-1366490964, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{banner}, iOnWarmupCompleted3, iOnWarmupCompleted2, 1366490964, iOnWarmupCompleted);
        int i4 = IAuthTabCallback + 29;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 99;
        IAuthTabCallback = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void setVideoLoop(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        this.onExtraCallback = z ? 1 : 0;
        ExoPlayer exoPlayer = this.onWarmupCompleted;
        if (exoPlayer != null) {
            int i5 = i3 + 3;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            exoPlayer.setRepeatMode(z ? 1 : 0);
            int i7 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Banner banner = (Banner) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            ExoPlayer exoPlayer = banner.onWarmupCompleted;
            if (exoPlayer != null) {
                int i4 = i3 + 13;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    exoPlayer.release();
                } else {
                    exoPlayer.release();
                    int i5 = 61 / 0;
                }
            }
            banner.onWarmupCompleted = null;
            banner.onExtraCallbackWithResult.IAuthTabCallback_Parcel.setPlayer((Player) null);
            banner.onExtraCallbackWithResult.IAuthTabCallback_Parcel.setTag(null);
            return null;
        }
        ExoPlayer exoPlayer2 = banner.onWarmupCompleted;
        throw null;
    }

    public final void setIcon(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 107;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            this.onExtraCallbackWithResult.IAuthTabCallbackStub.setImageResource(i);
            if (i == 0) {
                this.onExtraCallbackWithResult.IAuthTabCallbackStub.setVisibility(8);
                return;
            }
            this.onExtraCallbackWithResult.IAuthTabCallbackStub.setVisibility(0);
            this.onExtraCallbackWithResult.IAuthTabCallback_Parcel.setVisibility(8);
            this.onExtraCallbackWithResult.asBinder.setVisibility(8);
            deserializeUriNullableCollection deserializeurinullablecollection = this.onNavigationEvent;
            if (deserializeurinullablecollection != null) {
                int i4 = IAuthTabCallback + 93;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    deserializeurinullablecollection.dispose();
                    return;
                } else {
                    deserializeurinullablecollection.dispose();
                    int i5 = 14 / 0;
                    return;
                }
            }
            return;
        }
        this.onExtraCallbackWithResult.IAuthTabCallbackStub.setImageResource(i);
        throw null;
    }

    public final void setIcon(@Nullable Drawable drawable) {
        int i = 2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallbackStub.setImageDrawable(drawable);
        if (drawable == null) {
            this.onExtraCallbackWithResult.IAuthTabCallbackStub.setVisibility(8);
            return;
        }
        this.onExtraCallbackWithResult.IAuthTabCallbackStub.setVisibility(0);
        this.onExtraCallbackWithResult.IAuthTabCallback_Parcel.setVisibility(8);
        this.onExtraCallbackWithResult.asBinder.setVisibility(8);
        deserializeUriNullableCollection deserializeurinullablecollection = this.onNavigationEvent;
        if (deserializeurinullablecollection != null) {
            int i2 = IAuthTabCallback + 63;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            deserializeurinullablecollection.dispose();
            if (i3 == 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 53;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = IAuthTabCallback + 25;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setIconUrl(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        if (charSequence == null || charSequence.length() == 0) {
            this.onExtraCallbackWithResult.IAuthTabCallbackStub.setImageDrawable((Drawable) null);
            this.onExtraCallbackWithResult.IAuthTabCallbackStub.setVisibility(8);
            return;
        }
        int i2 = asInterface + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            if (isInEditMode()) {
                this.onExtraCallbackWithResult.IAuthTabCallbackStub.setImageResource(R.drawable.icon_list_row_place_holder);
            } else {
                TdsImageView tdsImageView = this.onExtraCallbackWithResult.IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                TdsImageView.setImage$default(tdsImageView, charSequence.toString(), (Function1) null, (Function1) null, 6, (Object) null);
            }
            this.onExtraCallbackWithResult.IAuthTabCallbackStub.setVisibility(0);
            this.onExtraCallbackWithResult.asBinder.setVisibility(8);
            this.onExtraCallbackWithResult.IAuthTabCallback_Parcel.setVisibility(8);
            deserializeUriNullableCollection deserializeurinullablecollection = this.onNavigationEvent;
            if (deserializeurinullablecollection != null) {
                int i3 = asInterface + Imgproc.COLOR_YUV2RGB_YVYU;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                deserializeurinullablecollection.dispose();
                return;
            }
            return;
        }
        isInEditMode();
        throw null;
    }

    public final void setBackgroundColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 81;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 92 / 0;
            if (colorStateList == null) {
                return;
            }
        } else if (colorStateList == null) {
            return;
        }
        int i5 = i2 + 69;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        setBackgroundColor(colorStateList.getDefaultColor());
    }

    public void setBackgroundColor(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        super.setBackgroundColor(i);
        onNavigationEvent(i);
        int i5 = asInterface + 9;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(int i) {
        Drawable drawableOnExtraCallback;
        int i2 = 2 % 2;
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        if (!(!((Boolean) onNavigationEvent(-238652172, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted2, 238652174, iOnWarmupCompleted)).booleanValue())) {
            int i3 = asInterface + 13;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            drawableOnExtraCallback = ResourcesCompat.onExtraCallback(getResources(), R.drawable.banner_click_dark_fg, (Resources.Theme) null);
            int i5 = IAuthTabCallback + 51;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        } else {
            drawableOnExtraCallback = ResourcesCompat.onExtraCallback(getResources(), R.drawable.banner_click_fg, (Resources.Theme) null);
        }
        setForeground(drawableOnExtraCallback);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        if (r6 < 0.5d) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r6 < 0.5d) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        r8 = im.toss.uikit.widget.Banner.IAuthTabCallback + 77;
        im.toss.uikit.widget.Banner.asInterface = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        double dIAuthTabCallback = VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(iIntValue);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
    }

    public final Typography4 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(this.onExtraCallbackWithResult.onTransact, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Typography4 typography4 = this.onExtraCallbackWithResult.onTransact;
        Intrinsics.checkNotNullExpressionValue(typography4, "");
        int i3 = asInterface + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return typography4;
    }

    public final Typography6 onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Typography6 typography6 = this.onExtraCallbackWithResult.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(typography6, "");
        int i4 = IAuthTabCallback + 47;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return typography6;
    }

    public final SafePlayerView onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SafePlayerView safePlayerView = this.onExtraCallbackWithResult.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(safePlayerView, "");
        int i4 = IAuthTabCallback + 13;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return safePlayerView;
        }
        throw null;
    }

    private final boolean onWarmupCompleted(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return ((Boolean) onNavigationEvent(-238652172, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted2, 238652174, iOnWarmupCompleted)).booleanValue();
    }

    private final void IAuthTabCallback() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onNavigationEvent(-1366490964, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted3, iOnWarmupCompleted2, 1366490964, iOnWarmupCompleted);
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onNavigationEvent(1433728728, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted3, iOnWarmupCompleted2, -1433728727, iOnWarmupCompleted);
    }
}
